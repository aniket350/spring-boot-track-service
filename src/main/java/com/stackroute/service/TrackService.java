package com.stackroute.service;

import com.stackroute.domain.Track;
import com.stackroute.exception.TrackAlreadyExistsException;
import com.stackroute.exception.TrackNotFoundException;

import java.util.List;

public interface TrackService
{
    public Track saveTrack(Track track) throws TrackAlreadyExistsException;

    public Track getTrackById(int id) throws TrackNotFoundException;

    public Track getDeleteTrackById(int id) throws  TrackNotFoundException;

    public List<Track> getTrackByName(String name);

    public Track getUpdateByName(String name, String comment);

    public  List<Track> getAllTracks();
}
