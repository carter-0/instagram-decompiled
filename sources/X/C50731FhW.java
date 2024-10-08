package X;

import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.quickpromotion.intf.QuickPromotionSlot;

/* renamed from: X.FhW  reason: case insensitive filesystem */
public final class C50731FhW implements C230942qc {
    public final int A00;
    public final Object A01;

    public C50731FhW(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void Cyu(AnonymousClass4UE r9) {
        Fragment fragment;
        AnonymousClass2qU r2;
        QuickPromotionSlot quickPromotionSlot;
        C62320sa phe;
        UserSession A0N;
        int i = this.A00;
        AnonymousClass4UE r5 = r9;
        0qQ.A0B(r9, 0);
        switch (i) {
            case 0:
                fragment = (NJY) this.A01;
                r2 = fragment.A11;
                quickPromotionSlot = QuickPromotionSlot.A0N;
                phe = new C73665Phe(20, fragment, r9);
                A0N = fragment.A0N();
                break;
            case 1:
                C66633Ma2 ma2 = (C66633Ma2) this.A01;
                r2 = (AnonymousClass2qU) ma2.A2T.getValue();
                quickPromotionSlot = QuickPromotionSlot.A0J;
                phe = new C73916Plr(2, r9, ma2);
                A0N = ma2.A0p();
                fragment = ma2.A1J;
                break;
            default:
                fragment = (C47525E6l) this.A01;
                r2 = (AnonymousClass2qU) fragment.A03.getValue();
                quickPromotionSlot = QuickPromotionSlot.A0T;
                phe = new MJ7(13, r9, fragment);
                A0N = AnonymousClass7TE.A0l(fragment.A0C);
                break;
        }
        r2.A00(fragment.requireActivity(), A0N, r5, quickPromotionSlot, phe);
    }
}
