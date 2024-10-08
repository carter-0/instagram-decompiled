package X;

import com.instagram.user.follow.FollowButtonBase;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;

/* renamed from: X.Fnf  reason: case insensitive filesystem */
public final class C51049Fnf implements G8B {
    public final /* synthetic */ FollowButtonBase A00;
    public final /* synthetic */ C243853aD A01;
    public final /* synthetic */ FollowStatus A02;
    public final /* synthetic */ User A03;

    public final void CyN() {
    }

    public final void DED() {
    }

    public C51049Fnf(FollowButtonBase followButtonBase, C243853aD r2, FollowStatus followStatus, User user) {
        this.A01 = r2;
        this.A03 = user;
        this.A02 = followStatus;
        this.A00 = followButtonBase;
    }

    public final void D5S() {
        C243853aD r2 = this.A01;
        if (r2 != null) {
            r2.D2Y(this.A02, this.A03);
        }
    }

    public final void Doy() {
        C243853aD r2 = this.A01;
        if (r2 != null) {
            r2.DGR(EWA.UserActionUnblock, this.A03);
        }
    }

    public final void onCancel() {
        this.A00.setEnabled(true);
        C243853aD r1 = this.A01;
        if (r1 != null) {
            r1.DGO(this.A03);
        }
    }

    public final void onSuccess() {
        C243853aD r1 = this.A01;
        if (r1 != null) {
            r1.DGO(this.A03);
        }
    }
}
