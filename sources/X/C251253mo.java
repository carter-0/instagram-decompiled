package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.facebook.litho.ComponentTree;
import com.facebook.litho.LithoView;
import com.facebook.litho.widget.LithoScrollView;

/* renamed from: X.3mo  reason: invalid class name and case insensitive filesystem */
public abstract class C251253mo extends C251263mp implements C251273mq, C251223ml, C251233mm, C251283mr, C251293ms {
    public static final 2V5[] A03 = new 2V5[0];
    public 2TC A00;
    public String A01;
    public final String A02;

    public final boolean A0R(C251263mp r2) {
        return A18(r2, false);
    }

    public int A0X(2V1 r2, C70672Tq r3) {
        return 0;
    }

    public int A0Y(2V1 r2, C70672Tq r3, int i, int i2) {
        return AnonymousClass972.MUTABLE_FLAG_MASK;
    }

    public C251263mp A0a() {
        return null;
    }

    public C70672Tq A0d() {
        return null;
    }

    public C2814157n A0e() {
        return null;
    }

    public void A0i(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, 2V1 r3, C70672Tq r4) {
    }

    public void A0j(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, 2V1 r3, C70672Tq r4, int i, boolean z) {
    }

    public void A0k(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, 2V1 r2, C70672Tq r3, int i, int i2, int i3) {
    }

    public void A0l(2V1 r1) {
    }

    public void A0m(2V1 r1) {
    }

    public void A0o(2V1 r1) {
    }

    public void A0p(2V1 r1, AnonymousClass2V9 r2) {
    }

    public void A0s(2V1 r1, C70672Tq r2, Object obj) {
    }

    public void A0u(2V1 r1, C70672Tq r2, Object obj) {
    }

    public void A0y(C2814157n r1, C2814157n r2) {
    }

    public boolean A0z() {
        return false;
    }

    public boolean A10() {
        return false;
    }

    public boolean A11() {
        return false;
    }

    public boolean A12() {
        return false;
    }

    public boolean A13() {
        return false;
    }

    public boolean A14() {
        return false;
    }

    public boolean A15() {
        return false;
    }

    public boolean A16() {
        return false;
    }

    public boolean A17(Bundle bundle, View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, 2V1 r5, C70672Tq r6, int i, int i2) {
        return false;
    }

    public boolean AFh() {
        return false;
    }

    @Deprecated
    public final C251223ml B2H() {
        return this;
    }

