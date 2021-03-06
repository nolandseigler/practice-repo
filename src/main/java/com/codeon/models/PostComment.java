package com.codeon.models;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Entity
@Table(name="post_comments")
public class PostComment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String body;

    @JsonBackReference
    @ManyToOne
    @JoinColumn (name = "user_id")
    private User user;

    @JsonBackReference
    @ManyToOne
    @JoinColumn (name = "post_id")
    private Post post;

    public PostComment() {}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    @Override
    public String toString() {
        return "PostComment{" +
                "id=" + id +
                ", body='" + body + '\'' +
                ", user=" + user +
                ", post=" + post +
                '}';
    }
}
