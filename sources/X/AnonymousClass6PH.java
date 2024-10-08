package X;

import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgFrameLayout;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;

/* renamed from: X.6PH  reason: invalid class name */
public final class AnonymousClass6PH {
    public final ViewGroup A00;
    public final IgFrameLayout A01;
    public final C252063oV A02;
    public final C252063oV A03;
    public final C252063oV A04;
    public final C252063oV A05;
    public final C252063oV A06;
    public final C252063oV A07;
    public final C252063oV A08;
    public final C252063oV A09;
    public final MediaFrameLayout A0A;

    public AnonymousClass6PH(ViewGroup viewGroup, IgFrameLayout igFrameLayout, C252063oV r5, C252063oV r6, MediaFrameLayout mediaFrameLayout) {
        0qQ.A0B(mediaFrameLayout, 2);
        0qQ.A0B(igFrameLayout, 5);
        this.A00 = viewGroup;
        this.A0A = mediaFrameLayout;
        this.A06 = r5;
        this.A04 = r6;
        this.A01 = igFrameLayout;
        this.A03 = 2b1.A01(igFrameLayout.requireViewById(R.id.caption_text_view_stub), false, false);
        this.A02 = 2b1.A01(igFrameLayout.requireViewById(R.id.auto_translated_label_view_stub), false, false);
        this.A05 = 2b1.A01(igFrameLayout.requireViewById(R.id.headline_text_view_stub), false, false);
        this.A07 = 2b1.A01(igFrameLayout.requireViewById(R.id.product_sticker_view_stub), false, false);
        this.A08 = 2b1.A01(igFrameLayout.requireViewById(R.id.smart_caption_text_view_stub), false, false);
        this.A09 = 2b1.A01(igFrameLayout.requireViewById(R.id.systematic_caption_text_view_stub), false, false);
    }
}
