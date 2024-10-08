package X;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;

/* renamed from: X.Rqi  reason: case insensitive filesystem */
public final class C10345Rqi {
    public final ByteArrayOutputStream A00;
    public final DataOutputStream A01;

    public C10345Rqi() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        this.A00 = byteArrayOutputStream;
        this.A01 = new DataOutputStream(byteArrayOutputStream);
    }
}
