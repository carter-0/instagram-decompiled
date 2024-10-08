package X;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.UiI  reason: case insensitive filesystem */
public final class C15773UiI extends C232222tE {
    public final Activity A00;
    public final UserSession A01;

    public C15773UiI(Activity activity, UserSession userSession) {
        0qQ.A0B(userSession, 2);
        this.A00 = activity;
        this.A01 = userSession;
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r5, C249703kE r6) {
        WSQ wsq = (WSQ) r5;
        C14864UCs uCs = (C14864UCs) r6;
        AnonymousClass7TG.A1N(wsq, uCs);
        UEM uem = uCs.A00;
        C19276WSj wSj = wsq.A00;
        C17099VHv.A00(uem, wSj);
        0sP r1 = wSj.A01.A03;
        if (r1 != null) {
            r1.invoke(uem.A00);
        }
        C19276WSj wSj2 = wsq.A01;
        if (wSj2 != null) {
            UEM uem2 = uCs.A01;
            C17099VHv.A00(uem2, wSj2);
            0sP r12 = wSj2.A01.A03;
            if (r12 != null) {
                r12.invoke(uem2.A00);
            }
        }
        View view = uCs.A01.A00;
        int i = 0;
        if (wSj2 == null) {
            i = 4;
        }
        view.setVisibility(i);
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        Activity activity = this.A00;
        0qQ.A0B(activity, 0);
        boolean z = 2Su.A03;
        LayoutInflater layoutInflater2 = activity.getLayoutInflater();
        0qQ.A07(layoutInflater2);
        return new C14864UCs(2Su.A01(layoutInflater2, (ViewGroup.LayoutParams) null, (ViewGroup) null, R.layout.product_tile_row, false, false));
    }

    public final Class modelClass() {
        return WSQ.class;
    }
}
