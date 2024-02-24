package br.com.vitorgabrielti.eventsmicroservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.vitorgabrielti.eventsmicroservice.domain.Subscription;

public interface SubscriptionRepository extends JpaRepository<Subscription, Long>{
    
}
