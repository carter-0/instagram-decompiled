package X;

import android.view.View;

/* renamed from: X.IZn  reason: case insensitive filesystem */
public final class C57382IZn implements C273414mX {
    public final /* synthetic */ View A00;
    public final /* synthetic */ C267324bN A01;
    public final /* synthetic */ GCV A02;
    public final /* synthetic */ String A03;

    public final void Cyf() {
    }

    public C57382IZn(View view, C267324bN r2, GCV gcv, String str) {
        this.A03 = str;
        this.A02 = gcv;
        this.A00 = view;
        this.A01 = r2;
    }

    /* JADX WARNING: type inference failed for: r0v9, types: [X.1qK, java.lang.Object] */
    public final void Cyc() {
        String str = this.A03;
        if (str != null && str.equals("clips_action_sheet")) {
            AnonymousClass1Nd.A00(this.A02.A06).A00(new Object());
        }
        GCV gcv = this.A02;
        AnonymousClass1Nd.A00(gcv.A06).A02(gcv.A05, AnonymousClass3KV.class);
        View view = this.A00;
        gcv.A0D.A00();
        2eQ.A06(view, 1000);
        JR1 jr1 = gcv.A0E;
        jr1.EI8();
        jr1.Cmm(this.A01);
    }
}
