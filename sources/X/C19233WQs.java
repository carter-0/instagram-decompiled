package X;

/* renamed from: X.WQs  reason: case insensitive filesystem */
public final class C19233WQs implements AnonymousClass1FD {
    public static final C19233WQs A00 = new C19233WQs();

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(X.16F r6) {
        /*
            r5 = this;
            r0 = 0
            X.0qQ.A0B(r6, r0)
            X.Uwh r0 = X.C16537Uwh.USER_ADDED
            X.ULH r3 = new X.ULH
            r3.<init>(r0)
            X.16L r1 = r6.A11()
            X.16L r0 = X.16L.A0D
            if (r1 == r0) goto L_0x001b
            java.lang.String r1 = "JSON string for MediaDrawableConfig should start with a left brace"
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r1)
            throw r0
        L_0x001b:
            X.16L r1 = r6.A1J()
            X.16L r0 = X.16L.A09
            if (r1 == r0) goto L_0x0202
            java.lang.String r1 = X.AnonymousClass7TE.A17(r6)
            if (r1 == 0) goto L_0x01fd
            int r0 = r1.hashCode()
            switch(r0) {
                case -1789286243: goto L_0x01ec;
                case -1679374179: goto L_0x01db;
                case -1672693885: goto L_0x01ca;
                case -1659133332: goto L_0x01ba;
                case -1425766239: goto L_0x01aa;
                case -1416025802: goto L_0x019a;
                case -1401301712: goto L_0x018a;
                case -1150972356: goto L_0x017a;
                case -1091421752: goto L_0x016a;
                case -989224187: goto L_0x0156;
                case -896505829: goto L_0x0132;
                case -685774702: goto L_0x0122;
                case -391459676: goto L_0x0112;
                case -321790287: goto L_0x0101;
                case -257921825: goto L_0x00f0;
                case -103498427: goto L_0x00e0;
                case 114586: goto L_0x00d0;
                case 305772914: goto L_0x00a6;
                case 739096984: goto L_0x0097;
                case 977697542: goto L_0x0088;
                case 979117578: goto L_0x0079;
                case 1168745701: goto L_0x006a;
                case 1575154455: goto L_0x005b;
                case 1959204290: goto L_0x004c;
                case 1997274450: goto L_0x003d;
                default: goto L_0x0030;
            }
        L_0x0030:
            java.lang.String r1 = X.C13988Tno.A0g(r1)
            java.lang.String r0 = "MediaDrawableConfigJsonHelper"
            X.0KC.A0C(r0, r1)
        L_0x0039:
            r6.A0z()
            goto L_0x001b
        L_0x003d:
            java.lang.String r0 = "enable_horizontal_translation"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0030
            boolean r0 = r6.A0d()
            r3.A0F = r0
            goto L_0x0039
        L_0x004c:
            java.lang.String r0 = "fully_visible_on_alignment_guide"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0030
            boolean r0 = r6.A0d()
            r3.A0K = r0
            goto L_0x0039
        L_0x005b:
            java.lang.String r0 = "touch_enabled_by_default"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0030
            boolean r0 = r6.A0d()
            r3.A0N = r0
            goto L_0x0039
        L_0x006a:
            java.lang.String r0 = "enable_bouncy_press_down"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0030
            boolean r0 = r6.A0d()
            r3.A0D = r0
            goto L_0x0039
        L_0x0079:
            java.lang.String r0 = "fully_visible_on_screen"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0030
            boolean r0 = r6.A0d()
            r3.A0L = r0
            goto L_0x0039
        L_0x0088:
            java.lang.String r0 = "enable_bulk_remove_drawables_by_tag"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0030
            boolean r0 = r6.A0d()
            r3.A0E = r0
            goto L_0x0039
        L_0x0097:
            java.lang.String r0 = "enable_scale_gesture"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0030
            boolean r0 = r6.A0d()
            r3.A0H = r0
            goto L_0x0039
        L_0x00a6:
            java.lang.String r0 = "starting_offset"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0030
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            X.16L r1 = r6.A11()
            X.16L r0 = X.16L.A0C
            if (r1 != r0) goto L_0x00cc
        L_0x00bb:
            X.16L r1 = r6.A1J()
            X.16L r0 = X.16L.A08
            if (r1 == r0) goto L_0x00cc
            double r1 = r6.A0U()
            float r0 = (float) r1
            X.JTP.A1V(r4, r0)
            goto L_0x00bb
        L_0x00cc:
            r3.A0A = r4
            goto L_0x0039
        L_0x00d0:
            java.lang.String r0 = "tag"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0030
            java.lang.String r0 = X.C13989Tnp.A0o(r6)
            r3.A09 = r0
            goto L_0x0039
        L_0x00e0:
            java.lang.String r0 = "removable_by_trash_can"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0030
            boolean r0 = r6.A0d()
            r3.A0M = r0
            goto L_0x0039
        L_0x00f0:
            java.lang.String r0 = "max_scale_factor"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0030
            double r1 = r6.A0U()
            float r0 = (float) r1
            r3.A00 = r0
            goto L_0x0039
        L_0x0101:
            java.lang.String r0 = "min_scale_factor"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0030
            double r1 = r6.A0U()
            float r0 = (float) r1
            r3.A01 = r0
            goto L_0x0039
        L_0x0112:
            java.lang.String r0 = "enable_vertical_translation"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0030
            boolean r0 = r6.A0d()
            r3.A0I = r0
            goto L_0x0039
        L_0x0122:
            java.lang.String r0 = "starting_layer"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0030
            int r0 = r6.A1D()
            r3.A05 = r0
            goto L_0x0039
        L_0x0132:
            java.lang.String r0 = "source"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0030
            X.16L r1 = r6.A11()
            X.16L r0 = X.16L.A0G
            if (r1 == r0) goto L_0x0039
            java.lang.String r1 = r6.A1P()
            if (r1 == 0) goto L_0x0039
            java.util.Map r0 = X.C16537Uwh.A01
            java.lang.Object r0 = r0.get(r1)
            X.Uwh r0 = (X.C16537Uwh) r0
            if (r0 == 0) goto L_0x0039
            r3.A07 = r0
            goto L_0x0039
        L_0x0156:
            java.lang.String r0 = "bounds_spec"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0030
            X.WQr r0 = X.C19232WQr.A00
            java.lang.Object r0 = X.16P.A01(r6, r0)
            X.UKk r0 = (X.C15031UKk) r0
            r3.A06 = r0
            goto L_0x0039
        L_0x016a:
            java.lang.String r0 = "fade_in"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0030
            boolean r0 = r6.A0d()
            r3.A0J = r0
            goto L_0x0039
        L_0x017a:
            java.lang.String r0 = "bounce_in"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0030
            boolean r0 = r6.A0d()
            r3.A0B = r0
            goto L_0x0039
        L_0x018a:
            java.lang.String r0 = "unlink_drawable_when_removed"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0030
            boolean r0 = r6.A0d()
            r3.A0O = r0
            goto L_0x0039
        L_0x019a:
            java.lang.String r0 = "content_description"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0030
            java.lang.String r0 = X.C13989Tnp.A0o(r6)
            r3.A08 = r0
            goto L_0x0039
        L_0x01aa:
            java.lang.String r0 = "enable_rotate_gesture"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0030
            boolean r0 = r6.A0d()
            r3.A0G = r0
            goto L_0x0039
        L_0x01ba:
            java.lang.String r0 = "contour_path_enabled"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0030
            boolean r0 = r6.A0d()
            r3.A0C = r0
            goto L_0x0039
        L_0x01ca:
            java.lang.String r0 = "starting_scale_factor"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0030
            double r1 = r6.A0U()
            float r0 = (float) r1
            r3.A04 = r0
            goto L_0x0039
        L_0x01db:
            java.lang.String r0 = "starting_normalized_width"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0030
            double r1 = r6.A0U()
            float r0 = (float) r1
            r3.A02 = r0
            goto L_0x0039
        L_0x01ec:
            java.lang.String r0 = "starting_rotation"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0030
            double r1 = r6.A0U()
            float r0 = (float) r1
            r3.A03 = r0
            goto L_0x0039
        L_0x01fd:
            java.io.IOException r0 = X.C13988Tno.A0P()
            throw r0
        L_0x0202:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19233WQs.invoke(X.16F):java.lang.Object");
    }
}
