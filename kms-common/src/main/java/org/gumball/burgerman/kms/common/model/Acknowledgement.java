package org.gumball.burgerman.kms.common.model;

import java.util.List;

public record Acknowledgement(String status, List<OrderItem> items, String predictedCompletionTime) {}
