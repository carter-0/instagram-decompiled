package X;

import android.view.View;
import android.widget.TextView;

/* renamed from: X.76F  reason: invalid class name */
public final class AnonymousClass76F implements AnonymousClass7DY {
    public final int A00;
    public final AnonymousClass7DX A01;
    public final AnonymousClass7DS A02;
    public final AnonymousClass7DU A03;
    public final AnonymousClass7DW A04;
    public final AnonymousClass7XA A05;
    public final AnonymousClass9HC A06;

    /* JADX WARNING: type inference failed for: r9v0, types: [X.7Xr, X.7XA] */
    public final /* bridge */ /* synthetic */ void D77(Object obj) {
        View requireViewById;
        C328007Db r10 = (C328007Db) obj;
        View BJd = r10.BJd();
        if (BJd instanceof TextView) {
            requireViewById = BJd;
        } else {
            requireViewById = BJd.requireViewById(this.A00);
        }
        TextView textView = (TextView) requireViewById;
        AnonymousClass7DS r6 = this.A02;
        AnonymousClass7DU r7 = this.A03;
        AnonymousClass7DW r8 = this.A04;
        AnonymousClass7DX r5 = this.A01;
        ? r9 = this.A05;
        AnonymousClass9HC r0 = this.A06;
        boolean z = r0.A1X;
        C328067Dh r3 = new C328067Dh(BJd, r5, r6, r7, r8, r9, r10, z, true, ((Boolean) r0.A0g.getValue()).booleanValue());
        AnonymousClass76R r1 = new AnonymousClass76R(r3, BJd, textView, z);
        ((C328017Dc) r10).EeT(r3);
        ((AnonymousClass76N) r10).EdM(r7);
        textView.setOnTouchListener(r1);
    }

    public final /* bridge */ /* synthetic */ void Cy2(Object obj, Object obj2) {
        C328087Dj BY0 = ((C328017Dc) ((C328007Db) obj)).BY0();
        if (BY0 != null) {
            ((C328077Di) BY0).A00 = obj2;
        }
    }

    public final /* bridge */ /* synthetic */ void DuS(Object obj) {
        C328087Dj BY0 = ((C328017Dc) ((C328007Db) obj)).BY0();
        if (BY0 != null) {
            ((C328077Di) BY0).A00 = null;
        }
    }

    public AnonymousClass76F(AnonymousClass7DX r1, AnonymousClass7DS r2, AnonymousClass7DU r3, AnonymousClass7DW r4, AnonymousClass7XA r5, AnonymousClass9HC r6, int i) {
        this.A05 = r5;
        this.A06 = r6;
        this.A02 = r2;
        this.A03 = r3;
        this.A04 = r4;
        this.A01 = r1;
        this.A00 = i;
    }
}
