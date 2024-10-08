package X;

import com.instagram.common.session.UserSession;
import java.lang.ref.WeakReference;

/* renamed from: X.9iw  reason: invalid class name and case insensitive filesystem */
public final class C385439iw extends 1P0 {
    public final AnonymousClass1O9 A00;
    public final UserSession A01;
    public final Integer A02;
    public final WeakReference A03;

    public C385439iw(AnonymousClass1O9 r2, UserSession userSession, C41824B2f b2f, Integer num) {
        this.A01 = userSession;
        this.A02 = num;
        this.A00 = r2;
        this.A03 = new WeakReference(b2f);
    }

    public final void onFail(C268654dm r5) {
        int i;
        int A032 = AnonymousClass0fD.A03(-355324724);
        0qQ.A0B(r5, 0);
        C385439iw.super.onFail(r5);
        AnonymousClass1O9 r0 = this.A00;
        if (r0 == null || !r0.A00) {
            C41824B2f b2f = (C41824B2f) this.A03.get();
            if (b2f != null) {
                b2f.D6B(false, (String) null);
            }
            i = 2058202681;
        } else {
            i = 876250087;
        }
        AnonymousClass0fD.A0A(i, A032);
    }

    public final void onFinish() {
        C41824B2f b2f;
        int A032 = AnonymousClass0fD.A03(946592511);
        C385439iw.super.onFinish();
        AnonymousClass1O9 r0 = this.A00;
        if ((r0 == null || !r0.A00) && (b2f = (C41824B2f) this.A03.get()) != null) {
            b2f.onFinish();
        }
        AnonymousClass0fD.A0A(1635945172, A032);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        long j;
        long j2;
        0xY A0N;
        int i;
        int i2;
        int A032 = AnonymousClass0fD.A03(-1614585263);
        C384639he r9 = (C384639he) obj;
        int A033 = AnonymousClass0fD.A03(-1602365554);
        0qQ.A0B(r9, 0);
        C385439iw.super.onSuccess(r9);
        int intValue = this.A02.intValue();
        if (intValue == 1) {
            UserSession userSession = this.A01;
            Long l = r9.A00;
            if (l != null) {
                j = l.longValue();
            } else {
                j = 0;
            }
            0qQ.A0B(userSession, 0);
            A0N = AnonymousClass7TF.A0N(userSession);
            i = 539;
        } else if (intValue == 0) {
            UserSession userSession2 = this.A01;
            Long l2 = r9.A00;
            if (l2 != null) {
                j2 = l2.longValue();
            } else {
                j2 = 0;
            }
            0qQ.A0B(userSession2, 0);
            A0N = AnonymousClass7TF.A0N(userSession2);
            i = 1209;
        } else {
            C20561Wub A1K = AnonymousClass7TE.A1K();
            AnonymousClass0fD.A0A(1612382423, A033);
            throw A1K;
        }
        A0N.E5c(AnonymousClass000.A00(i), j2);
        A0N.apply();
        AnonymousClass1O9 r0 = this.A00;
        if (r0 == null || !r0.A00) {
            C41824B2f b2f = (C41824B2f) this.A03.get();
            if (b2f == null) {
                i2 = 1905600030;
            } else {
                boolean z = r9.A02;
                String str = r9.A01;
                if (z) {
                    b2f.D6C(str);
                } else {
                    b2f.D6B(true, str);
                }
                i2 = 1766558532;
            }
        } else {
            i2 = 306150892;
        }
        AnonymousClass0fD.A0A(i2, A033);
        AnonymousClass0fD.A0A(789086428, A032);
    }
}
