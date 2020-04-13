package com.example.demo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Data
@Component
public class CalculationNumber
{

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    Long nu;
    Long n1;
    Long n2;

}
