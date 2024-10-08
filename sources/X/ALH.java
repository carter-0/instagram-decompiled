package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.opengl.GLES20;
import android.opengl.GLException;
import android.opengl.GLSurfaceView;
import android.opengl.GLUtils;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

public final class ALH implements GLSurfaceView.Renderer {
    public static final float[] A0B = {1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
    public C62320sa A00;
    public final AnonymousClass9g9 A01;
    public final AJ6 A02;
    public final C39877ACy A03;
    public final A95 A04;
    public final Map A05 = AnonymousClass7TE.A1E();
    public final Semaphore A06;
    public final AtomicInteger A07 = new AtomicInteger(0);
    public final C345557ti A08;
    public final ArrayList A09;
    public final boolean A0A;

    /* JADX WARNING: type inference failed for: r1v2, types: [java.lang.Object, X.8o4] */
    public ALH(Context context, boolean z) {
        this.A0A = z;
        this.A08 = new C345557ti(context.getResources());
        this.A09 = AnonymousClass7TE.A1C();
        this.A06 = new Semaphore(1);
        this.A04 = new A95();
        this.A01 = new AnonymousClass9g9(new Object(), C365998o1.A00(context.getApplicationContext(), true));
        this.A02 = new AJ6();
        this.A03 = new C39877ACy(new MP8(this, 15));
    }

    /* JADX WARNING: type inference failed for: r1v7, types: [X.8so, java.lang.Object] */
    /*  JADX ERROR: IF instruction can be used only in fallback mode
        jadx.core.utils.exceptions.CodegenException: IF instruction can be used only in fallback mode
        	at jadx.core.codegen.InsnGen.fallbackOnlyInsn(InsnGen.java:579)
        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:485)
        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
        	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:205)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
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
        */
    private final void A00() {
        /*
            r15 = this;
            r14 = r15
            X.ACi r13 = X.C39862ACi.A00
            monitor-enter(r13)
            monitor-exit(r13)
            r5 = 4
            monitor-enter(r14)
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1C()     // Catch:{ all -> 0x0166 }
            java.util.Map r7 = r15.A05     // Catch:{ all -> 0x0166 }
            java.util.Set r11 = r7.keySet()     // Catch:{ all -> 0x0166 }
        L_0x0011:
            boolean r0 = r11.isEmpty()     // Catch:{ all -> 0x0166 }
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0093
            int r3 = r4.size()     // Catch:{ all -> 0x0166 }
            java.util.Iterator r10 = r11.iterator()     // Catch:{ all -> 0x0166 }
        L_0x0021:
            boolean r0 = r10.hasNext()     // Catch:{ all -> 0x0166 }
            if (r0 == 0) goto L_0x0089
            java.lang.Object r6 = r10.next()     // Catch:{ all -> 0x0166 }
            java.lang.Object r2 = r7.get(r6)     // Catch:{ all -> 0x0166 }
            X.A7W r2 = (X.A7W) r2     // Catch:{ all -> 0x0166 }
            if (r2 == 0) goto L_0x0082
            monitor-enter(r2)     // Catch:{ all -> 0x0166 }
            java.util.Queue r1 = r2.A00     // Catch:{ all -> 0x0090 }
            boolean r0 = r1.isEmpty()     // Catch:{ all -> 0x0090 }
            if (r0 != 0) goto L_0x0043
            java.lang.Object r8 = r1.remove()     // Catch:{ all -> 0x0090 }
            android.graphics.Bitmap r8 = (android.graphics.Bitmap) r8     // Catch:{ all -> 0x0090 }
            goto L_0x0044
        L_0x0043:
            r8 = 0
        L_0x0044:
            monitor-exit(r2)     // Catch:{ all -> 0x0166 }
            if (r8 == 0) goto L_0x0082
            X.A95 r0 = r15.A04     // Catch:{ all -> 0x0166 }
            X.A5k[] r9 = r0.A05     // Catch:{ all -> 0x0166 }
            r0 = 2
            r0 = r9[r0]     // Catch:{ all -> 0x0166 }
            java.util.concurrent.atomic.AtomicInteger r0 = r0.A00     // Catch:{ all -> 0x0166 }
            r0.incrementAndGet()     // Catch:{ all -> 0x0166 }
            java.lang.String r0 = "InputSurface"
            X.7uz r1 = new X.7uz     // Catch:{ all -> 0x0166 }
            r1.<init>(r0)     // Catch:{ all -> 0x0166 }
            r0 = 0
            r1.A05 = r8     // Catch:{ all -> 0x0166 }
            X.7v0 r2 = new X.7v0     // Catch:{ all -> 0x0166 }
            r2.<init>(r1)     // Catch:{ all -> 0x0166 }
            r0 = r9[r0]     // Catch:{ all -> 0x0166 }
            java.util.concurrent.atomic.AtomicInteger r0 = r0.A01     // Catch:{ all -> 0x0166 }
            r0.incrementAndGet()     // Catch:{ all -> 0x0166 }
            r8.recycle()     // Catch:{ all -> 0x0166 }
            X.8so r1 = new X.8so     // Catch:{ all -> 0x0166 }
            r1.<init>()     // Catch:{ all -> 0x0166 }
            r1.A01 = r2     // Catch:{ all -> 0x0166 }
            float[] r0 = X.C368538so.A06     // Catch:{ all -> 0x0166 }
            r1.A04 = r0     // Catch:{ all -> 0x0166 }
            r1.A05 = r0     // Catch:{ all -> 0x0166 }
            r1.A03 = r0     // Catch:{ all -> 0x0166 }
            float[] r0 = A0B     // Catch:{ all -> 0x0166 }
            r1.A02 = r0     // Catch:{ all -> 0x0166 }
            X.AnonymousClass7TF.A1I(r6, r1, r4)     // Catch:{ all -> 0x0166 }
        L_0x0082:
            int r0 = r4.size()     // Catch:{ all -> 0x0166 }
            if (r0 < r5) goto L_0x0021
            goto L_0x0093
        L_0x0089:
            int r0 = r4.size()     // Catch:{ all -> 0x0166 }
            if (r0 != r3) goto L_0x0011
            goto L_0x0093
        L_0x0090:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0166 }
            throw r0     // Catch:{ all -> 0x0166 }
        L_0x0093:
            monitor-exit(r14)
            java.util.Iterator r12 = X.AnonymousClass7TE.A1G(r4)
        L_0x0098:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x0163
            java.lang.Object r8 = X.AnonymousClass7TF.A0a(r12)
            X.0eP r8 = (X.0eP) r8
            java.lang.Object r10 = r8.A01
            X.8so r10 = (X.C368538so) r10
            X.7v0 r5 = r10.A00()
            X.7v3 r0 = r5.A02
            int r2 = r0.A01
            int r1 = r0.A00
            X.A95 r0 = r15.A04
            X.A5k[] r9 = r0.A05
            r0 = 3
            r0 = r9[r0]
            java.util.concurrent.atomic.AtomicInteger r0 = r0.A00
            r0.incrementAndGet()
            X.8tg r6 = new X.8tg
            r6.<init>(r2, r1)
            int r0 = r6.A00
            r4 = 36160(0x8d40, float:5.0671E-41)
            android.opengl.GLES20.glBindFramebuffer(r4, r0)
            r3 = 0
            android.opengl.GLES20.glViewport(r3, r3, r2, r1)
            java.lang.Object r2 = r8.A00
            monitor-enter(r14)
            X.0qQ.A0B(r2, r3)     // Catch:{ all -> 0x0166 }
            X.AJ6 r0 = r15.A02     // Catch:{ all -> 0x0166 }
            java.util.Map r1 = r0.A00     // Catch:{ all -> 0x0166 }
            boolean r0 = r1.containsKey(r2)     // Catch:{ all -> 0x0166 }
            if (r0 == 0) goto L_0x00f6
            java.lang.Object r11 = r1.get(r2)     // Catch:{ all -> 0x0166 }
            X.8pF r11 = (X.C366548pF) r11     // Catch:{ all -> 0x0166 }
            if (r11 == 0) goto L_0x00f6
            boolean r0 = r7.containsKey(r2)     // Catch:{ all -> 0x0166 }
            if (r0 == 0) goto L_0x00f6
            java.lang.Object r0 = r7.get(r2)     // Catch:{ all -> 0x0166 }
            X.A7W r0 = (X.A7W) r0     // Catch:{ all -> 0x0166 }
            if (r0 == 0) goto L_0x00f6
            goto L_0x010a
        L_0x00f6:
            X.9g9 r0 = r15.A01     // Catch:{ all -> 0x0166 }
            java.lang.String r1 = "default"
            java.util.HashMap r0 = r0.A06     // Catch:{ all -> 0x0166 }
            java.lang.Object r0 = r0.get(r1)     // Catch:{ all -> 0x0166 }
            android.util.Pair r0 = (android.util.Pair) r0     // Catch:{ all -> 0x0166 }
            if (r0 == 0) goto L_0x0109
            java.lang.Object r11 = r0.second     // Catch:{ all -> 0x0166 }
            X.8pF r11 = (X.C366548pF) r11     // Catch:{ all -> 0x0166 }
            goto L_0x010a
        L_0x0109:
            r11 = 0
        L_0x010a:
            monitor-exit(r14)
            if (r11 == 0) goto L_0x014e
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel r0 = r11.B5t()
            java.lang.String r8 = r0.getFilterName()
            r1 = 95
            int r0 = r2.hashCode()
            java.lang.String r1 = X.002.A0G(r8, r1, r0)
            X.9g9 r8 = r15.A01
            r8.A00(r11, r1)
            java.util.HashMap r0 = r8.A06
            java.lang.Object r0 = r0.get(r1)
            android.util.Pair r0 = (android.util.Pair) r0
            if (r0 == 0) goto L_0x0139
            java.lang.Object r0 = r0.second
            if (r0 == 0) goto L_0x0139
            r8.A00 = r1
            r0 = 0
            r8.DAo(r10, r0)
        L_0x0139:
            r0 = 2
            r0 = r9[r0]
            java.util.concurrent.atomic.AtomicInteger r0 = r0.A01
            r0.incrementAndGet()
            r5.A01()
            android.opengl.GLES20.glBindFramebuffer(r4, r3)
            java.util.ArrayList r0 = r15.A09
            X.AnonymousClass7TF.A1I(r2, r6, r0)
            goto L_0x0098
        L_0x014e:
            r0 = 2
            r0 = r9[r0]
            java.util.concurrent.atomic.AtomicInteger r0 = r0.A01
            r0.incrementAndGet()
            r5.A01()
            android.opengl.GLES20.glBindFramebuffer(r4, r3)
            java.lang.String r0 = "No filter found for submitter"
            java.lang.RuntimeException r0 = X.AnonymousClass7TE.A15(r0)
            throw r0
        L_0x0163:
            monitor-enter(r13)
            monitor-exit(r13)
            return
        L_0x0166:
            r0 = move-exception
            monitor-exit(r14)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ALH.A00():void");
    }

    public final synchronized Bitmap A02(Object obj) {
        Bitmap bitmap;
        Map map = this.A05;
        bitmap = null;
        if (map.containsKey(obj)) {
            A7W a7w = (A7W) map.get(obj);
            if (a7w != null) {
                synchronized (a7w) {
                    bitmap = (Bitmap) a7w.A01.peek();
                }
            }
            C39877ACy aCy = this.A03;
            if (bitmap != null) {
                aCy.A00.put(bitmap, Integer.valueOf(C39877ACy.A00(bitmap, aCy) | 1));
            }
        }
        return bitmap;
    }

    public final synchronized void A04(Bitmap bitmap) {
        C39877ACy aCy = this.A03;
        Integer valueOf = Integer.valueOf(C39877ACy.A00(bitmap, aCy) & -2);
        HashMap hashMap = aCy.A00;
        hashMap.put(bitmap, valueOf);
        if (C39877ACy.A00(bitmap, aCy) == 2) {
            aCy.A01.invoke(bitmap);
            hashMap.remove(bitmap);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0057, code lost:
        if (r2 != null) goto L_0x0059;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void A05(android.graphics.Bitmap r7, java.lang.Object r8, long r9) {
        /*
            r6 = this;
            monitor-enter(r6)
            X.AJ6 r0 = r6.A02     // Catch:{ all -> 0x00a2 }
            java.util.Map r0 = r0.A00     // Catch:{ all -> 0x00a2 }
            java.util.Iterator r5 = X.AnonymousClass7TF.A0v(r0)     // Catch:{ all -> 0x00a2 }
        L_0x0009:
            boolean r0 = r5.hasNext()     // Catch:{ all -> 0x00a2 }
            if (r0 == 0) goto L_0x0049
            java.lang.Object r0 = r5.next()     // Catch:{ all -> 0x00a2 }
            X.8pF r0 = (X.C366548pF) r0     // Catch:{ all -> 0x00a2 }
            if (r0 == 0) goto L_0x0009
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel r4 = r0.B5t()     // Catch:{ all -> 0x00a2 }
            if (r4 == 0) goto L_0x0009
            java.lang.String r3 = r4.getFilterName()     // Catch:{ all -> 0x00a2 }
            if (r3 == 0) goto L_0x0009
            int r0 = r3.hashCode()     // Catch:{ all -> 0x00a2 }
            r2 = 1315859240(0x4e6e6b28, float:1.0E9)
            java.lang.String r1 = "renderFrameTimeSeconds"
            switch(r0) {
                case -2103499532: goto L_0x0039;
                case -2011710186: goto L_0x0036;
                case -1037749848: goto L_0x0033;
                case -208149521: goto L_0x0030;
                default: goto L_0x002f;
            }     // Catch:{ all -> 0x00a2 }
        L_0x002f:
            goto L_0x0009
        L_0x0030:
            java.lang.String r0 = "text_shimmer"
            goto L_0x003b
        L_0x0033:
            java.lang.String r0 = "text_neon"
            goto L_0x003b
        L_0x0036:
            java.lang.String r0 = "sparkle"
            goto L_0x003b
        L_0x0039:
            java.lang.String r0 = "text_pixel"
        L_0x003b:
            boolean r0 = r3.equals(r0)     // Catch:{ all -> 0x00a2 }
            if (r0 == 0) goto L_0x0009
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.ValueMapFilterModel r4 = (com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.ValueMapFilterModel) r4     // Catch:{ all -> 0x00a2 }
            float r0 = (float) r9     // Catch:{ all -> 0x00a2 }
            float r0 = r0 / r2
            r4.A00(r1, r0)     // Catch:{ all -> 0x00a2 }
            goto L_0x0009
        L_0x0049:
            java.util.Map r3 = r6.A05     // Catch:{ all -> 0x00a2 }
            boolean r0 = r3.containsKey(r8)     // Catch:{ all -> 0x00a2 }
            if (r0 == 0) goto L_0x005b
            java.lang.Object r2 = r3.get(r8)     // Catch:{ all -> 0x00a2 }
            X.A7W r2 = (X.A7W) r2     // Catch:{ all -> 0x00a2 }
            if (r2 == 0) goto L_0x009b
        L_0x0059:
            monitor-enter(r2)     // Catch:{ all -> 0x00a2 }
            goto L_0x007a
        L_0x005b:
            r0 = 16
            X.MP8 r2 = new X.MP8     // Catch:{ all -> 0x00a2 }
            r2.<init>(r6, r0)     // Catch:{ all -> 0x00a2 }
            r0 = 17
            X.MP8 r1 = new X.MP8     // Catch:{ all -> 0x00a2 }
            r1.<init>(r6, r0)     // Catch:{ all -> 0x00a2 }
            X.A7W r0 = new X.A7W     // Catch:{ all -> 0x00a2 }
            r0.<init>(r2, r1)     // Catch:{ all -> 0x00a2 }
            r3.put(r8, r0)     // Catch:{ all -> 0x00a2 }
            java.lang.Object r2 = r3.get(r8)     // Catch:{ all -> 0x00a2 }
            X.A7W r2 = (X.A7W) r2     // Catch:{ all -> 0x00a2 }
            if (r2 == 0) goto L_0x009b
            goto L_0x0059
        L_0x007a:
            java.util.concurrent.atomic.AtomicInteger r0 = r2.A02     // Catch:{ all -> 0x0097 }
            int r1 = r0.get()     // Catch:{ all -> 0x0097 }
            r0 = -1
            if (r1 == r0) goto L_0x0091
            java.util.Queue r0 = r2.A00     // Catch:{ all -> 0x0097 }
            int r0 = r0.size()     // Catch:{ all -> 0x0097 }
            if (r0 < r1) goto L_0x0091
            X.0sP r0 = r2.A04     // Catch:{ all -> 0x0097 }
            r0.invoke(r7)     // Catch:{ all -> 0x0097 }
            goto L_0x009a
        L_0x0091:
            java.util.Queue r0 = r2.A00     // Catch:{ all -> 0x0097 }
            r0.add(r7)     // Catch:{ all -> 0x0097 }
            goto L_0x009a
        L_0x0097:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x00a2 }
            throw r0     // Catch:{ all -> 0x00a2 }
        L_0x009a:
            monitor-exit(r2)     // Catch:{ all -> 0x00a2 }
        L_0x009b:
            java.util.concurrent.Semaphore r0 = r6.A06     // Catch:{ all -> 0x00a2 }
            r0.release()     // Catch:{ all -> 0x00a2 }
            monitor-exit(r6)
            return
        L_0x00a2:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ALH.A05(android.graphics.Bitmap, java.lang.Object, long):void");
    }

    public final void onSurfaceChanged(GL10 gl10, int i, int i2) {
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        GLES20.glViewport(0, 0, i, i2);
        GLES20.glClear(16640);
        GLES20.glDisable(2929);
        GLES20.glEnable(3042);
        GLES20.glBlendEquationSeparate(32774, 32774);
        GLES20.glBlendFuncSeparate(770, 771, 1, 0);
    }

    public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        AnonymousClass9g9 r3 = this.A01;
        r3.DpY(this.A08);
        r3.A00(AJ6.A02(this.A02, "VintageFilter", AnonymousClass7TE.A1E()), GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT);
        while (true) {
            int glGetError = GLES20.glGetError();
            if (glGetError != 0) {
                0KC.A0C("IgluRenderer-ui", 002.A0g("onSurfaceCreated", ": glError ", GLUtils.getEGLErrorString(glGetError)));
            } else {
                return;
            }
        }
    }

    private final void A01() {
        int i;
        C39862ACi aCi = C39862ACi.A00;
        synchronized (aCi) {
        }
        ArrayList arrayList = this.A09;
        Iterator A1G = AnonymousClass7TE.A1G(arrayList);
        while (A1G.hasNext()) {
            0eP r1 = (0eP) AnonymousClass7TF.A0a(A1G);
            Object obj = r1.A00;
            C369008tg r9 = (C369008tg) r1.A01;
            A95 a95 = this.A04;
            0qQ.A0B(r9, 0);
            a95.A03.incrementAndGet();
            int i2 = r9.A02;
            int i3 = r9.A01;
            a95.A04.addAndGet(((long) i2) * ((long) i3));
            C39694A5k[] a5kArr = a95.A05;
            a5kArr[1].A00.incrementAndGet();
            Bitmap A0B2 = AnonymousClass7TF.A0B(i2, i3);
            C349257zq.A03("ig4a ui IgluRenderer glReadPixels");
            C346337v0 r14 = r9.A03;
            C346367v3 r15 = r14.A02;
            int i4 = r15.A02;
            int i5 = i4;
            int i6 = r14.A01;
            if (i6 != 36197) {
                if (i4 == 0) {
                    i4 = 6408;
                }
                if (i5 != 6406) {
                    i = 3;
                    if (i5 != 6407) {
                        i = 4;
                    }
                } else {
                    i = 1;
                }
                ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i * i2 * i3);
                int[] iArr = new int[1];
                int[] iArr2 = new int[1];
                GLES20.glGetIntegerv(36006, iArr, 0);
                GLES20.glGenFramebuffers(1, iArr2, 0);
                GLES20.glBindFramebuffer(36160, iArr2[0]);
                int i7 = r14.A00;
                GLES20.glBindTexture(i6, i7);
                int i8 = i6;
                GLES20.glTexImage2D(i8, 0, i4, r15.A01, r15.A00, 0, i4, 5121, (Buffer) null);
                GLES20.glFramebufferTexture2D(36160, 36064, i6, i7, 0);
                GLES20.glReadPixels(0, 0, i2, i3, i4, 5121, allocateDirect);
                GLES20.glBindFramebuffer(36160, iArr[0]);
                GLES20.glDeleteFramebuffers(1, iArr2, 0);
                C345907uH.A02("Texture::getByteBuffer", new Object[0]);
                while (true) {
                    int glGetError = GLES20.glGetError();
                    if (glGetError == 0) {
                        break;
                    }
                    0KC.A0C("ImageManager", 002.A0g("glReadPixels", ": glError ", GLUtils.getEGLErrorString(glGetError)));
                }
                if (allocateDirect != null) {
                    C349257zq.A01();
                    A0B2.copyPixelsFromBuffer(allocateDirect);
                    synchronized (this) {
                        Map map = this.A05;
                        if (map.containsKey(obj)) {
                            A7W a7w = (A7W) map.get(obj);
                            if (a7w != null) {
                                synchronized (a7w) {
                                    int i9 = a7w.A03.get();
                                    Queue queue = a7w.A01;
                                    int size = queue.size();
                                    if (size > 0) {
                                        0sP r12 = a7w.A05;
                                        Object remove = queue.remove();
                                        0qQ.A07(remove);
                                        r12.invoke(remove);
                                    }
                                    if (i9 == -1 || size < i9) {
                                        queue.add(A0B2);
                                    }
                                }
                            }
                        } else {
                            A0B2.recycle();
                        }
                    }
                    a5kArr[3].A01.incrementAndGet();
                    r9.A01();
                } else {
                    throw AnonymousClass7TE.A0y();
                }
            } else {
                throw new GLException(1280, "You can't use getByteBuffer()/getDebugBitmap() on the texture if the texture target is GL_TEXTURE_EXTERNAL_OES. This kind of texture can't be attached to a frame buffer. You must instead copy render this texture to another texture with target GL_TEXTURE_2D. If this is coming from a SurfaceTexture, SurfaceTextureReader can help.");
            }
        }
        arrayList.clear();
        synchronized (aCi) {
        }
    }

    public final void A03() {
        A95 a95 = this.A04;
        if (!a95.A02.getAndSet(true)) {
            a95.A00.A00();
            a95.A01.A00();
        }
        this.A01.Dpb();
    }

    public final void onDrawFrame(GL10 gl10) {
        if (this.A0A) {
            try {
                A01();
                C62320sa r4 = this.A00;
                if (r4 != null) {
                    while (true) {
                        if (!AnonymousClass7TE.A1a(r4.invoke())) {
                            if (this.A06.tryAcquire(2, TimeUnit.MILLISECONDS)) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                } else {
                    this.A06.acquire();
                }
                A00();
            } catch (RuntimeException e) {
                0wb.A07("IgluColorFilterRenderer Async render exception:", e);
            }
            GLES20.glBindTexture(3553, 0);
            return;
        }
        try {
            A00();
            GLES20.glFinish();
            A01();
        } catch (RuntimeException e2) {
            0wb.A07("IgluColorFilterRenderer Sync render exception:", e2);
        }
    }
}
