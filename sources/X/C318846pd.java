package X;

import com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import java.util.UUID;

/* renamed from: X.6pd  reason: invalid class name and case insensitive filesystem */
public final class C318846pd implements BusinessFlowAnalyticsLogger {
    public final 0wc A00;
    public final String A01;

    public final void ChP(C22030Xtl xtl) {
        0qQ.A0B(xtl, 0);
        0wc r2 = this.A00;
        0Aj A002 = r2.A00(r2.A00, "edit_profile_cancel");
        A002.AAJ("step", xtl.A04);
        A002.AAJ(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, xtl.A01);
        A002.AAJ("fb_user_id", (String) null);
        A002.AAJ("waterfall_id", this.A01);
        A002.Cgf();
    }

    public final void ChY(C22030Xtl xtl) {
        0qQ.A0B(xtl, 0);
        0wc r2 = this.A00;
        0Aj A002 = r2.A00(r2.A00, "edit_profile_change_option");
        A002.AAJ("step", xtl.A04);
        A002.AAJ(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, xtl.A01);
        A002.AAJ("component", xtl.A00);
        A002.AAJ("fb_user_id", (String) null);
        A002.AAJ("waterfall_id", this.A01);
        if (xtl.A0A() != null) {
            A002.A9H("default_values", xtl.A0A());
        }
        if (xtl.A0B() != null) {
            A002.A9H("selected_values", xtl.A0B());
        }
        A002.Cgf();
    }

    public final void Ci5(C22030Xtl xtl) {
        0qQ.A0B(xtl, 0);
        0wc r2 = this.A00;
        0Aj A002 = r2.A00(r2.A00, "edit_profile_fetch_data");
        String str = xtl.A00;
        if (str == null) {
            str = "";
        }
        A002.AAJ("component", str);
        String str2 = xtl.A01;
        if (str2 == null) {
            str2 = "";
        }
        A002.AAJ(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str2);
        A002.AAJ(AnonymousClass000.A00(53), "");
        A002.A9F("pk", -1L);
        A002.AAJ("step", xtl.A04);
        A002.AAJ("waterfall_id", this.A01);
        if (xtl.A0A() != null) {
            A002.A9H("default_values", xtl.A0A());
        }
        if (xtl.A0B() != null) {
            A002.A9H("selected_values", xtl.A0B());
        }
        if (xtl.A09() != null) {
            A002.A9H("available_options", xtl.A09());
        }
        A002.Cgf();
    }

    public final void Ci6(C22030Xtl xtl) {
        0qQ.A0B(xtl, 0);
        0wc r2 = this.A00;
        0Aj A002 = r2.A00(r2.A00, "edit_profile_fetch_data_error");
        String str = xtl.A00;
        if (str == null) {
            str = "";
        }
        A002.AAJ("component", str);
        String str2 = xtl.A01;
        if (str2 == null) {
            str2 = "";
        }
        A002.AAJ(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str2);
        A002.AAJ(AnonymousClass000.A00(53), "");
        A002.A9F("pk", -1L);
        A002.AAJ("step", xtl.A04);
        A002.AAJ("waterfall_id", this.A01);
        A002.AAJ("error_message", xtl.A03);
        if (xtl.A0B() != null) {
            A002.A9H("selected_values", xtl.A0B());
        }
        A002.Cgf();
    }

    public final void Ci7(C22030Xtl xtl) {
        0qQ.A0B(xtl, 0);
        0wc r2 = this.A00;
        0Aj A002 = r2.A00(r2.A00, "edit_profile_finish_step");
        String str = xtl.A01;
        if (str == null) {
            str = "";
        }
        A002.AAJ(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str);
        A002.AAJ("step", xtl.A04);
        A002.AAJ("waterfall_id", this.A01);
        A002.A9H("default_values", xtl.A0A());
        A002.A9H("selected_values", xtl.A0B());
        A002.Cgf();
    }

