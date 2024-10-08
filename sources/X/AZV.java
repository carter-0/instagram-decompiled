package X;

import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextPaint;
import android.transition.TransitionManager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

public final class AZV implements C252213ok, B21 {
    public C387339m3 A00;
    public String A01;
    public final Context A02;
    public final Fragment A03;
    public final UserSession A04;
    public final C3499582p A05;
    public final AnonymousClass0eM A06 = A00(this, 19);
    public final AnonymousClass0eM A07;
    public final AnonymousClass0eM A08;
    public final AnonymousClass0eM A09 = A00(this, 22);
    public final AnonymousClass0eM A0A;
    public final AnonymousClass0eM A0B = A00(this, 24);
    public final AnonymousClass0eM A0C = A00(this, 25);
    public final AnonymousClass0eM A0D;
    public final AnonymousClass0eM A0E = A00(this, 27);
    public final AnonymousClass0eM A0F = A00(this, 28);
    public final AnonymousClass0eM A0G = A00(this, 29);
    public final AnonymousClass0eM A0H = A00(this, 30);
    public final AnonymousClass3E6 A0I;
    public final C354538Mk A0J;
    public final AnonymousClass80U A0K;
    public final AnonymousClass8MF A0L;
    public final C358358am A0M;
    public final String A0N;

    public AZV(View view, Fragment fragment, UserSession userSession, AnonymousClass3E6 r5, C354538Mk r6, C3499582p r7, AnonymousClass80U r8, AnonymousClass8MF r9, C358358am r10, String str) {
        AnonymousClass7TF.A1F(str, 3, r10);
        0qQ.A0B(r6, 9);
        this.A04 = userSession;
        this.A05 = r7;
        this.A0N = str;
        this.A0K = r8;
        this.A0I = r5;
        this.A0L = r9;
        this.A0M = r10;
        this.A0J = r6;
        this.A03 = fragment;
        this.A02 = view.getContext();
        this.A08 = A00(view, 21);
        this.A0D = A00(view, 26);
        this.A0A = A00(view, 23);
        this.A07 = A00(this, 20);
    }

    public static 0t0 A00(Object obj, int i) {
        return AnonymousClass0eN.A01(new MM9(obj, i));
    }

