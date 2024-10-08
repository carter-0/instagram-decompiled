package X;

import com.instagram.common.session.UserSession;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.AXk  reason: case insensitive filesystem */
public final class C40246AXk implements AnonymousClass1GR {
    public boolean A00 = true;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ 0sL A03;

    public final void D58(AnonymousClass1QW r1, AnonymousClass2ZK r2) {
    }

    public final void DEO(C268654dm r1, AnonymousClass1QW r2) {
    }

    public final /* synthetic */ void DEQ(C268654dm r1, AnonymousClass1QW r2) {
    }

    public final /* synthetic */ void DTx() {
    }

    public final /* synthetic */ void DTy(1XR r1, AnonymousClass1QW r2, AnonymousClass2ZK r3) {
    }

    public final /* synthetic */ void DeX() {
    }

    public final /* synthetic */ void Den() {
    }

    public final /* synthetic */ void DfH(AnonymousClass1QW r1, AnonymousClass2ZK r2) {
    }

    public C40246AXk(UserSession userSession, String str, 0sL r4) {
        this.A03 = r4;
        this.A01 = userSession;
        this.A02 = str;
    }

    public final /* bridge */ /* synthetic */ void DTw(1XR r6, AnonymousClass1QW r7, AnonymousClass2ZK r8) {
        List Ao4;
        Object obj;
        1Xj r1;
        C298835u7 r62 = (C298835u7) r6;
        0qQ.A0B(r62, 2);
        if (this.A00 && (Ao4 = r62.Ao4()) != null) {
            Iterator it = Ao4.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((C267324bN) obj).A02 != null) {
                    break;
                }
            }
            C267324bN r12 = (C267324bN) obj;
            if (!(r12 == null || (r1 = r12.A02) == null)) {
                C255593uO.A00(this.A01).A01(new C256203vO(r1.CEL(), this.A02));
            }
        }
        this.A03.invoke(r62, Boolean.valueOf(this.A00));
        this.A00 = false;
    }
}
