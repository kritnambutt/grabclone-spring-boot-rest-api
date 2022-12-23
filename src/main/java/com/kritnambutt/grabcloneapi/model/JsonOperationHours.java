package com.kritnambutt.grabcloneapi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JsonOperationHours {
    String[] date;
    String openHour;
    String closeHour;
    boolean isClosed;
}
