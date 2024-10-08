package X;

import android.app.Activity;
import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import kotlin.Deprecated;

/* renamed from: X.2fh  reason: invalid class name and case insensitive filesystem */
public abstract class C226132fh {
    public static TargetViewSizeProvider A00;
    public static AnonymousClass81W A01;

    @Deprecated(message = "")
    public static final TargetViewSizeProvider A00(Context context, UserSession userSession) {
        0qQ.A0B(context, 0);
        0qQ.A0B(userSession, 1);
        if (A00 == null) {
            synchronized (TargetViewSizeProvider.class) {
                if (A00 == null) {
                    Context applicationContext = context.getApplicationContext();
                    0qQ.A07(applicationContext);
                    A00 = new NineSixteenLayoutConfigImpl(applicationContext, 182.A06(0Tu.A05, userSession, 36325025208349236L));
                }
            }
        }
        TargetViewSizeProvider targetViewSizeProvider = A00;
        if (targetViewSizeProvider != null) {
            return targetViewSizeProvider;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Deprecated(message = "")
    public static final AnonymousClass81W A01(Context context) {
        if (A01 == null) {
            synchronized (AnonymousClass81W.class) {
                if (A01 == null) {
                    Context applicationContext = context.getApplicationContext();
                    0qQ.A07(applicationContext);
                    A01 = new AnonymousClass81V(AnonymousClass0nB.A01(applicationContext), AnonymousClass0nB.A00(applicationContext));
                }
            }
        }
        AnonymousClass81W r0 = A01;
        if (r0 != null) {
            return r0;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public static final void A02() {
        synchronized (TargetViewSizeProvider.class) {
            A00 = null;
        }
    }

    public static final void A03(Activity activity, UserSession userSession, C66445MRz mRz) {
        C226122ff r1 = C226112fe.A0B;
        if (C226122ff.A03()) {
            mRz.Dqr(A00(activity, userSession));
        } else {
            r1.A05(activity, new C66016M8b(activity, userSession, mRz));
        }
    }
}
