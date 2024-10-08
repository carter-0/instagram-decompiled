package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Elr  reason: case insensitive filesystem */
public abstract class C48891Elr {
    /* JADX WARNING: type inference failed for: r2v0, types: [X.5tz, java.lang.Object] */
    public static C298765tz parseFromJson(16F r4) {
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
                if (PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(A17)) {
                    obj.A00 = AnonymousClass7TG.A0l(r4);
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_TYPE.equals(A17)) {
                    obj.A01 = AnonymousClass7TG.A0l(r4);
                } else if (C41845B3m.A1E(A17)) {
                    C41846B3n.A1A(r4);
                } else if (AnonymousClass000.A00(2937).equals(A17)) {
                    if (r4.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r4.A1J() != 16L.A08) {
                            1Xj A00 = 1Xj.A00(r4);
                            if (A00 != null) {
                                arrayList.add(A00);
                            }
                        }
                    }
                    obj.A02 = arrayList;
                }
                r4.A0z();
            }
            C48099EVr.A01.get(obj.A01);
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
