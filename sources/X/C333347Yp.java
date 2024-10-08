package X;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.7Yp  reason: invalid class name and case insensitive filesystem */
public final class C333347Yp extends C331647Ru {
    public final UserSession A00;
    public final C317986oA A01;
    public final C333357Yq A02;
    public final C333337Yo A03;
    public final C62320sa A04;
    public final C62320sa A05;

    public final void A05(View view) {
        AnonymousClass7SD r3 = (AnonymousClass7SD) this.A05.invoke();
        0eE r0 = AnonymousClass0t1.A01;
        UserSession userSession = this.A00;
        if (r0.A01(userSession).CQp(this.A01) && C71041OaE.A03(userSession, r3)) {
            0xa r8 = this.A02.A01;
            if (r8.getLong("creator_ai_autoreply_nux_count", 0) < 3) {
                0xY AR4 = r8.AR4();
                AR4.E5c("creator_ai_autoreply_nux_count", r8.getLong("creator_ai_autoreply_nux_count", 0) + 1);
                AR4.apply();
                C333337Yo r2 = this.A03;
                String string = ((Context) this.A04.invoke()).getString(2131956947);
                0qQ.A07(string);
                C333247Yf r5 = r2.A00;
                AnonymousClass9H7 r4 = r5.A07.A00;
                r4.A1I.A00(C331637Rt.class, new C73943PmN(string, r4, 37));
                AnonymousClass7UW r02 = r5.A05.A0C;
                C330447Mu r1 = r02.A00;
                if (r1 != null) {
                    FragmentActivity requireActivity = r02.A03.requireActivity();
                    TextView textView = r1.A0E;
                    if (textView != null) {
                        textView.postDelayed(new C41220AqI(requireActivity, textView, r1, string), 500);
                    }
                }
            }
        }
    }

    public final boolean A08() {
        return 182.A06(0Tu.A05, this.A00, 36323736718814652L);
    }

    public C333347Yp(UserSession userSession, C333337Yo r3, C331627Rs r4, C62320sa r5, C62320sa r6) {
        super(r4);
        this.A00 = userSession;
        this.A04 = r5;
        this.A03 = r3;
        this.A05 = r6;
        this.A02 = new C333357Yq(userSession);
        this.A01 = new C317986oA(userSession);
    }
}
