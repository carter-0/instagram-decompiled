package X;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.text.Spannable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextSwitcher;
import android.widget.TextView;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import java.util.List;

/* renamed from: X.3rt  reason: invalid class name and case insensitive filesystem */
public final class C254073rt extends C249703kE implements AnonymousClass2xU {
    public long A00 = 4000;
    public TextView A01;
    public TextView A02;
    public 1wn A03;
    public IgSimpleImageView A04;
    public IgSimpleImageView A05;
    public IgTextView A06;
    public IgTextView A07;
    public C282815Ev A08;
    public AnonymousClass3W1 A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public final long A0F;
    public final Context A0G;
    public final View A0H;
    public final View A0I;
    public final ViewGroup A0J;
    public final TextSwitcher A0K;
    public final TextView A0L;
    public final TextView A0M;
    public final UserSession A0N;
    public final IgSimpleImageView A0O;
    public final ColorFilterAlphaImageView A0P;
    public final C71662eb A0Q;
    public final AnonymousClass3YT A0R;
    public final AnonymousClass3z2 A0S;
    public final C258373yu A0T;
    public final AnonymousClass3z3 A0U;
    public final C258403yx A0V;
    public final AnonymousClass4DU A0W;
    public final C258433z0 A0X;
    public final MediaFrameLayout A0Y;
    public final SpinnerImageView A0Z;
    public final boolean A0a;

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0010, code lost:
        if (r3.A0C == false) goto L_0x0012;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A01(X.1Xj r4, X.AnonymousClass3W1 r5) {
        /*
            r3 = this;
            r0 = 1
            X.0qQ.A0B(r5, r0)
            if (r4 == 0) goto L_0x0018
            java.lang.String r0 = r4.A2l()
        L_0x000a:
            r2 = 1
            if (r0 == 0) goto L_0x0012
            boolean r0 = r3.A0C
            r1 = 1
            if (r0 != 0) goto L_0x0013
        L_0x0012:
            r1 = 0
        L_0x0013:
            boolean r0 = r3.A0B
            if (r0 == 0) goto L_0x001a
            return r1
        L_0x0018:
            r0 = 0
            goto L_0x000a
        L_0x001a:
            boolean r0 = r5.A1j
            if (r0 == 0) goto L_0x0025
            boolean r0 = r3.A0A
            if (r0 == 0) goto L_0x0025
            if (r1 == 0) goto L_0x0025
            return r2
        L_0x0025:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C254073rt.A01(X.1Xj, X.3W1):boolean");
    }

    public final void DQp(AnonymousClass3W1 r23, int i) {
        TextView textView;
        int i2;
        C282805Eu r0;
        0sP r1;
        String str;
        1Xj r4;
        boolean z;
        int i3;
        View view;
        int i4;
        2EG r42;
        Integer num;
        String str2;
        C270854hQ At8;
        AnonymousClass3W1 r10 = r23;
        0qQ.A0B(r10, 0);
        C282825Ew r9 = null;
        int i5 = i;
        if (i5 == 4) {
            AnonymousClass598.A00().A00();
            C282815Ev r02 = this.A08;
            if (r02 == null || (r4 = r02.A02) == null) {
                0wb.A03("MediaCTABarViewBinder", "Unable to update CTAText because media might be null");
            } else {
                AnonymousClass3YT r3 = this.A0R;
                Context context = this.A01.getContext();
                0qQ.A07(context);
                UserSession userSession = this.A0N;
                CharSequence C4o = r3.C4o(context, userSession, r4, r10);
                C282815Ev r03 = this.A08;
                if (r03 != null) {
                    r9 = r03.A01;
                }
                CharSequence Bqi = r3.Bqi(context, userSession, r4, this.A0W, r10);
                List Bqk = r3.Bqk(r4, r10);
                AnonymousClass3W1 r102 = this.A09;
                C282815Ev r04 = this.A08;
                if (r04 != null) {
                    z = r04.A0A;
                } else {
                    z = false;
                }
                A00(r9, r102, C4o, Bqi, Bqk, z, false);
            }
            C282815Ev r05 = this.A08;
            if (r05 == null || (r0 = r05.A00) == null || (r1 = r0.A02) == null || (str = (String) r1.invoke(this.A0G)) == null) {
                textView = this.A0M;
                i2 = 8;
            } else {
                textView = this.A0M;
                textView.setText(str);
                i2 = 0;
            }
            textView.setVisibility(i2);
        } else if (i5 == 5) {
            boolean z2 = r10.A29;
            boolean z3 = true;
            boolean z4 = !r10.A2P;
            C282815Ev r12 = this.A08;
            if (r12 != null) {
                if (!r12.A0A) {
                    r9 = r12.A02;
                }
                AnonymousClass5F6.A01(this, z2, z4, z3);
            }
            if (!A01(r9, r10)) {
                z3 = false;
            }
            AnonymousClass5F6.A01(this, z2, z4, z3);
        } else if (i5 != 14) {
            if (i5 == 26) {
                i3 = 8;
                if (r10.A1u) {
                    this.A0J.setOnTouchListener((View.OnTouchListener) null);
                    this.A0P.setVisibility(8);
                    this.A0Z.setVisibility(0);
                    return;
                }
                this.A0P.setVisibility(0);
                view = this.A0Z;
            } else if (i5 == 56) {
                C282815Ev r32 = this.A08;
                if (r32 != null) {
                    C258403yx r7 = this.A0V;
                    1Xj r6 = r32.A02;
                    0qQ.A0B(r6, 1);
                    r7.A01(C58407IrQ.A00);
                    02m r5 = r7.A00;
                    if (r5 != null) {
                        r5.markerStart(1056313521);
                        r5.markerAnnotate(1056313521, C273654mx.A00(417), "NATIVE");
                    }
                    C258403yx.A00(r7, r6);
                    Integer num2 = r10.A12;
                    if (num2 != null) {
                        int intValue = num2.intValue();
                        if (intValue != 0) {
                            i3 = 8;
                            if (intValue == 1) {
                                this.A0I.setVisibility(8);
                                AnonymousClass3W1 r06 = this.A09;
                                if (!(r06 == null || (num = r06.A11) == null)) {
                                    int intValue2 = num.intValue();
                                    if (intValue2 == 0) {
                                        r42 = 2EG.A3G;
                                    } else if (intValue2 == 1) {
                                        r42 = 2EG.A3F;
                                    }
                                    r32.A00.A0B.invoke(this.A0T, r10, r42, this, r10.A0e);
                                    return;
                                }
                                0f9 AEf = 0wj.A01.AEf(AnonymousClass000.A00(2321), 817903741);
                                AEf.ABQ(DialogModule.KEY_MESSAGE, AnonymousClass000.A00(3403));
                                AEf.report();
                                r42 = 2EG.A3E;
                                r32.A00.A0B.invoke(this.A0T, r10, r42, this, r10.A0e);
                                return;
                            } else if (intValue == 2) {
                                view = this.A0I;
                            } else {
                                return;
                            }
                        } else {
                            View view2 = this.A0I;
                            view2.setVisibility(0);
                            AnonymousClass3z3 r07 = this.A0U;
                            boolean z5 = r10.A29;
                            AnonymousClass3z2 r08 = r07.A00;
                            if (z5) {
                                i4 = r08.A07;
                            } else {
                                i4 = r08.A08;
                            }
                            view2.setBackgroundColor(i4);
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } else if (i5 == 76) {
                Context context2 = this.A0G;
                C282815Ev r2 = this.A08;
                if (r2 != null && this.A0C && this.A0A) {
                    if (r10.A1j) {
                        AnonymousClass41Z BUC = r2.A02.A0C.BUC();
                        if (BUC == null || (At8 = BUC.At8()) == null) {
                            str2 = null;
                        } else {
                            str2 = At8.AyB();
                        }
                        if (this.A0a) {
                            CharSequence charSequence = (CharSequence) r2.A00.A03.invoke(context2);
                            ViewGroup viewGroup = this.A0J;
                            Context context3 = viewGroup.getContext();
                            int dimensionPixelSize = context3.getResources().getDimensionPixelSize(R.dimen.account_group_management_title_text_horizontal_padding);
                            int dimensionPixelSize2 = context3.getResources().getDimensionPixelSize(R.dimen.container_height);
                            0qQ.A0B(charSequence, 0);
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
                            TextView textView2 = this.A02;
                            textView2.getPaint().setFakeBoldText(!(charSequence instanceof Spannable));
                            textView2.setText(charSequence);
                            IgTextView igTextView = this.A07;
                            igTextView.setText(str2);
                            Resources resources = viewGroup.getResources();
                            igTextView.setTextSize(0, (float) resources.getDimensionPixelSize(R.dimen.add_payment_bottom_sheet_row_subtitle_size));
                            igTextView.setTextAppearance(R.style.PrivacyTextStyle);
                            0nA.A0X(igTextView, resources.getDimensionPixelSize(R.dimen.album_music_sticker_text_vertical_padding));
                            textView2.setAlpha(0.0f);
                            igTextView.setAlpha(0.0f);
                            textView2.setVisibility(0);
                            igTextView.setVisibility(0);
                            ofFloat.addUpdateListener(new C56688I7t(this, dimensionPixelSize, dimensionPixelSize2));
                            ofFloat.addListener(new HG1(this));
                            ofFloat.setDuration(this.A0F).start();
                            return;
                        }
                        C282805Eu r13 = r2.A00;
                        A00(r2.A01, r10, (CharSequence) r13.A03.invoke(context2), str2, (List) r13.A00.invoke(), this.A0A, r2.A0B);
                        return;
                    }
                    CharSequence charSequence2 = (CharSequence) r2.A00.A03.invoke(context2);
                    0qQ.A0B(charSequence2, 0);
                    this.A02.setVisibility(8);
                    this.A07.setVisibility(8);
                    this.A0K.setVisibility(8);
                    TextView textView3 = this.A01;
                    textView3.setText(charSequence2);
                    textView3.setVisibility(0);
                    ViewGroup viewGroup2 = this.A0J;
                    viewGroup2.getLayoutParams().height = viewGroup2.getContext().getResources().getDimensionPixelSize(R.dimen.account_group_management_title_text_horizontal_padding);
                    AnonymousClass3W1 r09 = this.A09;
                    if (r09 != null) {
                        r09.A1D = null;
                        r09.A1g = null;
                        r09.A1F = null;
                        return;
                    }
                    return;
                }
                return;
            } else {
                return;
            }
            view.setVisibility(i3);
        } else if (r10.A29) {
            ArgbEvaluator argbEvaluator = C258443z1.A00;
            AnonymousClass3z2 r43 = this.A0S;
            C282815Ev r010 = this.A08;
            if (r010 != null) {
                r9 = r010.A02;
            }
            C258443z1.A02(r43, r9, new C377259Ld(this, 0), r10.A01, r10.A0S, r10.A0B);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00e2, code lost:
        if ((r4 instanceof X.C296355pv) != false) goto L_0x00e4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x01b5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(X.C282825Ew r16, X.AnonymousClass3W1 r17, java.lang.CharSequence r18, java.lang.CharSequence r19, java.util.List r20, boolean r21, boolean r22) {
        /*
            r15 = this;
            r9 = r20
            r8 = 0
            r11 = r18
            X.0qQ.A0B(r11, r8)
            X.2eb r0 = r15.A0Q
            android.view.View r7 = r0.A01()
            X.0qQ.A07(r7)
            android.widget.TextView r7 = (android.widget.TextView) r7
            android.widget.TextView r6 = r15.A01
            com.instagram.common.ui.base.IgTextView r5 = r15.A06
            r14 = r5
            android.widget.TextView r4 = r15.A02
            r3 = 8
            r4.setVisibility(r3)
            com.instagram.common.ui.base.IgTextView r2 = r15.A07
            r2.setVisibility(r3)
            java.lang.String r1 = "•"
            r0 = 1
            r10 = r19
            r12 = r17
            if (r20 == 0) goto L_0x0112
            int r13 = r9.size()
            if (r13 <= r0) goto L_0x0112
            r7.setVisibility(r8)
            r7.setText(r1)
            r5.setVisibility(r3)
            android.widget.TextSwitcher r5 = r15.A0K
            r5.setVisibility(r8)
            android.view.View r1 = r5.getChildAt(r8)
            if (r1 != 0) goto L_0x004f
            X.IEJ r1 = new X.IEJ
            r1.<init>(r15)
            r5.setFactory(r1)
        L_0x004f:
            android.view.View r4 = r5.getCurrentView()
            android.widget.TextView r4 = (android.widget.TextView) r4
            if (r4 == 0) goto L_0x0065
            X.3z3 r1 = r15.A0U
            if (r17 == 0) goto L_0x010f
            boolean r2 = r12.A29
        L_0x005d:
            X.3z2 r1 = r1.A00
            if (r2 == 0) goto L_0x010b
            r1 = -1
        L_0x0062:
            r4.setTextColor(r1)
        L_0x0065:
            android.view.View r4 = r5.getNextView()
            android.widget.TextView r4 = (android.widget.TextView) r4
            if (r4 == 0) goto L_0x007b
            X.3z3 r1 = r15.A0U
            if (r17 == 0) goto L_0x0108
            boolean r2 = r12.A29
        L_0x0073:
            X.3z2 r1 = r1.A00
            if (r2 == 0) goto L_0x0104
            r1 = -1
        L_0x0078:
            r4.setTextColor(r1)
        L_0x007b:
            X.599 r4 = X.AnonymousClass598.A00()
            r4.A00()
            X.FvG r2 = new X.FvG
            r2.<init>(r5, r4, r9)
            r4.A00 = r2
            android.os.Handler r1 = r4.A02
            r1.post(r2)
            r4.A01 = r0
            if (r17 == 0) goto L_0x009e
            java.lang.CharSequence r0 = r7.getText()
            java.lang.String r0 = r0.toString()
            r12.A1F = r0
        L_0x009c:
            r12.A1g = r9
        L_0x009e:
            android.text.TextPaint r2 = r6.getPaint()
            boolean r0 = r11 instanceof android.text.Spannable
            r1 = r0 ^ 1
            r2.setFakeBoldText(r1)
            android.widget.TextView r2 = r15.A0L
            android.text.TextPaint r0 = r2.getPaint()
            r0.setFakeBoldText(r1)
            r6.setText(r11)
            r2.setText(r11)
            if (r17 == 0) goto L_0x00c0
            java.lang.String r0 = r11.toString()
            r12.A1E = r0
        L_0x00c0:
            android.content.Context r4 = r15.A0G
            r1 = 2131954409(0x7f130ae9, float:1.9545316E38)
            java.lang.Object[] r0 = new java.lang.Object[]{r11}
            java.lang.String r0 = r4.getString(r1, r0)
            r6.setContentDescription(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r11}
            java.lang.String r0 = r4.getString(r1, r0)
            r2.setContentDescription(r0)
            r4 = r16
            if (r16 == 0) goto L_0x00e4
            boolean r1 = r4 instanceof X.C296355pv
            r0 = 0
            if (r1 == 0) goto L_0x00e6
        L_0x00e4:
            r0 = 8
        L_0x00e6:
            r2.setVisibility(r0)
            if (r16 == 0) goto L_0x01b5
            if (r19 != 0) goto L_0x00f3
            r2.setVisibility(r8)
            r6.setVisibility(r3)
        L_0x00f3:
            if (r22 == 0) goto L_0x00f9
            r0 = 2
            r2.setMaxLines(r0)
        L_0x00f9:
            com.instagram.common.ui.base.IgSimpleImageView r1 = r15.A04
            int r0 = r4.A00
            r1.setImageResource(r0)
            r1.setVisibility(r8)
            return
        L_0x0104:
            int r1 = r1.A09
            goto L_0x0078
        L_0x0108:
            r2 = 0
            goto L_0x0073
        L_0x010b:
            int r1 = r1.A09
            goto L_0x0062
        L_0x010f:
            r2 = 0
            goto L_0x005d
        L_0x0112:
            r9 = 0
            if (r19 == 0) goto L_0x01a2
            if (r21 == 0) goto L_0x0189
            r6.setVisibility(r3)
            r5.setVisibility(r3)
            r7.setVisibility(r3)
            r4.setVisibility(r8)
            r6 = r4
            r5 = r2
            android.view.ViewGroup r4 = r15.A0J
            android.content.Context r0 = r4.getContext()
            android.content.res.Resources r2 = r0.getResources()
            boolean r1 = r15.A0C
            r0 = 2131165251(0x7f070043, float:1.7944714E38)
            if (r1 == 0) goto L_0x0139
            r0 = 2131165498(0x7f07013a, float:1.7945215E38)
        L_0x0139:
            int r1 = r2.getDimensionPixelSize(r0)
            android.view.ViewGroup$LayoutParams r0 = r4.getLayoutParams()
            r0.height = r1
        L_0x0143:
            r5.setVisibility(r8)
            r5.setText(r10)
            android.widget.TextSwitcher r0 = r15.A0K
            r0.setVisibility(r3)
            boolean r0 = r15.A0C
            if (r0 == 0) goto L_0x017b
            if (r21 == 0) goto L_0x017b
            android.view.ViewGroup r0 = r15.A0J
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131165249(0x7f070041, float:1.794471E38)
            int r0 = r1.getDimensionPixelSize(r0)
            float r0 = (float) r0
            r5.setTextSize(r8, r0)
            r0 = 2132018053(0x7f140385, float:1.9674402E38)
            r5.setTextAppearance(r0)
            r0 = 1060320051(0x3f333333, float:0.7)
            r5.setAlpha(r0)
            r0 = 2131165264(0x7f070050, float:1.794474E38)
            int r0 = r1.getDimensionPixelSize(r0)
            X.0nA.A0X(r5, r0)
        L_0x017b:
            if (r17 == 0) goto L_0x009e
            java.lang.CharSequence r0 = r14.getText()
            java.lang.String r0 = r0.toString()
            r12.A1D = r0
            goto L_0x009c
        L_0x0189:
            r4.setVisibility(r3)
            r2.setVisibility(r3)
            r7.setVisibility(r8)
            r7.setText(r1)
            if (r17 == 0) goto L_0x0143
            java.lang.CharSequence r0 = r7.getText()
            java.lang.String r0 = r0.toString()
            r12.A1F = r0
            goto L_0x0143
        L_0x01a2:
            r7.setVisibility(r3)
            r5.setVisibility(r3)
            android.widget.TextSwitcher r0 = r15.A0K
            r0.setVisibility(r3)
            if (r17 == 0) goto L_0x009e
            r12.A1F = r9
            r12.A1D = r9
            goto L_0x009c
        L_0x01b5:
            r2.setVisibility(r3)
            r6.setVisibility(r8)
            com.instagram.common.ui.base.IgSimpleImageView r0 = r15.A04
            r0.setVisibility(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C254073rt.A00(X.5Ew, X.3W1, java.lang.CharSequence, java.lang.CharSequence, java.util.List, boolean, boolean):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C254073rt(Context context, View view, View view2, View view3, ViewGroup viewGroup, TextSwitcher textSwitcher, TextView textView, TextView textView2, TextView textView3, TextView textView4, UserSession userSession, IgSimpleImageView igSimpleImageView, IgSimpleImageView igSimpleImageView2, IgSimpleImageView igSimpleImageView3, IgTextView igTextView, IgTextView igTextView2, ColorFilterAlphaImageView colorFilterAlphaImageView, C71662eb r38, AnonymousClass3YT r39, C258373yu r40, C258403yx r41, AnonymousClass4DU r42, C258433z0 r43, MediaFrameLayout mediaFrameLayout, SpinnerImageView spinnerImageView) {
        super(view);
        ViewGroup viewGroup2 = viewGroup;
        0qQ.A0B(viewGroup2, 7);
        View view4 = view2;
        0qQ.A0B(view4, 8);
        TextView textView5 = textView;
        0qQ.A0B(textView5, 9);
        TextView textView6 = textView2;
        0qQ.A0B(textView6, 10);
        TextView textView7 = textView3;
        0qQ.A0B(textView7, 11);
        TextSwitcher textSwitcher2 = textSwitcher;
        0qQ.A0B(textSwitcher2, 12);
        IgTextView igTextView3 = igTextView;
        0qQ.A0B(igTextView3, 13);
        IgTextView igTextView4 = igTextView2;
        0qQ.A0B(igTextView4, 14);
        TextView textView8 = textView4;
        0qQ.A0B(textView8, 16);
        ColorFilterAlphaImageView colorFilterAlphaImageView2 = colorFilterAlphaImageView;
        0qQ.A0B(colorFilterAlphaImageView2, 17);
        SpinnerImageView spinnerImageView2 = spinnerImageView;
        0qQ.A0B(spinnerImageView2, 18);
        IgSimpleImageView igSimpleImageView4 = igSimpleImageView;
        0qQ.A0B(igSimpleImageView4, 19);
        IgSimpleImageView igSimpleImageView5 = igSimpleImageView2;
        0qQ.A0B(igSimpleImageView5, 21);
        IgSimpleImageView igSimpleImageView6 = igSimpleImageView3;
        0qQ.A0B(igSimpleImageView6, 22);
        C258403yx r3 = r41;
        0qQ.A0B(r3, 25);
        Context context2 = context;
        this.A0G = context2;
        UserSession userSession2 = userSession;
        this.A0N = userSession2;
        this.A0W = r42;
        this.A0R = r39;
        this.A0T = r40;
        this.A0J = viewGroup2;
        this.A0I = view4;
        this.A01 = textView5;
        this.A02 = textView6;
        this.A0L = textView7;
        this.A0K = textSwitcher2;
        this.A06 = igTextView3;
        this.A07 = igTextView4;
        this.A0Q = r38;
        this.A0M = textView8;
        this.A0P = colorFilterAlphaImageView2;
        this.A0Z = spinnerImageView2;
        this.A0O = igSimpleImageView4;
        this.A0H = view3;
        this.A04 = igSimpleImageView5;
        this.A05 = igSimpleImageView6;
        this.A0Y = mediaFrameLayout;
        this.A0X = r43;
        this.A0V = r3;
        viewGroup2.getContext().getResources().getDimensionPixelSize(R.dimen.account_group_management_title_text_horizontal_padding);
        this.A0S = C258443z1.A01(context2);
        this.A0U = new AnonymousClass3z3(context2);
        0Tu r4 = 0Tu.A05;
        this.A0a = 182.A06(r4, userSession2, 2342169589200664418L);
        this.A0F = (long) 182.A00(r4, userSession2, 37171004917023257L);
        this.A01.getPaint().setFakeBoldText(true);
        textView7.getPaint().setFakeBoldText(true);
    }
}
