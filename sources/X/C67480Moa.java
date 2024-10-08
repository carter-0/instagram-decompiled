package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.Moa  reason: case insensitive filesystem */
public final class C67480Moa extends C67883MwR {
    public boolean A00;
    public final int A01;
    public final RecyclerView A02;
    public final UserSession A03;
    public final C74491Pvl A04;
    public final C67328Mm4 A05;
    public final C67325Mm1 A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C67480Moa(View view, UserSession userSession, C74491Pvl pvl) {
        super(view);
        AnonymousClass7TG.A1P(userSession, pvl);
        this.A03 = userSession;
        this.A04 = pvl;
        RecyclerView recyclerView = (RecyclerView) view;
        this.A02 = recyclerView;
        C67325Mm1 mm1 = new C67325Mm1(pvl);
        this.A06 = mm1;
        Context A0S = AnonymousClass7TE.A0S(view);
        this.A01 = 0nA.A09(A0S);
        this.A05 = new C67328Mm4(DbT.A0D(LayoutInflater.from(A0S), (ViewGroup) null, R.layout.direct_inbox_header_pill_item, false));
        recyclerView.setAdapter(mm1);
        JTP.A1D(recyclerView, A0S.getResources().getDimensionPixelSize(R.dimen.abc_button_padding_horizontal_material) * 2, AnonymousClass7TF.A02(A0S, R.dimen.abc_button_padding_horizontal_material));
        Context context = recyclerView.getContext();
        ViewGroup.MarginLayoutParams A0G = DbX.A0G(recyclerView);
        0qQ.A0A(context);
        0qQ.A0B(context, 0);
        A0G.topMargin = AnonymousClass7TF.A02(context, R.dimen.abc_button_padding_horizontal_material);
        recyclerView.setLayoutParams(A0G);
    }
}
