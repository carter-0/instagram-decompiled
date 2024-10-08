package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.igds.components.textcell.IgdsListCell;

/* renamed from: X.KNg  reason: case insensitive filesystem */
public final class C61817KNg extends C60501JmY {
    public final IgdsListCell A00;
    public final 0sP A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C61817KNg(View view, 0sP r4) {
        super(view);
        0qQ.A0B(view, 1);
        this.A01 = r4;
        IgdsListCell igdsListCell = (IgdsListCell) view.findViewById(R.id.funded_content_text_cell);
        this.A00 = igdsListCell;
        if (igdsListCell != null) {
            igdsListCell.setTextCellType(C69349Njo.TYPE_RADIO);
            igdsListCell.A06(2131968496);
        }
    }
}
