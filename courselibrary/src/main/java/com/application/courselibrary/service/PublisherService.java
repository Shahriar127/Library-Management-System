package com.application.courselibrary.service;

import com.application.courselibrary.entity.Publisher;
import com.application.courselibrary.repository.PublisherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PublisherService {
    @Autowired
    private PublisherRepository publisherRepository;
    public List<Publisher> findAllPublisher(){
        return publisherRepository.findAll();
    }
    public Publisher findPublisherById(Long id){
       Publisher publisher = publisherRepository.findById(id).orElseThrow(() -> new RuntimeException("Publisher Not Found."));
       return publisher;
    }
    public void createPublisher(Publisher publisher){
        publisherRepository.save(publisher);
    }
    public void updatePublisher(Publisher publisher){
        publisherRepository.save(publisher);
    }
    public void deletePublisher(Long id){
        Publisher publisher = publisherRepository.findById(id).orElseThrow(() -> new RuntimeException("Publisher Not Found."));
        publisherRepository.deleteById(publisher.getId());
    }



}
