package X;

import com.instagram.model.direct.messageid.DirectMessageIdentifier;
import java.util.List;

/* renamed from: X.7Ft  reason: invalid class name and case insensitive filesystem */
public final class C328687Ft extends AnonymousClass7FV implements AnonymousClass7FW {
    public final int A00;
    public final C3259574v A01;
    public final DirectMessageIdentifier A02;
    public final String A03;
    public final List A04;
    public final AnonymousClass0eM A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final int A09;
    public final AnonymousClass7FT A0A;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C328687Ft) {
                C328687Ft r5 = (C328687Ft) obj;
                if (!0qQ.A0K(this.A02, r5.A02) || !0qQ.A0K(this.A04, r5.A04) || !0qQ.A0K(this.A03, r5.A03) || this.A09 != r5.A09 || !0qQ.A0K(this.A01, r5.A01) || this.A08 != r5.A08 || this.A07 != r5.A07 || this.A00 != r5.A00 || this.A06 != r5.A06 || !0qQ.A0K(this.A0A, r5.A0A) || !0qQ.A0K(this.A05, r5.A05)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C328687Ft(X.C3259574v r2, X.AnonymousClass7FT r3, com.instagram.model.direct.messageid.DirectMessageIdentifier r4, java.lang.String r5, java.util.List r6, X.AnonymousClass0eM r7, int r8, int r9, boolean r10, boolean r11, boolean r12) {
        /*
            r1 = this;
            if (r3 == 0) goto L_0x001f
            r0 = r3
        L_0x0003:
            X.7FU r0 = (X.AnonymousClass7FU) r0
            r1.<init>(r0)
            r1.A02 = r4
            r1.A04 = r6
            r1.A03 = r5
            r1.A09 = r8
            r1.A01 = r2
            r1.A08 = r10
            r1.A07 = r11
            r1.A00 = r9
            r1.A06 = r12
            r1.A0A = r3
            r1.A05 = r7
            return
        L_0x001f:
            r0 = 0
            java.lang.Object r0 = r6.get(r0)
            goto L_0x0003
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C328687Ft.<init>(X.74v, X.7FT, com.instagram.model.direct.messageid.DirectMessageIdentifier, java.lang.String, java.util.List, X.0eM, int, int, boolean, boolean, boolean):void");
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = ((this.A02.hashCode() * 31) + this.A04.hashCode()) * 31;
        String str = this.A03;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (((hashCode3 + hashCode) * 31) + this.A09) * 31;
        C3259574v r0 = this.A01;
        if (r0 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = r0.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        int i4 = 1237;
        if (this.A08) {
            i4 = 1231;
        }
        int A002 = (((i3 + i4) * 31) + C54732HQn.A00()) * 31;
        int i5 = 1237;
        if (this.A07) {
            i5 = 1231;
        }
        int i6 = (((A002 + i5) * 31) + this.A00) * 31;
        int i7 = 1237;
        if (this.A06) {
            i7 = 1231;
        }
        int i8 = (i6 + i7) * 31;
        AnonymousClass7FT r02 = this.A0A;
        if (r02 != null) {
            i = r02.hashCode();
        }
        return ((i8 + i) * 31) + this.A05.hashCode();
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
