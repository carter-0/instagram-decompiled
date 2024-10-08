package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;

public final class QCY extends Fragment implements C13616Tdi {
    public View A00;
    public TextView A01;
    public Context A02;
    public ImageView A03;
    public TextView A04;
    public TextView A05;

    public final C11005S4z C7o() {
        return new C11005S4z((Drawable) null, (View.OnClickListener) null, (String) null, getString(2131962199), 0, 0, false, false, true);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.07g, java.lang.Object, X.QCY] */
    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        this.A01 = DbU.A0G(view, R.id.fbpay_qr_code_description);
        this.A05 = DbU.A0G(view, R.id.fbpay_qr_code_share_button);
        this.A04 = DbU.A0G(view, R.id.fbpay_qr_code_link_text);
        this.A03 = DbU.A0F(view, R.id.fbpay_qr_code_image);
        this.A00 = view.requireViewById(R.id.fbpay_progress_bar);
        TextView textView = this.A05;
        0qQ.A0A(textView);
        C11497SbK.A01(textView, 15, this);
        SRV.A00(this).A00(C7426QCr.class);
        0qQ.A0A((Object) null);
        throw AnonymousClass00P.createAndThrow();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1212994852);
        0qQ.A0B(layoutInflater, 0);
        FragmentActivity activity = getActivity();
        AnonymousClass2E0.A0E();
        0KC.A0C("FBPayIgHubManager", 002.A0c("Unknown style: ", AnonymousClass000.A00(833), 11));
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(activity, R.style.Ig4aFbPay);
        this.A02 = contextThemeWrapper;
        View inflate = layoutInflater.cloneInContext(contextThemeWrapper).inflate(R.layout.fragment_p2p_qr_code, viewGroup, false);
        AnonymousClass0fD.A09(645534204, A022);
        return inflate;
    }
}
