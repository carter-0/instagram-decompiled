package X;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.igsignalsproducts.clips.tab.IgSignalsClipsOpenTabTracker;
import java.util.HashMap;

/* renamed from: X.2fu  reason: invalid class name and case insensitive filesystem */
public final class C226232fu implements View.OnClickListener {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ 2b7 A02;
    public final /* synthetic */ 1QK A03;

    public C226232fu(Activity activity, UserSession userSession, 2b7 r3, 1QK r4) {
        this.A03 = r4;
        this.A01 = userSession;
        this.A00 = activity;
        this.A02 = r3;
    }

    /* JADX WARNING: type inference failed for: r0v17, types: [X.1qK, java.lang.Object] */
    public final void onClick(View view) {
        AnonymousClass93T r0;
        int A05 = AnonymousClass0fD.A05(-1773008666);
        1QK r02 = this.A03;
        1QK r6 = 1QK.A09;
        if (r02 != r6) {
            UserSession userSession = this.A01;
            String str = C71342cb.A00(userSession).A0D;
            if (str != null && 00l.A0d(str, "clips_viewer_", false)) {
                IgSignalsClipsOpenTabTracker A002 = 2II.A00(userSession);
                if (A002 != null) {
                    A002.A01();
                }
                GJS gjs = (GJS) userSession.A01(GJS.class, new C58674Ivj(userSession, 15));
                Activity activity = this.A00;
                if (!(1Wj.A00 == null || (r0 = gjs.A00) == null)) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("viewer_session_id", r0.A00);
                    DcL.A00().A00(activity, gjs.A01, "436914377278093", hashMap);
                    gjs.A00 = null;
                }
                AnonymousClass1Nd.A00(userSession).A05(new Object());
            }
        } else {
            0xa A032 = 1Al.A01(this.A01).A03(1An.A0o);
            int i = A032.getInt("KEY_CLIPS_TAB_VISIT_COUNT", 0);
            0xY AR4 = A032.AR4();
            AR4.E5T("KEY_HAS_VISITED_CLIPS_TAB", true);
            AR4.E5c("KEY_LAST_TAB_VISIT_TIMESTAMP_MS", System.currentTimeMillis());
            AR4.E5Z("KEY_CLIPS_TAB_VISIT_COUNT", i + 1);
            AR4.apply();
            2b7 r3 = this.A02;
            Bundle bundle = new Bundle();
            bundle.putString("source", "clips_tab");
            r3.A07(bundle, r6);
        }
        AnonymousClass0fD.A0C(918633012, A05);
    }
}
