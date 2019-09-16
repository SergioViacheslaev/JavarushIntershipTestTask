package com.space.service;

import com.space.model.Ship;
import com.space.model.ShipType;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;

import java.util.List;

/**
 * Service – это Java класс, который предоставляет собой основную (Бизнес-Логику).
 * В основном сервис использует готовые DAO/Repositories или же другие сервисы,
 * для того чтобы предоставить конечные данные для пользовательского интерфейса.
 *
 * @author Sergei Viacheslaev
 */
public interface ShipService {
    Page<Ship> getAllShips(Specification<Ship> specification, Pageable sortedByName);

    List<Ship> getAllShips(Specification<Ship> specification);

    Ship createShip(Ship requestShip);

    Ship getShip(Long id);

    Ship editShip(Long id, Ship ship);

    void deleteById(Long id);

    Long checkAndParseId(String id);

    Specification<Ship> filterByPlanet(String planet);

    Specification<Ship> filterByName(String name);

    Specification<Ship> filterByShipType(ShipType shipType);

    Specification<Ship> filterByDate(Long after, Long before);

    Specification<Ship> filterByUsage(Boolean isUsed);

    Specification<Ship> filterBySpeed(Double min, Double max);

    Specification<Ship> filterByCrewSize(Integer min, Integer max);

    Specification<Ship> filterByRating(Double min, Double max);
}
