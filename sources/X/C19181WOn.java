package X;

import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.WOn  reason: case insensitive filesystem */
public final class C19181WOn implements X6S {
    public final /* synthetic */ BaseFragmentActivity A00;
    public final /* synthetic */ C16678UzE A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ String A03;

    public C19181WOn(BaseFragmentActivity baseFragmentActivity, C16678UzE uzE, UserSession userSession, String str) {
        this.A02 = userSession;
        this.A03 = str;
        this.A01 = uzE;
        this.A00 = baseFragmentActivity;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [android.content.Context, com.instagram.base.activity.BaseFragmentActivity] */
    public final void Dv1() {
        C18707VyY.A00(this.A01, this.A02, this.A03);
        C59689JTv.A04(this.A00);
    }

    public final void E4Q(String str) {
        UserSession userSession = this.A02;
        WGU A002 = WGU.A00(userSession);
        String str2 = this.A03;
        A002.A0S(str2, this.A01.toString());
        VAB.A00(this.A00, userSession, str2);
    }
}
