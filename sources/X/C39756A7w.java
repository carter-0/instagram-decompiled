package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.A7w  reason: case insensitive filesystem */
public final class C39756A7w {
    public final Context A00;
    public final View A01;
    public final FragmentActivity A02;
    public final UserSession A03;
    public final C388799oP A04;
    public final String A05;
    public final String A06;
    public final String A07;

    public C39756A7w(Context context, View view, FragmentActivity fragmentActivity, UserSession userSession, String str, String str2, String str3) {
        0qQ.A0B(view, 4);
        this.A00 = context;
        this.A02 = fragmentActivity;
        this.A03 = userSession;
        this.A01 = view;
        this.A06 = str;
        this.A07 = str2;
        this.A05 = str3;
        C388799oP r0 = new C388799oP(fragmentActivity, context, view, userSession);
        this.A04 = r0;
        r0.A04();
    }
}
