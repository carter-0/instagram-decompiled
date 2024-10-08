package X;

import android.graphics.Bitmap;
import android.os.SystemClock;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.TelemetryData;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

public final class R2v extends S26 {
    public static boolean A04 = true;
    public static final SOD A05 = new SOD();
    public static final C11153SCi A06 = C11153SCi.A00;
    public final C13788Th3 A00;
    public final SJS A01;
    public final C11332SNl A02;
    public final C10472Rsn A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0022, code lost:
        if (r5.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode < 204700000) goto L_0x002c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public R2v(X.SO3 r7, X.SJS r8) {
        /*
            r6 = this;
            java.lang.String r0 = r8.A00()
            X.SNl r4 = X.C9998Rks.A00(r0)
            java.lang.Class<android.content.Context> r3 = android.content.Context.class
            java.lang.Object r5 = r7.A01(r3)
            android.content.Context r5 = (android.content.Context) r5
            boolean r0 = com.google.android.gms.common.GooglePlayServicesUtil.A00
            r2 = 0
            android.content.pm.PackageManager r1 = r5.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0025 }
            java.lang.String r0 = "com.google.android.gms"
            android.content.pm.PackageInfo r0 = r1.getPackageInfo(r0, r2)     // Catch:{ NameNotFoundException -> 0x0025 }
            int r1 = r0.versionCode
            r0 = 204700000(0xc337960, float:1.3826183E-31)
            if (r1 >= r0) goto L_0x0054
            goto L_0x002c
        L_0x0025:
            java.lang.String r1 = "GooglePlayServicesUtil"
            java.lang.String r0 = "Google Play services is missing."
            android.util.Log.w(r1, r0)
        L_0x002c:
            boolean r0 = r8.A01()
            if (r0 != 0) goto L_0x0054
            X.T5C r1 = new X.T5C
            r1.<init>(r5)
        L_0x0037:
            X.SOD r0 = A05
            r6.<init>(r0)
            r6.A02 = r4
            r6.A00 = r1
            X.SO3 r0 = X.SO3.A00()
            java.lang.Object r1 = r0.A01(r3)
            android.content.Context r1 = (android.content.Context) r1
            X.Rsn r0 = new X.Rsn
            r0.<init>(r1)
            r6.A03 = r0
            r6.A01 = r8
            return
        L_0x0054:
            X.T5D r1 = new X.T5D
            r1.<init>(r5, r8)
            goto L_0x0037
        */
        throw new UnsupportedOperationException("Method not decompiled: X.R2v.<init>(X.SO3, X.SJS):void");
    }

    /* JADX WARNING: type inference failed for: r1v4, types: [X.Rxb, java.lang.Object] */
    public static final void A00(RJC rjc, C10615Rv9 rv9, R2v r2v, long j) {
        RJB rjb;
        long A0C = Pxe.A0C(j);
        R2v r2v2 = r2v;
        C11332SNl sNl = r2v2.A02;
        XSa xSa = XSa.A03;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Map map = sNl.A06;
        RJC rjc2 = rjc;
        if (map.get(xSa) == null || elapsedRealtime - AnonymousClass7TE.A0R(map.get(xSa)) > TimeUnit.SECONDS.toMillis(30)) {
            map.put(xSa, Long.valueOf(elapsedRealtime));
            Long valueOf = Long.valueOf(A0C & Long.MAX_VALUE);
            Boolean valueOf2 = Boolean.valueOf(A04);
            Boolean A0v = AnonymousClass7TE.A0v();
            C10756Rxa rxa = new C10756Rxa(rjc2, valueOf2, A0v, A0v, valueOf);
            Bitmap bitmap = rv9.A02;
            AnonymousClass3Qk.A02(bitmap);
            S4P s4p = new S4P(RJ9.BITMAP, Integer.valueOf(bitmap.getAllocationByteCount() & Integer.MAX_VALUE));
            SJS sjs = r2v2.A01;
            C10611Rv5 rv5 = new C10611Rv5(s4p, rxa, new S42(RJA.LATIN));
            ? obj = new Object();
            if (sjs.A01()) {
                rjb = RJB.TYPE_THICK;
            } else {
                rjb = RJB.TYPE_THIN;
            }
            obj.A01 = rjb;
            obj.A03 = rv5;
            RJJ.A01.execute(new C13064TJu(xSa, sNl, new C10612Rv6(obj, 0), C11332SNl.A00(sNl)));
        }
        Boolean valueOf3 = Boolean.valueOf(A04);
        SJS sjs2 = r2v2.A01;
        C10989S4b s4b = new C10989S4b(rjc2, new S42(RJA.LATIN), valueOf3);
        C10280Rpe rpe = new C10280Rpe(r2v2);
        RJJ.A01.execute(new TKH(XSa.A02, sNl, rpe, s4b, A0C));
        long currentTimeMillis = System.currentTimeMillis();
        C10472Rsn rsn = r2v2.A03;
        int i = 24306;
        if (sjs2.A01()) {
            i = 24317;
        }
        int i2 = rjc2.A00;
        long j2 = currentTimeMillis - A0C;
        synchronized (rsn) {
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            AtomicLong atomicLong = rsn.A01;
            if (atomicLong.get() == -1 || elapsedRealtime2 - atomicLong.get() > TimeUnit.MINUTES.toMillis(30)) {
                rsn.A00.Cgn(new TelemetryData(0, Arrays.asList(new MethodInvocation[]{new MethodInvocation((String) null, (String) null, i, i2, 0, 0, -1, j2, currentTimeMillis)}))).A09(new Sz7(rsn, elapsedRealtime2));
            }
        }
    }
}
