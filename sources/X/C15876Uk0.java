package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import java.nio.Buffer;
import java.util.List;

/* renamed from: X.Uk0  reason: case insensitive filesystem */
public final class C15876Uk0 extends 0ng {
    public final /* synthetic */ W2i A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ List A02;
    public final /* synthetic */ List A03;
    public final /* synthetic */ List A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15876Uk0(W2i w2i, String str, List list, List list2, List list3) {
        super(964449470, 3, false, false);
        this.A00 = w2i;
        this.A03 = list;
        this.A04 = list2;
        this.A02 = list3;
        this.A01 = str;
    }

    public final void run() {
        View view;
        float A012;
        W2i w2i = this.A00;
        List<Bitmap> list = w2i.A0E;
        List list2 = this.A03;
        List list3 = this.A04;
        List list4 = this.A02;
        synchronized (list) {
            w2i.A05 = false;
            view = w2i.A07;
            view.post(new C19982Wit(w2i));
            for (Bitmap recycle : list) {
                recycle.recycle();
            }
            list.clear();
            int size = list2.size();
            for (int i = 0; i < size; i++) {
                int A0I = C51971G9r.A0I(list3, i);
                int A0I2 = C51971G9r.A0I(list4, i);
                Bitmap.Config config = Bitmap.Config.ARGB_8888;
                Bitmap createBitmap = Bitmap.createBitmap(A0I, A0I2, config);
                0qQ.A07(createBitmap);
                createBitmap.setHasAlpha(true);
                createBitmap.copyPixelsFromBuffer((Buffer) list2.get(i));
                float width = (float) createBitmap.getWidth();
                float f = 256.0f / width;
                float height = (float) createBitmap.getHeight();
                float f2 = 256.0f / height;
                int floor = (int) Math.floor((double) (width * f));
                int floor2 = (int) Math.floor((double) (f * height));
                if (floor > 256 || floor2 > 256) {
                    floor = (int) Math.floor((double) (width * f2));
                    floor2 = (int) Math.floor((double) (height * f2));
                }
                Bitmap A002 = 0fO.A00(createBitmap, floor, floor2, true);
                Bitmap createBitmap2 = Bitmap.createBitmap(256, 256, config);
                0qQ.A07(createBitmap2);
                Canvas canvas = new Canvas(createBitmap2);
                Paint paint = new Paint();
                C13988Tno.A0p(0, paint);
                canvas.drawRect(0.0f, 0.0f, (float) canvas.getWidth(), (float) canvas.getHeight(), paint);
                float f3 = ((float) floor) / ((float) floor2);
                float f4 = 256.0f / 256.0f;
                float f5 = 0.0f;
                if (f3 >= f4) {
                    A012 = 0.0f;
                } else {
                    A012 = C13988Tno.A01(256 - floor);
                }
                if (f3 >= f4) {
                    f5 = C13988Tno.A01(256 - floor2);
                }
                canvas.drawBitmap(A002, A012, f5, (Paint) null);
                list.add(createBitmap2);
            }
        }
        view.post(new C20184Wmi(w2i, this.A01));
        view.post(new C19983Wiu(w2i));
    }
}
