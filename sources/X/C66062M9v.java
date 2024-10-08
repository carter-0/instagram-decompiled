package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.M9v  reason: case insensitive filesystem */
public final class C66062M9v implements Runnable {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ FragmentActivity A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ C62032KWk A03;
    public final /* synthetic */ String A04;

    public C66062M9v(Context context, FragmentActivity fragmentActivity, UserSession userSession, C62032KWk kWk, String str) {
        this.A03 = kWk;
        this.A02 = userSession;
        this.A00 = context;
        this.A01 = fragmentActivity;
        this.A04 = str;
    }

    public final void run() {
        C62032KWk kWk = this.A03;
        C69589NoX noX = (C69589NoX) kWk.A08.getValue();
        if (!(noX instanceof NW5) || AnonymousClass7TE.A1a(((NW5) noX).A00)) {
            C69972NvC.A00(this.A01, this.A02, kWk, this.A04);
            return;
        }
        UserSession userSession = this.A02;
        Context context = this.A00;
        FragmentActivity fragmentActivity = this.A01;
        String str = this.A04;
        C51974G9v.A1O(userSession, context, fragmentActivity, str);
        LD7 ld7 = new LD7(context, userSession, new C65269LqO(fragmentActivity, userSession, kWk, str));
        OZ3.A00(userSession, "customer_details_tos_impression", kWk.A04, 0Yt.A0E());
        DbT.A1V(C63284KuT.A00(ld7.A00, ld7.A00()));
    }
}
