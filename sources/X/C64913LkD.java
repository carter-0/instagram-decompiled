package X;

import com.instagram.creation.activity.MediaCaptureActivity;

/* renamed from: X.LkD  reason: case insensitive filesystem */
public final class C64913LkD implements C273534mk {
    public final /* synthetic */ MediaCaptureActivity A00;
    public final /* synthetic */ AnonymousClass3Q2 A01;
    public final /* synthetic */ boolean A02;

    public final /* synthetic */ void AGe() {
    }

    public C64913LkD(MediaCaptureActivity mediaCaptureActivity, AnonymousClass3Q2 r2, boolean z) {
        this.A00 = mediaCaptureActivity;
        this.A01 = r2;
        this.A02 = z;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.instagram.creation.activity.MediaCaptureActivity, android.app.Activity] */
    public final void AGc() {
        AnonymousClass3Q2 r4 = this.A01;
        String str = r4.A3Z;
        ? r2 = this.A00;
        if (str == null) {
            String A022 = 0qc.A02();
            A022.getClass();
            C3499682q r0 = r2.A09.A00;
            r0.getClass();
            0qc.A04(r0.E2g(), A022, C51965G9l.A0v(new C64892Ljs(this, r4, A022, this.A02)));
            return;
        }
        1ua r1 = r2.A0B;
        r4.A5U = true;
        r4.A5S = true;
        r1.A05.A04();
        JW1.A00(r2.A04).A01();
        r2.runOnUiThread(new M64(r2, this.A02));
    }
}
