package com.example.demo

import grails.gorm.annotation.Entity
import groovy.transform.ToString
import org.grails.datastore.gorm.GormEntity

@ToString(includes = "title")
@Entity
class Book implements GormEntity<Book> {

    String title
}
