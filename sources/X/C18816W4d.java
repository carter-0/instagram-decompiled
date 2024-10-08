package X;

import android.content.DialogInterface;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.util.fragment.IgFragmentFactoryImpl;

/* renamed from: X.W4d  reason: case insensitive filesystem */
public final class C18816W4d implements DialogInterface.OnClickListener {
    public final /* synthetic */ C18496Vsr A00;

    public C18816W4d(C18496Vsr vsr) {
        this.A00 = vsr;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        UserSession userSession;
        WWP wwp;
        AnonymousClass4DU r2;
        String A002;
        DbW.A0r(dialogInterface);
        C18496Vsr vsr = this.A00;
        CharSequence charSequence = C18496Vsr.A00(vsr)[i];
        Fragment fragment = vsr.A02;
        if (0qQ.A0K(charSequence, fragment.getString(2131974138))) {
            C309516Yo r1 = new C309516Yo(fragment.requireActivity(), vsr.A03);
            IgFragmentFactoryImpl.A00();
            r1.A0D(new R8L());
            r1.A04();
            return;
        }
        if (0qQ.A0K(charSequence, fragment.getString(2131963393))) {
            C17429VVi vVi = vsr.A00;
            if (vVi != null) {
                Integer num = AnonymousClass05K.A01;
                C57251IUm iUm = vVi.A02;
                iUm.A01 = num;
                C230192p8.A01(vVi.A00, vVi.A01, iUm);
            }
            userSession = vsr.A03;
            wwp = vsr.A04;
            r2 = vsr.A05;
            A002 = "hide_button";
        } else if (0qQ.A0K(charSequence, fragment.getString(2131963367))) {
            C17429VVi vVi2 = vsr.A00;
            if (vVi2 != null) {
                Integer num2 = AnonymousClass05K.A0C;
                C57251IUm iUm2 = vVi2.A02;
                iUm2.A01 = num2;
                C230192p8.A01(vVi2.A00, vVi2.A01, iUm2);
            }
            userSession = vsr.A03;
            wwp = vsr.A04;
            r2 = vsr.A05;
            A002 = AnonymousClass000.A00(1410);
        } else {
            return;
        }
        C254523sc r12 = new C254523sc(r2, 002.A0R("instagram_ad_", A002));
        r12.A78 = wwp.getId();
        r12.A7J = wwp.C9L();
        C233822wX.A0H(userSession, r12, r2);
    }
}
