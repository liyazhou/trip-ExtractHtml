package com.fliaping.trip;

/**
 * Created by Payne on 3/17/16.
 */
public class Sight {
    private int id;
    private int site_id;
    private String name;
    private String images[];
    private float scores[];
    private String intro;
    private String address;
    private String comments[];
    private int comment_num;
    private String near_hotels[];
    private String tickets[];
    private String traffic;
    private String coordinate;
    private String types[];
    private String place[];


    public int getId() {
        return id;
    }

    public int getSite_id() {
        return site_id;
    }

    public String getName() {
        return name;
    }

    public String[] getImages() {
        return images;
    }

    public float[] getScores() {
        return scores;
    }

    public String getIntro() {
        return intro;
    }

    public String getAddress() {
        return address;
    }

    public String[] getComments() {
        return comments;
    }

    public int getComment_num() {
        return comment_num;
    }

    public String[] getNear_hotels() {
        return near_hotels;
    }

    public String[] getTickets() {
        return tickets;
    }

    public String getTraffic() {
        return traffic;
    }

    public String getCoordinate() {
        return coordinate;
    }

    public String[] getTypes() {
        return types;
    }

    public String[] getPlace() {
        return place;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSite_id(int site_id) {
        this.site_id = site_id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setImages(String[] images) {
        this.images = images;
    }

    public void setScores(float[] scores) {
        this.scores = scores;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setComments(String[] comments) {
        this.comments = comments;
    }

    public void setComment_num(int comment_num) {
        this.comment_num = comment_num;
    }

    public void setNear_hotels(String[] near_hotels) {
        this.near_hotels = near_hotels;
    }

    public void setTickets(String[] tickets) {
        this.tickets = tickets;
    }

    public void setTraffic(String traffic) {
        this.traffic = traffic;
    }

    public void setCoordinate(String coordinate) {
        this.coordinate = coordinate;
    }

    public void setTypes(String[] types) {
        this.types = types;
    }

    public void setPlace(String[] place) {
        this.place = place;
    }
}
