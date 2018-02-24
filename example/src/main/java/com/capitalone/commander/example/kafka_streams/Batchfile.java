/*
 * Copyright 2016 Capital One Services, LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and limitations under the License.
 */

package com.capitalone.commander.example.kafka_streams;

import java.util.Map;
import java.util.UUID;

public class Batchfile {

    private final UUID id;
    private final String card_type;
    private final String token;
    private final String expiration;
    private final String transaction_amount;


    public Batchfile(UUID id, String card_type, String token, String expiration, String transaction_amount) {
        this.id = id;
        this.card_type = card_type;
        this.token = token;
        this.expiration = expiration;
        this.transaction_amount = transaction_amount;

    }

    public Batchfile(Map<Keyword, Object> params) {
        this((UUID) params.get(new Keyword("id")),
                (String) params.get(new Keyword("card_type")),
                (String) params.get(new Keyword("token")),
                (String) params.get(new Keyword("expiration")),
                (String) params.get(new Keyword("transaction_amount")));
    }

    public UUID getId() {
        return id;
    }

    public String getCard_type() {
        return card_type;
    }

    public String getToken() {
        return token;
    }

    public String getExpiration() {
        return expiration;
    }

    public String getTransaction_amount() {
        return transaction_amount;
    }
}
