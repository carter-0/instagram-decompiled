package X;

/* renamed from: X.VoB  reason: case insensitive filesystem */
public abstract class C18244VoB {
    public static final void A00(0jB r2, C298795u2 r3) {
        0qQ.A0B(r3, 1);
        r2.A04(C297705sC.A08, r3.A00().A03);
        r2.A04(C297705sC.A0A, "KEYWORD");
        r2.A04(C297705sC.A07, r3.A04);
        r2.A04(C297705sC.A09, VBV.A00(r3.A02));
    }

    public static final void A01(0jB r3, C296935qt r4) {
        C295795ov r2 = r4.A03;
        if (r2 != null && r2.A00 == C295805ow.INTEREST_KEYWORD_RECOMMENDATION) {
            Object obj = r2.A0F;
            0qQ.A0A(obj);
            0qQ.A0C(obj, "null cannot be cast to non-null type com.instagram.discovery.interests.model.KeywordRecommendation");
            A00(r3, (C298795u2) obj);
        }
    }
}
