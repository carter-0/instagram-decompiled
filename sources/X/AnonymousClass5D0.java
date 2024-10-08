package X;

import com.instagram.common.session.UserSession;
import java.util.Map;
import java.util.Set;

/* renamed from: X.5D0  reason: invalid class name */
public final class AnonymousClass5D0 implements 2Ag {
    public final UserSession A00;
    public final AnonymousClass0eM A01 = AnonymousClass0eN.A00(0eO.A02, new AnonymousClass9L0(this, 10));
    public final AnonymousClass0eM A02;
    public final AnonymousClass0eM A03;
    public final Map A04;
    public final boolean A05;

    public final void D0Y(1OS r2) {
        0qQ.A0B(r2, 0);
        A00(r2);
    }

    public final void D5W(1OS r3) {
        0qQ.A0B(r3, 0);
        if ((r3 instanceof 1fi) || (r3 instanceof AnonymousClass1fu)) {
            A02(r3.A05);
        }
        Map map = this.A04;
        synchronized (map) {
            map.remove(r3.A05);
        }
    }

    public final void D9f(1OS r3, String str, boolean z) {
        1cE r0;
        String str2;
        0qQ.A0B(r3, 0);
        if (this.A05) {
            Map map = this.A04;
            synchronized (map) {
                if (!(!(r3 instanceof 1cE) || (r0 = (1cE) r3) == null || (str2 = r0.A0K) == null)) {
                    map.put(str2, r3);
                }
            }
        }
    }

    public final /* synthetic */ void D9g(1OS r1, boolean z) {
    }

    public final void DB7(1OS r2) {
        0qQ.A0B(r2, 0);
        A00(r2);
    }

