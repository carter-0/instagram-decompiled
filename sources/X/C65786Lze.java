package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.view.View;
import com.instagram.android.R;
import com.instagram.ui.widget.interactive.InteractiveDrawableContainer;

/* renamed from: X.Lze  reason: case insensitive filesystem */
public final class C65786Lze implements AnonymousClass88G {
    public C59987Jcw A00;
    public final float A01;
    public final float A02;
    public final int A03;
    public final int A04;
    public final Context A05;
    public final C71392co A06 = C71392co.A03(6.0d, 40.0d);
    public final AnonymousClass8MX A07;
    public final InteractiveDrawableContainer A08;
    public final AnonymousClass0eM A09 = AnonymousClass1YB.A00(new MM9(this, 35));
    public final AnonymousClass0eM A0A = AnonymousClass1YB.A00(new MM9(this, 36));
    public final AnonymousClass0eM A0B = AnonymousClass1YB.A00(new MM9(this, 37));
    public final AnonymousClass0eM A0C = AnonymousClass1YB.A00(new MM9(this, 38));
    public final AnonymousClass0eM A0D;
    public final AnonymousClass0eM A0E = AnonymousClass1YB.A00(new MM9(this, 40));
    public final AnonymousClass0eM A0F;
    public final float A0G;

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

    public final /* synthetic */ void DdI(Drawable drawable, int i, boolean z) {
    }

    public final /* synthetic */ void DlC(Drawable drawable, int i, float f, float f2) {
    }

    public final /* synthetic */ void DlE(Drawable drawable, float f, float f2, float f3, float f4, int i) {
    }

    public final /* synthetic */ void Dsb() {
    }

    public static final void A00(Drawable drawable, C65786Lze lze, boolean z) {
        int i;
        if (z) {
            i = 2Yu.A0H(lze.A05, R.attr.igds_color_icon_on_white);
        } else {
            i = R.color.canvas_bottom_sheet_description_text_color;
        }
        drawable.setColorFilter(C9162RRn.A00(AnonymousClass05K.A0j, lze.A05.getResources().getColor(i, (Resources.Theme) null)));
    }

    public static final void A01(View view, C65786Lze lze, boolean z) {
        int i;
        GradientDrawable gradientDrawable = new GradientDrawable();
        float f = lze.A02;
        int i2 = (int) f;
        gradientDrawable.setSize(i2, i2);
        gradientDrawable.setShape(0);
        Context context = view.getContext();
        if (z) {
            i = 2Yu.A0H(context, R.attr.igds_color_primary_button_on_media);
        } else {
            i = R.color.igds_secondary_button_on_media_panavision_updated;
        }
        gradientDrawable.setColor(context.getColor(i));
        gradientDrawable.setCornerRadius(0nA.A00(context, f));
        view.setBackground(gradientDrawable);
    }

    public static final void A02(C65786Lze lze) {
        if (Build.VERSION.SDK_INT >= 30) {
            AnonymousClass7TE.A0c(lze.A0D).performHapticFeedback(17);
        }
    }

    public static final void A03(C65786Lze lze) {
        int i = Build.VERSION.SDK_INT;
        View A0c = AnonymousClass7TE.A0c(lze.A0D);
        int i2 = 1;
        if (i >= 30) {
            i2 = 16;
        }
        A0c.performHapticFeedback(i2);
    }

