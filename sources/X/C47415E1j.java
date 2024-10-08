package X;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import java.util.concurrent.CancellationException;

/* renamed from: X.E1j  reason: case insensitive filesystem */
public final class C47415E1j extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "PromoteFbPreviewFragment";
    public View A00;
    public View A01;
    public C262204Co A02;
    public final AnonymousClass0eM A03 = C227642jf.A02(this);
    public final AnonymousClass0eM A04;

    public final String getModuleName() {
        return "promote_fb_preview";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A01 = view.requireViewById(R.id.main_container);
        this.A00 = view.requireViewById(R.id.loading_spinner);
        AnonymousClass0eM r5 = this.A04;
        Dba.A16(getViewLifecycleOwner(), ((C46761Dko) r5.getValue()).A00, new C58728Iwb(this, 45), 50);
        ViewGroup A0I = DbX.A0I(view, R.id.ad_preview_options_container);
        A0I.removeAllViews();
        for (EWU ewu : ((C46761Dko) r5.getValue()).A05) {
            View inflate = LayoutInflater.from(getActivity()).inflate(R.layout.promote_fb_preview_option, A0I, false);
            FPE.A01(inflate, 27, ewu, this);
            DbU.A0G(inflate, R.id.preview_option_title).setText(ewu.A01);
            DbU.A0F(inflate, R.id.preview_option_icon).setImageDrawable(requireActivity().getDrawable(ewu.A00));
            A0I.addView(inflate);
        }
        TextView A0R = AnonymousClass7TG.A0R(view, R.id.promote_preview_disclaimer);
        String A0m = DbU.A0m(this, 2131970678);
        String A0z = DbV.A0z(this, A0m, 2131970676);
        0qQ.A07(A0z);
        SpannableStringBuilder A0C = DbS.A0C(A0z);
        AnonymousClass7AV.A03(A0C, new ESx(this, Dbb.A04(this)), A0m);
        DbX.A1G(A0R, A0C);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A03);
    }

    public C47415E1j() {
        C20694WxQ wxQ = new C20694WxQ(this, 19);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new C20694WxQ(new C20694WxQ(this, 16), 17));
        this.A04 = DbS.A0I(new C20694WxQ(A002, 18), wxQ, new C41566AwY(17, (Object) null, A002), DbS.A0z(C46761Dko.class));
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1575284821);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.promote_fragment_fb_preview, viewGroup, false);
        AnonymousClass0fD.A09(-250325321, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(123931913);
        super.onDestroyView();
        this.A01 = null;
        this.A00 = null;
        AnonymousClass0fD.A09(959920878, A022);
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [X.07Z, X.E1j, androidx.fragment.app.Fragment, java.lang.Object] */
    public final void onStart() {
        int A022 = AnonymousClass0fD.A02(1824468022);
        C47415E1j.super.onStart();
        this.A02 = AnonymousClass11O.A03(DbW.A0E(this), new C61860pz(new MGZ(this, (AnonymousClass4D7) null, 31), ((C46761Dko) this.A04.getValue()).A07));
        AnonymousClass0fD.A09(881049089, A022);
    }

    public final void onStop() {
        int A022 = AnonymousClass0fD.A02(-1270816532);
        C47415E1j.super.onStop();
        C262204Co r1 = this.A02;
        if (r1 != null) {
            r1.AG7((CancellationException) null);
        }
        this.A02 = null;
        AnonymousClass0fD.A09(-1998898775, A022);
    }
}
