package X;

import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.igds.components.textcell.IgdsListCell;

public final class KFB extends C232222tE {
    public final K84 A00;

    public final /* bridge */ /* synthetic */ void bind(C232262tL r4, C249703kE r5) {
        C61171JyN jyN = (C61171JyN) r4;
        C60582Jnr jnr = (C60582Jnr) r5;
        AnonymousClass7TG.A1N(jyN, jnr);
        IgdsListCell igdsListCell = jnr.A01;
        igdsListCell.setTextCellType(C69349Njo.TYPE_RADIO);
        C60996Jus jus = jyN.A00;
        igdsListCell.A0I(jus.A06);
        igdsListCell.A0H(jus.A02);
        igdsListCell.setChecked(jyN.A01);
        igdsListCell.A0D(new LZI(0, jnr, jyN));
    }

    public final Class modelClass() {
        return C61171JyN.class;
    }

    public KFB(K84 k84) {
        this.A00 = k84;
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        return new C60582Jnr(this.A00, new IgdsListCell(JTU.A06(viewGroup), (AttributeSet) null));
    }
}
