package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import java.util.List;

/* renamed from: X.9mE  reason: invalid class name and case insensitive filesystem */
public final class C387449mE extends AA8 {
    public final Context A00;
    public final UserSession A01;
    public final C3510387i A02;
    public final TargetViewSizeProvider A03;
    public final AnonymousClass87H A04;
    public final List A05;

    public C387449mE(Context context, UserSession userSession, C3510387i r4, TargetViewSizeProvider targetViewSizeProvider, AnonymousClass87H r6, List list) {
        0qQ.A0B(userSession, 3);
        AnonymousClass7TG.A1R(targetViewSizeProvider, r4);
        this.A04 = r6;
        this.A00 = context;
        this.A01 = userSession;
        this.A03 = targetViewSizeProvider;
        this.A02 = r4;
        this.A05 = list;
    }
}
