package X;

import android.content.Context;
import android.view.ViewConfiguration;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerConstraintLayout;

/* renamed from: X.WeL  reason: case insensitive filesystem */
public final class C19719WeL implements C273424mY {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public float A06;
    public float A07;
    public int A08;
    public ViewTreeObserver.OnGlobalLayoutListener A09;
    public boolean A0A;
    public boolean A0B;
    public final float A0C;
    public final float A0D;
    public final LinearLayout A0E;
    public final LinearLayout A0F;
    public final IgTextView A0G;
    public final TouchInterceptorFrameLayout A0H;
    public final RoundedCornerConstraintLayout A0I;
    public final float A0J;
    public final C71392co A0K = C71392co.A04(30.0d, 10.0d);
    public final VND A0L;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x003e, code lost:
        if (r2.contains(r4, r3) != false) goto L_0x0040;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean DAA(X.C317396nC r9, float r10, float r11) {
        /*
            r8 = this;
            r5 = 0
            r8.A0A = r5
            android.widget.LinearLayout r1 = r8.A0E
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            r7 = 2
            int[] r0 = new int[r7]
            r1.getDrawingRect(r2)
            r1.getLocationOnScreen(r0)
            r1 = r0[r5]
            r6 = 1
            r0 = r0[r6]
            r2.offset(r1, r0)
            int r4 = (int) r10
            int r3 = (int) r11
            boolean r0 = r2.contains(r4, r3)
            if (r0 != 0) goto L_0x0040
            com.instagram.ui.widget.roundedcornerlayout.RoundedCornerConstraintLayout r1 = r8.A0I
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            int[] r0 = new int[r7]
            r1.getDrawingRect(r2)
            r1.getLocationOnScreen(r0)
            r1 = r0[r5]
            r0 = r0[r6]
            r2.offset(r1, r0)
            boolean r1 = r2.contains(r4, r3)
            r0 = 0
            if (r1 == 0) goto L_0x0041
        L_0x0040:
            r0 = 1
        L_0x0041:
            r1 = r0 ^ 1
            r8.A0B = r1
            boolean r0 = r9.A04()
            if (r0 == 0) goto L_0x004e
            if (r1 == 0) goto L_0x004e
            r5 = 1
        L_0x004e:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19719WeL.DAA(X.6nC, float, float):boolean");
    }

    public final void DAZ(C317396nC r7, float f, float f2, float f3, float f4, float f5) {
        float f6 = f5;
        if (f5 < 0.0f || f2 < this.A06 || f2 < this.A0D) {
            C317396nC r0 = r7;
            r0.A02(this.A0K, 0.0f, this.A06, f4, f6);
            return;
        }
        C15695Uh1.A02(this.A0L.A00);
    }

    public final boolean DlG(C317396nC r2, float f, float f2) {
        return false;
    }

    public static void A00(C19719WeL weL, StringBuilder sb) {
        sb.append("mInitViewCalledCount: ");
        sb.append(weL.A08);
        sb.append(" mHorizontalMargin: ");
        sb.append(weL.A01);
        sb.append(" mDefaultSpacing: ");
        sb.append(weL.A00);
        sb.append(" mInitialActionListHeight: ");
        sb.append(weL.A0C);
        sb.append(" mInitialActionListOffset: ");
        sb.append(weL.A02);
        sb.append(" mMaxTranslateY: ");
        sb.append(weL.A05);
        sb.append(" mInitialMediaMargin: ");
        sb.append(weL.A03);
        sb.append(" mMaxY: ");
        sb.append(weL.A06);
        sb.append(" mMinMediaScale: ");
        sb.append(weL.A07);
        sb.append(" mMaxMediaScale: ");
        sb.append(weL.A04);
        sb.append(" mTouchContainer.getHeight(): ");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: SSATransform
        jadx.core.utils.exceptions.JadxRuntimeException: Not initialized variable reg: 0, insn: 0x00fb: INVOKE  (r0 I:X.WeL), (r2 I:java.lang.StringBuilder) X.WeL.A00(X.WeL, java.lang.StringBuilder):void type: STATIC, block:B:16:0x00f6
        	at jadx.core.dex.visitors.ssa.SSATransform.renameVarsInBlock(SSATransform.java:165)
        	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:137)
        	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:55)
        	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:41)
        */
    public final void DAS(
/*
Method generation error in method: X.WeL.DAS(X.6nC, float, float, float, boolean):void, dex: classes11.dex
    jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r22v0 ?
    	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:189)
    	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:157)
    	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:129)
    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
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

    public final void DvA(C317396nC r4) {
        if ((((this.A04 == 1.0f && this.A0E.getTranslationY() >= 0.0f) || (this.A04 < 1.0f && this.A0I.getScaleY() == this.A04)) && !this.A0A) || (!this.A0A && this.A0B)) {
            C15695Uh1.A02(this.A0L.A00);
        }
    }

    public C19719WeL(Context context, LinearLayout linearLayout, LinearLayout linearLayout2, IgTextView igTextView, TouchInterceptorFrameLayout touchInterceptorFrameLayout, VND vnd, RoundedCornerConstraintLayout roundedCornerConstraintLayout, float f) {
        this.A0H = touchInterceptorFrameLayout;
        this.A0I = roundedCornerConstraintLayout;
        this.A0F = linearLayout;
        this.A0E = linearLayout2;
        this.A0C = f;
        this.A0G = igTextView;
        this.A0L = vnd;
        this.A08 = 0;
        this.A0J = (float) ViewConfiguration.get(context).getScaledPagingTouchSlop();
        this.A0D = -0nA.A04(context, 20);
    }

    public final boolean DAg(C317396nC r3, float f, float f2, float f3, float f4, boolean z) {
        if (Math.abs(f2) <= this.A0J) {
            return false;
        }
        this.A0A = true;
        return true;
    }
}
