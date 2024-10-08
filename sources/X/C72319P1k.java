package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.mediasize.GifUrlImpl;

/* renamed from: X.P1k  reason: case insensitive filesystem */
public final class C72319P1k implements C20948X6b {
    public final int A00;
    public final Object A01;

    public C72319P1k(P3E p3e, int i) {
        this.A00 = i;
        this.A01 = p3e;
    }

    public final void Dgj(N41 n41) {
        C62320sa r13;
        C62320sa r12;
        String str;
        Integer num;
        Integer num2;
        UserSession userSession;
        Context context;
        P3E p3e;
        switch (this.A00) {
            case 0:
                p3e = (P3E) this.A01;
                userSession = p3e.A0G;
                context = p3e.A0D;
                str = n41.A01();
                num2 = AnonymousClass05K.A0C;
                num = AnonymousClass05K.A0j;
                r12 = C73915Plq.A00(p3e, n41, 48);
                r13 = C73748Pj9.A00;
                break;
            case 1:
                p3e = (P3E) this.A01;
                userSession = p3e.A0G;
                context = p3e.A0D;
                str = n41.A01();
                num2 = AnonymousClass05K.A0C;
                num = AnonymousClass05K.A01;
                r12 = new C73665Phe(0, p3e, n41);
                r13 = C73749PjA.A00;
                break;
            case 2:
                P3E p3e2 = (P3E) this.A01;
                UserSession userSession2 = p3e2.A0G;
                Context context2 = p3e2.A0D;
                String A012 = n41.A01();
                Integer num3 = AnonymousClass05K.A0C;
                Integer num4 = num3;
                C71044OaM.A00(context2, p3e2.A0F, userSession2, (AnonymousClass4D6) null, (GifUrlImpl) null, num3, num4, A012, (String) null, p3e2.A0U, new C73665Phe(2, p3e2, n41), C73750PjB.A00);
                return;
            default:
                return;
        }
        C71044OaM.A00(context, p3e.A0F, userSession, (AnonymousClass4D6) null, (GifUrlImpl) null, num2, num, str, (String) null, p3e.A0U, r12, r13);
    }

    public final void Dv8(N41 n41) {
        C62320sa r10;
        String str;
        Integer num;
        UserSession userSession;
        P3E p3e;
        int i;
        switch (this.A00) {
            case 0:
                p3e = (P3E) this.A01;
                userSession = p3e.A0G;
                str = n41.A01();
                num = AnonymousClass05K.A0j;
                r10 = C73915Plq.A00(p3e, n41, 49);
                break;
            case 1:
                p3e = (P3E) this.A01;
                userSession = p3e.A0G;
                str = n41.A01();
                num = AnonymousClass05K.A01;
                i = 1;
                break;
            case 2:
                p3e = (P3E) this.A01;
                userSession = p3e.A0G;
                str = n41.A01();
                num = AnonymousClass05K.A0C;
                i = 3;
                break;
            default:
                return;
        }
        r10 = new C73665Phe(i, p3e, n41);
        C71044OaM.A02(p3e.A0F, userSession, (AnonymousClass4D6) null, (GifUrlImpl) null, num, str, (String) null, p3e.A0U, r10);
    }
}
