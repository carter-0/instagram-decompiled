package X;

import com.instagram.api.schemas.RemoteBooleanSettingId;
import com.instagram.api.schemas.SettingId;

/* renamed from: X.Jtz  reason: case insensitive filesystem */
public final class C60941Jtz extends AnonymousClass0T0 {
    public final String A00;
    public final String A01;
    public final boolean A02;
    public final RemoteBooleanSettingId A03;
    public final SettingId A04;
    public final String A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C60941Jtz) {
                C60941Jtz jtz = (C60941Jtz) obj;
                if (!0qQ.A0K(this.A00, jtz.A00) || !0qQ.A0K(this.A01, jtz.A01) || !0qQ.A0K(this.A05, jtz.A05) || this.A04 != jtz.A04 || this.A03 != jtz.A03 || this.A02 != jtz.A02) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return DbS.A06(this.A02, ((((((((AnonymousClass7TG.A0E(this.A00) * 31) + AnonymousClass7TG.A0E(this.A01)) * 31) + AnonymousClass7TG.A0E(this.A05)) * 31) + AnonymousClass7TG.A0C(this.A04)) * 31) + AnonymousClass7TE.A0L(this.A03)) * 31);
    }

    public C60941Jtz(RemoteBooleanSettingId remoteBooleanSettingId, SettingId settingId, String str, String str2, String str3, boolean z) {
        this.A00 = str;
        this.A01 = str2;
        this.A05 = str3;
        this.A04 = settingId;
        this.A03 = remoteBooleanSettingId;
        this.A02 = z;
    }
}
