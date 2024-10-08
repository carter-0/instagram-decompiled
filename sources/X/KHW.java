package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.igds.components.textcell.IgdsListCell;

public final class KHW extends IgLinearLayout {
    public C2355930l A00;
    public C331157Pu A01;
    public final AnonymousClass4DH A02;
    public final UserSession A03;
    public final IgdsListCell A04;
    public final IgdsListCell A05;
    public final IgdsListCell A06;
    public final IgdsListCell A07;
    public final IgdsListCell A08;
    public final AnonymousClass0eM A09;
    public final View A0A;
    public final IgTextView A0B;

    public KHW(AnonymousClass4DH r6, UserSession userSession) {
        super(DbT.A06(r6, userSession, 1));
        this.A03 = userSession;
        this.A02 = r6;
        View inflate = DbV.A0D(this).inflate(R.layout.layout_audience_radio_button_list, this);
        0qQ.A07(inflate);
        this.A0A = inflate;
        this.A05 = (IgdsListCell) AnonymousClass7TF.A0F(inflate, R.id.everyone_toggle);
        this.A04 = (IgdsListCell) AnonymousClass7TF.A0F(inflate, R.id.close_friends_toggle);
        this.A06 = (IgdsListCell) AnonymousClass7TF.A0F(inflate, R.id.followers_toggle);
        this.A07 = (IgdsListCell) AnonymousClass7TF.A0F(inflate, R.id.public_account_followers_only_toggle);
        this.A08 = (IgdsListCell) AnonymousClass7TF.A0F(inflate, R.id.subscribers_only_toggle);
        this.A0B = DbX.A0Z(inflate, R.id.footer_text);
        this.A09 = DbS.A0I(C66296MMf.A00(r6, 0), C66296MMf.A00(this, 1), MMY.A00(r6, (Object) null, 22), DbS.A0z(C60259JiG.class));
    }

    private final String getShareSheetLoggingModule() {
        return "clips_share_sheet";
    }

    private final C60259JiG getViewModel() {
        return JTT.A0P(this.A09);
    }

    public static /* synthetic */ void setEnabledStateOfAllRadioButtons$default(KHW khw, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        khw.setEnabledStateOfAllRadioButtons(z);
    }

    public final void A00() {
        AnonymousClass4DH r6 = this.A02;
        FragmentActivity requireActivity = r6.requireActivity();
        UserSession userSession = this.A03;
        this.A00 = new C2355930l(requireActivity, userSession);
        IgdsListCell igdsListCell = this.A05;
        C69349Njo njo = C69349Njo.TYPE_RADIO;
        igdsListCell.setTextCellType(njo);
        IgdsListCell igdsListCell2 = this.A04;
        igdsListCell2.setTextCellType(njo);
        IgdsListCell igdsListCell3 = this.A06;
        igdsListCell3.setTextCellType(njo);
        IgdsListCell igdsListCell4 = this.A07;
        igdsListCell4.setTextCellType(njo);
        IgdsListCell igdsListCell5 = this.A08;
        igdsListCell5.setTextCellType(njo);
        AnonymousClass0eM r11 = this.A09;
        if (JTT.A0P(r11).A01.A01) {
            Context context = getContext();
            Drawable drawable = context.getDrawable(R.drawable.instagram_circle_star_pano_filled_24);
            if (drawable != null) {
                igdsListCell2.A0A(drawable, DbV.A0n(context, R.color.igds_active_badge));
            } else {
                throw AnonymousClass7TE.A0w("Required value was null.");
            }
        }
        if (JTT.A0P(r11).A01.A00) {
            Drawable drawable2 = AnonymousClass7TE.A0S(this).getDrawable(R.drawable.exclusive_content_audience_selector_crown);
            if (drawable2 != null) {
                igdsListCell5.A0A(drawable2, (Integer) null);
            } else {
                throw AnonymousClass7TE.A0w("Required value was null.");
            }
        }
        LZJ.A00(igdsListCell, this, 10);
        LZJ.A00(igdsListCell2, this, 11);
        LZJ.A00(igdsListCell3, this, 12);
        LZJ.A00(igdsListCell4, this, 13);
        LZJ.A00(igdsListCell5, this, 14);
        boolean A1W = AnonymousClass7TF.A1W(JTR.A0w(userSession), AnonymousClass05K.A01);
        IgTextView igTextView = this.A0B;
        Context context2 = getContext();
        int i = 2131955213;
        if (A1W) {
            i = 2131955214;
        }
        DbT.A18(context2, igTextView, i);
        07U r3 = 07U.A05;
        AnonymousClass07Z viewLifecycleOwner = r6.getViewLifecycleOwner();
        AnonymousClass0xx A002 = AnonymousClass07a.A00(viewLifecycleOwner);
        MHO A032 = MHO.A03(viewLifecycleOwner, r3, this, (AnonymousClass4D7) null, 10);
        19B r2 = 19B.A00;
        AnonymousClass07Z A0I = JTP.A0I(r6, r2, A032, A002);
        1Eo.A05(r2, MHO.A03(A0I, r3, this, (AnonymousClass4D7) null, 11), AnonymousClass07a.A00(A0I));
    }

    public final C331157Pu getBottomSheet() {
        return this.A01;
    }

    public final void setEnabledStateOfAllRadioButtons(boolean z) {
        this.A04.setEnabled(z);
        this.A05.setEnabled(z);
        this.A06.setEnabled(z);
        this.A07.setEnabled(z);
        this.A08.setEnabled(z);
    }

    public final void setBottomSheet(C331157Pu r1) {
        this.A01 = r1;
    }
}
