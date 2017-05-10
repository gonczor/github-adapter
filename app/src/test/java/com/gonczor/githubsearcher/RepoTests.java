package com.gonczor.githubsearcher;

import org.junit.Test;
import static org.junit.Assert.*;

import com.gonczor.githubsearcher.models.Repo;


public class RepoTests {

    /**
     * Tests that user with sample name and id is created.
     */
    @Test
    public void repoShouldBeCreated(){
        final String expectedName = "some repo";
        final Integer expectedId = 10;
        Repo repo = new Repo();
        repo.setName(expectedName);
        repo.setId(expectedId);

        assertEquals(repo.getName(), expectedName);
        assertEquals(repo.getId(), expectedId);
    }
}
