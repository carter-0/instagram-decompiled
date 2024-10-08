package X;

import android.graphics.Rect;
import android.view.View;

/* renamed from: X.6SJ  reason: invalid class name */
public final class AnonymousClass6SJ implements Runnable {
    public final /* synthetic */ Rect A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ View A02;
    public final /* synthetic */ C255783ui A03;
    public final /* synthetic */ Integer A04;
    public final /* synthetic */ 0eP A05;

    public AnonymousClass6SJ(Rect rect, View view, View view2, C255783ui r4, Integer num, 0eP r6) {
        this.A01 = view;
        this.A05 = r6;
        this.A02 = view2;
        this.A00 = rect;
        this.A03 = r4;
        this.A04 = num;
    }

    public final void run() {
        View view = this.A01;
        int width = view.getWidth();
        int height = view.getHeight();
        if (width <= 0 || height <= 0) {
            throw new IllegalArgumentException(002.A02(width, height, "Invalid viewWidth ", " and/or viewHeight "));
        }
        0eP r1 = this.A05;
        int intValue = ((Number) r1.A00).intValue();
        int intValue2 = ((Number) r1.A01).intValue();
        View view2 = this.A02;
        Rect rect = this.A00;
        float f = (float) width;
        view2.setX((rect.exactCenterX() - (f / 2.0f)) + ((float) intValue));
        float f2 = (float) height;
        view2.setY((rect.exactCenterY() - (f2 / 2.0f)) + ((float) intValue2));
        view2.setRotation(this.A03.A01 * 360.0f);
        float width2 = ((float) rect.width()) / f;
        float height2 = ((float) rect.height()) / f2;
        switch (this.A04.intValue()) {
            case 0:
                width2 = Math.max(width2, height2);
                break;
            case 1:
                width2 = Math.min(width2, height2);
                break;
            case 2:
                break;
            case 3:
                width2 = height2;
                break;
        }
        height2 = width2;
        view2.setScaleX(width2);
        view2.setScaleY(height2);
    }
}
