package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.cameratoolmenu.CameraToolMenuItem;
import java.util.EnumMap;
import java.util.LinkedHashMap;

/* renamed from: X.8EP  reason: invalid class name */
public final class AnonymousClass8EP {
    public C358088aL A00;
    public AnonymousClass9Y0 A01;
    public boolean A02;
    public CameraToolMenuItem A03;
    public boolean A04;
    public final ViewGroup A05;
    public final 2cs A06 = AnonymousClass8EF.A00(new AnonymousClass8EQ(this), 3.0d, 15.0d);
    public final UserSession A07;
    public final AnonymousClass8EM A08;
    public final boolean A09;
    public final AnonymousClass8E8 A0A;
    public final EnumMap A0B = new EnumMap(C358088aL.class);

    /* JADX WARNING: type inference failed for: r2v1, types: [X.0rl, java.lang.Object] */
    public final void A01(C358088aL r7) {
        C3495480u ayu;
        C3494680m A012;
        0qQ.A0B(r7, 0);
        LinkedHashMap cameraToolMenuItemMap = this.A08.getCameraToolMenuItemMap();
        C358088aL r4 = C358088aL.A0y;
        if (r7 == r4) {
            ? obj = new Object();
            obj.A00 = -1;
            ayu = new C338907ij(r7, this, cameraToolMenuItemMap, obj);
            EnumMap enumMap = this.A0A.A03.A0D;
            A012 = (C3494680m) enumMap.get(r4);
            if (A012 == null) {
                A012 = new C3494680m(Long.valueOf(C352618Eb.A02(r4)));
                enumMap.put(r4, A012);
            }
        } else if (r7 == C358088aL.A0u) {
            ayu = new AYU(r7, this, cameraToolMenuItemMap);
            A012 = C357638Yz.A01(r7, this.A0A.A03);
        } else if (C352618Eb.A01(r7) == 1) {
            EnumMap enumMap2 = this.A0B;
            if (!enumMap2.containsKey(r7)) {
                C352638Ed r1 = new C352638Ed(r7, this, cameraToolMenuItemMap);
                C357638Yz.A00(r7, this.A0A.A03).A01(r1);
                enumMap2.put(r7, r1);
                return;
            }
            return;
        } else {
            return;
        }
        A012.A01(ayu);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: X.U4r} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: X.U6z} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: X.U4r} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: X.U4r} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0093  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A03(X.C358088aL r23, com.instagram.creation.capture.quickcapture.cameratoolmenu.CameraToolMenuItem r24) {
        /*
            r22 = this;
            r6 = 0
            r8 = r23
            X.0qQ.A0B(r8, r6)
            r5 = 1
            r7 = r24
            X.0qQ.A0B(r7, r5)
            r9 = r22
            r9.A03 = r7
            com.instagram.common.session.UserSession r12 = r9.A07
            int r2 = X.C352618Eb.A01(r8)
            r1 = 0
            if (r2 == r5) goto L_0x00d9
            r0 = 2
            if (r2 != r0) goto L_0x00a7
            X.8EM r2 = r9.A08
            java.util.Set r0 = r2.getSelectedCameraTools()
            r0.contains(r8)
            android.content.Context r4 = r7.getContext()
            X.0qQ.A07(r4)
            r1 = 0
            X.U6z r3 = new X.U6z
            r3.<init>(r4, r8)
            X.WUM r0 = new X.WUM
            r0.<init>(r8, r9)
            r3.A00 = r0
            X.A3b r0 = r2.Brs(r8)
            if (r0 == 0) goto L_0x0042
            r3.setSecondarySliderValues(r0)
        L_0x0042:
            android.graphics.drawable.Drawable r0 = r7.A05
            if (r0 != 0) goto L_0x004a
            android.graphics.drawable.Drawable r0 = r7.A04
            if (r0 == 0) goto L_0x004e
        L_0x004a:
            android.graphics.drawable.Drawable r1 = r0.mutate()
        L_0x004e:
            r3.setToolDrawable(r1)
        L_0x0051:
            X.9Y0 r1 = r9.A01
            if (r1 == 0) goto L_0x005f
            android.view.ViewGroup r0 = r9.A05
            r0.removeView(r1)
            r0 = 0
            r9.A01 = r0
            r9.A00 = r0
        L_0x005f:
            X.2cs r10 = r9.A06
            r0 = 0
            r10.A08(r0, r5)
            X.9Y0 r0 = r9.A01
            if (r0 != 0) goto L_0x0074
            X.0qQ.A07(r4)
            X.9Y0 r0 = new X.9Y0
            r0.<init>(r4)
            r9.A01 = r0
        L_0x0074:
            r0.setSecondaryMenu(r3)
            boolean r0 = r9.A09
            if (r0 == 0) goto L_0x00a8
            X.9Y0 r2 = r9.A01
            if (r2 == 0) goto L_0x0085
            r0 = 2131099702(0x7f060036, float:1.7811765E38)
        L_0x0082:
            r2.setSecondaryMenuBackgroundColor(r0)
        L_0x0085:
            android.view.View r3 = (android.view.View) r3
            X.AM8 r0 = new X.AM8
            r0.<init>(r9)
            X.AnonymousClass0fU.A00(r0, r3)
            X.9Y0 r1 = r9.A01
            if (r1 == 0) goto L_0x0098
            java.lang.CharSequence r0 = r7.A08
            X.03v.A0F(r1, r0)
        L_0x0098:
            r9.A00 = r8
            android.view.ViewGroup r1 = r9.A05
            X.9Y0 r0 = r9.A01
            r1.addView(r0)
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r10.A06(r0)
        L_0x00a6:
            r1 = 1
        L_0x00a7:
            return r1
        L_0x00a8:
            boolean r0 = r9.A02
            android.view.View r1 = r2.getCameraToolMenuShadow()
            if (r0 == 0) goto L_0x00ca
            if (r1 == 0) goto L_0x00b5
            r1.setVisibility(r6)
        L_0x00b5:
            X.9Y0 r2 = r9.A01
            if (r2 == 0) goto L_0x0085
            android.view.ViewGroup r0 = r9.A05
            android.content.Context r1 = r0.getContext()
            X.0qQ.A07(r1)
            r0 = 2130970185(0x7f040649, float:1.7549073E38)
            int r0 = X.2Yu.A0H(r1, r0)
            goto L_0x0082
        L_0x00ca:
            if (r1 == 0) goto L_0x00d1
            r0 = 8
            r1.setVisibility(r0)
        L_0x00d1:
            X.9Y0 r2 = r9.A01
            if (r2 == 0) goto L_0x0085
            r0 = 2131100470(0x7f060336, float:1.7813322E38)
            goto L_0x0082
        L_0x00d9:
            java.util.List r0 = X.C347067wD.A01(r12, r8)
            int r1 = r0.size()
            r2 = 1
            r0 = 2
            if (r1 <= r0) goto L_0x0186
            boolean r11 = r9.A09
            r20 = 2
            if (r11 == 0) goto L_0x00ed
            r20 = 3
        L_0x00ed:
            android.content.Context r4 = r7.getContext()
            r9.A00 = r8
            X.0qQ.A0A(r4)
            X.U4r r3 = new X.U4r
            r3.<init>(r4)
            android.content.res.Resources r1 = r4.getResources()
            r0 = 2131165250(0x7f070042, float:1.7944712E38)
            int r17 = r1.getDimensionPixelSize(r0)
            android.content.res.Resources r0 = r4.getResources()
            r10 = 2131165195(0x7f07000b, float:1.79446E38)
            int r18 = r0.getDimensionPixelSize(r10)
            X.8EM r2 = r9.A08
            int r19 = r2.Bro(r8)
            X.VMt r1 = new X.VMt
            r1.<init>(r9)
            X.ViS r0 = new X.ViS
            r21 = r11
            r14 = r12
            r15 = r8
            r16 = r1
            r13 = r4
            r12 = r0
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21)
            r3.A00 = r0
            r16 = 0
            r14 = 0
            java.util.List r1 = r0.A09
            int r13 = r1.size()
        L_0x0134:
            if (r14 >= r13) goto L_0x0051
            X.VaS r1 = r0.A00(r14)
            if (r1 == 0) goto L_0x0183
            X.U4V r12 = r1.A04
            int r15 = r3.A02
            android.widget.FrameLayout$LayoutParams r1 = new android.widget.FrameLayout$LayoutParams
            r1.<init>(r15, r15)
            r12.setLayoutParams(r1)
        L_0x0148:
            if (r11 == 0) goto L_0x0163
            if (r12 == 0) goto L_0x0180
            android.view.ViewGroup$LayoutParams r15 = r12.getLayoutParams()
        L_0x0150:
            boolean r1 = r15 instanceof android.widget.FrameLayout.LayoutParams
            if (r1 == 0) goto L_0x0163
            android.view.ViewGroup$MarginLayoutParams r15 = (android.view.ViewGroup.MarginLayoutParams) r15
            if (r15 == 0) goto L_0x0163
            android.content.res.Resources r1 = r3.getResources()
            int r1 = r1.getDimensionPixelOffset(r10)
            r15.setMargins(r1, r1, r1, r1)
        L_0x0163:
            r3.addView(r12)
            X.VaS r1 = r0.A00(r14)
            if (r1 == 0) goto L_0x017d
            int r1 = r1.A03
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            if (r1 == 0) goto L_0x017d
            if (r12 == 0) goto L_0x017d
            int r1 = r1.intValue()
            r12.setIcon(r1)
        L_0x017d:
            int r14 = r14 + 1
            goto L_0x0134
        L_0x0180:
            r15 = r16
            goto L_0x0150
        L_0x0183:
            r12 = r16
            goto L_0x0148
        L_0x0186:
            if (r1 != r0) goto L_0x00a6
            r9.A00 = r8
            X.8EM r1 = r9.A08
            int r0 = r1.Bro(r8)
            if (r0 == 0) goto L_0x0193
            r2 = 0
        L_0x0193:
            r1.Di7(r8, r2)
            goto L_0x00a6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8EP.A03(X.8aL, com.instagram.creation.capture.quickcapture.cameratoolmenu.CameraToolMenuItem):boolean");
    }

    public final void A00() {
        View cameraToolMenuShadow = this.A08.getCameraToolMenuShadow();
        if (cameraToolMenuShadow != null) {
            cameraToolMenuShadow.setVisibility(8);
        }
        if (this.A01 != null) {
            this.A06.A06(0.0d);
        }
    }

    public final void A02(CameraToolMenuItem cameraToolMenuItem, double d, float f, float f2) {
        int BlJ;
        float f3;
        ViewGroup viewGroup = this.A05;
        Context context = viewGroup.getContext();
        0qQ.A07(context);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.abc_button_inset_vertical_material);
        AnonymousClass9Y0 r4 = this.A01;
        if (r4 != null) {
            AnonymousClass8EM r1 = this.A08;
            r4.setY(r1.Bqg(cameraToolMenuItem));
            if (d > 0.5d) {
                r4.setIsOnRightSide(true);
                BlJ = (r1.BlJ(cameraToolMenuItem) + cameraToolMenuItem.getWidth()) - r4.getWidth();
                C358088aL r0 = this.A00;
                if (r0 != null && C352618Eb.A01(r0) == 1) {
                    BlJ += dimensionPixelSize;
                }
            } else if (d == 0.5d) {
                BlJ = (viewGroup.getWidth() - r4.getWidth()) / 2;
            } else {
                BlJ = r1.BlJ(cameraToolMenuItem);
                C358088aL r02 = this.A00;
                if (r02 != null && C352618Eb.A01(r02) == 1) {
                    BlJ -= dimensionPixelSize;
                }
            }
            r4.setTranslationX((float) BlJ);
            2cs r7 = this.A06;
            float f4 = (float) r7.A09.A00;
            float A022 = 0mi.A02(f4, 0.0f, 0.05f * 3.0f, 0.0f, 1.0f);
            float A023 = 0mi.A02(f4, 0.2f, 1.0f, 0.0f, 1.0f);
            r4.A00(A023);
            if (A023 == 1.0f) {
                2eQ.A02(this.A01);
                this.A04 = true;
            } else if (A023 == 0.0f && this.A04) {
                CameraToolMenuItem cameraToolMenuItem2 = this.A03;
                if (cameraToolMenuItem2 != null) {
                    2eQ.A02(cameraToolMenuItem2);
                }
                this.A03 = null;
                this.A04 = false;
            }
            if (r7.A01 == 1.0d) {
                f3 = 1.0f - A022;
            } else {
                f3 = 1.0f - A023;
            }
            if (f2 > f3) {
                f2 = f3;
            }
            if (f > f2) {
                f = f2;
            }
            if (f < 0.01f) {
                f = 0.01f;
            }
            cameraToolMenuItem.setAlpha(f);
        }
    }

    public AnonymousClass8EP(ViewGroup viewGroup, UserSession userSession, AnonymousClass8E8 r8, AnonymousClass8EM r9, boolean z) {
        this.A05 = viewGroup;
        this.A07 = userSession;
        this.A0A = r8;
        this.A08 = r9;
        this.A09 = z;
    }
}
