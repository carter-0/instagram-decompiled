package X;

import android.os.Handler;

/* renamed from: X.Lt4  reason: case insensitive filesystem */
public final class C65424Lt4 implements C66494MTx {
    public boolean A00;
    public final /* synthetic */ K5H A01;

    public C65424Lt4(K5H k5h) {
        this.A01 = k5h;
    }

    public final void DWl(C346927vz r9) {
        K5H k5h = this.A01;
        C346927vz r1 = C346927vz.GRANTED;
        K5H.A0B(k5h, C51969G9p.A1a(r9, r1));
        if (r9 != r1) {
            Handler handler = k5h.A0c;
            handler.removeMessages(1);
            if (this.A00 || r9 != C346927vz.DENIED_DONT_ASK_AGAIN) {
                handler.sendEmptyMessage(1);
                return;
            }
            1Wr r2 = 1Wr.A00;
            if (r2 == null || !r2.shouldUseDevicePermissionKit(k5h.A0B, K5H.A01(k5h)) || !r2.shouldUseNewNativeReconsiderDialog(k5h.A0B)) {
                String A0c = AnonymousClass7TF.A0c();
                C358248ab A0U = DbW.A0U(k5h);
                A0U.A0q(AnonymousClass7TF.A0e(DbV.A05(k5h), DbV.A05(k5h).getString(2131965506), 2131974920));
                A0U.A0r(false);
                A0U.A0I(new LV1(A0c, (Object) this, 4), 2131974918);
                A0U.A0C(new LV1(A0c, (Object) this, 5));
                LV8.A00(A0U, this, 8);
                k5h.A01 = A0U.A02();
                AnonymousClass4O6 r3 = k5h.A0H;
                VK6.A00.A03(k5h.A0B, r3, K5H.A01(k5h).name(), A0c);
                AnonymousClass0fN.A00(k5h.A01);
            }
        }
    }

    public final boolean Eso() {
        this.A00 = C67004Mgc.A06(this.A01.requireActivity(), "android.permission.ACCESS_COARSE_LOCATION");
        return true;
    }
}
