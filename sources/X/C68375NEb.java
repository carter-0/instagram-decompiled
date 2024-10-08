package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.NEb  reason: case insensitive filesystem */
public abstract class C68375NEb extends C7921Qcs {
    public final void onViewCreated(View view, Bundle bundle) {
        int i;
        0qQ.A0B(view, 0);
        View A00 = SKW.A00(view, R.id.tv_permissions_title);
        0qQ.A0C(A00, "null cannot be cast to non-null type com.facebook.smartcapture.ui.ResourcesTextView");
        TextView textView = (TextView) A00;
        if (this instanceof C68374NEa) {
            i = R.string.f0nameremoved;
        } else {
            i = R.string.f0nameremoved;
        }
        textView.setText(i);
        C71403Ok2.A01(SKW.A00(view, R.id.btn_camera_access_allow), 2, this);
        C71403Ok2.A01(SKW.A00(view, R.id.btn_camera_access_deny), 3, this);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(-885655930);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.default_credit_card_permissions_fragment, viewGroup, false);
        AnonymousClass0fD.A09(76470324, A02);
        return inflate;
    }
}
