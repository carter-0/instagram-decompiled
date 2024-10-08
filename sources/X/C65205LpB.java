package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.LpB  reason: case insensitive filesystem */
public final class C65205LpB implements MVS {
    public C60076JfA A00;
    public AnonymousClass5Gv A01;
    public final C62666KkS A02;
    public final AnonymousClass80P A03 = AnonymousClass80P.BIO_PRODUCT;
    public final AnonymousClass4DH A04;
    public final UserSession A05;
    public final C59899JbO A06;
    public final C61838KOc A07;

    public final /* synthetic */ void ADm() {
    }

    public final View ANH() {
        boolean z;
        0xa r4;
        int i;
        0s0 r2;
        AnonymousClass0YZ[] r1;
        int i2;
        String str;
        AnonymousClass4DH r6 = this.A04;
        Context requireContext = r6.requireContext();
        LYD A012 = LYD.A01(this, 13);
        Integer valueOf = Integer.valueOf(R.drawable.instagram_product_details_add_pano_outline_24);
        C60076JfA jfA = new C60076JfA(requireContext);
        jfA.setTitle(requireContext.getResources().getString(2131973076));
        jfA.setInlineSubtitle("");
        AnonymousClass0fU.A00(A012, jfA);
        jfA.setIcon(JTP.A0E(requireContext, valueOf));
        JTS.A0x(jfA);
        this.A00 = jfA;
        int A022 = AnonymousClass7TG.A02(r6.requireContext());
        AnonymousClass5Gt A0f = AnonymousClass7TG.A0f(r6.requireActivity(), AnonymousClass7TF.A0d(DbV.A05(r6), 2131973078));
        C60076JfA jfA2 = this.A00;
        if (jfA2 != null) {
            A0f.A03(jfA2);
            C60076JfA jfA3 = this.A00;
            if (jfA3 != null) {
                int width = jfA3.getWidth() / 2;
                C60076JfA jfA4 = this.A00;
                if (jfA4 != null) {
                    int height = jfA4.getHeight() - A022;
                    C60076JfA jfA5 = this.A00;
                    if (jfA5 != null) {
                        A0f.A04(jfA5, width, height, true);
                        A0f.A02();
                        A0f.A0A = true;
                        this.A01 = A0f.A00();
                        C61838KOc kOc = this.A07;
                        C62666KkS kkS = this.A02;
                        0qQ.A0B(kkS, 0);
                        1Av A002 = 1Au.A00(kOc.A02);
                        if (kkS == C62666KkS.BIO_IG_REELS) {
                            z = true;
                            r4 = A002.A01;
                            i = r4.getInt("reel_sell_product_row_new_badge_seen_count", 0);
                            r2 = A002.A78;
                            r1 = 1Av.A8a;
                            i2 = 412;
                        } else {
                            z = false;
                            r4 = A002.A01;
                            i = r4.getInt("sell_product_row_new_badge_seen_count", 0);
                            r2 = A002.A7f;
                            r1 = 1Av.A8a;
                            i2 = 411;
                        }
                        if (!AnonymousClass7TG.A1a(A002, r2, r1, i2) && i < 3) {
                            if (z) {
                                str = "reel_sell_product_row_new_badge_seen_count";
                            } else {
                                str = "sell_product_row_new_badge_seen_count";
                            }
                            JTS.A1S(r4, str, 0);
                            MH9.A04(kOc, kOc.A04, 31);
                        }
                        0Aj A013 = C59899JbO.A01(kkS, this.A06);
                        DbS.A1I(A013, "seller_view_add_purchase_button");
                        A013.Cgf();
                        C60076JfA jfA6 = this.A00;
                        if (jfA6 != null) {
                            return jfA6;
                        }
                    }
                }
            }
        }
        0qQ.A0F("bioRow");
        throw AnonymousClass00P.createAndThrow();
    }

    public final C62674Kka B1s() {
        return null;
    }

    public final AnonymousClass80P BHl() {
        return this.A03;
    }

    public final void CsQ() {
        Fragment fragment = this.A04;
        07U r4 = 07U.A05;
        AnonymousClass07Z viewLifecycleOwner = fragment.getViewLifecycleOwner();
        AnonymousClass7TE.A1Z(MHO.A03(viewLifecycleOwner, r4, this, (AnonymousClass4D7) null, 20), AnonymousClass07a.A00(viewLifecycleOwner));
        JTS.A10(fragment, new MGX(this, (AnonymousClass4D7) null, 27), this.A07.A07);
    }

    public C65205LpB(C62666KkS kkS, AnonymousClass4DH r3, UserSession userSession, C61838KOc kOc) {
        AnonymousClass7TG.A1U(r3, userSession, kOc);
        this.A04 = r3;
        this.A05 = userSession;
        this.A07 = kOc;
        this.A02 = kkS;
        this.A06 = JZM.A00(userSession);
    }
}
