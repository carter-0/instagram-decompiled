package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.List;
import java.util.Map;

/* renamed from: X.6Le  reason: invalid class name and case insensitive filesystem */
public final class C306186Le extends C230372pW {
    public final Context A00;
    public final UserSession A01;
    public final AnonymousClass4DU A02;
    public final C310666bQ A03;

    public C306186Le(Context context, 1Bk r3, UserSession userSession, AnonymousClass4DU r5, C310666bQ r6) {
        super(r3, new C306196Lf(userSession));
        this.A03 = r6;
        this.A01 = userSession;
        this.A02 = r5;
        this.A00 = context;
    }

    private final void A00(C250973mM r14, C306176Ld r15, String str) {
        List list;
        C255773uh r7 = r15.A01;
        AnonymousClass4DU r3 = this.A02;
        UserSession userSession = this.A01;
        C254523sc A022 = GTA.A02(userSession, r3, r7, str);
        A022.A4A = Long.valueOf((long) r15.A00);
        C310666bQ r9 = this.A03;
        C309426Yf r10 = r15.A02;
        AnonymousClass3PI.A07(A022, r7, r14, r9, r10, -1, false);
        if (r15.A03) {
            A022.A0X(r14.A0H.A17);
        } else {
            Context context = this.A00;
            A022.A04(0nA.A01(context, (float) 0nA.A09(context)), 0nA.A01(context, (float) 0nA.A08(context)), 0nA.A0H(context).density);
            AnonymousClass6MB r1 = r10.A0S;
            if (r1 != null) {
                A022.A0Y(r1.BLs());
                Map BN6 = r1.BN6();
                if (BN6 != null) {
                    list = (List) BN6.get("caption_highlights_showed");
                } else {
                    list = null;
                }
                A022.A0W(list);
            }
        }
        C233822wX.A0I(userSession, A022, r3, AnonymousClass05K.A01);
    }

    public final /* bridge */ /* synthetic */ void A03(Object obj, Object obj2) {
        C250973mM r2 = (C250973mM) obj;
        C306176Ld r3 = (C306176Ld) obj2;
        0qQ.A0B(r2, 0);
        0qQ.A0B(r3, 1);
        A00(r2, r3, "segment_impression");
    }

    public final /* bridge */ /* synthetic */ void A04(Object obj, Object obj2) {
        C250973mM r2 = (C250973mM) obj;
        C306176Ld r3 = (C306176Ld) obj2;
        0qQ.A0B(r2, 0);
        0qQ.A0B(r3, 1);
        A00(r2, r3, "segment_sub_impression");
    }
}
