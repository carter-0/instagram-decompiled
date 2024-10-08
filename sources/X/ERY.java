package X;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View;
import com.instagram.android.R;

public final class ERY extends C47518E6c {
    public static final String __redex_internal_original_name = "QuietModeBottomSheetFragment";
    public final AnonymousClass0eM A00 = C227642jf.A02(this);

    public final String getModuleName() {
        return "quiet_mode";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        view.setBackgroundResource(2Yu.A02(getContext()));
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A00);
    }

    public final void onResume() {
        int A02 = AnonymousClass0fD.A02(-473067057);
        super.onResume();
        AnonymousClass0eM r9 = this.A00;
        AnonymousClass3FW r7 = new AnonymousClass3FW(AnonymousClass7TE.A0l(r9));
        OTE ote = new OTE((int) R.drawable.ig_illustrations_qp_moon_refresh);
        Context requireContext = requireContext();
        long A002 = (C280074zx.A00() / 1000) + r7.A00();
        int i = 2131971217;
        if (2Au.A01(AnonymousClass7TE.A0l(r9))) {
            i = 2131973966;
        }
        FAZ faz = new FAZ((CharSequence) DbW.A0h(requireContext, FGR.A01(requireContext, A002), i));
        faz.A03 = R.style.igds_emphasized_title_panorama;
        faz.A02 = 4;
        faz.A05 = new F0T(0, AnonymousClass7TH.A01(requireContext), 0, 0, 0, 0);
        Context requireContext2 = requireContext();
        C48053ESw eSw = new C48053ESw(r7, this, AnonymousClass7TF.A03(requireContext2, R.attr.igds_color_controls));
        String A16 = AnonymousClass7TE.A16(requireContext2, 2131971218);
        int i2 = 2131971216;
        if (2Au.A01(AnonymousClass7TE.A0l(r9))) {
            i2 = 2131973965;
        }
        String string = requireContext2.getString(i2);
        StringBuilder sb = new StringBuilder(string);
        String A0B = 002.A0B(string);
        0qQ.A07(A0B);
        if (!00l.A0d(A0B, A16, false)) {
            if (00l.A0d(A0B, DbT.A12(AnonymousClass1Q2.A02(), A16), false)) {
                A16 = DbT.A12(AnonymousClass1Q2.A02(), A16);
            } else {
                sb.append(A16);
            }
        }
        SpannableStringBuilder A0C = DbS.A0C(sb.toString());
        AnonymousClass7AV.A04(A0C, eSw, A16);
        FAZ faz2 = new FAZ((CharSequence) A0C);
        faz2.A03 = R.style.igds_body_1;
        faz2.A02 = 4;
        faz2.A05 = new F0T(requireContext2.getResources().getDimensionPixelSize(R.dimen.abc_dropdownitem_icon_width), AnonymousClass7TG.A02(requireContext2), AnonymousClass7TF.A02(requireContext2, R.dimen.abc_dropdownitem_icon_width), requireContext2.getResources().getDimensionPixelSize(R.dimen.abc_dialog_padding_material), AnonymousClass7TF.A02(requireContext2, R.dimen.abc_dropdownitem_icon_width), AnonymousClass7TF.A02(requireContext2, R.dimen.abc_dropdownitem_icon_width));
        setItems(0sr.A1P(new Object[]{ote, faz, faz2}));
        AnonymousClass0fD.A09(1762349585, A02);
    }
}
