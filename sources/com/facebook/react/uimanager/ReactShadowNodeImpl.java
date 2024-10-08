package com.facebook.react.uimanager;

import X.002;
import X.0Sd;
import X.AnonymousClass05K;
import X.AnonymousClass2T1;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C17763VfZ;
import X.C18291VpF;
import X.C18592Vuj;
import X.C18715Vyl;
import X.C18764Vzz;
import X.C18936WDp;
import X.C244983c4;
import X.C244993c6;
import X.C245003c8;
import X.DbT;
import X.DbW;
import X.QZL;
import X.SBT;
import X.W3K;
import com.facebook.catalyst.views.art.ARTVirtualNode;
import com.facebook.react.views.text.ReactRawTextShadowNode;
import com.facebook.yoga.YogaNative;
import com.facebook.yoga.YogaNodeJNIBase;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

public class ReactShadowNodeImpl implements ReactShadowNode {
    public static final C244983c4 A0N = ((C244983c4) AnonymousClass7TE.A14(SBT.A00));
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06 = 0;
    public ReactShadowNodeImpl A07;
    public ReactShadowNodeImpl A08;
    public ReactShadowNodeImpl A09;
    public QZL A0A;
    public C245003c8 A0B;
    public Integer A0C;
    public Integer A0D;
    public String A0E;
    public ArrayList A0F;
    public ArrayList A0G;
    public boolean A0H;
    public boolean A0I = true;
    public boolean A0J;
    public final C18764Vzz A0K;
    public final float[] A0L;
    public final boolean[] A0M;

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x001e, code lost:
        if (X.C244163ak.A00(r3[r4]) != false) goto L_0x0020;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0051, code lost:
        if (X.C244163ak.A00(r3[8]) != false) goto L_0x0020;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x006d, code lost:
        if (X.C244163ak.A00(r3[8]) != false) goto L_0x0020;
     */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0088  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A03(com.facebook.react.uimanager.ReactShadowNodeImpl r6) {
        /*
            r4 = 0
        L_0x0001:
            r1 = 8
            if (r4 > r1) goto L_0x0090
            if (r4 == 0) goto L_0x0054
            r0 = 2
            if (r4 == r0) goto L_0x0054
            r0 = 4
            if (r4 == r0) goto L_0x0054
            r0 = 5
            if (r4 == r0) goto L_0x0054
            r0 = 1
            if (r4 == r0) goto L_0x0038
            r0 = 3
            if (r4 == r0) goto L_0x0038
            float[] r3 = r6.A0L
            r0 = r3[r4]
            boolean r0 = X.C244163ak.A00(r0)
            if (r0 == 0) goto L_0x0070
        L_0x0020:
            X.3c8 r1 = r6.A0B
            X.3ai r5 = X.C244143ai.A00(r4)
            X.Vzz r0 = r6.A0K
            float[] r0 = r0.A03
            r3 = r0[r4]
            com.facebook.yoga.YogaNodeJNIBase r1 = (com.facebook.yoga.YogaNodeJNIBase) r1
            long r1 = r1.mNativePointer
            int r0 = r5.A00
            com.facebook.yoga.YogaNative.jni_YGNodeStyleSetPaddingJNI(r1, r0, r3)
        L_0x0035:
            int r4 = r4 + 1
            goto L_0x0001
        L_0x0038:
            float[] r3 = r6.A0L
            r0 = r3[r4]
            boolean r0 = X.C244163ak.A00(r0)
            if (r0 == 0) goto L_0x0070
            r0 = 7
            r0 = r3[r0]
            boolean r0 = X.C244163ak.A00(r0)
            if (r0 == 0) goto L_0x0070
            r0 = r3[r1]
            boolean r0 = X.C244163ak.A00(r0)
            if (r0 == 0) goto L_0x0070
            goto L_0x0020
        L_0x0054:
            float[] r3 = r6.A0L
            r0 = r3[r4]
            boolean r0 = X.C244163ak.A00(r0)
            if (r0 == 0) goto L_0x0070
            r0 = 6
            r0 = r3[r0]
            boolean r0 = X.C244163ak.A00(r0)
            if (r0 == 0) goto L_0x0070
            r0 = r3[r1]
            boolean r0 = X.C244163ak.A00(r0)
            if (r0 == 0) goto L_0x0070
            goto L_0x0020
        L_0x0070:
            boolean[] r0 = r6.A0M
            boolean r2 = r0[r4]
            X.3c8 r1 = r6.A0B
            X.3ai r0 = X.C244143ai.A00(r4)
            r3 = r3[r4]
            com.facebook.yoga.YogaNodeJNIBase r1 = (com.facebook.yoga.YogaNodeJNIBase) r1
            if (r2 == 0) goto L_0x0088
            long r1 = r1.mNativePointer
            int r0 = r0.A00
            com.facebook.yoga.YogaNative.jni_YGNodeStyleSetPaddingPercentJNI(r1, r0, r3)
            goto L_0x0035
        L_0x0088:
            long r1 = r1.mNativePointer
            int r0 = r0.A00
            com.facebook.yoga.YogaNative.jni_YGNodeStyleSetPaddingJNI(r1, r0, r3)
            goto L_0x0035
        L_0x0090:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.uimanager.ReactShadowNodeImpl.A03(com.facebook.react.uimanager.ReactShadowNodeImpl):void");
    }

    public void A08(C18592Vuj vuj) {
    }

    public boolean A0A() {
        return false;
    }

    public boolean A0B() {
        return false;
    }

    public final void Cm6() {
        C245003c8 r2;
        this.A0I = false;
        if (A0D() && (r2 = this.A0B) != null) {
            YogaNodeJNIBase yogaNodeJNIBase = (YogaNodeJNIBase) r2;
            float[] fArr = yogaNodeJNIBase.arr;
            if (fArr != null) {
                fArr[0] = (float) (((int) fArr[0]) & -17);
            }
            yogaNodeJNIBase.mHasNewLayout = false;
        }
    }

    public void Cxt(W3K w3k) {
    }

    public void EcY(Object obj) {
    }

    public final ReactShadowNodeImpl A06(int i) {
        ArrayList arrayList = this.A0F;
        if (arrayList != null) {
            return (ReactShadowNodeImpl) arrayList.get(i);
        }
        throw new ArrayIndexOutOfBoundsException(002.A0c("Index ", " out of bounds: node has no children", i));
    }

    public void A07() {
        if (!this.A0I) {
            this.A0I = true;
            ReactShadowNodeImpl reactShadowNodeImpl = this.A09;
            if (reactShadowNodeImpl != null) {
                reactShadowNodeImpl.A07();
            }
        }
    }

    public final void A09(AnonymousClass2T1 r4) {
        YogaNodeJNIBase yogaNodeJNIBase = (YogaNodeJNIBase) this.A0B;
        yogaNodeJNIBase.mMeasureFunction = r4;
        YogaNative.jni_YGNodeSetHasMeasureFuncJNI(yogaNodeJNIBase.mNativePointer, AnonymousClass7TF.A1V(r4));
    }

    public boolean A0C() {
        return AnonymousClass7TF.A1V(((YogaNodeJNIBase) this.A0B).mMeasureFunction);
    }

    public final boolean A0D() {
        C245003c8 r0 = this.A0B;
        if (r0 == null) {
            return false;
        }
        YogaNodeJNIBase yogaNodeJNIBase = (YogaNodeJNIBase) r0;
        float[] fArr = yogaNodeJNIBase.arr;
        if (fArr != null) {
            if ((((int) fArr[0]) & 16) == 16) {
                return true;
            }
            return false;
        } else if (yogaNodeJNIBase.mHasNewLayout) {
            return true;
        } else {
            return false;
        }
    }

    public final /* bridge */ /* synthetic */ void A83(ReactShadowNode reactShadowNode, int i) {
        ReactShadowNodeImpl reactShadowNodeImpl = (ReactShadowNodeImpl) reactShadowNode;
        ArrayList arrayList = this.A0F;
        if (arrayList == null) {
            arrayList = new ArrayList(4);
            this.A0F = arrayList;
        }
        arrayList.add(i, reactShadowNodeImpl);
        reactShadowNodeImpl.A09 = this;
        C245003c8 r1 = this.A0B;
        if (r1 != null && !A0C()) {
            C245003c8 r0 = reactShadowNodeImpl.A0B;
            if (r0 != null) {
                r1.addChildAt(r0, i);
            } else {
                throw new RuntimeException(002.A11("Cannot add a child that doesn't have a YogaNode to a parent without a measure function! (Trying to add a '", reactShadowNodeImpl.toString(), "' to a '", toString(), "')"));
            }
        }
        A07();
        int A022 = A02(reactShadowNodeImpl);
        this.A06 += A022;
        A04(this, A022);
    }

    public final int AnH() {
        ArrayList arrayList = this.A0F;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    public final float BM0() {
        float[] fArr = ((YogaNodeJNIBase) this.A0B).arr;
        if (fArr != null) {
            return fArr[3];
        }
        return 0.0f;
    }

    public final float BM1() {
        float[] fArr = ((YogaNodeJNIBase) this.A0B).arr;
        if (fArr != null) {
            return fArr[4];
        }
        return 0.0f;
    }

    public final /* bridge */ /* synthetic */ int BVR(ReactShadowNode reactShadowNode) {
        ReactShadowNodeImpl reactShadowNodeImpl = (ReactShadowNodeImpl) reactShadowNode;
        int i = 0;
        for (int i2 = 0; i2 < AnH(); i2++) {
            ReactShadowNodeImpl A062 = A06(i2);
            if (reactShadowNodeImpl == A062) {
                return i;
            }
            i += A02(A062);
        }
        throw new RuntimeException(002.A02(reactShadowNodeImpl.A00, this.A00, "Child ", " was not a child of "));
    }

    public boolean Cem() {
        if ((this instanceof ReactRawTextShadowNode) || (this instanceof ARTVirtualNode)) {
            return true;
        }
        return false;
    }

    public final /* bridge */ /* synthetic */ ReactShadowNodeImpl EDR(int i) {
        ArrayList arrayList = this.A0F;
        if (arrayList != null) {
            ReactShadowNodeImpl reactShadowNodeImpl = (ReactShadowNodeImpl) arrayList.remove(i);
            reactShadowNodeImpl.A09 = null;
            C245003c8 r1 = this.A0B;
            if (r1 != null && !A0C()) {
                r1.removeChildAt(i);
            }
            A07();
            int A022 = A02(reactShadowNodeImpl);
            this.A06 -= A022;
            A04(this, -A022);
            return reactShadowNodeImpl;
        }
        throw new ArrayIndexOutOfBoundsException(002.A0c("Index ", " out of bounds: node has no children", i));
    }

    public final void EaK(boolean z) {
        boolean z2 = true;
        0Sd.A03(DbW.A1a(this.A09), "Must remove from no opt parent first");
        0Sd.A03(DbW.A1a(this.A08), "Must remove from native parent first");
        ArrayList arrayList = this.A0G;
        if (!(arrayList == null || arrayList.size() == 0)) {
            z2 = false;
        }
        0Sd.A03(z2, "Must remove all native children first");
        this.A0H = z;
    }

    public void EfF(int i, float f) {
        this.A0L[i] = f;
        this.A0M[i] = false;
        A03(this);
    }

    public void EoS(QZL qzl) {
        this.A0A = qzl;
    }

    public void dispose() {
        C245003c8 r2 = this.A0B;
        if (r2 != null) {
            YogaNodeJNIBase yogaNodeJNIBase = (YogaNodeJNIBase) r2;
            yogaNodeJNIBase.mMeasureFunction = null;
            yogaNodeJNIBase.mBaselineFunction = null;
            yogaNodeJNIBase.mData = null;
            yogaNodeJNIBase.arr = null;
            yogaNodeJNIBase.mHasNewLayout = true;
            yogaNodeJNIBase.mLayoutDirection = 0;
            YogaNative.jni_YGNodeResetJNI(yogaNodeJNIBase.mNativePointer);
            ((C18936WDp) C18291VpF.A00.getValue()).ECR(r2);
        }
    }

    public String toString() {
        return 002.A09(this.A00, "[", this.A0E, " ", "]");
    }

    public ReactShadowNodeImpl() {
        float[] fArr = new float[9];
        this.A0L = fArr;
        this.A0M = new boolean[9];
        this.A0K = new C18764Vzz(0.0f);
        if (!Cem()) {
            C245003c8 r1 = (C245003c8) ((C18936WDp) C18291VpF.A00.getValue()).A7A();
            r1 = r1 == null ? new C244993c6(A0N) : r1;
            this.A0B = r1;
            ((YogaNodeJNIBase) r1).mData = this;
            Arrays.fill(fArr, Float.NaN);
            return;
        }
        this.A0B = null;
    }

    public static int A02(ReactShadowNodeImpl reactShadowNodeImpl) {
        Integer BVQ = reactShadowNodeImpl.BVQ();
        if (BVQ == AnonymousClass05K.A0C) {
            return reactShadowNodeImpl.A06;
        }
        if (BVQ == AnonymousClass05K.A01) {
            return 1 + reactShadowNodeImpl.A06;
        }
        return 1;
    }

    public static void A04(ReactShadowNodeImpl reactShadowNodeImpl, int i) {
        Integer BVQ = reactShadowNodeImpl.BVQ();
        Integer num = AnonymousClass05K.A00;
        if (BVQ != num) {
            ReactShadowNodeImpl reactShadowNodeImpl2 = reactShadowNodeImpl.A09;
            while (reactShadowNodeImpl2 != null) {
                reactShadowNodeImpl2.A06 += i;
                if (reactShadowNodeImpl2.BVQ() != num) {
                    reactShadowNodeImpl2 = reactShadowNodeImpl2.A09;
                } else {
                    return;
                }
            }
        }
    }

    public Iterable AF0() {
        if (A0B()) {
            return null;
        }
        return this.A0F;
    }

    public final void APB() {
        if (!Cem()) {
            YogaNative.jni_YGNodeMarkDirtyJNI(((YogaNodeJNIBase) this.A0B).mNativePointer);
            return;
        }
        ReactShadowNodeImpl reactShadowNodeImpl = this.A09;
        if (reactShadowNodeImpl != null) {
            reactShadowNodeImpl.APB();
        }
    }

    public final Integer BVQ() {
        if (Cem() || this.A0H) {
            return AnonymousClass05K.A0C;
        }
        if (A0A()) {
            return AnonymousClass05K.A01;
        }
        return AnonymousClass05K.A00;
    }

    public final void FLF(C17763VfZ vfZ) {
        Class<?> cls = getClass();
        Map map = C18715Vyl.A00;
        ViewManagerPropertyUpdater$ShadowNodeSetter viewManagerPropertyUpdater$ShadowNodeSetter = (ViewManagerPropertyUpdater$ShadowNodeSetter) map.get(cls);
        if (viewManagerPropertyUpdater$ShadowNodeSetter == null) {
            viewManagerPropertyUpdater$ShadowNodeSetter = (ViewManagerPropertyUpdater$ShadowNodeSetter) C18715Vyl.A00(cls);
            if (viewManagerPropertyUpdater$ShadowNodeSetter == null) {
                viewManagerPropertyUpdater$ShadowNodeSetter = new ViewManagerPropertyUpdater$FallbackShadowNodeSetter(cls);
            }
            map.put(cls, viewManagerPropertyUpdater$ShadowNodeSetter);
        }
        Iterator entryIterator = vfZ.A00.getEntryIterator();
        while (entryIterator.hasNext()) {
            Map.Entry A1J = AnonymousClass7TE.A1J(entryIterator);
            viewManagerPropertyUpdater$ShadowNodeSetter.EhL(this, A1J.getValue(), DbT.A13(A1J));
        }
    }
}
