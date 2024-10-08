package X;

import com.instagram.api.schemas.RemoteStringSettingId;
import com.instagram.api.schemas.SettingId;

/* renamed from: X.Ju1  reason: case insensitive filesystem */
public final class C60943Ju1 extends AnonymousClass0T0 {
    public final String A00;
    public final String A01;
    public final String A02;
    public final RemoteStringSettingId A03;
    public final SettingId A04;
    public final String A05;

    public C60943Ju1(RemoteStringSettingId remoteStringSettingId, SettingId settingId, String str, String str2, String str3, String str4) {
        0qQ.A0B(str4, 6);
        this.A00 = str;
        this.A01 = str2;
        this.A05 = str3;
        this.A04 = settingId;
        this.A03 = remoteStringSettingId;
        this.A02 = str4;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C60943Ju1) {
                C60943Ju1 ju1 = (C60943Ju1) obj;
                if (!0qQ.A0K(this.A00, ju1.A00) || !0qQ.A0K(this.A01, ju1.A01) || !0qQ.A0K(this.A05, ju1.A05) || this.A04 != ju1.A04 || this.A03 != ju1.A03 || !0qQ.A0K(this.A02, ju1.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C41845B3m.A01(this.A02, ((((((((AnonymousClass7TG.A0E(this.A00) * 31) + AnonymousClass7TG.A0E(this.A01)) * 31) + AnonymousClass7TG.A0E(this.A05)) * 31) + AnonymousClass7TG.A0C(this.A04)) * 31) + AnonymousClass7TE.A0L(this.A03)) * 31);
    }
}
