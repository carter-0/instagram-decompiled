package X;

import android.app.Application;
import com.instagram.creation.fragment.followersshare.FollowersShareFragment;
import com.instagram.creation.sharesheet.rowitems.model.PublishScreenCategoryType;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: X.Jfi  reason: case insensitive filesystem */
public abstract class C60102Jfi extends C361478gI {
    public final LT6 A00;
    public final Map A01 = AnonymousClass7TE.A1H();

    public final void A0E(C61075JwD jwD) {
        0qQ.A0B(jwD, 0);
        for (PublishScreenCategoryType publishScreenCategoryType : PublishScreenCategoryType.values()) {
            ArrayList A06 = this.A00.A06(publishScreenCategoryType, jwD);
            Map map = this.A01;
            Object obj = map.get(publishScreenCategoryType);
            if (obj == null) {
                obj = JTO.A1J();
                map.put(publishScreenCategoryType, obj);
            }
            ((05G) obj).Epw(A06);
        }
    }

    public C60102Jfi(Application application, LT6 lt6) {
        super(application);
        this.A00 = lt6;
    }

    public static C61841KOf A00(FollowersShareFragment followersShareFragment) {
        return FollowersShareFragment.A03(followersShareFragment).A0K;
    }
}
