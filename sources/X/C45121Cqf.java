package X;

import java.io.IOException;
import java.util.HashMap;

/* renamed from: X.Cqf  reason: case insensitive filesystem */
public abstract class C45121Cqf {
    /* JADX WARNING: type inference failed for: r1v0, types: [X.3st, java.lang.Object] */
    public static C254693st parseFromJson(16F r8) {
        0qQ.A0B(r8, 0);
        try {
            ? obj = new Object();
            16L A11 = r8.A11();
            16L r7 = 16L.A0D;
            if (A11 != r7) {
                r8.A0z();
                return null;
            }
            while (true) {
                16L A1J = r8.A1J();
                16L r6 = 16L.A09;
                if (A1J == r6) {
                    return obj;
                }
                if (AnonymousClass000.A00(3730).equals(AnonymousClass7TE.A17(r8))) {
                    HashMap hashMap = null;
                    if (r8.A11() == r7) {
                        HashMap A1E = AnonymousClass7TE.A1E();
                        while (r8.A1J() != r6) {
                            String A1P = r8.A1P();
                            if (C41845B3m.A0W(r8) == 16L.A0G) {
                                A1E.put(A1P, (Object) null);
                            } else {
                                C230262pI parseFromJson = C45123Cqh.parseFromJson(r8);
                                if (parseFromJson != null) {
                                    A1E.put(A1P, parseFromJson);
                                }
                            }
                        }
                        hashMap = A1E;
                    }
                    obj.A00 = hashMap;
                }
                r8.A0z();
            }
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
