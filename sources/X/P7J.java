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

public final class P7J implements C328347El {
    public final /* bridge */ /* synthetic */ C232262tL AWb(Context context, UserSession userSession, AnonymousClass9HC r96, C331837So r97, AnonymousClass7L2 r98, 17i r99, boolean z) {
        C328687Ft r6;
        AnonymousClass776 r30;
        AnonymousClass7LQ r0 = (AnonymousClass7LQ) r97;
        Context context2 = context;
        UserSession userSession2 = userSession;
        17i r14 = r99;
        C51973G9u.A1E(context2, userSession2, r14);
        AnonymousClass7L2 r15 = r98;
        AnonymousClass7TF.A1D(r15, 3, r0);
        AnonymousClass9HC r13 = r96;
        0qQ.A0B(r13, 5);
        AnonymousClass7FC r8 = AnonymousClass7FC.A00;
        0t0 A01 = AnonymousClass0eN.A01(r8);
        C254703su r1 = r0.A0e;
        UserSession userSession3 = userSession2;
        AnonymousClass9HC r17 = r13;
        AnonymousClass7LQ r18 = r0;
        AnonymousClass7FE A03 = AnonymousClass7FD.A03(userSession3, r17, r18, r15, r1.A10, A01);
        Object obj = r1.A1T;
        if (obj instanceof C300925yB) {
            0qQ.A0C(obj, "null cannot be cast to non-null type com.instagram.model.direct.DirectPendingMedia");
            ArrayList A1C = AnonymousClass7TE.A1C();
            AnonymousClass3Q2 A0g = C66582MXn.A0g(userSession2, (C300925yB) obj);
            C3262876d A00 = C3262776c.A00(context2, userSession2);
            AnonymousClass7FE A032 = AnonymousClass7FD.A03(userSession3, r17, r18, r15, r1.A10, AnonymousClass0eN.A01(r8));
            String str = null;
            if (A0g != null) {
                Iterator it = A0g.A0L().iterator();
                while (it.hasNext()) {
                    C300925yB A002 = C63326Kv9.A00(JTO.A0m(it));
                    String str2 = A002.A08;
                    DirectThreadAnalyticsParams A0W = C66583MXo.A0W(r0, r1);
                    boolean A05 = A002.A05();
                    AnonymousClass7SD r7 = r0.A0G;
                    AnonymousClass77B A04 = A00.A04(r1, A002, C330007Lb.A00(r7), false, r7.A0N.A08);
                    DirectMessageIdentifier A0V = r1.A0V();
                    String str3 = r1.A1u;
                    0qQ.A07(str3);
                    AnonymousClass9J6 r10 = new AnonymousClass9J6("", str3, 5);
                    C254883tD r34 = C254883tD.SINGLE;
                    if (!A002.A05()) {
                        r30 = new AnonymousClass776(JTQ.A0G(A002.A03()), false, C51967G9n.A0h(), (Integer) null, (Integer) null, (Integer) null, (String) null);
                    } else if (str2 != null) {
                        r30 = new AnonymousClass776(JTQ.A0G(str2), false, C51967G9n.A0h(), (Integer) null, (Integer) null, (Integer) null, (String) null);
                    } else {
                        r30 = null;
                    }
                    A1C.add(new C68821NYf(A04, new C328667Fr((C376649Iu) null, (C376649Iu) null, (AnonymousClass9J0) null, r10, (AnonymousClass9J6) null, (AnonymousClass9J6) null, (C61062Jw0) null, (C3259574v) null, C66580MXl.A0Y(context2, userSession2, r13, r0, r1), A032, (AnonymousClass74T) null, (AnonymousClass774) null, r30, (AnonymousClass778) null, (AnonymousClass77A) null, (AnonymousClass5FY) null, r34, (AnonymousClass779) null, A0V, (C254793t3) null, (GifUrlImpl) null, (ImageInfo) null, (CharSequence) null, (Long) null, (Long) null, (Long) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (List) null, (List) null, 0, 0, 0, false, false, false, false, false, false, false, false, false, false), A0W, (PrivacyMediaOverlayViewModel) null, 2, A05, false, false, false));
                }
            }
            DirectMessageIdentifier A0V2 = r1.A0V();
            C254793t3 r5 = r0.A0G.A0P;
            if (r5 != null) {
                str = C300965yF.A07(r5);
            }
            r6 = new C328687Ft((C3259574v) null, (AnonymousClass7FT) null, A0V2, str, A1C, C73916Plr.A00(context2, A032, 30), r0.A0G.A08, 2, false, false, true);
        } else {
            C300915yA r82 = new C300915yA(userSession2);
            AnonymousClass7SD r52 = r0.A0G;
            C254793t3 r72 = r52.A0P;
            if (r72 != null) {
                r82.A02(r1, r72, r52.A08);
            }
            r6 = new C3264276s((AnonymousClass773) null, (Map) null, (DefaultConstructorMarker) null, 3).A03(context2, userSession2, A03, r13, r0, false);
        }
        PointF pointF = new PointF(AnonymousClass7TE.A01(context2.getResources(), R.dimen.abc_alert_dialog_button_dimen), AnonymousClass7TE.A01(context2.getResources(), R.dimen.clips_editor_v3_timeline_transition_selector_margin_negative));
        String A0s = C66582MXn.A0s(userSession2, r1, z);
        0qQ.A0A(A0s);
        return new C68879NaG(AnonymousClass7FX.A01(context2, pointF, userSession2, r13, r0, r15, r14), r6, A0s);
    }
}
