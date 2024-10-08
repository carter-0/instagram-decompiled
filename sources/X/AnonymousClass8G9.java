package X;

import android.graphics.Bitmap;
import com.instagram.common.ui.blur.BlurUtil;

/* renamed from: X.8G9  reason: invalid class name */
public final /* synthetic */ class AnonymousClass8G9 implements 1wn {
    public final /* synthetic */ C352888Fl A00;

    public /* synthetic */ AnonymousClass8G9(C352888Fl r1) {
        this.A00 = r1;
    }

    public final void onEvent(Object obj) {
        C359138c4 r7 = (C359138c4) obj;
        JYD A002 = C352888Fl.A00(this.A00);
        if (A002 == null) {
            C352888Fl.A0F(C352888Fl.__redex_internal_original_name, "getLayoutCaptureController() returned null in mLayoutGalleryPhotoSelectedEventListener");
            return;
        }
        Bitmap bitmap = r7.A00;
        String str = r7.A01;
        if (A002.A01 == C347087wF.A0I) {
            A002.A0K(true);
        }
        C59792JYl jYl = A002.A0M;
        if (jYl.getItemCount() == 0) {
            A002.A0R.E3H(new Object());
        }
        if (jYl.getItemCount() < A002.A01.A03) {
            JYD.A03(BlurUtil.blur(bitmap, 0.25f, 10), A002, str);
        }
    }
}
