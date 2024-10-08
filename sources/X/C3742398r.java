package X;

import java.security.GeneralSecurityException;
import java.util.Map;

/* renamed from: X.98r  reason: invalid class name and case insensitive filesystem */
public final class C3742398r {
    public final Map A00;
    public final Map A01;

    public final Enum A00(Object obj) {
        Enum enumR = (Enum) this.A01.get(obj);
        if (enumR != null) {
            return enumR;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unable to convert object enum: ");
        sb.append(obj);
        throw new GeneralSecurityException(sb.toString());
    }

    public final Object A01(Enum enumR) {
        Object obj = this.A00.get(enumR);
        if (obj != null) {
            return obj;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unable to convert proto enum: ");
        sb.append(enumR);
        throw new GeneralSecurityException(sb.toString());
    }

    public C3742398r(Map map, Map map2) {
        this.A00 = map;
        this.A01 = map2;
    }
}
