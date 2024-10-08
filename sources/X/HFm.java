package X;

import android.content.Context;
import android.widget.Adapter;
import androidx.fragment.app.FragmentActivity;
import com.facebook.litho.LithoView;
import com.instagram.android.R;
import com.instagram.clips.intf.ClipsViewerConfig;
import com.instagram.common.session.UserSession;
import com.instagram.search.common.analytics.SearchContext;
import java.util.HashMap;
import java.util.List;

public final class HFm extends C232502tp {
    public final Context A00;
    public final AnonymousClass0eM A01 = AnonymousClass0eN.A00(0eO.A02, new C58684Ivt(this, 28));
    public final FragmentActivity A02;
    public final AnonymousClass07Z A03;
    public final C229382nI A04;
    public final UserSession A05;
    public final AnonymousClass33B A06;
    public final C252613pO A07;
    public final AnonymousClass4DU A08;
    public final C310256ag A09;
    public final HashMap A0A;
    public final HashMap A0B;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public HFm(android.content.Context r12, androidx.fragment.app.FragmentActivity r13, X.AnonymousClass07Z r14, X.C229382nI r15, com.instagram.common.session.UserSession r16, X.AnonymousClass33B r17, X.C252613pO r18, X.AnonymousClass4DU r19) {
        /*
            r11 = this;
            r4 = r12
            r6 = r16
            X.AnonymousClass7TG.A1O(r12, r6)
            r0 = 6
            r2 = r17
            r1 = r18
            X.C51973G9u.A0s(r0, r1, r2, r13)
            r0 = 32
            X.J6H r8 = new X.J6H
            r8.<init>(r6, r0)
            X.J3K r9 = X.J3K.A00
            r7 = 0
            r10 = 152(0x98, float:2.13E-43)
            r3 = r11
            r5 = r14
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            r11.A00 = r12
            r11.A05 = r6
            r11.A03 = r14
            r0 = r19
            r11.A08 = r0
            r11.A04 = r15
            r11.A07 = r1
            r11.A06 = r2
            r11.A02 = r13
            X.0eO r2 = X.0eO.A02
            r1 = 28
            X.Ivt r0 = new X.Ivt
            r0.<init>(r11, r1)
            X.0eM r0 = X.AnonymousClass0eN.A00(r2, r0)
            r11.A01 = r0
            X.6ag r0 = new X.6ag
            r0.<init>(r12, r6)
            r11.A09 = r0
            java.util.HashMap r0 = X.AnonymousClass7TE.A1E()
            r11.A0B = r0
            java.util.HashMap r0 = X.AnonymousClass7TE.A1E()
            r11.A0A = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.HFm.<init>(android.content.Context, androidx.fragment.app.FragmentActivity, X.07Z, X.2nI, com.instagram.common.session.UserSession, X.33B, X.3pO, X.4DU):void");
    }

    public final int A01() {
        return DbX.A07(this.A01);
    }

    public final C251263mp A02(C62320sa r53, C62320sa r54) {
        String id;
        C62320sa r1 = r53;
        boolean A1Z = AnonymousClass7TG.A1Z(r1, r54);
        C53400GnX gnX = (C53400GnX) r1.invoke();
        C267324bN r4 = (C267324bN) gnX.A01;
        C52058GDe gDe = (C52058GDe) gnX.A03;
        ClipsViewerConfig clipsViewerConfig = (ClipsViewerConfig) gnX.A04;
        Object obj = gnX.A02;
        Context context = this.A00;
        UserSession userSession = this.A05;
        AnonymousClass4DU r2 = this.A08;
        C229382nI r18 = this.A04;
        C310256ag r38 = this.A09;
        int i = this.A07.A00;
        HashMap hashMap = this.A0B;
        C55897HpI hpI = (C55897HpI) gnX.A00;
        AnonymousClass33B r35 = this.A06;
        FragmentActivity fragmentActivity = this.A02;
        HashMap hashMap2 = this.A0A;
        1Xj r12 = r4.A02;
        if (r12 == null || (id = r12.getId()) == null) {
            throw AnonymousClass7TE.A0y();
        }
        Object obj2 = hashMap2.get(id);
        if (obj2 == null) {
            obj2 = new 2V5(C51967G9n.A0h());
            hashMap2.put(id, obj2);
        }
        2V5 r13 = (2V5) obj2;
        0qQ.A0B(gDe, A1Z ? 1 : 0);
        C51974G9v.A1S(clipsViewerConfig, obj, context, userSession, r2);
        0qQ.A0B(r38, 8);
        C51974G9v.A1R(hashMap, hpI, r35, fragmentActivity);
        0qQ.A0B(r13, 15);
        1Xj r8 = r4.A02;
        if (r8 != null) {
            AnonymousClass3W1 r3 = gDe.A0E;
            if (r3 != null) {
                SearchContext searchContext = new SearchContext((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null);
                C57450Iau iau = new C57450Iau();
                GF2 gf2 = new GF2(userSession);
                JU5 ju5 = new JU5(userSession);
                GKY A002 = C52020GBr.A00(userSession, iau, r2.getModuleName());
                C55684Hlh hlh = new C55684Hlh(r8.getId());
                ClipsViewerConfig clipsViewerConfig2 = clipsViewerConfig;
                UserSession userSession2 = userSession;
                JU5 ju52 = ju5;
                C57450Iau iau2 = iau;
                C52094GEo gEo = (C52094GEo) new GBH(A002, clipsViewerConfig2, userSession2, ju52, iau2, (H3C) null, new GBG(A002, userSession, r2, ju5, searchContext, iau, hlh, gf2), new C51979GAc(new C51990GAn(userSession), clipsViewerConfig, userSession, "feed_timeline", r8.getId()), hlh, gf2).A0R.getValue();
                C55958HqP hqP = new C55958HqP(fragmentActivity, userSession, r2);
                GFK A052 = gEo.A05(clipsViewerConfig, r4, gDe, r3.getPosition());
                GF9 A062 = gEo.A06();
                A062.Ebm(new C58141In7(hqP, 57));
                A062.Ebp(new C58141In7(hqP, 58));
                A062.Eb2(new C58750Iwx(18, r3, hqP, r8));
                A062.Ebn(new JJS(32, hpI, r3));
                A062.EbN(hpI.A03);
                A062.Ebr(new JK3(hpI, 9));
                C57620Idl idl = new C57620Idl(fragmentActivity, r13, userSession2, r35, hpI, r2, r3, hqP, hashMap);
                C57047IMn iMn = new C57047IMn();
                HashMap A1E = AnonymousClass7TE.A1E();
                C57046IMm iMm = new C57046IMm(r4, userSession, r3);
                GBS gbs = new GBS(C51965G9l.A0l());
                if (r18 != null) {
                    C57691Ieu ieu = new C57691Ieu();
                    C57624Idp idp = new C57624Idp(context, i);
                    C52046GCs gCs = new C52046GCs(userSession, r2);
                    return new GFJ(r13, C51965G9l.A0e(C51969G9p.A0G(i)), r18, (JPD) null, clipsViewerConfig, iMm, iMn, userSession, (C52673Gal) null, r2, r38, (C52672Gak) null, gbs, new C234342xi(C61270mF.A00(context), (Adapter) null, userSession, r2), idl, idp, (C51987GAk) null, new C57631Idw(), (H3C) null, A062, A052, ieu, gCs, (GF2) null, "12345", (String) null, (String) null, hashMap, A1E, (List) null, false, false);
                }
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
        throw AnonymousClass7TE.A0z("Required value was null.");
    }

    public final String A04() {
        return "LITHO_FULL_HEIGHT_SINGLE_MEDIA_CLIPS_UI";
    }

    public final void A06(LithoView lithoView, C62320sa r7) {
        String id;
        C52078GDy gDy;
        lithoView.setBackgroundColor(AnonymousClass7TF.A03(2Yn.A01(C61270mF.A00(this.A00)), R.attr.igds_color_primary_background));
        C53400GnX gnX = (C53400GnX) r7.invoke();
        Object tag = lithoView.getTag();
        0qQ.A0C(tag, AnonymousClass000.A00(1631));
        AnonymousClass3V3 r3 = ((C253963ri) tag).A00;
        C267324bN r2 = (C267324bN) gnX.A01;
        AnonymousClass3W1 r1 = ((C52058GDe) gnX.A03).A0E;
        if (r1 != null) {
            AnonymousClass7TF.A1H(r2, r3);
            if ((r3 instanceof C54580HJp) && (gDy = (C52078GDy) r3) != null) {
                gDy.A00 = r2;
                gDy.A03 = r1;
            }
            1Xj r0 = r2.A02;
            if (r0 != null && (id = r0.getId()) != null) {
                this.A0B.put(id, r3);
                return;
            }
            return;
        }
        throw AnonymousClass7TE.A0y();
    }
}
