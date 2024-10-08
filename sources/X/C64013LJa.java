package X;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.LJa  reason: case insensitive filesystem */
public abstract class C64013LJa {
    /* JADX WARNING: type inference failed for: r0v4, types: [X.L4x, java.lang.Object] */
    public static C63739L4x parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            ? obj = new Object();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                ArrayList arrayList = null;
                if ("audience_member_ids".equals(A17)) {
                    if (r4.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r4.A1J() != 16L.A08) {
                            AnonymousClass7TG.A1F(r4, arrayList);
                        }
                    }
                    obj.A01 = arrayList;
                } else if ("friend_list_id".equals(A17)) {
                    obj.A00 = AnonymousClass7TG.A0l(r4);
                }
                r4.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }

    public static void A00(17Z r2, C63739L4x l4x) {
        r2.A0c();
        if (l4x.A01 != null) {
            16P.A03(r2, "audience_member_ids");
            Iterator it = l4x.A01.iterator();
            while (it.hasNext()) {
                C41846B3n.A18(r2, it);
            }
            r2.A0Y();
        }
        String str = l4x.A00;
        if (str != null) {
            r2.A0R("friend_list_id", str);
        }
        r2.A0Z();
    }
}
