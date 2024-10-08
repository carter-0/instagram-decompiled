package X;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.quicklog.reliability.CancelReason;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.8hL  reason: invalid class name and case insensitive filesystem */
public final class C362098hL implements 1DN {
    public C339797kB A00;
    public boolean A01;
    public boolean A02;
    public final Activity A03;
    public final AnonymousClass8HT A04;
    public final C362048hG A05;
    public final View.OnClickListener A06 = new C362108hM(this);
    public final ViewGroup A07;
    public final UserSession A08;

    public C362098hL(Activity activity, ViewGroup viewGroup, UserSession userSession, AnonymousClass8HT r5, C362048hG r6) {
        0qQ.A0B(viewGroup, 3);
        this.A03 = activity;
        this.A04 = r5;
        this.A07 = viewGroup;
        this.A05 = r6;
        this.A08 = userSession;
    }

    public final void DWm(Map map) {
        C362048hG r0;
        0qQ.A0B(map, 0);
        boolean z = false;
        this.A02 = false;
        C346927vz A002 = C2604245p.A00(map);
        if (A002 == C346927vz.DENIED_DONT_ASK_AGAIN) {
            z = true;
        }
        this.A01 = z;
        if (A002 == C346927vz.GRANTED || C2604245p.A03(this.A03)) {
            this.A04.A00();
            C339797kB r02 = this.A00;
            if (r02 != null) {
                r02.A00();
            }
            this.A00 = null;
            r0 = this.A05;
            r0.A0U();
        } else {
            r0 = this.A05;
            r0.A0a();
        }
        r0.A0Z();
    }

    public final void A00(String str) {
        int i;
        this.A05.A0Z();
        if (this.A00 == null) {
            AnonymousClass8HT r0 = this.A04;
            r0.A03.A06(CancelReason.SYSTEM_CANCELLED, "gallery permissions denied", 518928411, r0.A01);
            ViewGroup viewGroup = this.A07;
            C339797kB r2 = new C339797kB(viewGroup, R.layout.permission_empty_state_view);
            Activity activity = this.A03;
            Context applicationContext = activity.getApplicationContext();
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 33) {
                i = 2131962962;
            } else {
                i = 2131962970;
                if (i2 >= 30) {
                    i = 2131962936;
                }
            }
            String string = applicationContext.getString(i);
            0qQ.A0A(string);
            String string2 = applicationContext.getString(2131962971, new Object[]{string});
            0qQ.A07(string2);
            r2.A05(string2);
            r2.A04(activity.getString(2131962973));
            r2.A02(2131962972);
            r2.A01();
            r2.A03(this.A06);
            this.A00 = r2;
            if (str != null) {
                1Jk.A08.A0L(String.valueOf(viewGroup.hashCode()), "gallery permissions denied", str);
            }
        }
    }
}
