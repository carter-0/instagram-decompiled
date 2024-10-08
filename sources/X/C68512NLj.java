package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.NLj  reason: case insensitive filesystem */
public final class C68512NLj extends C336937fQ {
    public final Context A00;
    public final LayoutInflater A01;
    public final UserSession A02;
    public final C69230Nhk A03;

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r2, Object obj, Object obj2) {
        r2.A7U(0);
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public C68512NLj(Context context, UserSession userSession, C69230Nhk nhk) {
        this.A00 = context;
        this.A02 = userSession;
        this.A03 = nhk;
        this.A01 = LayoutInflater.from(context);
    }

    public final View getView(int i, View view, ViewGroup viewGroup, Object obj, Object obj2) {
        String str;
        int A032 = AnonymousClass0fD.A03(190855775);
        if (view == null) {
            view = DbU.A08(this.A01, R.layout.self_remediation_report_row);
            view.setTag(new OD2(view));
        }
        Context context = this.A00;
        OD2 od2 = (OD2) DbT.A0o(view);
        C69326NjR njR = (C69326NjR) obj;
        C69230Nhk nhk = this.A03;
        if (nhk.A05 == null) {
            str = "reportingLogger";
        } else if (nhk.A03 == null) {
            str = "commenterUser";
        } else {
            C71406Ok5.A00(od2.A00, 14, nhk);
            DbU.A1A(context.getResources(), od2.A01, njR.A00);
            AnonymousClass0fD.A0A(662967318, A032);
            return view;
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }
}
