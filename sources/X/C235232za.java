package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: X.2za  reason: invalid class name and case insensitive filesystem */
public final class C235232za implements C250603lj {
    public final Context A00;
    public final UserSession A01;
    public final AnonymousClass4DU A02;
    public final C235222zY A03;

    public final void ATF(AnonymousClass30Y r14, C252093oY r15) {
        0qQ.A0B(r14, 0);
        0qQ.A0B(r15, 1);
        1Xj r9 = (1Xj) r14.A03;
        AnonymousClass3W1 r10 = ((AnonymousClass4HA) r14.A04).A01;
        1Xj A1c = r9.A1c(r10.A03);
        if (A1c == null) {
            A1c = r9;
        }
        String id = r9.getId();
        if (id != null) {
            C235222zY r1 = this.A03;
            View view = (View) r1.A00.get(id);
            if (view != null) {
                int intValue = r15.CEk(r14).intValue();
                if (intValue != 0 && intValue != 1) {
                    r1.A00(id);
                    if (r10.A12 != null && r10.A11 != null) {
                        r10.A11 = null;
                    }
                } else if (!A1c.A5H()) {
                    Map map = r1.A02;
                    if (!map.containsKey(id)) {
                        C243013Xb r2 = C243013Xb.A00;
                        View A002 = C243013Xb.A00(view, -1);
                        if (A002 != null) {
                            View A032 = r2.A03(A002);
                            if (A032 != null) {
                                A002 = A032;
                            }
                            List<View> singletonList = Collections.singletonList(A002);
                            0qQ.A07(singletonList);
                            map.put(id, singletonList);
                            for (View A012 : singletonList) {
                                UserSession userSession = this.A01;
                                C243013Xb.A01(view, A012, userSession, r9, r10, "cta_extension_tap_on_media", C256073vB.A00(this.A00, userSession, r9, this.A02.getModuleName(), "cta_extension_tap_on_media"));
                            }
                        }
                    }
                }
            }
        }
    }

    public C235232za(Context context, UserSession userSession, AnonymousClass4DU r3, C235222zY r4) {
        this.A00 = context;
        this.A01 = userSession;
        this.A02 = r3;
        this.A03 = r4;
    }
}
