package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;

/* renamed from: X.NIo  reason: case insensitive filesystem */
public final class C68450NIo extends AnonymousClass4DH implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "DirectIntermediateViewerSheetFragment";
    public final AnonymousClass0eM A00 = C227642jf.A02(this);

    public final void configureActionBar(2da r3) {
        0qQ.A0B(r3, 0);
        r3.ErN(getString(2131959226));
        r3.ENd(requireActivity().getDrawable(2Yu.A02(getContext())));
        r3.Eu4(true);
        Dbc.A0k(r3);
    }

    public final String getModuleName() {
        return "direct_intermediate_viewer_sheet_fragment";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        String str2;
        String str3;
        Integer A0o;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        Bundle bundle2 = this.mArguments;
        String str4 = null;
        if (bundle2 != null) {
            str = bundle2.getString("direct_emoji_collection_item_id");
        } else {
            str = null;
        }
        Bundle bundle3 = this.mArguments;
        if (bundle3 != null) {
            str2 = bundle3.getString("direct_emoji_collection_type");
        } else {
            str2 = null;
        }
        Bundle bundle4 = this.mArguments;
        if (bundle4 != null) {
            str3 = bundle4.getString("direct_emoji_thread_id");
        } else {
            str3 = null;
        }
        Bundle bundle5 = this.mArguments;
        if (bundle5 != null) {
            str4 = bundle5.getString("direct_emoji_message_id");
        }
        Bundle bundle6 = this.mArguments;
        if (bundle6 == null || (A0o = DbV.A0o(bundle6, "DirectFragment.DIRECT_FRAGMENT_ARGUMENT_CURRENT_THEME_ID")) == null) {
            throw AnonymousClass7TE.A0y();
        }
        int intValue = A0o.intValue();
        Bundle A0A = DbV.A0A(AnonymousClass7TF.A0L(this.A00, 0));
        A0A.putString("direct_emoji_collection_item_id", str);
        A0A.putString("direct_emoji_collection_type", str2);
        A0A.putString("direct_emoji_thread_id", str3);
        A0A.putString("direct_emoji_message_id", str4);
        A0A.putInt("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_CURRENT_THEME_ID", intValue);
        A0A.putBoolean(AnonymousClass000.A00(60), false);
        NK7 nk7 = new NK7();
        nk7.setArguments(A0A);
        nk7.A01 = new C72627PDg(this);
        0s1 A0C = DbW.A0C(this);
        A0C.A0A(nk7, R.id.child_fragment_container);
        A0C.A00();
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A00);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(1762789968);
        0qQ.A0B(layoutInflater, 0);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.direct_intermediate_viewer_sheet_fragment, false);
        AnonymousClass0fD.A09(1103766130, A02);
        return A0D;
    }
}
