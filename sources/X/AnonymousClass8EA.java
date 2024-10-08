package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.util.Pair;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.cameratoolmenu.CameraToolMenuItem;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.8EA  reason: invalid class name */
public final class AnonymousClass8EA extends FrameLayout {
    public int A00 = -1;
    public FrameLayout A01;
    public UserSession A02;
    public C279284yO A03;
    public AnonymousClass8E8 A04;
    public Integer A05;
    public LinkedHashMap A06;
    public int A07;
    public C265674Vs A08;
    public AnonymousClass88T A09;
    public final FrameLayout A0A;
    public final 2cs A0B;
    public final AnonymousClass8EE A0C;
    public final LinkedHashMap A0D = new LinkedHashMap();
    public final LinkedHashMap A0E = new LinkedHashMap();
    public final GradientDrawable A0F;
    public final View.OnClickListener A0G;
    public final ImageView A0H;
    public final C252203oj A0I;
    public final AnonymousClass8EB A0J = new Object();

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0038, code lost:
        if (r5.A05 != X.AnonymousClass05K.A0C) goto L_0x003a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A07(X.C265674Vs r18, X.AnonymousClass88T r19, java.lang.Integer r20) {
        /*
            r17 = this;
            r6 = 1
            r5 = r17
            r8 = r19
            r5.A09 = r8
            r0 = r20
            r5.A05 = r0
            r4 = r18
            r5.A08 = r4
            java.util.LinkedHashMap r2 = r5.A0D
            X.4yO r0 = r5.A03
            java.lang.Object r7 = r2.get(r0)
            X.8EL r7 = (X.AnonymousClass8EL) r7
            if (r7 == 0) goto L_0x0020
            X.8EP r0 = r7.A0H
            r0.A00()
        L_0x0020:
            A02(r5)
            X.4yO r1 = r5.A03
            X.9QA r0 = X.AnonymousClass9QA.A00
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x0033
            X.4yO r0 = r5.A03
            boolean r0 = r0 instanceof X.AnonymousClass80O
            if (r0 == 0) goto L_0x003a
        L_0x0033:
            java.lang.Integer r3 = r5.A05
            java.lang.Integer r1 = X.AnonymousClass05K.A0C
            r0 = 1
            if (r3 == r1) goto L_0x003b
        L_0x003a:
            r0 = 0
        L_0x003b:
            r11 = 0
            if (r0 == 0) goto L_0x012e
            X.88T r0 = X.AnonymousClass88T.TABLE_TOP
            if (r8 != r0) goto L_0x0113
            android.widget.FrameLayout r0 = r5.A01
            if (r0 != 0) goto L_0x013b
            android.content.Context r13 = r5.getContext()
            android.widget.FrameLayout r1 = new android.widget.FrameLayout
            r1.<init>(r13)
            r12 = -1
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            r0.<init>(r12, r12)
            r1.setLayoutParams(r0)
            r5.A01 = r1
            r5.addView(r1)
            X.4W8 r0 = X.AnonymousClass4W7.A00(r4)
            if (r0 == 0) goto L_0x0110
            android.graphics.Rect r0 = r0.AhW()
            int r0 = r0.bottom
        L_0x0069:
            float r10 = (float) r0
            android.content.res.Resources r1 = r5.getResources()
            r0 = 2131165184(0x7f070000, float:1.7944578E38)
            int r9 = r1.getDimensionPixelSize(r0)
            java.util.Set r0 = r2.entrySet()
            java.util.Iterator r16 = r0.iterator()
        L_0x007c:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x013b
            java.lang.Object r0 = r16.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r8 = r0.getValue()
            X.8EL r8 = (X.AnonymousClass8EL) r8
            android.widget.HorizontalScrollView r4 = new android.widget.HorizontalScrollView
            r4.<init>(r13)
            r3 = -2
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            r0.<init>(r3, r3, r6)
            r4.setLayoutParams(r0)
            r14 = 8
            r4.setVisibility(r14)
            r4.setHorizontalScrollBarEnabled(r11)
            r4.setY(r10)
            android.widget.FrameLayout r0 = r5.A01
            if (r0 == 0) goto L_0x00ae
            r0.addView(r4)
        L_0x00ae:
            android.view.View r2 = new android.view.View
            r2.<init>(r13)
            android.content.res.Resources r15 = r2.getResources()
            r0 = 2131165250(0x7f070042, float:1.7944712E38)
            int r1 = r15.getDimensionPixelSize(r0)
            r0 = 2131165293(0x7f07006d, float:1.79448E38)
            int r0 = r15.getDimensionPixelSize(r0)
            int r0 = r0 * 2
            int r1 = r1 + r0
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            r0.<init>(r12, r1)
            r2.setLayoutParams(r0)
            r2.setVisibility(r14)
            android.content.Context r1 = r2.getContext()
            r0 = 2130970205(0x7f04065d, float:1.7549114E38)
            int r0 = X.2Yu.A0H(r1, r0)
            android.graphics.drawable.Drawable r0 = r1.getDrawable(r0)
            r2.setBackground(r0)
            r2.setY(r10)
            android.widget.FrameLayout r0 = r5.A01
            if (r0 == 0) goto L_0x00ef
            r0.addView(r2)
        L_0x00ef:
            X.0qQ.A07(r13)
            com.instagram.common.ui.base.IgLinearLayout r1 = new com.instagram.common.ui.base.IgLinearLayout
            r1.<init>(r13)
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            r0.<init>(r3, r3)
            r1.setLayoutParams(r0)
            r1.setOrientation(r11)
            r1.setPadding(r9, r11, r9, r11)
            r4.addView(r1)
            r8.A04 = r1
            r8.A05 = r4
            r8.A03 = r2
            goto L_0x007c
        L_0x0110:
            r0 = 0
            goto L_0x0069
        L_0x0113:
            if (r7 == 0) goto L_0x0118
            r7.A0A(r11)
        L_0x0118:
            boolean r0 = r5.A04()
            if (r0 == 0) goto L_0x0121
            A03(r5, r6)
        L_0x0121:
            android.widget.FrameLayout r0 = r5.A0A
            if (r0 == 0) goto L_0x016c
            android.view.View[] r1 = new android.view.View[]{r0}
            r0 = 0
            X.C294975nL.A04(r0, r1, r6)
            goto L_0x016c
        L_0x012e:
            android.widget.FrameLayout r0 = r5.A0A
            r0.setVisibility(r11)
            android.widget.FrameLayout r0 = r5.A01
            if (r0 == 0) goto L_0x016c
            r0.setVisibility(r11)
            goto L_0x016c
        L_0x013b:
            r3 = 0
            if (r7 == 0) goto L_0x0157
            X.2cs r0 = r7.A0C
            double r1 = r0.A01
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x0157
            r7.A07(r3)
            java.util.Set r0 = r7.A0K
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0170
            r7.A05()
        L_0x0157:
            android.widget.FrameLayout r3 = r5.A0A
            r0 = 20
            X.GA1 r2 = new X.GA1
            r2.<init>(r0, r7, r6)
            if (r3 == 0) goto L_0x016c
            r1 = 8
            X.Afr r0 = new X.Afr
            r0.<init>(r2)
            X.C294975nL.A03(r3, r0, r1, r6)
        L_0x016c:
            A01(r5)
            return
        L_0x0170:
            r7.A06()
            goto L_0x0157
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8EA.A07(X.4Vs, X.88T, java.lang.Integer):void");
    }

    public final void setCameraToolPairings(LinkedHashMap linkedHashMap, C279284yO r16) {
        0qQ.A0B(linkedHashMap, 0);
        C279284yO r1 = r16;
        0qQ.A0B(r1, 1);
        this.A06 = linkedHashMap;
        this.A03 = r1;
        FrameLayout frameLayout = this.A0A;
        frameLayout.removeAllViews();
        LinkedHashMap linkedHashMap2 = this.A0E;
        linkedHashMap2.clear();
        LinkedHashMap linkedHashMap3 = this.A0D;
        linkedHashMap3.clear();
        int i = 0;
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            C279284yO r12 = (C279284yO) entry.getKey();
            C3494580l r7 = (C3494580l) entry.getValue();
            FrameLayout frameLayout2 = new FrameLayout(getContext());
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            layoutParams.gravity = 16;
            frameLayout2.setLayoutParams(layoutParams);
            frameLayout2.setTranslationX((float) i);
            frameLayout.addView(frameLayout2);
            UserSession userSession = this.A02;
            if (userSession == null) {
                0qQ.A0F("userSession");
                throw AnonymousClass00P.createAndThrow();
            }
            AnonymousClass8EL r9 = new AnonymousClass8EL(frameLayout2, userSession, r12, this.A0C, this);
            linkedHashMap2.put(r9, frameLayout2);
            linkedHashMap3.put(r12, r9);
            r9.A08(r7);
            i += getResources().getDimensionPixelSize(R.dimen.add_to_story_dual_destination_share_sheet_avatar_icon_size);
        }
        0nA.A0f(frameLayout, i + getResources().getDimensionPixelSize(R.dimen.achievements_list_container_height));
        A03(this, false);
        A01(this);
    }

    private final void A00() {
        float A022;
        LinkedHashMap linkedHashMap = this.A06;
        if (linkedHashMap != null) {
            float f = (float) this.A0B.A09.A00;
            Resources resources = getResources();
            float dimensionPixelSize = (float) resources.getDimensionPixelSize(R.dimen.add_to_story_dual_destination_share_sheet_avatar_icon_size);
            float size = ((float) (linkedHashMap.size() - 1)) * dimensionPixelSize;
            AnonymousClass8EB r0 = this.A0J;
            float f2 = -1.0f * dimensionPixelSize * (r0.A00 + ((float) r0.A01));
            if (A04()) {
                f2 += size;
            }
            float dimension = resources.getDimension(R.dimen.achievements_list_container_height);
            if (A04()) {
                A022 = 0mi.A02(f, 0.5f, 1.0f, 0.0f, 1.0f);
                dimension *= -1.0f;
            } else {
                A022 = 0mi.A02(f, 0.0f, 0.5f, 1.0f, 0.0f);
            }
            float f3 = dimension * (-(1.0f - A022));
            this.A0H.setTranslationX(f3);
            FrameLayout frameLayout = this.A0A;
            frameLayout.setAlpha(A022);
            frameLayout.setTranslationX(f2 + f3);
        }
    }

    public static final void A01(AnonymousClass8EA r8) {
        GradientDrawable.Orientation orientation;
        int argb;
        float f = 0.0f;
        if (!((0qQ.A0K(r8.A03, AnonymousClass9QA.A00) || (r8.A03 instanceof AnonymousClass80O)) && r8.A05 == AnonymousClass05K.A0C && r8.A09 == AnonymousClass88T.TABLE_TOP)) {
            for (Object next : r8.A0D.values()) {
                0qQ.A07(next);
                AnonymousClass8EL r4 = (AnonymousClass8EL) next;
                f = Math.max(Math.max(f, (float) r4.A0C.A09.A00), (float) r4.A0H.A06.A09.A00);
            }
        }
        boolean A042 = r8.A04();
        GradientDrawable gradientDrawable = r8.A0F;
        if (A042) {
            orientation = GradientDrawable.Orientation.RIGHT_LEFT;
        } else {
            orientation = GradientDrawable.Orientation.LEFT_RIGHT;
        }
        gradientDrawable.setOrientation(orientation);
        Pair percentLeftRightSide = r8.getPercentLeftRightSide();
        Object obj = percentLeftRightSide.first;
        0qQ.A06(obj);
        float floatValue = ((Number) obj).floatValue();
        Object obj2 = percentLeftRightSide.second;
        0qQ.A06(obj2);
        float max = Math.max(floatValue, ((Number) obj2).floatValue()) * f;
        float f2 = 1.0f - 0.0f;
        float f3 = 217.0f - 22.0f;
        float f4 = 0.0f;
        if (f2 != 0.0f) {
            f4 = (max - 0.0f) / f2;
        }
        int i = (int) ((f4 * f3) + 22.0f);
        if (C61670oa.A03()) {
            argb = Color.argb(i, 12, 16, 20);
        } else {
            argb = Color.argb(i, 0, 0, 0);
        }
        gradientDrawable.setColors(new int[]{argb, 0});
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0015, code lost:
        if (r5.A05 != X.AnonymousClass05K.A0C) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A02(X.AnonymousClass8EA r5) {
        /*
            X.4yO r1 = r5.A03
            X.9QA r0 = X.AnonymousClass9QA.A00
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x0010
            X.4yO r0 = r5.A03
            boolean r0 = r0 instanceof X.AnonymousClass80O
            if (r0 == 0) goto L_0x0017
        L_0x0010:
            java.lang.Integer r2 = r5.A05
            java.lang.Integer r1 = X.AnonymousClass05K.A0C
            r0 = 1
            if (r2 == r1) goto L_0x0018
        L_0x0017:
            r0 = 0
        L_0x0018:
            r4 = 0
            if (r0 == 0) goto L_0x0021
            X.88T r1 = r5.A09
            X.88T r0 = X.AnonymousClass88T.TABLE_TOP
            if (r1 == r0) goto L_0x0046
        L_0x0021:
            java.util.LinkedHashMap r0 = r5.A0D
            java.util.Collection r0 = r0.values()
            java.util.Iterator r3 = r0.iterator()
        L_0x002b:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0046
            java.lang.Object r0 = r3.next()
            X.0qQ.A07(r0)
            X.8EL r0 = (X.AnonymousClass8EL) r0
            X.2cs r0 = r0.A0C
            X.2ct r0 = r0.A09
            double r1 = r0.A00
            float r0 = (float) r1
            float r4 = java.lang.Math.max(r4, r0)
            goto L_0x002b
        L_0x0046:
            android.widget.ImageView r2 = r5.A0H
            r0 = 1061158912(0x3f400000, float:0.75)
            int r1 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            r0 = 0
            if (r1 <= 0) goto L_0x0050
            r0 = 1
        L_0x0050:
            r2.setClickable(r0)
            r2.setAlpha(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8EA.A02(X.8EA):void");
    }

    public static final void A03(AnonymousClass8EA r9, boolean z) {
        LinkedHashMap linkedHashMap = r9.A06;
        if (linkedHashMap != null) {
            double d = r9.A0B.A09.A00;
            float dimensionPixelSize = (float) r9.getResources().getDimensionPixelSize(R.dimen.add_to_story_dual_destination_share_sheet_avatar_icon_size);
            float size = ((float) (linkedHashMap.size() - 1)) * dimensionPixelSize;
            int i = 8388611;
            if (r9.A04()) {
                i = 8388613;
            }
            if (r9.A07 != i || z) {
                r9.A07 = i;
                0nA.A0W(r9.A0A, i | 16);
                0nA.A0W(r9.A0H, i | 48);
                float f = 0.0f;
                if (r9.A04()) {
                    f = -size;
                }
                for (Object next : r9.A0E.keySet()) {
                    0qQ.A07(next);
                    AnonymousClass8EL r2 = (AnonymousClass8EL) next;
                    r2.A02 = i;
                    for (View A0W : r2.A0J) {
                        0nA.A0W(A0W, i);
                    }
                    r2.A0A.setTranslationX(f);
                    f += dimensionPixelSize;
                }
            }
            r9.A00();
            A01(r9);
            for (Object next2 : r9.A0E.keySet()) {
                0qQ.A07(next2);
                AnonymousClass8EL r6 = (AnonymousClass8EL) next2;
                r6.A00 = d;
                for (CameraToolMenuItem cameraToolMenuItem : r6.A0J) {
                    if (cameraToolMenuItem != null) {
                        cameraToolMenuItem.setPlacement(r6.A00);
                    }
                }
                r6.EBG();
            }
            AnonymousClass8E8 r22 = r9.A04;
            if (r22 == null) {
                0qQ.A0F("delegate");
                throw AnonymousClass00P.createAndThrow();
            }
            boolean A042 = r9.A04();
            r22.A05.A06.Epw(Boolean.valueOf(!A042));
            for (C3495480u onChanged : r22.A08) {
                onChanged.onChanged(Boolean.valueOf(A042));
            }
        }
    }

    private final boolean A04() {
        if (this.A0B.A09.A00 > 0.5d) {
            return true;
        }
        return false;
    }

    private final Pair getPercentLeftRightSide() {
        float f = (float) this.A0B.A09.A00;
        return new Pair(Float.valueOf(0mi.A02(f, 0.5f, 0.0f, 0.0f, 1.0f)), Float.valueOf(0mi.A02(f, 0.5f, 1.0f, 0.0f, 1.0f)));
    }

    public final View A05(C358088aL r3) {
        LinkedHashMap linkedHashMap = this.A0D;
        linkedHashMap.values();
        for (Object next : linkedHashMap.values()) {
            0qQ.A07(next);
            View view = (View) ((AnonymousClass8EL) next).A0I.get(r3);
            if (view != null) {
                return view;
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0085 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A06(int r12, int r13, float r14) {
        /*
            r11 = this;
            X.8EB r0 = r11.A0J
            r0.A00 = r14
            r0.A01 = r12
            int r4 = X.AnonymousClass1GB.A01(r14)
            int r4 = r4 + r12
            java.util.LinkedHashMap r0 = r11.A0D
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r10 = r0.iterator()
            r3 = 0
        L_0x0016:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x008d
            java.lang.Object r0 = r10.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r5 = r0.getKey()
            X.4yO r5 = (X.C279284yO) r5
            java.lang.Object r2 = r0.getValue()
            X.8EL r2 = (X.AnonymousClass8EL) r2
            r6 = 0
            int r0 = (r14 > r6 ? 1 : (r14 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x0043
            r0 = 0
            r2.A07(r0)
            X.8EP r0 = r2.A0H
            r0.A00()
            r0 = 0
            r2.A08 = r0
            r2.EBG()
        L_0x0043:
            if (r3 != r4) goto L_0x005e
            double r0 = (double) r14
            r8 = 4606732058837280358(0x3fee666666666666, double:0.95)
            int r7 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r7 > 0) goto L_0x0058
            r8 = 4587366580439587226(0x3fa999999999999a, double:0.05)
            int r7 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r7 >= 0) goto L_0x005e
        L_0x0058:
            r0 = 1
            r2.A08 = r0
            r2.EBG()
        L_0x005e:
            if (r3 != r12) goto L_0x0088
            r6 = 1065353216(0x3f800000, float:1.0)
            float r6 = r6 - r14
        L_0x0063:
            r2.A01 = r6
        L_0x0065:
            r2.EBG()
            X.4yO r0 = r11.A03
            if (r0 == r5) goto L_0x0085
            X.0sl r0 = X.0sl.A00
            r2.A09(r0)
            if (r3 != r4) goto L_0x0085
            r2.A06()
            r11.A03 = r5
            java.lang.Integer r2 = r11.A05
            if (r2 == 0) goto L_0x0085
            X.4Vs r1 = r11.A08
            if (r1 == 0) goto L_0x0085
            X.88T r0 = r11.A09
            r11.A07(r1, r0, r2)
        L_0x0085:
            int r3 = r3 + 1
            goto L_0x0016
        L_0x0088:
            if (r3 != r13) goto L_0x0063
            r2.A01 = r14
            goto L_0x0065
        L_0x008d:
            r11.A00()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8EA.A06(int, int, float):void");
    }

    public final AnonymousClass8E8 getCameraToolMenuDelegate() {
        AnonymousClass8E8 r0 = this.A04;
        if (r0 != null) {
            return r0;
        }
        0qQ.A0F("delegate");
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [X.8EB, java.lang.Object] */
    public AnonymousClass8EA(Context context) {
        super(context);
        AnonymousClass8EC r5 = new AnonymousClass8EC(this);
        this.A0G = r5;
        AnonymousClass8ED r4 = new AnonymousClass8ED(this);
        this.A0I = r4;
        this.A0C = new AnonymousClass8EE(this);
        setLayoutDirection(0);
        this.A0B = AnonymousClass8EF.A00(r4, 2.0d, 20.0d);
        View inflate = View.inflate(context, R.layout.layout_camera_tool_menu, this);
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.A0F = gradientDrawable;
        inflate.setBackground(gradientDrawable);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.camera_tool_menu_switch_button);
        this.A0H = imageView;
        imageView.setOnClickListener(r5);
        A02(this);
        this.A0A = (FrameLayout) inflate.findViewById(R.id.camera_tool_menu_item_holder);
        inflate.setOnTouchListener(new AnonymousClass8EH(this));
    }

    public final void onDetachedFromWindow() {
        int A062 = AnonymousClass0fD.A06(1701129140);
        super.onDetachedFromWindow();
        for (Object next : this.A0E.keySet()) {
            0qQ.A07(next);
            ((AnonymousClass8EL) next).A05();
        }
        AnonymousClass0fD.A0D(-913757868, A062);
    }
}
