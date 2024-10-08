package X;

import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;

/* renamed from: X.RsC  reason: case insensitive filesystem */
public final class C10435RsC {
    public final String A00;
    public final String A01;

    public C10435RsC(JsonPOJOBuilder jsonPOJOBuilder) {
        String buildMethodName = jsonPOJOBuilder.buildMethodName();
        String withPrefix = jsonPOJOBuilder.withPrefix();
        this.A00 = buildMethodName;
        this.A01 = withPrefix;
    }
}
