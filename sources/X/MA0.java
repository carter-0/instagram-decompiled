package X;

import android.graphics.Bitmap;
import java.util.Arrays;

public final class MA0 implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ Bitmap A02;
    public final /* synthetic */ C3516889w A03;
    public final /* synthetic */ String A04;

    public MA0(Bitmap bitmap, C3516889w r2, String str, int i, int i2) {
        this.A02 = bitmap;
        this.A00 = i;
        this.A04 = str;
        this.A03 = r2;
        this.A01 = i2;
    }

    public final void run() {
        int i;
        Bitmap[] A012;
        Bitmap bitmap = this.A02;
        int i2 = this.A00;
        String str = this.A04;
        C3516889w r1 = this.A03;
        int i3 = this.A01;
        if (r1.A00 == i3) {
            AnonymousClass2Fj r12 = r1.A06;
            C60999Juv juv = (C60999Juv) r12.A02();
            if (juv == null || (A012 = juv.A01()) == null) {
                i = 0;
            } else {
                i = A012.length;
            }
            if (i2 >= i) {
                String format = String.format("Invalid index for bitmaps. Length = %d, index = %d, Session ID = %d, Playback Surface: %s", Arrays.copyOf(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str}, 4));
                0qQ.A07(format);
                0wb.A03("BitmapTimelineHelper", format);
                return;
            }
            C60999Juv juv2 = (C60999Juv) r12.A02();
            if (juv2 != null) {
                juv2.A00(i2, bitmap);
                r12.A0A(juv2);
            }
        }
    }
}
