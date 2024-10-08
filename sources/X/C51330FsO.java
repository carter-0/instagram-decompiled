package X;

import androidx.viewpager2.widget.ViewPager2;
import com.instagram.avatar.ui.UpdateProfilePicturePagerAdapter$UpdateProfileTabType;

/* renamed from: X.FsO  reason: case insensitive filesystem */
public final class C51330FsO implements Runnable {
    public final /* synthetic */ C46655Dia A00;
    public final /* synthetic */ UpdateProfilePicturePagerAdapter$UpdateProfileTabType A01;

    public C51330FsO(C46655Dia dia, UpdateProfilePicturePagerAdapter$UpdateProfileTabType updateProfilePicturePagerAdapter$UpdateProfileTabType) {
        this.A00 = dia;
        this.A01 = updateProfilePicturePagerAdapter$UpdateProfileTabType;
    }

    public final void run() {
        ViewPager2 viewPager2 = this.A00.A01;
        if (viewPager2 == null) {
            0qQ.A0F("viewPager");
            throw AnonymousClass00P.createAndThrow();
        } else {
            viewPager2.A03(this.A01.A00, true);
        }
    }
}
