package com.kardam.testproject.service;

import com.kardam.testproject.constants.Message;
import com.kardam.testproject.api.ResourceApiDelegate;
import com.kardam.testproject.dao.ResourceRepository;
import com.kardam.testproject.dto.Resource;
import com.kardam.testproject.exception.NotFoundException;
import com.kardam.testproject.mapper.MappingHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ResourceServiceImpl implements ResourceApiDelegate {

    @Autowired
    private ResourceRepository resourceRepo;

    @Autowired
    private MappingHelper mapper;

    @Override
    public ResponseEntity<Resource> createResource(Resource resource) {
        return ResponseEntity.ofNullable(mapper.resourceDTOToResource(resourceRepo.save(mapper.resourceToResourceDTO(resource))));
    }

    @Override
    public ResponseEntity<Void> deleteResourceById(Integer id) {
        resourceRepo.deleteById(id);
        return ResponseEntity.ok().build();
    }

    @Override
    public ResponseEntity<Resource> getResourceById(Integer id) {
        return ResponseEntity.ofNullable(mapper.resourceDTOToResource(resourceRepo.findById(id)
                .orElseThrow(() -> new NotFoundException(Message.NOT_FOUND))));
    }

    @Override
    public ResponseEntity<Resource> updateResource(Resource resource) {
        return ResponseEntity.ofNullable(mapper.resourceDTOToResource(resourceRepo.save(mapper.resourceToResourceDTO(resource))));
    }
}
