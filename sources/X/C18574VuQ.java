package X;

import android.os.Handler;

/* renamed from: X.VuQ  reason: case insensitive filesystem */
public final class C18574VuQ {
    public 0lg A00;
    public Long A01;
    public Long A02;
    public Long A03;
    public String A04;
    public String A05;
    public Handler A06;

    public static Long A01(String str) {
        if (str != null) {
            try {
                return Long.valueOf(Long.parseLong(str));
            } catch (NumberFormatException e) {
                0wb.A07(AnonymousClass000.A00(3709), e);
            }
        }
        return null;
    }

    public static C18574VuQ A00(0lg r2) {
        return (C18574VuQ) C20405Wqp.A00(r2, C18574VuQ.class, 1);
    }

    public final void A02(1Xj r3, String str) {
        Handler handler = this.A06;
        if (handler == null) {
            handler = AnonymousClass7TF.A0D();
            this.A06 = handler;
        }
        handler.post(new C20288Wod(this, r3, str));
    }
}
