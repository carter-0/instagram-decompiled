package X;

import com.instagram.api.schemas.AudioBrowserCollectionType;
import java.util.List;

/* renamed from: X.Jx6  reason: case insensitive filesystem */
public final class C61095Jx6 extends AnonymousClass0T0 implements MW5 {
    public final AudioBrowserCollectionType A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final List A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C61095Jx6) {
                C61095Jx6 jx6 = (C61095Jx6) obj;
                if (this.A00 != jx6.A00 || !0qQ.A0K(this.A01, jx6.A01) || !0qQ.A0K(this.A04, jx6.A04) || !0qQ.A0K(this.A02, jx6.A02) || !0qQ.A0K(this.A03, jx6.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((((AnonymousClass7TG.A0C(this.A00) * 31) + AnonymousClass7TG.A0E(this.A01)) * 31) + AnonymousClass7TG.A0C(this.A04)) * 31) + AnonymousClass7TG.A0E(this.A02)) * 31) + C41845B3m.A00(this.A03);
    }

    public C61095Jx6(AudioBrowserCollectionType audioBrowserCollectionType, String str, String str2, String str3, List list) {
        this.A00 = audioBrowserCollectionType;
        this.A01 = str;
        this.A04 = list;
        this.A02 = str2;
        this.A03 = str3;
    }
}
