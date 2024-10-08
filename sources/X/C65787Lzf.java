package X;

import android.app.Activity;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.creation.capture.quickcapture.storiestemplates.footer.PinnablesFooterHorizontalScrollView;
import com.instagram.music.common.model.MusicAssetModel;
import com.instagram.ui.widget.interactive.InteractiveDrawableContainer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

/* renamed from: X.Lzf  reason: case insensitive filesystem */
public final class C65787Lzf implements AnonymousClass88G, AnonymousClass89Y {
    public C64091LMj A00;
    public C262204Co A01;
    public final Activity A02;
    public final ColorDrawable A03;
    public final View A04;
    public final ConstraintLayout A05;
    public final 2cs A06;
    public final 2cs A07;
    public final AnonymousClass4DH A08;
    public final C52798Gcp A09;
    public final C52798Gcp A0A;
    public final UserSession A0B;
    public final C252063oV A0C;
    public final C314446iH A0D;
    public final AnonymousClass88Z A0E;
    public final AnonymousClass80W A0F;
    public final C310416b1 A0G;
    public final InteractiveDrawableContainer A0H;
    public final AnonymousClass0eM A0I;
    public final AnonymousClass0eM A0J = C41656Ay8.A00(this, 15);
    public final AnonymousClass0eM A0K;
    public final AnonymousClass0eM A0L;
    public final AnonymousClass0eM A0M;
    public final AnonymousClass0eM A0N;
    public final AnonymousClass0eM A0O;
    public final AnonymousClass0eM A0P;
    public final AnonymousClass0eM A0Q;

