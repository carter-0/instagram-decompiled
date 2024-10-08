package X;

import android.app.Activity;

/* renamed from: X.ApY  reason: case insensitive filesystem */
public final class C41174ApY implements Runnable {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ C243273Yc A01;
    public final /* synthetic */ C283245Gr A02;

    public C41174ApY(Activity activity, C243273Yc r2, C283245Gr r3) {
        this.A00 = activity;
        this.A02 = r3;
        this.A01 = r2;
    }

    public final void run() {
        AnonymousClass5Gt A0e = AnonymousClass7TG.A0e(this.A00, 2131956621);
        A0e.A03 = this.A02;
        A0e.A02();
        A0e.A00 = 5000;
        A0e.A0A = true;
        A0e.A00().A06();
        0xY A0p = AnonymousClass7TE.A0p((1Av) C247323g9.A00(this.A01.A00).A06.A07.getValue());
        A0p.E5T("content_note_recycle_ufi_tooltip_shown", true);
        A0p.apply();
    }
}
