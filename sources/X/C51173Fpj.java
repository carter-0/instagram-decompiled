package X;

import android.os.Bundle;
import com.facebook.common.callercontext.CallerContext;
import com.google.common.collect.ImmutableList;
import com.instagram.business.activity.BusinessConversionActivity;
import com.instagram.business.fragment.CategorySearchFragment;
import com.instagram.common.session.UserSession;

/* renamed from: X.Fpj  reason: case insensitive filesystem */
public final class C51173Fpj implements Runnable {
    public final /* synthetic */ CategorySearchFragment A00;

    public C51173Fpj(CategorySearchFragment categorySearchFragment) {
        this.A00 = categorySearchFragment;
    }

    public final void run() {
        ImmutableList A02;
        CategorySearchFragment categorySearchFragment = this.A00;
        CallerContext callerContext = CategorySearchFragment.A0U;
        G8D g8d = categorySearchFragment.A06;
        UserSession userSession = categorySearchFragment.A0A;
        if (!(userSession == null || g8d == null)) {
            if (AnonymousClass7TF.A1W(g8d.B6a(), C319586qr.CONVERSION_FLOW)) {
                BusinessConversionActivity businessConversionActivity = (BusinessConversionActivity) g8d;
                A02 = FBv.A01(((FRU) businessConversionActivity.A09.getValue()).A01, userSession, businessConversionActivity.A04, 2Lv.A00(userSession).A00(CategorySearchFragment.A0U, "ig_professional_conversion_flow"), businessConversionActivity.A07);
            } else if (FG1.A03(g8d)) {
                UserSession userSession2 = userSession;
                BusinessConversionActivity businessConversionActivity2 = (BusinessConversionActivity) g8d;
                A02 = FBv.A02(userSession2, businessConversionActivity2.A04, 2Lv.A00(userSession2).A00(CategorySearchFragment.A0U, "ig_professional_conversion_flow"), businessConversionActivity2.A07);
            } else {
                ((BusinessConversionActivity) g8d).Clz((Bundle) null);
            }
            BusinessConversionActivity businessConversionActivity3 = (BusinessConversionActivity) g8d;
            BusinessConversionActivity.A01((Bundle) null, businessConversionActivity3);
            BusinessConversionActivity.A02(businessConversionActivity3);
            C49883FBi fBi = businessConversionActivity3.A01;
            if (fBi == null) {
                0qQ.A0F("conversionLogic");
                throw AnonymousClass00P.createAndThrow();
            } else {
                fBi.A03(A02);
                BusinessConversionActivity.A03(businessConversionActivity3, true);
            }
        }
        CategorySearchFragment.A04(categorySearchFragment);
    }
}
