package X;

import java.util.List;

/* renamed from: X.Fu2  reason: case insensitive filesystem */
public final class C51432Fu2 implements Runnable {
    public final /* synthetic */ C49964FGx A00;
    public final /* synthetic */ 0lg A01;
    public final /* synthetic */ List A02;

    public C51432Fu2(C49964FGx fGx, 0lg r2, List list) {
        this.A00 = fGx;
        this.A01 = r2;
        this.A02 = list;
    }

    public final void run() {
        C49964FGx fGx = this.A00;
        0lg r7 = this.A01;
        List list = this.A02;
        02m r1 = fGx.A01;
        if (r1 != null) {
            r1.markerPoint(896612552, "add_active_fblite_account_start");
            try {
                String str = "";
                boolean z = false;
                for (C376139Gr r2 : C49964FGx.A04(fGx, r7, C368108s5.A05, C368238sI.ACTIVE_ACCOUNT)) {
                    0eP A1L = AnonymousClass7TE.A1L("account_type", "");
                    C376119Gp r12 = r2.A01;
                    str = r12.A01.A02;
                    list.add(0Yt.A06(AnonymousClass7TH.A0h("token", r12.A00, A1L, AnonymousClass7TE.A1L("uid", str), AnonymousClass7TE.A1L("credential_type", "facebook_lite_active_session"))));
                    z = true;
                }
                if (z) {
                    fGx.A05.A03(r7, "facebook_lite_active_session", 0sr.A1L(new String[]{str}));
                } else {
                    fGx.A05.A01(r7, "facebook_lite_active_session");
                }
            } catch (SecurityException unused) {
                fGx.A05.A02(r7, "facebook_lite_active_session", "security_exception");
            } catch (Exception e) {
                fGx.A05.A02(r7, "facebook_lite_active_session", "other_exception");
                0KC.A0K("CaaFetchClientDataHelper", "Failed to fetch Facebook Lite active account from lite provider", e);
            } catch (Throwable th) {
                02m r0 = fGx.A01;
                if (r0 != null) {
                    r0.markerPoint(896612552, "add_active_fblite_account_end");
                    throw th;
                }
            }
            02m r02 = fGx.A01;
            if (r02 != null) {
                r02.markerPoint(896612552, "add_active_fblite_account_end");
                return;
            }
        }
        0qQ.A0F("qplLogger");
        throw AnonymousClass00P.createAndThrow();
    }
}
