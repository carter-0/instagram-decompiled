package X;

import com.instagram.video.live.mvvm.model.repository.core.IgLiveBroadcastInfoManager;

/* renamed from: X.JiC  reason: case insensitive filesystem */
public abstract class C60255JiC extends 2YL {
    public C262204Co A00;
    public boolean A01;
    public final IgLiveBroadcastInfoManager A02;
    public final LES A03;
    public final C59720JVe A04;
    public final C249513ju A05;
    public final AnonymousClass0r6 A06;
    public final C313716gt A07;

    public final void A00() {
        C313716gt r3;
        LES les = this.A03;
        AnonymousClass0Ud r5 = les.A0p;
        if (!JTR.A1a(r5) && (r3 = this.A07) != null) {
            0Aj A0e = AnonymousClass7TE.A0e(r3.A08, "ig_live_expand_ufi");
            JTQ.A14(A0e, r3.A03);
            JTQ.A10(A0e, Long.parseLong(r3.A02));
            C51969G9p.A1A(A0e, r3.A07);
            C51965G9l.A1I(A0e, r3.A04);
            JTO.A1R(A0e, "viewer");
            JTQ.A16(A0e, 00k.A0a(r3.A06));
        }
        boolean z = !JTR.A1a(r5);
        AnonymousClass4D7 A0t = C51975G9x.A0t(this.A00);
        if (z) {
            this.A00 = C51966G9m.A1L(new MG2(this, A0t, 23), C318116oQ.A00(this));
        }
        AnonymousClass7TF.A1O(les.A0R, !JTR.A1a(r5));
    }

    public final void A01() {
        C51970G9q.A1S(this.A00);
        AnonymousClass7TF.A1O(this.A03.A0R, false);
    }

    public C60255JiC(C313716gt r2, IgLiveBroadcastInfoManager igLiveBroadcastInfoManager, LES les, C59720JVe jVe) {
        this.A04 = jVe;
        this.A02 = igLiveBroadcastInfoManager;
        this.A03 = les;
        this.A07 = r2;
        1HR A0o = JTQ.A0o();
        this.A05 = A0o;
        this.A06 = 0u9.A04(A0o);
    }
}
