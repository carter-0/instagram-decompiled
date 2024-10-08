package X;

import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.JgC  reason: case insensitive filesystem */
public final class C60131JgC extends 2YL {
    public final 05G A00 = 106.A01(K37.A00);
    public final 05G A01;
    public final UserSession A02;

    public C60131JgC(UserSession userSession, Integer num) {
        AnonymousClass7TF.A1B(userSession, 1, num);
        this.A02 = userSession;
        if (num.intValue() == 0) {
            C63798L7e[] l7eArr = {new C63798L7e(new LYC((Object) this, 53), R.drawable.instagram_edit_pano_outline_24, 2131953455), new C63798L7e(new LYC((Object) this, 54), R.drawable.instagram_hanger_pano_outline_24, 2131953454), new C63798L7e(new LYC((Object) this, 55), R.drawable.instagram_sticker_pano_outline_24, 2131953457), new C63798L7e(new LYC((Object) this, 56), R.drawable.instagram_user_circle_pano_outline_24, 2131953456), new C63798L7e(new LYC((Object) this, 57), R.drawable.instagram_shopping_bag_pano_outline_24, 2131953458), new C63798L7e(new LYC((Object) this, 58), R.drawable.instagram_chevron_down_pano_outline_24, 2131953453)};
            0qQ.A0B(l7eArr, 0);
            this.A01 = DbS.A10(new L3N(03t.A0I(l7eArr)));
            return;
        }
        throw AnonymousClass7TE.A1K();
    }
}
