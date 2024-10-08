package X;

import android.os.Build;
import android.view.ViewGroup;
import androidx.compose.ui.graphics.layer.GraphicsLayer;

/* renamed from: X.5Sy  reason: invalid class name and case insensitive filesystem */
public final class C285845Sy implements C285855Sz {
    public static boolean A03 = true;
    public C52848Gdh A00;
    public final ViewGroup A01;
    public final Object A02 = new Object();

    /* JADX WARNING: type inference failed for: r2v2, types: [android.view.View, X.Gdh, android.view.ViewGroup] */
    /* JADX WARNING: type inference failed for: r2v5, types: [android.view.View, X.Gdh, android.view.ViewGroup] */
    public final GraphicsLayer AM9() {
        C289225dE ig6;
        GraphicsLayer graphicsLayer;
        synchronized (this.A02) {
            ViewGroup viewGroup = this.A01;
            if (Build.VERSION.SDK_INT >= 29) {
                C289205dC.A00(viewGroup);
                new C289215dD
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0010: CONSTRUCTOR  (r1v8 ? I:X.5dD) =  call: X.5dD.<init>():void type: CONSTRUCTOR in method: X.5Sy.AM9():androidx.compose.ui.graphics.layer.GraphicsLayer, dex: classes3.dex
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
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                    	at jadx.core.codegen.RegionGen.makeSynchronizedRegion(RegionGen.java:260)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:70)
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
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r1v8 ?
                    	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:189)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:620)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                    	... 41 more
                    */
                /*
                    this = this;
                    java.lang.Object r3 = r5.A02
                    monitor-enter(r3)
                    android.view.ViewGroup r4 = r5.A01     // Catch:{ all -> 0x007f }
                    int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x007f }
                    r0 = 29
                    if (r1 < r0) goto L_0x0019
                    X.C289205dC.A00(r4)     // Catch:{ all -> 0x007f }
                    X.5dD r1 = new X.5dD     // Catch:{ all -> 0x007f }
                    r1.<init>()     // Catch:{ all -> 0x007f }
                L_0x0013:
                    androidx.compose.ui.graphics.layer.GraphicsLayer r0 = new androidx.compose.ui.graphics.layer.GraphicsLayer     // Catch:{ all -> 0x007f }
                    r0.<init>(r1)     // Catch:{ all -> 0x007f }
                    goto L_0x007d
                L_0x0019:
                    boolean r0 = A03     // Catch:{ all -> 0x007f }
                    if (r0 == 0) goto L_0x0051
                    X.XEA r1 = new X.XEA     // Catch:{ all -> 0x0023 }
                    r1.<init>(r4)     // Catch:{ all -> 0x0023 }
                    goto L_0x0013
                L_0x0023:
                    r1 = 0
                    A03 = r1     // Catch:{ all -> 0x007f }
                    android.graphics.Canvas r0 = X.IG6.A0O     // Catch:{ all -> 0x007f }
                    X.Gdh r2 = r5.A00     // Catch:{ all -> 0x007f }
                    if (r2 != 0) goto L_0x004b
                    android.content.Context r0 = r4.getContext()     // Catch:{ all -> 0x007f }
                    X.Gdh r2 = new X.Gdh     // Catch:{ all -> 0x007f }
                    r2.<init>(r0)     // Catch:{ all -> 0x007f }
                    r2.setClipChildren(r1)     // Catch:{ all -> 0x007f }
                    r2.setClipToPadding(r1)     // Catch:{ all -> 0x007f }
                    r1 = 2131433924(0x7f0b19c4, float:1.8489647E38)
                    r0 = 1
                    java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x007f }
                    r2.setTag(r1, r0)     // Catch:{ all -> 0x007f }
                    r4.addView(r2)     // Catch:{ all -> 0x007f }
                    r5.A00 = r2     // Catch:{ all -> 0x007f }
                L_0x004b:
                    X.IG6 r1 = new X.IG6     // Catch:{ all -> 0x007f }
                    r1.<init>(r2)     // Catch:{ all -> 0x007f }
                    goto L_0x0013
                L_0x0051:
                    android.graphics.Canvas r0 = X.IG6.A0O     // Catch:{ all -> 0x007f }
                    X.Gdh r2 = r5.A00     // Catch:{ all -> 0x007f }
                    if (r2 != 0) goto L_0x0077
                    android.content.Context r0 = r4.getContext()     // Catch:{ all -> 0x007f }
                    X.Gdh r2 = new X.Gdh     // Catch:{ all -> 0x007f }
                    r2.<init>(r0)     // Catch:{ all -> 0x007f }
                    r0 = 0
                    r2.setClipChildren(r0)     // Catch:{ all -> 0x007f }
                    r2.setClipToPadding(r0)     // Catch:{ all -> 0x007f }
                    r1 = 2131433924(0x7f0b19c4, float:1.8489647E38)
                    r0 = 1
                    java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x007f }
                    r2.setTag(r1, r0)     // Catch:{ all -> 0x007f }
                    r4.addView(r2)     // Catch:{ all -> 0x007f }
                    r5.A00 = r2     // Catch:{ all -> 0x007f }
                L_0x0077:
                    X.IG6 r1 = new X.IG6     // Catch:{ all -> 0x007f }
                    r1.<init>(r2)     // Catch:{ all -> 0x007f }
                    goto L_0x0013
                L_0x007d:
                    monitor-exit(r3)
                    return r0
                L_0x007f:
                    r0 = move-exception
                    monitor-exit(r3)
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C285845Sy.AM9():androidx.compose.ui.graphics.layer.GraphicsLayer");
            }

            public final void ECb(GraphicsLayer graphicsLayer) {
                synchronized (this.A02) {
                    if (!graphicsLayer.A0E) {
                        graphicsLayer.A0E = true;
                        GraphicsLayer.A01(graphicsLayer);
                    }
                }
            }

            public C285845Sy(ViewGroup viewGroup) {
                this.A01 = viewGroup;
            }
        }
