package X;

import android.app.Activity;
import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.7ON  reason: invalid class name */
public abstract class AnonymousClass7ON {
    public static final AnonymousClass37D A00(Activity activity) {
        0qQ.A0B(activity, 1);
        AnonymousClass37D A01 = AnonymousClass37D.A00.A01(activity);
        if (A01 != null) {
            return A01;
        }
        0wj.A01.AEf("null bottomsheet navigator from activity", 20132006);
        return null;
    }

    public static final AnonymousClass37D A01(Context context, UserSession userSession) {
        Activity activity;
        0qQ.A0B(userSession, 0);
        0qQ.A0B(context, 1);
        if ((context instanceof Activity) && (activity = (Activity) context) != null) {
            return A00(activity);
        }
        0wj r2 = 0wj.A01;
        r2.AEf("context is not activity", 20132006);
        AnonymousClass37D A02 = AnonymousClass37D.A00.A02(context);
        if (A02 != null) {
            return A02;
        }
        r2.AEf("null bottomsheet navigator from context", 20132006);
        return null;
    }

    public static final void A02(AnonymousClass4DH r8, B2B b2b) {
        AnonymousClass37D A01;
        C74332Pt8 pt8;
        0qQ.A0B(b2b, 0);
        OIA AcR = b2b.AcR();
        Activity activity = AcR.A00;
        UserSession userSession = AcR.A02;
        if (activity != null) {
            A01 = A00(activity);
        } else {
            A01 = A01(AcR.A01, userSession);
        }
        if (A01 == null) {
            return;
        }
        if (r8 != null || (r8 = b2b.AM6(A01)) != null) {
            if (AcR.A0B) {
                AcR.A05.A1A();
            }
            if (AcR.A0A) {
                AcR.A05.A19();
            }
            AnonymousClass7L0 r1 = AcR.A04;
            if (!(r1 == null || !(r8 instanceof C74332Pt8) || (pt8 = (C74332Pt8) r8) == null)) {
                pt8.ADi(r1);
            }
            if (182.A06(0Tu.A05, userSession, 36325901381743968L)) {
                ((AnonymousClass37F) A01).A0W = true;
            }
            AnonymousClass7I2 r5 = AcR.A06;
            boolean z = AcR.A09;
            String str = AcR.A08;
            C331697Sa r2 = AcR.A03;
            AnonymousClass9MI r12 = new AnonymousClass9MI(30, (Object) b2b, (Object) r8, (Object) A01);
            0qQ.A0B(r5, 2);
            0qQ.A0B(r2, 5);
            if (!z || !0qQ.A0K(str, "follow_button")) {
                r12.invoke();
                return;
            }
            r2.A02();
            ((AnonymousClass37F) A01).A0H = new C72963PQv(r8, r2, r5, A01);
            A01.A0B();
        }
    }
}
