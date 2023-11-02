package com.logicverse.techelp.platform.tasking.interfaces.rest.resources;

import java.util.Date;

public record CreateTaskResource(
        String client_name,

        String client_phone,

        String problem,

        String[] component,

        Date delivery_date,

        String income


) {
}
