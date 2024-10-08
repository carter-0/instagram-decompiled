package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Em9  reason: case insensitive filesystem */
public abstract class C48909Em9 {
    /* JADX WARNING: type inference failed for: r6v1, types: [X.EbN, java.lang.Object] */
    public static C48242EbN parseFromJson(16F r7) {
        0qQ.A0B(r7, 0);
        try {
            if (r7.A11() != 16L.A0D) {
                r7.A0z();
                return null;
            }
            C48230EbB ebB = null;
            C48181EaN eaN = null;
            ArrayList arrayList = null;
            C48221Eb2 eb2 = null;
            while (r7.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r7);
                if ("token".equals(A17)) {
                    ebB = C48913EmD.parseFromJson(r7);
                } else if ("token_account".equals(A17)) {
                    eaN = C48912EmC.parseFromJson(r7);
                } else if ("connected_accounts".equals(A17)) {
                    if (r7.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r7.A1J() != 16L.A08) {
                            C49547Exi parseFromJson = C48910EmA.parseFromJson(r7);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("continue_button".equals(A17)) {
                    eb2 = C48911EmB.parseFromJson(r7);
                } else if ("error".equals(A17)) {
                    C41846B3n.A1A(r7);
                }
                r7.A0z();
            }
            ? obj = new Object();
            obj.A01 = ebB;
            obj.A02 = eaN;
            obj.A03 = arrayList;
            obj.A00 = eb2;
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