    public int E2z() {
        return 3;
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:10:0x0058=Splitter:B:10:0x0058, B:22:0x009f=Splitter:B:22:0x009f} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C244533bL A0F(X.B0X r11, X.C243243Xz r12, X.2Vz r13, int r14, int r15) {
        /*
            r10 = this;
            java.lang.String r5 = "Litho.Resolve.ComponentRendered"
            java.lang.Integer r9 = X.2SN.A01(r5)
            X.3kJ r0 = com.facebook.litho.ComponentsSystrace.A00
            boolean r8 = r0.isTracing()
            X.2V1 r3 = r13.A04
            java.lang.Integer r1 = r10.A0G()
            java.lang.Integer r2 = X.AnonymousClass05K.A00
            r0 = 0
            if (r1 == r2) goto L_0x0018
            r0 = 1
        L_0x0018:
            java.lang.String r4 = "render:"
            java.lang.String r1 = "name"
            java.lang.String r7 = "component"
            if (r0 == 0) goto L_0x006a
            X.2TR r2 = new X.2TR
            r2.<init>()
            X.3Zl r0 = X.C243603Zl.COLUMN
            r2.A0U = r0
            if (r9 == 0) goto L_0x004b
            java.util.HashMap r6 = new java.util.HashMap
            r6.<init>()
            java.lang.String r0 = r10.A0J()
            r6.put(r7, r0)
            java.lang.String r0 = r10.A0J()
            r6.put(r1, r0)
            int r1 = r9.intValue()
            int r0 = r12.A06
            java.lang.String r0 = java.lang.String.valueOf(r0)
            X.2SN.A05(r5, r0, r6, r1)
        L_0x004b:
            if (r8 == 0) goto L_0x0058
            java.lang.String r0 = r10.A0J()
            java.lang.String r0 = X.002.A0R(r4, r0)
            com.facebook.litho.ComponentsSystrace.A02(r0)
        L_0x0058:
            r10.A0o(r3)     // Catch:{ all -> 0x00af }
            if (r8 == 0) goto L_0x0060
            com.facebook.litho.ComponentsSystrace.A01()
        L_0x0060:
            if (r9 == 0) goto L_0x00d9
            int r0 = r9.intValue()
            X.2SN.A02(r0)
            goto L_0x00d9
        L_0x006a:
            java.lang.Integer r0 = r10.A0G()
            if (r0 != r2) goto L_0x00bf
            if (r9 == 0) goto L_0x0092
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            java.lang.String r0 = r10.A0J()
            r2.put(r7, r0)
            java.lang.String r0 = r10.A0J()
            r2.put(r1, r0)
            int r1 = r9.intValue()
            int r0 = r12.A06
            java.lang.String r0 = java.lang.String.valueOf(r0)
            X.2SN.A05(r5, r0, r2, r1)
        L_0x0092:
            if (r8 == 0) goto L_0x009f
            java.lang.String r0 = r10.A0J()
            java.lang.String r0 = X.002.A0R(r4, r0)
            com.facebook.litho.ComponentsSystrace.A02(r0)
        L_0x009f:
            boolean r0 = X.C251263mp.A03(r10)     // Catch:{ all -> 0x00af }
            if (r0 == 0) goto L_0x00aa
            X.3mp r1 = r10.A0c(r3, r14, r15)     // Catch:{ all -> 0x00af }
            goto L_0x00c1
        L_0x00aa:
            X.3mp r1 = r10.A0b(r3)     // Catch:{ all -> 0x00af }
            goto L_0x00c1
        L_0x00af:
            r1 = move-exception
            if (r8 == 0) goto L_0x00b5
            com.facebook.litho.ComponentsSystrace.A01()
        L_0x00b5:
            if (r9 == 0) goto L_0x00be
            int r0 = r9.intValue()
            X.2SN.A02(r0)
        L_0x00be:
            throw r1
        L_0x00bf:
            r2 = 0
            goto L_0x00d9
        L_0x00c1:
            if (r8 == 0) goto L_0x00c6
            com.facebook.litho.ComponentsSystrace.A01()
        L_0x00c6:
            if (r9 == 0) goto L_0x00cf
            int r0 = r9.intValue()
            X.2SN.A02(r0)
        L_0x00cf:
            if (r1 == 0) goto L_0x00e1
            X.2TR r2 = X.AnonymousClass3Y0.A02(r1, r3, r12)
        L_0x00d5:
            if (r2 == 0) goto L_0x00d9
            int r0 = X.AnonymousClass3Y0.A00
        L_0x00d9:
            X.2TC r1 = r10.A00
            X.3bL r0 = new X.3bL
            r0.<init>(r1, r2)
            return r0
        L_0x00e1:
            X.3bM r2 = new X.3bM
            r2.<init>()
            goto L_0x00d5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C251253mo.A0F(X.B0X, X.3Xz, X.2Vz, int, int):X.3bL");
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.2TC, java.lang.Object] */
    public final 2TC A0Z() {
        2TC r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        ? obj = new Object();
        this.A00 = obj;
        return obj;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [X.2TB, java.lang.Object] */
    public 2TB A0f() {
        if (this instanceof C251353my) {
            return new Object();
        }
        throw new RuntimeException("createStateContainer has not been implemented!");
    }

    public Object A0g(2Sg r3, Object obj) {
        if (r3.A01 != -1048037474) {
            return null;
        }
        2V1 r0 = r3.A00.A00;
        r0.getClass();
        2Vz r02 = r0.A05;
        r02.getClass();
        2Sg r03 = r02.A01;
        r03.getClass();
        r03.A00(obj);
        return null;
    }

    public void A0h(int i, Object obj, Object obj2) {
        throw new RuntimeException("Components that have dynamic Props must override this method");
    }

    public void A0n(2V1 r10) {
        if (this instanceof C247403gH) {
            C247403gH r7 = (C247403gH) this;
            Drawable drawable = null;
            ImageView.ScaleType scaleType = null;
            ImageView.ScaleType[] scaleTypeArr = C247473gO.A00;
            TypedArray A022 = r10.A02(0, C55417HhN.A02);
            int indexCount = A022.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = A022.getIndex(i);
                if (index == 0) {
                    drawable = r10.A0C.getResources().getDrawable(A022.getResourceId(index, 0));
                } else if (index == 1) {
                    scaleType = C247473gO.A00[A022.getInteger(index, -1)];
                }
            }
            A022.recycle();
            if (drawable != null) {
                r7.A00 = drawable;
            }
            if (scaleType != null) {
                r7.A01 = scaleType;
            }
        }
    }

    public void A0q(2V1 r6, C70672Tq r7, AnonymousClass2T3 r8, 2Tc r9, int i, int i2) {
        if (this instanceof C247403gH) {
            C247403gH r0 = (C247403gH) this;
            Drawable drawable = r0.A00;
            boolean z = r0.A02;
            ImageView.ScaleType[] scaleTypeArr = C247473gO.A00;
            if (drawable == null || drawable.getIntrinsicWidth() <= 0 || drawable.getIntrinsicHeight() <= 0) {
                r8.A01 = 0;
                r8.A00 = 0;
                return;
            }
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int intrinsicWidth = drawable.getIntrinsicWidth();
            if (View.MeasureSpec.getMode(i) == 0 && View.MeasureSpec.getMode(i2) == 0) {
                r8.A01 = intrinsicWidth;
                r8.A00 = intrinsicHeight;
                return;
            }
            float f = ((float) intrinsicWidth) / ((float) intrinsicHeight);
            if (z) {
                0qQ.A0B(r8, 5);
                if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE && View.MeasureSpec.getSize(i) > intrinsicWidth) {
                    i = View.MeasureSpec.makeMeasureSpec(intrinsicWidth, AnonymousClass972.MUTABLE_FLAG_MASK);
                }
                if (View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE && View.MeasureSpec.getSize(i2) > intrinsicHeight) {
                    i2 = View.MeasureSpec.makeMeasureSpec(intrinsicHeight, AnonymousClass972.MUTABLE_FLAG_MASK);
                }
            }
            C253713rG.A01(r8, f, i, i2);
        } else if (this instanceof C251353my) {
            C251263mp r3 = ((C251353my) this).A03;
            ComponentTree A002 = C251353my.A00(r6);
            int A022 = r9.A02() + r9.A03();
            HSP.A00(r3, A002, r8, ViewGroup.getChildMeasureSpec(i, A022, -1), i2);
            Integer valueOf = Integer.valueOf(r8.A01 + A022);
            Integer valueOf2 = Integer.valueOf(r8.A00);
            IIJ iij = (IIJ) r7;
            iij.A01 = valueOf;
            iij.A00 = valueOf2;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("You must override onMeasure() if you return true in canMeasure(), Component is: ");
            sb.append(this);
            throw new IllegalStateException(sb.toString());
        }
    }

