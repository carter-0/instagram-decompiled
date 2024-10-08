package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import com.instagram.common.session.UserSession;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.UnknownFormatConversionException;
import java.util.concurrent.TimeUnit;

/* renamed from: X.9lU  reason: invalid class name and case insensitive filesystem */
public final class C386989lU extends 0ng {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ Bitmap.Config A03;
    public final /* synthetic */ B23 A04;
    public final /* synthetic */ AnonymousClass8A5 A05;
    public final /* synthetic */ AnonymousClass51M A06;
    public final /* synthetic */ File A07;
    public final /* synthetic */ boolean A08;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C386989lU(Bitmap.Config config, B23 b23, AnonymousClass8A5 r6, AnonymousClass51M r7, File file, int i, int i2, int i3, boolean z) {
        super(94, 3, false, false);
        this.A05 = r6;
        this.A06 = r7;
        this.A07 = file;
        this.A00 = i;
        this.A02 = i2;
        this.A01 = i3;
        this.A03 = config;
        this.A04 = b23;
        this.A08 = z;
    }

    public final void run() {
        String str;
        Bitmap A022;
        FileOutputStream fileOutputStream;
        AnonymousClass8A5 r10 = this.A05;
        AnonymousClass51M r7 = this.A06;
        File file = this.A07;
        int i = this.A00;
        int i2 = this.A02;
        int i3 = this.A01;
        Bitmap.Config config = this.A03;
        B23 b23 = this.A04;
        boolean z = this.A08;
        if (!file.exists()) {
            C378989Rz r11 = new C378989Rz(i3);
            if (z) {
                try {
                    if (AnonymousClass51Q.A05(r7)) {
                        AnonymousClass51R r0 = r7.A0F;
                        Point A002 = r11.A00(new Point(r0.A09, r0.A05));
                        String str2 = r7.A0F.A0I;
                        if (str2 == null || (A022 = 1MF.A0E(str2, A002.x, A002.y)) == null) {
                            0kD.A09("VideoFrameStore", 002.A0R("continuousRetrieveFrame from image failed. path: ", r7.A0F.A0I), (Throwable) null);
                        } else {
                            fileOutputStream = new FileOutputStream(file);
                        }
                    } else {
                        TimeUnit timeUnit = TimeUnit.MICROSECONDS;
                        AnonymousClass51R r02 = r7.A0F;
                        long convert = timeUnit.convert((long) (r02.A02 - r02.A03), TimeUnit.MILLISECONDS);
                        long min = Math.min(Math.max(0, convert - (timeUnit.convert(1, TimeUnit.SECONDS) / 30)), timeUnit.convert((long) i, TimeUnit.MILLISECONDS));
                        Context context = r10.A00;
                        UserSession userSession = r10.A01;
                        C378989Rz r17 = r11;
                        UserSession userSession2 = userSession;
                        A022 = C39901AIj.A02(C39901AIj.A03(context, userSession2, r17, JYY.A00(userSession), JYZ.A00(userSession), AnonymousClass7TE.A0t(r7.A0F.A0F), convert, true), convert, min);
                        fileOutputStream = new FileOutputStream(file);
                    }
                    C39901AIj.A04(A022, fileOutputStream);
                } catch (IOException e) {
                    th = e;
                    str = "continuousRetrieveFrame_IOException";
                    0kD.A09("VideoFrameStore", str, th);
                    11Z.A02(new C41053Anb(C39901AIj.A01(config, file, i2, i3), b23));
                } catch (UnknownFormatConversionException e2) {
                    th = e2;
                    str = "continuousRetrieveFrame_UnknownFormatConversionException";
                    0kD.A09("VideoFrameStore", str, th);
                    11Z.A02(new C41053Anb(C39901AIj.A01(config, file, i2, i3), b23));
                } catch (IllegalStateException e3) {
                    th = e3;
                    str = "continuousRetrieveFrame_IllegalStateException";
                    0kD.A09("VideoFrameStore", str, th);
                    11Z.A02(new C41053Anb(C39901AIj.A01(config, file, i2, i3), b23));
                } catch (Throwable th) {
                    th = th;
                    str = "continuousRetrieveFrame";
                    0kD.A09("VideoFrameStore", str, th);
                    11Z.A02(new C41053Anb(C39901AIj.A01(config, file, i2, i3), b23));
                }
            } else {
                AnonymousClass8A5.A02(r11, r10, r7, file, i);
            }
        }
        11Z.A02(new C41053Anb(C39901AIj.A01(config, file, i2, i3), b23));
    }
}
