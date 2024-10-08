package X;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.Xsv  reason: case insensitive filesystem */
public abstract class C22020Xsv {
    public static int A00(C256633w6 r11, C256733wG r12, long j) {
        AnonymousClass4XE A00;
        if (r12 == null || (A00 = r12.A00()) == null) {
            return 0;
        }
        long A002 = r11.A00(0);
        long B6B = A00.B6B();
        long max = Math.max(0, (B6B + A00.BrO(A002)) - 1);
        int BrS = (int) A00.BrS(Math.max(A00.C7P(B6B), (A00.C7P(max) + A00.AzV(max, A002)) - j), A002);
        27B.A01("Exo2DashManifestWrapper", "prefetch: lastSegNum:%d first:%d prefetchStart:%d edgeLatencyMs:%d", new Object[]{Long.valueOf(max), Long.valueOf(B6B), Integer.valueOf(BrS), Long.valueOf(j / 1000)});
        return BrS;
    }

    /* JADX WARNING: type inference failed for: r0v6, types: [java.lang.Object, java.util.Comparator] */
    public static C256973we A01(28w r14, C256633w6 r15, String str, List list) {
        int A02;
        List list2 = list;
        if (list == null) {
            return null;
        }
        ArrayList A1C = AnonymousClass7TE.A1C();
        if (list2.isEmpty()) {
            return null;
        }
        if (list2.size() == 1) {
            A1C.add(C256963wd.SINGLE_FORMAT);
            return new C256973we(((C256733wG) list2.get(0)).A02, A1C, -1, 0, 0);
        }
        C256683wB[] A00 = C256993wg.A00(list2);
        C256923wZ r9 = new C256923wZ(r15.A01(), r15.A03(), r15.A04());
        if (A00.length == 0) {
            return null;
        }
        ArrayList A1C2 = AnonymousClass7TE.A1C();
        boolean A022 = C256933wa.A02(A00[0]);
        28w r4 = r14;
        if (A022) {
            A02 = 0;
        } else {
            A02 = r14.A03.A02((String) null, (String) null, (ArrayList) null, A00);
        }
        Arrays.sort(A00, new Object());
        int A05 = r14.A03.A05(A00);
        C250843m9 r6 = new C250843m9();
        290 r7 = new 290(r4.A01, r4.A09, r6, r4.A02.A00());
        214 r62 = 214.A06;
        int A002 = 28w.A00(r4, A022);
        C265434Tv r8 = new C265434Tv();
        r8.A01 = 0;
        r8.A02 = 0;
        r8.A03 = 0;
        r8.A04 = r62;
        r8.A00 = A002;
        AnonymousClass4U4 ASx = r7.ASx(r8, r9, (C256683wB) null, (Map) null, A00, A02, A05);
        C256683wB r11 = ASx.A01;
        if (!A022) {
            r4.A0D = r11;
        }
        long j = ASx.A00;
        A1C2.add(C256963wd.SYSTEMIC_RISK);
        28g r0 = r4.A04;
        if (r0 != null) {
            r0.A01.EgR(str, r11.A0T);
        }
        return new C256973we(r11, A1C2, 50, j, j);
    }

    public static void A03(28X r16, C252463p9 r17, C256633w6 r18, C256733wG r19, String str, List list, int i) {
        AnonymousClass4XE A00;
        Uri A002;
        C256733wG r4 = r19;
        if (r19 != null && (A00 = r4.A00()) != null) {
            int i2 = i;
            if (i >= 0) {
                long j = (long) i2;
                long B6B = A00.B6B();
                if (j >= B6B && j <= (B6B + A00.BrO(0)) - 1) {
                    String A03 = r4.A03();
                    C256573vz BrV = A00.BrV(j);
                    if (BrV != null && (A002 = BrV.A00(A03)) != null) {
                        if (r16.A01(A002, str) == null) {
                            27B.A01("Exo2DashManifestWrapper", "Enqueue dash live init segment uri: %s", new Object[]{A002});
                            int BeW = r4 instanceof AnonymousClass4XD ? ((AnonymousClass4XD) r4).BeW(j) : -1;
                            List list2 = list;
                            list2.add(new Xb8(A002, r17, r4.A02, r4.A02(), (int) (A00.C7P(j) / 1000), (int) (A00.AzV(j, r18.A00(0)) / 1000), BeW, false));
                        }
                    }
                }
            }
        }
    }

    public static C256733wG A02(C256683wB r4, List list) {
        if (r4 == null || list == null) {
            return null;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C256733wG r2 = (C256733wG) it.next();
            String str = r2.A02.A0T;
            if (str != null && str.equals(r4.A0T)) {
                return r2;
            }
        }
        return null;
    }

    public static void A04(28X r7, C252463p9 r8, C256733wG r9, String str, List list) {
        C256573vz r1;
        if (r9 != null && (r1 = r9.A03) != null) {
            Uri A00 = r1.A00(r9.A03());
            if (r7.A01(A00, str) == null) {
                27B.A01("Exo2DashManifestWrapper", "Enqueue dash live init segment uri: %s", new Object[]{A00});
                C252463p9 r4 = r8;
                list.add(new Xb8(A00, r4, r9.A02, r9.A02(), 0, 0, -1, true));
            }
        }
    }
}