    /* JADX WARNING: type inference failed for: r3v0, types: [X.07Z, java.lang.Object, X.4DH] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C65787Lzf(android.app.Activity r42, android.view.View r43, X.AnonymousClass4DH r44, com.instagram.common.session.UserSession r45, X.C314446iH r46, X.AnonymousClass88Z r47, X.AnonymousClass80W r48, com.instagram.ui.widget.interactive.InteractiveDrawableContainer r49, boolean r50) {
        /*
            r41 = this;
            r2 = 1
            r8 = r42
            X.0qQ.A0B(r8, r2)
            r0 = r43
            r3 = r44
            r5 = r45
            X.C51974G9v.A1M(r0, r5, r3)
            r6 = r48
            r11 = r49
            X.C51972G9s.A1E(r6, r11)
            r1 = 9
            r7 = r47
            X.0qQ.A0B(r7, r1)
            r4 = r41
            r4.<init>()
            r4.A02 = r8
            r4.A0B = r5
            r4.A08 = r3
            r1 = r46
            r4.A0D = r1
            r4.A0F = r6
            r4.A0H = r11
            r4.A0E = r7
            r1 = 30
            X.Ay8 r12 = new X.Ay8
            r12.<init>(r4, r1)
            r1 = 23
            X.Ay8 r7 = new X.Ay8
            r7.<init>(r3, r1)
            X.0eO r9 = X.0eO.A02
            r6 = 24
            X.Ay8 r1 = new X.Ay8
            r1.<init>(r7, r6)
            X.0eM r10 = X.AnonymousClass0eN.A00(r9, r1)
            java.lang.Class<X.8Bz> r1 = X.C352168Bz.class
            X.0Yh r8 = X.DbS.A0z(r1)
            r1 = 25
            X.Ay8 r7 = new X.Ay8
            r7.<init>(r10, r1)
            r15 = 0
            r6 = 48
            X.MJ9 r1 = new X.MJ9
            r1.<init>(r6, r15, r10)
            X.2kA r1 = X.DbS.A0I(r7, r12, r1, r8)
            r4.A0P = r1
            r7 = 31
            X.Ay8 r13 = new X.Ay8
            r13.<init>(r4, r7)
            r1 = 26
            X.Ay8 r8 = new X.Ay8
            r8.<init>(r3, r1)
            r6 = 27
            X.Ay8 r1 = new X.Ay8
            r1.<init>(r8, r6)
            X.0eM r12 = X.AnonymousClass0eN.A00(r9, r1)
            java.lang.Class<X.Jj2> r1 = X.C60303Jj2.class
            X.0Yh r10 = X.DbS.A0z(r1)
            r1 = 28
            X.Ay8 r8 = new X.Ay8
            r8.<init>(r12, r1)
            r6 = 49
            X.MJ9 r1 = new X.MJ9
            r1.<init>(r6, r15, r12)
            X.2kA r1 = X.DbS.A0I(r8, r13, r1, r10)
            r4.A0Q = r1
            r1 = 29
            X.Ay8 r12 = new X.Ay8
            r12.<init>(r4, r1)
            r1 = 20
            X.Ay8 r8 = new X.Ay8
            r8.<init>(r3, r1)
            r6 = 21
            X.Ay8 r1 = new X.Ay8
            r1.<init>(r8, r6)
            X.0eM r10 = X.AnonymousClass0eN.A00(r9, r1)
            java.lang.Class<X.8Mp> r1 = X.C354588Mp.class
            X.0Yh r9 = X.DbS.A0z(r1)
            r1 = 22
            X.Ay8 r8 = new X.Ay8
            r8.<init>(r10, r1)
            r6 = 47
            X.MJ9 r1 = new X.MJ9
            r1.<init>(r6, r15, r10)
            X.2kA r1 = X.DbS.A0I(r8, r12, r1, r9)
            r4.A0O = r1
            android.content.Context r8 = r11.getContext()
            r1 = 2131099791(0x7f06008f, float:1.7811945E38)
            int r1 = r8.getColor(r1)
            android.graphics.drawable.ColorDrawable r10 = new android.graphics.drawable.ColorDrawable
            r10.<init>(r1)
            int r9 = r11.getWidth()
            int r8 = r11.getHeight()
            r12 = 0
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>(r12, r12, r9, r8)
            r10.setBounds(r1)
            r4.A03 = r10
            java.lang.Integer r9 = X.AnonymousClass05K.A00
            android.graphics.Rect r1 = r10.getBounds()
            X.Ut6 r13 = new X.Ut6
            r13.<init>(r1)
            r27 = -1082130432(0xffffffffbf800000, float:-1.0)
            r33 = 8
            X.6b1 r11 = new X.6b1
            r14 = r12
            r16 = r12
            r18 = r2
            r19 = r2
            r20 = r2
            r21 = r2
            r22 = r15
            r23 = r12
            r24 = r15
            r25 = r12
            r26 = r12
            r28 = r27
            r29 = r15
            r30 = r12
            r31 = r9
            r32 = r15
            r34 = r27
            r35 = r15
            r36 = r27
            r37 = r27
            r38 = r15
            r39 = r12
            r40 = r12
            r17 = r2
            r11.<init>((boolean) r12, (X.AnonymousClass8BH) r13, (boolean) r14, (java.lang.String) r15, (boolean) r16, (boolean) r17, (boolean) r18, (boolean) r19, (boolean) r20, (boolean) r21, (java.lang.Integer) r22, (boolean) r23, (X.AnonymousClass8DA) r24, (boolean) r25, (boolean) r26, (float) r27, (float) r28, (X.C3510487j) r29, (boolean) r30, (java.lang.Integer) r31, (java.lang.Integer) r32, (int) r33, (float) r34, (java.util.List) r35, (float) r36, (float) r37, (java.lang.Object) r38, (boolean) r39, (boolean) r40)
            r4.A0G = r11
            r1 = 2131441855(0x7f0b38bf, float:1.8505733E38)
            android.view.View r8 = X.DbY.A0F(r0, r1)
            X.0qQ.A07(r8)
            r4.A04 = r8
            r1 = 2131441856(0x7f0b38c0, float:1.8505735E38)
            android.view.View r1 = X.AnonymousClass7TF.A0F(r8, r1)
            androidx.constraintlayout.widget.ConstraintLayout r1 = (androidx.constraintlayout.widget.ConstraintLayout) r1
            r4.A05 = r1
            r1 = 15
            X.0eM r1 = X.C41656Ay8.A00(r4, r1)
            r4.A0J = r1
            r1 = 2131441861(0x7f0b38c5, float:1.8505746E38)
            X.3oV r1 = X.DbV.A0T(r8, r1, r12)
            r4.A0C = r1
            r1 = 17
            X.0eM r1 = X.C41656Ay8.A00(r4, r1)
            r4.A0L = r1
            r1 = 18
            X.0eM r1 = X.C41656Ay8.A00(r4, r1)
            r4.A0M = r1
            r1 = 16
            X.0eM r1 = X.C41656Ay8.A00(r4, r1)
            r4.A0K = r1
            android.content.Context r17 = X.AnonymousClass7TE.A0S(r0)
            if (r50 == 0) goto L_0x023a
            int r0 = X.JTR.A06(r17)
            float r1 = (float) r0
        L_0x0181:
            java.lang.Integer r18 = X.AnonymousClass05K.A01
            r21 = 1092616192(0x41200000, float:10.0)
            X.Gcp r0 = new X.Gcp
            r20 = r1
            r22 = r2
            r24 = r2
            r16 = r0
            r19 = r9
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24)
            r4.A09 = r0
            X.2cs r1 = X.AnonymousClass7TF.A0J()
            r1.A06 = r2
            r0 = 4
            X.K0E.A00(r1, r4, r0)
            r4.A06 = r1
            if (r50 == 0) goto L_0x0237
            int r0 = X.JTR.A06(r17)
            float r10 = (float) r0
        L_0x01a9:
            X.0Tu r11 = X.0Tu.A05
            r0 = 2342162949182791502(0x208108cb001f1f4e, double:4.065534979124383E-152)
            boolean r23 = X.182.A06(r11, r5, r0)
            X.Gcp r0 = new X.Gcp
            r16 = r0
            r18 = r9
            r20 = r10
            r22 = r12
            r24 = r12
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24)
            r4.A0A = r0
            X.2cs r1 = X.AnonymousClass7TF.A0J()
            r1.A06 = r2
            r0 = 5
            X.K0E.A00(r1, r4, r0)
            r4.A07 = r1
            r0 = 14
            X.0eM r0 = X.C41656Ay8.A00(r4, r0)
            r4.A0I = r0
            r0 = 19
            X.0eM r0 = X.C41656Ay8.A00(r4, r0)
            r4.A0N = r0
            r0 = 2131441863(0x7f0b38c7, float:1.850575E38)
            android.view.View r0 = r8.requireViewById(r0)
            X.0qQ.A0A(r0)
            X.3NG r1 = X.AnonymousClass7TE.A0m(r0)
            r1.A06 = r12
            r0 = 23
            X.C61685KHt.A00(r1, r4, r0)
            r0 = 2131441853(0x7f0b38bd, float:1.850573E38)
            android.view.View r0 = X.AnonymousClass7TF.A0G(r8, r0)
            X.3NG r1 = X.AnonymousClass7TE.A0m(r0)
            r1.A06 = r12
            r0 = 24
            X.C61685KHt.A00(r1, r4, r0)
            X.0xx r3 = X.DbW.A0E(r3)
            X.MGu r0 = new X.MGu
            r0.<init>(r4, r15, r7)
            X.JTO.A1Y(r9, r0, r3)
            X.Jj2 r0 = A00(r4)
            X.0r6 r2 = r0.A06
            r1 = 46
            X.MGa r0 = new X.MGa
            r0.<init>(r4, r15, r1)
            X.C51968G9o.A1P(r0, r3, r2)
            X.0eM r0 = r4.A0O
            java.lang.Object r0 = r0.getValue()
            X.8Mp r0 = (X.C354588Mp) r0
            X.0r6 r1 = r0.A08
            X.MGa r0 = new X.MGa
            r0.<init>(r4, r15, r6)
            X.C51968G9o.A1P(r0, r3, r1)
            return
        L_0x0237:
            r10 = 0
            goto L_0x01a9
        L_0x023a:
            r1 = 0
            goto L_0x0181
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65787Lzf.<init>(android.app.Activity, android.view.View, X.4DH, com.instagram.common.session.UserSession, X.6iH, X.88Z, X.80W, com.instagram.ui.widget.interactive.InteractiveDrawableContainer, boolean):void");
    }

    public final /* synthetic */ void CtK(Drawable drawable) {
    }

