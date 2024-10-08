package X;

import com.instagram.api.schemas.ProfileGridItemTypeEnum;
import com.instagram.model.reels.Reel;

/* renamed from: X.Vhb  reason: case insensitive filesystem */
public final class C17884Vhb {
    public boolean A00;
    public final ProfileGridItemTypeEnum A01;
    public final 1Xj A02;
    public final Reel A03;
    public final boolean A04;

    public final String A00() {
        String id;
        if (this.A01 == ProfileGridItemTypeEnum.MEDIA) {
            1Xj r0 = this.A02;
            if (r0 != null) {
                id = r0.getId();
            }
            return "";
        }
        Reel reel = this.A03;
        if (reel != null) {
            id = reel.getId();
        }
        return "";
        if (id != null) {
            return id;
        }
        return "";
    }

    public C17884Vhb(ProfileGridItemTypeEnum profileGridItemTypeEnum, 1Xj r4, Reel reel) {
        this.A01 = profileGridItemTypeEnum;
        this.A02 = r4;
        this.A03 = reel;
        this.A04 = profileGridItemTypeEnum != ProfileGridItemTypeEnum.HIGHLIGHT ? false : true;
    }
}
