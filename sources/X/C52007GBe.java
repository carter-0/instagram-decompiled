package X;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.litho.ComponentTree;
import com.facebook.litho.LithoView;
import com.instagram.android.R;
import com.instagram.clips.intf.ClipsViewerConfig;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.GBe  reason: case insensitive filesystem */
public final class C52007GBe extends GBR {
    public GKI A00;
    public JTB A01;
    public GC5 A02;
    public JTG A03;
    public C52042GCo A04;
    public JQX A05;
    public List A06;
    public 0sP A07;
    public 0sP A08;
    public 0sP A09;
    public 0sP A0A;
    public 0sP A0B;
    public 0sP A0C;
    public 0sP A0D;
    public 0sP A0E;
    public final Activity A0F;
    public final Context A0G;
    public final 2V5 A0H = new 2V5(C51967G9n.A0h());
    public final C229382nI A0I;
    public final JPD A0J;
    public final ClipsViewerConfig A0K;
    public final JSx A0L;
    public final JRO A0M;
    public final UserSession A0N;
    public final C230292pL A0O;
    public final C310256ag A0P;
    public final GBS A0Q = new GBS(C51965G9l.A0l());
    public final C234342xi A0R;
    public final C51984GAh A0S;
    public final C52009GBg A0T;
    public final GBQ A0U;
    public final C51987GAk A0V;
    public final GDE A0W;
    public final H3C A0X;
    public final I4A A0Y;
    public final C51979GAc A0Z;
    public final GF2 A0a;
    public final JT5 A0b;
    public final JT5 A0c;
    public final String A0d = AnonymousClass7TG.A0j();
    public final HashMap A0e = AnonymousClass7TE.A1E();
    public final HashMap A0f = AnonymousClass7TE.A1E();
    public final HashMap A0g = AnonymousClass7TE.A1E();
    public final HashMap A0h = AnonymousClass7TE.A1E();
    public final HashMap A0i = AnonymousClass7TE.A1E();
    public final AnonymousClass0eM A0j;
    public final AnonymousClass0eM A0k;
    public final boolean A0l;
    public final boolean A0m;
    public final C56024HrW A0n;
    public final GBL A0o;
    public final GBI A0p;
    public final C46340Dci A0q;
    public final JU3 A0r;
    public final GBO A0s;
    public final GBD A0t;
    public final C46341Dcj A0u;
    public final C55267Hew A0v;
    public final GBM A0w;
    public final GBN A0x;
    public final GBJ A0y;

    public final boolean A02() {
        return true;
    }

    /* renamed from: A07 */
    public final void unbind(C52079GDz gDz) {
        String str;
        C56024HrW hrW;
        0qQ.A0B(gDz, 0);
        HQV hqv = gDz.A08;
        if (!(hqv == null || (hrW = gDz.A09) == null)) {
            hrW.A00.remove(hqv);
        }
        C267324bN r0 = gDz.A01;
        if (r0 != null) {
            str = r0.getId();
        } else {
            str = null;
        }
        RoundedCornerFrameLayout roundedCornerFrameLayout = gDz.A06;
        0qQ.A0C(roundedCornerFrameLayout, "null cannot be cast to non-null type android.widget.FrameLayout");
        roundedCornerFrameLayout.setTag((Object) null);
        LithoView childAt = roundedCornerFrameLayout.getChildAt(0);
        0qQ.A0C(childAt, "null cannot be cast to non-null type com.facebook.litho.LithoView");
        childAt.A0k((ComponentTree) null, true);
        if (str != null) {
            this.A0i.remove(str);
            this.A0e.remove(str);
            this.A0g.remove(str);
            this.A0f.remove(str);
            this.A0h.remove(str);
            gDz.A0A.clear();
            gDz.A0B.clear();
            gDz.A0C.clear();
            gDz.A0D.clear();
            gDz.A01 = null;
            C52078GDy gDy = gDz.A07;
            gDz.getBindingAdapterPosition();
            gDy.A00 = null;
            gDy.A03 = null;
        }
    }

    public static final GF9 A00(C52007GBe gBe) {
        Object value = gBe.A0k.getValue();
        0qQ.A07(value);
        if (((Boolean) value).booleanValue()) {
            return (GF9) gBe.A0j.getValue();
        }
        return A01(gBe);
    }

