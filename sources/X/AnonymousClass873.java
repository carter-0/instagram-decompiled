package X;

/* renamed from: X.873  reason: invalid class name */
public final class AnonymousClass873 implements AnonymousClass874 {
    public final /* synthetic */ C3509386y A00;

    public final void D8f(int i) {
    }

    public AnonymousClass873(C3509386y r1) {
        this.A00 = r1;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x005e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DBi(X.AnonymousClass87G r8, java.lang.String r9, int r10, boolean r11) {
        /*
            r7 = this;
            if (r8 != 0) goto L_0x000a
            java.lang.String r1 = "CanvasDialController::onElementSelected"
            java.lang.String r0 = "DialElement is null"
            X.0kD.A01(r1, r0)
            return
        L_0x000a:
            X.86y r2 = r7.A00
            com.instagram.common.session.UserSession r0 = r2.A0C
            X.27r r1 = X.27p.A01(r0)
            java.lang.String r3 = r8.getId()
            int r0 = r3.hashCode()
            switch(r0) {
                case -1624538343: goto L_0x00c1;
                case -511215295: goto L_0x00cd;
                case -156146159: goto L_0x00d0;
                case 2187567: goto L_0x00dc;
                case 2461631: goto L_0x00e8;
                case 2497109: goto L_0x00f4;
                case 2590522: goto L_0x0100;
                case 63893315: goto L_0x010c;
                case 145572191: goto L_0x0118;
                case 178556873: goto L_0x0124;
                case 473355033: goto L_0x0130;
                case 1004359981: goto L_0x013c;
                case 1319470625: goto L_0x0148;
                default: goto L_0x001d;
            }
        L_0x001d:
            java.lang.String r3 = "CanvasDialController::toUSLEnum"
            java.lang.String r0 = "The selected dial does not map to a Create mode dial"
            X.0kD.A01(r3, r0)
            X.9tL r5 = X.C391599tL.A0D
        L_0x0026:
            X.29Z r6 = r1.A0F
            X.0wc r3 = r6.A01
            java.lang.String r1 = "ig_camera_ui_tool_click"
            X.0kJ r0 = r3.A00
            X.0Aj r3 = r3.A00(r0, r1)
            boolean r0 = r6.A0P()
            if (r0 == 0) goto L_0x00b2
            boolean r0 = r3.isSampled()
            if (r0 == 0) goto L_0x00b2
            X.80P r1 = X.AnonymousClass80P.CREATE_MODE_FORMAT
            java.lang.String r0 = "tool_type"
            r3.A8M(r1, r0)
            java.lang.String r1 = "IG_CAMERA_CREATE_MODE_FORMAT_SELECTED"
            java.lang.String r0 = "legacy_falco_event_name"
            r3.AAJ(r0, r1)
            X.283 r4 = r6.A04
            java.lang.String r1 = r4.A0L
            if (r1 != 0) goto L_0x0054
            java.lang.String r1 = ""
        L_0x0054:
            java.lang.String r0 = "camera_session_id"
            r3.AAJ(r0, r1)
            int r1 = r4.A01
            r0 = 2
            if (r1 == r0) goto L_0x005f
            r0 = 1
        L_0x005f:
            java.lang.String r1 = "camera_position"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.A8k(r1, r0)
            X.8fP r1 = r6.A0I()
            java.lang.String r0 = "capture_type"
            r3.A8M(r1, r0)
            r0 = 4664(0x1238, float:6.536E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r3.A8M(r5, r0)
            X.28D r1 = r4.A09
            java.lang.String r0 = "entry_point"
            r3.A8M(r1, r0)
            r0 = 2
            java.lang.String r1 = "event_type"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.A8k(r1, r0)
            X.28t r1 = r4.A0A
            java.lang.String r0 = "media_type"
            r3.A8M(r1, r0)
            X.0iw r0 = X.27x.A08
            java.lang.String r1 = r0.getModuleName()
            java.lang.String r0 = "module"
            r3.AAJ(r0, r1)
            X.JVj r1 = X.C59725JVj.CREATE
            java.lang.String r0 = "surface"
            r3.A8M(r1, r0)
            X.1QJ r0 = X.AnonymousClass1QI.A00
            X.1QM r0 = r0.A02
            java.lang.String r1 = r0.A00
            java.lang.String r0 = "nav_chain"
            r3.AAJ(r0, r1)
            r3.Cgf()
        L_0x00b2:
            X.86k r0 = r2.A0J
            X.86n r1 = r0.A00()
            r0 = 1
            r1.EKh(r10, r0)
            r0 = 0
            r2.A07(r8, r0)
            return
        L_0x00c1:
            java.lang.String r0 = "QUESTION_RESPONSES"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x001d
            X.9tL r5 = X.C391599tL.QUESTION_RESPONSES
            goto L_0x0026
        L_0x00cd:
            java.lang.String r0 = "BIRTHDAY_HIGHLIGHTS"
            goto L_0x014a
        L_0x00d0:
            java.lang.String r0 = "COUNTDOWN"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x001d
            X.9tL r5 = X.C391599tL.COUNTDOWN
            goto L_0x0026
        L_0x00dc:
            java.lang.String r0 = "GIFS"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x001d
            X.9tL r5 = X.C391599tL.GIFS
            goto L_0x0026
        L_0x00e8:
            java.lang.String r0 = "POLL"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x001d
            X.9tL r5 = X.C391599tL.POLL
            goto L_0x0026
        L_0x00f4:
            java.lang.String r0 = "QUIZ"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x001d
            X.9tL r5 = X.C391599tL.QUIZ
            goto L_0x0026
        L_0x0100:
            java.lang.String r0 = "TYPE"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x001d
            X.9tL r5 = X.C391599tL.A0D
            goto L_0x0026
        L_0x010c:
            java.lang.String r0 = "CARDS"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x001d
            X.9tL r5 = X.C391599tL.CARDS
            goto L_0x0026
        L_0x0118:
            java.lang.String r0 = "MEMORIES"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x001d
            X.9tL r5 = X.C391599tL.MEMORIES
            goto L_0x0026
        L_0x0124:
            java.lang.String r0 = "MENTIONS"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x001d
            X.9tL r5 = X.C391599tL.MENTIONS
            goto L_0x0026
        L_0x0130:
            java.lang.String r0 = "TEMPLATES"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x001d
            X.9tL r5 = X.C391599tL.TEMPLATES
            goto L_0x0026
        L_0x013c:
            java.lang.String r0 = "QUESTIONS"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x001d
            X.9tL r5 = X.C391599tL.QUESTIONS
            goto L_0x0026
        L_0x0148:
            java.lang.String r0 = "END_OF_YEAR"
        L_0x014a:
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x001d
            X.9tL r5 = X.C391599tL.END_OF_YEAR
            goto L_0x0026
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass873.DBi(X.87G, java.lang.String, int, boolean):void");
    }

    public final void DBk(AnonymousClass87G r3, int i, boolean z) {
        C3509386y r1 = this.A00;
        if (r3 != null && !C3509386y.A01(r3)) {
            r1.A02(r3).A0E(false);
        }
    }

    public final void DMG(AnonymousClass87G r3, int i) {
        AnonymousClass8S4 r1 = this.A00.A01;
        r1.A02.A09(r3);
        AnonymousClass85X r0 = r1.A04;
        r0.A03 = r3;
        AnonymousClass85X.A06(r0);
    }
}
