package org.gumball.burgerman.kms.fryline.model;

import java.util.List;
import org.gumball.burgerman.kms.common.model.OrderItem;

public record Acknowledgement(String status, List<OrderItem> items, String predictedCompletionTime) {}
