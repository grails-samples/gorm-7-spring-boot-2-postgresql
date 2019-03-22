package com.example.demo

import grails.gorm.services.Service
import org.springframework.stereotype.Component

@Component
@Service(Book)
interface BookService {

    Book save(String title)

    Book findByTitle(String title)
}