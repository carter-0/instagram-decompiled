package X;

/* renamed from: X.Lrm  reason: case insensitive filesystem */
public final class C65346Lrm implements G76 {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C65346Lrm(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj;
        this.A01 = obj2;
    }

    public final void onActionClicked() {
        switch (this.A00) {
            case 0:
                C335987ds r1 = (C335987ds) ((C61359K4b) this.A02).A09.getValue();
                26t r0 = r1.A01.A05.A02.A01;
                r0.A01();
                C335167cV r3 = r1.A00;
                Integer num = AnonymousClass05K.A0C;
                String str = r1.A05;
                0xa r12 = r0.A00;
                r3.A00(num, str, DbW.A06(r12, 002.A0R(AnonymousClass000.A00(682), "COMMENTS")), DbW.A06(r12, 002.A0R(AnonymousClass000.A00(681), "COMMENTS")));
                C51969G9p.A1M(this.A01);
                return;
            case 1:
                C63584KzX kzX = ((KFJ) this.A02).A00;
                if (kzX != null && 0qQ.A0K(((C64814LiZ) this.A01).A06, "onboard_banner_start_button_tag")) {
                    2YL A0H = DbS.A0H(kzX.A00.A09);
                    MHA.A03(A0H, C318116oQ.A00(A0H), 41);
                    return;
                }
                return;
            default:
                return;
        }
    }

    public final void onBannerDismissed() {
        switch (this.A00) {
            case 0:
                C335987ds r0 = (C335987ds) ((C61359K4b) this.A02).A09.getValue();
                C335167cV r3 = r0.A00;
                Integer num = AnonymousClass05K.A01;
                String str = r0.A05;
                0xa r1 = r0.A01.A05.A02.A01.A00;
                r3.A00(num, str, DbW.A06(r1, 002.A0R(AnonymousClass000.A00(682), "COMMENTS")), DbW.A06(r1, 002.A0R(AnonymousClass000.A00(681), "COMMENTS")));
                return;
            case 1:
                C63584KzX kzX = ((KFJ) this.A02).A00;
                if (kzX != null && 0qQ.A0K(((C64814LiZ) this.A01).A06, "non_recorded_gifters_disclaimer_dismiss_tag")) {
                    K8G k8g = kzX.A00;
                    C60311JjC jjC = (C60311JjC) k8g.A09.getValue();
                    String A012 = C320236s2.A01(k8g.requireArguments(), "arg_media_id");
                    0qQ.A0B(A012, 0);
                    Object value = jjC.A09.getValue();
                    if (C61137Jxn.A00(1, value)) {
                        AnonymousClass7TE.A1Z(new C66174MGl((Object) jjC, value, A012, (AnonymousClass4D7) null, 5), C318116oQ.A00(jjC));
                        return;
                    }
                    0wb.A03(AnonymousClass000.A00(419), AnonymousClass000.A00(490));
                    return;
                }
                return;
            default:
                return;
        }
    }
}
