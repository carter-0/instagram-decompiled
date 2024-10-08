package X;

import android.net.Uri;
import android.text.TextUtils;
import com.facebook.video.heroplayer.setting.HeroPlayerSetting;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import org.webrtc.CameraVideoCapturer;

/* renamed from: X.4P8  reason: invalid class name */
public final class AnonymousClass4P8 implements AnonymousClass4P9, AnonymousClass4PB, AnonymousClass4PC {
    public static final AtomicInteger A0A = new AtomicInteger(0);
    public AnonymousClass4OI A00;
    public C22299Xz9 A01;
    public IOException A02;
    public IOException A03;
    public String A04 = "";
    public final AnonymousClass4OS A05;
    public final C290435fJ A06;
    public final C290445fK A07;
    public final HeroPlayerSetting A08;
    public final boolean A09;

    public final void A01(IOException iOException, String str, String str2) {
        String str3;
        String str4 = str;
        String str5 = str2;
        try {
            AnonymousClass4OS r2 = this.A05;
            C284815Oa A0K = r2.A0K(AnonymousClass5OZ.EXOPLAYER2_SOURCE, C2612348u.A00(iOException, CameraVideoCapturer.CameraStatistics.CAMERA_OBSERVER_PERIOD_MS));
            r2.A0v.DCy(A0K.A01.A00, A0K.A00.name(), A0K.A02, A0K.A03, str4, str5, "");
        } catch (Exception e) {
            AnonymousClass4OS r22 = this.A05;
            if (iOException != null) {
                str3 = iOException.getMessage();
            } else {
                str3 = "null IOException";
            }
            28J.A01(r22, "onErrorRecoveryAttempt: caught exception, reason=%s, errorMsg=%s, url=%s", e, new Object[]{str2, str3, str});
        }
    }

    public final void DO7(AnonymousClass4Y0 r1, AnonymousClass4Y4 r2, C264874Rq r3, int i) {
    }

    public final void Dvs(AnonymousClass4Y4 r1, C264874Rq r2, int i) {
    }

    public static AnonymousClass4Yf A00(C256683wB r40) {
        C256683wB r1 = r40;
        if (r40 == null) {
            return null;
        }
        String str = r1.A0T;
        String str2 = r1.A0W;
        int i = r1.A0L;
        int i2 = r1.A0A;
        int i3 = r1.A06;
        int i4 = r1.A0G;
        int i5 = r1.A05;
        String str3 = r1.A0R;
        C256673wA r0 = r1.A0N;
        String str4 = r0.A07;
        String str5 = r0.A05;
        String str6 = r0.A06;
        String str7 = r0.A04;
        String str8 = r0.A08;
        String str9 = r0.A02;
        boolean z = r0.A0H;
        boolean z2 = r0.A0I;
        boolean z3 = r0.A0E;
        boolean z4 = r0.A0D;
        boolean z5 = r0.A0C;
        boolean z6 = r0.A0B;
        boolean z7 = r0.A0A;
        boolean z8 = r0.A09;
        int i6 = i;
        int i7 = i2;
        int i8 = i3;
        int i9 = i4;
        int i10 = i5;
        return new AnonymousClass4Yf(str, str2, str3, str4, str5, str6, str7, str8, str9, i6, i7, i8, i9, i10, r0.A01, z, z2, z3, z4, z5, z6, z7, z8);
    }

    public final void DAO(AnonymousClass4Y4 r8, C264874Rq r9, int i) {
        String str;
        ArrayList arrayList;
        String str2;
        Uri uri;
        C256683wB r6 = r8.A05;
        AnonymousClass4Yf A002 = A00(r6);
        AnonymousClass4OI r0 = this.A00;
        if (r0 == null || (uri = r0.A0K.A05) == null) {
            str = "";
        } else {
            str = uri.toString();
        }
        AnonymousClass4OS r5 = this.A05;
        28w Av8 = r5.A19.A07.Av8();
        if (Av8 != null) {
            arrayList = Av8.A02();
        } else {
            arrayList = new ArrayList();
        }
        if (!(r6 == null || (str2 = r6.A0W) == null || !str2.contains("video/"))) {
            if (!TextUtils.isEmpty(this.A04) && !this.A04.equals(str2)) {
                r5.A1H = true;
            }
            this.A04 = str2;
        }
        AnonymousClass4OS.A0E(r5, "onDownstreamFormatChange", new Object[0]);
        AnonymousClass4OS.A07(r5.A0G.obtainMessage(39, r6), r5);
        r5.A0v.DAM(A002, str, arrayList, r5.A1H);
    }

    public final void DOB(AnonymousClass4Y0 r14, AnonymousClass4Y4 r15, C264874Rq r16, Object obj, Object obj2, int i) {
        C22299Xz9 xz9;
        Object obj3 = obj;
        if (r15.A00 == 4 && (xz9 = this.A01) != null) {
            if (obj3 instanceof C256633w6) {
                C256633w6 r4 = (C256633w6) obj3;
                long[] A032 = C256373vf.A03(r4);
                C22299Xz9 xz92 = this.A01;
                long j = A032[0];
                long j2 = A032[1];
                long j3 = A032[2];
                boolean z = r4.A0V;
                boolean z2 = r4.A0R;
                boolean z3 = r4.A0U;
                boolean z4 = r4.A0W;
                C257173wy r3 = xz92.A01;
                r3.A0I = j;
                r3.A0J = j2;
                r3.A0K = j3;
                r3.A0w = z;
                r3.A0z = z2;
                r3.A15 = z3;
                r3.A0x = z4;
                long j4 = xz92.A00;
                if (r3.A0X == null) {
                    C257173wy.A01(r3, j4, false);
                }
                C257173wy.A02(r3, C257173wy.A00(r3));
                C290445fK r32 = this.A07;
                if (r32 != null) {
                    r32.A01(this.A00.A0K.A0G, r4.A0P, r4.A02);
                    return;
                }
                return;
            }
            C257173wy r33 = xz9.A01;
            long j5 = xz9.A00;
            if (r33.A0X == null) {
                C257173wy.A01(r33, j5, false);
            }
            C257173wy.A02(r33, C257173wy.A00(r33));
        }
    }

    public final void DOD(AnonymousClass4Y0 r3, AnonymousClass4Y4 r4, C264874Rq r5, IOException iOException, int i, boolean z) {
        if (r4.A00 == 4) {
            this.A03 = iOException;
            C22299Xz9 xz9 = this.A01;
            if (xz9 != null) {
                xz9.A01.DtY(iOException);
                return;
            }
            return;
        }
        this.A02 = iOException;
    }

    public final void DOT(AnonymousClass4Y0 r3, AnonymousClass4Y4 r4, C264874Rq r5, int i) {
        C22299Xz9 xz9;
        if (r4.A00 == 4 && (xz9 = this.A01) != null) {
            xz9.A00(r3.A01);
        }
    }

    public final void DOU(AnonymousClass4Y0 r3, AnonymousClass4Y4 r4, C264874Rq r5, int i, int i2) {
        C22299Xz9 xz9;
        if (this.A09 && i2 == 0 && r4.A00 == 4 && (xz9 = this.A01) != null) {
            xz9.A00(r3.A01);
        }
    }

    public AnonymousClass4P8(AnonymousClass4OS r2, C290435fJ r3, C290445fK r4, HeroPlayerSetting heroPlayerSetting) {
        this.A05 = r2;
        this.A07 = r4;
        this.A06 = r3;
        this.A08 = heroPlayerSetting;
        this.A09 = 2BY.A02(2BQ.A0g);
    }
}
