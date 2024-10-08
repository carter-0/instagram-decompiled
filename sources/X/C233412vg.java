package X;

import com.instagram.common.session.UserSession;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.2vg  reason: invalid class name and case insensitive filesystem */
public final class C233412vg extends C233422vh {
    public C233462vl A00;
    public final UserSession A01;
    public final AnonymousClass57P A02;
    public final AnonymousClass2rI A03;
    public final C233372vc A04;
    public final C228812mN A05;
    public final C233402vf A06;
    public final Map A07 = new LinkedHashMap();
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C233412vg(com.instagram.common.session.UserSession r18, X.AnonymousClass57P r19, X.AnonymousClass2rI r20, X.C233372vc r21, X.C228812mN r22, X.C233402vf r23, X.C249863kU r24) {
        /*
            r17 = this;
            r0 = 2
            r6 = r22
            X.0qQ.A0B(r6, r0)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36313957077616968(0x81035a00000948, double:3.028430908228766E-306)
            r3 = r18
            boolean r8 = X.182.A06(r2, r3, r0)
            r0 = 36313957077879116(0x81035a0004094c, double:3.0284309083945496E-306)
            boolean r9 = X.182.A06(r2, r3, r0)
            r0 = 36315614935059889(0x8104dc00010db1, double:3.0294793439513255E-306)
            boolean r10 = X.182.A06(r2, r3, r0)
            X.0Tu r4 = X.0Tu.A06
            r0 = 36316113151725524(0x81055000080fd4, double:3.0297944181768306E-306)
            boolean r12 = X.182.A06(r4, r3, r0)
            r11 = 0
            r5 = r17
            r7 = r24
            r13 = r11
            r14 = r11
            r15 = r11
            r16 = r11
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r5.A05 = r6
            r4 = r20
            r5.A03 = r4
            r5.A01 = r3
            r0 = r21
            r5.A04 = r0
            r0 = r23
            r5.A06 = r0
            r0 = r19
            r5.A02 = r0
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r5.A07 = r0
            r0 = 36311852543968034(0x81017000050322, double:3.0270999926749035E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            r5.A0B = r0
            r0 = 36314558373038764(0x8103e600000aac, double:3.028811169874732E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            r5.A09 = r0
            X.2vl r0 = X.C233462vl.A0D
            r5.A00 = r0
            r0 = 36313957077682505(0x81035a00010949, double:3.028430908270212E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            r5.A0A = r0
            r0 = 36313957077944653(0x81035a0005094d, double:3.0284309084359955E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            r5.A08 = r0
            r0 = 36313957078010190(0x81035a0006094e, double:3.0284309084774413E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            r5.A0C = r0
            r0 = 36311852543902497(0x81017000040321, double:3.0270999926334576E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x00a0
            r4.A06 = r5
        L_0x00a0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C233412vg.<init>(com.instagram.common.session.UserSession, X.57P, X.2rI, X.2vc, X.2mN, X.2vf, X.3kU):void");
    }

    public final /* bridge */ /* synthetic */ 1PW A0G(C251373n0 r7, Integer num, Object obj, int i, int i2, int i3) {
        1PW r5;
        String str;
        String str2;
        0qQ.A0B(num, 2);
        AnonymousClass4EB r3 = (AnonymousClass4EB) r7.BTb();
        1Xg r2 = r3.A01;
        if (r2.A06 == 1UQ.A0T || r2.A03()) {
            C233462vl r22 = r3.A03;
            if (r22.A02) {
                if (this.A06.BTe(r22.A09()) == null) {
                    r5 = new 1PW(AnonymousClass05K.A00);
                    r5.A0B = AnonymousClass05K.A0j;
                    r5.A03 = r22.A09();
                    str = "REPLACED_SLOT_TARGET_POSITION_NO_LONGER_VALID";
                } else {
                    r5 = new 1PW(AnonymousClass05K.A0j);
                    r5.A03 = r22.A09();
                    str = "iaa_replace_next_sponsored_item";
                }
                r5.A01(str);
                AnonymousClass57P r0 = this.A02;
                if (r0 != null) {
                    AnonymousClass3VX r4 = r0.A04;
                    int i4 = r5.A03;
                    List A002 = r5.A00();
                    if (r5.A0C == AnonymousClass05K.A00) {
                        str2 = "Insert fail";
                    } else {
                        str2 = "Insert success";
                    }
                    r4.A04(A002, i4, str2);
                }
                return r5;
            }
        }
        return super.A0G(r7, num, obj, i, i2, i3);
    }

    public final boolean A0H(1Xg r4) {
        1UQ r1;
        0qQ.A0B(r4, 0);
        if (r4.A03 || (r1 = r4.A06) == 1UQ.A0T || r4.A03() || r1 == 1UQ.A06 || r1 == 1UQ.A07 || r1 == 1UQ.A08) {
            return true;
        }
        if (r1 != 1UQ.A0Y) {
            return false;
        }
        AnonymousClass1Xn r2 = r4.A05;
        if (1Xi.A02(r2) == null) {
            return false;
        }
        UserSession userSession = this.A01;
        1Xj A022 = 1Xi.A02(r2);
        if (A022 == null) {
            throw new IllegalStateException("Required value was null.");
        } else if (C231122qu.A0R(userSession, A022)) {
            return true;
        } else {
            return false;
        }
    }
}
