package X;

import android.os.Bundle;
import com.instagram.profile.fragment.UserDetailFragment;
import java.util.ArrayList;
import java.util.Collections;

public final /* synthetic */ class WE3 implements 06c {
    public final /* synthetic */ UserDetailFragment A00;

    public /* synthetic */ WE3(UserDetailFragment userDetailFragment) {
        this.A00 = userDetailFragment;
    }

    public final void DGi(String str, Bundle bundle) {
        UserDetailFragment userDetailFragment = this.A00;
        C294265mA A002 = C14204Trj.A00(bundle.getInt("arg_user_feed_source"));
        String string = bundle.getString("arg_user_feed_source_next_max_id");
        boolean z = bundle.getBoolean("arg_user_feed_is_first_page");
        String[] stringArray = bundle.getStringArray("arg_user_feed_pending_media_ids");
        if (stringArray != null) {
            if (z) {
                userDetailFragment.A0z.A0N(A002);
                if (userDetailFragment.A1x) {
                    userDetailFragment.A0z.A0O(A002);
                }
            }
            ArrayList arrayList = new ArrayList();
            for (String A0U : stringArray) {
                1Xj A0U2 = DbV.A0U(userDetailFragment.A0I, A0U);
                if (A0U2 != null) {
                    arrayList.add(A0U2);
                }
            }
            C321646uW.A00(userDetailFragment.A0j, A002).A03.A03.A07 = string;
            UserDetailFragment.A0K(userDetailFragment.getContext(), A002, userDetailFragment, Collections.unmodifiableList(arrayList), z, false);
        }
    }
}
