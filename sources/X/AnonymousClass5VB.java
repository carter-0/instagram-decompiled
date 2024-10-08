package X;

import android.os.SystemClock;
import android.view.MotionEvent;
import androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier;
import androidx.compose.ui.platform.AndroidComposeView;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* renamed from: X.5VB  reason: invalid class name */
public final class AnonymousClass5VB extends C267794cD implements AnonymousClass5VC, C268434dO, AnonymousClass5VD, C267954cW, AnonymousClass5VE, C268804e1, AnonymousClass5VF, AnonymousClass5VG, C268814e2, C267814cG, AnonymousClass5VH, C268094ck, AnonymousClass5VI, AnonymousClass5VJ {
    public AnonymousClass5QQ A00;
    public C305496Ih A01;
    public HashSet A02;
    public C268064ch A03;

    public final void A0E() {
        A01(this, true);
    }

    public static final void A00(AnonymousClass5VB r5) {
        if (!r5.A08) {
            I2E.A01("unInitializeModifier called on unattached node");
            throw AnonymousClass00P.createAndThrow();
        }
        AnonymousClass5QQ r4 = r5.A00;
        if ((r5.A01 & 32) != 0) {
            if (r4 instanceof C288865cc) {
                AnonymousClass5VA r3 = ((AndroidComposeView) AnonymousClass5WH.A05(r5)).A0X;
                AnonymousClass5VK BJr = ((C288865cc) r4).BJr();
                r3.A03.A09(AnonymousClass5WH.A02(r5));
                r3.A04.A09(BJr);
                if (!r3.A00) {
                    r3.A00 = true;
                    r3.A05.EBs(new AnonymousClass9L8(r3, 25));
                }
            }
            if (r4 instanceof C288855cb) {
                ((C288855cb) r4).DSH(C55405HhB.A00);
            }
        }
        if ((r5.A01 & 8) != 0) {
            AnonymousClass5WH.A05(r5).Diy();
        }
    }

