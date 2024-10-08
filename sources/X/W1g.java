package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Looper;

public final class W1g {
    public static boolean A0C = true;
    public static Bitmap.Config A0D = Bitmap.Config.ARGB_8888;
    public static BitmapFactory.Options A0E;
    public static final Bitmap A0F = Bitmap.createBitmap(1, 1, Bitmap.Config.ALPHA_8);
    public static final C18636VvY A0G = new C18636VvY(20);
    public static final C18636VvY A0H = new C18636VvY(32);
    public int A00 = -1;
    public int A01 = -1;
    public int A02 = -1;
    public int A03 = -1;
    public int A04 = -1;
    public Bitmap A05;
    public W1g A06 = null;
    public W1g A07 = null;
    public BitmapFactory.Options A08;
    public final W1g[] A09 = new W1g[4];
    public final C20368Wq8 A0A = new UHC(this);
    public volatile int A0B = 0;

    public static W1g A00(byte[] bArr, int i) {
        Bitmap bitmap;
        W1g w1g = new W1g(-1, -1);
        if (A0C) {
            BitmapFactory.Options options = w1g.A08;
            if (options.inBitmap == null) {
                options.inBitmap = (Bitmap) A0H.A00();
            }
        }
        try {
            BitmapFactory.Options options2 = w1g.A08;
            bitmap = 0fP.A00(bArr, 0, i, options2);
            w1g.A05 = bitmap;
            if (A0C) {
                options2.inBitmap = null;
            }
        } catch (IllegalArgumentException e) {
            1yR.A08.A04(e);
            A0C = false;
            BitmapFactory.Options options3 = w1g.A08;
            options3.inBitmap.recycle();
            options3.inBitmap = null;
            A0H.A01();
            bitmap = 0fP.A00(bArr, 0, i, options3);
            w1g.A05 = bitmap;
        }
        if (bitmap == null) {
            w1g.A03();
            return null;
        }
        w1g.A01 = bitmap.getWidth();
        w1g.A00 = w1g.A05.getHeight();
        return w1g;
    }

    public static synchronized void A01(W1g w1g) {
        synchronized (w1g) {
            Bitmap bitmap = w1g.A05;
            if (!(bitmap == null || bitmap == A0F)) {
                if (bitmap.getConfig() == Bitmap.Config.ARGB_8888) {
                    A0G.A02(w1g.A05);
                } else if (A0C) {
                    A0H.A02(w1g.A05);
                } else {
                    w1g.A05.recycle();
                }
            }
            w1g.A05 = null;
        }
    }

    public final synchronized Bitmap A02() {
        return this.A05;
    }

    public final void A03() {
        this.A01 = -1;
        this.A00 = -1;
        for (int i = 0; i < 4; i++) {
            this.A09[i] = null;
        }
        A01(this);
        this.A0B = 0;
        this.A06 = null;
        this.A07 = null;
        this.A02 = -1;
        this.A03 = -1;
        this.A04 = -1;
    }

    public final synchronized String toString() {
        StringBuilder sb;
        String str;
        sb = new StringBuilder();
        sb.append(C51968G9o.A16(this));
        sb.append(" {x=");
        sb.append(this.A02);
        sb.append(", y=");
        sb.append(this.A03);
        sb.append(", zoom=");
        sb.append(this.A04);
        sb.append(", status=");
        sb.append(this.A0B);
        sb.append("}");
        if (this.A05 == null) {
            str = "x";
        } else {
            str = "o";
        }
        return AnonymousClass7TF.A0l(str, sb);
    }

    public W1g(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
        if (!A0C) {
            BitmapFactory.Options options = A0E;
            if (options == null) {
                options = new BitmapFactory.Options();
                A0E = options;
                options.inPreferredConfig = Bitmap.Config.RGB_565;
            }
            this.A08 = options;
            return;
        }
        BitmapFactory.Options options2 = new BitmapFactory.Options();
        this.A08 = options2;
        options2.inSampleSize = 1;
        options2.inPreferredConfig = A0D;
        options2.inMutable = true;
    }

    public final void A04() {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            this.A0B = 0;
            if (this.A06 == null && this.A07 == null) {
                A03();
                return;
            }
            return;
        }
        C18796W2e.A01.post(this.A0A);
    }
}
