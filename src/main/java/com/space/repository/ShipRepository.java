package com.space.repository;

import com.space.model.Ship;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Spring Data предоставляет набор готовых реализаций для создания DAO
 * но Spring предпочли этот слой называть не DAO, а Repository.
 * DAO (Data Access Object) – это слой объектов которые обеспечивают доступ к данным.
 *
 * 1 – Имя репозитория должно начинаться с имени сущности NameReposytory (необязательно).
 *
 * 2 – Второй Generic должен быть оберточным типом того типа которым есть ID нашей сущности (обязательно).
 *
 * 3 – Первый Generic должен быть объектом нашей сущности для которой мы создали Repository,
 * это указывает на то, что Spring Data должен предоставить реализацию методов для работы с этой сущностью (обязательно).
 *
 * 4 – Мы должны унаследовать свой интерфейс от JpaRepository,
 * иначе Spring Data не предоставит реализацию для нашего репозитория (обязательно).
 *
 * @author Sergei Viacheslaev
 */
@Repository
public interface ShipRepository extends JpaRepository<Ship, Long> {
}
