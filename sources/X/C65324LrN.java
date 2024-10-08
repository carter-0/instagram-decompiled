package X;

import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.LrN  reason: case insensitive filesystem */
public final class C65324LrN implements AnonymousClass4DU, C66423MRd {
    public static final String __redex_internal_original_name = "MediaThumbnailPreviewPresenter";
    public int A00;
    public C64515LdH A01;
    public 1Xj A02;
    public boolean A03;
    public final C63601Kzo A04;
    public final LE4 A05;
    public final C46215DQt A06 = new C64725Lh2(this, 3);
    public final C232692uG A07;
    public final C232722uK A08;
    public final Map A09 = AnonymousClass7TE.A1H();

    public C65324LrN(LE4 le4, UserSession userSession, C324356z9 r14, C232692uG r15) {
        0qQ.A0B(userSession, 1);
        this.A05 = le4;
        this.A07 = r15;
        this.A04 = new C63601Kzo(userSession, r14);
        this.A08 = new C232722uK(AnonymousClass7TE.A0S(le4.A04), userSession, this, (C228412ld) null, "", true, false, true, true, false);
        this.A00 = -1;
        le4.A00 = this;
        C61644KFu kFu = le4.A06;
        kFu.A02 = userSession;
        kFu.A01 = this;
        kFu.A00 = new C63602Kzp(le4);
        JTQ.A1G(le4.A07);
        r15.EU9(new C19360WWb(this, 1));
    }

    public static final void A01(C60707Jps jps, C65324LrN lrN, 1Xj r13, int i) {
        C65324LrN lrN2 = lrN;
        if (lrN.A03) {
            1Xj r2 = r13;
            if (r13.BR7() == 1iA.A0a) {
                C232722uK r1 = lrN.A08;
                if (!r13.equals(r1.A0G())) {
                    A03(lrN, "media_mismatch");
                    C60707Jps jps2 = jps;
                    r1.A0R(r2, lrN2, jps2, new C263414Lx(false, false, false, false), i, i, A00(lrN, r13).A01(), true, false);
                    lrN.A00 = i;
                }
            }
        }
    }

    public static final void A03(C65324LrN lrN, String str) {
        C232722uK r1 = lrN.A08;
        if (r1.A0G() != null) {
            r1.A0U(str, true, true);
            lrN.A00 = -1;
        }
    }

    public final String getModuleName() {
        return "promote_media_picker_thumbnail_preview";
    }

    public final boolean isOrganicEligible() {
        return false;
    }

    public final boolean isSponsoredEligible() {
        return false;
    }

    public static final AnonymousClass3W1 A00(C65324LrN lrN, 1Xj r3) {
        Map map = lrN.A09;
        String id = r3.getId();
        if (id != null) {
            Object obj = map.get(id);
            if (obj == null) {
                obj = G9t.A18(r3);
                map.put(id, obj);
            }
            return (AnonymousClass3W1) obj;
        }
        throw AnonymousClass7TE.A0y();
    }

    public static final void A02(C65324LrN lrN) {
        C60707Jps jps;
        LE4 le4 = lrN.A05;
        int A002 = le4.A00();
        int A003 = le4.A00();
        if (A003 != -1) {
            AnonymousClass2t9 r1 = le4.A07;
            if (r1.A04(A003) instanceof C64788Li4) {
                Object A042 = r1.A04(A003);
                0qQ.A0C(A042, "null cannot be cast to non-null type com.instagram.business.promote.mediapicker.viewmodel.MediaThumbnailPreviewViewModel");
                1Xj r2 = ((C64788Li4) A042).A00;
                C249703kE A0W = le4.A04.A0W(le4.A00());
                if ((A0W instanceof C60707Jps) && (jps = (C60707Jps) A0W) != null && A002 != -1) {
                    A01(jps, lrN, r2, A002);
                }
            }
        }
    }

    public final void destroy() {
        this.A08.A0L();
    }
}
