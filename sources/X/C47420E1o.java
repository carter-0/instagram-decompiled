package X;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.E1o  reason: case insensitive filesystem */
public final class C47420E1o extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "TieredWarningBottomSheetFragmentImpl";
    public ExQ A00;
    public UserSession A01;
    public boolean A02 = false;

    public final String getModuleName() {
        return "tiered_warning";
    }

    public final AnonymousClass0wW getSession() {
        return this.A01;
    }

    public static void A00(C47420E1o e1o) {
        AnonymousClass37D A022 = AnonymousClass37D.A00.A02(e1o.requireContext());
        C331157Pu A002 = C48943Emh.A00(A022);
        if (e1o.A02 && A002 != null) {
            A002.A0T();
        } else if (A022 != null) {
            A022.A0B();
        }
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1763495137);
        C47420E1o.super.onCreate(bundle);
        this.A01 = DbX.A0U(this);
        this.A02 = DbT.A1X(requireArguments(), AnonymousClass000.A00(313));
        AnonymousClass0fD.A09(-1565375685, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        int A022 = AnonymousClass0fD.A02(-689921749);
        View inflate = layoutInflater.inflate(R.layout.tiered_warning_bottom_sheet, viewGroup, false);
        View requireViewById = inflate.requireViewById(R.id.consequences_row_0);
        TextView A0d = AnonymousClass7TE.A0d(requireViewById, R.id.consequence_text);
        Context requireContext = requireContext();
        String string = requireContext.getString(2131975364);
        String string2 = requireContext.getString(2131975361);
        if (string.contains(string2)) {
            SpannableStringBuilder A0C = DbS.A0C(string);
            i = R.attr.igds_color_link;
            AnonymousClass7AV.A05(A0C, new ESx(Integer.valueOf(DbV.A02(requireContext)), (Object) this, 60), string2);
            if (A0d != null) {
                DbX.A1G(A0d, A0C);
                A0d.setHighlightColor(R.color.fds_transparent);
            }
        } else {
            SpannableStringBuilder A0C2 = DbS.A0C(string2);
            i = R.attr.igds_color_link;
            Dba.A0x(A0C2, new ESx(Integer.valueOf(DbV.A02(requireContext)), (Object) this, 61));
            if (A0d != null) {
                DbT.A1H(A0d);
                A0d.setText(DbZ.A0B(getString(2131975365), A0C2).append("."));
            }
        }
        ImageView A0G = DbS.A0G(requireViewById, R.id.consequence_icon);
        if (A0G != null) {
            A0G.setImageResource(R.drawable.instagram_shield_pano_outline_24);
        }
        View requireViewById2 = inflate.requireViewById(R.id.consequences_row_1);
        TextView A0d2 = AnonymousClass7TE.A0d(requireViewById2, R.id.consequence_text);
        if (A0d2 != null) {
            A0d2.setText(2131975362);
        }
        ImageView A0G2 = DbS.A0G(requireViewById2, R.id.consequence_icon);
        if (A0G2 != null) {
            A0G2.setImageResource(R.drawable.instagram_eye_off_pano_outline_24);
        }
        View requireViewById3 = inflate.requireViewById(R.id.consequences_row_2);
        TextView A0d3 = AnonymousClass7TE.A0d(requireViewById3, R.id.consequence_text);
        if (A0d3 != null) {
            A0d3.setText(2131975363);
        }
        ImageView A0G3 = DbS.A0G(requireViewById3, R.id.consequence_icon);
        if (A0G3 != null) {
            A0G3.setImageResource(R.drawable.instagram_warning_pano_outline_24);
        }
        TextView A0G4 = DbU.A0G(inflate, R.id.let_us_know_footer);
        Context requireContext2 = requireContext();
        SpannableStringBuilder A0C3 = DbS.A0C(getString(2131975366));
        Dba.A0x(A0C3, new ESx(DbV.A0n(requireContext(), 2Yu.A0H(requireContext2, i)), (Object) this, 59));
        DbT.A1H(A0G4);
        A0G4.setHighlightColor(requireContext2.getColor(R.color.fds_transparent));
        A0G4.setText(DbZ.A0B(getString(2131975367), A0C3).append("."));
        ((C3021461u) inflate.requireViewById(R.id.tiered_warning_bottom_button)).setPrimaryActionOnClickListener(new C50109FOz((Object) this, 23));
        AnonymousClass0fD.A09(702637055, A022);
        return inflate;
    }
}
