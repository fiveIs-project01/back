package com.fiveis.leasemates.service;

import com.fiveis.leasemates.domain.vo.PostVO;
import com.fiveis.leasemates.repository.CommunityRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PostServiceImpl implements PostService{
    private final CommunityRepository communityRepository;


    public PostServiceImpl(CommunityRepository communityRepository) {
        this.communityRepository = communityRepository;
    }


    @Transactional
    @Override
    public void createPost(PostVO postVO) {

    }

    @Transactional
    @Override
    public void findPostAll(PostVO postVO) {

    }

    @Transactional
    @Override
    public void findPostById(long postNo) {

    }

    @Transactional
    @Override
    public void updatePost(PostVO postVO) {

    }

    @Transactional
    @Override
    public void deletePost(long postNo) {

    }
}
