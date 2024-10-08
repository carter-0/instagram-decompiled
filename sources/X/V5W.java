package X;

import java.io.ByteArrayOutputStream;

public abstract class V5W {
    public static final byte[] A00(C18750Vzl vzl, C18750Vzl vzl2, C18750Vzl vzl3) {
        AnonymousClass7TG.A1T(vzl, vzl2, vzl3);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(vzl.A01());
        byteArrayOutputStream.write(vzl2.A01());
        byteArrayOutputStream.write(vzl3.A01());
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        0qQ.A07(byteArray);
        return byteArray;
    }
}
