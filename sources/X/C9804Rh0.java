package X;

import android.app.Activity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Rh0  reason: case insensitive filesystem */
public abstract class C9804Rh0 {
    /* JADX WARNING: type inference failed for: r13v0, types: [X.SRs, java.lang.Object] */
    public static final Object A00(C307896Rx r14, AnonymousClass6Tm r15) {
        AnonymousClass4OA r5;
        Integer num;
        Activity A01;
        String A0D;
        C276544tV r6 = (C276544tV) r15.A03(0);
        C277014uI A0N = DbW.A0N(r15);
        if (r6 == null || (A0D = r6.A0D()) == null) {
            r5 = null;
        } else {
            r5 = AnonymousClass4OA.valueOf(AnonymousClass7TF.A0k(A0D));
        }
        0qQ.A0C(r5, "null cannot be cast to non-null type com.facebook.runtimepermissions.devicepermissionkit.shared.DevicePermissionAccessLevel");
        List A0N2 = r6.A0N(38);
        ArrayList A15 = DbV.A15(A0N2);
        Iterator it = A0N2.iterator();
        while (it.hasNext()) {
            A15.add(C8885REc.valueOf(AnonymousClass7TF.A0k((String) AnonymousClass7TF.A0a(it))));
        }
        String A0F = r6.A0F();
        if (A0F != null) {
            num = C9568Rd8.A00(AnonymousClass7TF.A0k(A0F));
        } else {
            num = null;
        }
        0qQ.A0C(num, "null cannot be cast to non-null type com.facebook.runtimepermissions.devicepermissionkit.shared.DevicePermissionStorageLevel");
        C61084JwM jwM = new C61084JwM(r5, num, (List) A15);
        C307786Rm r0 = r14.A03;
        if (r0 == null || (A01 = VK6.A00.A01(r0.A00)) == null) {
            DbX.A1P(r14, DbS.A0P(), A0N, "status_error", 0);
            return null;
        }
        ? obj = new Object();
        T7I t7i = new T7I(5, A01, jwM, new C10623RvH(r14, A0N, C11398SRs.A03(A01, jwM)), obj);
        0qQ.A07(A01.getApplicationContext());
        String[] A1b = DbU.A1b(C11398SRs.A00(jwM, obj), 0);
        1DL.A04(A01, t7i, (String[]) Arrays.copyOf(A1b, A1b.length));
        return null;
    }
}
