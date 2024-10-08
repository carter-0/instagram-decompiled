package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;

/* renamed from: X.E6p  reason: case insensitive filesystem */
public abstract class C47529E6p extends C273374mT {
    public static final String __redex_internal_original_name = "IgFxFragment";
    public Window A00;
    public C71662eb A01;

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(-417293314);
        View A0C = DbT.A0C(layoutInflater, viewGroup, R.layout.bloks_fragment);
        AnonymousClass0fD.A09(624427050, A02);
        return A0C;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.A01 = DbY.A0T(view, R.id.error_view_stub);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            this.A00 = activity.getWindow();
        }
        C48916EmG.A00().A00(getContext(), this.A00, false, false);
    }
}
