package X;

import java.io.IOException;

/* renamed from: X.Mq2  reason: case insensitive filesystem */
public abstract class C67568Mq2 {
    public static C67569Mq3 parseFromJson(16F r7) {
        0qQ.A0B(r7, 0);
        try {
            if (r7.A11() != 16L.A0D) {
                r7.A0z();
                return null;
            }
            String str = null;
            String str2 = null;
            String str3 = null;
            Integer num = null;
            while (r7.A1J() != 16L.A09) {
                String A0q = r7.A0q();
                r7.A1J();
                if ("shortcut".equals(A0q)) {
                    if (r7.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r7.A1P();
                    }
                } else if ("text".equals(A0q)) {
                    if (r7.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r7.A1P();
                    }
                } else if ("uuid".equals(A0q)) {
                    if (r7.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r7.A1P();
                    }
                } else if ("label".equals(A0q)) {
                    num = OPZ.A01(r7.A1D());
                }
                r7.A0z();
            }
            C67569Mq3 mq3 = new C67569Mq3();
            if (str != null) {
                mq3.A03 = str;
            }
            if (str2 != null) {
                mq3.A02 = str2;
            }
            if (str3 != null) {
                mq3.A01 = str3;
            }
            if (num != null) {
                mq3.A00 = num;
            }
            return mq3;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
