package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgFrameLayout;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;

public final class KHP extends IgFrameLayout {
    public final View A00;
    public final AnonymousClass4DH A01;
    public final UserSession A02;
    public final IgLinearLayout A03;
    public final IgSimpleImageView A04;
    public final IgSimpleImageView A05;
    public final IgSimpleImageView A06;
    public final IgTextView A07;
    public final IgTextView A08;
    public final C62439Kfp A09;
    public final String A0A;
    public final String A0B = "add_button_row";
    public final String A0C;
    public final AnonymousClass0eM A0D;

    public KHP(AnonymousClass4DH r7, UserSession userSession, C62439Kfp kfp, String str, String str2) {
        super(DbT.A06(r7, str2, 5));
        this.A02 = userSession;
        this.A01 = r7;
        this.A09 = kfp;
        this.A0A = str;
        this.A0C = str2;
        View inflate = DbV.A0D(this).inflate(R.layout.add_button_row, this);
        0qQ.A07(inflate);
        this.A00 = inflate;
        this.A05 = DbX.A0Y(inflate, R.id.add_message_row_icon);
        this.A08 = DbX.A0Z(inflate, R.id.add_message_title_label);
        this.A03 = (IgLinearLayout) AnonymousClass7TF.A0F(inflate, R.id.add_message_selected_layout);
        this.A07 = DbX.A0Z(inflate, R.id.add_message_selected_subtitle_label);
        this.A04 = DbX.A0Y(inflate, R.id.chevron_icon);
        this.A06 = DbX.A0Y(inflate, R.id.remove_icon);
        MMQ A002 = MMQ.A00(this, 23);
        AnonymousClass0eM A003 = AnonymousClass0eN.A00(0eO.A02, MMQ.A00(MMQ.A00(r7, 20), 21));
        this.A0D = DbS.A0I(MMQ.A00(A003, 22), A002, C66291MMa.A00((Object) null, A003, 37), DbS.A0z(C60283Jie.class));
    }

    /* access modifiers changed from: private */
    public final C60283Jie getViewModel() {
        return (C60283Jie) this.A0D.getValue();
    }

    public static final void A01(KHP khp) {
        C60283Jie viewModel = khp.getViewModel();
        AnonymousClass7TE.A1Z(new MG0(viewModel, (AnonymousClass4D7) null, 28), C318116oQ.A00(viewModel));
    }

    public final void A02() {
        C60283Jie viewModel = getViewModel();
        2Fk r4 = viewModel.A00;
        AnonymousClass4DH r3 = this.A01;
        r4.A06(r3.getViewLifecycleOwner(), new C64317LZr(this, 11));
        DbZ.A1C(r3, MGV.A01(this, (AnonymousClass4D7) null, 47), viewModel.A06);
    }
}