    public final void CkV(C22030Xtl xtl) {
    }

    public final void Cka(C22030Xtl xtl) {
        0qQ.A0B(xtl, 0);
        0wc r2 = this.A00;
        0Aj A002 = r2.A00(r2.A00, "edit_profile_start_step");
        A002.AAJ("step", xtl.A04);
        A002.AAJ(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, xtl.A01);
        A002.AAJ("fb_user_id", (String) null);
        A002.AAJ("waterfall_id", this.A01);
        if (xtl.A0A() != null) {
            A002.A9H("default_values", xtl.A0A());
        }
        if (xtl.A0B() != null) {
            A002.A9H("selected_values", xtl.A0B());
        }
        A002.Cgf();
    }

    public final void Ckg(C22030Xtl xtl) {
        0qQ.A0B(xtl, 0);
        0wc r2 = this.A00;
        0Aj A002 = r2.A00(r2.A00, "edit_profile_submit");
        A002.AAJ("step", xtl.A04);
        A002.AAJ(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, xtl.A01);
        A002.AAJ("component", xtl.A00);
        A002.AAJ("fb_user_id", (String) null);
        A002.AAJ("waterfall_id", this.A01);
        if (xtl.A0A() != null) {
            A002.A9H("default_values", xtl.A0A());
        }
        if (xtl.A0B() != null) {
            A002.A9H("selected_values", xtl.A0B());
        }
        A002.Cgf();
    }

    public final void Ckh(C22030Xtl xtl) {
        0qQ.A0B(xtl, 0);
        0wc r2 = this.A00;
        0Aj A002 = r2.A00(r2.A00, "edit_profile_submit_error");
        A002.AAJ("step", xtl.A04);
        A002.AAJ(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, xtl.A01);
        A002.AAJ("component", xtl.A00);
        A002.AAJ(C66579MXk.A00(13), xtl.A02);
        A002.AAJ("error_message", xtl.A03);
        A002.AAJ("fb_user_id", (String) null);
        A002.AAJ("waterfall_id", this.A01);
        if (xtl.A0A() != null) {
            A002.A9H("default_values", xtl.A0A());
        }
        if (xtl.A0B() != null) {
            A002.A9H("selected_values", xtl.A0B());
        }
        A002.Cgf();
    }

    public final void Ckp(C22030Xtl xtl) {
        0qQ.A0B(xtl, 0);
        0wc r2 = this.A00;
        0Aj A002 = r2.A00(r2.A00, "edit_profile_tap_component");
        A002.AAJ("step", xtl.A04);
        A002.AAJ(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, xtl.A01);
        A002.AAJ("component", xtl.A00);
        A002.AAJ("fb_user_id", (String) null);
        A002.AAJ("waterfall_id", this.A01);
        if (xtl.A0A() != null) {
            A002.A9H("default_values", xtl.A0A());
        }
        if (xtl.A0B() != null) {
            A002.A9H("selected_values", xtl.A0B());
        }
        A002.Cgf();
    }

    public final void ClC(C22030Xtl xtl) {
        0qQ.A0B(xtl, 0);
        0wc r2 = this.A00;
        0Aj A002 = r2.A00(r2.A00, "edit_profile_view_component");
        String str = xtl.A00;
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        A002.AAJ("component", str);
        String str3 = xtl.A01;
        if (str3 != null) {
            str2 = str3;
        }
        A002.AAJ(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str2);
        A002.AAJ("step", xtl.A04);
        A002.AAJ("waterfall_id", this.A01);
        if (xtl.A0B() != null) {
            A002.A9H("selected_values", xtl.A0B());
        }
        A002.Cgf();
    }

    public C318846pd(AnonymousClass0iw r2, 0lg r3, String str) {
        this.A00 = AnonymousClass0kN.A01(r2, r3);
        if (str == null) {
            str = UUID.randomUUID().toString();
            0qQ.A07(str);
        }
        this.A01 = str;
    }
}
