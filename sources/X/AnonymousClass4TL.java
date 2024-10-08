package X;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.TreeMap;

/* renamed from: X.4TL  reason: invalid class name */
public final class AnonymousClass4TL implements Handler.Callback {
    public C256633w6 A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public final Handler A04;
    public final AnonymousClass4TM A05;
    public final C265214Sz A06;
    public final AnonymousClass4QW A07;
    public final TreeMap A08 = new TreeMap();

    public static void A00(AnonymousClass4TL r2, String str) {
        if (r2.A01) {
            r2.A02 = true;
            r2.A01 = false;
            C265144Ss r22 = ((C265204Sy) r2.A06).A00;
            r22.A08.removeCallbacks(r22.A0U);
            C265144Ss.A04(r22, str);
        }
    }

    public final void A01() {
        C265144Ss r2 = ((C265204Sy) this.A06).A00;
        if (!r2.A0G && r2.A0N.A0O) {
            r2.A0G = true;
            r2.A08.removeCallbacks(r2.A0U);
            C265144Ss.A04(r2, "refresh_after_init");
        }
    }

    public final boolean handleMessage(Message message) {
        C265144Ss r3;
        C266054Xj r2;
        if (!this.A03) {
            int i = message.what;
            if (i != 1) {
                if (i == 1001) {
                    C21395Xa3 xa3 = (C21395Xa3) message.obj;
                    C265214Sz r22 = this.A06;
                    Uri uri = xa3.A00;
                    String str = xa3.A01;
                    r3 = ((C265204Sy) r22).A00;
                    r2 = new WMM(str, uri);
                } else if (i != 1004) {
                    return false;
                } else {
                    Object[] objArr = (Object[]) message.obj;
                    C265214Sz r23 = this.A06;
                    String str2 = (String) objArr[1];
                    long longValue = ((Number) objArr[2]).longValue();
                    r3 = ((C265204Sy) r23).A00;
                    r2 = new WMN(str2, (byte[]) objArr[0], longValue);
                }
                C265174Sv r1 = r3.A0B;
                if (r1 == null) {
                    r1 = r3.A09((C264874Rq) null);
                    r3.A0B = r1;
                }
                r1.A0D(new WML(r2));
                return true;
            }
            C21396Xa4 xa4 = (C21396Xa4) message.obj;
            long j = xa4.A00;
            long j2 = xa4.A01;
            TreeMap treeMap = this.A08;
            Long valueOf = Long.valueOf(j2);
            Number number = (Number) treeMap.get(valueOf);
            if (number == null || number.longValue() > j) {
                treeMap.put(valueOf, Long.valueOf(j));
            }
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [java.lang.Object, X.4TM] */
    public AnonymousClass4TL(C265214Sz r3, C256633w6 r4, AnonymousClass4QW r5) {
        this.A00 = r4;
        this.A06 = r3;
        this.A07 = r5;
        Looper myLooper = Looper.myLooper();
        C256703wD.A01(myLooper);
        this.A04 = new Handler(myLooper, this);
        this.A05 = new Object();
    }
}
