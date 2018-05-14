package com.alexfrei.task.repository;

import com.alexfrei.task.entity.DomainObject;

import java.util.Set;

public class DataRepository<V extends DomainObject>{

    void persist(V object);

    void delete(V object);

    Set<String> getRandomData();
}
