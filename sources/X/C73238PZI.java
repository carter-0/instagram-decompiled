package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.PZI  reason: case insensitive filesystem */
public final class C73238PZI implements Runnable {
    public final /* synthetic */ C72215Oyg A00;
    public final /* synthetic */ String A01;

    public C73238PZI(C72215Oyg oyg, String str) {
        this.A00 = oyg;
        this.A01 = str;
    }

    public final void run() {
        String str;
        String str2;
        C72215Oyg oyg = this.A00;
        AnonymousClass5HJ A002 = C72215Oyg.A00(oyg, this.A01);
        if (A002 != null) {
            String str3 = A002.A0j;
            String str4 = A002.A0r;
            String str5 = A002.A1I;
            UserSession userSession = oyg.A04;
            List A03 = 0Gl.A03(userSession);
            String str6 = A002.A12;
            if (A03.isEmpty()) {
                if (str5 == null) {
                    0wb.A03("StellaMessageNotificationHandler", "Null title on direct message notification");
                    return;
                }
            } else if (C51966G9m.A1W(userSession, str3) && (str2 = A002.A1I) != null && 00l.A08(str2, "] ", 0, false) != -1) {
                str5 = C66580MXl.A0z(str2, 00l.A08(str2, "] ", 0, false) + 2);
            } else {
                return;
            }
            OZC ozc = OZC.A01;
            Context context = oyg.A01;
            String str7 = A002.A1G;
            if (str7 == null) {
                str7 = A002.A1F;
            }
            String str8 = A002.A1E;
            ImageUrl imageUrl = A002.A0D;
            if (imageUrl != null) {
                str = imageUrl.getUrl();
            } else {
                str = null;
            }
            ozc.A01(context, oyg.A02, (C254703su) null, str3, str5, str4, str4, str7, str8, (String) null, (String) null, (String) null, str6, (String) null, str, (ArrayList) null, (ArrayList) null, false);
        }
    }
}
