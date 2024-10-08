package X;

import com.facebook.ppml.enigma.InstallReferrerEventV2;
import com.instagram.common.session.UserSession;
import com.instagram.feed.media.ReelCTAIntf;
import com.instagram.model.androidlink.AndroidLink;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.59c  reason: invalid class name */
public final class AnonymousClass59c {
    public final UserSession A00;

    public AnonymousClass59c(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
    }

    public static final void A00(int i, String str, String str2, String str3, String str4) {
        C375799Fc A002;
        String str5 = str;
        if (str.length() != 0 && !str.equals("0")) {
            String str6 = str2;
            if (str2.length() != 0) {
                String str7 = str3;
                if (str3.length() != 0 && (A002 = C375789Fb.A00()) != null) {
                    A002.A02(new InstallReferrerEventV2(str5, 1, i, str6, TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()), str7), str4);
                }
            }
        }
    }

    public final void A02(1Xj r5, String str) {
        if (!182.A06(0Tu.A05, this.A00, 36319046614129533L)) {
            return;
        }
        if (!r5.A3P().isEmpty()) {
            for (AndroidLink A01 : r5.A3P()) {
                A01(A01, str);
            }
            return;
        }
        List C0M = r5.A0C.C0M();
        if (C0M == null || !(!C0M.isEmpty())) {
            List Alu = r5.A0C.Alu();
            if (Alu != null && (!Alu.isEmpty())) {
                List<1Xj> Alu2 = r5.A0C.Alu();
                if (Alu2 == null) {
                    Alu2 = new ArrayList<>();
                }
                for (1Xj A3P : Alu2) {
                    for (AndroidLink A012 : A3P.A3P()) {
                        A01(A012, str);
                    }
                }
                return;
            }
            return;
        }
        List<ReelCTAIntf> C0M2 = r5.A0C.C0M();
        if (C0M2 == null) {
            C0M2 = new ArrayList<>();
        }
        for (ReelCTAIntf BN4 : C0M2) {
            List<AndroidLink> BN42 = BN4.BN4();
            if (BN42 == null) {
                BN42 = new ArrayList<>();
            }
            for (AndroidLink A013 : BN42) {
                A01(A013, str);
            }
        }
    }

    private final void A01(AndroidLink androidLink, String str) {
        String BlB;
        Boolean Cev;
        String Ac5 = androidLink.Ac5();
        if (Ac5 != null && (BlB = androidLink.BlB()) != null && (Cev = androidLink.Cev()) != null) {
            boolean booleanValue = Cev.booleanValue();
            String CHl = androidLink.CHl();
            if (CHl != null && booleanValue) {
                A00(0, Ac5, BlB, CHl, str);
            }
        }
    }
}
