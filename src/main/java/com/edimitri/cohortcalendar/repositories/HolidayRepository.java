package com.edimitri.cohortcalendar.repositories;

import com.edimitri.cohortcalendar.models.Holiday;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HolidayRepository extends JpaRepository<Holiday,Long> {
}