    public static final GF9 A01(C52007GBe gBe) {
        String str;
        GF9 A062 = ((C52094GEo) gBe.A0W.A00.A0R.getValue()).A06();
        GBI gbi = gBe.A0p;
        A062.EbB(new C58161InR(gbi, 23));
        A062.EbH(new C58161InR(gbi, 25));
        A062.EbI(new C58133Imz(gbi, 52));
        A062.EbK(new C58141In7(gbi, 41));
        A062.EbN(new C58141In7(gbi, 42));
        A062.EbO(new C58141In7(gbi, 43));
        A062.EbP(new C58141In7(gbi, 44));
        A062.EbQ(new C58133Imz(gbi, 53));
        A062.Ebt(new C58141In7(gbi, 45));
        A062.EbT(new C58133Imz(gbi, 50));
        A062.EbU(new C58141In7(gbi, 29));
        GKI gki = gBe.A00;
        if (gki != null) {
            A062.Eba(gki);
            A062.Ebc(new C58141In7(gbi, 30));
            A062.Ebe(new C58133Imz(gbi, 51));
            A062.Ebh(new C58141In7(gbi, 31));
            A062.Ebi(new C58141In7(gbi, 32));
            A062.Ebl(new C58141In7(gbi, 33));
            A062.Ebq(new C58141In7(gbi, 34));
            A062.Ebm(new C58141In7(gbi, 35));
            A062.Ebn(new C58163InT(gbi, 7));
            A062.Ebo(new C58161InR(gbi, 24));
            A062.Ebp(new C58141In7(gbi, 36));
            A062.Ebr(new C58167InX(gbi, 7));
            A062.Ebs(new GFB(gbi));
            A062.EbX(new C58163InT(gbi, 8));
            A062.EbW(new C58141In7(gbi, 37));
            A062.Eb7(new C58141In7(gbi, 38));
            A062.Ebj(new C58141In7(gbi, 39));
            A062.EbV(new C58141In7(gbi, 40));
            A062.EeY(new C58163InT(gbi, 9));
            A062.Eb2(new C58141In7(gBe.A0y, 47));
            GBM gbm = gBe.A0w;
            A062.Eaz(new GL2(gbm, 1));
            A062.Ebb(new C58163InT(gbm, 15));
            A062.EbR(new C58167InX(gBe.A0x, 8));
            C46340Dci dci = gBe.A0q;
            A062.EbM(new C51657FyJ(dci, 22));
            A062.EbJ(new C51654FyG(dci, 29));
            A062.EbL(new C51654FyG(gBe.A0u, 30));
            A062.Ebg(new C66195MIc(gBe.A0r, 2));
            GBO gbo = gBe.A0s;
            A062.EbS(new C58141In7(gbo, 51));
            A062.El5(new C58161InR(gbo, 26));
            A062.Ej8(new C58161InR(gBe.A06(), 27));
            A062.Enq(new C58161InR(gBe.A06(), 28));
            A062.Ece(new C58161InR(gBe.A06(), 29));
            A062.Eb3(new C58163InT(gBe.A0o, 10));
            GKI gki2 = gBe.A00;
            if (gki2 != null) {
                A062.Eb6(gki2);
                A062.Eb1(new GFE(gBe.A06()));
                A062.Eb8(new GK7(gBe.A06()));
                A062.Eb9(new C58141In7(gBe.A06(), 46));
                A062.ER2(new C58163InT(gBe.A06(), 11));
                A062.EU6(new C61083JwL(22, new C58133Imz(gBe.A06(), 54), new C58141In7(gBe.A06(), 48)));
                A062.A00.A00 = new GK8(gBe.A06());
                0sP r0 = gBe.A08;
                if (r0 != null) {
                    A062.Eb0(r0);
                    0sP r02 = gBe.A09;
                    if (r02 != null) {
                        A062.EbY(r02);
                        0sP r03 = gBe.A0A;
                        if (r03 != null) {
                            A062.EbZ(r03);
                            0sP r04 = gBe.A0D;
                            if (r04 != null) {
                                A062.Ebf(r04);
                                0sP r05 = gBe.A0B;
                                if (r05 != null) {
                                    A062.EbG(r05);
                                    0sP r06 = gBe.A07;
                                    if (r06 != null) {
                                        A062.EkC(r06);
                                        0sP r07 = gBe.A0C;
                                        if (r07 != null) {
                                            A062.EbF(r07);
                                            A062.Enp(new C58163InT(gBe.A06(), 12));
                                            0sP r08 = gBe.A0E;
                                            if (r08 != null) {
                                                A062.Enr(r08);
                                                GBD gbd = gBe.A0t;
                                                A062.Ei8(new C58163InT(gbd, 13));
                                                A062.Eh9(new C58141In7(gbd, 49));
                                                A062.Eqx(new C58161InR(gbd, 30));
                                                A062.EfT(new C58141In7(gbd, 50));
                                                A062.EfS(new C58163InT(gbd, 14));
                                                return A062;
                                            }
                                            str = "onVisualSearchButtonTap";
                                        } else {
                                            str = "onOpenContentNotesNuxFromShare";
                                        }
                                    } else {
                                        str = "onMotionEventShareSheet";
                                    }
                                } else {
                                    str = "onOpenContentNotesNux";
                                }
                            } else {
                                str = "onOpenShareSheet";
                            }
                        } else {
                            str = "onOpenCommentsFromCount";
                        }
                    } else {
                        str = "onOpenComments";
                    }
                } else {
                    str = "onOpenAudioPage";
                }
                0qQ.A0F(str);
                throw AnonymousClass00P.createAndThrow();
            }
        }
        str = "onOpenRecipeSheet";
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final C52079GDz A05() {
        Context context = this.A0G;
        RoundedCornerFrameLayout roundedCornerFrameLayout = new RoundedCornerFrameLayout(context);
        C51968G9o.A1D(roundedCornerFrameLayout, -1);
        LithoView lithoView = new LithoView(context);
        roundedCornerFrameLayout.setStrokeColor(0);
        roundedCornerFrameLayout.setCornerBackgroundColor(AnonymousClass7TF.A03(context, R.attr.igds_color_media_background));
        roundedCornerFrameLayout.addView(lithoView);
        C52078GDy gDy = new C52078GDy(lithoView, this.A0K, this.A0N, true);
        ArrayList A1C = AnonymousClass7TE.A1C();
        ArrayList A1C2 = AnonymousClass7TE.A1C();
        ArrayList A1C3 = AnonymousClass7TE.A1C();
        ArrayList A1C4 = AnonymousClass7TE.A1C();
        C52079GDz gDz = new C52079GDz(roundedCornerFrameLayout, this.A0H, gDy, this.A0n, A1C2, A1C, A1C4, A1C3);
        roundedCornerFrameLayout.setTag(gDz);
        return gDz;
    }

    public final JTB A06() {
        JTB jtb = this.A01;
        if (jtb != null) {
            return jtb;
        }
        0qQ.A0F("delegate");
        throw AnonymousClass00P.createAndThrow();
    }

    public final Class modelClass() {
        return C52060GDg.class;
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        return A05();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C52007GBe(android.app.Activity r8, android.content.Context r9, X.C229382nI r10, X.JPD r11, com.instagram.clips.intf.ClipsViewerConfig r12, X.JSx r13, X.JRO r14, com.instagram.common.session.UserSession r15, X.C230292pL r16, X.C310256ag r17, X.C234342xi r18, X.C51984GAh r19, X.C52009GBg r20, X.GBQ r21, X.C51987GAk r22, X.GDE r23, X.C56024HrW r24, X.H3C r25, X.GBL r26, X.GBI r27, X.C46340Dci r28, X.JU3 r29, X.GBO r30, X.GBD r31, X.C46341Dcj r32, X.C55267Hew r33, X.GBM r34, X.GBN r35, X.GBJ r36, X.I4A r37, X.C51979GAc r38, X.GF2 r39, X.JT5 r40, X.JT5 r41, boolean r42) {
        /*
            r7 = this;
            r3 = 15
            r5 = 16
            r1 = r22
            r7.<init>(r13, r1)
            r7.A0F = r8
            r7.A0G = r9
            r0 = r23
            r7.A0W = r0
            r0 = r37
            r7.A0Y = r0
            r0 = r27
            r7.A0p = r0
            r0 = r36
            r7.A0y = r0
            r0 = r33
            r7.A0v = r0
            r0 = r26
            r7.A0o = r0
            r0 = r34
            r7.A0w = r0
            r0 = r35
            r7.A0x = r0
            r0 = r28
            r7.A0q = r0
            r0 = r32
            r7.A0u = r0
            r0 = r29
            r7.A0r = r0
            r0 = r31
            r7.A0t = r0
            r0 = r30
            r7.A0s = r0
            r7.A0L = r13
            r7.A0M = r14
            r0 = r20
            r7.A0T = r0
            r7.A0N = r15
            r4 = r38
            r7.A0Z = r4
            r7.A0V = r1
            r7.A0I = r10
            r7.A0K = r12
            r0 = r24
            r7.A0n = r0
            r0 = r17
            r7.A0P = r0
            r0 = r21
            r7.A0U = r0
            r7.A0J = r11
            r0 = r19
            r7.A0S = r0
            r0 = r16
            r7.A0O = r0
            r0 = r42
            r7.A0l = r0
            r0 = r40
            r7.A0b = r0
            r0 = r41
            r7.A0c = r0
            r0 = r39
            r7.A0a = r0
            r0 = r25
            r7.A0X = r0
            r0 = r18
            r7.A0R = r0
            java.util.HashMap r0 = X.AnonymousClass7TE.A1E()
            r7.A0i = r0
            java.util.HashMap r0 = X.AnonymousClass7TE.A1E()
            r7.A0g = r0
            java.util.HashMap r0 = X.AnonymousClass7TE.A1E()
            r7.A0f = r0
            java.util.HashMap r0 = X.AnonymousClass7TE.A1E()
            r7.A0e = r0
            java.util.HashMap r0 = X.AnonymousClass7TE.A1E()
            r7.A0h = r0
            java.lang.String r0 = X.AnonymousClass7TG.A0j()
            r7.A0d = r0
            java.lang.Float r1 = X.C51967G9n.A0h()
            X.2V5 r0 = new X.2V5
            r0.<init>(r1)
            r7.A0H = r0
            X.02m r1 = X.C51965G9l.A0l()
            X.GBS r0 = new X.GBS
            r0.<init>(r1)
            r7.A0Q = r0
            X.1Si r2 = X.1Se.A00(r15)
            java.lang.String r1 = r4.getModuleName()
            r0 = 0
            X.0qQ.A0B(r1, r0)
            r6 = 0
            boolean r0 = r2.A00(r1, r0)
            if (r0 == 0) goto L_0x00e0
            com.instagram.common.session.UserSession r4 = r2.A05
            X.0Tu r2 = X.0Tu.A05
            r0 = 36320807550985070(0x8109950008236e, double:3.032763175171396E-306)
            boolean r0 = X.182.A06(r2, r4, r0)
            if (r0 == 0) goto L_0x00e0
            r6 = 1
        L_0x00e0:
            r7.A0m = r6
            X.IwE r0 = X.C58705IwE.A01(r7, r5)
            X.0t0 r0 = X.AnonymousClass0eN.A01(r0)
            r7.A0k = r0
            X.IwE r0 = X.C58705IwE.A01(r7, r3)
            X.0t0 r0 = X.AnonymousClass0eN.A01(r0)
            r7.A0j = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52007GBe.<init>(android.app.Activity, android.content.Context, X.2nI, X.JPD, com.instagram.clips.intf.ClipsViewerConfig, X.JSx, X.JRO, com.instagram.common.session.UserSession, X.2pL, X.6ag, X.2xi, X.GAh, X.GBg, X.GBQ, X.GAk, X.GDE, X.HrW, X.H3C, X.GBL, X.GBI, X.Dci, X.JU3, X.GBO, X.GBD, X.Dcj, X.Hew, X.GBM, X.GBN, X.GBJ, X.I4A, X.GAc, X.GF2, X.JT5, X.JT5, boolean):void");
    }
}
