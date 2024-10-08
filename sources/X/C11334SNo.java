package X;

import java.util.Iterator;

/* renamed from: X.SNo  reason: case insensitive filesystem */
public final class C11334SNo {
    public static final C8946RGo A00(String str) {
        Object obj;
        Iterator it = C8946RGo.A09.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            String str2 = ((C8946RGo) obj).A02;
            if (str2 != null && str2.equalsIgnoreCase(str)) {
                break;
            }
        }
        C8946RGo rGo = (C8946RGo) obj;
        if (rGo == null) {
            return C8946RGo.EMPTY;
        }
        return rGo;
    }

    public static final C8946RGo A01(String str) {
        if (str != null) {
            String A00 = new 11S("[^a-zA-Z]").A00(str, "");
            for (C8946RGo rGo : C8946RGo.A09) {
                if (00p.A0j(Pxf.A0d(rGo.name(), "[^a-zA-Z]", ""), A00, true)) {
                    return rGo;
                }
            }
        }
        return C8946RGo.UNKNOWN;
    }

    public final C8946RGo A02(String str) {
        Object obj;
        Iterator it = C8946RGo.A09.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (DbV.A1b(str, ((C8946RGo) obj).A05)) {
                break;
            }
        }
        C8946RGo rGo = (C8946RGo) obj;
        if (rGo == null) {
            rGo = C8946RGo.EMPTY;
        }
        C8946RGo rGo2 = C8946RGo.EMPTY;
        if (rGo != rGo2 && rGo != C8946RGo.UNKNOWN) {
            return rGo;
        }
        0qQ.A0A(str);
        if (str.length() == 0) {
            return rGo2;
        }
        return C8946RGo.UNKNOWN;
    }
}