    public void A0r(2V1 r7, C70672Tq r8, 2Tc r9) {
        if (this instanceof C251353my) {
            C251263mp r5 = ((C251353my) this).A03;
            ComponentTree A002 = C251353my.A00(r7);
            Integer num = ((IIJ) r8).A01;
            int A05 = (r9.A05() - r9.A02()) - r9.A03();
            int A003 = (r9.A00() - r9.A04()) - r9.A01();
            if (num == null || num.intValue() != A05) {
                HSP.A00(r5, A002, (AnonymousClass2T3) null, View.MeasureSpec.makeMeasureSpec(A05, SN3.MAX_SIGNED_POWER_OF_TWO), View.MeasureSpec.makeMeasureSpec(A003, SN3.MAX_SIGNED_POWER_OF_TWO));
            }
        }
    }

    public void A0t(2V1 r13, C70672Tq r14, Object obj) {
        String str;
        03T gIg;
        if (this instanceof C247403gH) {
            Drawable drawable = ((C247403gH) this).A00;
            AnonymousClass2VX r1 = ((C247463gN) r14).A00;
            ImageView.ScaleType[] scaleTypeArr = C247473gO.A00;
            ((2Ul) obj).A03(drawable, r1);
        } else if (this instanceof C251353my) {
            C251353my r12 = (C251353my) this;
            2Vz r0 = r13.A05;
            r0.getClass();
            LithoScrollView lithoScrollView = (LithoScrollView) obj;
            boolean z = r12.A06;
            boolean z2 = r12.A07;
            boolean z3 = r12.A05;
            boolean z4 = r12.A09;
            int i = r12.A00;
            int i2 = r12.A02;
            JLU jlu = r12.A04;
            ComponentTree A002 = C251353my.A00(r13);
            GIM gim = r0.A02.A00;
            LithoView lithoView = lithoScrollView.A06;
            if (lithoView instanceof LithoView) {
                C251263mp A0E = A002.A0E();
                if (A0E != null) {
                    str = A0E.A0J();
                } else {
                    str = "null";
                }
                lithoScrollView.A05 = str;
                lithoScrollView.A04 = A002.A0V.A02.A01.A07;
                lithoView.A0k(A002, true);
                lithoScrollView.A02 = gim;
                if (2Sa.useOneShotPreDrawListener) {
                    gIg = 03T.A00(lithoScrollView, new C57807Igm(gim, lithoScrollView));
                } else {
                    gIg = new C52190GIg(gim, lithoScrollView);
                    lithoScrollView.getViewTreeObserver().addOnPreDrawListener(gIg);
                }
                lithoScrollView.A00 = gIg;
                lithoScrollView.setScrollbarFadingEnabled(z2);
                lithoScrollView.setNestedScrollingEnabled(z3);
                lithoScrollView.setVerticalFadingEdgeEnabled(z4);
                lithoScrollView.setFadingEdgeLength(i);
                lithoScrollView.setVerticalScrollBarEnabled(z);
                lithoScrollView.A0B = null;
                lithoScrollView.A01 = jlu;
                lithoScrollView.setOverScrollMode(i2);
                return;
            }
            throw new UnsupportedOperationException("API can only be invoked from Vertical Scroll Spec");
        }
    }