    /* JADX WARNING: type inference failed for: r0v35, types: [X.6Ih, java.lang.Object] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0055  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.AnonymousClass5VB r6, boolean r7) {
        /*
            boolean r0 = r6.A08
            if (r0 != 0) goto L_0x000e
            java.lang.String r0 = "initializeModifier called on unattached node"
            X.I2E.A01(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x000e:
            X.5QQ r3 = r6.A00
            int r0 = r6.A01
            r0 = r0 & 32
            if (r0 == 0) goto L_0x0064
            boolean r0 = r3 instanceof X.C288855cb
            if (r0 == 0) goto L_0x0028
            r0 = 26
            X.9L8 r1 = new X.9L8
            r1.<init>(r6, r0)
            X.4co r0 = X.AnonymousClass5WH.A05(r6)
            r0.EBs(r1)
        L_0x0028:
            boolean r0 = r3 instanceof X.C288865cc
            if (r0 == 0) goto L_0x0064
            r5 = r3
            X.5cc r5 = (X.C288865cc) r5
            X.6Ih r2 = r6.A01
            if (r2 == 0) goto L_0x0103
            X.5VK r1 = r5.BJr()
            boolean r0 = r2.A01(r1)
            if (r0 == 0) goto L_0x0103
            r2.A00 = r5
            X.4co r0 = X.AnonymousClass5WH.A05(r6)
            androidx.compose.ui.platform.AndroidComposeView r0 = (androidx.compose.ui.platform.AndroidComposeView) r0
            X.5VA r4 = r0.A0X
        L_0x0047:
            X.5Pl r0 = r4.A01
            r0.A09(r6)
            X.5Pl r0 = r4.A02
            r0.A09(r1)
            boolean r0 = r4.A00
            if (r0 != 0) goto L_0x0064
            r0 = 1
            r4.A00 = r0
            X.4co r2 = r4.A05
            r1 = 25
            X.9L8 r0 = new X.9L8
            r0.<init>(r4, r1)
            r2.EBs(r0)
        L_0x0064:
            int r0 = r6.A01
            r0 = r0 & 4
            if (r0 == 0) goto L_0x0074
            if (r7 != 0) goto L_0x0074
            r0 = 2
            X.4cg r0 = X.AnonymousClass5WH.A04(r6, r0)
            r0.A0c()
        L_0x0074:
            int r0 = r6.A01
            r0 = r0 & 2
            if (r0 == 0) goto L_0x00b0
            X.5R6 r0 = X.AnonymousClass5WH.A02(r6)
            X.5RP r0 = r0.A0W
            X.4cD r1 = r0.A05
            java.lang.String r0 = "null cannot be cast to non-null type androidx.compose.ui.node.TailModifierNode"
            X.0qQ.A0C(r1, r0)
            X.5SH r1 = (X.AnonymousClass5SH) r1
            boolean r0 = r1.A00
            if (r0 == 0) goto L_0x009f
            X.4cg r1 = r6.A05
            X.0qQ.A0A(r1)
            r0 = r1
            X.5cD r0 = (X.C288625cD) r0
            r0.A0q(r6)
            X.5dB r0 = r1.A08
            if (r0 == 0) goto L_0x009f
            r0.invalidate()
        L_0x009f:
            if (r7 != 0) goto L_0x00b0
            r0 = 2
            X.4cg r0 = X.AnonymousClass5WH.A04(r6, r0)
            r0.A0c()
            X.5R6 r0 = X.AnonymousClass5WH.A02(r6)
            r0.A0L()
        L_0x00b0:
            boolean r0 = r3 instanceof X.C288895cf
            if (r0 == 0) goto L_0x00be
            r1 = r3
            X.5cf r1 = (X.C288895cf) r1
            X.5R6 r0 = X.AnonymousClass5WH.A02(r6)
            r1.Dd9(r0)
        L_0x00be:
            r1 = 256(0x100, float:3.59E-43)
            int r0 = r6.A01
            r1 = r1 & r0
            if (r1 == 0) goto L_0x00e3
            boolean r0 = r3 instanceof X.C288875cd
            if (r0 == 0) goto L_0x00e3
            X.5R6 r0 = X.AnonymousClass5WH.A02(r6)
            X.5RP r0 = r0.A0W
            X.4cD r1 = r0.A05
            java.lang.String r0 = "null cannot be cast to non-null type androidx.compose.ui.node.TailModifierNode"
            X.0qQ.A0C(r1, r0)
            X.5SH r1 = (X.AnonymousClass5SH) r1
            boolean r0 = r1.A00
            if (r0 == 0) goto L_0x00e3
            X.5R6 r0 = X.AnonymousClass5WH.A02(r6)
            r0.A0L()
        L_0x00e3:
            int r2 = r6.A01
            r0 = r2 & 16
            if (r0 == 0) goto L_0x00f7
            boolean r0 = r3 instanceof X.C288345bl
            if (r0 == 0) goto L_0x00f7
            X.5bl r3 = (X.C288345bl) r3
            X.5bk r3 = (X.C288335bk) r3
            X.5bm r1 = r3.A03
            X.4cg r0 = r6.A05
            r1.A00 = r0
        L_0x00f7:
            r0 = r2 & 8
            if (r0 == 0) goto L_0x0102
            X.4co r0 = X.AnonymousClass5WH.A05(r6)
            r0.Diy()
        L_0x0102:
            return
        L_0x0103:
            X.6Ih r0 = new X.6Ih
            r0.<init>()
            r0.A00 = r5
            r6.A01 = r0
            X.5R6 r0 = X.AnonymousClass5WH.A02(r6)
            X.5RP r0 = r0.A0W
            X.4cD r1 = r0.A05
            java.lang.String r0 = "null cannot be cast to non-null type androidx.compose.ui.node.TailModifierNode"
            X.0qQ.A0C(r1, r0)
            X.5SH r1 = (X.AnonymousClass5SH) r1
            boolean r0 = r1.A00
            if (r0 == 0) goto L_0x0064
            X.4co r0 = X.AnonymousClass5WH.A05(r6)
            androidx.compose.ui.platform.AndroidComposeView r0 = (androidx.compose.ui.platform.AndroidComposeView) r0
            X.5VA r4 = r0.A0X
            X.5VK r1 = r5.BJr()
            goto L_0x0047
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5VB.A01(X.5VB, boolean):void");
    }

    public final void A0H() {
        if (this.A08) {
            this.A02.clear();
            ((AndroidComposeView) AnonymousClass5WH.A05(this)).A0b.A00(this, new AnonymousClass9L8(this, 27), C55405HhB.A01);
        }
    }

    public final void AC1(AnonymousClass5Wa r2) {
        I2E.A01("applyFocusProperties called on wrong node");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void AC5(AnonymousClass5SW r8) {
        AnonymousClass5QQ r1 = this.A00;
        0qQ.A0C(r1, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsModifier");
        AnonymousClass5SV BsC = ((C286355Ve) r1).BsC();
        0qQ.A0C(r8, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsConfiguration");
        AnonymousClass5SV r82 = (AnonymousClass5SV) r8;
        if (BsC.A01) {
            r82.A01 = true;
        }
        if (BsC.A00) {
            r82.A00 = true;
        }
        for (Map.Entry entry : BsC.A02.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            Map map = r82.A02;
            if (!map.containsKey(key)) {
                map.put(key, value);
            } else if (value instanceof C290145ep) {
                Object obj = map.get(key);
                0qQ.A0C(obj, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
                C290145ep r12 = (C290145ep) obj;
                String str = r12.A00;
                if (str == null) {
                    str = ((C290145ep) value).A00;
                }
                AnonymousClass0eL r13 = r12.A01;
                if (r13 == null) {
                    r13 = ((C290145ep) value).A01;
                }
                map.put(key, new C290145ep(str, r13));
            }
        }
    }

    public final void AQM(AnonymousClass5Q4 r3) {
        AnonymousClass5QQ r1 = this.A00;
        0qQ.A0C(r1, "null cannot be cast to non-null type androidx.compose.ui.draw.DrawModifier");
        ((C288845ca) r1).AQM(r3);
    }

    public final Object Atk(AnonymousClass5VK r10) {
        this.A02.add(r10);
        C267794cD r1 = this.A03;
        if (r1.A08) {
            C267794cD r7 = r1.A04;
            AnonymousClass5R6 A022 = AnonymousClass5WH.A02(this);
            if (A022 != null) {
                while (true) {
                    if ((A022.A0W.A02.A00 & 32) != 0) {
                        while (r7 != null) {
                            if ((r7.A01 & 32) != 0) {
                                C267794cD r5 = r7;
                                C285045Pl r0 = null;
                                do {
                                    if (r5 instanceof C268804e1) {
                                        C305506Ii Bi2 = ((C268804e1) r5).Bi2();
                                        if (Bi2.A01(r10)) {
                                            return Bi2.A00(r10);
                                        }
                                    } else if ((r5.A01 & 32) != 0 && (r5 instanceof C267944cV)) {
                                        int i = 0;
                                        for (C267794cD r3 = ((C267944cV) r5).A00; r3 != null; r3 = r3.A02) {
                                            if ((r3.A01 & 32) != 0) {
                                                i++;
                                                if (i == 1) {
                                                    r5 = r3;
                                                } else {
                                                    if (r0 == null) {
                                                        r0 = new C285045Pl(new C267794cD[16]);
                                                    }
                                                    if (r5 != null) {
                                                        r0.A09(r5);
                                                        r5 = null;
                                                    }
                                                    r0.A09(r3);
                                                }
                                            }
                                        }
                                        if (i == 1) {
                                            continue;
                                        }
                                    }
                                    r5 = AnonymousClass5WH.A00(r0);
                                    continue;
                                } while (r5 != null);
                            }
                            r7 = r7.A04;
                        }
                    }
                    A022 = A022.A0B();
                    if (A022 == null) {
                        break;
                    }
                    AnonymousClass5RP r02 = A022.A0W;
                    if (r02 != null) {
                        r7 = r02.A05;
                    } else {
                        r7 = null;
                    }
                }
            }
            return r10.A00.invoke();
        }
        throw new IllegalStateException("visitAncestors called on an unattached node");
    }

    public final C305506Ii Bi2() {
        C305496Ih r0 = this.A01;
        if (r0 == null) {
            return C52934Gf8.A00;
        }
        return r0;
    }

    public final /* synthetic */ boolean Bu0() {
        return false;
    }

