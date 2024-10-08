package X;

import com.instagram.api.schemas.ProfileGridItemTypeEnum;
import com.instagram.common.session.UserSession;
import com.instagram.profile.fragment.UserDetailFragment;

/* renamed from: X.6vP  reason: invalid class name and case insensitive filesystem */
public final class C322196vP extends C322206vQ {
    public final /* synthetic */ UserDetailFragment A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C322196vP(UserSession userSession, UserDetailFragment userDetailFragment) {
        super(userSession);
        this.A00 = userDetailFragment;
    }

    public final boolean A00(C17884Vhb vhb) {
        if (!super.Esp(vhb)) {
            return false;
        }
        ProfileGridItemTypeEnum profileGridItemTypeEnum = vhb.A01;
        if (profileGridItemTypeEnum == ProfileGridItemTypeEnum.HIGHLIGHT) {
            return true;
        }
        if (profileGridItemTypeEnum == ProfileGridItemTypeEnum.MEDIA && vhb.A02.A1u() == 1sw.A05) {
            return true;
        }
        return false;
    }
}
