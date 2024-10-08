package X;

import android.view.View;

public final class ANL implements View.OnClickListener {
    public final /* synthetic */ AnonymousClass61R A00;
    public final /* synthetic */ AnonymousClass87B A01;

    public ANL(AnonymousClass61R r1, AnonymousClass87B r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(204553854);
        AnonymousClass61R r0 = this.A00;
        if (r0 != null) {
            r0.E2p();
        }
        C3509386y r2 = this.A01.A0A.A00;
        if (r2.A0A()) {
            AnonymousClass87G A012 = r2.A0H.A01();
            A012.getClass();
            r2.A02(A012).A06();
            27r A013 = 27p.A01(r2.A0C);
            A012.getId();
            29Z r5 = A013.A0F;
            0Aj A0e = AnonymousClass7TE.A0e(r5.A01, "ig_camera_ui_tool_click");
            if (r5.A0P() && A0e.isSampled()) {
                A0e.A8M(AnonymousClass80P.CREATE_MODE_RANDOM, "tool_type");
                A0e.AAJ("legacy_falco_event_name", "IG_CAMERA_TAP_CREATE_RANDOM");
                AnonymousClass283 r4 = r5.A04;
                String str = r4.A0L;
                if (str == null) {
                    str = "";
                }
                A0e.AAJ("camera_session_id", str);
                int i = 2;
                if (r4.A01 != 2) {
                    i = 1;
                }
                AnonymousClass7TE.A1W(A0e, "camera_position", i);
                AnonymousClass7TH.A0X(A0e, r5);
                AnonymousClass7TE.A1V(A0e, r4);
                AnonymousClass7TE.A1W(A0e, "event_type", 2);
                A0e.A8M(r4.A0A, "media_type");
                AnonymousClass7TH.A0U(A0e);
                A0e.A8M(r4.A0C, "surface");
                A0e.AAJ("discovery_session_id", r4.A0O);
                A0e.AAJ("search_session_id", r4.A0P);
                AnonymousClass7TH.A0V(A0e);
            }
        }
        AnonymousClass0fD.A0C(-1126813614, A05);
    }
}
