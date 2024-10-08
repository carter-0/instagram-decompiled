package X;

import com.instagram.model.direct.DirectThreadKey;
import java.util.ArrayList;

/* renamed from: X.Meb  reason: case insensitive filesystem */
public abstract class C66893Meb {
    public static void A00(17Z r3, 1bp r4) {
        if (r4.A04 != null) {
            16P.A03(r3, "thread_keys");
            for (DirectThreadKey directThreadKey : r4.A04) {
                if (directThreadKey != null) {
                    C254733sx.A00(r3, directThreadKey);
                }
            }
            r3.A0Y();
        }
        String str = r4.A03;
        if (str != null) {
            r3.A0R("client_context", str);
        }
        Long l = r4.A02;
        if (l != null) {
            r3.A0Q("pending_timestamp_us", l.longValue());
        }
        r3.A0Q("timestamp_us", r4.A00);
        C69343Nji nji = r4.A01;
        if (nji != null) {
            r3.A0P("mutation_queue_override", nji.A00);
        }
        C66670Mad.A00(r3, r4);
    }

    public static void A01(16F r3, 1bp r4, String str) {
        ArrayList arrayList = null;
        if ("thread_keys".equals(str)) {
            if (r3.A11() == 16L.A0C) {
                arrayList = AnonymousClass7TE.A1C();
                while (r3.A1J() != 16L.A08) {
                    DirectThreadKey parseFromJson = C254733sx.parseFromJson(r3);
                    if (parseFromJson != null) {
                        arrayList.add(parseFromJson);
                    }
                }
            }
            r4.A04 = arrayList;
        } else if ("client_context".equals(str)) {
            r4.A03 = AnonymousClass7TG.A0l(r3);
        } else if ("pending_timestamp_us".equals(str)) {
            r4.A02 = AnonymousClass7TF.A0Z(r3);
        } else if ("timestamp_us".equals(str)) {
            r4.A00 = r3.A0y();
        } else if ("mutation_queue_override".equals(str)) {
            C69343Nji nji = (C69343Nji) C51968G9o.A10(C69343Nji.A01, r3.A1D());
            if (nji == null) {
                nji = C69343Nji.DEFAULT;
            }
            r4.A01 = nji;
        } else {
            C66670Mad.A01(r3, r4, str);
        }
    }
}
