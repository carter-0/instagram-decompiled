package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;

/* renamed from: X.Oix  reason: case insensitive filesystem */
public final class C71347Oix implements View.OnClickListener {
    public final /* synthetic */ C69460Nm4 A00;
    public final /* synthetic */ C3261175l A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;

    public C71347Oix(C69460Nm4 nm4, C3261175l r2, String str, String str2) {
        this.A01 = r2;
        this.A03 = str;
        this.A02 = str2;
        this.A00 = nm4;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(1703578637);
        C3261175l r1 = this.A01;
        String str = this.A03;
        String str2 = this.A02;
        C3261175l.A00(this.A00, r1, str, str2);
        OZW ozw = OZW.A00;
        FragmentActivity fragmentActivity = r1.A01;
        DbS.A1X(fragmentActivity);
        ozw.A02(fragmentActivity, r1.A02, r1.A03, "com.bloks.www.services.ig.appointment.customer", str, str2, (String) null, "direct_thread_navbar_button", (String) null);
        AnonymousClass0fD.A0C(-77231503, A05);
    }
}
