package X;

import android.content.Context;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.FilterChain;
import com.facebook.onecamera.configurations.AppSpecific;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.filterkit.filtergroup.model.impl.FilterGroupModelImpl;
import com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.8KR  reason: invalid class name */
public final class AnonymousClass8KR {
    public FilterChain A00;
    public C344207rU A01;
    public C364838m6 A02;
    public C354078Ko A03;
    public final Context A04;
    public final UserSession A05;
    public final AnonymousClass80G A06;
    public final AnonymousClass8KQ A07;
    public final TargetViewSizeProvider A08;
    public final AnonymousClass8KS A09;
    public final Map A0A = new HashMap();
    public final Map A0B = new HashMap();
    public final Map A0C = new HashMap();

    public static synchronized C344207rU A00(AnonymousClass8KR r13) {
        C344207rU r0;
        synchronized (r13) {
            r0 = r13.A01;
            if (r0 == null) {
                Context context = r13.A04;
                UserSession userSession = r13.A05;
                0qQ.A0B(context, 0);
                0qQ.A0B(userSession, 1);
                C343647qZ r3 = new C343647qZ("instagram_post_capture");
                r3.A02(C343737qi.A0C, C365968ny.A01(context, userSession, "OneCameraImageRenderUtil", true, true, false, false));
                r3.A02(C343677qc.A00, userSession);
                r3.A02(C343737qi.A05, true);
                r3.A02(C366138oF.A00, true);
                r3.A02(C343737qi.A02, C343747qj.A06);
                C343667qb r4 = C343737qi.A0A;
                0Tu r5 = 0Tu.A05;
                r3.A02(r4, Boolean.valueOf(182.A06(r5, userSession, 36324252114366376L)));
                r3.A02(C343737qi.A06, Boolean.valueOf(182.A06(r5, userSession, 36324252114366376L)));
                r3.A02(C343737qi.A0L, Integer.valueOf((int) 182.A01(r5, userSession, 36605727091201328L)));
                C343657qa r52 = new C343657qa(r3);
                AUY auy = new AUY(0);
                C343797qo r32 = C343797qo.A00;
                Context applicationContext = context.getApplicationContext();
                0qQ.A07(applicationContext);
                r0 = r32.A00(applicationContext, r52, new C343807qq(AppSpecific.class), auy);
                r13.A01 = r0;
            }
        }
        return r0;
    }

    public final void A01() {
        C364838m6 r2 = this.A02;
        if (r2 != null) {
            C354078Ko r0 = this.A03;
            r0.getClass();
            r0.DYe();
            C364988mL Avx = ((C345807u7) A00(this).A02(C345807u7.A00)).Avx();
            FilterChain filterChain = this.A00;
            filterChain.getClass();
            Avx.A07(filterChain);
            r2.EEp();
        }
    }

    public final void A02(FilterGroupModel filterGroupModel, String str) {
        this.A0A.put(str, filterGroupModel);
        this.A00 = ((FilterGroupModelImpl) filterGroupModel).A02;
        ((C345807u7) A00(this).A02(C345807u7.A00)).Avx().A07(this.A00);
    }

    public AnonymousClass8KR(Context context, UserSession userSession, AnonymousClass80G r4, AnonymousClass8KQ r5, TargetViewSizeProvider targetViewSizeProvider) {
        this.A04 = context;
        this.A05 = userSession;
        this.A06 = r4;
        this.A09 = new AnonymousClass8KS(r4);
        this.A07 = r5;
        this.A08 = targetViewSizeProvider;
    }
}
