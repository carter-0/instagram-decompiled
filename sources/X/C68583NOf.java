package X;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.Iterator;

/* renamed from: X.NOf  reason: case insensitive filesystem */
public final class C68583NOf extends C232222tE {
    public int A00;
    public int A01;
    public final Activity A02;
    public final UserSession A03;
    public final OEK A04;
    public final C74357PtX A05;

    public C68583NOf(Activity activity, AnonymousClass0iw r3, UserSession userSession, C74357PtX ptX, C230242pG r6, int i, int i2) {
        0qQ.A0B(r6, 2);
        this.A00 = i;
        this.A01 = i2;
        this.A02 = activity;
        this.A03 = userSession;
        this.A05 = ptX;
        this.A04 = new OEK(r3, ptX, r6);
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TF.A1H(viewGroup, layoutInflater);
        AnonymousClass0YZ[] r0 = C68052MzJ.A06;
        return new C68052MzJ(DbT.A0D(layoutInflater, viewGroup, R.layout.layout_highlight_in_grid_item, false));
    }

    /* JADX WARNING: type inference failed for: r0v6, types: [com.instagram.igds.components.imagebutton.IgImageButton, android.view.View] */
    /* JADX WARNING: type inference failed for: r0v7, types: [com.instagram.igds.components.imagebutton.IgImageButton, android.view.View] */
    public final /* bridge */ /* synthetic */ void bind(C232262tL r8, C249703kE r9) {
        C68052MzJ mzJ = (C68052MzJ) r9;
        0qQ.A0B(mzJ, 1);
        0nA.A0f(JTO.A0F(mzJ), this.A01);
        0nA.A0V(JTO.A0F(mzJ), this.A00);
        OEK oek = this.A04;
        Activity activity = this.A02;
        UserSession userSession = this.A03;
        AnonymousClass7TF.A1B(activity, 1, userSession);
        ((View) mzJ.A04.CDM(mzJ, C68052MzJ.A06[0])).setVisibility(8);
        mzJ.A02.setVisibility(8);
        RelativeLayout relativeLayout = mzJ.A01;
        relativeLayout.setVisibility(0);
        Iterator it = 0sr.A1P(new View[]{relativeLayout, mzJ.A03}).iterator();
        while (it.hasNext()) {
            AnonymousClass0fU.A00(new WB4(44, activity, userSession, oek), JTO.A0H(it));
        }
    }

    public final Class modelClass() {
        return C68599NOv.class;
    }
}
