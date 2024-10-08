package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import com.instagram.android.R;
import com.instagram.appreciation.funding.AppreciationBuyAndSendViewModel;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.ui.widget.spinner.SpinnerImageView;

public final class K5N extends AnonymousClass4DH implements AnonymousClass4DR {
    public static final String __redex_internal_original_name = "AppreciationBuyAndSendFragment";
    public Space A00;
    public C59995Jd4 A01;
    public MRT A02;
    public IgTextView A03;
    public IgTextView A04;
    public IgTextView A05;
    public IgImageView A06;
    public C252063oV A07;
    public IgdsBottomButtonLayout A08;
    public SpinnerImageView A09;
    public final AnonymousClass0eM A0A = C227642jf.A02(this);
    public final AnonymousClass0eM A0B;

    public final String getModuleName() {
        return "appreciation_buy_and_send";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A09 = (SpinnerImageView) view.requireViewById(R.id.loading);
        this.A06 = DbT.A0b(view, R.id.gift_image);
        this.A05 = DbT.A0a(view, R.id.title);
        this.A03 = DbT.A0a(view, R.id.current_balance);
        this.A04 = DbT.A0a(view, R.id.explanation);
        this.A08 = DbT.A0c(view, R.id.buy_and_send_button);
        this.A00 = (Space) view.requireViewById(R.id.space_terms);
        this.A07 = DbV.A0T(view, R.id.buy_send_banner_stub, false);
        Space space = this.A00;
        if (space == null) {
            0qQ.A0F("termsPlaceHolder");
            throw AnonymousClass00P.createAndThrow();
        }
        space.getLayoutParams().height = (int) (0nA.A03(requireContext(), 12.0f) * 1.12f * 2.0f);
        07U r2 = 07U.A05;
        AnonymousClass07Z viewLifecycleOwner = getViewLifecycleOwner();
        AnonymousClass0xx A002 = AnonymousClass07a.A00(viewLifecycleOwner);
        MHH mhh = new MHH(r2, this, viewLifecycleOwner, (AnonymousClass4D7) null, 9);
        19B r4 = 19B.A00;
        1Eo.A05(r4, mhh, A002);
        2YL A0H = DbS.A0H(this.A0B);
        1Eo.A05(r4, new MHA(A0H, (AnonymousClass4D7) null, 36), C318116oQ.A00(A0H));
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0A);
    }

    public final boolean onBackPressed() {
        AppreciationBuyAndSendViewModel appreciationBuyAndSendViewModel = (AppreciationBuyAndSendViewModel) this.A0B.getValue();
        appreciationBuyAndSendViewModel.A03.A02(appreciationBuyAndSendViewModel.A00, AnonymousClass05K.A01);
        return false;
    }

    public K5N() {
        MMK A002 = MMK.A00(this, 42);
        AnonymousClass0eM A003 = AnonymousClass0eN.A00(0eO.A02, MMK.A00(MMK.A00(this, 39), 40));
        this.A0B = DbS.A0I(MMK.A00(A003, 41), A002, new MMZ(26, (Object) null, (Object) A003), DbS.A0z(AppreciationBuyAndSendViewModel.class));
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1478549947);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.fragment_appreciation_buy_and_send, viewGroup, false);
        AnonymousClass0fD.A09(-1622974445, A022);
        return inflate;
    }
}
