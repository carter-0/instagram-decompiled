package X;

import android.content.Context;
import android.os.Build;
import com.instagram.common.session.UserSession;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.KIk  reason: case insensitive filesystem */
public final class C61694KIk extends 0ng {
    public final /* synthetic */ LO5 A00;
    public final /* synthetic */ List A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C61694KIk(LO5 lo5, List list) {
        super(104, 3, false, false);
        this.A00 = lo5;
        this.A01 = list;
    }

    public final void run() {
        HashMap A1E = AnonymousClass7TE.A1E();
        LO5 lo5 = this.A00;
        Iterator A1G = AnonymousClass7TE.A1G(lo5.A04);
        while (A1G.hasNext()) {
            LOX lox = (LOX) AnonymousClass7TF.A0a(A1G);
            if (Build.VERSION.SDK_INT >= 29) {
                UserSession userSession = lo5.A01;
                Context context = lo5.A00;
                String A03 = 0qc.A03(context);
                0qQ.A07(A03);
                lox.A01(JTP.A0B(context), userSession, A03);
            } else {
                LO5.A00(lo5, lox);
            }
            List list = this.A01;
            LAM lam = lox.A02;
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (0qQ.A0K(((LEA) next).A03, lam)) {
                    if (next != null) {
                        A1E.put(lam, next);
                    }
                }
            }
        }
        lo5.A02.Dgg(A1E);
    }
}
