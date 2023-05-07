package info.shahriarkhan.dishaven.repository;

import info.shahriarkhan.dishaven.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
}

