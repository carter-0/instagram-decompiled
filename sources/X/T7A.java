package X;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public final class T7A implements C61110lV {
    public static final long A05 = TimeUnit.HOURS.toMillis(168);
    public static final C10897Rzx A06 = new Object();
    public static volatile T7A A07;
    public final long A00;
    public final C11325SNb A01;
    public final 1wS A02;
    public final Map A03;
    public final C61410nE A04 = C61410nE.A00;

    public final void A00(AnonymousClass3WR r13, String str, String str2) {
        String str3 = r13.A0G;
        if (str3.length() != 0) {
            String str4 = str;
            if (str != null) {
                boolean z = true;
                List A18 = DbV.A18(str3, "_");
                if (A18.size() < 2 || !0qQ.A0K(A18.get(1), str2)) {
                    z = false;
                }
                C11325SNb sNb = this.A01;
                S35 s35 = new S35(str3, str4, r13.A06, System.currentTimeMillis(), z, r13.A0T);
                1W3 AR0 = sNb.A04.AR0();
                AR0.A09(str3, s35.toString());
                AR0.A03();
            }
        }
    }

    public T7A(C11325SNb sNb, 1wS r5, long j, long j2, long j3, long j4, long j5, long j6, long j7) {
        this.A02 = r5;
        this.A01 = sNb;
        this.A00 = j7;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        this.A03 = A1H;
        A1H.put(C8893REk.MAIN_FEED, Long.valueOf(j));
        A1H.put(C8893REk.STORY, Long.valueOf(j2));
        A1H.put(C8893REk.CLIPS, Long.valueOf(j3));
        A1H.put(C8893REk.EXPLORE, Long.valueOf(j4));
        A1H.put(C8893REk.CONTEXTUAL_FEED, Long.valueOf(j5));
        A1H.put(C8893REk.IGTV, Long.valueOf(j6));
        14i.A05(this);
    }

    public final void onAppBackgrounded() {
        int A032 = AnonymousClass0fD.A03(134808824);
        0nY.A00().ATE(new RA4(this));
        AnonymousClass0fD.A0A(-1673121762, A032);
    }

    public final void onAppForegrounded() {
        AnonymousClass0fD.A0A(1916193164, AnonymousClass0fD.A03(619304636));
    }
}
