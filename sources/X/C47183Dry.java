package X;

import com.instagram.opal.impl.data.OpalProfileData;

/* renamed from: X.Dry  reason: case insensitive filesystem */
public final class C47183Dry extends AnonymousClass0T0 {
    public final int A00;
    public final C61052Jvq A01;
    public final C61064Jw2 A02;
    public final C61064Jw2 A03;
    public final OpalProfileData A04;
    public final OpalProfileData A05;
    public final C62520KhB A06;
    public final Integer A07;
    public final AnonymousClass62P A08;
    public final boolean A09;
    public final boolean A0A;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C47183Dry) {
                C47183Dry dry = (C47183Dry) obj;
                if (!0qQ.A0K(this.A05, dry.A05) || !0qQ.A0K(this.A04, dry.A04) || !0qQ.A0K(this.A03, dry.A03) || !0qQ.A0K(this.A02, dry.A02) || !0qQ.A0K(this.A01, dry.A01) || !0qQ.A0K(this.A08, dry.A08) || this.A00 != dry.A00 || this.A0A != dry.A0A || this.A07 != dry.A07 || this.A09 != dry.A09 || this.A06 != dry.A06) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ C47183Dry A00(C61052Jvq jvq, OpalProfileData opalProfileData, OpalProfileData opalProfileData2, C62520KhB khB, C47183Dry dry, Integer num, int i, int i2, boolean z, boolean z2) {
        C61064Jw2 jw2;
        C61064Jw2 jw22;
        C62520KhB khB2 = khB;
        boolean z3 = z2;
        Integer num2 = num;
        boolean z4 = z;
        int i3 = i;
        C61052Jvq jvq2 = jvq;
        OpalProfileData opalProfileData3 = opalProfileData2;
        OpalProfileData opalProfileData4 = opalProfileData;
        AnonymousClass62P r10 = null;
        int i4 = i2;
        C47183Dry dry2 = dry;
        if ((i2 & 1) != 0) {
            opalProfileData4 = dry2.A05;
        }
        if ((i2 & 2) != 0) {
            opalProfileData3 = dry2.A04;
        }
        if ((i2 & 4) != 0) {
            jw2 = dry2.A03;
        } else {
            jw2 = null;
        }
        if ((i2 & 8) != 0) {
            jw22 = dry2.A02;
        } else {
            jw22 = null;
        }
        if ((i2 & 16) != 0) {
            jvq2 = dry2.A01;
        }
        if ((i2 & 32) != 0) {
            r10 = dry2.A08;
        }
        if ((i2 & 64) != 0) {
            i3 = dry2.A00;
        }
        if ((i4 & 128) != 0) {
            z4 = dry2.A0A;
        }
        if ((i4 & 256) != 0) {
            num2 = dry2.A07;
        }
        if ((i4 & 512) != 0) {
            z3 = dry2.A09;
        }
        if ((i4 & 1024) != 0) {
            khB2 = dry2.A06;
        }
        0qQ.A0B(opalProfileData4, 0);
        AnonymousClass7TG.A1U(opalProfileData3, jw2, jw22);
        AnonymousClass7TF.A1F(r10, 5, num2);
        0qQ.A0B(khB2, 10);
        return new C47183Dry(jvq2, jw2, jw22, opalProfileData4, opalProfileData3, khB2, num2, r10, i3, z4, z3);
    }

    public final int hashCode() {
        String str;
        int A072 = AnonymousClass7TF.A07(this.A03, AnonymousClass7TF.A07(this.A04, AnonymousClass7TE.A0K(this.A05)));
        AnonymousClass62P r0 = this.A08;
        int A092 = AnonymousClass7TF.A09(this.A0A, (AnonymousClass7TF.A07(r0, (AnonymousClass7TF.A07(this.A02, A072) + AnonymousClass7TG.A0C(this.A01)) * 31) + this.A00) * 31);
        int intValue = this.A07.intValue();
        switch (intValue) {
            case 1:
                str = "Delight";
                break;
            case 2:
                str = "None";
                break;
            default:
                str = "Tease";
                break;
        }
        return AnonymousClass7TE.A0N(this.A06, AnonymousClass7TF.A09(this.A09, (A092 + str.hashCode() + intValue) * 31));
    }

    public C47183Dry(C61052Jvq jvq, C61064Jw2 jw2, C61064Jw2 jw22, OpalProfileData opalProfileData, OpalProfileData opalProfileData2, C62520KhB khB, Integer num, AnonymousClass62P r8, int i, boolean z, boolean z2) {
        this.A05 = opalProfileData;
        this.A04 = opalProfileData2;
        this.A03 = jw2;
        this.A02 = jw22;
        this.A01 = jvq;
        this.A08 = r8;
        this.A00 = i;
        this.A0A = z;
        this.A07 = num;
        this.A09 = z2;
        this.A06 = khB;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C47183Dry() {
        /*
            r24 = this;
            r6 = 0
            r9 = 0
            java.lang.String r2 = ""
            X.KhB r1 = X.C62520KhB.Uninitialized
            X.0sn r8 = X.0sn.A00
            com.instagram.opal.impl.data.OpalProfileData r0 = new com.instagram.opal.impl.data.OpalProfileData
            r3 = r2
            r4 = r2
            r5 = r2
            r7 = r2
            r10 = r9
            r11 = r9
            r12 = r9
            r13 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            com.instagram.opal.impl.data.OpalProfileData r10 = new com.instagram.opal.impl.data.OpalProfileData
            r11 = r1
            r12 = r2
            r13 = r2
            r14 = r2
            r15 = r2
            r16 = r6
            r17 = r2
            r18 = r8
            r19 = r9
            r20 = r9
            r21 = r9
            r22 = r9
            r23 = r9
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            r7 = 15
            r8 = 4
            X.Jw2 r13 = new X.Jw2
            r2 = r13
            r3 = r6
            r4 = r6
            r5 = r6
            r2.<init>((X.C62520KhB) r3, (java.lang.String) r4, (java.util.List) r5, (kotlin.jvm.internal.DefaultConstructorMarker) r6, (int) r7, (int) r8, (boolean) r9)
            X.Jw2 r14 = new X.Jw2
            r2 = r14
            r2.<init>((X.C62520KhB) r3, (java.lang.String) r4, (java.util.List) r5, (kotlin.jvm.internal.DefaultConstructorMarker) r6, (int) r7, (int) r8, (boolean) r9)
            X.62M r19 = X.AnonymousClass62M.A01
            java.lang.Integer r18 = X.AnonymousClass05K.A0C
            r11 = r24
            r12 = r6
            r15 = r0
            r16 = r10
            r17 = r1
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47183Dry.<init>():void");
    }
}
