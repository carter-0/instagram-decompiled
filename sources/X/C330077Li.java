package X;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.faceswarm.IgdsFaceSwarm;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import com.instagram.ui.widget.pulsingbutton.PulsingPillButton;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: X.7Li  reason: invalid class name and case insensitive filesystem */
public final class C330077Li {
    public Context A00;
    public C330147Lp A01;
    public final View A02;
    public final View A03;
    public final View A04;
    public final ImageView A05;
    public final LinearLayout A06;
    public final TextView A07;
    public final AnonymousClass4DH A08;
    public final AnonymousClass0iw A09;
    public final UserSession A0A;
    public final C252063oV A0B;
    public final C330087Lj A0C;
    public final C330107Ll A0D;
    public final C330067Lh A0E;
    public final C330047Lf A0F;
    public final GradientSpinnerAvatarView A0G;

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0024, code lost:
        r0 = r5.getContext();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C330077Li(android.view.View r4, X.AnonymousClass4DH r5, X.AnonymousClass0iw r6, com.instagram.common.session.UserSession r7, X.C330067Lh r8, X.C330047Lf r9) {
        /*
            r3 = this;
            r0 = 2
            X.0qQ.A0B(r4, r0)
            r0 = 4
            X.0qQ.A0B(r6, r0)
            r3.<init>()
            r3.A08 = r5
            r3.A02 = r4
            r3.A0A = r7
            r3.A09 = r6
            r3.A0F = r9
            r3.A0E = r8
            X.0Tu r2 = X.0Tu.A05
            r0 = 36329053887872778(0x81111500033f0a, double:3.037978191824516E-306)
            boolean r0 = X.182.A06(r2, r7, r0)
            if (r0 == 0) goto L_0x002a
            android.content.Context r0 = r5.getContext()
            if (r0 != 0) goto L_0x002e
        L_0x002a:
            android.content.Context r0 = r4.getContext()
        L_0x002e:
            r3.A00 = r0
            r0 = 2131433813(0x7f0b1955, float:1.8489422E38)
            android.view.View r0 = r4.requireViewById(r0)
            r2 = r0
            com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView r2 = (com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView) r2
            r1 = 0
            r2.setGradientSpinnerVisible(r1)
            X.0qQ.A07(r0)
            r3.A0G = r2
            r0 = 2131433828(0x7f0b1964, float:1.8489453E38)
            android.view.View r0 = r4.requireViewById(r0)
            X.3oV r1 = X.2b1.A01(r0, r1, r1)
            r3.A0B = r1
            X.7Lj r0 = new X.7Lj
            r0.<init>(r1, r2)
            r3.A0C = r0
            r0 = 2131433855(0x7f0b197f, float:1.8489507E38)
            android.view.View r0 = r4.requireViewById(r0)
            X.0qQ.A07(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r3.A07 = r0
            android.content.Context r2 = r3.A00
            X.0qQ.A06(r2)
            X.7Lk r0 = new X.7Lk
            r0.<init>(r3)
            X.7Ll r1 = new X.7Ll
            r1.<init>(r2, r7, r0)
            r3.A0D = r1
            r0 = 2131433848(0x7f0b1978, float:1.8489493E38)
            android.view.View r0 = r4.requireViewById(r0)
            r0.setBackground(r1)
            r3.A03 = r0
            r0 = 2131433856(0x7f0b1980, float:1.848951E38)
            android.view.View r0 = r4.requireViewById(r0)
            X.0qQ.A07(r0)
            r3.A04 = r0
            r0 = 2131433837(0x7f0b196d, float:1.848947E38)
            android.view.View r0 = r4.requireViewById(r0)
            X.0qQ.A07(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r3.A05 = r0
            r0 = 2131433841(0x7f0b1971, float:1.848948E38)
            android.view.View r0 = r4.requireViewById(r0)
            X.0qQ.A07(r0)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r3.A06 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C330077Li.<init>(android.view.View, X.4DH, X.0iw, com.instagram.common.session.UserSession, X.7Lh, X.7Lf):void");
    }

    private final void A00(View view, C327907Cr r4) {
        AnonymousClass0fU.A00(new LXM(view, this, r4), view);
        Integer num = r4.A02.A01;
        if (num != null) {
            view.setContentDescription(this.A00.getString(num.intValue()));
        }
    }

    private final void A01(ImageView imageView, C327907Cr r8, int i) {
        C327897Cq r4;
        AnonymousClass9IV r5 = r8.A01;
        if (r5 != null) {
            Context context = this.A00;
            0qQ.A06(context);
            r4 = r8.A02;
            AnonymousClass3JS r3 = new AnonymousClass3JS(context, r4.A00);
            Number number = (Number) r5.A00;
            Number number2 = (Number) r5.A01;
            boolean z = true;
            if (number2 != null) {
                r3.setLevel(number2.intValue());
                imageView.setActivated(true);
            } else if (number != null) {
                r3.A02(number.intValue(), 1);
            } else {
                z = false;
            }
            imageView.setActivated(z);
            imageView.setImageDrawable(r3);
        } else {
            r4 = r8.A02;
            imageView.setImageResource(r4.A00);
        }
        AnonymousClass0fU.A00(new C327947Cv(imageView, this, r8), imageView);
        Integer num = r4.A01;
        if (num != null) {
            imageView.setContentDescription(this.A00.getString(num.intValue()));
        }
        imageView.setColorFilter(AnonymousClass37O.A00(i));
        imageView.setAlpha(r8.A00);
    }

    public final void A02(C330147Lp r19) {
        int i;
        C327887Cp r3;
        Integer num;
        C327887Cp r32;
        C327877Co r2;
        int i2;
        List list;
        Activity activity;
        ArrayList arrayList;
        Object obj;
        List list2;
        List<C327907Cr> list3;
        long j;
        int i3;
        float f;
        int i4;
        Spanned spanned;
        Drawable drawable;
        C327877Co r22;
        C330147Lp r5;
        C330147Lp r1 = r19;
        if (!r1.equals(this.A01)) {
            C330147Lp r23 = this.A01;
            if (r23 == null || (i = r1.A00) != r23.A00) {
                i = r1.A00;
                this.A02.setBackgroundColor(i);
            }
            C330147Lp r24 = this.A01;
            if (r24 == null || r1.A02 != r24.A02) {
                this.A00 = new ContextThemeWrapper(this.A02.getContext(), r1.A02);
            }
            C327887Cp r25 = r1.A06;
            C330147Lp r33 = this.A01;
            if (r33 != null) {
                r3 = r33.A06;
            } else {
                r3 = null;
            }
            if (!0qQ.A0K(r25, r3) || (r5 = this.A01) == null || i != r5.A00 || r1.A03 != r5.A03) {
                if (r25.A07) {
                    this.A0C.CLE();
                } else {
                    C330087Lj r34 = this.A0C;
                    AnonymousClass0iw r52 = this.A09;
                    r34.Eu3(r52);
                    UserSession userSession = this.A0A;
                    AnonymousClass34S r4 = r25.A00;
                    List list4 = r25.A04;
                    r34.A00(r4, r52, userSession, this.A0F, r25.A01, r25.A02, list4, r1.A03, i, r25.A08, r25.A05);
                }
                GradientSpinnerAvatarView gradientSpinnerAvatarView = this.A0G;
                if (gradientSpinnerAvatarView.A06 == null) {
                    Integer num2 = r25.A03;
                    C330147Lp r35 = this.A01;
                    LayerDrawable layerDrawable = null;
                    if (r35 == null || (r32 = r35.A06) == null) {
                        num = null;
                    } else {
                        num = r32.A03;
                    }
                    if (!0qQ.A0K(num2, num)) {
                        if (num2 != null) {
                            Drawable drawable2 = gradientSpinnerAvatarView.getContext().getDrawable(2Yu.A0H(this.A00, num2.intValue()));
                            0qQ.A0C(drawable2, "null cannot be cast to non-null type android.graphics.drawable.LayerDrawable");
                            layerDrawable = (LayerDrawable) drawable2;
                            layerDrawable.getDrawable(0).setColorFilter(AnonymousClass37O.A00(i));
                        }
                        C252063oV r42 = this.A0B;
                        if (!r42.CVM() || !r25.A06) {
                            gradientSpinnerAvatarView.setBottomBadgeDrawable(layerDrawable);
                        } else {
                            ((IgdsFaceSwarm) r42.getView()).setBottomBadgeDrawable(layerDrawable);
                        }
                    }
                }
                C327927Ct.A00(this.A08.requireActivity(), gradientSpinnerAvatarView, this.A0A, "Direct", new ArrayList(), C327917Cs.A00);
            }
            C327877Co r7 = r1.A07;
            C330147Lp r26 = this.A01;
            C61066Jw4 jw4 = null;
            if (r26 != null) {
                r2 = r26.A07;
            } else {
                r2 = null;
            }
            if (!0qQ.A0K(r7, r2)) {
                CharSequence charSequence = r7.A00;
                TextView textView = this.A07;
                textView.setText(charSequence);
                textView.setTextColor(2Yu.A0F(this.A00, R.attr.textColorPrimary));
                if (r7.A02) {
                    AnonymousClass0fU.A00(new C327937Cu(this, r7), this.A04);
                }
                String obj2 = charSequence.toString();
                boolean z = r7.A05;
                if (r7.A03) {
                    jw4 = new C61066Jw4(AnonymousClass05K.A00);
                }
                C46334Dcc.A00(textView, jw4, obj2, z);
                boolean z2 = r7.A04;
                C330147Lp r27 = this.A01;
                if ((r27 == null || (r22 = r27.A07) == null || z2 != r22.A04) && z2 && (drawable = this.A00.getDrawable(R.drawable.instagram_chevron_right_pano_outline_8)) != null) {
                    drawable.setColorFilter(AnonymousClass37O.A00(2Yu.A0F(this.A00, R.attr.glyphColorSecondary)));
                    textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
                }
            }
            C376549Ik r53 = r1.A04;
            C330147Lp r36 = this.A01;
            C376549Ik r28 = null;
            if (r36 != null) {
                r28 = r36.A04;
            }
            if (!0qQ.A0K(r53, r28)) {
                if (r53 != null) {
                    boolean z3 = r53.A08;
                    if (Boolean.valueOf(z3) != null && z3) {
                        this.A0E.A00();
                    }
                    0sn r13 = (List) r53.A04;
                    CharSequence charSequence2 = (CharSequence) r53.A05;
                    if ((r13 != null && !r13.isEmpty()) || !(charSequence2 == null || charSequence2.length() == 0)) {
                        C330107Ll r10 = this.A0D;
                        if (r13 == null) {
                            r13 = 0sn.A00;
                        }
                        Map map = (Map) r53.A03;
                        Number number = (Number) r53.A06;
                        Number number2 = (Number) r53.A01;
                        Number number3 = (Number) r53.A02;
                        0qQ.A0B(r13, 0);
                        0qQ.A0B(map, 1);
                        if (!r13.equals(r10.A08) || !0qQ.A0K(charSequence2, r10.A07) || !0qQ.A0K(r10.A09, map)) {
                            boolean z4 = !0qQ.A0K(charSequence2, r10.A07);
                            boolean z5 = r10.A0K;
                            List list5 = r10.A08;
                            if (!z5) {
                                if (z4) {
                                    r10.A0F.clear();
                                    r10.A06 = null;
                                } else {
                                    for (Object remove : 00k.A0e(list5, r13)) {
                                        r10.A0F.remove(remove);
                                    }
                                }
                            } else if (z4) {
                                r10.A0H.clear();
                                r10.A06 = null;
                                r10.A05 = null;
                            } else {
                                for (Object remove2 : 00k.A0e(list5, r13)) {
                                    r10.A0H.remove(remove2);
                                }
                            }
                            for (Map.Entry value : 0Yt.A09(map, r10.A09).entrySet()) {
                                r10.A0G.remove(value.getValue());
                            }
                            r10.A08 = r13;
                            r10.A09 = map;
                            if (!0qQ.A0K(charSequence2, r10.A07)) {
                                r10.A07 = charSequence2;
                                if (charSequence2 != null) {
                                    f = r10.A0C.measureText(charSequence2, 0, charSequence2.length()) + ((Number) r10.A0I.getValue()).floatValue();
                                } else {
                                    f = 0.0f;
                                }
                                r10.A01 = f;
                                if (z5) {
                                    if (charSequence2 == null || charSequence2.length() == 0 || !(charSequence2 instanceof Spanned) || (spanned = (Spanned) charSequence2) == null) {
                                        i4 = 0;
                                    } else {
                                        ImageSpan[] imageSpanArr = (ImageSpan[]) spanned.getSpans(0, spanned.length(), ImageSpan.class);
                                        0qQ.A0A(imageSpanArr);
                                        i4 = 0;
                                        for (ImageSpan drawable3 : imageSpanArr) {
                                            i4 += drawable3.getDrawable().getIntrinsicWidth();
                                        }
                                    }
                                    r10.A01 += (float) i4;
                                }
                                if (number != null) {
                                    int intValue = number.intValue();
                                    TextPaint textPaint = r10.A0C;
                                    Context context = r10.A0B;
                                    textPaint.setColor(context.getColor(2Yu.A0H(context, intValue)));
                                }
                            }
                            r10.A03 = 0;
                            r10.A04 = 0;
                            if (r13.size() <= 1) {
                                r10.A0A.cancel();
                                r10.A04 = 0;
                            } else {
                                ValueAnimator valueAnimator = r10.A0A;
                                if (number2 != null) {
                                    j = number2.longValue();
                                } else {
                                    j = 2500;
                                }
                                valueAnimator.setDuration(j);
                                if (number3 != null) {
                                    i3 = number3.intValue();
                                } else {
                                    i3 = -1;
                                }
                                valueAnimator.setRepeatCount(i3);
                                if (r10.A08.size() > 1 && !valueAnimator.isRunning()) {
                                    valueAnimator.start();
                                }
                            }
                            r10.invalidateSelf();
                        }
                        this.A03.setVisibility(0);
                    }
                }
                this.A03.setVisibility(8);
            }
            C327907Cr r37 = r1.A05;
            C330147Lp r29 = this.A01;
            if (r29 == null || !0qQ.A0K(r37, r29.A05)) {
                ImageView imageView = this.A05;
                if (r37 != null) {
                    C327897Cq r38 = r37.A02;
                    imageView.setImageResource(r38.A00);
                    AnonymousClass0fU.A00(new AnonymousClass7BT(r1, this), imageView);
                    imageView.setColorFilter(AnonymousClass37O.A00(r1.A01));
                    Integer num3 = r38.A01;
                    if (num3 != null) {
                        imageView.setContentDescription(this.A00.getString(num3.intValue()));
                    }
                    i2 = 0;
                } else {
                    i2 = 8;
                }
                imageView.setVisibility(i2);
            }
            List<C327907Cr> list6 = r1.A08;
            C330147Lp r43 = this.A01;
            if (r43 != null) {
                list = r43.A08;
            } else {
                list = null;
            }
            if (!0qQ.A0K(list6, list)) {
                LinearLayout linearLayout = this.A06;
                if (list6.size() == linearLayout.getChildCount()) {
                    ArrayList arrayList2 = new ArrayList(0Yv.A1E(list6, 10));
                    for (C327907Cr r54 : list6) {
                        arrayList2.add(r54.A02);
                    }
                    C330147Lp r55 = this.A01;
                    if (r55 == null || (list3 = r55.A08) == null) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList(0Yv.A1E(list3, 10));
                        for (C327907Cr r56 : list3) {
                            arrayList.add(r56.A02);
                        }
                    }
                    if (arrayList2.equals(arrayList)) {
                        int i5 = 0;
                        for (Object next : list6) {
                            int i6 = i5 + 1;
                            if (i5 >= 0) {
                                C327907Cr r8 = (C327907Cr) next;
                                C330147Lp r39 = this.A01;
                                if (r39 == null || (list2 = r39.A08) == null) {
                                    obj = null;
                                } else {
                                    obj = list2.get(i5);
                                }
                                if (!0qQ.A0K(r8, obj)) {
                                    View childAt = linearLayout.getChildAt(i5);
                                    C327897Cq r57 = r8.A02;
                                    if (r57 == C327897Cq.A0N || r57 == C327897Cq.A0M) {
                                        0qQ.A0A(childAt);
                                        A00(childAt, r8);
                                    } else {
                                        0qQ.A0C(childAt, "null cannot be cast to non-null type android.widget.ImageView");
                                        A01((ImageView) childAt, r8, r1.A01);
                                    }
                                }
                                i5 = i6;
                            } else {
                                0sr.A1T();
                                throw AnonymousClass00P.createAndThrow();
                            }
                        }
                    }
                }
                linearLayout.removeAllViews();
                for (C327907Cr r9 : list6) {
                    C327897Cq r6 = r9.A02;
                    if (r6 == C327897Cq.A0N || r6 == C327897Cq.A0M) {
                        Context context2 = this.A00;
                        0qQ.A06(context2);
                        int i7 = r6.A00;
                        Integer num4 = r9.A03;
                        if (num4 != null) {
                            int intValue2 = num4.intValue();
                            PulsingPillButton pulsingPillButton = new PulsingPillButton(context2, (AttributeSet) null, 0);
                            pulsingPillButton.setButtonResource(i7);
                            if (intValue2 != 0) {
                                pulsingPillButton.setButtonText(intValue2);
                            }
                            pulsingPillButton.A00(context2.getColor(R.color.igds_active_badge), context2.getColor(R.color.igds_join_call_button_background_gradient_end));
                            pulsingPillButton.setPulsingEnabled(true);
                            linearLayout.addView(pulsingPillButton);
                            A00(pulsingPillButton, r9);
                        } else {
                            throw new IllegalStateException("Required value was null.");
                        }
                    } else {
                        ImageView imageView2 = new ImageView(this.A00);
                        imageView2.setScaleType(ImageView.ScaleType.CENTER);
                        Context context3 = this.A00;
                        0qQ.A06(context3);
                        int A042 = (int) 0nA.A04(context3, 12);
                        Context context4 = this.A00;
                        0qQ.A06(context4);
                        int A043 = (int) 0nA.A04(context4, 16);
                        imageView2.setPaddingRelative(A042, A043, A042, A043);
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                        layoutParams.gravity = 80;
                        imageView2.setLayoutParams(layoutParams);
                        linearLayout.addView(imageView2);
                        A01(imageView2, r9, r1.A01);
                    }
                }
                int i8 = 0;
                if (linearLayout.getChildCount() == list6.size()) {
                    View view = null;
                    View view2 = null;
                    View view3 = null;
                    View view4 = null;
                    View view5 = null;
                    View view6 = null;
                    View view7 = null;
                    View view8 = null;
                    for (Object next2 : list6) {
                        int i9 = i8 + 1;
                        if (i8 >= 0) {
                            switch (((C327907Cr) next2).A02.ordinal()) {
                                case 0:
                                    view = linearLayout.getChildAt(i8);
                                    break;
                                case 3:
                                    view2 = linearLayout.getChildAt(i8);
                                    break;
                                case 4:
                                    view3 = linearLayout.getChildAt(i8);
                                    break;
                                case 9:
                                case 10:
                                case 11:
                                    view4 = linearLayout.getChildAt(i8);
                                    break;
                                case 14:
                                    view5 = linearLayout.getChildAt(i8);
                                    break;
                                case 15:
                                    view6 = linearLayout.getChildAt(i8);
                                    break;
                                case 16:
                                    view7 = linearLayout.getChildAt(i8);
                                    break;
                                case 22:
                                case 23:
                                    view8 = linearLayout.getChildAt(i8);
                                    break;
                            }
                            i8 = i9;
                        } else {
                            0sr.A1T();
                            throw AnonymousClass00P.createAndThrow();
                        }
                    }
                    this.A0F.CnZ(this.A0G, view, this.A07, view2, view3, view4, view5, view6, view7, view8);
                    C330067Lh r62 = this.A0E;
                    for (C327907Cr r310 : list6) {
                        int ordinal = r310.A02.ordinal();
                        if (ordinal == 8) {
                            AnonymousClass7S7 C6l = r62.A04.C6l();
                            String C6k = C6l.C6k();
                            List BRZ = C6l.BRZ();
                            if (C6k != null && BRZ.size() == 1) {
                                new OJd(r62.A03).A00(C6k, ((User) BRZ.get(0)).getId(), "persistent_menu_pano_button");
                            }
                        } else if (ordinal == 9) {
                            UserSession userSession2 = r62.A03;
                            C327977Cy r58 = new C327977Cy(r62.A02, userSession2);
                            User A012 = AnonymousClass0t1.A01.A01(userSession2);
                            User user = (User) 00k.A0J(r62.A04.C6l().BRZ());
                            if (user == null) {
                                user = A012;
                            }
                            C327977Cy.A00((C69489NmX) null, C69462Nm6.IMPRESSION, C69487NmV.ENTRYPOINT, r58, user.getId(), A012.getId());
                        } else if (ordinal != 14) {
                            if (ordinal == 15 && !r62.A01) {
                                r62.A01 = true;
                                new LTH(r62.A03).A0B(((User) r62.A04.C6l().C6Q().A0b.get(0)).A03.AaU());
                            }
                        } else if (!r62.A00) {
                            r62.A00 = true;
                            new LTH(r62.A03).A0A(((User) r62.A04.C6l().C6Q().A0b.get(0)).A03.AaU());
                        }
                    }
                } else {
                    throw new IllegalStateException("Check failed.");
                }
            }
            if (r1.A09 && (activity = (Activity) 0mE.A00(this.A00, Activity.class)) != null) {
                2db.A02(activity, 0);
                2db.A06(activity, 2Yu.A0L(this.A00, 16844000, true));
            }
            this.A01 = r1;
        }
    }
}
