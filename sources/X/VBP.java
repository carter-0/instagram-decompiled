package X;

import com.facebook.react.modules.dialog.DialogModule;
import java.io.IOException;

public abstract class VBP {
    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Object, X.VsV] */
    public static C18479VsV parseFromJson(16F r4) {
        String str;
        0qQ.A0B(r4, 0);
        try {
            ? obj = new Object();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if (C41845B3m.A1C(A17)) {
                    String A0l = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l, 0);
                    obj.A03 = A0l;
                } else if (C41845B3m.A1E(A17)) {
                    String A0l2 = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l2, 0);
                    obj.A02 = A0l2;
                }
                r4.A0z();
            }
            String str2 = obj.A02;
            if (str2 != null) {
                obj.A01 = str2;
                String str3 = obj.A03;
                if (str3 != null) {
                    C16672Uz8 uz8 = (C16672Uz8) C16672Uz8.A01.get(str3);
                    if (uz8 == null) {
                        uz8 = C16672Uz8.UNSPECIFIED;
                    }
                    obj.A00 = uz8;
                    return obj;
                }
                str = "typeStr";
            } else {
                str = DialogModule.KEY_TITLE;
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
