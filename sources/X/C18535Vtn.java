package X;

import android.content.Context;
import android.graphics.Point;
import android.view.View;
import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.Vtn  reason: case insensitive filesystem */
public final class C18535Vtn {
    public static final C18535Vtn A00 = new Object();

    /* JADX WARNING: type inference failed for: r7v3, types: [X.3oj, java.lang.Object] */
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
    public final void A00(X.AnonymousClass0iw r18, com.instagram.common.session.UserSession r19, X.C17533VZm r20, X.UAW r21, X.C19275WSi r22) {
        /*
            r17 = this;
            r13 = r20
            r11 = r22
            X.AnonymousClass7TG.A1O(r13, r11)
            android.content.Context r14 = r13.A00
            X.UKZ r10 = r11.A00
            float r9 = r10.A00
            int r0 = X.0nA.A09(r14)
            float r0 = (float) r0
            r16 = 1066285284(0x3f8e38e4, float:1.1111112)
            float r0 = r0 / r16
            int r2 = (int) r0
            int r0 = (r9 > r16 ? 1 : (r9 == r16 ? 0 : -1))
            boolean r1 = X.C51970G9q.A1T(r0)
            boolean r3 = r10.A03
            r0 = r3 ^ 1
            if (r1 == 0) goto L_0x011f
            if (r0 == 0) goto L_0x011f
            float r0 = (float) r2
            float r0 = r0 * r9
            int r1 = (int) r0
        L_0x0029:
            android.graphics.Point r0 = new android.graphics.Point
            r0.<init>(r1, r2)
            android.view.View r8 = r13.A01
            int r1 = r0.y
            X.0nA.A0V(r8, r1)
            r1 = 40
            X.WBC.A00(r8, r1, r11)
            r12 = r21
            java.util.Map r2 = r12.A03
            java.lang.Object r7 = r2.get(r11)
            X.WJg r7 = (X.WJg) r7
            java.util.Map r6 = r12.A02
            java.lang.String r5 = r11.A02
            java.lang.Object r1 = r6.get(r5)
            X.WSi r1 = (X.C19275WSi) r1
            if (r7 != 0) goto L_0x008e
            if (r1 == 0) goto L_0x008e
            X.UKZ r1 = r1.A00
            boolean r1 = r1.A03
            if (r1 == 0) goto L_0x008e
            if (r3 != 0) goto L_0x008e
            boolean r1 = r10.A02
            if (r1 == 0) goto L_0x008e
            int r1 = (r9 > r16 ? 1 : (r9 == r16 ? 0 : -1))
            if (r1 >= 0) goto L_0x008e
            X.WJg r7 = new X.WJg
            r7.<init>()
            r2.put(r11, r7)
            android.content.Context r1 = r12.A00
            int r15 = X.0nA.A09(r1)
            X.2cp r1 = r12.A01
            X.2cs r4 = r1.A02()
            double r1 = (double) r15
            r3 = 1
            r4.A08(r1, r3)
            float r1 = (float) r15
            float r1 = r1 * r9
            float r1 = r1 / r16
            double r1 = (double) r1
            r4.A06(r1)
            r4.A0A(r7)
            X.UTn r1 = new X.UTn
            r1.<init>(r3, r11, r12)
            r4.A0A(r1)
        L_0x008e:
            r6.put(r5, r11)
            if (r7 == 0) goto L_0x010c
            X.WJm r2 = r13.A04
            X.WJg r1 = r2.A00
            if (r1 == 0) goto L_0x00a0
            X.WJm r0 = r1.A00
            if (r0 != r2) goto L_0x00a0
            r0 = 0
            r1.A00 = r0
        L_0x00a0:
            r2.A00 = r7
            r7.A00 = r2
        L_0x00a4:
            int r0 = (r9 > r16 ? 1 : (r9 == r16 ? 0 : -1))
            if (r0 >= 0) goto L_0x00ff
            int r0 = X.0nA.A09(r14)
            float r0 = (float) r0
            float r0 = r0 / r16
            int r1 = (int) r0
            float r0 = (float) r1
            float r0 = r0 * r9
            int r0 = (int) r0
            android.graphics.Point r2 = new android.graphics.Point
            r2.<init>(r0, r1)
        L_0x00b8:
            android.view.View r1 = r13.A02
            int r0 = r2.x
            X.0nA.A0f(r1, r0)
            int r0 = r2.y
            X.0nA.A0V(r1, r0)
            r2 = 1
            r3 = 0
            int r0 = (r9 > r16 ? 1 : (r9 == r16 ? 0 : -1))
            boolean r1 = X.AnonymousClass7TF.A1R(r0)
            int r0 = (r9 > r16 ? 1 : (r9 == r16 ? 0 : -1))
            if (r0 < 0) goto L_0x00d1
            r2 = 0
        L_0x00d1:
            if (r1 != 0) goto L_0x00d9
            if (r2 == 0) goto L_0x0125
            boolean r0 = r10.A02
            if (r0 == 0) goto L_0x0125
        L_0x00d9:
            X.3oV r2 = r13.A03
            r2.setVisibility(r3)
            android.view.View r1 = r2.getView()
            com.instagram.common.ui.widget.imageview.IgImageView r1 = (com.instagram.common.ui.widget.imageview.IgImageView) r1
            X.WTS r0 = new X.WTS
            r3 = r19
            r0.<init>(r3)
            r1.A0I = r0
            com.instagram.model.mediasize.ExtendedImageUrl r1 = r11.A00(r14)
            if (r1 == 0) goto L_0x00fe
            android.view.View r0 = r2.getView()
            com.instagram.common.ui.widget.imageview.IgImageView r0 = (com.instagram.common.ui.widget.imageview.IgImageView) r0
            r2 = r18
            r0.setUrl(r1, r2)
        L_0x00fe:
            return
        L_0x00ff:
            int r1 = X.0nA.A09(r14)
            float r0 = (float) r1
            float r0 = r0 / r9
            int r0 = (int) r0
            android.graphics.Point r2 = new android.graphics.Point
            r2.<init>(r1, r0)
            goto L_0x00b8
        L_0x010c:
            X.WJm r3 = r13.A04
            X.WJg r2 = r3.A00
            if (r2 == 0) goto L_0x0119
            X.WJm r1 = r2.A00
            if (r1 != r3) goto L_0x0119
            r1 = 0
            r2.A00 = r1
        L_0x0119:
            int r0 = r0.x
            X.0nA.A0f(r8, r0)
            goto L_0x00a4
        L_0x011f:
            int r1 = X.0nA.A09(r14)
            goto L_0x0029
        L_0x0125:
            X.3oV r1 = r13.A03
            r0 = 8
            r1.setVisibility(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18535Vtn.A00(X.0iw, com.instagram.common.session.UserSession, X.VZm, X.UAW, X.WSi):void");
    }
}
