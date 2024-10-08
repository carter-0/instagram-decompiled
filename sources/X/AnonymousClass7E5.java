package X;

import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.direct.messageid.MessageIdentifier;

/* renamed from: X.7E5  reason: invalid class name */
public final class AnonymousClass7E5 extends AnonymousClass0T0 implements C232262tL {
    public boolean A00 = false;
    public final int A01;
    public final long A02;
    public final UserSession A03;
    public final ImageUrl A04;
    public final AnonymousClass9HC A05;
    public final C2607246u A06;
    public final C329967Kx A07;
    public final 2FW A08;
    public final MessageIdentifier A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final String A0F;
    public final boolean A0G;

    public AnonymousClass7E5(UserSession userSession, ImageUrl imageUrl, AnonymousClass9HC r5, C2607246u r6, C329967Kx r7, 2FW r8, MessageIdentifier messageIdentifier, String str, String str2, String str3, String str4, int i, long j, boolean z, boolean z2, boolean z3) {
        0qQ.A0B(userSession, 1);
        0qQ.A0B(str, 2);
        0qQ.A0B(str2, 6);
        this.A03 = userSession;
        this.A0B = str;
        this.A04 = imageUrl;
        this.A06 = r6;
        this.A0A = str2;
        this.A01 = i;
        this.A09 = messageIdentifier;
        this.A0C = str3;
        this.A0F = str4;
        this.A02 = j;
        this.A08 = r8;
        this.A0G = z;
        this.A0E = z2;
        this.A07 = r7;
        this.A05 = r5;
        this.A0D = z3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass7E5) {
                AnonymousClass7E5 r8 = (AnonymousClass7E5) obj;
                if (!0qQ.A0K(this.A03, r8.A03) || !0qQ.A0K(this.A0B, r8.A0B) || !0qQ.A0K(this.A04, r8.A04) || !0qQ.A0K(this.A06, r8.A06) || !0qQ.A0K(this.A0A, r8.A0A) || this.A01 != r8.A01 || !0qQ.A0K(this.A09, r8.A09) || !0qQ.A0K(this.A0C, r8.A0C) || !0qQ.A0K(this.A0F, r8.A0F) || this.A02 != r8.A02 || this.A08 != r8.A08 || this.A0G != r8.A0G || this.A0E != r8.A0E || this.A00 != r8.A00 || !0qQ.A0K(this.A07, r8.A07) || !0qQ.A0K(this.A05, r8.A05) || this.A0D != r8.A0D) {
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

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A0B;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5 = ((this.A03.hashCode() * 31) + this.A0B.hashCode()) * 31;
        ImageUrl imageUrl = this.A04;
        int i = 0;
        if (imageUrl == null) {
            hashCode = 0;
        } else {
            hashCode = imageUrl.hashCode();
        }
        int i2 = (hashCode5 + hashCode) * 31;
        C2607246u r0 = this.A06;
        if (r0 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = r0.hashCode();
        }
        int hashCode6 = (((((i2 + hashCode2) * 31 * 31) + this.A0A.hashCode()) * 31) + this.A01) * 31;
        MessageIdentifier messageIdentifier = this.A09;
        if (messageIdentifier == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = messageIdentifier.hashCode();
        }
        int i3 = (hashCode6 + hashCode3) * 31;
        String str = this.A0C;
        if (str == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str.hashCode();
        }
        long j = this.A02;
        int hashCode7 = (((((((i3 + hashCode4) * 31) + this.A0F.hashCode()) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.A08.hashCode()) * 31;
        int i4 = 1237;
        if (this.A0G) {
            i4 = 1231;
        }
        int i5 = (hashCode7 + i4) * 31;
        int i6 = 1237;
        if (this.A0E) {
            i6 = 1231;
        }
        int i7 = (i5 + i6) * 31;
        int i8 = 1237;
        if (this.A00) {
            i8 = 1231;
        }
        int hashCode8 = (((i7 + i8) * 31) + this.A07.hashCode()) * 31;
        AnonymousClass9HC r02 = this.A05;
        if (r02 != null) {
            i = r02.hashCode();
        }
        int i9 = (hashCode8 + i) * 31;
        int i10 = 1237;
        if (this.A0D) {
            i10 = 1231;
        }
        return i9 + i10;
    }
}
