package X;

import java.util.Map;
import java.util.Set;

/* renamed from: X.4ZB  reason: invalid class name */
public final class AnonymousClass4ZB extends 1P0 {
    public final /* synthetic */ 1P2 A00;
    public final /* synthetic */ 1P0 A01;
    public final /* synthetic */ String A02;

    public AnonymousClass4ZB(1P2 r1, 1P0 r2, String str) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = str;
    }

    public final void onFail(C268654dm r5) {
        int A03 = AnonymousClass0fD.A03(-879138043);
        0qQ.A0B(r5, 0);
        AnonymousClass4ZB.super.onFail(r5);
        1P2 r2 = this.A00;
        Map map = r2.A01;
        String str = this.A02;
        map.remove(str);
        r2.A02.remove(str);
        1P0 r0 = this.A01;
        if (r0 != null) {
            r0.onFail(r5);
        }
        AnonymousClass0fD.A0A(1447216247, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int i;
        int A03 = AnonymousClass0fD.A03(1762729053);
        1XU r11 = (1XU) obj;
        int A032 = AnonymousClass0fD.A03(-1634823466);
        0qQ.A0B(r11, 0);
        1P0 r9 = this.A01;
        if (r9 == null || r9.isValidResponseData(r11)) {
            AnonymousClass4ZB.super.onSuccess(r11);
            long currentTimeMillis = System.currentTimeMillis();
            1P2 r6 = this.A00;
            1Gd r1 = r6.A00;
            String str = this.A02;
            r1.A02(str, currentTimeMillis);
            Set set = r6.A02;
            r1.A03(str, set.contains(str));
            1Gd.A00(r1);
            C61480nO A002 = 0nY.A00();
            0qQ.A07(A002);
            r6.A00.put(str, new C266474Za(r11, A002, currentTimeMillis));
            r6.A01.remove(str);
            set.remove(str);
            if (r9 != null) {
                r9.onSuccess(r11);
            }
            i = 498939249;
        } else {
            i = -992917130;
        }
        AnonymousClass0fD.A0A(i, A032);
        AnonymousClass0fD.A0A(1993178070, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        int A03 = AnonymousClass0fD.A03(-797268161);
        int A032 = AnonymousClass0fD.A03(-1303132465);
        0qQ.A0B(obj, 0);
        1P0 r0 = this.A01;
        if (r0 != null) {
            r0.onSuccessInBackground(obj);
        }
        AnonymousClass0fD.A0A(838125897, A032);
        AnonymousClass0fD.A0A(-1023860789, A03);
    }
}
