package X;

import com.instagram.model.direct.messageid.MessageIdentifier;

/* renamed from: X.7E8  reason: invalid class name */
public final class AnonymousClass7E8 extends AnonymousClass4AA {
    public final long A00;
    public final C329967Kx A01;
    public final 2FW A02;
    public final MessageIdentifier A03;
    public final String A04;
    public final boolean A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass7E8) {
                AnonymousClass7E8 r8 = (AnonymousClass7E8) obj;
                if (!0qQ.A0K(this.A03, r8.A03) || !0qQ.A0K(this.A04, r8.A04) || this.A00 != r8.A00 || this.A02 != r8.A02 || !0qQ.A0K(this.A01, r8.A01) || this.A05 != r8.A05) {
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
        MessageIdentifier messageIdentifier = this.A03;
        int i = 0;
        if (messageIdentifier == null) {
            hashCode = 0;
        } else {
            hashCode = messageIdentifier.hashCode();
        }
        int i2 = hashCode * 31;
        String str = this.A04;
        if (str != null) {
            i = str.hashCode();
        }
        long j = this.A00;
        int hashCode2 = (((((((i2 + i) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.A02.hashCode()) * 31) + this.A01.hashCode()) * 31;
        int i3 = 1237;
        if (this.A05) {
            i3 = 1231;
        }
        return hashCode2 + i3;
    }

    public AnonymousClass7E8(C329967Kx r1, 2FW r2, MessageIdentifier messageIdentifier, String str, long j, boolean z) {
        this.A03 = messageIdentifier;
        this.A04 = str;
        this.A00 = j;
        this.A02 = r2;
        this.A01 = r1;
        this.A05 = z;
    }
}
