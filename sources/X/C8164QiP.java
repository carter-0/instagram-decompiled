package X;

import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.deser.std.FromStringDeserializer;
import java.io.Serializable;

@JacksonStdImpl
/* renamed from: X.QiP  reason: case insensitive filesystem */
public class C8164QiP extends C10889Rzp implements Serializable {
    public final int A00;
    public final FromStringDeserializer A01;
    public final Class A02;

    public C8164QiP(FromStringDeserializer fromStringDeserializer, Class cls, int i) {
        this.A00 = i;
        this.A02 = cls;
        this.A01 = fromStringDeserializer;
    }
}
