package X;

import android.app.Activity;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.textcell.IgdsListCell;

/* renamed from: X.KNh  reason: case insensitive filesystem */
public final class C61818KNh extends C60501JmY {
    public final Activity A00;
    public final IgdsListCell A01;
    public final 0sP A02;
    public final 0sP A03;
    public final UserSession A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C61818KNh(Activity activity, View view, UserSession userSession, 0sP r6, 0sP r7) {
        super(view);
        0qQ.A0B(view, 1);
        this.A00 = activity;
        this.A02 = r6;
        this.A03 = r7;
        this.A04 = userSession;
        IgdsListCell igdsListCell = (IgdsListCell) view.findViewById(R.id.funded_content_text_cell);
        this.A01 = igdsListCell;
        if (igdsListCell != null) {
            igdsListCell.setTextCellType(C69349Njo.TYPE_RADIO);
        }
    }
}
