package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.VnV  reason: case insensitive filesystem */
public abstract class C18205VnV {
    public static C17349VSc parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            C17349VSc vSc = new C17349VSc();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                ArrayList arrayList = null;
                if (C41845B3m.A1A(A17)) {
                    vSc.A00 = AnonymousClass7TG.A0l(r4);
                } else if ("ranges".equals(A17)) {
                    if (r4.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r4.A1J() != 16L.A08) {
                            C17441VVu parseFromJson = C16996VDw.parseFromJson(r4);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    vSc.A01 = arrayList;
                }
                r4.A0z();
            }
            return vSc;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(17Z r4, C17349VSc vSc) {
        r4.A0c();
        C41846B3n.A0z(r4, vSc.A00);
        if (vSc.A01 != null) {
            16P.A03(r4, "ranges");
            for (C17441VVu vVu : vSc.A01) {
                if (vVu != null) {
                    r4.A0c();
                    r4.A0P("length", vVu.A00);
                    r4.A0P("offset", vVu.A01);
                    if (vVu.A02 != null) {
                        r4.A0q("entity");
                        C17585Vad vad = vVu.A02;
                        r4.A0c();
                        String str = vad.A03;
                        if (str != null) {
                            r4.A0R("__typename", str);
                        }
                        C41846B3n.A0y(r4, vad.A00);
                        String str2 = vad.A01;
                        if (str2 != null) {
                            r4.A0R(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, str2);
                        }
                        String str3 = vad.A02;
                        if (str3 != null) {
                            r4.A0R("tag", str3);
                        }
                        String str4 = vad.A04;
                        if (str4 != null) {
                            r4.A0R("url", str4);
                        }
                        if (vad.A05 != null) {
                            16P.A03(r4, "android_urls");
                            Iterator it = vad.A05.iterator();
                            while (it.hasNext()) {
                                C41846B3n.A18(r4, it);
                            }
                            r4.A0Y();
                        }
                        r4.A0Z();
                    }
                    r4.A0Z();
                }
            }
            r4.A0Y();
        }
        r4.A0Z();
    }
}
