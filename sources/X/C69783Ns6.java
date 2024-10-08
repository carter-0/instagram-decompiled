package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.facebook.privacy.consent.bloks.instagram.InstagramConsentOpenIABUrlActivity;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.Ns6  reason: case insensitive filesystem */
public abstract class C69783Ns6 {
    public static final Object A00(C307896Rx r9, AnonymousClass6Tm r10) {
        OBC obc;
        String A0g = DbY.A0g(r10);
        C277014uI A0R = DbV.A0R(r10.A00, 1);
        C307786Rm r0 = r9.A03;
        if (r0 != null) {
            Context context = r0.A00;
            if (A0R != null) {
                obc = new OBC(r9, A0R);
            } else {
                obc = null;
            }
            Bundle A0a = AnonymousClass7TE.A0a();
            C227642jf.A03(A0a, C308206Td.A0B(r9));
            String A0n = C51972G9s.A0n();
            Intent A0A = C66580MXl.A0A((Context) 0mE.A00(context, Activity.class), InstagramConsentOpenIABUrlActivity.class);
            A0A.putExtra("redirect_url", A0g);
            A0A.putExtra("callback_key", A0n);
            A0A.putExtras(A0a);
            if (obc != null) {
                ReentrantLock reentrantLock = O50.A01;
                reentrantLock.lock();
                try {
                    O50.A00.put(A0n, obc);
                } finally {
                    reentrantLock.unlock();
                }
            }
            AnonymousClass0b5.A02(context, A0A);
            return null;
        }
        throw AnonymousClass7TE.A0y();
    }
}
