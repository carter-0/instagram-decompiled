package X;

import com.instagram.model.direct.messageid.MessageIdentifier;
import java.util.List;

/* renamed from: X.7Fb  reason: invalid class name and case insensitive filesystem */
public final class C328507Fb extends AnonymousClass0T0 {
    public final C328497Fa A00;
    public final C327627Bo A01;
    public final AnonymousClass7SD A02;
    public final C272074k3 A03;
    public final 2FW A04;
    public final MessageIdentifier A05;
    public final 1sw A06;
    public final AnonymousClass4UC A07;
    public final Integer A08;
    public final Integer A09;
    public final String A0A;
    public final List A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final boolean A0I;
    public final boolean A0J;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C328507Fb) {
                C328507Fb r5 = (C328507Fb) obj;
                if (!(0qQ.A0K(this.A05, r5.A05) && this.A04 == r5.A04 && this.A0F == r5.A0F && this.A01 == r5.A01 && this.A0D == r5.A0D && this.A0C == r5.A0C && this.A0E == r5.A0E && this.A08 == r5.A08 && this.A0H == r5.A0H && 0qQ.A0K(this.A07, r5.A07) && this.A0G == r5.A0G && 0qQ.A0K(this.A0A, r5.A0A) && 0qQ.A0K(this.A09, r5.A09) && this.A03 == r5.A03 && this.A00 == r5.A00 && this.A0I == r5.A0I && this.A06 == r5.A06 && 0qQ.A0K(this.A02, r5.A02) && this.A0J == r5.A0J && 0qQ.A0K(this.A0B, r5.A0B))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public C328507Fb(C328497Fa r2, C327627Bo r3, AnonymousClass7SD r4, C272074k3 r5, 2FW r6, MessageIdentifier messageIdentifier, 1sw r8, AnonymousClass4UC r9, Integer num, Integer num2, String str, List list, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        0qQ.A0B(r2, 16);
        this.A05 = messageIdentifier;
        this.A04 = r6;
        this.A0F = z;
        this.A01 = r3;
        this.A0D = z2;
        this.A0C = z3;
        this.A0E = z4;
        this.A08 = num;
        this.A0H = z5;
        this.A07 = r9;
        this.A0G = z6;
        this.A0A = str;
        this.A09 = num2;
        this.A03 = r5;
        this.A00 = r2;
        this.A0I = z7;
        this.A06 = r8;
        this.A02 = r4;
        this.A0J = z8;
        this.A0B = list;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6 = ((this.A05.hashCode() * 31) + this.A04.hashCode()) * 31;
        int i = 1237;
        if (this.A0F) {
            i = 1231;
        }
        int hashCode7 = (((hashCode6 + i) * 31) + this.A01.hashCode()) * 31;
        int i2 = 1237;
        if (this.A0D) {
            i2 = 1231;
        }
        int i3 = (hashCode7 + i2) * 31;
        int i4 = 1237;
        if (this.A0C) {
            i4 = 1231;
        }
        int i5 = (i3 + i4) * 31;
        int i6 = 1237;
        if (this.A0E) {
            i6 = 1231;
        }
        int A002 = (((i5 + i6) * 31) + C395079zB.A00(this.A08)) * 31;
        int i7 = 1237;
        if (this.A0H) {
            i7 = 1231;
        }
        int A003 = (((A002 + i7) * 31) + C54732HQn.A00()) * 31;
        AnonymousClass4UC r0 = this.A07;
        int i8 = 0;
        if (r0 == null) {
            hashCode = 0;
        } else {
            hashCode = r0.hashCode();
        }
        int i9 = (A003 + hashCode) * 31;
        int i10 = 1237;
        if (this.A0G) {
            i10 = 1231;
        }
        int hashCode8 = (((i9 + i10) * 31) + this.A0A.hashCode()) * 31;
        Integer num = this.A09;
        if (num == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = num.hashCode();
        }
        int i11 = (hashCode8 + hashCode2) * 31;
        C272074k3 r02 = this.A03;
        if (r02 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = r02.hashCode();
        }
        int hashCode9 = (((i11 + hashCode3) * 31) + this.A00.hashCode()) * 31;
        int i12 = 1237;
        if (this.A0I) {
            i12 = 1231;
        }
        int i13 = (hashCode9 + i12) * 31;
        1sw r03 = this.A06;
        if (r03 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = r03.hashCode();
        }
        int i14 = (i13 + hashCode4) * 31;
        AnonymousClass7SD r04 = this.A02;
        if (r04 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = r04.hashCode();
        }
        int i15 = (i14 + hashCode5) * 31;
        int i16 = 1237;
        if (this.A0J) {
            i16 = 1231;
        }
        int i17 = (i15 + i16) * 31;
        List list = this.A0B;
        if (list != null) {
            i8 = list.hashCode();
        }
        return i17 + i8;
    }
}
