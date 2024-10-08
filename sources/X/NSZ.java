package X;

import com.instagram.common.session.UserSession;

public final class NSZ extends 0ng {
    public final /* synthetic */ AnonymousClass5HJ A00;
    public final /* synthetic */ 0lg A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ 1XZ A03;
    public final /* synthetic */ 1XF A04;
    public final /* synthetic */ Runnable A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NSZ(AnonymousClass5HJ r4, 0lg r5, UserSession userSession, 1XZ r7, 1XF r8, Runnable runnable, String str, String str2) {
        super(166, 3, true, true);
        this.A03 = r7;
        this.A06 = str;
        this.A00 = r4;
        this.A02 = userSession;
        this.A07 = str2;
        this.A04 = r8;
        this.A01 = r5;
        this.A05 = runnable;
    }

    public final void run() {
        String str = this.A06;
        if (!str.equals("ig_watch_receipts")) {
            1XF r7 = this.A04;
            AnonymousClass5HJ r4 = this.A00;
            UserSession userSession = this.A02;
            String str2 = this.A07;
            r7.A06(r4, userSession, str2);
            AnonymousClass69E.A00(r4.A0j).Clr(r4.A0K.longValue(), "prepare_for_push_notification_end");
            1XZ.A00(r4, this.A01, this.A03, r7, this.A05, str, str2);
        }
    }
}