    public final void DTK(0xF r1, 1OS r2, boolean z) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0069, code lost:
        if (r6 == null) goto L_0x006b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DTL(X.0xF r30, X.1OS r31, X.C270214gN r32, boolean r33) {
        /*
            r29 = this;
            r14 = 0
            r1 = r31
            X.0qQ.A0B(r1, r14)
            r12 = 3
            r0 = r30
            X.0qQ.A0B(r0, r12)
            r0 = r29
            r0.A00(r1)
            X.0eM r0 = r0.A01
            java.lang.Object r11 = r0.getValue()
            X.5D7 r11 = (X.AnonymousClass5D7) r11
            java.lang.String r10 = r1.A05
            r13 = r32
            if (r32 == 0) goto L_0x006b
            r21 = 0
            X.Nku r9 = r13.A01
            java.lang.String r8 = r13.A03
            java.lang.String r0 = r13.A06
            r18 = r0
            java.lang.String r7 = r13.A05
            boolean r0 = r13.A0B
            r16 = r0
            boolean r15 = r13.A0C
            java.lang.String r6 = r13.A07
            java.lang.String r5 = r13.A02
            boolean r4 = r13.A0A
            X.3sQ r3 = r13.A00
            boolean r2 = r13.A09
            boolean r1 = r13.A08
            boolean r0 = r13.A0D
            X.0qQ.A0B(r9, r14)
            r14 = 1
            X.0qQ.A0B(r8, r14)
            X.0qQ.A0B(r7, r12)
            X.4gN r14 = new X.4gN
            r27 = r1
            r28 = r0
            r23 = r16
            r24 = r15
            r25 = r4
            r26 = r2
            r19 = r7
            r20 = r6
            r22 = r5
            r16 = r9
            r17 = r8
            r15 = r3
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            java.lang.String r6 = r14.toString()
            if (r6 != 0) goto L_0x006d
        L_0x006b:
            java.lang.String r6 = ""
        L_0x006d:
            r5 = 1
            if (r32 == 0) goto L_0x00a7
            java.lang.String r0 = r13.A06
            if (r0 == 0) goto L_0x00a7
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x00a7
        L_0x007a:
            java.util.Map r4 = r11.A02
            java.lang.Object r0 = r4.get(r10)
            X.OGj r0 = (X.C70688OGj) r0
            if (r0 == 0) goto L_0x00a6
            X.02m r3 = r11.A01
            int r2 = r0.A02
            r1 = 814299525(0x30893985, float:9.98441E-10)
            r0 = 1339(0x53b, float:1.876E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r3.markerAnnotate(r1, r2, r0, r6)
            if (r5 == 0) goto L_0x00a6
            r3.markerEnd(r1, r2, r12)
            r4.remove(r10)
            java.util.Set r0 = r11.A03
            r0.remove(r10)
            java.util.Set r0 = r11.A04
            r0.remove(r10)
        L_0x00a6:
            return
        L_0x00a7:
            r5 = 0
            goto L_0x007a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5D0.DTL(X.0xF, X.1OS, X.4gN, boolean):void");
    }

    public final void DTP(0xF r1, 1OS r2) {
    }

    public final void DYZ(String str, String str2, String str3) {
        0qQ.A0B(str, 0);
        if (str2 != null && str2.length() != 0 && str3 != null && str3.length() != 0) {
            Map map = this.A04;
            synchronized (map) {
                1cE r0 = (1cE) map.get(str);
                if (r0 != null) {
                    r0.A0I = str2;
                    r0.A0H = str3;
                }
            }
        }
    }

    public final void Dfi(1OS r1, String str, boolean z) {
    }

    private final void A00(1OS r4) {
        Map map = this.A04;
        synchronized (map) {
            1cE r1 = (1cE) map.get(r4.A05);
            if (r1 != null) {
                r1.A0K = null;
            }
            map.remove(r4.A05);
        }
    }

    public final void A01(String str) {
        1bp r1;
        Map map = this.A04;
        synchronized (map) {
            Object obj = map.get(str);
            if ((obj instanceof 1bp) && (r1 = (1bp) obj) != null) {
                str = r1.A05;
            }
        }
        AnonymousClass5D7 r12 = (AnonymousClass5D7) this.A01.getValue();
        C70688OGj oGj = (C70688OGj) r12.A02.get(str);
        if (oGj != null) {
            r12.A01.markerPoint(814299525, oGj.A02, "image_send");
        }
    }

    public final void A02(String str) {
        1bp r1;
        Map map = this.A04;
        synchronized (map) {
            Object obj = map.get(str);
            if ((obj instanceof 1bp) && (r1 = (1bp) obj) != null) {
                str = r1.A05;
            }
        }
        AnonymousClass5D7 r2 = (AnonymousClass5D7) this.A01.getValue();
        C70688OGj oGj = (C70688OGj) r2.A02.get(str);
        if (oGj != null) {
            Set set = r2.A03;
            if (!set.contains(str)) {
                set.add(str);
                r2.A01.markerPoint(814299525, oGj.A02, "image_sent");
            }
        }
    }

    public final void DYd(1OS r2, String str, String str2) {
        if (r2 != null) {
            DYZ(r2.A05, str, str2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0035, code lost:
        if (X.182.A06(r2, r5, 36327494814546395L) != false) goto L_0x0037;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass5D0(com.instagram.common.session.UserSession r5) {
        /*
            r4 = this;
            r4.<init>()
            r4.A00 = r5
            X.0eO r2 = X.0eO.A02
            r1 = 10
            X.9L0 r0 = new X.9L0
            r0.<init>(r4, r1)
            X.0eM r0 = X.AnonymousClass0eN.A00(r2, r0)
            r4.A01 = r0
            X.0eO r3 = X.0eO.A03
            X.5D1 r0 = X.AnonymousClass5D1.A00
            X.0eM r0 = X.AnonymousClass0eN.A00(r3, r0)
            r4.A03 = r0
            X.0Tu r2 = X.0Tu.A06
            r0 = 36325742469002428(0x810e12001134bc, double:3.035884037196893E-306)
            boolean r0 = X.182.A06(r2, r5, r0)
            if (r0 != 0) goto L_0x0037
            r0 = 36327494814546395(0x810faa000039db, double:3.036992227575027E-306)
            boolean r1 = X.182.A06(r2, r5, r0)
            r0 = 0
            if (r1 == 0) goto L_0x0038
        L_0x0037:
            r0 = 1
        L_0x0038:
            r4.A05 = r0
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r4.A04 = r0
            r1 = 11
            X.9L0 r0 = new X.9L0
            r0.<init>(r4, r1)
            X.0eM r0 = X.AnonymousClass0eN.A00(r3, r0)
            r4.A02 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5D0.<init>(com.instagram.common.session.UserSession):void");
    }
}
