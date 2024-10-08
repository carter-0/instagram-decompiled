package X;

import androidx.media3.common.Timeline;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

/* renamed from: X.Xv8  reason: case insensitive filesystem */
public final class C22082Xv8 implements C22549Y8z {
    public static final C635813i A08 = new C22308XzI(1);
    public static final Random A09 = new Random();
    public long A00 = -1;
    public Timeline A01 = Timeline.A00;
    public YA2 A02;
    public String A03;
    public final XcO A04 = new XcO();
    public final SIQ A05 = new SIQ();
    public final C635813i A06 = A08;
    public final HashMap A07 = AnonymousClass7TE.A1E();

    public final synchronized void FLU(C21490Xch xch) {
        this.A02.getClass();
        if (!AnonymousClass7TF.A1Q(xch.A07.A02())) {
            C21439Xar A002 = A00(this, xch.A01);
            String str = this.A03;
            if (str == null) {
                str = A002.A04;
                this.A03 = str;
            }
            if (!A002.A03) {
                A002.A03 = true;
            }
            String str2 = A002.A04;
            if (str2.equals(str) && !A002.A02) {
                A002.A02 = true;
                this.A02.DjM(xch, str2);
            }
        }
    }

    public static C21439Xar A00(C22082Xv8 xv8, int i) {
        HashMap hashMap = xv8.A07;
        Iterator A0t = AnonymousClass7TF.A0t(hashMap);
        C21439Xar xar = null;
        while (A0t.hasNext()) {
            C21439Xar xar2 = (C21439Xar) A0t.next();
            if (i == xar2.A00) {
                xar = xar2;
            }
        }
        if (xar != null) {
            return xar;
        }
        String str = (String) xv8.A06.get();
        C21439Xar xar3 = new C21439Xar(xv8, str, i);
        hashMap.put(str, xar3);
        return xar3;
    }

    public static void A01(C21490Xch xch, C22082Xv8 xv8) {
        if (AnonymousClass7TF.A1Q(xch.A07.A02())) {
            String str = xv8.A03;
            if (str != null) {
                xv8.A07.get(str).getClass();
                xv8.A03 = null;
                return;
            }
            return;
        }
        xv8.A07.get(xv8.A03);
        xv8.A03 = A00(xv8, xch.A01).A04;
        xv8.FLU(xch);
    }
}
