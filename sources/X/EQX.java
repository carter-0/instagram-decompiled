package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;

public final class EQX extends H4J {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ AnonymousClass0iw A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ String A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EQX(Activity activity, 0hq r2, AnonymousClass0iw r3, UserSession userSession, String str) {
        super(r2);
        this.A00 = activity;
        this.A02 = userSession;
        this.A01 = r3;
        this.A03 = str;
    }

    public final void onFail(C268654dm r10) {
        int A032 = AnonymousClass0fD.A03(-1336804254);
        C59689JTv.A0D(this.A00, "copy_live_item_failed");
        C22031Xty.A0H(this.A01, this.A02, this.A03, "live_action_sheet", "copy_link", r10.A01());
        AnonymousClass0fD.A0A(-954114573, A032);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A032 = AnonymousClass0fD.A03(248457953);
        int A033 = AnonymousClass0fD.A03(-793522808);
        String str = ((DvH) obj).A00;
        Activity activity = this.A00;
        0nC.A00(activity, str);
        C59689JTv.A07(activity, 2131965058);
        C22031Xty.A0I(this.A01, this.A02, this.A03, "live_action_sheet", "copy_link", str);
        AnonymousClass0fD.A0A(-352991660, A033);
        AnonymousClass0fD.A0A(362323121, A032);
    }
}
