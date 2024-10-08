package X;

import android.content.Context;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

public abstract class I5O {
    public static final C267314bM A00 = new C267304bL(C58339IqK.A00);

    public static final void A01(C286575Wy r9, AnonymousClass5VN r10, C53286GlY glY, 0sP r12, 0sL r13, 0sL r14, int i, int i2) {
        int i3;
        AnonymousClass5VN r8 = r10;
        0sP r4 = r12;
        0sL r6 = r13;
        0sL r5 = r14;
        C53286GlY glY2 = glY;
        C51974G9v.A1O(r10, r13, r14, r12);
        C286575Wy r2 = r9;
        r9.ExV(825298767);
        int i4 = i2;
        int i5 = i;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = G9t.A0O(r2, r8) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= G9t.A0F(r2, r13);
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= G9t.A0G(r2, r14);
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= G9t.A0H(r2, r12);
        }
        int i6 = i2 & 16;
        if (i6 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= G9t.A0S(r2, glY);
        }
        if ((i3 & 9363) != 9362 || !r2.Bwn()) {
            if (i6 != 0) {
                new C53286GlY
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0052: CONSTRUCTOR  (r7v2 ? I:X.GlY) =  call: X.GlY.<init>():void type: CONSTRUCTOR in method: X.I5O.A01(X.5Wy, X.5VN, X.GlY, X.0sP, X.0sL, X.0sL, int, int):void, dex: classes7.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:256)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                    	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.util.ArrayList.forEach(ArrayList.java:1259)
                    	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                    	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                    	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                    	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                    	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                    	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                    	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                    	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                    	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                    	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r7v2 ?
                    	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:189)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:620)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                    	... 39 more
                    */
                /*
                    r8 = r10
                    r4 = r12
                    r6 = r13
                    r5 = r14
                    r7 = r11
                    X.C51974G9v.A1O(r10, r13, r14, r12)
                    r0 = 825298767(0x31310f4f, float:2.5765592E-9)
                    r2 = r9
                    r9.ExV(r0)
                    r10 = r16
                    r0 = r16 & 1
                    r9 = r15
                    if (r0 == 0) goto L_0x00b0
                    r0 = r15 | 6
                L_0x0018:
                    r1 = r16 & 2
                    if (r1 == 0) goto L_0x00a5
                    r0 = r0 | 48
                L_0x001e:
                    r1 = r16 & 4
                    if (r1 == 0) goto L_0x009b
                    r0 = r0 | 384(0x180, float:5.38E-43)
                L_0x0024:
                    r1 = r16 & 8
                    if (r1 == 0) goto L_0x0091
                    r0 = r0 | 3072(0xc00, float:4.305E-42)
                L_0x002a:
                    r3 = r16 & 16
                    if (r3 == 0) goto L_0x0087
                    r0 = r0 | 24576(0x6000, float:3.4438E-41)
                L_0x0030:
                    r1 = r0 & 9363(0x2493, float:1.312E-41)
                    r0 = 9362(0x2492, float:1.3119E-41)
                    if (r1 != r0) goto L_0x004e
                    boolean r0 = r2.Bwn()
                    if (r0 == 0) goto L_0x004e
                    r2.Evl()
                L_0x003f:
                    X.5Xd r0 = r2.ASQ()
                    if (r0 == 0) goto L_0x004d
                    r11 = 4
                    X.J9z r3 = new X.J9z
                    r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
                    r0.A06 = r3
                L_0x004d:
                    return
                L_0x004e:
                    if (r3 == 0) goto L_0x0055
                    X.GlY r7 = new X.GlY
                    r7.<init>()
                L_0x0055:
                    boolean r0 = X.0fL.A02()
                    if (r0 == 0) goto L_0x0063
                    r1 = -1107811929(0xffffffffbdf821a7, float:-0.12115794)
                    java.lang.String r0 = "com.instagram.creation.capture.assetpicker.cutout.crop.CropRectangle (CropRectangle.kt:56)"
                    X.0fL.A01(r1, r0)
                L_0x0063:
                    X.4bM r0 = A00
                    X.5Xl r1 = r0.A02(r7)
                    r0 = -1889598449(0xffffffff8f5f040f, float:-1.09955305E-29)
                    r12 = 4
                    X.J7t r11 = new X.J7t
                    r13 = r4
                    r14 = r6
                    r15 = r5
                    r16 = r8
                    r11.<init>(r12, r13, r14, r15, r16)
                    X.C51971G9r.A11(r2, r1, r11, r0)
                    boolean r0 = X.0fL.A02()
                    if (r0 == 0) goto L_0x003f
                    r0 = 1522352090(0x5abd3fda, float:2.66344881E16)
                    X.0fL.A00(r0)
                    goto L_0x003f
                L_0x0087:
                    r1 = r15 & 24576(0x6000, float:3.4438E-41)
                    if (r1 != 0) goto L_0x0030
                    int r1 = X.G9t.A0S(r2, r11)
                    r0 = r0 | r1
                    goto L_0x0030
                L_0x0091:
                    r1 = r15 & 3072(0xc00, float:4.305E-42)
                    if (r1 != 0) goto L_0x002a
                    int r1 = X.G9t.A0H(r2, r12)
                    r0 = r0 | r1
                    goto L_0x002a
                L_0x009b:
                    r1 = r15 & 384(0x180, float:5.38E-43)
                    if (r1 != 0) goto L_0x0024
                    int r1 = X.G9t.A0G(r2, r14)
                    r0 = r0 | r1
                    goto L_0x0024
                L_0x00a5:
                    r1 = r15 & 48
                    if (r1 != 0) goto L_0x001e
                    int r1 = X.G9t.A0F(r2, r13)
                    r0 = r0 | r1
                    goto L_0x001e
                L_0x00b0:
                    r0 = r15 & 6
                    if (r0 != 0) goto L_0x00bb
                    int r0 = X.G9t.A0O(r2, r8)
                    r0 = r0 | r15
                    goto L_0x0018
                L_0x00bb:
                    r0 = r15
                    goto L_0x0018
                */
                throw new UnsupportedOperationException("Method not decompiled: X.I5O.A01(X.5Wy, X.5VN, X.GlY, X.0sP, X.0sL, X.0sL, int, int):void");
            }

            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v27, resolved type: java.lang.Object} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v28, resolved type: java.lang.Object} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v42, resolved type: X.Ix7} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v3, resolved type: X.Ix7} */
            /* JADX WARNING: Code restructure failed: missing block: B:36:0x010c, code lost:
                if (r0 == X.AnonymousClass5XT.A00) goto L_0x010e;
             */
            /* JADX WARNING: Multi-variable type inference failed */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public static final void A00(X.C286575Wy r16, X.AnonymousClass5VN r17, X.C54605HKo r18, X.0sL r19, int r20) {
                /*
                    r0 = 302626865(0x1209b831, float:4.345661E-28)
                    r8 = r16
                    r8.ExV(r0)
                    r4 = r20
                    r0 = r20 & 6
                    r7 = r17
                    if (r0 != 0) goto L_0x0132
                    int r12 = X.G9t.A0O(r8, r7)
                    r12 = r12 | r20
                L_0x0016:
                    r0 = r20 & 48
                    r13 = 32
                    r6 = r18
                    if (r0 != 0) goto L_0x0023
                    int r0 = X.G9t.A0P(r8, r6)
                    r12 = r12 | r0
                L_0x0023:
                    r0 = r4 & 384(0x180, float:5.38E-43)
                    r5 = r19
                    if (r0 != 0) goto L_0x002e
                    int r0 = X.G9t.A0G(r8, r5)
                    r12 = r12 | r0
                L_0x002e:
                    r1 = r12 & 147(0x93, float:2.06E-43)
                    r0 = 146(0x92, float:2.05E-43)
                    if (r1 != r0) goto L_0x004c
                    boolean r0 = r8.Bwn()
                    if (r0 == 0) goto L_0x004c
                    r8.Evl()
                L_0x003d:
                    X.5Xd r1 = r8.ASQ()
                    if (r1 == 0) goto L_0x004b
                    r0 = 20
                    X.JGN r0 = X.JGN.A01(r5, r6, r7, r4, r0)
                    r1.A06 = r0
                L_0x004b:
                    return
                L_0x004c:
                    boolean r0 = X.0fL.A02()
                    if (r0 == 0) goto L_0x005a
                    r1 = 1983158598(0x76349946, float:9.157443E32)
                    java.lang.String r0 = "com.instagram.creation.capture.assetpicker.cutout.crop.CropCorner (CropRectangle.kt:216)"
                    X.0fL.A01(r1, r0)
                L_0x005a:
                    X.4bM r9 = A00
                    java.lang.Object r0 = r8.AJO(r9)
                    X.GlY r0 = (X.C53286GlY) r0
                    float r14 = r0.A01
                    X.4bM r2 = X.AnonymousClass5YA.A01
                    X.4cd r0 = X.C51966G9m.A0j(r8, r2)
                    float r11 = r0.F06(r14)
                    java.lang.Object r0 = r8.AJO(r9)
                    X.GlY r0 = (X.C53286GlY) r0
                    float r1 = r0.A02
                    X.4cd r0 = X.C51966G9m.A0j(r8, r2)
                    float r18 = r0.F06(r1)
                    java.lang.Object r0 = r8.AJO(r9)
                    X.GlY r0 = (X.C53286GlY) r0
                    long r2 = r0.A05
                    r8.AJO(r9)
                    r10 = 0
                    X.5Qk r15 = androidx.compose.ui.Modifier.A00
                    r0 = -826371397(0xffffffffcebe92bb, float:-1.59864358E9)
                    r8.ExS(r0)
                    r1 = r12 & 112(0x70, float:1.57E-43)
                    r17 = 1
                    boolean r9 = X.AnonymousClass7TF.A1S(r1, r13)
                    boolean r0 = X.C51973G9u.A1G(r12)
                    r9 = r9 | r0
                    boolean r9 = X.C51966G9m.A1S(r8, r11, r9)
                    java.lang.Object r0 = r8.ECw()
                    if (r9 != 0) goto L_0x00ad
                    java.lang.Object r9 = X.AnonymousClass5XT.A00
                    if (r0 != r9) goto L_0x00b6
                L_0x00ad:
                    r9 = 6
                    X.Iwv r0 = new X.Iwv
                    r0.<init>(r6, r7, r11, r9)
                    r8.FLL(r0)
                L_0x00b6:
                    X.0sP r0 = (X.0sP) r0
                    X.5Wx r9 = X.C51965G9l.A0H(r8, r10)
                    androidx.compose.ui.Modifier r0 = X.C56164Htt.A01(r15, r0)
                    androidx.compose.ui.Modifier r16 = X.C287205Zk.A0C(r0, r14)
                    X.0gF r14 = X.C60340gF.A00
                    r0 = -826367485(0xffffffffcebea203, float:-1.59914432E9)
                    boolean r15 = X.C51974G9v.A1Z(r8, r0, r12)
                    boolean r0 = X.C51972G9s.A1J(r1)
                    r15 = r15 | r0
                    java.lang.Object r12 = r8.ECw()
                    if (r15 != 0) goto L_0x00dc
                    java.lang.Object r0 = X.AnonymousClass5XT.A00
                    if (r12 != r0) goto L_0x00e7
                L_0x00dc:
                    r15 = 0
                    r0 = 43
                    X.MH4 r12 = new X.MH4
                    r12.<init>((java.lang.Object) r6, (java.lang.Object) r5, (X.AnonymousClass4D7) r15, (int) r0)
                    r8.FLL(r12)
                L_0x00e7:
                    r0 = r16
                    androidx.compose.ui.Modifier r12 = X.C51969G9p.A0W(r9, r0, r12, r14, r10)
                    r0 = -826361213(0xffffffffcebeba83, float:-1.59994714E9)
                    boolean r0 = X.C51967G9n.A1W(r8, r0, r10)
                    if (r1 == r13) goto L_0x00f8
                    r17 = 0
                L_0x00f8:
                    r0 = r0 | r17
                    boolean r1 = X.C51966G9m.A1T(r8, r2, r0)
                    r0 = r18
                    boolean r1 = X.C51975G9x.A1R(r8, r11, r0, r1)
                    java.lang.Object r0 = r8.ECw()
                    if (r1 != 0) goto L_0x010e
                    java.lang.Object r1 = X.AnonymousClass5XT.A00
                    if (r0 != r1) goto L_0x0120
                L_0x010e:
                    X.Ix7 r0 = new X.Ix7
                    r19 = r2
                    r16 = r18
                    r17 = r11
                    r18 = r10
                    r14 = r0
                    r15 = r6
                    r14.<init>(r15, r16, r17, r18, r19)
                    r8.FLL(r0)
                L_0x0120:
                    androidx.compose.ui.Modifier r0 = X.C51975G9x.A0I(r9, r12, r0, r10)
                    boolean r0 = X.C51967G9n.A1X(r8, r0)
                    if (r0 == 0) goto L_0x003d
                    r0 = 1276025339(0x4c0e99fb, float:3.7382124E7)
                    X.0fL.A00(r0)
                    goto L_0x003d
                L_0x0132:
                    r12 = r4
                    goto L_0x0016
                */
                throw new UnsupportedOperationException("Method not decompiled: X.I5O.A00(X.5Wy, X.5VN, X.HKo, X.0sL, int):void");
            }

            public static final void A02(C286575Wy r15, 0sP r16, int i, long j, long j2) {
                int i2;
                r15.ExV(-1943476931);
                int i3 = i;
                long j3 = j;
                if ((i & 6) == 0) {
                    i2 = C51970G9q.A05(r15.AGt(j3) ? 1 : 0) | i;
                } else {
                    i2 = i3;
                }
                long j4 = j2;
                if ((i & 48) == 0) {
                    i2 |= G9t.A0C(r15, j4);
                }
                0sP r9 = r16;
                if ((i3 & 384) == 0) {
                    i2 |= G9t.A0G(r15, r9);
                }
                if ((i2 & 147) != 146 || !r15.Bwn()) {
                    if (0fL.A02()) {
                        0fL.A01(-2018649558, "com.instagram.creation.capture.assetpicker.cutout.crop.CropEdge (CropRectangle.kt:285)");
                    }
                    long A06 = C289295dM.A06(j4, j3);
                    r15.AJO(A00);
                    C285245Qk r5 = Modifier.A00;
                    r15.ExS(-293439328);
                    boolean A1S = AnonymousClass7TF.A1S(i2 & 14, 4);
                    Object ECw = r15.ECw();
                    if (A1S || ECw == AnonymousClass5XT.A00) {
                        ECw = new GQ2(j3, 6);
                        r15.FLL(ECw);
                    }
                    C286565Wx A0H = C51965G9l.A0H(r15, false);
                    Modifier A01 = C56164Htt.A01(r5, (0sP) ECw);
                    C267314bM r6 = AndroidCompositionLocals_androidKt.A01;
                    Modifier A08 = C287205Zk.A08(C287205Zk.A0D(A01, 0nA.A01((Context) r15.AJO(r6), C289295dM.A01(A06))), 0nA.A01((Context) r15.AJO(r6), C289295dM.A02(A06)));
                    C60340gF r62 = C60340gF.A00;
                    r15.ExS(-293432961);
                    boolean A1N = C51972G9s.A1N(i2);
                    Object ECw2 = r15.ECw();
                    if (A1N || ECw2 == AnonymousClass5XT.A00) {
                        ECw2 = new C66188MGz((Object) r9, (AnonymousClass4D7) null, 48, 42);
                        r15.FLL(ECw2);
                    }
                    Modifier A0W = C51969G9p.A0W(A0H, A08, ECw2, r62, false);
                    boolean A1W = C51967G9n.A1W(r15, -293427176, false);
                    Object ECw3 = r15.ECw();
                    if (A1W || ECw3 == AnonymousClass5XT.A00) {
                        ECw3 = new GL4(false, 6);
                        r15.FLL(ECw3);
                    }
                    if (C51967G9n.A1X(r15, C51975G9x.A0I(A0H, A0W, ECw3, false))) {
                        0fL.A00(-633856412);
                    }
                } else {
                    r15.Evl();
                }
                C286625Xd ASQ = r15.ASQ();
                if (ASQ != null) {
                    ASQ.A06 = new J7A(r9, i3, j3, j4);
                }
            }
        }
