package X;

import android.util.AttributeSet;
import android.view.ViewGroup;
import com.instagram.igds.components.textcell.IgdsListCell;
import java.util.List;

/* renamed from: X.Dlt  reason: case insensitive filesystem */
public final class C46817Dlt extends 2Rw {
    public List A00 = 0sn.A00;
    public final 0sP A01;

    public final void onBindViewHolder(C249703kE r8, int i) {
        0qQ.A0B(r8, 0);
        C47180Drv drv = (C47180Drv) this.A00.get(i);
        String str = drv.A02;
        boolean z = drv.A03;
        boolean z2 = drv.A04;
        0sP r4 = this.A01;
        0qQ.A0B(str, 0);
        0qQ.A0B(r4, 4);
        IgdsListCell igdsListCell = ((C46918DnY) r8).A00;
        igdsListCell.A04();
        igdsListCell.A0I(str);
        igdsListCell.A0G(C69349Njo.TYPE_CHECKBOX, true);
        igdsListCell.setEnabled(true);
        igdsListCell.setChecked(z);
        igdsListCell.setEnabled(z2);
        igdsListCell.A0D(new C50127FPz(i, 4, r4));
        DbY.A0z(igdsListCell);
    }

    public C46817Dlt(0sP r2) {
        this.A01 = r2;
    }

    public final int getItemCount() {
        int A03 = AnonymousClass0fD.A03(-2072347969);
        int size = this.A00.size();
        AnonymousClass0fD.A0A(473399668, A03);
        return size;
    }

    public final C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        DbS.A1W(viewGroup);
        return new C46918DnY(new IgdsListCell(AnonymousClass7TE.A0S(viewGroup), (AttributeSet) null));
    }
}
