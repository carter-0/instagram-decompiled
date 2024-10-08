package X;

import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.instagram.accountlinking.model.AccountFamily;
import com.instagram.common.session.UserSession;

/* renamed from: X.DgB  reason: case insensitive filesystem */
public final class C46508DgB implements CallerContextable {
    public static final CallerContext A00 = CallerContext.A00(C46508DgB.class);
    public static final String __redex_internal_original_name = "FxCalFlowGating";

    public static final boolean A00(0lg r5) {
        String A02;
        0qQ.A0B(r5, 0);
        if (!(r5 instanceof UserSession) || 2Lv.A00((UserSession) r5).A00(A00, "ig_android_linking_cache_fx_internal") || (A02 = 0Gl.A02(r5)) == null) {
            return false;
        }
        AnonymousClass9BG A01 = AnonymousClass9BG.A01(r5);
        if (!A01.A06(A02)) {
            return false;
        }
        AccountFamily accountFamily = (AccountFamily) A01.A02.get(A02);
        accountFamily.getClass();
        if (accountFamily.A04.size() > 1) {
            return true;
        }
        return false;
    }
}
