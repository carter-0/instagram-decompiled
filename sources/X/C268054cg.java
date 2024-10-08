package X;

import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.platform.AndroidComposeView;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.4cg  reason: invalid class name and case insensitive filesystem */
public abstract class C268054cg extends C267964cX implements C268064ch, C268074ci, C268094ck {
    public static final AnonymousClass5RT A0K = new AnonymousClass5RT();
    public static final AnonymousClass5S3 A0L = new AnonymousClass5S3();
    public static final AnonymousClass5S6 A0M = new AnonymousClass5S5();
    public static final AnonymousClass5S6 A0N = new AnonymousClass5S7();
    public static final 0sP A0O = AnonymousClass5RS.A00;
    public static final 0sP A0P = AnonymousClass5RR.A00;
    public static final float[] A0Q = AnonymousClass5S4.A06();
    public float A00;
    public long A01 = 0;
    public C289445db A02;
    public GraphicsLayer A03;
    public C289145d6 A04;
    public AnonymousClass5S3 A05;
    public C268054cg A06;
    public C268054cg A07;
    public C289195dB A08;
    public 0sP A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public float A0D = 0.8f;
    public C268024cd A0E;
    public AnonymousClass5Q8 A0F;
    public Map A0G;
    public final AnonymousClass5R6 A0H;
    public final C62320sa A0I = new AnonymousClass9L8(this, 31);
    public final 0sL A0J = new AnonymousClass9LZ(this, 10);

    public static final void A05(C267794cD r6, AnonymousClass5T7 r7, AnonymousClass5S6 r8, C268054cg r9, float f, long j, boolean z, boolean z2) {
        C267794cD r1 = r6;
        AnonymousClass5T7 r2 = r7;
        AnonymousClass5S6 r3 = r8;
        C268054cg r4 = r9;
        long j2 = j;
        boolean z3 = z;
        boolean z4 = z2;
        if (r1 == null) {
            r4.A0m(r2, r3, j, z, z2);
        } else {
            r2.A02(r1, new XEB(r1, r2, r3, r4, f, j2, z3, z4), f, z2);
        }
    }

    public static final void A06(C267794cD r12, AnonymousClass5T7 r13, AnonymousClass5S6 r14, C268054cg r15, float f, long j, boolean z, boolean z2) {
        C267794cD r7 = r12;
        AnonymousClass5T7 r8 = r13;
        AnonymousClass5S6 r9 = r14;
        C268054cg r10 = r15;
        long j2 = j;
        boolean z3 = z;
        boolean z4 = z2;
        if (r7 == null) {
            r10.A0m(r8, r9, j2, z3, z4);
            return;
        }
        float f2 = f;
        if (r9.CNg(r7)) {
            Y6N y6n = new Y6N(r7, r8, r9, r10, f2, j2, z3, z4);
            int i = r8.A00;
            int size = r8.size() - 1;
            if (i == size) {
                r8.A02(r7, y6n, f2, z4);
                if (r8.A00 + 1 == r8.size() - 1) {
                    AnonymousClass5T7.A01(r8);
                    return;
                }
                return;
            }
            long A002 = AnonymousClass5T7.A00(r8);
            r8.A00 = size;
            r8.A02(r7, y6n, f2, z4);
            int i2 = r8.A00 + 1;
            int size2 = r8.size();
            if (i2 < size2 - 1 && C52420GRx.A00(A002, AnonymousClass5T7.A00(r8)) > 0) {
                int i3 = i + 1;
                Object[] objArr = r8.A04;
                0Yw.A0V(objArr, objArr, i3, i2, size2);
                long[] jArr = r8.A03;
                System.arraycopy(jArr, i2, jArr, i3, r8.size() - i2);
                r8.A00 = ((r8.size() + i) - r8.A00) - 1;
            }
            AnonymousClass5T7.A01(r8);
            r8.A00 = i;
            return;
        }
        A06(C52419GRw.A00(r7, r9.ASm()), r8, r9, r10, f2, j2, z3, z4);
    }

    public static final void A07(C267794cD r11, AnonymousClass5T7 r12, AnonymousClass5S6 r13, C268054cg r14, long j, boolean z, boolean z2) {
        C267794cD r9 = r11;
        AnonymousClass5T7 r10 = r12;
        AnonymousClass5S6 r112 = r13;
        C268054cg r122 = r14;
        long j2 = j;
        boolean z3 = z;
        boolean z4 = z2;
        if (r9 == null) {
            r122.A0m(r10, r112, j2, z3, z4);
            return;
        }
        r10.A02(r9, new XE8(r9, r10, r112, r122, j2, z3, z4), -1.0f, z4);
        C268054cg r1 = r9.A05;
        if (r1 != null) {
            0vu r0 = AnonymousClass5WB.A00;
            C267794cD A032 = A03(r1, false);
            if (A032 != null && A032.A08) {
                C267794cD r5 = A032.A03;
                if (!r5.A08) {
                    I2E.A01(C273654mx.A00(1012));
                    throw AnonymousClass00P.createAndThrow();
                } else if ((r5.A00 & 16) != 0) {
                    do {
                        if ((r5.A01 & 16) != 0) {
                            C267794cD r8 = r5;
                            C285045Pl r4 = null;
                            do {
                                if (r8 instanceof AnonymousClass5VD) {
                                    if (((AnonymousClass5VD) r8).Era()) {
                                        return;
                                    }
                                } else if ((r8.A01 & 16) != 0 && (r8 instanceof C267944cV)) {
                                    int i = 0;
                                    for (C267794cD r2 = ((C267944cV) r8).A00; r2 != null; r2 = r2.A02) {
                                        if ((r2.A01 & 16) != 0) {
                                            i++;
                                            if (i == 1) {
                                                r8 = r2;
                                            } else {
                                                if (r4 == null) {
                                                    r4 = new C285045Pl(new C267794cD[16]);
                                                }
                                                if (r8 != null) {
                                                    r4.A09(r8);
                                                    r8 = null;
                                                }
                                                r4.A09(r2);
                                            }
                                        }
                                    }
                                    if (i == 1) {
                                        continue;
                                    }
                                }
                                r8 = AnonymousClass5WH.A00(r4);
                                continue;
                            } while (r8 != null);
                        }
                        r5 = r5.A02;
                    } while (r5 != null);
                }
            }
            r10.A02 = false;
        }
    }

