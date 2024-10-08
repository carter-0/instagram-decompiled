package X;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* renamed from: X.S1f  reason: case insensitive filesystem */
public final class C10927S1f {
    public final List A00 = AnonymousClass7TE.A1C();
    public final AnonymousClass59G A01;
    public final AnonymousClass59G A02;

    public C10927S1f(AnonymousClass59G r2, AnonymousClass59G r3) {
        AnonymousClass7TG.A1O(r2, r3);
        this.A02 = r2;
        this.A01 = r3;
    }

    public final ArrayList A00(Integer num, boolean z, boolean z2) {
        ArrayList A1C = AnonymousClass7TE.A1C();
        List<0eP> list = this.A00;
        if (!z) {
            list = 00k.A0Y(list);
        }
        for (0eP r4 : list) {
            if ((num == AnonymousClass05K.A01 && 0qQ.A0K(((C8906REz) r4.A00).A00, "encrypted_report")) || ((num == AnonymousClass05K.A00 && 0qQ.A0K(((C8906REz) r4.A00).A00, "match_key")) || num == AnonymousClass05K.A0C)) {
                int i = 0;
                do {
                    JSONObject A11 = DbS.A11();
                    byte[] bArr = (byte[]) AnonymousClass0eT.A00((AnonymousClass59G) r4.A01).get(i);
                    A11.put("public_key", AnonymousClass0eT.A00(this.A02).get(i));
                    A11.put("helper_domain", AnonymousClass0eT.A00(this.A01).get(i));
                    String str = ((C8906REz) r4.A00).A00;
                    0qQ.A0B(bArr, 0);
                    A11.put(str, 03t.A08("", C13355TWp.A00, bArr));
                    if (z2) {
                        A11.put("operating_system", "Android");
                    }
                    A1C.add(A11);
                    i++;
                } while (i < 3);
                if (!z) {
                    break;
                }
            }
        }
        return A1C;
    }
}
