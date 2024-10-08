package X;

import android.content.Context;
import android.graphics.PointF;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.direct.thread.analytics.DirectThreadAnalyticsParams;
import com.instagram.direct.wellbeing.harmfulcontent.ondevicenudity.view.data.PrivacyMediaOverlayViewModel;
import com.instagram.model.direct.messageid.DirectMessageIdentifier;
import com.instagram.model.mediasize.GifUrlImpl;
import com.instagram.model.mediasize.ImageInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class P7C implements C328347El {
    public final /* bridge */ /* synthetic */ C232262tL AWb(Context context, UserSession userSession, AnonymousClass9HC r100, C331837So r101, AnonymousClass7L2 r102, 17i r103, boolean z) {
        C328687Ft r5;
        AnonymousClass776 r29;
        AnonymousClass7LQ r0 = (AnonymousClass7LQ) r101;
        Context context2 = context;
        UserSession userSession2 = userSession;
        17i r13 = r103;
        boolean A1b = C51973G9u.A1b(context2, userSession2, r13);
        AnonymousClass7L2 r14 = r102;
        AnonymousClass7TF.A1D(r14, 3, r0);
        AnonymousClass9HC r12 = r100;
        0qQ.A0B(r12, 5);
        0t0 A01 = AnonymousClass0eN.A01(C73772PjX.A00);
        C254703su r1 = r0.A0e;
        2FW r4 = r1.A10;
        0qQ.A07(r4);
        AnonymousClass7FE A03 = AnonymousClass7FD.A03(userSession2, r12, r0, r14, r4, A01);
        Object obj = r1.A1T;
        if (obj instanceof C300925yB) {
            0qQ.A0C(obj, "null cannot be cast to non-null type com.instagram.model.direct.DirectPendingMedia");
            ArrayList A1C = AnonymousClass7TE.A1C();
            AnonymousClass3Q2 A0g = C66582MXn.A0g(userSession2, (C300925yB) obj);
            C3262876d A00 = C3262776c.A00(context2, userSession2);
            AnonymousClass7FE A032 = AnonymousClass7FD.A03(userSession2, r12, r0, r14, r1.A10, AnonymousClass0eN.A01(AnonymousClass7FC.A00));
            String str = null;
            if (A0g != null) {
                Iterator it = A0g.A0L().iterator();
                while (it.hasNext()) {
                    C300925yB A002 = C63326Kv9.A00(JTO.A0m(it));
                    String str2 = A002.A08;
                    DirectThreadAnalyticsParams A0W = C66583MXo.A0W(r0, r1);
                    boolean A05 = A002.A05();
                    AnonymousClass7SD r52 = r0.A0G;
                    AnonymousClass77B A04 = A00.A04(r1, A002, C330007Lb.A00(r52), false, r52.A0N.A08);
                    DirectMessageIdentifier A0V = r1.A0V();
                    String str3 = r1.A1u;
                    0qQ.A07(str3);
                    AnonymousClass9J6 r9 = new AnonymousClass9J6("", str3, 5);
                    C254883tD r33 = C254883tD.SINGLE;
                    if (!A002.A05()) {
                        r29 = new AnonymousClass776(JTQ.A0G(A002.A03()), false, C51967G9n.A0h(), (Integer) null, (Integer) null, (Integer) null, (String) null);
                    } else if (str2 != null) {
                        r29 = new AnonymousClass776(JTQ.A0G(str2), false, C51967G9n.A0h(), (Integer) null, (Integer) null, (Integer) null, (String) null);
                    } else {
                        r29 = null;
                    }
                    A1C.add(new C68821NYf(A04, new C328667Fr((C376649Iu) null, (C376649Iu) null, (AnonymousClass9J0) null, r9, (AnonymousClass9J6) null, (AnonymousClass9J6) null, (C61062Jw0) null, (C3259574v) null, C66580MXl.A0Y(context2, userSession2, r12, r0, r1), A032, (AnonymousClass74T) null, (AnonymousClass774) null, r29, (AnonymousClass778) null, (AnonymousClass77A) null, (AnonymousClass5FY) null, r33, (AnonymousClass779) null, A0V, (C254793t3) null, (GifUrlImpl) null, (ImageInfo) null, (CharSequence) null, (Long) null, (Long) null, (Long) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (List) null, (List) null, 0, 0, 0, false, false, false, false, false, false, false, false, false, false), A0W, (PrivacyMediaOverlayViewModel) null, 2, A05, false, false, false));
                }
            }
            DirectMessageIdentifier A0V2 = r1.A0V();
            C254793t3 r42 = r0.A0G.A0P;
            if (r42 != null) {
                str = C300965yF.A07(r42);
            }
            r5 = new C328687Ft((C3259574v) null, (AnonymousClass7FT) null, A0V2, str, A1C, C73916Plr.A00(context2, A032, 29), r0.A0G.A08, 2, A1b, false, A1b);
        } else {
            C300915yA r7 = new C300915yA(userSession2);
            AnonymousClass7SD r43 = r0.A0G;
            C254793t3 r53 = r43.A0P;
            if (r53 != null) {
                r7.A02(r1, r53, r43.A08);
            }
            r5 = new C3264276s((AnonymousClass773) null, (Map) null, (DefaultConstructorMarker) null, 3).A03(context2, userSession2, A03, r12, r0, A1b);
        }
        PointF pointF = new PointF((float) AnonymousClass7TG.A03(context2), AnonymousClass7TE.A01(context2.getResources(), R.dimen.clips_editor_v3_timeline_transition_selector_margin_negative));
        String A0s = C66582MXn.A0s(userSession2, r1, z);
        0qQ.A0A(A0s);
        return new C68878NaF(AnonymousClass7FX.A01(context2, pointF, userSession2, r12, r0, r14, r13), r5, A0s);
    }
}
