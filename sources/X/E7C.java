package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.simplewebview.SimpleWebViewConfig;

public final class E7C extends C273374mT implements AnonymousClass4DU, AnonymousClass4DS {
    public static final String __redex_internal_original_name = "DisclaimerPageFragment";
    public String A00;
    public String A01;
    public String A02;

    public final String getModuleName() {
        return C273654mx.A00(674);
    }

    public final boolean isOrganicEligible() {
        return false;
    }

    public final boolean isSponsoredEligible() {
        return true;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        View view2 = view;
        super.onViewCreated(view2, bundle);
        2dZ AYJ = requireActivity().AYJ();
        AYJ.getClass();
        AYJ.A0T();
        TextView A0d = AnonymousClass7TE.A0d(view2, R.id.page_voice);
        C71662eb A0T = DbY.A0T(view2, R.id.text_view_stub);
        C71662eb A0T2 = DbY.A0T(view2, R.id.web_view_stub);
        String str = this.A01;
        if (str != null) {
            String str2 = this.A02;
            if (str2 != null) {
                UserSession session = getSession();
                0s1 A0C = DbW.A0C(this);
                DbY.A0y(A0d.getResources(), A0d, str.toLowerCase(), 2131960826);
                SimpleWebViewConfig simpleWebViewConfig = new SimpleWebViewConfig((String) null, (String) null, false, false, false, false, true, true, false, false, true, false, false, false, (String) null, str2);
                Bundle A0a = AnonymousClass7TE.A0a();
                A0a.putParcelable("SimpleWebViewFragment.SIMPLE_WEB_VIEW_CONFIG", simpleWebViewConfig);
                DbU.A1D(A0a, session);
                AnonymousClass4DH r1 = new AnonymousClass4DH();
                r1.setArguments(A0a);
                A0C.A09(r1, R.id.web_view_fragment);
                A0C.A00();
                A0T2.A01().setVisibility(0);
                return;
            }
            String str3 = this.A00;
            if (str3 != null) {
                DbY.A0y(A0d.getResources(), A0d, str.toLowerCase(), 2131960826);
                ((TextView) A0T.A01()).setText(str3);
            }
        }
    }

    public final void configureActionBar(2da r3) {
        DbW.A1B(r3, 2131960825);
        r3.ErJ(new F3V(AnonymousClass05K.A00).A00());
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1383940749);
        E7C.super.onCreate(bundle);
        this.A01 = requireArguments().getString(AnonymousClass000.A00(2241));
        this.A00 = requireArguments().getString(AnonymousClass000.A00(2240));
        this.A02 = requireArguments().getString(AnonymousClass000.A00(2242));
        AnonymousClass0fD.A09(-1637261349, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(992534044);
        View A0C = DbT.A0C(layoutInflater, viewGroup, R.layout.fragment_disclaimer_page);
        AnonymousClass0fD.A09(-1928763940, A022);
        return A0C;
    }
}
