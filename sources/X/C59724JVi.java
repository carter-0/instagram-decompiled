package X;

import com.instagram.api.schemas.OriginalSoundDataIntf;

/* renamed from: X.JVi  reason: case insensitive filesystem */
public abstract class C59724JVi {
    public static final C54704HPj A00(1Xj r5) {
        C62575Ki8 ki8;
        OriginalSoundDataIntf BZB;
        C67161s9 A1N = r5.A1N();
        if (A1N == null || A1N.BZ6() == null) {
            C67231sQ A0n = C51966G9m.A0n(r5);
            if (A0n != null && (BZB = A0n.BZB()) != null && !0qQ.A0K(BZB.getOriginalMediaId(), r5.A2n()) && AnonymousClass7TF.A1Y(BZB.AkO(), false)) {
                ki8 = C62575Ki8.A0K;
            } else if (r5.A5l() || r5.A4z()) {
                ki8 = C62575Ki8.A04;
            } else if (r5.A1t() == AnonymousClass3QO.CLOSE_FRIENDS) {
                ki8 = C62575Ki8.A06;
            } else if (r5.A1t() == AnonymousClass3QO.FOLLOWERS_ONLY) {
                ki8 = C62575Ki8.A0E;
            } else {
                String xpostDenyReason = r5.A0C.getXpostDenyReason();
                if (xpostDenyReason == null || xpostDenyReason.length() <= 0) {
                    return KYY.A00;
                }
                return new KYX(AnonymousClass7TE.A1I(C62575Ki8.A0T), r5.A0C.getXpostDenyReason());
            }
        } else {
            ki8 = C62575Ki8.A0R;
        }
        return new KYX(AnonymousClass7TE.A1I(ki8), (String) null);
    }
}
