package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.igds.components.textcell.IgdsListCell;

/* renamed from: X.EFs  reason: case insensitive filesystem */
public final class C47758EFs extends C232222tE {
    public final E7I A00;

    public final /* bridge */ /* synthetic */ void bind(C232262tL r6, C249703kE r7) {
        FY9 fy9 = (FY9) r6;
        C46964DoI doI = (C46964DoI) r7;
        AnonymousClass7TG.A1N(fy9, doI);
        Integer num = fy9.A00;
        boolean z = fy9.A01;
        0qQ.A0B(num, 0);
        IgdsListCell igdsListCell = doI.A02;
        igdsListCell.A0I(AnonymousClass7TE.A16(doI.A00, C48894Elu.A00(num)));
        igdsListCell.setChecked(z);
        igdsListCell.A0C(new FPF(15, (Object) num, (Object) doI));
    }

    public final Class modelClass() {
        return FY9.class;
    }

    public C47758EFs(E7I e7i) {
        this.A00 = e7i;
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        DbS.A1W(viewGroup);
        Context A0S = AnonymousClass7TE.A0S(viewGroup);
        IgdsListCell igdsListCell = new IgdsListCell(A0S, (AttributeSet) null);
        igdsListCell.A0G(C69349Njo.TYPE_RADIO, true);
        return new C46964DoI(A0S, this.A00, igdsListCell);
    }
}
