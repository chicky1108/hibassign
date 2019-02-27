package com.cg.project.services;

import java.util.List;


import com.cg.project.beans.Author;
import com.cg.project.daoservices.AuthorDAO;
import com.cg.project.daoservices.AuthorDAOservicesImpl;
import com.cg.project.exception.AuthorNotFoundException;

public class AuthorServicesImpl implements AuthorServices{
	private AuthorDAOservicesImpl authorDAO = new AuthorDAOservicesImpl();
	@Override
	public int acceptAuthorDetails(int authorId,String firstName, String middleName, String lastName, String phoneNo) {
		// TODO Auto-generated method stub
		Author author = new Author(firstName, middleName,lastName,phoneNo);
		author = authorDAO.save(author);
		return author.getId();
	}

	@Override
	public Author getAuthorDetails(int authorId) throws AuthorNotFoundException {
		// TODO Auto-generated method stub
		Author author = authorDAO.findOne(authorId);
		if(author == null) 
		    throw new AuthorNotFoundException("Author Details Not Found for Id " + authorId);
		return author;
	}

	@Override
	public List<Author> getAllAuthorDetails() {
		// TODO Auto-generated method stub
		return authorDAO.findAll();
	}
public boolean update (String lastName1,int authorId2) throws AuthorNotFoundException
{
	Author author=getAuthorDetails(authorId2);
	author.setLastName(lastName1);
	authorDAO.update(author);
	return false;
	}
public boolean deleteAuthor(int authorId3) throws AuthorNotFoundException
{
	Author author=getAuthorDetails(authorId3);
            authorDAO.deleteAuthor(authorId3);
    return false;
}
}
