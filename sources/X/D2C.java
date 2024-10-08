package X;

import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.user.model.User;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public abstract class D2C {
    /* JADX WARNING: type inference failed for: r0v3, types: [X.CvU, java.lang.Object] */
    public static C45388CvU parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            ? obj = new Object();
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                if (C41845B3m.A1D(A17)) {
                    obj.A01 = 1Xj.A00(r5);
                } else if ("mentioned_users".equals(A17)) {
                    ArrayList arrayList = null;
                    if (r5.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r5.A1J() != 16L.A08) {
                            C41846B3n.A1E(r5, arrayList);
                        }
                    }
                    obj.A03 = arrayList;
                } else if ("year".equals(A17)) {
                    obj.A00 = r5.A1D();
                } else if (C41845B3m.A1B(A17)) {
                    obj.A02 = C41845B3m.A0a(r5, false);
                }
                r5.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }

    public static void A00(17Z r2, C45388CvU cvU) {
        r2.A0c();
        if (cvU.A01 != null) {
            r2.A0q("media");
            1Xj r1 = cvU.A01;
            1Xv r0 = 1Xj.A0h;
            1Xv.A07(r2, r1);
        }
        if (cvU.A03 != null) {
            16P.A03(r2, "mentioned_users");
            Iterator it = cvU.A03.iterator();
            while (it.hasNext()) {
                C41846B3n.A19(r2, it);
            }
            r2.A0Y();
        }
        r2.A0P("year", cvU.A00);
        if (cvU.A02 != null) {
            r2.A0q(PublicKeyCredentialControllerUtility.JSON_KEY_USER);
            User user = cvU.A02;
            Parcelable.Creator creator = User.CREATOR;
            1aC.A08(r2, user);
        }
        r2.A0Z();
    }
}
