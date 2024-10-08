package X;

import android.graphics.Rect;
import android.util.SparseArray;
import com.facebook.rendercore.RenderTreeNode;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.3cx  reason: invalid class name and case insensitive filesystem */
public final class C245473cx {
    public static final C245473cx A00 = new Object();

    public static final RenderTreeNode A00(Rect rect, Rect rect2, Rect rect3, 2Tg r15, C245323cg r16, RenderTreeNode renderTreeNode, Object obj, boolean z) {
        int i;
        int i2;
        int i3 = 0;
        RenderTreeNode renderTreeNode2 = renderTreeNode;
        if (renderTreeNode != null) {
            i = renderTreeNode2.A00;
            i3 = renderTreeNode2.A01;
        } else {
            i = 0;
        }
        int i4 = rect.left - i;
        int i5 = rect.top - i3;
        Rect rect4 = new Rect(i4, i5, rect.width() + i4, rect.height() + i5);
        C245323cg r0 = r16;
        2Tk r1 = new 2Tk(rect3, obj, rect4.width(), rect4.height(), r0.A0C, r0.A0D, z);
        if (renderTreeNode != null) {
            i2 = ((List) renderTreeNode2.A08.getValue()).size();
        } else {
            i2 = 0;
        }
        return new RenderTreeNode(rect4, rect2, renderTreeNode2, r15, r1, i2);
    }

    public static final void A02(C245473cx r22, C245323cg r23, AnonymousClass2Ta r24) {
        int i;
        int i2;
        if (r24 != null) {
            i = r24.getWidth();
            i2 = r24.getHeight();
        } else {
            i = 0;
            i2 = 0;
        }
        C245323cg r3 = r23;
        2V1 r1 = r3.A0K;
        2T7 A002 = 2T7.A00(r1);
        2V1 A003 = 2V1.A00(A002, r1, AnonymousClass2VN.A00((C251263mp) null, A002, r1));
        StringBuilder sb = new StringBuilder();
        sb.append("root-host");
        sb.append("$host");
        String obj = sb.toString();
        0qQ.A0B(A003, 3);
        C245433ct r7 = new C245433ct((SparseArray) null, A002, A003, (2TG) null, obj, 0, 0, 2, 0);
        int i3 = i;
        int i4 = i2;
        r22.A03(r7, r3, (2VR) null, new RenderTreeNode(new Rect(0, 0, i, i2), (Rect) null, (RenderTreeNode) null, r7, new 2Tk((Rect) null, (Object) null, i3, i4, r3.A0C, r3.A0D, true), 0), (RenderTreeNode) null, 3);
    }

    private final void A03(2Tg r24, C245323cg r25, 2VR r26, RenderTreeNode renderTreeNode, RenderTreeNode renderTreeNode2, int i) {
        C245523d3 r2;
        int i2;
        RenderTreeNode renderTreeNode3 = renderTreeNode;
        RenderTreeNode renderTreeNode4 = renderTreeNode2;
        if (renderTreeNode2 != null) {
            ((List) renderTreeNode4.A08.getValue()).add(renderTreeNode3);
        }
        2Tg r8 = r24;
        C251263mp r9 = r8.A03;
        boolean z = r9 instanceof C251253mo;
        if (z && ((C251253mo) r9).A13() && r8.A0J() && renderTreeNode2 != null) {
            2T7 r1 = C245543d5.A00(renderTreeNode4).A03;
            0qQ.A0C(r1, "null cannot be cast to non-null type com.facebook.litho.HostComponent");
            r1.A01 = true;
        }
        C245323cg r5 = r25;
        List list = r5.A0Q;
        int size = list.size();
        Rect rect = new Rect();
        renderTreeNode3.A01(rect);
        boolean z2 = false;
        if (r8.A02(C245513d2.class) != null) {
            z2 = true;
        }
        2Tg r12 = renderTreeNode3.A06;
        long A0H = r12.A0H();
        boolean z3 = false;
        if (z2) {
            z3 = true;
        }
        if (renderTreeNode2 != null) {
            r2 = (C245523d3) r5.A0X.get(Long.valueOf(renderTreeNode4.A06.A0H()));
        } else {
            r2 = null;
        }
        C245523d3 r16 = new C245523d3(rect, r2, size, A0H, z3);
        if (z2) {
            r5.A0A = true;
        }
        list.add(renderTreeNode3);
        Long valueOf = Long.valueOf(A0H);
        r5.A0X.put(valueOf, r16);
        r5.A0P.add(r16);
        r5.A0O.add(r16);
        if ((z && ((C251253mo) r9).A10()) || r12.A0E()) {
            r5.A0a.add(valueOf);
        }
        if (r12 instanceof 2Tg) {
            0qQ.A0C(r12, "null cannot be cast to non-null type com.facebook.litho.LithoRenderUnit");
            2Tg r122 = r12;
            SparseArray sparseArray = r122.A02;
            if (sparseArray != null) {
                r5.A0W.put(Long.valueOf(r122.A01), new C245553d6(sparseArray, r122.A03, r122.A04));
            }
        }
        if (renderTreeNode2 == null && !((i2 = r5.A0E) == 0 && r5.A0F == 0)) {
            int i3 = r5.A0F;
            rect = new Rect(i2, i3, i2 + rect.width(), rect.height() + i3);
        }
        long j = r8.A01;
        int i4 = i;
        AnonymousClass2VT r82 = new AnonymousClass2VT(rect, r8.A05, r26, i4, j);
        r5.A0I.A09(A0H, r82);
        r5.A0J.A09(j, Integer.valueOf(size));
        2VS r0 = r5.A04;
        if (r0 != null) {
            r0.A03(i4, r82);
        }
    }

