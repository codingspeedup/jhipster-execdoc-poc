package io.github.codingspeedup.execdoc.poc.jhipster.blueprint.metamodel.code;

import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.ArrayUtils;

public class JdlType implements JdlFieldType {

    public static final String[] NAMES = {
            "String",
            "Integer",
            "Long",
            "BigDecimal",
            "Float",
            "Double",
            "Boolean",
            "LocalDate",
            "ZonedDateTime",
            "Instant",
            "Duration",
            "UUID",
            "Blob",
            "AnyBlob",
            "ImageBlob",
            "TextBlob",
    };

    public static final String PREFIX = "jld_";

    @Getter
    @Setter
    private String kbId;

    public JdlType(String name) {
        if (ArrayUtils.contains(NAMES, name)) {
            setName(name);
        }

    }

    @Override
    public String getName() {
        return kbId.substring(PREFIX.length());
    }

    @Override
    public void setName(String name) {
        kbId = PREFIX + name;
    }

}
