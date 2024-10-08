package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.LinkedHashMap;
import java.util.concurrent.TimeUnit;

/* renamed from: X.IOo  reason: case insensitive filesystem */
public final class C57100IOo implements 0lm {
    public 1OC A00;
    public final Context A01;
    public final UserSession A02;
    public final 1Cn A03;

    public final void A00(String str) {
        if (this.A00 == null) {
            LinkedHashMap A07 = 0Yt.A07(new 0eP[]{AnonymousClass7TE.A1L("pagination_source", "text_post_feed_threads")});
            String str2 = str;
            if (str != null) {
                A07.put(AnonymousClass000.A00(3352), str2);
            }
            UserSession userSession = this.A02;
            String str3 = userSession.A06;
            1FS r7 = new 1FS((1FR) null, (C62500to) null, 1FI.A06, new 1FQ(AnonymousClass05K.A00, (Long) null, (String) null, TimeUnit.HOURS.toMillis(12)), (Long) null, str3, (String) null, (String) null, (String) null, AnonymousClass7TG.A0j(), (String) null, 0Yt.A0E(), A07, 1FS.A0G.incrementAndGet(), false, false);
            1NY A0a = AnonymousClass7TG.A0a(userSession);
            A0a.A0A("feed/text_post_app_timeline/");
            A0a.A0P(C8749R7n.A04);
            A0a.A0F("X-IG-App-ID", "871865944585275");
            1Fl.A01(this.A01, A0a, userSession, r7, this.A03);
            1OC A0M = A0a.A0M();
            this.A00 = A0M;
            synchronized (C56490HzM.A03) {
                C56490HzM.A02 = true;
                C56490HzM.A01 = null;
            }
            H50.A00(A0M, this, 0);
            1ES.A05(A0M, 1285440136, 1, true, true);
        }
    }

    public final void onUserSessionWillEnd(boolean z) {
        1OC r1 = this.A00;
        if (r1 != null) {
            r1.A02 = true;
            r1.A00 = null;
            this.A00 = null;
        }
    }

    public C57100IOo(UserSession userSession, Context context) {
        this.A02 = userSession;
        this.A01 = context;
        this.A03 = new 1Cn(DbT.A05(context));
    }
}