    public void A0v(2V1 r4, C70672Tq r5, Object obj) {
        if (this instanceof C251353my) {
            LithoScrollView lithoScrollView = (LithoScrollView) obj;
            lithoScrollView.A0B = null;
            lithoScrollView.A01 = null;
            LithoView lithoView = lithoScrollView.A06;
            if (lithoView instanceof LithoView) {
                lithoView.A0k((ComponentTree) null, false);
                lithoScrollView.A02 = null;
                lithoScrollView.getViewTreeObserver().removeOnPreDrawListener(lithoScrollView.A00);
                lithoScrollView.A00 = null;
                C55826Ho9 ho9 = lithoScrollView.A03;
                if (ho9 != null) {
                    ho9.A00 = null;
                    return;
                }
                return;
            }
            throw new UnsupportedOperationException("API can only be invoked from Vertical Scroll Spec");
        } else if (this instanceof C247403gH) {
            ImageView.ScaleType[] scaleTypeArr = C247473gO.A00;
            ((2Ul) obj).A01();
        }
    }

    public void A0w(2V1 r3, 2TB r4) {
        if (this instanceof C251353my) {
            int i = ((C251353my) this).A01;
            GIM gim = new GIM();
            gim.A00 = i;
            ((C54004Gxm) r4).A00 = gim;
        }
    }

    public void A0x(C70672Tq r2, C70672Tq r3) {
        if (this instanceof C247403gH) {
            C247463gN r22 = (C247463gN) r2;
            C247463gN r32 = (C247463gN) r3;
            r22.A01 = r32.A01;
            r22.A00 = r32.A00;
            r22.A02 = r32.A02;
        } else if (this instanceof C251353my) {
            IIJ iij = (IIJ) r2;
            IIJ iij2 = (IIJ) r3;
            iij.A00 = iij2.A00;
            iij.A01 = iij2.A01;
        }
    }

    public boolean A18(C251263mp r4, boolean z) {
        boolean z2;
        boolean z3;
        if (this instanceof C251353my) {
            C251353my r2 = (C251353my) this;
            if (r2 == r4) {
                return true;
            }
            if (r4 == null || r2.getClass() != r4.getClass()) {
                return false;
            }
            C251353my r42 = (C251353my) r4;
            C251263mp r1 = r2.A03;
            C251263mp r0 = r42.A03;
            if (r1 != null) {
                if (!2Vb.A04(r1, r0, z)) {
                    return false;
                }
            } else if (r0 != null) {
                return false;
            }
            if (r2.A00 != r42.A00 || r2.A01 != r42.A01 || r2.A05 != r42.A05) {
                return false;
            }
            JLU jlu = r2.A04;
            JLU jlu2 = r42.A04;
            if (jlu != null) {
                if (!jlu.equals(jlu2)) {
                    return false;
                }
            } else if (jlu2 != null) {
                return false;
            }
            if (r2.A02 != r42.A02 || r2.A06 != r42.A06 || r2.A07 != r42.A07 || z != r42.A08) {
                return false;
            }
            z2 = r2.A09;
            z3 = r42.A09;
        } else if (!(this instanceof C247403gH)) {
            return super.A0R(r4);
        } else {
            C247403gH r22 = (C247403gH) this;
            if (r22 == r4) {
                return true;
            }
            if (r4 == null || r22.getClass() != r4.getClass()) {
                return false;
            }
            C247403gH r43 = (C247403gH) r4;
            Drawable drawable = r22.A00;
            Drawable drawable2 = r43.A00;
            if (drawable != null) {
                if (!drawable.equals(drawable2)) {
                    return false;
                }
            } else if (drawable2 != null) {
                return false;
            }
            ImageView.ScaleType scaleType = r22.A01;
            ImageView.ScaleType scaleType2 = r43.A01;
            if (scaleType != null) {
                if (!scaleType.equals(scaleType2)) {
                    return false;
                }
            } else if (scaleType2 != null) {
                return false;
            }
            z2 = r22.A02;
            z3 = r43.A02;
        }
        if (z2 != z3) {
            return false;
        }
        return true;
    }

