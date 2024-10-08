package X;

import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: X.85o  reason: invalid class name and case insensitive filesystem */
public final class C3506485o {
    public boolean A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public final Set A0C = new LinkedHashSet();
    public final UserSession A0D;

    public C3506485o(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A0D = userSession;
    }

    public final void A03(boolean z) {
        this.A09 = false;
        this.A0A = false;
        if (!z || this.A0B) {
            this.A00 = false;
        }
        this.A0B = false;
        A00(this, false);
        this.A07 = false;
        if (this.A03) {
            this.A03 = false;
            A00(this, false);
        }
        if (this.A02) {
            this.A02 = false;
            A00(this, false);
        }
        this.A08 = false;
        this.A01 = false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0016, code lost:
        if (r2.A00 == false) goto L_0x0018;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0035, code lost:
        if (r1 == false) goto L_0x0018;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0044, code lost:
        if (r2.A00 != false) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0048, code lost:
        return X.AnonymousClass05K.A0C;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Integer A01() {
        /*
            r2 = this;
            boolean r0 = r2.A02
            if (r0 != 0) goto L_0x004c
            boolean r0 = r2.A09
            if (r0 != 0) goto L_0x001b
            boolean r0 = r2.A03
            if (r0 != 0) goto L_0x0049
            boolean r0 = r2.A07
            if (r0 != 0) goto L_0x0049
            boolean r0 = r2.A04
            if (r0 == 0) goto L_0x004c
            boolean r0 = r2.A00
            if (r0 != 0) goto L_0x0046
        L_0x0018:
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            return r0
        L_0x001b:
            boolean r1 = r2.A07
            if (r1 == 0) goto L_0x0026
            boolean r0 = r2.A01
            if (r0 == 0) goto L_0x0026
        L_0x0023:
            java.lang.Integer r0 = X.AnonymousClass05K.A0Y
            return r0
        L_0x0026:
            boolean r0 = r2.A03
            if (r0 == 0) goto L_0x0038
            boolean r0 = r2.A08
            if (r0 == 0) goto L_0x0031
            if (r1 != 0) goto L_0x0031
            goto L_0x0023
        L_0x0031:
            boolean r0 = r2.A06
            if (r0 == 0) goto L_0x0049
            if (r1 != 0) goto L_0x0049
            goto L_0x0018
        L_0x0038:
            if (r1 != 0) goto L_0x0049
            boolean r0 = r2.A0A
            if (r0 != 0) goto L_0x004c
            boolean r0 = r2.A0B
            if (r0 != 0) goto L_0x004c
            boolean r0 = r2.A00
            if (r0 == 0) goto L_0x0018
        L_0x0046:
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            return r0
        L_0x0049:
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            return r0
        L_0x004c:
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3506485o.A01():java.lang.Integer");
    }

    public final void A02() {
        this.A00 = !this.A00;
        27r A012 = 27p.A01(this.A0D);
        boolean z = this.A00;
        29Z r7 = A012.A0F;
        0wc r2 = r7.A01;
        0Aj A002 = r2.A00(r2.A00, "ig_camera_ui_tool_click");
        if (A002.isSampled()) {
            A002.A8M(AnonymousClass80P.MUTE, "tool_type");
            A002.AAJ("legacy_falco_event_name", "IG_CAMERA_TAP_MUTE_BUTTON");
            AnonymousClass283 r4 = r7.A04;
            String str = r4.A0L;
            if (str == null) {
                str = "";
            }
            A002.AAJ("camera_session_id", str);
            A002.A8k("camera_position", 2);
            A002.A9F("capture_format_index", 0L);
            A002.A8M(r7.A0I(), "capture_type");
            A002.A8M(r4.A09, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            A002.A8k("event_type", 2);
            A002.A8M(r4.A0A, "media_type");
            A002.AAJ("module", 27x.A08.getModuleName());
            A002.A7p("mute_state", Boolean.valueOf(z));
            A002.A8M(r4.A0C, "surface");
            A002.AAJ("nav_chain", AnonymousClass1QI.A00.A02.A00);
            A002.Cgf();
        }
        A00(this, true);
    }

    public static final void A00(C3506485o r3, boolean z) {
        Integer A012 = r3.A01();
        for (C3510587k Cwo : r3.A0C) {
            Cwo.Cwo(A012, z);
        }
    }
}
