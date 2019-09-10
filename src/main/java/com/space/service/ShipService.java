package com.space.service;

import com.space.model.Ship;

import java.util.List;

/**
 * Service – это Java класс, который предоставляет собой основную (Бизнес-Логику).
 * В основном сервис использует готовые DAO/Repositories или же другие сервисы,
 * для того чтобы предоставить конечные данные для пользовательского интерфейса.
 *
 * @author Sergei Viacheslaev
 */
public interface ShipService {
    List<Ship> getAllShips();
}
