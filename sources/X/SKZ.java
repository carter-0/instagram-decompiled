package X;

import android.app.ActivityManager;
import android.os.Build;
import com.facebook.common.dextricks.Constants;
import com.facebook.videolite.transcoder.base.composition.MediaComposition;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public abstract class SKZ {
    public static ArrayList A00(C7232Q0d q0d, MediaComposition mediaComposition, C7334Q4k q4k, Boolean bool) {
        boolean z;
        ArrayList arrayList;
        boolean z2;
        boolean z3;
        C7334Q4k q4k2 = q4k;
        if (bool.booleanValue()) {
            return A01(q4k);
        }
        ArrayList A1C = AnonymousClass7TE.A1C();
        boolean z4 = false;
        if (Q1Z.A03(q0d, mediaComposition, new int[]{7})) {
            boolean z5 = true;
            if (Q1Z.A04(C266714aE.VIDEO, mediaComposition)) {
                z5 = false;
            }
            if (z5) {
                z4 = true;
            }
        }
        if (z4) {
            A1C.addAll(A02(q4k, 2, Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP_ATTEMPTED, true));
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 29 && Q1Z.A03(q0d, mediaComposition, new int[]{6})) {
            boolean z6 = true;
            if (Q1Z.A04(C266714aE.VIDEO, mediaComposition)) {
                z6 = false;
            }
            if (z6) {
                boolean z7 = q4k instanceof C7967QeF;
                if (z7) {
                    z2 = 182.A06(0Tu.A05, ((C7967QeF) q4k2).A00, 36316190464413761L);
                } else {
                    z2 = false;
                }
                if (z2) {
                    if (z7) {
                        z3 = 182.A06(0Tu.A05, ((C7967QeF) q4k2).A00, 36316190464479298L);
                    } else {
                        z3 = false;
                    }
                    A1C.addAll(A02(q4k, 2, Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP_ATTEMPTED, z3));
                }
            }
        }
        if (i >= 29) {
            if (q4k instanceof C7967QeF) {
                z = 182.A06(0Tu.A05, ((C7967QeF) q4k2).A00, 36320107470790621L);
            } else {
                z = false;
            }
            if (z) {
                Iterator it = Arrays.asList(new Integer[]{Integer.valueOf(C249703kE.FLAG_MOVED), 1024, 512, 128, 64, 32, Pxe.A0n()}).iterator();
                while (it.hasNext()) {
                    try {
                        arrayList = AnonymousClass7TE.A1D(SMQ.A00(C8907RFa.CODEC_VIDEO_AV1, 1, AnonymousClass7TG.A0F(it), true, false));
                    } catch (RuntimeException e) {
                        0KC.A0G("EncoderCheck", "hevc support check error", e);
                        arrayList = AnonymousClass7TE.A1C();
                    }
                    A1C.addAll(arrayList);
                }
            }
        }
        Iterator it2 = Arrays.asList(new Integer[]{1024, 256, 64, 16}).iterator();
        while (it2.hasNext()) {
            A1C.addAll(A02(q4k2, 1, AnonymousClass7TG.A0F(it2), false));
        }
        A1C.addAll(A01(q4k2));
        return A1C;
    }

    public static ArrayList A01(C7334Q4k q4k) {
        String str;
        ArrayList A1C = AnonymousClass7TE.A1C();
        ArrayList A1C2 = AnonymousClass7TE.A1C();
        Integer[] A00 = AnonymousClass05K.A00(3);
        int length = A00.length;
        for (int i = 0; i < length; i++) {
            switch (JTO.A0A(A00, i)) {
                case 1:
                    str = "Main";
                    break;
                case 2:
                    str = "Baseline";
                    break;
                default:
                    str = "High";
                    break;
            }
            A1C2.add(SJA.A00(str));
        }
        Iterator it = A1C2.iterator();
        while (it.hasNext()) {
            SJA sja = (SJA) it.next();
            C7334Q4k q4k2 = q4k;
            if (q4k2 instanceof C7967QeF) {
                UserSession userSession = ((C7967QeF) q4k2).A00;
                if (182.A06(0Tu.A06, userSession, 36315267042905201L)) {
                    AnonymousClass159 A002 = AnonymousClass159.A00();
                    String str2 = A002.A01;
                    if (!"qualcomm".equals(str2) && !"samsung".equals(str2) && !A002.A02) {
                    }
                }
                0Tu r3 = 0Tu.A05;
                if (182.A06(r3, userSession, 36315267042643055L)) {
                    if (182.A06(r3, userSession, 36315267042839664L)) {
                        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                        ActivityManager.getMyMemoryState(runningAppProcessInfo);
                        int i2 = runningAppProcessInfo.lastTrimLevel;
                        boolean z = true;
                        if (i2 == 0 || i2 == 20 || i2 == 40 || i2 == 5 || i2 == 60 || i2 == 10) {
                            z = false;
                        }
                        if (z) {
                            0wb.A03("OsMemoryState", 002.A10("level: ", ", importance: ", ", ", ", lru: ", i2, runningAppProcessInfo.importance, runningAppProcessInfo.importanceReasonCode, runningAppProcessInfo.lru));
                        }
                    }
                    if (sja != null) {
                        List asList = Arrays.asList(new Integer[]{Pxe.A0n(), 2});
                        int i3 = sja.A03;
                        if (C66581MXm.A1W(i3, asList)) {
                            SJA sja2 = new SJA(sja.A04, i3, sja.A02, true, false);
                            sja2.A00 = DbS.A04(r3, userSession, 36596742019484262L);
                            A1C.add(sja2);
                        }
                    }
                }
            }
            A1C.add(sja);
        }
        return A1C;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006b, code lost:
        if (X.182.A06(X.0Tu.A05, r2.A00, 36322177645029358L) == false) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0034, code lost:
        if (X.182.A06(X.0Tu.A05, r2.A00, 36322177645094895L) == false) goto L_0x0036;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.ArrayList A02(X.C7334Q4k r5, int r6, int r7, boolean r8) {
        /*
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()
            java.util.ArrayList r0 = X.AnonymousClass7TE.A1C()
            if (r8 == 0) goto L_0x0047
            boolean r1 = r5.A08()
            if (r1 == 0) goto L_0x0088
            boolean r0 = r5 instanceof X.C7967QeF
            if (r0 == 0) goto L_0x0036
            r2 = r5
            X.QeF r2 = (X.C7967QeF) r2
            X.159 r0 = X.AnonymousClass159.A00()
            java.lang.String r1 = r0.A01
            java.lang.String r0 = "mediatek"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0036
            com.instagram.common.session.UserSession r4 = r2.A00
            X.0Tu r2 = X.0Tu.A05
            r0 = 36322177645094895(0x810ad4000127ef, double:3.0336296282033755E-306)
            boolean r1 = X.182.A06(r2, r4, r0)
            r0 = 1
            if (r1 != 0) goto L_0x0037
        L_0x0036:
            r0 = 0
        L_0x0037:
            r2 = r0 ^ 1
            r1 = 1
            java.lang.String r4 = "EncoderCheck"
            X.RFa r0 = X.C8907RFa.CODEC_VIDEO_HEVC     // Catch:{ RuntimeException -> 0x007e }
            java.util.HashSet r0 = X.SMQ.A00(r0, r6, r7, r2, r1)     // Catch:{ RuntimeException -> 0x007e }
            java.util.ArrayList r0 = X.AnonymousClass7TE.A1D(r0)     // Catch:{ RuntimeException -> 0x007e }
            goto L_0x0088
        L_0x0047:
            boolean r0 = r5 instanceof X.C7967QeF
            if (r0 == 0) goto L_0x006d
            r2 = r5
            X.QeF r2 = (X.C7967QeF) r2
            X.159 r0 = X.AnonymousClass159.A00()
            java.lang.String r1 = r0.A01
            java.lang.String r0 = "mediatek"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x006d
            com.instagram.common.session.UserSession r4 = r2.A00
            X.0Tu r2 = X.0Tu.A05
            r0 = 36322177645029358(0x810ad4000027ee, double:3.0336296281619297E-306)
            boolean r1 = X.182.A06(r2, r4, r0)
            r0 = 1
            if (r1 != 0) goto L_0x006e
        L_0x006d:
            r0 = 0
        L_0x006e:
            r2 = r0 ^ 1
            r1 = 0
            java.lang.String r4 = "EncoderCheck"
            X.RFa r0 = X.C8907RFa.CODEC_VIDEO_HEVC     // Catch:{ RuntimeException -> 0x007e }
            java.util.HashSet r0 = X.SMQ.A00(r0, r6, r7, r2, r1)     // Catch:{ RuntimeException -> 0x007e }
            java.util.ArrayList r0 = X.AnonymousClass7TE.A1D(r0)     // Catch:{ RuntimeException -> 0x007e }
            goto L_0x0088
        L_0x007e:
            r1 = move-exception
            java.lang.String r0 = "hevc support check error"
            X.0KC.A0G(r4, r0, r1)
            java.util.ArrayList r0 = X.AnonymousClass7TE.A1C()
        L_0x0088:
            java.util.Iterator r1 = r0.iterator()
        L_0x008c:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x009d
            X.JTT.A1U(r3, r1)
            boolean r0 = r5 instanceof X.C7967QeF
            if (r0 == 0) goto L_0x008c
            X.AnonymousClass159.A00()
            goto L_0x008c
        L_0x009d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SKZ.A02(X.Q4k, int, int, boolean):java.util.ArrayList");
    }
}
