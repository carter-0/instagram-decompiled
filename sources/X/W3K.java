package X;

import android.util.SparseBooleanArray;
import com.facebook.react.uimanager.ReactShadowNode;
import com.facebook.react.uimanager.ReactShadowNodeImpl;
import java.util.ArrayList;

public final class W3K {
    public final SparseBooleanArray A00 = new SparseBooleanArray();
    public final C17818VgX A01;
    public final C18592Vuj A02;

    public static void A00(W3K w3k, ReactShadowNode reactShadowNode) {
        ReactShadowNodeImpl reactShadowNodeImpl = (ReactShadowNodeImpl) reactShadowNode;
        int i = reactShadowNodeImpl.A00;
        SparseBooleanArray sparseBooleanArray = w3k.A00;
        if (!sparseBooleanArray.get(i)) {
            sparseBooleanArray.put(i, true);
            ReactShadowNodeImpl reactShadowNodeImpl2 = reactShadowNodeImpl.A09;
            int i2 = reactShadowNodeImpl.A04;
            int i3 = reactShadowNodeImpl.A05;
            while (reactShadowNodeImpl2 != null && reactShadowNodeImpl2.BVQ() != AnonymousClass05K.A00) {
                if (!reactShadowNodeImpl2.Cem()) {
                    i2 += Math.round(reactShadowNodeImpl2.BM0());
                    i3 += Math.round(reactShadowNodeImpl2.BM1());
                }
                reactShadowNodeImpl2 = reactShadowNodeImpl2.A09;
            }
            w3k.A04(reactShadowNode, i2, i3);
        }
    }

    public static void A01(W3K w3k, ReactShadowNode reactShadowNode, ReactShadowNode reactShadowNode2, int i) {
        int BVR = reactShadowNode.BVR(((ReactShadowNodeImpl) reactShadowNode).A06(i));
        Integer BVQ = reactShadowNode.BVQ();
        Integer num = AnonymousClass05K.A00;
        if (BVQ != num) {
            while (reactShadowNode.BVQ() != num) {
                ReactShadowNodeImpl reactShadowNodeImpl = ((ReactShadowNodeImpl) reactShadowNode).A09;
                if (reactShadowNodeImpl != null) {
                    BVR = BVR + (AnonymousClass7TF.A1W(reactShadowNode.BVQ(), AnonymousClass05K.A01) ? 1 : 0) + reactShadowNodeImpl.BVR(reactShadowNode);
                    reactShadowNode = reactShadowNodeImpl;
                } else {
                    return;
                }
            }
        }
        if (reactShadowNode2.BVQ() != AnonymousClass05K.A0C) {
            w3k.A06(reactShadowNode, reactShadowNode2, BVR);
        } else {
            w3k.A05(reactShadowNode, reactShadowNode2, BVR);
        }
    }

    public static void A02(W3K w3k, ReactShadowNode reactShadowNode, C17763VfZ vfZ) {
        int indexOf;
        ReactShadowNodeImpl reactShadowNodeImpl = (ReactShadowNodeImpl) reactShadowNode;
        ReactShadowNodeImpl reactShadowNodeImpl2 = reactShadowNodeImpl.A09;
        if (reactShadowNodeImpl2 == null) {
            reactShadowNode.EaK(false);
            return;
        }
        ArrayList arrayList = reactShadowNodeImpl2.A0F;
        if (arrayList == null) {
            indexOf = -1;
        } else {
            indexOf = arrayList.indexOf(reactShadowNodeImpl);
        }
        reactShadowNodeImpl2.EDR(indexOf);
        A03(w3k, reactShadowNode, false);
        reactShadowNode.EaK(false);
        C18592Vuj vuj = w3k.A02;
        QZL qzl = reactShadowNodeImpl.A0A;
        0Sd.A00(qzl);
        int i = reactShadowNodeImpl.A00;
        String str = reactShadowNodeImpl.A0E;
        0Sd.A00(str);
        vuj.A01(vfZ, qzl, str, i);
        reactShadowNodeImpl2.A83(reactShadowNode, indexOf);
        A01(w3k, reactShadowNodeImpl2, reactShadowNode, indexOf);
        for (int i2 = 0; i2 < reactShadowNode.AnH(); i2++) {
            A01(w3k, reactShadowNode, reactShadowNodeImpl.A06(i2), i2);
        }
        0Sd.A02(AnonymousClass7TF.A1P(reactShadowNodeImpl.A01));
        boolean z = true;
        SparseBooleanArray sparseBooleanArray = w3k.A00;
        sparseBooleanArray.size();
        if (sparseBooleanArray.size() != 0) {
            z = false;
        }
        0Sd.A02(z);
        A00(w3k, reactShadowNode);
        for (int i3 = 0; i3 < reactShadowNode.AnH(); i3++) {
            A00(w3k, reactShadowNodeImpl.A06(i3));
        }
        sparseBooleanArray.clear();
    }

