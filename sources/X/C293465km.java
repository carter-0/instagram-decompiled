package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.notifications.push.intf.PushChannelType;
import com.instagram.common.session.UserSession;

/* renamed from: X.5km  reason: invalid class name and case insensitive filesystem */
public final class C293465km extends 1P0 {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ 1Av A02;
    public final /* synthetic */ C239413Gj A03;

    public C293465km(FragmentActivity fragmentActivity, UserSession userSession, 1Av r3, C239413Gj r4) {
        this.A03 = r4;
        this.A02 = r3;
        this.A01 = userSession;
        this.A00 = fragmentActivity;
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        Drawable drawable;
        int A032 = AnonymousClass0fD.A03(1783889551);
        C293445kk r12 = (C293445kk) obj;
        int A033 = AnonymousClass0fD.A03(752859067);
        0qQ.A0B(r12, 0);
        C293465km.super.onSuccess(r12);
        C239413Gj r7 = this.A03;
        r7.A04 = true;
        Integer num = r12.A00;
        if (num != null) {
            1Av r4 = this.A02;
            UserSession userSession = this.A01;
            FragmentActivity fragmentActivity = this.A00;
            int intValue = num.intValue();
            long currentTimeMillis = System.currentTimeMillis();
            0xY AR4 = r4.A01.AR4();
            AR4.E5c("ig_live_good_time_for_live_network_call_timestamp", currentTimeMillis);
            AR4.apply();
            OIS A002 = OU0.A00(userSession.A06);
            A002.A0G = "ig_live_good_time_for_live_notification_type";
            A002.A00 = 182.A01(0Tu.A05, userSession, 36600796468613107L) * 1000;
            A002.A0H = fragmentActivity.getString(2131963904);
            A002.A0E = fragmentActivity.getString(2131963903, new Object[]{Integer.valueOf(intValue)});
            Context context = r7.A00;
            if (context != null) {
                drawable = AnonymousClass2dd.A00(context.getResources(), R.drawable.live_pano_notif);
            } else {
                drawable = null;
            }
            A002.A01 = drawable;
            A002.A03 = PushChannelType.LOCAL;
            A002.A08 = new C50499Fcl(userSession, fragmentActivity);
            A002.A09 = new C50509Fcv(userSession);
            2MD.A01().A09(new OU0(A002));
        }
        AnonymousClass0fD.A0A(-1997234486, A033);
        AnonymousClass0fD.A0A(787634693, A032);
    }
}
