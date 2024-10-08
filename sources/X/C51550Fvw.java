package X;

import android.graphics.RectF;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.model.reels.ReelViewerConfig;
import java.util.Collections;
import java.util.List;

/* renamed from: X.Fvw  reason: case insensitive filesystem */
public final class C51550Fvw implements Runnable {
    public final /* synthetic */ RectF A00;
    public final /* synthetic */ AnonymousClass0iw A01;
    public final /* synthetic */ C330367Mm A02;
    public final /* synthetic */ Reel A03;
    public final /* synthetic */ AnonymousClass3BQ A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ List A08;

    public C51550Fvw(RectF rectF, AnonymousClass0iw r2, C330367Mm r3, Reel reel, AnonymousClass3BQ r5, String str, String str2, String str3, List list) {
        this.A02 = r3;
        this.A03 = reel;
        this.A07 = str;
        this.A00 = rectF;
        this.A06 = str2;
        this.A05 = str3;
        this.A01 = r2;
        this.A08 = list;
        this.A04 = r5;
    }

    public final void run() {
        UserSession userSession;
        boolean z;
        C330367Mm r7 = this.A02;
        Reel reel = this.A03;
        String str = this.A07;
        RectF rectF = this.A00;
        String str2 = this.A06;
        String str3 = this.A05;
        AnonymousClass0iw r13 = this.A01;
        List list = this.A08;
        AnonymousClass3BQ r15 = this.A04;
        if (r7.A07.isResumed()) {
            if (list.isEmpty()) {
                list = AnonymousClass7TE.A1I(reel);
            }
            int i = 0;
            while (true) {
                userSession = r7.A06;
                if (i >= reel.A0O(userSession).size()) {
                    z = false;
                    i = 0;
                    break;
                }
                1Xj r9 = ((C255773uh) reel.A0O(userSession).get(i)).A0b;
                if (r9 == null) {
                    0wb.A03("launchResharedReelFromDirect", "Media inside reel is null");
                } else if (0qQ.A0K(r9.getId(), str) || 0qQ.A0K(r9.A2n(), str)) {
                    z = true;
                }
                i++;
            }
            z = true;
            AnonymousClass3K2 A072 = 1OP.A07(r7.A04, userSession);
            ReelViewerConfig reelViewerConfig = r7.A00;
            if (reelViewerConfig != null) {
                A072.A0G = reelViewerConfig;
            }
            if (r7.A01 == null) {
                0qQ.A0B(userSession, 0);
                r7.A01 = new C315656kI(userSession);
            }
            if (!z) {
                1Zp A012 = 1Zm.A00(userSession).A01(AnonymousClass05K.A00, AnonymousClass05K.A0F, false);
                String id = reel.getId();
                0qQ.A07(id);
                A012.A03("reel_id", id);
                A012.A03("media_id", str);
                A012.A00();
            }
            A072.A0V((RectF) null, rectF, r13, reel, r15, new FkV(rectF, r7, reel, r15, A072, str2, str3, list, i), (String) null, (List) null, Collections.emptySet(), 0.0f, i, false);
        }
    }
}
