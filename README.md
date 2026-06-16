# Kitchen Management System (KMS)

KMS is an automation platform designed for Quick Service Restaurants (QSR). It orchestrates service operations by delegating tasks to specialized stations, ensuring efficient and decoupled service delivery.

## Architecture

The system is designed as a collection of Spring Boot applications, communicating via NATS for asynchronous messaging and using REST APIs for direct interactions.

### Key Components:
- **Station-based Model**: Service is broken down into specialized stations (e.g., Point of Sale, Fry Line, Grill Line, Sandwich Line, Assembly).
- **Flow Control**: Initially governed by choreography (FIFO/best effort strategy at each station), with plans to introduce an orchestrator component ('Kitchen Orchestrator') for centralized control.
- **Messaging**: Uses NATS for inter-service communication.
- **Persistence**: Each station uses Spring Data JPA with H2 for operational state, and `BigQueue` for high-throughput task queuing.

## Project Structure

- `kms-common`: Contains shared core data models (e.g., `Order`, `OrderItem`) used across the system.
- `kms-fry-line-service`: The implemented service responsible for handling fry-line related order processing.
- `kms-station-service`: Placeholder for other future station implementations.

## Getting Started

To build the project:

```bash
mvn clean install
```

## Documentation

For more detailed design information, please refer to the files in the `docs/` directory:
- `docs/design_overview.txt`: High-level system design and flow control concepts.
- `docs/data_model.txt`: Detailed definition of the core data model and station-specific data requirements.
