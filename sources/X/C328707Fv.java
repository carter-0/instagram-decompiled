package X;

import com.instagram.model.direct.messageid.DirectMessageIdentifier;
import com.instagram.model.mediasize.GifUrlImpl;

/* renamed from: X.7Fv  reason: invalid class name and case insensitive filesystem */
public final class C328707Fv extends AnonymousClass7FV implements AnonymousClass7FW {
    public final AnonymousClass7FE A00;
    public final DirectMessageIdentifier A01;
    public final GifUrlImpl A02;
    public final String A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final AnonymousClass7FT A07;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C328707Fv) {
                C328707Fv r5 = (C328707Fv) obj;
                if (!0qQ.A0K(this.A02, r5.A02) || !0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A03, r5.A03) || this.A05 != r5.A05 || !0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A07, r5.A07) || this.A04 != r5.A04 || this.A06 != r5.A06) {
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
        GifUrlImpl gifUrlImpl = this.A02;
        int i = 0;
        if (gifUrlImpl == null) {
            hashCode = 0;
        } else {
            hashCode = gifUrlImpl.hashCode();
        }
        int hashCode2 = ((hashCode * 31) + this.A01.hashCode()) * 31;
        String str = this.A03;
        if (str != null) {
            i = str.hashCode();
        }
        int i2 = (hashCode2 + i) * 31;
        int i3 = 1237;
        if (this.A05) {
            i3 = 1231;
        }
        int hashCode3 = (((((i2 + i3) * 31) + this.A00.hashCode()) * 31) + this.A07.hashCode()) * 31;
        int i4 = 1237;
        if (this.A04) {
            i4 = 1231;
        }
        int i5 = (hashCode3 + i4) * 31;
        int i6 = 1237;
        if (this.A06) {
            i6 = 1231;
        }
        return i5 + i6;
    }

    public C328707Fv(AnonymousClass7FT r1, AnonymousClass7FE r2, DirectMessageIdentifier directMessageIdentifier, GifUrlImpl gifUrlImpl, String str, boolean z, boolean z2, boolean z3) {
        super(r1);
        this.A02 = gifUrlImpl;
        this.A01 = directMessageIdentifier;
        this.A03 = str;
        this.A05 = z;
        this.A00 = r2;
        this.A07 = r1;
        this.A04 = z2;
        this.A06 = z3;
    }
}
