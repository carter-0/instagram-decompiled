package X;

import android.view.View;

/* renamed from: X.77l  reason: invalid class name and case insensitive filesystem */
public final class C3266077l implements AnonymousClass7DY {
    public final boolean A00;
    public final AnonymousClass7DX A01;
    public final AnonymousClass7DS A02;
    public final AnonymousClass7DU A03;
    public final AnonymousClass7DW A04;
    public final C333107Xr A05;
    public final AnonymousClass9HC A06;
    public final C3266177m A07;

    public C3266077l(AnonymousClass7DS r10, AnonymousClass7DU r11, AnonymousClass7DW r12, C333107Xr r13, AnonymousClass9HC r14) {
        this((AnonymousClass7DX) null, r10, r11, r12, r13, r14, (C3266177m) null, false);
    }

    private final void A00(C328007Db r14) {
        AnonymousClass7DS r4 = this.A02;
        AnonymousClass7DU r5 = this.A03;
        AnonymousClass7DW r6 = this.A04;
        AnonymousClass7DX r3 = this.A01;
        C3266177m r8 = this.A07;
        C333107Xr r7 = this.A05;
        C328007Db r9 = r14;
        View BJd = r14.BJd();
        0qQ.A07(BJd);
        AnonymousClass9HC r0 = this.A06;
        C328067Dh r1 = new C328067Dh(BJd, r3, r4, r5, r6, r7, r8, r9, r0.A1X, true, ((Boolean) r0.A0g.getValue()).booleanValue());
        ((C328017Dc) r9).EeT(r1);
        r14.BJd().setOnTouchListener(r1);
    }

    public final /* bridge */ /* synthetic */ void Cy2(Object obj, Object obj2) {
        C328007Db r2 = (C328007Db) obj;
        0qQ.A0B(r2, 0);
        0qQ.A0B(obj2, 1);
        if (this.A00) {
            A00(r2);
        }
        C328087Dj BY0 = ((C328017Dc) r2).BY0();
        if (BY0 != null) {
            ((C328077Di) BY0).A00 = obj2;
        }
    }

    public final /* bridge */ /* synthetic */ void D77(Object obj) {
        C328007Db r2 = (C328007Db) obj;
        0qQ.A0B(r2, 0);
        if (!this.A00) {
            A00(r2);
        }
    }

    public final /* bridge */ /* synthetic */ void DuS(Object obj) {
        C328007Db r3 = (C328007Db) obj;
        0qQ.A0B(r3, 0);
        C328087Dj BY0 = ((C328017Dc) r3).BY0();
        if (BY0 != null) {
            ((C328077Di) BY0).A00 = null;
        }
    }

    public C3266077l(AnonymousClass7DX r2, AnonymousClass7DS r3, AnonymousClass7DU r4, AnonymousClass7DW r5, C333107Xr r6, AnonymousClass9HC r7, C3266177m r8, boolean z) {
        0qQ.A0B(r6, 1);
        this.A05 = r6;
        this.A06 = r7;
        this.A02 = r3;
        this.A03 = r4;
        this.A04 = r5;
        this.A01 = r2;
        this.A07 = r8;
        this.A00 = z;
    }
}
