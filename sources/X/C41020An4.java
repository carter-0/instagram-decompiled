package X;

import android.content.res.Resources;
import android.view.View;
import com.instagram.android.R;

/* renamed from: X.An4  reason: case insensitive filesystem */
public final class C41020An4 implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ AnonymousClass87B A01;

    public C41020An4(View view, AnonymousClass87B r2) {
        this.A01 = r2;
        this.A00 = view;
    }

    public final void run() {
        Resources resources = this.A01.A06.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.audio_page_audio_filter_tooltip_vertical_offset);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.action_bar_plus_shadow_height);
        0nA.A0X(this.A00, (resources.getDimensionPixelSize(R.dimen.album_music_sticker_circular_album_art_size) - dimensionPixelSize) + dimensionPixelSize2);
    }
}
