package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.IntentAwareAdsInfo;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.GAu  reason: case insensitive filesystem */
public final class C51997GAu implements C59545JNr {
    public final List A00 = AnonymousClass7TE.A1C();
    public final UserSession A01;
    public final AnonymousClass4DU A02;
    public final C51982GAf A03;
    public final C52000GAx A04;
    public final C51998GAv A05;
    public final C51999GAw A06;
    public final C51988GAl A07;
    public final boolean A08;

    public final void EBO(View view, C267324bN r17, C52058GDe gDe, 2el r19, int i) {
        View view2 = view;
        C52058GDe gDe2 = gDe;
        2el r6 = r19;
        C267324bN r4 = r17;
        C51974G9v.A1O(r6, view2, r4, gDe2);
        if (GDZ.A00(r4)) {
            C2354830a A002 = AnonymousClass30Y.A00(r4, gDe2, r4.getId());
            A002.A00(this.A07.A01);
            A002.A00(this.A06);
            boolean z = this.A08;
            if (z) {
                for (C233612w1 ABg : this.A03.A00) {
                    ABg.ABg(A002);
                }
            }
            if (!gDe2.A0W) {
                A002.A00(this.A05);
            }
            UserSession userSession = this.A01;
            0Tu r3 = 0Tu.A05;
            if (182.A06(r3, userSession, 36315155373689891L)) {
                C52000GAx gAx = this.A04;
                gAx.A00.put(r4, view2);
                A002.A00(gAx);
            }
            if (182.A06(r3, userSession, 36312733013116139L)) {
                IPO ipo = new IPO(182.A06(0Tu.A06, userSession, 36326966533568612L));
                ipo.A01.put(r4, view2);
                A002.A00(ipo);
            }
            for (C250603lj r8 : this.A00) {
                if (182.A06(r3, userSession, 36318226275112965L) && (r8 instanceof GHH)) {
                    GHH ghh = (GHH) r8;
                    if (ghh.A08) {
                        ghh.A06.put(r4, view2);
                    }
                }
                A002.A00(r8);
            }
            if (!z) {
                for (C233612w1 ABg2 : this.A03.A00) {
                    ABg2.ABg(A002);
                }
            }
            C51967G9n.A0z(view2, A002, r6);
            if (182.A06(r3, userSession, 36327155512195271L)) {
                C55752Hmn hmn = new C55752Hmn(userSession, this.A02);
                String id = C51966G9m.A0s(r4).getId();
                if (id != null) {
                    AnonymousClass49W r2 = hmn.A01;
                    r4.A06();
                    r2.A00((C55513Hiv) null, new C57521Ic9(r4, hmn, i), new GAN(view2, hmn.A02, "reels_ads", hmn.A00.getModuleName(), id));
                }
            }
        }
    }

    public C51997GAu(Context context, FragmentActivity fragmentActivity, IntentAwareAdsInfo intentAwareAdsInfo, UserSession userSession, AnonymousClass4DU r16, AnonymousClass93U r17, C51982GAf gAf, C51988GAl gAl, String str, String str2) {
        this.A01 = userSession;
        AnonymousClass4DU r7 = r16;
        this.A02 = r7;
        this.A07 = gAl;
        this.A03 = gAf;
        Context context2 = context;
        FragmentActivity fragmentActivity2 = fragmentActivity;
        IntentAwareAdsInfo intentAwareAdsInfo2 = intentAwareAdsInfo;
        String str3 = str;
        this.A05 = new C51998GAv(context2, fragmentActivity2, intentAwareAdsInfo2, C51972G9s.A0c(userSession), userSession, new C232852uY(userSession, (C249763kK) null), r7, r17, str3, str2);
        this.A06 = new C51999GAw(userSession, r7, str3);
        this.A04 = new C52000GAx(userSession, r7);
        this.A08 = 182.A06(0Tu.A05, userSession, 36318556988971259L);
    }
}
