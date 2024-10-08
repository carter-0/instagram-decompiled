package X;

import java.util.EnumMap;
import java.util.Map;

/* renamed from: X.S4l  reason: case insensitive filesystem */
public final class C10991S4l {
    public Map A00 = null;
    public C18634VvU[] A01;
    public final String A02;
    public final byte[] A03;

    public final void A00(C8895REm rEm, Object obj) {
        Map map = this.A00;
        if (map == null) {
            map = new EnumMap(C8895REm.class);
            this.A00 = map;
        }
        map.put(rEm, obj);
    }

    public final String toString() {
        return this.A02;
    }

    public C10991S4l(String str, byte[] bArr, C18634VvU[] vvUArr) {
        System.currentTimeMillis();
        this.A02 = str;
        this.A03 = bArr;
        this.A01 = vvUArr;
    }
}
