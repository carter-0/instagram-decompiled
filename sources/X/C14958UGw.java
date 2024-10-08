package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import com.instagram.android.R;

/* renamed from: X.UGw  reason: case insensitive filesystem */
public final class C14958UGw extends C14633Tzf {
    public final WZ2 A00;
    public final C52794Gcl A01;
    public final int A02;
    public final Rect A03 = new Rect();

    public final void A0D(Canvas canvas) {
        C14723U4m u4m = this.A07.A0I;
        int width = u4m.getWidth();
        int height = u4m.getHeight();
        C52794Gcl gcl = this.A01;
        int intrinsicWidth = gcl.getIntrinsicWidth();
        int intrinsicHeight = gcl.getIntrinsicHeight();
        Rect rect = this.A03;
        rect.set(0, 0, intrinsicWidth, intrinsicHeight);
        int i = this.A02;
        rect.offsetTo((width - i) - intrinsicWidth, (height - i) - intrinsicHeight);
        gcl.setBounds(rect);
        gcl.draw(canvas);
    }

    public C14958UGw(WFU wfu, WZ2 wz2, int i) {
        super(wfu);
        Context context = wfu.A0G;
        this.A01 = new C52794Gcl(context, context.getDrawable(R.drawable.location_outline));
        this.A02 = i;
        this.A02 = 3.0f;
        this.A03 = 5;
        this.A00 = wz2;
    }
}
