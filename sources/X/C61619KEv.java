package X;

import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.igds.components.textcell.IgdsListCell;

/* renamed from: X.KEv  reason: case insensitive filesystem */
public final class C61619KEv extends C232222tE {
    public final /* bridge */ /* synthetic */ void bind(C232262tL r4, C249703kE r5) {
        C64797LiH liH = (C64797LiH) r4;
        C60548JnJ jnJ = (C60548JnJ) r5;
        AnonymousClass7TG.A1N(liH, jnJ);
        IgdsListCell igdsListCell = jnJ.A00;
        igdsListCell.setTextCellType(C69349Njo.TYPE_SWITCH);
        CharSequence text = igdsListCell.getResources().getText(liH.A00);
        0qQ.A07(text);
        igdsListCell.A0I(text);
        igdsListCell.A0E(liH.A01);
        igdsListCell.setChecked(liH.A02);
        igdsListCell.setEnabled(liH.A03);
    }

    public final Class modelClass() {
        return C64797LiH.class;
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        return new C60548JnJ(new IgdsListCell(JTU.A06(viewGroup), (AttributeSet) null));
    }
}
