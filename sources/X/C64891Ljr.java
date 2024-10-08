package X;

import com.instagram.creation.activity.MediaCaptureActivity;

/* renamed from: X.Ljr  reason: case insensitive filesystem */
public final /* synthetic */ class C64891Ljr implements 0qb {
    public final /* synthetic */ MediaCaptureActivity A00;
    public final /* synthetic */ AnonymousClass3Q2 A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ boolean A03;

    public /* synthetic */ C64891Ljr(MediaCaptureActivity mediaCaptureActivity, AnonymousClass3Q2 r2, String str, boolean z) {
        this.A00 = mediaCaptureActivity;
        this.A03 = z;
        this.A01 = r2;
        this.A02 = str;
    }

    public final void DX4(boolean z) {
        MediaCaptureActivity mediaCaptureActivity = this.A00;
        boolean z2 = this.A03;
        AnonymousClass3Q2 r2 = this.A01;
        String str = this.A02;
        if (z) {
            if (z2) {
                r2.A33 = str;
            } else {
                r2.A3Z = str;
            }
            1ua r1 = mediaCaptureActivity.A0B;
            r2.A5U = true;
            r2.A5S = true;
            r1.A05.A04();
        }
    }
}
