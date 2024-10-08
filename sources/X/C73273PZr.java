package X;

import android.content.Context;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;
import java.io.IOException;
import java.util.Iterator;

/* renamed from: X.PZr  reason: case insensitive filesystem */
public final class C73273PZr implements Runnable {
    public final /* synthetic */ AnonymousClass92q A00;
    public final /* synthetic */ 2Lk A01;

    public C73273PZr(AnonymousClass92q r1, 2Lk r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void run() {
        try {
            2Lk r4 = this.A01;
            CallerContext callerContext = 2Lk.A08;
            UserSession userSession = r4.A04;
            0Tu r2 = 0Tu.A05;
            if (182.A06(r2, userSession, 36324514107240574L)) {
                long A012 = 182.A01(r2, userSession, 36605989084009819L);
                Context context = r4.A01;
                int i = (int) A012;
                MY3 A0J = C66582MXn.A0J(context);
                MY3.A03(A0J);
                Iterator A0t = AnonymousClass7TF.A0t(A0J.A03);
                while (A0t.hasNext()) {
                    ((C70806OMb) A0t.next()).A01((long) i);
                }
                boolean z = 14i.A05;
                14i.A06(this.A00);
            }
        } catch (IOException e) {
            0wb.A06(AnonymousClass000.A00(1031), "failed to purge temp files", e);
        }
    }
}
