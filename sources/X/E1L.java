package X;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.igds.components.headline.IgdsHeadline;

public final class E1L extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "UnfollowChainingBottomSheetFragment";
    public Ey5 A00;
    public String A01 = "";
    public final AnonymousClass0eM A02 = C227642jf.A02(this);

    public final String getModuleName() {
        return "unfollow_chaining_bottom_sheet";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A02);
    }

    public final void onCreate(Bundle bundle) {
        String str;
        int A022 = AnonymousClass0fD.A02(1322041663);
        E1L.super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 == null || (str = bundle2.getString(Dbm.A01())) == null) {
            str = "";
        }
        this.A01 = str;
        AnonymousClass0fD.A09(-1720742949, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-145746771);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.unfollow_chaining_bottom_sheet, viewGroup, false);
        IgdsHeadline igdsHeadline = (IgdsHeadline) AnonymousClass7TE.A0b(inflate, R.id.unfollow_chaining_headline);
        igdsHeadline.setImageResource(R.drawable.ig_illustrations_qp_confirm_refresh);
        String A0z = DbV.A0z(this, this.A01, 2131975866);
        0qQ.A07(A0z);
        String str = this.A01;
        SpannableStringBuilder A0C = DbS.A0C(A0z);
        DbV.A1D(A0C, str);
        igdsHeadline.setHeadline((CharSequence) A0C);
        igdsHeadline.ENc(FPC.A00(this, 34), 2131975865);
        AnonymousClass0fD.A09(322018022, A022);
        return inflate;
    }
}
