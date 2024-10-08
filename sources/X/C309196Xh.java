package X;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.model.effect.AttributedAREffect;
import java.util.List;

/* renamed from: X.6Xh  reason: invalid class name and case insensitive filesystem */
public final class C309196Xh {
    public static int A00;
    public static String A01;
    public static final C309196Xh A02 = new Object();

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00ba, code lost:
        if (r11 == false) goto L_0x00bc;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A02(com.instagram.common.session.UserSession r12, X.C255773uh r13, X.C250973mM r14, X.AnonymousClass3BQ r15, X.C317116mk r16, X.C316136lA r17) {
        /*
            r9 = r13
            boolean r0 = r13.A1Y()
            if (r0 == 0) goto L_0x0149
            X.4gK r8 = r13.A0d
            r8.getClass()
            r13 = r17
            android.widget.TextView r3 = r13.A1L
            r6 = 0
            r3.setVisibility(r6)
            r0 = -1
            r3.setTextColor(r0)
            X.3Q2 r2 = r8.A00
            X.55U r0 = r2.A6I
            if (r0 == 0) goto L_0x00cd
            java.lang.String r4 = r0.A05
        L_0x0020:
            java.lang.String r5 = ""
            if (r4 != 0) goto L_0x0025
            r4 = r5
        L_0x0025:
            boolean r0 = r2.A0n()
            r7 = r12
            if (r0 == 0) goto L_0x00d0
            X.0Tu r4 = X.0Tu.A05
            r0 = 36326610051348349(0x810edc0001377d, double:3.036432699765927E-306)
            boolean r11 = X.182.A06(r4, r12, r0)
            r0 = 36326610051282812(0x810edc0000377c, double:3.0364326997244814E-306)
            boolean r0 = X.182.A06(r4, r12, r0)
            if (r0 == 0) goto L_0x00c3
            X.6lC r7 = r13.A1m
            boolean r0 = r7.A01
            if (r0 != 0) goto L_0x0065
            r0 = 1
            r7.A01 = r0
            X.3oV r1 = r7.A03
            android.view.View r0 = r1.getView()
            boolean r0 = r0.isAttachedToWindow()
            if (r0 == 0) goto L_0x005e
            android.view.View r0 = r1.getView()
            r7.onViewAttachedToWindow(r0)
        L_0x005e:
            android.view.View r0 = r1.getView()
            r0.addOnAttachStateChangeListener(r7)
        L_0x0065:
            X.4Co r0 = r7.A00
            r9 = 0
            if (r0 == 0) goto L_0x006d
            r0.AG7(r9)
        L_0x006d:
            X.3oV r0 = r7.A03
            android.view.View r1 = r0.getView()
            android.widget.ProgressBar r1 = (android.widget.ProgressBar) r1
            int r0 = r2.A03()
            r1.setProgress(r0)
            X.C316156lC.A00(r8, r7, r11)
            X.07V r0 = r7.getLifecycle()
            X.0xx r4 = X.C71772f0.A00(r0)
            r10 = 3
            X.9K9 r6 = new X.9K9
            r6.<init>(r7, r8, r9, r10, r11)
            X.19B r1 = X.19B.A00
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            X.1Er r0 = X.1Eo.A03(r0, r1, r6, r4)
            r7.A00 = r0
        L_0x0097:
            android.view.View r4 = r13.A0z
            androidx.constraintlayout.widget.ConstraintLayout r0 = r13.A1M
            android.content.Context r1 = r0.getContext()
            r0 = 2131100175(0x7f06020f, float:1.7812724E38)
            int r1 = r1.getColor(r0)
            android.graphics.drawable.ColorDrawable r0 = new android.graphics.drawable.ColorDrawable
            r0.<init>(r1)
            r4.setBackground(r0)
            X.3QD r0 = r2.A1f
            int r1 = r0.ordinal()
            r0 = 6
            if (r1 < r0) goto L_0x00bc
            r0 = 2131969293(0x7f13450d, float:1.9575505E38)
            if (r11 != 0) goto L_0x00bf
        L_0x00bc:
            r0 = 2131976097(0x7f135fa1, float:1.9589305E38)
        L_0x00bf:
            r3.setText(r0)
            return
        L_0x00c3:
            X.3oV r0 = r13.A1h
            android.view.View r0 = r0.getView()
            r0.setVisibility(r6)
            goto L_0x0097
        L_0x00cd:
            r4 = 0
            goto L_0x0020
        L_0x00d0:
            boolean r0 = r2.A0z()
            r12 = r16
            if (r0 == 0) goto L_0x0128
            r2 = 2131100175(0x7f06020f, float:1.7812724E38)
            androidx.constraintlayout.widget.ConstraintLayout r3 = r13.A1M
            android.content.res.Resources r1 = r3.getResources()
            r0 = 2131965642(0x7f1336ca, float:1.95681E38)
            java.lang.String r0 = r1.getString(r0)
            X.0qQ.A07(r0)
            X.OjV r6 = new X.OjV
            r10 = r14
            r11 = r15
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            A00(r6, r13, r5, r0, r2)
            java.lang.String r2 = A01
            r1 = 1
            if (r2 == 0) goto L_0x0116
            java.lang.String r0 = r9.A0j
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x011b
            int r0 = A00
            if (r0 > r1) goto L_0x0116
            android.content.Context r0 = r3.getContext()
            X.0qQ.A07(r0)
            X.A15.A00(r0)
            int r0 = A00
            int r0 = r0 + 1
            A00 = r0
        L_0x0116:
            java.lang.String r0 = r9.A0j
            A01 = r0
            return
        L_0x011b:
            android.content.Context r0 = r3.getContext()
            X.0qQ.A07(r0)
            X.A15.A00(r0)
            A00 = r1
            goto L_0x0116
        L_0x0128:
            androidx.constraintlayout.widget.ConstraintLayout r1 = r13.A1M
            android.content.Context r0 = r1.getContext()
            int r2 = X.2Yu.A03(r0)
            android.content.res.Resources r1 = r1.getResources()
            r0 = 2131957531(0x7f13171b, float:1.9551649E38)
            java.lang.String r1 = r1.getString(r0)
            X.0qQ.A07(r1)
            X.DEP r0 = new X.DEP
            r0.<init>(r9, r12)
            A00(r0, r13, r4, r1, r2)
            return
        L_0x0149:
            java.lang.String r1 = "Check failed."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C309196Xh.A02(com.instagram.common.session.UserSession, X.3uh, X.3mM, X.3BQ, X.6mk, X.6lA):void");
    }

    public static final void A05(IgSimpleImageView igSimpleImageView, AttributedAREffect attributedAREffect, boolean z) {
        C243373Ym r0;
        0qQ.A0B(igSimpleImageView, 1);
        Context context = igSimpleImageView.getContext();
        if (z) {
            r0 = C243373Ym.SAVED;
        } else {
            r0 = C243373Ym.NOT_SAVED;
        }
        attributedAREffect.A05 = r0;
        int i = R.drawable.instagram_save_effect_outline_44;
        if (z) {
            i = R.drawable.instagram_save_effect_filled_44;
        }
        igSimpleImageView.setImageDrawable(context.getDrawable(i));
    }

    public static final void A00(View.OnClickListener onClickListener, C316136lA r8, String str, String str2, int i) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append(str);
        spannableStringBuilder.append(" ");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append(str2);
        int length2 = spannableStringBuilder.length();
        TextView textView = r8.A1L;
        textView.setOnClickListener((View.OnClickListener) null);
        r8.A0z.setBackground(new ColorDrawable(r8.A1M.getContext().getColor(i)));
        SpannableString spannableString = new SpannableString(spannableStringBuilder.toString());
        spannableString.setSpan(new StyleSpan(1), length, length2, 33);
        spannableString.setSpan(new C46677Dj6(onClickListener), length, length2, 33);
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        0qQ.A0C(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams).setMargins(0, 0, (int) (textView.getResources().getDisplayMetrics().density * 16.0f), 0);
        textView.setHighlightColor(0);
        textView.setText(spannableString);
    }

    private final void A03(UserSession userSession, C255773uh r28, C250973mM r29, C317116mk r30, C316136lA r31, String str) {
        ImageView imageView;
        UserSession userSession2 = userSession;
        C255773uh r5 = r28;
        C250973mM r1 = r29;
        if (AnonymousClass6YK.A02(userSession2, r5, r1) && !r1.A0H.A0k()) {
            C316136lA r7 = r31;
            TextView textView = r7.A1L;
            textView.setVisibility(0);
            textView.setCompoundDrawablesWithIntrinsicBounds(r7.A0w, (Drawable) null, (Drawable) null, (Drawable) null);
            textView.setTextColor(-1);
            C317116mk r4 = r30;
            AnonymousClass0fU.A00(new B78(r4), textView);
            textView.setTypeface((Typeface) null, 1);
            1Xj r10 = r5.A0b;
            if (r10 != null && r5.CWu() && !r5.A1H() && !r10.A53()) {
                textView.setVisibility(8);
                if (r10.A5O() && r10.A12() != 19) {
                    182.A06(0Tu.A05, userSession2, 36313029364876906L);
                }
                if (r5.A01() != 0 || r5.A0q() || (r10.A4X() && 182.A06(0Tu.A05, userSession2, 36317268497404883L))) {
                    List A0c = r5.A0c();
                    if (r7.A02 == null || !0qQ.A0K(r7.A0j, r5)) {
                        if (r7.A0S == null) {
                            View inflate = r7.A1J.inflate();
                            r7.A0Q = inflate;
                            TextView textView2 = null;
                            if (inflate != null) {
                                imageView = (ImageView) inflate.findViewById(R.id.viewers_facepile);
                            } else {
                                imageView = null;
                            }
                            r7.A0S = imageView;
                            View view = r7.A0Q;
                            if (view != null) {
                                textView2 = (TextView) view.findViewById(R.id.viewers_facepile_label);
                            }
                            r7.A0f = textView2;
                        }
                        r7.A0j = r5;
                        Context context = r7.A1M.getContext();
                        0qQ.A07(context);
                        r7.A02 = C244283aw.A00(context, (Drawable) null, Float.valueOf(0.3f), AnonymousClass05K.A00, (Integer) null, (Integer) null, (Integer) null, (Integer) null, str, A0c, r7.A0r, false, false, false, true, false);
                    }
                    TextView textView3 = r7.A0f;
                    if (textView3 != null) {
                        textView3.setText(r7.A0v.getString(2131974349));
                        if (r7.A0S != null) {
                            boolean isEmpty = A0c.isEmpty();
                            ImageView imageView2 = r7.A0S;
                            if (isEmpty) {
                                0qQ.A0A(imageView2);
                                imageView2.setImageResource(R.drawable.instagram_eye_outline_44);
                            } else {
                                0qQ.A0A(imageView2);
                                imageView2.setImageDrawable(r7.A02);
                            }
                            View view2 = r7.A0Q;
                            if (view2 != null) {
                                view2.setVisibility(0);
                                View view3 = r7.A0Q;
                                0qQ.A0A(view3);
                                AnonymousClass0fU.A00(new B79(r4), view3);
                            } else {
                                throw new IllegalStateException("Required value was null.");
                            }
                        } else {
                            throw new IllegalStateException("Required value was null.");
                        }
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                }
            }
            if (r5.A01() == 0) {
                textView.setVisibility(8);
            }
        }
    }

    public static final void A04(UserSession userSession, C316136lA r10, boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        if (z) {
            i = 0;
            i2 = r10.A0t;
            i3 = r10.A0u;
        } else {
            i = 8;
            i2 = 0;
            i3 = 0;
        }
        Context context = r10.A1M.getContext();
        0qQ.A07(context);
        boolean A0B = C316216lI.A0B(context);
        if (!z || A0B) {
            i4 = 0;
        } else {
            i4 = r10.A0s;
        }
        if (r10.A0S != null) {
            View view = r10.A0Q;
            if (view != null) {
                view.setPadding(0, 0, i2, 0);
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        View view2 = r10.A0B;
        if (view2 != null) {
            view2.setPadding(i2, 0, i2, 0);
            TextView textView = r10.A0X;
            if (textView != null) {
                textView.setVisibility(i);
                View view3 = r10.A0C;
                if (view3 != null) {
                    int i5 = 0;
                    if (z) {
                        i5 = 2;
                    }
                    view3.setImportantForAccessibility(i5);
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        View view4 = r10.A0K;
        if (view4 != null) {
            view4.setPadding(i2, 0, i2, 0);
            TextView textView2 = r10.A0b;
            if (textView2 != null) {
                textView2.setVisibility(i);
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        View view5 = r10.A0E;
        if (view5 != null) {
            view5.setPadding(i2, 0, i2, 0);
            TextView textView3 = r10.A0Y;
            if (textView3 != null) {
                textView3.setVisibility(i);
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        View view6 = r10.A09;
        if (view6 != null) {
            view6.setPadding(i2, 0, i2, 0);
            TextView textView4 = r10.A0W;
            if (textView4 != null) {
                textView4.setVisibility(i);
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        if (r10.A1S.A00 != null) {
            View view7 = r10.A08;
            if (view7 != null) {
                view7.setPadding(i2, 0, i2, 0);
                TextView textView5 = r10.A0V;
                if (textView5 != null) {
                    textView5.setVisibility(i);
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        View view8 = r10.A0F;
        if (view8 != null) {
            view8.setPadding(i2, 0, i2, 0);
            IgTextView igTextView = r10.A0h;
            if (igTextView != null) {
                igTextView.setVisibility(i);
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        View view9 = r10.A05;
        if (view9 != null) {
            view9.setPadding(i2, 0, i2, 0);
            TextView textView6 = r10.A0U;
            if (textView6 != null) {
                textView6.setVisibility(i);
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        View view10 = r10.A0I;
        if (view10 != null) {
            view10.setPadding(i2, 0, i2, 0);
            TextView textView7 = r10.A0Z;
            if (textView7 != null) {
                textView7.setVisibility(i);
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        r10.A0y.setPadding(i2, 0, i3, 0);
        if (i != 8 || !1NM.A00(userSession).A01() || r10.A1g.CVM()) {
            r10.A1g.getView().setVisibility(i);
        }
        View view11 = r10.A0z;
        view11.setPadding(view11.getPaddingLeft(), 0, i2, i4);
    }

    public static final void A06(C255773uh r1, C250973mM r2, C317116mk r3) {
        String str;
        if (r3.ARh()) {
            1Ns r0 = r2.A0H.A0W;
            if (r0 == null || (str = r0.getName()) == null) {
                str = "";
            }
            r3.EvK(str);
            return;
        }
        r3.E0x(r1, r2, false);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v475, resolved type: X.DET} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v691, resolved type: X.OjE} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v6, resolved type: X.OjE} */
    /* JADX WARNING: type inference failed for: r3v472, types: [android.view.View$OnClickListener] */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x006f: MOVE  (r44v0 X.3BQ) = (r51v0 X.3BQ)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:122)
        	at jadx.core.dex.visitors.regions.TernaryMod.visitRegion(TernaryMod.java:34)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:73)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:31)
        */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x03b8 A[Catch:{ NotFoundException -> 0x0d03, all -> 0x1434 }] */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x0473 A[Catch:{ NotFoundException -> 0x0d03, all -> 0x1434 }] */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x0487 A[Catch:{ NotFoundException -> 0x0d03, all -> 0x1434 }] */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x04cc A[Catch:{ NotFoundException -> 0x0d03, all -> 0x1434 }] */
    /* JADX WARNING: Removed duplicated region for block: B:316:0x072c A[Catch:{ NotFoundException -> 0x0d03, all -> 0x1434 }] */
    /* JADX WARNING: Removed duplicated region for block: B:338:0x0782 A[Catch:{ NotFoundException -> 0x0d03, all -> 0x1434 }] */
    /* JADX WARNING: Removed duplicated region for block: B:339:0x0784 A[Catch:{ NotFoundException -> 0x0d03, all -> 0x1434 }] */
    /* JADX WARNING: Removed duplicated region for block: B:342:0x0793 A[Catch:{ NotFoundException -> 0x0d03, all -> 0x1434 }] */
    /* JADX WARNING: Removed duplicated region for block: B:356:0x07d6 A[Catch:{ NotFoundException -> 0x0d03, all -> 0x1434 }] */
    /* JADX WARNING: Removed duplicated region for block: B:375:0x087b A[Catch:{ NotFoundException -> 0x0d03, all -> 0x1434 }] */
    /* JADX WARNING: Removed duplicated region for block: B:380:0x0899 A[Catch:{ NotFoundException -> 0x0d03, all -> 0x1434 }] */
    /* JADX WARNING: Removed duplicated region for block: B:385:0x08bf A[Catch:{ NotFoundException -> 0x0d03, all -> 0x1434 }] */
    /* JADX WARNING: Removed duplicated region for block: B:388:0x08cc A[Catch:{ NotFoundException -> 0x0d03, all -> 0x1434 }] */
    /* JADX WARNING: Removed duplicated region for block: B:389:0x08d0 A[Catch:{ NotFoundException -> 0x0d03, all -> 0x1434 }] */
    /* JADX WARNING: Removed duplicated region for block: B:435:0x09a2 A[Catch:{ NotFoundException -> 0x0d03, all -> 0x1434 }] */
    /* JADX WARNING: Removed duplicated region for block: B:436:0x09a3 A[Catch:{ NotFoundException -> 0x0d03, all -> 0x1434 }] */
    /* JADX WARNING: Removed duplicated region for block: B:480:0x0a48 A[Catch:{ NotFoundException -> 0x0d03, all -> 0x1434 }] */
    /* JADX WARNING: Removed duplicated region for block: B:485:0x0a57 A[Catch:{ NotFoundException -> 0x0d03, all -> 0x1434 }] */
    /* JADX WARNING: Removed duplicated region for block: B:491:0x0a6e A[Catch:{ NotFoundException -> 0x0d03, all -> 0x1434 }] */
    /* JADX WARNING: Removed duplicated region for block: B:538:0x0ba6 A[Catch:{ NotFoundException -> 0x0d03, all -> 0x1434 }] */
    /* JADX WARNING: Removed duplicated region for block: B:625:0x0d4b A[Catch:{ NotFoundException -> 0x0d03, all -> 0x1434 }] */
    /* JADX WARNING: Removed duplicated region for block: B:630:0x0d71 A[Catch:{ NotFoundException -> 0x0d03, all -> 0x1434 }] */
    /* JADX WARNING: Removed duplicated region for block: B:768:0x10c5 A[Catch:{ NotFoundException -> 0x0d03, all -> 0x1434 }] */
    /* JADX WARNING: Removed duplicated region for block: B:773:0x10df A[Catch:{ NotFoundException -> 0x0d03, all -> 0x1434 }] */
    /* JADX WARNING: Removed duplicated region for block: B:783:0x1108 A[Catch:{ NotFoundException -> 0x0d03, all -> 0x1434 }] */
    /* JADX WARNING: Removed duplicated region for block: B:802:0x115a A[Catch:{ NotFoundException -> 0x0d03, all -> 0x1434 }] */
    /* JADX WARNING: Removed duplicated region for block: B:805:0x1171 A[Catch:{ NotFoundException -> 0x0d03, all -> 0x1434 }] */
    /* JADX WARNING: Removed duplicated region for block: B:808:0x117d A[Catch:{ NotFoundException -> 0x0d03, all -> 0x1434 }] */
    /* JADX WARNING: Removed duplicated region for block: B:821:0x11b3 A[Catch:{ NotFoundException -> 0x0d03, all -> 0x1434 }] */
    /* JADX WARNING: Removed duplicated region for block: B:884:0x1337 A[Catch:{ NotFoundException -> 0x0d03, all -> 0x1434 }] */
    /* JADX WARNING: Removed duplicated region for block: B:905:0x13f5 A[Catch:{ NotFoundException -> 0x0d03, all -> 0x1434 }] */
    public static final void A01(X.AnonymousClass0iw r46, com.instagram.common.session.UserSession r47, X.C255773uh r48, X.C250973mM r49, com.instagram.model.reels.ReelViewerConfig r50, X.AnonymousClass3BQ r51, X.C309426Yf r52, X.C317116mk r53, X.C316136lA r54, int r55, boolean r56, boolean r57) {
        /*
            r2 = 0
            r1 = 1
            r0 = r54
            X.0qQ.A0B(r0, r1)
            r1 = 7
            r8 = r53
            X.0qQ.A0B(r8, r1)
            r7 = 8
            r3 = 11
            r1 = r46
            X.0qQ.A0B(r1, r3)
            r16 = 1
            boolean r1 = com.facebook.systrace.Systrace.A0E(r16)
            if (r1 == 0) goto L_0x0026
            r3 = -1998728282(0xffffffff88ddd3a6, float:-1.3350712E-33)
            java.lang.String r1 = "ReelViewerItemToolbarBinder.bindView"
            X.0fS.A01(r1, r3)
        L_0x0026:
            r6 = r49
            r0.A0k = r6     // Catch:{ all -> 0x1434 }
            r30 = r52
            r1 = r30
            r0.A0m = r1     // Catch:{ all -> 0x1434 }
            if (r56 != 0) goto L_0x003f
            r1 = r48
            X.1Xj r10 = r1.A0b     // Catch:{ all -> 0x1434 }
            r13 = 1
            if (r10 == 0) goto L_0x0046
            boolean r3 = r10.A5f()     // Catch:{ all -> 0x1434 }
            if (r3 != r13) goto L_0x0046
        L_0x003f:
            androidx.constraintlayout.widget.ConstraintLayout r0 = r0.A1M     // Catch:{ all -> 0x1434 }
            r0.setVisibility(r7)     // Catch:{ all -> 0x1434 }
            goto L_0x1427
        L_0x0046:
            X.4gL r3 = r1.A0c     // Catch:{ all -> 0x1434 }
            if (r3 == 0) goto L_0x0051
            boolean r3 = r3.A08()     // Catch:{ all -> 0x1434 }
            if (r3 != r13) goto L_0x0051
            goto L_0x003f
        L_0x0051:
            com.instagram.model.reels.Reel r3 = r6.A0H     // Catch:{ all -> 0x1434 }
            r43 = r3
            boolean r3 = r43.A0p()     // Catch:{ all -> 0x1434 }
            if (r3 != 0) goto L_0x003f
            r5 = r47
            X.3BK r3 = X.AnonymousClass3BJ.A00(r5)     // Catch:{ all -> 0x1434 }
            boolean r3 = r3.A02(r1)     // Catch:{ all -> 0x1434 }
            if (r3 != 0) goto L_0x003f
            boolean r3 = r1.A1i()     // Catch:{ all -> 0x1434 }
            if (r3 != 0) goto L_0x003f
            X.3BQ r4 = X.AnonymousClass3BQ.MY_WEEK_NUX     // Catch:{ all -> 0x1434 }
            r44 = r51
            r3 = r44
            if (r3 == r4) goto L_0x003f
            X.6n7 r3 = new X.6n7     // Catch:{ all -> 0x1434 }
            r3.<init>(r5)     // Catch:{ all -> 0x1434 }
            boolean r3 = r3.A00(r6)     // Catch:{ all -> 0x1434 }
            if (r3 != 0) goto L_0x003f
            X.6Xh r25 = A02     // Catch:{ all -> 0x1434 }
            androidx.constraintlayout.widget.ConstraintLayout r3 = r0.A1M     // Catch:{ all -> 0x1434 }
            r42 = r3
            r3.setVisibility(r2)     // Catch:{ all -> 0x1434 }
            com.instagram.common.session.UserSession r3 = r0.A1O     // Catch:{ all -> 0x1434 }
            r41 = r3
            X.1NN r3 = X.1NM.A00(r41)     // Catch:{ all -> 0x1434 }
            boolean r3 = r3.A01()     // Catch:{ all -> 0x1434 }
            if (r3 == 0) goto L_0x009f
            X.3oV r3 = r0.A1h     // Catch:{ all -> 0x1434 }
            boolean r3 = r3.CVM()     // Catch:{ all -> 0x1434 }
            if (r3 == 0) goto L_0x00a8
        L_0x009f:
            X.3oV r3 = r0.A1h     // Catch:{ all -> 0x1434 }
            android.view.View r3 = r3.getView()     // Catch:{ all -> 0x1434 }
            r3.setVisibility(r7)     // Catch:{ all -> 0x1434 }
        L_0x00a8:
            X.6lC r3 = r0.A1m     // Catch:{ all -> 0x1434 }
            r3.A01()     // Catch:{ all -> 0x1434 }
            X.6lB r3 = r0.A1n     // Catch:{ all -> 0x1434 }
            r28 = r3
            X.AnonymousClass6YT.A01(r28)     // Catch:{ all -> 0x1434 }
            X.1NN r3 = X.1NM.A00(r41)     // Catch:{ all -> 0x1434 }
            boolean r3 = r3.A01()     // Catch:{ all -> 0x1434 }
            if (r3 == 0) goto L_0x00c8
            X.3oV r3 = r0.A1X     // Catch:{ all -> 0x1434 }
            r29 = r3
            boolean r3 = r29.CVM()     // Catch:{ all -> 0x1434 }
            if (r3 == 0) goto L_0x00d5
        L_0x00c8:
            X.3oV r3 = r0.A1X     // Catch:{ all -> 0x1434 }
            r29 = r3
            android.view.View r3 = r29.getView()     // Catch:{ all -> 0x1434 }
            android.widget.TextView r3 = (android.widget.TextView) r3     // Catch:{ all -> 0x1434 }
            r3.setVisibility(r7)     // Catch:{ all -> 0x1434 }
        L_0x00d5:
            X.1NN r3 = X.1NM.A00(r41)     // Catch:{ all -> 0x1434 }
            boolean r3 = r3.A01()     // Catch:{ all -> 0x1434 }
            if (r3 == 0) goto L_0x00e9
            X.3oV r3 = r0.A1W     // Catch:{ all -> 0x1434 }
            r27 = r3
            boolean r3 = r27.CVM()     // Catch:{ all -> 0x1434 }
            if (r3 == 0) goto L_0x00f6
        L_0x00e9:
            X.3oV r3 = r0.A1W     // Catch:{ all -> 0x1434 }
            r27 = r3
            android.view.View r3 = r27.getView()     // Catch:{ all -> 0x1434 }
            android.widget.TextView r3 = (android.widget.TextView) r3     // Catch:{ all -> 0x1434 }
            r3.setVisibility(r7)     // Catch:{ all -> 0x1434 }
        L_0x00f6:
            X.1NN r3 = X.1NM.A00(r41)     // Catch:{ all -> 0x1434 }
            boolean r3 = r3.A01()     // Catch:{ all -> 0x1434 }
            if (r3 == 0) goto L_0x010a
            X.3oV r3 = r0.A1f     // Catch:{ all -> 0x1434 }
            r26 = r3
            boolean r3 = r26.CVM()     // Catch:{ all -> 0x1434 }
            if (r3 == 0) goto L_0x0117
        L_0x010a:
            X.3oV r3 = r0.A1f     // Catch:{ all -> 0x1434 }
            r26 = r3
            android.view.View r3 = r26.getView()     // Catch:{ all -> 0x1434 }
            com.instagram.common.ui.base.IgSimpleImageView r3 = (com.instagram.common.ui.base.IgSimpleImageView) r3     // Catch:{ all -> 0x1434 }
            r3.setVisibility(r7)     // Catch:{ all -> 0x1434 }
        L_0x0117:
            X.HnK r3 = r0.A0o     // Catch:{ all -> 0x1434 }
            if (r3 == 0) goto L_0x0123
            android.widget.LinearLayout r3 = r3.A02     // Catch:{ all -> 0x1434 }
            X.0qQ.A0A(r3)     // Catch:{ all -> 0x1434 }
            r3.setVisibility(r7)     // Catch:{ all -> 0x1434 }
        L_0x0123:
            X.1NN r3 = X.1NM.A00(r41)     // Catch:{ all -> 0x1434 }
            boolean r3 = r3.A01()     // Catch:{ all -> 0x1434 }
            if (r3 == 0) goto L_0x0137
            X.3oV r3 = r0.A1c     // Catch:{ all -> 0x1434 }
            r40 = r3
            boolean r3 = r40.CVM()     // Catch:{ all -> 0x1434 }
            if (r3 == 0) goto L_0x0142
        L_0x0137:
            X.3oV r3 = r0.A1c     // Catch:{ all -> 0x1434 }
            r40 = r3
            android.view.View r3 = r40.getView()     // Catch:{ all -> 0x1434 }
            r3.setVisibility(r7)     // Catch:{ all -> 0x1434 }
        L_0x0142:
            android.view.View r3 = r0.A0y     // Catch:{ all -> 0x1434 }
            r21 = r3
            r3.setVisibility(r7)     // Catch:{ all -> 0x1434 }
            X.1NN r3 = X.1NM.A00(r41)     // Catch:{ all -> 0x1434 }
            boolean r3 = r3.A01()     // Catch:{ all -> 0x1434 }
            if (r3 == 0) goto L_0x015d
            X.3oV r3 = r0.A1e     // Catch:{ all -> 0x1434 }
            r39 = r3
            boolean r3 = r39.CVM()     // Catch:{ all -> 0x1434 }
            if (r3 == 0) goto L_0x0168
        L_0x015d:
            X.3oV r3 = r0.A1e     // Catch:{ all -> 0x1434 }
            r39 = r3
            android.view.View r3 = r39.getView()     // Catch:{ all -> 0x1434 }
            r3.setVisibility(r7)     // Catch:{ all -> 0x1434 }
        L_0x0168:
            X.6lK r3 = r0.A0n     // Catch:{ all -> 0x1434 }
            r35 = r3
            com.instagram.common.session.UserSession r3 = r3.A01     // Catch:{ all -> 0x1434 }
            r33 = r3
            boolean r3 = X.C317336n6.A00(r33)     // Catch:{ all -> 0x1434 }
            if (r3 != 0) goto L_0x017d
            r3 = r35
            com.instagram.ui.widget.bouncyufibutton.IgBouncyUfiButtonImageView r3 = r3.A04     // Catch:{ all -> 0x1434 }
            X.0nA.A0O(r3)     // Catch:{ all -> 0x1434 }
        L_0x017d:
            X.2eb r3 = r0.A1P     // Catch:{ all -> 0x1434 }
            r34 = r3
            r3.A03(r7)     // Catch:{ all -> 0x1434 }
            X.2eb r3 = r0.A1T     // Catch:{ all -> 0x1434 }
            r32 = r3
            r3.A03(r7)     // Catch:{ all -> 0x1434 }
            android.view.View r3 = r0.A0B     // Catch:{ all -> 0x1434 }
            X.0nA.A0O(r3)     // Catch:{ all -> 0x1434 }
            android.view.View r3 = r0.A0K     // Catch:{ all -> 0x1434 }
            X.0nA.A0O(r3)     // Catch:{ all -> 0x1434 }
            android.view.View r3 = r0.A0E     // Catch:{ all -> 0x1434 }
            X.0nA.A0O(r3)     // Catch:{ all -> 0x1434 }
            android.view.View r3 = r0.A09     // Catch:{ all -> 0x1434 }
            X.0nA.A0O(r3)     // Catch:{ all -> 0x1434 }
            android.view.View r3 = r0.A08     // Catch:{ all -> 0x1434 }
            X.0nA.A0O(r3)     // Catch:{ all -> 0x1434 }
            android.view.View r3 = r0.A0R     // Catch:{ all -> 0x1434 }
            X.0nA.A0O(r3)     // Catch:{ all -> 0x1434 }
            android.view.View r3 = r0.A0J     // Catch:{ all -> 0x1434 }
            X.0nA.A0O(r3)     // Catch:{ all -> 0x1434 }
            android.view.View r3 = r0.A0F     // Catch:{ all -> 0x1434 }
            X.0nA.A0O(r3)     // Catch:{ all -> 0x1434 }
            android.view.View r3 = r0.A05     // Catch:{ all -> 0x1434 }
            X.0nA.A0O(r3)     // Catch:{ all -> 0x1434 }
            android.view.View r3 = r0.A04     // Catch:{ all -> 0x1434 }
            X.0nA.A0O(r3)     // Catch:{ all -> 0x1434 }
            android.view.View r3 = r0.A0Q     // Catch:{ all -> 0x1434 }
            X.0nA.A0O(r3)     // Catch:{ all -> 0x1434 }
            android.view.View r3 = r0.A0M     // Catch:{ all -> 0x1434 }
            X.0nA.A0O(r3)     // Catch:{ all -> 0x1434 }
            android.view.View r3 = r0.A07     // Catch:{ all -> 0x1434 }
            X.0nA.A0O(r3)     // Catch:{ all -> 0x1434 }
            android.view.View r3 = r0.A0I     // Catch:{ all -> 0x1434 }
            X.0nA.A0O(r3)     // Catch:{ all -> 0x1434 }
            android.view.View r3 = r0.A0O     // Catch:{ all -> 0x1434 }
            X.0nA.A0O(r3)     // Catch:{ all -> 0x1434 }
            android.view.View r3 = r0.A0N     // Catch:{ all -> 0x1434 }
            X.0nA.A0O(r3)     // Catch:{ all -> 0x1434 }
            boolean r3 = X.C317336n6.A01(r41)     // Catch:{ all -> 0x1434 }
            if (r3 != 0) goto L_0x01e7
            android.view.View r4 = r0.A0x     // Catch:{ all -> 0x1434 }
            r3 = 4
            r4.setVisibility(r3)     // Catch:{ all -> 0x1434 }
        L_0x01e7:
            A04(r5, r0, r2)     // Catch:{ all -> 0x1434 }
            android.widget.TextView r15 = r0.A1L     // Catch:{ all -> 0x1434 }
            r11 = 0
            r15.setTypeface(r11, r2)     // Catch:{ all -> 0x1434 }
            r15.setVisibility(r7)     // Catch:{ all -> 0x1434 }
            r15.setCompoundDrawables(r11, r11, r11, r11)     // Catch:{ all -> 0x1434 }
            r15.setOnClickListener(r11)     // Catch:{ all -> 0x1434 }
            r24 = -1
            r3 = r24
            r15.setTextColor(r3)     // Catch:{ all -> 0x1434 }
            android.view.View r9 = r0.A0z     // Catch:{ all -> 0x1434 }
            android.content.Context r18 = r42.getContext()     // Catch:{ all -> 0x1434 }
            r4 = 2131100175(0x7f06020f, float:1.7812724E38)
            r3 = r18
            int r4 = r3.getColor(r4)     // Catch:{ all -> 0x1434 }
            android.graphics.drawable.ColorDrawable r3 = new android.graphics.drawable.ColorDrawable     // Catch:{ all -> 0x1434 }
            r3.<init>(r4)     // Catch:{ all -> 0x1434 }
            r9.setBackground(r3)     // Catch:{ all -> 0x1434 }
            android.view.ViewStub r3 = r0.A17     // Catch:{ all -> 0x1434 }
            r23 = r3
            r3.setVisibility(r7)     // Catch:{ all -> 0x1434 }
            android.view.View r3 = r0.A0G     // Catch:{ all -> 0x1434 }
            X.0nA.A0O(r3)     // Catch:{ all -> 0x1434 }
            android.view.View r3 = r0.A0H     // Catch:{ all -> 0x1434 }
            X.0nA.A0O(r3)     // Catch:{ all -> 0x1434 }
            android.view.View r3 = r0.A0P     // Catch:{ all -> 0x1434 }
            X.0nA.A0O(r3)     // Catch:{ all -> 0x1434 }
            android.view.View r3 = r0.A0D     // Catch:{ all -> 0x1434 }
            X.0nA.A0O(r3)     // Catch:{ all -> 0x1434 }
            X.6lL r12 = r0.A0p     // Catch:{ all -> 0x1434 }
            if (r12 == 0) goto L_0x0240
            android.view.ViewStub r3 = r12.A0C     // Catch:{ all -> 0x1434 }
            r3.setVisibility(r7)     // Catch:{ all -> 0x1434 }
            android.view.ViewStub r3 = r12.A0B     // Catch:{ all -> 0x1434 }
            r3.setVisibility(r7)     // Catch:{ all -> 0x1434 }
        L_0x0240:
            com.instagram.model.effect.AttributedAREffect r3 = r1.A05     // Catch:{ all -> 0x1434 }
            r22 = r3
            X.0Tu r9 = X.0Tu.A05     // Catch:{ all -> 0x1434 }
            r19 = 36601788606648658(0x820922000b1152, double:3.210456726192946E-306)
            r3 = r19
            long r19 = X.182.A01(r9, r5, r3)     // Catch:{ all -> 0x1434 }
            r3 = r19
            int r14 = (int) r3     // Catch:{ all -> 0x1434 }
            r3 = r43
            boolean r3 = r3.A18(r5)     // Catch:{ all -> 0x1434 }
            if (r3 == 0) goto L_0x02bb
            r3 = 36319424571317653(0x81085300051d95, double:3.0318885732609094E-306)
            boolean r3 = X.182.A06(r9, r5, r3)     // Catch:{ all -> 0x1434 }
            if (r3 == 0) goto L_0x0287
            android.view.View r3 = r0.A0O     // Catch:{ all -> 0x1434 }
            if (r3 != 0) goto L_0x0273
            android.view.ViewStub r3 = r0.A1I     // Catch:{ all -> 0x1434 }
            android.view.View r3 = r3.inflate()     // Catch:{ all -> 0x1434 }
            r0.A0O = r3     // Catch:{ all -> 0x1434 }
        L_0x0273:
            android.view.ViewStub r3 = r0.A1I     // Catch:{ all -> 0x1434 }
            r3.setVisibility(r2)     // Catch:{ all -> 0x1434 }
            android.view.View r4 = r0.A0O     // Catch:{ all -> 0x1434 }
            X.0qQ.A0A(r4)     // Catch:{ all -> 0x1434 }
            X.FNd r3 = new X.FNd     // Catch:{ all -> 0x1434 }
            r2 = r44
            r3.<init>(r1, r2, r8)     // Catch:{ all -> 0x1434 }
            X.AnonymousClass0fU.A00(r3, r4)     // Catch:{ all -> 0x1434 }
        L_0x0287:
            android.view.View r1 = r0.A0N     // Catch:{ all -> 0x1434 }
            if (r1 != 0) goto L_0x02ab
            android.view.ViewStub r1 = r0.A1H     // Catch:{ all -> 0x1434 }
            android.view.View r2 = r1.inflate()     // Catch:{ all -> 0x1434 }
            r0.A0N = r2     // Catch:{ all -> 0x1434 }
            if (r2 == 0) goto L_0x02a0
            r1 = 2131428133(0x7f0b0325, float:1.8477902E38)
            android.view.View r1 = r2.requireViewById(r1)     // Catch:{ all -> 0x1434 }
            android.widget.TextView r1 = (android.widget.TextView) r1     // Catch:{ all -> 0x1434 }
            r0.A0e = r1     // Catch:{ all -> 0x1434 }
        L_0x02a0:
            android.widget.TextView r2 = r0.A0e     // Catch:{ all -> 0x1434 }
            X.0qQ.A0A(r2)     // Catch:{ all -> 0x1434 }
            r1 = 2131973082(0x7f1353da, float:1.958319E38)
            r2.setText(r1)     // Catch:{ all -> 0x1434 }
        L_0x02ab:
            android.view.ViewStub r0 = r0.A1H     // Catch:{ all -> 0x1434 }
            r0.setVisibility(r7)     // Catch:{ all -> 0x1434 }
            boolean r0 = com.facebook.systrace.Systrace.A0E(r16)
            if (r0 == 0) goto L_0x1433
            r0 = -1877569976(0xffffffff90168e48, float:-2.9691893E-29)
            goto L_0x1430
        L_0x02bb:
            boolean r3 = r1.A1Y()     // Catch:{ all -> 0x1434 }
            r45 = r50
            if (r3 == 0) goto L_0x02da
            r22 = r5
            r23 = r1
            r24 = r6
            r25 = r44
            r26 = r8
            r27 = r0
            A02(r22, r23, r24, r25, r26, r27)     // Catch:{ all -> 0x1434 }
        L_0x02d2:
            boolean r3 = r1.A1e()     // Catch:{ all -> 0x1434 }
            if (r3 != 0) goto L_0x1056
            goto L_0x103d
        L_0x02da:
            boolean r3 = r1.A12()     // Catch:{ all -> 0x1434 }
            if (r3 == 0) goto L_0x03c3
            if (r22 == 0) goto L_0x03c3
            r3 = r22
            java.lang.String r11 = r3.A09     // Catch:{ all -> 0x1434 }
            X.0qQ.A07(r11)     // Catch:{ all -> 0x1434 }
            boolean r3 = X.C305756Jk.A00(r18)     // Catch:{ all -> 0x1434 }
            if (r3 == 0) goto L_0x0399
            r3 = r22
            java.lang.String r3 = r3.A0C     // Catch:{ all -> 0x1434 }
            if (r3 != 0) goto L_0x0399
            r3 = r22
            java.lang.String r4 = r3.A06     // Catch:{ all -> 0x1434 }
            java.lang.String r3 = "25025320"
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x1434 }
            if (r3 != 0) goto L_0x030c
            r3 = 36324784690246002(0x810d3300013172, double:3.035278334054664E-306)
            boolean r3 = X.182.A06(r9, r5, r3)     // Catch:{ all -> 0x1434 }
            if (r3 != 0) goto L_0x0399
        L_0x030c:
            android.view.View r3 = r29.getView()     // Catch:{ all -> 0x1434 }
            android.widget.TextView r3 = (android.widget.TextView) r3     // Catch:{ all -> 0x1434 }
            r3.setVisibility(r2)     // Catch:{ all -> 0x1434 }
            android.view.View r4 = r29.getView()     // Catch:{ all -> 0x1434 }
            android.widget.TextView r4 = (android.widget.TextView) r4     // Catch:{ all -> 0x1434 }
            X.DEJ r3 = new X.DEJ     // Catch:{ all -> 0x1434 }
            r3.<init>(r8, r11)     // Catch:{ all -> 0x1434 }
            X.AnonymousClass0fU.A00(r3, r4)     // Catch:{ all -> 0x1434 }
            android.view.View r3 = r29.getView()     // Catch:{ all -> 0x1434 }
            android.widget.TextView r3 = (android.widget.TextView) r3     // Catch:{ all -> 0x1434 }
            android.graphics.drawable.Drawable[] r3 = r3.getCompoundDrawables()     // Catch:{ all -> 0x1434 }
            r11 = r3[r2]     // Catch:{ all -> 0x1434 }
            r3 = 2131099778(0x7f060082, float:1.7811919E38)
            r4 = r18
            int r4 = r4.getColor(r3)     // Catch:{ all -> 0x1434 }
            android.graphics.PorterDuff$Mode r3 = android.graphics.PorterDuff.Mode.SRC_ATOP     // Catch:{ all -> 0x1434 }
            r11.setColorFilter(r4, r3)     // Catch:{ all -> 0x1434 }
            X.0t1 r3 = X.0eE.A00(r5)     // Catch:{ all -> 0x1434 }
            com.instagram.user.model.User r4 = r3.A00()     // Catch:{ all -> 0x1434 }
            com.instagram.user.model.User r3 = r1.A0i     // Catch:{ all -> 0x1434 }
            boolean r3 = r4.equals(r3)     // Catch:{ all -> 0x1434 }
            if (r3 != 0) goto L_0x03b0
            boolean r3 = X.C305756Jk.A00(r18)     // Catch:{ all -> 0x1434 }
            if (r3 == 0) goto L_0x03b0
            r3 = r22
            com.instagram.model.shopping.ProductAREffectContainer r3 = r3.A04     // Catch:{ all -> 0x1434 }
            if (r3 != 0) goto L_0x03b0
            com.instagram.model.effect.AttributedAREffect r3 = r1.A05     // Catch:{ all -> 0x1434 }
            if (r3 == 0) goto L_0x0366
            boolean r3 = r3.CbC()     // Catch:{ all -> 0x1434 }
            r4 = 2131238728(0x7f081f48, float:1.8093743E38)
            if (r3 == r13) goto L_0x0369
        L_0x0366:
            r4 = 2131238729(0x7f081f49, float:1.8093745E38)
        L_0x0369:
            android.view.View r11 = r26.getView()     // Catch:{ all -> 0x1434 }
            com.instagram.common.ui.base.IgSimpleImageView r11 = (com.instagram.common.ui.base.IgSimpleImageView) r11     // Catch:{ all -> 0x1434 }
            r3 = r18
            android.graphics.drawable.Drawable r3 = r3.getDrawable(r4)     // Catch:{ all -> 0x1434 }
            r11.setImageDrawable(r3)     // Catch:{ all -> 0x1434 }
            android.view.View r3 = r26.getView()     // Catch:{ all -> 0x1434 }
            com.instagram.common.ui.base.IgSimpleImageView r3 = (com.instagram.common.ui.base.IgSimpleImageView) r3     // Catch:{ all -> 0x1434 }
            r3.setVisibility(r2)     // Catch:{ all -> 0x1434 }
            android.view.View r4 = r26.getView()     // Catch:{ all -> 0x1434 }
            com.instagram.common.ui.base.IgSimpleImageView r4 = (com.instagram.common.ui.base.IgSimpleImageView) r4     // Catch:{ all -> 0x1434 }
            X.OjE r3 = new X.OjE     // Catch:{ all -> 0x1434 }
            r23 = r3
            r24 = r18
            r25 = r5
            r26 = r1
            r27 = r8
            r28 = r0
            r23.<init>(r24, r25, r26, r27, r28)     // Catch:{ all -> 0x1434 }
            goto L_0x03ad
        L_0x0399:
            android.view.View r3 = r27.getView()     // Catch:{ all -> 0x1434 }
            android.widget.TextView r3 = (android.widget.TextView) r3     // Catch:{ all -> 0x1434 }
            r3.setVisibility(r2)     // Catch:{ all -> 0x1434 }
            android.view.View r4 = r27.getView()     // Catch:{ all -> 0x1434 }
            android.widget.TextView r4 = (android.widget.TextView) r4     // Catch:{ all -> 0x1434 }
            X.DET r3 = new X.DET     // Catch:{ all -> 0x1434 }
            r3.<init>(r1, r6, r8)     // Catch:{ all -> 0x1434 }
        L_0x03ad:
            X.AnonymousClass0fU.A00(r3, r4)     // Catch:{ all -> 0x1434 }
        L_0x03b0:
            r3 = r22
            int r4 = r3.A00     // Catch:{ all -> 0x1434 }
            r3 = 10
            if (r4 != r3) goto L_0x02d2
            android.view.View r3 = r29.getView()     // Catch:{ all -> 0x1434 }
            android.widget.TextView r3 = (android.widget.TextView) r3     // Catch:{ all -> 0x1434 }
            r3.setVisibility(r7)     // Catch:{ all -> 0x1434 }
            goto L_0x02d2
        L_0x03c3:
            boolean r3 = X.AnonymousClass6YK.A02(r5, r1, r6)     // Catch:{ all -> 0x1434 }
            if (r3 == 0) goto L_0x0baf
            java.lang.String r3 = r1.A0j     // Catch:{ all -> 0x1434 }
            r23 = r3
            A01 = r3     // Catch:{ all -> 0x1434 }
            A00 = r2     // Catch:{ all -> 0x1434 }
            boolean r3 = r1.A1H()     // Catch:{ all -> 0x1434 }
            if (r3 == 0) goto L_0x041e
            r15.setVisibility(r2)     // Catch:{ all -> 0x1434 }
            r3 = r24
            r15.setTextColor(r3)     // Catch:{ all -> 0x1434 }
            android.content.res.Resources r3 = r42.getResources()     // Catch:{ all -> 0x1434 }
            int r7 = X.C64020LJh.A00(r5, r1)     // Catch:{ all -> 0x1434 }
            X.DUA r11 = r1.A05()     // Catch:{ all -> 0x1434 }
            if (r11 == 0) goto L_0x0416
            X.0qQ.A0A(r3)     // Catch:{ all -> 0x1434 }
            X.0qQ.A0B(r3, r13)     // Catch:{ all -> 0x1434 }
            java.lang.String r4 = r11.CAh()     // Catch:{ all -> 0x1434 }
            if (r4 == 0) goto L_0x040e
            java.lang.String r11 = r11.CAh()     // Catch:{ all -> 0x1434 }
            java.util.Map r4 = X.C62566Khw.A01     // Catch:{ all -> 0x1434 }
            java.lang.Object r4 = r4.get(r11)     // Catch:{ all -> 0x1434 }
            X.Khw r4 = (X.C62566Khw) r4     // Catch:{ all -> 0x1434 }
            if (r4 == 0) goto L_0x040e
            int r4 = r4.ordinal()     // Catch:{ all -> 0x1434 }
            switch(r4) {
                case 0: goto L_0x0f73;
                case 1: goto L_0x0f77;
                case 2: goto L_0x0f77;
                case 3: goto L_0x0f7f;
                case 4: goto L_0x0f83;
                case 5: goto L_0x0f87;
                default: goto L_0x040e;
            }     // Catch:{ all -> 0x1434 }
        L_0x040e:
            java.lang.String r0 = "Unknown flag type"
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException     // Catch:{ all -> 0x1434 }
            r1.<init>(r0)     // Catch:{ all -> 0x1434 }
        L_0x0415:
            throw r1     // Catch:{ all -> 0x1434 }
        L_0x0416:
            java.lang.String r0 = "Required value was null."
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x1434 }
            r1.<init>(r0)     // Catch:{ all -> 0x1434 }
            goto L_0x0415
        L_0x041e:
            r3 = r45
            boolean r3 = r3.A0M     // Catch:{ all -> 0x1434 }
            if (r3 == 0) goto L_0x0437
            java.lang.String r31 = r46.getModuleName()     // Catch:{ all -> 0x1434 }
            r26 = r5
            r27 = r1
            r28 = r6
            r29 = r8
            r30 = r0
            r25.A03(r26, r27, r28, r29, r30, r31)     // Catch:{ all -> 0x1434 }
            goto L_0x02d2
        L_0x0437:
            r3 = r45
            com.instagram.model.reels.ReelViewerContextButtonType r3 = r3.A00     // Catch:{ all -> 0x1434 }
            r19 = r3
            r20 = 1
            if (r3 == 0) goto L_0x046f
            r3 = r45
            java.util.List r4 = r3.A03     // Catch:{ all -> 0x1434 }
            r3 = r23
            boolean r3 = r4.contains(r3)     // Catch:{ all -> 0x1434 }
            if (r3 != 0) goto L_0x046f
            int r3 = r19.ordinal()     // Catch:{ all -> 0x1434 }
            if (r3 == r2) goto L_0x0471
            if (r3 != r13) goto L_0x046f
            if (r10 == 0) goto L_0x0481
            int r3 = r1.A01()     // Catch:{ all -> 0x1434 }
            if (r3 > 0) goto L_0x0481
            com.instagram.model.venue.Venue r4 = r10.A24()     // Catch:{ all -> 0x1434 }
            if (r4 == 0) goto L_0x046f
            java.lang.Double r3 = r4.A00()     // Catch:{ all -> 0x1434 }
            if (r3 == 0) goto L_0x046f
            java.lang.Double r3 = r4.A01()     // Catch:{ all -> 0x1434 }
            if (r3 != 0) goto L_0x0471
        L_0x046f:
            r20 = 0
        L_0x0471:
            if (r20 == 0) goto L_0x0483
            r3 = 36322671566268764(0x810b470000295c, double:3.033941985942591E-306)
            boolean r3 = X.182.A06(r9, r5, r3)     // Catch:{ all -> 0x1434 }
            r22 = 1
            if (r3 != 0) goto L_0x0488
            goto L_0x0483
        L_0x0481:
            r20 = 0
        L_0x0483:
            r22 = 0
            if (r20 == 0) goto L_0x0488
            goto L_0x04c6
        L_0x0488:
            java.lang.String r31 = r46.getModuleName()     // Catch:{ all -> 0x1434 }
            r26 = r5
            r27 = r1
            r28 = r6
            r29 = r8
            r30 = r0
            r25.A03(r26, r27, r28, r29, r30, r31)     // Catch:{ all -> 0x1434 }
            boolean r3 = X.AnonymousClass4EQ.A0B(r5, r1)     // Catch:{ all -> 0x1434 }
            if (r3 == 0) goto L_0x04c6
            boolean r3 = X.C317336n6.A00(r33)     // Catch:{ all -> 0x1434 }
            if (r3 != 0) goto L_0x04c6
            r3 = r35
            X.0eM r3 = r3.A08     // Catch:{ all -> 0x1434 }
            java.lang.Object r3 = r3.getValue()     // Catch:{ all -> 0x1434 }
            X.61R r3 = (X.AnonymousClass61R) r3     // Catch:{ all -> 0x1434 }
            X.61U r3 = r3.A03     // Catch:{ all -> 0x1434 }
            boolean r3 = r3.isRunning()     // Catch:{ all -> 0x1434 }
            if (r3 != 0) goto L_0x04c6
            r3 = r35
            X.0eM r3 = r3.A06     // Catch:{ all -> 0x1434 }
            java.lang.Object r3 = r3.getValue()     // Catch:{ all -> 0x1434 }
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3     // Catch:{ all -> 0x1434 }
            if (r3 == 0) goto L_0x04c6
            r3.setVisibility(r2)     // Catch:{ all -> 0x1434 }
        L_0x04c6:
            boolean r3 = r1.A1e()     // Catch:{ all -> 0x1434 }
            if (r3 != 0) goto L_0x02d2
            r3 = r32
            r3.A03(r7)     // Catch:{ all -> 0x1434 }
            boolean r3 = X.AnonymousClass4EQ.A0H(r1)     // Catch:{ all -> 0x1434 }
            if (r3 == 0) goto L_0x0515
            android.view.View r3 = r0.A0B     // Catch:{ all -> 0x1434 }
            if (r3 != 0) goto L_0x0500
            android.view.ViewStub r3 = r0.A1A     // Catch:{ all -> 0x1434 }
            android.view.View r4 = r3.inflate()     // Catch:{ all -> 0x1434 }
            r0.A0B = r4     // Catch:{ all -> 0x1434 }
            if (r4 == 0) goto L_0x04e6
            goto L_0x04e8
        L_0x04e6:
            r3 = r11
            goto L_0x04f1
        L_0x04e8:
            r3 = 2131435473(0x7f0b1fd1, float:1.849279E38)
            android.view.View r3 = r4.findViewById(r3)     // Catch:{ all -> 0x1434 }
            android.widget.TextView r3 = (android.widget.TextView) r3     // Catch:{ all -> 0x1434 }
        L_0x04f1:
            r0.A0X = r3     // Catch:{ all -> 0x1434 }
            android.view.View r4 = r0.A0B     // Catch:{ all -> 0x1434 }
            if (r4 == 0) goto L_0x0540
            r3 = 2131435472(0x7f0b1fd0, float:1.8492787E38)
            android.view.View r3 = r4.findViewById(r3)     // Catch:{ all -> 0x1434 }
        L_0x04fe:
            r0.A0C = r3     // Catch:{ all -> 0x1434 }
        L_0x0500:
            android.view.View r3 = r0.A0B     // Catch:{ all -> 0x1434 }
            X.0qQ.A0A(r3)     // Catch:{ all -> 0x1434 }
            r3.setVisibility(r2)     // Catch:{ all -> 0x1434 }
            android.view.View r4 = r0.A0B     // Catch:{ all -> 0x1434 }
            X.0qQ.A0A(r4)     // Catch:{ all -> 0x1434 }
            X.DEO r3 = new X.DEO     // Catch:{ all -> 0x1434 }
            r3.<init>(r1, r8)     // Catch:{ all -> 0x1434 }
            X.AnonymousClass0fU.A00(r3, r4)     // Catch:{ all -> 0x1434 }
        L_0x0515:
            r31 = r57
            r25 = r18
            r26 = r5
            r27 = r1
            r28 = r6
            r29 = r45
            r30 = r44
            java.lang.Integer r4 = X.JZT.A01(r25, r26, r27, r28, r29, r30, r31)     // Catch:{ all -> 0x1434 }
            java.lang.Integer r30 = X.AnonymousClass05K.A00     // Catch:{ all -> 0x1434 }
            r3 = r30
            if (r4 != r3) goto L_0x0577
            boolean r3 = r1.A1s(r5)     // Catch:{ all -> 0x1434 }
            if (r3 != 0) goto L_0x0577
            android.view.View r3 = r0.A09     // Catch:{ all -> 0x1434 }
            if (r3 != 0) goto L_0x0552
            android.view.ViewStub r3 = r0.A19     // Catch:{ all -> 0x1434 }
            android.view.View r4 = r3.inflate()     // Catch:{ all -> 0x1434 }
            r0.A09 = r4     // Catch:{ all -> 0x1434 }
            goto L_0x0542
        L_0x0540:
            r3 = r11
            goto L_0x04fe
        L_0x0542:
            if (r4 == 0) goto L_0x0545
            goto L_0x0547
        L_0x0545:
            r3 = r11
            goto L_0x0550
        L_0x0547:
            r3 = 2131433964(0x7f0b19ec, float:1.8489729E38)
            android.view.View r3 = r4.findViewById(r3)     // Catch:{ all -> 0x1434 }
            android.widget.TextView r3 = (android.widget.TextView) r3     // Catch:{ all -> 0x1434 }
        L_0x0550:
            r0.A0W = r3     // Catch:{ all -> 0x1434 }
        L_0x0552:
            android.view.View r3 = r0.A09     // Catch:{ all -> 0x1434 }
            X.0qQ.A0A(r3)     // Catch:{ all -> 0x1434 }
            r3.setVisibility(r2)     // Catch:{ all -> 0x1434 }
            android.view.View r4 = r0.A09     // Catch:{ all -> 0x1434 }
            X.0qQ.A0A(r4)     // Catch:{ all -> 0x1434 }
            r10.getClass()     // Catch:{ all -> 0x1434 }
            boolean r3 = r10.A5i()     // Catch:{ all -> 0x1434 }
            r4.setSelected(r3)     // Catch:{ all -> 0x1434 }
            android.view.View r4 = r0.A09     // Catch:{ all -> 0x1434 }
            X.0qQ.A0A(r4)     // Catch:{ all -> 0x1434 }
            X.Dg9 r3 = new X.Dg9     // Catch:{ all -> 0x1434 }
            r3.<init>(r1, r6, r8)     // Catch:{ all -> 0x1434 }
            X.AnonymousClass0fU.A00(r3, r4)     // Catch:{ all -> 0x1434 }
            goto L_0x057c
        L_0x0577:
            android.view.View r3 = r0.A09     // Catch:{ all -> 0x1434 }
            X.0nA.A0O(r3)     // Catch:{ all -> 0x1434 }
        L_0x057c:
            android.view.View r3 = r0.A09     // Catch:{ all -> 0x1434 }
            if (r3 == 0) goto L_0x05f3
            int r3 = r3.getVisibility()     // Catch:{ all -> 0x1434 }
            if (r3 != 0) goto L_0x05f3
            boolean r3 = X.JZT.A03(r5, r1, r6)     // Catch:{ all -> 0x1434 }
            if (r3 == 0) goto L_0x05f3
            android.view.View r3 = r0.A0E     // Catch:{ all -> 0x1434 }
            if (r3 != 0) goto L_0x05a8
            android.view.ViewStub r3 = r0.A1B     // Catch:{ all -> 0x1434 }
            android.view.View r4 = r3.inflate()     // Catch:{ all -> 0x1434 }
            r0.A0E = r4     // Catch:{ all -> 0x1434 }
            if (r4 == 0) goto L_0x059b
            goto L_0x059d
        L_0x059b:
            r3 = r11
            goto L_0x05a6
        L_0x059d:
            r3 = 2131436772(0x7f0b24e4, float:1.8495424E38)
            android.view.View r3 = r4.findViewById(r3)     // Catch:{ all -> 0x1434 }
            android.widget.TextView r3 = (android.widget.TextView) r3     // Catch:{ all -> 0x1434 }
        L_0x05a6:
            r0.A0Y = r3     // Catch:{ all -> 0x1434 }
        L_0x05a8:
            r10.getClass()     // Catch:{ all -> 0x1434 }
            X.1Xy r3 = r10.A0C     // Catch:{ all -> 0x1434 }
            java.util.List r4 = r3.BDV()     // Catch:{ all -> 0x1434 }
            r12 = 1
            if (r4 == 0) goto L_0x05be
            boolean r3 = r4 instanceof java.util.Collection     // Catch:{ all -> 0x1434 }
            if (r3 == 0) goto L_0x05c0
            boolean r3 = r4.isEmpty()     // Catch:{ all -> 0x1434 }
            if (r3 == 0) goto L_0x05c0
        L_0x05be:
            r12 = 0
            goto L_0x05d8
        L_0x05c0:
            java.util.Iterator r14 = r4.iterator()     // Catch:{ all -> 0x1434 }
        L_0x05c4:
            boolean r3 = r14.hasNext()     // Catch:{ all -> 0x1434 }
            if (r3 == 0) goto L_0x05be
            java.lang.Object r4 = r14.next()     // Catch:{ all -> 0x1434 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x1434 }
            java.lang.String r3 = "myWeek"
            boolean r3 = X.00p.A0k(r4, r3, r2)     // Catch:{ all -> 0x1434 }
            if (r3 == 0) goto L_0x05c4
        L_0x05d8:
            android.view.View r3 = r0.A0E     // Catch:{ all -> 0x1434 }
            if (r3 == 0) goto L_0x05df
            r3.setVisibility(r2)     // Catch:{ all -> 0x1434 }
        L_0x05df:
            android.view.View r3 = r0.A0E     // Catch:{ all -> 0x1434 }
            if (r3 == 0) goto L_0x05e6
            r3.setSelected(r12)     // Catch:{ all -> 0x1434 }
        L_0x05e6:
            android.view.View r4 = r0.A0E     // Catch:{ all -> 0x1434 }
            if (r4 == 0) goto L_0x05f8
            X.FNc r3 = new X.FNc     // Catch:{ all -> 0x1434 }
            r3.<init>(r1, r8, r12)     // Catch:{ all -> 0x1434 }
            X.AnonymousClass0fU.A00(r3, r4)     // Catch:{ all -> 0x1434 }
            goto L_0x05f8
        L_0x05f3:
            android.view.View r3 = r0.A0E     // Catch:{ all -> 0x1434 }
            X.0nA.A0O(r3)     // Catch:{ all -> 0x1434 }
        L_0x05f8:
            r32 = r18
            r33 = r5
            r34 = r1
            r35 = r6
            r36 = r45
            r37 = r44
            r38 = r31
            X.N4R r29 = X.JZT.A00(r32, r33, r34, r35, r36, r37, r38)     // Catch:{ all -> 0x1434 }
            r3 = r29
            java.lang.Object r12 = r3.A00     // Catch:{ all -> 0x1434 }
            java.lang.Integer r12 = (java.lang.Integer) r12     // Catch:{ all -> 0x1434 }
            r3 = 5
            X.0qQ.A0B(r12, r3)     // Catch:{ all -> 0x1434 }
            r3 = 36328744650030657(0x8110cd00003e41, double:3.037782628567958E-306)
            boolean r28 = X.182.A06(r9, r5, r3)     // Catch:{ all -> 0x1434 }
            r3 = 36891694603502487(0x8310cd00010397, double:3.393794445961058E-306)
            java.lang.String r24 = X.182.A04(r9, r5, r3)     // Catch:{ all -> 0x1434 }
            java.lang.String r15 = "com.whatsapp"
            java.lang.String r14 = "[0-9]+(\\.[0-9]+)*"
            X.11S r4 = new X.11S     // Catch:{ Exception -> 0x0694 }
            r4.<init>(r14)     // Catch:{ Exception -> 0x0694 }
            r3 = r24
            boolean r3 = r4.A08(r3)     // Catch:{ Exception -> 0x0694 }
            if (r3 == 0) goto L_0x068c
            r27 = 0
            r3 = r18
            java.lang.String r4 = X.0oI.A05(r3, r15)     // Catch:{ Exception -> 0x06a0 }
            if (r4 == 0) goto L_0x06a0
            X.11S r3 = new X.11S     // Catch:{ Exception -> 0x06a0 }
            r3.<init>(r14)     // Catch:{ Exception -> 0x06a0 }
            boolean r3 = r3.A08(r4)     // Catch:{ Exception -> 0x06a0 }
            if (r3 == 0) goto L_0x0684
            java.lang.String r14 = "."
            java.lang.String[] r3 = new java.lang.String[]{r14}     // Catch:{ Exception -> 0x06a0 }
            java.util.List r4 = X.00l.A0R(r4, r3, r2)     // Catch:{ Exception -> 0x06a0 }
            java.lang.String[] r3 = new java.lang.String[r2]     // Catch:{ Exception -> 0x06a0 }
            java.lang.Object[] r26 = r4.toArray(r3)     // Catch:{ Exception -> 0x06a0 }
            r3 = r26
            java.lang.String[] r3 = (java.lang.String[]) r3     // Catch:{ Exception -> 0x06a0 }
            r26 = r3
            java.lang.String[] r4 = new java.lang.String[]{r14}     // Catch:{ Exception -> 0x06a0 }
            r3 = r24
            java.util.List r4 = X.00l.A0R(r3, r4, r2)     // Catch:{ Exception -> 0x06a0 }
            java.lang.String[] r3 = new java.lang.String[r2]     // Catch:{ Exception -> 0x06a0 }
            java.lang.Object[] r15 = r4.toArray(r3)     // Catch:{ Exception -> 0x06a0 }
            java.lang.String[] r15 = (java.lang.String[]) r15     // Catch:{ Exception -> 0x06a0 }
            r3 = r26
            int r3 = r3.length     // Catch:{ Exception -> 0x06a0 }
            r33 = r3
            int r3 = r15.length     // Catch:{ Exception -> 0x06a0 }
            r32 = r3
            r4 = r33
            int r25 = java.lang.Math.max(r4, r3)     // Catch:{ Exception -> 0x06a0 }
            r4 = 0
            goto L_0x06a5
        L_0x0684:
            java.lang.String r4 = "Invalid version format"
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException     // Catch:{ Exception -> 0x06a0 }
            r3.<init>(r4)     // Catch:{ Exception -> 0x06a0 }
            throw r3     // Catch:{ Exception -> 0x06a0 }
        L_0x068c:
            java.lang.String r4 = "Invalid version format"
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException     // Catch:{ Exception -> 0x0694 }
            r3.<init>(r4)     // Catch:{ Exception -> 0x0694 }
            throw r3     // Catch:{ Exception -> 0x0694 }
        L_0x0694:
            r27 = 0
            goto L_0x06a0
        L_0x0697:
            r14 = 0
        L_0x0698:
            r3 = r24
            if (r3 < r14) goto L_0x06a0
            if (r3 <= r14) goto L_0x06a3
            r27 = 1
        L_0x06a0:
            if (r10 == 0) goto L_0x0724
            goto L_0x06c1
        L_0x06a3:
            int r4 = r4 + 1
        L_0x06a5:
            r3 = r25
            if (r4 >= r3) goto L_0x06a0
            r3 = r33
            if (r4 >= r3) goto L_0x06b4
            r3 = r26[r4]     // Catch:{ Exception -> 0x06a0 }
            int r24 = java.lang.Integer.parseInt(r3)     // Catch:{ Exception -> 0x06a0 }
            goto L_0x06b6
        L_0x06b4:
            r24 = 0
        L_0x06b6:
            r3 = r32
            if (r4 >= r3) goto L_0x0697
            r3 = r15[r4]     // Catch:{ Exception -> 0x06a0 }
            int r14 = java.lang.Integer.parseInt(r3)     // Catch:{ Exception -> 0x06a0 }
            goto L_0x0698
        L_0x06c1:
            boolean r3 = r1.CWu()     // Catch:{ all -> 0x1434 }
            if (r3 == 0) goto L_0x0724
            boolean r3 = r1.A1g()     // Catch:{ all -> 0x1434 }
            if (r3 == 0) goto L_0x0724
            java.util.List r3 = r1.A0b()     // Catch:{ all -> 0x1434 }
            boolean r3 = X.JZT.A05(r3)     // Catch:{ all -> 0x1434 }
            if (r3 != 0) goto L_0x0724
            boolean r3 = r1.A1L()     // Catch:{ all -> 0x1434 }
            if (r3 != 0) goto L_0x0724
            boolean r3 = r43.A0b()     // Catch:{ all -> 0x1434 }
            if (r3 != 0) goto L_0x0724
            boolean r3 = r43.A0i()     // Catch:{ all -> 0x1434 }
            if (r3 != 0) goto L_0x0724
            if (r57 != 0) goto L_0x0724
            X.3WT r3 = X.AnonymousClass3WT.SECRET_STICKER     // Catch:{ all -> 0x1434 }
            boolean r3 = r1.A1t(r3)     // Catch:{ all -> 0x1434 }
            if (r3 != 0) goto L_0x0724
            java.util.List r3 = r1.A0b()     // Catch:{ all -> 0x1434 }
            if (r3 == 0) goto L_0x0705
            boolean r3 = r3.isEmpty()     // Catch:{ all -> 0x1434 }
            if (r3 != 0) goto L_0x0705
            boolean r3 = r1.A0u()     // Catch:{ all -> 0x1434 }
            if (r3 == 0) goto L_0x0724
        L_0x0705:
            boolean r3 = r1.A1j()     // Catch:{ all -> 0x1434 }
            if (r3 != 0) goto L_0x0724
            boolean r3 = r6.A0D()     // Catch:{ all -> 0x1434 }
            if (r3 != 0) goto L_0x0724
            boolean r3 = r1.A1D()     // Catch:{ all -> 0x1434 }
            if (r3 != 0) goto L_0x0724
            if (r28 == 0) goto L_0x0724
            if (r27 == 0) goto L_0x0724
            java.lang.Integer r3 = X.AnonymousClass05K.A0N     // Catch:{ all -> 0x1434 }
            r27 = r30
            if (r12 != r3) goto L_0x0726
            r27 = r3
            goto L_0x0726
        L_0x0724:
            java.lang.Integer r27 = X.AnonymousClass05K.A0C     // Catch:{ all -> 0x1434 }
        L_0x0726:
            java.lang.String r26 = "Required value was null."
            r3 = r30
            if (r12 == r3) goto L_0x0772
            java.lang.Integer r3 = X.AnonymousClass05K.A0N     // Catch:{ all -> 0x1434 }
            if (r12 != r3) goto L_0x0737
            java.lang.Integer r4 = X.AnonymousClass05K.A0C     // Catch:{ all -> 0x1434 }
            r3 = r27
            if (r3 != r4) goto L_0x0737
            goto L_0x0772
        L_0x0737:
            java.lang.Integer r3 = X.AnonymousClass05K.A0C     // Catch:{ all -> 0x1434 }
            if (r12 != r3) goto L_0x086e
            X.Jqo r14 = new X.Jqo     // Catch:{ all -> 0x1434 }
            r14.<init>()     // Catch:{ all -> 0x1434 }
            if (r10 == 0) goto L_0x0743
            goto L_0x0745
        L_0x0743:
            r4 = r11
            goto L_0x0749
        L_0x0745:
            java.lang.String r4 = r10.getId()     // Catch:{ all -> 0x1434 }
        L_0x0749:
            java.lang.String r3 = "media_id"
            r14.A06(r3, r4)     // Catch:{ all -> 0x1434 }
            r3 = r29
            java.lang.Object r3 = r3.A02     // Catch:{ all -> 0x1434 }
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ all -> 0x1434 }
            if (r3 == 0) goto L_0x076f
            java.lang.String r4 = X.C59807JZb.A00(r3)     // Catch:{ all -> 0x1434 }
        L_0x075a:
            java.lang.String r3 = "unavailable_reason"
            r14.A06(r3, r4)     // Catch:{ all -> 0x1434 }
            X.818 r12 = X.AnonymousClass818.IG_SELF_STORY_VIEW_FB_BUTTON     // Catch:{ all -> 0x1434 }
            X.JZY r4 = X.JZY.A07     // Catch:{ all -> 0x1434 }
            X.JZZ r3 = X.JZZ.A04     // Catch:{ all -> 0x1434 }
            X.JZX.A00(r4, r3, r12, r14, r5)     // Catch:{ all -> 0x1434 }
            X.2eb r3 = r0.A1S     // Catch:{ all -> 0x1434 }
            r3.A03(r7)     // Catch:{ all -> 0x1434 }
            goto L_0x0873
        L_0x076f:
            java.lang.String r4 = ""
            goto L_0x075a
        L_0x0772:
            if (r10 == 0) goto L_0x0784
            boolean r3 = r10.A5O()     // Catch:{ all -> 0x1434 }
            if (r3 != 0) goto L_0x0782
            int r4 = r10.A12()     // Catch:{ all -> 0x1434 }
            r3 = 19
            if (r4 != r3) goto L_0x0784
        L_0x0782:
            r12 = 1
            goto L_0x0785
        L_0x0784:
            r12 = 0
        L_0x0785:
            X.2eb r14 = r0.A1S     // Catch:{ all -> 0x1434 }
            X.MmQ r3 = new X.MmQ     // Catch:{ all -> 0x1434 }
            r3.<init>(r0)     // Catch:{ all -> 0x1434 }
            r14.A02 = r3     // Catch:{ all -> 0x1434 }
            r14.A01()     // Catch:{ all -> 0x1434 }
            if (r12 != 0) goto L_0x07cf
            boolean r3 = X.AnonymousClass8PU.A07(r5)     // Catch:{ all -> 0x1434 }
            if (r3 != 0) goto L_0x079b
            r4 = 0
            goto L_0x07c0
        L_0x079b:
            X.8jd r4 = X.C363388je.A00(r5)     // Catch:{ all -> 0x1434 }
            java.lang.String r3 = "ReelViewerItemToolbarBinder"
            com.facebook.common.callercontext.CallerContext r3 = com.facebook.common.callercontext.CallerContext.A01(r3)     // Catch:{ all -> 0x1434 }
            X.5wF r3 = r4.A00(r3)     // Catch:{ all -> 0x1434 }
            boolean r3 = X.C363388je.A01(r3)     // Catch:{ all -> 0x1434 }
            if (r3 != 0) goto L_0x07bb
            r3 = 36326558511740744(0x810ed000013748, double:3.0364001059105445E-306)
            boolean r4 = X.182.A06(r9, r5, r3)     // Catch:{ all -> 0x1434 }
            r3 = 0
            if (r4 != 0) goto L_0x07bc
        L_0x07bb:
            r3 = 1
        L_0x07bc:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r3)     // Catch:{ all -> 0x1434 }
        L_0x07c0:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r2)     // Catch:{ all -> 0x1434 }
            boolean r3 = X.0qQ.A0K(r4, r3)     // Catch:{ all -> 0x1434 }
            if (r3 == 0) goto L_0x07cf
            r14.A03(r7)     // Catch:{ all -> 0x1434 }
            goto L_0x0873
        L_0x07cf:
            r14.A03(r2)     // Catch:{ all -> 0x1434 }
            android.view.View r3 = r0.A08     // Catch:{ all -> 0x1434 }
            if (r3 == 0) goto L_0x0ba6
            r3.setSelected(r12)     // Catch:{ all -> 0x1434 }
            android.view.View r4 = r0.A08     // Catch:{ all -> 0x1434 }
            X.0qQ.A0A(r4)     // Catch:{ all -> 0x1434 }
            X.GVr r3 = new X.GVr     // Catch:{ all -> 0x1434 }
            r3.<init>(r1, r6, r8)     // Catch:{ all -> 0x1434 }
            X.AnonymousClass0fU.A00(r3, r4)     // Catch:{ all -> 0x1434 }
            if (r10 == 0) goto L_0x0829
            X.6Sd r3 = X.C307936Sb.A00(r5)     // Catch:{ all -> 0x1434 }
            java.lang.String r4 = r10.getId()     // Catch:{ all -> 0x1434 }
            java.util.Set r3 = r3.A00     // Catch:{ all -> 0x1434 }
            boolean r3 = X.00k.A0u(r3, r4)     // Catch:{ all -> 0x1434 }
            if (r3 != 0) goto L_0x0829
            X.6Sd r3 = X.C307936Sb.A00(r5)     // Catch:{ all -> 0x1434 }
            java.lang.String r4 = r10.getId()     // Catch:{ all -> 0x1434 }
            if (r4 == 0) goto L_0x0807
            java.util.Set r3 = r3.A00     // Catch:{ all -> 0x1434 }
            r3.add(r4)     // Catch:{ all -> 0x1434 }
        L_0x0807:
            X.818 r14 = X.AnonymousClass818.IG_SELF_STORY_VIEW_FB_BUTTON     // Catch:{ all -> 0x1434 }
            if (r12 == 0) goto L_0x0856
            X.JZY r24 = X.JZY.A07     // Catch:{ all -> 0x1434 }
            X.JZZ r15 = X.JZZ.A04     // Catch:{ all -> 0x1434 }
            X.Jqo r12 = new X.Jqo     // Catch:{ all -> 0x1434 }
            r12.<init>()     // Catch:{ all -> 0x1434 }
            java.lang.String r4 = r10.getId()     // Catch:{ all -> 0x1434 }
            java.lang.String r3 = "media_id"
            r12.A06(r3, r4)     // Catch:{ all -> 0x1434 }
            java.lang.String r4 = "MEDIA_ALREADY_CROSSPOSTED"
            java.lang.String r3 = "unavailable_reason"
            r12.A06(r3, r4)     // Catch:{ all -> 0x1434 }
            r3 = r24
            X.JZX.A00(r3, r15, r14, r12, r5)     // Catch:{ all -> 0x1434 }
        L_0x0829:
            X.1Av r3 = X.1Au.A00(r5)     // Catch:{ all -> 0x1434 }
            X.0xa r14 = r3.A01     // Catch:{ all -> 0x1434 }
            java.lang.String r12 = "self_story_fb_button_last_action_time_stamp"
            r3 = 0
            long r24 = r14.getLong(r12, r3)     // Catch:{ all -> 0x1434 }
            int r14 = (r24 > r3 ? 1 : (r24 == r3 ? 0 : -1))
            if (r14 != 0) goto L_0x0873
            boolean r3 = X.AnonymousClass8PU.A07(r5)     // Catch:{ all -> 0x1434 }
            if (r3 != 0) goto L_0x0873
            X.1Av r14 = X.1Au.A00(r5)     // Catch:{ all -> 0x1434 }
            long r3 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x1434 }
            X.0xa r14 = r14.A01     // Catch:{ all -> 0x1434 }
            X.0xY r14 = r14.AR4()     // Catch:{ all -> 0x1434 }
            r14.E5c(r12, r3)     // Catch:{ all -> 0x1434 }
            r14.apply()     // Catch:{ all -> 0x1434 }
            goto L_0x0873
        L_0x0856:
            X.JZY r24 = X.JZY.A08     // Catch:{ all -> 0x1434 }
            X.JZZ r15 = X.JZZ.A04     // Catch:{ all -> 0x1434 }
            X.Jqo r12 = new X.Jqo     // Catch:{ all -> 0x1434 }
            r12.<init>()     // Catch:{ all -> 0x1434 }
            java.lang.String r4 = r10.getId()     // Catch:{ all -> 0x1434 }
            java.lang.String r3 = "media_id"
            r12.A06(r3, r4)     // Catch:{ all -> 0x1434 }
            r3 = r24
            X.JZX.A00(r3, r15, r14, r12, r5)     // Catch:{ all -> 0x1434 }
            goto L_0x0829
        L_0x086e:
            X.2eb r3 = r0.A1S     // Catch:{ all -> 0x1434 }
            r3.A03(r7)     // Catch:{ all -> 0x1434 }
        L_0x0873:
            X.2eb r12 = r0.A1V     // Catch:{ all -> 0x1434 }
            r4 = r27
            r3 = r30
            if (r4 != r3) goto L_0x08d0
            X.OzH r3 = new X.OzH     // Catch:{ all -> 0x1434 }
            r3.<init>(r5, r1, r0)     // Catch:{ all -> 0x1434 }
            r12.A02 = r3     // Catch:{ all -> 0x1434 }
            r12.A03(r2)     // Catch:{ all -> 0x1434 }
            android.view.View r4 = r0.A0R     // Catch:{ all -> 0x1434 }
            if (r4 == 0) goto L_0x0891
            X.IBc r3 = new X.IBc     // Catch:{ all -> 0x1434 }
            r3.<init>(r1, r6, r8)     // Catch:{ all -> 0x1434 }
            X.AnonymousClass0fU.A00(r3, r4)     // Catch:{ all -> 0x1434 }
        L_0x0891:
            java.lang.Integer r12 = X.AnonymousClass05K.A0N     // Catch:{ all -> 0x1434 }
            X.2eb r4 = r0.A1U     // Catch:{ all -> 0x1434 }
            r3 = r27
            if (r3 != r12) goto L_0x08cc
            X.OzB r3 = new X.OzB     // Catch:{ all -> 0x1434 }
            r3.<init>(r0)     // Catch:{ all -> 0x1434 }
            r4.A02 = r3     // Catch:{ all -> 0x1434 }
            r4.A03(r2)     // Catch:{ all -> 0x1434 }
            android.view.View r4 = r0.A0J     // Catch:{ all -> 0x1434 }
            if (r4 == 0) goto L_0x08b9
            X.OjK r3 = new X.OjK     // Catch:{ all -> 0x1434 }
            r32 = r3
            r33 = r29
            r36 = r8
            r37 = r0
            r38 = r27
            r32.<init>(r33, r34, r35, r36, r37, r38)     // Catch:{ all -> 0x1434 }
            X.AnonymousClass0fU.A00(r3, r4)     // Catch:{ all -> 0x1434 }
        L_0x08b9:
            boolean r3 = X.JZT.A04(r1, r6)     // Catch:{ all -> 0x1434 }
            if (r3 == 0) goto L_0x0925
            android.view.View r3 = r0.A0F     // Catch:{ all -> 0x1434 }
            if (r3 != 0) goto L_0x08ec
            android.view.ViewStub r3 = r0.A1C     // Catch:{ all -> 0x1434 }
            android.view.View r4 = r3.inflate()     // Catch:{ all -> 0x1434 }
            r0.A0F = r4     // Catch:{ all -> 0x1434 }
            goto L_0x08d4
        L_0x08cc:
            r4.A03(r7)     // Catch:{ all -> 0x1434 }
            goto L_0x08b9
        L_0x08d0:
            r12.A03(r7)     // Catch:{ all -> 0x1434 }
            goto L_0x0891
        L_0x08d4:
            if (r4 == 0) goto L_0x08d7
            goto L_0x08d9
        L_0x08d7:
            r4 = r11
            goto L_0x08e2
        L_0x08d9:
            r3 = 2131438676(0x7f0b2c54, float:1.8499286E38)
            android.view.View r4 = r4.findViewById(r3)     // Catch:{ all -> 0x1434 }
            com.instagram.common.ui.base.IgTextView r4 = (com.instagram.common.ui.base.IgTextView) r4     // Catch:{ all -> 0x1434 }
        L_0x08e2:
            r0.A0h = r4     // Catch:{ all -> 0x1434 }
            if (r4 == 0) goto L_0x08ec
            r3 = 2131971455(0x7f134d7f, float:1.957989E38)
            r4.setText(r3)     // Catch:{ all -> 0x1434 }
        L_0x08ec:
            android.view.View r4 = r0.A0F     // Catch:{ all -> 0x1434 }
            X.0qQ.A0A(r4)     // Catch:{ all -> 0x1434 }
            r3 = 1065353216(0x3f800000, float:1.0)
            r4.setAlpha(r3)     // Catch:{ all -> 0x1434 }
            r10.getClass()     // Catch:{ all -> 0x1434 }
            X.UyC r4 = r10.A1Z()     // Catch:{ all -> 0x1434 }
            X.UyC r3 = X.C16616UyC.BOOSTED     // Catch:{ all -> 0x1434 }
            if (r4 == r3) goto L_0x090a
            X.UyC r7 = r10.A1Z()     // Catch:{ all -> 0x1434 }
            X.UyC r4 = X.C16616UyC.PENDING     // Catch:{ all -> 0x1434 }
            r3 = 0
            if (r7 != r4) goto L_0x090b
        L_0x090a:
            r3 = 1
        L_0x090b:
            android.view.ViewStub r4 = r0.A1C     // Catch:{ all -> 0x1434 }
            r4.setVisibility(r2)     // Catch:{ all -> 0x1434 }
            android.view.View r4 = r0.A0F     // Catch:{ all -> 0x1434 }
            X.0qQ.A0A(r4)     // Catch:{ all -> 0x1434 }
            r4.setSelected(r3)     // Catch:{ all -> 0x1434 }
            android.view.View r4 = r0.A0F     // Catch:{ all -> 0x1434 }
            X.0qQ.A0A(r4)     // Catch:{ all -> 0x1434 }
            X.FNZ r3 = new X.FNZ     // Catch:{ all -> 0x1434 }
            r3.<init>(r1, r6, r8)     // Catch:{ all -> 0x1434 }
            X.AnonymousClass0fU.A00(r3, r4)     // Catch:{ all -> 0x1434 }
        L_0x0925:
            boolean r3 = r43.A0b()     // Catch:{ all -> 0x1434 }
            if (r3 != 0) goto L_0x09aa
            boolean r3 = r1.CWu()     // Catch:{ all -> 0x1434 }
            if (r3 == 0) goto L_0x09aa
            boolean r3 = r1.A1g()     // Catch:{ all -> 0x1434 }
            if (r3 == 0) goto L_0x09aa
            if (r10 == 0) goto L_0x09aa
            boolean r3 = r10.A53()     // Catch:{ all -> 0x1434 }
            if (r3 != 0) goto L_0x09aa
            X.3WT r3 = X.AnonymousClass3WT.SECRET_STICKER     // Catch:{ all -> 0x1434 }
            boolean r3 = r1.A1t(r3)     // Catch:{ all -> 0x1434 }
            if (r3 != 0) goto L_0x09aa
            boolean r3 = r43.A0k()     // Catch:{ all -> 0x1434 }
            if (r3 != 0) goto L_0x09aa
            boolean r3 = r6.A0D()     // Catch:{ all -> 0x1434 }
            if (r3 != 0) goto L_0x09aa
            X.3QO r4 = r1.A0B()     // Catch:{ all -> 0x1434 }
            X.3QO r3 = X.AnonymousClass3QO.CUSTOM     // Catch:{ all -> 0x1434 }
            if (r4 == r3) goto L_0x09aa
            X.3QO r4 = r1.A0B()     // Catch:{ all -> 0x1434 }
            X.3QO r3 = X.AnonymousClass3QO.HALLPASS     // Catch:{ all -> 0x1434 }
            if (r4 == r3) goto L_0x09aa
            X.3QO r4 = r1.A0B()     // Catch:{ all -> 0x1434 }
            X.3QO r3 = X.AnonymousClass3QO.OPAL     // Catch:{ all -> 0x1434 }
            if (r4 == r3) goto L_0x09aa
            boolean r3 = X.0oI.A0C(r18)     // Catch:{ all -> 0x1434 }
            if (r3 == 0) goto L_0x09aa
            if (r57 != 0) goto L_0x09aa
            r4 = r45
            r3 = r44
            boolean r3 = X.AnonymousClass6YK.A05(r5, r1, r6, r4, r3)     // Catch:{ all -> 0x1434 }
            if (r3 == 0) goto L_0x09a3
            X.0t1 r3 = X.0eE.A00(r5)     // Catch:{ all -> 0x1434 }
            com.instagram.user.model.User r3 = r3.A00()     // Catch:{ all -> 0x1434 }
            boolean r3 = X.2Ek.A00(r3)     // Catch:{ all -> 0x1434 }
            r3 = r3 ^ 1
            if (r3 == 0) goto L_0x09a3
            java.lang.Boolean r3 = X.C59806JZa.A00(r5)     // Catch:{ all -> 0x1434 }
            boolean r3 = r3.booleanValue()     // Catch:{ all -> 0x1434 }
            if (r3 == 0) goto L_0x09a3
            r3 = 36316718741787244(0x8105dd0003126c, double:3.030177395770378E-306)
            boolean r3 = X.182.A06(r9, r5, r3)     // Catch:{ all -> 0x1434 }
            if (r3 == 0) goto L_0x09a3
            goto L_0x09aa
        L_0x09a3:
            X.3BQ r4 = X.AnonymousClass3BQ.HIGHLIGHTS_ARCHIVE_GRID_SUBTAB     // Catch:{ all -> 0x1434 }
            r7 = 1
            r3 = r44
            if (r3 != r4) goto L_0x09ab
        L_0x09aa:
            r7 = 0
        L_0x09ab:
            android.view.View r3 = r0.A0K     // Catch:{ all -> 0x1434 }
            if (r7 == 0) goto L_0x09be
            if (r3 != 0) goto L_0x09cd
            android.view.ViewStub r3 = r0.A1E     // Catch:{ all -> 0x1434 }
            android.view.View r4 = r3.inflate()     // Catch:{ all -> 0x1434 }
            r0.A0K = r4     // Catch:{ all -> 0x1434 }
            if (r4 == 0) goto L_0x09bc
            goto L_0x09c2
        L_0x09bc:
            r3 = r11
            goto L_0x09cb
        L_0x09be:
            X.0nA.A0O(r3)     // Catch:{ all -> 0x1434 }
            goto L_0x0a06
        L_0x09c2:
            r3 = 2131441249(0x7f0b3661, float:1.8504504E38)
            android.view.View r3 = r4.findViewById(r3)     // Catch:{ all -> 0x1434 }
            android.widget.TextView r3 = (android.widget.TextView) r3     // Catch:{ all -> 0x1434 }
        L_0x09cb:
            r0.A0b = r3     // Catch:{ all -> 0x1434 }
        L_0x09cd:
            android.view.View r3 = r0.A0K     // Catch:{ all -> 0x1434 }
            X.0qQ.A0A(r3)     // Catch:{ all -> 0x1434 }
            r3.setVisibility(r2)     // Catch:{ all -> 0x1434 }
            android.view.View r4 = r0.A0K     // Catch:{ all -> 0x1434 }
            X.0qQ.A0A(r4)     // Catch:{ all -> 0x1434 }
            X.FNa r3 = new X.FNa     // Catch:{ all -> 0x1434 }
            r3.<init>(r1, r6, r8)     // Catch:{ all -> 0x1434 }
            X.AnonymousClass0fU.A00(r3, r4)     // Catch:{ all -> 0x1434 }
            X.WPX r3 = new X.WPX     // Catch:{ all -> 0x1434 }
            r4 = r44
            r3.<init>(r4)     // Catch:{ all -> 0x1434 }
            com.instagram.user.model.User r4 = r1.A0i     // Catch:{ all -> 0x1434 }
            if (r4 == 0) goto L_0x0a29
            java.lang.String r31 = r4.getId()     // Catch:{ all -> 0x1434 }
        L_0x09f1:
            boolean r4 = r43.A0i()     // Catch:{ all -> 0x1434 }
            if (r4 == 0) goto L_0x0a26
            java.lang.String r32 = "story_highlight_reel_bottom_toolbar"
        L_0x09f9:
            java.lang.String r33 = "system_share_sheet"
            r27 = r3
            r28 = r5
            r29 = r11
            r30 = r23
            X.C22031Xty.A0A(r27, r28, r29, r30, r31, r32, r33)     // Catch:{ all -> 0x1434 }
        L_0x0a06:
            boolean r3 = X.JZT.A02(r5, r1, r6)     // Catch:{ all -> 0x1434 }
            if (r3 == 0) goto L_0x0aa8
            boolean r3 = X.JZT.A04(r1, r6)     // Catch:{ all -> 0x1434 }
            if (r3 != 0) goto L_0x0aa8
            X.3BQ r4 = X.AnonymousClass3BQ.ARCHIVE     // Catch:{ all -> 0x1434 }
            r3 = r44
            if (r3 == r4) goto L_0x0a2c
            boolean r3 = X.AnonymousClass6YK.A02(r5, r1, r6)     // Catch:{ all -> 0x1434 }
            if (r3 == 0) goto L_0x0a2c
            boolean r3 = r6.A0D()     // Catch:{ all -> 0x1434 }
            r4 = 1
            if (r3 != 0) goto L_0x0a2d
            goto L_0x0a2c
        L_0x0a26:
            java.lang.String r32 = "story_reel_bottom_toolbar"
            goto L_0x09f9
        L_0x0a29:
            r31 = r11
            goto L_0x09f1
        L_0x0a2c:
            r4 = 0
        L_0x0a2d:
            android.view.View r3 = r0.A05     // Catch:{ all -> 0x1434 }
            if (r3 != 0) goto L_0x0a44
            if (r4 != 0) goto L_0x0a44
            boolean r3 = r43.A0k()     // Catch:{ all -> 0x1434 }
            if (r3 != 0) goto L_0x0a44
            android.view.ViewStub r3 = r0.A16     // Catch:{ all -> 0x1434 }
            android.view.View r12 = r3.inflate()     // Catch:{ all -> 0x1434 }
            r0.A05 = r12     // Catch:{ all -> 0x1434 }
            if (r12 == 0) goto L_0x0a9e
            goto L_0x0a75
        L_0x0a44:
            android.view.View r3 = r0.A04     // Catch:{ all -> 0x1434 }
            if (r3 != 0) goto L_0x0a57
            if (r4 == 0) goto L_0x0a9e
            android.view.ViewStub r3 = r0.A15     // Catch:{ all -> 0x1434 }
            android.view.View r4 = r3.inflate()     // Catch:{ all -> 0x1434 }
            r0.A04 = r4     // Catch:{ all -> 0x1434 }
            if (r4 == 0) goto L_0x0a55
            goto L_0x0a5a
        L_0x0a55:
            r3 = r11
            goto L_0x0a63
        L_0x0a57:
            if (r4 == 0) goto L_0x0a9e
            goto L_0x0a65
        L_0x0a5a:
            r3 = 2131428133(0x7f0b0325, float:1.8477902E38)
            android.view.View r3 = r4.findViewById(r3)     // Catch:{ all -> 0x1434 }
            android.widget.TextView r3 = (android.widget.TextView) r3     // Catch:{ all -> 0x1434 }
        L_0x0a63:
            r0.A0U = r3     // Catch:{ all -> 0x1434 }
        L_0x0a65:
            android.view.View r4 = r0.A04     // Catch:{ all -> 0x1434 }
            X.FNb r3 = new X.FNb     // Catch:{ all -> 0x1434 }
            r3.<init>(r1, r6, r8)     // Catch:{ all -> 0x1434 }
            if (r4 == 0) goto L_0x0abe
            r4.setVisibility(r2)     // Catch:{ all -> 0x1434 }
            X.AnonymousClass0fU.A00(r3, r4)     // Catch:{ all -> 0x1434 }
            goto L_0x0abe
        L_0x0a75:
            android.content.Context r7 = r12.getContext()     // Catch:{ all -> 0x1434 }
            r3 = 2131428130(0x7f0b0322, float:1.8477896E38)
            android.view.View r4 = r12.requireViewById(r3)     // Catch:{ all -> 0x1434 }
            X.0qQ.A07(r4)     // Catch:{ all -> 0x1434 }
            android.widget.ImageView r4 = (android.widget.ImageView) r4     // Catch:{ all -> 0x1434 }
            r3 = 2131099843(0x7f0600c3, float:1.781205E38)
            int r3 = r7.getColor(r3)     // Catch:{ all -> 0x1434 }
            android.graphics.ColorFilter r3 = X.AnonymousClass37O.A00(r3)     // Catch:{ all -> 0x1434 }
            r4.setColorFilter(r3)     // Catch:{ all -> 0x1434 }
            r3 = 2131428133(0x7f0b0325, float:1.8477902E38)
            android.view.View r3 = r12.findViewById(r3)     // Catch:{ all -> 0x1434 }
            android.widget.TextView r3 = (android.widget.TextView) r3     // Catch:{ all -> 0x1434 }
            r0.A0U = r3     // Catch:{ all -> 0x1434 }
        L_0x0a9e:
            android.view.View r4 = r0.A05     // Catch:{ all -> 0x1434 }
            X.W9d r3 = new X.W9d     // Catch:{ all -> 0x1434 }
            r3.<init>(r1, r8)     // Catch:{ all -> 0x1434 }
            if (r4 == 0) goto L_0x0ab9
            goto L_0x0ab3
        L_0x0aa8:
            android.view.View r3 = r0.A05     // Catch:{ all -> 0x1434 }
            X.0nA.A0O(r3)     // Catch:{ all -> 0x1434 }
            android.view.View r3 = r0.A04     // Catch:{ all -> 0x1434 }
            X.0nA.A0O(r3)     // Catch:{ all -> 0x1434 }
            goto L_0x0abe
        L_0x0ab3:
            r4.setVisibility(r2)     // Catch:{ all -> 0x1434 }
            X.AnonymousClass0fU.A00(r3, r4)     // Catch:{ all -> 0x1434 }
        L_0x0ab9:
            android.view.View r3 = r0.A04     // Catch:{ all -> 0x1434 }
            X.0nA.A0O(r3)     // Catch:{ all -> 0x1434 }
        L_0x0abe:
            android.view.View r3 = r0.A03     // Catch:{ all -> 0x1434 }
            if (r20 == 0) goto L_0x0fb1
            if (r3 != 0) goto L_0x0b0c
            if (r22 == 0) goto L_0x0ae7
            android.view.ViewStub r3 = r0.A14     // Catch:{ all -> 0x1434 }
            android.view.View r4 = r3.inflate()     // Catch:{ all -> 0x1434 }
            r0.A03 = r4     // Catch:{ all -> 0x1434 }
            if (r4 == 0) goto L_0x0b0c
            r3 = 2131428128(0x7f0b0320, float:1.8477892E38)
            android.view.View r3 = r4.requireViewById(r3)     // Catch:{ all -> 0x1434 }
            android.widget.TextView r3 = (android.widget.TextView) r3     // Catch:{ all -> 0x1434 }
            r0.A0T = r3     // Catch:{ all -> 0x1434 }
            r3 = 2131428127(0x7f0b031f, float:1.847789E38)
            android.view.View r3 = r4.requireViewById(r3)     // Catch:{ all -> 0x1434 }
            com.instagram.common.ui.widget.imageview.IgImageView r3 = (com.instagram.common.ui.widget.imageview.IgImageView) r3     // Catch:{ all -> 0x1434 }
            r0.A0i = r3     // Catch:{ all -> 0x1434 }
            goto L_0x0b0c
        L_0x0ae7:
            android.view.ViewStub r3 = r0.A13     // Catch:{ all -> 0x1434 }
            android.view.View r4 = r3.inflate()     // Catch:{ all -> 0x1434 }
            r0.A03 = r4     // Catch:{ all -> 0x1434 }
            if (r4 == 0) goto L_0x0b0c
            r3 = 2131428115(0x7f0b0313, float:1.8477865E38)
            android.view.View r4 = r4.requireViewById(r3)     // Catch:{ all -> 0x1434 }
            android.widget.TextView r4 = (android.widget.TextView) r4     // Catch:{ all -> 0x1434 }
            r0.A0T = r4     // Catch:{ all -> 0x1434 }
            X.0qQ.A0A(r4)     // Catch:{ all -> 0x1434 }
            X.0qq r7 = X.AnonymousClass0qo.A00(r18)     // Catch:{ all -> 0x1434 }
            X.0qm r3 = X.0qm.A13     // Catch:{ all -> 0x1434 }
            android.graphics.Typeface r3 = r7.A02(r3)     // Catch:{ all -> 0x1434 }
            r4.setTypeface(r3)     // Catch:{ all -> 0x1434 }
        L_0x0b0c:
            if (r19 == 0) goto L_0x0b9d
            int r3 = r19.ordinal()     // Catch:{ all -> 0x1434 }
            if (r3 == r2) goto L_0x0b4b
            if (r3 != r13) goto L_0x0b7d
            android.widget.TextView r3 = r0.A0T     // Catch:{ all -> 0x1434 }
            if (r3 == 0) goto L_0x0b42
            r7 = 2131974269(0x7f13587d, float:1.9585597E38)
            r3.setText(r7)     // Catch:{ all -> 0x1434 }
            android.widget.TextView r4 = r0.A0T     // Catch:{ all -> 0x1434 }
            X.0qQ.A0A(r4)     // Catch:{ all -> 0x1434 }
            android.widget.TextView r3 = r0.A0T     // Catch:{ all -> 0x1434 }
            if (r3 == 0) goto L_0x0b33
            android.content.res.Resources r3 = r3.getResources()     // Catch:{ all -> 0x1434 }
            if (r3 == 0) goto L_0x0b33
            java.lang.String r11 = r3.getString(r7)     // Catch:{ all -> 0x1434 }
        L_0x0b33:
            r4.setContentDescription(r11)     // Catch:{ all -> 0x1434 }
            com.instagram.common.ui.widget.imageview.IgImageView r7 = r0.A0i     // Catch:{ all -> 0x1434 }
            if (r7 == 0) goto L_0x0b7d
            android.content.Context r4 = r7.getContext()     // Catch:{ all -> 0x1434 }
            r3 = 2131238503(0x7f081e67, float:1.8093287E38)
            goto L_0x0b76
        L_0x0b42:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x1434 }
            r0 = r26
            r1.<init>(r0)     // Catch:{ all -> 0x1434 }
            goto L_0x0415
        L_0x0b4b:
            android.widget.TextView r3 = r0.A0T     // Catch:{ all -> 0x1434 }
            if (r3 == 0) goto L_0x0b94
            r7 = 2131974270(0x7f13587e, float:1.95856E38)
            r3.setText(r7)     // Catch:{ all -> 0x1434 }
            android.widget.TextView r4 = r0.A0T     // Catch:{ all -> 0x1434 }
            X.0qQ.A0A(r4)     // Catch:{ all -> 0x1434 }
            android.widget.TextView r3 = r0.A0T     // Catch:{ all -> 0x1434 }
            if (r3 == 0) goto L_0x0b68
            android.content.res.Resources r3 = r3.getResources()     // Catch:{ all -> 0x1434 }
            if (r3 == 0) goto L_0x0b68
            java.lang.String r11 = r3.getString(r7)     // Catch:{ all -> 0x1434 }
        L_0x0b68:
            r4.setContentDescription(r11)     // Catch:{ all -> 0x1434 }
            com.instagram.common.ui.widget.imageview.IgImageView r7 = r0.A0i     // Catch:{ all -> 0x1434 }
            if (r7 == 0) goto L_0x0b7d
            android.content.Context r4 = r7.getContext()     // Catch:{ all -> 0x1434 }
            r3 = 2131238018(0x7f081c82, float:1.8092303E38)
        L_0x0b76:
            android.graphics.drawable.Drawable r3 = r4.getDrawable(r3)     // Catch:{ all -> 0x1434 }
            r7.setImageDrawable(r3)     // Catch:{ all -> 0x1434 }
        L_0x0b7d:
            android.view.View r3 = r0.A03     // Catch:{ all -> 0x1434 }
            X.0qQ.A0A(r3)     // Catch:{ all -> 0x1434 }
            r3.setVisibility(r2)     // Catch:{ all -> 0x1434 }
            android.view.View r4 = r0.A03     // Catch:{ all -> 0x1434 }
            X.0qQ.A0A(r4)     // Catch:{ all -> 0x1434 }
            X.DEN r3 = new X.DEN     // Catch:{ all -> 0x1434 }
            r3.<init>(r1, r8)     // Catch:{ all -> 0x1434 }
            X.AnonymousClass0fU.A00(r3, r4)     // Catch:{ all -> 0x1434 }
            goto L_0x02d2
        L_0x0b94:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x1434 }
            r0 = r26
            r1.<init>(r0)     // Catch:{ all -> 0x1434 }
            goto L_0x0415
        L_0x0b9d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x1434 }
            r0 = r26
            r1.<init>(r0)     // Catch:{ all -> 0x1434 }
            goto L_0x0415
        L_0x0ba6:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x1434 }
            r0 = r26
            r1.<init>(r0)     // Catch:{ all -> 0x1434 }
            goto L_0x0415
        L_0x0baf:
            boolean r3 = r1.A1B()     // Catch:{ all -> 0x1434 }
            if (r3 == 0) goto L_0x0bc2
            X.3mL r4 = r1.A0e     // Catch:{ all -> 0x1434 }
            X.3mL r3 = X.C250963mL.EMPTY_STORIES_STATE_SUGGESTED_USERS     // Catch:{ all -> 0x1434 }
            if (r4 != r3) goto L_0x0ff1
            X.DEQ r11 = new X.DEQ     // Catch:{ all -> 0x1434 }
            r11.<init>(r1, r8)     // Catch:{ all -> 0x1434 }
            goto L_0x0fb6
        L_0x0bc2:
            X.3QO r4 = r1.A0B()     // Catch:{ all -> 0x1434 }
            X.3QO r3 = X.AnonymousClass3QO.HALLPASS     // Catch:{ all -> 0x1434 }
            if (r4 != r3) goto L_0x0bce
            if (r14 <= 0) goto L_0x0bce
            goto L_0x1009
        L_0x0bce:
            boolean r3 = r1.A1N()     // Catch:{ all -> 0x1434 }
            if (r3 != 0) goto L_0x02d2
            boolean r3 = r1.A17()     // Catch:{ all -> 0x1434 }
            if (r3 != 0) goto L_0x02d2
            boolean r3 = X.AnonymousClass4EQ.A0G(r1)     // Catch:{ all -> 0x1434 }
            if (r3 == 0) goto L_0x0c03
            boolean r3 = r1.A0l()     // Catch:{ all -> 0x1434 }
            if (r3 == 0) goto L_0x0e83
            com.instagram.model.effect.AttributedAREffect r3 = r1.A05     // Catch:{ all -> 0x1434 }
            if (r3 == 0) goto L_0x0c01
            java.lang.String r4 = r3.A06     // Catch:{ all -> 0x1434 }
        L_0x0bec:
            java.lang.String r3 = "25025320"
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x1434 }
            if (r3 != 0) goto L_0x0e83
            r3 = 36324784690246002(0x810d3300013172, double:3.035278334054664E-306)
            boolean r3 = X.182.A06(r9, r5, r3)     // Catch:{ all -> 0x1434 }
            if (r3 == 0) goto L_0x0e83
            goto L_0x02d2
        L_0x0c01:
            r4 = 0
            goto L_0x0bec
        L_0x0c03:
            boolean r3 = r1.A1h()     // Catch:{ all -> 0x1434 }
            if (r3 == 0) goto L_0x0c11
            if (r10 == 0) goto L_0x0de6
            boolean r3 = r10.A5j()     // Catch:{ all -> 0x1434 }
            if (r3 != r13) goto L_0x0de6
        L_0x0c11:
            boolean r3 = X.AnonymousClass6YK.A03(r5, r1, r6)     // Catch:{ all -> 0x1434 }
            if (r3 == 0) goto L_0x0dfd
            boolean r3 = X.C317336n6.A01(r5)     // Catch:{ all -> 0x1434 }
            if (r3 != 0) goto L_0x0dfd
            com.instagram.user.model.User r3 = r1.A0i     // Catch:{ all -> 0x1434 }
            if (r3 != 0) goto L_0x0c30
            com.instagram.user.model.User r3 = r43.A0D()     // Catch:{ all -> 0x1434 }
            if (r3 != 0) goto L_0x0c30
            java.lang.String r0 = "Required value was null."
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x1434 }
            r1.<init>(r0)     // Catch:{ all -> 0x1434 }
            goto L_0x0415
        L_0x0c30:
            com.instagram.model.direct.DirectShareTarget r4 = X.AnonymousClass6UD.A00(r3, r2)     // Catch:{ all -> 0x1434 }
            android.view.View r12 = r0.A0x     // Catch:{ all -> 0x1434 }
            r8.EC7(r12, r10)     // Catch:{ all -> 0x1434 }
            r14 = 36320725946082081(0x81098200002321, double:3.032711567902149E-306)
            boolean r15 = X.182.A06(r9, r5, r14)     // Catch:{ all -> 0x1434 }
            X.1as r3 = X.1as.A04     // Catch:{ all -> 0x1434 }
            boolean r14 = r3.A0H(r5, r4)     // Catch:{ all -> 0x1434 }
            r6.A0A = r14     // Catch:{ all -> 0x1434 }
            X.1as r3 = X.1as.A04     // Catch:{ all -> 0x1434 }
            boolean r3 = r3.A0I(r5, r4)     // Catch:{ all -> 0x1434 }
            if (r3 != 0) goto L_0x0c5f
            if (r14 != 0) goto L_0x0c5f
            r6.A0B = r2     // Catch:{ all -> 0x1434 }
            r14 = 2131240022(0x7f082456, float:1.8096367E38)
            if (r15 == 0) goto L_0x0c64
            r14 = 2131240023(0x7f082457, float:1.809637E38)
            goto L_0x0c64
        L_0x0c5f:
            r6.A0B = r3     // Catch:{ all -> 0x1434 }
            r14 = 2131240024(0x7f082458, float:1.8096371E38)
        L_0x0c64:
            r3 = r18
            android.graphics.drawable.Drawable r3 = r3.getDrawable(r14)     // Catch:{ all -> 0x1434 }
            r12.setBackground(r3)     // Catch:{ all -> 0x1434 }
            if (r15 == 0) goto L_0x0c80
            android.view.ViewGroup$LayoutParams r14 = r12.getLayoutParams()     // Catch:{ all -> 0x1434 }
            android.content.res.Resources r15 = r18.getResources()     // Catch:{ all -> 0x1434 }
            r3 = 2131165250(0x7f070042, float:1.7944712E38)
            int r3 = r15.getDimensionPixelSize(r3)     // Catch:{ all -> 0x1434 }
            r14.height = r3     // Catch:{ all -> 0x1434 }
        L_0x0c80:
            r12.setVisibility(r2)     // Catch:{ all -> 0x1434 }
            android.content.Context r14 = r12.getContext()     // Catch:{ all -> 0x1434 }
            r3 = 2131971558(0x7f134de6, float:1.9580099E38)
            java.lang.String r3 = r14.getString(r3)     // Catch:{ all -> 0x1434 }
            r12.setContentDescription(r3)     // Catch:{ all -> 0x1434 }
            X.6UE r3 = new X.6UE     // Catch:{ all -> 0x1434 }
            r3.<init>(r1, r6, r8)     // Catch:{ all -> 0x1434 }
            X.AnonymousClass0fU.A00(r3, r12)     // Catch:{ all -> 0x1434 }
            r3 = 6
            X.0qQ.A0B(r4, r3)     // Catch:{ all -> 0x1434 }
            r3 = r43
            X.1Ns r3 = r3.A0W     // Catch:{ all -> 0x1434 }
            if (r3 == 0) goto L_0x0ceb
            com.instagram.user.model.User r3 = r3.CCd()     // Catch:{ all -> 0x1434 }
            if (r3 == 0) goto L_0x0ceb
            r3.getUsername()     // Catch:{ all -> 0x1434 }
            boolean r3 = r6.A0M     // Catch:{ all -> 0x1434 }
            if (r3 == 0) goto L_0x0ceb
            r3 = r43
            X.1Ns r3 = r3.A0W     // Catch:{ all -> 0x1434 }
            if (r3 == 0) goto L_0x0ce2
            com.instagram.user.model.User r3 = r3.CCd()     // Catch:{ all -> 0x1434 }
            if (r3 == 0) goto L_0x0ce2
            r3.getUsername()     // Catch:{ all -> 0x1434 }
            r3 = 2131239533(0x7f08226d, float:1.8095376E38)
            r12 = r18
            android.graphics.drawable.Drawable r14 = r12.getDrawable(r3)     // Catch:{ all -> 0x1434 }
            if (r14 == 0) goto L_0x0cd9
            android.content.res.Resources r12 = r18.getResources()     // Catch:{ all -> 0x1434 }
            r3 = 2131165207(0x7f070017, float:1.7944625E38)
            int r3 = r12.getDimensionPixelSize(r3)     // Catch:{ all -> 0x1434 }
            r14.setBounds(r2, r2, r3, r3)     // Catch:{ all -> 0x1434 }
            goto L_0x0ceb
        L_0x0cd9:
            java.lang.String r0 = "Required value was null."
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x1434 }
            r1.<init>(r0)     // Catch:{ all -> 0x1434 }
            goto L_0x0415
        L_0x0ce2:
            java.lang.String r0 = "Required value was null."
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x1434 }
            r1.<init>(r0)     // Catch:{ all -> 0x1434 }
            goto L_0x0415
        L_0x0ceb:
            r15 = 2131971560(0x7f134de8, float:1.9580103E38)
            android.content.res.Resources r3 = r18.getResources()     // Catch:{ NotFoundException -> 0x0d03 }
            java.lang.String r12 = r3.getString(r15)     // Catch:{ NotFoundException -> 0x0d03 }
            if (r12 == 0) goto L_0x0d11
            android.widget.TextView r3 = r0.A1K     // Catch:{ all -> 0x1434 }
            boolean r3 = X.AnonymousClass6YK.A01(r3, r12)     // Catch:{ all -> 0x1434 }
            r31 = 1
            if (r3 != 0) goto L_0x0d13
            goto L_0x0d11
        L_0x0d03:
            X.0wj r14 = X.0wj.A01     // Catch:{ all -> 0x1434 }
            r12 = 18946361(0x1211939, float:2.9589126E-38)
            java.lang.String r3 = "Failed to find string resource for resource id "
            java.lang.String r3 = X.002.A0O(r3, r15)     // Catch:{ all -> 0x1434 }
            r14.AEf(r3, r12)     // Catch:{ all -> 0x1434 }
        L_0x0d11:
            r31 = 0
        L_0x0d13:
            android.widget.TextView r12 = r0.A1K     // Catch:{ all -> 0x1434 }
            r12.setCompoundDrawablesRelative(r11, r11, r11, r11)     // Catch:{ all -> 0x1434 }
            android.content.res.Resources r26 = r18.getResources()     // Catch:{ all -> 0x1434 }
            X.0qQ.A07(r26)     // Catch:{ all -> 0x1434 }
            X.6YK r25 = X.AnonymousClass6YK.A00     // Catch:{ all -> 0x1434 }
            if (r10 == 0) goto L_0x0d5c
            java.lang.String r3 = r10.getId()     // Catch:{ all -> 0x1434 }
            if (r3 == 0) goto L_0x0d5c
            X.6W7 r14 = X.AnonymousClass6W6.A00(r5)     // Catch:{ all -> 0x1434 }
            java.util.Map r14 = r14.A00     // Catch:{ all -> 0x1434 }
            java.lang.Object r3 = r14.get(r3)     // Catch:{ all -> 0x1434 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x1434 }
            if (r3 == 0) goto L_0x0d5c
            r14 = 36313570530625630(0x8103000001085e, double:3.028186454354944E-306)
            boolean r14 = X.182.A06(r9, r5, r14)     // Catch:{ all -> 0x1434 }
            if (r14 == 0) goto L_0x0d5c
        L_0x0d42:
            r12.setText(r3)     // Catch:{ all -> 0x1434 }
            r3 = r43
            boolean r3 = r3.A1Q     // Catch:{ all -> 0x1434 }
            if (r3 == r13) goto L_0x0d6b
            r3 = 36315009345063874(0x81044f00070bc2, double:3.0290963663993304E-306)
            boolean r4 = X.182.A06(r9, r5, r3)     // Catch:{ all -> 0x1434 }
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r4)     // Catch:{ all -> 0x1434 }
            X.0qQ.A0A(r3)     // Catch:{ all -> 0x1434 }
            goto L_0x0d69
        L_0x0d5c:
            r27 = r5
            r28 = r4
            r29 = r1
            r30 = r44
            java.lang.String r3 = r25.A06(r26, r27, r28, r29, r30, r31)     // Catch:{ all -> 0x1434 }
            goto L_0x0d42
        L_0x0d69:
            if (r4 != 0) goto L_0x0d83
        L_0x0d6b:
            r3 = r43
            boolean r3 = r3.A1T     // Catch:{ all -> 0x1434 }
            if (r3 == r13) goto L_0x0dfd
            r3 = 36315009345260483(0x81044f000a0bc3, double:3.029096366523667E-306)
            boolean r4 = X.182.A06(r9, r5, r3)     // Catch:{ all -> 0x1434 }
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r4)     // Catch:{ all -> 0x1434 }
            X.0qQ.A0A(r3)     // Catch:{ all -> 0x1434 }
            if (r4 == 0) goto L_0x0dfd
        L_0x0d83:
            r4 = 0
            r3 = r43
            boolean r3 = r3.A1T     // Catch:{ all -> 0x1434 }
            if (r3 == r13) goto L_0x0d9a
            r3 = 36315009345260483(0x81044f000a0bc3, double:3.029096366523667E-306)
            boolean r4 = X.182.A06(r9, r5, r3)     // Catch:{ all -> 0x1434 }
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r4)     // Catch:{ all -> 0x1434 }
            X.0qQ.A0A(r3)     // Catch:{ all -> 0x1434 }
        L_0x0d9a:
            java.lang.String r14 = "story_remix_reply"
            if (r4 == 0) goto L_0x0de4
            java.lang.String r12 = "story_selfie_reply"
        L_0x0da0:
            X.Okh r4 = new X.Okh     // Catch:{ all -> 0x1434 }
            r25 = r4
            r26 = r18
            r27 = r46
            r28 = r5
            r29 = r1
            r30 = r6
            r31 = r8
            r32 = r0
            r33 = r12
            r25.<init>(r26, r27, r28, r29, r30, r31, r32, r33)     // Catch:{ all -> 0x1434 }
            r3 = r23
            r3.setOnInflateListener(r4)     // Catch:{ all -> 0x1434 }
            android.view.View r3 = r0.A06     // Catch:{ all -> 0x1434 }
            if (r3 == 0) goto L_0x0ddb
            boolean r3 = r12.equals(r14)     // Catch:{ all -> 0x1434 }
            if (r3 == 0) goto L_0x0de1
            java.lang.String r28 = "entrypoint"
        L_0x0dc8:
            java.lang.String r3 = r1.A0j     // Catch:{ all -> 0x1434 }
            java.lang.String r29 = "impression"
            java.lang.String r30 = "story_viewer"
            r25 = r46
            r26 = r5
            r27 = r11
            r31 = r3
            r32 = r11
            X.C67000MgY.A00(r25, r26, r27, r28, r29, r30, r31, r32)     // Catch:{ all -> 0x1434 }
        L_0x0ddb:
            r3 = r23
            r3.setVisibility(r2)     // Catch:{ all -> 0x1434 }
            goto L_0x0dfd
        L_0x0de1:
            java.lang.String r28 = "selfie_reply_entrypoint"
            goto L_0x0dc8
        L_0x0de4:
            r12 = r14
            goto L_0x0da0
        L_0x0de6:
            r1.A0V = r13     // Catch:{ all -> 0x1434 }
            r3 = r28
            android.view.View r3 = r3.A04     // Catch:{ all -> 0x1434 }
            r8.EC3(r3, r10)     // Catch:{ all -> 0x1434 }
            X.DEL r11 = new X.DEL     // Catch:{ all -> 0x1434 }
            r11.<init>(r1, r8)     // Catch:{ all -> 0x1434 }
            X.Pvu r4 = r0.AjF()     // Catch:{ all -> 0x1434 }
            r3 = r28
            X.AnonymousClass6YT.A00(r11, r1, r4, r3)     // Catch:{ all -> 0x1434 }
        L_0x0dfd:
            r4 = r43
            r3 = r35
            X.AnonymousClass6US.A00(r5, r4, r1, r3, r8)     // Catch:{ all -> 0x1434 }
            r3 = r34
            r3.A03(r7)     // Catch:{ all -> 0x1434 }
            X.1Ns r3 = r4.A0W     // Catch:{ all -> 0x1434 }
            if (r3 == 0) goto L_0x0e24
            com.instagram.user.model.User r3 = r3.CCd()     // Catch:{ all -> 0x1434 }
            if (r3 == 0) goto L_0x0e24
            boolean r3 = X.AnonymousClass6YU.A00(r5, r3)     // Catch:{ all -> 0x1434 }
            if (r3 == 0) goto L_0x0e24
            X.3oV r3 = r0.A1a     // Catch:{ all -> 0x1434 }
            android.view.View r3 = r3.getView()     // Catch:{ all -> 0x1434 }
            android.widget.ImageView r3 = (android.widget.ImageView) r3     // Catch:{ all -> 0x1434 }
            r3.setVisibility(r2)     // Catch:{ all -> 0x1434 }
        L_0x0e24:
            boolean r3 = X.AnonymousClass6YV.A00(r5)     // Catch:{ all -> 0x1434 }
            if (r3 == 0) goto L_0x0e91
            r3 = 36609296208762715(0x820ff60000175b, double:3.215204564000563E-306)
            long r11 = X.182.A01(r9, r5, r3)     // Catch:{ all -> 0x1434 }
            int r7 = (int) r11     // Catch:{ all -> 0x1434 }
            if (r7 != r13) goto L_0x0e5b
            X.3oV r3 = r0.A1b     // Catch:{ all -> 0x1434 }
            android.view.View r4 = r3.getView()     // Catch:{ all -> 0x1434 }
            r3 = 2131430567(0x7f0b0ca7, float:1.8482839E38)
            android.view.View r4 = r4.requireViewById(r3)     // Catch:{ all -> 0x1434 }
            X.0qQ.A07(r4)     // Catch:{ all -> 0x1434 }
            android.widget.ViewSwitcher r4 = (android.widget.ViewSwitcher) r4     // Catch:{ all -> 0x1434 }
            android.view.View r3 = r4.getChildAt(r2)     // Catch:{ all -> 0x1434 }
            if (r3 != 0) goto L_0x0e91
            X.FQf r7 = new X.FQf     // Catch:{ all -> 0x1434 }
            r3 = r18
            r7.<init>(r3)     // Catch:{ all -> 0x1434 }
        L_0x0e55:
            android.widget.ViewSwitcher$ViewFactory r7 = (android.widget.ViewSwitcher.ViewFactory) r7     // Catch:{ all -> 0x1434 }
            r4.setFactory(r7)     // Catch:{ all -> 0x1434 }
            goto L_0x0e91
        L_0x0e5b:
            long r3 = X.182.A01(r9, r5, r3)     // Catch:{ all -> 0x1434 }
            int r7 = (int) r3     // Catch:{ all -> 0x1434 }
            r3 = 2
            if (r7 != r3) goto L_0x0e91
            X.3oV r3 = r0.A1d     // Catch:{ all -> 0x1434 }
            android.view.View r4 = r3.getView()     // Catch:{ all -> 0x1434 }
            r3 = 2131439235(0x7f0b2e83, float:1.850042E38)
            android.view.View r4 = r4.requireViewById(r3)     // Catch:{ all -> 0x1434 }
            X.0qQ.A07(r4)     // Catch:{ all -> 0x1434 }
            android.widget.ViewSwitcher r4 = (android.widget.ViewSwitcher) r4     // Catch:{ all -> 0x1434 }
            android.view.View r3 = r4.getChildAt(r2)     // Catch:{ all -> 0x1434 }
            if (r3 != 0) goto L_0x0e91
            X.FQg r7 = new X.FQg     // Catch:{ all -> 0x1434 }
            r3 = r18
            r7.<init>(r3)     // Catch:{ all -> 0x1434 }
            goto L_0x0e55
        L_0x0e83:
            X.DEK r7 = new X.DEK     // Catch:{ all -> 0x1434 }
            r7.<init>(r1, r8)     // Catch:{ all -> 0x1434 }
            X.Pvu r4 = r0.AjF()     // Catch:{ all -> 0x1434 }
            r3 = r28
            X.AnonymousClass6YT.A00(r7, r1, r4, r3)     // Catch:{ all -> 0x1434 }
        L_0x0e91:
            java.util.List r3 = r6.A05     // Catch:{ all -> 0x1434 }
            if (r3 == 0) goto L_0x0edd
            java.util.List r14 = X.00k.A0a(r3)     // Catch:{ all -> 0x1434 }
        L_0x0e99:
            int r3 = r14.size()     // Catch:{ all -> 0x1434 }
            if (r3 <= r13) goto L_0x02d2
            java.lang.Object r3 = r14.get(r13)     // Catch:{ all -> 0x1434 }
            com.instagram.model.reels.Reel r3 = (com.instagram.model.reels.Reel) r3     // Catch:{ all -> 0x1434 }
            boolean r3 = r3.A1W     // Catch:{ all -> 0x1434 }
            if (r3 != 0) goto L_0x02d2
            boolean r3 = r43.A0i()     // Catch:{ all -> 0x1434 }
            if (r3 != 0) goto L_0x02d2
            boolean r3 = r43.A0b()     // Catch:{ all -> 0x1434 }
            if (r3 != 0) goto L_0x02d2
            X.HnK r13 = r0.A0o     // Catch:{ all -> 0x1434 }
            if (r13 != 0) goto L_0x0ec2
            X.HnK r13 = new X.HnK     // Catch:{ all -> 0x1434 }
            r3 = r42
            r13.<init>(r3)     // Catch:{ all -> 0x1434 }
            r0.A0o = r13     // Catch:{ all -> 0x1434 }
        L_0x0ec2:
            android.widget.LinearLayout r12 = r13.A02     // Catch:{ all -> 0x1434 }
            X.0qQ.A0A(r12)     // Catch:{ all -> 0x1434 }
            r12.setVisibility(r2)     // Catch:{ all -> 0x1434 }
            int r4 = r14.size()     // Catch:{ all -> 0x1434 }
            int r3 = r12.getChildCount()     // Catch:{ all -> 0x1434 }
            if (r4 == r3) goto L_0x0f17
            r12.removeAllViews()     // Catch:{ all -> 0x1434 }
            int r20 = r14.size()     // Catch:{ all -> 0x1434 }
            r11 = 0
            goto L_0x0ee0
        L_0x0edd:
            X.0sn r14 = X.0sn.A00     // Catch:{ all -> 0x1434 }
            goto L_0x0e99
        L_0x0ee0:
            r3 = r20
            if (r11 >= r3) goto L_0x0f17
            android.content.Context r19 = r12.getContext()     // Catch:{ all -> 0x1434 }
            X.0qQ.A07(r19)     // Catch:{ all -> 0x1434 }
            android.widget.TextView r7 = new android.widget.TextView     // Catch:{ all -> 0x1434 }
            r3 = r19
            r7.<init>(r3)     // Catch:{ all -> 0x1434 }
            r15 = 1065353216(0x3f800000, float:1.0)
            android.widget.LinearLayout$LayoutParams r4 = new android.widget.LinearLayout$LayoutParams     // Catch:{ all -> 0x1434 }
            r3 = r24
            r4.<init>(r2, r3, r15)     // Catch:{ all -> 0x1434 }
            r7.setLayoutParams(r4)     // Catch:{ all -> 0x1434 }
            r3 = 17
            r7.setGravity(r3)     // Catch:{ all -> 0x1434 }
            android.content.res.Resources r4 = r19.getResources()     // Catch:{ all -> 0x1434 }
            r3 = 2131165216(0x7f070020, float:1.7944643E38)
            float r3 = r4.getDimension(r3)     // Catch:{ all -> 0x1434 }
            r7.setTextSize(r2, r3)     // Catch:{ all -> 0x1434 }
            r12.addView(r7)     // Catch:{ all -> 0x1434 }
            int r11 = r11 + 1
            goto L_0x0ee0
        L_0x0f17:
            int r15 = r14.size()     // Catch:{ all -> 0x1434 }
            r11 = 0
        L_0x0f1c:
            if (r11 >= r15) goto L_0x02d2
            java.lang.Object r7 = r14.get(r11)     // Catch:{ all -> 0x1434 }
            com.instagram.model.reels.Reel r7 = (com.instagram.model.reels.Reel) r7     // Catch:{ all -> 0x1434 }
            boolean r4 = r7.A0d()     // Catch:{ all -> 0x1434 }
            boolean r3 = r43.A0d()     // Catch:{ all -> 0x1434 }
            r28 = 0
            if (r4 != r3) goto L_0x0f32
            r28 = 1
        L_0x0f32:
            android.view.View r4 = r12.getChildAt(r11)     // Catch:{ all -> 0x1434 }
            java.lang.String r3 = "null cannot be cast to non-null type android.widget.TextView"
            X.0qQ.A0C(r4, r3)     // Catch:{ all -> 0x1434 }
            android.widget.TextView r4 = (android.widget.TextView) r4     // Catch:{ all -> 0x1434 }
            if (r28 == 0) goto L_0x0f64
            int r3 = r13.A00     // Catch:{ all -> 0x1434 }
        L_0x0f41:
            r4.setTextColor(r3)     // Catch:{ all -> 0x1434 }
            boolean r3 = r7.A0d()     // Catch:{ all -> 0x1434 }
            if (r3 != 0) goto L_0x0f6a
            java.lang.String r3 = r13.A03     // Catch:{ all -> 0x1434 }
            r4.setText(r3)     // Catch:{ all -> 0x1434 }
            X.FOL r3 = new X.FOL     // Catch:{ all -> 0x1434 }
            r22 = r3
            r23 = r7
            r24 = r1
            r25 = r6
            r26 = r44
            r27 = r8
            r22.<init>(r23, r24, r25, r26, r27, r28)     // Catch:{ all -> 0x1434 }
            X.AnonymousClass0fU.A00(r3, r4)     // Catch:{ all -> 0x1434 }
            goto L_0x0f67
        L_0x0f64:
            int r3 = r13.A01     // Catch:{ all -> 0x1434 }
            goto L_0x0f41
        L_0x0f67:
            int r11 = r11 + 1
            goto L_0x0f1c
        L_0x0f6a:
            java.lang.String r0 = "Own reels should only be of type STORY"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x1434 }
            r1.<init>(r0)     // Catch:{ all -> 0x1434 }
            goto L_0x0415
        L_0x0f73:
            r4 = 2131969402(0x7f13457a, float:1.9575726E38)
            goto L_0x0f7a
        L_0x0f77:
            r4 = 2131969400(0x7f134578, float:1.9575722E38)
        L_0x0f7a:
            java.lang.String r11 = r3.getString(r4)     // Catch:{ all -> 0x1434 }
            goto L_0x0f96
        L_0x0f7f:
            r11 = 2131820956(0x7f11019c, float:1.9274642E38)
            goto L_0x0f8a
        L_0x0f83:
            r11 = 2131820958(0x7f11019e, float:1.9274646E38)
            goto L_0x0f8a
        L_0x0f87:
            r11 = 2131820954(0x7f11019a, float:1.9274638E38)
        L_0x0f8a:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x1434 }
            java.lang.Object[] r4 = new java.lang.Object[]{r4}     // Catch:{ all -> 0x1434 }
            java.lang.String r11 = r3.getQuantityString(r11, r7, r4)     // Catch:{ all -> 0x1434 }
        L_0x0f96:
            X.0qQ.A07(r11)     // Catch:{ all -> 0x1434 }
            int r7 = X.2Yu.A03(r18)     // Catch:{ all -> 0x1434 }
            r4 = 2131973015(0x7f135397, float:1.9583054E38)
            java.lang.String r4 = r3.getString(r4)     // Catch:{ all -> 0x1434 }
            X.0qQ.A07(r4)     // Catch:{ all -> 0x1434 }
            X.DEM r3 = new X.DEM     // Catch:{ all -> 0x1434 }
            r3.<init>(r1, r8)     // Catch:{ all -> 0x1434 }
            A00(r3, r0, r11, r4, r7)     // Catch:{ all -> 0x1434 }
            goto L_0x02d2
        L_0x0fb1:
            X.0nA.A0O(r3)     // Catch:{ all -> 0x1434 }
            goto L_0x02d2
        L_0x0fb6:
            if (r12 == 0) goto L_0x02d2
            r12.A01()     // Catch:{ all -> 0x1434 }
            android.widget.ImageView r4 = r12.A05     // Catch:{ all -> 0x1434 }
            if (r4 == 0) goto L_0x0fc4
            X.61R r3 = r12.A09     // Catch:{ all -> 0x1434 }
            r4.setImageDrawable(r3)     // Catch:{ all -> 0x1434 }
        L_0x0fc4:
            android.widget.TextView r7 = r12.A07     // Catch:{ all -> 0x1434 }
            if (r7 == 0) goto L_0x0fde
            r3 = r28
            android.view.View r3 = r3.A04     // Catch:{ all -> 0x1434 }
            android.content.Context r4 = r3.getContext()     // Catch:{ all -> 0x1434 }
            X.0qQ.A07(r4)     // Catch:{ all -> 0x1434 }
            r3 = r28
            com.instagram.common.session.UserSession r3 = r3.A09     // Catch:{ all -> 0x1434 }
            java.lang.CharSequence r3 = X.AnonymousClass4EQ.A05(r4, r3, r1)     // Catch:{ all -> 0x1434 }
            r7.setText(r3)     // Catch:{ all -> 0x1434 }
        L_0x0fde:
            android.view.View r3 = r12.A04     // Catch:{ all -> 0x1434 }
            if (r3 == 0) goto L_0x0fe5
            X.AnonymousClass0fU.A00(r11, r3)     // Catch:{ all -> 0x1434 }
        L_0x0fe5:
            android.view.ViewStub r3 = r12.A0C     // Catch:{ all -> 0x1434 }
            r3.setVisibility(r2)     // Catch:{ all -> 0x1434 }
            android.view.ViewStub r3 = r12.A0B     // Catch:{ all -> 0x1434 }
            r3.setVisibility(r2)     // Catch:{ all -> 0x1434 }
            goto L_0x02d2
        L_0x0ff1:
            X.3mL r3 = X.C250963mL.EMPTY_STORIES_STATE_CONTACT_IMPORT     // Catch:{ all -> 0x1434 }
            if (r4 != r3) goto L_0x02d2
            X.Oj8 r7 = new X.Oj8     // Catch:{ all -> 0x1434 }
            r4 = r55
            r3 = r30
            r7.<init>(r6, r3, r8, r4)     // Catch:{ all -> 0x1434 }
            X.Pvu r4 = r0.AjF()     // Catch:{ all -> 0x1434 }
            r3 = r28
            X.AnonymousClass6YT.A00(r7, r1, r4, r3)     // Catch:{ all -> 0x1434 }
            goto L_0x02d2
        L_0x1009:
            android.view.View r3 = r0.A0x     // Catch:{ all -> 0x1434 }
            r3.setVisibility(r7)     // Catch:{ all -> 0x1434 }
            android.view.View r3 = r0.A0D     // Catch:{ all -> 0x1434 }
            if (r3 != 0) goto L_0x1025
            r4 = 2131443866(0x7f0b409a, float:1.8509812E38)
            r3 = r42
            android.view.View r3 = r3.requireViewById(r4)     // Catch:{ all -> 0x1434 }
            android.view.ViewStub r3 = (android.view.ViewStub) r3     // Catch:{ all -> 0x1434 }
            android.view.View r3 = r3.inflate()     // Catch:{ all -> 0x1434 }
            r0.A0D = r3     // Catch:{ all -> 0x1434 }
            if (r3 == 0) goto L_0x1028
        L_0x1025:
            r3.setVisibility(r2)     // Catch:{ all -> 0x1434 }
        L_0x1028:
            android.view.View r4 = r0.A0D     // Catch:{ all -> 0x1434 }
            if (r4 == 0) goto L_0x1034
            X.Oir r3 = new X.Oir     // Catch:{ all -> 0x1434 }
            r3.<init>(r1, r6, r8)     // Catch:{ all -> 0x1434 }
            X.AnonymousClass0fU.A00(r3, r4)     // Catch:{ all -> 0x1434 }
        L_0x1034:
            r4 = r43
            r3 = r35
            X.AnonymousClass6US.A00(r5, r4, r1, r3, r8)     // Catch:{ all -> 0x1434 }
            goto L_0x02d2
        L_0x103d:
            if (r10 == 0) goto L_0x1056
            com.instagram.user.model.User r3 = r1.A0i     // Catch:{ all -> 0x1434 }
            if (r3 == 0) goto L_0x1056
            boolean r3 = r1.A16()     // Catch:{ all -> 0x1434 }
            if (r3 == 0) goto L_0x1062
            X.4gK r3 = r1.A0d     // Catch:{ all -> 0x1434 }
            r3.getClass()     // Catch:{ all -> 0x1434 }
            X.3Q2 r3 = r3.A00     // Catch:{ all -> 0x1434 }
            boolean r3 = r3.A0n()     // Catch:{ all -> 0x1434 }
            if (r3 == 0) goto L_0x1062
        L_0x1056:
            android.view.View r3 = r0.A0M     // Catch:{ all -> 0x1434 }
            X.0nA.A0O(r3)     // Catch:{ all -> 0x1434 }
        L_0x105b:
            boolean r3 = r1.A1e()     // Catch:{ all -> 0x1434 }
            if (r3 != 0) goto L_0x10d2
            goto L_0x10b9
        L_0x1062:
            boolean r3 = r1.A1N()     // Catch:{ all -> 0x1434 }
            if (r3 != 0) goto L_0x1056
            boolean r3 = r43.A0i()     // Catch:{ all -> 0x1434 }
            if (r3 == 0) goto L_0x1056
            boolean r3 = r43.A0l()     // Catch:{ all -> 0x1434 }
            if (r3 != 0) goto L_0x1056
            r3 = r41
            boolean r3 = X.AnonymousClass6YK.A02(r3, r1, r6)     // Catch:{ all -> 0x1434 }
            if (r3 == 0) goto L_0x1056
            X.3WT r3 = X.AnonymousClass3WT.SECRET_STICKER     // Catch:{ all -> 0x1434 }
            boolean r3 = r1.A1t(r3)     // Catch:{ all -> 0x1434 }
            if (r3 != 0) goto L_0x1056
            r3 = r41
            boolean r3 = r1.A1s(r3)     // Catch:{ all -> 0x1434 }
            if (r3 != 0) goto L_0x1056
            android.view.View r3 = r0.A0M     // Catch:{ all -> 0x1434 }
            if (r3 != 0) goto L_0x10a3
            android.view.ViewStub r4 = r0.A1G     // Catch:{ all -> 0x1434 }
            android.view.View r3 = r4.inflate()     // Catch:{ all -> 0x1434 }
            r0.A0M = r3     // Catch:{ all -> 0x1434 }
            r3 = 2131443030(0x7f0b3d56, float:1.8508117E38)
            android.view.View r3 = r4.findViewById(r3)     // Catch:{ all -> 0x1434 }
            android.widget.TextView r3 = (android.widget.TextView) r3     // Catch:{ all -> 0x1434 }
            r0.A0d = r3     // Catch:{ all -> 0x1434 }
        L_0x10a3:
            android.view.View r4 = r0.A0M     // Catch:{ all -> 0x1434 }
            X.0qQ.A0A(r4)     // Catch:{ all -> 0x1434 }
            X.DES r3 = new X.DES     // Catch:{ all -> 0x1434 }
            r3.<init>(r1, r8)     // Catch:{ all -> 0x1434 }
            X.AnonymousClass0fU.A00(r3, r4)     // Catch:{ all -> 0x1434 }
            android.view.View r3 = r0.A0M     // Catch:{ all -> 0x1434 }
            X.0qQ.A0A(r3)     // Catch:{ all -> 0x1434 }
            r3.setVisibility(r2)     // Catch:{ all -> 0x1434 }
            goto L_0x105b
        L_0x10b9:
            if (r10 == 0) goto L_0x10d2
            com.instagram.user.model.User r3 = r1.A0i     // Catch:{ all -> 0x1434 }
            if (r3 == 0) goto L_0x10d2
            boolean r3 = r1.A16()     // Catch:{ all -> 0x1434 }
            if (r3 == 0) goto L_0x1127
            X.4gK r3 = r1.A0d     // Catch:{ all -> 0x1434 }
            r3.getClass()     // Catch:{ all -> 0x1434 }
            X.3Q2 r3 = r3.A00     // Catch:{ all -> 0x1434 }
            boolean r3 = r3.A0n()     // Catch:{ all -> 0x1434 }
            if (r3 == 0) goto L_0x1127
        L_0x10d2:
            android.view.View r3 = r0.A0L     // Catch:{ all -> 0x1434 }
            X.0nA.A0O(r3)     // Catch:{ all -> 0x1434 }
        L_0x10d7:
            r3 = r41
            boolean r3 = X.AnonymousClass6YK.A04(r3, r1, r6)     // Catch:{ all -> 0x1434 }
            if (r3 != 0) goto L_0x1108
            android.view.View r3 = r0.A07     // Catch:{ all -> 0x1434 }
            X.0nA.A0O(r3)     // Catch:{ all -> 0x1434 }
        L_0x10e4:
            boolean r3 = r43.A0k()     // Catch:{ all -> 0x1434 }
            if (r3 != 0) goto L_0x11a9
            boolean r3 = r1.A1k()     // Catch:{ all -> 0x1434 }
            if (r3 == 0) goto L_0x10f6
            boolean r3 = r1.A1l()     // Catch:{ all -> 0x1434 }
            if (r3 != 0) goto L_0x11a9
        L_0x10f6:
            r3 = r41
            boolean r11 = X.AnonymousClass6YK.A02(r3, r1, r6)     // Catch:{ all -> 0x1434 }
            r7 = r3
            r4 = r18
            r3 = r45
            boolean r3 = X.AnonymousClass6YK.A00(r4, r7, r1, r3, r11)     // Catch:{ all -> 0x1434 }
            if (r3 == 0) goto L_0x11a9
            goto L_0x1182
        L_0x1108:
            android.view.View r4 = r0.A07     // Catch:{ all -> 0x1434 }
            if (r4 != 0) goto L_0x1116
            android.view.ViewStub r3 = r0.A18     // Catch:{ all -> 0x1434 }
            android.view.View r4 = r3.inflate()     // Catch:{ all -> 0x1434 }
            r0.A07 = r4     // Catch:{ all -> 0x1434 }
            if (r4 == 0) goto L_0x10e4
        L_0x1116:
            X.Ois r3 = new X.Ois     // Catch:{ all -> 0x1434 }
            r3.<init>(r1, r8, r0)     // Catch:{ all -> 0x1434 }
            X.AnonymousClass0fU.A00(r3, r4)     // Catch:{ all -> 0x1434 }
            android.view.View r3 = r0.A07     // Catch:{ all -> 0x1434 }
            X.0qQ.A0A(r3)     // Catch:{ all -> 0x1434 }
            r3.setVisibility(r2)     // Catch:{ all -> 0x1434 }
            goto L_0x10e4
        L_0x1127:
            boolean r3 = r1.A1N()     // Catch:{ all -> 0x1434 }
            if (r3 != 0) goto L_0x10d2
            boolean r3 = r43.A0i()     // Catch:{ all -> 0x1434 }
            if (r3 == 0) goto L_0x10d2
            r3 = r41
            boolean r3 = X.AnonymousClass6YK.A02(r3, r1, r6)     // Catch:{ all -> 0x1434 }
            if (r3 == 0) goto L_0x10d2
            boolean r3 = r43.A0l()     // Catch:{ all -> 0x1434 }
            if (r3 != 0) goto L_0x10d2
            X.3WT r3 = X.AnonymousClass3WT.SECRET_STICKER     // Catch:{ all -> 0x1434 }
            boolean r3 = r1.A1t(r3)     // Catch:{ all -> 0x1434 }
            if (r3 != 0) goto L_0x10d2
            r3 = 36319884132556485(0x8108be00011ec5, double:3.032179201638851E-306)
            r7 = r41
            boolean r3 = X.182.A06(r9, r7, r3)     // Catch:{ all -> 0x1434 }
            if (r3 == 0) goto L_0x10d2
            android.view.View r3 = r0.A0L     // Catch:{ all -> 0x1434 }
            if (r3 != 0) goto L_0x116d
            android.view.ViewStub r4 = r0.A1F     // Catch:{ all -> 0x1434 }
            android.view.View r3 = r4.inflate()     // Catch:{ all -> 0x1434 }
            r0.A0L = r3     // Catch:{ all -> 0x1434 }
            r3 = 2131443027(0x7f0b3d53, float:1.850811E38)
            android.view.View r3 = r4.findViewById(r3)     // Catch:{ all -> 0x1434 }
            android.widget.TextView r3 = (android.widget.TextView) r3     // Catch:{ all -> 0x1434 }
            r0.A0c = r3     // Catch:{ all -> 0x1434 }
        L_0x116d:
            android.view.View r4 = r0.A0L     // Catch:{ all -> 0x1434 }
            if (r4 == 0) goto L_0x1179
            X.DER r3 = new X.DER     // Catch:{ all -> 0x1434 }
            r3.<init>(r1, r8)     // Catch:{ all -> 0x1434 }
            X.AnonymousClass0fU.A00(r3, r4)     // Catch:{ all -> 0x1434 }
        L_0x1179:
            android.view.View r3 = r0.A0L     // Catch:{ all -> 0x1434 }
            if (r3 == 0) goto L_0x10d7
            r3.setVisibility(r2)     // Catch:{ all -> 0x1434 }
            goto L_0x10d7
        L_0x1182:
            if (r11 != 0) goto L_0x1190
            boolean r3 = r1.A12()     // Catch:{ all -> 0x1434 }
            if (r3 != 0) goto L_0x1190
            boolean r3 = r1.A17()     // Catch:{ all -> 0x1434 }
            if (r3 == 0) goto L_0x11a9
        L_0x1190:
            boolean r3 = r1.A12()     // Catch:{ all -> 0x1434 }
            if (r3 != 0) goto L_0x1276
            boolean r3 = X.AnonymousClass6YK.A02(r7, r1, r6)     // Catch:{ all -> 0x1434 }
            if (r3 == 0) goto L_0x1276
        L_0x119c:
            r3 = r21
            r3.setVisibility(r2)     // Catch:{ all -> 0x1434 }
            X.B77 r4 = new X.B77     // Catch:{ all -> 0x1434 }
            r4.<init>(r1, r6, r8)     // Catch:{ all -> 0x1434 }
            X.AnonymousClass0fU.A00(r4, r3)     // Catch:{ all -> 0x1434 }
        L_0x11a9:
            r4 = r45
            r3 = r44
            boolean r3 = X.AnonymousClass6YK.A05(r5, r1, r6, r4, r3)     // Catch:{ all -> 0x1434 }
            if (r3 == 0) goto L_0x11e2
            X.6UU r4 = new X.6UU     // Catch:{ all -> 0x1434 }
            r4.<init>(r10, r1, r6, r8)     // Catch:{ all -> 0x1434 }
            boolean r3 = X.AnonymousClass6YK.A02(r5, r1, r6)     // Catch:{ all -> 0x1434 }
            if (r3 != 0) goto L_0x11e8
            android.view.View r3 = r39.getView()     // Catch:{ all -> 0x1434 }
            r3.setVisibility(r2)     // Catch:{ all -> 0x1434 }
            android.view.View r3 = r39.getView()     // Catch:{ all -> 0x1434 }
            X.AnonymousClass0fU.A00(r4, r3)     // Catch:{ all -> 0x1434 }
            android.view.View r7 = r39.getView()     // Catch:{ all -> 0x1434 }
            android.view.View r3 = r39.getView()     // Catch:{ all -> 0x1434 }
            android.content.Context r4 = r3.getContext()     // Catch:{ all -> 0x1434 }
            r3 = 2131971643(0x7f134e3b, float:1.9580271E38)
            java.lang.String r3 = r4.getString(r3)     // Catch:{ all -> 0x1434 }
            r7.setContentDescription(r3)     // Catch:{ all -> 0x1434 }
        L_0x11e2:
            boolean r4 = X.AnonymousClass6YK.A02(r5, r1, r6)     // Catch:{ all -> 0x1434 }
            goto L_0x127c
        L_0x11e8:
            boolean r3 = r1.A1s(r5)     // Catch:{ all -> 0x1434 }
            if (r3 != 0) goto L_0x11e2
            android.view.View r3 = r0.A0I     // Catch:{ all -> 0x1434 }
            if (r3 != 0) goto L_0x11fa
            android.view.ViewStub r3 = r0.A1D     // Catch:{ all -> 0x1434 }
            android.view.View r3 = r3.inflate()     // Catch:{ all -> 0x1434 }
            r0.A0I = r3     // Catch:{ all -> 0x1434 }
        L_0x11fa:
            X.0qQ.A0A(r3)     // Catch:{ all -> 0x1434 }
            r3.setVisibility(r2)     // Catch:{ all -> 0x1434 }
            android.view.View r3 = r0.A0I     // Catch:{ all -> 0x1434 }
            X.0qQ.A0A(r3)     // Catch:{ all -> 0x1434 }
            X.AnonymousClass0fU.A00(r4, r3)     // Catch:{ all -> 0x1434 }
            android.view.View r7 = r0.A0I     // Catch:{ all -> 0x1434 }
            X.0qQ.A0A(r7)     // Catch:{ all -> 0x1434 }
            android.view.View r3 = r0.A0I     // Catch:{ all -> 0x1434 }
            X.0qQ.A0A(r3)     // Catch:{ all -> 0x1434 }
            android.content.Context r4 = r3.getContext()     // Catch:{ all -> 0x1434 }
            r3 = 2131971643(0x7f134e3b, float:1.9580271E38)
            java.lang.String r3 = r4.getString(r3)     // Catch:{ all -> 0x1434 }
            r7.setContentDescription(r3)     // Catch:{ all -> 0x1434 }
            android.view.View r4 = r0.A0I     // Catch:{ all -> 0x1434 }
            if (r4 == 0) goto L_0x1230
            r3 = 2131441090(0x7f0b35c2, float:1.8504182E38)
            android.view.View r4 = r4.findViewById(r3)     // Catch:{ all -> 0x1434 }
            android.widget.TextView r4 = (android.widget.TextView) r4     // Catch:{ all -> 0x1434 }
        L_0x122d:
            r0.A0Z = r4     // Catch:{ all -> 0x1434 }
            goto L_0x1232
        L_0x1230:
            r4 = 0
            goto L_0x122d
        L_0x1232:
            if (r4 == 0) goto L_0x1240
            boolean r3 = r43.A0k()     // Catch:{ all -> 0x1434 }
            if (r3 == 0) goto L_0x1240
            r3 = 2131973082(0x7f1353da, float:1.958319E38)
            r4.setText(r3)     // Catch:{ all -> 0x1434 }
        L_0x1240:
            android.widget.TextView r3 = r0.A0Z     // Catch:{ all -> 0x1434 }
            if (r3 == 0) goto L_0x11e2
            X.0t1 r3 = X.0eE.A00(r5)     // Catch:{ all -> 0x1434 }
            com.instagram.user.model.User r3 = r3.A00()     // Catch:{ all -> 0x1434 }
            boolean r3 = X.2Ek.A00(r3)     // Catch:{ all -> 0x1434 }
            r3 = r3 ^ 1
            if (r3 == 0) goto L_0x11e2
            java.lang.Boolean r3 = X.C59806JZa.A00(r5)     // Catch:{ all -> 0x1434 }
            boolean r3 = r3.booleanValue()     // Catch:{ all -> 0x1434 }
            if (r3 == 0) goto L_0x11e2
            r3 = 36316718741852781(0x8105dd0004126d, double:3.0301773958118236E-306)
            boolean r3 = X.182.A06(r9, r5, r3)     // Catch:{ all -> 0x1434 }
            if (r3 == 0) goto L_0x11e2
            android.widget.TextView r4 = r0.A0Z     // Catch:{ all -> 0x1434 }
            X.0qQ.A0A(r4)     // Catch:{ all -> 0x1434 }
            r3 = 2131973102(0x7f1353ee, float:1.958323E38)
            r4.setText(r3)     // Catch:{ all -> 0x1434 }
            goto L_0x11e2
        L_0x1276:
            android.view.View r21 = r40.getView()     // Catch:{ all -> 0x1434 }
            goto L_0x119c
        L_0x127c:
            if (r10 == 0) goto L_0x1293
            boolean r3 = r1.CWu()     // Catch:{ all -> 0x1434 }
            if (r3 == 0) goto L_0x1293
            boolean r3 = r1.A1H()     // Catch:{ all -> 0x1434 }
            if (r3 != 0) goto L_0x1293
            if (r4 == 0) goto L_0x1293
            boolean r4 = r10.A53()     // Catch:{ all -> 0x1434 }
            r3 = 1
            if (r4 == 0) goto L_0x1294
        L_0x1293:
            r3 = 0
        L_0x1294:
            A04(r5, r0, r3)     // Catch:{ all -> 0x1434 }
            boolean r3 = r1.A1N()     // Catch:{ all -> 0x1434 }
            if (r3 != 0) goto L_0x141d
            r3 = r45
            boolean r3 = r3.A0I     // Catch:{ all -> 0x1434 }
            if (r3 == 0) goto L_0x141d
            java.lang.String r23 = r46.getModuleName()     // Catch:{ all -> 0x1434 }
            boolean r3 = r1.A1E()     // Catch:{ all -> 0x1434 }
            r3 = r3 ^ 1
            if (r3 == 0) goto L_0x141d
            boolean r3 = X.JZT.A03(r5, r1, r6)     // Catch:{ all -> 0x1434 }
            if (r3 != 0) goto L_0x141d
            X.MmD r7 = r0.A0l     // Catch:{ all -> 0x1434 }
            if (r7 != 0) goto L_0x12d9
            X.MmE r4 = new X.MmE     // Catch:{ all -> 0x1434 }
            r4.<init>(r0)     // Catch:{ all -> 0x1434 }
            X.MmD r7 = new X.MmD     // Catch:{ all -> 0x1434 }
            r3 = r44
            java.lang.String r3 = r3.A00     // Catch:{ all -> 0x1434 }
            float r25 = X.AnonymousClass4EQ.A00(r18)     // Catch:{ all -> 0x1434 }
            r18 = r7
            r19 = r42
            r20 = r5
            r21 = r8
            r22 = r4
            r24 = r3
            r18.<init>(r19, r20, r21, r22, r23, r24, r25)     // Catch:{ all -> 0x1434 }
            r0.A0l = r7     // Catch:{ all -> 0x1434 }
        L_0x12d9:
            r7.A00 = r1     // Catch:{ all -> 0x1434 }
            X.3mM r3 = r7.A01     // Catch:{ all -> 0x1434 }
            boolean r3 = r6.equals(r3)     // Catch:{ all -> 0x1434 }
            if (r3 == 0) goto L_0x134e
            X.0eM r9 = r7.A0E     // Catch:{ all -> 0x1434 }
            java.lang.Object r3 = r9.getValue()     // Catch:{ all -> 0x1434 }
            X.MmI r3 = (X.C67342MmI) r3     // Catch:{ all -> 0x1434 }
            int r4 = r3.getCount()     // Catch:{ all -> 0x1434 }
            com.instagram.common.session.UserSession r3 = r7.A08     // Catch:{ all -> 0x1434 }
            int r3 = r6.A02(r3)     // Catch:{ all -> 0x1434 }
            if (r4 != r3) goto L_0x134e
            boolean r3 = r7.A03     // Catch:{ all -> 0x1434 }
            if (r3 == 0) goto L_0x132f
            X.2cs r4 = r7.A07     // Catch:{ all -> 0x1434 }
            boolean r3 = r4.A0C()     // Catch:{ all -> 0x1434 }
            if (r3 == 0) goto L_0x132f
            double r3 = r4.A01     // Catch:{ all -> 0x1434 }
            r10 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r5 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r5 != 0) goto L_0x132f
            X.MmG r3 = r7.A0B     // Catch:{ all -> 0x1434 }
            X.0eM r5 = r3.A03     // Catch:{ all -> 0x1434 }
            java.lang.Object r3 = r5.getValue()     // Catch:{ all -> 0x1434 }
            com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager r3 = (com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager) r3     // Catch:{ all -> 0x1434 }
            X.3TF r4 = r3.A0O     // Catch:{ all -> 0x1434 }
            X.3TF r3 = X.AnonymousClass3TF.IDLE     // Catch:{ all -> 0x1434 }
            if (r4 != r3) goto L_0x132f
            java.lang.Object r5 = r5.getValue()     // Catch:{ all -> 0x1434 }
            com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager r5 = (com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager) r5     // Catch:{ all -> 0x1434 }
            java.lang.Object r3 = r9.getValue()     // Catch:{ all -> 0x1434 }
            X.MmI r3 = (X.C67342MmI) r3     // Catch:{ all -> 0x1434 }
            int r4 = r3.A00(r1)     // Catch:{ all -> 0x1434 }
            r3 = 0
            r5.A0L(r4, r3)     // Catch:{ all -> 0x1434 }
        L_0x132f:
            r3 = r41
            boolean r1 = X.AnonymousClass6YK.A02(r3, r1, r6)     // Catch:{ all -> 0x1434 }
            if (r1 == 0) goto L_0x13f5
            android.view.View r3 = r0.A0G     // Catch:{ all -> 0x1434 }
            if (r3 != 0) goto L_0x13d9
            r3 = 2131441085(0x7f0b35bd, float:1.8504172E38)
            r1 = r42
            android.view.View r1 = r1.requireViewById(r3)     // Catch:{ all -> 0x1434 }
            android.view.ViewStub r1 = (android.view.ViewStub) r1     // Catch:{ all -> 0x1434 }
            android.view.View r3 = r1.inflate()     // Catch:{ all -> 0x1434 }
            r0.A0G = r3     // Catch:{ all -> 0x1434 }
            goto L_0x13d7
        L_0x134e:
            r7.A01 = r6     // Catch:{ all -> 0x1434 }
            X.0eM r5 = r7.A0E     // Catch:{ all -> 0x1434 }
            java.lang.Object r11 = r5.getValue()     // Catch:{ all -> 0x1434 }
            X.MmI r11 = (X.C67342MmI) r11     // Catch:{ all -> 0x1434 }
            com.instagram.common.session.UserSession r3 = r7.A08     // Catch:{ all -> 0x1434 }
            java.util.List r3 = X.C250973mM.A00(r3, r6)     // Catch:{ all -> 0x1434 }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x1434 }
            r4.<init>()     // Catch:{ all -> 0x1434 }
            java.util.Iterator r12 = r3.iterator()     // Catch:{ all -> 0x1434 }
        L_0x1367:
            boolean r3 = r12.hasNext()     // Catch:{ all -> 0x1434 }
            if (r3 == 0) goto L_0x1384
            java.lang.Object r10 = r12.next()     // Catch:{ all -> 0x1434 }
            r9 = r10
            X.3uh r9 = (X.C255773uh) r9     // Catch:{ all -> 0x1434 }
            boolean r3 = r9.A1Y()     // Catch:{ all -> 0x1434 }
            if (r3 != 0) goto L_0x1367
            com.instagram.common.typedurl.ImageUrl r3 = r9.A06()     // Catch:{ all -> 0x1434 }
            if (r3 == 0) goto L_0x1367
            r4.add(r10)     // Catch:{ all -> 0x1434 }
            goto L_0x1367
        L_0x1384:
            r3 = 10
            int r3 = X.0Yv.A1E(r4, r3)     // Catch:{ all -> 0x1434 }
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ all -> 0x1434 }
            r10.<init>(r3)     // Catch:{ all -> 0x1434 }
            java.util.Iterator r9 = r4.iterator()     // Catch:{ all -> 0x1434 }
        L_0x1393:
            boolean r3 = r9.hasNext()     // Catch:{ all -> 0x1434 }
            if (r3 == 0) goto L_0x13a8
            java.lang.Object r4 = r9.next()     // Catch:{ all -> 0x1434 }
            X.3uh r4 = (X.C255773uh) r4     // Catch:{ all -> 0x1434 }
            X.GEi r3 = new X.GEi     // Catch:{ all -> 0x1434 }
            r3.<init>(r4)     // Catch:{ all -> 0x1434 }
            r10.add(r3)     // Catch:{ all -> 0x1434 }
            goto L_0x1393
        L_0x13a8:
            r11.A01 = r10     // Catch:{ all -> 0x1434 }
            r3 = 1395241202(0x5329b0f2, float:7.2881812E11)
            X.0fE.A00(r11, r3)     // Catch:{ all -> 0x1434 }
            boolean r3 = r7.A03     // Catch:{ all -> 0x1434 }
            if (r3 == 0) goto L_0x132f
            X.C67337MmD.A00(r7)     // Catch:{ all -> 0x1434 }
            X.MmG r3 = r7.A0B     // Catch:{ all -> 0x1434 }
            X.0eM r3 = r3.A03     // Catch:{ all -> 0x1434 }
            java.lang.Object r4 = r3.getValue()     // Catch:{ all -> 0x1434 }
            com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager r4 = (com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager) r4     // Catch:{ all -> 0x1434 }
            java.lang.Object r3 = r5.getValue()     // Catch:{ all -> 0x1434 }
            X.MmI r3 = (X.C67342MmI) r3     // Catch:{ all -> 0x1434 }
            int r3 = r3.A00(r1)     // Catch:{ all -> 0x1434 }
            r4.A0K(r3)     // Catch:{ all -> 0x1434 }
            r3 = 0
            X.2cs r5 = r7.A07     // Catch:{ all -> 0x1434 }
            r5.A05(r3)     // Catch:{ all -> 0x1434 }
            goto L_0x132f
        L_0x13d7:
            if (r3 == 0) goto L_0x13e2
        L_0x13d9:
            r1 = 2131442991(0x7f0b3d2f, float:1.8508037E38)
            android.view.View r1 = r3.requireViewById(r1)     // Catch:{ all -> 0x1434 }
            r0.A0H = r1     // Catch:{ all -> 0x1434 }
        L_0x13e2:
            android.view.View r1 = r0.A0G     // Catch:{ all -> 0x1434 }
            X.0qQ.A0A(r1)     // Catch:{ all -> 0x1434 }
            r1.setVisibility(r2)     // Catch:{ all -> 0x1434 }
            android.view.View r1 = r0.A0H     // Catch:{ all -> 0x1434 }
            X.0qQ.A0A(r1)     // Catch:{ all -> 0x1434 }
            r1.setVisibility(r2)     // Catch:{ all -> 0x1434 }
            android.view.View r1 = r0.A0G     // Catch:{ all -> 0x1434 }
            goto L_0x1412
        L_0x13f5:
            android.view.View r1 = r0.A0P     // Catch:{ all -> 0x1434 }
            if (r1 != 0) goto L_0x140a
            r3 = 2131443864(0x7f0b4098, float:1.8509808E38)
            r1 = r42
            android.view.View r1 = r1.requireViewById(r3)     // Catch:{ all -> 0x1434 }
            android.view.ViewStub r1 = (android.view.ViewStub) r1     // Catch:{ all -> 0x1434 }
            android.view.View r1 = r1.inflate()     // Catch:{ all -> 0x1434 }
            r0.A0P = r1     // Catch:{ all -> 0x1434 }
        L_0x140a:
            X.0qQ.A0A(r1)     // Catch:{ all -> 0x1434 }
            r1.setVisibility(r2)     // Catch:{ all -> 0x1434 }
            android.view.View r1 = r0.A0P     // Catch:{ all -> 0x1434 }
        L_0x1412:
            X.0qQ.A0A(r1)     // Catch:{ all -> 0x1434 }
            X.B76 r0 = new X.B76     // Catch:{ all -> 0x1434 }
            r0.<init>(r8)     // Catch:{ all -> 0x1434 }
            X.AnonymousClass0fU.A00(r0, r1)     // Catch:{ all -> 0x1434 }
        L_0x141d:
            boolean r0 = com.facebook.systrace.Systrace.A0E(r16)
            if (r0 == 0) goto L_0x1433
            r0 = 1646272067(0x62201e43, float:7.384149E20)
            goto L_0x1430
        L_0x1427:
            boolean r0 = com.facebook.systrace.Systrace.A0E(r16)
            if (r0 == 0) goto L_0x1433
            r0 = -1525475396(0xffffffffa51317bc, float:-1.2758259E-16)
        L_0x1430:
            X.0fS.A00(r0)
        L_0x1433:
            return
        L_0x1434:
            r1 = move-exception
            boolean r0 = com.facebook.systrace.Systrace.A0E(r16)
            if (r0 == 0) goto L_0x1441
            r0 = -88412597(0xfffffffffabaee4b, float:-4.853002E35)
            X.0fS.A00(r0)
        L_0x1441:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C309196Xh.A01(X.0iw, com.instagram.common.session.UserSession, X.3uh, X.3mM, com.instagram.model.reels.ReelViewerConfig, X.3BQ, X.6Yf, X.6mk, X.6lA, int, boolean, boolean):void");
    }
}
