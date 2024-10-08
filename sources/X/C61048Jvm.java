package X;

import com.instagram.api.schemas.GraphGuardianContent;
import java.util.List;

/* renamed from: X.Jvm  reason: case insensitive filesystem */
public final class C61048Jvm extends AnonymousClass0T0 {
    public final int A00 = 0;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;
    public final String A08;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C61048Jvm(X.C62520KhB r11, java.util.List r12, int r13) {
        /*
            r10 = this;
            r2 = r11
            r6 = r12
            r5 = 0
            r8 = 0
            r9 = 0
            r1 = r10
            r10.A00 = r9
            r0 = r13 & 1
            if (r0 == 0) goto L_0x000e
            X.0sn r6 = X.0sn.A00
        L_0x000e:
            r0 = r13 & 2
            if (r0 == 0) goto L_0x0034
            X.0sn r7 = X.0sn.A00
        L_0x0014:
            r0 = r13 & 16
            if (r0 == 0) goto L_0x0032
            java.lang.Integer r4 = X.AnonymousClass05K.A01
        L_0x001a:
            r0 = r13 & 32
            if (r0 == 0) goto L_0x0020
            X.KhB r2 = X.C62520KhB.Uninitialized
        L_0x0020:
            r0 = r13 & 64
            if (r0 == 0) goto L_0x0030
            X.KhB r3 = X.C62520KhB.Uninitialized
        L_0x0026:
            r0 = r13 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x002c
            X.0sn r8 = X.0sn.A00
        L_0x002c:
            r1.<init>((X.C62520KhB) r2, (X.C62520KhB) r3, (java.lang.Integer) r4, (java.lang.String) r5, (java.util.List) r6, (java.util.List) r7, (java.util.List) r8, (int) r9)
            return
        L_0x0030:
            r3 = r5
            goto L_0x0026
        L_0x0032:
            r4 = r5
            goto L_0x001a
        L_0x0034:
            r7 = r5
            goto L_0x0014
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61048Jvm.<init>(X.KhB, java.util.List, int):void");
    }

    public static /* synthetic */ C61048Jvm A00(C61048Jvm jvm, C62520KhB khB, C62520KhB khB2, Integer num, String str, List list, List list2, List list3, int i, int i2) {
        int i3 = i2;
        List list4 = list3;
        String str2 = str;
        Integer num2 = num;
        int i4 = i;
        C62520KhB khB3 = khB2;
        List list5 = list2;
        C62520KhB khB4 = khB;
        List list6 = list;
        if ((i2 & 1) != 0) {
            list6 = (List) jvm.A04;
        }
        if ((i2 & 2) != 0) {
            list5 = (List) jvm.A07;
        }
        if ((i2 & 4) != 0) {
            i4 = jvm.A01;
        }
        if ((i2 & 8) != 0) {
            str2 = jvm.A08;
        }
        if ((i2 & 16) != 0) {
            num2 = (Integer) jvm.A02;
        }
        if ((i2 & 32) != 0) {
            khB4 = (C62520KhB) jvm.A03;
        }
        if ((i2 & 64) != 0) {
            khB3 = (C62520KhB) jvm.A05;
        }
        if ((i3 & 128) != 0) {
            list4 = (List) jvm.A06;
        }
        0qQ.A0B(list6, 0);
        C51974G9v.A0d(1, list5, num2, khB4, khB3);
        0qQ.A0B(list4, 7);
        return new C61048Jvm(khB4, khB3, num2, str2, list6, list5, list4, i4);
    }

    public final boolean equals(Object obj) {
        Object obj2;
        Object obj3;
        if (this.A00 != 0) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C61048Jvm)) {
                return false;
            }
            C61048Jvm jvm = (C61048Jvm) obj;
            if (jvm.A00 != 1 || !0qQ.A0K(this.A03, jvm.A03) || this.A01 != jvm.A01 || !0qQ.A0K(this.A04, jvm.A04) || !0qQ.A0K(this.A02, jvm.A02) || !0qQ.A0K(this.A08, jvm.A08) || !0qQ.A0K(this.A05, jvm.A05) || !0qQ.A0K(this.A06, jvm.A06)) {
                return false;
            }
            obj2 = this.A07;
            obj3 = jvm.A07;
        } else if (this == obj) {
            return true;
        } else {
            if (!(obj instanceof C61048Jvm)) {
                return false;
            }
            C61048Jvm jvm2 = (C61048Jvm) obj;
            if (jvm2.A00 != 0 || !0qQ.A0K(this.A04, jvm2.A04) || !0qQ.A0K(this.A07, jvm2.A07) || this.A01 != jvm2.A01 || !0qQ.A0K(this.A08, jvm2.A08) || this.A02 != jvm2.A02 || this.A03 != jvm2.A03 || this.A05 != jvm2.A05) {
                return false;
            }
            obj2 = this.A06;
            obj3 = jvm2.A06;
        }
        if (!0qQ.A0K(obj2, obj3)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        if (this.A00 != 0) {
            return ((((((((((((AnonymousClass7TE.A0K(this.A03) + this.A01) * 31) + AnonymousClass7TG.A0C(this.A04)) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31) + AnonymousClass7TG.A0E(this.A08)) * 31) + AnonymousClass7TG.A0C(this.A05)) * 31) + AnonymousClass7TG.A0C(this.A06)) * 31) + AnonymousClass7TE.A0L(this.A07);
        }
        int A0K = AnonymousClass7TE.A0K(this.A04);
        return AnonymousClass7TE.A0N(this.A06, AnonymousClass7TF.A07(this.A05, AnonymousClass7TF.A07(this.A03, (((((AnonymousClass7TF.A07(this.A07, A0K) + this.A01) * 31) + AnonymousClass7TG.A0E(this.A08)) * 31) + C55070Hbf.A00((Integer) this.A02)) * 31)));
    }

    public C61048Jvm(GraphGuardianContent graphGuardianContent, 1Xj r3, Integer num, Integer num2, Integer num3, String str, List list, int i) {
        0qQ.A0B(list, 1);
        this.A03 = list;
        this.A01 = i;
        this.A04 = r3;
        this.A02 = num;
        this.A08 = str;
        this.A05 = num2;
        this.A06 = graphGuardianContent;
        this.A07 = num3;
    }

    public C61048Jvm(C62520KhB khB, C62520KhB khB2, Integer num, String str, List list, List list2, List list3, int i) {
        AnonymousClass7TG.A1O(list, list2);
        C51974G9v.A1N(num, khB, khB2);
        0qQ.A0B(list3, 8);
        this.A04 = list;
        this.A07 = list2;
        this.A01 = i;
        this.A08 = str;
        this.A02 = num;
        this.A03 = khB;
        this.A05 = khB2;
        this.A06 = list3;
    }
}
