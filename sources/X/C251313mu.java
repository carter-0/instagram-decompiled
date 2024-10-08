package X;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Pair;
import android.util.SparseArray;
import android.view.View;
import com.facebook.rendercore.RenderTreeNode;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.Map;
import java.util.Set;

/* renamed from: X.3mu  reason: invalid class name and case insensitive filesystem */
public final class C251313mu extends C251323mv implements C251333mw {
    public static final C251313mu A00 = new Object();

    public final void A0C(C245753dQ r3) {
        0qQ.A0B(r3, 0);
        C245773dS r1 = (C245773dS) r3.A02;
        r1.A01 = r1.A02;
        r1.A02 = null;
    }

    public final void ADA(RenderTreeNode renderTreeNode, C245753dQ r2, int i) {
    }

    public final void Cz0(2Th r1, C245753dQ r2, Object obj, Object obj2, boolean z) {
    }

    public final void DSP(2Th r1, C245753dQ r2, Object obj, Object obj2) {
    }

    public final void Dv4(2Th r1, C245753dQ r2, Object obj, Object obj2) {
    }

    public final boolean Eti(2Th r2, 2Th r3, C245753dQ r4, Object obj, Object obj2) {
        return true;
    }

    public final /* bridge */ /* synthetic */ Object A0A() {
        return new C245773dS();
    }

