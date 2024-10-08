package X;

import com.instagram.model.direct.messageid.MessageIdentifier;

/* renamed from: X.7E6  reason: invalid class name */
public final class AnonymousClass7E6 extends AnonymousClass4AA {
    public final C329967Kx A00;
    public final MessageIdentifier A01;
    public final String A02;
    public final String A03;
    public final boolean A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass7E6) {
                AnonymousClass7E6 r5 = (AnonymousClass7E6) obj;
                if (!0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A03, r5.A03) || !0qQ.A0K(this.A02, r5.A02) || !0qQ.A0K(this.A00, r5.A00) || this.A04 != r5.A04) {
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
        MessageIdentifier messageIdentifier = this.A01;
        int i = 0;
        if (messageIdentifier == null) {
            hashCode = 0;
        } else {
            hashCode = messageIdentifier.hashCode();
        }
        int i2 = hashCode * 31;
        String str = this.A03;
        if (str != null) {
            i = str.hashCode();
        }
        int hashCode2 = (((((i2 + i) * 31) + this.A02.hashCode()) * 31) + this.A00.hashCode()) * 31;
        int i3 = 1237;
        if (this.A04) {
            i3 = 1231;
        }
        return hashCode2 + i3;
    }

    public AnonymousClass7E6(C329967Kx r1, MessageIdentifier messageIdentifier, String str, String str2, boolean z) {
        this.A01 = messageIdentifier;
        this.A03 = str;
        this.A02 = str2;
        this.A00 = r1;
        this.A04 = z;
    }
}
