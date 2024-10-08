package X;

import android.view.LayoutInflater;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.EJf  reason: case insensitive filesystem */
public final class C47833EJf extends C46871Dmn {
    public final RecyclerView A00;
    public final AnonymousClass2t9 A01;
    public final /* synthetic */ C46493Dfw A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C47833EJf(LayoutInflater layoutInflater, View view, C46493Dfw dfw) {
        super(view);
        this.A02 = dfw;
        AnonymousClass2tC r5 = new AnonymousClass2tC(layoutInflater);
        UserSession userSession = dfw.A02;
        AnonymousClass0iw r0 = dfw.A01;
        2el r4 = dfw.A03;
        r5.A0C.addAll(0sr.A1P(new C232222tE[]{new EGL(r0, userSession, r4), EGO.A00, new C47756EFq(userSession)}));
        AnonymousClass2t9 A002 = r5.A00();
        this.A01 = A002;
        RecyclerView recyclerView = (RecyclerView) AnonymousClass7TF.A0F(view, R.id.inbox_tray_recycler_view);
        this.A00 = recyclerView;
        recyclerView.setAdapter(A002);
        DbV.A1A(recyclerView.getContext(), recyclerView);
        AnonymousClass3AS r1 = recyclerView.A0C;
        if (r1 instanceof AnonymousClass3AR) {
            ((AnonymousClass3AR) r1).A00 = false;
        }
        Dba.A0z(recyclerView, r4, dfw.A00);
    }
}
