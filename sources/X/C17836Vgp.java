package X;

import android.content.Context;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.common.session.UserSession;

/* renamed from: X.Vgp  reason: case insensitive filesystem */
public final class C17836Vgp {
    public final Context A00;
    public final UAH A01;
    public final C19739Weg A02;

    public C17836Vgp(AnonymousClass4DH r12, UserSession userSession, XBy xBy, Integer num, String str, String str2) {
        this.A00 = r12.requireContext();
        C19739Weg weg = new C19739Weg(r12, userSession, this, str, str2);
        this.A02 = weg;
        this.A01 = new UAH(new WPW(r12.getModuleName()), userSession, xBy, weg, num);
    }

    public final void A00(RecyclerView recyclerView, int i, int i2) {
        recyclerView.setAdapter(this.A01);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this.A00, 2);
        gridLayoutManager.A01 = new U9T(this, 4);
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.A15(new C3251871j(gridLayoutManager, this.A02, C3251771i.A0A));
        recyclerView.A11(new C14808UAe(this, i2, i, 3));
    }
}
