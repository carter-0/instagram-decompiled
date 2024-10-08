package X;

import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import java.util.Iterator;

public final class I6F {
    public final C69458Nm2 A00;
    public final 0wc A01;
    public final C254743sy A02;
    public final String A03;
    public final String A04;

    public final void A04(String str) {
        0qQ.A0B(str, 0);
        0Aj A0e = AnonymousClass7TE.A0e(this.A01, "direct_custom_theme_next_click");
        if (A0e.isSampled()) {
            A03(A0e, this, str);
            A01(C54670HOb.AI_THEME_LOADING, A0e, this, "minor_entry_point");
            A02(A0e, this);
        }
    }

    public final void A05(String str) {
        0qQ.A0B(str, 0);
        0Aj A0e = AnonymousClass7TE.A0e(this.A01, C66579MXk.A00(793));
        if (A0e.isSampled()) {
            A0e.AAJ("set_theme_id", this.A04);
            A01(A00(this.A03), A0e, this, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            A0e.A8M(C69438Nli.AI_GENERATED_THEME, "theme_type");
            A0e.AAJ("target_theme_id", str);
            A0e.A8M(this.A00, "set_theme_type");
            A0e.Cgf();
        }
    }

    public static void A02(0Aj r2, I6F i6f) {
        r2.A8M(C69438Nli.AI_GENERATED_THEME, "theme_type");
        r2.A8M(i6f.A00, "set_theme_type");
        r2.Cgf();
    }

    public static void A03(0Aj r2, I6F i6f, String str) {
        r2.AAJ("target_theme_id", str);
        r2.AAJ("set_theme_id", i6f.A04);
        r2.A8M(A00(i6f.A03), ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
    }

    public I6F(0wc r4, C254743sy r5, String str, String str2, String str3) {
        Object obj;
        C69458Nm2 nm2;
        this.A01 = r4;
        this.A02 = r5;
        this.A04 = str2;
        this.A03 = str3;
        if (str.equals("DEFAULT")) {
            nm2 = C69458Nm2.COLOR_GRADIENT;
        } else {
            Iterator it = O46.A00.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (0qQ.A0K(((C69458Nm2) obj).name(), str)) {
                    break;
                }
            }
            nm2 = (C69458Nm2) obj;
        }
        this.A00 = nm2;
    }

    public static final C69478NmM A00(String str) {
        switch (str.hashCode()) {
            case -2019791911:
                if (str.equals("null_state")) {
                    return C69478NmM.NULL_STATE;
                }
                break;
            case -855114483:
                if (str.equals("thread_details")) {
                    return C69478NmM.THREAD_DETAILS;
                }
                break;
            case -326696768:
                if (str.equals("long_press")) {
                    return C69478NmM.LONG_PRESS;
                }
                break;
            case 1936452375:
                if (str.equals(C66579MXk.A00(648))) {
                    return C69478NmM.ADMIN_MESSAGE;
                }
                break;
        }
        return C69478NmM.UNDEFINED;
    }

    public static void A01(AnonymousClass0Ac r2, 0Aj r3, I6F i6f, String str) {
        r3.A8M(r2, str);
        C254743sy r22 = i6f.A02;
        r3.A7p("is_e2ee", Boolean.valueOf(C66647MaG.A0E(r22)));
        r3.AAJ(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, C66647MaG.A0A(r22));
        r3.AAJ("open_thread_id", C67003Mgb.A01(r22));
        r3.A9F(AnonymousClass000.A00(340), C67003Mgb.A00(r22));
    }
}
