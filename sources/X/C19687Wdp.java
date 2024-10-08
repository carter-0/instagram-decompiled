package X;

import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;

/* renamed from: X.Wdp  reason: case insensitive filesystem */
public final class C19687Wdp implements C273414mX {
    public final int A00;
    public final Object A01;
    public final String A02;

    public C19687Wdp(C15998Umf umf, String str, int i) {
        this.A00 = i;
        this.A01 = umf;
        this.A02 = str;
    }

    public final void Cyc() {
        switch (this.A00) {
            case 0:
                String str = this.A02;
                C18462VsB vsB = ((C16039UnS) ((C15998Umf) this.A01).A0D.getValue()).A0M;
                XB6.A00(C18462VsB.A00(vsB, str, (String) null), vsB.A00, vsB.A01, "lead_gen_business_profile_content", "business_profile_bottom_sheet_dismiss");
                return;
            case 1:
                C18461VsA vsA = C13990Tnq.A0R((C15267UYh) this.A01).A0L;
                String str2 = this.A02;
                XB6.A00(C18461VsA.A00(vsA, str2), vsA.A00, vsA.A01, "lead_gen_gated_content_confirmation_bottom_sheet", "bottom_sheet_dismiss");
                return;
            case 2:
                C16238Ur1 ur1 = (C16238Ur1) this.A01;
                if (C16238Ur1.A00(ur1) == null) {
                    C16238Ur1.A02(ur1, this.A02);
                    return;
                }
                return;
            default:
                C54160H1e h1e = (C54160H1e) this.A01;
                String str3 = this.A02;
                String str4 = (String) AnonymousClass7TE.A14(h1e.A01);
                0qQ.A0B(str4, 1);
                0Aj A0e = AnonymousClass7TE.A0e(((C56516Hzn) h1e.A03.getValue()).A00, AnonymousClass000.A00(3286));
                if (A0e.isSampled()) {
                    A0e.A8k("event_type", 2);
                    A0e.AAJ("module", AnonymousClass000.A00(1175));
                    A0e.A8M(C279294yP.CLIPS_SPIN, "camera_destination");
                    A0e.AAJ("camera_session_id", str4);
                    A0e.A8k("exit_point", 15);
                    A0e.A8M(28D.A1a, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
                    A0e.A8k("camera_position", 3);
                    A0e.A9F(AnonymousClass000.A00(137), C51971G9r.A0m());
                    A0e.AAJ(AnonymousClass000.A00(77), "");
                    C51973G9u.A14(A0e, "search_session_id", "");
                    A0e.A9F("media_id", AnonymousClass7TE.A10(str3));
                    A0e.Cgf();
                    return;
                }
                return;
        }
    }

    public final void Cyf() {
    }

    public C19687Wdp(String str, Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = str;
    }
}
