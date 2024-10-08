package X;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.instagram.android.R;

/* renamed from: X.E1d  reason: case insensitive filesystem */
public final class C47411E1d extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "QuickSnapEducationFragment";
    public final AnonymousClass0eM A00 = C227642jf.A02(this);

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        int i;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        FP2.A00(view.findViewById(R.id.quick_snap_education_close_button), 10, this);
        ImageView A0G = DbS.A0G(view, R.id.quick_snap_education_image);
        if (A0G != null) {
            Context context = A0G.getContext();
            boolean A02 = AnonymousClass39U.A02(AnonymousClass7TE.A0l(this.A00));
            boolean A07 = C61670oa.A07();
            if (A02) {
                i = R.drawable.peek_nux_qsnuxfeedstatic;
                if (A07) {
                    i = R.drawable.peek_nux_qsnuxfeedstaticandroid;
                }
            } else {
                i = R.drawable.peek_nux_peekdirectstatic;
                if (A07) {
                    i = R.drawable.peek_nux_peeknuxstaticandroid;
                }
            }
            DbU.A13(context, A0G, i);
        }
        TextView A0d = AnonymousClass7TE.A0d(view, R.id.quick_snap_education_bullet_two);
        int i2 = 2131971158;
        if (AnonymousClass39U.A03(AnonymousClass7TE.A0l(this.A00))) {
            i2 = 2131971159;
        }
        A0d.setText(i2);
        TextView A0d2 = AnonymousClass7TE.A0d(view, R.id.quick_snap_education_bullet_respectful);
        Context context2 = A0d2.getContext();
        String A16 = AnonymousClass7TE.A16(context2, 2131956463);
        SpannableStringBuilder A08 = DbW.A08(context2, 2131971156);
        AnonymousClass7AV.A05(A08, new C46691DjK(A0d2, this, A16, 2), A16);
        DbX.A1G(A0d2, A08);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A00);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(495491793);
        0qQ.A0B(layoutInflater, 0);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.layout_quick_snap_education, false);
        AnonymousClass0fD.A09(305936592, A02);
        return A0D;
    }

    public final void onResume() {
        int A02 = AnonymousClass0fD.A02(1063532217);
        super.onResume();
        C317756nm.A03(requireActivity(), (Fragment) null, AnonymousClass7TE.A0l(this.A00), false, false);
        AnonymousClass0fD.A09(773131232, A02);
    }

    public final void onStop() {
        int A02 = AnonymousClass0fD.A02(-1652877537);
        C47411E1d.super.onStop();
        C317756nm.A02(requireActivity(), this, AnonymousClass7TE.A0l(this.A00), false, false);
        AnonymousClass0fD.A09(2146723591, A02);
    }
}
