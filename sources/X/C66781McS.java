package X;

import android.content.Context;
import com.google.common.collect.ImmutableList;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.direct.thread.analytics.DirectThreadAnalyticsParams;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.McS  reason: case insensitive filesystem */
public final /* synthetic */ class C66781McS implements AnonymousClass7B5 {
    public final /* synthetic */ C327367Am A00;

    public /* synthetic */ C66781McS(C327367Am r1) {
        this.A00 = r1;
    }

    public final AnonymousClass7FW AXV(Context context, UserSession userSession, AnonymousClass9HC r21, AnonymousClass7LQ r22, AnonymousClass7L2 r23, 17i r24) {
        C254873tC r0;
        AnonymousClass7LQ r5 = r22;
        C254703su r3 = r5.A0e;
        C254933tI A0P = r3.A0P();
        A0P.getClass();
        Context context2 = context;
        UserSession userSession2 = userSession;
        AnonymousClass7TG.A1N(context2, userSession2);
        AnonymousClass9HC r6 = r21;
        AnonymousClass7L2 r4 = r23;
        AnonymousClass7TG.A1R(r4, r6);
        2FW r02 = A0P.A0F;
        0qQ.A07(r02);
        AnonymousClass7FE A01 = AnonymousClass7FD.A01(userSession2, r6, r5, r4, A0P, r02);
        C3264276s r42 = new C3264276s((AnonymousClass773) null, (Map) null, (DefaultConstructorMarker) null, 3);
        ImmutableList A012 = A0P.A01();
        if (A012 == null || (r0 = (C254873tC) 00k.A0O(A012, 0)) == null) {
            throw AnonymousClass7TE.A0y();
        }
        C328667Fr A06 = r42.A00.A06(context2, userSession2, A01, r6, (AnonymousClass774) null, r5, A0P, r0, (List) null);
        int dimensionPixelSize = context2.getResources().getDimensionPixelSize(R.dimen.cutout_anything_sticker_animation_margin);
        2FW r1 = A0P.A0F;
        0qQ.A07(r1);
        return new AnonymousClass752((AnonymousClass77B) null, A06, (AnonymousClass755) null, (AnonymousClass75J) null, (DirectThreadAnalyticsParams) null, C3259874y.A08(context2, userSession2, r3, A0P), (1Xj) null, "H,0.555555:1", dimensionPixelSize, C3259874y.A09(r1, (Object) null, C3266377o.A04(userSession2, A0P)), r3.A1S());
    }
}
