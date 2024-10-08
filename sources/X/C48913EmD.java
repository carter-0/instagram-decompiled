package X;

import com.instagram.fx.access.constants.FxcalAccountType;
import java.io.IOException;
import kotlin.enums.EnumEntries;

/* renamed from: X.EmD  reason: case insensitive filesystem */
public abstract class C48913EmD {
    /* JADX WARNING: type inference failed for: r3v1, types: [X.EbB, java.lang.Object] */
    public static C48230EbB parseFromJson(16F r6) {
        String str;
        String str2;
        0qQ.A0B(r6, 0);
        try {
            if (r6.A11() != 16L.A0D) {
                r6.A0z();
                return null;
            }
            FxcalAccountType fxcalAccountType = null;
            String str3 = null;
            while (r6.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r6);
                if ("account_type".equals(A17)) {
                    if (r6.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r6.A1P();
                    }
                    EnumEntries enumEntries = FxcalAccountType.A02;
                    0qQ.A0B(str2, 0);
                    fxcalAccountType = (FxcalAccountType) FxcalAccountType.A01.get(str2);
                } else if ("token_id".equals(A17)) {
                    r6.A1D();
                } else if ("user_fbid".equals(A17)) {
                    if (r6.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r6.A1P();
                    }
                } else if ("token_type".equals(A17)) {
                    if (r6.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r6.A1P();
                    }
                    EnumEntries enumEntries2 = EX1.A02;
                    0qQ.A0B(str, 0);
                    EX1.A01.get(str);
                } else if ("token_app".equals(A17)) {
                    C41846B3n.A1A(r6);
                } else if ("token_source".equals(A17)) {
                    C41846B3n.A1A(r6);
                }
                r6.A0z();
            }
            ? obj = new Object();
            obj.A00 = fxcalAccountType;
            obj.A01 = str3;
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
