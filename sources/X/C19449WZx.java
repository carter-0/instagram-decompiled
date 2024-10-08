package X;

import com.facebook.common.callercontext.CallerContext;

/* renamed from: X.WZx  reason: case insensitive filesystem */
public final class C19449WZx implements C20959X6m {
    public final /* synthetic */ C255773uh A00;
    public final /* synthetic */ C14176TrF A01;

    public C19449WZx(C255773uh r1, C14176TrF trF) {
        this.A01 = trF;
        this.A00 = r1;
    }

    public final String BK1() {
        C14176TrF trF = this.A01;
        CallerContext callerContext = C14176TrF.A11;
        C255773uh r0 = trF.A03;
        r0.getClass();
        return 002.A0R("FbTrayScrolled::", r0.A0j);
    }

    public final void DIW() {
        1Xj r3 = this.A00.A0b;
        if (r3 != null) {
            C14176TrF trF = this.A01;
            CallerContext callerContext = C14176TrF.A11;
            0Aj A0e = AnonymousClass7TE.A0e(trF.A0I, "reel_viewer_dashboard_feedback_fb_tray_scrolled");
            DbW.A15(A0e, trF.A0H);
            String A30 = r3.A30();
            A30.getClass();
            G9t.A1J(A0e, A30);
            A0e.Cgf();
        }
    }
}
