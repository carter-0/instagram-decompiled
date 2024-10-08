package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.8id  reason: invalid class name and case insensitive filesystem */
public final class C362878id implements C3502283u {
    public boolean A00;
    public Integer A01 = AnonymousClass05K.A01;
    public final UserSession A02;

    public C362878id(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A02 = userSession;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0112, code lost:
        if (r8 == 1.0f) goto L_0x0114;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0027  */
    /* JADX WARNING: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DHa(float r8, float r9) {
        /*
            r7 = this;
            java.lang.Integer r0 = r7.A01
            int r4 = r0.intValue()
            r3 = 0
            r1 = 1065353216(0x3f800000, float:1.0)
            r2 = 0
            r0 = 1
            if (r4 == r0) goto L_0x0104
            if (r4 == r2) goto L_0x0035
            r0 = 3
            if (r4 == r0) goto L_0x002a
            r0 = 2
            if (r4 != r0) goto L_0x01a6
            int r0 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x0110
            java.lang.Integer r0 = X.AnonymousClass05K.A01
        L_0x001b:
            r7.A01 = r0
        L_0x001d:
            java.lang.Integer r1 = r7.A01
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r1 == r0) goto L_0x0027
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r1 != r0) goto L_0x0029
        L_0x0027:
            r7.A00 = r2
        L_0x0029:
            return
        L_0x002a:
            int r0 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x0040
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x001d
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            goto L_0x001b
        L_0x0035:
            int r0 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x0040
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x001d
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            goto L_0x001b
        L_0x0040:
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            r7.A01 = r0
            com.instagram.common.session.UserSession r0 = r7.A02
            X.27r r1 = X.27p.A01(r0)
            r1.A0X()
            boolean r0 = r7.A00
            if (r0 == 0) goto L_0x001d
            X.29Q r4 = r1.A07
            X.0wc r3 = r4.A01
            java.lang.String r1 = "ig_camera_end_session"
            X.0kJ r0 = r3.A00
            X.0Aj r3 = r3.A00(r0, r1)
            boolean r0 = r3.isSampled()
            if (r0 == 0) goto L_0x001d
            java.lang.String r1 = "GALLERY"
            java.lang.String r0 = "entity"
            r3.AAJ(r0, r1)
            java.lang.String r1 = "IG_CAMERA_GALLERY_EXIT_WITH_SWIPE"
            java.lang.String r0 = "legacy_falco_event_name"
            r3.AAJ(r0, r1)
            X.283 r5 = r4.A04
            java.lang.String r1 = r5.A0L
            if (r1 != 0) goto L_0x0079
            java.lang.String r1 = ""
        L_0x0079:
            java.lang.String r0 = "camera_session_id"
            r3.AAJ(r0, r1)
            java.lang.String r1 = "SWIPE"
            java.lang.String r0 = "gallery_exit_point"
            r3.AAJ(r0, r1)
            int r1 = r5.A01
            r0 = 2
            if (r1 == r0) goto L_0x008b
            r0 = 1
        L_0x008b:
            java.lang.String r1 = "camera_position"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.A8k(r1, r0)
            X.28D r1 = r5.A09
            java.lang.String r0 = "entry_point"
            r3.A8M(r1, r0)
            r0 = 2
            java.lang.String r1 = "event_type"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.A8k(r1, r0)
            X.28t r1 = r5.A0A
            java.lang.String r0 = "media_type"
            r3.A8M(r1, r0)
            X.0iw r0 = X.27x.A08
            java.lang.String r1 = r0.getModuleName()
            java.lang.String r0 = "module"
            r3.AAJ(r0, r1)
            X.JVj r1 = X.C59725JVj.PRE_CAPTURE
            java.lang.String r0 = "surface"
            r3.A8M(r1, r0)
            X.4yP r1 = r4.A0J()
            java.lang.String r0 = "camera_destination"
            r3.A8M(r1, r0)
            r0 = 0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "capture_format_index"
            r3.A9F(r0, r1)
            X.8fP r1 = r4.A0I()
            java.lang.String r0 = "capture_type"
            r3.A8M(r1, r0)
            X.1QJ r0 = X.AnonymousClass1QI.A00
            X.1QM r0 = r0.A02
            java.lang.String r1 = r0.A00
            java.lang.String r0 = "nav_chain"
            r3.AAJ(r0, r1)
            java.lang.String r1 = X.C254473sX.A00
            java.lang.String r0 = "device_aspect_ratio_category"
            r3.AAJ(r0, r1)
            java.lang.String r1 = X.C254483sY.A00
            java.lang.String r0 = "device_fold_orientation"
            r3.AAJ(r0, r1)
            java.lang.String r1 = X.C254493sZ.A00
            java.lang.String r0 = "device_fold_state"
            r3.AAJ(r0, r1)
            java.lang.Boolean r1 = X.C254503sa.A00
            java.lang.String r0 = "device_is_in_multi_window_mode"
            r3.A7p(r0, r1)
            goto L_0x0198
        L_0x0104:
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0114
            int r0 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x001d
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            goto L_0x001b
        L_0x0110:
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x001d
        L_0x0114:
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            r7.A01 = r0
            com.instagram.common.session.UserSession r0 = r7.A02
            X.27r r6 = X.27p.A01(r0)
            X.29f r0 = r6.A0A
            r0.A0R()
            boolean r0 = r7.A00
            if (r0 == 0) goto L_0x001d
            X.0wc r3 = r6.A01
            java.lang.String r1 = "ig_camera_gallery_enter_swipe"
            X.0kJ r0 = r3.A00
            X.0Aj r3 = r3.A00(r0, r1)
            boolean r0 = r3.isSampled()
            if (r0 == 0) goto L_0x001d
            X.283 r4 = r6.A04
            java.lang.String r5 = r4.A0L
            if (r5 == 0) goto L_0x019d
            X.4yP r1 = r6.A0J()
            java.lang.String r0 = "camera_destination"
            r3.A8M(r1, r0)
            int r1 = r4.A01
            r0 = 2
            if (r1 == r0) goto L_0x014c
            r0 = 1
        L_0x014c:
            java.lang.String r1 = "camera_position"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.A8k(r1, r0)
            java.lang.String r0 = "camera_session_id"
            r3.AAJ(r0, r5)
            X.8fP r1 = r6.A0I()
            java.lang.String r0 = "capture_type"
            r3.A8M(r1, r0)
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
            X.JVj r1 = X.C59725JVj.PRE_CAPTURE
            java.lang.String r0 = "surface"
            r3.A8M(r1, r0)
            X.1QJ r0 = X.AnonymousClass1QI.A00
            X.1QM r0 = r0.A02
            java.lang.String r1 = r0.A00
            java.lang.String r0 = "nav_chain"
            r3.AAJ(r0, r1)
        L_0x0198:
            r3.Cgf()
            goto L_0x001d
        L_0x019d:
            java.lang.String r1 = "IgCameraLoggerImpl"
            java.lang.String r0 = "logGalleryEnterSwipe() cameraSession is null"
            X.0kD.A01(r1, r0)
            goto L_0x001d
        L_0x01a6:
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C362878id.DHa(float, float):void");
    }
}
