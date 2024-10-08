package X;

import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.deser.std.FromStringDeserializer;

@JacksonStdImpl
/* renamed from: X.Qjp  reason: case insensitive filesystem */
public final class C8193Qjp extends C8164QiP {
    public T9m A00;
    public final C8206QkF A01;
    public final T9m A02;
    public final Enum A03;

    public C8193Qjp(C8206QkF qkF, T9m t9m) {
        super((FromStringDeserializer) null, t9m.A00, -1);
        this.A02 = t9m;
        this.A01 = qkF;
        this.A03 = t9m.A01;
    }
}