    public 2V5[] A19() {
        return A03;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0049, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        r0 = r7.A00.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004e, code lost:
        if (r0 != null) goto L_0x0050;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0050, code lost:
        X.2Vb.A03(r0, r1);
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005c, code lost:
        if (r5 != false) goto L_0x005e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005e, code lost:
        com.facebook.litho.ComponentsSystrace.A01();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0061, code lost:
        throw r0;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:4:0x0028, B:8:0x0044] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object APh(X.2Sg r7, java.lang.Object r8) {
        /*
            r6 = this;
            X.3kJ r0 = com.facebook.litho.ComponentsSystrace.A00
            boolean r5 = r0.isTracing()
            int r1 = r7.A01
            r0 = -1048037474(0xffffffffc188379e, float:-17.027157)
            java.lang.String r4 = ")"
            java.lang.String r3 = "("
            if (r1 != r0) goto L_0x002d
            if (r5 == 0) goto L_0x0028
            java.lang.String r2 = "onError:"
            java.lang.String r1 = r6.A0J()
            java.lang.Class r0 = r8.getClass()
            java.lang.String r0 = X.AnonymousClass3XB.A00(r0)
            java.lang.String r0 = X.002.A11(r2, r1, r3, r0, r4)
            com.facebook.litho.ComponentsSystrace.A02(r0)
        L_0x0028:
            java.lang.Object r0 = r6.A0g(r7, r8)     // Catch:{ all -> 0x005b }
            goto L_0x0054
        L_0x002d:
            if (r5 == 0) goto L_0x0044
            java.lang.String r2 = "onEvent:"
            java.lang.String r1 = r6.A0J()
            java.lang.Class r0 = r8.getClass()
            java.lang.String r0 = X.AnonymousClass3XB.A00(r0)
            java.lang.String r0 = X.002.A11(r2, r1, r3, r0, r4)
            com.facebook.litho.ComponentsSystrace.A02(r0)
        L_0x0044:
            java.lang.Object r0 = r6.A0g(r7, r8)     // Catch:{ Exception -> 0x0049 }
            goto L_0x0054
        L_0x0049:
            r1 = move-exception
            X.2Si r0 = r7.A00     // Catch:{ all -> 0x005b }
            X.2V1 r0 = r0.A00     // Catch:{ all -> 0x005b }
            if (r0 == 0) goto L_0x005a
            X.2Vb.A03(r0, r1)     // Catch:{ all -> 0x005b }
            r0 = 0
        L_0x0054:
            if (r5 == 0) goto L_0x0059
            com.facebook.litho.ComponentsSystrace.A01()
        L_0x0059:
            return r0
        L_0x005a:
            throw r1     // Catch:{ all -> 0x005b }
        L_0x005b:
            r0 = move-exception
            if (r5 == 0) goto L_0x0061
            com.facebook.litho.ComponentsSystrace.A01()
        L_0x0061:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C251253mo.APh(X.2Sg, java.lang.Object):java.lang.Object");
    }

    public /* synthetic */ 2Sd Bdg() {
        return C243983aS.A00;
    }

    public C251253mo(String str) {
        this.A02 = str;
    }

    public final String A0J() {
        C251263mp A0a = A0a();
        if (A0a == null) {
            return this.A02;
        }
        String str = this.A02;
        while (A0a instanceof C251253mo) {
            C251253mo r1 = (C251253mo) A0a;
            if (r1.A0a() == null) {
                break;
            }
            A0a = r1.A0a();
        }
        return 002.A0u(str, "(", A0a.A0J(), ")");
    }

    public C251263mp A0b(2V1 r2) {
        return GOJ.A00(r2).A00;
    }

    public C251263mp A0c(2V1 r2, int i, int i2) {
        return GOJ.A00(r2).A00;
    }

    public final Object ALg(Context context) {
        Object A0I = A0I(context);
        if (A0I != null) {
            return A0I;
        }
        throw new RuntimeException(002.A0R("Component created null mount content, but mount content must never be null! Component: ", A0J()));
    }

    public final Object Bdd() {
        return getClass();
    }

    public final Integer Bln() {
        Integer A0G = A0G();
        Integer num = AnonymousClass05K.A01;
        if (A0G == num) {
            return AnonymousClass05K.A00;
        }
        return num;
    }

    public 2Ue D6k(int i) {
        return new 2Ud(getClass(), i);
    }
}
