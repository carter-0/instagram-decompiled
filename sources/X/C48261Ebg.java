package X;

import android.view.Window;
import java.util.HashMap;

/* renamed from: X.Ebg  reason: case insensitive filesystem */
public abstract class C48261Ebg {
    public final String A00() {
        if (((C51855G4n) this).A02 != null) {
            return "com.bloks.www.fxcal.link.async";
        }
        0qQ.A0F("unifiedLauncherFlowConfig");
        throw AnonymousClass00P.createAndThrow();
    }

    public final String A01() {
        C49589Eyy eyy = ((C51855G4n) this).A02;
        if (eyy != null) {
            return eyy.A02;
        }
        0qQ.A0F("unifiedLauncherFlowConfig");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void A02() {
        C51853G4l g4l = (C51853G4l) this;
        g4l.A00.markerPoint(444800256, "hide_loading_state");
        1ZF A00 = C48916EmG.A00();
        Window window = g4l.A01;
        if (window != null) {
            A00.A01(window);
        } else {
            0qQ.A0F("window");
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public void A03() {
        C50342FYz fYz = ((C51853G4l) this).A02;
        String A01 = A01();
        A00();
        C50342FYz.A00(fYz, "initial_async_controller_request_success", "", A01, AnonymousClass7TE.A1E());
    }

    public void A04(String str) {
        C50342FYz fYz = ((C51853G4l) this).A02;
        String A01 = A01();
        String A00 = A00();
        HashMap A1E = AnonymousClass7TE.A1E();
        0qQ.A0B(A00, 2);
        C50342FYz.A00(fYz, "initial_async_controller_request_error", str, A01, A1E);
    }
}
