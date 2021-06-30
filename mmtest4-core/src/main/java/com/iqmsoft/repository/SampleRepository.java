package com.iqmsoft.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iqmsoft.model.Sample;

public interface SampleRepository extends JpaRepository<Sample, Long> {

}
