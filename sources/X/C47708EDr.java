package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CompoundButton;
import com.instagram.igds.components.textcell.IgdsListCell;

/* renamed from: X.EDr  reason: case insensitive filesystem */
public final class C47708EDr extends C14097Tpp {
    public final /* bridge */ /* synthetic */ Object ALg(Context context) {
        0qQ.A0B(context, 0);
        return new IgdsListCell(context, (AttributeSet) null);
    }

    public final /* bridge */ /* synthetic */ Object A0K(View view, C307786Rm r5, C276544tV r6, Object obj) {
        IgdsListCell igdsListCell = (IgdsListCell) view;
        AnonymousClass7TG.A1T(igdsListCell, r5, r6);
        C48270Ebp.A00(r5, r6, igdsListCell);
        C277014uI A0A = r6.A0A(40);
        if (A0A == null) {
            return null;
        }
        igdsListCell.A0C(new FPH(3, (Object) r5, (Object) A0A, (Object) r6));
        igdsListCell.A0D(new FQP(0, (Object) r6, (Object) r5, (Object) A0A));
        return null;
    }

    public final /* bridge */ /* synthetic */ void A0M(View view, C307786Rm r4, C276544tV r5, Object obj, Object obj2) {
        IgdsListCell igdsListCell = (IgdsListCell) view;
        0qQ.A0B(igdsListCell, 0);
        igdsListCell.setOnClickListener((View.OnClickListener) null);
        igdsListCell.A0D((CompoundButton.OnCheckedChangeListener) null);
        igdsListCell.A0I("");
        igdsListCell.setEnabled(false);
        igdsListCell.A0K("", false);
        igdsListCell.A04();
    }

    public final /* bridge */ /* synthetic */ View A0J(Context context) {
        throw AnonymousClass00P.createAndThrow();
    }

    public C47708EDr(C307786Rm r1, C276544tV r2) {
        super(r1, r2);
    }
}
