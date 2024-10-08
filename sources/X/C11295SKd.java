package X;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.SKd  reason: case insensitive filesystem */
public abstract class C11295SKd {
    public static final List A00(List list) {
        String A07;
        Uri A03;
        String scheme;
        ArrayList A1C = AnonymousClass7TE.A1C();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C250663lr optionalTreeField = C41845B3m.A0V(it).getOptionalTreeField(3, "entity", BXD.class, -989165873);
            if (optionalTreeField == null || (A07 = optionalTreeField.A07("url")) == null || (A03 = 0cp.A03(A07)) == null || (scheme = A03.getScheme()) == null || !scheme.equalsIgnoreCase("https")) {
                throw AnonymousClass7TE.A0w("Link has to be https");
            }
            A1C.add(String.valueOf(A03));
        }
        return 00k.A0a(A1C);
    }

    public static final List A01(List list, int i, int i2) {
        ArrayList A1C = AnonymousClass7TE.A1C();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C250663lr A0V = C41845B3m.A0V(it);
            A1C.add(new C10587Ruh(Integer.valueOf(i), A0V.getCoercedIntField(1, "length"), A0V.A00("offset") + i2));
        }
        return 00k.A0a(A1C);
    }

    public static final List A02(List list, int i, boolean z) {
        Uri uri;
        String scheme;
        String A07;
        ArrayList A1C = AnonymousClass7TE.A1C();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C250663lr A0V = C41845B3m.A0V(it);
            C250663lr optionalTreeField = A0V.getOptionalTreeField(3, "entity", BXD.class, -989165873);
            String str = null;
            if (optionalTreeField == null || (A07 = optionalTreeField.A07("url")) == null) {
                uri = null;
            } else {
                uri = 0cp.A03(A07);
            }
            if (!z || !(uri == null || (scheme = uri.getScheme()) == null || !scheme.equalsIgnoreCase("https"))) {
                int coercedIntField = A0V.getCoercedIntField(1, "length");
                int A00 = A0V.A00("offset") + i;
                if (C66581MXm.A1a(z) && uri != null) {
                    str = uri.toString();
                }
                A1C.add(new SF9(coercedIntField, A00, str));
            } else {
                throw AnonymousClass7TE.A0w("Link has to be https");
            }
        }
        return 00k.A0a(A1C);
    }
}
