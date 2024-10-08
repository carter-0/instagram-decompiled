package X;

import android.content.Context;
import com.google.common.collect.EvictingQueue;
import com.instagram.common.session.UserSession;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public final class MZB implements AnonymousClass28l {
    public final EvictingQueue A00;
    public final UserSession A01;

    public MZB(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = new EvictingQueue(Math.max(DbS.A04(0Tu.A05, userSession, 36604241033499686L), 100));
    }

    public final void A02(String str) {
        0qQ.A0B(str, 0);
        if (182.A06(0Tu.A05, this.A01, 36322766056663448L)) {
            EvictingQueue evictingQueue = this.A00;
            0qQ.A06(evictingQueue);
            synchronized (evictingQueue) {
                evictingQueue.add(new NT2(str));
            }
        }
    }

    public final void A00(NT7 nt7) {
        if (182.A06(0Tu.A05, this.A01, 36322766055942542L)) {
            EvictingQueue evictingQueue = this.A00;
            0qQ.A06(evictingQueue);
            synchronized (evictingQueue) {
                evictingQueue.add(nt7);
            }
        }
    }

    public final void A01(Integer num, Integer num2, String str, String str2, long j, long j2, long j3) {
        if (182.A06(0Tu.A05, this.A01, 36322766055877005L)) {
            EvictingQueue evictingQueue = this.A00;
            0qQ.A06(evictingQueue);
            synchronized (evictingQueue) {
                evictingQueue.add(new NT4(num, num2, str, str2, j, j2, j3));
            }
        }
    }

    public final String getFilenamePrefix() {
        return "direct_instamadillo_send_receive_events";
    }

    public final String getFilenameSuffix() {
        return ".txt";
    }

    public final /* synthetic */ boolean getShouldUploadSynchronously_DANGEROUS_DO_NOT_USE_OR_YOU_WILL_GET_FIRED() {
        return false;
    }

    public final String getTag() {
        return "DirectInstamadilloLogCollector";
    }

    public final String getContentInBackground(Context context) {
        String str;
        C70760OKg oKg;
        StringBuilder A1A = AnonymousClass7TE.A1A();
        EvictingQueue<C70759OKf> evictingQueue = this.A00;
        0qQ.A06(evictingQueue);
        synchronized (evictingQueue) {
            C70760OKg oKg2 = new C70760OKg();
            C70760OKg oKg3 = new C70760OKg();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(AnonymousClass000.A00(4286), Locale.US);
            StringBuilder A1A2 = AnonymousClass7TE.A1A();
            for (C70759OKf oKf : evictingQueue) {
                String str2 = oKf.A02;
                if (str2 != null) {
                    int intValue = oKf.A01.intValue();
                    if (intValue == 0 || intValue == 1 || intValue == 3 || intValue == 4 || intValue == 2) {
                        oKg = oKg2;
                    } else if (intValue == 5 || intValue == 6) {
                        oKg = oKg3;
                    }
                    long j = oKf.A00;
                    if (j < oKg.A01) {
                        oKg.A01 = j;
                    }
                    if (j > oKg.A00) {
                        oKg.A00 = j;
                    }
                    oKg.A02.add(str2);
                }
                String format = simpleDateFormat.format(new Date(oKf.A00));
                switch (oKf.A01.intValue()) {
                    case 0:
                        str = "SEND_START";
                        break;
                    case 1:
                        str = "SEND_SUCCESS";
                        break;
                    case 2:
                        str = "SEND_FAIL";
                        break;
                    case 3:
                        str = "SEND_DISPATCHED_TO_MEM";
                        break;
                    case 4:
                        str = "SEND_UPDATE_FROM_MEM";
                        break;
                    case 5:
                        str = "RECEIVE_PAYLOAD";
                        break;
                    case 6:
                        str = "RECEIVE_PLACEHOLDER";
                        break;
                    case 7:
                        str = "MEM";
                        break;
                    default:
                        str = "BOOTSTRAP";
                        break;
                }
                String A13 = 002.A13(format, " [", str, "]: ", oKf.A00(), "\n");
                0qQ.A07(A13);
                A1A2.append(A13);
            }
            String A002 = oKg2.A00();
            if (A002 != null) {
                A1A.append("[1TID Send events]");
                A1A.append("\n");
                A1A.append(A002);
                A1A.append("\n");
                A1A.append("\n");
            }
            String A003 = oKg3.A00();
            if (A003 != null) {
                A1A.append("[1TID Receive events]");
                A1A.append("\n");
                A1A.append(A003);
                A1A.append("\n");
                A1A.append("\n");
            }
            A1A.append("[Event logs]");
            A1A.append("\n");
            A1A.append(A1A2);
        }
        return DbT.A10(A1A);
    }
}
