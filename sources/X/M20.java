package X;

import com.instagram.android.R;
import com.instagram.common.notifications.push.intf.PushChannelType;

public final class M20 implements Runnable {
    public final /* synthetic */ C15322UaU A00;

    public M20(C15322UaU uaU) {
        this.A00 = uaU;
    }

    public final void run() {
        2MD A01 = 2MD.A01();
        C15322UaU uaU = this.A00;
        OIS A002 = OU0.A00(DbU.A0u(uaU.A0N));
        A002.A0G = "promote_special_requirement_audience_update_notification";
        A002.A0H = uaU.getString(2131970758);
        A002.A0I = true;
        A002.A03 = PushChannelType.LOCAL;
        A002.A01 = AnonymousClass2dd.A00(DbV.A05(uaU), R.drawable.instagram_business_images_users_circle_filled);
        JTT.A1O(A002, A01);
    }
}
