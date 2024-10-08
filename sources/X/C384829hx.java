package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;

/* renamed from: X.9hx  reason: invalid class name and case insensitive filesystem */
public final class C384829hx extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "FollowRequestMessageBottomSheet";
    public final AnonymousClass0eM A00 = C227642jf.A02(this);

    public final String getModuleName() {
        return "follow_request_message_bottom_sheet";
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return (AnonymousClass0wW) this.A00.getValue();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(-1358423790);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_follow_request_message_bottom_sheet, viewGroup, false);
        0qQ.A07(inflate);
        AnonymousClass0fD.A09(-1021328021, A02);
        return inflate;
    }
}
