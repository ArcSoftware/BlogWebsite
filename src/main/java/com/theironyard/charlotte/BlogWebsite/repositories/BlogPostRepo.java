package com.theironyard.charlotte.BlogWebsite.repositories;

import com.theironyard.charlotte.BlogWebsite.entities.BlogPost;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by Jake on 5/18/17.
 */
public interface BlogPostRepo extends PagingAndSortingRepository<BlogPost, Integer> {

}
