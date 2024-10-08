package X;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.LaI  reason: case insensitive filesystem */
public final class C64343LaI implements AnonymousClass8CQ {
    public final int A00;
    public final Object A01;

    public C64343LaI(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void D5A(Exception exc, List list) {
        if (this.A00 != 0) {
            0qQ.A0B(list, 0);
            if (AnonymousClass7TE.A1b(list)) {
                String str = ((AnonymousClass8K5) list.get(0)).A01;
                C60237Jhu jhu = (C60237Jhu) this.A01;
                if (((long) DbX.A02(((AnonymousClass8K5) list.get(0)).A00)) == 12) {
                    0xY A0p = AnonymousClass7TE.A0p(jhu.A05);
                    A0p.E5g("clips_audio_enhance_model_path", str);
                    A0p.apply();
                    return;
                }
                return;
            }
            return;
        }
        0qQ.A0B(list, 0);
        HashMap A1E = AnonymousClass7TE.A1E();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass8K5 r2 = (AnonymousClass8K5) it.next();
            HashMap hashMap = LMA.A01;
            String str2 = r2.A02;
            Object obj = hashMap.get(str2);
            if (obj == null) {
                obj = str2;
            }
            A1E.put(obj, r2.A01);
        }
        C51965G9l.A1W(this.A01, A1E);
    }
}
