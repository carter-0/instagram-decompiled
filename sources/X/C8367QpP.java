package X;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.internal.location.zzbc;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;
import java.util.List;

/* renamed from: X.QpP  reason: case insensitive filesystem */
public final class C8367QpP extends AnonymousClass63E {
    /* JADX WARNING: type inference failed for: r7v0, types: [com.google.android.gms.internal.location.zzbc, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r4v1, types: [X.RxX, java.lang.Object] */
    public final AnonymousClass9GD A00(Looper looper, RR1 rr1, LocationRequest locationRequest) {
        List list = zzbc.A0B;
        ? obj = new Object();
        obj.A01 = locationRequest;
        obj.A05 = list;
        obj.A02 = null;
        obj.A06 = false;
        obj.A07 = false;
        obj.A08 = false;
        obj.A03 = null;
        obj.A09 = false;
        obj.A0A = false;
        obj.A04 = null;
        obj.A00 = Long.MAX_VALUE;
        if (looper == null) {
            AnonymousClass3Qk.A09(AnonymousClass7TF.A1V(Looper.myLooper()), "Can't create handler inside thread that has not called Looper.prepare()");
            looper = Looper.myLooper();
        }
        AnonymousClass3Qk.A03(rr1, "Listener must not be null");
        AnonymousClass3Qk.A03(looper, "Looper must not be null");
        C10598Rus rus = new C10598Rus(looper, rr1);
        SxY sxY = new SxY(rus, this);
        SxW sxW = new SxW(rus, obj, this, rr1, sxY);
        ? obj2 = new Object();
        obj2.A03 = C13088TKv.A00;
        obj2.A04 = true;
        obj2.A01 = sxW;
        obj2.A02 = sxY;
        obj2.A00 = rus;
        S41 s41 = rus.A01;
        AnonymousClass3Qk.A03(s41, "Key must not be null");
        C10601Ruv ruv = new C10601Ruv(obj2.A00, obj2, obj2.A04);
        C10464Rsf rsf = new C10464Rsf(s41, obj2);
        Runnable runnable = obj2.A03;
        AnonymousClass3Qk.A03(ruv.A00.A01, "Listener has already been released.");
        AnonymousClass3Qk.A03(rsf.A00, "Listener has already been released.");
        AnonymousClass63T r4 = this.A07;
        C365498nD r3 = new C365498nD();
        AnonymousClass63T.A05(this, r4, r3, 0);
        AnonymousClass7TE.A1S(r4.A06, new C10599Rut(this, new C8380Qpl(new C10600Ruu(ruv, rsf, runnable), r3), r4.A0C.get()), 8);
        return r3.A00;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.63P, java.lang.Object] */
    public C8367QpP(Context context) {
        super(context, (AnonymousClass63L) null, LocationServices.A00, new AnonymousClass63N(Looper.getMainLooper(), new Object()));
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [X.96h, java.lang.Object] */
    public final void A01(RR1 rr1) {
        AnonymousClass3Qk.A03(rr1, "Listener must not be null");
        AnonymousClass3Qk.A06("LocationCallback", "Listener type must not be empty");
        S41 s41 = new S41(rr1);
        AnonymousClass63T r4 = this.A07;
        C365498nD r3 = new C365498nD();
        AnonymousClass7TE.A1S(r4.A06, new C10599Rut(this, new C8383Qpo(s41, r3), r4.A0C.get()), 13);
        r3.A00.A02(new Object(), AnonymousClass9GH.A00);
    }
}
