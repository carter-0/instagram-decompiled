package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.igds.components.textcell.IgdsListCell;

public final class KF7 extends C232222tE {
    public final C62320sa A00;

    public final /* bridge */ /* synthetic */ void bind(C232262tL r5, C249703kE r6) {
        C64771Lhn lhn = (C64771Lhn) r5;
        C60519Jmq jmq = (C60519Jmq) r6;
        boolean A1Z = AnonymousClass7TG.A1Z(lhn, jmq);
        View view = jmq.itemView;
        Context context = view.getContext();
        LYC.A00(view, 17, this);
        IgdsListCell igdsListCell = jmq.A00;
        igdsListCell.A0I(AnonymousClass7TE.A16(context, 2131953010));
        igdsListCell.A0H(AnonymousClass7TE.A16(context, 2131953009));
        igdsListCell.A0G(lhn.A00, A1Z);
    }

    public final Class modelClass() {
        return C64771Lhn.class;
    }

    public KF7(C62320sa r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        return new C60519Jmq(new IgdsListCell(JTU.A06(viewGroup), (AttributeSet) null));
    }
}
