package X;

import com.facebook.react.modules.dialog.DialogModule;
import java.io.IOException;

/* renamed from: X.9wS  reason: invalid class name and case insensitive filesystem */
public abstract class C393449wS {
    public static C342477of parseFromJson(16F r10) {
        String A00;
        String A002;
        0qQ.A0B(r10, 0);
        try {
            if (r10.A11() != 16L.A0D) {
                r10.A0z();
                return null;
            }
            Integer num = null;
            Boolean bool = null;
            String str = null;
            while (true) {
                16L A1J = r10.A1J();
                16L r6 = 16L.A09;
                A00 = AnonymousClass000.A00(3782);
                A002 = C273654mx.A00(336);
                if (A1J == r6) {
                    break;
                }
                String A17 = AnonymousClass7TE.A17(r10);
                if (A002.equals(A17)) {
                    num = AnonymousClass7TF.A0X(r10);
                } else if (A00.equals(A17)) {
                    bool = AnonymousClass7TF.A0S(r10);
                } else if (DialogModule.KEY_TITLE.equals(A17)) {
                    if (r10.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r10.A1P();
                    }
                }
                r10.A0z();
            }
            if (num == null && (r10 instanceof 0c9)) {
                AnonymousClass7TF.A1L(A002, r10, "PreLiveShoppingSheetConfigImpl");
            } else if (bool == null && (r10 instanceof 0c9)) {
                AnonymousClass7TF.A1L(A00, r10, "PreLiveShoppingSheetConfigImpl");
            } else if (str != null || !(r10 instanceof 0c9)) {
                return new C342477of(str, num.intValue(), bool.booleanValue());
            } else {
                AnonymousClass7TF.A1L(DialogModule.KEY_TITLE, r10, "PreLiveShoppingSheetConfigImpl");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
