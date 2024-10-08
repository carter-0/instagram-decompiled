package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;

/* renamed from: X.Uhh  reason: case insensitive filesystem */
public final class C15736Uhh extends C232222tE {
    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TF.A1H(viewGroup, layoutInflater);
        return new UEH(DbU.A09(layoutInflater, viewGroup, R.layout.fan_club_earnings_row, false));
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r7, C249703kE r8) {
        C19268WSb wSb = (C19268WSb) r7;
        UEH ueh = (UEH) r8;
        AnonymousClass7TF.A1H(wSb, ueh);
        Context A07 = DbS.A07(ueh);
        ueh.A04.setText(wSb.A04);
        ueh.A03.setText(wSb.A03);
        DbT.A18(A07, ueh.A02, 2131976285);
        ueh.A01.setText(wSb.A05);
        DbT.A18(A07, ueh.A00, 2131962049);
        ueh.A07.setText(Pxg.A0v(String.valueOf(wSb.A00), AnonymousClass1Q2.A02(), new Object[0], 0));
        DbT.A18(A07, ueh.A05, 2131961956);
        ueh.A08.setText(Pxg.A0v(String.valueOf(wSb.A01), AnonymousClass1Q2.A02(), new Object[0], 0));
        DbT.A18(A07, ueh.A06, 2131962025);
        ueh.A09.setText(Pxg.A0v(String.valueOf(wSb.A02), AnonymousClass1Q2.A02(), new Object[0], 0));
    }

    public final Class modelClass() {
        return C19268WSb.class;
    }
}
