package X;

import android.hardware.camera2.CameraDevice;
import java.util.List;

/* renamed from: X.7lp  reason: invalid class name and case insensitive filesystem */
public final class C340787lp {
    public static final C340797lq A0H = new C340797lq();
    public CameraDevice A00;
    public C340827lt A01;
    public C340837lu A02;
    public C340817ls A03;
    public C342627ou A04;
    public C342707p2 A05;
    public C340167ko A06;
    public C342687p0 A07;
    public C343177pn A08;
    public C343177pn A09;
    public C343177pn A0A;
    public boolean A0B;
    public final C340807lr A0C;
    public final C340797lq A0D;
    public final C340767ln A0E;
    public final C340757lm A0F;
    public volatile boolean A0G;

    public C340787lp(C340767ln r3, C340757lm r4) {
        C340797lq r1 = A0H;
        this.A0F = r4;
        this.A0E = r3;
        this.A0C = new C340807lr(r4);
        this.A0D = r1;
    }

    public final C343047pa A00(int i) {
        Object obj;
        C342687p0 r2;
        C342697p1 r1;
        List list;
        C342707p2 r12;
        C342727p4 r0;
        if (i != 32) {
            if (i == 35) {
                r12 = this.A05;
                if (r12 != null) {
                    r0 = C342717p3.A10;
                }
            } else if (i == 37) {
                r2 = this.A07;
                if (r2 != null) {
                    r1 = C342687p0.A15;
                    list = (List) r2.A01(r1);
                    if (list != null && !list.isEmpty()) {
                        obj = list.get(0);
                        return (C343047pa) obj;
                    }
                }
            } else if ((i == 256 || i == 4101) && (r12 = this.A05) != null) {
                r0 = C342717p3.A0k;
            }
            obj = r12.A02(r0);
            return (C343047pa) obj;
        }
        r2 = this.A07;
        if (r2 != null) {
            r1 = C342687p0.A16;
            list = (List) r2.A01(r1);
            obj = list.get(0);
            return (C343047pa) obj;
        }
        return null;
    }

    public final void A01(C364018kj r4, Exception exc) {
        this.A0F.A05(new C40966AmC(r4, exc), this.A0E.A03);
    }
}
