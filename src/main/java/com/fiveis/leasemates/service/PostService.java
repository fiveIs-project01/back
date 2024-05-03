package com.fiveis.leasemates.service;

import com.fiveis.leasemates.domain.vo.CmtVO;
import com.fiveis.leasemates.domain.vo.PostVO;
import org.springframework.stereotype.Service;

@Service
public interface PostService {
    public void createPost(PostVO postVO);
    public void findPostAll(PostVO postVO);
    public void findPostById(long postNo);
    public void updatePost(PostVO postVO);
    public void deletePost(long postNo);
}
