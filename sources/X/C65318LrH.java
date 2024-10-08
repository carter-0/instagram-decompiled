package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.modal.TransparentModalActivity;
import com.instagram.model.mediatype.ProductType;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.LrH  reason: case insensitive filesystem */
public final class C65318LrH implements C59610JQe {
    public final FragmentActivity A00;
    public final UserSession A01;

    public final void D1g(1Xj r6) {
        String str;
        0qQ.A0B(r6, 0);
        String id = r6.getId();
        if (id != null) {
            UserSession userSession = this.A01;
            if (0uX.A00(userSession).A01(id) == null) {
                User A2A = r6.A2A(userSession);
                String str2 = null;
                if (A2A != null) {
                    str = A2A.getId();
                } else {
                    str = null;
                }
                ProductType A1v = r6.A1v();
                if (A1v != null) {
                    str2 = A1v.A00;
                }
                0uX.A00(userSession).A05(new 0tj(id, str, str2));
            }
        }
    }

    public final void DON(1Xj r10) {
        1Xj r4 = r10;
        0qQ.A0B(r10, 0);
        C46314DUr BeN = r10.A0C.BeN();
        if (BeN != null) {
            C54434HDi A002 = C63397KwI.A00(this.A01);
            List Bf5 = BeN.Bf5();
            ArrayList A0r = AnonymousClass7TG.A0r(Bf5);
            Iterator it = Bf5.iterator();
            while (it.hasNext()) {
                String A0v = C51971G9r.A0v(it);
                if (A0v == null) {
                    A0v = "";
                }
                A0r.add(A0v);
            }
            ImmutableList A0K = DbU.A0K(A0r);
            AnonymousClass7TE.A1Z(new JUE(A002, r4, A0K, (AnonymousClass4D7) null, 15, 8), A002.A01);
        }
    }

    public final void DZA(String str, String str2) {
        UserSession userSession = this.A01;
        FragmentActivity fragmentActivity = this.A00;
        C331127Pr A0W = DbS.A0W(userSession);
        A0W.A1I = false;
        C331157Pu A002 = A0W.A00();
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putString(AnonymousClass000.A00(3555), str2);
        A0a.putString(AnonymousClass000.A00(4168), str);
        E1C e1c = new E1C();
        e1c.setArguments(A0a);
        A002.A02(fragmentActivity, e1c);
    }

    public final void Daf(String str) {
        DbU.A0x(this.A00, DbY.A0B("arg_potato_media_id", str), this.A01, TransparentModalActivity.class, C273654mx.A00(1330));
    }

    public C65318LrH(FragmentActivity fragmentActivity, UserSession userSession) {
        this.A00 = fragmentActivity;
        this.A01 = userSession;
    }
}
