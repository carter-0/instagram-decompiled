package X;

import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.hardware.Camera;
import java.io.ByteArrayInputStream;
import java.nio.charset.Charset;
import java.util.concurrent.CountDownLatch;

/* renamed from: X.8tq  reason: invalid class name and case insensitive filesystem */
public final class C369098tq implements Camera.PictureCallback {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ Rect A02;
    public final /* synthetic */ AnonymousClass9RJ A03;
    public final /* synthetic */ C364018kj A04;
    public final /* synthetic */ C363988kg A05;
    public final /* synthetic */ C364158kx A06;

    public C369098tq(Rect rect, AnonymousClass9RJ r2, C364018kj r3, C363988kg r4, C364158kx r5, int i, int i2) {
        this.A03 = r2;
        this.A00 = i;
        this.A02 = rect;
        this.A05 = r4;
        this.A01 = i2;
        this.A04 = r3;
        this.A06 = r5;
    }

    public final void onPictureTaken(byte[] bArr, Camera camera) {
        Rect rect;
        int i;
        byte[] bArr2 = bArr;
        if (C344237rX.A00()) {
            bArr2 = C344237rX.A01();
        } else if (this.A03.A0S.get()) {
            return;
        }
        Rect rect2 = null;
        if (bArr2 != null) {
            int A002 = C364138kv.A00(bArr2);
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            0fP.A00(bArr2, 0, bArr2.length, options);
            rect2 = new Rect(0, 0, options.outWidth, options.outHeight);
            C364148kw.A00(rect2, this.A02, this.A00, A002);
            rect = rect2;
        } else {
            rect = new Rect();
        }
        Rect rect3 = this.A02;
        int i2 = this.A00;
        AnonymousClass9RJ r9 = this.A03;
        C364158kx r4 = new C364158kx(rect, rect3, i2, r9.A00);
        C364178kz r1 = C363858kS.A0d;
        C363988kg r14 = this.A05;
        r4.A01(r1, r14.A00(C363988kg.A09));
        r4.A01(C363858kS.A0X, bArr2);
        AnonymousClass9S5 r3 = r9.A0M;
        C364178kz r12 = C363858kS.A0e;
        if (r3.A0B) {
            i = r3.A09;
        } else {
            i = 0;
        }
        r4.A01(r12, Integer.valueOf(i));
        r4.A01(C363858kS.A0c, Integer.valueOf(this.A01));
        C363858kS r8 = new C363858kS(r4);
        C364018kj r122 = this.A04;
        r9.A0R.A05(new C369118ts(r122, r8), r9.A0Q.A03);
        C340167ko r13 = r9.A06;
        r13.getClass();
        if (!((Boolean) r13.AXG(C340167ko.A0D)).booleanValue() && bArr2 != null) {
            Charset charset = C369128tt.A04;
            C369128tt r7 = new C369128tt(new ByteArrayInputStream(bArr2));
            C364158kx r6 = this.A06;
            C364178kz r132 = C363858kS.A0T;
            Long l = null;
            double A012 = r7.A01("ExposureTime");
            if (A012 != -1.0d) {
                l = Long.valueOf((long) (A012 * Math.pow(10.0d, 9.0d)));
            }
            r6.A01(r132, l);
            C364178kz r2 = C363858kS.A0Z;
            Integer num = null;
            int A022 = r7.A02("PhotographicSensitivity", -1);
            if (A022 != -1) {
                num = Integer.valueOf(A022);
            }
            r6.A01(r2, num);
            C364178kz r5 = C363858kS.A0O;
            Float f = null;
            double A013 = r7.A01("ApertureValue");
            if (A013 != -1.0d) {
                f = Float.valueOf((float) A013);
            }
            r6.A01(r5, f);
            C364178kz r52 = C363858kS.A0V;
            Float f2 = null;
            double A014 = r7.A01("FocalLength");
            if (A014 != -1.0d) {
                f2 = Float.valueOf((float) A014);
            }
            r6.A01(r52, f2);
            C364178kz r22 = C363858kS.A0P;
            Integer num2 = null;
            int A023 = r7.A02("WhiteBalance", -1);
            if (A023 != -1) {
                num2 = Integer.valueOf(A023);
            }
            r6.A01(r22, num2);
        }
        AnonymousClass9RJ r0 = r9;
        r0.A0D(r9.A06, r122, r14, this.A06, r8);
        Object obj = r9.A0L.A00.get();
        obj.getClass();
        ((CountDownLatch) obj).countDown();
        if (rect2 != null) {
            C340577lU.A00(21, rect2.width() * rect2.height(), (Object) null);
        } else {
            C340577lU.A00(22, 0, new IllegalStateException("JPEG byte array was null."));
        }
    }
}
