package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.LZd  reason: case insensitive filesystem */
public final class C64303LZd implements C13907Tl7, AnonymousClass07Y {
    public C63888LAr A00;
    public C262224Cq A01;
    public boolean A02;
    public final UserSession A03;

    public final void onCreate(AnonymousClass07Z r2) {
        0qQ.A0B(r2, 0);
        this.A02 = true;
    }

    public final void onDestroy(AnonymousClass07Z r2) {
        0qQ.A0B(r2, 0);
        C63888LAr lAr = this.A00;
        if (lAr != null) {
            AH4 ah4 = lAr.A03;
            if (ah4 == null) {
                0qQ.A0F("richMediaViewer3d");
                throw AnonymousClass00P.createAndThrow();
            } else {
                ah4.A09.destroy();
            }
        }
    }

    public final /* synthetic */ void onPause(AnonymousClass07Z r1) {
    }

    public final /* synthetic */ void onResume(AnonymousClass07Z r1) {
    }

    public final /* synthetic */ void onStart(AnonymousClass07Z r1) {
    }

    public final /* synthetic */ void onStop(AnonymousClass07Z r1) {
    }

    public C64303LZd(UserSession userSession) {
        this.A03 = userSession;
    }
}
