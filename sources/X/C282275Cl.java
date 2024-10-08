package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.5Cl  reason: invalid class name and case insensitive filesystem */
public final class C282275Cl implements 2Ag {
    public final UserSession A00;
    public final C2373837k A01;
    public final Context A02;

    public final void D0Y(1OS r1) {
    }

    public final void D9f(1OS r1, String str, boolean z) {
    }

    public final /* synthetic */ void D9g(1OS r1, boolean z) {
    }

    public final void DB7(1OS r1) {
    }

    public final void DTK(0xF r1, 1OS r2, boolean z) {
    }

    public final /* synthetic */ void DYZ(String str, String str2, String str3) {
    }

    public final /* synthetic */ void DYd(1OS r1, String str, String str2) {
    }

    public final void Dfi(1OS r1, String str, boolean z) {
    }

    private String A00(1OS r6) {
        C300925yB r0;
        if (r6 instanceof AnonymousClass1fu) {
            return ((AnonymousClass1fu) r6).A01.A03;
        }
        if (r6 instanceof C65691fy) {
            return ((C65691fy) r6).A01.A07;
        }
        if (r6 instanceof 1fi) {
            return ((1fi) r6).A04.A06;
        }
        if (r6 instanceof 1cE) {
            AnonymousClass3Q2 r02 = ((1cE) r6).A07;
            if (r02 != null) {
                return r02.A35;
            }
            return null;
        } else if (!(r6 instanceof C66171kO)) {
            return null;
        } else {
            if (!182.A06(0Tu.A05, this.A00, 36325553489327135L) || (r0 = ((C66181kP) r6).A01) == null) {
                return null;
            }
            return r0.A06;
        }
    }

    public C282275Cl(Context context, UserSession userSession) {
        this.A02 = context;
        this.A00 = userSession;
        this.A01 = C2373637i.A00(context, userSession);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A01(X.1OS r5) {
        /*
            r4 = this;
            java.lang.String r1 = r4.A00(r5)
            if (r1 == 0) goto L_0x0036
            com.instagram.common.session.UserSession r0 = r4.A00
            com.instagram.pendingmedia.store.PendingMediaStore r0 = X.28K.A00(r0)
            X.3Q2 r3 = r0.A03(r1)
        L_0x0010:
            boolean r0 = r5 instanceof X.1bp
            if (r0 == 0) goto L_0x0034
            X.1bp r5 = (X.1bp) r5
            java.util.List r0 = r5.C6L()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0034
            java.util.List r1 = r5.C6L()
            r0 = 0
            java.lang.Object r2 = r1.get(r0)
            X.3sy r2 = (X.C254743sy) r2
        L_0x002b:
            if (r3 == 0) goto L_0x0033
            X.37k r1 = r4.A01
            r0 = 0
            r1.EFe(r2, r3, r0)
        L_0x0033:
            return
        L_0x0034:
            r2 = 0
            goto L_0x002b
        L_0x0036:
            r3 = 0
            goto L_0x0010
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C282275Cl.A01(X.1OS):void");
    }

    public final void DTL(0xF r14, 1OS r15, C270214gN r16, boolean z) {
        String str;
        String A002 = A00(r15);
        if (A002 != null) {
            AnonymousClass3Q2 A03 = 28K.A00(this.A00).A03(A002);
            C270214gN r1 = r16;
            if (A03 != null) {
                if (r16 != null) {
                    str = r1.toString();
                } else {
                    str = "Unkown Error";
                }
                this.A01.EFd((AnonymousClass55S) null, A03, str, new Exception(str));
                return;
            }
            C270214gN r0 = C63565KzE.A02;
            if (r1 == r0) {
                this.A01.EFu((AnonymousClass55S) null, (AnonymousClass3Q2) null, (String) null, (String) null, A002, (String) null, r0.A04, (Throwable) null, 1);
            }
        }
    }

    public final void D5W(1OS r1) {
        A01(r1);
    }

    public final void DTP(0xF r1, 1OS r2) {
        A01(r2);
    }
}
