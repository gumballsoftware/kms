package org.gumball.burgerman.kms.common.model;

import java.util.List;

public record Order(String id, List<OrderItem> items) {}
