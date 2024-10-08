package X;

import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.igds.components.textcell.IgdsListCell;
import com.instagram.quickpromotion.intf.QPTooltipAnchor;

public final class KFV extends C232222tE {
    public final C231002qi A00;
    public final C230882qT A01;

    public final /* bridge */ /* synthetic */ void bind(C232262tL r4, C249703kE r5) {
        C61173JyP jyP = (C61173JyP) r4;
        C60544JnF jnF = (C60544JnF) r5;
        AnonymousClass7TG.A1N(jyP, jnF);
        IgdsListCell igdsListCell = jnF.A00;
        igdsListCell.setTextCellType(C69349Njo.TYPE_CHEVRON);
        CharSequence text = igdsListCell.getResources().getText(jyP.A00);
        0qQ.A07(text);
        igdsListCell.A0I(text);
        igdsListCell.A0C(jyP.A01);
    }

    public final Class modelClass() {
        return C61173JyP.class;
    }

    public KFV(C231002qi r1, C230882qT r2) {
        AnonymousClass7TG.A1O(r2, r1);
        this.A01 = r2;
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        C60544JnF jnF = new C60544JnF(new IgdsListCell(JTU.A06(viewGroup), (AttributeSet) null));
        C230882qT r3 = this.A01;
        C231002qi r2 = this.A00;
        r3.A00(jnF.itemView, QPTooltipAnchor.ADVANCED_SETTINGS_VIDEO_ROW, r2);
        return jnF;
    }
}
