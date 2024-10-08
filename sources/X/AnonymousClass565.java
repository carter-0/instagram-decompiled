package X;

import com.instagram.common.session.UserSession;
import com.instagram.igsignals.core.IgSignalsExampleData;
import com.instagram.igsignals.core.IgSignalsModelPrediction;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.565  reason: invalid class name */
public final class AnonymousClass565 implements AnonymousClass566 {
    public B2C A00;
    public C62943Kov A01;
    public final AnonymousClass561 A02;
    public final List A03 = new ArrayList();
    public final List A04 = new ArrayList();
    public final List A05 = new ArrayList();
    public final 0sP A06;
    public final 0sJ A07;
    public final C262224Cq A08;
    public final UserSession A09;

    public final void A02(String str, 0sP r11) {
        C262224Cq r2 = this.A08;
        AnonymousClass9KY r3 = new AnonymousClass9KY(this, r11, str, (AnonymousClass4D7) null, 1);
        1Eo.A03(AnonymousClass05K.A00, 19B.A00, r3, r2);
    }

    public final void EJc(LDU ldu) {
        long currentTimeMillis = System.currentTimeMillis();
        LDU ldu2 = ldu;
        C62943Kov kov = ldu2.A03;
        if (kov != null) {
            C262224Cq r3 = this.A08;
            1Eo.A05(19B.A00, new C73567Pfo(ldu2, this, (AnonymousClass4D7) null, 38), r3);
            try {
                kov.A01(ldu2.A01, new C58749Iww(currentTimeMillis, this, ldu2, 8));
            } catch (AnonymousClass9GL e) {
                Throwable cause = e.getCause();
                C255463uA[] r0 = IgSignalsModelPrediction.A07;
                StringBuilder sb = new StringBuilder();
                sb.append("Failed to request prediction with exception: ");
                sb.append(e);
                sb.append(' ');
                sb.append(cause);
                ldu2.A00(new IgSignalsModelPrediction(sb.toString(), new HashMap(), -1.0d, false));
            }
        } else {
            C255463uA[] r02 = IgSignalsModelPrediction.A07;
            A01(new IgSignalsModelPrediction("No predictor specificed", new HashMap(), -1.0d, false), ldu2, this, currentTimeMillis);
            0wb.A03("IgSignals", "No predictor set");
        }
    }

    /* JADX INFO: finally extract failed */
    public static final void A00(C65380LsL lsL, AnonymousClass565 r13) {
        List list;
        for (LDU ldu : r13.A05) {
            if (0qQ.A0K(ldu.A01, lsL)) {
                return;
            }
        }
        B2C b2c = r13.A00;
        if (b2c != null) {
            ReentrantLock reentrantLock = lsL.A08;
            reentrantLock.lock();
            try {
                C255463uA[] r0 = IgSignalsExampleData.A06;
                String str = lsL.A04;
                double d = lsL.A02;
                List list2 = lsL.A05;
                long j = lsL.A03;
                List list3 = lsL.A01;
                if (list3 != null) {
                    list = 00k.A0a(list3);
                } else {
                    list = null;
                }
                IgSignalsExampleData igSignalsExampleData = new IgSignalsExampleData(str, list2, list, 00k.A0a(lsL.A06.values()), d, j);
                reentrantLock.unlock();
                b2c.EyY(igSignalsExampleData);
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("No example storage set to store example: ");
            sb.append(lsL);
            0wb.A03("IgSignals", sb.toString());
        }
        r13.A04.remove(lsL);
    }

    public AnonymousClass565(UserSession userSession, AnonymousClass561 r3, 0sP r4, 0sJ r5, C262224Cq r6) {
        this.A09 = userSession;
        this.A02 = r3;
        this.A06 = r4;
        this.A07 = r5;
        this.A08 = r6;
    }

    public static final void A01(IgSignalsModelPrediction igSignalsModelPrediction, LDU ldu, AnonymousClass565 r6, long j) {
        C18751Vzm vzm;
        long currentTimeMillis = System.currentTimeMillis();
        igSignalsModelPrediction.A01 = j;
        igSignalsModelPrediction.A00 = currentTimeMillis;
        C62943Kov kov = ldu.A03;
        if (kov != null) {
            vzm = kov.A00();
        } else {
            vzm = null;
        }
        igSignalsModelPrediction.A02 = vzm;
        ldu.A00(igSignalsModelPrediction);
        1Eo.A05(19B.A00, new C73567Pfo(ldu, r6, (AnonymousClass4D7) null, 37), r6.A08);
    }
}
