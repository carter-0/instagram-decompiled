package X;

import com.instagram.model.direct.messageid.DirectMessageIdentifier;
import java.util.List;

/* renamed from: X.7Fq  reason: invalid class name and case insensitive filesystem */
public final class C328657Fq extends AnonymousClass7FV implements AnonymousClass7FF, AnonymousClass7FW {
    public final int A00;
    public final int A01;
    public final N4D A02;
    public final AnonymousClass7FT A03;
    public final AnonymousClass7FE A04;
    public final C254923tH A05;
    public final 1Xj A06;
    public final DirectMessageIdentifier A07;
    public final Integer A08;
    public final Integer A09;
    public final Long A0A;
    public final Long A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final List A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final boolean A0I;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C328657Fq) {
                C328657Fq r5 = (C328657Fq) obj;
                if (!0qQ.A0K(this.A0A, r5.A0A) || !0qQ.A0K(this.A0C, r5.A0C) || !0qQ.A0K(this.A07, r5.A07) || !0qQ.A0K(this.A0D, r5.A0D) || this.A00 != r5.A00 || !0qQ.A0K(this.A06, r5.A06) || this.A01 != r5.A01 || !0qQ.A0K(this.A0F, r5.A0F) || !0qQ.A0K(this.A04, r5.A04) || !0qQ.A0K(this.A03, r5.A03) || this.A05 != r5.A05 || this.A0G != r5.A0G || !0qQ.A0K(this.A0B, r5.A0B) || this.A0I != r5.A0I || this.A0H != r5.A0H || this.A08 != r5.A08 || this.A09 != r5.A09 || !0qQ.A0K(this.A0E, r5.A0E) || !0qQ.A0K(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C328657Fq(N4D n4d, AnonymousClass7FT r3, AnonymousClass7FE r4, C254923tH r5, 1Xj r6, DirectMessageIdentifier directMessageIdentifier, Integer num, Integer num2, Long l, Long l2, String str, String str2, String str3, List list, int i, int i2, boolean z, boolean z2, boolean z3) {
        super(r3);
        0qQ.A0B(r5, 11);
        this.A0A = l;
        this.A0C = str;
        this.A07 = directMessageIdentifier;
        this.A0D = str2;
        this.A00 = i;
        this.A06 = r6;
        this.A01 = i2;
        this.A0F = list;
        this.A04 = r4;
        this.A03 = r3;
        this.A05 = r5;
        this.A0G = z;
        this.A0B = l2;
        this.A0I = z2;
        this.A0H = z3;
        this.A08 = num;
        this.A09 = num2;
        this.A0E = str3;
        this.A02 = n4d;
    }

    public final boolean CUQ() {
        return this.A04.A00;
    }

    public final boolean CUR() {
        return this.A04.A01;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        Long l = this.A0A;
        int i = 0;
        if (l == null) {
            hashCode = 0;
        } else {
            hashCode = l.hashCode();
        }
        int i2 = hashCode * 31;
        String str = this.A0C;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int hashCode8 = (((i2 + hashCode2) * 31) + this.A07.hashCode()) * 31;
        String str2 = this.A0D;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        int i3 = (((hashCode8 + hashCode3) * 31) + this.A00) * 31;
        1Xj r0 = this.A06;
        if (r0 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = r0.hashCode();
        }
        int i4 = (((i3 + hashCode4) * 31) + this.A01) * 31;
        List list = this.A0F;
        if (list == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = list.hashCode();
        }
        int hashCode9 = (((((((i4 + hashCode5) * 31) + this.A04.hashCode()) * 31) + this.A03.hashCode()) * 31) + this.A05.hashCode()) * 31;
        int i5 = 1237;
        if (this.A0G) {
            i5 = 1231;
        }
        int i6 = (hashCode9 + i5) * 31;
        Long l2 = this.A0B;
        if (l2 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = l2.hashCode();
        }
        int i7 = (i6 + hashCode6) * 31;
        int i8 = 1237;
        if (this.A0I) {
            i8 = 1231;
        }
        int i9 = (i7 + i8) * 31;
        int i10 = 1237;
        if (this.A0H) {
            i10 = 1231;
        }
        int A002 = (((((i9 + i10) * 31) + C69845Nt9.A00(this.A08)) * 31) + C69846NtA.A00(this.A09)) * 31;
        String str3 = this.A0E;
        if (str3 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str3.hashCode();
        }
        int i11 = (A002 + hashCode7) * 31;
        N4D n4d = this.A02;
        if (n4d != null) {
            i = n4d.hashCode();
        }
        return i11 + i;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
