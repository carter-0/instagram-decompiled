package X;

import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.igds.components.textcell.IgdsListCell;

/* renamed from: X.KEs  reason: case insensitive filesystem */
public final class C61616KEs extends C232222tE {
    public final /* bridge */ /* synthetic */ void bind(C232262tL r5, C249703kE r6) {
        Li6 li6 = (Li6) r5;
        C60545JnG jnG = (C60545JnG) r6;
        AnonymousClass7TG.A1N(li6, jnG);
        IgdsListCell igdsListCell = jnG.A00;
        igdsListCell.setTextCellType(C69349Njo.TYPE_CHEVRON);
        CharSequence text = igdsListCell.getResources().getText(li6.A00);
        0qQ.A07(text);
        igdsListCell.A0I(text);
        igdsListCell.A0C(li6.A01);
        String str = li6.A02;
        if (str != null) {
            igdsListCell.A0J(str, (CharSequence) null, false);
        }
    }

    public final Class modelClass() {
        return Li6.class;
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        return new C60545JnG(new IgdsListCell(JTU.A06(viewGroup), (AttributeSet) null));
    }
}
