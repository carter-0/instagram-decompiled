package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.user.model.User;

public final class AY9 implements 1wn {
    public final /* synthetic */ C340017kY A00;

    public AY9(C340017kY r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        User user;
        String str;
        int A03 = AnonymousClass0fD.A03(108898556);
        int A032 = AnonymousClass0fD.A03(644121702);
        C340017kY r7 = this.A00;
        C7572QKn qKn = new C7572QKn(r7.A08);
        1Xj A01 = C340017kY.A01(r7, qKn);
        String A0T = r7.A0T();
        String str2 = null;
        if (A01 != null) {
            user = A01.A2A(AnonymousClass7TE.A0l(r7.A08));
        } else {
            user = null;
        }
        OOA A06 = 1as.A04.A02.A06(r7, AnonymousClass7TE.A0l(r7.A08), C66579MXk.A00(410));
        String string = qKn.A00.getString(Pxd.A00(175));
        Bundle bundle = A06.A01;
        bundle.putString(C66579MXk.A00(224), string);
        0qQ.A0B(A0T, 0);
        bundle.putString(C66579MXk.A00(212), A0T);
        if (A01 != null) {
            str = A01.getId();
        } else {
            str = null;
        }
        A06.A02(str);
        FragmentActivity requireActivity = r7.requireActivity();
        if (user != null) {
            str2 = user.B8Q();
        }
        String string2 = requireActivity.getString(2131957192, new Object[]{str2});
        0qQ.A0B(string2, 0);
        bundle.putString(C66579MXk.A00(299), string2);
        AnonymousClass37D A012 = AnonymousClass37D.A00.A01(r7.requireActivity());
        if (A012 != null) {
            A012.A0J(A06.A00());
        }
        AnonymousClass0fD.A0A(1352554401, A032);
        AnonymousClass0fD.A0A(-721736437, A03);
    }
}
