package X;

import android.graphics.Bitmap;

/* renamed from: X.54q  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C2808954q implements Runnable {
    public final /* synthetic */ C226952iF A00;
    public final /* synthetic */ AnonymousClass2iL A01;
    public final /* synthetic */ AnonymousClass2hC A02;

    public /* synthetic */ C2808954q(C226952iF r1, AnonymousClass2iL r2, AnonymousClass2hC r3) {
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r1;
    }

    public final void run() {
        Bitmap bitmap;
        AnonymousClass2iL r4 = this.A01;
        AnonymousClass2hC r3 = this.A02;
        C226952iF r1 = this.A00;
        0lp A002 = 0lq.A00("IgImageInfra.onMiniPreviewLoadedCallback");
        try {
            AnonymousClass2l8 r0 = r4.A08;
            String str = null;
            if (r0 != null) {
                bitmap = r0.A00;
                str = r0.A01;
            } else {
                bitmap = null;
            }
            String str2 = r4.A0E;
            if (str2 == null) {
                str2 = "UNKNOWN";
            }
            r3.DS7(r1, new AnonymousClass3LX(bitmap, (C376649Iu) null, str2, str, -1));
            A002.close();
        } catch (Throwable th) {
            C9153RRe.A00(th, th);
            throw th;
        }
    }
}
