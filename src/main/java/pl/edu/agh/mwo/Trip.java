package pl.edu.agh.mwo;

import java.util.ArrayList;
import java.util.Collection;

public class Trip {

	private String name;
	private String description;

	Collection<Photo> photos = new ArrayList<Photo>();

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Collection<Photo> getPhotos() {
		return photos;
	}

	public void addPhoto(Photo photo) {
		photos.add(photo);
	}
	
	public void getPhoto() {
	}

}
