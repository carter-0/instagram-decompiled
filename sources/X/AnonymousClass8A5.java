package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import com.instagram.common.session.UserSession;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.UnknownFormatConversionException;
import java.util.concurrent.TimeUnit;

/* renamed from: X.8A5  reason: invalid class name */
public final class AnonymousClass8A5 {
    public final Context A00;
    public final UserSession A01;
    public final AnonymousClass8A6 A02;
    public final 2Nn A03;
    public final Map A04 = new HashMap();
    public final Map A05 = new HashMap();
    public final Map A06 = new HashMap();

    public static final void A02(C378989Rz r11, AnonymousClass8A5 r12, AnonymousClass51M r13, File file, int i) {
        String str;
        Bitmap A022;
        FileOutputStream fileOutputStream;
        AnonymousClass51M r4 = r13;
        try {
            C378989Rz r9 = r11;
            File file2 = file;
            if (AnonymousClass51Q.A05(r13)) {
                AnonymousClass51R r0 = r13.A0F;
                Point A002 = r11.A00(new Point(r0.A09, r0.A05));
                String str2 = r13.A0F.A0I;
                if (str2 == null || (A022 = 1MF.A0E(str2, A002.x, A002.y)) == null) {
                    0kD.A09("VideoFrameStore", 002.A0R("retrieveFrame from image failed. path: ", r13.A0F.A0I), (Throwable) null);
                    return;
                }
                fileOutputStream = new FileOutputStream(file);
            } else {
                TimeUnit timeUnit = TimeUnit.MICROSECONDS;
                AnonymousClass51R r02 = r13.A0F;
                long convert = timeUnit.convert((long) (r02.A02 - r02.A03), TimeUnit.MILLISECONDS);
                long min = Math.min(Math.max(0, convert - (timeUnit.convert(1, TimeUnit.SECONDS) / 30)), timeUnit.convert((long) i, TimeUnit.MILLISECONDS));
                Context context = r12.A00;
                UserSession userSession = r12.A01;
                File file3 = new File(r4.A0F.A0F);
                C67266Ml0 A003 = JYY.A00(userSession);
                C379229Ta A004 = JYZ.A00(userSession);
                0qQ.A0B(context, 0);
                0qQ.A0B(userSession, 1);
                0qQ.A0B(A003, 6);
                0qQ.A0B(A004, 7);
                A022 = C39901AIj.A02(C39901AIj.A03(context, userSession, r9, A003, A004, file3, convert, false), convert, min);
                fileOutputStream = new FileOutputStream(file2);
            }
            C39901AIj.A04(A022, fileOutputStream);
        } catch (IOException e) {
            th = e;
            str = "retrieveFrame_IOException";
            0kD.A09("VideoFrameStore", str, th);
        } catch (UnknownFormatConversionException e2) {
            th = e2;
            str = "retrieveFrame_UnknownFormatConversionException";
            0kD.A09("VideoFrameStore", str, th);
        } catch (IllegalStateException e3) {
            th = e3;
            str = "retrieveFrame_IllegalStateException";
            0kD.A09("VideoFrameStore", str, th);
        } catch (Throwable th) {
            th = th;
            str = "retrieveFrame";
            0kD.A09("VideoFrameStore", str, th);
        }
    }

    public final void A03(Bitmap.Config config, B23 b23, String str, int i, int i2) {
        0qQ.A0B(str, 0);
        AnonymousClass51M A002 = LIO.A00(str);
        0qQ.A0B(A002, 0);
        Bitmap.Config config2 = config;
        B23 b232 = b23;
        A01(config2, b232, this, A002, (int) (((float) A002.A09) * Math.abs(A002.A00)), i, i2, false);
    }

    public static final File A00(C378989Rz r3, AnonymousClass8A5 r4, AnonymousClass51M r5, int i) {
        2Nn r42 = r4.A03;
        if (r42.A02()) {
            AnonymousClass51R r0 = r5.A0F;
            Point A002 = r3.A00(new Point(r0.A09, r0.A05));
            File file = new File(r5.A0F.A0F);
            StringBuilder sb = new StringBuilder();
            sb.append("time-");
            sb.append(i);
            sb.append("-size-");
            sb.append(A002.x);
            sb.append('x');
            sb.append(A002.y);
            return C39907AIy.A01(r42, file, sb.toString());
        }
        throw new IOException("Failed to initialize directory provider");
    }

    public static final void A01(Bitmap.Config config, B23 b23, AnonymousClass8A5 r12, AnonymousClass51M r13, int i, int i2, int i3, boolean z) {
        int i4 = i3;
        B23 b232 = b23;
        AnonymousClass8A5 r4 = r12;
        AnonymousClass51M r5 = r13;
        int i5 = i;
        try {
            File A002 = A00(new C378989Rz(i4), r12, r13, i);
            A002.exists();
            0nY.A00().ATE(new C386989lU(config, b232, r4, r5, A002, i5, i2, i4, z));
        } catch (IOException unused) {
            b23.DH1();
        }
    }

    public AnonymousClass8A5(Context context, UserSession userSession, 2Nn r4) {
        this.A00 = context;
        this.A03 = r4;
        this.A01 = userSession;
        this.A02 = new AnonymousClass8A6(context, userSession);
    }
}
