package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

public final class T8Z implements MUX {
    public final /* synthetic */ R8P A00;

    public T8Z(R8P r8p) {
        this.A00 = r8p;
    }

    public final void DJm(Integer num) {
        String str;
        R8P r8p = this.A00;
        0hq r0 = r8p.A03;
        if (r0 == null) {
            str = "fragmentManager";
        } else {
            SQH.A01(r0);
            Context context = r8p.A00;
            if (context == null) {
                str = "context";
            } else {
                AnonymousClass0fN.A00(F8T.A00(context));
                T6A t6a = r8p.A04;
                if (t6a == null) {
                    str = "idVerificationLogger";
                } else {
                    t6a.A00(RDG.A03, RDI.A01, r8p.A07);
                    return;
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void DJn() {
        String str;
        R8P r8p = this.A00;
        Context context = r8p.A00;
        if (context == null) {
            str = "context";
        } else {
            UserSession A002 = r8p.getSession();
            if (r8p.A02 == null) {
                str = "fragmentActivity";
            } else {
                0hq r0 = r8p.A03;
                if (r0 == null) {
                    str = "fragmentManager";
                } else {
                    F8T.A01(context, r0, A002);
                    return;
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }
}
