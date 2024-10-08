package X;

import android.graphics.Bitmap;
import com.instagram.video.live.mvvm.view.likes.customviews.ProfilePictureLikesView;

/* renamed from: X.Lf6  reason: case insensitive filesystem */
public final class C64619Lf6 implements AnonymousClass1MK {
    public final /* synthetic */ L5L A00;
    public final /* synthetic */ ProfilePictureLikesView A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ boolean A03;

    public final void CyF(C226952iF r6, AnonymousClass3LX r7) {
        0qQ.A0B(r7, 1);
        ProfilePictureLikesView profilePictureLikesView = this.A01;
        if (profilePictureLikesView.A01) {
            int i = this.A00.A00;
            for (int i2 = 0; i2 < i; i2 = 1) {
                profilePictureLikesView.postDelayed(new C66050M9j(r7, profilePictureLikesView, this.A02, this.A03), 0);
            }
        }
    }

    public final void DK4(C226952iF r1, int i) {
    }

    public C64619Lf6(L5L l5l, ProfilePictureLikesView profilePictureLikesView, String str, boolean z) {
        this.A01 = profilePictureLikesView;
        this.A03 = z;
        this.A02 = str;
        this.A00 = l5l;
    }

    public final void DJx(C226952iF r5, C254673sr r6) {
        ProfilePictureLikesView profilePictureLikesView = this.A01;
        if (profilePictureLikesView.A01) {
            ProfilePictureLikesView.A02((Bitmap) null, profilePictureLikesView, this.A02, this.A03);
            profilePictureLikesView.postInvalidateOnAnimation();
        }
    }
}
