package X;

import android.content.Context;
import android.graphics.Bitmap;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* renamed from: X.9lP  reason: invalid class name and case insensitive filesystem */
public final class C386939lP extends 0ng {
    public final /* synthetic */ Bitmap A00;
    public final /* synthetic */ 0v6 A01;
    public final /* synthetic */ B25 A02;
    public final /* synthetic */ C353798Jc A03;
    public final /* synthetic */ boolean A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C386939lP(Bitmap bitmap, 0v6 r5, B25 b25, C353798Jc r7, boolean z) {
        super(86, 3, false, false);
        this.A03 = r7;
        this.A00 = bitmap;
        this.A04 = z;
        this.A01 = r5;
        this.A02 = b25;
    }

    public final void run() {
        FileOutputStream fileOutputStream;
        C353798Jc r2 = this.A03;
        Context context = r2.A0P;
        File A042 = 0mb.A04(context);
        try {
            fileOutputStream = new FileOutputStream(A042.getPath());
            Bitmap bitmap = this.A00;
            JZK.A00(Bitmap.CompressFormat.JPEG, bitmap, fileOutputStream);
            long currentTimeMillis = System.currentTimeMillis();
            AnonymousClass876 r1 = r2.A0X.A0H;
            r1.A01();
            C352218Cl r6 = new C352218Cl(A042, bitmap.getWidth(), bitmap.getHeight(), currentTimeMillis, currentTimeMillis, false);
            r6.A15 = this.A04;
            AnonymousClass87G A012 = r1.A01();
            if (A012 != null) {
                AnonymousClass87I r0 = A012.A04;
                if (r0 == null) {
                    r0 = AnonymousClass87I.EMPTY;
                }
                switch (r0.ordinal()) {
                    case 1:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 9:
                    case 19:
                    case 20:
                        r6.A18 = false;
                        break;
                }
            }
            r6.A0I = this.A01;
            r2.A0R.post(new C41161ApL(this, this.A02, r6));
            fileOutputStream.close();
        } catch (IOException unused) {
            try {
                C59689JTv.A0A(context, "save_background_photo_io_exception");
            } catch (Throwable th) {
                r2.A0M = false;
                throw th;
            }
        } catch (Throwable th2) {
            C9153RRe.A00(th, th2);
        }
        r2.A0M = false;
        return;
        throw th;
    }
}
