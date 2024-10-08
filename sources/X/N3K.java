package X;

import com.instagram.common.notifications.push.intf.PushChannelType;
import java.lang.ref.WeakReference;

public final class N3K extends AnonymousClass0T0 {
    public final PushChannelType A00;
    public final Long A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final WeakReference A0A;
    public final boolean A0B;
    public final boolean A0C;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof N3K) {
                N3K n3k = (N3K) obj;
                if (!0qQ.A0K(this.A0A, n3k.A0A) || !0qQ.A0K(this.A04, n3k.A04) || !0qQ.A0K(this.A07, n3k.A07) || !0qQ.A0K(this.A09, n3k.A09) || !0qQ.A0K(this.A08, n3k.A08) || this.A0C != n3k.A0C || this.A0B != n3k.A0B || this.A00 != n3k.A00 || !0qQ.A0K(this.A01, n3k.A01) || !0qQ.A0K(this.A05, n3k.A05) || !0qQ.A0K(this.A02, n3k.A02) || !0qQ.A0K(this.A06, n3k.A06) || !0qQ.A0K(this.A03, n3k.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A082 = AnonymousClass7TF.A08(this.A07, AnonymousClass7TF.A08(this.A04, AnonymousClass7TE.A0K(this.A0A)));
        int A092 = AnonymousClass7TF.A09(this.A0B, AnonymousClass7TF.A09(this.A0C, (AnonymousClass7TF.A08(this.A09, A082) + AnonymousClass7TG.A0E(this.A08)) * 31));
        return ((((AnonymousClass7TF.A08(this.A05, (AnonymousClass7TF.A07(this.A00, A092) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TG.A0E(this.A02)) * 31) + AnonymousClass7TG.A0E(this.A06)) * 31) + C41845B3m.A00(this.A03);
    }

    public N3K(PushChannelType pushChannelType, Long l, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, WeakReference weakReference, boolean z, boolean z2) {
        this.A0A = weakReference;
        this.A04 = str;
        this.A07 = str2;
        this.A09 = str3;
        this.A08 = str4;
        this.A0C = z;
        this.A0B = z2;
        this.A00 = pushChannelType;
        this.A01 = l;
        this.A05 = str5;
        this.A02 = str6;
        this.A06 = str7;
        this.A03 = str8;
    }
}
