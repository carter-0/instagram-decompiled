package X;

import com.fasterxml.jackson.databind.JsonSerializer;

/* renamed from: X.Ql2  reason: case insensitive filesystem */
public final class C8248Ql2 extends SIF {
    public final JsonSerializer A00;
    public final JsonSerializer A01;
    public final Class A02;
    public final Class A03;

    public C8248Ql2(JsonSerializer jsonSerializer, JsonSerializer jsonSerializer2, SIF sif, Class cls, Class cls2) {
        super(sif);
        this.A02 = cls;
        this.A00 = jsonSerializer;
        this.A03 = cls2;
        this.A01 = jsonSerializer2;
    }
}
