package X;

import android.view.View;
import com.instagram.user.model.User;

/* renamed from: X.Ls0  reason: case insensitive filesystem */
public final class C65360Ls0 implements MVB {
    public final /* synthetic */ LON A00;
    public final /* synthetic */ User A01;
    public final /* synthetic */ boolean A02;

    public final void onDismiss() {
    }

    public final void onShow() {
    }

    public final /* synthetic */ void onTextClick(View view) {
    }

    public C65360Ls0(LON lon, User user, boolean z) {
        this.A00 = lon;
        this.A01 = user;
        this.A02 = z;
    }

    public final void onButtonClick(View view) {
        C66481MTj mTj = this.A00.A0B;
        if (mTj != null) {
            mTj.Dub(this.A01, this.A02);
        }
    }
}