    public static final void A09(AnonymousClass5QA r11, GraphicsLayer graphicsLayer, C268054cg r13) {
        C268054cg r10 = r13;
        C267794cD A0Y = r13.A0Y(4);
        AnonymousClass5QA r7 = r11;
        GraphicsLayer graphicsLayer2 = graphicsLayer;
        if (A0Y == null) {
            r13.A0j(r11, graphicsLayer);
            return;
        }
        AnonymousClass5Q2 r6 = ((AndroidComposeView) AnonymousClass5RJ.A00(r13.A0H)).A0Z;
        long A012 = C289155d7.A01(r13.A03);
        C285045Pl r0 = null;
        do {
            if (A0Y instanceof C267814cG) {
                r6.A00(r7, graphicsLayer2, (C267814cG) A0Y, r10, A012);
            } else if ((A0Y.A01 & 4) != 0 && (A0Y instanceof C267944cV)) {
                int i = 0;
                for (C267794cD r3 = ((C267944cV) A0Y).A00; r3 != null; r3 = r3.A02) {
                    if ((r3.A01 & 4) != 0) {
                        i++;
                        if (i == 1) {
                            A0Y = r3;
                        } else {
                            if (r0 == null) {
                                r0 = new C285045Pl(new C267794cD[16]);
                            }
                            if (A0Y != null) {
                                r0.A09(A0Y);
                                A0Y = null;
                            }
                            r0.A09(r3);
                        }
                    }
                }
                if (i == 1) {
                    continue;
                }
            }
            A0Y = AnonymousClass5WH.A00(r0);
            continue;
        } while (A0Y != null);
    }

    public static final void A0A(GraphicsLayer graphicsLayer, C268054cg r6, 0sP r7, float f, long j) {
        if (graphicsLayer == null) {
            if (r6.A03 != null) {
                r6.A03 = null;
                r6.A0o((0sP) null, false);
            }
            r6.A0o(r7, false);
        } else if (r7 == null) {
            if (r6.A03 != graphicsLayer) {
                r6.A03 = null;
                r6.A0o((0sP) null, false);
                r6.A03 = graphicsLayer;
            }
            if (r6.A08 == null) {
                AnonymousClass5R6 r4 = r6.A0H;
                C268124co A002 = AnonymousClass5RJ.A00(r4);
                0sL r0 = r6.A0J;
                C62320sa r3 = r6.A0I;
                C289195dB AMJ = A002.AMJ(graphicsLayer, r3, r0);
                AMJ.EIP(r6.A03);
                AMJ.Cod(j);
                r6.A08 = AMJ;
                r4.A0K = true;
                r3.invoke();
            }
        } else {
            I2E.A00("both ways to create layers shouldn't be used together");
            throw AnonymousClass00P.createAndThrow();
        }
        if (r6.A01 != j) {
            r6.A01 = j;
            AnonymousClass5R6 r1 = r6.A0H;
            r1.A0U.A0J.A0M();
            C289195dB r02 = r6.A08;
            if (r02 != null) {
                r02.Cod(j);
            } else {
                C268054cg r03 = r6.A07;
                if (r03 != null) {
                    r03.A0c();
                }
            }
            C267964cX.A01(r6);
            C268124co r04 = r1.A0A;
            if (r04 != null) {
                r04.DNA(r1);
            }
        }
        r6.A00 = f;
        if (!r6.A02) {
            C267964cX.A00(r6, new C289175d9(r6.A0N(), r6));
        }
    }

    private final void A0D(C268054cg r8, float[] fArr) {
        C268054cg r6 = this;
        while (!0qQ.A0K(r6, r8)) {
            C289195dB r0 = r6.A08;
            if (r0 != null) {
                r0.FHi(fArr);
            }
            long j = r6.A01;
            if (j != 0) {
                float[] fArr2 = A0Q;
                AnonymousClass5S4.A02(fArr2);
                AnonymousClass5S4.A04(fArr2, (float) ((int) (j >> 32)), (float) ((int) (j & 4294967295L)));
                AnonymousClass5S4.A05(fArr, fArr2);
            }
            r6 = r6.A07;
            0qQ.A0A(r6);
        }
    }

    public void A0I(GraphicsLayer graphicsLayer, float f, long j) {
        A0A(graphicsLayer, this, (0sP) null, f, j);
    }

    public void A0J(0sP r2, float f, long j) {
        A0A((GraphicsLayer) null, this, r2, f, j);
    }

    public C267794cD A0X() {
        return ((C268834e4) this).A01;
    }

    public AnonymousClass6GP A0Z() {
        return ((C268834e4) this).A00;
    }

