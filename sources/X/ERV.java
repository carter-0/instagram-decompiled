package X;

import android.content.Context;
import com.instagram.android.R;
import java.util.ArrayList;
import java.util.Date;

public final class ERV extends C47518E6c {
    public static final String __redex_internal_original_name = "QuietModePauseBottomSheetFragment";
    public final AnonymousClass0eM A00 = C227642jf.A02(this);

    public final String getModuleName() {
        return "quiet_mode_pause";
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A00);
    }

    public final void onResume() {
        int A02 = AnonymousClass0fD.A02(1417060822);
        super.onResume();
        Context requireContext = requireContext();
        ArrayList A1C = AnonymousClass7TE.A1C();
        A1C.add(new OTE((int) R.drawable.ig_illustrations_qp_moon_refresh));
        AnonymousClass0eM r10 = this.A00;
        int i = 2131971213;
        if (2Au.A01(AnonymousClass7TE.A0l(r10))) {
            i = 2131973961;
        }
        FAZ faz = new FAZ((CharSequence) requireContext.getString(i));
        faz.A03 = R.style.igds_emphasized_title_panorama;
        faz.A02 = 4;
        faz.A05 = new F0T(requireContext.getResources().getDimensionPixelSize(R.dimen.abc_dropdownitem_icon_width), AnonymousClass7TG.A02(requireContext), AnonymousClass7TF.A02(requireContext, R.dimen.abc_dropdownitem_icon_width), 0, AnonymousClass7TF.A02(requireContext, R.dimen.abc_dropdownitem_icon_width), AnonymousClass7TF.A02(requireContext, R.dimen.abc_dropdownitem_icon_width));
        A1C.add(faz);
        AnonymousClass0t1.A01.A01(AnonymousClass7TE.A0l(r10));
        long A0I = AnonymousClass7TG.A0I();
        long A03 = C46359DdX.A03(AnonymousClass7TE.A0l(r10), A0I);
        Date A04 = C46359DdX.A04(AnonymousClass7TE.A0l(r10), A0I);
        int i2 = 2131971207;
        if (2Au.A01(AnonymousClass7TE.A0l(r10))) {
            i2 = 2131973955;
        }
        FAZ faz2 = new FAZ((CharSequence) DbW.A0h(requireContext, FGR.A04(requireContext, A03).format(A04), i2));
        faz2.A03 = R.style.igds_body_1;
        faz2.A02 = 4;
        faz2.A05 = new F0T(AnonymousClass7TF.A02(requireContext, R.dimen.abc_dropdownitem_icon_width), AnonymousClass7TH.A01(requireContext), AnonymousClass7TF.A02(requireContext, R.dimen.abc_dropdownitem_icon_width), AnonymousClass7TG.A02(requireContext), AnonymousClass7TF.A02(requireContext, R.dimen.abc_dropdownitem_icon_width), AnonymousClass7TF.A02(requireContext, R.dimen.abc_dropdownitem_icon_width));
        A1C.add(faz2);
        setItems(A1C);
        DbV.A0F(this).setPadding(0, AnonymousClass7TF.A02(requireContext, R.dimen.abc_dropdownitem_icon_width), 0, 0);
        AnonymousClass0fD.A09(460338851, A02);
    }
}
