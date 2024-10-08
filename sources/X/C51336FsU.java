package X;

import com.facebook.common.callercontext.CallerContext;
import com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger;
import com.instagram.business.fragment.CategorySearchFragment;
import java.util.Map;

/* renamed from: X.FsU  reason: case insensitive filesystem */
public final class C51336FsU implements Runnable {
    public final /* synthetic */ CategorySearchFragment A00;
    public final /* synthetic */ Map A01;

    public C51336FsU(CategorySearchFragment categorySearchFragment, Map map) {
        this.A00 = categorySearchFragment;
        this.A01 = map;
    }

    public final void run() {
        CategorySearchFragment categorySearchFragment = this.A00;
        CallerContext callerContext = CategorySearchFragment.A0U;
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = categorySearchFragment.A05;
        if (businessFlowAnalyticsLogger != null) {
            String A0a = Dba.A0a(categorySearchFragment);
            String str = categorySearchFragment.A0C;
            if (str == null) {
                DbS.A16();
                throw AnonymousClass00P.createAndThrow();
            }
            businessFlowAnalyticsLogger.Ckg(new C22030Xtl(A0a, str, "save_info", (String) null, (String) null, (Map) null, this.A01, (Map) null));
        }
        DbX.A1J(categorySearchFragment);
    }
}
