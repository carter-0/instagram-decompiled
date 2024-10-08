package X;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.Rgy  reason: case insensitive filesystem */
public abstract class C9802Rgy {
    /* JADX WARNING: type inference failed for: r4v2, types: [X.SRs, java.lang.Object] */
    public static final Object A00(C307896Rx r9, AnonymousClass6Tm r10) {
        AnonymousClass4OA r3;
        Integer num;
        Context context;
        Map map;
        AnonymousClass4OB r0;
        String A0D;
        C276544tV r4 = (C276544tV) r10.A03(0);
        C277014uI A0N = DbW.A0N(r10);
        if (r4 == null || (A0D = r4.A0D()) == null) {
            r3 = null;
        } else {
            r3 = AnonymousClass4OA.valueOf(AnonymousClass7TF.A0k(A0D));
        }
        0qQ.A0C(r3, "null cannot be cast to non-null type com.facebook.runtimepermissions.devicepermissionkit.shared.DevicePermissionAccessLevel");
        List A0N2 = r4.A0N(38);
        ArrayList A15 = DbV.A15(A0N2);
        Iterator it = A0N2.iterator();
        while (it.hasNext()) {
            A15.add(C8885REc.valueOf(AnonymousClass7TF.A0k((String) AnonymousClass7TF.A0a(it))));
        }
        String A0F = r4.A0F();
        if (A0F != null) {
            num = C9568Rd8.A00(AnonymousClass7TF.A0k(A0F));
        } else {
            num = null;
        }
        0qQ.A0C(num, "null cannot be cast to non-null type com.facebook.runtimepermissions.devicepermissionkit.shared.DevicePermissionStorageLevel");
        C61084JwM jwM = new C61084JwM(r3, num, (List) A15);
        C307786Rm r02 = r9.A03;
        if (r02 != null) {
            context = r02.A00;
        } else {
            context = null;
        }
        ? obj = new Object();
        if (context != null) {
            List A00 = C11398SRs.A00(jwM, obj);
            LinkedHashMap A0x = DbS.A0x(JTT.A08(A00));
            for (Object next : A00) {
                if (1DL.A07(context, (String) next)) {
                    r0 = AnonymousClass4OB.GRANTED;
                } else {
                    r0 = AnonymousClass4OB.DENIED;
                }
                A0x.put(next, r0);
            }
            map = C11398SRs.A01(jwM, obj, A0x);
        } else {
            map = null;
        }
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (map != null) {
            Iterator A16 = DbV.A16(map);
            while (A16.hasNext()) {
                Object next2 = A16.next();
                AnonymousClass4OB r03 = (AnonymousClass4OB) map.get(next2);
                if (r03 != null) {
                    A1H.put(next2, r03.A00);
                }
            }
        }
        C299275ur.A00(r9, DbY.A0Q(A1H), A0N);
        return null;
    }
}
