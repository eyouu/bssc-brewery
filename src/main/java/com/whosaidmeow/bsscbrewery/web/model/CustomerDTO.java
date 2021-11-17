package com.whosaidmeow.bsscbrewery.web.model;

import lombok.*;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CustomerDTO {

    private UUID id;
    private String name;
}
