package X;

import com.instagram.video.live.mvvm.view.likes.customviews.ProfilePictureLikesView;

/* renamed from: X.M9j  reason: case insensitive filesystem */
public final class C66050M9j implements Runnable {
    public final /* synthetic */ AnonymousClass3LX A00;
    public final /* synthetic */ ProfilePictureLikesView A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ boolean A03;

    public C66050M9j(AnonymousClass3LX r1, ProfilePictureLikesView profilePictureLikesView, String str, boolean z) {
        this.A01 = profilePictureLikesView;
        this.A03 = z;
        this.A00 = r1;
        this.A02 = str;
    }

    public final void run() {
        ProfilePictureLikesView profilePictureLikesView = this.A01;
        if (profilePictureLikesView.A01) {
            ProfilePictureLikesView.A02(this.A00.A01, profilePictureLikesView, this.A02, this.A03);
            profilePictureLikesView.postInvalidateOnAnimation();
        }
    }
}