    public static final void A04(C245323cg r16) {
        2VR r3;
        String obj;
        String str;
        String str2;
        char c;
        C245323cg r9 = r16;
        2VS r4 = r9.A04;
        if (r4 != null && r4.A00 != 0 && (r3 = r9.A05) != null) {
            if (r3.A00 == 3) {
                Set set = r9.A0Z;
                if (!set.contains(r3)) {
                    Map map = r9.A0Y;
                    if (map.put(r3, r4) != null) {
                        map.remove(r3);
                        set.add(r3);
                    }
                }
            } else if (r9.A0Y.put(r3, r4) != null) {
                Integer num = AnonymousClass05K.A0C;
                StringBuilder sb = new StringBuilder();
                sb.append("The transitionId '");
                sb.append(r3);
                sb.append("' is defined multiple times in the same layout. TransitionIDs must be unique.\n                  Tree:\n                  ");
                2TR r6 = r9.A03;
                if (r6 == null) {
                    obj = "null";
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    LinkedList linkedList = new LinkedList();
                    linkedList.addLast((Object) null);
                    linkedList.addLast(r6);
                    int i = 0;
                    while (!linkedList.isEmpty()) {
                        2TR r2 = (2TR) linkedList.removeLast();
                        if (r2 == null) {
                            i--;
                        } else {
                            C251263mp A03 = r2.A03();
                            if (r2 != r6) {
                                sb2.append(10);
                                Iterator it = linkedList.iterator();
                                0qQ.A07(it);
                                it.next();
                                it.next();
                                int i2 = i - 1;
                                for (int i3 = 0; i3 < i2; i3++) {
                                    boolean z = false;
                                    if (it.next() == null) {
                                        z = true;
                                    } else {
                                        do {
                                        } while (it.next() != null);
                                    }
                                    if (z) {
                                        c = ' ';
                                    } else {
                                        c = "│";
                                    }
                                    sb2.append(c);
                                    sb2.append(' ');
                                }
                                if (linkedList.getLast() == null) {
                                    str2 = "└╴";
                                } else {
                                    str2 = "├╴";
                                }
                                sb2.append(str2);
                            }
                            sb2.append(A03.A0J());
                            boolean z2 = A03.A04;
                            if (z2 || !(((str = r2.A0Z) == null || str.length() == 0) && r2.A0Y == null)) {
                                sb2.append('[');
                                if (z2) {
                                    sb2.append("manual.key=\"");
                                    sb2.append(A03.A0K());
                                    sb2.append("\";");
                                }
                                String str3 = r2.A0Z;
                                if (!(str3 == null || str3.length() == 0)) {
                                    sb2.append("trans.key=\"");
                                    sb2.append(str3);
                                    sb2.append("\";");
                                }
                                String str4 = r2.A0Y;
                                if (str4 != null) {
                                    sb2.append("test.key=\"");
                                    sb2.append(str4);
                                    sb2.append("\";");
                                }
                                sb2.append(']');
                            }
                            if (r2.A0f.size() != 0) {
                                linkedList.addLast((Object) null);
                                for (int size = r2.A0f.size() - 1; -1 < size; size--) {
                                    linkedList.addLast(r2.A0f.get(size));
                                }
                                i++;
                            }
                        }
                    }
                    obj = sb2.toString();
                    0qQ.A07(obj);
                }
                sb.append(obj);
                sb.append("\n                  ");
                2W6.A01("LayoutState:DuplicateTransitionIds", num, 0rw.A0t(sb.toString()));
            }
            r9.A04 = null;
            r9.A05 = null;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: X.2Th} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: X.2Th} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r41v3, resolved type: com.facebook.rendercore.RenderTreeNode} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v5, resolved type: com.facebook.rendercore.RenderTreeNode} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r38v1, resolved type: com.facebook.rendercore.RenderTreeNode} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0313  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0373  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x039d  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x03c3  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x03ff  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x0405  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x0413  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x047e  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x0481  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x0487  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x048a  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x02db  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.2V1 r45, X.2Tf r46, X.2VF r47, X.C245473cx r48, X.C245323cg r49, X.AnonymousClass2Ta r50, com.facebook.rendercore.RenderTreeNode r51, int r52, int r53) {
        /*
            r34 = r47
            r18 = r51
            r4 = r46
            r14 = r53
            r15 = r52
            r53 = r45
            boolean r0 = r34.CU9()
            if (r0 != 0) goto L_0x049d
            r12 = r50
            boolean r0 = r12 instanceof X.AnonymousClass2TY
            if (r0 == 0) goto L_0x049d
            r0 = r12
            X.2TY r0 = (X.AnonymousClass2TY) r0
            r52 = r0
            X.3cC r2 = r0.A02
            boolean r0 = r2.A0F
            if (r0 != 0) goto L_0x049d
            X.2TR r0 = r52.A04()
            r42 = 0
            boolean r3 = r12 instanceof X.C245113cL
            r13 = 0
            r7 = 1
            r35 = r48
            r1 = r49
            if (r3 == 0) goto L_0x0085
            java.util.List r5 = r0.A0s
            int r0 = r5.size()
            if (r0 == r7) goto L_0x0045
            java.lang.Object r0 = r5.get(r7)
            X.2Vz r0 = (X.2Vz) r0
            X.2V1 r0 = r0.A04
            r53 = r0
        L_0x0045:
            X.2TY r3 = r2.A04
            if (r3 == 0) goto L_0x049d
            int r0 = r5.size()
            if (r0 <= r7) goto L_0x0069
            int r6 = r5.size()
        L_0x0053:
            if (r7 >= r6) goto L_0x0069
            java.lang.Object r2 = r5.get(r7)
            X.2Vz r2 = (X.2Vz) r2
            X.3mp r0 = r2.A03
            boolean r0 = r0 instanceof X.C251253mo
            if (r0 == 0) goto L_0x0066
            java.util.List r0 = r1.A0R
            r0.add(r2)
        L_0x0066:
            int r7 = r7 + 1
            goto L_0x0053
        L_0x0069:
            int r0 = r12.CGw(r13)     // Catch:{ Exception -> 0x0307 }
            int r15 = r15 + r0
            int r0 = r12.CHT(r13)     // Catch:{ Exception -> 0x0307 }
            int r14 = r14 + r0
            r32 = r53
            r33 = r4
            r36 = r1
            r37 = r3
            r38 = r18
            r39 = r15
            r40 = r14
            A01(r32, r33, r34, r35, r36, r37, r38, r39, r40)     // Catch:{ Exception -> 0x0307 }
            return
        L_0x0085:
            java.util.List r3 = r0.A0s
            r51 = r3
            java.lang.Object r6 = r3.get(r13)
            X.2Vz r6 = (X.2Vz) r6
            X.2V1 r3 = r6.A04
            r53 = r3
            X.3mp r5 = r6.A03
            r53.A08()
            X.2Te r3 = new X.2Te
            r3.<init>(r5, r6)
            if (r46 == 0) goto L_0x0198
            X.2Te r4 = (X.C70632Te) r4
            java.util.List r4 = r4.A0F
            r4.add(r3)
        L_0x00a6:
            if (r18 != 0) goto L_0x0194
            X.2TR r6 = r52.A04()
            X.2V1 r9 = r6.A05()
            X.2T7 r5 = X.2T7.A00(r9)
            java.util.List r4 = r6.A0s
            r8 = 0
            android.util.SparseArray r4 = X.2VP.A00(r4, r13)
            r5.A00 = r4
            int r10 = r6.A03
            r19 = r10
            boolean r10 = r6.A0m
            r17 = r10
            boolean r10 = r6.A0j
            r16 = r10
            boolean r10 = r6.A0p
            if (r10 != 0) goto L_0x00cf
            java.util.Map r8 = r6.A0g
        L_0x00cf:
            java.lang.String r10 = r6.A0A()
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r10)
            java.lang.String r10 = "$host"
            r11.append(r10)
            java.lang.String r24 = r11.toString()
            int r10 = r6.A03
            X.2Uu r23 = X.2VP.A04(r5, r9, r6, r10)
            r28 = 0
            r27 = 2
            r25 = r8
            r26 = r19
            r30 = r17
            r31 = r16
            r32 = r13
            r33 = r7
            r19 = r4
            r20 = r5
            r21 = r9
            r22 = r6
            X.2Tg r8 = X.2VP.A02(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r30, r31, r32, r33)
        L_0x0106:
            r20 = 0
            if (r8 == 0) goto L_0x010c
            r20 = 1
        L_0x010c:
            X.2VR r4 = r1.A05
            r50 = r4
            X.2VS r4 = r1.A04
            r49 = r4
            X.2VR r4 = r0.A0O
            if (r4 != 0) goto L_0x011b
            X.2VP.A03(r0)
        L_0x011b:
            X.2VR r4 = r0.A0O
            r1.A05 = r4
            r19 = 0
            if (r4 == 0) goto L_0x0191
            X.2VS r4 = new X.2VS
            r4.<init>()
        L_0x0128:
            r1.A04 = r4
            int r6 = r12.getWidth()
            int r6 = r6 + r15
            int r5 = r12.getHeight()
            int r5 = r5 + r14
            android.graphics.Rect r4 = new android.graphics.Rect
            r4.<init>(r15, r14, r6, r5)
            int r5 = r12.Ba9()
            if (r5 != 0) goto L_0x017b
            int r5 = r12.BaC()
            if (r5 != 0) goto L_0x017b
            int r5 = r12.BaB()
            if (r5 != 0) goto L_0x017b
            int r5 = r12.Ba8()
            if (r5 != 0) goto L_0x017b
            r6 = r19
        L_0x0153:
            if (r8 == 0) goto L_0x01cf
            boolean r5 = r0.A0p
            r37 = r19
            if (r5 != 0) goto L_0x015d
            r37 = r6
        L_0x015d:
            if (r5 == 0) goto L_0x019c
            X.2Ta r9 = r1.A08
            boolean r5 = r9 instanceof X.C245113cL
            if (r5 == 0) goto L_0x016b
            X.2TY r9 = (X.AnonymousClass2TY) r9
            X.3cC r5 = r9.A02
            X.2TY r9 = r5.A04
        L_0x016b:
            r5 = r52
            boolean r5 = r5.equals(r9)
            if (r5 != 0) goto L_0x019c
            java.lang.String r0 = "We shouldn't insert a host as a parent of a View"
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>(r0)
            throw r1
        L_0x017b:
            int r11 = r12.Ba9()
            int r10 = r12.BaC()
            int r9 = r12.BaB()
            int r5 = r12.Ba8()
            android.graphics.Rect r6 = new android.graphics.Rect
            r6.<init>(r11, r10, r9, r5)
            goto L_0x0153
        L_0x0191:
            r4 = r19
            goto L_0x0128
        L_0x0194:
            X.2Tg r8 = r2.A09
            goto L_0x0106
        L_0x0198:
            r1.A02 = r3
            goto L_0x00a6
        L_0x019c:
            android.graphics.Rect r38 = r52.A03()
            r36 = r4
            r39 = r8
            r40 = r1
            r41 = r18
            r43 = r7
            com.facebook.rendercore.RenderTreeNode r25 = A00(r36, r37, r38, r39, r40, r41, r42, r43)
            r3.A08 = r8
            r27 = 3
            X.2VR r5 = r1.A05
            r21 = r35
            r22 = r8
            r23 = r1
            r24 = r5
            r26 = r18
            r21.A03(r22, r23, r24, r25, r26, r27)
            java.util.List r8 = r1.A0Q
            int r5 = r8.size()
            int r5 = r5 - r7
            A04(r1)
            java.lang.Object r18 = r8.get(r5)
        L_0x01cf:
            r5 = r53
            X.3X5 r5 = r5.A02
            X.2Sa r5 = r5.A01
            boolean r5 = r5.A0Q
            r17 = r5
            java.lang.String r5 = "null cannot be cast to non-null type com.facebook.litho.LithoRenderUnit"
            if (r17 != 0) goto L_0x021e
            X.2Tg r9 = r2.A05
            if (r9 == 0) goto L_0x021e
            X.3cx r21 = A00
            r8 = r18
            com.facebook.rendercore.RenderTreeNode r8 = (com.facebook.rendercore.RenderTreeNode) r8
            r16 = r8
            android.graphics.Rect r43 = r52.A03()
            r8 = 0
            r41 = r4
            r44 = r9
            r45 = r1
            r46 = r16
            r47 = r8
            r48 = r7
            com.facebook.rendercore.RenderTreeNode r11 = A00(r41, r42, r43, r44, r45, r46, r47, r48)
            X.2Th r10 = r11.A06
            X.0qQ.A0C(r10, r5)
            r9 = r10
            X.2Tg r9 = (X.2Tg) r9
            if (r20 != 0) goto L_0x020a
            X.2VR r8 = r1.A05
        L_0x020a:
            r22 = r9
            r23 = r1
            r24 = r8
            r25 = r11
            r26 = r16
            r27 = r7
            r21.A03(r22, r23, r24, r25, r26, r27)
            X.0qQ.A0C(r10, r5)
            r3.A04 = r9
        L_0x021e:
            boolean r8 = r0.A0p
            r22 = r19
            if (r8 == 0) goto L_0x0226
            r22 = r6
        L_0x0226:
            android.graphics.Rect r23 = r52.A03()
            r6 = r18
            com.facebook.rendercore.RenderTreeNode r6 = (com.facebook.rendercore.RenderTreeNode) r6
            r18 = r6
            X.3mp r6 = r0.A03()
            java.lang.Integer r8 = r6.A0G()
            java.lang.Integer r6 = X.AnonymousClass05K.A00
            if (r8 == r6) goto L_0x0304
            boolean r6 = r2.A0F
            if (r6 != 0) goto L_0x0304
            X.2Tg r6 = r2.A07
            r16 = r6
            if (r6 == 0) goto L_0x0304
            java.lang.Object r27 = r12.BLp()
            r28 = 0
            int r11 = r4.left
            android.graphics.Rect r10 = r2.A0J
            int r6 = r10.left
            int r11 = r11 + r6
            int r9 = r4.top
            int r6 = r10.top
            int r9 = r9 + r6
            int r8 = r4.right
            int r6 = r10.right
            int r8 = r8 + r6
            int r6 = r4.bottom
            int r10 = r10.bottom
            int r6 = r6 + r10
            android.graphics.Rect r10 = new android.graphics.Rect
            r10.<init>(r11, r9, r8, r6)
            X.3mp r6 = r0.A03()
            boolean r6 = r6 instanceof X.C251253mo
            if (r6 == 0) goto L_0x027e
            X.3mp r8 = r0.A03()
            java.lang.String r6 = "null cannot be cast to non-null type com.facebook.litho.SpecGeneratedComponent"
            X.0qQ.A0C(r8, r6)
            X.3mo r8 = (X.C251253mo) r8
            boolean r28 = r8.A16()
        L_0x027e:
            r21 = r10
            r24 = r16
            r25 = r1
            r26 = r18
            com.facebook.rendercore.RenderTreeNode r6 = A00(r21, r22, r23, r24, r25, r26, r27, r28)
            X.2Th r9 = r6.A06
            X.0qQ.A0C(r9, r5)
            X.2Tg r9 = (X.2Tg) r9
            X.3cx r21 = A00
            if (r20 != 0) goto L_0x0301
            X.2VR r8 = r1.A05
        L_0x0297:
            r22 = r9
            r23 = r1
            r24 = r8
            r25 = r6
            r27 = r13
            r21.A03(r22, r23, r24, r25, r26, r27)
            r3.A06 = r9
        L_0x02a6:
            int r8 = r2.A01
            r3.A03 = r8
            int r8 = r2.A00
            r3.A00 = r8
            int r8 = r52.A02()
            r3.A02 = r8
            long r8 = r2.A02
            int r10 = (int) r8
            float r8 = java.lang.Float.intBitsToFloat(r10)
            int r8 = (int) r8
            r3.A01 = r8
            java.lang.Object r8 = r12.BLp()
            r3.A0C = r8
            X.2TR r8 = r52.A04()
            X.2WD r8 = r8.A0R
            r3.A0A = r8
            X.2Ta r8 = r2.A0A
            r3.A09 = r8
            r8 = r52
            java.util.List r11 = r8.A03
            int r10 = r11.size()
            r9 = 0
        L_0x02d9:
            if (r9 >= r10) goto L_0x030f
            java.lang.Object r8 = r11.get(r9)
            X.2TY r8 = (X.AnonymousClass2TY) r8
            int r13 = r12.CGw(r9)     // Catch:{ Exception -> 0x0307 }
            int r28 = r15 + r13
            int r13 = r12.CHT(r9)     // Catch:{ Exception -> 0x0307 }
            int r29 = r14 + r13
            r21 = r53
            r22 = r3
            r23 = r34
            r24 = r35
            r25 = r1
            r26 = r8
            r27 = r18
            A01(r21, r22, r23, r24, r25, r26, r27, r28, r29)     // Catch:{ Exception -> 0x0307 }
            int r9 = r9 + 1
            goto L_0x02d9
        L_0x0301:
            r8 = r19
            goto L_0x0297
        L_0x0304:
            r6 = r42
            goto L_0x02a6
        L_0x0307:
            r1 = move-exception
            r0 = r53
            X.3cy r0 = X.2Vb.A00(r0, r1)
            throw r0
        L_0x030f:
            X.2Tg r9 = r2.A06
            if (r9 == 0) goto L_0x034a
            X.3cx r21 = A00
            android.graphics.Rect r43 = r52.A03()
            r27 = 4
            r8 = 0
            r41 = r4
            r44 = r9
            r45 = r1
            r46 = r18
            r47 = r8
            r48 = r7
            com.facebook.rendercore.RenderTreeNode r11 = A00(r41, r42, r43, r44, r45, r46, r47, r48)
            X.2Th r10 = r11.A06
            X.0qQ.A0C(r10, r5)
            r9 = r10
            X.2Tg r9 = (X.2Tg) r9
            if (r20 != 0) goto L_0x0338
            X.2VR r8 = r1.A05
        L_0x0338:
            r22 = r9
            r23 = r1
            r24 = r8
            r25 = r11
            r26 = r18
            r21.A03(r22, r23, r24, r25, r26, r27)
            X.0qQ.A0C(r10, r5)
            r3.A05 = r9
        L_0x034a:
            if (r17 != 0) goto L_0x0383
            X.2Tg r8 = r2.A08
            if (r8 == 0) goto L_0x0383
            X.3cx r10 = A00
            android.graphics.Rect r43 = r52.A03()
            r16 = 2
            r2 = 0
            r41 = r4
            r44 = r8
            r45 = r1
            r46 = r18
            r47 = r2
            r48 = r7
            com.facebook.rendercore.RenderTreeNode r9 = A00(r41, r42, r43, r44, r45, r46, r47, r48)
            X.2Th r8 = r9.A06
            X.0qQ.A0C(r8, r5)
            r7 = r8
            X.2Tg r7 = (X.2Tg) r7
            if (r20 != 0) goto L_0x0375
            X.2VR r2 = r1.A05
        L_0x0375:
            r11 = r7
            r12 = r1
            r13 = r2
            r14 = r9
            r15 = r18
            r10.A03(r11, r12, r13, r14, r15, r16)
            X.0qQ.A0C(r8, r5)
            r3.A07 = r7
        L_0x0383:
            X.2Sg r10 = r0.A0K
            if (r10 != 0) goto L_0x039b
            X.2Sg r2 = r0.A0F
            if (r2 != 0) goto L_0x039b
            X.2Sg r2 = r0.A0I
            if (r2 != 0) goto L_0x039b
            X.2Sg r2 = r0.A0G
            if (r2 != 0) goto L_0x039b
            X.2Sg r2 = r0.A0H
            if (r2 != 0) goto L_0x039b
            X.2Sg r2 = r0.A0J
            if (r2 == 0) goto L_0x03ef
        L_0x039b:
            if (r6 != 0) goto L_0x0487
            r2 = r19
            if (r20 == 0) goto L_0x03a3
            r2 = r18
        L_0x03a3:
            X.2Sg r14 = r0.A0F
            X.2Sg r13 = r0.A0I
            X.2Sg r12 = r0.A0G
            X.2Sg r11 = r0.A0H
            X.2Sg r9 = r0.A0J
            X.3mp r5 = r0.A03()
            java.lang.String r28 = r0.A0A()
            java.lang.String r29 = r5.A0J()
            X.0qQ.A07(r29)
            android.graphics.Rect r8 = new android.graphics.Rect
            r8.<init>(r4)
            if (r2 == 0) goto L_0x0481
            r34 = 1
            X.2Th r2 = r2.A06
            long r32 = r2.A0H()
        L_0x03cb:
            float r7 = r0.A00
            float r5 = r0.A01
            X.3d7 r2 = new X.3d7
            r22 = r10
            r23 = r11
            r24 = r14
            r25 = r13
            r26 = r12
            r27 = r9
            r30 = r7
            r31 = r5
            r20 = r2
            r21 = r8
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r34)
            java.util.List r5 = r1.A0T
            r5.add(r2)
            r3.A0B = r2
        L_0x03ef:
            java.util.List r10 = r1.A0S
            if (r10 == 0) goto L_0x042d
            java.lang.String r2 = r0.A0Y
            if (r2 == 0) goto L_0x042d
            int r2 = r2.length()
            if (r2 == 0) goto L_0x042d
            if (r6 == 0) goto L_0x047e
            X.2Th r3 = r6.A06
        L_0x0401:
            boolean r2 = r3 instanceof X.2Tg
            if (r2 == 0) goto L_0x040a
            r2 = r3
            X.2Tg r2 = (X.2Tg) r2
            r19 = r2
        L_0x040a:
            X.Rty r9 = new X.Rty
            r9.<init>()
            java.lang.String r2 = r0.A0Y
            if (r2 == 0) goto L_0x048a
            r9.A01 = r2
            int r8 = r4.left
            int r7 = r4.top
            int r5 = r4.right
            int r3 = r4.bottom
            android.graphics.Rect r2 = r9.A02
            r2.set(r8, r7, r5, r3)
            if (r19 == 0) goto L_0x042a
            r2 = r19
            long r2 = r2.A01
            r9.A00 = r2
        L_0x042a:
            r10.add(r9)
        L_0x042d:
            if (r6 == 0) goto L_0x0437
            android.graphics.Rect r4 = new android.graphics.Rect
            r4.<init>()
            r6.A01(r4)
        L_0x0437:
            int r7 = r51.size()
            r6 = 0
        L_0x043c:
            if (r6 >= r7) goto L_0x0492
            r2 = r51
            java.lang.Object r2 = r2.get(r6)
            X.2Vz r2 = (X.2Vz) r2
            X.3mp r9 = r2.A03
            java.lang.String r8 = r0.A0B(r6)
            r2 = r51
            java.lang.Object r2 = r2.get(r6)
            X.2Vz r2 = (X.2Vz) r2
            X.2V1 r5 = r2.A04
            boolean r2 = r9 instanceof X.C251253mo
            if (r2 == 0) goto L_0x0464
            java.util.List r3 = r1.A0R
            X.2Vz r2 = r5.A05
            r2.getClass()
            r3.add(r2)
        L_0x0464:
            android.graphics.Rect r5 = new android.graphics.Rect
            r5.<init>(r4)
            java.util.Map r2 = r1.A0V
            r2.put(r8, r5)
            X.2VW r2 = r9.A01
            if (r2 == 0) goto L_0x047b
            X.2VW r3 = r9.A01
            if (r3 == 0) goto L_0x047b
            java.util.Map r2 = r1.A0U
            r2.put(r3, r5)
        L_0x047b:
            int r6 = r6 + 1
            goto L_0x043c
        L_0x047e:
            r3 = r19
            goto L_0x0401
        L_0x0481:
            r34 = 0
            r32 = 0
            goto L_0x03cb
        L_0x0487:
            r2 = r6
            goto L_0x03a3
        L_0x048a:
            java.lang.String r0 = "Required value was null."
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        L_0x0492:
            A04(r1)
            r0 = r50
            r1.A05 = r0
            r0 = r49
            r1.A04 = r0
        L_0x049d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C245473cx.A01(X.2V1, X.2Tf, X.2VF, X.3cx, X.3cg, X.2Ta, com.facebook.rendercore.RenderTreeNode, int, int):void");
    }
}