    public final void A05() {
        KL1 kl1;
        Object value;
        int i;
        int i2;
        Object value2;
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z;
        boolean z2;
        boolean z3;
        String str;
        InteractiveDrawableContainer interactiveDrawableContainer = this.A08;
        interactiveDrawableContainer.setBackground((Drawable) null);
        interactiveDrawableContainer.A0z(this);
        interactiveDrawableContainer.A0G = false;
        interactiveDrawableContainer.A0H = false;
        interactiveDrawableContainer.A0c();
        if (this.A0D.CVQ()) {
            AnonymousClass7TE.A0c(this.A0A).setVisibility(8);
            float f = this.A02;
            int i7 = this.A03;
            C294975nL A0c = JTP.A0c(AnonymousClass7TH.A06(this.A0C), 0);
            C71392co r1 = this.A06;
            C294975nL A0F2 = A0c.A0E(r1).A0F(false);
            A0F2.A0J(f + ((float) i7));
            C65724Lye.A00(A0F2, this, 8);
            float f2 = -((float) (this.A04 + i7));
            C294975nL A0F3 = JTP.A0c(AnonymousClass7TH.A06(this.A0B), 0).A0E(r1).A0F(false);
            A0F3.A0J(f2);
            C65724Lye.A00(A0F3, this, 7);
        }
        C60278JiZ jiZ = (C60278JiZ) this.A0F.getValue();
        05G r2 = jiZ.A0A;
        Object value3 = r2.getValue();
        if ((value3 instanceof KL1) && (kl1 = (KL1) value3) != null) {
            boolean z4 = kl1.A05;
            if (z4) {
                do {
                    value2 = r2.getValue();
                    i3 = jiZ.A03;
                    i4 = kl1.A00;
                    i5 = kl1.A01;
                    i6 = kl1.A03;
                    z = kl1.A07;
                    z2 = kl1.A04;
                    z3 = kl1.A06;
                } while (!r2.AIY(value2, new KL1(i4, i5, i3, i6, z, z4, z2, z3)));
                C60278JiZ.A00(new KL4(i4, !z3), jiZ);
                27r A012 = 27p.A01(jiZ.A07);
                C59725JVj jVj = A012.A04.A0C;
                if (z3) {
                    str = "LAYER_UNLOCK";
                } else {
                    str = "LAYER_LOCK";
                }
                A012.A1Q(jVj, str);
            }
            boolean z5 = kl1.A04;
            if (z5) {
                do {
                    value = r2.getValue();
                    i = jiZ.A03;
                    i2 = kl1.A00;
                } while (!r2.AIY(value, new KL1(i2, kl1.A01, i, kl1.A03, kl1.A07, z4, z5, kl1.A06)));
                27r A013 = 27p.A01(jiZ.A07);
                A013.A1Q(A013.A04.A0C, "LAYER_COLOR");
                C60278JiZ.A00(new KL3(i2), jiZ);
            }
        }
        jiZ.A00 = 0.0f;
        r2.Epw(KL2.A00);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x015f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A06(float r20, float r21, int r22, boolean r23) {
        /*
            r19 = this;
            r7 = r19
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r6 = r7.A08
            java.util.List r0 = r6.getAllDrawables()
            int r14 = r0.size()
            r11 = r22
            X.B3f r3 = r6.A0P(r11)
            if (r3 == 0) goto L_0x003c
            r0 = r3
            X.9Qs r0 = (X.C378669Qs) r0
            int r0 = r0.A08
            java.util.ArrayList r0 = com.instagram.ui.widget.interactive.InteractiveDrawableContainer.A03(r6, r0)
            r13 = 0
            java.util.Iterator r2 = r0.iterator()
        L_0x0022:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x003c
            java.lang.Object r1 = r2.next()
            int r0 = r13 + 1
            if (r13 >= 0) goto L_0x0038
            X.0sr.A1T()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0038:
            if (r1 == r3) goto L_0x003d
            r13 = r0
            goto L_0x0022
        L_0x003c:
            r13 = -1
        L_0x003d:
            int r12 = r6.A0I(r11)
            boolean r0 = r6.A12(r11)
            r10 = r0 ^ 1
            boolean r0 = r6.A11(r11)
            r9 = r0 ^ 1
            X.B3f r0 = r6.A0P(r11)
            r5 = 1
            if (r0 == 0) goto L_0x0161
            X.9Qs r0 = (X.C378669Qs) r0
            boolean r0 = r0.A0N
            if (r0 != r5) goto L_0x0161
        L_0x005a:
            android.content.Context r1 = r7.A05
            r0 = 2131099791(0x7f06008f, float:1.7811945E38)
            X.DbT.A16(r1, r6, r0)
            r6.A0y(r7)
            r6.A0a()
            X.0eM r0 = r7.A0A
            android.view.View r0 = X.AnonymousClass7TE.A0c(r0)
            r15 = 0
            r0.setVisibility(r15)
            X.0eM r0 = r7.A0D
            X.DbW.A1R(r0, r15)
            X.0eM r0 = r7.A0E
            X.JTS.A1W(r0, r15)
            if (r23 == 0) goto L_0x0083
            X.0eM r0 = r7.A09
            X.JTS.A1W(r0, r15)
        L_0x0083:
            X.0eM r3 = r7.A0C
            X.JTS.A1W(r3, r15)
            android.view.View r4 = X.AnonymousClass7TH.A06(r3)
            float r2 = r7.A02
            int r8 = r7.A03
            float r0 = (float) r8
            float r2 = r2 + r0
            r4.setTranslationX(r2)
            r4 = 0
            android.view.View r0 = X.AnonymousClass7TH.A06(r3)
            X.5nL r0 = X.JTP.A0c(r0, r15)
            X.2co r3 = r7.A06
            X.5nL r0 = r0.A0E(r3)
            X.5nL r0 = r0.A0F(r15)
            r0.A0J(r4)
            r0.A0H()
            X.Jcw r0 = new X.Jcw
            r0.<init>(r1, r14, r12)
            r7.A00 = r0
            X.0eM r2 = r7.A0B
            android.widget.ImageView r1 = X.JTR.A0Z(r2)
            X.Jcw r0 = r7.A00
            r1.setImageDrawable(r0)
            android.view.View r1 = X.AnonymousClass7TH.A06(r2)
            int r0 = r7.A04
            int r0 = r0 + r8
            float r0 = (float) r0
            float r0 = -r0
            r1.setTranslationX(r0)
            X.JTS.A1W(r2, r15)
            android.view.View r0 = X.AnonymousClass7TH.A06(r2)
            X.5nL r0 = X.JTP.A0c(r0, r15)
            X.5nL r0 = r0.A0E(r3)
            X.5nL r0 = r0.A0F(r15)
            r0.A0J(r4)
            r0.A0H()
            r2 = 1
            r6.A0G = r2
            r6.A0H = r2
            X.0eM r0 = r7.A0F
            java.lang.Object r1 = r0.getValue()
            X.JiZ r1 = (X.C60278JiZ) r1
            X.B3f r0 = r6.A0P(r11)
            if (r0 == 0) goto L_0x015f
            X.9Qs r0 = (X.C378669Qs) r0
            int r0 = r0.A08
            java.util.ArrayList r0 = com.instagram.ui.widget.interactive.InteractiveDrawableContainer.A03(r6, r0)
            int r3 = r0.size()
        L_0x0104:
            r1.A04 = r10
            r1.A05 = r9
            int r0 = r3 + -1
            r1.A02 = r0
            r1.A03 = r13
            float r21 = r21 - r20
            int r3 = r3 - r13
            float r0 = (float) r3
            float r21 = r21 / r0
            float r0 = (float) r13
            float r20 = r20 / r0
            r7 = 3
            float[] r6 = new float[r7]
            float r0 = r1.A06
            r6[r15] = r0
            r6[r2] = r21
            r0 = 2
            r6[r0] = r20
            r4 = 1
            r3 = r6[r15]
        L_0x0126:
            r0 = r6[r4]
            float r3 = java.lang.Math.min(r3, r0)
            int r4 = r4 + 1
            if (r4 < r7) goto L_0x0126
            r1.A01 = r3
            X.05G r0 = r1.A0A
            X.KL1 r10 = new X.KL1
            r16 = r15
            r17 = r15
            r18 = r5
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18)
            r0.Epw(r10)
            com.instagram.common.session.UserSession r5 = r1.A07
            X.1Av r4 = X.1Au.A00(r5)
            X.0s0 r3 = r4.A20
            X.0YZ[] r1 = X.1Av.A8a
            r0 = 458(0x1ca, float:6.42E-43)
            X.AnonymousClass7TF.A1J(r4, r3, r1, r0, r2)
            X.27r r2 = X.27p.A01(r5)
            X.283 r0 = r2.A04
            X.JVj r1 = r0.A0C
            java.lang.String r0 = "LAYER_SELECT"
            r2.A1Q(r1, r0)
            return
        L_0x015f:
            r3 = 0
            goto L_0x0104
        L_0x0161:
            r5 = 0
            goto L_0x005a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65786Lze.A06(float, float, int, boolean):void");
    }

    public final void DhH(Drawable drawable, float f, float f2, float f3, float f4) {
        String str;
        Object value;
        KL1 kl1;
        C62755Klt klt;
        27r r3;
        C59725JVj jVj;
        String str2;
        KL1 kl12;
        Object value2;
        KL1 kl13;
        27r A012;
        C59725JVj jVj2;
        String str3;
        KL1 kl14;
        Object value3;
        KL1 kl15;
        Object value4;
        KL1 kl16;
        C60278JiZ jiZ = (C60278JiZ) this.A0F.getValue();
        float f5 = f3;
        float f6 = f4;
        boolean A042 = A04(AnonymousClass7TH.A06(this.A0E), f5, f6);
        boolean A043 = A04(AnonymousClass7TH.A06(this.A09), f5, f6);
        05G r2 = jiZ.A0A;
        if (r2.getValue() instanceof KL1) {
            do {
                value4 = r2.getValue();
                C62754Kls kls = (C62754Kls) value4;
                0qQ.A0C(kls, "null cannot be cast to non-null type com.instagram.creation.capture.quickcapture.layering.viewmodel.LayeringToolViewModel.UiState.LayeringToolOpen");
                kl16 = (KL1) kls;
            } while (!r2.AIY(value4, new KL1(kl16.A00, kl16.A01, kl16.A02, kl16.A03, kl16.A07, A042, A043, kl16.A06)));
        }
        float f7 = jiZ.A00 + f2;
        jiZ.A00 = f7;
        float f8 = jiZ.A01;
        if (f7 >= f8) {
            jiZ.A00 = 0.0f;
            Object value5 = r2.getValue();
            if ((value5 instanceof KL1) && (kl14 = (KL1) value5) != null) {
                int i = kl14.A02;
                str = "null cannot be cast to non-null type com.instagram.creation.capture.quickcapture.layering.viewmodel.LayeringToolViewModel.UiState.LayeringToolOpen";
                if (i < jiZ.A02) {
                    do {
                        value3 = r2.getValue();
                        C62754Kls kls2 = (C62754Kls) value3;
                        0qQ.A0C(kls2, str);
                        kl15 = (KL1) kls2;
                    } while (!r2.AIY(value3, new KL1(kl15.A00, kl14.A01 + 1, i + 1, kl15.A03, false, kl15.A05, kl15.A04, kl15.A06)));
                    r3 = 27p.A01(jiZ.A07);
                    jVj = r3.A04.A0C;
                    str2 = "LAYER_UP";
                    r3.A1Q(jVj, str2);
                    klt = KL6.A00;
                    C60278JiZ.A00(klt, jiZ);
                } else if (jiZ.A04) {
                    if (!kl14.A07) {
                        A012 = 27p.A01(jiZ.A07);
                        jVj2 = A012.A04.A0C;
                        str3 = "LAYER_UP_FAIL";
                    }
                    do {
                        value = r2.getValue();
                        C62754Kls kls3 = (C62754Kls) value;
                        0qQ.A0C(kls3, str);
                        kl1 = (KL1) kls3;
                    } while (!r2.AIY(value, new KL1(kl1.A00, kl1.A01, kl1.A02, kl1.A03, true, kl1.A05, kl1.A04, kl1.A06)));
                    klt = KL5.A00;
                    C60278JiZ.A00(klt, jiZ);
                } else {
                    return;
                }
            } else {
                return;
            }
        } else if ((-f7) >= f8) {
            jiZ.A00 = 0.0f;
            Object value6 = r2.getValue();
            if ((value6 instanceof KL1) && (kl12 = (KL1) value6) != null) {
                int i2 = kl12.A02;
                str = "null cannot be cast to non-null type com.instagram.creation.capture.quickcapture.layering.viewmodel.LayeringToolViewModel.UiState.LayeringToolOpen";
                if (i2 > 0) {
                    do {
                        value2 = r2.getValue();
                        C62754Kls kls4 = (C62754Kls) value2;
                        0qQ.A0C(kls4, str);
                        kl13 = (KL1) kls4;
                    } while (!r2.AIY(value2, new KL1(kl13.A00, kl12.A01 - 1, i2 - 1, kl13.A03, false, kl13.A05, kl13.A04, kl13.A06)));
                    r3 = 27p.A01(jiZ.A07);
                    jVj = r3.A04.A0C;
                    str2 = "LAYER_DOWN";
                    r3.A1Q(jVj, str2);
                    klt = KL6.A00;
                    C60278JiZ.A00(klt, jiZ);
                } else if (jiZ.A05) {
                    if (!kl12.A07) {
                        A012 = 27p.A01(jiZ.A07);
                        jVj2 = A012.A04.A0C;
                        str3 = "LAYER_DOWN_FAIL";
                    }
                    do {
                        value = r2.getValue();
                        C62754Kls kls32 = (C62754Kls) value;
                        0qQ.A0C(kls32, str);
                        kl1 = (KL1) kls32;
                    } while (!r2.AIY(value, new KL1(kl1.A00, kl1.A01, kl1.A02, kl1.A03, true, kl1.A05, kl1.A04, kl1.A06)));
                    klt = KL5.A00;
                    C60278JiZ.A00(klt, jiZ);
                } else {
                    return;
                }
            } else {
                return;
            }
        } else {
            return;
        }
        A012.A1Q(jVj2, str3);
        do {
            value = r2.getValue();
            C62754Kls kls322 = (C62754Kls) value;
            0qQ.A0C(kls322, str);
            kl1 = (KL1) kls322;
        } while (!r2.AIY(value, new KL1(kl1.A00, kl1.A01, kl1.A02, kl1.A03, true, kl1.A05, kl1.A04, kl1.A06)));
        klt = KL5.A00;
        C60278JiZ.A00(klt, jiZ);
    }

    /* JADX WARNING: type inference failed for: r10v0, types: [X.07Z, androidx.fragment.app.Fragment, java.lang.Object, X.4DH] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C65786Lze(android.view.View r9, X.AnonymousClass4DH r10, com.instagram.common.session.UserSession r11, X.AnonymousClass8MX r12, com.instagram.ui.widget.interactive.InteractiveDrawableContainer r13) {
        /*
            r8 = this;
            r8.<init>()
            r8.A08 = r13
            r8.A07 = r12
            android.content.Context r6 = r10.requireContext()
            r8.A05 = r6
            r0 = 27
            X.MJ9 r7 = new X.MJ9
            r7.<init>(r0, r11, r8)
            r0 = 41
            X.MM9 r3 = new X.MM9
            r3.<init>(r10, r0)
            X.0eO r2 = X.0eO.A02
            r1 = 42
            X.MM9 r0 = new X.MM9
            r0.<init>(r3, r1)
            X.0eM r5 = X.AnonymousClass0eN.A00(r2, r0)
            java.lang.Class<X.JiZ> r0 = X.C60278JiZ.class
            X.0Yh r3 = X.DbS.A0z(r0)
            r0 = 43
            X.MM9 r2 = new X.MM9
            r2.<init>(r5, r0)
            r4 = 0
            r1 = 26
            X.MJ9 r0 = new X.MJ9
            r0.<init>(r1, r4, r5)
            X.2kA r0 = X.DbS.A0I(r2, r7, r0, r3)
            r8.A0F = r0
            r1 = 39
            X.MM9 r0 = new X.MM9
            r0.<init>(r9, r1)
            X.0eM r0 = X.AnonymousClass1YB.A00(r0)
            r8.A0D = r0
            r1 = 37
            X.MM9 r0 = new X.MM9
            r0.<init>(r8, r1)
            X.0eM r0 = X.AnonymousClass1YB.A00(r0)
            r8.A0B = r0
            r1 = 38
            X.MM9 r0 = new X.MM9
            r0.<init>(r8, r1)
            X.0eM r0 = X.AnonymousClass1YB.A00(r0)
            r8.A0C = r0
            r1 = 40
            X.MM9 r0 = new X.MM9
            r0.<init>(r8, r1)
            X.0eM r0 = X.AnonymousClass1YB.A00(r0)
            r8.A0E = r0
            r5 = 35
            X.MM9 r0 = new X.MM9
            r0.<init>(r8, r5)
            X.0eM r0 = X.AnonymousClass1YB.A00(r0)
            r8.A09 = r0
            r1 = 36
            X.MM9 r0 = new X.MM9
            r0.<init>(r8, r1)
            X.0eM r0 = X.AnonymousClass1YB.A00(r0)
            r8.A0A = r0
            r2 = 4618441417868443648(0x4018000000000000, double:6.0)
            r0 = 4630826316843712512(0x4044000000000000, double:40.0)
            X.2co r0 = X.C71392co.A03(r2, r0)
            r8.A06 = r0
            int r0 = X.JTR.A07(r6)
            r8.A04 = r0
            int r0 = X.DbY.A01(r6)
            r8.A03 = r0
            android.content.res.Resources r0 = r6.getResources()
            r1 = 2131165250(0x7f070042, float:1.7944712E38)
            float r0 = X.AnonymousClass7TE.A01(r0, r1)
            r8.A01 = r0
            int r0 = X.AnonymousClass7TF.A02(r6, r1)
            float r0 = (float) r0
            r8.A02 = r0
            int r0 = X.AnonymousClass7TG.A02(r6)
            float r0 = (float) r0
            r8.A0G = r0
            X.0xx r1 = X.DbW.A0E(r10)
            r0 = 10
            X.AnonymousClass7TF.A1K(r8, r1, r0)
            X.0eM r0 = r8.A0F
            java.lang.Object r0 = r0.getValue()
            X.JiZ r0 = (X.C60278JiZ) r0
            X.0r6 r1 = r0.A09
            X.MGa r0 = new X.MGa
            r0.<init>(r8, r4, r5)
            X.JTS.A10(r10, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65786Lze.<init>(android.view.View, X.4DH, com.instagram.common.session.UserSession, X.8MX, com.instagram.ui.widget.interactive.InteractiveDrawableContainer):void");
    }

    private final boolean A04(View view, float f, float f2) {
        if (view.getVisibility() == 8) {
            return false;
        }
        Rect A0W = AnonymousClass7TE.A0W();
        int[] iArr = new int[2];
        view.getDrawingRect(A0W);
        view.getLocationOnScreen(iArr);
        A0W.offset(iArr[0], iArr[1]);
        int i = (int) (-this.A0G);
        A0W.inset(i, i);
        return A0W.contains((int) f, (int) f2);
    }
}
