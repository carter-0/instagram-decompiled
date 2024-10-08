package X;

import android.view.View;
import com.instagram.business.boost.mediapicker.model.BoostMediaPickerTabType;
import java.util.List;

/* renamed from: X.Jw6  reason: case insensitive filesystem */
public final class C61068Jw6 extends AnonymousClass0T0 {
    public boolean A00;
    public boolean A01;
    public final int A02 = 6;
    public final Object A03;
    public final Object A04;
    public final Object A05;

    public static final C61068Jw6 A00(BoostMediaPickerTabType boostMediaPickerTabType, BoostMediaPickerTabType boostMediaPickerTabType2, C16492Uvn uvn, boolean z, boolean z2) {
        AnonymousClass7TG.A0w(0, uvn, boostMediaPickerTabType, boostMediaPickerTabType2);
        return new C61068Jw6(boostMediaPickerTabType, boostMediaPickerTabType2, uvn, z, z2);
    }

    public static final C61068Jw6 A01(C54650HMh hMh, Boolean bool, AnonymousClass62P r3, boolean z, boolean z2) {
        0qQ.A0B(r3, 3);
        return new C61068Jw6(hMh, bool, r3, z, z2);
    }

    public static boolean A02(int i, Object obj) {
        if (!(obj instanceof C61068Jw6) || ((C61068Jw6) obj).A02 != i) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:105:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0094, code lost:
        if (r1 != r0) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x009a, code lost:
        if (r2.A03 == r3.A03) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00e6, code lost:
        r1 = r2.A05;
        r0 = r3.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00ee, code lost:
        if (X.0qQ.A0K(r1, r0) != false) goto L_0x0123;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0123, code lost:
        r1 = r2.A00;
        r0 = r3.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x014f, code lost:
        if (X.0qQ.A0K(r1, r0) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0155, code lost:
        if (r2.A00 != r3.A00) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0157, code lost:
        r1 = r2.A01;
        r0 = r3.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x015b, code lost:
        if (r1 == r0) goto L_?;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            int r0 = r2.A02
            switch(r0) {
                case 0: goto L_0x002c;
                case 1: goto L_0x004e;
                case 2: goto L_0x0073;
                case 3: goto L_0x00c3;
                case 4: goto L_0x009d;
                case 5: goto L_0x0128;
                case 6: goto L_0x00f2;
                default: goto L_0x0005;
            }
        L_0x0005:
            if (r2 == r3) goto L_0x015f
            r0 = 7
            boolean r0 = A02(r0, r3)
            if (r0 == 0) goto L_0x002a
            X.Jw6 r3 = (X.C61068Jw6) r3
            java.lang.Object r1 = r2.A03
            java.lang.Object r0 = r3.A03
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x002a
            java.lang.Object r1 = r2.A04
            java.lang.Object r0 = r3.A04
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x002a
            boolean r1 = r2.A01
            boolean r0 = r3.A01
            if (r1 == r0) goto L_0x00e6
        L_0x002a:
            r0 = 0
            return r0
        L_0x002c:
            if (r2 == r3) goto L_0x015f
            r0 = 0
            boolean r0 = A02(r0, r3)
            if (r0 == 0) goto L_0x002a
            X.Jw6 r3 = (X.C61068Jw6) r3
            java.lang.Object r1 = r2.A05
            java.lang.Object r0 = r3.A05
            if (r1 != r0) goto L_0x002a
            boolean r1 = r2.A00
            boolean r0 = r3.A00
            if (r1 != r0) goto L_0x002a
            boolean r1 = r2.A01
            boolean r0 = r3.A01
            if (r1 != r0) goto L_0x002a
            java.lang.Object r1 = r2.A04
            java.lang.Object r0 = r3.A04
            goto L_0x0094
        L_0x004e:
            if (r2 == r3) goto L_0x015f
            r0 = 1
            boolean r0 = A02(r0, r3)
            if (r0 == 0) goto L_0x002a
            X.Jw6 r3 = (X.C61068Jw6) r3
            java.lang.Object r1 = r2.A03
            java.lang.Object r0 = r3.A03
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x002a
            java.lang.Object r1 = r2.A05
            java.lang.Object r0 = r3.A05
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x002a
            java.lang.Object r1 = r2.A04
            java.lang.Object r0 = r3.A04
            goto L_0x014b
        L_0x0073:
            if (r2 == r3) goto L_0x015f
            r0 = 2
            boolean r0 = A02(r0, r3)
            if (r0 == 0) goto L_0x002a
            X.Jw6 r3 = (X.C61068Jw6) r3
            boolean r1 = r2.A00
            boolean r0 = r3.A00
            if (r1 != r0) goto L_0x002a
            boolean r1 = r2.A01
            boolean r0 = r3.A01
            if (r1 != r0) goto L_0x002a
            java.lang.Object r1 = r2.A04
            java.lang.Object r0 = r3.A04
            if (r1 != r0) goto L_0x002a
            java.lang.Object r1 = r2.A05
            java.lang.Object r0 = r3.A05
        L_0x0094:
            if (r1 != r0) goto L_0x002a
            java.lang.Object r1 = r2.A03
            java.lang.Object r0 = r3.A03
            if (r1 == r0) goto L_0x015f
            goto L_0x002a
        L_0x009d:
            if (r2 == r3) goto L_0x015f
            r0 = 4
            boolean r0 = A02(r0, r3)
            if (r0 == 0) goto L_0x002a
            X.Jw6 r3 = (X.C61068Jw6) r3
            java.lang.Object r1 = r2.A04
            java.lang.Object r0 = r3.A04
            if (r1 != r0) goto L_0x002a
            boolean r1 = r2.A01
            boolean r0 = r3.A01
            if (r1 != r0) goto L_0x002a
            java.lang.Object r1 = r2.A05
            java.lang.Object r0 = r3.A05
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x002a
            java.lang.Object r1 = r2.A03
            java.lang.Object r0 = r3.A03
            goto L_0x00ea
        L_0x00c3:
            if (r2 == r3) goto L_0x015f
            r0 = 3
            boolean r0 = A02(r0, r3)
            if (r0 == 0) goto L_0x002a
            X.Jw6 r3 = (X.C61068Jw6) r3
            boolean r1 = r2.A01
            boolean r0 = r3.A01
            if (r1 != r0) goto L_0x002a
            java.lang.Object r1 = r2.A03
            java.lang.Object r0 = r3.A03
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x002a
            java.lang.Object r1 = r2.A04
            java.lang.Object r0 = r3.A04
            if (r1 == r0) goto L_0x00e6
            goto L_0x002a
        L_0x00e6:
            java.lang.Object r1 = r2.A05
            java.lang.Object r0 = r3.A05
        L_0x00ea:
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x0123
            goto L_0x002a
        L_0x00f2:
            if (r2 == r3) goto L_0x015f
            r0 = 6
            boolean r0 = A02(r0, r3)
            if (r0 == 0) goto L_0x002a
            X.Jw6 r3 = (X.C61068Jw6) r3
            java.lang.Object r1 = r2.A05
            java.lang.Object r0 = r3.A05
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x002a
            java.lang.Object r1 = r2.A03
            java.lang.Object r0 = r3.A03
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x002a
            java.lang.Object r1 = r2.A04
            java.lang.Object r0 = r3.A04
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x002a
            boolean r1 = r2.A01
            boolean r0 = r3.A01
            if (r1 == r0) goto L_0x0123
            goto L_0x002a
        L_0x0123:
            boolean r1 = r2.A00
            boolean r0 = r3.A00
            goto L_0x015b
        L_0x0128:
            if (r2 == r3) goto L_0x015f
            r0 = 5
            boolean r0 = A02(r0, r3)
            if (r0 == 0) goto L_0x002a
            X.Jw6 r3 = (X.C61068Jw6) r3
            java.lang.Object r1 = r2.A05
            java.lang.Object r0 = r3.A05
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x002a
            java.lang.Object r1 = r2.A04
            java.lang.Object r0 = r3.A04
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x002a
            java.lang.Object r1 = r2.A03
            java.lang.Object r0 = r3.A03
        L_0x014b:
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x002a
            boolean r1 = r2.A00
            boolean r0 = r3.A00
            if (r1 != r0) goto L_0x002a
            boolean r1 = r2.A01
            boolean r0 = r3.A01
        L_0x015b:
            if (r1 == r0) goto L_0x015f
            goto L_0x002a
        L_0x015f:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61068Jw6.equals(java.lang.Object):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002b, code lost:
        return r3 + r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00ea, code lost:
        r3 = X.AnonymousClass7TF.A09(r4.A00, X.AnonymousClass7TF.A07(r1, r2));
        r2 = r4.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0017, code lost:
        r3 = r2 * 31;
        r1 = r4.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x001b, code lost:
        r1 = r1.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001f, code lost:
        r3 = (r3 + r1) * 31;
        r2 = r4.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0024, code lost:
        r1 = 1237;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0026, code lost:
        if (r2 == false) goto L_0x002a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0028, code lost:
        r1 = 1231;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int hashCode() {
        /*
            r4 = this;
            int r1 = r4.A02
            switch(r1) {
                case 0: goto L_0x00f8;
                case 1: goto L_0x00dc;
                case 2: goto L_0x0094;
                case 3: goto L_0x007d;
                case 4: goto L_0x005c;
                case 5: goto L_0x0047;
                case 6: goto L_0x002c;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r1 = r4.A03
            int r2 = X.AnonymousClass7TE.A0K(r1)
            java.lang.Object r1 = r4.A04
            int r2 = X.AnonymousClass7TF.A07(r1, r2)
            boolean r1 = r4.A01
            int r2 = X.DbS.A06(r1, r2)
        L_0x0017:
            int r3 = r2 * 31
            java.lang.Object r1 = r4.A05
        L_0x001b:
            int r1 = r1.hashCode()
        L_0x001f:
            int r3 = r3 + r1
            int r3 = r3 * 31
            boolean r2 = r4.A00
        L_0x0024:
            r1 = 1237(0x4d5, float:1.733E-42)
            if (r2 == 0) goto L_0x002a
            r1 = 1231(0x4cf, float:1.725E-42)
        L_0x002a:
            int r3 = r3 + r1
            return r3
        L_0x002c:
            java.lang.Object r1 = r4.A05
            int r2 = X.AnonymousClass7TE.A0K(r1)
            java.lang.Object r1 = r4.A03
            int r2 = X.AnonymousClass7TF.A07(r1, r2)
            java.lang.Object r1 = r4.A04
            int r3 = X.AnonymousClass7TF.A07(r1, r2)
            boolean r2 = r4.A01
            r1 = 1237(0x4d5, float:1.733E-42)
            if (r2 == 0) goto L_0x001f
            r1 = 1231(0x4cf, float:1.725E-42)
            goto L_0x001f
        L_0x0047:
            java.lang.Object r1 = r4.A05
            int r1 = X.AnonymousClass7TG.A0C(r1)
            int r2 = r1 * 31
            java.lang.Object r1 = r4.A04
            int r1 = X.AnonymousClass7TE.A0L(r1)
            int r2 = r2 + r1
            int r2 = r2 * 31
            java.lang.Object r1 = r4.A03
            goto L_0x00ea
        L_0x005c:
            java.lang.Object r1 = r4.A04
            int r2 = X.AnonymousClass7TE.A0M(r1)
            r0 = 1
            if (r0 == r2) goto L_0x007a
            java.lang.String r1 = "POSTS"
        L_0x0067:
            int r2 = X.C51968G9o.A0F(r1, r2)
            boolean r1 = r4.A01
            int r2 = X.AnonymousClass7TF.A09(r1, r2)
            java.lang.Object r1 = r4.A05
            int r3 = X.AnonymousClass7TF.A07(r1, r2)
            java.lang.Object r1 = r4.A03
            goto L_0x001b
        L_0x007a:
            java.lang.String r1 = "REELS"
            goto L_0x0067
        L_0x007d:
            boolean r1 = r4.A01
            int r2 = X.C51965G9l.A05(r1)
            java.lang.Object r1 = r4.A03
            int r1 = X.AnonymousClass7TG.A0C(r1)
            int r2 = r2 + r1
            int r2 = r2 * 31
            java.lang.Object r1 = r4.A04
            int r1 = X.AnonymousClass7TE.A0L(r1)
            int r2 = r2 + r1
            goto L_0x0017
        L_0x0094:
            boolean r1 = r4.A00
            int r2 = X.C51965G9l.A05(r1)
            boolean r1 = r4.A01
            int r3 = X.AnonymousClass7TF.A09(r1, r2)
            java.lang.Object r1 = r4.A04
            int r2 = X.AnonymousClass7TE.A0M(r1)
            r0 = 1
            if (r0 == r2) goto L_0x00d9
            java.lang.String r1 = "Viewpoint"
        L_0x00ab:
            int r3 = X.C51971G9r.A0F(r1, r2, r3)
            java.lang.Object r1 = r4.A05
            int r2 = X.AnonymousClass7TE.A0M(r1)
            r0 = 1
            if (r0 == r2) goto L_0x00d6
            java.lang.String r1 = "Viewpoint"
        L_0x00ba:
            int r3 = X.C51971G9r.A0F(r1, r2, r3)
            java.lang.Object r1 = r4.A03
            int r2 = X.AnonymousClass7TE.A0M(r1)
            r0 = 1
            if (r0 == r2) goto L_0x00d3
            r1 = 965(0x3c5, float:1.352E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
        L_0x00cd:
            int r1 = X.C51966G9m.A04(r1, r2)
            goto L_0x002a
        L_0x00d3:
            java.lang.String r1 = "VPV"
            goto L_0x00cd
        L_0x00d6:
            java.lang.String r1 = "Vista"
            goto L_0x00ba
        L_0x00d9:
            java.lang.String r1 = "Vista"
            goto L_0x00ab
        L_0x00dc:
            java.lang.Object r1 = r4.A03
            int r2 = X.AnonymousClass7TE.A0K(r1)
            java.lang.Object r1 = r4.A05
            int r2 = X.AnonymousClass7TF.A07(r1, r2)
            java.lang.Object r1 = r4.A04
        L_0x00ea:
            int r2 = X.AnonymousClass7TF.A07(r1, r2)
            boolean r1 = r4.A00
            int r3 = X.AnonymousClass7TF.A09(r1, r2)
            boolean r2 = r4.A01
            goto L_0x0024
        L_0x00f8:
            java.lang.Object r1 = r4.A05
            int r2 = X.AnonymousClass7TE.A0K(r1)
            boolean r1 = r4.A00
            int r2 = X.AnonymousClass7TF.A09(r1, r2)
            boolean r1 = r4.A01
            int r2 = X.AnonymousClass7TF.A09(r1, r2)
            java.lang.Object r1 = r4.A04
            int r3 = X.AnonymousClass7TF.A07(r1, r2)
            java.lang.Object r1 = r4.A03
            int r1 = r1.hashCode()
            goto L_0x002a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61068Jw6.hashCode():int");
    }

    public final String toString() {
        if (5 - this.A02 != 0) {
            return super.toString();
        }
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("ViewState(header=");
        A1A.append(this.A05);
        A1A.append(", cta=");
        A1A.append(this.A04);
        A1A.append(", clipsGridItems=");
        A1A.append(this.A03);
        A1A.append(", hasMoreClips=");
        A1A.append(this.A00);
        A1A.append(", isFirstPage=");
        return G9t.A1C(A1A, this.A01);
    }

    public C61068Jw6(JV7 jv7, C61062Jw0 jw0, List list, boolean z, boolean z2) {
        this.A05 = jw0;
        this.A04 = jv7;
        this.A03 = list;
        this.A00 = z;
        this.A01 = z2;
    }

    public C61068Jw6(C61082JwK jwK, C15053ULv uLv, ULF ulf, boolean z, boolean z2) {
        DbZ.A0t(1, uLv, jwK, ulf);
        this.A03 = uLv;
        this.A05 = jwK;
        this.A04 = ulf;
        this.A00 = z;
        this.A01 = z2;
    }

    public C61068Jw6(C256003v4 r2, 1Xj r3, C52078GDy gDy, boolean z, boolean z2) {
        this.A05 = gDy;
        this.A03 = r3;
        this.A04 = r2;
        this.A01 = z;
        this.A00 = z2;
    }

    public C61068Jw6(View view, C267324bN r3, C52058GDe gDe, boolean z, boolean z2) {
        this.A03 = r3;
        this.A04 = gDe;
        this.A01 = z;
        this.A05 = view;
        this.A00 = z2;
    }

    public C61068Jw6(BoostMediaPickerTabType boostMediaPickerTabType, BoostMediaPickerTabType boostMediaPickerTabType2, C16492Uvn uvn, boolean z, boolean z2) {
        this.A05 = uvn;
        this.A00 = z;
        this.A01 = z2;
        this.A04 = boostMediaPickerTabType;
        this.A03 = boostMediaPickerTabType2;
    }

    public C61068Jw6(Integer num, C62320sa r3, C62320sa r4, boolean z, boolean z2) {
        this.A04 = num;
        this.A01 = z;
        this.A05 = r3;
        this.A03 = r4;
        this.A00 = z2;
    }

    public C61068Jw6(C54650HMh hMh, Boolean bool, AnonymousClass62P r4, boolean z, boolean z2) {
        0qQ.A0B(r4, 4);
        this.A01 = z;
        this.A03 = bool;
        this.A04 = hMh;
        this.A05 = r4;
        this.A00 = z2;
    }

    public C61068Jw6(Integer num, Integer num2, int i, boolean z, boolean z2) {
        Integer num3 = null;
        num3 = (i & 4) != 0 ? AnonymousClass05K.A00 : num3;
        num = (i & 8) != 0 ? AnonymousClass05K.A01 : num;
        num2 = (i & 16) != 0 ? AnonymousClass05K.A00 : num2;
        this.A02 = 2;
        C51973G9u.A0r(3, num3, num, num2);
        this.A00 = z;
        this.A01 = z2;
        this.A04 = num3;
        this.A05 = num;
        this.A03 = num2;
    }

    public C61068Jw6(C16492Uvn uvn) {
        this(BoostMediaPickerTabType.FEED, BoostMediaPickerTabType.FEED_AB_TEST, uvn, false, false);
    }

    public C61068Jw6(boolean z) {
        this((C54650HMh) null, (Boolean) null, AnonymousClass62Q.A00(0sn.A00), z, false);
    }
}
