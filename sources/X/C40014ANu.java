package X;

import android.os.Bundle;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.ANu  reason: case insensitive filesystem */
public final class C40014ANu implements View.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ A86 A01;

    public C40014ANu(A86 a86, int i) {
        this.A01 = a86;
        this.A00 = i;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(-1720166881);
        A86 a86 = this.A01;
        int i = this.A00;
        AnonymousClass4DH r5 = a86.A05;
        if (r5.mFragmentManager != null) {
            UserSession userSession = a86.A06;
            Bundle A0a = AnonymousClass7TE.A0a();
            AnonymousClass0Dg.A00(A0a, userSession);
            A0a.putInt(AnonymousClass000.A00(2645), i);
            K46 k46 = new K46();
            k46.setArguments(A0a);
            C331127Pr r2 = new C331127Pr(userSession);
            r2.A0d = a86.A03.getString(2131967802);
            r2.A0U = new C40647AgN(a86, 3);
            a86.A01 = r2.A00();
            a86.A02 = true;
            a86.A08.A00.A0G();
            C331157Pu r1 = a86.A01;
            if (r1 != null) {
                r1.A0D(r5.requireActivity(), k46);
            }
        }
        AnonymousClass0fD.A0C(-1802378675, A05);
    }
}
