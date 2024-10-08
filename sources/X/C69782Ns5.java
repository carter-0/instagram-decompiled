package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.facebook.privacy.consent.bloks.instagram.InstagramConsentFlowHostActivity;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.Ns5  reason: case insensitive filesystem */
public abstract class C69782Ns5 {
    /* JADX INFO: finally extract failed */
    public static final Object A00(C307896Rx r21, AnonymousClass6Tm r22) {
        AnonymousClass6Tm r2 = r22;
        Object A03 = r2.A03(0);
        0qQ.A0C(A03, "null cannot be cast to non-null type kotlin.String");
        String str = (String) A03;
        String A0k = DbW.A0k(r2, "null cannot be cast to non-null type kotlin.String");
        List list = r2.A00;
        String A0t = DbU.A0t(list, 2);
        String A0t2 = DbU.A0t(list, 3);
        String A0t3 = DbU.A0t(list, 4);
        String str2 = (String) DbT.A0q(r2, "null cannot be cast to non-null type kotlin.String", 5);
        C277014uI r14 = ((C280064zw) r2.A03(6)).A00;
        C277014uI r13 = ((C280064zw) r2.A03(7)).A00;
        C277014uI r3 = ((C280064zw) r2.A03(8)).A00;
        C277014uI r0 = ((C280064zw) r2.A03(9)).A00;
        Bundle A0a = AnonymousClass7TE.A0a();
        C307896Rx r15 = r21;
        C227642jf.A03(A0a, C308206Td.A0B(r15));
        AnonymousClass7TF.A1H(str, A0k);
        C307786Rm r4 = r15.A03;
        if (r4 != null) {
            Context context = r4.A00;
            C56523Hzu hzu = new C56523Hzu(r15, r14, r13, r3, r0);
            synchronized (OUs.A00) {
                0Yt.A0E();
                String A0r = DbS.A0r(str, OUs.A01);
                if (A0r != null) {
                    str = A0r;
                }
                Intent A0A = C66580MXl.A0A(context, InstagramConsentFlowHostActivity.class);
                A0A.putExtra("flow_name", A0k);
                A0A.putExtra("experience_id", str);
                if (A0t != null) {
                    A0A.putExtra("source", A0t);
                }
                if (A0t2 != null) {
                    A0A.putExtra(Q2N.A01(0, 9, 86), A0t2);
                }
                if (A0t3 == null) {
                    A0t3 = "flow.action";
                }
                A0A.putExtra("app_id", 002.A0R("com.bloks.www.consent.", A0t3));
                if (str2 != null) {
                    A0A.putExtra("extra_params_json", str2);
                }
                A0A.putExtras(A0a);
                String A0T = 002.A0T(str, A0k, '$');
                OUs.A03.addLast(A0T);
                0qQ.A0B(A0T, 0);
                ReentrantReadWriteLock.WriteLock writeLock = C56488HzK.A02.writeLock();
                0qQ.A07(writeLock);
                writeLock.lock();
                try {
                    C56488HzK.A00.put(A0T, hzu);
                    writeLock.unlock();
                    0b6.A00().A07().A0G(context, A0A);
                } catch (Throwable th) {
                    writeLock.unlock();
                    throw th;
                }
            }
            return null;
        }
        throw AnonymousClass7TE.A0y();
    }
}
