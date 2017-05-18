package com.theironyard.charlotte.BlogWebsite.entities;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * Created by Jake on 5/18/17.
 */
@Entity
@Table(name= "blog_posts")
public class BlogPost {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @Column(nullable = false, length = 140)
    String title;

    @Column(nullable = false)
    String subtitle;

    @Column(nullable = false)
    LocalDateTime date;

    @Column(nullable = false, length = 100000)
    String content;
}
