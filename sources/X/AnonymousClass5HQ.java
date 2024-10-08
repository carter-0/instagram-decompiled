package X;

import android.graphics.Bitmap;

/* renamed from: X.5HQ  reason: invalid class name */
public final /* synthetic */ class AnonymousClass5HQ implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ Bitmap A02;
    public final /* synthetic */ C226952iF A03;
    public final /* synthetic */ AnonymousClass2iL A04;
    public final /* synthetic */ AnonymousClass2hE A05;
    public final /* synthetic */ String A06;

    public /* synthetic */ AnonymousClass5HQ(Bitmap bitmap, C226952iF r2, AnonymousClass2iL r3, AnonymousClass2hE r4, String str, int i, int i2) {
        this.A04 = r3;
        this.A05 = r4;
        this.A03 = r2;
        this.A00 = i;
        this.A02 = bitmap;
        this.A01 = i2;
        this.A06 = str;
    }

    public final void run() {
        AnonymousClass2iL r4 = this.A04;
        AnonymousClass2hE r3 = this.A05;
        C226952iF r2 = this.A03;
        int i = this.A00;
        Bitmap bitmap = this.A02;
        int i2 = this.A01;
        String str = this.A06;
        0lp A002 = 0lq.A00("IgImageInfra.onProgressiveImageCallback");
        try {
            String str2 = r4.A0E;
            if (str2 == null) {
                str2 = "UNKNOWN";
            }
            r3.DaX(r2, new AnonymousClass3LX(bitmap, (C376649Iu) null, str2, str, i2), i);
            A002.close();
        } catch (Throwable th) {
            C9153RRe.A00(th, th);
            throw th;
        }
    }
}
