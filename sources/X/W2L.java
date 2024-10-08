package X;

import com.facebook.react.uimanager.ReactShadowNode;
import com.facebook.react.uimanager.ReactShadowNodeImpl;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.yoga.YogaNative;
import com.facebook.yoga.YogaNodeJNIBase;
import java.util.ArrayList;

public final class W2L {
    public long A00;
    public Object A01 = new Object();
    public final QZK A02;
    public final W3K A03;
    public final C17818VgX A04;
    public final C18592Vuj A05;
    public final W4T A06;
    public final C20877X2e A07;
    public final int[] A08;
    public volatile boolean A09;

    private void A00(ReactShadowNode reactShadowNode) {
        C245003c8 r0;
        ReactShadowNodeImpl reactShadowNodeImpl = (ReactShadowNodeImpl) reactShadowNode;
        if (reactShadowNodeImpl.A0I || reactShadowNodeImpl.A0D() || ((r0 = reactShadowNodeImpl.A0B) != null && YogaNative.jni_YGNodeIsDirtyJNI(((YogaNodeJNIBase) r0).mNativePointer))) {
            for (int i = 0; i < reactShadowNode.AnH(); i++) {
                A00(reactShadowNodeImpl.A06(i));
            }
            reactShadowNode.Cxt(this.A03);
        }
    }

