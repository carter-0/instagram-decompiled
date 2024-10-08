package X;

import com.instagram.model.direct.messageid.MessageIdentifier;
import java.util.HashSet;
import java.util.List;

/* renamed from: X.7A9  reason: invalid class name */
public final class AnonymousClass7A9 extends AnonymousClass0T0 implements AnonymousClass7FW {
    public final AnonymousClass7E8 A00;
    public final AnonymousClass7E6 A01;
    public final AnonymousClass7E9 A02;
    public final AnonymousClass7E7 A03;
    public final MessageIdentifier A04;
    public final Integer A05;
    public final HashSet A06;
    public final List A07;
    public final boolean A08;
    public final boolean A09;
    public final int A0A;
    public final AnonymousClass9HC A0B;
    public final C329967Kx A0C;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass7A9) {
                AnonymousClass7A9 r5 = (AnonymousClass7A9) obj;
                if (!0qQ.A0K(this.A04, r5.A04) || !0qQ.A0K(this.A07, r5.A07) || !0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A03, r5.A03) || !0qQ.A0K(this.A02, r5.A02) || !0qQ.A0K(this.A0B, r5.A0B) || !0qQ.A0K(this.A0C, r5.A0C) || !0qQ.A0K(this.A05, r5.A05) || this.A0A != r5.A0A || !0qQ.A0K(this.A06, r5.A06) || this.A09 != r5.A09 || this.A08 != r5.A08) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        0qQ.A0B(obj, 0);
        return equals(obj);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        MessageIdentifier messageIdentifier = this.A04;
        int i = 0;
        if (messageIdentifier == null) {
            hashCode = 0;
        } else {
            hashCode = messageIdentifier.hashCode();
        }
        int hashCode7 = ((hashCode * 31) + this.A07.hashCode()) * 31;
        AnonymousClass7E6 r0 = this.A01;
        if (r0 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = r0.hashCode();
        }
        int i2 = (hashCode7 + hashCode2) * 31;
        AnonymousClass7E8 r02 = this.A00;
        if (r02 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = r02.hashCode();
        }
        int i3 = (i2 + hashCode3) * 31;
        AnonymousClass7E7 r03 = this.A03;
        if (r03 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = r03.hashCode();
        }
        int i4 = (i3 + hashCode4) * 31;
        AnonymousClass7E9 r04 = this.A02;
        if (r04 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = r04.hashCode();
        }
        int i5 = (i4 + hashCode5) * 31;
        AnonymousClass9HC r05 = this.A0B;
        if (r05 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = r05.hashCode();
        }
        int hashCode8 = (((i5 + hashCode6) * 31) + this.A0C.hashCode()) * 31;
        Integer num = this.A05;
        if (num != null) {
            i = num.hashCode();
        }
        int hashCode9 = (((((hashCode8 + i) * 31) + this.A0A) * 31) + this.A06.hashCode()) * 31;
        int i6 = 1237;
        if (this.A09) {
            i6 = 1231;
        }
        int i7 = (hashCode9 + i6) * 31;
        int i8 = 1237;
        if (this.A08) {
            i8 = 1231;
        }
        return i7 + i8;
    }

    public AnonymousClass7A9(AnonymousClass9HC r1, C329967Kx r2, AnonymousClass7E8 r3, AnonymousClass7E6 r4, AnonymousClass7E9 r5, AnonymousClass7E7 r6, MessageIdentifier messageIdentifier, Integer num, HashSet hashSet, List list, int i, boolean z, boolean z2) {
        this.A04 = messageIdentifier;
        this.A07 = list;
        this.A01 = r4;
        this.A00 = r3;
        this.A03 = r6;
        this.A02 = r5;
        this.A0B = r1;
        this.A0C = r2;
        this.A05 = num;
        this.A0A = i;
        this.A06 = hashSet;
        this.A09 = z;
        this.A08 = z2;
    }
}
