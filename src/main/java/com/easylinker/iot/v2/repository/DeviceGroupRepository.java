package com.easylinker.iot.v2.repository;

import com.easylinker.iot.v2.model.device.DeviceGroup;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by wwhai on 2017/11/24.
 */
public interface DeviceGroupRepository extends JpaRepository<DeviceGroup, String> {
    DeviceGroup findTopBySerialNumber(Long serialNumber);

    DeviceGroup findTopByName(String name);
}
