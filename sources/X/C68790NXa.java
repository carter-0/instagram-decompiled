package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;

/* renamed from: X.NXa  reason: case insensitive filesystem */
public final class C68790NXa extends AnonymousClass7PK {
    public final UserSession A00;
    public final P7G A01 = new Object();
    public final AnonymousClass9HC A02;
    public final AnonymousClass7L2 A03;
    public final 17i A04;

    /* JADX WARNING: type inference failed for: r0v3, types: [X.P7G, java.lang.Object] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C68790NXa(LayoutInflater layoutInflater, ViewGroup viewGroup, UserSession userSession, C3256673q r5, AnonymousClass9HC r6, AnonymousClass7L2 r7) {
        super(C3256673q.A00(layoutInflater, viewGroup), r5);
        0qQ.A0B(r5, 2);
        this.A00 = userSession;
        this.A03 = r7;
        this.A02 = r6;
        this.A04 = 17h.A00(userSession);
    }

    public final boolean A02() {
        return false;
    }

    public final /* bridge */ /* synthetic */ C232262tL A04(C331837So r9) {
        0qQ.A0B(r9, 0);
        P7G p7g = this.A01;
        Context A06 = JTQ.A06(this);
        UserSession userSession = this.A00;
        17i r6 = this.A04;
        AnonymousClass7L2 r5 = this.A03;
        return p7g.AWb(A06, userSession, this.A02, r9, r5, r6, false);
    }
}