    public final /* synthetic */ boolean BuF() {
        return false;
    }

    public final long Bwg() {
        return C289155d7.A01(AnonymousClass5WH.A04(this, 128).A03);
    }

    public final boolean CNf() {
        0qQ.A0C(this.A00, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        return false;
    }

    public final boolean CeH() {
        return this.A08;
    }

    public final int CmX(C268084cj r3, C268014cc r4, int i) {
        AnonymousClass5QQ r1 = this.A00;
        0qQ.A0C(r1, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((C288835cZ) r1).CmX(r3, r4, i);
    }

    public final int Cma(C268084cj r3, C268014cc r4, int i) {
        AnonymousClass5QQ r1 = this.A00;
        0qQ.A0C(r1, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((C288835cZ) r1).Cma(r3, r4, i);
    }

    public final C289145d6 Cny(C268074ci r3, C268004cb r4, long j) {
        AnonymousClass5QQ r1 = this.A00;
        0qQ.A0C(r1, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((C288835cZ) r1).Cny(r3, r4, j);
    }

    public final int CoQ(C268084cj r3, C268014cc r4, int i) {
        AnonymousClass5QQ r1 = this.A00;
        0qQ.A0C(r1, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((C288835cZ) r1).CoQ(r3, r4, i);
    }

    public final int CoT(C268084cj r3, C268014cc r4, int i) {
        AnonymousClass5QQ r1 = this.A00;
        0qQ.A0C(r1, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((C288835cZ) r1).CoT(r3, r4, i);
    }

    public final Object CoX(C268024cd r3, Object obj) {
        AnonymousClass5QQ r1 = this.A00;
        0qQ.A0C(r1, "null cannot be cast to non-null type androidx.compose.ui.layout.ParentDataModifier");
        return ((C288885ce) r1).CoX(r3, obj);
    }

    /* renamed from: D0Z */
    public final void Dyp() {
        AnonymousClass5QQ r1 = this.A00;
        0qQ.A0C(r1, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        C288355bm r3 = ((C288335bk) ((C288345bl) r1)).A03;
        if (r3.A01 == AnonymousClass05K.A01) {
            long uptimeMillis = SystemClock.uptimeMillis();
            C288335bk r2 = r3.A02;
            J6M j6m = new J6M(r2, 31);
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            obtain.setSource(0);
            j6m.invoke(obtain);
            obtain.recycle();
            r3.A01 = AnonymousClass05K.A00;
            r2.A02 = false;
        }
    }

    public final void DGD(C288915ch r2) {
        I2E.A01("onFocusEvent called on wrong node");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void DIA(C268064ch r4) {
        AnonymousClass5QQ r2 = this.A00;
        0qQ.A0C(r2, "null cannot be cast to non-null type androidx.compose.ui.layout.OnGloballyPositionedModifier");
        AwaitFirstLayoutModifier awaitFirstLayoutModifier = (AwaitFirstLayoutModifier) ((C288875cd) r2);
        if (!awaitFirstLayoutModifier.A01) {
            awaitFirstLayoutModifier.A01 = true;
            AnonymousClass4D7 r1 = awaitFirstLayoutModifier.A00;
            if (r1 != null) {
                r1.resumeWith(C60340gF.A00);
            }
            awaitFirstLayoutModifier.A00 = null;
        }
    }

    public final void DXw(C304926Ft r8, GWN gwn, long j) {
        boolean z;
        AnonymousClass5QQ r1 = this.A00;
        0qQ.A0C(r1, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        C288355bm r4 = ((C288335bk) ((C288345bl) r1)).A03;
        List list = r8.A03;
        C288335bk r3 = r4.A02;
        if (!r3.A02) {
            int size = list.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    z = false;
                    break;
                }
                GPU gpu = (GPU) list.get(i);
                if ((!gpu.A0C && gpu.A0B) || GPS.A02(gpu)) {
                    break;
                }
                i++;
            }
        }
        z = true;
        if (r4.A01 != AnonymousClass05K.A0C) {
            if (gwn == GWN.Initial && z) {
                C288355bm.A00(r8, r4);
            }
            if (gwn == GWN.Final && !z) {
                C288355bm.A00(r8, r4);
            }
        }
        if (gwn == GWN.Final) {
            int size2 = list.size();
            int i2 = 0;
            while (i2 < size2) {
                if (GPS.A02((GPU) list.get(i2))) {
                    i2++;
                } else {
                    return;
                }
            }
            r4.A01 = AnonymousClass05K.A00;
            r3.A02 = false;
        }
    }

    public final boolean Era() {
        0qQ.A0C(this.A00, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        return true;
    }

    public final String toString() {
        return this.A00.toString();
    }

    public final void A0F() {
        A00(this);
    }

    public final void DPk() {
        C288785cT.A00(this);
    }

    public final C268024cd getDensity() {
        return AnonymousClass5WH.A02(this).A0C;
    }

    public final AnonymousClass5Q8 getLayoutDirection() {
        return AnonymousClass5WH.A02(this).A0D;
    }

    public final void DXL(C268064ch r1) {
        this.A03 = r1;
    }

    public final void Dd8(long j) {
    }
}
