package com.icexxx.iceformat;

import java.io.IOException;
import java.math.BigDecimal;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

public abstract class AbstractIceNumFormat extends JsonSerializer {

    @Override
    public void serialize(Object value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
        int newScale = scale();
        if (value instanceof Double) {
            Double num = (Double) value;
            gen.writeNumber(IceNumRoundUtil.round(num, newScale));
        } else if (value instanceof BigDecimal) {
            BigDecimal num = (BigDecimal) value;
            gen.writeNumber(IceNumRoundUtil.round(num, newScale));
        } else {
            gen.writeObject(value);
        }
    }

    public abstract int scale();
}
