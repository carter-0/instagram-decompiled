package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.igds.components.headline.IgdsHeadline;
import com.instagram.user.model.User;

public final class K4D extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "IgLiveModeratorViewerWarningFragment";
    public User A00;
    public String A01;
    public final AnonymousClass0eM A02 = C227642jf.A02(this);

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String string;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        Bundle bundle2 = this.mArguments;
        if (!(bundle2 == null || (string = bundle2.getString("args.broadcaster_id")) == null)) {
            this.A01 = string;
        }
        User A022 = JTR.A0u(this.A02).A02(this.A01);
        this.A00 = A022;
        if (A022 != null) {
            ((IgdsHeadline) AnonymousClass7TF.A0F(view, R.id.moderator_viewer_warning_headline)).setBody((CharSequence) DbV.A0z(this, A022.getUsername(), 2131965274));
        }
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A02);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-414454675);
        K4D.super.onCreate(bundle);
        requireArguments();
        AnonymousClass0fD.A09(-341089181, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1769732199);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_iglive_moderator_viewer_warning_fragment, viewGroup, false);
        AnonymousClass0fD.A09(871788802, A022);
        return inflate;
    }
}
