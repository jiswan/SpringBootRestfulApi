package com.example.demo.Repository;

import com.example.demo.Model.Topic;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TopicRepository extends JpaRepository<Topic,String> {
}
