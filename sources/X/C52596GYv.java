package X;

import java.util.ArrayList;
import java.util.Map;

/* renamed from: X.GYv  reason: case insensitive filesystem */
public final class C52596GYv implements 2IR {
    public final /* synthetic */ AnonymousClass6L7 A00;
    public final /* synthetic */ AnonymousClass59L A01;
    public final /* synthetic */ boolean A02;
    public final /* synthetic */ boolean A03;

    public final void onFailure(Throwable th) {
        0qQ.A0B(th, 0);
        this.A01.DCj(this.A00, th);
    }

    public C52596GYv(AnonymousClass6L7 r1, AnonymousClass59L r2, boolean z, boolean z2) {
        this.A02 = z;
        this.A01 = r2;
        this.A00 = r1;
        this.A03 = z2;
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        GZ1 gz1 = (GZ1) obj;
        if (gz1 == null) {
            String A002 = Pxd.A00(29);
            0qQ.A0B(A002, 1);
            onFailure(new Exception(A002, (Throwable) null));
            return;
        }
        if (this.A02) {
            AnonymousClass59L r5 = this.A01;
            Map map = r5.A0O;
            AnonymousClass6L7 r0 = this.A00;
            map.put(r0, gz1);
            AnonymousClass62I r4 = r5.A0G;
            int size = map.size();
            Integer num = AnonymousClass05K.A00;
            C52507GVk gVk = (C52507GVk) r0;
            String str = gVk.A03;
            if (str == null) {
                str = "";
            }
            String str2 = gVk.A05;
            if (str2 == null) {
                str2 = "";
            }
            MJ3 mj3 = new MJ3(size, 6, r5);
            ArrayList A14 = DbV.A14(str);
            A14.add(str2);
            r4.Cgh(C306056Kp.A00(num, "cache", "carousel-window", A14, 0Yt.A0E(), mj3));
        }
        if (this.A03) {
            this.A01.A04(this.A00, gz1);
        }
    }
}
