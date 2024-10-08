package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.igds.components.peoplecell.IgdsPeopleCell;
import com.instagram.user.model.User;

/* renamed from: X.NPc  reason: case insensitive filesystem */
public final class C68606NPc extends C232232tF {
    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        JTQ.A1L(viewGroup, layoutInflater);
        return new C67972Mxw(DbT.A0D(layoutInflater, viewGroup, R.layout.direct_inbox_locked_chat_row, false));
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r22, C249703kE r23) {
        NPK npk = (NPK) r22;
        C67972Mxw mxw = (C67972Mxw) r23;
        boolean A1U = AnonymousClass7TF.A1U(0, npk, mxw);
        IgdsPeopleCell igdsPeopleCell = (IgdsPeopleCell) AnonymousClass7TF.A0F(mxw.itemView, R.id.people_cell);
        mxw.itemView.setVisibility(0);
        TextView textView = igdsPeopleCell.A05;
        textView.setText(2131963793);
        C244273av.A0B(textView, false);
        IgdsPeopleCell.A00((Bitmap) null, mxw.A00, (View.OnClickListener) null, (UserSession) null, (ImageUrl) null, igdsPeopleCell, (C49550Exl) null, (User) null, igdsPeopleCell.A0A, A1U);
        Context A06 = JTQ.A06(mxw);
        Integer num = AnonymousClass05K.A0C;
        igdsPeopleCell.A05(new C47790EHb(A06, (View.OnClickListener) null, num, num, 2Yu.A09(DbS.A07(mxw))), (AnonymousClass3Z5) null);
        C71395Oju.A00(igdsPeopleCell, 68, npk);
        boolean z = npk.A03;
        C226462gr r1 = mxw.A02;
        if (z) {
            r1.setVisible(A1U, A1U);
            r1.E2p();
        } else {
            r1.setVisible(A1U, false);
            0qQ.A0A(r1.EL2(1.0f));
        }
        UserSession userSession = npk.A00;
        0qQ.A0B(userSession, 0);
        0Tu A0G = C66581MXm.A0G();
        A0G.A02 = A1U;
        boolean A062 = 182.A06(A0G, userSession, 36320902039741376L);
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("inbox isLockedChatONFromMC: ");
        A1A.append(A062);
        A1A.append(" src: ");
        A1A.append(A0G.A00.A00.getSource());
        String obj = A1A.toString();
        0Aj A0B = C66584MXp.A0B(userSession);
        if (A0B.isSampled()) {
            DbS.A1J(A0B, "swipe_down");
            DbV.A1J(A0B, obj);
        }
    }

    public final Class modelClass() {
        return NPK.class;
    }
}
