package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.direct.disappearingmode.expiration.OpenDisappearingMessagesExpirationWorker;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* renamed from: X.4ru  reason: invalid class name and case insensitive filesystem */
public final class C275764ru implements AnonymousClass0lh {
    public Long A00;
    public final AnonymousClass385 A01;
    public final 1Ng A02;
    public final 1wn A03 = new C275774rv(this);
    public final C61110lV A04 = new C275784rw(this);
    public final UserSession A05;
    public final String A06;
    public final long A07;

    public C275764ru(Context context, UserSession userSession) {
        0qQ.A0B(userSession, 2);
        this.A05 = userSession;
        this.A06 = 002.A0R("disMsgExpiration:", userSession.A05);
        AnonymousClass385 A002 = AnonymousClass385.A00(context);
        0qQ.A07(A002);
        this.A01 = A002;
        this.A07 = 182.A01(0Tu.A05, userSession, 36607140135638544L);
        this.A02 = AnonymousClass1Nd.A00(userSession);
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [X.39x, java.util.concurrent.Future, java.lang.Object] */
    public static final Long A00(C275764ru r8, long j) {
        AnonymousClass385 r2 = r8.A01;
        QG9 qg9 = new QG9(r2, r8.A06);
        ((AnonymousClass38M) r2.A06).A01.execute(qg9);
        ? r0 = qg9.A00;
        0qQ.A07(r0);
        try {
            Object obj = r0.get();
            0qQ.A07(obj);
            C11028S6g s6g = (C11028S6g) 00k.A0J((List) obj);
            if (s6g == null) {
                return Long.MAX_VALUE;
            }
            C2379139t r5 = s6g.A05;
            int ordinal = r5.ordinal();
            if (ordinal == 0 || ordinal == 2) {
                return Long.valueOf(s6g.A02);
            }
            if (ordinal == 1) {
                return Long.valueOf(j);
            }
            if (ordinal == 5) {
                return Long.MAX_VALUE;
            }
            0wj r22 = 0wj.A01;
            StringBuilder sb = new StringBuilder();
            sb.append("Unexpected WorkInfo.State status of expiration job:  ");
            sb.append(r5);
            r22.AEf(sb.toString(), 601233463).report();
            return null;
        } catch (InterruptedException | ExecutionException e) {
            0f9 AEf = 0wj.A01.AEf("Failed to fetch status of expiration job", 601233463);
            AEf.ERJ(e);
            AEf.report();
            return null;
        }
    }

    public final void onSessionWillEnd() {
        this.A01.A05(this.A06);
        this.A02.A02(this.A03, AnonymousClass2KZ.class);
        14i.A06(this.A04);
    }

    public final void A01(long j) {
        if (14i.A08()) {
            this.A00 = Long.valueOf(j);
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        Long A002 = A00(this, currentTimeMillis);
        if (A002 != null) {
            long longValue = A002.longValue();
            if (longValue == currentTimeMillis) {
                long j2 = this.A07 + currentTimeMillis;
                if (j < j2) {
                    j = j2;
                }
            } else if (longValue <= j) {
                return;
            }
        }
        long j3 = j - currentTimeMillis;
        if (j3 < 0) {
            j3 = 0;
        }
        AnonymousClass385 r6 = this.A01;
        String str = this.A06;
        Integer num = AnonymousClass05K.A00;
        C375589Ef r7 = new C375589Ef(OpenDisappearingMessagesExpirationWorker.class);
        C255333tx r3 = new C255333tx();
        r3.A00.put("session_token", this.A05.A05);
        r7.A00.A0C = r3.A00();
        r7.A02(C10032RlU.A00);
        r7.A01(j3, TimeUnit.MILLISECONDS);
        r6.A02((C7485QFt) r7.A00(), num, str);
    }
}
