package X;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

public final class MAF implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ P30 A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ WeakReference A05;
    public final /* synthetic */ List A06;
    public final /* synthetic */ List A07;

    public MAF(P30 p30, String str, String str2, String str3, WeakReference weakReference, List list, List list2, int i) {
        this.A07 = list;
        this.A05 = weakReference;
        this.A06 = list2;
        this.A01 = p30;
        this.A03 = str;
        this.A00 = i;
        this.A04 = str2;
        this.A02 = str3;
    }

    public final void run() {
        Object obj;
        Integer num;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        List<C61058Jvw> list = this.A07;
        List list2 = this.A06;
        String str = this.A02;
        P30 p30 = this.A01;
        for (C61058Jvw jvw : list) {
            Iterator it = list2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (0qQ.A0K(((AnonymousClass7LQ) obj).A0e.A0h(), jvw.A03)) {
                    break;
                }
            }
            AnonymousClass7LQ r10 = (AnonymousClass7LQ) obj;
            if (r10 != null) {
                String str2 = jvw.A02;
                if (0qQ.A0K(str2, "RATE_LIMIT_EXCEEDED")) {
                    num = AnonymousClass05K.A00;
                } else if (str2 == null) {
                    num = AnonymousClass05K.A01;
                } else {
                    num = AnonymousClass05K.A0N;
                }
                C254703su r4 = r10.A0e;
                r4.A1H(jvw.A05);
                r4.A1G(str);
                p30.A01.BSN().EdR(num, jvw.A03, false);
                if (str2 != null) {
                    int i = A1H.get(str2);
                    if (i == null) {
                        i = 0;
                        A1H.put(str2, 0);
                    }
                    A1H.put(str2, Integer.valueOf(AnonymousClass7TE.A0M(i) + 1));
                }
                Number number = (Number) jvw.A01;
                if (number != null && number.intValue() == 0) {
                    int i2 = A1H.get("ZERO_CONFIDENCE_SCORE");
                    if (i2 == null) {
                        i2 = 0;
                        A1H.put("ZERO_CONFIDENCE_SCORE", 0);
                    }
                    A1H.put("ZERO_CONFIDENCE_SCORE", Integer.valueOf(AnonymousClass7TE.A0M(i2) + 1));
                }
            }
        }
        if (!A1H.isEmpty()) {
            int i3 = A1H.get("RATE_LIMIT_EXCEEDED");
            if (i3 == null) {
                i3 = 0;
            }
            if (AnonymousClass7TE.A0M(i3) > 0) {
                C59689JTv.A01((Context) this.A05.get(), "TranslationError", 2131958741, 0);
            }
            int i4 = A1H.get("UNSUPPORTED_LANG_PAIR");
            if (i4 == null) {
                i4 = 0;
            }
            int A0M = AnonymousClass7TE.A0M(i4);
            int i5 = A1H.get("SOURCE_AND_TARGET_LANG_SAME");
            if (i5 == null) {
                i5 = 0;
            }
            int A0M2 = AnonymousClass7TE.A0M(i5);
            int i6 = A1H.get("ZERO_CONFIDENCE_SCORE");
            if (i6 == null) {
                i6 = 0;
            }
            int A0M3 = AnonymousClass7TE.A0M(i6);
            if (list2.size() >= 3 && A0M + A0M2 + A0M3 >= list2.size()) {
                C62036KWs kWs = p30.A02;
                String str3 = this.A03;
                0qQ.A0B(str3, 0);
                AnonymousClass7TE.A1Z(new MEW(kWs, str3, (AnonymousClass4D7) null, 6, false), kWs.A01);
            }
        }
        C313756gx A0R = DbZ.A0R(p30.A03);
        int i7 = this.A00;
        List A0a = 00k.A0a(A1H.keySet());
        String str4 = this.A03;
        String str5 = this.A04;
        1Ln A0J = DbT.A0J(A0R);
        if (DbT.A1Y(A0J)) {
            DbW.A17(A0J, A0R);
            Dba.A1D(A0J, "channel_translation_request_success");
            A0J.A0p("channel_translation");
            DbZ.A1L(A0J, "thread_view", i7);
            A0J.A0s(str4);
            String str6 = null;
            JTT.A1F(A0J, A0R, C51972G9s.A0j(str5));
            if (AnonymousClass7TE.A1b(A0a)) {
                str6 = A0a.toString();
            }
            A0J.A0w(AnonymousClass7TF.A0w(Pxd.A00(712), str6));
            A0J.Cgf();
        }
        02m r2 = ((C70552OBa) p30.A05.getValue()).A00;
        r2.markerPoint(25631742, "Translation_Request_Success");
        r2.markerEnd(25631742, 2);
    }
}
