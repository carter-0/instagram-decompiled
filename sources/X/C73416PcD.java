package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.direct.capabilities.Capabilities;
import com.instagram.direct.notifications.impl.DirectNotificationActionService;

/* renamed from: X.PcD  reason: case insensitive filesystem */
public final class C73416PcD implements Runnable {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ Capabilities A01;
    public final /* synthetic */ C254923tH A02;
    public final /* synthetic */ DirectNotificationActionService A03;
    public final /* synthetic */ C254743sy A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;

    public C73416PcD(UserSession userSession, Capabilities capabilities, C254923tH r3, DirectNotificationActionService directNotificationActionService, C254743sy r5, String str, String str2, String str3, String str4) {
        this.A03 = directNotificationActionService;
        this.A00 = userSession;
        this.A02 = r3;
        this.A01 = capabilities;
        this.A04 = r5;
        this.A07 = str;
        this.A06 = str2;
        this.A08 = str3;
        this.A05 = str4;
    }

    public final void run() {
        C333547Zj A002;
        DirectNotificationActionService directNotificationActionService = this.A03;
        UserSession userSession = this.A00;
        if (this.A02.A00()) {
            A002 = C67497Mor.A00(userSession);
        } else {
            A002 = C333527Zh.A00(userSession);
        }
        C333547Zj r9 = A002;
        1Xc A012 = 1Xc.A01();
        0qQ.A07(A012);
        0qQ.A0B(r9, 1);
        Context A052 = DbT.A05(directNotificationActionService);
        Capabilities capabilities = this.A01;
        C254743sy r11 = this.A04;
        String str = this.A07;
        String str2 = this.A06;
        String str3 = this.A08;
        if (str3 != null) {
            String str4 = this.A05;
            if (str4 != null) {
                AnonymousClass7TG.A1Q(capabilities, r11);
                if (str2 == null) {
                    0wb.A03("notification_action_inline_like_null_client_context", 002.A0L("message client context should not be null (is messageId null?: ", ')', DbW.A1a(str)));
                }
                r9.ELq(capabilities, r11, str, str2, "push_notif", "push_notification_action", (String) null);
                C59689JTv.A01(A052, (String) null, 2131973114, 1);
                C70122Nxc.A00(A052, userSession, A012, str3, str4);
                return;
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
        throw AnonymousClass7TE.A0z("Required value was null.");
    }
}
