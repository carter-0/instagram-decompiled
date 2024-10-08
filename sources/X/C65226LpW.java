package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.api.schemas.ClipsTextAlignment;
import com.instagram.api.schemas.ClipsTextEmphasisMode;
import com.instagram.api.schemas.ClipsTextFormatType;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.LpW  reason: case insensitive filesystem */
public final class C65226LpW implements MVS {
    public JRL A00;
    public KHY A01;
    public final AnonymousClass4DH A02;
    public final C53024GhF A03;
    public final UserSession A04;
    public final C61843KOh A05;
    public final C62674Kka A06 = C62674Kka.A0K;
    public final AnonymousClass80P A07 = AnonymousClass80P.SPINS_ON;

    public final /* synthetic */ void ADm() {
    }

    public final void CsQ() {
        AnonymousClass4DH r0 = this.A02;
        07U r3 = 07U.A05;
        AnonymousClass07Z viewLifecycleOwner = r0.getViewLifecycleOwner();
        AnonymousClass7TE.A1Z(new C66171MGi(viewLifecycleOwner, r3, this, (AnonymousClass4D7) null, 1), AnonymousClass07a.A00(viewLifecycleOwner));
    }

    public static 27r A00(C65226LpW lpW) {
        UserSession userSession = lpW.A04;
        return (27r) ((C56516Hzn) userSession.A01(C56516Hzn.class, new C58712IwL(userSession, 27))).A02.getValue();
    }

    public static final void A01(C65226LpW lpW) {
        C358248ab A0H = Dba.A0H(lpW.A02);
        JRL jrl = lpW.A00;
        if (jrl != null) {
            A0H.A09(jrl.ByD());
            JRL jrl2 = lpW.A00;
            if (jrl2 != null) {
                A0H.A08(jrl2.ByC());
                Dba.A1L(A0H);
                return;
            }
        }
        0qQ.A0F("spinsTextProvider");
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A02(C65226LpW lpW, boolean z) {
        List<AnonymousClass5JJ> list;
        List<AnonymousClass5JJ> list2;
        Object obj;
        C248883ik r1;
        C65226LpW lpW2 = lpW;
        C61843KOh kOh = lpW2.A05;
        C381879cj r4 = (C381879cj) ((GSY) lpW2.A03.A00.getValue()).A01;
        FragmentActivity requireActivity = lpW2.A02.requireActivity();
        if (!z || r4 == null) {
            AnonymousClass3Q2 r0 = kOh.A00;
            if (r0 != null && (list = r0.A4o) != null) {
                for (AnonymousClass5JJ r12 : list) {
                    r12.A0O = false;
                }
                C61843KOh.A00(kOh, (List) null);
                return;
            }
            return;
        }
        AnonymousClass3Q2 r02 = kOh.A00;
        if (!(r02 == null || (list2 = r02.A4o) == null)) {
            for (AnonymousClass5JJ r13 : list2) {
                r13.A0O = false;
            }
            Iterator it = list2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                C248883ik r5 = ((AnonymousClass5JJ) obj).A02;
                if (r5 != null && 0qQ.A0K(r5.A0F, r4.getText()) && r5.A02 == r4.BCs() && r5.A08 == r4.CGW() && r5.A05 == r4.Bog() && r5.A03 == r4.BXs() && r5.A04 == r4.BXu()) {
                    break;
                }
            }
            AnonymousClass5JJ r03 = (AnonymousClass5JJ) obj;
            if (!(r03 == null || (r1 = r03.A02) == null)) {
                List<C248643iK> list3 = r1.A0G;
                0qQ.A0B(list3, 0);
                ArrayList<C248643iK> A0p = AnonymousClass7TF.A0p(list3);
                for (C248643iK F1o : list3) {
                    A0p.add(F1o.F1o());
                }
                ClipsTextAlignment clipsTextAlignment = r1.A0B;
                Float valueOf = Float.valueOf(r1.A00);
                Float valueOf2 = Float.valueOf(r1.A01);
                Float valueOf3 = Float.valueOf(r1.A02);
                Boolean valueOf4 = Boolean.valueOf(AnonymousClass7TF.A1P(r1.A09));
                Float valueOf5 = Float.valueOf(r1.A03);
                Float valueOf6 = Float.valueOf(r1.A04);
                Float valueOf7 = Float.valueOf(r1.A05);
                Float valueOf8 = Float.valueOf(r1.A06);
                Float valueOf9 = Float.valueOf(r1.A07);
                String str = r1.A0F;
                ClipsTextEmphasisMode clipsTextEmphasisMode = r1.A0C;
                ClipsTextFormatType clipsTextFormatType = r1.A0D;
                Float valueOf10 = Float.valueOf(r1.A08);
                Integer valueOf11 = Integer.valueOf(r1.A0A);
                ArrayList A0p2 = AnonymousClass7TF.A0p(A0p);
                for (C248643iK F1o2 : A0p) {
                    A0p2.add(F1o2.F1o());
                }
                BEE bee = new BEE(clipsTextAlignment, clipsTextEmphasisMode, clipsTextFormatType, valueOf4, (Boolean) null, valueOf, valueOf2, valueOf3, valueOf5, valueOf6, valueOf7, valueOf8, valueOf9, valueOf10, valueOf11, str, A0p2);
                r03.A0O = true;
                C61843KOh.A00(kOh, AnonymousClass7TE.A1I(bee));
            }
        }
        AnonymousClass3Q2 r3 = kOh.A00;
        if (r3 != null) {
            C64838Lj0 lj0 = kOh.A02;
            Context context = kOh.A01;
            1Eo.A05(DbX.A0c(AnonymousClass12T.A00), new C59819JZr(r3, context, lj0, (AnonymousClass4D7) null, 19), AnonymousClass07a.A00(requireActivity));
        }
    }

    public final View ANH() {
        this.A00 = C63504KyF.A00(this.A04);
        AnonymousClass4DH r6 = this.A02;
        Context requireContext = r6.requireContext();
        JRL jrl = this.A00;
        String str = "spinsTextProvider";
        if (jrl != null) {
            int BtH = jrl.BtH();
            KHY A012 = C64004LIk.A01(requireContext, (Boolean) null, r6.getString(jrl.BtG()), Integer.valueOf(R.drawable.instagram_reshare_pano_filled_24), BtH);
            this.A01 = A012;
            C66296MMf A002 = C66296MMf.A00(this, 18);
            str = "spinsOption";
            A012.setOnToggleListener(new C65370LsB(4, A002, this));
            LYG.A02(A012, 56, this, A002);
            KHY khy = this.A01;
            if (khy != null) {
                return khy;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final C62674Kka B1s() {
        return this.A06;
    }

    public final AnonymousClass80P BHl() {
        return this.A07;
    }

    public C65226LpW(AnonymousClass4DH r2, C53024GhF ghF, UserSession userSession, C61843KOh kOh) {
        C51974G9v.A1P(r2, userSession, kOh, ghF);
        this.A02 = r2;
        this.A04 = userSession;
        this.A05 = kOh;
        this.A03 = ghF;
    }
}
