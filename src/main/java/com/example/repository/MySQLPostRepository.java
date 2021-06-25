package com.example.repository;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

import com.example.database.DatabaseConnection;
import com.example.model.Post;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MySQLPostRepository implements PostRepository {

    @Autowired
    private DatabaseConnection database;

    @Override
    public List<Post> getPosts() {
        List<Post> posts = new ArrayList<Post>();
        String sql = "SELECT * FROM post;";
        try{
            ResultSet query = database.getStatement().executeQuery(sql);
            while(query.next()){
                String id = query.getString("Id");
                String author = query.getString("Author");
                String text = query.getString("Text");
                Date date = query.getDate("Date");
                Time time = query.getTime("Time");
    
                posts.add(new Post(id, author, text, date, time));
            }
        } catch( SQLException ex){
            System.out.println("SQLException");
            System.out.println(ex.getMessage());
        }
        return posts;
    }

    @Override
    public void insertPost(Post post) {
        try{
            database.getStatement().executeUpdate("INSERT INTO post (Id, Author, Text, Date, Time) VALUES ('"+post.getId()+"', '"+post.getAuthor()+"', '"+post.getText()+"', '"+post.getDate()+"', '"+post.getTime()+"');");
        } catch (SQLException ex) { 
            ex.printStackTrace();
            System.out.println("SQLException");
            System.out.println(ex.getMessage());
        } catch (Exception e) {
            System.out.println("genericException");
            System.out.println(e.getMessage());
        }        
    }

    @Override
    public void deletePost(String id) {
        // TODO Auto-generated method stub
        
    }
    
}
