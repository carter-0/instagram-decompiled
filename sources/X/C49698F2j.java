package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.recyclerview.ViewModelListUpdate;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.F2j  reason: case insensitive filesystem */
public final class C49698F2j {
    public View.OnClickListener A00;
    public List A01 = AnonymousClass7TE.A1C();
    public final Context A02;
    public final FragmentActivity A03;
    public final UserSession A04;
    public final C49683F1s A05;

    public final ViewModelListUpdate A00(C49607EzQ ezQ, List list) {
        Object fyp;
        C3253572b r4;
        C320156rr r0;
        ArrayList A0q = AnonymousClass7TF.A0q(ezQ, 1);
        AnonymousClass16q C31 = DbS.A0h(this.A04, AnonymousClass0t1.A01).C31();
        if (C31 != null && AnonymousClass7TF.A1Y(C31.CPU(), true) && AnonymousClass7TE.A1b(this.A01)) {
            Context context = this.A02;
            String A0u = DbV.A0u(context, DbX.A0u(this.A01, 0), context.getString(2131974768), 2131974767);
            0qQ.A07(A0u);
            A0q.add(new C47764EGb(new ESx(this, DbV.A02(context)), A0u, AnonymousClass7TE.A16(context, 2131974768)));
        }
        if (list.isEmpty()) {
            if (ezQ.A02) {
                Context context2 = this.A02;
                r4 = new C3253572b();
                r4.A00 = 2Yu.A00(context2);
                r0 = C320156rr.LOADING;
            } else if (ezQ.A03) {
                Context context3 = this.A02;
                View.OnClickListener onClickListener = this.A00;
                if (onClickListener != null) {
                    r4 = new C3253572b();
                    r4.A00 = 2Yu.A00(context3);
                    r4.A02 = R.drawable.loadmore_icon_refresh_compound;
                    r4.A05 = onClickListener;
                    r0 = C320156rr.ERROR;
                } else {
                    throw AnonymousClass7TE.A0y();
                }
            } else {
                boolean z = !ezQ.A01;
                Context context4 = this.A02;
                if (z) {
                    fyp = new C47763EGa(context4.getString(2131974669), context4.getString(2131974668));
                } else {
                    r4 = new C3253572b();
                    r4.A00 = 2Yu.A00(context4);
                    r4.A07 = context4.getString(2131953899);
                    r0 = C320156rr.EMPTY;
                }
            }
            fyp = new NPA(r4, r0);
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                A0q.add(this.A05.A00((C47326Dut) it.next()));
            }
            if (!ezQ.A01) {
                Context context5 = this.A02;
                A0q.add(new C47763EGa(context5.getString(2131974669), context5.getString(2131974668)));
            }
            EWS ews = ezQ.A00;
            if (ews == null) {
                if (!ezQ.A01) {
                    ews = EWS.A06;
                } else if (ezQ.A03) {
                    ews = EWS.RETRY;
                } else if (ezQ.A02) {
                    ews = EWS.LOADING;
                } else {
                    ews = EWS.LOAD_MORE;
                }
                ezQ.A00 = ews;
            }
            fyp = new FYP(ews, AnonymousClass000.A00(3516));
        }
        A0q.add(fyp);
        ViewModelListUpdate A0R = DbS.A0R();
        A0R.A01(A0q);
        return A0R;
    }

    public C49698F2j(Context context, FragmentActivity fragmentActivity, UserSession userSession, C49683F1s f1s) {
        this.A02 = context;
        this.A03 = fragmentActivity;
        this.A04 = userSession;
        this.A05 = f1s;
    }
}
