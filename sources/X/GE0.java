package X;

import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;

public final class GE0 extends C270664h6 implements JRJ, AnonymousClass32U, 0k8 {
    public C52278GLu A00;
    public Integer A01;
    public Integer A02;
    public Integer A03;
    public Integer A04;
    public final GIQ A05;
    public final UserSession A06;
    public final GD9 A07;

    public final void CmM(String str) {
        0qQ.A0B(str, 0);
        this.A05.A0E(str);
    }

    public final void D3r(H3D h3d) {
        String str;
        String A002;
        0qQ.A0B(h3d, 0);
        C268654dm r0 = h3d.A01;
        Throwable A012 = r0.A01();
        if (A012 == null || (str = A012.getMessage()) == null) {
            AnonymousClass1XT r02 = (AnonymousClass1XT) r0.A00();
            if (r02 == null || (str = r02.getErrorMessage()) == null) {
                str = "empty message";
            }
            if (A012 == null) {
                A002 = "empty trace";
                0KC.A0C("ClipsViewerPerfLogger", 002.A0u("onClipsItemsRequestFailed: ", str, " , ", A002));
                GIQ giq = this.A05;
                giq.A0J("error_message", str);
                giq.A0J(Pxd.A00(85), A002);
                giq.A0K("is_streaming", h3d.A06);
                giq.A0G("chunk_index", h3d.A00);
                giq.A0E("item_request_fail");
                A00(this, AnonymousClass05K.A0C, C58692Iw1.A00(h3d, this, 39));
            }
        }
        A002 = 2Og.A00(A012);
        0KC.A0C("ClipsViewerPerfLogger", 002.A0u("onClipsItemsRequestFailed: ", str, " , ", A002));
        GIQ giq2 = this.A05;
        giq2.A0J("error_message", str);
        giq2.A0J(Pxd.A00(85), A002);
        giq2.A0K("is_streaming", h3d.A06);
        giq2.A0G("chunk_index", h3d.A00);
        giq2.A0E("item_request_fail");
        A00(this, AnonymousClass05K.A0C, C58692Iw1.A00(h3d, this, 39));
    }

    public final void D3t(C52228GJt gJt) {
        0qQ.A0B(gJt, 0);
        A00(this, AnonymousClass05K.A01, C58692Iw1.A00(gJt, this, 40));
    }

    public final void D3u(C52263GLe gLe) {
        0qQ.A0B(gLe, 0);
        A00(this, AnonymousClass05K.A0C, C58692Iw1.A00(gLe, this, 41));
    }

    public final void DVz(int i) {
    }

    public final void DW0(int i) {
    }

    public final void DW8(int i, int i2) {
    }

    public final void DWA(int i, int i2) {
    }

    public final void DWY() {
    }

    public final void DhG(float f, float f2) {
    }

    public final void Dpv() {
    }

    public final void Dpy(C267324bN r1, int i) {
    }

    public final void Dyc(int i, String str) {
        0qQ.A0B(str, 1);
        if (i == 0 && this.A04 == AnonymousClass05K.A01) {
            this.A04 = AnonymousClass05K.A0C;
            GIQ giq = this.A05;
            giq.A0J("cancel_reason", str);
            giq.A0E("view_bound_error");
        }
    }

    private final boolean A01(int i) {
        if (!182.A06(0Tu.A05, this.A06, 36317444591195287L) || i == 0) {
            return true;
        }
        return false;
    }

    public final void DAz(int i) {
        this.A05.A0E("first_frame_rendered");
    }

    public final void DXk(int i, String str) {
        String str2;
        0KC.A0C("ClipsViewerPerfLogger", 002.A05(i, "onPlayerError: ", ", ", str));
        if (A01(i)) {
            if (str == null) {
                str2 = "Missing video player failure reason";
            } else {
                str2 = str;
            }
            GIQ giq = this.A05;
            giq.A0J(TraceFieldType.FailureReason, str2);
            giq.A0E(AnonymousClass000.A00(4195));
            A00(this, AnonymousClass05K.A0Y, new C58694Iw3(str, this, 38));
        }
    }

    public final void DhU(Integer num) {
        if (C52012GBj.A01(this.A07.A00) == 1) {
            GIQ giq = this.A05;
            giq.A0J("cancel_navigation", "swiped_away");
            giq.A08();
            Dc0 dc0 = giq.A03.A00;
            if (dc0.A01) {
                dc0.A08();
            }
            C52278GLu gLu = this.A00;
            if (gLu != null && gLu.A00) {
                02m r3 = gLu.A01;
                r3.markerAnnotate(749808675, "cancel_reason", AnonymousClass7TF.A0j("ON_SWIPE"));
                r3.markerEnd(749808675, 4);
                gLu.A00 = false;
            }
        }
    }