    private void A06(ReactShadowNode reactShadowNode, ReactShadowNode reactShadowNode2, int i) {
        ReactShadowNodeImpl reactShadowNodeImpl = (ReactShadowNodeImpl) reactShadowNode;
        ReactShadowNodeImpl reactShadowNodeImpl2 = (ReactShadowNodeImpl) reactShadowNode2;
        Integer BVQ = reactShadowNodeImpl.BVQ();
        Integer num = AnonymousClass05K.A00;
        boolean z = true;
        0Sd.A02(AnonymousClass7TF.A1W(BVQ, num));
        if (reactShadowNodeImpl2.BVQ() == AnonymousClass05K.A0C) {
            z = false;
        }
        0Sd.A02(z);
        ArrayList arrayList = reactShadowNodeImpl.A0G;
        if (arrayList == null) {
            arrayList = new ArrayList(4);
            reactShadowNodeImpl.A0G = arrayList;
        }
        arrayList.add(i, reactShadowNodeImpl2);
        reactShadowNodeImpl2.A08 = reactShadowNodeImpl;
        C18592Vuj vuj = this.A02;
        int i2 = reactShadowNodeImpl.A00;
        vuj.A0F.add(new C15150USg(vuj, (int[]) null, (int[]) null, new C18600Vut[]{new C18600Vut(reactShadowNodeImpl2.A00, i)}, i2));
        if (reactShadowNode2.BVQ() != num) {
            A05(reactShadowNode, reactShadowNode2, i + 1);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x008e, code lost:
        if (r8.equals(r1) == false) goto L_0x001a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0094, code lost:
        if (r3.isNull(r1) != false) goto L_0x001f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0096, code lost:
        r4 = r3.getDouble(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00d6, code lost:
        if (r3.isNull("borderWidth") != false) goto L_0x001f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00d8, code lost:
        r4 = r3.getDouble("borderWidth");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00dc, code lost:
        r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00e5, code lost:
        if (r8.equals(r4) == false) goto L_0x001a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00ed, code lost:
        if (r3.getType(r4) != com.facebook.react.bridge.ReadableType.Number) goto L_0x001a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x00ef, code lost:
        r0 = r3.getInt(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x00f3, code lost:
        if (r0 != 0) goto L_0x001a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x001f, code lost:
        continue;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x001f, code lost:
        continue;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A07(X.C17763VfZ r10) {
        /*
            r2 = 1
            if (r10 == 0) goto L_0x010d
            java.lang.String r1 = "collapsable"
            com.facebook.react.bridge.ReadableMap r3 = r10.A00
            boolean r0 = r3.hasKey(r1)
            r10 = 0
            if (r0 == 0) goto L_0x001b
            boolean r0 = r3.isNull(r1)
            if (r0 != 0) goto L_0x001b
            boolean r0 = r3.getBoolean(r1)
            if (r0 != 0) goto L_0x001b
        L_0x001a:
            return r10
        L_0x001b:
            com.facebook.react.bridge.ReadableMapKeySetIterator r9 = r3.keySetIterator()
        L_0x001f:
            boolean r0 = r9.CKI()
            if (r0 == 0) goto L_0x010d
            java.lang.String r8 = r9.Crc()
            X.0qQ.A0B(r8, r2)
            java.util.HashSet r0 = X.C21950Xmf.A00
            boolean r0 = r0.contains(r8)
            if (r0 != 0) goto L_0x001f
            java.lang.String r0 = "pointerEvents"
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L_0x0051
            java.lang.String r1 = r3.getString(r8)
            java.lang.String r0 = "auto"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x001f
            java.lang.String r0 = "box-none"
        L_0x004a:
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x001a
            goto L_0x001f
        L_0x0051:
            int r0 = r8.hashCode()
            r6 = 0
            java.lang.String r5 = "borderWidth"
            switch(r0) {
                case -1989576717: goto L_0x005d;
                case -1971292586: goto L_0x0061;
                case -1470826662: goto L_0x0064;
                case -1452542531: goto L_0x0067;
                case -1308858324: goto L_0x006a;
                case -1290574193: goto L_0x006d;
                case -1267206133: goto L_0x0070;
                case -242276144: goto L_0x0085;
                case -223992013: goto L_0x0088;
                case 306963138: goto L_0x009b;
                case 529642498: goto L_0x00f7;
                case 684610594: goto L_0x009e;
                case 741115130: goto L_0x00a1;
                case 762983977: goto L_0x00df;
                case 1349188574: goto L_0x00a8;
                default: goto L_0x005c;
            }
        L_0x005c:
            return r10
        L_0x005d:
            java.lang.String r4 = "borderRightColor"
            goto L_0x00e1
        L_0x0061:
            java.lang.String r1 = "borderRightWidth"
            goto L_0x008a
        L_0x0064:
            java.lang.String r4 = "borderTopColor"
            goto L_0x00e1
        L_0x0067:
            java.lang.String r1 = "borderTopWidth"
            goto L_0x008a
        L_0x006a:
            java.lang.String r4 = "borderBottomColor"
            goto L_0x00e1
        L_0x006d:
            java.lang.String r1 = "borderBottomWidth"
            goto L_0x008a
        L_0x0070:
            java.lang.String r1 = "opacity"
            boolean r0 = r8.equals(r1)
            if (r0 == 0) goto L_0x001a
            boolean r0 = r3.isNull(r1)
            if (r0 != 0) goto L_0x001f
            double r4 = r3.getDouble(r1)
            r6 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            goto L_0x00dc
        L_0x0085:
            java.lang.String r4 = "borderLeftColor"
            goto L_0x00e1
        L_0x0088:
            java.lang.String r1 = "borderLeftWidth"
        L_0x008a:
            boolean r0 = r8.equals(r1)
            if (r0 == 0) goto L_0x001a
            boolean r0 = r3.isNull(r1)
            if (r0 != 0) goto L_0x001f
            double r4 = r3.getDouble(r1)
            goto L_0x00dc
        L_0x009b:
            java.lang.String r4 = "borderBlockStartColor"
            goto L_0x00e1
        L_0x009e:
            java.lang.String r4 = "borderBlockColor"
            goto L_0x00e1
        L_0x00a1:
            boolean r0 = r8.equals(r5)
            if (r0 != 0) goto L_0x00d2
            return r10
        L_0x00a8:
            java.lang.String r0 = "borderRadius"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x001a
            java.lang.String r4 = "backgroundColor"
            boolean r0 = r3.hasKey(r4)
            if (r0 == 0) goto L_0x00cc
            com.facebook.react.bridge.ReadableType r1 = r3.getType(r4)
            com.facebook.react.bridge.ReadableType r0 = com.facebook.react.bridge.ReadableType.Number
            if (r1 != r0) goto L_0x00c7
            int r0 = r3.getInt(r4)
            if (r0 == 0) goto L_0x00c7
            return r10
        L_0x00c7:
            com.facebook.react.bridge.ReadableType r0 = com.facebook.react.bridge.ReadableType.Null
            if (r1 == r0) goto L_0x00cc
            return r10
        L_0x00cc:
            boolean r0 = r3.hasKey(r5)
            if (r0 == 0) goto L_0x001f
        L_0x00d2:
            boolean r0 = r3.isNull(r5)
            if (r0 != 0) goto L_0x001f
            double r4 = r3.getDouble(r5)
        L_0x00dc:
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            goto L_0x00f3
        L_0x00df:
            java.lang.String r4 = "borderBlockEndColor"
        L_0x00e1:
            boolean r0 = r8.equals(r4)
            if (r0 == 0) goto L_0x001a
            com.facebook.react.bridge.ReadableType r1 = r3.getType(r4)
            com.facebook.react.bridge.ReadableType r0 = com.facebook.react.bridge.ReadableType.Number
            if (r1 != r0) goto L_0x001a
            int r0 = r3.getInt(r4)
        L_0x00f3:
            if (r0 != 0) goto L_0x001a
            goto L_0x001f
        L_0x00f7:
            java.lang.String r1 = "overflow"
            boolean r0 = r8.equals(r1)
            if (r0 == 0) goto L_0x001a
            boolean r0 = r3.isNull(r1)
            if (r0 != 0) goto L_0x001f
            java.lang.String r1 = r3.getString(r1)
            java.lang.String r0 = "visible"
            goto L_0x004a
        L_0x010d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.W3K.A07(X.VfZ):boolean");
    }

    public W3K(C17818VgX vgX, C18592Vuj vuj) {
        this.A02 = vuj;
        this.A01 = vgX;
    }

    public static void A03(W3K w3k, ReactShadowNode reactShadowNode, boolean z) {
        int[] iArr;
        if (reactShadowNode.BVQ() != AnonymousClass05K.A00) {
            for (int AnH = reactShadowNode.AnH() - 1; AnH >= 0; AnH--) {
                A03(w3k, ((ReactShadowNodeImpl) reactShadowNode).A06(AnH), z);
            }
        }
        ReactShadowNodeImpl reactShadowNodeImpl = (ReactShadowNodeImpl) reactShadowNode;
        ReactShadowNodeImpl reactShadowNodeImpl2 = reactShadowNodeImpl.A08;
        if (reactShadowNodeImpl2 != null) {
            0Sd.A00(reactShadowNodeImpl2.A0G);
            int indexOf = reactShadowNodeImpl2.A0G.indexOf(reactShadowNodeImpl);
            0Sd.A00(reactShadowNodeImpl2.A0G);
            ((ReactShadowNodeImpl) reactShadowNodeImpl2.A0G.remove(indexOf)).A08 = null;
            C18592Vuj vuj = w3k.A02;
            int i = reactShadowNodeImpl2.A00;
            int[] iArr2 = {indexOf};
            if (z) {
                iArr = new int[]{reactShadowNodeImpl.A00};
            } else {
                iArr = null;
            }
            vuj.A0F.add(new C15150USg(vuj, iArr2, iArr, (C18600Vut[]) null, i));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r2 = (com.facebook.react.uimanager.ReactShadowNodeImpl) r12;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A04(com.facebook.react.uimanager.ReactShadowNode r12, int r13, int r14) {
        /*
            r11 = this;
            java.lang.Integer r1 = r12.BVQ()
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            r7 = r13
            r8 = r14
            if (r1 == r0) goto L_0x0031
            r2 = r12
            com.facebook.react.uimanager.ReactShadowNodeImpl r2 = (com.facebook.react.uimanager.ReactShadowNodeImpl) r2
            com.facebook.react.uimanager.ReactShadowNodeImpl r1 = r2.A08
            if (r1 == 0) goto L_0x0031
            int r6 = r2.A00
            X.Vuj r3 = r11.A02
            com.facebook.react.uimanager.ReactShadowNodeImpl r0 = r2.A07
            if (r0 != 0) goto L_0x001a
            r0 = r1
        L_0x001a:
            int r5 = r0.A00
            int r9 = r2.A03
            int r10 = r2.A02
            X.3c8 r0 = r2.A0B
            X.3cB r4 = r0.getLayoutDirection()
            java.util.ArrayList r0 = r3.A0F
            X.USh r2 = new X.USh
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            r0.add(r2)
        L_0x0030:
            return
        L_0x0031:
            r4 = 0
        L_0x0032:
            int r0 = r12.AnH()
            if (r4 >= r0) goto L_0x0030
            r0 = r12
            com.facebook.react.uimanager.ReactShadowNodeImpl r0 = (com.facebook.react.uimanager.ReactShadowNodeImpl) r0
            com.facebook.react.uimanager.ReactShadowNodeImpl r3 = r0.A06(r4)
            int r2 = r3.A00
            android.util.SparseBooleanArray r1 = r11.A00
            boolean r0 = r1.get(r2)
            if (r0 != 0) goto L_0x0056
            r0 = 1
            r1.put(r2, r0)
            int r1 = r3.A04
            int r0 = r3.A05
            int r1 = r1 + r13
            int r0 = r0 + r14
            r11.A04(r3, r1, r0)
        L_0x0056:
            int r4 = r4 + 1
            goto L_0x0032
        */
        throw new UnsupportedOperationException("Method not decompiled: X.W3K.A04(com.facebook.react.uimanager.ReactShadowNode, int, int):void");
    }

    private void A05(ReactShadowNode reactShadowNode, ReactShadowNode reactShadowNode2, int i) {
        int size;
        int size2;
        0Sd.A02(C51969G9p.A1a(reactShadowNode2.BVQ(), AnonymousClass05K.A00));
        for (int i2 = 0; i2 < reactShadowNode2.AnH(); i2++) {
            ReactShadowNodeImpl A06 = ((ReactShadowNodeImpl) reactShadowNode2).A06(i2);
            0Sd.A02(DbW.A1a(A06.A08));
            ReactShadowNodeImpl reactShadowNodeImpl = (ReactShadowNodeImpl) reactShadowNode;
            ArrayList arrayList = reactShadowNodeImpl.A0G;
            if (arrayList == null) {
                size = 0;
            } else {
                size = arrayList.size();
            }
            if (A06.BVQ() == AnonymousClass05K.A0C) {
                A05(reactShadowNode, A06, i);
            } else {
                A06(reactShadowNode, A06, i);
            }
            ArrayList arrayList2 = reactShadowNodeImpl.A0G;
            if (arrayList2 == null) {
                size2 = 0;
            } else {
                size2 = arrayList2.size();
            }
            i += size2 - size;
        }
    }
}
