package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.2sS  reason: invalid class name and case insensitive filesystem */
public final class C231822sS implements AnonymousClass2sT {
    public static LQT A05;
    public static String A06;
    public static final Set A07 = new HashSet();
    public static final Set A08 = new HashSet();
    public final Context A00;
    public final Fragment A01;
    public final UserSession A02;
    public final AnonymousClass4DU A03;
    public final Integer A04;

    public C231822sS(Context context, Fragment fragment, UserSession userSession, AnonymousClass4DU r5, Integer num) {
        0qQ.A0B(userSession, 2);
        this.A00 = context;
        this.A02 = userSession;
        this.A01 = fragment;
        this.A03 = r5;
        this.A04 = num;
    }

    public final void A01(AnonymousClass3Q2 r11) {
        AnonymousClass3Q2 r8 = r11;
        0qQ.A0B(r11, 0);
        if (r11.A5P || r11.A0v()) {
            AnonymousClass3QD r0 = r11.A6J;
            AnonymousClass3QD r1 = AnonymousClass3QD.CONFIGURED;
            if (r0 == r1 && r11.A1f != r1) {
                Set set = A08;
                if (!set.contains(r11.A35)) {
                    A00();
                    C65367Ls8 ls8 = new C65367Ls8(this.A00, this.A02, this, r8, this.A04);
                    r11.A0Y(ls8);
                    LQT lqt = new LQT((C66536MVq) ls8);
                    A05 = lqt;
                    1xC.A01.A00(new AnonymousClass3GT(lqt));
                    set.add(r11.A35);
                    A06 = r11.A35;
                }
            }
            AnonymousClass1Nd.A00(this.A02).A01(new AY8(this), C2370936h.class);
        }
    }

    public final void DaJ(AnonymousClass3Q2 r2) {
        0qQ.A0B(r2, 0);
        A01(r2);
    }

    public static final void A00() {
        LQT lqt = A05;
        if (lqt != null) {
            1xC.A01.A00(new AnonymousClass3GU(lqt));
        }
    }
}
