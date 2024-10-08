package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.direct.capabilities.Capabilities;

/* renamed from: X.Mat  reason: case insensitive filesystem */
public final class C66686Mat implements C41831B2m {
    public int A00;
    public FragmentActivity A01;
    public AnonymousClass0iw A02;
    public UserSession A03;
    public AnonymousClass7SU A04;
    public AnonymousClass7S7 A05;
    public boolean A06;
    public final int A07;
    public final Capabilities A08;
    public final C330437Mt A09;
    public final C332647Vv A0A;
    public final C41479Aud A0B;
    public final A44 A0C;
    public final C331617Rr A0D;

    /* JADX WARNING: type inference failed for: r4v0 */
    /* JADX WARNING: type inference failed for: r4v1, types: [X.9uY] */
    /* JADX WARNING: type inference failed for: r4v2 */
    /* JADX WARNING: type inference failed for: r4v3, types: [X.3t3] */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized X.C392289uY CrZ() {
        /*
            r12 = this;
            monitor-enter(r12)
            androidx.fragment.app.FragmentActivity r7 = r12.A01     // Catch:{ all -> 0x0112 }
            com.instagram.common.session.UserSession r8 = r12.A03     // Catch:{ all -> 0x0112 }
            X.0iw r3 = r12.A02     // Catch:{ all -> 0x0112 }
            X.7SU r5 = r12.A04     // Catch:{ all -> 0x0112 }
            boolean r0 = r12.A06     // Catch:{ all -> 0x0112 }
            r4 = 0
            if (r0 != 0) goto L_0x0110
            if (r7 == 0) goto L_0x0110
            if (r8 == 0) goto L_0x0110
            if (r3 == 0) goto L_0x0110
            if (r5 == 0) goto L_0x0110
            int r2 = r12.A00     // Catch:{ all -> 0x0112 }
            r1 = 25
            java.lang.Integer[] r0 = X.AnonymousClass05K.A00(r1)     // Catch:{ all -> 0x0112 }
            int r0 = r0.length     // Catch:{ all -> 0x0112 }
            if (r2 >= r0) goto L_0x0110
            java.lang.Integer[] r2 = X.AnonymousClass05K.A00(r1)     // Catch:{ all -> 0x0112 }
            int r1 = r12.A00     // Catch:{ all -> 0x0112 }
            int r0 = r1 + 1
            r12.A00 = r0     // Catch:{ all -> 0x0112 }
            r0 = r2[r1]     // Catch:{ all -> 0x0112 }
            int r0 = r0.intValue()     // Catch:{ all -> 0x0112 }
            switch(r0) {
                case 0: goto L_0x0104;
                case 1: goto L_0x00fe;
                case 2: goto L_0x007d;
                case 3: goto L_0x0074;
                case 4: goto L_0x004c;
                case 5: goto L_0x00f8;
                case 6: goto L_0x0099;
                case 7: goto L_0x00b7;
                case 8: goto L_0x00b1;
                case 9: goto L_0x010a;
                case 10: goto L_0x0041;
                case 11: goto L_0x00d4;
                case 12: goto L_0x0053;
                case 13: goto L_0x00a5;
                case 14: goto L_0x006b;
                case 15: goto L_0x00f0;
                case 16: goto L_0x00da;
                case 17: goto L_0x00e0;
                case 18: goto L_0x00ab;
                case 19: goto L_0x0062;
                case 20: goto L_0x0093;
                case 21: goto L_0x008d;
                case 22: goto L_0x0086;
                case 23: goto L_0x009f;
                case 24: goto L_0x003a;
                default: goto L_0x0034;
            }     // Catch:{ all -> 0x0112 }
        L_0x0034:
            X.Wub r0 = new X.Wub     // Catch:{ all -> 0x0112 }
            r0.<init>()     // Catch:{ all -> 0x0112 }
            throw r0     // Catch:{ all -> 0x0112 }
        L_0x003a:
            X.DcO r6 = new X.DcO     // Catch:{ all -> 0x0112 }
            r6.<init>(r8)     // Catch:{ all -> 0x0112 }
            goto L_0x010f
        L_0x0041:
            X.4kA r0 = X.AnonymousClass4k9.A00(r8)     // Catch:{ all -> 0x0112 }
            X.9Nv r6 = new X.9Nv     // Catch:{ all -> 0x0112 }
            r6.<init>(r8, r0)     // Catch:{ all -> 0x0112 }
            goto L_0x010f
        L_0x004c:
            X.McC r6 = new X.McC     // Catch:{ all -> 0x0112 }
            r6.<init>(r7, r8)     // Catch:{ all -> 0x0112 }
            goto L_0x010f
        L_0x0053:
            X.7S7 r0 = r12.A05     // Catch:{ all -> 0x0112 }
            if (r0 == 0) goto L_0x005b
            X.3t3 r4 = r0.CBU()     // Catch:{ all -> 0x0112 }
        L_0x005b:
            X.Mc1 r6 = new X.Mc1     // Catch:{ all -> 0x0112 }
            r6.<init>(r7, r8, r4)     // Catch:{ all -> 0x0112 }
            goto L_0x010f
        L_0x0062:
            X.Aud r0 = r12.A0B     // Catch:{ all -> 0x0112 }
            X.9Nx r6 = new X.9Nx     // Catch:{ all -> 0x0112 }
            r6.<init>(r3, r8, r0)     // Catch:{ all -> 0x0112 }
            goto L_0x010f
        L_0x006b:
            X.7Vv r0 = r12.A0A     // Catch:{ all -> 0x0112 }
            X.DcR r6 = new X.DcR     // Catch:{ all -> 0x0112 }
            r6.<init>(r7, r8, r0)     // Catch:{ all -> 0x0112 }
            goto L_0x010f
        L_0x0074:
            X.A44 r0 = r12.A0C     // Catch:{ all -> 0x0112 }
            X.McF r6 = new X.McF     // Catch:{ all -> 0x0112 }
            r6.<init>(r7, r8, r0)     // Catch:{ all -> 0x0112 }
            goto L_0x010f
        L_0x007d:
            X.A44 r0 = r12.A0C     // Catch:{ all -> 0x0112 }
            X.Mc3 r6 = new X.Mc3     // Catch:{ all -> 0x0112 }
            r6.<init>(r7, r8, r0)     // Catch:{ all -> 0x0112 }
            goto L_0x010f
        L_0x0086:
            X.DcQ r6 = new X.DcQ     // Catch:{ all -> 0x0112 }
            r6.<init>(r8)     // Catch:{ all -> 0x0112 }
            goto L_0x010f
        L_0x008d:
            X.Mc5 r6 = new X.Mc5     // Catch:{ all -> 0x0112 }
            r6.<init>(r8)     // Catch:{ all -> 0x0112 }
            goto L_0x010f
        L_0x0093:
            X.Mc4 r6 = new X.Mc4     // Catch:{ all -> 0x0112 }
            r6.<init>(r7, r8)     // Catch:{ all -> 0x0112 }
            goto L_0x010f
        L_0x0099:
            X.McB r6 = new X.McB     // Catch:{ all -> 0x0112 }
            r6.<init>(r7, r8)     // Catch:{ all -> 0x0112 }
            goto L_0x010f
        L_0x009f:
            X.91p r6 = new X.91p     // Catch:{ all -> 0x0112 }
            r6.<init>(r7, r8)     // Catch:{ all -> 0x0112 }
            goto L_0x010f
        L_0x00a5:
            X.Mc2 r6 = new X.Mc2     // Catch:{ all -> 0x0112 }
            r6.<init>(r7, r8)     // Catch:{ all -> 0x0112 }
            goto L_0x010f
        L_0x00ab:
            X.Mc7 r6 = new X.Mc7     // Catch:{ all -> 0x0112 }
            r6.<init>(r7, r3, r8)     // Catch:{ all -> 0x0112 }
            goto L_0x010f
        L_0x00b1:
            X.Mc9 r6 = new X.Mc9     // Catch:{ all -> 0x0112 }
            r6.<init>(r7, r3, r8)     // Catch:{ all -> 0x0112 }
            goto L_0x010f
        L_0x00b7:
            X.7S7 r0 = r12.A05     // Catch:{ all -> 0x0112 }
            if (r0 == 0) goto L_0x00ce
            com.instagram.direct.capabilities.Capabilities r9 = r12.A08     // Catch:{ all -> 0x0112 }
            if (r9 == 0) goto L_0x00ce
            X.7SD r10 = r0.C6Q()     // Catch:{ all -> 0x0112 }
            X.0qQ.A07(r10)     // Catch:{ all -> 0x0112 }
            int r11 = r12.A07     // Catch:{ all -> 0x0112 }
            X.Mc8 r6 = new X.Mc8     // Catch:{ all -> 0x0112 }
            r6.<init>(r7, r8, r9, r10, r11)     // Catch:{ all -> 0x0112 }
            goto L_0x010f
        L_0x00ce:
            X.NWs r6 = new X.NWs     // Catch:{ all -> 0x0112 }
            r6.<init>()     // Catch:{ all -> 0x0112 }
            goto L_0x010f
        L_0x00d4:
            X.DcP r6 = new X.DcP     // Catch:{ all -> 0x0112 }
            r6.<init>(r7, r8)     // Catch:{ all -> 0x0112 }
            goto L_0x010f
        L_0x00da:
            X.Mc6 r6 = new X.Mc6     // Catch:{ all -> 0x0112 }
            r6.<init>(r7, r3, r8)     // Catch:{ all -> 0x0112 }
            goto L_0x010f
        L_0x00e0:
            X.7Mt r0 = r12.A09     // Catch:{ all -> 0x0112 }
            if (r0 == 0) goto L_0x00ea
            X.McD r6 = new X.McD     // Catch:{ all -> 0x0112 }
            r6.<init>(r0)     // Catch:{ all -> 0x0112 }
            goto L_0x010f
        L_0x00ea:
            X.NWs r6 = new X.NWs     // Catch:{ all -> 0x0112 }
            r6.<init>()     // Catch:{ all -> 0x0112 }
            goto L_0x010f
        L_0x00f0:
            X.7Rr r0 = r12.A0D     // Catch:{ all -> 0x0112 }
            X.McA r6 = new X.McA     // Catch:{ all -> 0x0112 }
            r6.<init>(r7, r3, r8, r0)     // Catch:{ all -> 0x0112 }
            goto L_0x010f
        L_0x00f8:
            X.McE r6 = new X.McE     // Catch:{ all -> 0x0112 }
            r6.<init>(r7, r8)     // Catch:{ all -> 0x0112 }
            goto L_0x010f
        L_0x00fe:
            X.Mc0 r6 = new X.Mc0     // Catch:{ all -> 0x0112 }
            r6.<init>(r7, r8)     // Catch:{ all -> 0x0112 }
            goto L_0x010f
        L_0x0104:
            X.Md1 r6 = new X.Md1     // Catch:{ all -> 0x0112 }
            r6.<init>(r7, r3, r8)     // Catch:{ all -> 0x0112 }
            goto L_0x010f
        L_0x010a:
            X.9Nw r6 = new X.9Nw     // Catch:{ all -> 0x0112 }
            r6.<init>(r3, r8, r5)     // Catch:{ all -> 0x0112 }
        L_0x010f:
            r4 = r6
        L_0x0110:
            monitor-exit(r12)
            return r4
        L_0x0112:
            r0 = move-exception
            monitor-exit(r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66686Mat.CrZ():X.9uY");
    }

    public final void E3d() {
    }

    public final synchronized void destroy() {
        this.A06 = true;
        this.A02 = null;
        this.A03 = null;
        this.A01 = null;
        this.A04 = null;
        this.A05 = null;
    }

    public final synchronized void reset() {
        this.A00 = 0;
    }

    public C66686Mat(FragmentActivity fragmentActivity, AnonymousClass0iw r2, UserSession userSession, Capabilities capabilities, C330437Mt r5, C332647Vv r6, C41479Aud aud, A44 a44, AnonymousClass7SU r9, AnonymousClass7S7 r10, C331617Rr r11, int i) {
        this.A01 = fragmentActivity;
        this.A0D = r11;
        this.A08 = capabilities;
        this.A05 = r10;
        this.A03 = userSession;
        this.A02 = r2;
        this.A07 = i;
        this.A09 = r5;
        this.A04 = r9;
        this.A0A = r6;
        this.A0B = aud;
        this.A0C = a44;
    }
}
