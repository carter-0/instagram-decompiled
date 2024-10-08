package X;

import android.graphics.Bitmap;
import android.graphics.Point;
import java.io.File;
import java.io.FileOutputStream;
import java.util.concurrent.TimeUnit;

/* renamed from: X.9lV  reason: invalid class name and case insensitive filesystem */
public final class C386999lV extends 0ng {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ Bitmap.Config A03;
    public final /* synthetic */ C378989Rz A04;
    public final /* synthetic */ B23 A05;
    public final /* synthetic */ AnonymousClass8A5 A06;
    public final /* synthetic */ AnonymousClass51M A07;
    public final /* synthetic */ File A08;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C386999lV(Bitmap.Config config, C378989Rz r5, B23 b23, AnonymousClass8A5 r7, AnonymousClass51M r8, File file, int i, int i2, int i3) {
        super(94, 3, false, false);
        this.A06 = r7;
        this.A07 = r8;
        this.A08 = file;
        this.A00 = i;
        this.A02 = i2;
        this.A01 = i3;
        this.A03 = config;
        this.A04 = r5;
        this.A05 = b23;
    }

    public final void run() {
        Bitmap bitmap;
        AnonymousClass51M r9 = this.A07;
        File file = this.A08;
        int i = this.A00;
        int i2 = this.A02;
        int i3 = this.A01;
        Bitmap.Config config = this.A03;
        C378989Rz r10 = this.A04;
        B23 b23 = this.A05;
        if (!file.exists()) {
            AnonymousClass51R r0 = r9.A0F;
            Point A002 = r10.A00(new Point(r0.A09, r0.A05));
            try {
                if (AnonymousClass51Q.A05(r9)) {
                    String str = r9.A0F.A0I;
                    if (str != null) {
                        bitmap = 1MF.A0E(str, A002.x, A002.y);
                    }
                    0kD.A09("VideoFrameStore", 002.A0R("retrieveSyncFrame from image fails. path: ", r9.A0F.A0I), (Throwable) null);
                } else {
                    bitmap = C39901AIj.A00(config, A002, AnonymousClass7TE.A0t(r9.A0F.A0F), TimeUnit.MICROSECONDS.convert((long) i, TimeUnit.MILLISECONDS));
                }
                if (bitmap != null) {
                    C39901AIj.A04(bitmap, new FileOutputStream(file));
                }
                0kD.A09("VideoFrameStore", 002.A0R("retrieveSyncFrame from image fails. path: ", r9.A0F.A0I), (Throwable) null);
            } catch (Throwable th) {
                StringBuilder A1A = AnonymousClass7TE.A1A();
                A1A.append("could not generate thumbnail for video from ");
                A1A.append(AnonymousClass7TE.A0t(r9.A0F.A0F));
                A1A.append(" at frame time: ");
                A1A.append(i);
                0kD.A09("VideoFrameStore", A1A.toString(), th);
            }
        }
        11Z.A02(new C41054Anc(C39901AIj.A01(config, file, i2, i3), b23));
    }
}
