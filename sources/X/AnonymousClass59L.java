package X;

import android.animation.Animator;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.SparseArray;
import android.widget.FrameLayout;
import com.facebook.systrace.Systrace;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.util.concurrent.ListenableFuture;
import com.instagram.showreelnative.ui.common.ShowreelNativeMediaView;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import kotlin.Deprecated;

/* renamed from: X.59L  reason: invalid class name */
public abstract class AnonymousClass59L extends C267924cT implements AnonymousClass59M, AnonymousClass59R {
    public int A00;
    public Animator.AnimatorListener A01;
    public Pair A02;
    public C55589Hk9 A03;
    public C59669JSo A04;
    public AnonymousClass6L7 A05;
    public AnonymousClass6L8 A06;
    public ListenableFuture A07;
    public Object A08;
    public AnonymousClass9J6 A09;
    public AnonymousClass6LO A0A;
    public XFZ A0B;
    public C17894Vhl A0C;
    public String A0D;
    public String A0E;
    public final SparseArray A0F;
    public final AnonymousClass62I A0G;
    public final AnonymousClass621 A0H;
    public final AnonymousClass623 A0I;
    public final AnonymousClass627 A0J;
    public final AnonymousClass62H A0K;
    public final AnonymousClass62D A0L;
    public final AnonymousClass62E A0M;
    public final Map A0N;
    public final Map A0O;
    public final Stack A0P;
    public final AnonymousClass62C A0Q;
    public final Executor A0R;

    public void A01() {
    }

    public void A04(AnonymousClass6L7 r9, GZ1 gz1) {
        C226492gu keyframesAnimatable;
        C226492gu keyframesAnimatable2;
        AnonymousClass627 r3 = this.A0J;
        setKeyframes(r3, gz1.A00, gz1.A02, this, this);
        this.A02 = new Pair(this.A05, gz1);
        Animator.AnimatorListener animatorListener = this.A01;
        if (!(animatorListener == null || (keyframesAnimatable2 = r3.getKeyframesAnimatable()) == null)) {
            keyframesAnimatable2.A8s(animatorListener);
        }
        this.A05 = r9;
        A03(r9);
        int i = this.A00;
        C226492gu keyframesAnimatable3 = r3.getKeyframesAnimatable();
        if (keyframesAnimatable3 != null) {
            keyframesAnimatable3.EFJ(i);
        }
        if (this.A0H.Esj() && (keyframesAnimatable = r3.getKeyframesAnimatable()) != null) {
            if (keyframesAnimatable.BhR() != 0.0f) {
                keyframesAnimatable.EL2(0.0f);
            }
            keyframesAnimatable.E2p();
        }
    }

