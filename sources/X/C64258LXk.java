package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.Calendar;
import java.util.Date;

/* renamed from: X.LXk  reason: case insensitive filesystem */
public final class C64258LXk implements View.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ FragmentActivity A01;
    public final /* synthetic */ LPH A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ 1Xj A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ boolean A06;

    public C64258LXk(FragmentActivity fragmentActivity, LPH lph, UserSession userSession, 1Xj r4, String str, int i, boolean z) {
        this.A01 = fragmentActivity;
        this.A03 = userSession;
        this.A06 = z;
        this.A00 = i;
        this.A04 = r4;
        this.A05 = str;
        this.A02 = lph;
    }

    public final void onClick(View view) {
        int A052 = AnonymousClass0fD.A05(-50269314);
        FragmentActivity fragmentActivity = this.A01;
        UserSession userSession = this.A03;
        boolean z = this.A06;
        int i = this.A00;
        1Xj r6 = this.A04;
        String str = this.A05;
        LPH lph = this.A02;
        0qQ.A0C(fragmentActivity, C66579MXk.A00(1));
        0rm A11 = C51965G9l.A11();
        int i2 = 2131956672;
        if (z) {
            i2 = 2131956673;
        }
        LPH lph2 = lph;
        A11.A00 = new OVW(fragmentActivity, userSession, new C65130Lns(fragmentActivity, lph2, userSession, r6, str, A11, i, z), AnonymousClass7TE.A16(fragmentActivity, i2), fragmentActivity.getString(2131956670), false, true, false, false);
        Date date = new Date(((long) i) * 1000);
        Calendar instance = Calendar.getInstance();
        instance.add(12, (5 - (instance.get(12) % 5)) + 20);
        Calendar instance2 = Calendar.getInstance();
        instance2.setTime(date);
        instance2.add(5, 7);
        OVW ovw = (OVW) A11.A00;
        if (ovw != null) {
            OVW ovw2 = ovw;
            ovw2.A01(false, (String) null, date, instance.getTime(), instance2.getTime(), true);
        }
        lph.A06(AnonymousClass05K.A0C);
        AnonymousClass0fD.A0C(-735889453, A052);
    }
}
