package com.example.tests.topic;

import org.springframework.stereotype.Service;

import java.awt.*;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService  {
    private List<Topic> topicList=  Arrays.asList(
            new Topic("spring", "spring framewrokd","test descriptiom"),
            new Topic("spring", "spring framewrokd","test descriptiom"),
            new Topic("Tanvir", "spring framewrokd","test descriptiom")
    );

    public List<Topic> getTopicList(){
        return topicList;
    }

    public Topic getTopic(String id){
        return topicList.stream().filter(t->t.getId().equals(id)).findFirst().get();
    }
}
