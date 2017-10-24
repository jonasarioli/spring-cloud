package com.example.ratingservice.models;

public class Rating {
	
	private Long id;
    private Long bookId;
    private int stars;
    
    public Rating(Long id, Long bookId, int starts) {
		this.id = id;
		this.bookId = bookId;
		this.stars = starts;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getBookId() {
		return bookId;
	}

	public void setBookId(Long bookId) {
		this.bookId = bookId;
	}

	public int getStars() {
		return stars;
	}

	public void setStars(int stars) {
		this.stars = stars;
	}
    
    

}
