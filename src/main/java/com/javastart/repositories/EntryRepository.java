package com.javastart.repositories;

import com.javastart.model.Entry;
import com.javastart.services.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.io.IOException;
import java.util.*;

@Repository
public class EntryRepository {
    private List<Entry> entries;

    @Autowired
    public EntryRepository(FileService fileService) {
        try {
            this.entries = fileService.readAllFile();
        } catch (IOException e) {
            entries = new ArrayList<>();
        }
    }

    public List<Entry> getAll() {
        return entries;
    }

    public Set<Entry> getRandomEntries(int number) {
        Random random = new Random();
        Set<Entry> randomEntries = new HashSet<>();
        while (randomEntries.size() < number && randomEntries.size() < entries.size()) {
            randomEntries.add(entries.get(random.nextInt(entries.size())));
        }
        return randomEntries;
    }

    public void add(Entry entry) {
        entries.add(entry);
    }

    public int size() {
        return entries.size();
    }

    public boolean isEmpty() {
        return entries.isEmpty();
    }
}