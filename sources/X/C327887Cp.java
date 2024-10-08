package X;

import com.instagram.direct.model.messaginguser.MessagingUser;
import com.instagram.model.reels.Reel;
import java.util.List;

/* renamed from: X.7Cp  reason: invalid class name and case insensitive filesystem */
public final class C327887Cp extends AnonymousClass0T0 {
    public final AnonymousClass34S A00;
    public final MessagingUser A01;
    public final Reel A02;
    public final Integer A03;
    public final List A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;

    public C327887Cp(AnonymousClass34S r2, MessagingUser messagingUser, Reel reel, Integer num, List list, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        0qQ.A0B(r2, 2);
        0qQ.A0B(list, 3);
        this.A07 = z;
        this.A00 = r2;
        this.A04 = list;
        this.A02 = reel;
        this.A09 = z2;
        this.A08 = z3;
        this.A01 = messagingUser;
        this.A03 = num;
        this.A06 = z4;
        this.A05 = z5;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C327887Cp) {
                C327887Cp r5 = (C327887Cp) obj;
                if (this.A07 != r5.A07 || !0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A04, r5.A04) || !0qQ.A0K(this.A02, r5.A02) || this.A09 != r5.A09 || this.A08 != r5.A08 || !0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A03, r5.A03) || this.A06 != r5.A06 || this.A05 != r5.A05) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int i = 1237;
        if (this.A07) {
            i = 1231;
        }
        int hashCode3 = ((((i * 31) + this.A00.hashCode()) * 31) + this.A04.hashCode()) * 31;
        Reel reel = this.A02;
        int i2 = 0;
        if (reel == null) {
            hashCode = 0;
        } else {
            hashCode = reel.hashCode();
        }
        int i3 = (hashCode3 + hashCode) * 31;
        int i4 = 1237;
        if (this.A09) {
            i4 = 1231;
        }
        int i5 = (i3 + i4) * 31;
        int i6 = 1237;
        if (this.A08) {
            i6 = 1231;
        }
        int i7 = (i5 + i6) * 31;
        MessagingUser messagingUser = this.A01;
        if (messagingUser == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = messagingUser.hashCode();
        }
        int i8 = (i7 + hashCode2) * 31;
        Integer num = this.A03;
        if (num != null) {
            i2 = num.hashCode();
        }
        int i9 = (i8 + i2) * 31;
        int i10 = 1237;
        if (this.A06) {
            i10 = 1231;
        }
        int i11 = (i9 + i10) * 31;
        int i12 = 1237;
        if (this.A05) {
            i12 = 1231;
        }
        return i11 + i12;
    }
}
