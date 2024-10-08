package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.LpA  reason: case insensitive filesystem */
public final class C65204LpA implements MVS {
    public C60076JfA A00;
    public final AnonymousClass80P A01 = AnonymousClass80P.TRANSLATE_DUB_VOICE;
    public final AnonymousClass4DH A02;
    public final C60253JiA A03;
    public final UserSession A04;
    public final C66576MXh A05;
    public final KOG A06;
    public final 1Av A07;

    public final /* synthetic */ void ADm() {
    }

    public final View ANH() {
        C60076JfA A002 = C64004LIk.A00(this.A02.requireContext(), LYD.A01(this, 12), Integer.valueOf(R.drawable.instagram_gen_ai_pano_filled_24), 2131955249);
        this.A00 = A002;
        return A002;
    }

    public final C62674Kka B1s() {
        return null;
    }

    public final AnonymousClass80P BHl() {
        return this.A01;
    }

    public final void CsQ() {
        2Fk r4 = this.A03.A00;
        AnonymousClass4DH r2 = this.A02;
        Dba.A15(r2.getViewLifecycleOwner(), r4, new MP9(this, 10), 16);
        KOG kog = this.A06;
        1Av A002 = 1Au.A00(kog.A01);
        if (!AnonymousClass7TG.A1a(A002, A002.A0c, 1Av.A8a, 187)) {
            0xa r5 = A002.A01;
            if (r5.getInt("clips_share_sheet_audio_translations_new_badge_impression_count", 0) < 3) {
                kog.A00 = true;
                JTS.A1S(r5, "clips_share_sheet_audio_translations_new_badge_impression_count", 0);
                05G r1 = kog.A04;
                C61060Jvy jvy = (C61060Jvy) r1.getValue();
                boolean z = kog.A00;
                boolean z2 = jvy.A02;
                boolean z3 = jvy.A03;
                List list = (List) jvy.A01;
                0qQ.A0B(list, 2);
                r1.Epw(new C61060Jvy(list, 3, z2, z3, z));
                07U r42 = 07U.A05;
                AnonymousClass07Z viewLifecycleOwner = r2.getViewLifecycleOwner();
                AnonymousClass7TE.A1Z(MHO.A03(viewLifecycleOwner, r42, this, (AnonymousClass4D7) null, 19), AnonymousClass07a.A00(viewLifecycleOwner));
            }
        }
        kog.A00 = false;
        05G r12 = kog.A04;
        C61060Jvy jvy2 = (C61060Jvy) r12.getValue();
        boolean z4 = kog.A00;
        boolean z22 = jvy2.A02;
        boolean z32 = jvy2.A03;
        List list2 = (List) jvy2.A01;
        0qQ.A0B(list2, 2);
        r12.Epw(new C61060Jvy(list2, 3, z22, z32, z4));
        07U r422 = 07U.A05;
        AnonymousClass07Z viewLifecycleOwner2 = r2.getViewLifecycleOwner();
        AnonymousClass7TE.A1Z(MHO.A03(viewLifecycleOwner2, r422, this, (AnonymousClass4D7) null, 19), AnonymousClass07a.A00(viewLifecycleOwner2));
    }

    public C65204LpA(AnonymousClass4DH r2, C60253JiA jiA, UserSession userSession, C66576MXh mXh, KOG kog) {
        C51974G9v.A1P(r2, userSession, kog, jiA);
        0qQ.A0B(mXh, 5);
        this.A02 = r2;
        this.A04 = userSession;
        this.A06 = kog;
        this.A03 = jiA;
        this.A05 = mXh;
        this.A07 = 1Au.A00(userSession);
    }
}
