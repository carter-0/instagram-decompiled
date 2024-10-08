package X;

import android.os.Build;

public final class FGI {
    public final 0lg A00;
    public final String A01;

    public static void A03(FGI fgi, C46634DiE diE) {
        fgi.A06((EXD) null, diE).A02();
    }

    public static 0xI A00(E3Y e3y, 1Q0 r4) {
        return r4.A02(e3y.A05).A05(e3y.B6Y(), e3y.BzS());
    }

    public static C49886FBm A01(E6T e6t, 1Q0 r2) {
        return r2.A02(e6t.A05).A06((EXD) null, C46634DiE.A1O);
    }

    public final 0xI A04() {
        0xI A04 = 1Q9.A01("log_in").A04(this.A01);
        A04.A08(Integer.valueOf(Build.VERSION.SDK_INT), "os_version");
        0lg r2 = this.A00;
        A04.A0C("fb_family_device_id", DbT.A0P(r2).A02(19f.A1y));
        A04.A0C("guid", DbV.A0t());
        if (DbV.A04(r2) > 0) {
            A04.A0C("source", "mas");
        }
        return A04;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.FBm, java.lang.Object] */
    public final C49886FBm A06(EXD exd, C46634DiE diE) {
        0lg r4 = this.A00;
        String str = this.A01;
        ? obj = new Object();
        obj.A02 = r4;
        0xI A04 = 1Q9.A01("log_in").A04(str);
        if (diE != null) {
            A04.A0C("step", diE.A01);
        }
        if (exd != null) {
            A04.A0C("flow", exd.A00);
        }
        obj.A01 = A04;
        if (exd != null) {
            Et6 et6 = new Et6();
            synchronized (et6) {
            }
            obj.A00 = et6;
        }
        obj.A03("os_version", Build.VERSION.SDK_INT);
        String A0t = DbV.A0t();
        A0t.getClass();
        obj.A04("guid", A0t);
        if (DbV.A04(r4) > 0) {
            obj.A04("source", "mas");
        }
        if (diE == C46634DiE.DONE) {
            obj.A04("reg_type", "consumer");
        }
        return obj;
    }

    public FGI(0lg r1, String str) {
        this.A00 = r1;
        this.A01 = str;
    }

    public static void A02(FGI fgi, EXD exd, C46634DiE diE) {
        fgi.A06(exd, diE).A02();
    }

    public final 0xI A05(EXD exd, C46634DiE diE) {
        0xI A04 = A04();
        if (diE != null) {
            A04.A0C("step", diE.A01);
        }
        if (exd != null) {
            A04.A0C("flow", exd.A00);
        }
        return A04;
    }
}
