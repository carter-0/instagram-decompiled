package X;

import android.graphics.Bitmap;

/* renamed from: X.Fu7  reason: case insensitive filesystem */
public final /* synthetic */ class C51437Fu7 implements Runnable {
    public final /* synthetic */ C226952iF A00;
    public final /* synthetic */ AnonymousClass2iL A01;
    public final /* synthetic */ AnonymousClass2hE A02;

    public /* synthetic */ C51437Fu7(C226952iF r1, AnonymousClass2iL r2, AnonymousClass2hE r3) {
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r1;
    }

    public final void run() {
        Bitmap bitmap;
        AnonymousClass2iL r4 = this.A01;
        AnonymousClass2hE r3 = this.A02;
        C226952iF r1 = this.A00;
        0lp A002 = 0lq.A00("IgImageInfra.onProgressiveImageCallback");
        try {
            AnonymousClass2l8 r0 = r4.A09;
            String str = null;
            if (r0 != null) {
                bitmap = r0.A00;
                str = r0.A01;
            } else {
                bitmap = null;
            }
            int i = r4.A0V;
            String str2 = r4.A0E;
            if (str2 == null) {
                str2 = "UNKNOWN";
            }
            r3.DaX(r1, new AnonymousClass3LX(bitmap, (C376649Iu) null, str2, str, -1), i);
            A002.close();
        } catch (Throwable th) {
            C9153RRe.A00(th, th);
            throw th;
        }
    }
}
