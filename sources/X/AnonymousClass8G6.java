package X;

import android.view.View;

/* renamed from: X.8G6  reason: invalid class name */
public final /* synthetic */ class AnonymousClass8G6 implements View.OnClickListener {
    public final /* synthetic */ C352888Fl A00;

    public /* synthetic */ AnonymousClass8G6(C352888Fl r1) {
        this.A00 = r1;
    }

    public final void onClick(View view) {
        String str;
        AnonymousClass8W6 r4 = this.A00.A0B;
        C362868ic A002 = AnonymousClass8W6.A00(r4);
        if (A002 != null && A002.A00 != 0.0f) {
            AnonymousClass8WX r0 = r4.A01;
            if (r0 == null) {
                str = "creationGallerySurfaceControllerProvider";
            } else {
                C362048hG r1 = r0.A00().A02;
                if (r1 == null) {
                    0kD.A07("IgCameraViewControllerDelegateImpl", "onCameraOverlayClick() but GalleryController has not been created", (Throwable) null);
                    return;
                }
                if (C2808154f.A03(r1.A0V)) {
                    AnonymousClass8WX r02 = r4.A01;
                    str = "creationGallerySurfaceControllerProvider";
                    if (r02 != null) {
                        if (!r02.A00().A0R()) {
                            27p.A01(r4.A04).A0b();
                            AnonymousClass8WX r03 = r4.A01;
                            if (r03 != null) {
                                r03.A00().A0M(true);
                                return;
                            }
                        }
                    }
                }
                if (!r1.A0A) {
                    C2808154f.A01(r1.A0X, true);
                    return;
                }
                return;
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
    }
}
