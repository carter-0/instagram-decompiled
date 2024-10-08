package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.business.activity.BusinessConversionActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.Fsb  reason: case insensitive filesystem */
public final class C51343Fsb implements Runnable {
    public final /* synthetic */ EDZ A00;
    public final /* synthetic */ UserSession A01;

    public C51343Fsb(EDZ edz, UserSession userSession) {
        this.A00 = edz;
        this.A01 = userSession;
    }

    public final void run() {
        UserSession userSession = this.A01;
        EDZ edz = this.A00;
        AnonymousClass4DH r4 = edz.A07;
        EXD exd = edz.A0A;
        String str = edz.A0B;
        CallerContext callerContext = FRR.A00;
        synchronized (C49917FEr.A00()) {
        }
        FragmentActivity requireActivity = r4.requireActivity();
        if (requireActivity instanceof G8D) {
            BusinessConversionActivity businessConversionActivity = (BusinessConversionActivity) ((G8D) requireActivity);
            businessConversionActivity.Clz((Bundle) null);
            if (AnonymousClass7TF.A1Z(businessConversionActivity.A0A)) {
                AnonymousClass4DH r5 = r4;
                C50144FRb.A04(r4, r5, exd, (Integer) null, AnonymousClass05K.A01, userSession.A06);
                return;
            }
        }
        C46413Dea.A05(requireActivity, 0cp.A03(002.A0R("instagram://professional_signup_nux?entry_point=", str)), r4, userSession);
    }
}
