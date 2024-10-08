package com.facebook.rtc.views.omnigridview;

import X.00k;
import X.0eP;
import X.0fh;
import X.0k0;
import X.0qQ;
import X.0sn;
import X.AnonymousClass00P;
import X.AnonymousClass05K;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C15048ULb;
import X.C249703kE;
import X.C51966G9m;
import X.C61059Jvx;
import X.C66580MXl;
import X.C67672Ms8;
import X.C67815MvJ;
import X.C67819MvN;
import X.C67837Mvh;
import X.C68056MzN;
import X.C68152N2s;
import X.C68166N3g;
import X.C68183N3y;
import X.C69663Npl;
import X.C70982OUv;
import X.C74227PrG;
import X.C74228PrH;
import X.JTO;
import X.JTT;
import X.N3V;
import X.N48;
import X.NE9;
import X.ODG;
import X.OSV;
import X.ULT;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.common.draggableview.DraggableViewContainer;
import com.facebook.rtc.views.omnigrid.GridItemType;
import com.facebook.rtc.views.omnigrid.OmniGridLayoutManager;
import com.facebook.rtc.views.omnigrid.OmniGridRecyclerView;
import com.instagram.android.R;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

public class OmniGridView extends FrameLayout implements C74227PrG {
    public View.OnTouchListener A00;
    public View A01;
    public C61059Jvx A02;
    public C68056MzN A03;
    public C68183N3y A04;
    public NE9 A05;
    public C74228PrH A06;
    public OmniGridView A07;
    public ODG A08;
    public N3V A09;
    public List A0A;
    public boolean A0B;
    public boolean A0C;
    public C67815MvJ A0D;
    public Map A0E;
    public boolean A0F;
    public final RecyclerView A0G;
    public final DraggableViewContainer A0H;
    public final OmniGridLayoutManager A0I;
    public final C67819MvN A0J;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public OmniGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        0qQ.A0B(context, 1);
    }

    public static final int A00(float f, float f2, int i) {
        float f3 = (float) i;
        float f4 = f3 - f;
        return (int) (f2 >= 1.0f ? f3 + (f4 * (f2 - 1.0f)) : f3 - (f4 * (1.0f - f2)));
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        0qQ.A0B(motionEvent, 0);
        View.OnTouchListener onTouchListener = this.A00;
        if (onTouchListener != null) {
            return onTouchListener.onTouch(this, motionEvent);
        }
        return false;
    }

    public final void setItemDefinitions(Map map, ODG odg) {
        Throwable th;
        Object obj;
        0qQ.A0B(map, 0);
        0fh.A01("OmniGridView.setItemDefinitions", 211195229);
        try {
            if (this.A0D == null) {
                Iterator A0v = AnonymousClass7TF.A0v(map);
                do {
                    obj = null;
                    if (!A0v.hasNext()) {
                        break;
                    }
                    obj = A0v.next();
                } while (!(((C69663Npl) obj) instanceof NE9));
                C69663Npl npl = (C69663Npl) obj;
                if (npl != null) {
                    if (odg == null) {
                        Resources A0B2 = C66580MXl.A0B(this);
                        C61059Jvx jvx = OSV.A01;
                        odg = new ODG(AnonymousClass7TE.A0F(A0B2), A0B2.getDimensionPixelSize(R.dimen.abc_dialog_padding_top_material), A0B2.getDimensionPixelSize(R.dimen.abc_dialog_padding_material));
                    }
                    this.A08 = odg;
                    this.A0E = map;
                    this.A05 = (NE9) npl;
                    C67815MvJ mvJ = new C67815MvJ(map);
                    this.A0D = mvJ;
                    mvJ.setHasStableIds(true);
                    RecyclerView recyclerView = this.A0G;
                    C67815MvJ mvJ2 = this.A0D;
                    if (mvJ2 == null) {
                        0qQ.A0F("gridAdapter");
                        th = AnonymousClass00P.createAndThrow();
                    } else {
                        recyclerView.setAdapter(mvJ2);
                        return;
                    }
                } else {
                    th = AnonymousClass7TE.A0z("Self Item definition is required but not found!");
                }
            } else {
                th = AnonymousClass7TE.A0z("Do not call setItemDefinitions more than once!");
            }
            throw th;
        } finally {
            0fh.A00(-1421047832);
        }
    }

    private final Long A01() {
        Object obj;
        Iterator A1H = C51966G9m.A1H(this.A02.A05);
        while (true) {
            if (!A1H.hasNext()) {
                obj = null;
                break;
            }
            obj = A1H.next();
            if (((C68166N3g) obj).A03 == GridItemType.SELF_VIEW) {
                break;
            }
        }
        C68166N3g n3g = (C68166N3g) obj;
        if (n3g != null) {
            return Long.valueOf(n3g.A02);
        }
        return null;
    }

    public static final void A02(OmniGridView omniGridView, int i) {
        int i2;
        C68056MzN mzN;
        int i3;
        Integer num;
        int i4;
        0fh.A01("OmniGridView.updateRoundedCornerForLayoutPosition", 290118795);
        try {
            C249703kE A0X = omniGridView.A0G.A0X(i, false);
            if (!(A0X instanceof C68056MzN) || (mzN = (C68056MzN) A0X) == null) {
                i2 = -442241196;
            } else {
                N48 n48 = omniGridView.A0I.A07;
                Integer num2 = n48.A08;
                if (num2 != null) {
                    i3 = num2.intValue();
                } else {
                    ODG odg = omniGridView.A08;
                    if (odg == null) {
                        0qQ.A0F("gridViewParameters");
                        throw AnonymousClass00P.createAndThrow();
                    }
                    i3 = odg.A01;
                }
                Integer num3 = ((C68152N2s) n48.A09.get(i)).A04;
                if (i3 <= 0 || num3 == AnonymousClass05K.A0C) {
                    mzN.A01(AnonymousClass05K.A00);
                } else {
                    Integer num4 = AnonymousClass05K.A00;
                    if (num3 != num4 || ((Integer) omniGridView.A02.A03) == null) {
                        num = AnonymousClass05K.A01;
                    } else {
                        num = num4;
                    }
                    Integer num5 = (Integer) omniGridView.A02.A03;
                    if (num5 != null) {
                        i4 = num5.intValue();
                    } else {
                        i4 = -1;
                    }
                    mzN.A02(num, num4, i3, i4);
                }
                i2 = 268091002;
            }
            0fh.A00(i2);
        } catch (Throwable th) {
            0fh.A00(-328056445);
            throw th;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: X.N3y} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v9, resolved type: X.Nis} */
    /* JADX WARNING: type inference failed for: r11v0 */
    /* JADX WARNING: type inference failed for: r11v10 */
    /* JADX WARNING: type inference failed for: r11v14 */
    /* JADX WARNING: type inference failed for: r11v15 */
    /* JADX WARNING: type inference failed for: r11v16 */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0079, code lost:
        if (((double) ((X.C68152N2s) r2.get(r6)).A02.A00(r4.A1a())) >= 0.25d) goto L_0x007c;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A03(com.facebook.rtc.views.omnigridview.OmniGridView r28, boolean r29) {
        /*
            java.lang.String r1 = "OmniGridView.updateFloatingSelfView"
            r0 = -11129786(0xffffffffff562c46, float:-2.8468467E38)
            X.0fh.A01(r1, r0)
            java.lang.String r1 = "OmniGridView.generateFloatingSelfViewState"
            r0 = 1418285120(0x54895040, float:4.7180551E12)
            X.0fh.A01(r1, r0)     // Catch:{ all -> 0x037e }
            r0 = r28
            X.Jvx r1 = r0.A02     // Catch:{ all -> 0x0371 }
            java.lang.Object r1 = r1.A05     // Catch:{ all -> 0x0371 }
            java.util.Iterator r4 = X.C51966G9m.A1H(r1)     // Catch:{ all -> 0x0371 }
            r7 = 0
            r6 = 0
        L_0x001c:
            boolean r1 = r4.hasNext()     // Catch:{ all -> 0x0371 }
            r3 = -1
            if (r1 == 0) goto L_0x007c
            java.lang.Object r1 = r4.next()     // Catch:{ all -> 0x0371 }
            X.N3g r1 = (X.C68166N3g) r1     // Catch:{ all -> 0x0371 }
            com.facebook.rtc.views.omnigrid.GridItemType r2 = r1.A03     // Catch:{ all -> 0x0371 }
            com.facebook.rtc.views.omnigrid.GridItemType r1 = com.facebook.rtc.views.omnigrid.GridItemType.SELF_VIEW     // Catch:{ all -> 0x0371 }
            if (r2 != r1) goto L_0x0030
            goto L_0x0033
        L_0x0030:
            int r6 = r6 + 1
            goto L_0x001c
        L_0x0033:
            if (r6 == r3) goto L_0x007c
            com.facebook.rtc.views.omnigrid.OmniGridLayoutManager r4 = r0.A0I     // Catch:{ all -> 0x0371 }
            X.N48 r5 = r4.A07     // Catch:{ all -> 0x0371 }
            java.lang.Integer r3 = r5.A06     // Catch:{ all -> 0x0371 }
            X.Jvx r1 = r0.A02     // Catch:{ all -> 0x0371 }
            java.lang.Object r2 = r1.A02     // Catch:{ all -> 0x0371 }
            X.N3V r2 = (X.N3V) r2     // Catch:{ all -> 0x0371 }
            java.lang.Object r1 = r1.A01     // Catch:{ all -> 0x0371 }
            X.JwM r1 = (X.C61084JwM) r1     // Catch:{ all -> 0x0371 }
            if (r1 != 0) goto L_0x007c
            java.lang.Integer r2 = r2.A06     // Catch:{ all -> 0x0371 }
            java.lang.Integer r1 = X.AnonymousClass05K.A00     // Catch:{ all -> 0x0371 }
            if (r2 == r1) goto L_0x007c
            java.lang.Integer r1 = X.AnonymousClass05K.A0C     // Catch:{ all -> 0x0371 }
            if (r3 == r1) goto L_0x007b
            java.lang.Integer r1 = X.AnonymousClass05K.A01     // Catch:{ all -> 0x0371 }
            if (r3 != r1) goto L_0x007c
            int r2 = r5.A04     // Catch:{ all -> 0x0371 }
            r1 = 2
            if (r2 != r1) goto L_0x007c
            java.util.List r2 = r5.A09     // Catch:{ all -> 0x0371 }
            if (r6 < 0) goto L_0x007b
            int r1 = r2.size()     // Catch:{ all -> 0x0371 }
            if (r6 >= r1) goto L_0x007b
            java.lang.Object r1 = r2.get(r6)     // Catch:{ all -> 0x0371 }
            X.N2s r1 = (X.C68152N2s) r1     // Catch:{ all -> 0x0371 }
            X.ULb r2 = r1.A02     // Catch:{ all -> 0x0371 }
            X.ULb r1 = r4.A1a()     // Catch:{ all -> 0x0371 }
            float r1 = r2.A00(r1)     // Catch:{ all -> 0x0371 }
            double r4 = (double) r1     // Catch:{ all -> 0x0371 }
            r2 = 4598175219545276416(0x3fd0000000000000, double:0.25)
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 >= 0) goto L_0x007c
        L_0x007b:
            r7 = 1
        L_0x007c:
            r11 = 0
            if (r7 != 0) goto L_0x0081
            goto L_0x0161
        L_0x0081:
            X.Jvx r1 = r0.A02     // Catch:{ all -> 0x0371 }
            java.lang.Object r4 = r1.A02     // Catch:{ all -> 0x0371 }
            X.N3V r4 = (X.N3V) r4     // Catch:{ all -> 0x0371 }
            com.facebook.rtc.views.omnigrid.OmniGridLayoutManager r1 = r0.A0I     // Catch:{ all -> 0x0371 }
            X.N48 r9 = r1.A07     // Catch:{ all -> 0x0371 }
            com.facebook.rtc.views.omnigrid.GridSelfViewLocation r1 = r9.A05     // Catch:{ all -> 0x0371 }
            int r2 = r1.ordinal()     // Catch:{ all -> 0x0371 }
            r1 = 1
            if (r2 == r1) goto L_0x00a6
            r1 = 2
            if (r2 == r1) goto L_0x00a3
            r1 = 3
            if (r2 == r1) goto L_0x00a9
            r1 = 0
            if (r2 == r1) goto L_0x00ab
            X.Wub r0 = X.AnonymousClass7TE.A1K()     // Catch:{ all -> 0x0371 }
            goto L_0x0370
        L_0x00a3:
            X.Nis r11 = X.C69292Nis.TOP_RIGHT     // Catch:{ all -> 0x0371 }
            goto L_0x00ab
        L_0x00a6:
            X.Nis r11 = X.C69292Nis.TOP_LEFT     // Catch:{ all -> 0x0371 }
            goto L_0x00ab
        L_0x00a9:
            X.Nis r11 = X.C69292Nis.BOTTOM_RIGHT     // Catch:{ all -> 0x0371 }
        L_0x00ab:
            java.lang.Integer r10 = r4.A06     // Catch:{ all -> 0x0371 }
            int r5 = r0.getWidth()     // Catch:{ all -> 0x0371 }
            int r3 = r0.getHeight()     // Catch:{ all -> 0x0371 }
            float r7 = r4.A01     // Catch:{ all -> 0x0371 }
            java.lang.Integer r1 = r9.A07     // Catch:{ all -> 0x0371 }
            int r1 = r1.intValue()     // Catch:{ all -> 0x0371 }
            r2 = 0
            r8 = 1
            if (r1 == r8) goto L_0x00d9
            if (r1 != r2) goto L_0x036c
            float r5 = r4.A00     // Catch:{ all -> 0x0371 }
            int r3 = r0.getWidth()     // Catch:{ all -> 0x0371 }
            int r1 = r0.getHeight()     // Catch:{ all -> 0x0371 }
            if (r3 < r1) goto L_0x00d4
            float r6 = (float) r3     // Catch:{ all -> 0x0371 }
            float r6 = r6 * r7
            float r7 = r5 * r6
            goto L_0x00e0
        L_0x00d4:
            float r1 = (float) r1     // Catch:{ all -> 0x0371 }
            float r7 = r7 * r1
            float r6 = r5 * r7
            goto L_0x00e0
        L_0x00d9:
            int r1 = java.lang.Math.min(r5, r3)     // Catch:{ all -> 0x0371 }
            float r6 = (float) r1     // Catch:{ all -> 0x0371 }
            float r6 = r6 * r7
            r7 = r6
        L_0x00e0:
            int r5 = r10.intValue()     // Catch:{ all -> 0x0371 }
            r3 = 1065353216(0x3f800000, float:1.0)
            if (r5 == r2) goto L_0x0101
            if (r5 == r8) goto L_0x00f9
            r1 = 2
            if (r5 == r1) goto L_0x0102
            r1 = 3
            if (r5 != r1) goto L_0x00f3
            r3 = 1069547520(0x3fc00000, float:1.5)
            goto L_0x0102
        L_0x00f3:
            X.Wub r0 = X.AnonymousClass7TE.A1K()     // Catch:{ all -> 0x0371 }
            goto L_0x0370
        L_0x00f9:
            boolean r1 = r9.A0A     // Catch:{ all -> 0x0371 }
            if (r1 == 0) goto L_0x0102
            r3 = 1057568588(0x3f09374c, float:0.536)
            goto L_0x0102
        L_0x0101:
            r3 = 0
        L_0x0102:
            float r6 = r6 * r3
            int r12 = (int) r6     // Catch:{ all -> 0x0371 }
            float r7 = r7 * r3
            int r13 = (int) r7     // Catch:{ all -> 0x0371 }
            X.Npt r3 = r4.A03     // Catch:{ all -> 0x0371 }
            android.content.Context r1 = r0.getContext()     // Catch:{ all -> 0x0371 }
            X.0qQ.A07(r1)     // Catch:{ all -> 0x0371 }
            int r14 = r3.A01()     // Catch:{ all -> 0x0371 }
            X.Npt r1 = r4.A05     // Catch:{ all -> 0x0371 }
            int r15 = r1.A01()     // Catch:{ all -> 0x0371 }
            X.Npt r1 = r4.A04     // Catch:{ all -> 0x0371 }
            int r16 = r1.A01()     // Catch:{ all -> 0x0371 }
            X.Npt r1 = r4.A02     // Catch:{ all -> 0x0371 }
            int r17 = r1.A01()     // Catch:{ all -> 0x0371 }
            X.Jvx r1 = r0.A02     // Catch:{ all -> 0x0371 }
            java.lang.Object r1 = r1.A02     // Catch:{ all -> 0x0371 }
            X.N3V r1 = (X.N3V) r1     // Catch:{ all -> 0x0371 }
            java.lang.Integer r1 = r1.A06     // Catch:{ all -> 0x0371 }
            int r3 = r1.intValue()     // Catch:{ all -> 0x0371 }
            if (r3 == r2) goto L_0x014a
            java.lang.String r2 = "gridViewParameters"
            if (r3 == r8) goto L_0x014c
            r1 = 2
            if (r3 == r1) goto L_0x014c
            r1 = 3
            if (r3 != r1) goto L_0x0144
            X.ODG r1 = r0.A08     // Catch:{ all -> 0x0371 }
            if (r1 == 0) goto L_0x0364
            int r1 = r1.A02     // Catch:{ all -> 0x0371 }
            goto L_0x0152
        L_0x0144:
            X.Wub r0 = X.AnonymousClass7TE.A1K()     // Catch:{ all -> 0x0371 }
            goto L_0x0370
        L_0x014a:
            r1 = 0
            goto L_0x0152
        L_0x014c:
            X.ODG r1 = r0.A08     // Catch:{ all -> 0x0371 }
            if (r1 == 0) goto L_0x0364
            int r1 = r1.A00     // Catch:{ all -> 0x0371 }
        L_0x0152:
            X.N3y r10 = new X.N3y     // Catch:{ all -> 0x0371 }
            r18 = r1
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18)     // Catch:{ all -> 0x0371 }
            r1 = 2129164369(0x7ee87851, float:1.5450281E38)
            X.0fh.A00(r1)     // Catch:{ all -> 0x037e }
            r11 = r10
            goto L_0x0167
        L_0x0161:
            r1 = -1425384930(0xffffffffab0a5a1e, float:-4.915251E-13)
            X.0fh.A00(r1)     // Catch:{ all -> 0x037e }
        L_0x0167:
            X.N3y r1 = r0.A04     // Catch:{ all -> 0x037e }
            boolean r1 = X.0qQ.A0K(r1, r11)     // Catch:{ all -> 0x037e }
            if (r1 != 0) goto L_0x0213
            boolean r1 = r0.A0B     // Catch:{ all -> 0x037e }
            if (r1 != 0) goto L_0x0178
            com.facebook.common.draggableview.DraggableViewContainer r2 = r0.A0H     // Catch:{ all -> 0x037e }
            r1 = 0
            r2.A0E = r1     // Catch:{ all -> 0x037e }
        L_0x0178:
            r0.A04 = r11     // Catch:{ all -> 0x037e }
            r5 = r29
            if (r11 == 0) goto L_0x020f
            java.lang.String r2 = "OmniGridView.showFloatingSelfView"
            r1 = 368176494(0x15f1ed6e, float:9.771372E-26)
            X.0fh.A01(r2, r1)     // Catch:{ all -> 0x037e }
            X.N3y r6 = r0.A04     // Catch:{ all -> 0x0209 }
            java.lang.String r2 = "Required value was null."
            if (r6 == 0) goto L_0x01ff
            android.view.View r9 = r0.A01     // Catch:{ all -> 0x0209 }
            if (r9 == 0) goto L_0x01f8
            r11 = 0
            android.view.ViewParent r1 = r9.getParent()     // Catch:{ all -> 0x0209 }
            com.facebook.common.draggableview.DraggableViewContainer r8 = r0.A0H     // Catch:{ all -> 0x0209 }
            boolean r1 = X.0qQ.A0K(r1, r8)     // Catch:{ all -> 0x0209 }
            if (r1 != 0) goto L_0x01b8
            android.view.ViewParent r1 = r9.getParent()     // Catch:{ all -> 0x0209 }
            if (r1 == 0) goto L_0x01b3
            X.ULb r11 = r0.getSelfViewFrameInGrid()     // Catch:{ all -> 0x0209 }
            android.view.ViewParent r1 = r9.getParent()     // Catch:{ all -> 0x0209 }
            X.C66580MXl.A1R(r1)     // Catch:{ all -> 0x0209 }
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1     // Catch:{ all -> 0x0209 }
            r1.removeView(r9)     // Catch:{ all -> 0x0209 }
        L_0x01b3:
            r1 = 1106247680(0x41f00000, float:30.0)
            r9.setElevation(r1)     // Catch:{ all -> 0x0209 }
        L_0x01b8:
            X.MzN r4 = r0.A03     // Catch:{ all -> 0x0209 }
            if (r4 == 0) goto L_0x0204
            java.lang.Integer r3 = X.AnonymousClass05K.A01     // Catch:{ all -> 0x0209 }
            java.lang.Integer r7 = X.AnonymousClass05K.A0C     // Catch:{ all -> 0x0209 }
            int r2 = r6.A01     // Catch:{ all -> 0x0209 }
            X.Jvx r1 = r0.A02     // Catch:{ all -> 0x0209 }
            java.lang.Object r1 = r1.A03     // Catch:{ all -> 0x0209 }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ all -> 0x0209 }
            if (r1 == 0) goto L_0x01ef
            int r1 = r1.intValue()     // Catch:{ all -> 0x0209 }
        L_0x01ce:
            r4.A02(r3, r7, r2, r1)     // Catch:{ all -> 0x0209 }
            int r12 = r6.A06     // Catch:{ all -> 0x0209 }
            int r13 = r6.A02     // Catch:{ all -> 0x0209 }
            int r14 = r6.A03     // Catch:{ all -> 0x0209 }
            int r15 = r6.A05     // Catch:{ all -> 0x0209 }
            int r2 = r6.A04     // Catch:{ all -> 0x0209 }
            int r1 = r6.A00     // Catch:{ all -> 0x0209 }
            X.Nis r10 = r6.A07     // Catch:{ all -> 0x0209 }
            r18 = r5
            r16 = r2
            r17 = r1
            r8.A0A(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)     // Catch:{ all -> 0x0209 }
            java.lang.Integer r1 = r4.A00     // Catch:{ all -> 0x0209 }
            if (r1 == r3) goto L_0x01f1
            r4.A00 = r3     // Catch:{ all -> 0x0209 }
            goto L_0x01f1
        L_0x01ef:
            r1 = -1
            goto L_0x01ce
        L_0x01f1:
            r1 = -1244325626(0xffffffffb5d51906, float:-1.587702E-6)
            X.0fh.A00(r1)     // Catch:{ all -> 0x037e }
            goto L_0x022c
        L_0x01f8:
            java.lang.String r0 = "selfView must be initialized before floating self view is shown"
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)     // Catch:{ all -> 0x0209 }
            goto L_0x0208
        L_0x01ff:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r2)     // Catch:{ all -> 0x0209 }
            goto L_0x0208
        L_0x0204:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r2)     // Catch:{ all -> 0x0209 }
        L_0x0208:
            throw r0     // Catch:{ all -> 0x0209 }
        L_0x0209:
            r1 = move-exception
            r0 = -1201791277(0xffffffffb85e1ed3, float:-5.2957632E-5)
            goto L_0x0375
        L_0x020f:
            r0.A04(r5)     // Catch:{ all -> 0x037e }
            goto L_0x022c
        L_0x0213:
            if (r11 != 0) goto L_0x022c
            X.MzN r3 = r0.A03     // Catch:{ all -> 0x037e }
            if (r3 == 0) goto L_0x0220
            java.lang.Integer r2 = r3.A00     // Catch:{ all -> 0x037e }
        L_0x021b:
            java.lang.Integer r1 = X.AnonymousClass05K.A0C     // Catch:{ all -> 0x037e }
            if (r2 != r1) goto L_0x022c
            goto L_0x0222
        L_0x0220:
            r2 = 0
            goto L_0x021b
        L_0x0222:
            if (r3 == 0) goto L_0x0379
            java.lang.Integer r2 = X.AnonymousClass05K.A00     // Catch:{ all -> 0x037e }
            java.lang.Integer r1 = r3.A00     // Catch:{ all -> 0x037e }
            if (r1 == r2) goto L_0x022c
            r3.A00 = r2     // Catch:{ all -> 0x037e }
        L_0x022c:
            r1 = 1089983346(0x40f7d372, float:7.744561)
            X.0fh.A00(r1)
            X.Jvx r1 = r0.A02
            java.lang.Object r10 = r1.A01
            X.JwM r10 = (X.C61084JwM) r10
            if (r10 != 0) goto L_0x0254
            com.facebook.rtc.views.omnigridview.OmniGridView r2 = r0.A07
            if (r2 == 0) goto L_0x0253
            android.view.ViewParent r1 = r2.getParent()
            if (r1 == 0) goto L_0x0250
            android.view.ViewParent r1 = r2.getParent()
            X.C66580MXl.A1R(r1)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r1.removeView(r2)
        L_0x0250:
            r1 = 0
            r0.A07 = r1
        L_0x0253:
            return
        L_0x0254:
            com.facebook.rtc.views.omnigridview.OmniGridView r3 = r0.getAndInitFloatingGridView()
            java.lang.Object r7 = r10.A02
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r9 = r10.A00
            X.JVf r9 = (X.C59721JVf) r9
            java.lang.Object r1 = r9.A00
            X.N4M r1 = (X.N4M) r1
            boolean r8 = r1.A03
            com.facebook.rtc.views.omnigrid.OmniGridLayoutManager r6 = r0.A0I
            X.JVf r1 = r6.A06
            java.lang.Object r1 = r1.A00
            X.N4M r1 = (X.N4M) r1
            X.Npt r5 = r1.A01
            X.Npt r1 = r1.A00
            r15 = 0
            r4 = 0
            r2 = 1
            r25 = 30415(0x76cf, float:4.262E-41)
            X.N4M r14 = new X.N4M
            r16 = r15
            r17 = r15
            r18 = r15
            r19 = r15
            r20 = r1
            r21 = r5
            r22 = r15
            r23 = r15
            r24 = r15
            r26 = r8
            r27 = r4
            r28 = r4
            r29 = r2
            r14.<init>((com.facebook.rtc.views.omnigrid.GridSelfViewLocation) r15, (X.C69671Npt) r16, (X.C69671Npt) r17, (X.C69671Npt) r18, (X.C69671Npt) r19, (X.C69671Npt) r20, (X.C69671Npt) r21, (X.C69671Npt) r22, (X.C69671Npt) r23, (java.lang.Object) r24, (int) r25, (boolean) r26, (boolean) r27, (boolean) r28, (boolean) r29)
            java.lang.Object r1 = r9.A01
            X.0sP r1 = (X.0sP) r1
            X.0qQ.A0B(r1, r2)
            X.JVf r8 = new X.JVf
            r8.<init>((X.N4M) r14, (X.0sP) r1)
            X.Jvx r1 = r0.A02
            java.lang.Object r1 = r1.A06
            java.util.Map r1 = (java.util.Map) r1
            java.util.LinkedHashMap r9 = X.AnonymousClass7TE.A1H()
            java.util.Iterator r14 = X.AnonymousClass7TF.A0u(r1)
        L_0x02b0:
            boolean r1 = r14.hasNext()
            if (r1 == 0) goto L_0x02da
            java.util.Map$Entry r11 = X.AnonymousClass7TE.A1J(r14)
            java.lang.Object r1 = r11.getKey()
            long r12 = X.AnonymousClass7TE.A0R(r1)
            java.lang.Object r1 = r10.A01
            X.0eM r1 = (X.AnonymousClass0eM) r1
            java.lang.Object r5 = r1.getValue()
            java.util.Set r5 = (java.util.Set) r5
            java.lang.Long r1 = java.lang.Long.valueOf(r12)
            boolean r1 = r5.contains(r1)
            if (r1 == 0) goto L_0x02b0
            X.JTR.A1U(r9, r11)
            goto L_0x02b0
        L_0x02da:
            java.lang.Integer r16 = X.AnonymousClass05K.A00
            r17 = 0
            r18 = 126(0x7e, float:1.77E-43)
            X.N3V r1 = new X.N3V
            r11 = r1
            r12 = r15
            r13 = r15
            r14 = r15
            r11.<init>(r12, r13, r14, r15, r16, r17, r18)
            X.Jvx r5 = new X.Jvx
            r5.<init>(r8, r1, r7, r9)
            X.Jvx r1 = r0.A02
            java.lang.Object r8 = r1.A02
            X.N3V r8 = (X.N3V) r8
            X.Jvx r1 = r3.A02
            boolean r1 = X.0qQ.A0K(r1, r5)
            if (r1 == 0) goto L_0x0305
            X.N3V r1 = r0.A09
            boolean r1 = X.0qQ.A0K(r8, r1)
            if (r1 == 0) goto L_0x0305
            return
        L_0x0305:
            r0.A09 = r8
            r0.A04(r4)
            float r10 = r8.A01
            float r9 = r8.A00
            int r7 = r0.getWidth()
            int r1 = r0.getHeight()
            if (r7 < r1) goto L_0x035e
            float r7 = (float) r7
            float r7 = r7 * r10
            float r9 = r9 * r7
        L_0x031b:
            java.lang.Object r1 = r5.A04
            X.JVf r1 = (X.C59721JVf) r1
            X.0qQ.A0B(r1, r4)
            r6.A06 = r1
            r6.A0b()
            com.facebook.common.draggableview.DraggableViewContainer r6 = r0.A0H
            int r7 = (int) r7
            int r1 = (int) r9
            X.Npt r9 = r8.A03
            android.content.Context r0 = r0.getContext()
            X.0qQ.A07(r0)
            int r16 = r9.A01()
            X.Npt r0 = r8.A05
            int r17 = r0.A01()
            X.Npt r0 = r8.A04
            int r18 = r0.A01()
            X.Npt r0 = r8.A02
            int r19 = r0.A01()
            r14 = r7
            r15 = r1
            r20 = r4
            r10 = r6
            r11 = r3
            r10.A0A(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r6.A0E = r2
            r0 = 1106247680(0x41f00000, float:30.0)
            r6.setElevation(r0)
            r3.A05(r5, r2)
            return
        L_0x035e:
            float r1 = (float) r1
            float r10 = r10 * r1
            float r7 = r9 * r10
            r9 = r10
            goto L_0x031b
        L_0x0364:
            X.0qQ.A0F(r2)     // Catch:{ all -> 0x0371 }
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            goto L_0x0370
        L_0x036c:
            X.Wub r0 = X.AnonymousClass7TE.A1K()     // Catch:{ all -> 0x0371 }
        L_0x0370:
            throw r0     // Catch:{ all -> 0x0371 }
        L_0x0371:
            r1 = move-exception
            r0 = -1200122097(0xffffffffb877970f, float:-5.9030073E-5)
        L_0x0375:
            X.0fh.A00(r0)     // Catch:{ all -> 0x037e }
            goto L_0x037d
        L_0x0379:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0y()     // Catch:{ all -> 0x037e }
        L_0x037d:
            throw r1     // Catch:{ all -> 0x037e }
        L_0x037e:
            r1 = move-exception
            r0 = 1631603666(0x61404bd2, float:2.217024E20)
            X.0fh.A00(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.rtc.views.omnigridview.OmniGridView.A03(com.facebook.rtc.views.omnigridview.OmniGridView, boolean):void");
    }

    private final void A04(boolean z) {
        int i;
        Map map;
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        0fh.A01("OmniGridView.hideFloatingSelfView", -1385067191);
        try {
            C68056MzN mzN = this.A03;
            if (mzN == null) {
                i = -274077905;
            } else {
                View view = this.A01;
                if (view != null) {
                    View A0F2 = JTO.A0F(mzN);
                    if (!0qQ.A0K(view.getParent(), A0F2)) {
                        view.setElevation(30.0f);
                        mzN.A01(AnonymousClass05K.A0C);
                        RecyclerView recyclerView = this.A0G;
                        int[] iArr = new int[2];
                        view.getLocationInWindow(iArr);
                        int[] iArr2 = new int[2];
                        recyclerView.getLocationInWindow(iArr2);
                        int i2 = iArr[0] - iArr2[0];
                        int i3 = iArr[1] - iArr2[1];
                        C15048ULb uLb = new C15048ULb(i2, i3, view.getWidth() + i2, view.getHeight() + i3, 0);
                        ViewParent parent = view.getParent();
                        if ((parent instanceof ViewGroup) && (viewGroup2 = (ViewGroup) parent) != null) {
                            viewGroup2.removeView(view);
                        }
                        if ((A0F2 instanceof ViewGroup) && (viewGroup = (ViewGroup) A0F2) != null) {
                            viewGroup.addView(view);
                        }
                        Long A012 = A01();
                        if (A012 != null && z) {
                            OmniGridLayoutManager omniGridLayoutManager = this.A0I;
                            0eP A1L = AnonymousClass7TE.A1L(uLb, OSV.A00);
                            if (omniGridLayoutManager.A0D) {
                                map = omniGridLayoutManager.A0B;
                            } else {
                                map = omniGridLayoutManager.A0A;
                            }
                            map.put(A012, A1L);
                            omniGridLayoutManager.A0b();
                            omniGridLayoutManager.A0F = true;
                        }
                    }
                    Integer num = AnonymousClass05K.A00;
                    if (mzN.A00 != num) {
                        mzN.A00 = num;
                    }
                    i = 1302275379;
                } else {
                    throw AnonymousClass7TE.A0y();
                }
            }
            0fh.A00(i);
        } catch (Throwable th) {
            0fh.A00(-1865935441);
            throw th;
        }
    }

    private final OmniGridView getAndInitFloatingGridView() {
        OmniGridView omniGridView = this.A07;
        if (omniGridView == null) {
            omniGridView = new OmniGridView(AnonymousClass7TE.A0S(this), (AttributeSet) null, 0);
            Map map = this.A0E;
            if (map != null) {
                omniGridView.setItemDefinitions(map, (ODG) null);
                this.A07 = omniGridView;
            } else {
                throw AnonymousClass7TE.A0y();
            }
        }
        return omniGridView;
    }

    public static /* synthetic */ void setItemDefinitions$default(OmniGridView omniGridView, Map map, ODG odg, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                odg = null;
            }
            omniGridView.setItemDefinitions(map, odg);
            return;
        }
        throw AnonymousClass7TE.A1B("Super calls with default arguments not supported in this target, function: setItemDefinitions");
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0136, code lost:
        if (r0 == null) goto L_0x0138;
     */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00fe A[Catch:{ all -> 0x01d9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0170 A[Catch:{ all -> 0x01d9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0198 A[Catch:{ all -> 0x01d9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x019a A[Catch:{ all -> 0x01d9 }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:73:0x0141=Splitter:B:73:0x0141, B:65:0x0125=Splitter:B:65:0x0125} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A05(X.C61059Jvx r21, boolean r22) {
        /*
            r20 = this;
            java.lang.String r1 = "OmniGridView"
            java.lang.String r2 = "OmniGridView.bind"
            r0 = 7908714(0x78ad6a, float:1.1082469E-38)
            X.0fh.A01(r2, r0)
            r3 = r20
            X.MvJ r0 = r3.A0D     // Catch:{ all -> 0x01d9 }
            if (r0 == 0) goto L_0x01d2
            X.Jvx r4 = r3.A02     // Catch:{ all -> 0x01d9 }
            r9 = r21
            boolean r0 = X.0qQ.A0K(r4, r9)     // Catch:{ all -> 0x01d9 }
            if (r0 != 0) goto L_0x01cb
            androidx.recyclerview.widget.RecyclerView r7 = r3.A0G     // Catch:{ all -> 0x01d9 }
            r0 = 0
            r2 = r22
            if (r22 == 0) goto L_0x003f
            X.MvN r5 = r3.A0J     // Catch:{ all -> 0x01d9 }
        L_0x0023:
            r7.setItemAnimator(r5)     // Catch:{ all -> 0x01d9 }
            r3.A02 = r9     // Catch:{ all -> 0x01d9 }
            java.lang.Object r6 = r4.A03     // Catch:{ all -> 0x01d9 }
            java.lang.Integer r6 = (java.lang.Integer) r6     // Catch:{ all -> 0x01d9 }
            java.lang.Object r5 = r9.A03     // Catch:{ all -> 0x01d9 }
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch:{ all -> 0x01d9 }
            boolean r5 = X.0qQ.A0K(r6, r5)     // Catch:{ all -> 0x01d9 }
            if (r5 != 0) goto L_0x0063
            java.lang.String r6 = "OmniGridView.updateRoundedCornerForVisibleItems"
            r5 = 676133817(0x284cfbb9, float:1.13788585E-14)
            X.0fh.A01(r6, r5)     // Catch:{ all -> 0x01d9 }
            goto L_0x0041
        L_0x003f:
            r5 = r0
            goto L_0x0023
        L_0x0041:
            com.facebook.rtc.views.omnigrid.OmniGridLayoutManager r5 = r3.A0I     // Catch:{ all -> 0x0057 }
            com.google.common.collect.ImmutableList r5 = r5.A09     // Catch:{ all -> 0x0057 }
            java.util.Iterator r6 = r5.iterator()     // Catch:{ all -> 0x0057 }
        L_0x0049:
            boolean r5 = r6.hasNext()     // Catch:{ all -> 0x0057 }
            if (r5 == 0) goto L_0x005d
            int r5 = X.AnonymousClass7TG.A0F(r6)     // Catch:{ all -> 0x0057 }
            A02(r3, r5)     // Catch:{ all -> 0x0057 }
            goto L_0x0049
        L_0x0057:
            r1 = move-exception
            r0 = 19687451(0x12c681b, float:3.1666103E-38)
            goto L_0x0125
        L_0x005d:
            r5 = 131166339(0x7d17083, float:3.1512953E-34)
            X.0fh.A00(r5)     // Catch:{ all -> 0x01d9 }
        L_0x0063:
            X.Jvx r5 = r3.A02     // Catch:{ all -> 0x01d9 }
            java.lang.Object r5 = r5.A05     // Catch:{ all -> 0x01d9 }
            java.util.List r5 = (java.util.List) r5     // Catch:{ all -> 0x01d9 }
            java.util.ArrayList r8 = X.AnonymousClass7TG.A0r(r5)     // Catch:{ all -> 0x01d9 }
            java.util.Iterator r11 = r5.iterator()     // Catch:{ all -> 0x01d9 }
        L_0x0071:
            boolean r5 = r11.hasNext()     // Catch:{ all -> 0x01d9 }
            if (r5 == 0) goto L_0x00b1
            java.lang.Object r10 = r11.next()     // Catch:{ all -> 0x01d9 }
            X.N3g r10 = (X.C68166N3g) r10     // Catch:{ all -> 0x01d9 }
            java.lang.Object r6 = r9.A06     // Catch:{ all -> 0x01d9 }
            java.util.Map r6 = (java.util.Map) r6     // Catch:{ all -> 0x01d9 }
            X.AnonymousClass7TG.A1N(r10, r6)     // Catch:{ all -> 0x01d9 }
            long r13 = r10.A02     // Catch:{ all -> 0x01d9 }
            com.facebook.rtc.views.omnigrid.GridItemType r15 = r10.A03     // Catch:{ all -> 0x01d9 }
            java.lang.Long r5 = java.lang.Long.valueOf(r13)     // Catch:{ all -> 0x01d9 }
            java.lang.Object r6 = r6.get(r5)     // Catch:{ all -> 0x01d9 }
            com.facebook.rtc.views.omnigrid.GridItemSize r6 = (com.facebook.rtc.views.omnigrid.GridItemSize) r6     // Catch:{ all -> 0x01d9 }
            if (r6 != 0) goto L_0x009a
            r5 = -1
            com.facebook.rtc.views.omnigrid.GridItemSize r6 = new com.facebook.rtc.views.omnigrid.GridItemSize     // Catch:{ all -> 0x01d9 }
            r6.<init>(r5, r5)     // Catch:{ all -> 0x01d9 }
        L_0x009a:
            java.lang.Integer r10 = r10.A07     // Catch:{ all -> 0x01d9 }
            java.lang.Integer r5 = X.AnonymousClass05K.A00     // Catch:{ all -> 0x01d9 }
            boolean r17 = X.AnonymousClass7TF.A1W(r10, r5)
            r18 = 0
            com.facebook.rtc.views.omnigrid.GridLayoutInputItem r12 = new com.facebook.rtc.views.omnigrid.GridLayoutInputItem     // Catch:{ all -> 0x01d9 }
            r19 = r0
            r16 = r6
            r12.<init>(r13, r15, r16, r17, r18, r19)     // Catch:{ all -> 0x01d9 }
            r8.add(r12)     // Catch:{ all -> 0x01d9 }
            goto L_0x0071
        L_0x00b1:
            java.util.List r5 = r3.A0A     // Catch:{ all -> 0x01d9 }
            boolean r10 = X.0qQ.A0K(r5, r8)     // Catch:{ all -> 0x01d9 }
            r6 = 0
            r5 = 1
            boolean r14 = X.AnonymousClass7TF.A1Q(r10)
            r3.A0A = r8     // Catch:{ all -> 0x01d9 }
            boolean r8 = r3.A0C     // Catch:{ all -> 0x01d9 }
            if (r8 == 0) goto L_0x00f3
            X.Jvx r8 = r3.A02     // Catch:{ all -> 0x01d9 }
            X.N3g r11 = X.OSV.A00(r8)     // Catch:{ all -> 0x01d9 }
            X.N3g r8 = X.OSV.A00(r4)     // Catch:{ all -> 0x01d9 }
            boolean r8 = X.0qQ.A0K(r11, r8)     // Catch:{ all -> 0x01d9 }
            if (r8 != 0) goto L_0x00f3
            java.lang.String r10 = "gridSelfItemDefinition"
            if (r11 == 0) goto L_0x00df
            X.NE9 r8 = r3.A05     // Catch:{ all -> 0x01d9 }
            if (r8 == 0) goto L_0x0138
            r8.A02(r3, r3, r11)     // Catch:{ all -> 0x01d9 }
            goto L_0x00f1
        L_0x00df:
            X.NE9 r8 = r3.A05     // Catch:{ all -> 0x01d9 }
            if (r8 == 0) goto L_0x0138
            X.MzN r8 = r3.A03     // Catch:{ all -> 0x01d9 }
            if (r8 == 0) goto L_0x00f1
            X.NE7 r8 = (X.NE7) r8     // Catch:{ all -> 0x01d9 }
            X.0qQ.A0B(r8, r6)     // Catch:{ all -> 0x01d9 }
            X.NgG r8 = r8.A01     // Catch:{ all -> 0x01d9 }
            r8.A01()     // Catch:{ all -> 0x01d9 }
        L_0x00f1:
            r13 = 1
            goto L_0x00f4
        L_0x00f3:
            r13 = 0
        L_0x00f4:
            java.lang.Object r11 = r9.A05     // Catch:{ all -> 0x01d9 }
            java.util.List r11 = (java.util.List) r11     // Catch:{ all -> 0x01d9 }
            boolean r8 = r11.isEmpty()     // Catch:{ all -> 0x01d9 }
            if (r8 != 0) goto L_0x0141
            X.MvJ r12 = r3.A0D     // Catch:{ all -> 0x01d9 }
            java.lang.String r10 = "gridAdapter"
            if (r12 == 0) goto L_0x0138
            java.lang.String r8 = "GridAdapter.bind"
            r0 = -396348166(0xffffffffe86034fa, float:-4.2351493E24)
            X.0fh.A01(r8, r0)     // Catch:{ all -> 0x01d9 }
            java.util.List r8 = r12.A00     // Catch:{ all -> 0x0121 }
            X.MuR r0 = new X.MuR     // Catch:{ all -> 0x0121 }
            r0.<init>(r8, r11)     // Catch:{ all -> 0x0121 }
            X.2ta r0 = X.C232332tX.A00(r0)     // Catch:{ all -> 0x0121 }
            r8.clear()     // Catch:{ all -> 0x0121 }
            r8.addAll(r11)     // Catch:{ all -> 0x0121 }
            r0.A03(r12)     // Catch:{ all -> 0x0121 }
            goto L_0x012a
        L_0x0121:
            r1 = move-exception
            r0 = -61605972(0xfffffffffc53f7ac, float:-4.402392E36)
        L_0x0125:
            X.0fh.A00(r0)     // Catch:{ all -> 0x01d9 }
            goto L_0x01d8
        L_0x012a:
            r0 = 52170694(0x31c0fc6, float:4.5862387E-37)
            X.0fh.A00(r0)     // Catch:{ all -> 0x01d9 }
            X.2Rw r0 = r7.A0A     // Catch:{ all -> 0x01d9 }
            if (r0 != 0) goto L_0x0144
            X.MvJ r0 = r3.A0D     // Catch:{ all -> 0x01d9 }
            if (r0 != 0) goto L_0x0141
        L_0x0138:
            X.0qQ.A0F(r10)     // Catch:{ all -> 0x01d9 }
            X.00P r1 = X.AnonymousClass00P.createAndThrow()
            goto L_0x01d8
        L_0x0141:
            r7.setAdapter(r0)     // Catch:{ all -> 0x01d9 }
        L_0x0144:
            if (r13 == 0) goto L_0x0183
            X.N3g r8 = X.OSV.A00(r9)     // Catch:{ all -> 0x01d9 }
            if (r8 == 0) goto L_0x0183
            java.lang.Integer r7 = r8.A07     // Catch:{ all -> 0x01d9 }
            java.lang.Integer r0 = X.AnonymousClass05K.A00     // Catch:{ all -> 0x01d9 }
            if (r7 == r0) goto L_0x0183
            java.lang.Object r9 = r9.A06     // Catch:{ all -> 0x01d9 }
            java.util.Map r9 = (java.util.Map) r9     // Catch:{ all -> 0x01d9 }
            long r7 = r8.A02     // Catch:{ all -> 0x01d9 }
            java.lang.Long r0 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x01d9 }
            java.lang.Object r7 = r9.get(r0)     // Catch:{ all -> 0x01d9 }
            com.facebook.rtc.views.omnigrid.GridItemSize r7 = (com.facebook.rtc.views.omnigrid.GridItemSize) r7     // Catch:{ all -> 0x01d9 }
            if (r7 == 0) goto L_0x016c
            com.facebook.rtc.views.omnigrid.GridItemSize r0 = X.C70371O3x.A00     // Catch:{ all -> 0x01d9 }
            boolean r0 = r7.equals(r0)     // Catch:{ all -> 0x01d9 }
            if (r0 == 0) goto L_0x0183
        L_0x016c:
            boolean r0 = r3.A0F     // Catch:{ all -> 0x01d9 }
            if (r0 != 0) goto L_0x017e
            java.lang.String r8 = "omnigrid_missing_self_video_size"
            r7 = 0
            X.0sn r11 = X.0sn.A00     // Catch:{ all -> 0x01d9 }
            r9 = r7
            r10 = r7
            r12 = r7
            r13 = r5
            X.OX3.A02(r7, r8, r9, r10, r11, r12, r13)     // Catch:{ all -> 0x01d9 }
            r3.A0F = r5     // Catch:{ all -> 0x01d9 }
        L_0x017e:
            java.lang.String r0 = "Self video is on with no video size. This could lead to over-cropping locally."
            X.0KC.A0D(r1, r0)     // Catch:{ all -> 0x01d9 }
        L_0x0183:
            com.facebook.rtc.views.omnigrid.OmniGridLayoutManager r7 = r3.A0I     // Catch:{ all -> 0x01d9 }
            X.Jvx r0 = r3.A02     // Catch:{ all -> 0x01d9 }
            java.lang.Object r1 = r0.A04     // Catch:{ all -> 0x01d9 }
            X.JVf r1 = (X.C59721JVf) r1     // Catch:{ all -> 0x01d9 }
            X.0qQ.A0B(r1, r6)     // Catch:{ all -> 0x01d9 }
            if (r14 != 0) goto L_0x019a
            X.JVf r0 = r7.A06     // Catch:{ all -> 0x01d9 }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x01d9 }
            if (r0 == 0) goto L_0x019a
            r5 = 0
            goto L_0x01a3
        L_0x019a:
            r7.A06 = r1     // Catch:{ all -> 0x01d9 }
            r7.A0b()     // Catch:{ all -> 0x01d9 }
            if (r22 == 0) goto L_0x01a3
            r7.A0F = r5     // Catch:{ all -> 0x01d9 }
        L_0x01a3:
            java.lang.Object r1 = r4.A02     // Catch:{ all -> 0x01d9 }
            X.N3V r1 = (X.N3V) r1     // Catch:{ all -> 0x01d9 }
            X.Jvx r0 = r3.A02     // Catch:{ all -> 0x01d9 }
            java.lang.Object r0 = r0.A02     // Catch:{ all -> 0x01d9 }
            X.N3V r0 = (X.N3V) r0     // Catch:{ all -> 0x01d9 }
            boolean r0 = X.0qQ.A0K(r1, r0)     // Catch:{ all -> 0x01d9 }
            if (r0 == 0) goto L_0x01c3
            java.lang.Object r1 = r4.A01     // Catch:{ all -> 0x01d9 }
            X.JwM r1 = (X.C61084JwM) r1     // Catch:{ all -> 0x01d9 }
            X.Jvx r0 = r3.A02     // Catch:{ all -> 0x01d9 }
            java.lang.Object r0 = r0.A01     // Catch:{ all -> 0x01d9 }
            X.JwM r0 = (X.C61084JwM) r0     // Catch:{ all -> 0x01d9 }
            boolean r0 = X.0qQ.A0K(r1, r0)     // Catch:{ all -> 0x01d9 }
            if (r0 != 0) goto L_0x01c4
        L_0x01c3:
            r6 = 1
        L_0x01c4:
            if (r5 != 0) goto L_0x01cb
            if (r6 == 0) goto L_0x01cb
            A03(r3, r2)     // Catch:{ all -> 0x01d9 }
        L_0x01cb:
            r0 = 979072141(0x3a5b748d, float:8.3715544E-4)
            X.0fh.A00(r0)
            return
        L_0x01d2:
            java.lang.String r0 = "Set item definition by calling setItemDefinitions() before calling bind"
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0z(r0)     // Catch:{ all -> 0x01d9 }
        L_0x01d8:
            throw r1     // Catch:{ all -> 0x01d9 }
        L_0x01d9:
            r1 = move-exception
            r0 = 594426047(0x236e38bf, float:1.2914022E-17)
            X.0fh.A00(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.rtc.views.omnigridview.OmniGridView.A05(X.Jvx, boolean):void");
    }

    public final RecyclerView getGridRecyclerView$fbandroid_java_com_facebook_rtc_views_omnigridview_omnigridview() {
        return this.A0G;
    }

    public final C61059Jvx getGridViewModel() {
        return this.A02;
    }

    public final OmniGridLayoutManager getLayoutManager() {
        return this.A0I;
    }

    public View getSelfView() {
        return this.A01;
    }

    public C68056MzN getSelfViewHolder() {
        return this.A03;
    }

    public final C74228PrH getTapListener() {
        return this.A06;
    }

    public final View.OnTouchListener getTouchInterceptor() {
        return this.A00;
    }

    public final void setShouldDisableDraggingForFloatingView(boolean z) {
        this.A0H.A0D = z;
    }

    public final void setShouldInterceptChildTouchEventsForFloatingView(boolean z) {
        this.A0B = z;
        this.A0H.A0E = z;
    }

    public final C15048ULb getSelfViewFrameInGrid() {
        Object obj;
        Long A012 = A01();
        C15048ULb uLb = null;
        if (A012 != null) {
            long longValue = A012.longValue();
            OmniGridLayoutManager omniGridLayoutManager = this.A0I;
            Iterator it = omniGridLayoutManager.A08.A09.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((C68152N2s) obj).A01 == longValue) {
                    break;
                }
            }
            C68152N2s n2s = (C68152N2s) obj;
            if (n2s != null) {
                C15048ULb uLb2 = n2s.A02;
                0qQ.A0B(uLb2, 0);
                C15048ULb A1a = omniGridLayoutManager.A1a();
                int i = uLb2.A01;
                int i2 = i - A1a.A01;
                int i3 = uLb2.A03;
                int i4 = i3 - A1a.A03;
                uLb = new C15048ULb(i2, i4, (uLb2.A02 - i) + i2, (uLb2.A00 - i3) + i4, 0);
                RecyclerView recyclerView = this.A0G;
                float scaleX = recyclerView.getScaleX();
                float scaleY = recyclerView.getScaleY();
                if (!(scaleX == 1.0f && scaleY == 1.0f)) {
                    float pivotX = recyclerView.getPivotX();
                    float pivotY = recyclerView.getPivotY();
                    return new C15048ULb(A00(pivotX, scaleX, uLb.A01), A00(pivotY, scaleY, uLb.A03), A00(pivotX, scaleX, uLb.A02), A00(pivotY, scaleY, uLb.A00), 0);
                }
            }
        }
        return uLb;
    }

    public final void onConfigurationChanged(Configuration configuration) {
        Object obj;
        super.onConfigurationChanged(configuration);
        OmniGridLayoutManager omniGridLayoutManager = this.A0I;
        C15048ULb A1a = omniGridLayoutManager.A1a();
        Iterator it = 00k.A0p(omniGridLayoutManager.A07.A09).iterator();
        do {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            obj = it.next();
        } while (((C68152N2s) ((0k0) obj).A01).A02.A00(A1a) < 1.0f);
        0k0 r2 = (0k0) obj;
        if (r2 != null) {
            int i = r2.A00;
            if (Integer.valueOf(i) != null) {
                C15048ULb uLb = ((C68152N2s) omniGridLayoutManager.A07.A09.get(i)).A02;
                omniGridLayoutManager.A05 = new ULT(i, uLb.A01 - omniGridLayoutManager.A00, uLb.A03 - omniGridLayoutManager.A01, 1);
            }
        }
    }

    public void setSelfView(View view) {
        this.A01 = view;
    }

    public void setSelfViewHolder(C68056MzN mzN) {
        this.A03 = mzN;
    }

    public final void setTapListener(C74228PrH prH) {
        this.A06 = prH;
    }

    public final void setTouchInterceptor(View.OnTouchListener onTouchListener) {
        this.A00 = onTouchListener;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OmniGridView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
        LayoutInflater.from(context).inflate(R.layout.layout_omni_grid, this, true);
        OmniGridLayoutManager omniGridLayoutManager = new OmniGridLayoutManager(context, C66580MXl.A14(this, 0));
        omniGridLayoutManager.A0F.add(new C70982OUv(this));
        this.A0I = omniGridLayoutManager;
        C67819MvN mvN = new C67819MvN(omniGridLayoutManager);
        this.A0J = mvN;
        this.A02 = OSV.A01;
        View findViewById = findViewById(R.id.omni_grid_recycler_view);
        OmniGridRecyclerView omniGridRecyclerView = (OmniGridRecyclerView) findViewById;
        omniGridRecyclerView.setLayoutManager(omniGridLayoutManager);
        omniGridRecyclerView.setItemAnimator(mvN);
        omniGridRecyclerView.A15(new C67837Mvh(this, 0));
        omniGridRecyclerView.A00 = new GestureDetector(context, new C67672Ms8(this));
        omniGridRecyclerView.A0S = true;
        0qQ.A07(findViewById);
        this.A0G = (RecyclerView) findViewById;
        this.A0H = (DraggableViewContainer) findViewById(R.id.floating_view_container);
        this.A0A = 0sn.A00;
    }

    public /* synthetic */ OmniGridView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JTT.A0D(attributeSet, i2), JTT.A01(i2, i));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public OmniGridView(Context context) {
        this(context, (AttributeSet) null, 0);
        0qQ.A0B(context, 1);
    }
}