    public final void Dxj(C267324bN r5, int i) {
        if (this.A02 == AnonymousClass05K.A00) {
            this.A02 = AnonymousClass05K.A0C;
            GIQ giq = this.A05;
            giq.A0E("video_prepare_start");
            1Xj r2 = r5.A02;
            if (r2 != null && r2.CeS()) {
                giq.A0K("is_probably_cache", 1wS.A01(this.A06).A0G(r2.CEL().A0G));
            }
        }
    }

    public final void Dxk(int i, boolean z) {
        if (this.A02 == AnonymousClass05K.A0C) {
            this.A02 = AnonymousClass05K.A0N;
            GIQ giq = this.A05;
            giq.A0E("video_prepare_end");
            giq.A0K("is_auto_play_from_prepared", z);
        }
    }

    public final void Dxr(int i) {
        if (this.A03 == AnonymousClass05K.A00) {
            this.A03 = AnonymousClass05K.A01;
            this.A05.A0E("video_prepare_attempt");
        }
    }

    public final void Dxs(int i, boolean z) {
        if (this.A03 == AnonymousClass05K.A0C) {
            this.A03 = AnonymousClass05K.A0N;
            GIQ giq = this.A05;
            giq.A0E("video_prepare_call_end");
            giq.A0K("is_prepare_success", z);
        }
    }

    public final void Dxt(int i) {
        if (this.A03 == AnonymousClass05K.A01) {
            this.A03 = AnonymousClass05K.A0C;
            this.A05.A0E("video_prepare_call_start");
        }
    }

    public final void Dya(int i) {
        this.A05.A0E("switch_to_warmup");
    }

    public final void Dyb(int i) {
        if (i == 0 && this.A04 == AnonymousClass05K.A00) {
            this.A04 = AnonymousClass05K.A01;
        }
    }

    public final void Dyd(int i) {
        if (i == 0 && this.A04 == AnonymousClass05K.A01) {
            this.A04 = AnonymousClass05K.A0N;
            this.A05.A0E("view_bound_to_prepare_success");
        }
    }

    public GE0(UserSession userSession, C227342j3 r3, GD9 gd9) {
        this.A06 = userSession;
        this.A07 = gd9;
        this.A05 = new GIQ(userSession, r3);
        Integer num = AnonymousClass05K.A00;
        this.A01 = num;
        this.A03 = num;
        this.A02 = num;
        this.A04 = num;
    }

    public static final void A00(GE0 ge0, Integer num, C62320sa r4) {
        if (A02(ge0, num)) {
            ge0.A01 = num;
            ge0.A05.A0J("point", GEA.A01(num));
            r4.invoke();
        }
    }

    public static final boolean A02(GE0 ge0, Integer num) {
        int A002 = GEA.A00(num);
        Integer num2 = ge0.A01;
        int A003 = GEA.A00(num2);
        if (A002 > A003 && A003 + 1 != A002) {
            ge0.A05.A0J("invalid_next_state", 002.A0u("switching from ", GEA.A01(num2), " to ", GEA.A01(num)));
            0wb.A01.Ew0("ClipsViewerPerfLogger", 002.A02(GEA.A00(ge0.A01), A002, "switching from ", " to "));
        }
        if (A002 <= GEA.A00(ge0.A01)) {
            return false;
        }
        return true;
    }

    public final void DyP(int i) {
        if (A01(i)) {
            C52278GLu gLu = this.A00;
            if (gLu != null && gLu.A00) {
                02m r3 = gLu.A01;
                r3.markerAnnotate(749808675, "stop_reason", AnonymousClass7TF.A0j("ON_VIDEO_START"));
                r3.markerEnd(749808675, 2);
                gLu.A00 = false;
            }
            C58711IwK.A01(this, AnonymousClass05K.A0N, 21);
        }
    }

    public final void DyX(C376449Ia r4, int i) {
        if (A01(i)) {
            A00(this, AnonymousClass05K.A0Y, new GL8(i, 48, this, r4));
        }
    }

    public final void DyZ(int i) {
        Integer num;
        if (A01(i)) {
            C52278GLu gLu = this.A00;
            if (gLu != null && gLu.A00) {
                02m r3 = gLu.A01;
                r3.markerAnnotate(749808675, "stop_reason", AnonymousClass7TF.A0j("ON_VIDEO_STOP"));
                r3.markerEnd(749808675, 2);
                gLu.A00 = false;
            }
            GIQ giq = this.A05;
            C2366634p r0 = giq.A00;
            if (r0 != null) {
                num = r0.A00;
            } else {
                num = null;
            }
            if (num == AnonymousClass05K.A01) {
                giq.A0K("is_video_stopped", false);
            } else {
                C58711IwK.A01(this, AnonymousClass05K.A0Y, 22);
            }
        }
    }
}
