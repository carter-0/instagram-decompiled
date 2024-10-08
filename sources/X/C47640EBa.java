package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.EBa  reason: case insensitive filesystem */
public final class C47640EBa extends 1P0 {
    public final /* synthetic */ 2Aq A00;

    public C47640EBa(2Aq r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int i;
        int A03 = AnonymousClass0fD.A03(61176425);
        C47323Duq duq = (C47323Duq) obj;
        int A032 = AnonymousClass0fD.A03(1924181831);
        C47640EBa.super.onSuccess(duq);
        UserSession userSession = this.A00.A05;
        User A0Q = AnonymousClass7TF.A0Q(userSession);
        AnonymousClass16q C31 = A0Q.A03.C31();
        if (C31 == null) {
            i = 1700231559;
        } else {
            G8S g8s = duq.A00;
            if (g8s == null) {
                C41845B3m.A0v();
                throw AnonymousClass00P.createAndThrow();
            }
            C47193Dsf dsf = (C47193Dsf) g8s;
            List list = dsf.A03;
            Integer num = dsf.A02;
            Integer num2 = dsf.A01;
            C47220Dt7 dt7 = dsf.A00;
            C47220Dt7 dt72 = null;
            if (dt7 != null) {
                dt72 = dt7;
            }
            16p FCA = C31.FCA();
            Integer num3 = num2;
            Integer num4 = num;
            A0Q.A03.EnZ(C48353EdA.A00(FCA, dt72, FCA.BBH(), FCA.BCA(), FCA.CPU(), FCA.CR7(), FCA.CSM(), FCA.CUV(), FCA.CUW(), FCA.CXk(), FCA.CaI(), FCA.CaJ(), FCA.Ccn(), FCA.Cco(), FCA.Ccp(), num3, num4, FCA.B4n(), FCA.Bpt(), list));
            A0Q.A0d(userSession);
            i = -900642868;
        }
        AnonymousClass0fD.A0A(i, A032);
        AnonymousClass0fD.A0A(-207227035, A03);
    }

    public final void onFail(C268654dm r3) {
        int A03 = AnonymousClass0fD.A03(855033375);
        C47640EBa.super.onFail(r3);
        AnonymousClass0fD.A0A(801060016, A03);
    }
}
