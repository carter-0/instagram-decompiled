package X;

import com.facebook.react.modules.dialog.DialogModule;
import java.io.IOException;

/* renamed from: X.Cmi  reason: case insensitive filesystem */
public abstract class C44892Cmi {
    public static C239593Hb parseFromJson(16F r14) {
        0qQ.A0B(r14, 0);
        try {
            if (r14.A11() != 16L.A0D) {
                r14.A0z();
                return null;
            }
            String str = null;
            C257593xe r5 = null;
            String str2 = null;
            Integer num = null;
            String str3 = null;
            C250533lb r3 = null;
            C270864hR r4 = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            Integer num2 = null;
            while (r14.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r14);
                if ("action_text".equals(A17)) {
                    if (r14.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r14.A1P();
                    }
                } else if ("bloks_data".equals(A17)) {
                    r5 = C45662D0m.parseFromJson(r14);
                } else if (AnonymousClass000.A00(1231).equals(A17)) {
                    if (r14.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r14.A1P();
                    }
                } else if (C41845B3m.A1Y(A17)) {
                    num = AnonymousClass7TF.A0X(r14);
                } else if (C41845B3m.A17(A17)) {
                    if (r14.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r14.A1P();
                    }
                } else if ("item_client_gap_rules".equals(A17)) {
                    r3 = C250523la.parseFromJson(r14);
                } else if ("layout".equals(A17)) {
                    r4 = C276404tH.A00(r14);
                } else if (DialogModule.KEY_MESSAGE.equals(A17)) {
                    if (r14.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r14.A1P();
                    }
                } else if (C41845B3m.A1E(A17)) {
                    if (r14.A11() == 16L.A0G) {
                        str5 = null;
                    } else {
                        str5 = r14.A1P();
                    }
                } else if (!C41845B3m.A1W(A17)) {
                    num2 = C41847B3o.A13(r14, num2, A17, "view_state_item_type");
                } else if (r14.A11() == 16L.A0G) {
                    str6 = null;
                } else {
                    str6 = r14.A1P();
                }
                r14.A0z();
            }
            return new C239593Hb(r3, r4, r5, num, num2, str, str2, str3, str4, str5, str6);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
