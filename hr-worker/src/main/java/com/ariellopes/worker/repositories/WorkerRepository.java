package com.ariellopes.worker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ariellopes.worker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
