package X;

import android.content.Context;
import android.os.Looper;
import java.util.Map;

/* renamed from: X.7s0  reason: invalid class name and case insensitive filesystem */
public final class C344527s0 {
    public static final Object A05 = new Object();
    public C344557s3 A00;
    public final C344507ry A01;
    public final Context A02;
    public final C344547s2 A03;
    public final C344537s1 A04;

    public final C344567s4 A00(Looper looper) {
        Context context = this.A02;
        C344507ry r7 = this.A01;
        C344537s1 r8 = this.A04;
        C344547s2 r5 = this.A03;
        C344517rz r0 = C344507ry.A0B;
        Map map = r7.A00;
        C344557s3 r6 = (C344557s3) map.get(r0);
        if (r6 == null) {
            Object obj = map.get(C344507ry.A04);
            obj.getClass();
            if (!((Boolean) obj).booleanValue()) {
                r6 = null;
            } else {
                if (this.A00 == null) {
                    C344517rz r02 = C344507ry.A02;
                    Object obj2 = A05;
                    Object obj3 = map.get(r02);
                    if (obj3 != null) {
                        obj2 = obj3;
                    }
                    Object obj4 = map.get(C344507ry.A07);
                    obj4.getClass();
                    C344587s6 A012 = C344577s5.A01(obj2, ((Number) obj4).intValue());
                    this.A00 = A012;
                    A012.ErB(1);
                }
                r6 = this.A00;
            }
        }
        return new C344567s4(context, looper, r5, r6, r7, r8);
    }

    public C344527s0(Context context, C344547s2 r3, C344507ry r4, C344537s1 r5) {
        this.A02 = context.getApplicationContext();
        this.A01 = r4;
        this.A03 = r3;
        this.A04 = r5;
    }
}