    private final void A01(int i) {
        AnonymousClass0eM r3 = this.A06;
        ViewGroup.LayoutParams layoutParams = AnonymousClass7TE.A0c(r3).getLayoutParams();
        0qQ.A0C(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        C71492dQ r2 = (C71492dQ) layoutParams;
        if (r2.A0W != i) {
            View A0c = AnonymousClass7TE.A0c(this.A0B);
            0qQ.A0C(A0c, "null cannot be cast to non-null type android.view.ViewGroup");
            TransitionManager.beginDelayedTransition((ViewGroup) A0c);
            r2.A0W = i;
            AnonymousClass7TE.A0c(r3).setLayoutParams(r2);
            AnonymousClass8MF r0 = this.A0L;
            boolean A1Q = AnonymousClass7TF.A1Q(i);
            View[] viewArr = {((AnonymousClass8ME) r0).A1k};
            if (A1Q) {
                C71392co r02 = C315596kB.A02;
                C294975nL.A04((C295005nO) null, viewArr, false);
                return;
            }
            C315596kB.A08(viewArr, false);
        }
    }

    public static final void A02(AZV azv) {
        C387339m3 r0 = azv.A00;
        if (r0 != null) {
            String str = r0.A00.A03;
            if (str == null || str.length() == 0) {
                str = "@";
            }
            ((TextView) azv.A0E.getValue()).setText(str);
            ImageView imageView = (ImageView) azv.A09.getValue();
            Context context = azv.A02;
            0qQ.A06(context);
            String str2 = azv.A0N;
            C387339m3 r1 = azv.A00;
            if (r1 != null) {
                imageView.setImageDrawable(new C386029jw(context, r1, str2));
                AnonymousClass8MF r3 = azv.A0L;
                C387339m3 r2 = azv.A00;
                if (r2 != null) {
                    boolean z = true;
                    if (r2.A06.size() + r2.A05.size() <= 1) {
                        z = false;
                    }
                    ((AnonymousClass8ME) r3).A1Q(z);
                    return;
                }
            }
        }
        0qQ.A0F("model");
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A03(AZV azv, boolean z) {
        Drawable background = AnonymousClass7TE.A0c(azv.A0F).getBackground();
        C387339m3 r0 = azv.A00;
        if (r0 != null) {
            background.setTint(C39578A0u.A00(r0));
            AnonymousClass0eM r2 = azv.A0E;
            TextPaint paint = ((TextView) r2.getValue()).getPaint();
            Context context = azv.A02;
            0qQ.A06(context);
            C387339m3 r1 = azv.A00;
            if (r1 != null) {
                TextPaint paint2 = ((TextView) r2.getValue()).getPaint();
                0qQ.A07(paint2);
                int[] A002 = C39577A0t.A00(context, r1);
                String str = r1.A00.A03;
                if (str == null || str.length() == 0) {
                    str = "@";
                }
                paint.setShader(new LinearGradient(0.0f, 0.0f, paint2.measureText(str), 0.0f, A002, (float[]) null, Shader.TileMode.CLAMP));
                W0V.A02((TextView) r2.getValue(), AIJ.A01(context, AnonymousClass7TF.A0f((EditText) r2.getValue())));
                AnonymousClass7TE.A0c(r2).requestLayout();
                if (z) {
                    ImageView imageView = (ImageView) azv.A09.getValue();
                    String str2 = azv.A0N;
                    C387339m3 r12 = azv.A00;
                    if (r12 != null) {
                        imageView.setImageDrawable(new C386029jw(context, r12, str2));
                        return;
                    }
                } else {
                    return;
                }
            }
        }
        0qQ.A0F("model");
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A04(AZV azv, boolean z) {
        String str;
        Editable text;
        AnonymousClass0eM r0 = azv.A0E;
        TextView textView = (TextView) r0.getValue();
        if (!z || !((text = ((EditText) r0.getValue()).getText()) == null || text.length() == 0)) {
            str = null;
        } else {
            str = azv.A02.getString(2131963195);
        }
        textView.setHint(str);
    }

    public static final void A05(AZV azv, boolean z) {
        Fragment fragment = azv.A03;
        Fragment A0R = fragment.getChildFragmentManager().A0R("group_mention_search_fragment_tag");
        if (A0R != null) {
            0s1 r3 = new 0s1(fragment.getChildFragmentManager());
            r3.A07(R.anim.bottom_in, R.anim.bottom_out, 0, 0);
            if (z) {
                r3.A08(A0R);
            } else {
                r3.A02(A0R);
                azv.A01(0);
            }
            r3.A01();
            int i = 2131963203;
            if (z) {
                i = 2131963202;
            }
            AnonymousClass0eM r32 = azv.A0G;
            AnonymousClass7TE.A0c(r32).getHandler().removeCallbacksAndMessages((Object) null);
            ((TextView) r32.getValue()).setText(AnonymousClass7TE.A0c(r32).getContext().getString(i));
            C294975nL.A04((C295005nO) null, new View[]{AnonymousClass7TE.A0c(r32)}, true);
            AnonymousClass7TE.A0c(r32).getHandler().postDelayed(new C40820Ajq(azv), 2500);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x01c5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DCS(java.lang.Object r27) {
        /*
            r26 = this;
            r0 = r27
            r2 = 0
            X.0qQ.A0B(r0, r2)
            X.8Tq r0 = (X.C356378Tq) r0
            X.9m3 r1 = r0.A00
            r13 = r26
            if (r1 != 0) goto L_0x003f
            X.8am r4 = r13.A0M
            X.82p r0 = r13.A05
            X.82o r0 = r0.A02
            X.82Y r0 = r0.A01
            java.lang.String r3 = r0.A05()
            X.0eE r1 = X.AnonymousClass0t1.A01
            com.instagram.common.session.UserSession r0 = r13.A04
            com.instagram.user.model.User r0 = r1.A01(r0)
            java.util.List r10 = X.AnonymousClass7TE.A1I(r0)
            r7 = 0
            java.lang.String r8 = ""
            java.lang.Integer r6 = java.lang.Integer.valueOf(r2)
            com.instagram.api.schemas.StoryGroupMentionTappableData r5 = new com.instagram.api.schemas.StoryGroupMentionTappableData
            r9 = r7
            r5.<init>(r6, r7, r8, r9, r10)
            X.9m3 r1 = new X.9m3
            r1.<init>(r5)
            X.JwE r0 = new X.JwE
            r0.<init>((X.C387339m3) r1, (java.lang.String) r3)
            r4.A00 = r0
        L_0x003f:
            r13.A00 = r1
            java.lang.String r11 = "model"
            java.lang.String r0 = r1.A04
            int r0 = r0.length()
            if (r0 != 0) goto L_0x01b8
            X.82p r0 = r13.A05
            X.82o r4 = r0.A02
            X.82Y r0 = r4.A01
            java.util.List r0 = r0.A0m
            int r0 = r0.size()
            r3 = 1
            if (r0 <= r3) goto L_0x0068
            X.9m3 r1 = r13.A00
            if (r1 == 0) goto L_0x00a0
            java.lang.String r0 = r1.A02
            if (r0 != 0) goto L_0x0068
            java.lang.String r0 = X.AnonymousClass7TF.A0b()
            r1.A02 = r0
        L_0x0068:
            java.lang.String r0 = X.AnonymousClass7TF.A0b()
            r13.A01 = r0
            X.3E6 r0 = r13.A0I
            r0.A9Y(r13)
            androidx.fragment.app.Fragment r8 = r13.A03
            X.0hq r0 = r8.getChildFragmentManager()
            java.lang.String r5 = "group_mention_search_fragment_tag"
            androidx.fragment.app.Fragment r0 = r0.A0R(r5)
            if (r0 != 0) goto L_0x00e5
            X.8nh r1 = r4.A00()
            com.instagram.common.session.UserSession r12 = r13.A04
            X.9m3 r0 = r13.A00
            if (r0 == 0) goto L_0x00a0
            java.util.List r9 = r0.A05
            java.util.List r7 = r0.A06
            java.lang.String r6 = r1.A06
            X.0qQ.A07(r6)
            X.8nd r0 = r4.A01()
            java.lang.String r4 = r0.A01
            java.lang.String r1 = r13.A01
            if (r1 != 0) goto L_0x00a8
            java.lang.String r11 = "sessionId"
        L_0x00a0:
            X.0qQ.A0F(r11)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x00a8:
            r15 = 0
            android.content.Context r10 = r13.A02
            r0 = 2131963204(0x7f132d44, float:1.9563155E38)
            java.lang.String r19 = r10.getString(r0)
            r22 = -1
            X.EW0 r14 = X.EW0.ANYTIME_MENTION
            r17 = r4
            r18 = r1
            r20 = r9
            r21 = r7
            r23 = r2
            r24 = r2
            r25 = r2
            r16 = r6
            X.E5n r1 = X.C49097EpM.A00(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            X.0hq r0 = r8.getChildFragmentManager()
            X.0s1 r4 = new X.0s1
            r4.<init>(r0)
            r0 = 2131433673(0x7f0b18c9, float:1.8489138E38)
            r4.A0C(r1, r5, r0)
            r1 = 2130771974(0x7f010006, float:1.7147053E38)
            r0 = 2130771975(0x7f010007, float:1.7147055E38)
            r4.A07(r1, r0, r2, r2)
            r4.A01()
        L_0x00e5:
            X.0eM r4 = r13.A0D
            java.lang.Object r0 = r4.getValue()
            X.3oV r0 = (X.C252063oV) r0
            boolean r0 = r0.CVM()
            if (r0 != 0) goto L_0x0196
            X.0eM r1 = r13.A07
            android.view.View r0 = X.AnonymousClass7TH.A06(r1)
            X.3NG r5 = X.AnonymousClass7TE.A0m(r0)
            r10 = 2
            android.view.View r1 = X.AnonymousClass7TH.A06(r1)
            X.0eM r9 = r13.A0F
            android.view.View r0 = X.AnonymousClass7TE.A0c(r9)
            android.view.View[] r0 = new android.view.View[]{r1, r0}
            r5.A02(r0)
            r0 = 8
            X.C386359kT.A01(r5, r13, r0)
            X.0eM r6 = r13.A09
            android.view.View r0 = X.AnonymousClass7TE.A0c(r6)
            X.3NG r1 = X.AnonymousClass7TE.A0m(r0)
            android.view.View r0 = X.AnonymousClass7TE.A0c(r6)
            android.view.View[] r0 = new android.view.View[]{r0}
            r1.A02(r0)
            r0 = 9
            X.C386359kT.A01(r1, r13, r0)
            X.0eM r8 = r13.A0E
            java.lang.Object r5 = r8.getValue()
            android.widget.TextView r5 = (android.widget.TextView) r5
            r1 = 3
            X.FPM r0 = new X.FPM
            r0.<init>(r13, r1)
            r5.setOnFocusChangeListener(r0)
            X.FKk r0 = new X.FKk
            r0.<init>(r13, r10)
            r5.addTextChangedListener(r0)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>(r10)
            android.text.InputFilter[] r0 = r5.getFilters()
            X.0tw.A00(r0, r7)
            java.lang.Object r6 = r6.getValue()
            com.instagram.common.ui.base.IgSimpleImageView r6 = (com.instagram.common.ui.base.IgSimpleImageView) r6
            android.view.View r1 = X.AnonymousClass7TE.A0c(r9)
            X.ALc r0 = new X.ALc
            r0.<init>(r1, r5, r6)
            r7.add(r0)
            int r0 = r7.size()
            android.text.InputFilter[] r0 = new android.text.InputFilter[r0]
            java.lang.Object[] r0 = r7.toArray(r0)
            android.text.InputFilter[] r0 = (android.text.InputFilter[]) r0
            r5.setFilters(r0)
            android.content.Context r0 = X.AnonymousClass7TE.A0S(r5)
            android.graphics.Typeface r0 = X.AnonymousClass7TG.A0O(r0)
            r5.setTypeface(r0)
            java.lang.Object r0 = r8.getValue()
            android.widget.TextView r0 = (android.widget.TextView) r0
            android.content.res.ColorStateList r1 = r0.getTextColors()
            r0 = 119(0x77, float:1.67E-43)
            android.content.res.ColorStateList r0 = r1.withAlpha(r0)
            int r0 = r0.getDefaultColor()
            r5.setHintTextColor(r0)
        L_0x0196:
            A02(r13)
            A05(r13, r3)
            X.0eM r0 = r13.A08
            android.view.View r1 = X.AnonymousClass7TE.A0c(r0)
            android.view.View r0 = X.AnonymousClass7TG.A0Q(r4)
            android.view.View[] r1 = new android.view.View[]{r1, r0}
            r0 = 0
            X.C294975nL.A04(r0, r1, r2)
            X.0eM r0 = r13.A0A
            android.view.View r0 = X.AnonymousClass7TE.A0c(r0)
            X.AnonymousClass7TE.A1U(r0, r2)
            goto L_0x01bf
        L_0x01b8:
            X.80U r1 = r13.A0K
            X.8T3 r0 = X.AnonymousClass8T3.A00
            r1.E3H(r0)
        L_0x01bf:
            X.8Mk r2 = r13.A0J
            X.9m3 r0 = r13.A00
            if (r0 == 0) goto L_0x00a0
            java.lang.String r1 = r0.A04
            int r0 = r1.length()
            if (r0 != 0) goto L_0x01cf
            java.lang.String r1 = "group_mention_sticker_bundle_id"
        L_0x01cf:
            r2.DnE(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AZV.DCS(java.lang.Object):void");
    }

    public final void DDW() {
        this.A0I.EEH(this);
        AnonymousClass8MF r1 = this.A0L;
        C387339m3 r0 = this.A00;
        if (r0 != null) {
            String str = "group_mention_sticker_bundle_id";
            r1.Dn8(r0, str);
            AnonymousClass0eM r5 = this.A0D;
            if (((C252063oV) r5.getValue()).CVM()) {
                Fragment fragment = this.A03;
                Fragment A0R = fragment.getChildFragmentManager().A0R("group_mention_search_fragment_tag");
                if (A0R != null) {
                    0s1 r02 = new 0s1(fragment.getChildFragmentManager());
                    r02.A03(A0R);
                    r02.A01();
                }
                C294975nL.A05(new View[]{(View) this.A08.getValue(), AnonymousClass7TG.A0Q(r5)}, false);
            }
            C354538Mk r2 = this.A0J;
            C387339m3 r03 = this.A00;
            if (r03 != null) {
                String str2 = r03.A04;
                if (str2.length() != 0) {
                    str = str2;
                }
                r2.Dn9(str);
                return;
            }
        }
        0qQ.A0F("model");
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000d, code lost:
        if (X.AnonymousClass7TE.A0c(r4.A0E).hasFocus() == false) goto L_0x000f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DMr(int r5, boolean r6) {
        /*
            r4 = this;
            if (r5 == 0) goto L_0x000f
            X.0eM r0 = r4.A0E
            android.view.View r0 = X.AnonymousClass7TE.A0c(r0)
            boolean r1 = r0.hasFocus()
            r0 = 0
            if (r1 != 0) goto L_0x0010
        L_0x000f:
            r0 = 1
        L_0x0010:
            A05(r4, r0)
            if (r5 != 0) goto L_0x001e
            X.0eM r0 = r4.A0B
            android.view.View r0 = X.AnonymousClass7TE.A0c(r0)
            r0.clearFocus()
        L_0x001e:
            androidx.fragment.app.Fragment r0 = r4.A03
            X.0hq r1 = r0.getChildFragmentManager()
            java.lang.String r0 = "group_mention_search_fragment_tag"
            androidx.fragment.app.Fragment r0 = r1.A0R(r0)
            if (r0 == 0) goto L_0x006b
            boolean r0 = r0.mDetached
            if (r0 != 0) goto L_0x006b
            android.content.Context r0 = r4.A02
            android.util.DisplayMetrics r0 = X.AnonymousClass7TF.A0E(r0)
            int r1 = r0.heightPixels
            X.0eM r3 = r4.A0B
            android.view.View r0 = X.AnonymousClass7TE.A0c(r3)
            int r0 = r0.getHeight()
            int r1 = r1 - r0
            int r5 = r5 - r1
            r0 = 0
            int r0 = java.lang.Math.max(r5, r0)
            r4.A01(r0)
            if (r0 != 0) goto L_0x006c
            r2 = 1059481190(0x3f266666, float:0.65)
        L_0x0051:
            X.0eM r3 = r4.A0H
            android.view.View r0 = X.AnonymousClass7TE.A0c(r3)
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            java.lang.String r0 = "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams"
            X.0qQ.A0C(r1, r0)
            X.2dQ r1 = (X.C71492dQ) r1
            r1.A05 = r2
            android.view.View r0 = X.AnonymousClass7TE.A0c(r3)
            r0.setLayoutParams(r1)
        L_0x006b:
            return
        L_0x006c:
            r2 = 1065353216(0x3f800000, float:1.0)
            float r1 = (float) r0
            android.view.View r0 = X.AnonymousClass7TE.A0c(r3)
            int r0 = r0.getBottom()
            float r0 = (float) r0
            float r1 = r1 / r0
            float r2 = r2 - r1
            goto L_0x0051
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AZV.DMr(int, boolean):void");
    }
}
