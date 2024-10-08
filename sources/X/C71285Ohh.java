package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import com.instagram.user.model.User;

/* renamed from: X.Ohh  reason: case insensitive filesystem */
public final class C71285Ohh implements View.OnClickListener {
    public final /* synthetic */ C69203Nh3 A00;

    public C71285Ohh(C69203Nh3 nh3) {
        this.A00 = nh3;
    }

    public final void onClick(View view) {
        String str;
        C254793t3 r0;
        int A05 = AnonymousClass0fD.A05(2004600674);
        C70421O5y o5y = this.A00.A01;
        if (o5y != null) {
            C331857Sq r8 = o5y.A00;
            C62320sa r6 = r8.A0L;
            User user = (User) 00k.A0J(((AnonymousClass7SD) r6.invoke()).A0b);
            if (user != null) {
                r8.A0D.A01(user.getId(), false);
                AnonymousClass0eM r7 = r8.A0H;
                05G r9 = ((C333637Zs) r7.getValue()).A05;
                Integer num = AnonymousClass05K.A0N;
                boolean z = ((AnonymousClass9IP) r9.getValue()).A02;
                0qQ.A0B(num, 0);
                r9.Epw(new AnonymousClass9IP(num, 1, z));
                Resources resources = ((Context) r8.A0I.invoke()).getResources();
                C310336ap A0a = DbS.A0a();
                DbT.A1D(resources, A0a, 2131952559);
                A0a.A0G = AnonymousClass7TF.A0d(resources, 2131975851);
                C72737PHr.A00(A0a, r8, 0);
                A0a.A0L = true;
                DbY.A1N(A0a);
                AnonymousClass7I3 r2 = r8.A09;
                String A002 = ((C333637Zs) r7.getValue()).A00();
                AnonymousClass7SD r02 = (AnonymousClass7SD) r6.invoke();
                if (r02 == null || (r0 = r02.A0P) == null) {
                    str = null;
                } else {
                    str = C300965yF.A07(r0);
                }
                r2.A0D(A002, str, false);
            }
        }
        AnonymousClass0fD.A0C(1907827694, A05);
    }
}
