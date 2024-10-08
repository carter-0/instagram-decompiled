package X;

import com.instagram.business.promote.model.PromoteAudienceInfo;

/* renamed from: X.Vup  reason: case insensitive filesystem */
public final class C18598Vup {
    public static final C18598Vup A01 = new C18598Vup((PromoteAudienceInfo) null);
    public final PromoteAudienceInfo A00;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !DbY.A1b(this, obj)) {
                return false;
            }
            C18598Vup vup = (C18598Vup) obj;
            PromoteAudienceInfo promoteAudienceInfo = this.A00;
            if (promoteAudienceInfo == null || !promoteAudienceInfo.equals(vup.A00)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Pxf.A08(this.A00);
    }

    public C18598Vup(PromoteAudienceInfo promoteAudienceInfo) {
        this.A00 = promoteAudienceInfo;
    }
}
