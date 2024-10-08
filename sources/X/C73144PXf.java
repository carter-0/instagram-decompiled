package X;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.PXf  reason: case insensitive filesystem */
public final class C73144PXf implements Runnable {
    public final /* synthetic */ AnonymousClass9EF A00;

    public C73144PXf(AnonymousClass9EF r1) {
        this.A00 = r1;
    }

    public final void run() {
        AnonymousClass9EF r5 = this.A00;
        if (r5.A02 != null && AnonymousClass9EF.A00(r5)) {
            Context context = r5.A04;
            String string = context.getResources().getString(2131973135);
            UserSession userSession = r5.A05;
            String str = userSession.A06;
            AnonymousClass5HJ r13 = new AnonymousClass5HJ(new AnonymousClass5ER(0, 0), (ImageUrl) null, false, (Boolean) null, true, (String) null, string, "webview", GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT, "session_level_survey", "session_level_survey", str, (String) null, (String) null, (String) null, (String) null);
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.addCategory(Pxd.A00(6));
            String str2 = r5.A02;
            if (str2 != null) {
                intent.setData(0cp.A03(str2));
                0Sy A0K = C66582MXn.A0K(context, intent);
                ArrayList A0v = DbS.A0v(4);
                List asList = Arrays.asList(new String[]{"https"});
                if (!asList.isEmpty()) {
                    A0v.add(new C7900QcS(asList));
                    A0v.add(new NEY(Arrays.asList(new String[]{"/survey/"})));
                    AnonymousClass0cm A002 = C9571RdB.A00(A0v);
                    A0K.A01 = A0K.A01 | 1 | 4;
                    A0K.A07(A002);
                    A0K.A08 = new 1Q7("IgSecurePendingIntent").A00;
                    PendingIntent A01 = A0K.A01(context, 19602, SN3.MAX_SIGNED_POWER_OF_TWO);
                    String str3 = r13.A0X;
                    0qQ.A07(str3);
                    0qQ.A0B(str, 0);
                    AnonymousClass9T8 A04 = C71141Odp.A04(context, r13, userSession, "session_level_survey", 002.A0T(str, str3, '_'));
                    A04.A0C = A01;
                    Notification A03 = A04.A03();
                    ArrayList A15 = DbV.A15(A03);
                    A15.add("session_level_survey");
                    1Xz.A00().A02(new C370438wT(A03, r13, A15), userSession, (Runnable) null, "session_level_survey_notification", 0);
                    1Av A003 = 1Au.A00(userSession);
                    long currentTimeMillis = System.currentTimeMillis();
                    0xY A0p = AnonymousClass7TE.A0p(A003);
                    A0p.E5c("last_session_survey_notification_seen_timestamp_ms", currentTimeMillis);
                    A0p.apply();
                    r5.A03 = true;
                    return;
                }
                throw AnonymousClass7TE.A0w(Pxd.A00(444));
            }
            throw AnonymousClass7TE.A0y();
        }
    }
}
