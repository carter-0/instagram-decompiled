package X;

import com.facebook.odin.model.Example;
import com.facebook.odin.model.FeatureData;
import com.facebook.odin.model.OdinContext;
import com.facebook.odin.model.Type;
import com.instagram.common.session.UserSession;
import com.instagram.direct.stella.StellaIpcDirectMessagingServiceClient;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.94o  reason: invalid class name and case insensitive filesystem */
public final class C3732394o implements AnonymousClass94T {
    public final AnonymousClass0eM A00 = AnonymousClass0eN.A01(C3732494p.A00);
    public final AnonymousClass0eM A01;
    public final AnonymousClass0eM A02;
    public final AnonymousClass0eM A03;
    public final AnonymousClass0eM A04;
    public final AnonymousClass0eM A05;

    public final void CN8() {
        Example example;
        Object obj;
        long j;
        AnonymousClass0eM r6 = this.A04;
        if (!((AnonymousClass94P) r6.getValue()).CZg()) {
            0KC.A02(C3732394o.class, "prediction disabled");
            cleanup();
            return;
        }
        C39727A6s a6s = (C39727A6s) this.A05.getValue();
        C258903zp r4 = a6s.A01;
        C258743zZ r5 = a6s.A03;
        AnonymousClass40G EJD = r4.EJD(r5.CCP());
        if (!EJD.A02 || a6s.A00.now() >= ((Number) EJD.A00).longValue() + (r5.Bsd() * StellaIpcDirectMessagingServiceClient.KEEP_CONNECTION_ALIVE_MS)) {
            try {
                AnonymousClass40G A002 = a6s.A02.A00(AAG.A00(r5));
                if (A002.A02) {
                    List list = (List) A002.A00;
                    if (list.size() > 0) {
                        obj = list.get(0);
                    } else {
                        obj = Example.A03;
                    }
                    example = (Example) obj;
                } else {
                    example = Example.A03;
                }
            } catch (Exception unused) {
                example = Example.A03;
            }
            HashMap hashMap = example.A02;
            if (!hashMap.containsKey("3882")) {
                hashMap.put("3882", new FeatureData(Type.DOUBLE, "3882", (String) null, (List) null, -1.0d, 16372, 0));
            }
            if (!hashMap.containsKey("3884")) {
                hashMap.put("3884", new FeatureData(Type.DOUBLE, "3884", (String) null, (List) null, -1.0d, 16372, 0));
            }
            r4.Eya(example, r5.CCP(), a6s.A00.now());
        }
        C60400gq r3 = ((AnonymousClass94P) r6.getValue()).A00;
        if (r3 != null) {
            j = r3.BON(36605752861398335L);
        } else {
            j = 0;
        }
        AnonymousClass0eM r7 = this.A03;
        long A003 = ((C2604745u) r7.getValue()).A00("last_prediction_time", -1);
        if (A003 != -1) {
            Object value = this.A00.getValue();
            0qQ.A07(value);
            if (((AnonymousClass0JP) value).now() < A003 + (j * StellaIpcDirectMessagingServiceClient.KEEP_CONNECTION_ALIVE_MS)) {
                return;
            }
        }
        AnonymousClass40G E3W = ((AnonymousClass408) this.A01.getValue()).E3W((C258943zt) null, OdinContext.A05);
        if (E3W.A02) {
            int doubleValue = (int) ((Number) E3W.A00).doubleValue();
            C2604745u r1 = (C2604745u) r7.getValue();
            r1.A00.edit().putInt(002.A0T(r1.A01, "prediction_score", '_'), doubleValue).apply();
            Object value2 = this.A00.getValue();
            0qQ.A07(value2);
            ((C2604745u) r7.getValue()).A05("last_prediction_time", ((AnonymousClass0JP) value2).now());
            return;
        }
        Class<C3732394o> cls = C3732394o.class;
        String str = E3W.A01;
        if (str == null) {
            str = "unknown failure reason";
        }
        0KC.A02(cls, 002.A0R("failed to update shared prefs: ", str));
    }

    public final void cleanup() {
        AnonymousClass0eM r2 = this.A03;
        ((C2604745u) r2.getValue()).A03("prediction_score");
        ((C2604745u) r2.getValue()).A03("last_prediction_time");
    }

    public C3732394o(UserSession userSession) {
        this.A04 = AnonymousClass0eN.A01(new AnonymousClass9LU(userSession, 26));
        this.A05 = AnonymousClass0eN.A01(new C377419Lt(43, userSession, this));
        this.A02 = AnonymousClass0eN.A01(new C377419Lt(42, userSession, this));
        this.A01 = AnonymousClass0eN.A01(new C377419Lt(41, userSession, this));
        this.A03 = AnonymousClass0eN.A01(new AnonymousClass9LU(userSession, 25));
    }
}