    public final /* bridge */ /* synthetic */ void A0B(Rect rect, C245753dQ r4, Object obj) {
        Map map;
        2T4 r5 = (2T4) obj;
        0qQ.A0B(r4, 0);
        C245773dS r1 = (C245773dS) r4.A02;
        r1.A02 = r1.A00;
        if (r5 != null) {
            map = r5.A0V;
        } else {
            map = null;
        }
        r1.A00 = map;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002a, code lost:
        if ((r15 instanceof android.view.View) == false) goto L_0x002c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Cy6(X.2Th r13, X.C245753dQ r14, java.lang.Object r15, java.lang.Object r16) {
        /*
            r12 = this;
            java.lang.Object r3 = r14.A02
            X.3dS r3 = (X.C245773dS) r3
            java.util.Map r2 = r3.A00
            if (r2 == 0) goto L_0x0033
            long r0 = r13.A0H()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.Object r0 = r2.get(r0)
            X.3d6 r0 = (X.C245553d6) r0
            if (r0 == 0) goto L_0x0033
            X.2UY r9 = r3.A03
            X.3mp r8 = r0.A01
            X.2V1 r10 = r0.A02
            android.util.SparseArray r7 = r0.A00
            r11 = 0
            int r0 = r7.size()
            if (r0 == 0) goto L_0x002c
            boolean r0 = r15 instanceof android.view.View
            r1 = 1
            if (r0 != 0) goto L_0x0034
        L_0x002c:
            r1 = 0
            boolean r0 = X.C245783dT.A01(r8)
            if (r0 != 0) goto L_0x0034
        L_0x0033:
            return
        L_0x0034:
            java.util.HashSet r6 = new java.util.HashSet
            r6.<init>()
            r5 = 0
            if (r1 == 0) goto L_0x0064
            int r4 = r7.size()
            r3 = 0
        L_0x0041:
            if (r3 >= r4) goto L_0x0064
            int r2 = r7.keyAt(r3)
            java.lang.Object r1 = r7.valueAt(r3)
            X.2V5 r1 = (X.2V5) r1
            X.0qQ.A0A(r1)
            r0 = r15
            android.view.View r0 = (android.view.View) r0
            X.C245783dT.A00(r0, r1, r2)
            android.util.Pair r0 = new android.util.Pair
            r0.<init>(r8, r7)
            X.AnonymousClass2UY.A00(r0, r9, r1)
            r6.add(r1)
            int r3 = r3 + 1
            goto L_0x0041
        L_0x0064:
            boolean r0 = r8 instanceof X.C251253mo
            if (r0 == 0) goto L_0x0095
            r0 = r8
            X.3mo r0 = (X.C251253mo) r0
            X.2V5[] r4 = r0.A19()
        L_0x006f:
            int r3 = r4.length
        L_0x0070:
            if (r5 >= r3) goto L_0x00a3
            r2 = r4[r5]
            r1 = r8
            X.3mo r1 = (X.C251253mo) r1     // Catch:{ Exception -> 0x008c }
            if (r2 == 0) goto L_0x008a
            java.lang.Object r0 = r2.A00     // Catch:{ Exception -> 0x008c }
        L_0x007b:
            r1.A0h(r5, r0, r15)     // Catch:{ Exception -> 0x008c }
            android.util.Pair r0 = new android.util.Pair     // Catch:{ Exception -> 0x008c }
            r0.<init>(r8, r7)     // Catch:{ Exception -> 0x008c }
            X.AnonymousClass2UY.A00(r0, r9, r2)     // Catch:{ Exception -> 0x008c }
            r6.add(r2)     // Catch:{ Exception -> 0x008c }
            goto L_0x0092
        L_0x008a:
            r0 = 0
            goto L_0x007b
        L_0x008c:
            r1 = move-exception
            if (r10 == 0) goto L_0x0098
            X.2Vb.A03(r10, r1)
        L_0x0092:
            int r5 = r5 + 1
            goto L_0x0070
        L_0x0095:
            X.2V5[] r4 = new X.2V5[r11]
            goto L_0x006f
        L_0x0098:
            boolean r0 = r1 instanceof java.lang.RuntimeException
            if (r0 == 0) goto L_0x009d
            throw r1
        L_0x009d:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x00a3:
            java.util.Map r0 = r9.A00
            r0.put(r8, r6)
            java.util.Map r0 = r9.A01
            r0.put(r8, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C251313mu.Cy6(X.2Th, X.3dQ, java.lang.Object, java.lang.Object):void");
    }

    public final void DuU(2Th r11, C245753dQ r12, Object obj, Object obj2) {
        C245553d6 r0;
        Map map;
        Map map2;
        C245773dS r3 = (C245773dS) r12.A02;
        Map map3 = r3.A02;
        if ((map3 != null && (r0 = (C245553d6) map3.get(Long.valueOf(r11.A0H()))) != null) || (((map = r3.A00) != null && (r0 = (C245553d6) map.get(Long.valueOf(r11.A0H()))) != null) || ((map2 = r3.A01) != null && (r0 = (C245553d6) map2.get(Long.valueOf(r11.A0H()))) != null))) {
            AnonymousClass2UY r8 = r3.A03;
            C251263mp r6 = r0.A01;
            SparseArray sparseArray = r0.A00;
            if ((sparseArray.size() != 0 && (obj instanceof View)) || C245783dT.A01(r6)) {
                r8.A01.remove(r6);
                Map map4 = r8.A00;
                Set<2V5> set = (Set) map4.get(r6);
                if (set != null) {
                    for (2V5 r32 : set) {
                        Pair pair = new Pair(r6, sparseArray);
                        if (r32 != null) {
                            Map map5 = r8.A02;
                            Set set2 = (Set) map5.get(r32);
                            if (set2 != null) {
                                set2.remove(pair);
                                if (set2.isEmpty()) {
                                    map5.remove(r32);
                                    r32.A01.remove(r8);
                                }
                            }
                        }
                    }
                    int size = sparseArray.size();
                    for (int i = 0; i < size; i++) {
                        int keyAt = sparseArray.keyAt(i);
                        if (obj instanceof View) {
                            switch (keyAt) {
                                case 1:
                                    View view = (View) obj;
                                    if (view.getAlpha() == 1.0f) {
                                        break;
                                    } else {
                                        view.setAlpha(1.0f);
                                        break;
                                    }
                                case 2:
                                    View view2 = (View) obj;
                                    if (view2.getTranslationX() == 0.0f) {
                                        break;
                                    } else {
                                        view2.setTranslationX(0.0f);
                                        break;
                                    }
                                case 3:
                                    View view3 = (View) obj;
                                    if (view3.getTranslationY() == 0.0f) {
                                        break;
                                    } else {
                                        view3.setTranslationY(0.0f);
                                        break;
                                    }
                                case 4:
                                    View view4 = (View) obj;
                                    if (view4.getTranslationZ() == 0.0f) {
                                        break;
                                    } else {
                                        view4.setTranslationZ(0.0f);
                                        break;
                                    }
                                case 5:
                                    View view5 = (View) obj;
                                    if (view5.getScaleX() == 1.0f) {
                                        break;
                                    } else {
                                        view5.setScaleX(1.0f);
                                        break;
                                    }
                                case 6:
                                    View view6 = (View) obj;
                                    if (view6.getScaleY() == 1.0f) {
                                        break;
                                    } else {
                                        view6.setScaleY(1.0f);
                                        break;
                                    }
                                case 7:
                                    View view7 = (View) obj;
                                    if (view7.getElevation() == 0.0f) {
                                        break;
                                    } else {
                                        view7.setElevation(0.0f);
                                        break;
                                    }
                                case 8:
                                case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                                    View view8 = (View) obj;
                                    if (view8.getBackground() == null) {
                                        break;
                                    } else {
                                        view8.setBackground((Drawable) null);
                                        break;
                                    }
                                case 9:
                                    View view9 = (View) obj;
                                    if (view9.getRotation() == 0.0f) {
                                        break;
                                    } else {
                                        view9.setRotation(0.0f);
                                        break;
                                    }
                                case 10:
                                    View view10 = (View) obj;
                                    if (view10.getRotationX() == 0.0f) {
                                        break;
                                    } else {
                                        view10.setRotationX(0.0f);
                                        break;
                                    }
                                case 11:
                                    View view11 = (View) obj;
                                    if (view11.getRotationY() == 0.0f) {
                                        break;
                                    } else {
                                        view11.setRotationY(0.0f);
                                        break;
                                    }
                                case 13:
                                    ((View) obj).getForeground();
                                    break;
                            }
                        }
                    }
                    map4.remove(r6);
                }
            }
        }
    }
}
