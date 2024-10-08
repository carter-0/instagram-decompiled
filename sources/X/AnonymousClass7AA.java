package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.messageid.MessageIdentifier;

/* renamed from: X.7AA  reason: invalid class name */
public final class AnonymousClass7AA extends AnonymousClass0T0 implements AnonymousClass7FW {
    public final int A00;
    public final C329967Kx A01;
    public final MessageIdentifier A02;
    public final String A03;
    public final boolean A04;
    public final boolean A05;
    public final UserSession A06;
    public final AnonymousClass9HC A07;
    public final String A08;
    public final boolean A09;

    public AnonymousClass7AA(UserSession userSession, AnonymousClass9HC r6, C329967Kx r7, MessageIdentifier messageIdentifier, String str, String str2, int i, boolean z, boolean z2) {
        0qQ.A0B(userSession, 7);
        this.A02 = messageIdentifier;
        this.A08 = str;
        this.A03 = str2;
        this.A00 = i;
        this.A01 = r7;
        this.A07 = r6;
        this.A06 = userSession;
        this.A09 = z;
        this.A04 = z2;
        boolean z3 = false;
        if (!z && 182.A06(0Tu.A06, userSession, 36320266384580745L) && 182.A06(0Tu.A05, userSession, 36319407392628013L)) {
            z3 = true;
        }
        this.A05 = z3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass7AA) {
                AnonymousClass7AA r5 = (AnonymousClass7AA) obj;
                if (!0qQ.A0K(this.A02, r5.A02) || !0qQ.A0K(this.A08, r5.A08) || !0qQ.A0K(this.A03, r5.A03) || this.A00 != r5.A00 || !0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A07, r5.A07) || !0qQ.A0K(this.A06, r5.A06) || this.A09 != r5.A09 || this.A04 != r5.A04) {
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
        int hashCode3;
        int hashCode4;
        MessageIdentifier messageIdentifier = this.A02;
        int i = 0;
        if (messageIdentifier == null) {
            hashCode = 0;
        } else {
            hashCode = messageIdentifier.hashCode();
        }
        int i2 = hashCode * 31;
        String str = this.A08;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str2 = this.A03;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        int i4 = (((i3 + hashCode3) * 31) + this.A00) * 31;
        C329967Kx r0 = this.A01;
        if (r0 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = r0.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        AnonymousClass9HC r02 = this.A07;
        if (r02 != null) {
            i = r02.hashCode();
        }
        int hashCode5 = (((i5 + i) * 31) + this.A06.hashCode()) * 31;
        int i6 = 1237;
        if (this.A09) {
            i6 = 1231;
        }
        int i7 = (hashCode5 + i6) * 31;
        int i8 = 1237;
        if (this.A04) {
            i8 = 1231;
        }
        return i7 + i8;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
