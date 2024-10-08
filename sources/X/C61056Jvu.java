package X;

import java.util.Map;
import java.util.Set;

/* renamed from: X.Jvu  reason: case insensitive filesystem */
public final class C61056Jvu extends AnonymousClass0T0 {
    public final int A00 = 1;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final String A07;
    public final boolean A08;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C61056Jvu(X.1Xj r1, java.lang.Integer r2, java.lang.Integer r3, java.lang.String r4, java.util.Map r5, java.util.Set r6, kotlin.jvm.internal.DefaultConstructorMarker r7, int r8, int r9, int r10, boolean r11) {
        /*
            r0 = this;
            r8 = 0
            r0.A00 = r8
            java.lang.Integer r2 = X.AnonymousClass05K.A0N
            r1 = 0
            X.0sm r5 = X.0Yt.A0E()
            X.0sl r6 = X.0sl.A00
            r7 = -1
            r3 = r2
            r4 = r1
            r0.<init>((X.1Xj) r1, (java.lang.Integer) r2, (java.lang.Integer) r3, (java.lang.String) r4, (java.util.Map) r5, (java.util.Set) r6, (int) r7, (boolean) r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61056Jvu.<init>(X.1Xj, java.lang.Integer, java.lang.Integer, java.lang.String, java.util.Map, java.util.Set, kotlin.jvm.internal.DefaultConstructorMarker, int, int, int, boolean):void");
    }

    public static /* synthetic */ C61056Jvu A00(C61056Jvu jvu, 1Xj r11, Integer num, Integer num2, String str, Map map, Set set, int i, int i2, boolean z) {
        int i3 = i2;
        boolean z2 = z;
        Set set2 = set;
        int i4 = i;
        Integer num3 = num2;
        String str2 = str;
        Map map2 = map;
        1Xj r2 = r11;
        Integer num4 = num;
        if ((i2 & 1) != 0) {
            num4 = (Integer) jvu.A03;
        }
        if ((i2 & 2) != 0) {
            r2 = (1Xj) jvu.A04;
        }
        if ((i2 & 4) != 0) {
            map2 = (Map) jvu.A02;
        }
        if ((i2 & 8) != 0) {
            num3 = (Integer) jvu.A06;
        }
        if ((i2 & 16) != 0) {
            str2 = jvu.A07;
        }
        if ((i2 & 32) != 0) {
            set2 = (Set) jvu.A05;
        }
        if ((i2 & 64) != 0) {
            z2 = jvu.A08;
        }
        if ((i3 & 128) != 0) {
            i4 = jvu.A01;
        }
        DbZ.A0t(0, num4, map2, num3);
        0qQ.A0B(set2, 5);
        return new C61056Jvu(r2, num4, num3, str2, map2, set2, i4, z2);
    }

    public final boolean equals(Object obj) {
        int i;
        if (this.A00 != 0) {
            if (this == obj) {
                return true;
            }
            i = 1;
        } else if (this == obj) {
            return true;
        } else {
            i = 0;
        }
        if (!(obj instanceof C61056Jvu)) {
            return false;
        }
        C61056Jvu jvu = (C61056Jvu) obj;
        if (jvu.A00 == i && this.A03 == jvu.A03 && 0qQ.A0K(this.A04, jvu.A04) && 0qQ.A0K(this.A02, jvu.A02) && this.A06 == jvu.A06 && 0qQ.A0K(this.A07, jvu.A07) && 0qQ.A0K(this.A05, jvu.A05) && this.A08 == jvu.A08 && this.A01 == jvu.A01) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int A072;
        int i = this.A00;
        Integer num = (Integer) this.A03;
        if (i != 0) {
            A072 = ((AnonymousClass7TF.A07(this.A02, ((C63057Kqm.A00(num) * 31) + AnonymousClass7TG.A0C(this.A04)) * 31) + C63056Kql.A00((Integer) this.A06)) * 31) + C41845B3m.A00(this.A07);
        } else {
            A072 = ((AnonymousClass7TF.A07(this.A02, ((C63057Kqm.A00(num) * 31) + AnonymousClass7TG.A0C(this.A04)) * 31) + C63056Kql.A00((Integer) this.A06)) * 31) + C41845B3m.A00(this.A07);
        }
        return AnonymousClass7TF.A09(this.A08, AnonymousClass7TF.A07(this.A05, A072 * 31)) + this.A01;
    }

    public C61056Jvu(1Xj r2, Integer num, Integer num2, String str, Map map, Set set, int i, boolean z) {
        this.A03 = num;
        this.A04 = r2;
        this.A02 = map;
        this.A06 = num2;
        this.A07 = str;
        this.A05 = set;
        this.A08 = z;
        this.A01 = i;
    }

    public C61056Jvu(C66709MbG mbG, Integer num, Integer num2, String str, AnonymousClass62P r6, YCQ ycq, int i, boolean z) {
        AnonymousClass7TG.A0w(1, num, r6, num2);
        0qQ.A0B(ycq, 6);
        this.A03 = num;
        this.A04 = mbG;
        this.A02 = r6;
        this.A06 = num2;
        this.A07 = str;
        this.A05 = ycq;
        this.A08 = z;
        this.A01 = i;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C61056Jvu() {
        /*
            r10 = this;
            r0 = 1
            r1 = r10
            r10.A00 = r0
            java.lang.Integer r3 = X.AnonymousClass05K.A0N
            r2 = 0
            X.62M r6 = X.AnonymousClass62M.A01
            X.XDv r7 = X.C21082XDv.A03
            r9 = 0
            r8 = -1
            r4 = r3
            r5 = r2
            r1.<init>((X.C66709MbG) r2, (java.lang.Integer) r3, (java.lang.Integer) r4, (java.lang.String) r5, (X.AnonymousClass62P) r6, (X.YCQ) r7, (int) r8, (boolean) r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61056Jvu.<init>():void");
    }
}
