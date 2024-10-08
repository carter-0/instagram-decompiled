package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import com.instagram.wellbeing.fundraiser.model.ExistingStandaloneFundraiserForFeedModel;
import java.util.HashSet;
import java.util.LinkedHashSet;

/* renamed from: X.LpD  reason: case insensitive filesystem */
public final class C65207LpD implements MVS {
    public final KOX A00;
    public final C61837KOb A01;
    public final C61841KOf A02;
    public final C64159LRa A03;
    public final C62674Kka A04 = C62674Kka.A02;
    public final AnonymousClass80P A05 = AnonymousClass80P.ADD_FUNDRAISER;
    public final AnonymousClass4DH A06;
    public final UserSession A07;

    public final /* synthetic */ void ADm() {
    }

    public final View ANH() {
        View inflate = DbV.A0E(this.A06).inflate(R.layout.composer_fundraiser_row, (ViewGroup) null);
        0qQ.A0C(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) inflate;
        DbY.A0z(viewGroup);
        C64159LRa lRa = this.A03;
        if (AnonymousClass6SR.A01().A0A != null) {
            C61841KOf kOf = lRa.A0C;
            ExistingStandaloneFundraiserForFeedModel existingStandaloneFundraiserForFeedModel = AnonymousClass6SR.A01().A0A;
            0qQ.A0B(existingStandaloneFundraiserForFeedModel, 0);
            kOf.A04 = existingStandaloneFundraiserForFeedModel;
            AnonymousClass6SR.A01().A0A = null;
        }
        User A0j = DbT.A0j(lRa.A0B);
        C61841KOf kOf2 = lRa.A0C;
        kOf2.A01 = A0j.A03.Bya();
        C253353qe AYk = A0j.A03.AYk();
        kOf2.A00 = AYk;
        HashSet A1F = AnonymousClass7TE.A1F();
        if (AYk != null) {
            for (C46322DUz Amv : AYk.B8h()) {
                String Amv2 = Amv.Amv();
                if (Amv2 != null) {
                    A1F.add(Amv2);
                }
            }
        }
        kOf2.A06 = A1F;
        FragmentActivity requireActivity = lRa.A0A.requireActivity();
        lRa.A03 = viewGroup;
        lRa.A02 = viewGroup.requireViewById(R.id.suggestion_pills_scroll_view);
        lRa.A04 = DbU.A0C(lRa.A03, R.id.suggestion_pills_view_group);
        lRa.A00 = lRa.A03.requireViewById(R.id.create_fundraiser_label);
        lRa.A01 = lRa.A03.requireViewById(R.id.create_fundraiser_upsell_label);
        lRa.A05 = new C64125LOw(requireActivity, lRa.A00);
        lRa.A02();
        lRa.A03();
        return viewGroup;
    }

    public final C62674Kka B1s() {
        return this.A04;
    }

    public final AnonymousClass80P BHl() {
        return this.A05;
    }

    public final void CsQ() {
        C64159LRa lRa = this.A03;
        String str = this.A02.A05;
        LinkedHashSet linkedHashSet = lRa.A0C.A07;
        LinkedHashSet linkedHashSet2 = new LinkedHashSet(linkedHashSet);
        linkedHashSet.clear();
        linkedHashSet.addAll(C63213KtK.A00(str));
        if (!linkedHashSet2.equals(linkedHashSet)) {
            lRa.A03();
        }
        AnonymousClass4DH r5 = this.A06;
        07U r3 = 07U.A04;
        AnonymousClass07Z viewLifecycleOwner = r5.getViewLifecycleOwner();
        AnonymousClass0xx A002 = AnonymousClass07a.A00(viewLifecycleOwner);
        MHO A032 = MHO.A03(viewLifecycleOwner, r3, this, (AnonymousClass4D7) null, 26);
        19B r4 = 19B.A00;
        1Eo.A05(r4, A032, A002);
        07U r32 = 07U.A05;
        AnonymousClass07Z viewLifecycleOwner2 = r5.getViewLifecycleOwner();
        AnonymousClass07Z A0I = JTP.A0I(r5, r4, MHO.A03(viewLifecycleOwner2, r32, this, (AnonymousClass4D7) null, 27), AnonymousClass07a.A00(viewLifecycleOwner2));
        AnonymousClass07Z A0I2 = JTP.A0I(r5, r4, MHO.A03(A0I, r32, this, (AnonymousClass4D7) null, 28), AnonymousClass07a.A00(A0I));
        JTP.A0I(r5, r4, MHO.A03(A0I2, r32, this, (AnonymousClass4D7) null, 29), AnonymousClass07a.A00(A0I2)).getLifecycle().A09(new C64306LZg(this, 2));
    }

    public C65207LpD(AnonymousClass4DH r2, UserSession userSession, KOX kox, C61837KOb kOb, C61841KOf kOf) {
        AnonymousClass7TG.A1U(userSession, r2, kOf);
        0qQ.A0B(kOb, 5);
        this.A07 = userSession;
        this.A06 = r2;
        this.A02 = kOf;
        this.A00 = kox;
        this.A01 = kOb;
        this.A03 = new C64159LRa(r2, userSession, kOf);
    }
}
