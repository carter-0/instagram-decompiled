package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.Set;

/* renamed from: X.2kU  reason: invalid class name */
public final class AnonymousClass2kU implements AnonymousClass2bQ {
    public final /* synthetic */ AnonymousClass4DH A00;
    public final /* synthetic */ 2bK A01;
    public final /* synthetic */ WeakReference A02;
    public final /* synthetic */ Set A03;

    public AnonymousClass2kU(AnonymousClass4DH r1, 2bK r2, WeakReference weakReference, Set set) {
        this.A01 = r2;
        this.A03 = set;
        this.A00 = r1;
        this.A02 = weakReference;
    }

    public final void DOv(AnonymousClass4UE r8) {
        0qQ.A0B(r8, 0);
        2bK r4 = this.A01;
        AnonymousClass4UC r82 = (AnonymousClass4UC) r8;
        Set set = this.A03;
        AnonymousClass4DH r3 = this.A00;
        WeakReference weakReference = this.A02;
        if ((r3 != null || (weakReference != null && (r3 = (AnonymousClass4DH) weakReference.get()) != null)) && r82 != null) {
            2bL r5 = r4.A03;
            r5.A01(r82.A0D);
            2bK.A08 = set;
            2bK.A07 = new WeakReference(r3);
            if (0qQ.A0K(r82.A09.A00, "notification_permission_prompt")) {
                FragmentActivity A002 = C71172bH.A00();
                0qQ.A0C(A002, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                FragmentActivity fragmentActivity = A002;
                C71242bt r0 = 2bK.A06;
                if (r0 != null) {
                    r0.DbK(r82);
                }
                Ep7.A00(r4.A00, fragmentActivity, r3, r4.A01);
            } else {
                FAC fac = new FAC(r3, r4.A01);
                C71242bt r6 = 2bK.A06;
                Map A003 = FAC.A00(fac, r82.A0D, r82.A06.A00);
                AnonymousClass4DH r02 = fac.A00;
                if (r02 != null) {
                    UserSession userSession = fac.A01;
                    C229382nI A032 = C229382nI.A03(r02, userSession, (2el) null);
                    C360678ey A022 = C359988do.A02((AnonymousClass1O9) null, userSession, "com.bloks.www.qp.async.bloks_action", A003);
                    A022.A00(new C47557E7u(A032, r82, r6));
                    1ES.A05(A022, 2020389652, 1, true, true);
                }
            }
            2bK.A05 = r82;
            r5.A00(r82.A0D);
        }
    }
}