    public final /* synthetic */ void CtX() {
    }

    public final /* synthetic */ void CtY() {
    }

    public final /* synthetic */ void CuV(Drawable drawable, int i) {
    }

    public final /* synthetic */ void DAq(Drawable drawable, int i) {
    }

    public final /* synthetic */ void DAr(float f, float f2) {
    }

    public final /* synthetic */ void DAs(Drawable drawable) {
    }

    public final /* synthetic */ void DP7(Drawable drawable, int i, float f, float f2) {
    }

    public final /* synthetic */ void DPH() {
    }

    public final void DdI(Drawable drawable, int i, boolean z) {
        0qQ.A0B(drawable, 1);
        C352168Bz.A02(new C388249nW(drawable, i, z), (C352168Bz) this.A0P.getValue());
    }

    public final /* synthetic */ void DhH(Drawable drawable, float f, float f2, float f3, float f4) {
    }

    public final void DlC(Drawable drawable, int i, float f, float f2) {
        0qQ.A0B(drawable, 1);
        A00(this).A03(drawable, i);
    }

    public final /* synthetic */ void Dsb() {
    }

    public static final C60303Jj2 A00(C65787Lzf lzf) {
        return (C60303Jj2) lzf.A0Q.getValue();
    }

    public static final void A01(C65787Lzf lzf) {
        B3d A092;
        UserSession userSession = lzf.A0B;
        0Tu r2 = 0Tu.A05;
        if (182.A06(r2, userSession, 36319939967131443L)) {
            InteractiveDrawableContainer interactiveDrawableContainer = lzf.A0H;
            ArrayList A0U = interactiveDrawableContainer.A0U(C64452LcA.A00);
            0qQ.A0B(A0U, 0);
            0eP r3 = (0eP) 00k.A0J(A0U);
            boolean A062 = 182.A06(r2, userSession, 36319939968835402L);
            int i = 0;
            if (A062) {
                PinnablesFooterHorizontalScrollView pinnablesFooterHorizontalScrollView = (PinnablesFooterHorizontalScrollView) AnonymousClass7TG.A0Q(lzf.A0N);
                if (r3 == null) {
                    i = 8;
                }
                pinnablesFooterHorizontalScrollView.A00("music_only", i);
            } else if (r3 != null && (A092 = C271404in.A09((Drawable) r3.A01)) != null) {
                lzf.A0C.setVisibility(0);
                C60006JdF jdF = new C60006JdF(AnonymousClass7TE.A0S(interactiveDrawableContainer), userSession, MusicAssetModel.A03(A092.BUu()));
                if (!jdF.A00) {
                    jdF.A00 = true;
                    jdF.A0C.A01();
                    jdF.invalidateSelf();
                }
                IgSimpleImageView igSimpleImageView = (IgSimpleImageView) AnonymousClass7TE.A14(lzf.A0L);
                int i2 = jdF.A04;
                0nA.A0V(igSimpleImageView, jdF.A0A.A05.A06 + i2);
                igSimpleImageView.post(new C65978M6p(igSimpleImageView, jdF));
                View A063 = AnonymousClass7TH.A06(lzf.A0M);
                0nA.A0V(A063, i2);
                0nA.A0f(A063, jdF.getIntrinsicWidth());
                LY8.A00(A063, 70, r3, lzf);
            }
        }
    }

