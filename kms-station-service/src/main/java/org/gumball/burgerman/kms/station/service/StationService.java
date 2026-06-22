package org.gumball.burgerman.kms.station.service;

import org.gumball.burgerman.kms.common.model.Order;
import org.gumball.burgerman.kms.common.model.Acknowledgement;

public interface StationService {
    Acknowledgement processOrder(Order order);
}
