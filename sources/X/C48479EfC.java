package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.EfC  reason: case insensitive filesystem */
public abstract class C48479EfC {
    public static Object A00(C307896Rx r12, AnonymousClass6Tm r13) {
        String str = (String) r13.A00();
        List list = r13.A00;
        String A0t = DbU.A0t(list, 3);
        String A0t2 = DbU.A0t(list, 4);
        String A0t3 = DbU.A0t(list, 5);
        FragmentActivity A04 = C308206Td.A04(r12);
        UserSession A0Y = DbT.A0Y(r12);
        C50221FUd fUd = new C50221FUd(str);
        C331157Pu A07 = FH9.A07(r12);
        if (A07 == null) {
            C309516Yo A0I = Dbb.A0I(r12);
            A0I.A0E(FBD.A00.A00(A04, fUd, A0Y, A0t2, A0t, A0t3, (HashMap) null));
            A0I.A0F = true;
            A0I.A04();
            return null;
        } else if (A0t2 == null || !Arrays.asList(A0t2.split(":")).contains("full_screen")) {
            FBD fbd = FBD.A00;
            boolean A1U = AnonymousClass7TF.A1U(0, A04, A0Y);
            C331127Pr A0W = DbS.A0W(A0Y);
            DbZ.A0z(A04, A0W, 2131964964);
            DbS.A1S(A0W, A1U);
            A0W.A19 = A1U;
            A0W.A0x = false;
            A07.A0F(fbd.A00(A04, fUd, A0Y, A0t2, A0t, A0t3, DbY.A0m("source", "bottom_sheet_android")), A0W);
            return null;
        } else {
            FragmentActivity A042 = C308206Td.A04(r12);
            Bundle A0a = AnonymousClass7TE.A0a();
            A0a.putString(AnonymousClass000.A00(246), str);
            DbS.A1B(A0a, A0t2);
            A0a.putString("location", A0t);
            A0a.putString("nua_action", A0t3);
            DbU.A0w(A042, A0a, A0Y, ModalActivity.class, C273654mx.A00(3307));
            return null;
        }
    }
}
