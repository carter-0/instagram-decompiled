package X;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.4Wr  reason: invalid class name and case insensitive filesystem */
public abstract class C265884Wr {
    public static final C71392co A00 = C71392co.A03(5.0d, 10.0d);

    public static void A00(UserSession userSession, C255773uh r15, C250973mM r16, C265864Wp r17, C265844Wn r18, C265834Wm r19, C309426Yf r20) {
        C255773uh r2 = r15;
        1Xj r1 = r15.A0b;
        if (r1 != null) {
            String id = r1.getId();
            String A002 = C2606846q.A00(r1.A2L());
            boolean CcK = r1.CcK();
            List Bkd = r15.Bkd(AnonymousClass3WT.POLLING);
            float A003 = r15.A00();
            1Ns r0 = r16.A0H.A0W;
            r0.getClass();
            String id2 = r0.getId();
            id2.getClass();
            A01(userSession, r2, r17, r18, r19, r20, id, A002, id2, Bkd, A003, CcK, false);
        }
    }

    /* JADX WARNING: type inference failed for: r0v24, types: [X.Cw6, java.lang.Object] */
    public static void A02(C255783ui r13, C265844Wn r14, float f, boolean z) {
        C255783ui r2;
        int i;
        View view;
        LinearLayout linearLayout;
        C265844Wn r1 = r14;
        ViewGroup viewGroup = r14.A02;
        if (!(viewGroup == null || (view = (View) viewGroup.getParent()) == null)) {
            C255783ui r12 = r13;
            float f2 = f;
            if (z) {
                TextView textView = r14.A05;
                if (!(textView == null || (linearLayout = r14.A04) == null)) {
                    ViewGroup viewGroup2 = r14.A02;
                    int width = view.getWidth();
                    int height = view.getHeight();
                    int dimensionPixelSize = viewGroup2.getContext().getResources().getDimensionPixelSize(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding);
                    if (((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).bottomMargin <= 0) {
                        0nA.A0T(textView, linearLayout.getHeight() + dimensionPixelSize);
                    }
                    Rect rect = new Rect();
                    C306746Ni.A01(rect, r12, f, width, height);
                    int width2 = linearLayout.getWidth();
                    int height2 = linearLayout.getHeight();
                    float width3 = ((float) rect.width()) / ((float) width2);
                    int height3 = linearLayout.getHeight() + dimensionPixelSize + textView.getHeight();
                    float f3 = (float) height2;
                    float height4 = ((float) rect.height()) / f3;
                    float exactCenterX = rect.exactCenterX() - (((float) viewGroup2.getWidth()) / 2.0f);
                    float exactCenterY = rect.exactCenterY();
                    float f4 = ((float) height3) - (f3 / 2.0f);
                    float f5 = exactCenterY - f4;
                    if (((int) f5) + height3 > height) {
                        f5 = (float) (height - height3);
                    }
                    viewGroup2.setX(exactCenterX);
                    viewGroup2.setY(f5);
                    float max = Math.max(width3, height4);
                    viewGroup2.setScaleX(max);
                    viewGroup2.setScaleY(max);
                    viewGroup2.setPivotX(((float) viewGroup2.getWidth()) / 2.0f);
                    viewGroup2.setPivotY(f4);
                    viewGroup2.setRotation(r12.A01 * 360.0f);
                }
            } else {
                ViewGroup viewGroup3 = r14.A02;
                int width4 = view.getWidth();
                int height5 = view.getHeight();
                C306406Ma r0 = C306406Ma.A00;
                0qQ.A0B(viewGroup3, 0);
                C306406Ma.A04(viewGroup3, r12, f2, width4, height5, true);
            }
        }
        if (r1.A0B != null && (r2 = r1.A09) != null && r1.A02 != null) {
            C272024jy A0E = r2.A0E();
            Context context = r1.A02.getContext();
            TextView textView2 = r1.A05;
            int i2 = 0;
            if (textView2 != null) {
                i = textView2.getHeight();
            } else {
                i = 0;
            }
            int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding);
            LinearLayout linearLayout2 = r1.A04;
            if (linearLayout2 != null) {
                i2 = linearLayout2.getHeight();
            }
            float A01 = 0nA.A01(context, r1.A02.getX() + (((float) r1.A02.getWidth()) / 2.0f));
            float A012 = 0nA.A01(context, r1.A02.getY() + (((float) r1.A02.getHeight()) / 2.0f));
            float radians = (float) Math.toRadians((double) r1.A02.getRotation());
            C309426Yf r11 = r1.A0B;
            A0E.getClass();
            String A002 = AnonymousClass9OX.A00(A0E);
            float A013 = 0nA.A01(context, (float) r1.A02.getWidth());
            float f6 = (float) (i2 + dimensionPixelSize2 + i);
            float scaleX = r1.A02.getScaleX();
            float scaleY = r1.A02.getScaleY();
            Map map = r11.A0Z;
            if (map == null) {
                map = new HashMap();
                r11.A0Z = map;
            }
            ? obj = new Object();
            obj.A07 = A002;
            obj.A08 = "poll";
            obj.A06 = A013;
            obj.A02 = f6;
            obj.A00 = A01;
            obj.A01 = A012;
            obj.A03 = radians;
            obj.A04 = scaleX;
            obj.A05 = scaleY;
            map.put(A002, obj);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:98:0x035b, code lost:
        if (r10.CcK() == false) goto L_0x035d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0434  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x045e  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x0482  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x049b  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x04a1  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x01a4 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x015a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A01(com.instagram.common.session.UserSession r31, X.C255773uh r32, X.C265864Wp r33, X.C265844Wn r34, X.C265834Wm r35, X.C309426Yf r36, java.lang.String r37, java.lang.String r38, java.lang.String r39, java.util.List r40, float r41, boolean r42, boolean r43) {
        /*
            r7 = r33
            r0 = r34
            r2 = r40
            if (r40 == 0) goto L_0x04bd
            boolean r1 = r2.isEmpty()
            if (r1 != 0) goto L_0x04bd
            X.3WT r1 = X.AnonymousClass3WT.POLLING
            X.3ui r4 = X.C289745e8.A00(r1, r2)
            if (r4 == 0) goto L_0x04c3
            X.4jy r2 = r4.A0E()
            r2.getClass()
            boolean r1 = X.AnonymousClass9OX.A02(r2)
            r11 = r31
            r10 = r32
            r12 = r35
            r8 = r36
            r6 = r37
            r5 = r38
            if (r1 == 0) goto L_0x01ee
            r6.getClass()
            r1 = 0
            X.0qQ.A0B(r7, r1)
            r1 = 6
            X.0qQ.A0B(r5, r1)
            X.3oV r13 = r7.A09
            boolean r1 = r13.CVM()
            if (r1 != 0) goto L_0x0075
            android.view.View r3 = r13.getView()
            r7.A00 = r3
            java.lang.String r9 = "stickerContainerView"
            if (r3 == 0) goto L_0x005b
            r1 = 2131437908(0x7f0b2954, float:1.8497728E38)
            android.view.View r1 = r3.requireViewById(r1)
            com.instagram.common.ui.base.IgTextView r1 = (com.instagram.common.ui.base.IgTextView) r1
            r7.A02 = r1
            if (r1 != 0) goto L_0x0063
            java.lang.String r9 = "titleView"
        L_0x005b:
            X.0qQ.A0F(r9)
        L_0x005e:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0063:
            X.C306466Mg.A00(r1)
            android.view.View r3 = r7.A00
            if (r3 == 0) goto L_0x005b
            r1 = 2131437902(0x7f0b294e, float:1.8497716E38)
            android.view.View r1 = r3.requireViewById(r1)
            com.instagram.common.ui.base.IgLinearLayout r1 = (com.instagram.common.ui.base.IgLinearLayout) r1
            r7.A01 = r1
        L_0x0075:
            r9 = 0
            r13.setVisibility(r9)
            r7.A03 = r10
            android.view.View r3 = r13.getView()
            android.view.ViewGroup r15 = X.C3019160o.A01(r3)
            X.IjK r1 = new X.IjK
            r13 = r1
            r14 = r3
            r16 = r11
            r17 = r4
            r18 = r7
            r13.<init>(r14, r15, r16, r17, r18)
            X.0nA.A0q(r3, r1)
            r7.A04 = r2
            r7.A05 = r12
            r7.A08 = r6
            r7.A07 = r5
            r7.A06 = r8
            X.4jy r1 = r7.A00()
            java.lang.String r1 = r1.A0D
            if (r1 != 0) goto L_0x00a7
            java.lang.String r1 = ""
        L_0x00a7:
            int r2 = r1.length()
            r12 = 0
            r1 = 0
            if (r2 != 0) goto L_0x00b0
            r1 = 1
        L_0x00b0:
            java.lang.String r16 = "titleView"
            r15 = 0
            com.instagram.common.ui.base.IgTextView r2 = r7.A02
            if (r1 == 0) goto L_0x017a
            if (r2 == 0) goto L_0x01a4
            r1 = 8
            r2.setVisibility(r1)
        L_0x00be:
            X.Mf0 r2 = X.C52319GNl.A00(r11)
            X.4jy r1 = r7.A00()
            java.lang.Integer r21 = r2.A00(r1)
            X.3kD r1 = r7.A03
            if (r1 == 0) goto L_0x0177
            X.4jy r1 = r7.A00()
            int[] r11 = X.C297825sP.A04(r11, r1, r9)
        L_0x00d6:
            X.4jy r1 = r7.A00()
            java.util.List r14 = X.AnonymousClass9OX.A01(r1)
            com.instagram.common.ui.base.IgLinearLayout r1 = r7.A01
            java.lang.String r16 = "optionList"
            if (r1 == 0) goto L_0x01a4
            android.content.Context r1 = r1.getContext()
            android.view.LayoutInflater r13 = android.view.LayoutInflater.from(r1)
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            X.4jy r1 = r7.A00()
            com.instagram.api.schemas.StoryPollColorType r1 = r1.A02
            int r24 = X.C17043VFr.A00(r1)
            com.instagram.common.ui.base.IgLinearLayout r1 = r7.A01
            if (r1 == 0) goto L_0x01a4
            int r3 = r1.getChildCount()
            r2 = 0
        L_0x0104:
            com.instagram.common.ui.base.IgLinearLayout r1 = r7.A01
            if (r2 >= r3) goto L_0x0117
            if (r1 == 0) goto L_0x01a4
            android.view.View r1 = r1.getChildAt(r2)
            X.0qQ.A07(r1)
            r10.add(r1)
            int r2 = r2 + 1
            goto L_0x0104
        L_0x0117:
            if (r1 == 0) goto L_0x01a4
            r1.removeAllViews()
            java.util.ArrayList r8 = r7.A0B
            r8.clear()
            int r6 = r14.size()
            r5 = 0
        L_0x0126:
            if (r5 >= r6) goto L_0x01c8
            boolean r1 = r10.isEmpty()
            r1 = r1 ^ 1
            if (r1 == 0) goto L_0x0168
            java.lang.Object r4 = r10.remove(r9)
            android.view.View r4 = (android.view.View) r4
        L_0x0136:
            java.lang.Object r3 = X.00k.A0O(r14, r5)
            X.4jx r3 = (X.C272014jx) r3
            if (r3 == 0) goto L_0x015d
            if (r21 != 0) goto L_0x0160
            X.4Wq r2 = r7.A0A
            r22 = 0
        L_0x0144:
            X.HrI r1 = new X.HrI
            r23 = r5
            r18 = r4
            r19 = r3
            r20 = r2
            r17 = r1
            r17.<init>(r18, r19, r20, r21, r22, r23, r24)
            r8.add(r1)
        L_0x0156:
            com.instagram.common.ui.base.IgLinearLayout r1 = r7.A01
            if (r1 == 0) goto L_0x01a4
            r1.addView(r4)
        L_0x015d:
            int r5 = r5 + 1
            goto L_0x0126
        L_0x0160:
            if (r11 == 0) goto L_0x0156
            r2 = 0
            java.lang.Integer r22 = X.03t.A04(r11, r5)
            goto L_0x0144
        L_0x0168:
            r2 = 2131628214(0x7f0e10b6, float:1.8883714E38)
            com.instagram.common.ui.base.IgLinearLayout r1 = r7.A01
            if (r1 == 0) goto L_0x01a4
            android.view.View r4 = r13.inflate(r2, r1, r9)
            X.0qQ.A0A(r4)
            goto L_0x0136
        L_0x0177:
            r11 = r15
            goto L_0x00d6
        L_0x017a:
            if (r2 == 0) goto L_0x01a4
            r2.setVisibility(r9)
            com.instagram.common.ui.base.IgTextView r2 = r7.A02
            if (r2 == 0) goto L_0x01a4
            X.4jy r1 = r7.A00()
            java.lang.String r1 = r1.A0D
            r2.setText(r1)
            com.instagram.common.ui.base.IgTextView r1 = r7.A02
            if (r1 == 0) goto L_0x01a4
            android.graphics.drawable.Drawable r1 = r1.getBackground()
            android.graphics.drawable.Drawable r3 = r1.mutate()
            boolean r1 = r3 instanceof android.graphics.drawable.GradientDrawable
            if (r1 == 0) goto L_0x01a9
            android.graphics.drawable.GradientDrawable r3 = (android.graphics.drawable.GradientDrawable) r3
        L_0x019e:
            android.view.View r1 = r7.A00
            if (r1 != 0) goto L_0x01ab
            java.lang.String r16 = "stickerContainerView"
        L_0x01a4:
            X.0qQ.A0F(r16)
            goto L_0x005e
        L_0x01a9:
            r3 = r15
            goto L_0x019e
        L_0x01ab:
            android.content.Context r2 = r1.getContext()
            X.4jy r1 = r7.A00()
            com.instagram.api.schemas.StoryPollColorType r1 = r1.A02
            int r1 = X.C17043VFr.A00(r1)
            int r1 = r2.getColor(r1)
            int[] r1 = new int[]{r1, r1}
            if (r3 == 0) goto L_0x00be
            r3.setColors(r1)
            goto L_0x00be
        L_0x01c8:
            if (r21 == 0) goto L_0x01ea
            if (r11 == 0) goto L_0x01ea
            int r3 = r8.size()
        L_0x01d0:
            if (r12 >= r3) goto L_0x01ea
            java.lang.Object r2 = X.00k.A0O(r8, r12)
            X.HrI r2 = (X.C56010HrI) r2
            if (r2 == 0) goto L_0x01e7
            java.lang.Integer r1 = X.03t.A04(r11, r12)
            if (r1 == 0) goto L_0x01e7
            int r1 = r1.intValue()
            r2.A00(r1, r15)
        L_0x01e7:
            int r12 = r12 + 1
            goto L_0x01d0
        L_0x01ea:
            r0.A01()
            return
        L_0x01ee:
            r7.A01()
            android.view.ViewGroup r1 = r0.A02
            if (r1 != 0) goto L_0x023d
            android.view.ViewStub r1 = r0.A0E
            android.view.View r3 = r1.inflate()
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            r0.A02 = r3
            r1 = 2131437842(0x7f0b2912, float:1.8497594E38)
            android.view.View r1 = r3.requireViewById(r1)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r0.A03 = r1
            android.view.ViewGroup r3 = r0.A02
            r1 = 2131443126(0x7f0b3db6, float:1.8508311E38)
            android.view.View r1 = r3.requireViewById(r1)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r0.A04 = r1
            android.view.ViewGroup r3 = r0.A02
            r1 = 2131432914(0x7f0b15d2, float:1.8487599E38)
            android.view.View r1 = r3.requireViewById(r1)
            r0.A00 = r1
            android.view.ViewGroup r3 = r0.A02
            r1 = 2131440840(0x7f0b34c8, float:1.8503675E38)
            android.view.View r1 = r3.requireViewById(r1)
            r0.A01 = r1
            android.view.View r1 = r0.A00
            X.3NM r1 = r0.A00(r1)
            r0.A06 = r1
            android.view.View r1 = r0.A01
            X.3NM r1 = r0.A00(r1)
            r0.A07 = r1
        L_0x023d:
            r0.A09 = r4
            android.view.ViewGroup r1 = r0.A02
            r1.getClass()
            r3 = 0
            r1.setVisibility(r3)
            r0.A0D = r6
            r0.A0C = r5
            r0.A0A = r12
            r0.A08 = r10
            r0.A0B = r8
            java.util.List r1 = X.AnonymousClass9OX.A01(r2)
            java.lang.Object r7 = r1.get(r3)
            X.4jx r7 = (X.C272014jx) r7
            r9 = 1
            java.lang.Object r1 = r1.get(r9)
            X.4jx r1 = (X.C272014jx) r1
            android.widget.ImageView r5 = r0.A03
            r5.getClass()
            android.content.Context r14 = r5.getContext()
            r12 = 0
            r35 = 0
            r18 = 0
            r38 = 0
            java.lang.String r6 = X.C18687Vwl.A02(r7)
            java.lang.String r5 = X.C18687Vwl.A02(r1)
            float r7 = X.C18687Vwl.A00(r7)
            float r24 = X.0nA.A00(r14, r7)
            float r1 = X.C18687Vwl.A00(r1)
            float r25 = X.0nA.A00(r14, r1)
            java.util.Locale r1 = java.util.Locale.getDefault()
            java.lang.String r17 = r6.toUpperCase(r1)
            java.util.Locale r1 = java.util.Locale.getDefault()
            java.lang.String r19 = r5.toUpperCase(r1)
            android.content.res.Resources r5 = r14.getResources()
            r1 = 2131165207(0x7f070017, float:1.7944625E38)
            int r26 = r5.getDimensionPixelSize(r1)
            android.content.res.Resources r5 = r14.getResources()
            r1 = 2131165200(0x7f070010, float:1.794461E38)
            int r29 = r5.getDimensionPixelSize(r1)
            android.content.res.Resources r5 = r14.getResources()
            r1 = 2131165207(0x7f070017, float:1.7944625E38)
            int r28 = r5.getDimensionPixelSize(r1)
            android.content.res.Resources r5 = r14.getResources()
            r1 = 2131165200(0x7f070010, float:1.794461E38)
            int r30 = r5.getDimensionPixelSize(r1)
            android.content.res.Resources r5 = r14.getResources()
            r1 = 2131165217(0x7f070021, float:1.7944645E38)
            int r31 = r5.getDimensionPixelSize(r1)
            r1 = 2130970169(0x7f040639, float:1.754904E38)
            int r5 = X.2Yu.A0H(r14, r1)
            int r8 = r14.getColor(r5)
            int r5 = X.2Yu.A0H(r14, r1)
            int r7 = r14.getColor(r5)
            int r5 = X.2Yu.A0H(r14, r1)
            int r6 = r14.getColor(r5)
            int r5 = X.2Yu.A0H(r14, r1)
            int r5 = r14.getColor(r5)
            int r1 = X.2Yu.A0H(r14, r1)
            int r1 = r14.getColor(r1)
            int[] r21 = new int[]{r8, r7, r6, r5, r1}
            r1 = 2130970194(0x7f040652, float:1.7549091E38)
            int r5 = X.2Yu.A0H(r14, r1)
            int r8 = r14.getColor(r5)
            int r5 = X.2Yu.A0H(r14, r1)
            int r7 = r14.getColor(r5)
            int r5 = X.2Yu.A0H(r14, r1)
            int r6 = r14.getColor(r5)
            int r5 = X.2Yu.A0H(r14, r1)
            int r5 = r14.getColor(r5)
            int r1 = X.2Yu.A0H(r14, r1)
            int r1 = r14.getColor(r1)
            int[] r23 = new int[]{r8, r7, r6, r5, r1}
            r20 = r21
            r22 = r23
            X.0qq r5 = X.AnonymousClass0qo.A00(r14)
            X.0qm r1 = X.0qm.A0V
            android.graphics.Typeface r15 = r5.A02(r1)
            r1 = 2131100285(0x7f06027d, float:1.7812947E38)
            int r32 = r14.getColor(r1)
            r1 = 2131099843(0x7f0600c3, float:1.781205E38)
            int r27 = r14.getColor(r1)
            r1 = 2131100047(0x7f06018f, float:1.7812464E38)
            int r33 = r14.getColor(r1)
            if (r10 == 0) goto L_0x035d
            boolean r1 = r10.CcK()
            r36 = 1
            if (r1 != 0) goto L_0x035f
        L_0x035d:
            r36 = 0
        L_0x035f:
            java.lang.Boolean r1 = r2.A03
            if (r1 == 0) goto L_0x04b3
            boolean r34 = r1.booleanValue()
        L_0x0367:
            boolean r1 = r4.A1r
            if (r1 == 0) goto L_0x03c4
            r35 = 1
            int[] r20 = X.AnonymousClass6LW.A03
            r22 = r20
            int[] r21 = X.AnonymousClass6LW.A04
            r23 = r21
            android.content.res.Resources r5 = r14.getResources()
            r1 = 2131165561(0x7f070179, float:1.7945343E38)
            int r26 = r5.getDimensionPixelSize(r1)
            r1 = 2131100129(0x7f0601e1, float:1.781263E38)
            int r33 = r14.getColor(r1)
            android.content.res.Resources r6 = r14.getResources()
            r5 = 2131165196(0x7f07000c, float:1.7944602E38)
            int r29 = r6.getDimensionPixelSize(r5)
            android.content.res.Resources r6 = r14.getResources()
            r5 = 2131165218(0x7f070022, float:1.7944647E38)
            int r28 = r6.getDimensionPixelSize(r5)
            android.content.res.Resources r6 = r14.getResources()
            r5 = 2131165196(0x7f07000c, float:1.7944602E38)
            int r30 = r6.getDimensionPixelSize(r5)
            android.content.res.Resources r6 = r14.getResources()
            r5 = 2131165230(0x7f07002e, float:1.7944671E38)
            int r31 = r6.getDimensionPixelSize(r5)
            int r32 = r14.getColor(r1)
            X.0qq r5 = X.AnonymousClass0qo.A00(r14)
            X.0qm r1 = X.0qm.A0I
            android.graphics.Typeface r1 = r5.A02(r1)
            if (r1 == 0) goto L_0x03c4
            r15 = r1
        L_0x03c4:
            java.lang.Boolean r1 = r2.A05
            if (r1 == 0) goto L_0x03d4
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x03d4
            java.lang.String r18 = X.AnonymousClass9OX.A00(r2)
            r38 = 1
        L_0x03d4:
            if (r42 == 0) goto L_0x04ab
            java.lang.String r7 = r2.A0D
            boolean r1 = android.text.TextUtils.isEmpty(r7)
            if (r1 != 0) goto L_0x04ab
            r5 = 1
            android.widget.TextView r1 = r0.A05
            if (r1 != 0) goto L_0x03fa
            android.view.ViewGroup r1 = r0.A02
            if (r1 == 0) goto L_0x03fa
            r6 = 2131439548(0x7f0b2fbc, float:1.8501054E38)
            android.view.View r1 = r1.findViewById(r6)
            android.view.ViewStub r1 = (android.view.ViewStub) r1
            if (r1 == 0) goto L_0x03fa
            android.view.View r1 = r1.inflate()
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.A05 = r1
        L_0x03fa:
            android.widget.TextView r1 = r0.A05
            r1.getClass()
            X.C306466Mg.A01(r1)
            android.widget.TextView r1 = r0.A05
            r1.setText(r7)
            android.widget.TextView r1 = r0.A05
            r1.setVisibility(r3)
        L_0x040c:
            X.9pm r13 = new X.9pm
            r37 = r3
            r16 = r12
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38)
            android.widget.ImageView r1 = r0.A03
            r1.setImageDrawable(r13)
            X.3NM r1 = r0.A06
            r1.getClass()
            r1.A02()
            X.3NM r1 = r0.A07
            r1.getClass()
            r1.A02()
            X.Mf0 r1 = X.C52319GNl.A00(r11)
            java.lang.Integer r6 = r1.A00(r2)
            if (r6 == 0) goto L_0x0439
            r13.A0E = r6
            r13.invalidateSelf()
        L_0x0439:
            int[] r1 = X.C297825sP.A04(r11, r2, r3)
            r13.A0C(r1)
            java.lang.Boolean r1 = r2.A06
            if (r1 == 0) goto L_0x0497
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x0497
            if (r6 != 0) goto L_0x0497
            X.3NM r1 = r0.A06
            if (r1 == 0) goto L_0x0452
            r1.A01 = r3
        L_0x0452:
            X.3NM r1 = r0.A07
            if (r1 == 0) goto L_0x0458
            r1.A01 = r3
        L_0x0458:
            android.view.ViewGroup r2 = r0.A02
            r3 = r41
            if (r43 == 0) goto L_0x0482
            X.IDE r1 = new X.IDE
            r1.<init>(r4, r0, r3, r5)
            r2.addOnLayoutChangeListener(r1)
            android.view.ViewGroup r1 = r0.A02
            r1.requestLayout()
        L_0x046b:
            java.lang.String r1 = r11.A06
            r2 = r39
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x04b7
            if (r42 != 0) goto L_0x04b7
            android.view.ViewGroup r2 = r0.A02
            X.IAY r1 = new X.IAY
            r1.<init>(r0)
            X.AnonymousClass0fU.A00(r1, r2)
            return
        L_0x0482:
            boolean r1 = r2.isLaidOut()
            if (r1 == 0) goto L_0x048c
            A02(r4, r0, r3, r5)
            goto L_0x046b
        L_0x048c:
            android.view.ViewGroup r2 = r0.A02
            X.Ik2 r1 = new X.Ik2
            r1.<init>(r4, r0, r3, r5)
            X.0nA.A0t(r2, r1)
            goto L_0x046b
        L_0x0497:
            X.3NM r1 = r0.A06
            if (r1 == 0) goto L_0x049d
            r1.A01 = r9
        L_0x049d:
            X.3NM r1 = r0.A07
            if (r1 == 0) goto L_0x04a3
            r1.A01 = r9
        L_0x04a3:
            X.2cs r3 = r13.A0i
            r1 = 4611686018427387904(0x4000000000000000, double:2.0)
            r3.A08(r1, r9)
            goto L_0x0458
        L_0x04ab:
            r5 = 0
            android.widget.TextView r1 = r0.A05
            X.0nA.A0O(r1)
            goto L_0x040c
        L_0x04b3:
            r34 = 0
            goto L_0x0367
        L_0x04b7:
            android.view.ViewGroup r0 = r0.A02
            r0.setOnClickListener(r12)
            return
        L_0x04bd:
            r0.A01()
            r7.A01()
        L_0x04c3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C265884Wr.A01(com.instagram.common.session.UserSession, X.3uh, X.4Wp, X.4Wn, X.4Wm, X.6Yf, java.lang.String, java.lang.String, java.lang.String, java.util.List, float, boolean, boolean):void");
    }
}
