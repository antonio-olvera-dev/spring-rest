package com.toni.springrest.Controllers;

import java.util.concurrent.atomic.AtomicLong;

import com.toni.springrest.Models.Transport;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TransportController {

    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/transport")
    public Transport transport(@RequestParam(value = "id", defaultValue = "0") String id) {

        return vehicle(id);
    }

    Transport vehicle(String id) {
        Transport newTransport;

        switch (id) {
            case "1":
                newTransport = new Transport(counter.incrementAndGet(), "Plane", "0", "162 403 Kg");
                break;
            case "2":
                newTransport = new Transport(counter.incrementAndGet(), "Ship", "0", "10 150 Kg");
                break;
            case "3":
                newTransport = new Transport(counter.incrementAndGet(), "Truck", "6", "8 403 Kg");
                break;
            case "4":
                newTransport = new Transport(counter.incrementAndGet(), "helicopter", "0", "18 408 Kg");
                break;
            case "5":
                newTransport = new Transport(counter.incrementAndGet(), "Tractor", "4", "3 000 Kg");
                break;

            default:
                newTransport = new Transport(counter.incrementAndGet(), "Car", "4", "1203 Kg");
                break;
        }

        return newTransport;
    }

}