    public static void A02(ReactShadowNode reactShadowNode, W2L w2l) {
        ReactShadowNodeImpl reactShadowNodeImpl = (ReactShadowNodeImpl) reactShadowNode;
        ArrayList arrayList = reactShadowNodeImpl.A0G;
        if (arrayList != null) {
            int size = arrayList.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                ((ReactShadowNodeImpl) arrayList.get(size)).A08 = null;
            }
            arrayList.clear();
        }
        C17818VgX vgX = w2l.A04;
        int i = reactShadowNodeImpl.A00;
        vgX.A02.A00();
        if (!vgX.A01.get(i)) {
            vgX.A00.remove(i);
            int AnH = reactShadowNode.AnH();
            while (true) {
                AnH--;
                if (AnH < 0) {
                    break;
                }
                A02(reactShadowNodeImpl.A06(AnH), w2l);
            }
            if (reactShadowNodeImpl.AnH() != 0) {
                int i2 = 0;
                int AnH2 = reactShadowNodeImpl.AnH();
                while (true) {
                    AnH2--;
                    if (AnH2 >= 0) {
                        C245003c8 r1 = reactShadowNodeImpl.A0B;
                        if (r1 != null && !reactShadowNodeImpl.A0C()) {
                            r1.removeChildAt(AnH2);
                        }
                        ReactShadowNodeImpl A062 = reactShadowNodeImpl.A06(AnH2);
                        A062.A09 = null;
                        i2 += ReactShadowNodeImpl.A02(A062);
                        A062.dispose();
                    } else {
                        ArrayList arrayList2 = reactShadowNodeImpl.A0F;
                        0Sd.A00(arrayList2);
                        arrayList2.clear();
                        reactShadowNodeImpl.A07();
                        reactShadowNodeImpl.A06 -= i2;
                        ReactShadowNodeImpl.A04(reactShadowNodeImpl, -i2);
                        return;
                    }
                }
            }
        } else {
            throw new QZA(002.A0c("Trying to remove root node ", " without using removeRootNode!", i));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00ff, code lost:
        if (r4 != r5.A02) goto L_0x0101;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A05(com.facebook.react.uimanager.ReactShadowNode r11, java.util.List r12, float r13, float r14) {
        /*
            r10 = this;
            r5 = r11
            com.facebook.react.uimanager.ReactShadowNodeImpl r5 = (com.facebook.react.uimanager.ReactShadowNodeImpl) r5
            boolean r0 = r5.A0I
            if (r0 != 0) goto L_0x001b
            boolean r0 = r5.A0D()
            if (r0 != 0) goto L_0x001b
            X.3c8 r0 = r5.A0B
            if (r0 == 0) goto L_0x0117
            com.facebook.yoga.YogaNodeJNIBase r0 = (com.facebook.yoga.YogaNodeJNIBase) r0
            long r0 = r0.mNativePointer
            boolean r0 = com.facebook.yoga.YogaNative.jni_YGNodeIsDirtyJNI(r0)
            if (r0 == 0) goto L_0x0117
        L_0x001b:
            boolean r0 = r5.A0D()
            if (r0 == 0) goto L_0x0081
            float r9 = r5.BM0()
            float r8 = r5.BM1()
            float r3 = r13 + r9
            int r7 = java.lang.Math.round(r3)
            float r2 = r14 + r8
            int r6 = java.lang.Math.round(r2)
            X.3c8 r0 = r5.A0B
            com.facebook.yoga.YogaNodeJNIBase r0 = (com.facebook.yoga.YogaNodeJNIBase) r0
            float[] r1 = r0.arr
            if (r1 == 0) goto L_0x00a7
            r0 = 1
            r0 = r1[r0]
        L_0x0040:
            float r3 = r3 + r0
            int r4 = java.lang.Math.round(r3)
            if (r1 == 0) goto L_0x00a5
            r0 = 2
            r0 = r1[r0]
        L_0x004a:
            float r2 = r2 + r0
            int r3 = java.lang.Math.round(r2)
            int r2 = java.lang.Math.round(r9)
            int r1 = java.lang.Math.round(r8)
            int r4 = r4 - r7
            int r3 = r3 - r6
            int r0 = r5.A04
            if (r2 != r0) goto L_0x0069
            int r0 = r5.A05
            if (r1 != r0) goto L_0x0069
            int r0 = r5.A03
            if (r4 != r0) goto L_0x0069
            int r0 = r5.A02
            if (r3 == r0) goto L_0x0081
        L_0x0069:
            boolean r0 = r5.A0J
            if (r0 == 0) goto L_0x0081
            X.VgX r2 = r10.A04
            int r1 = r5.A00
            X.VfY r0 = r2.A02
            r0.A00()
            android.util.SparseBooleanArray r0 = r2.A01
            boolean r0 = r0.get(r1)
            if (r0 != 0) goto L_0x0081
            r12.add(r11)
        L_0x0081:
            java.lang.Iterable r0 = r11.AF0()
            if (r0 == 0) goto L_0x00a9
            java.util.Iterator r3 = r0.iterator()
        L_0x008b:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x00a9
            java.lang.Object r2 = r3.next()
            com.facebook.react.uimanager.ReactShadowNode r2 = (com.facebook.react.uimanager.ReactShadowNode) r2
            float r1 = r11.BM0()
            float r1 = r1 + r13
            float r0 = r11.BM1()
            float r0 = r0 + r14
            r10.A05(r2, r12, r1, r0)
            goto L_0x008b
        L_0x00a5:
            r0 = 0
            goto L_0x004a
        L_0x00a7:
            r0 = 0
            goto L_0x0040
        L_0x00a9:
            X.Vuj r1 = r10.A05
            X.W3K r6 = r10.A03
            boolean r0 = r5.A0I
            if (r0 == 0) goto L_0x00b4
            r5.A08(r1)
        L_0x00b4:
            boolean r0 = r5.A0D()
            if (r0 == 0) goto L_0x010f
            float r3 = r5.BM0()
            float r2 = r5.BM1()
            float r13 = r13 + r3
            int r9 = java.lang.Math.round(r13)
            float r14 = r14 + r2
            int r8 = java.lang.Math.round(r14)
            X.3c8 r0 = r5.A0B
            com.facebook.yoga.YogaNodeJNIBase r0 = (com.facebook.yoga.YogaNodeJNIBase) r0
            float[] r1 = r0.arr
            if (r1 == 0) goto L_0x011a
            r0 = 1
            r0 = r1[r0]
        L_0x00d7:
            float r13 = r13 + r0
            int r7 = java.lang.Math.round(r13)
            if (r1 == 0) goto L_0x0118
            r0 = 2
            r0 = r1[r0]
        L_0x00e1:
            float r14 = r14 + r0
            int r4 = java.lang.Math.round(r14)
            int r3 = java.lang.Math.round(r3)
            int r2 = java.lang.Math.round(r2)
            int r7 = r7 - r9
            int r4 = r4 - r8
            int r0 = r5.A04
            if (r3 != r0) goto L_0x0101
            int r0 = r5.A05
            if (r2 != r0) goto L_0x0101
            int r0 = r5.A03
            if (r7 != r0) goto L_0x0101
            int r1 = r5.A02
            r0 = 0
            if (r4 == r1) goto L_0x0102
        L_0x0101:
            r0 = 1
        L_0x0102:
            r5.A04 = r3
            r5.A05 = r2
            r5.A03 = r7
            r5.A02 = r4
            if (r0 == 0) goto L_0x010f
            X.W3K.A00(r6, r5)
        L_0x010f:
            r11.Cm6()
            android.util.SparseBooleanArray r0 = r6.A00
            r0.clear()
        L_0x0117:
            return
        L_0x0118:
            r0 = 0
            goto L_0x00e1
        L_0x011a:
            r0 = 0
            goto L_0x00d7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.W2L.A05(com.facebook.react.uimanager.ReactShadowNode, java.util.List, float, float):void");
    }

    public W2L(QZK qzk, W4T w4t, C20877X2e x2e, int i) {
        C18592Vuj vuj = new C18592Vuj(qzk, new W0R(w4t), i);
        C17818VgX vgX = new C17818VgX();
        this.A04 = vgX;
        this.A08 = new int[4];
        this.A00 = 0;
        this.A09 = true;
        this.A02 = qzk;
        this.A06 = w4t;
        this.A05 = vuj;
        this.A03 = new W3K(vgX, vuj);
        this.A07 = x2e;
    }

    public static void A01(ReactShadowNode reactShadowNode, W2L w2l) {
        W4T w4t = w2l.A06;
        ReactShadowNodeImpl reactShadowNodeImpl = (ReactShadowNodeImpl) reactShadowNode;
        String str = reactShadowNodeImpl.A0E;
        0Sd.A00(str);
        ViewManager A002 = w4t.A00(str);
        0Sd.A00(A002);
        if (A002 instanceof X2Y) {
            X2Y x2y = (X2Y) A002;
            if (x2y != null && x2y.needsCustomLayoutForChildren()) {
                String str2 = reactShadowNodeImpl.A0E;
                0Sd.A00(str2);
                throw new QZA(002.A0g("Trying to measure a view using measureLayout/measureLayoutRelativeToParent relative to an ancestor that requires custom layout for it's children (", str2, "). Use measure instead."));
            }
            return;
        }
        String str3 = reactShadowNodeImpl.A0E;
        0Sd.A00(str3);
        throw new QZA(002.A0g("Trying to use view ", str3, " as a parent, but its Manager doesn't extends ViewGroupManager"));
    }

    public static void A03(W2L w2l) {
        C18592Vuj vuj = w2l.A05;
        if (vuj.A0F.isEmpty() && vuj.A0G.isEmpty()) {
            w2l.A04(-1);
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: type inference failed for: r0v66, types: [X.W0S] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A04(int r28) {
        /*
            r27 = this;
            r1 = 8192(0x2000, double:4.0474E-320)
            java.lang.String r0 = "UIImplementation.dispatchViewUpdates"
            X.0eu r7 = com.facebook.systrace.SystraceMessage.A00
            X.0et r0 = com.facebook.systrace.SystraceMessage.A00(r7, r0, r1)
            java.lang.String r6 = "batchId"
            r8 = r28
            r0.A01(r6, r8)
            r0.A02()
            long r19 = android.os.SystemClock.uptimeMillis()
            java.lang.String r10 = "rootTag"
            java.lang.String r3 = "UIImplementation.updateViewHierarchy"
            r0 = -2076598530(0xffffffff84399efe, float:-2.1819651E-36)
            X.0fc.A01(r1, r3, r0)     // Catch:{ all -> 0x01e9 }
            r9 = 0
        L_0x0023:
            r11 = r27
            X.VgX r5 = r11.A04     // Catch:{ all -> 0x01e1 }
            X.VfY r4 = r5.A02     // Catch:{ all -> 0x01e1 }
            r4.A00()     // Catch:{ all -> 0x01e1 }
            android.util.SparseBooleanArray r3 = r5.A01     // Catch:{ all -> 0x01e1 }
            int r0 = r3.size()     // Catch:{ all -> 0x01e1 }
            if (r9 >= r0) goto L_0x0132
            r4.A00()     // Catch:{ all -> 0x01e1 }
            int r0 = r3.keyAt(r9)     // Catch:{ all -> 0x01e1 }
            com.facebook.react.uimanager.ReactShadowNode r5 = r5.A00(r0)     // Catch:{ all -> 0x01e1 }
            r0 = r5
            com.facebook.react.uimanager.ReactShadowNodeImpl r0 = (com.facebook.react.uimanager.ReactShadowNodeImpl) r0     // Catch:{ all -> 0x01e1 }
            java.lang.Integer r0 = r0.A0D     // Catch:{ all -> 0x01e1 }
            if (r0 == 0) goto L_0x0112
            r0 = r5
            com.facebook.react.uimanager.ReactShadowNodeImpl r0 = (com.facebook.react.uimanager.ReactShadowNodeImpl) r0     // Catch:{ all -> 0x01e1 }
            java.lang.Integer r0 = r0.A0C     // Catch:{ all -> 0x01e1 }
            if (r0 == 0) goto L_0x0112
            java.lang.String r0 = "UIImplementation.notifyOnBeforeLayoutRecursive"
            X.0et r3 = com.facebook.systrace.SystraceMessage.A00(r7, r0, r1)     // Catch:{ all -> 0x01e1 }
            r0 = r5
            com.facebook.react.uimanager.ReactShadowNodeImpl r0 = (com.facebook.react.uimanager.ReactShadowNodeImpl) r0     // Catch:{ all -> 0x01e1 }
            int r0 = r0.A00     // Catch:{ all -> 0x01e1 }
            r3.A01(r10, r0)     // Catch:{ all -> 0x01e1 }
            r3.A02()     // Catch:{ all -> 0x01e1 }
            r11.A00(r5)     // Catch:{ all -> 0x0116 }
            r0 = 2053787268(0x7a6a4e84, float:3.0414749E35)
            X.0fc.A00(r1, r0)     // Catch:{ all -> 0x01e1 }
            java.lang.String r0 = "cssRoot.calculateLayout"
            X.0et r3 = com.facebook.systrace.SystraceMessage.A00(r7, r0, r1)     // Catch:{ all -> 0x01e1 }
            r12 = r5
            com.facebook.react.uimanager.ReactShadowNodeImpl r12 = (com.facebook.react.uimanager.ReactShadowNodeImpl) r12     // Catch:{ all -> 0x01e1 }
            int r0 = r12.A00     // Catch:{ all -> 0x01e1 }
            r3.A01(r10, r0)     // Catch:{ all -> 0x01e1 }
            r3.A02()     // Catch:{ all -> 0x01e1 }
            long r14 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x01e1 }
            java.lang.Integer r0 = r12.A0D     // Catch:{ all -> 0x0123 }
            int r3 = r0.intValue()     // Catch:{ all -> 0x0123 }
            java.lang.Integer r0 = r12.A0C     // Catch:{ all -> 0x0123 }
            int r13 = r0.intValue()     // Catch:{ all -> 0x0123 }
            int r0 = android.view.View.MeasureSpec.getMode(r3)     // Catch:{ all -> 0x0123 }
            r4 = 2143289344(0x7fc00000, float:NaN)
            if (r0 != 0) goto L_0x0093
            r3 = 2143289344(0x7fc00000, float:NaN)
            goto L_0x0098
        L_0x0093:
            int r0 = android.view.View.MeasureSpec.getSize(r3)     // Catch:{ all -> 0x0123 }
            float r3 = (float) r0     // Catch:{ all -> 0x0123 }
        L_0x0098:
            int r0 = android.view.View.MeasureSpec.getMode(r13)     // Catch:{ all -> 0x0123 }
            if (r0 == 0) goto L_0x00a3
            int r0 = android.view.View.MeasureSpec.getSize(r13)     // Catch:{ all -> 0x0123 }
            float r4 = (float) r0     // Catch:{ all -> 0x0123 }
        L_0x00a3:
            X.3c8 r0 = r12.A0B     // Catch:{ all -> 0x0123 }
            r0.calculateLayout(r3, r4)     // Catch:{ all -> 0x0123 }
            r0 = -1038463381(0xffffffffc21a4e6b, float:-38.57658)
            X.0fc.A00(r1, r0)     // Catch:{ all -> 0x01e1 }
            long r3 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x01e1 }
            long r3 = r3 - r14
            r11.A00 = r3     // Catch:{ all -> 0x01e1 }
            java.lang.String r0 = "UIImplementation.applyUpdatesRecursive"
            X.0et r3 = com.facebook.systrace.SystraceMessage.A00(r7, r0, r1)     // Catch:{ all -> 0x01e1 }
            r0 = r5
            com.facebook.react.uimanager.ReactShadowNodeImpl r0 = (com.facebook.react.uimanager.ReactShadowNodeImpl) r0     // Catch:{ all -> 0x01e1 }
            int r0 = r0.A00     // Catch:{ all -> 0x01e1 }
            r3.A01(r10, r0)     // Catch:{ all -> 0x01e1 }
            r3.A02()     // Catch:{ all -> 0x01e1 }
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x011b }
            r3.<init>()     // Catch:{ all -> 0x011b }
            r0 = 0
            r11.A05(r5, r3, r0, r0)     // Catch:{ all -> 0x011b }
            java.util.Iterator r16 = r3.iterator()     // Catch:{ all -> 0x011b }
        L_0x00d3:
            boolean r0 = r16.hasNext()     // Catch:{ all -> 0x011b }
            if (r0 == 0) goto L_0x010c
            java.lang.Object r0 = r16.next()     // Catch:{ all -> 0x011b }
            com.facebook.react.uimanager.ReactShadowNode r0 = (com.facebook.react.uimanager.ReactShadowNode) r0     // Catch:{ all -> 0x011b }
            X.X2e r15 = r11.A07     // Catch:{ all -> 0x011b }
            com.facebook.react.uimanager.ReactShadowNodeImpl r0 = (com.facebook.react.uimanager.ReactShadowNodeImpl) r0     // Catch:{ all -> 0x011b }
            int r14 = r0.A00     // Catch:{ all -> 0x011b }
            int r13 = r0.A04     // Catch:{ all -> 0x011b }
            int r12 = r0.A05     // Catch:{ all -> 0x011b }
            int r5 = r0.A03     // Catch:{ all -> 0x011b }
            int r4 = r0.A02     // Catch:{ all -> 0x011b }
            r3 = -1
            X.0l2 r0 = X.UTM.A04     // Catch:{ all -> 0x011b }
            java.lang.Object r0 = r0.A7A()     // Catch:{ all -> 0x011b }
            X.UTM r0 = (X.UTM) r0     // Catch:{ all -> 0x011b }
            if (r0 != 0) goto L_0x00fd
            X.UTM r0 = new X.UTM     // Catch:{ all -> 0x011b }
            r0.<init>()     // Catch:{ all -> 0x011b }
        L_0x00fd:
            r0.A0A(r3, r14)     // Catch:{ all -> 0x011b }
            r0.A02 = r13     // Catch:{ all -> 0x011b }
            r0.A03 = r12     // Catch:{ all -> 0x011b }
            r0.A01 = r5     // Catch:{ all -> 0x011b }
            r0.A00 = r4     // Catch:{ all -> 0x011b }
            r15.APe(r0)     // Catch:{ all -> 0x011b }
            goto L_0x00d3
        L_0x010c:
            r0 = -459719830(0xffffffffe4993b6a, float:-2.2613065E22)
            X.0fc.A00(r1, r0)     // Catch:{ all -> 0x01e1 }
        L_0x0112:
            int r9 = r9 + 1
            goto L_0x0023
        L_0x0116:
            r3 = move-exception
            r0 = -2012974344(0xffffffff880472f8, float:-3.985745E-34)
            goto L_0x011f
        L_0x011b:
            r3 = move-exception
            r0 = 853945950(0x32e62e5e, float:2.679661E-8)
        L_0x011f:
            X.0fc.A00(r1, r0)     // Catch:{ all -> 0x01e1 }
            throw r3     // Catch:{ all -> 0x01e1 }
        L_0x0123:
            r5 = move-exception
            r0 = -1346272845(0xffffffffafc181b3, float:-3.5198652E-10)
            X.0fc.A00(r1, r0)     // Catch:{ all -> 0x01e1 }
            long r3 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x01e1 }
            long r3 = r3 - r14
            r11.A00 = r3     // Catch:{ all -> 0x01e1 }
            throw r5     // Catch:{ all -> 0x01e1 }
        L_0x0132:
            r0 = -116617015(0xfffffffff90c90c9, float:-4.5616135E34)
            X.0fc.A00(r1, r0)     // Catch:{ all -> 0x01e9 }
            X.W3K r0 = r11.A03     // Catch:{ all -> 0x01e9 }
            android.util.SparseBooleanArray r0 = r0.A00     // Catch:{ all -> 0x01e9 }
            r0.clear()     // Catch:{ all -> 0x01e9 }
            X.Vuj r5 = r11.A05     // Catch:{ all -> 0x01e9 }
            long r9 = r11.A00     // Catch:{ all -> 0x01e9 }
            java.lang.String r0 = "UIViewOperationQueue.dispatchViewUpdates"
            X.0et r0 = com.facebook.systrace.SystraceMessage.A00(r7, r0, r1)     // Catch:{ all -> 0x01e9 }
            r0.A01(r6, r8)     // Catch:{ all -> 0x01e9 }
            r0.A02()     // Catch:{ all -> 0x01e9 }
            long r23 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x01dc }
            long r25 = android.os.SystemClock.currentThreadTimeMillis()     // Catch:{ all -> 0x01dc }
            java.util.ArrayList r12 = r5.A0G     // Catch:{ all -> 0x01dc }
            boolean r0 = r12.isEmpty()     // Catch:{ all -> 0x01dc }
            r4 = 0
            if (r0 != 0) goto L_0x017c
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x01dc }
            r0.<init>()     // Catch:{ all -> 0x01dc }
            r5.A0G = r0     // Catch:{ all -> 0x01dc }
        L_0x0167:
            java.util.ArrayList r11 = r5.A0F     // Catch:{ all -> 0x01dc }
            boolean r0 = r11.isEmpty()     // Catch:{ all -> 0x01dc }
            if (r0 != 0) goto L_0x017a
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x01dc }
            r0.<init>()     // Catch:{ all -> 0x01dc }
            r5.A0F = r0     // Catch:{ all -> 0x01dc }
        L_0x0176:
            java.lang.Object r3 = r5.A0O     // Catch:{ all -> 0x01dc }
            monitor-enter(r3)     // Catch:{ all -> 0x01dc }
            goto L_0x017e
        L_0x017a:
            r11 = r4
            goto L_0x0176
        L_0x017c:
            r12 = r4
            goto L_0x0167
        L_0x017e:
            java.util.ArrayDeque r0 = r5.A0D     // Catch:{ all -> 0x01d9 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x01d9 }
            if (r0 != 0) goto L_0x018f
            java.util.ArrayDeque r4 = r5.A0D     // Catch:{ all -> 0x01d9 }
            java.util.ArrayDeque r0 = new java.util.ArrayDeque     // Catch:{ all -> 0x01d9 }
            r0.<init>()     // Catch:{ all -> 0x01d9 }
            r5.A0D = r0     // Catch:{ all -> 0x01d9 }
        L_0x018f:
            monitor-exit(r3)     // Catch:{ all -> 0x01d9 }
            X.Wpv r0 = new X.Wpv     // Catch:{ all -> 0x01dc }
            r21 = r9
            r18 = r8
            r13 = r0
            r14 = r5
            r15 = r4
            r16 = r12
            r17 = r11
            r13.<init>(r14, r15, r16, r17, r18, r19, r21, r23, r25)     // Catch:{ all -> 0x01dc }
            java.lang.String r3 = "acquiring mDispatchRunnablesLock"
            X.0et r3 = com.facebook.systrace.SystraceMessage.A00(r7, r3, r1)     // Catch:{ all -> 0x01dc }
            r3.A01(r6, r8)     // Catch:{ all -> 0x01dc }
            r3.A02()     // Catch:{ all -> 0x01dc }
            java.lang.Object r4 = r5.A0N     // Catch:{ all -> 0x01dc }
            monitor-enter(r4)     // Catch:{ all -> 0x01dc }
            r3 = 477058621(0x1c6f563d, float:7.9189927E-22)
            X.0fc.A00(r1, r3)     // Catch:{ all -> 0x01d6 }
            java.util.ArrayList r3 = r5.A0E     // Catch:{ all -> 0x01d6 }
            r3.add(r0)     // Catch:{ all -> 0x01d6 }
            monitor-exit(r4)     // Catch:{ all -> 0x01d6 }
            boolean r0 = r5.A0H     // Catch:{ all -> 0x01dc }
            if (r0 != 0) goto L_0x01c9
            X.QZK r3 = r5.A0K     // Catch:{ all -> 0x01dc }
            X.US2 r0 = new X.US2     // Catch:{ all -> 0x01dc }
            r0.<init>(r3, r5)     // Catch:{ all -> 0x01dc }
            X.C18773W0w.A01(r0)     // Catch:{ all -> 0x01dc }
        L_0x01c9:
            r0 = -1983923452(0xffffffff89bfbb04, float:-4.6157446E-33)
            X.0fc.A00(r1, r0)     // Catch:{ all -> 0x01e9 }
            r0 = 221929086(0xd3a5e7e, float:5.7429416E-31)
            X.0fc.A00(r1, r0)
            return
        L_0x01d6:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x01d6 }
            goto L_0x01db
        L_0x01d9:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x01d9 }
        L_0x01db:
            throw r0     // Catch:{ all -> 0x01dc }
        L_0x01dc:
            r3 = move-exception
            r0 = -226478430(0xfffffffff28036a2, float:-5.0790564E30)
            goto L_0x01e5
        L_0x01e1:
            r3 = move-exception
            r0 = -872687533(0xffffffffcbfbd853, float:-3.300983E7)
        L_0x01e5:
            X.0fc.A00(r1, r0)     // Catch:{ all -> 0x01e9 }
            throw r3     // Catch:{ all -> 0x01e9 }
        L_0x01e9:
            r3 = move-exception
            r0 = 916237250(0x369cabc2, float:4.6691575E-6)
            X.0fc.A00(r1, r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.W2L.A04(int):void");
    }
}