    public void A0b() {
        C268834e4 r1 = (C268834e4) this;
        if (r1.A00 == null) {
            r1.A00 = new C52938GfC(r1);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0028, code lost:
        if (r6.A0F != r3.A0D) goto L_0x002a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0o(X.0sP r7, boolean r8) {
        /*
            r6 = this;
            r4 = 0
            if (r7 == 0) goto L_0x0011
            androidx.compose.ui.graphics.layer.GraphicsLayer r0 = r6.A03
            if (r0 == 0) goto L_0x0011
            java.lang.String r0 = "layerBlock can't be provided when explicitLayer is provided"
            X.I2E.A00(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0011:
            X.5R6 r3 = r6.A0H
            if (r8 != 0) goto L_0x002a
            X.0sP r0 = r6.A09
            if (r0 != r7) goto L_0x002a
            X.4cd r1 = r6.A0E
            X.4cd r0 = r3.A0C
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x002a
            X.5Q8 r1 = r6.A0F
            X.5Q8 r0 = r3.A0D
            r5 = 0
            if (r1 == r0) goto L_0x002b
        L_0x002a:
            r5 = 1
        L_0x002b:
            X.4cd r0 = r3.A0C
            r6.A0E = r0
            X.5Q8 r0 = r3.A0D
            r6.A0F = r0
            X.4co r1 = r3.A0A
            r0 = 0
            if (r1 == 0) goto L_0x0039
            r0 = 1
        L_0x0039:
            r2 = 0
            if (r0 == 0) goto L_0x006d
            if (r7 == 0) goto L_0x006d
            r6.A09 = r7
            X.5dB r0 = r6.A08
            if (r0 != 0) goto L_0x0066
            X.4co r1 = X.AnonymousClass5RJ.A00(r3)
            X.0sL r0 = r6.A0J
            X.0sa r4 = r6.A0I
            X.5dB r2 = r1.AMJ(r2, r4, r0)
            long r0 = r6.A03
            r2.EIP(r0)
            long r0 = r6.A01
            r2.Cod(r0)
            r6.A08 = r2
            r0 = 1
            A0B(r6, r0)
            r3.A0K = r0
            r4.invoke()
        L_0x0065:
            return
        L_0x0066:
            if (r5 == 0) goto L_0x0065
            r0 = 1
            A0B(r6, r0)
            return
        L_0x006d:
            r6.A09 = r2
            X.5dB r0 = r6.A08
            if (r0 == 0) goto L_0x008d
            r0.destroy()
            r0 = 1
            r3.A0K = r0
            X.0sa r0 = r6.A0I
            r0.invoke()
            X.4cD r0 = r6.A0X()
            boolean r0 = r0.A08
            if (r0 == 0) goto L_0x008d
            X.4co r0 = r3.A0A
            if (r0 == 0) goto L_0x008d
            r0.DNA(r3)
        L_0x008d:
            r6.A08 = r2
            r6.A0B = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C268054cg.A0o(X.0sP, boolean):void");
    }

    public final long CgW(C268064ch r3, long j) {
        return CgX(r3, j, true);
    }

    public final long CgX(C268064ch r5, long j, boolean z) {
        if (r5 instanceof C289435da) {
            ((C289435da) r5).A00.A04.A0d();
            return r5.CgX(this, j ^ -9223372034707292160L, true) ^ -9223372034707292160L;
        }
        C268054cg A042 = A04(r5);
        A042.A0d();
        C268054cg A0a = A0a(A042);
        while (A042 != A0a) {
            j = A042.A0W(j);
            A042 = A042.A07;
            0qQ.A0A(A042);
        }
        return A02(A0a, j);
    }

    private final long A02(C268054cg r3, long j) {
        if (r3 == this) {
            return j;
        }
        C268054cg r1 = this.A07;
        if (r1 == null || 0qQ.A0K(r3, r1)) {
            return A0V(j);
        }
        return A0V(r1.A02(r3, j));
    }

    public static final C267794cD A03(C268054cg r3, boolean z) {
        C267794cD A0X;
        AnonymousClass5RP r2 = r3.A0H.A0W;
        if (r2.A04 == r3) {
            return r2.A02;
        }
        C268054cg r0 = r3.A07;
        if (z) {
            if (r0 == null || (A0X = r0.A0X()) == null) {
                return null;
            }
            return A0X.A02;
        } else if (r0 != null) {
            return r0.A0X();
        } else {
            return null;
        }
    }

    public static final C268054cg A04(C268064ch r1) {
        C289435da r0;
        C268054cg r02;
        if ((r1 instanceof C289435da) && (r0 = (C289435da) r1) != null && (r02 = r0.A00.A04) != null) {
            return r02;
        }
        0qQ.A0C(r1, "null cannot be cast to non-null type androidx.compose.ui.node.NodeCoordinator");
        return (C268054cg) r1;
    }

    private final void A08(C289445db r8, C268054cg r9, boolean z) {
        if (r9 != this) {
            C268054cg r0 = this.A07;
            if (r0 != null) {
                r0.A08(r8, r9, z);
            }
            long j = this.A01;
            float f = (float) ((int) (j >> 32));
            r8.A01 -= f;
            r8.A02 -= f;
            float f2 = (float) ((int) (j & 4294967295L));
            r8.A03 -= f2;
            r8.A00 -= f2;
            C289195dB r1 = this.A08;
            if (r1 != null) {
                r1.Cld(r8, true);
                if (this.A0A && z) {
                    long j2 = this.A03;
                    r8.A00(0.0f, 0.0f, (float) ((int) (j2 >> 32)), (float) C289005cr.A00(j2));
                }
            }
        }
    }

    public static final void A0B(C268054cg r8, boolean z) {
        C268124co r0;
        if (r8.A03 == null) {
            C289195dB r5 = r8.A08;
            if (r5 != null) {
                0sP r3 = r8.A09;
                if (r3 != null) {
                    AnonymousClass5RT r4 = A0K;
                    r4.EjG(1.0f);
                    r4.EjH(1.0f);
                    r4.EOX(1.0f);
                    r4.EpG(0.0f);
                    r4.EpH(0.0f);
                    r4.Ek7(0.0f);
                    long j = AnonymousClass5RV.A00;
                    r4.EOc(j);
                    r4.Elm(j);
                    r4.Ej3(0.0f);
                    r4.Ej4(0.0f);
                    r4.Ej5(0.0f);
                    r4.EQN(8.0f);
                    r4.EpB(C285605Ry.A01);
                    r4.Ek8(AnonymousClass5S0.A00);
                    r4.ERg(false);
                    r4.EiT((C54727HQg) null);
                    r4.ESY(0);
                    r4.A0D = 9205357640488583168L;
                    r4.A0G = null;
                    r4.A0B = 0;
                    AnonymousClass5R6 r2 = r8.A0H;
                    r4.A0J = r2.A0C;
                    r4.A0K = r2.A0D;
                    r4.A0D = C289155d7.A01(r8.A03);
                    ((AndroidComposeView) AnonymousClass5RJ.A00(r2)).A0b.A00(r8, new AnonymousClass9L8(r3, 32), A0P);
                    AnonymousClass5S3 r32 = r8.A05;
                    if (r32 == null) {
                        r32 = new AnonymousClass5S3();
                        r8.A05 = r32;
                    }
                    r32.A04 = r4.A05;
                    r32.A05 = r4.A06;
                    r32.A06 = r4.A08;
                    r32.A07 = r4.A09;
                    r32.A01 = r4.A02;
                    r32.A02 = r4.A03;
                    r32.A03 = r4.A04;
                    r32.A00 = r4.A01;
                    r32.A08 = r4.A0F;
                    r5.FKg(r4);
                    r8.A0A = r4.A0L;
                    r8.A0D = r4.A00;
                    if (z && (r0 = r2.A0A) != null) {
                        r0.DNA(r2);
                        return;
                    }
                    return;
                }
                I2E.A02("updateLayerParameters requires a non-null layerBlock");
            } else if (r8.A09 != null) {
                I2E.A01("null layer with a non-null layerBlock");
            } else {
                return;
            }
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public final long A0T() {
        return this.A0E.FH8(this.A0H.A0B.BTR());
    }

    public final long A0V(long j) {
        long j2 = this.A01;
        long A002 = C289325dP.A00(C289295dM.A01(j) - ((float) ((int) (j2 >> 32))), C289295dM.A02(j) - ((float) ((int) (j2 & 4294967295L))));
        C289195dB r1 = this.A08;
        if (r1 != null) {
            return r1.Cle(A002, true);
        }
        return A002;
    }

    public final long A0W(long j) {
        C289195dB r1 = this.A08;
        if (r1 != null) {
            j = r1.Cle(j, false);
        }
        long j2 = this.A01;
        return C289325dP.A00(C289295dM.A01(j) + ((float) ((int) (j2 >> 32))), C289295dM.A02(j) + ((float) ((int) (j2 & 4294967295L))));
    }

    public final C267794cD A0Y(int i) {
        0vu r0 = AnonymousClass5WB.A00;
        boolean z = false;
        if ((128 & i) != 0) {
            z = true;
        }
        C267794cD A0X = A0X();
        if (z || (A0X = A0X.A04) != null) {
            C267794cD A032 = A03(this, z);
            while (A032 != null && (A032.A00 & i) != 0) {
                if ((A032.A01 & i) == 0) {
                    if (A032 == A0X) {
                        break;
                    }
                    A032 = A032.A02;
                } else {
                    return A032;
                }
            }
        }
        return null;
    }

    public final C268054cg A0a(C268054cg r7) {
        AnonymousClass5R6 r5 = r7.A0H;
        AnonymousClass5R6 r4 = r5;
        AnonymousClass5R6 r3 = this.A0H;
        AnonymousClass5R6 r2 = r3;
        if (r5 == r3) {
            C267794cD A0X = r7.A0X();
            C267794cD r1 = A0X().A03;
            if (!r1.A08) {
                I2E.A01("visitLocalAncestors called on an unattached node");
                throw AnonymousClass00P.createAndThrow();
            }
            while (true) {
                r1 = r1.A04;
                if (r1 == null) {
                    return this;
                }
                if ((r1.A01 & 2) != 0 && r1 == A0X) {
                    return r7;
                }
            }
        } else {
            while (r4.A00 > r3.A00) {
                r4 = r4.A0B();
                0qQ.A0A(r4);
            }
            while (r2.A00 > r4.A00) {
                r2 = r2.A0B();
                0qQ.A0A(r2);
            }
            while (r4 != r2) {
                r4 = r4.A0B();
                r2 = r2.A0B();
                if (r4 != null) {
                    if (r2 == null) {
                    }
                }
                throw new IllegalArgumentException("layouts are not part of the same hierarchy");
            }
            if (r2 == r3) {
                return this;
            }
            if (r4 != r5) {
                return r4.A0W.A06;
            }
            return r7;
        }
    }

    public final void A0c() {
        C289195dB r0 = this.A08;
        if (r0 != null) {
            r0.invalidate();
            return;
        }
        C268054cg r02 = this.A07;
        if (r02 != null) {
            r02.A0c();
        }
    }

    public final void A0d() {
        boolean z;
        boolean z2;
        AnonymousClass5SI r1 = this.A0H.A0U;
        Integer num = r1.A0I.A0U.A06;
        if (num == AnonymousClass05K.A0C || num == AnonymousClass05K.A0N) {
            if (r1.A0J.A0G) {
                if (!r1.A08) {
                    r1.A08 = true;
                    z2 = r1.A07;
                }
            } else if (!r1.A07) {
                r1.A07 = true;
                z2 = r1.A08;
            }
            if (!z2) {
                r1.A01(r1.A00 + 1);
            }
        }
        if (num == AnonymousClass05K.A0N) {
            C290225ey r0 = r1.A05;
            if (r0 == null || !r0.A0A) {
                if (!r1.A0C) {
                    r1.A0C = true;
                    z = r1.A0D;
                } else {
                    return;
                }
            } else if (!r1.A0D) {
                r1.A0D = true;
                z = r1.A0C;
            } else {
                return;
            }
            if (!z) {
                r1.A02(r1.A01 + 1);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x007d, code lost:
        if (r2 == 1) goto L_0x007f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0e() {
        /*
            r13 = this;
            r12 = 128(0x80, float:1.794E-43)
            X.0vu r0 = X.AnonymousClass5WB.A00
            r10 = 1
            X.4cD r0 = A03(r13, r10)
            if (r0 == 0) goto L_0x008f
            X.4cD r0 = r0.A03
            int r0 = r0.A00
            r0 = r0 & r12
            if (r0 == 0) goto L_0x008f
            androidx.compose.runtime.snapshots.Snapshot r9 = X.AnonymousClass5PH.A02()
            r11 = 0
            if (r9 == 0) goto L_0x0022
            X.0sP r8 = r9.A05()
        L_0x001d:
            androidx.compose.runtime.snapshots.Snapshot r7 = X.AnonymousClass5PH.A03(r9)
            goto L_0x0024
        L_0x0022:
            r8 = r11
            goto L_0x001d
        L_0x0024:
            X.4cD r6 = r13.A0X()     // Catch:{ all -> 0x0087 }
            X.4cD r5 = A03(r13, r10)     // Catch:{ all -> 0x0087 }
        L_0x002c:
            if (r5 == 0) goto L_0x008c
            int r0 = r5.A00     // Catch:{ all -> 0x0087 }
            r0 = r0 & r12
            if (r0 == 0) goto L_0x008c
            int r0 = r5.A01     // Catch:{ all -> 0x0087 }
            r0 = r0 & r12
            if (r0 == 0) goto L_0x0082
            r0 = r11
            r4 = r5
        L_0x003a:
            boolean r1 = r4 instanceof X.AnonymousClass5VF     // Catch:{ all -> 0x0087 }
            if (r1 == 0) goto L_0x004a
            X.5VF r4 = (X.AnonymousClass5VF) r4     // Catch:{ all -> 0x0087 }
            long r1 = r13.A03     // Catch:{ all -> 0x0087 }
            r4.Dd8(r1)     // Catch:{ all -> 0x0087 }
        L_0x0045:
            X.4cD r4 = X.AnonymousClass5WH.A00(r0)     // Catch:{ all -> 0x0087 }
            goto L_0x007f
        L_0x004a:
            int r1 = r4.A01     // Catch:{ all -> 0x0087 }
            r1 = r1 & r12
            if (r1 == 0) goto L_0x0045
            boolean r1 = r4 instanceof X.C267944cV     // Catch:{ all -> 0x0087 }
            if (r1 == 0) goto L_0x0045
            r1 = r4
            X.4cV r1 = (X.C267944cV) r1     // Catch:{ all -> 0x0087 }
            X.4cD r3 = r1.A00     // Catch:{ all -> 0x0087 }
            r2 = 0
        L_0x0059:
            if (r3 == 0) goto L_0x007d
            int r1 = r3.A01     // Catch:{ all -> 0x0087 }
            r1 = r1 & r12
            if (r1 == 0) goto L_0x007a
            int r2 = r2 + 1
            if (r2 != r10) goto L_0x0066
            r4 = r3
            goto L_0x007a
        L_0x0066:
            if (r0 != 0) goto L_0x0071
            r0 = 16
            X.4cD[] r1 = new X.C267794cD[r0]     // Catch:{ all -> 0x0087 }
            X.5Pl r0 = new X.5Pl     // Catch:{ all -> 0x0087 }
            r0.<init>(r1)     // Catch:{ all -> 0x0087 }
        L_0x0071:
            if (r4 == 0) goto L_0x0077
            r0.A09(r4)     // Catch:{ all -> 0x0087 }
            r4 = r11
        L_0x0077:
            r0.A09(r3)     // Catch:{ all -> 0x0087 }
        L_0x007a:
            X.4cD r3 = r3.A02     // Catch:{ all -> 0x0087 }
            goto L_0x0059
        L_0x007d:
            if (r2 != r10) goto L_0x0045
        L_0x007f:
            if (r4 == 0) goto L_0x0082
            goto L_0x003a
        L_0x0082:
            if (r5 == r6) goto L_0x008c
            X.4cD r5 = r5.A02     // Catch:{ all -> 0x0087 }
            goto L_0x002c
        L_0x0087:
            r0 = move-exception
            X.AnonymousClass5PH.A06(r9, r7, r8)
            throw r0
        L_0x008c:
            X.AnonymousClass5PH.A06(r9, r7, r8)
        L_0x008f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C268054cg.A0e():void");
    }

    public final void A0f() {
        0vu r0 = AnonymousClass5WB.A00;
        C267794cD A0X = A0X();
        C267794cD A032 = A03(this, true);
        while (A032 != null && (A032.A00 & 128) != 0) {
            if ((A032.A01 & 128) != 0) {
                C267794cD r4 = A032;
                C285045Pl r02 = null;
                do {
                    if (r4 instanceof AnonymousClass5VF) {
                        ((AnonymousClass5VF) r4).DXL(this);
                    } else if ((r4.A01 & 128) != 0 && (r4 instanceof C267944cV)) {
                        int i = 0;
                        for (C267794cD r3 = ((C267944cV) r4).A00; r3 != null; r3 = r3.A02) {
                            if ((r3.A01 & 128) != 0) {
                                i++;
                                if (i == 1) {
                                    r4 = r3;
                                } else {
                                    if (r02 == null) {
                                        r02 = new C285045Pl(new C267794cD[16]);
                                    }
                                    if (r4 != null) {
                                        r02.A09(r4);
                                        r4 = null;
                                    }
                                    r02.A09(r3);
                                }
                            }
                        }
                        if (i == 1) {
                            continue;
                        }
                    }
                    r4 = AnonymousClass5WH.A00(r02);
                    continue;
                } while (r4 != null);
            }
            if (A032 != A0X) {
                A032 = A032.A02;
            } else {
                return;
            }
        }
    }

    public final void A0g() {
        if (this.A08 != null) {
            if (this.A03 != null) {
                this.A03 = null;
            }
            A0o((0sP) null, false);
            this.A0H.A0Y(false);
        }
    }

    public final void A0h(C289445db r12, boolean z, boolean z2) {
        C289195dB r5 = this.A08;
        if (r5 != null) {
            if (this.A0A) {
                if (z2) {
                    long A0T = A0T();
                    float A022 = C288025bF.A02(A0T) / 2.0f;
                    float A002 = C288025bF.A00(A0T) / 2.0f;
                    long j = this.A03;
                    r12.A00(-A022, -A002, ((float) ((int) (j >> 32))) + A022, ((float) C289005cr.A00(j)) + A002);
                } else if (z) {
                    long j2 = this.A03;
                    r12.A00(0.0f, 0.0f, (float) ((int) (j2 >> 32)), (float) C289005cr.A00(j2));
                }
                if (r12.A01 >= r12.A02 || r12.A03 >= r12.A00) {
                    return;
                }
            }
            r5.Cld(r12, false);
        }
        long j3 = this.A01;
        float f = (float) ((int) (j3 >> 32));
        r12.A01 += f;
        r12.A02 += f;
        float f2 = (float) ((int) (j3 & 4294967295L));
        r12.A03 += f2;
        r12.A00 += f2;
    }

    public final void A0i(AnonymousClass5QA r10, AnonymousClass5S9 r11) {
        long j = this.A03;
        r10.AQq(r11, 0.5f, 0.5f, ((float) ((int) (j >> 32))) - 0.5f, ((float) C289005cr.A00(j)) - 0.5f);
    }

    public void A0j(AnonymousClass5QA r7, GraphicsLayer graphicsLayer) {
        AnonymousClass5R6 r0 = this.A0H;
        C268124co A002 = AnonymousClass5RJ.A00(r0);
        C285045Pl A092 = r0.A09();
        int i = A092.A00;
        if (i > 0) {
            int i2 = 0;
            Object[] objArr = A092.A02;
            do {
                AnonymousClass5R6 r1 = (AnonymousClass5R6) objArr[i2];
                if (r1.A0U.A0J.A0E) {
                    r1.A0W.A04.A0k(r7, graphicsLayer);
                }
                i2++;
            } while (i2 < i);
        }
        if (((AndroidComposeView) A002).A0A) {
            A0i(r7, C268834e4.A02);
        }
    }

    public final void A0k(AnonymousClass5QA r7, GraphicsLayer graphicsLayer) {
        C289195dB r0 = this.A08;
        if (r0 != null) {
            r0.AQh(r7, graphicsLayer);
            return;
        }
        long j = this.A01;
        float f = (float) ((int) (j >> 32));
        float f2 = (float) ((int) (j & 4294967295L));
        r7.FHv(f, f2);
        A09(r7, graphicsLayer, this);
        r7.FHv(-f, -f2);
    }

    public final void A0l(C289145d6 r10) {
        C268054cg r0;
        C289145d6 r2 = this.A04;
        if (r10 != r2) {
            this.A04 = r10;
            if (!(r2 != null && r10.getWidth() == r2.getWidth() && r10.getHeight() == r2.getHeight())) {
                int width = r10.getWidth();
                int height = r10.getHeight();
                C289195dB r22 = this.A08;
                if (r22 != null) {
                    r22.EIP(C289155d7.A00(width, height));
                } else if (this.A0H.A0U.A0J.A0E && (r0 = this.A07) != null) {
                    r0.A0c();
                }
                A0E(C289155d7.A00(width, height));
                if (this.A09 != null) {
                    A0B(this, false);
                }
                0vu r02 = AnonymousClass5WB.A00;
                C267794cD r7 = A0X().A04;
                if (r7 != null) {
                    C267794cD A032 = A03(this, false);
                    while (A032 != null && (A032.A00 & 4) != 0) {
                        if ((A032.A01 & 4) != 0) {
                            C267794cD r5 = A032;
                            C285045Pl r03 = null;
                            do {
                                if (r5 instanceof C267814cG) {
                                    ((C267814cG) r5).DPk();
                                } else if ((r5.A01 & 4) != 0 && (r5 instanceof C267944cV)) {
                                    int i = 0;
                                    for (C267794cD r3 = ((C267944cV) r5).A00; r3 != null; r3 = r3.A02) {
                                        if ((r3.A01 & 4) != 0) {
                                            i++;
                                            if (i == 1) {
                                                r5 = r3;
                                            } else {
                                                if (r03 == null) {
                                                    r03 = new C285045Pl(new C267794cD[16]);
                                                }
                                                if (r5 != null) {
                                                    r03.A09(r5);
                                                    r5 = null;
                                                }
                                                r03.A09(r3);
                                            }
                                        }
                                    }
                                    if (i == 1) {
                                        continue;
                                    }
                                }
                                r5 = AnonymousClass5WH.A00(r03);
                                continue;
                            } while (r5 != null);
                        }
                        if (A032 == r7) {
                            break;
                        }
                        A032 = A032.A02;
                    }
                }
                AnonymousClass5R6 r1 = this.A0H;
                C268124co r04 = r1.A0A;
                if (r04 != null) {
                    r04.DNA(r1);
                }
            }
            Map map = this.A0G;
            if ((map != null && !map.isEmpty()) || (!r10.Aam().isEmpty())) {
                Map Aam = r10.Aam();
                if (!0qQ.A0K(Aam, this.A0G)) {
                    this.A0H.A0U.A0J.Aal().A04();
                    Map map2 = this.A0G;
                    if (map2 == null) {
                        map2 = new LinkedHashMap();
                        this.A0G = map2;
                    }
                    map2.clear();
                    map2.putAll(Aam);
                }
            }
        }
    }

    public final void A0m(AnonymousClass5T7 r16, AnonymousClass5S6 r17, long j, boolean z, boolean z2) {
        C289195dB r1;
        boolean z3 = z2;
        AnonymousClass5T7 r9 = r16;
        AnonymousClass5S6 r8 = r17;
        long j2 = j;
        boolean z4 = z;
        if (this instanceof C268834e4) {
            AnonymousClass5R6 r2 = this.A0H;
            if (r8.EsO(r2)) {
                if (!C289325dP.A01(j2) || ((r1 = this.A08) != null && this.A0A && !r1.CV6(j2))) {
                    if (z) {
                        float A0S = A0S(j2, A0T());
                        if (!Float.isInfinite(A0S) && !Float.isNaN(A0S)) {
                            z3 = false;
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                int i = r9.A00;
                C285045Pl A092 = r2.A09();
                int i2 = A092.A00;
                if (i2 > 0) {
                    int i3 = i2 - 1;
                    Object[] objArr = A092.A02;
                    do {
                        AnonymousClass5R6 r10 = (AnonymousClass5R6) objArr[i3];
                        if (r10.A0U.A0J.A0E) {
                            r8.AHA(r9, r10, j2, z4, z3);
                            long A002 = AnonymousClass5T7.A00(r9);
                            if (Float.intBitsToFloat((int) (A002 >> 32)) < 0.0f && ((int) (A002 & 4294967295L)) != 0) {
                                if (!r9.A02) {
                                    break;
                                }
                                r9.A00 = r9.size() - 1;
                            }
                        }
                        i3--;
                    } while (i3 >= 0);
                }
                r9.A00 = i;
                return;
            }
            return;
        }
        C268054cg r0 = this.A06;
        if (r0 != null) {
            r0.A0n(r9, r8, r0.A0V(j2), z4, z3);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00ca, code lost:
        if (X.C52420GRx.A00(X.AnonymousClass5T7.A00(r7), (r0 & 4294967295L) | (r2 << 32)) > 0) goto L_0x00cc;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0n(X.AnonymousClass5T7 r16, X.AnonymousClass5S6 r17, long r18, boolean r20, boolean r21) {
        /*
            r15 = this;
            r8 = r17
            int r0 = r8.ASm()
            r9 = r15
            X.4cD r6 = r15.A0Y(r0)
            r11 = r18
            boolean r0 = X.C289325dP.A01(r11)
            r7 = r16
            r13 = r20
            if (r0 == 0) goto L_0x0033
            X.5dB r1 = r15.A08
            if (r1 == 0) goto L_0x0025
            boolean r0 = r15.A0A
            if (r0 == 0) goto L_0x0025
            boolean r0 = r1.CV6(r11)
            if (r0 == 0) goto L_0x0033
        L_0x0025:
            r14 = r21
            if (r6 != 0) goto L_0x0067
            r0 = r15
            r1 = r7
            r2 = r8
            r3 = r11
            r5 = r13
            r6 = r14
            r0.A0m(r1, r2, r3, r5, r6)
        L_0x0032:
            return
        L_0x0033:
            r14 = 0
            if (r20 == 0) goto L_0x0032
            long r0 = r15.A0T()
            float r10 = r15.A0S(r11, r0)
            boolean r0 = java.lang.Float.isInfinite(r10)
            if (r0 != 0) goto L_0x0032
            boolean r0 = java.lang.Float.isNaN(r10)
            if (r0 != 0) goto L_0x0032
            int r1 = r7.A00
            int r0 = r7.size()
            int r0 = r0 + -1
            if (r1 == r0) goto L_0x00cc
            int r0 = java.lang.Float.floatToIntBits(r10)
            long r0 = (long) r0
            r2 = 32
            long r0 = r0 << r2
            long r2 = X.AnonymousClass5T7.A00(r7)
            int r0 = X.C52420GRx.A00(r2, r0)
            if (r0 <= 0) goto L_0x0032
            goto L_0x00cc
        L_0x0067:
            float r3 = X.C289295dM.A01(r11)
            float r2 = X.C289295dM.A02(r11)
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0095
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0095
            int r0 = r15.A0H()
            float r0 = (float) r0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x0095
            int r0 = r15.A0G()
            float r0 = (float) r0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x0095
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r15
            r4 = r11
            r6 = r13
            r7 = r14
            A07(r0, r1, r2, r3, r4, r6, r7)
            return
        L_0x0095:
            if (r20 != 0) goto L_0x00d3
            r10 = 2139095040(0x7f800000, float:Infinity)
        L_0x0099:
            boolean r0 = java.lang.Float.isInfinite(r10)
            if (r0 != 0) goto L_0x00dc
            boolean r0 = java.lang.Float.isNaN(r10)
            if (r0 != 0) goto L_0x00dc
            int r1 = r7.A00
            int r0 = r7.size()
            int r0 = r0 + -1
            if (r1 == r0) goto L_0x00cc
            int r0 = java.lang.Float.floatToIntBits(r10)
            long r2 = (long) r0
            if (r21 == 0) goto L_0x00d0
            r0 = 1
        L_0x00b8:
            r4 = 32
            long r2 = r2 << r4
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r4
            long r0 = r0 | r2
            long r2 = X.AnonymousClass5T7.A00(r7)
            int r0 = X.C52420GRx.A00(r2, r0)
            if (r0 <= 0) goto L_0x00dc
        L_0x00cc:
            A05(r6, r7, r8, r9, r10, r11, r13, r14)
            return
        L_0x00d0:
            r0 = 0
            goto L_0x00b8
        L_0x00d3:
            long r0 = r15.A0T()
            float r10 = r15.A0S(r11, r0)
            goto L_0x0099
        L_0x00dc:
            A06(r6, r7, r8, r9, r10, r11, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C268054cg.A0n(X.5T7, X.5S6, long, boolean, boolean):void");
    }

    public final boolean A0p() {
        if (this.A08 != null && this.A0D <= 0.0f) {
            return true;
        }
        C268054cg r0 = this.A07;
        if (r0 != null) {
            return r0.A0p();
        }
        return false;
    }

    public final float AwL() {
        return this.A0H.A0C.AwL();
    }

    public final float B77() {
        return this.A0H.A0C.B77();
    }

    public final long Bwh() {
        return this.A03;
    }

    public final boolean CeH() {
        if (this.A08 == null || this.A0C || this.A0H.A0A == null) {
            return false;
        }
        return true;
    }

    public final void FHq(float[] fArr) {
        C268124co A002 = AnonymousClass5RJ.A00(this.A0H);
        A0D(A04(C289425dZ.A02(this)), fArr);
        A002.CgZ(fArr);
    }

    public final AnonymousClass5Q8 getLayoutDirection() {
        return this.A0H.A0D;
    }

    public C268054cg(AnonymousClass5R6 r3) {
        this.A0H = r3;
        this.A0E = r3.A0C;
        this.A0F = r3.A0D;
    }

    private final void A0C(C268054cg r7, float[] fArr) {
        if (!0qQ.A0K(r7, this)) {
            C268054cg r0 = this.A07;
            0qQ.A0A(r0);
            r0.A0C(r7, fArr);
            long j = this.A01;
            if (j != 0) {
                float[] fArr2 = A0Q;
                AnonymousClass5S4.A02(fArr2);
                AnonymousClass5S4.A04(fArr2, -((float) ((int) (j >> 32))), -((float) ((int) (j & 4294967295L))));
                AnonymousClass5S4.A05(fArr, fArr2);
            }
            C289195dB r02 = this.A08;
            if (r02 != null) {
                r02.CNp(fArr);
            }
        }
    }

    public final float A0S(long j, long j2) {
        float A0H2;
        float A0G2;
        if (((float) A0H()) < C288025bF.A02(j2) || ((float) A0G()) < C288025bF.A00(j2)) {
            long A0U = A0U(j2);
            float A022 = C288025bF.A02(A0U);
            float A002 = C288025bF.A00(A0U);
            float A012 = C289295dM.A01(j);
            if (A012 < 0.0f) {
                A0H2 = -A012;
            } else {
                A0H2 = A012 - ((float) A0H());
            }
            float max = Math.max(0.0f, A0H2);
            float A023 = C289295dM.A02(j);
            if (A023 < 0.0f) {
                A0G2 = -A023;
            } else {
                A0G2 = A023 - ((float) A0G());
            }
            long A003 = C289325dP.A00(max, Math.max(0.0f, A0G2));
            if ((A022 > 0.0f || A002 > 0.0f) && C289295dM.A01(A003) <= A022 && C289295dM.A02(A003) <= A002) {
                float intBitsToFloat = Float.intBitsToFloat((int) (A003 >> 32));
                float intBitsToFloat2 = Float.intBitsToFloat((int) (A003 & 4294967295L));
                return (intBitsToFloat * intBitsToFloat) + (intBitsToFloat2 * intBitsToFloat2);
            }
        }
        return Float.POSITIVE_INFINITY;
    }

    public final long A0U(long j) {
        return C288015bE.A00(Math.max(0.0f, (C288025bF.A02(j) - ((float) A0H())) / 2.0f), Math.max(0.0f, (C288025bF.A00(j) - ((float) A0G())) / 2.0f));
    }

    public final C268064ch Bab() {
        if (!A0X().A08) {
            I2E.A01(C273654mx.A00(57));
            throw AnonymousClass00P.createAndThrow();
        }
        A0d();
        return this.A0H.A0W.A04.A07;
    }

    public final boolean COx() {
        return A0X().A08;
    }

    /* JADX WARNING: type inference failed for: r4v4, types: [X.5db, java.lang.Object] */
    public final AnonymousClass5VN CgV(C268064ch r9, boolean z) {
        String obj;
        if (!A0X().A08) {
            obj = C273654mx.A00(57);
        } else if (!r9.COx()) {
            StringBuilder sb = new StringBuilder();
            sb.append("LayoutCoordinates ");
            sb.append(r9);
            sb.append(" is not attached!");
            obj = sb.toString();
        } else {
            C268054cg A042 = A04(r9);
            A042.A0d();
            C268054cg A0a = A0a(A042);
            C289445db r4 = this.A02;
            C289445db r42 = r4;
            if (r4 == null) {
                ? obj2 = new Object();
                obj2.A01 = 0.0f;
                obj2.A03 = 0.0f;
                obj2.A02 = 0.0f;
                obj2.A00 = 0.0f;
                this.A02 = obj2;
                r42 = obj2;
            }
            r42.A01 = 0.0f;
            r42.A03 = 0.0f;
            long Bwh = r9.Bwh();
            r42.A02 = (float) ((int) (Bwh >> 32));
            r42.A00 = (float) C289005cr.A00(Bwh);
            while (A042 != A0a) {
                A042.A0h(r42, z, false);
                if (r42.A01 >= r42.A02 || r42.A03 >= r42.A00) {
                    return AnonymousClass5VN.A04;
                }
                A042 = A042.A07;
                0qQ.A0A(A042);
            }
            A08(r42, A0a, z);
            return new AnonymousClass5VN(r42.A01, r42.A03, r42.A02, r42.A00);
        }
        I2E.A01(obj);
        throw AnonymousClass00P.createAndThrow();
    }

    public final long CgY(long j) {
        if (!A0X().A08) {
            I2E.A01(C273654mx.A00(57));
            throw AnonymousClass00P.createAndThrow();
        }
        A0d();
        C268054cg r0 = this;
        do {
            j = r0.A0W(j);
            r0 = r0.A07;
        } while (r0 != null);
        return j;
    }

    public final long Cgb(long j) {
        long CgY = CgY(j);
        AndroidComposeView androidComposeView = (AndroidComposeView) AnonymousClass5RJ.A00(this.A0H);
        AndroidComposeView.A0D(androidComposeView);
        return AnonymousClass5S4.A00(androidComposeView.A0o, CgY);
    }

    public final long EKS(long j) {
        if (!A0X().A08) {
            I2E.A01(C273654mx.A00(57));
            throw AnonymousClass00P.createAndThrow();
        }
        return CgX(C289425dZ.A02(this), AnonymousClass5RJ.A00(this.A0H).EKS(j), true);
    }

    public final void FHn(C268064ch r3, float[] fArr) {
        C268054cg A042 = A04(r3);
        A042.A0d();
        C268054cg A0a = A0a(A042);
        AnonymousClass5S4.A02(fArr);
        A042.A0D(A0a, fArr);
        A0C(A0a, fArr);
    }

    public final long FNU(long j) {
        if (!A0X().A08) {
            I2E.A01(C273654mx.A00(57));
            throw AnonymousClass00P.createAndThrow();
        }
        C268064ch A022 = C289425dZ.A02(this);
        AndroidComposeView androidComposeView = (AndroidComposeView) AnonymousClass5RJ.A00(this.A0H);
        AndroidComposeView.A0D(androidComposeView);
        return CgX(A022, C289295dM.A06(AnonymousClass5S4.A00(androidComposeView.A0p, j), A022.CgY(0)), true);
    }
}
