package X;

import android.content.Context;
import java.util.concurrent.atomic.AtomicInteger;

public final class EDX extends 1P0 {
    public static final AtomicInteger A05 = new AtomicInteger();
    public final Context A00;
    public final 0lg A01;
    public final String A02;
    public final String A03;
    public final boolean A04;

    public EDX(Context context, 0lg r3, String str, String str2, boolean z) {
        this.A00 = context.getApplicationContext();
        this.A01 = r3;
        this.A03 = str;
        this.A02 = str2;
        this.A04 = z;
    }

    public final void onFail(C268654dm r6) {
        C49886FBm A06;
        int A032 = AnonymousClass0fD.A03(1656113754);
        1xC.A01.A00(new C50262FVt(this.A03, (Integer) null, (String) null));
        boolean z = this.A04;
        0lg r1 = this.A01;
        if (z) {
            A06 = 1Q0.A1D.A02(r1).A06(EXD.PHONE, C46634DiE.A0V);
        } else {
            A06 = 1Q0.A0E.A02(r1).A06(EXD.PHONE, (C46634DiE) null);
        }
        A06.A04("error", "request_failed");
        A06.A02();
        AnonymousClass0fD.A0A(-1042035816, A032);
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [X.1xE, java.lang.Object] */
    public final void onFinish() {
        int A032 = AnonymousClass0fD.A03(132043585);
        if (A05.decrementAndGet() == 0) {
            1xC.A01.A00(new Object());
        }
        AnonymousClass0fD.A0A(666010955, A032);
    }

    public final void onStart() {
        int A032 = AnonymousClass0fD.A03(1984366167);
        if (A05.getAndIncrement() == 0) {
            1xC.A01.A00(new C50255FVm(this.A02));
        }
        AnonymousClass0fD.A0A(167723914, A032);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        C49886FBm A06;
        1Q0 r0;
        int A032 = AnonymousClass0fD.A03(1241802302);
        ENL enl = (ENL) obj;
        int A033 = AnonymousClass0fD.A03(1794662422);
        if (enl.A01) {
            boolean z = this.A04;
            0lg r1 = this.A01;
            if (!z) {
                r0 = 1Q0.A0G;
            } else {
                r0 = 1Q0.A0y;
            }
            C49886FBm A062 = r0.A02(r1).A06(EXD.PHONE, (C46634DiE) null);
            A062.A04("locale", AnonymousClass1Q2.A02().toString());
            A062.A02();
            1xC.A01.A00(new C50263FVu(enl, this.A03, this.A02));
            FGJ.A03.A05(this.A00);
        } else {
            1xC.A01.A00(new C50262FVt(this.A03, AnonymousClass05K.A15, enl.A00));
            boolean z2 = this.A04;
            0lg r12 = this.A01;
            if (z2) {
                A06 = 1Q0.A1D.A02(r12).A06(EXD.PHONE, C46634DiE.A0V);
            } else {
                A06 = 1Q0.A0E.A02(r12).A06(EXD.PHONE, (C46634DiE) null);
            }
            A06.A04("error", "validation_failed");
            A06.A02();
        }
        AnonymousClass0fD.A0A(-290632523, A033);
        AnonymousClass0fD.A0A(-984025733, A032);
    }
}
