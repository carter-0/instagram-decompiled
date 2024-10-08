package X;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.switchbutton.IgdsSwitch;

/* renamed from: X.Low  reason: case insensitive filesystem */
public final class C65193Low implements MVS {
    public final C62674Kka A00 = C62674Kka.A0C;
    public final AnonymousClass80P A01 = AnonymousClass80P.HIDE_LIKE_COUNT;
    public final AnonymousClass4DH A02;
    public final UserSession A03;
    public final KOI A04;
    public final boolean A05;
    public final boolean A06;

    public final /* synthetic */ void ADm() {
    }

    public final void CsQ() {
    }

    public final View ANH() {
        int i;
        Integer num;
        int i2;
        Integer num2;
        int i3;
        boolean z;
        boolean z2;
        AnonymousClass4DH r2 = this.A02;
        LinearLayout linearLayout = new LinearLayout(r2.requireContext());
        linearLayout.setOrientation(1);
        JTS.A0x(linearLayout);
        Context requireContext = r2.requireContext();
        KOI koi = this.A04;
        boolean z3 = koi.A02;
        if (z3) {
            i = 2131955348;
        } else if (koi.A00 == C62462KgC.CLIPS) {
            i = 2131955346;
        } else {
            i = 2131957378;
            if (koi.A03) {
                i = 2131963376;
            }
        }
        boolean z4 = this.A05;
        if (z4) {
            num = Integer.valueOf(R.drawable.instagram_heart_off_pano_outline_24);
        } else {
            num = null;
        }
        KHY A012 = C64004LIk.A01(requireContext, true, (CharSequence) null, num, i);
        A012.setChecked(koi.A06().A0b);
        KHY.A02(A012, this, 10);
        IgdsSwitch igdsSwitch = A012.A08;
        if (igdsSwitch != null) {
            DbU.A12(02K.A01(r2.requireContext()), igdsSwitch, 2131957378);
            2eS.A04(igdsSwitch, AnonymousClass05K.A04);
            Context requireContext2 = r2.requireContext();
            IgdsSwitch igdsSwitch2 = A012.A08;
            if (igdsSwitch2 != null) {
                z2 = igdsSwitch2.isChecked();
            } else {
                z2 = A012.A0F;
            }
            int i4 = 2131957373;
            if (z2) {
                i4 = 2131957372;
            }
            2eQ.A08(igdsSwitch, JTQ.A0a(requireContext2, i4));
        }
        linearLayout.addView(A012);
        if (this.A06) {
            Context requireContext3 = r2.requireContext();
            if (z3) {
                i2 = 2131955198;
            } else {
                i2 = 2131963390;
                if (koi.A00 == C62462KgC.CLIPS) {
                    i2 = 2131955197;
                }
            }
            if (z4) {
                num2 = Integer.valueOf(R.drawable.instagram_direct_off_pano_outline_24);
            } else {
                num2 = null;
            }
            if (koi.A03) {
                if (z3) {
                    i3 = 2131955195;
                } else {
                    i3 = 2131957380;
                    if (koi.A00 == C62462KgC.CLIPS) {
                        i3 = 2131955194;
                    }
                }
            } else if (z3) {
                i3 = 2131955347;
            } else {
                i3 = 2131957374;
                if (koi.A00 == C62462KgC.CLIPS) {
                    i3 = 2131955344;
                }
            }
            KHY A013 = C64004LIk.A01(requireContext3, true, C64191LSy.A01(r2, this.A03, r2.getModuleName(), DbU.A0m(r2, i3), "https://help.instagram.com/113355287252104"), num2, i2);
            A013.setChecked(koi.A06().A0c);
            KHY.A02(A013, this, 11);
            IgdsSwitch igdsSwitch3 = A013.A08;
            if (igdsSwitch3 != null) {
                DbU.A12(02K.A01(r2.requireContext()), igdsSwitch3, 2131963390);
                2eS.A04(igdsSwitch3, AnonymousClass05K.A04);
                Context requireContext4 = r2.requireContext();
                IgdsSwitch igdsSwitch4 = A013.A08;
                if (igdsSwitch4 != null) {
                    z = igdsSwitch4.isChecked();
                } else {
                    z = A013.A0F;
                }
                int i5 = 2131957373;
                if (z) {
                    i5 = 2131957372;
                }
                2eQ.A08(igdsSwitch3, JTQ.A0a(requireContext4, i5));
            }
            linearLayout.addView(A013);
        }
        return linearLayout;
    }

    public final C62674Kka B1s() {
        return this.A00;
    }

    public final AnonymousClass80P BHl() {
        return this.A01;
    }

    public C65193Low(AnonymousClass4DH r2, UserSession userSession, KOI koi, boolean z) {
        AnonymousClass7TG.A1O(r2, userSession);
        this.A02 = r2;
        this.A03 = userSession;
        this.A05 = z;
        this.A04 = koi;
        this.A06 = new C227072ib(userSession).A00();
    }
}
