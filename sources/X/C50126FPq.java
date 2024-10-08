package X;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.phonenumber.model.CountryCodeData;

/* renamed from: X.FPq  reason: case insensitive filesystem */
public final class C50126FPq implements AdapterView.OnItemClickListener {
    public final int A00;
    public final Object A01;

    public C50126FPq(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        String str;
        switch (this.A00) {
            case 0:
                C49632Ezp ezp = (C49632Ezp) this.A01;
                ListAdapter adapter = ezp.A01.getAdapter();
                adapter.getClass();
                Object item = adapter.getItem(i);
                0nA.A0N(view);
                G61 g61 = ezp.A03;
                item.getClass();
                g61.Ct3((G8G) item);
                return;
            case 1:
                CountryCodeData countryCodeData = (CountryCodeData) adapterView.getItemAtPosition(i);
                E0N e0n = (E0N) this.A01;
                G6B g6b = e0n.A01;
                if (!(g6b == null && (g6b = e0n.getTargetFragment()) == null)) {
                    g6b.ESy(countryCodeData);
                }
                0lg r9 = e0n.A00;
                String A0f = AnonymousClass7TF.A0f(e0n.A03);
                String A012 = countryCodeData.A01();
                AnonymousClass7TG.A1N(r9, A0f);
                double A013 = DbS.A01();
                double A002 = DbS.A00();
                0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(r9), "register_country_code_selected");
                DbZ.A1G(A0e, A013, A002);
                DbT.A1P(A0e);
                A0e.AAJ(AnonymousClass000.A00(3930), A0f);
                A0e.AAJ("selected_country", A012);
                DbZ.A1F(A0e, A002);
                DbS.A1H(A0e, "phone");
                FH8.A08(A0e, r9);
                if (e0n.isAdded()) {
                    e0n.A08();
                    return;
                }
                return;
            default:
                E6N e6n = (E6N) this.A01;
                FQS fqs = e6n.A01;
                if (fqs == null) {
                    str = "adapter";
                } else {
                    Fragment r2 = new C273374mT();
                    r2.A00 = (F3N) fqs.getItem(i);
                    FragmentActivity requireActivity = e6n.requireActivity();
                    UserSession userSession = e6n.A00;
                    if (userSession == null) {
                        str = "userSession";
                    } else {
                        DbY.A14(r2, requireActivity, userSession);
                        return;
                    }
                }
                0qQ.A0F(str);
                throw AnonymousClass00P.createAndThrow();
        }
    }
}
