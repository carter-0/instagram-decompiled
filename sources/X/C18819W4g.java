package X;

import android.content.DialogInterface;
import android.view.View;
import com.instagram.profile.fragment.UserDetailFragment;
import java.util.Map;

/* renamed from: X.W4g  reason: case insensitive filesystem */
public final class C18819W4g implements DialogInterface.OnClickListener {
    public final /* synthetic */ UserDetailFragment A00;

    public C18819W4g(UserDetailFragment userDetailFragment) {
        this.A00 = userDetailFragment;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        UserDetailFragment userDetailFragment = this.A00;
        Map map = userDetailFragment.A1F.A08;
        C322366vi r4 = C322366vi.ORGANIC_INSIGHT;
        C322396vl r0 = (C322396vl) map.get(r4);
        if (r0 != null) {
            r0.A00 = 2131962468;
        }
        C322356vh r3 = userDetailFragment.A1F;
        View view = userDetailFragment.mView;
        View view2 = userDetailFragment.A11.A01;
        Object obj = r3.A08.get(r4);
        if (obj != null) {
            C322356vh.A00(view, view2, (C322386vk) obj, r3);
            dialogInterface.dismiss();
            return;
        }
        throw AnonymousClass7TE.A0y();
    }
}
