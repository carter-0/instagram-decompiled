package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.GNg  reason: case insensitive filesystem */
public abstract class C52314GNg {
    public static final Map A00 = AnonymousClass7TE.A1H();

    public static final ArrayList A00(List list) {
        ArrayList A0q = AnonymousClass7TF.A0q(list, 0);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C2814457q r3 = (C2814457q) it.next();
            0bb r2 = new 0bb();
            r2.A03("is_ad", Boolean.valueOf(r3.CcK()));
            String C9J = r3.C9J();
            if (C9J != null) {
                r2.A06("tracking", C9J);
            }
            String AZ4 = r3.AZ4();
            if (AZ4 != null) {
                r2.A06("ad_id", AZ4);
            }
            String C9L = r3.C9L();
            if (C9L != null) {
                r2.A06("tracking_token", C9L);
            }
            A0q.add(r2);
        }
        return A0q;
    }

    public static final ArrayList A01(List list) {
        ArrayList A0q = AnonymousClass7TF.A0q(list, 0);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C238873Dt r3 = (C238873Dt) it.next();
            0bb r2 = new 0bb();
            r2.A01((C238863Ds) r3.A01, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
            Integer num = r3.A00;
            if (num != null) {
                r2.A05("index", Long.valueOf((long) num.intValue()));
            }
            A0q.add(r2);
        }
        return A0q;
    }
}
