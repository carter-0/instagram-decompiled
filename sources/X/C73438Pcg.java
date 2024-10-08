package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Callable;

/* renamed from: X.Pcg  reason: case insensitive filesystem */
public final class C73438Pcg implements Callable {
    public Object A00;
    public final int A01;
    public final Object A02;

    public C73438Pcg(int i, Object obj, Object obj2) {
        this.A01 = i;
        this.A02 = obj2;
        this.A00 = obj;
    }

    public final Object call() {
        switch (this.A01) {
            case 0:
                C67620Mqs mqs = (C67620Mqs) this.A02;
                C67623Mqv mqv = C67620Mqs.A04;
                mqs.A02.set(true);
                Object A03 = mqs.A03((Object[]) this.A00);
                C67620Mqs.A04.obtainMessage(1, new C67622Mqu(mqs, A03)).sendToTarget();
                return A03;
            case 1:
                AnonymousClass9H7 r3 = (AnonymousClass9H7) this.A02;
                Context context = r3.A02;
                if (context != null) {
                    return C63256Ku1.A00(DbT.A05(context), (Uri) this.A00, r3.A10);
                }
                0qQ.A0F("context");
                throw AnonymousClass00P.createAndThrow();
            default:
                C70696OGr oGr = (C70696OGr) this.A02;
                String A0Z = JTQ.A0Z();
                Bitmap decodeStream = BitmapFactory.decodeStream((InputStream) this.A00);
                int width = decodeStream.getWidth();
                int height = decodeStream.getHeight();
                int i = oGr.A00;
                if (width < i || height < i) {
                    throw new IOException("Image provided is too small", new IllegalArgumentException());
                }
                File A04 = 0mb.A04(oGr.A01);
                1MF.A0M(decodeStream, A04);
                decodeStream.recycle();
                String canonicalPath = A04.getCanonicalPath();
                0qQ.A07(canonicalPath);
                return C64134LPj.A00(oGr.A03, A0Z, canonicalPath);
        }
    }

    public C73438Pcg(C67620Mqs mqs) {
        this.A01 = 0;
        this.A02 = mqs;
    }
}
