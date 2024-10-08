package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;

public final class K4h extends AnonymousClass4DH implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "BoostErrorFragment";
    public final AnonymousClass0eM A00 = C227642jf.A02(this);

    public final void configureActionBar(2da r2) {
        0qQ.A0B(r2, 0);
        DbW.A1C(r2, "");
    }

    public final String getModuleName() {
        return "boost_error_fragment";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        TextView A0d = AnonymousClass7TE.A0d(view, R.id.title_view);
        if (A0d != null) {
            A0d.setText(2131974094);
        }
        TextView A0d2 = AnonymousClass7TE.A0d(view, R.id.description_view);
        if (A0d2 != null) {
            A0d2.setText(2131961756);
        }
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A00);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(-294254998);
        0qQ.A0B(layoutInflater, 0);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.boost_error_fragment, false);
        AnonymousClass0fD.A09(574499886, A02);
        return A0D;
    }
}
