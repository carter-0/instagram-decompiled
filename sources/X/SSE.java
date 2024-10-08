package X;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.BaseBundle;
import android.util.SparseArray;
import com.facebook.proxygen.LigerSamplePolicy;
import com.google.android.gms.vision.barcode.Barcode;
import com.instagram.common.session.UserSession;
import java.util.Arrays;
import java.util.HashMap;

public final class SSE {
    public long A00;
    public C18726Vz1 A01;
    public String A02;
    public HashMap A03;
    public final Context A04;
    public final 0bY A05 = DbW.A0G();
    public final UserSession A06;

    /* JADX WARNING: type inference failed for: r1v1, types: [com.google.android.gms.internal.vision.zzk, java.lang.Object] */
    public static final AnonymousClass34S A00(S24 s24, SSE sse) {
        int i;
        int i2 = 0;
        try {
            PackageManager packageManager = sse.A04.getPackageManager();
            if (packageManager != null) {
                i = packageManager.getPackageInfo("com.google.android.gms", 0).versionCode;
                if (i >= 9452000) {
                    Context context = sse.A04;
                    ? obj = new Object();
                    obj.A00 = 256;
                    C8599Qxg qxg = new C8599Qxg(new C8597Qxd(context, obj));
                    if (qxg.A00.A00() != null) {
                        SparseArray A012 = qxg.A01(s24);
                        int size = A012.size();
                        while (i2 < size) {
                            Object obj2 = A012.get(A012.keyAt(i2));
                            if (obj2 != null) {
                                String str = ((Barcode) obj2).A0C;
                                0qQ.A0A(str);
                                AnonymousClass34S A022 = A02(sse, str);
                                if (A022 != null) {
                                    return A022;
                                }
                                i2++;
                            } else {
                                throw AnonymousClass7TE.A0z("Required value was null.");
                            }
                        }
                    }
                }
                return null;
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        } catch (Exception unused) {
            i = 0;
        }
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.AnonymousClass34S A01(X.C11013S5k r7, X.SSE r8) {
        /*
            X.Vz1 r0 = r8.A01
            if (r0 != 0) goto L_0x0009
            X.Vz1 r0 = new X.Vz1
            r0.<init>()
        L_0x0009:
            r8.A01 = r0
            java.util.HashMap r2 = r8.A03
            if (r2 != 0) goto L_0x0013
            java.util.HashMap r2 = X.AnonymousClass7TE.A1E()
        L_0x0013:
            r8.A03 = r2
            r0 = 1
            X.UwS r1 = X.C16523UwS.TRY_HARDER
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.put(r1, r0)
            X.R79 r1 = new X.R79
            r1.<init>(r7)
            r6 = 0
            X.Vz1 r4 = r8.A01     // Catch:{ R7D | R7E | R7F -> 0x0088, all -> 0x00fe }
            if (r4 == 0) goto L_0x0088
            java.util.HashMap r3 = r8.A03     // Catch:{ R7D | R7E | R7F -> 0x0088, all -> 0x00fe }
            if (r3 == 0) goto L_0x0070
            X.UwS r0 = X.C16523UwS.PURE_BARCODE     // Catch:{ R7D | R7E | R7F -> 0x0088, all -> 0x00fe }
            boolean r0 = r3.containsKey(r0)     // Catch:{ R7D | R7E | R7F -> 0x0088, all -> 0x00fe }
            if (r0 == 0) goto L_0x0070
            X.Wgz r0 = r1.A00()     // Catch:{ R7D | R7E | R7F -> 0x0088, all -> 0x00fe }
            X.Wgz r1 = X.C18726Vz1.A00(r0)     // Catch:{ R7D | R7E | R7F -> 0x0088, all -> 0x00fe }
            X.Vtu r0 = r4.A00     // Catch:{ R7D | R7E | R7F -> 0x0088, all -> 0x00fe }
            X.RyN r1 = r0.A01(r1, r3)     // Catch:{ R7D | R7E | R7F -> 0x0088, all -> 0x00fe }
            X.VvU[] r0 = X.C18726Vz1.A01     // Catch:{ R7D | R7E | R7F -> 0x0088, all -> 0x00fe }
        L_0x0045:
            java.lang.Object r2 = r1.A00     // Catch:{ R7D | R7E | R7F -> 0x0088, all -> 0x00fe }
            boolean r2 = r2 instanceof X.C16814V6v     // Catch:{ R7D | R7E | R7F -> 0x0088, all -> 0x00fe }
            if (r2 == 0) goto L_0x0059
            int r3 = r0.length     // Catch:{ R7D | R7E | R7F -> 0x0088, all -> 0x00fe }
            r2 = 3
            if (r3 < r2) goto L_0x0059
            r5 = 0
            r4 = r0[r5]     // Catch:{ R7D | R7E | R7F -> 0x0088, all -> 0x00fe }
            r3 = 2
            r2 = r0[r3]     // Catch:{ R7D | R7E | R7F -> 0x0088, all -> 0x00fe }
            r0[r5] = r2     // Catch:{ R7D | R7E | R7F -> 0x0088, all -> 0x00fe }
            r0[r3] = r4     // Catch:{ R7D | R7E | R7F -> 0x0088, all -> 0x00fe }
        L_0x0059:
            java.lang.String r3 = r1.A04     // Catch:{ R7D | R7E | R7F -> 0x0088, all -> 0x00fe }
            byte[] r2 = r1.A06     // Catch:{ R7D | R7E | R7F -> 0x0088, all -> 0x00fe }
            X.S4l r4 = new X.S4l     // Catch:{ R7D | R7E | R7F -> 0x0088, all -> 0x00fe }
            r4.<init>(r3, r2, r0)     // Catch:{ R7D | R7E | R7F -> 0x0088, all -> 0x00fe }
            java.util.List r2 = r1.A05     // Catch:{ R7D | R7E | R7F -> 0x0088, all -> 0x00fe }
            if (r2 == 0) goto L_0x006b
            X.REm r0 = X.C8895REm.BYTE_SEGMENTS     // Catch:{ R7D | R7E | R7F -> 0x0088, all -> 0x00fe }
            r4.A00(r0, r2)     // Catch:{ R7D | R7E | R7F -> 0x0088, all -> 0x00fe }
        L_0x006b:
            A03(r4, r1)     // Catch:{ R7D | R7E | R7F -> 0x0088, all -> 0x00fe }
            goto L_0x00f4
        L_0x0070:
            X.Wgz r1 = r1.A00()     // Catch:{ R7D | R7E | R7F -> 0x0088, all -> 0x00fe }
            X.W1H r0 = new X.W1H     // Catch:{ R7D | R7E | R7F -> 0x0088, all -> 0x00fe }
            r0.<init>(r1)     // Catch:{ R7D | R7E | R7F -> 0x0088, all -> 0x00fe }
            X.Rsw r2 = r0.A03(r3)     // Catch:{ R7D | R7E | R7F -> 0x0088, all -> 0x00fe }
            X.Vtu r1 = r4.A00     // Catch:{ R7D | R7E | R7F -> 0x0088, all -> 0x00fe }
            X.Wgz r0 = r2.A00     // Catch:{ R7D | R7E | R7F -> 0x0088, all -> 0x00fe }
            X.RyN r1 = r1.A01(r0, r3)     // Catch:{ R7D | R7E | R7F -> 0x0088, all -> 0x00fe }
            X.VvU[] r0 = r2.A01     // Catch:{ R7D | R7E | R7F -> 0x0088, all -> 0x00fe }
            goto L_0x0045
        L_0x0088:
            X.R7A r0 = new X.R7A
            r0.<init>(r7)
            X.R79 r1 = new X.R79
            r1.<init>(r0)
            X.Vz1 r4 = r8.A01     // Catch:{ R7D | R7E | R7F -> 0x00fd, all -> 0x00fe }
            if (r4 == 0) goto L_0x00fd
            java.util.HashMap r3 = r8.A03     // Catch:{ R7D | R7E | R7F -> 0x00fd, all -> 0x00fe }
            if (r3 == 0) goto L_0x00dc
            X.UwS r0 = X.C16523UwS.PURE_BARCODE     // Catch:{ R7D | R7E | R7F -> 0x00fd, all -> 0x00fe }
            boolean r0 = r3.containsKey(r0)     // Catch:{ R7D | R7E | R7F -> 0x00fd, all -> 0x00fe }
            if (r0 == 0) goto L_0x00dc
            X.Wgz r0 = r1.A00()     // Catch:{ R7D | R7E | R7F -> 0x00fd, all -> 0x00fe }
            X.Wgz r1 = X.C18726Vz1.A00(r0)     // Catch:{ R7D | R7E | R7F -> 0x00fd, all -> 0x00fe }
            X.Vtu r0 = r4.A00     // Catch:{ R7D | R7E | R7F -> 0x00fd, all -> 0x00fe }
            X.RyN r1 = r0.A01(r1, r3)     // Catch:{ R7D | R7E | R7F -> 0x00fd, all -> 0x00fe }
            X.VvU[] r0 = X.C18726Vz1.A01     // Catch:{ R7D | R7E | R7F -> 0x00fd, all -> 0x00fe }
        L_0x00b2:
            java.lang.Object r2 = r1.A00     // Catch:{ R7D | R7E | R7F -> 0x00fd, all -> 0x00fe }
            boolean r2 = r2 instanceof X.C16814V6v     // Catch:{ R7D | R7E | R7F -> 0x00fd, all -> 0x00fe }
            if (r2 == 0) goto L_0x00c6
            int r3 = r0.length     // Catch:{ R7D | R7E | R7F -> 0x00fd, all -> 0x00fe }
            r2 = 3
            if (r3 < r2) goto L_0x00c6
            r5 = 0
            r4 = r0[r5]     // Catch:{ R7D | R7E | R7F -> 0x00fd, all -> 0x00fe }
            r3 = 2
            r2 = r0[r3]     // Catch:{ R7D | R7E | R7F -> 0x00fd, all -> 0x00fe }
            r0[r5] = r2     // Catch:{ R7D | R7E | R7F -> 0x00fd, all -> 0x00fe }
            r0[r3] = r4     // Catch:{ R7D | R7E | R7F -> 0x00fd, all -> 0x00fe }
        L_0x00c6:
            java.lang.String r3 = r1.A04     // Catch:{ R7D | R7E | R7F -> 0x00fd, all -> 0x00fe }
            byte[] r2 = r1.A06     // Catch:{ R7D | R7E | R7F -> 0x00fd, all -> 0x00fe }
            X.S4l r4 = new X.S4l     // Catch:{ R7D | R7E | R7F -> 0x00fd, all -> 0x00fe }
            r4.<init>(r3, r2, r0)     // Catch:{ R7D | R7E | R7F -> 0x00fd, all -> 0x00fe }
            java.util.List r2 = r1.A05     // Catch:{ R7D | R7E | R7F -> 0x00fd, all -> 0x00fe }
            if (r2 == 0) goto L_0x00d8
            X.REm r0 = X.C8895REm.BYTE_SEGMENTS     // Catch:{ R7D | R7E | R7F -> 0x00fd, all -> 0x00fe }
            r4.A00(r0, r2)     // Catch:{ R7D | R7E | R7F -> 0x00fd, all -> 0x00fe }
        L_0x00d8:
            A03(r4, r1)     // Catch:{ R7D | R7E | R7F -> 0x00fd, all -> 0x00fe }
            goto L_0x00f4
        L_0x00dc:
            X.Wgz r1 = r1.A00()     // Catch:{ R7D | R7E | R7F -> 0x00fd, all -> 0x00fe }
            X.W1H r0 = new X.W1H     // Catch:{ R7D | R7E | R7F -> 0x00fd, all -> 0x00fe }
            r0.<init>(r1)     // Catch:{ R7D | R7E | R7F -> 0x00fd, all -> 0x00fe }
            X.Rsw r2 = r0.A03(r3)     // Catch:{ R7D | R7E | R7F -> 0x00fd, all -> 0x00fe }
            X.Vtu r1 = r4.A00     // Catch:{ R7D | R7E | R7F -> 0x00fd, all -> 0x00fe }
            X.Wgz r0 = r2.A00     // Catch:{ R7D | R7E | R7F -> 0x00fd, all -> 0x00fe }
            X.RyN r1 = r1.A01(r0, r3)     // Catch:{ R7D | R7E | R7F -> 0x00fd, all -> 0x00fe }
            X.VvU[] r0 = r2.A01     // Catch:{ R7D | R7E | R7F -> 0x00fd, all -> 0x00fe }
            goto L_0x00b2
        L_0x00f4:
            java.lang.String r0 = X.DbT.A10(r4)
            X.34S r0 = A02(r8, r0)
            return r0
        L_0x00fd:
            return r6
        L_0x00fe:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SSE.A01(X.S5k, X.SSE):X.34S");
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [X.0SC, java.lang.Object] */
    public static final AnonymousClass34S A02(SSE sse, String str) {
        REY rey;
        String str2;
        AnonymousClass34S A002;
        UserSession userSession = sse.A06;
        0qQ.A0B(userSession, 0);
        0Aj A0e = AnonymousClass7TE.A0e(new AnonymousClass0kM(userSession).A00(), "ig_qr_code_url_parsed");
        try {
            A0e.AAJ("sanitized_url", new Object().A03(0cp.A03(str), (0bq) null).A00());
            AnonymousClass14E r1 = 14D.A04;
            14D A003 = r1.A00();
            if (A003 == null || (A002 = A003.A00(userSession, str)) == null) {
                if (r1.A00() != null) {
                    Context context = sse.A04;
                    if (!(str == null || FHE.A0G(context, str) == null)) {
                        A0e.A7p("is_handled_by_dfa", true);
                        A0e.Cgf();
                    }
                }
                Uri A012 = 0cp.A01(sse.A05, str);
                if (A012 != null) {
                    str2 = A012.getScheme();
                } else {
                    str2 = null;
                }
                if (!0qQ.A0K(str2, "barcelona") || !0oI.A09(sse.A04)) {
                    try {
                        String[] A1b = DbU.A1b(DbW.A0o("www.fujitv.co.jp,fujitv.co.jp", ","), 0);
                        if (00k.A0u(0sr.A1P(Arrays.copyOf(A1b, A1b.length)), DbT.A09(str).getAuthority())) {
                            A0e.A7p("is_allowed_domain", true);
                            A0e.Cgf();
                            return new AnonymousClass34S(REY.ALLOWED_DOMAIN_EXTERNAL_URL, str);
                        }
                    } catch (Exception unused) {
                    }
                    if (!0qQ.A0K(str, sse.A02) || System.currentTimeMillis() - sse.A00 > LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT) {
                        C59689JTv.A01(sse.A04, (String) null, 2131971008, 0);
                        sse.A00 = System.currentTimeMillis();
                    }
                    sse.A02 = str;
                    return null;
                }
                rey = REY.BARCELONA_URL;
                return new AnonymousClass34S(rey, str);
            }
            Object obj = A002.A00;
            if (obj != null) {
                A0e.AAJ("legacy_handler_name", C51968G9o.A16(obj));
                A0e.Cgf();
                Object obj2 = A002.A01;
                if (obj2 != null) {
                    String string = ((BaseBundle) obj2).getString(C273654mx.A00(1287));
                    if (string != null) {
                        return new AnonymousClass34S(REY.USERNAME, string);
                    }
                } else {
                    throw AnonymousClass7TE.A0z("Required value was null.");
                }
            } else {
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
            rey = REY.IG_URL;
            return new AnonymousClass34S(rey, str);
        } catch (SecurityException unused2) {
            A0e.A7p("has_legacy_error", true);
            A0e.Cgf();
            return null;
        }
    }

    public static void A03(C10991S4l s4l, C10801RyN ryN) {
        int i;
        s4l.A00(C8895REm.ERROR_CORRECTION_LEVEL, ryN.A03);
        int i2 = ryN.A01;
        if (i2 >= 0 && (i = ryN.A02) >= 0) {
            s4l.A00(C8895REm.STRUCTURED_APPEND_SEQUENCE, Integer.valueOf(i));
            s4l.A00(C8895REm.STRUCTURED_APPEND_PARITY, Integer.valueOf(i2));
        }
    }

    public SSE(Context context, UserSession userSession) {
        this.A04 = context;
        this.A06 = userSession;
    }
}
