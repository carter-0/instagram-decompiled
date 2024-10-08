package X;

import android.content.Context;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.quickpromotion.intf.QuickPromotionSlot;
import com.instagram.quickpromotion.intf.Trigger;
import java.util.Set;

/* renamed from: X.FhY  reason: case insensitive filesystem */
public final class C50733FhY implements AnonymousClass2qY {
    public final int A00;
    public final Object A01;

    public C50733FhY(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void DLW(Context context, AnonymousClass4UE r7, 2bv r8, String str) {
        AnonymousClass4DH r1;
        Context context2;
        switch (this.A00) {
            case 0:
                AnonymousClass7TG.A1N(r8, r7);
                AnonymousClass2bO.A00();
                r1 = (AnonymousClass4DH) this.A01;
                break;
            case 1:
                AnonymousClass7TG.A1T(r8, r7, context);
                AnonymousClass2bO.A00();
                C66633Ma2 ma2 = (C66633Ma2) this.A01;
                Ep6.A00(context, ma2.A1J, r7, r8);
                AnonymousClass2bO.A00();
                UserSession A0p = ma2.A0p();
                QuickPromotionSlot quickPromotionSlot = QuickPromotionSlot.A0J;
                0qQ.A0B(A0p, 1);
                F7D.A01(context, A0p, r7, quickPromotionSlot, Integer.valueOf(R.id.layout_container_right));
                return;
            case 2:
                AnonymousClass7TG.A1N(r8, r7);
                AnonymousClass2bO.A00();
                r1 = (AnonymousClass4DH) this.A01;
                break;
            case 3:
                AnonymousClass7TG.A1N(r8, r7);
                AnonymousClass2bO.A00();
                r1 = (AnonymousClass4DH) this.A01;
                break;
            case 4:
                AnonymousClass7TG.A1O(r7, context);
                AnonymousClass7TF.A0D().postDelayed(new C51487Fuv(context, r7, (C59844JaK) this.A01), 1000);
                return;
            case 5:
                AnonymousClass7TG.A1N(r8, r7);
                r1 = (AnonymousClass4DH) this.A01;
                context2 = r1.getContext();
                if (context2 != null) {
                    AnonymousClass2bO.A00();
                    break;
                } else {
                    return;
                }
            default:
                boolean A1Z = AnonymousClass7TG.A1Z(r8, r7);
                Set CA0 = r7.CA0();
                if (CA0 != null && CA0.contains(Trigger.A1R) == A1Z) {
                    C64710Lgj lgj = (C64710Lgj) this.A01;
                    AnonymousClass4DH r3 = lgj.A0A;
                    1OC A012 = LTC.A01(lgj.A0D);
                    A012.A00 = new KAR(8, r8, r7, lgj);
                    r3.schedule(A012);
                    return;
                }
                return;
        }
        context2 = r1.requireContext();
        Ep6.A00(context2, r1, r7, r8);
    }
}
