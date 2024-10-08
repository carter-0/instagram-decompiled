package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.common.session.UserSession;
import java.io.IOException;
import java.util.HashMap;

/* renamed from: X.VGp  reason: case insensitive filesystem */
public abstract class C17067VGp {
    /* JADX WARNING: type inference failed for: r0v4, types: [java.lang.Object, X.V3F] */
    public static V3F parseFromJson(16F r9) {
        0qQ.A0B(r9, 0);
        try {
            16L A11 = r9.A11();
            16L r7 = 16L.A0D;
            HashMap hashMap = null;
            if (A11 != r7) {
                r9.A0z();
                return null;
            }
            while (true) {
                16L A1J = r9.A1J();
                16L r6 = 16L.A09;
                if (A1J != r6) {
                    if (DialogModule.KEY_ITEMS.equals(AnonymousClass7TE.A17(r9))) {
                        if (r9.A11() == r7) {
                            hashMap = new HashMap();
                            while (r9.A12() != r6) {
                                String A0q = r9.A0q();
                                if (r9.A12() == r7) {
                                    HashMap hashMap2 = new HashMap();
                                    while (r9.A11() == r7) {
                                        String A0q2 = r9.A0q();
                                        C45406Cvm parseFromJson = C45053CpW.parseFromJson(r9);
                                        0qQ.A0B(parseFromJson, 0);
                                        WSU A00 = C45019Cow.A00((UserSession) null, parseFromJson);
                                        if (A00 != null) {
                                            hashMap2.put(A0q2, A00);
                                        }
                                        r9.A12();
                                    }
                                    if (!hashMap2.isEmpty()) {
                                        hashMap.put(A0q, hashMap2);
                                    }
                                } else {
                                    r9.A0z();
                                }
                            }
                        } else {
                            r9.A0z();
                            hashMap = null;
                        }
                    }
                    r9.A0z();
                } else {
                    ? obj = new Object();
                    obj.A00 = hashMap;
                    return obj;
                }
            }
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
