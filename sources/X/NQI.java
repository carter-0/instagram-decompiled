package X;

import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;

public final class NQI extends C232232tF {
    public final F0W A00;

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        JTQ.A1L(viewGroup, layoutInflater);
        return new C68020Mym(DbT.A0D(layoutInflater, viewGroup, R.layout.activity_row_layout, false));
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r16, C249703kE r17) {
        View view;
        View A0G;
        int i;
        C61168JyK jyK = (C61168JyK) r16;
        C68020Mym mym = (C68020Mym) r17;
        boolean A1U = AnonymousClass7TF.A1U(0, jyK, mym);
        F0W f0w = this.A00;
        C62587KiK kiK = jyK.A00;
        AnonymousClass7L0 r4 = jyK.A01;
        boolean z = jyK.A05;
        String str = jyK.A02;
        String str2 = jyK.A03;
        String str3 = jyK.A04;
        int i2 = 0;
        0qQ.A0B(f0w, 0);
        0qQ.A0B(kiK, A1U ? 1 : 0);
        if (z) {
            View view2 = mym.A01;
            view2.setVisibility(0);
            IgTextView igTextView = mym.A04;
            igTextView.setText(str3);
            igTextView.setSelected(A1U);
            IgTextView igTextView2 = mym.A02;
            DbT.A18(view2.getContext(), igTextView2, kiK.A00);
            AnonymousClass0fU.A00(new C50105FOv((Object) f0w, (Object) kiK, str, str2, 3), view2);
            mym.A00 = r4;
            if (r4 != null) {
                igTextView.setTextColor(r4.A0C);
                igTextView2.setTextColor(r4.A0A);
            }
            int ordinal = kiK.ordinal();
            IgTextView igTextView3 = mym.A03;
            int i3 = 8;
            if (ordinal == 0) {
                i3 = 0;
            }
            igTextView3.setVisibility(i3);
            C70649OEw oEw = mym.A05;
            C252063oV r7 = oEw.A01;
            if (r7.CVM()) {
                C66580MXl.A1Q(r7, 8);
            }
            C252063oV r0 = oEw.A00;
            DbZ.A1X(r0);
            C252063oV r2 = oEw.A03;
            DbZ.A1X(r2);
            C252063oV r1 = oEw.A02;
            DbZ.A1X(r1);
            if (ordinal != 0) {
                if (ordinal == A1U) {
                    View view3 = r0.getView();
                    view3.setVisibility(0);
                    if (r4 != null) {
                        View A0G2 = AnonymousClass7TF.A0G(view3, R.id.background_card_2);
                        View A0G3 = AnonymousClass7TF.A0G(view3, R.id.center_card);
                        A0G = AnonymousClass7TF.A0G(view3, R.id.thumbnail_timer);
                        int i4 = r4.A07;
                        A00(A0G2, i4);
                        A00(A0G3, i4);
                        i = r4.A0A;
                    } else {
                        return;
                    }
                } else if (ordinal == 2) {
                    View view4 = r2.getView();
                    view4.setVisibility(0);
                    if (r4 != null) {
                        View A0F = AnonymousClass7TF.A0F(view4, R.id.background_card_1);
                        View A0F2 = AnonymousClass7TF.A0F(view4, R.id.center_card);
                        ImageView A0J = DbX.A0J(view4, R.id.spotlight_icon);
                        int i5 = r4.A0A;
                        A00(A0F, i5);
                        A00(A0F2, r4.A07);
                        ColorStateList valueOf = ColorStateList.valueOf(i5);
                        0qQ.A07(valueOf);
                        A0J.setImageTintList(valueOf);
                        return;
                    }
                    return;
                } else if (ordinal == 3) {
                    View view5 = r1.getView();
                    view5.setVisibility(0);
                    if (r4 != null) {
                        View A0G4 = AnonymousClass7TF.A0G(view5, R.id.card);
                        View A0G5 = AnonymousClass7TF.A0G(view5, R.id.option_1_vote_bar);
                        A0G = AnonymousClass7TF.A0G(view5, R.id.option_2_vote_bar);
                        A00(A0G4, r4.A07);
                        i = r4.A0A;
                        A00(A0G5, i);
                    } else {
                        return;
                    }
                } else {
                    throw AnonymousClass7TE.A1K();
                }
                A00(A0G, i);
                return;
            }
            view = r7.getView();
        } else {
            view = mym.A01;
            i2 = 8;
        }
        view.setVisibility(i2);
    }

    public final Class modelClass() {
        return C61168JyK.class;
    }

    public NQI(F0W f0w) {
        this.A00 = f0w;
    }

    public static void A00(View view, int i) {
        ColorStateList valueOf = ColorStateList.valueOf(i);
        0qQ.A07(valueOf);
        view.setBackgroundTintList(valueOf);
    }
}