    public final void A06(String str, String str2) {
        0qQ.A0B(str2, 1);
        0KC.A0O("BaseShowreelMediaView", AnonymousClass000.A00(201), new Object[]{str2, str});
        0wb.A03(str, str2);
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [X.62G, java.lang.Object] */
    public final void AUl(AnonymousClass59N r13, AnonymousClass6L7 r14, WKI wki, AnonymousClass59P r16, String str, Map map) {
        ? obj = new Object();
        AnonymousClass9J6 r0 = this.A09;
        if (r0 == null) {
            0qQ.A0F("integrationPoint");
            throw AnonymousClass00P.createAndThrow();
        }
        C52510GVn A002 = obj.A00(this.A0A, r14, r0.A01, (String) null, str, true);
        AnonymousClass6L8 A022 = ((AnonymousClass6OE) getDrawableProvider().A00).A02(A002, false);
        try {
            ListenableFuture AUj = getDrawableProvider().AUj(new AnonymousClass9JH(A002.A00, A022.A00.A05, A002.A08, A002.A05), Q2X.A01, A022);
            C255183ti.A04(new IL0(r13, wki, r16, this), AUj, this.A0R);
            this.A07 = AUj;
        } catch (AnonymousClass92D e) {
            DCj(r14, e);
        }
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [X.62G, java.lang.Object] */
    public final void AUx(AnonymousClass6LO r13, AnonymousClass6L7 r14, String str, boolean z) {
        AnonymousClass6L7 r8 = r14;
        0qQ.A0B(r14, 0);
        ? obj = new Object();
        AnonymousClass9J6 r0 = this.A09;
        if (r0 == null) {
            0qQ.A0F("integrationPoint");
            throw AnonymousClass00P.createAndThrow();
        }
        boolean z2 = z;
        C52510GVn A012 = obj.A01(r13, r8, r0.A01, str, z2);
        try {
            AnonymousClass6OE r1 = (AnonymousClass6OE) getDrawableProvider().A00;
            boolean z3 = false;
            if (!z) {
                z3 = true;
            }
            AnonymousClass6L8 A022 = r1.A02(A012, z3);
            C46574DhG.A00();
            boolean CVg = this.A0H.CVg();
            XFZ drawableProvider = getDrawableProvider();
            String str2 = A022.A00.A05;
            String str3 = A012.A08;
            Q1l q1l = A012.A00;
            String str4 = A012.A05;
            ListenableFuture AUj = drawableProvider.AUj(new AnonymousClass9JH(q1l, str2, str3, str4), Q2X.A01, A022);
            C255183ti.A04(new C52596GYv(r14, this, CVg, z2), AUj, this.A0R);
            if (z) {
                this.A07 = AUj;
                this.A06 = A022;
                if (str4 == null) {
                    str4 = "";
                }
                this.A0E = str4;
            }
        } catch (AnonymousClass92D e) {
            A06("BaseShowreelMediaView", 002.A0R("fetchDrawableFailed: ", e.getLocalizedMessage()));
            DCj(r14, e);
        }
    }

    public final boolean DIY(PointF pointF, RectF rectF, C376649Iu r12, Integer num) {
        C59669JSo jSo;
        Integer num2 = num;
        0qQ.A0B(num, 3);
        C376649Iu r6 = r12;
        if (!"more".equals(r12.A01) || (jSo = this.A04) == null) {
            C17894Vhl vhl = new C17894Vhl(pointF, rectF, r6, this, num2);
            this.A0C = vhl;
            vhl.A00();
            return true;
        }
        jSo.Dkc();
        return true;
    }

    public final void Eaf(AnonymousClass59N r7, GZ0 gz0, AnonymousClass59P r9, Map map, boolean z, boolean z2) {
        setKeyframes(this.A0J, gz0, map, r7, r9);
    }

    public final void setAudioDataSource(Object obj) {
        0qQ.A0B(obj, 0);
    }

    public void setKeyframes(AnonymousClass59Q r9, GZ0 gz0, Map map, AnonymousClass59N r12, AnonymousClass59P r13) {
        AnonymousClass59P r4 = r13;
        AnonymousClass59N r2 = r12;
        AnonymousClass59Q r1 = r9;
        0qQ.A0B(r9, 0);
        GZ0 gz02 = gz0;
        0qQ.A0B(gz0, 1);
        Map map2 = map;
        0qQ.A0B(map, 2);
        if (r12 == null) {
            r2 = AnonymousClass59N.A01;
        }
        if (r13 == null) {
            r4 = C18402Vr4.A00;
        }
        AnonymousClass621 r0 = this.A0H;
        r1.Eaf(r2, gz02, r4, map2, r0.CZX(), r0.CZY());
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.Object, X.62D] */
    /* JADX WARNING: type inference failed for: r10v0, types: [java.lang.Object, X.62D] */
    /* JADX WARNING: type inference failed for: r9v0, types: [X.62F, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r11v0, types: [X.62G, java.lang.Object] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass59L(Context context, AttributeSet attributeSet, AnonymousClass9J6 r15, AnonymousClass621 r16, AnonymousClass623 r17, Executor executor, int i) {
        super(context, attributeSet, i);
        boolean A0E2;
        AnonymousClass621 r0 = r16;
        AnonymousClass623 r1 = r17;
        Executor executor2 = executor;
        0qQ.A0B(executor2, 8);
        this.A0R = executor2;
        if (r17 == null) {
            r1 = AnonymousClass622.A00;
            0qQ.A07(r1);
        }
        this.A0I = r1;
        this.A0J = new AnonymousClass627(context);
        this.A00 = 1;
        this.A0F = new SparseArray();
        C67671vk r2 = C67671vk.A01;
        this.A0Q = new AnonymousClass62C(r2);
        this.A0H = r16 == null ? new AnonymousClass624(r2, 0, true) : r0;
        Stack stack = new Stack();
        this.A0P = stack;
        this.A0N = new HashMap();
        this.A0L = new Object();
        this.A0O = new HashMap();
        this.A0M = new AnonymousClass62E();
        this.A0K = new AnonymousClass62H(new AnonymousClass624(r2, 0, true), new AnonymousClass62C(r2), new Object(), new Object(), new Object());
        this.A0G = new AnonymousClass62I();
        if (Systrace.A0E(1)) {
            0fS.A01("BaseShowreelMediaView:init", 1772350965);
        }
        this.A09 = r15;
        try {
            addView(this.A0J, new FrameLayout.LayoutParams(-1, -1, 17));
            stack.add(this.A0J);
            AnonymousClass627 r5 = this.A0J;
            C63040xi r22 = 0tS.A4E;
            r5.setDebugIndicatorEnabled(r22.A00().A0d());
            0tS A002 = r22.A00();
            r5.setClickableLayersIndicatorEnabled(((Boolean) A002.A1l.CDM(A002, 0tS.A4G[37])).booleanValue());
            ArrayList arrayList = new ArrayList();
            String str = new String[]{"ShowreelGlobalListeners"}[0];
            if (str.equals("ShowreelGlobalListeners")) {
                AnonymousClass65j r02 = AnonymousClass65j.A00;
                0qQ.A07(r02);
                arrayList.add(r02);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    AnonymousClass65k r12 = (AnonymousClass65k) it.next();
                    A02(r12, r12.hashCode());
                }
                SparseArray clone = this.A0F.clone();
                0qQ.A07(clone);
                int size = clone.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((AnonymousClass65k) clone.valueAt(i2)).Dyr(this);
                }
                if (!A0E2) {
                    return;
                }
                return;
            }
            throw new IllegalArgumentException(String.format("No implementation bound to key: %s", new Object[]{str}));
        } finally {
            if (Systrace.A0E(1)) {
                0fS.A00(970796113);
            }
        }
    }

    private final void setDebugText(AnonymousClass6L7 r10) {
        C52507GVk gVk = (C52507GVk) r10;
        String str = gVk.A03;
        if (str == null) {
            str = "";
        }
        String str2 = gVk.A05;
        if (str2 == null) {
            str2 = "";
        }
        AnonymousClass627 r1 = this.A0J;
        r1.setDebugInfoText(002.A12("Client name: ", str, "\nTemplate name: ", str2, "\nDuration in seconds: ", (long) r1.getDuration()));
    }

    public final GZ1 A00(AnonymousClass6L7 r3) {
        Object obj;
        Pair pair;
        Object obj2;
        if (this.A0H.CVg()) {
            obj2 = this.A0O.get(r3);
        } else {
            Pair pair2 = this.A02;
            if (pair2 != null) {
                obj = pair2.first;
            } else {
                obj = null;
            }
            if (!r3.equals(obj) || (pair = this.A02) == null) {
                return null;
            }
            obj2 = pair.second;
        }
        return (GZ1) obj2;
    }

    public final void A02(AnonymousClass65k r3, int i) {
        SparseArray sparseArray = this.A0F;
        synchronized (sparseArray) {
            sparseArray.put(i, r3);
        }
    }

    public final void A03(AnonymousClass6L7 r5) {
        SparseArray clone = this.A0F.clone();
        0qQ.A07(clone);
        int size = clone.size();
        for (int i = 0; i < size; i++) {
            ((AnonymousClass65k) clone.valueAt(i)).DO3(r5);
        }
        if (0tS.A4E.A00().A0c()) {
            setDebugText(r5);
        }
    }

    public final void A05(AnonymousClass6L7 r6, Throwable th) {
        boolean z = th instanceof CancellationException;
        int i = 0;
        SparseArray clone = this.A0F.clone();
        0qQ.A07(clone);
        int size = clone.size();
        if (z) {
            while (i < size) {
                ((AnonymousClass65k) clone.valueAt(i)).D0N(r6);
                i++;
            }
            return;
        }
        while (i < size) {
            ((AnonymousClass65k) clone.valueAt(i)).DCj(r6, th);
            i++;
        }
    }

    public final boolean AFX() {
        C55589Hk9 hk9;
        if ((this.A04 != null || ((hk9 = this.A03) != null && hk9.A00 != null)) && CWX()) {
            return true;
        }
        return false;
    }

    public final boolean CWX() {
        Object obj;
        GZ1 gz1;
        AnonymousClass6L7 r2 = this.A05;
        if (r2 != null) {
            Pair pair = this.A02;
            C226492gu r1 = null;
            if (pair != null) {
                obj = pair.first;
            } else {
                obj = null;
            }
            if (0qQ.A0K(obj, r2)) {
                Pair pair2 = this.A02;
                if (!(pair2 == null || (gz1 = (GZ1) pair2.second) == null)) {
                    r1 = gz1.A00.A00;
                }
                if (!0qQ.A0K(r1, this.A0J.getKeyframesAnimatable())) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public final void D7S() {
        C17894Vhl vhl = this.A0C;
        if (vhl != null) {
            vhl.A00();
        }
    }

    public final void DCj(AnonymousClass6L7 r3, Throwable th) {
        if (this instanceof ShowreelNativeMediaView) {
            0KC.A0F(getIntegrationPoint().A00, "Failed to query ", th);
            A05(r3, th);
            this.A05 = null;
            return;
        }
        ColorDrawable colorDrawable = this.A00;
        if (colorDrawable != null) {
            this.A0J.setPlaceholderDrawable(colorDrawable);
        }
        this.A02 = null;
        this.A0N.clear();
        A05(r3, th);
        A01();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00be, code lost:
        if (r0 == false) goto L_0x00c0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean DIT(android.graphics.PointF r24, android.graphics.RectF r25, X.C20841X0q r26, java.lang.Integer r27) {
        /*
            r23 = this;
            r12 = r26
            r4 = 0
            X.0qQ.A0B(r12, r4)
            r2 = 1
            r0 = 3
            r5 = r27
            X.0qQ.A0B(r5, r0)
            r13 = r23
            X.JSo r0 = r13.A04
            if (r0 != 0) goto L_0x001b
            X.Hk9 r0 = r13.A03
            if (r0 == 0) goto L_0x0199
            X.JQA r0 = r0.A00
            if (r0 == 0) goto L_0x0199
        L_0x001b:
            java.util.Stack r3 = r13.A0P
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x0199
            java.lang.Object r0 = r3.peek()
            X.627 r0 = (X.AnonymousClass627) r0
            X.2gu r1 = r0.getKeyframesAnimatable()
            if (r1 == 0) goto L_0x0199
            boolean r0 = r12 instanceof X.WKF
            if (r0 == 0) goto L_0x0037
            r1.E2p()
        L_0x0036:
            return r2
        L_0x0037:
            boolean r0 = r12 instanceof X.WKE
            if (r0 == 0) goto L_0x003f
            r1.pause()
            return r2
        L_0x003f:
            boolean r0 = r12 instanceof X.WKI
            java.lang.String r10 = "integrationPoint"
            if (r0 == 0) goto L_0x00b4
            X.WKI r12 = (X.WKI) r12
            X.0qQ.A0B(r12, r4)
            android.util.Pair r0 = r13.A02
            if (r0 == 0) goto L_0x00c0
            java.lang.Object r3 = r0.second
            X.GZ1 r3 = (X.GZ1) r3
            if (r3 == 0) goto L_0x00c0
            X.6L7 r11 = r13.A05
            if (r11 == 0) goto L_0x00c0
            java.util.Map r0 = r3.A01
            java.lang.String r1 = r12.A00
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L_0x00c0
            com.google.common.util.concurrent.ListenableFuture r0 = r13.A07
            if (r0 == 0) goto L_0x0069
            r0.cancel(r4)
        L_0x0069:
            r0 = 0
            r13.A07 = r0
            java.util.Map r0 = r3.A01
            java.lang.Object r0 = r0.get(r1)
            X.HkA r0 = (X.C55590HkA) r0
            if (r0 == 0) goto L_0x0099
            java.lang.String r15 = r0.A01
        L_0x0078:
            java.util.Map r1 = r3.A02
            X.621 r0 = r13.A0H
            boolean r0 = r0.CPR()
            if (r0 == 0) goto L_0x009b
            X.IjX r10 = new X.IjX
            r14 = r13
            r16 = r1
            r10.<init>(r11, r12, r13, r14, r15, r16)
            r3 = 731(0x2db, float:1.024E-42)
            X.0nO r1 = X.0nY.A00()
            X.EHj r0 = new X.EHj
            r0.<init>(r3, r10)
            r1.ATE(r0)
            return r2
        L_0x0099:
            r15 = 0
            goto L_0x0078
        L_0x009b:
            if (r15 == 0) goto L_0x0036
            r16 = r13
            r17 = r13
            r18 = r11
            r19 = r12
            r20 = r13
            r21 = r15
            r22 = r1
            r16.AUl(r17, r18, r19, r20, r21, r22)     // Catch:{ 3Vf -> 0x00b0 }
            goto L_0x0198
        L_0x00b0:
            r13.DIa()
            goto L_0x00c0
        L_0x00b4:
            boolean r0 = r12 instanceof X.WKD
            if (r0 == 0) goto L_0x00cc
            boolean r0 = r3.isEmpty()
            r0 = r0 ^ 1
        L_0x00be:
            if (r0 != 0) goto L_0x0036
        L_0x00c0:
            X.9J6 r0 = r13.A09
            if (r0 != 0) goto L_0x0199
            X.0qQ.A0F(r10)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x00cc:
            boolean r0 = r12 instanceof X.C14526Txm
            if (r0 == 0) goto L_0x0162
            X.Txm r12 = (X.C14526Txm) r12
            X.JSo r1 = r13.A04
            X.0qQ.A0B(r12, r4)
            X.6L8 r3 = r13.A06
            r15 = r24
            if (r3 == 0) goto L_0x0120
            java.lang.String r8 = r12.A00
            float r0 = r15.x
            int r6 = (int) r0
            float r0 = r15.y
            int r7 = (int) r0
            java.lang.String r0 = "type"
            X.0eP r9 = new X.0eP
            r9.<init>(r0, r8)
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String r0 = "x"
            X.0eP r8 = new X.0eP
            r8.<init>(r0, r6)
            java.lang.String r7 = java.lang.String.valueOf(r7)
            java.lang.String r6 = "y"
            X.0eP r0 = new X.0eP
            r0.<init>(r6, r7)
            X.0eP[] r0 = new X.0eP[]{r9, r8, r0}
            java.util.LinkedHashMap r18 = X.0Yt.A06(r0)
            java.lang.String r19 = "interaction_#"
            com.facebook.quicklog.QuickPerformanceLogger r0 = r3.A01
            long r21 = r0.currentMonotonicTimestampNanos()
            X.9Mv r0 = new X.9Mv
            r17 = r3
            r20 = r4
            r16 = r0
            r16.<init>(r17, r18, r19, r20, r21)
            X.AnonymousClass6L8.A01(r3, r0)
        L_0x0120:
            X.Hk9 r6 = r13.A03
            r16 = r25
            if (r6 == 0) goto L_0x0148
            X.JQA r3 = r6.A00
            if (r3 == 0) goto L_0x0148
            java.lang.String r1 = r12.A00
            java.lang.String r0 = r12.A01
            X.Hqm r14 = new X.Hqm
            r17 = r13
            r18 = r1
            r19 = r0
            r14.<init>(r15, r16, r17, r18, r19)
            int r1 = r5.intValue()
            if (r1 == r4) goto L_0x018e
            if (r1 == r2) goto L_0x0184
            r0 = 2
            if (r1 == r0) goto L_0x0036
            r3.DP1(r14)
            return r2
        L_0x0148:
            X.62E r14 = r13.A0M
            if (r14 == 0) goto L_0x00c0
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r5 != r0) goto L_0x00c0
            java.lang.Object r0 = r13.A08
            if (r0 == 0) goto L_0x00c0
            r17 = r13
            r19 = r12
            r20 = r0
            r18 = r1
            boolean r0 = r14.A00(r15, r16, r17, r18, r19, r20)
            goto L_0x00be
        L_0x0162:
            boolean r0 = r12 instanceof X.WKH
            if (r0 == 0) goto L_0x0036
            X.WKH r12 = (X.WKH) r12
            X.0qQ.A0B(r12, r4)
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x00c0
            java.lang.Object r3 = r3.peek()
            X.627 r3 = (X.AnonymousClass627) r3
            java.lang.String r1 = r12.A00
            X.WIL r0 = new X.WIL
            r0.<init>(r1)
            boolean r0 = r3.A00(r0)
            goto L_0x00be
        L_0x0184:
            java.lang.Integer r1 = r6.A01
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r1 != r0) goto L_0x0036
            r3.D2N(r14)
            return r2
        L_0x018e:
            java.lang.Integer r1 = r6.A01
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r1 != r0) goto L_0x0036
            r3.D20(r14)
            return r2
        L_0x0198:
            return r2
        L_0x0199:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass59L.DIT(android.graphics.PointF, android.graphics.RectF, X.X0q, java.lang.Integer):boolean");
    }

    public final void DIa() {
        C17894Vhl vhl = this.A0C;
        if (vhl != null) {
            vhl.A00 = ((AbstractCollection) vhl.A02.A00).size();
            vhl.A01 = C18402Vr4.A00;
        }
        Stack stack = this.A0P;
        if (stack.size() > 1) {
            stack.pop();
            C59669JSo jSo = this.A04;
            if (jSo != null) {
                jSo.Dkb();
            }
        }
        AnonymousClass6L9 r0 = this.A0J.A05;
        if (r0 != null) {
            C17850Vh3 vh3 = r0.A01;
            vh3.A00(r0.A00);
            vh3.A02.A01(new WIL("on_entry"));
        }
    }

    public final void Dyz() {
        AnonymousClass6L8 r0 = this.A06;
        if (r0 != null) {
            r0.A02();
            String str = this.A0E;
            if (str != null) {
                AnonymousClass6L8 r1 = this.A06;
                if (r1 != null) {
                    AnonymousClass6L8.A00(r1, "fully_enter_viewport", str);
                }
                this.A0G.Cgh(C306046Ko.A01(AnonymousClass05K.A00, str));
            } else {
                throw new NullPointerException("Logging Info for current fetch cannot be null");
            }
        }
        SparseArray clone = this.A0F.clone();
        0qQ.A07(clone);
        int size = clone.size();
        for (int i = 0; i < size; i++) {
            ((AnonymousClass65k) clone.valueAt(i)).DzZ(this.A05, this, 1.0f);
        }
    }

    public final void Dz8() {
        AnonymousClass6L8 r0 = this.A06;
        if (r0 != null) {
            r0.A03();
        }
        this.A0G.Cgh(C306046Ko.A00(AnonymousClass05K.A00));
    }

    public final void DzB() {
        AnonymousClass6L8 r0 = this.A06;
        if (r0 != null) {
            r0.A02();
            String str = this.A0E;
            if (str != null) {
                AnonymousClass6L8 r1 = this.A06;
                if (r1 != null) {
                    AnonymousClass6L8.A00(r1, "partially_enter_viewport", str);
                }
                this.A0G.Cgh(C306046Ko.A02(AnonymousClass05K.A00, str));
                return;
            }
            throw new NullPointerException("Logging Info for current fetch cannot be null");
        }
    }

    public final void E2p() {
        AnonymousClass6L7 r5 = this.A05;
        if (r5 != null) {
            SparseArray clone = this.A0F.clone();
            0qQ.A07(clone);
            int size = clone.size();
            for (int i = 0; i < size; i++) {
                ((AnonymousClass65k) clone.valueAt(i)).DXd(r5, this);
            }
        }
        C226492gu keyframesAnimatable = this.A0J.getKeyframesAnimatable();
        if (keyframesAnimatable != null) {
            if (keyframesAnimatable.BhR() != 0.0f) {
                keyframesAnimatable.EL2(0.0f);
            }
            keyframesAnimatable.E2p();
        }
        AnonymousClass6L7 r3 = this.A05;
        if (r3 != null) {
            SparseArray clone2 = this.A0F.clone();
            0qQ.A07(clone2);
            int size2 = clone2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ((AnonymousClass65k) clone2.valueAt(i2)).DXP(r3, this);
            }
        }
    }

    public final void EIx() {
        C3028065i r1;
        AnonymousClass6L7 r5 = this.A05;
        if (r5 != null) {
            SparseArray clone = this.A0F.clone();
            0qQ.A07(clone);
            int size = clone.size();
            for (int i = 0; i < size; i++) {
                ((AnonymousClass65k) clone.valueAt(i)).DXd(r5, this);
            }
        }
        AnonymousClass627 r2 = this.A0J;
        C226492gu keyframesAnimatable = r2.getKeyframesAnimatable();
        if (keyframesAnimatable != null) {
            keyframesAnimatable.E2p();
        }
        if (!(r2.A04 == null || r2.A07 == null || (r1 = r2.A06) == null)) {
            r1.A00 = 0sn.A00;
            r2.invalidate();
        }
        AnonymousClass6L7 r3 = this.A05;
        if (r3 != null) {
            SparseArray clone2 = this.A0F.clone();
            0qQ.A07(clone2);
            int size2 = clone2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ((AnonymousClass65k) clone2.valueAt(i2)).DXP(r3, this);
            }
        }
    }

    public final Object getAdModel() {
        return this.A08;
    }

    public final Map getAdditionalInteractiveModels() {
        return this.A0N;
    }

    public Collection getAllKeys() {
        return this.A0O.keySet();
    }

    public final Animator.AnimatorListener getAnimListener() {
        return this.A01;
    }

    public final AnonymousClass6L7 getAnimation() {
        return this.A05;
    }

    public final Pair getAnimationInteractiveModelPair() {
        return this.A02;
    }

    public final C65501LuP getAudioPlayer() {
        return null;
    }

    public final AnonymousClass62H getCarouselHandler() {
        return this.A0K;
    }

    public AnonymousClass621 getConfig() {
        return this.A0H;
    }

    public final String getCustomDebugId() {
        return this.A0D;
    }

    public String getDebugId() {
        String str = this.A0D;
        if (str != null) {
            return str;
        }
        String hexString = Integer.toHexString(hashCode());
        0qQ.A07(hexString);
        return hexString;
    }

    public final XFZ getDrawableProvider() {
        AnonymousClass9J6 r0;
        XFZ xfz = this.A0B;
        if (xfz != null) {
            return xfz;
        }
        AnonymousClass62C r2 = this.A0Q;
        if ((this.A05 == null && this.A09 == null) || (r0 = this.A09) == null) {
            0qQ.A0F("integrationPoint");
            throw AnonymousClass00P.createAndThrow();
        }
        String str = r0.A00;
        this.A0H.Az1();
        XFT A002 = r2.A00(str);
        this.A0B = A002;
        return A002;
    }

    public long getDurationSeconds() {
        return (long) this.A0J.getDuration();
    }

    public final AnonymousClass62D getExecutor() {
        return this.A0L;
    }

    public AnonymousClass627 getImageView() {
        return this.A0J;
    }

    public AnonymousClass9J6 getIntegrationPoint() {
        AnonymousClass9J6 r0 = this.A09;
        if (r0 != null) {
            return r0;
        }
        0qQ.A0F("integrationPoint");
        throw AnonymousClass00P.createAndThrow();
    }

    public final Map getInteractiveModelsCache() {
        return this.A0O;
    }

    public final AnonymousClass6LO getLoggingInfo() {
        return this.A0A;
    }

    public float getProgress() {
        return this.A0J.getProgress();
    }

    public final ImmutableMap getRenderingComponentInfos() {
        return this.A0J.getRenderingComponentInfos();
    }

    public final int getRepeatCount() {
        return this.A00;
    }

    public int getRepeatsRemaining() {
        return this.A0J.getRepeatsRemaining();
    }

    public AnonymousClass6LO getShowreelLoggingInfo() {
        return this.A0A;
    }

    public final boolean isPlaying() {
        C226492gu keyframesAnimatable = this.A0J.getKeyframesAnimatable();
        if (keyframesAnimatable != null) {
            return keyframesAnimatable.isPlaying();
        }
        return false;
    }

    public final void pause() {
        Map map;
        C3028065i r10;
        List<C71572e9> list;
        float f;
        float f2;
        AnonymousClass6L7 r4 = this.A05;
        if (r4 != null) {
            SparseArray clone = this.A0F.clone();
            0qQ.A07(clone);
            int size = clone.size();
            for (int i = 0; i < size; i++) {
                ((AnonymousClass65k) clone.valueAt(i)).DWS(r4, this);
            }
        }
        AnonymousClass627 r11 = this.A0J;
        C226492gu keyframesAnimatable = r11.getKeyframesAnimatable();
        if (keyframesAnimatable != null) {
            keyframesAnimatable.pause();
        }
        GZ0 gz0 = r11.A04;
        if (!(gz0 == null || (map = r11.A07) == null || (r10 = r11.A06) == null)) {
            Set keySet = map.keySet();
            0qQ.A0B(keySet, 1);
            C226492gu r12 = gz0.A00;
            ImmutableList.Builder builder = ImmutableList.builder();
            for (Object next : keySet) {
                Map map2 = ((AnonymousClass61R) r12).A02.A0F;
                if (!(map2 == null || (list = (List) map2.get(next)) == null)) {
                    for (C71572e9 r5 : list) {
                        Drawable drawable = (Drawable) r12;
                        0qQ.A0B(drawable, 0);
                        Rect bounds = drawable.getBounds();
                        0qQ.A07(bounds);
                        int width = bounds.width();
                        int height = bounds.height();
                        int width2 = r11.getWidth();
                        int height2 = r11.getHeight();
                        float f3 = 0.0f;
                        if (width * height2 > width2 * height) {
                            f = ((float) height2) / ((float) height);
                            f3 = (((float) width2) - (((float) width) * f)) * 0.5f;
                            f2 = 0.0f;
                        } else {
                            f = ((float) width2) / ((float) width);
                            f2 = (((float) height2) - (((float) height) * f)) * 0.5f;
                        }
                        RectF rectF = r5.A0A;
                        0qQ.A07(rectF);
                        float f4 = f3 / f;
                        float f5 = f2 / f;
                        builder.add(new RectF((rectF.left + f4) * f, (rectF.top + f5) * f, (rectF.right + f4) * f, (rectF.bottom + f5) * f));
                    }
                }
            }
            ImmutableList build = builder.build();
            0qQ.A07(build);
            r10.A00 = build;
            r11.invalidate();
        }
        AnonymousClass6L7 r3 = this.A05;
        if (r3 != null) {
            SparseArray clone2 = this.A0F.clone();
            0qQ.A07(clone2);
            int size2 = clone2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ((AnonymousClass65k) clone2.valueAt(i2)).DWU(r3, this);
            }
        }
    }

    public final void reset() {
        if (this.A09 == null) {
            0qQ.A0F("integrationPoint");
            throw AnonymousClass00P.createAndThrow();
        }
        hashCode();
        ColorDrawable colorDrawable = this.A00;
        if (colorDrawable != null) {
            this.A0J.setPlaceholderDrawable(colorDrawable);
        }
        ListenableFuture listenableFuture = this.A07;
        if (listenableFuture != null) {
            listenableFuture.cancel(false);
        }
        this.A07 = null;
        AnonymousClass6L7 r4 = this.A05;
        if (r4 != null) {
            SparseArray clone = this.A0F.clone();
            0qQ.A07(clone);
            int size = clone.size();
            for (int i = 0; i < size; i++) {
                ((AnonymousClass65k) clone.valueAt(i)).DzG(r4, this);
            }
        }
        this.A08 = null;
        this.A05 = null;
        AnonymousClass6L8 r0 = this.A06;
        if (r0 != null) {
            r0.A03();
        }
        this.A06 = null;
        this.A0A = null;
        this.A0E = null;
        this.A0N.clear();
        AnonymousClass62E r02 = this.A0M;
        if (r02 != null) {
            r02.A00.clear();
        }
        AnonymousClass627 r1 = this.A0J;
        r1.A05 = null;
        r1.A07 = null;
        r1.A03 = AnonymousClass59N.A01;
        C226492gu keyframesAnimatable = r1.getKeyframesAnimatable();
        if (keyframesAnimatable != null) {
            keyframesAnimatable.EDF();
        }
        r1.setImageDrawable((Drawable) null);
        AnonymousClass629 r12 = r1.A0C;
        r12.A02 = null;
        r12.A00 = null;
        r12.A01 = null;
        r12.A03 = AnonymousClass05K.A00;
    }

    public final void setInteractivityListener(JQA jqa) {
        this.A03 = new C55589Hk9(jqa, AnonymousClass05K.A00);
    }

    /* JADX WARNING: type inference failed for: r16v1, types: [X.62G, java.lang.Object] */
    public void setShowreelAnimation(AnonymousClass6L7 r23, AnonymousClass6LO r24, String str, List list, Object obj, Boolean bool, Animator.AnimatorListener animatorListener, AnonymousClass9J6 r30) {
        AnonymousClass62H r13;
        Runnable ijc;
        boolean CPR;
        AnonymousClass62H r0;
        AnonymousClass62H r8;
        String str2 = str;
        AnonymousClass6L7 r10 = r23;
        0qQ.A0B(r10, 0);
        List list2 = list;
        0qQ.A0B(list2, 3);
        AnonymousClass9J6 r02 = r30;
        if (r30 != null) {
            this.A09 = r02;
        }
        this.A01 = animatorListener;
        getIntegrationPoint();
        hashCode();
        AnonymousClass621 r2 = this.A0H;
        if (!r2.Erw() || !r10.equals(this.A05)) {
            this.A05 = r10;
            AnonymousClass6LO r9 = r24;
            this.A0A = r9;
            Object obj2 = obj;
            this.A08 = obj2;
            SparseArray clone = this.A0F.clone();
            0qQ.A07(clone);
            int size = clone.size();
            for (int i = 0; i < size; i++) {
                ((AnonymousClass65k) clone.valueAt(i)).DmK(r10);
            }
            ListenableFuture listenableFuture = this.A07;
            if (listenableFuture != null) {
                listenableFuture.cancel(false);
            }
            this.A07 = null;
            boolean z = true;
            if (list2.size() > 1) {
                z = false;
            }
            GZ1 A002 = A00(r10);
            if (A002 != null) {
                try {
                    ? obj3 = new Object();
                    AnonymousClass9J6 r03 = this.A09;
                    if (r03 == null) {
                        0qQ.A0F("integrationPoint");
                        throw AnonymousClass00P.createAndThrow();
                    }
                    C52510GVn A012 = obj3.A01(r9, r10, r03.A01, str2, true);
                    AnonymousClass6L8 A022 = ((AnonymousClass6OE) getDrawableProvider().A00).A02(A012, false);
                    C46574DhG.A00();
                    this.A06 = A022;
                    String str3 = A012.A05;
                    if (str3 == null) {
                        str3 = "";
                    }
                    this.A0E = str3;
                    if (!z && !CWX() && (r8 = this.A0K) != null) {
                        String str4 = getIntegrationPoint().A00;
                        String str5 = getIntegrationPoint().A01;
                        0qQ.A0B(str4, 0);
                        0qQ.A0B(str5, 1);
                        if (182.A06(0Tu.A05, AnonymousClass624.A00((AnonymousClass624) r8.A00), 36310778805551385L)) {
                            0nY.A00().ATE(new C47798EHj(857170603, new C57961IjG(r9, r10, r8, str5, str4)));
                        }
                    }
                    A04(r10, A002);
                    if (obj != null && r2.CVg() && (r0 = this.A0K) != null) {
                        r0.A00(r9, r10, this, this, obj2, list2);
                    }
                } catch (AnonymousClass92D e) {
                    A06("BaseShowreelMediaView", 002.A0R("setShowreelAnimation: ", e.getLocalizedMessage()));
                }
            } else {
                this.A0N.clear();
                ColorDrawable colorDrawable = this.A00;
                if (colorDrawable != null) {
                    this.A0J.setPlaceholderDrawable(colorDrawable);
                }
                if (z) {
                    if (str == null) {
                        str2 = "";
                    }
                    if (bool != null) {
                        CPR = bool.booleanValue();
                    } else {
                        CPR = r2.CPR();
                    }
                    if (CPR) {
                        ijc = new C57938Iit(r9, r10, this, str2);
                    } else {
                        try {
                            AUx(r9, r10, str2, true);
                            return;
                        } catch (C242623Vf e2) {
                            DCj(r10, e2);
                            return;
                        }
                    }
                } else if (obj != null && (r13 = this.A0K) != null) {
                    if (r13.A00.CPR()) {
                        ijc = new C57983Ijc(r9, r10, this, this, r13, obj2, list2);
                    } else {
                        AUx(r9, r10, (String) null, true);
                        r13.A00(r9, r10, this, this, obj2, list2);
                        return;
                    }
                } else {
                    return;
                }
                0nY.A00().ATE(new C47798EHj(730, ijc));
            }
        }
    }

    public final void stop() {
        C226492gu keyframesAnimatable = this.A0J.getKeyframesAnimatable();
        if (keyframesAnimatable != null) {
            keyframesAnimatable.EL2(0.0f);
            keyframesAnimatable.stop();
        }
        AnonymousClass6L7 r4 = this.A05;
        if (r4 != null) {
            SparseArray clone = this.A0F.clone();
            0qQ.A07(clone);
            int size = clone.size();
            for (int i = 0; i < size; i++) {
                ((AnonymousClass65k) clone.valueAt(i)).DnY(r4, this);
            }
        }
        DIa();
        A01();
    }

    public final void onDetachedFromWindow() {
        int A062 = AnonymousClass0fD.A06(1325996265);
        super.onDetachedFromWindow();
        AnonymousClass6L7 r4 = this.A05;
        if (r4 != null) {
            SparseArray clone = this.A0F.clone();
            0qQ.A07(clone);
            int size = clone.size();
            for (int i = 0; i < size; i++) {
                ((AnonymousClass65k) clone.valueAt(i)).DzG(r4, this);
            }
        }
        AnonymousClass0fD.A0D(263624437, A062);
    }

    public final void setAdModel(Object obj) {
        this.A08 = obj;
    }

    public final void setAnimListener(Animator.AnimatorListener animatorListener) {
        this.A01 = animatorListener;
    }

    public final void setAnimation(AnonymousClass6L7 r1) {
        this.A05 = r1;
    }

    public final void setAnimationInteractiveModelPair(Pair pair) {
        this.A02 = pair;
    }

    public final void setCustomDebugId(String str) {
        this.A0D = str;
    }

    public final void setLoggingInfo(AnonymousClass6LO r1) {
        this.A0A = r1;
    }

    public final void setRepeatCount(int i) {
        this.A00 = i;
    }

    @Deprecated(message = "Use the overload with ShowreelInteractivityListener instead")
    public void setInteractivityListener(C59669JSo jSo) {
        0qQ.A0B(jSo, 0);
        this.A04 = jSo;
    }
}
