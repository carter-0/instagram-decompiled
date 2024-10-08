package X;

import android.os.Handler;
import com.instagram.base.activity.BaseFragmentActivity;

/* renamed from: X.Eba  reason: case insensitive filesystem */
public final class C48255Eba {
    public Handler A00;
    public BaseFragmentActivity A01;
    public 0lg A02;
    public String A03;
    public String A04;

    /* JADX WARNING: type inference failed for: r1v3, types: [X.07Z, android.content.Context, com.instagram.base.activity.BaseFragmentActivity] */
    public final void A00() {
        0lg r2 = this.A02;
        String str = this.A04;
        String str2 = this.A03;
        1NY A0L = DbZ.A0L(r2);
        A0L.A0K("accounts/confirm_email/%s/%s/", new Object[]{str, str2});
        1OC A0L2 = DbW.A0L(A0L, C47355Dvp.class, F84.class, true);
        A0L2.A00 = new EBU(this);
        ? r1 = this.A01;
        1ES.A00(r1, AnonymousClass07i.A00(r1), A0L2);
    }
}
