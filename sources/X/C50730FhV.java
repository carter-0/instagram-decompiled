package X;

import android.content.Context;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.instagram.common.session.UserSession;

/* renamed from: X.FhV  reason: case insensitive filesystem */
public final class C50730FhV implements AnonymousClass5IX, CallerContextable {
    public static final String __redex_internal_original_name = "SupportResourcesCsomFilter";
    public final Context A00;
    public final UserSession A01;

    public final boolean E1z(AnonymousClass5IY r4) {
        if (!2Lv.A00(this.A01).A00(CallerContext.A00(C50730FhV.class), "ig_android_linking_cache_ig_to_fb_cross_communication") || !0oI.A0H(this.A00, "com.facebook.orca", 293)) {
            return false;
        }
        return true;
    }

    public C50730FhV(Context context, UserSession userSession) {
        this.A00 = context;
        this.A01 = userSession;
    }
}
