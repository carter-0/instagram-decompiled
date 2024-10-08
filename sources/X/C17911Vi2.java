package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.Vi2  reason: case insensitive filesystem */
public final class C17911Vi2 {
    public View A00;
    public final FragmentActivity A01;
    public final UserSession A02;
    public final W26 A03;
    public final String A04;
    public final String A05;
    public final Context A06;

    public final void A00(2da r4) {
        AnonymousClass3JR r2 = new AnonymousClass3JR();
        r2.A06 = R.drawable.instagram_save_pano_outline_24;
        r2.A05 = 2131976896;
        r2.A0G = new WBC(this, 49);
        View A0P = C51970G9q.A0P(r2, r4);
        0nA.A0b(A0P, AnonymousClass7TH.A01(this.A06));
        this.A00 = A0P;
    }

    public C17911Vi2(Context context, FragmentActivity fragmentActivity, UserSession userSession, W26 w26, String str, String str2) {
        AnonymousClass7TG.A1P(userSession, str);
        0qQ.A0B(str2, 5);
        this.A02 = userSession;
        this.A01 = fragmentActivity;
        this.A04 = str;
        this.A06 = context;
        this.A05 = str2;
        this.A03 = w26;
    }
}