    public static final void A02(C65787Lzf lzf, List list) {
        C252063oV r1 = lzf.A0C;
        if (r1.CVM()) {
            r1.setVisibility(8);
            AnonymousClass7TH.A06(lzf.A0M).setOnClickListener((View.OnClickListener) null);
        }
        InteractiveDrawableContainer interactiveDrawableContainer = lzf.A0H;
        interactiveDrawableContainer.A0v(C64453LcC.A00);
        LinkedHashSet A0y = DbS.A0y();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C61057Jvv jvv = (C61057Jvv) it.next();
            C2802350v r8 = (C2802350v) jvv.A04;
            C39741A7h a7h = (C39741A7h) jvv.A01;
            C310416b1 r3 = (C310416b1) jvv.A00;
            C369458un r9 = (C369458un) jvv.A05;
            Drawable A012 = C39900AIi.A01(AnonymousClass7TE.A0S(interactiveDrawableContainer), lzf.A0B, r8, "");
            if (r3 == null) {
                if (a7h != null) {
                    C39890ADo A002 = AEF.A00(a7h);
                    A002.A05 = 9;
                    A002.A0Q = true;
                    A002.A0R = true;
                    A002.A0C = AnonymousClass000.A00(4402);
                    r3 = new C310416b1(A002);
                } else {
                    r3 = null;
                }
            }
            int A0J2 = interactiveDrawableContainer.A0J(A012, r3);
            if (r9 != null) {
                interactiveDrawableContainer.A0r(A012, r9);
            }
            C273914nO BkW = r8.BkW();
            AnonymousClass7TG.A1O(A012, BkW);
            C352168Bz.A02(new C388239nV(A012, BkW, A0J2), (C352168Bz) lzf.A0P.getValue());
            if (C271404in.A0C(A012)) {
                A01(lzf);
            }
            if (jvv.A02) {
                A0y.add(Integer.valueOf(A0J2));
            }
        }
        ((C352168Bz) lzf.A0P.getValue()).A06(A0y);
    }

    public static final void A03(C65787Lzf lzf, Map map) {
        lzf.A0H.A0Z(map.keySet()).forEach(new TOY(new JG1(33, map, lzf), 0));
    }

    public static final void A04(C65787Lzf lzf, boolean z) {
        C62477KgS kgS;
        C2802350v A002;
        C310416b1 r10;
        InteractiveDrawableContainer interactiveDrawableContainer = lzf.A0H;
        if (interactiveDrawableContainer.getChildCount() != 0) {
            ArrayList A1C = AnonymousClass7TE.A1C();
            for (B2K b2k : interactiveDrawableContainer.getInteractiveDrawables()) {
                C378669Qs r4 = (C378669Qs) b2k;
                Drawable drawable = r4.A0B;
                if (!(drawable instanceof C354798Nk) && (A002 = C394879yq.A00(drawable)) != null) {
                    Object C3s = b2k.C3s();
                    if (C3s instanceof C310416b1) {
                        r10 = (C310416b1) C3s;
                    } else {
                        r10 = null;
                    }
                    int i = r4.A0g;
                    A1C.add(new C61057Jvv((C39741A7h) null, A002, r10, interactiveDrawableContainer.A0N(i), 2, 00k.A0k(((C352168Bz) lzf.A0P.getValue()).A00).contains(Integer.valueOf(i))));
                }
            }
            C354588Mp r3 = (C354588Mp) lzf.A0O.getValue();
            if (z) {
                kgS = C62477KgS.USER_INITIAL;
            } else {
                kgS = C62477KgS.USER_EDITED;
            }
            0eP A1L = AnonymousClass7TE.A1L(kgS, 00k.A0a(A1C));
            r3.A06.set(0, A1L);
            if (A1L.A00 == C62477KgS.USER_INITIAL) {
                r3.A01 = (List) A1L.A01;
            }
        }
    }

    public final void DlE(Drawable drawable, float f, float f2, float f3, float f4, int i) {
        C62759Klx klx;
        UserSession userSession = this.A0B;
        0Tu r2 = 0Tu.A05;
        if (182.A06(r2, userSession, 36319939967590201L) && !182.A06(r2, userSession, 36319939968835402L)) {
            C60303Jj2 A002 = A00(this);
            Integer num = ((L6J) A002.A07.getValue()).A00;
            if (num != null) {
                int intValue = num.intValue();
                if (intValue == 0) {
                    klx = C61762KLb.A00;
                } else if (intValue == 1) {
                    klx = C61763KLc.A00;
                } else if (intValue == 2) {
                    klx = C61764KLd.A00;
                }
                C60303Jj2.A01(klx, A002);
                return;
            }
            A002.A03.A03();
        }
    }

    public final boolean onBackPressed() {
        A00(this).A02();
        return true;
    }
}
