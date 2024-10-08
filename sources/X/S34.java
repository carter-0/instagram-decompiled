package X;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.facebook.pando.PandoGraphQLRequest;
import java.lang.reflect.InvocationTargetException;

public final class S34 {
    public C58840Ae A00;
    public final Intent A01;
    public final Bundle A02;
    public final 00Y A03;
    public final FragmentActivity A04;
    public final 00W A05;

    public final void A00(Bundle bundle) {
        Throwable e;
        0qQ.A0B(bundle, 0);
        Bundle A06 = DbU.A06(this.A04);
        if (A06 != null) {
            1vn A012 = 1vm.A01(DbS.A0U(A06));
            C58840Ae r3 = this.A00;
            00W r1 = this.A05;
            0qQ.A0B(r3, 0);
            T0S t0s = new T0S(1, bundle, r1, r3);
            try {
                Object A0l = Pxj.A0l((Object) null, S8W.class, "create");
                0qQ.A0C(A0l, "null cannot be cast to non-null type com.facebook.bwpclientauthmanager.shared.AmazonBwpRefreshAccessTokenMutation.Builder");
                Sn7 sn7 = (Sn7) A0l;
                sn7.A00.A00(SRE.A00(bundle), "extra_data");
                PandoGraphQLRequest A002 = sn7.build();
                0qQ.A07(A002);
                C12090Smk.A00(new C12093Smn(t0s, 4), A002, A012, t0s, 5);
            } catch (Exception e2) {
                e = e2;
                if ((e instanceof ClassNotFoundException) || (e instanceof IllegalAccessException) || (e instanceof InstantiationException) || (e instanceof InvocationTargetException) || (e instanceof NoSuchMethodException)) {
                    throw C41845B3m.A0j(e);
                }
            }
        } else {
            e = AnonymousClass7TE.A0y();
            throw e;
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, X.00i] */
    public S34(Intent intent, Bundle bundle, 00W r6, FragmentActivity fragmentActivity) {
        this.A04 = fragmentActivity;
        this.A02 = bundle;
        this.A01 = intent;
        this.A05 = r6;
        this.A03 = new 0VG(fragmentActivity.registerForActivityResult(new 0Vm(new Object(), Pxf.A0O()), r6));
        Bundle A06 = DbU.A06(fragmentActivity);
        if (A06 != null) {
            this.A00 = AnonymousClass0kN.A02(DbS.A0U(A06));
            return;
        }
        throw AnonymousClass7TE.A0y();
    }
}
