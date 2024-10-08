package X;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.follow.autofollowback.AutoFollowBackBottomSheetData;
import com.instagram.igds.components.headline.IgdsHeadline;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public final class E7G extends MYR {
    public static final String __redex_internal_original_name = "AutoFollowBackBottomSheetFragment";
    public F2D A00;
    public boolean A01;
    public final Set A02 = DbS.A0y();
    public final AnonymousClass0eM A03 = C227642jf.A02(this);

    public final String getModuleName() {
        return "auto_follow_back_bottom_sheet";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        ArrayList parcelableArrayList;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        IgdsHeadline igdsHeadline = (IgdsHeadline) AnonymousClass7TF.A0F(view, R.id.headline);
        igdsHeadline.setHeadline((CharSequence) getString(2131953339));
        igdsHeadline.setBody((CharSequence) getString(2131953338));
        int i = Build.VERSION.SDK_INT;
        Bundle bundle2 = this.mArguments;
        if (i >= 33) {
            if (bundle2 != null) {
                parcelableArrayList = bundle2.getParcelableArrayList("auto_follow_back_list_data", AutoFollowBackBottomSheetData.class);
            } else {
                return;
            }
        } else if (bundle2 != null) {
            parcelableArrayList = bundle2.getParcelableArrayList("auto_follow_back_list_data");
        } else {
            return;
        }
        if (parcelableArrayList != null) {
            ArrayList A1C = AnonymousClass7TE.A1C();
            Iterator A1G = AnonymousClass7TE.A1G(parcelableArrayList);
            while (A1G.hasNext()) {
                AutoFollowBackBottomSheetData autoFollowBackBottomSheetData = (AutoFollowBackBottomSheetData) A1G.next();
                String str = autoFollowBackBottomSheetData.A01;
                String str2 = autoFollowBackBottomSheetData.A03;
                ImageUrl imageUrl = autoFollowBackBottomSheetData.A00;
                String str3 = autoFollowBackBottomSheetData.A02;
                A1C.add(new C47244DtV(imageUrl, new C49477EwI(this, str3), str, str2));
                this.A02.add(str3);
            }
            Bundle bundle3 = this.mArguments;
            if (bundle3 != null && bundle3.getBoolean("auto_follow_back_system_setting_enabled", false)) {
                A1C.add(new C47242DtT(new Eu0(this), DbU.A0m(this, 2131953348), DbU.A0m(this, 2131953345)));
            }
            A0B(A1C);
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.2tF, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v0, types: [X.2tF, java.lang.Object] */
    public final Collection getDefinitions() {
        return 0sr.A1P(new C232232tF[]{new Object(), new Object()});
    }

    public final OID getRecyclerConfigBuilder() {
        return configBuilder(G3U.A00);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A03);
    }
}
