package X;

import com.instagram.common.session.UserSession;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.Ji4  reason: case insensitive filesystem */
public final class C60247Ji4 extends 2YL {
    public int A00;
    public boolean A01;
    public boolean A02;
    public final 2Fk A03;
    public final LOW A04;
    public final C46215DQt A05 = new C64725Lh2(this, 5);
    public final UserSession A06;
    public final C249513ju A07;
    public final AnonymousClass0r6 A08;
    public final 05G A09;
    public final 05G A0A;
    public final C61455K8j A0B = new C61455K8j();
    public final C61456K8k A0C;
    public final C46215DQt A0D = new C64725Lh2(this, 4);

    public C60247Ji4(LOW low, UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A06 = userSession;
        this.A04 = low;
        02z A1J = JTO.A1J();
        this.A0A = A1J;
        02z A10 = C51970G9q.A10(true);
        this.A09 = A10;
        this.A03 = DbT.A0G(AnonymousClass10H.A03(new C67296MlV(0, (AnonymousClass4D7) null), A10, A1J));
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = 1HR.A05;
        AnonymousClass3FN r0 = C249513ju.A00;
        1HR A1G = JTO.A1G(AnonymousClass3FN.A00);
        this.A07 = A1G;
        this.A08 = 0u9.A04(A1G);
        C61456K8k k8k = new C61456K8k();
        k8k.A00 = 2131965910;
        this.A0C = k8k;
    }

    public final void A00() {
        if (!this.A02 && !this.A01) {
            this.A02 = true;
            LOW low = this.A04;
            C61456K8k k8k = this.A0C;
            String str = (String) C51968G9o.A10(k8k.A01, k8k.A00);
            if (str == null) {
                str = "";
            }
            C61455K8j k8j = this.A0B;
            String str2 = (String) C51968G9o.A10(k8j.A01, k8j.A00);
            if (str2 == null) {
                str2 = "";
            }
            low.A01(this.A0D, str, str2, (String) null, String.valueOf(this.A00));
        }
    }
}
