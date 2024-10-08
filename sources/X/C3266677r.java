package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.messageid.MessageIdentifier;

/* renamed from: X.77r  reason: invalid class name and case insensitive filesystem */
public final class C3266677r extends AnonymousClass0T0 implements AnonymousClass7FW {
    public final int A00;
    public final int A01;
    public final UserSession A02;
    public final MessageIdentifier A03;
    public final CharSequence A04;
    public final String A05;
    public final String A06;
    public final boolean A07;
    public final boolean A08;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C3266677r) {
                C3266677r r5 = (C3266677r) obj;
                if (!0qQ.A0K(this.A02, r5.A02) || !0qQ.A0K(this.A04, r5.A04) || this.A01 != r5.A01 || this.A00 != r5.A00 || this.A07 != r5.A07 || !0qQ.A0K(this.A03, r5.A03) || this.A08 != r5.A08 || !0qQ.A0K(this.A06, r5.A06) || !0qQ.A0K(this.A05, r5.A05)) {
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
        int hashCode4 = this.A02.hashCode() * 31;
        CharSequence charSequence = this.A04;
        int i = 0;
        if (charSequence == null) {
            hashCode = 0;
        } else {
            hashCode = charSequence.hashCode();
        }
        int i2 = (((((hashCode4 + hashCode) * 31) + this.A01) * 31) + this.A00) * 31;
        int i3 = 1237;
        if (this.A07) {
            i3 = 1231;
        }
        int i4 = (i2 + i3) * 31;
        MessageIdentifier messageIdentifier = this.A03;
        if (messageIdentifier == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = messageIdentifier.hashCode();
        }
        int i5 = (i4 + hashCode2) * 31;
        int i6 = 1237;
        if (this.A08) {
            i6 = 1231;
        }
        int i7 = (i5 + i6) * 31;
        String str = this.A06;
        if (str == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str.hashCode();
        }
        int i8 = (i7 + hashCode3) * 31;
        String str2 = this.A05;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return i8 + i;
    }

    public C3266677r(UserSession userSession, MessageIdentifier messageIdentifier, CharSequence charSequence, String str, String str2, int i, int i2, boolean z, boolean z2) {
        this.A02 = userSession;
        this.A04 = charSequence;
        this.A01 = i;
        this.A00 = i2;
        this.A07 = z;
        this.A03 = messageIdentifier;
        this.A08 = z2;
        this.A06 = str;
        this.A05 = str2;
    }
}
