package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.3qK  reason: invalid class name and case insensitive filesystem */
public final class C253173qK implements C253183qL {
    public static final C253173qK A00 = new Object();

    public final /* bridge */ /* synthetic */ boolean Ete(Object obj, Object obj2, Object obj3, Object obj4) {
        0qQ.A0B(obj, 0);
        0qQ.A0B(obj2, 1);
        return !obj.equals(obj2);
    }

    public final /* bridge */ /* synthetic */ Object ADM(Context context, Object obj, Object obj2, Object obj3) {
        C246153e7 r5;
        View view = (View) obj;
        C376549Ik r15 = (C376549Ik) obj2;
        0qQ.A0B(context, 0);
        0qQ.A0B(view, 1);
        0qQ.A0B(r15, 2);
        1Xj r8 = (1Xj) r15.A03;
        UserSession userSession = (UserSession) r15.A06;
        C238833Dp r2 = (C238833Dp) r15.A02;
        AnonymousClass4DU r9 = (AnonymousClass4DU) r15.A01;
        Object obj4 = r15.A05;
        Integer num = (Integer) r15.A04;
        boolean z = r15.A08;
        boolean z2 = r15.A07;
        r2.A04(view);
        view.hashCode();
        if (obj4 != null) {
            r2.A08(view, new C238873Dt(num, obj4, (String) null, (String) null));
        }
        String str = null;
        if (z) {
            AnonymousClass3W1 r1 = new AnonymousClass3W1(r8.A0o(), r8.A4o());
            if (r8.A4e() && num != null) {
                r1.A0B(num.intValue() + 1);
            }
            AnonymousClass4HH r6 = new AnonymousClass4HH(context, r1, userSession, r8);
            if (z2) {
                str = "in_app_browser_v2";
            }
            r5 = new C246153e7(r6, userSession, r8, r9, str, 0sl.A00);
        } else {
            r5 = new C246153e7((AnonymousClass4HI) null, userSession, r8, r9);
        }
        r2.A0A(view, r5);
        return C60340gF.A00;
    }

    public final /* bridge */ /* synthetic */ void FIN(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
        View view = (View) obj;
        C376549Ik r4 = (C376549Ik) obj2;
        0qQ.A0B(view, 1);
        0qQ.A0B(r4, 2);
        view.hashCode();
        ((C238833Dp) r4.A02).A04(view);
    }

    public final /* synthetic */ Class CAe() {
        return getClass();
    }

    public final /* synthetic */ String getDescription() {
        return AnonymousClass3XB.A00(getClass());
    }
}
