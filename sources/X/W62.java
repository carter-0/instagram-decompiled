package X;

import android.media.MediaPlayer;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;

public final class W62 implements MediaPlayer.OnCompletionListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ U4E A01;

    public W62(U4E u4e, int i) {
        this.A01 = u4e;
        this.A00 = i;
    }

    public final void onCompletion(MediaPlayer mediaPlayer) {
        VN0 vn0 = this.A01.A02;
        int i = this.A00;
        C15330Uaf uaf = vn0.A00;
        if (uaf.A05) {
            int i2 = uaf.A00 - 1;
            if (i < i2) {
                ReboundViewPager reboundViewPager = uaf.A03;
                if (reboundViewPager != null) {
                    reboundViewPager.A0B(1.0f);
                    return;
                }
            } else {
                uaf.A05 = false;
                ReboundViewPager reboundViewPager2 = uaf.A03;
                if (reboundViewPager2 != null) {
                    reboundViewPager2.A0C(1.0f, i2);
                    return;
                }
            }
            0qQ.A0F("viewPager");
            throw AnonymousClass00P.createAndThrow();
        }
    }
}
