package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import java.nio.Buffer;
import java.util.List;

/* renamed from: X.Uk1  reason: case insensitive filesystem */
public final class C15877Uk1 extends 0ng {
    public final /* synthetic */ C3503684j A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ List A02;
    public final /* synthetic */ List A03;
    public final /* synthetic */ List A04;

    public final void run() {
        float f;
        C3503684j r7 = this.A00;
        List<Bitmap> list = r7.A0J;
        synchronized (list) {
            int i = 0;
            r7.A07 = false;
            if (r7.A03 != null) {
                r7.A0A.post(new C20007WjS(this));
            }
            for (Bitmap recycle : list) {
                recycle.recycle();
            }
            list.clear();
            while (true) {
                List list2 = this.A03;
                if (i < list2.size()) {
                    int intValue = ((Integer) this.A04.get(i)).intValue();
                    int intValue2 = ((Integer) this.A02.get(i)).intValue();
                    Bitmap.Config config = Bitmap.Config.ARGB_8888;
                    Bitmap createBitmap = Bitmap.createBitmap(intValue, intValue2, config);
                    createBitmap.setHasAlpha(true);
                    createBitmap.copyPixelsFromBuffer((Buffer) list2.get(i));
                    float width = (float) createBitmap.getWidth();
                    float f2 = 256.0f / width;
                    float height = (float) createBitmap.getHeight();
                    float f3 = 256.0f / height;
                    int floor = (int) Math.floor((double) (width * f2));
                    int floor2 = (int) Math.floor((double) (f2 * height));
                    if (floor > 256 || floor2 > 256) {
                        floor = (int) Math.floor((double) (width * f3));
                        floor2 = (int) Math.floor((double) (height * f3));
                    }
                    Bitmap A002 = 0fO.A00(createBitmap, floor, floor2, true);
                    Bitmap createBitmap2 = Bitmap.createBitmap(256, 256, config);
                    Canvas canvas = new Canvas(createBitmap2);
                    Paint paint = new Paint();
                    C13988Tno.A0p(0, paint);
                    Canvas canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, (float) canvas.getWidth(), (float) canvas.getHeight(), paint);
                    float f4 = ((float) floor) / ((float) floor2);
                    float f5 = 256.0f / 256.0f;
                    float f6 = 0.0f;
                    if (f4 >= f5) {
                        f = 0.0f;
                    } else {
                        f = ((float) (256 - floor)) / 2.0f;
                    }
                    if (f4 >= f5) {
                        f6 = ((float) (256 - floor2)) / 2.0f;
                    }
                    canvas.drawBitmap(A002, f, f6, (Paint) null);
                    list.add(createBitmap2);
                    i++;
                }
            }
        }
        View view = r7.A0A;
        view.post(new C20201Wmz(this, this.A01));
        view.post(new C20008WjT(this));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15877Uk1(C3503684j r2, String str, List list, List list2, List list3) {
        super(964449470);
        this.A00 = r2;
        this.A03 = list;
        this.A04 = list2;
        this.A02 = list3;
        this.A01 = str;
    }
}
