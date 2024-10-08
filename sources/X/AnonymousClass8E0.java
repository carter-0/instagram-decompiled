package X;

import android.content.Context;
import android.widget.ImageView;
import com.instagram.android.R;

/* renamed from: X.8E0  reason: invalid class name */
public final class AnonymousClass8E0 extends C3497981v {
    public final ImageView A00;
    public final AnonymousClass8ZI A01;
    public final AnonymousClass6KL A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8E0(ImageView imageView) {
        super(imageView);
        0qQ.A0B(imageView, 1);
        this.A00 = imageView;
        Context context = imageView.getContext();
        int color = context.getColor(R.color.canvas_bottom_sheet_description_text_color);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.achievements_only_you_top_margin);
        AnonymousClass6KL A002 = AnonymousClass6KK.A00(0.6666667f, dimensionPixelSize, false);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.music_preview_button_sound_wave_bars_shadow_thickness);
        int color2 = context.getColor(R.color.black_6_transparent);
        int min = Math.min(dimensionPixelSize2, (A002.A07 - 1) / 2);
        A002.A03 = min;
        A002.A00 = A002.A06 + ((float) min);
        A002.A0B.setColor(color2);
        A002.invalidateSelf();
        this.A02 = A002;
        AnonymousClass8ZG r1 = new AnonymousClass8ZG(context);
        Integer valueOf = Integer.valueOf(color);
        r1.A06 = valueOf;
        r1.A0C = valueOf;
        r1.A00 = A002;
        r1.A01 = A002;
        r1.A02(dimensionPixelSize);
        r1.A01(color);
        AnonymousClass8ZI A003 = r1.A00();
        this.A01 = A003;
        EZd(A003);
    }
}
