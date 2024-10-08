package X;

import androidx.compose.animation.SizeAnimationModifierElement;
import androidx.compose.foundation.BackgroundElement;
import androidx.compose.foundation.BorderModifierNodeElement;
import androidx.compose.foundation.ClickableElement;
import androidx.compose.foundation.CombinedClickableElement;
import androidx.compose.foundation.FocusableElement;
import androidx.compose.foundation.HoverableElement;
import androidx.compose.foundation.gestures.ScrollableElement;
import androidx.compose.foundation.layout.BoxChildDataElement;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.HorizontalAlignElement;
import androidx.compose.foundation.layout.IntrinsicHeightElement;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.OffsetElement;
import androidx.compose.foundation.layout.PaddingElement;
import androidx.compose.foundation.layout.PaddingValuesElement;
import androidx.compose.foundation.layout.SizeElement;
import androidx.compose.foundation.layout.UnspecifiedConstraintsElement;
import androidx.compose.foundation.layout.VerticalAlignElement;
import androidx.compose.foundation.layout.WrapContentElement;
import androidx.compose.foundation.lazy.ParentSizeElement;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator$DisplayingDisappearingItemsElement;
import androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsModifier;
import androidx.compose.foundation.lazy.layout.TraversablePrefetchStateModifierElement;
import androidx.compose.foundation.text.modifiers.TextAnnotatedStringElement;
import androidx.compose.foundation.text.modifiers.TextStringSimpleElement;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawBehindElement;
import androidx.compose.ui.draw.DrawWithContentElement;
import androidx.compose.ui.draw.PainterElement;
import androidx.compose.ui.focus.FocusOwnerImpl$modifier$2;
import androidx.compose.ui.focus.FocusPropertiesElement;
import androidx.compose.ui.focus.FocusTargetNode$FocusTargetElement;
import androidx.compose.ui.graphics.BlockGraphicsLayerElement;
import androidx.compose.ui.graphics.GraphicsLayerElement;
import androidx.compose.ui.input.key.KeyInputElement;
import androidx.compose.ui.input.nestedscroll.NestedScrollElement;
import androidx.compose.ui.input.nestedscroll.NestedScrollNode;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import androidx.compose.ui.input.rotary.RotaryInputElement;
import androidx.compose.ui.layout.OnGloballyPositionedElement;
import androidx.compose.ui.layout.OnPlacedElement;
import androidx.compose.ui.platform.DragAndDropModifierOnDragListener$modifier$1;
import androidx.compose.ui.platform.TestTagElement;
import androidx.compose.ui.semantics.AppendedSemanticsElement;
import androidx.compose.ui.semantics.EmptySemanticsElement;
import com.instagram.barcelonaig.tixu.vpvd.VPVDElement;
import com.instagram.barcelonaig.tixu.vpvd.VisibilityChangeElement;
import com.instagram.compose.core.ui.NoIndicationClickableElement;
import com.instagram.compose.core.ui.NoIndicationCombinedClickableKt$FocusableInNonTouchModeElement$1;
import com.instagram.compose.igds.core.IgdsAlphaIndicationElement;
import com.instagram.compose.perf.render.OnFirstContentDrawModifierElement;
import com.instagram.compose.ui.bouncy.BouncyClickableElement;
import com.instagram.compose.ui.gradientspinner.GradientSpinnerModifierElement;
import com.instagram.feed.tifu.ui.VisibilityUpdateModifier;
import java.util.List;

/* renamed from: X.5QP  reason: invalid class name */
public abstract class AnonymousClass5QP implements AnonymousClass5QQ {
    public final /* synthetic */ boolean AB4(0sP r2) {
        return C287455aA.A00(this, r2);
    }

    public final /* synthetic */ Modifier Ezh(Modifier modifier) {
        return C285235Qj.A00(this, modifier);
    }

    public abstract boolean equals(Object obj);

    public abstract int hashCode();

    /* JADX WARNING: type inference failed for: r13v1, types: [X.4cD, X.6IR] */
    /* JADX WARNING: type inference failed for: r13v4, types: [X.4cD, androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode] */
    /* JADX WARNING: type inference failed for: r13v5, types: [X.4cD, X.5hY] */
    /* JADX WARNING: type inference failed for: r13v6, types: [X.4cD, X.5du] */
    /* JADX WARNING: type inference failed for: r13v7, types: [X.4cD, X.5cE] */
    /* JADX WARNING: type inference failed for: r13v8, types: [X.5d1, X.4cD] */
    /* JADX WARNING: type inference failed for: r13v12, types: [X.4cD, X.64y] */
    /* JADX WARNING: type inference failed for: r13v14, types: [androidx.compose.foundation.HoverableNode, X.4cD] */
    /* JADX WARNING: type inference failed for: r13v16, types: [X.4cD, X.5cC] */
    /* JADX WARNING: type inference failed for: r13v17, types: [X.4cD, X.6Dk] */
    /* JADX WARNING: type inference failed for: r13v20, types: [X.4cD, X.6GL] */
    /* JADX WARNING: type inference failed for: r13v21, types: [X.4cD, X.6F4] */
    /* JADX WARNING: type inference failed for: r13v22, types: [X.4cD, X.Gc2] */
    /* JADX WARNING: type inference failed for: r13v23, types: [X.4cD, X.GQv] */
    /* JADX WARNING: type inference failed for: r13v25, types: [X.4cD, X.5WI, X.5cG] */
    /* JADX WARNING: type inference failed for: r13v26, types: [X.4cD, X.5cY] */
    /* JADX WARNING: type inference failed for: r13v27, types: [X.4cD, X.6Dg] */
    /* JADX WARNING: type inference failed for: r13v29, types: [X.5hf, X.4cD] */
    /* JADX WARNING: type inference failed for: r13v31, types: [X.4cD, X.4dP, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r13v34, types: [X.4cD, X.4dN] */
    /* JADX WARNING: type inference failed for: r13v36, types: [X.5cP, X.4cD] */
    /* JADX WARNING: type inference failed for: r13v37, types: [X.5cQ, X.4cD] */
    /* JADX WARNING: type inference failed for: r13v38, types: [X.4cD, X.5cR] */
    /* JADX WARNING: type inference failed for: r13v39, types: [X.4cD, X.5cF] */
    /* JADX WARNING: type inference failed for: r13v40, types: [X.4cD, X.6Dh] */
    /* JADX WARNING: type inference failed for: r13v41, types: [X.4cD, X.5cB] */
    /* JADX WARNING: type inference failed for: r13v42, types: [X.GeR, X.4cD] */
    /* JADX WARNING: type inference failed for: r13v43, types: [X.6GD, X.4cD] */
    /* JADX WARNING: type inference failed for: r13v44, types: [X.4cD, X.6GF] */
    /* JADX WARNING: type inference failed for: r13v45, types: [X.4cD, X.6GE] */
    /* JADX WARNING: type inference failed for: r13v47, types: [X.4cD, X.5WG] */
    /* JADX WARNING: type inference failed for: r13v48, types: [X.5WE, X.4cD] */
    /* JADX WARNING: type inference failed for: r13v51, types: [X.4cD, X.5WF] */
    /* JADX WARNING: type inference failed for: r13v52, types: [X.4cD, com.instagram.compose.ui.gradientspinner.GradientSpinnerNode] */
    public C267794cD A00() {
        if (this instanceof GradientSpinnerModifierElement) {
            GradientSpinnerModifierElement gradientSpinnerModifierElement = (GradientSpinnerModifierElement) this;
            C52412GRo gRo = gradientSpinnerModifierElement.A01;
            C52402GRc gRc = gradientSpinnerModifierElement.A02;
            float f = gradientSpinnerModifierElement.A00;
            0sK r1 = gradientSpinnerModifierElement.A03;
            0qQ.A0B(gRo, 1);
            0qQ.A0B(gRc, 2);
            0qQ.A0B(r1, 4);
            ? r13 = new C267794cD();
            r13.A01 = gRo;
            r13.A02 = gRc;
            r13.A00 = f;
            r13.A04 = r1;
            r13.A03 = new C52415GRs(gRc);
            return r13;
        } else if (this instanceof KeyInputElement) {
            KeyInputElement keyInputElement = (KeyInputElement) this;
            0sP r12 = keyInputElement.A00;
            0sP r0 = keyInputElement.A01;
            ? r132 = new C267794cD();
            r132.A00 = r12;
            r132.A01 = r0;
            return r132;
        } else if (this instanceof EmptySemanticsElement) {
            return ((EmptySemanticsElement) this).A00;
        } else {
            if (this instanceof DragAndDropModifierOnDragListener$modifier$1) {
                return ((DragAndDropModifierOnDragListener$modifier$1) this).A00.A02;
            }
            if (this instanceof RotaryInputElement) {
                0sP r02 = ((RotaryInputElement) this).A00;
                ? r133 = new C267794cD();
                r133.A00 = r02;
                return r133;
            } else if (this instanceof FocusPropertiesElement) {
                C285225Qg r03 = ((FocusPropertiesElement) this).A00;
                ? r134 = new C267794cD();
                r134.A00 = r03;
                return r134;
            } else if (this instanceof FocusOwnerImpl$modifier$2) {
                return ((FocusOwnerImpl$modifier$2) this).A00.A01;
            } else {
                if (this instanceof TestTagElement) {
                    String str = ((TestTagElement) this).A00;
                    ? r135 = new C267794cD();
                    r135.A00 = str;
                    return r135;
                } else if (this instanceof BackgroundElement) {
                    BackgroundElement backgroundElement = (BackgroundElement) this;
                    long j = backgroundElement.A01;
                    C304786Ff r2 = backgroundElement.A02;
                    float f2 = backgroundElement.A00;
                    AnonymousClass5S2 r04 = backgroundElement.A03;
                    ? r136 = new C267794cD();
                    r136.A01 = j;
                    r136.A03 = r2;
                    r136.A00 = f2;
                    r136.A06 = r04;
                    r136.A02 = 9205357640488583168L;
                    return r136;
                } else if (this instanceof LayoutWeightElement) {
                    LayoutWeightElement layoutWeightElement = (LayoutWeightElement) this;
                    float f3 = layoutWeightElement.A00;
                    boolean z = layoutWeightElement.A01;
                    ? r137 = new C267794cD();
                    r137.A00 = f3;
                    r137.A01 = z;
                    return r137;
                } else if (this instanceof IntrinsicHeightElement) {
                    IntrinsicHeightElement intrinsicHeightElement = (IntrinsicHeightElement) this;
                    Integer num = intrinsicHeightElement.A00;
                    boolean z2 = intrinsicHeightElement.A01;
                    ? r138 = new C267794cD();
                    r138.A00 = num;
                    r138.A01 = z2;
                    return r138;
                } else if (this instanceof PaddingElement) {
                    PaddingElement paddingElement = (PaddingElement) this;
                    float f4 = paddingElement.A02;
                    float f5 = paddingElement.A03;
                    float f6 = paddingElement.A01;
                    float f7 = paddingElement.A00;
                    boolean z3 = paddingElement.A04;
                    ? r139 = new C267794cD();
                    r139.A02 = f4;
                    r139.A03 = f5;
                    r139.A01 = f6;
                    r139.A00 = f7;
                    r139.A04 = z3;
                    return r139;
                } else if (this instanceof PaddingValuesElement) {
                    C304836Fk r05 = ((PaddingValuesElement) this).A00;
                    ? r1310 = new C267794cD();
                    r1310.A00 = r05;
                    return r1310;
                } else if (this instanceof SizeElement) {
                    SizeElement sizeElement = (SizeElement) this;
                    float f8 = sizeElement.A03;
                    float f9 = sizeElement.A02;
                    float f10 = sizeElement.A01;
                    float f11 = sizeElement.A00;
                    boolean z4 = sizeElement.A04;
                    ? r1311 = new C267794cD();
                    r1311.A03 = f8;
                    r1311.A02 = f9;
                    r1311.A01 = f10;
                    r1311.A00 = f11;
                    r1311.A04 = z4;
                    return r1311;
                } else if (this instanceof AppendedSemanticsElement) {
                    AppendedSemanticsElement appendedSemanticsElement = (AppendedSemanticsElement) this;
                    boolean z5 = appendedSemanticsElement.A01;
                    0sP r14 = appendedSemanticsElement.A00;
                    ? r1312 = new C267794cD();
                    r1312.A02 = z5;
                    r1312.A01 = false;
                    r1312.A00 = r14;
                    return r1312;
                } else if (this instanceof PainterElement) {
                    PainterElement painterElement = (PainterElement) this;
                    AnonymousClass2DO r5 = painterElement.A03;
                    boolean z6 = painterElement.A05;
                    Alignment alignment = painterElement.A01;
                    C288095bM r22 = painterElement.A04;
                    float f12 = painterElement.A00;
                    C288195bW r06 = painterElement.A02;
                    ? r1313 = new C267794cD();
                    r1313.A03 = r5;
                    r1313.A05 = z6;
                    r1313.A01 = alignment;
                    r1313.A04 = r22;
                    r1313.A00 = f12;
                    r1313.A02 = r06;
                    return r1313;
                } else if (this instanceof OnPlacedElement) {
                    0sP r07 = ((OnPlacedElement) this).A00;
                    ? r1314 = new C267794cD();
                    r1314.A00 = r07;
                    return r1314;
                } else if (this instanceof BorderModifierNodeElement) {
                    BorderModifierNodeElement borderModifierNodeElement = (BorderModifierNodeElement) this;
                    return new AnonymousClass6GG(borderModifierNodeElement.A01, borderModifierNodeElement.A02, borderModifierNodeElement.A00);
                } else if (this instanceof BlockGraphicsLayerElement) {
                    0sP r08 = ((BlockGraphicsLayerElement) this).A00;
                    ? r1315 = new C267794cD();
                    r1315.A00 = r08;
                    return r1315;
                } else if (this instanceof SuspendPointerInputElement) {
                    SuspendPointerInputElement suspendPointerInputElement = (SuspendPointerInputElement) this;
                    return new AnonymousClass6FP(suspendPointerInputElement.A00, suspendPointerInputElement.A01, suspendPointerInputElement.A02);
                } else if (this instanceof VisibilityChangeElement) {
                    VisibilityChangeElement visibilityChangeElement = (VisibilityChangeElement) this;
                    return new C304416Dj(visibilityChangeElement.A00, visibilityChangeElement.A01, visibilityChangeElement.A02);
                } else if (this instanceof GraphicsLayerElement) {
                    GraphicsLayerElement graphicsLayerElement = (GraphicsLayerElement) this;
                    float f13 = graphicsLayerElement.A03;
                    float f14 = graphicsLayerElement.A04;
                    float f15 = graphicsLayerElement.A00;
                    float f16 = graphicsLayerElement.A02;
                    float f17 = graphicsLayerElement.A01;
                    long j2 = graphicsLayerElement.A07;
                    AnonymousClass5S2 r52 = graphicsLayerElement.A08;
                    boolean z7 = graphicsLayerElement.A09;
                    long j3 = graphicsLayerElement.A05;
                    long j4 = graphicsLayerElement.A06;
                    ? r1316 = new C267794cD();
                    r1316.A03 = f13;
                    r1316.A04 = f14;
                    r1316.A00 = f15;
                    r1316.A02 = f16;
                    r1316.A01 = f17;
                    r1316.A07 = j2;
                    r1316.A08 = r52;
                    r1316.A0A = z7;
                    r1316.A05 = j3;
                    r1316.A06 = j4;
                    r1316.A09 = new AnonymousClass9L6(r1316, 43);
                    return r1316;
                } else if (this instanceof SizeAnimationModifierElement) {
                    SizeAnimationModifierElement sizeAnimationModifierElement = (SizeAnimationModifierElement) this;
                    return new AnonymousClass5WJ(sizeAnimationModifierElement.A00, sizeAnimationModifierElement.A01);
                } else if (this instanceof TextStringSimpleElement) {
                    TextStringSimpleElement textStringSimpleElement = (TextStringSimpleElement) this;
                    String str2 = textStringSimpleElement.A05;
                    AnonymousClass5Z4 r53 = textStringSimpleElement.A03;
                    C286305Uu r4 = textStringSimpleElement.A04;
                    int i = textStringSimpleElement.A02;
                    boolean z8 = textStringSimpleElement.A06;
                    int i2 = textStringSimpleElement.A00;
                    int i3 = textStringSimpleElement.A01;
                    ? r1317 = new C267794cD();
                    r1317.A06 = str2;
                    r1317.A04 = r53;
                    r1317.A05 = r4;
                    r1317.A02 = i;
                    r1317.A08 = z8;
                    r1317.A00 = i2;
                    r1317.A01 = i3;
                    return r1317;
                } else if (this instanceof ClickableElement) {
                    ClickableElement clickableElement = (ClickableElement) this;
                    C287605aT r15 = clickableElement.A01;
                    C287085Yy r142 = clickableElement.A00;
                    boolean z9 = clickableElement.A05;
                    String str3 = clickableElement.A03;
                    return new AnonymousClass5WI(r142, r15, clickableElement.A02, str3, clickableElement.A04, z9);
                } else if (this instanceof UnspecifiedConstraintsElement) {
                    UnspecifiedConstraintsElement unspecifiedConstraintsElement = (UnspecifiedConstraintsElement) this;
                    float f18 = unspecifiedConstraintsElement.A01;
                    float f19 = unspecifiedConstraintsElement.A00;
                    ? r1318 = new C267794cD();
                    r1318.A01 = f18;
                    r1318.A00 = f19;
                    return r1318;
                } else if (this instanceof OnFirstContentDrawModifierElement) {
                    C62320sa r16 = ((OnFirstContentDrawModifierElement) this).A00;
                    0qQ.A0B(r16, 1);
                    ? r1319 = new C267794cD();
                    r1319.A00 = r16;
                    return r1319;
                } else if (this instanceof CombinedClickableElement) {
                    CombinedClickableElement combinedClickableElement = (CombinedClickableElement) this;
                    C62320sa r6 = combinedClickableElement.A05;
                    String str4 = combinedClickableElement.A04;
                    C62320sa r42 = combinedClickableElement.A07;
                    C62320sa r3 = combinedClickableElement.A06;
                    C287605aT r152 = combinedClickableElement.A01;
                    C287085Yy r143 = combinedClickableElement.A00;
                    boolean z10 = combinedClickableElement.A08;
                    ? r1320 = new AnonymousClass5WI(r143, r152, combinedClickableElement.A02, combinedClickableElement.A03, r6, z10);
                    r1320.A00 = str4;
                    r1320.A02 = r42;
                    r1320.A01 = r3;
                    return r1320;
                } else if (this instanceof FocusTargetNode$FocusTargetElement) {
                    return new C267794cD();
                } else {
                    if (this instanceof DrawWithContentElement) {
                        0sP r09 = ((DrawWithContentElement) this).A00;
                        ? r1321 = new C267794cD();
                        r1321.A00 = r09;
                        return r1321;
                    } else if (this instanceof OnGloballyPositionedElement) {
                        0sP r010 = ((OnGloballyPositionedElement) this).A00;
                        ? r1322 = new C267794cD();
                        r1322.A00 = r010;
                        return r1322;
                    } else if (this instanceof ParentSizeElement) {
                        ParentSizeElement parentSizeElement = (ParentSizeElement) this;
                        float f20 = parentSizeElement.A00;
                        C270284gU r17 = parentSizeElement.A02;
                        C270284gU r011 = parentSizeElement.A01;
                        ? r1323 = new C267794cD();
                        r1323.A00 = f20;
                        r1323.A02 = r17;
                        r1323.A01 = r011;
                        return r1323;
                    } else if (this instanceof TextAnnotatedStringElement) {
                        TextAnnotatedStringElement textAnnotatedStringElement = (TextAnnotatedStringElement) this;
                        C286025Tq r10 = textAnnotatedStringElement.A03;
                        AnonymousClass5Z4 r9 = textAnnotatedStringElement.A04;
                        C286305Uu r8 = textAnnotatedStringElement.A05;
                        0sP r7 = textAnnotatedStringElement.A09;
                        int i4 = textAnnotatedStringElement.A02;
                        boolean z11 = textAnnotatedStringElement.A0A;
                        int i5 = textAnnotatedStringElement.A00;
                        int i6 = textAnnotatedStringElement.A01;
                        List list = textAnnotatedStringElement.A06;
                        0sP r18 = textAnnotatedStringElement.A07;
                        0sP r012 = textAnnotatedStringElement.A08;
                        ? r1324 = new C267794cD();
                        r1324.A04 = r10;
                        r1324.A05 = r9;
                        r1324.A06 = r8;
                        r1324.A0A = r7;
                        r1324.A02 = i4;
                        r1324.A0C = z11;
                        r1324.A00 = i5;
                        r1324.A01 = i6;
                        r1324.A07 = list;
                        r1324.A08 = r18;
                        r1324.A09 = r012;
                        return r1324;
                    } else if (this instanceof BouncyClickableElement) {
                        BouncyClickableElement bouncyClickableElement = (BouncyClickableElement) this;
                        boolean z12 = bouncyClickableElement.A09;
                        float f21 = bouncyClickableElement.A02;
                        float f22 = bouncyClickableElement.A01;
                        float f23 = bouncyClickableElement.A03;
                        float f24 = bouncyClickableElement.A00;
                        C287605aT r144 = bouncyClickableElement.A04;
                        String str5 = bouncyClickableElement.A06;
                        return new C304446Dm(r144, bouncyClickableElement.A05, str5, bouncyClickableElement.A08, bouncyClickableElement.A07, f21, f22, f23, f24, z12);
                    } else if (this instanceof VPVDElement) {
                        VPVDElement vPVDElement = (VPVDElement) this;
                        return new C304406Di(vPVDElement.A00, vPVDElement.A01);
                    } else if (this instanceof VerticalAlignElement) {
                        C287245Zp r013 = ((VerticalAlignElement) this).A00;
                        ? r1325 = new C267794cD();
                        r1325.A00 = r013;
                        return r1325;
                    } else if (this instanceof FillElement) {
                        FillElement fillElement = (FillElement) this;
                        Integer num2 = fillElement.A01;
                        float f25 = fillElement.A00;
                        ? r1326 = new C267794cD();
                        r1326.A01 = num2;
                        r1326.A00 = f25;
                        return r1326;
                    } else if (this instanceof NoIndicationCombinedClickableKt$FocusableInNonTouchModeElement$1) {
                        return new C267794cD();
                    } else {
                        if (this instanceof HoverableElement) {
                            C287605aT r014 = ((HoverableElement) this).A00;
                            ? r1327 = new C267794cD();
                            r1327.A00 = r014;
                            return r1327;
                        } else if (this instanceof FocusableElement) {
                            return new C288695cK(((FocusableElement) this).A00);
                        } else {
                            if (this instanceof OffsetElement) {
                                OffsetElement offsetElement = (OffsetElement) this;
                                float f26 = offsetElement.A00;
                                float f27 = offsetElement.A01;
                                boolean z13 = offsetElement.A02;
                                ? r1328 = new C267794cD();
                                r1328.A00 = f26;
                                r1328.A01 = f27;
                                r1328.A02 = z13;
                                return r1328;
                            } else if (this instanceof NoIndicationClickableElement) {
                                NoIndicationClickableElement noIndicationClickableElement = (NoIndicationClickableElement) this;
                                C287605aT r145 = noIndicationClickableElement.A00;
                                boolean z14 = noIndicationClickableElement.A06;
                                String str6 = noIndicationClickableElement.A02;
                                return new C288815cX(r145, noIndicationClickableElement.A01, str6, noIndicationClickableElement.A05, noIndicationClickableElement.A04, noIndicationClickableElement.A03, z14);
                            } else if (this instanceof IgdsAlphaIndicationElement) {
                                IgdsAlphaIndicationElement igdsAlphaIndicationElement = (IgdsAlphaIndicationElement) this;
                                return new AnonymousClass5WM(igdsAlphaIndicationElement.A01, igdsAlphaIndicationElement.A00, igdsAlphaIndicationElement.A02);
                            } else if (this instanceof NestedScrollElement) {
                                NestedScrollElement nestedScrollElement = (NestedScrollElement) this;
                                return new NestedScrollNode(nestedScrollElement.A00, nestedScrollElement.A01);
                            } else if (this instanceof BoxChildDataElement) {
                                BoxChildDataElement boxChildDataElement = (BoxChildDataElement) this;
                                Alignment alignment2 = boxChildDataElement.A00;
                                boolean z15 = boxChildDataElement.A01;
                                ? r1329 = new C267794cD();
                                r1329.A00 = alignment2;
                                r1329.A01 = z15;
                                return r1329;
                            } else if (this instanceof WrapContentElement) {
                                WrapContentElement wrapContentElement = (WrapContentElement) this;
                                Integer num3 = wrapContentElement.A00;
                                0sL r015 = wrapContentElement.A01;
                                ? r1330 = new C267794cD();
                                r1330.A00 = num3;
                                r1330.A01 = r015;
                                return r1330;
                            } else if (this instanceof DrawBehindElement) {
                                0sP r016 = ((DrawBehindElement) this).A00;
                                ? r1331 = new C267794cD();
                                r1331.A00 = r016;
                                return r1331;
                            } else if (this instanceof HorizontalAlignElement) {
                                C287265Zr r017 = ((HorizontalAlignElement) this).A00;
                                ? r1332 = new C267794cD();
                                r1332.A00 = r017;
                                return r1332;
                            } else if (this instanceof TraversablePrefetchStateModifierElement) {
                                AnonymousClass6H8 r018 = ((TraversablePrefetchStateModifierElement) this).A00;
                                ? r1333 = new C267794cD();
                                r1333.A00 = r018;
                                return r1333;
                            } else if (this instanceof LazyLayoutSemanticsModifier) {
                                LazyLayoutSemanticsModifier lazyLayoutSemanticsModifier = (LazyLayoutSemanticsModifier) this;
                                C62320sa r23 = lazyLayoutSemanticsModifier.A02;
                                C305246Hc r153 = lazyLayoutSemanticsModifier.A01;
                                return new AnonymousClass6IP(lazyLayoutSemanticsModifier.A00, r153, r23, lazyLayoutSemanticsModifier.A04, lazyLayoutSemanticsModifier.A03);
                            } else if (this instanceof ScrollableElement) {
                                ScrollableElement scrollableElement = (ScrollableElement) this;
                                C305096Gn r54 = scrollableElement.A04;
                                C305386Hs r146 = scrollableElement.A00;
                                AnonymousClass6HS r43 = scrollableElement.A02;
                                AnonymousClass6Gj r32 = scrollableElement.A03;
                                boolean z16 = scrollableElement.A06;
                                boolean z17 = scrollableElement.A07;
                                return new AnonymousClass6IS(r146, scrollableElement.A01, r43, r32, r54, scrollableElement.A05, z16, z17);
                            } else if (this instanceof LazyLayoutItemAnimator$DisplayingDisappearingItemsElement) {
                                AnonymousClass6H4 r019 = ((LazyLayoutItemAnimator$DisplayingDisappearingItemsElement) this).A00;
                                ? r1334 = new C267794cD();
                                r1334.A00 = r019;
                                return r1334;
                            } else {
                                VisibilityUpdateModifier visibilityUpdateModifier = (VisibilityUpdateModifier) this;
                                return new C52904Gee(visibilityUpdateModifier.A00, visibilityUpdateModifier.A01, visibilityUpdateModifier.A02, visibilityUpdateModifier.A03);
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v18, resolved type: X.6IP} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v19, resolved type: X.6IS} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v43, resolved type: X.6GL} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v44, resolved type: X.5cQ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v45, resolved type: X.5cQ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v46, resolved type: X.5cQ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v47, resolved type: X.5cQ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v48, resolved type: X.5cQ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v49, resolved type: X.5hf} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v56, resolved type: X.6IP} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v57, resolved type: X.6IP} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v58, resolved type: X.5cQ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v59, resolved type: X.5cQ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v60, resolved type: X.5cQ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v61, resolved type: X.5cQ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v62, resolved type: X.5cQ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v63, resolved type: X.5cQ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v64, resolved type: X.5cQ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v65, resolved type: X.5cQ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v66, resolved type: X.5cQ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v67, resolved type: X.5cQ} */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x02b0, code lost:
        if (r0 != null) goto L_0x02b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x02b2, code lost:
        X.AnonymousClass5WH.A02(r14).A0M();
        r14 = r14;
        r14 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x02b9, code lost:
        if (r11 != false) goto L_0x0191;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x006f, code lost:
        if (r2.equals(r1) == false) goto L_0x0051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x053a, code lost:
        if (r4 != false) goto L_0x053c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:413:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0184, code lost:
        if (r0 != null) goto L_0x0186;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0186, code lost:
        X.AnonymousClass5WH.A02(r14).A0M();
        r14 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x018d, code lost:
        if (r12 == false) goto L_0x018f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x018f, code lost:
        if (r10 != false) goto L_0x0191;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0191, code lost:
        X.AnonymousClass5WH.A02(r14).A0L();
        X.C288785cT.A00(r14);
        r14 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x019b, code lost:
        if (r13 == false) goto L_?;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:255:0x0555  */
    /* JADX WARNING: Removed duplicated region for block: B:259:0x0568  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(X.C267794cD r25) {
        /*
            r24 = this;
            r1 = r24
            r14 = r25
            boolean r0 = r1 instanceof androidx.compose.foundation.CombinedClickableElement
            if (r0 == 0) goto L_0x0033
            r0 = r1
            androidx.compose.foundation.CombinedClickableElement r0 = (androidx.compose.foundation.CombinedClickableElement) r0
            X.5cG r14 = (X.C288655cG) r14
            X.0sa r7 = r0.A05
            java.lang.String r6 = r0.A04
            X.0sa r5 = r0.A07
            X.0sa r4 = r0.A06
            X.5aT r3 = r0.A01
            X.5Yy r15 = r0.A00
            boolean r2 = r0.A08
            java.lang.String r1 = r0.A03
            X.5aV r0 = r0.A02
            r16 = r3
            r17 = r0
            r18 = r6
            r19 = r1
            r20 = r7
            r21 = r5
            r22 = r4
            r23 = r2
            r14.FJX(r15, r16, r17, r18, r19, r20, r21, r22, r23)
        L_0x0032:
            return
        L_0x0033:
            boolean r0 = r1 instanceof androidx.compose.ui.input.nestedscroll.NestedScrollElement
            if (r0 == 0) goto L_0x0072
            androidx.compose.ui.input.nestedscroll.NestedScrollElement r1 = (androidx.compose.ui.input.nestedscroll.NestedScrollElement) r1
            androidx.compose.ui.input.nestedscroll.NestedScrollNode r14 = (androidx.compose.ui.input.nestedscroll.NestedScrollNode) r14
            X.5WO r0 = r1.A00
            androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher r2 = r1.A01
            r14.A00 = r0
            androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher r1 = r14.A01
            androidx.compose.ui.input.nestedscroll.NestedScrollNode r0 = r1.A00
            if (r0 != r14) goto L_0x004a
            r0 = 0
            r1.A00 = r0
        L_0x004a:
            if (r2 != 0) goto L_0x006b
            androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher r2 = new androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher
            r2.<init>()
        L_0x0051:
            r14.A01 = r2
        L_0x0053:
            boolean r0 = r14.A08
            if (r0 == 0) goto L_0x0032
            androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher r2 = r14.A01
            r2.A00 = r14
            r1 = 23
            X.9L8 r0 = new X.9L8
            r0.<init>(r14, r1)
            r2.A01 = r0
            X.4Cq r0 = r14.A05()
            r2.A02 = r0
            return
        L_0x006b:
            boolean r0 = r2.equals(r1)
            if (r0 != 0) goto L_0x0053
            goto L_0x0051
        L_0x0072:
            boolean r0 = r1 instanceof androidx.compose.ui.draw.DrawWithContentElement
            if (r0 == 0) goto L_0x0080
            r0 = r1
            androidx.compose.ui.draw.DrawWithContentElement r0 = (androidx.compose.ui.draw.DrawWithContentElement) r0
            X.GQv r14 = (X.C52396GQv) r14
            X.0sP r0 = r0.A00
            r14.A00 = r0
            return
        L_0x0080:
            boolean r0 = r1 instanceof com.instagram.barcelonaig.tixu.vpvd.VisibilityChangeElement
            if (r0 == 0) goto L_0x00a3
            r2 = r1
            com.instagram.barcelonaig.tixu.vpvd.VisibilityChangeElement r2 = (com.instagram.barcelonaig.tixu.vpvd.VisibilityChangeElement) r2
            X.6Dj r14 = (X.C304416Dj) r14
            r1 = 0
            X.0qQ.A0B(r14, r1)
            java.lang.String r0 = r2.A01
            X.0qQ.A0B(r0, r1)
            r14.A02 = r0
            X.6CO r0 = r2.A00
            X.0qQ.A0B(r0, r1)
            r14.A01 = r0
            X.0sL r0 = r2.A02
            X.0qQ.A0B(r0, r1)
            r14.A03 = r0
            return
        L_0x00a3:
            boolean r0 = r1 instanceof androidx.compose.foundation.ClickableElement
            if (r0 == 0) goto L_0x00c6
            r0 = r1
            androidx.compose.foundation.ClickableElement r0 = (androidx.compose.foundation.ClickableElement) r0
            X.5WI r14 = (X.AnonymousClass5WI) r14
            X.5aT r4 = r0.A01
            X.5Yy r15 = r0.A00
            boolean r3 = r0.A05
            java.lang.String r2 = r0.A03
            X.5aV r1 = r0.A02
            X.0sa r0 = r0.A04
            r16 = r4
            r17 = r1
            r18 = r2
            r19 = r0
            r20 = r3
            r14.A0L(r15, r16, r17, r18, r19, r20)
            return
        L_0x00c6:
            boolean r0 = r1 instanceof androidx.compose.ui.input.pointer.SuspendPointerInputElement
            if (r0 == 0) goto L_0x00f2
            r0 = r1
            androidx.compose.ui.input.pointer.SuspendPointerInputElement r0 = (androidx.compose.ui.input.pointer.SuspendPointerInputElement) r0
            X.6FP r14 = (X.AnonymousClass6FP) r14
            java.lang.Object r4 = r0.A00
            java.lang.Object r3 = r0.A01
            X.0sL r2 = r0.A02
            java.lang.Object r0 = r14.A02
            boolean r0 = X.0qQ.A0K(r0, r4)
            r1 = r0 ^ 1
            r14.A02 = r4
            java.lang.Object r0 = r14.A03
            boolean r0 = X.0qQ.A0K(r0, r3)
            if (r0 != 0) goto L_0x00e8
            r1 = 1
        L_0x00e8:
            r14.A03 = r3
            if (r1 == 0) goto L_0x00ef
            r14.EI9()
        L_0x00ef:
            r14.A04 = r2
            return
        L_0x00f2:
            boolean r0 = r1 instanceof androidx.compose.foundation.text.modifiers.TextStringSimpleElement
            if (r0 == 0) goto L_0x01ab
            r2 = r1
            androidx.compose.foundation.text.modifiers.TextStringSimpleElement r2 = (androidx.compose.foundation.text.modifiers.TextStringSimpleElement) r2
            X.5hf r14 = (X.C291655hf) r14
            r3 = 0
            X.5Z4 r7 = r2.A03
            r13 = 1
            X.5Z4 r0 = r14.A04
            if (r7 == r0) goto L_0x010d
            X.5ZB r1 = r7.A02
            X.5ZB r0 = r0.A02
            boolean r0 = r1.A02(r0)
            if (r0 == 0) goto L_0x010e
        L_0x010d:
            r13 = 0
        L_0x010e:
            java.lang.String r1 = r2.A05
            java.lang.String r0 = r14.A06
            boolean r0 = X.0qQ.A0K(r0, r1)
            if (r0 == 0) goto L_0x01a4
            r12 = 0
        L_0x0119:
            int r6 = r2.A01
            int r5 = r2.A00
            boolean r4 = r2.A06
            X.5Uu r3 = r2.A04
            int r2 = r2.A02
            X.5Z4 r0 = r14.A04
            boolean r0 = r0.A0E(r7)
            r10 = 1
            r1 = r0 ^ 1
            r14.A04 = r7
            int r0 = r14.A01
            if (r0 == r6) goto L_0x0135
            r14.A01 = r6
            r1 = 1
        L_0x0135:
            int r0 = r14.A00
            if (r0 == r5) goto L_0x013c
            r14.A00 = r5
            r1 = 1
        L_0x013c:
            boolean r0 = r14.A08
            if (r0 == r4) goto L_0x0143
            r14.A08 = r4
            r1 = 1
        L_0x0143:
            X.5Uu r0 = r14.A05
            boolean r0 = X.0qQ.A0K(r0, r3)
            if (r0 != 0) goto L_0x014e
            r14.A05 = r3
            r1 = 1
        L_0x014e:
            int r0 = r14.A02
            if (r0 != r2) goto L_0x01a1
            r10 = r1
        L_0x0153:
            if (r12 != 0) goto L_0x0157
            if (r10 == 0) goto L_0x017a
        L_0x0157:
            X.5hg r7 = X.C291655hf.A00(r14)
            java.lang.String r6 = r14.A06
            X.5Z4 r5 = r14.A04
            X.5Uu r4 = r14.A05
            int r3 = r14.A02
            boolean r2 = r14.A08
            int r1 = r14.A00
            int r0 = r14.A01
            r7.A0C = r6
            r7.A08 = r5
            r7.A09 = r4
            r7.A02 = r3
            r7.A0E = r2
            r7.A00 = r1
            r7.A01 = r0
            X.C291665hg.A02(r7)
        L_0x017a:
            boolean r0 = r14.A08
            if (r0 == 0) goto L_0x0032
            if (r12 != 0) goto L_0x0186
            if (r13 == 0) goto L_0x018f
            X.0sP r0 = r14.A07
            if (r0 == 0) goto L_0x018f
        L_0x0186:
            X.5R6 r0 = X.AnonymousClass5WH.A02(r14)
            r0.A0M()
        L_0x018d:
            if (r12 != 0) goto L_0x0191
        L_0x018f:
            if (r10 == 0) goto L_0x019b
        L_0x0191:
            X.5R6 r0 = X.AnonymousClass5WH.A02(r14)
            r0.A0L()
            X.C288785cT.A00(r14)
        L_0x019b:
            if (r13 == 0) goto L_0x0032
        L_0x019d:
            X.C288785cT.A00(r14)
            return
        L_0x01a1:
            r14.A02 = r2
            goto L_0x0153
        L_0x01a4:
            r14.A06 = r1
            r14.A03 = r3
            r12 = 1
            goto L_0x0119
        L_0x01ab:
            boolean r0 = r1 instanceof androidx.compose.foundation.text.modifiers.TextAnnotatedStringElement
            if (r0 == 0) goto L_0x02cd
            r2 = r1
            androidx.compose.foundation.text.modifiers.TextAnnotatedStringElement r2 = (androidx.compose.foundation.text.modifiers.TextAnnotatedStringElement) r2
            X.6GL r14 = (X.AnonymousClass6GL) r14
            r9 = 0
            X.5Z4 r10 = r2.A04
            r13 = 1
            X.5Z4 r0 = r14.A05
            if (r10 == r0) goto L_0x01c6
            X.5ZB r1 = r10.A02
            X.5ZB r0 = r0.A02
            boolean r0 = r1.A02(r0)
            if (r0 == 0) goto L_0x01c7
        L_0x01c6:
            r13 = 0
        L_0x01c7:
            X.5Tq r5 = r2.A03
            X.5Tq r0 = r14.A04
            java.lang.String r1 = r0.A00
            java.lang.String r0 = r5.A00
            boolean r0 = X.0qQ.A0K(r1, r0)
            r11 = 1
            r6 = r0 ^ 1
            X.5Tq r0 = r14.A04
            java.util.List r1 = r0.A03
            if (r1 != 0) goto L_0x01de
            X.0sn r1 = X.0sn.A00
        L_0x01de:
            java.util.List r0 = r5.A03
            if (r0 != 0) goto L_0x01e4
            X.0sn r0 = X.0sn.A00
        L_0x01e4:
            boolean r0 = X.0qQ.A0K(r1, r0)
            r4 = r0 ^ 1
            X.5Tq r0 = r14.A04
            java.util.List r1 = r0.A02
            if (r1 != 0) goto L_0x01f2
            X.0sn r1 = X.0sn.A00
        L_0x01f2:
            java.util.List r0 = r5.A02
            if (r0 != 0) goto L_0x01f8
            X.0sn r0 = X.0sn.A00
        L_0x01f8:
            boolean r0 = X.0qQ.A0K(r1, r0)
            r3 = r0 ^ 1
            X.5Tq r0 = r14.A04
            java.util.List r1 = r0.A01
            java.util.List r0 = r5.A01
            boolean r0 = X.0qQ.A0K(r1, r0)
            r0 = r0 ^ 1
            if (r6 != 0) goto L_0x02c5
            if (r4 != 0) goto L_0x02c5
            if (r3 != 0) goto L_0x02c5
            if (r0 != 0) goto L_0x02c5
            r11 = 0
        L_0x0213:
            java.util.List r8 = r2.A06
            int r7 = r2.A01
            int r6 = r2.A00
            boolean r5 = r2.A0A
            X.5Uu r4 = r2.A05
            int r3 = r2.A02
            X.5Z4 r0 = r14.A05
            boolean r0 = r0.A0E(r10)
            r12 = 1
            r1 = r0 ^ 1
            r14.A05 = r10
            java.util.List r0 = r14.A07
            boolean r0 = X.0qQ.A0K(r0, r8)
            if (r0 != 0) goto L_0x0235
            r14.A07 = r8
            r1 = 1
        L_0x0235:
            int r0 = r14.A01
            if (r0 == r7) goto L_0x023c
            r14.A01 = r7
            r1 = 1
        L_0x023c:
            int r0 = r14.A00
            if (r0 == r6) goto L_0x0243
            r14.A00 = r6
            r1 = 1
        L_0x0243:
            boolean r0 = r14.A0C
            if (r0 == r5) goto L_0x024a
            r14.A0C = r5
            r1 = 1
        L_0x024a:
            X.5Uu r0 = r14.A06
            boolean r0 = X.0qQ.A0K(r0, r4)
            if (r0 != 0) goto L_0x0255
            r14.A06 = r4
            r1 = 1
        L_0x0255:
            int r8 = r14.A02
            if (r8 != r3) goto L_0x02c1
            r12 = r1
        L_0x025a:
            X.0sP r1 = r2.A09
            X.0sP r3 = r2.A07
            X.0sP r2 = r2.A08
            X.0sP r0 = r14.A0A
            r10 = 1
            if (r0 == r1) goto L_0x02bf
            r14.A0A = r1
            r1 = 1
        L_0x0268:
            X.0sP r0 = r14.A08
            if (r0 == r3) goto L_0x026f
            r14.A08 = r3
            r1 = 1
        L_0x026f:
            X.0sP r0 = r14.A09
            if (r0 == r2) goto L_0x02bd
            r14.A09 = r2
        L_0x0275:
            if (r11 != 0) goto L_0x027b
            if (r12 != 0) goto L_0x027b
            if (r10 == 0) goto L_0x02a6
        L_0x027b:
            X.6GO r7 = X.AnonymousClass6GL.A00(r14)
            X.5Tq r6 = r14.A04
            X.5Z4 r5 = r14.A05
            X.5Uu r4 = r14.A06
            boolean r3 = r14.A0C
            int r2 = r14.A00
            int r1 = r14.A01
            java.util.List r0 = r14.A07
            r7.A07 = r6
            r7.A0A = r5
            r7.A0B = r4
            r7.A04 = r8
            r7.A0E = r3
            r7.A02 = r2
            r7.A03 = r1
            r7.A0D = r0
            r7.A08 = r9
            r7.A09 = r9
            r0 = -1
            r7.A00 = r0
            r7.A01 = r0
        L_0x02a6:
            boolean r0 = r14.A08
            if (r0 == 0) goto L_0x0032
            if (r11 != 0) goto L_0x02b2
            if (r13 == 0) goto L_0x018d
            X.0sP r0 = r14.A0B
            if (r0 == 0) goto L_0x018d
        L_0x02b2:
            X.5R6 r0 = X.AnonymousClass5WH.A02(r14)
            r0.A0M()
            if (r11 != 0) goto L_0x0191
            goto L_0x018d
        L_0x02bd:
            r10 = r1
            goto L_0x0275
        L_0x02bf:
            r1 = 0
            goto L_0x0268
        L_0x02c1:
            r14.A02 = r3
            r8 = r3
            goto L_0x025a
        L_0x02c5:
            r14.A04 = r5
            if (r6 == 0) goto L_0x0213
            r14.A03 = r9
            goto L_0x0213
        L_0x02cd:
            boolean r0 = r1 instanceof androidx.compose.ui.semantics.AppendedSemanticsElement
            if (r0 == 0) goto L_0x02de
            androidx.compose.ui.semantics.AppendedSemanticsElement r1 = (androidx.compose.ui.semantics.AppendedSemanticsElement) r1
            X.5cR r14 = (X.C288765cR) r14
            boolean r0 = r1.A01
            r14.A02 = r0
            X.0sP r0 = r1.A00
            r14.A00 = r0
            return
        L_0x02de:
            boolean r0 = r1 instanceof androidx.compose.ui.draw.DrawBehindElement
            if (r0 == 0) goto L_0x02ec
            r0 = r1
            androidx.compose.ui.draw.DrawBehindElement r0 = (androidx.compose.ui.draw.DrawBehindElement) r0
            X.5du r14 = (X.C289615du) r14
            X.0sP r0 = r0.A00
            r14.A00 = r0
            return
        L_0x02ec:
            boolean r0 = r1 instanceof androidx.compose.ui.draw.PainterElement
            if (r0 == 0) goto L_0x0331
            r6 = r1
            androidx.compose.ui.draw.PainterElement r6 = (androidx.compose.ui.draw.PainterElement) r6
            X.5cQ r14 = (X.C288755cQ) r14
            boolean r0 = r14.A05
            boolean r5 = r6.A05
            if (r0 != r5) goto L_0x032f
            if (r5 == 0) goto L_0x030d
            X.2DO r0 = r14.A03
            long r3 = r0.A03()
            X.2DO r0 = r6.A03
            long r1 = r0.A03()
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x032f
        L_0x030d:
            r1 = 0
        L_0x030e:
            X.2DO r0 = r6.A03
            r14.A03 = r0
            r14.A05 = r5
            androidx.compose.ui.Alignment r0 = r6.A01
            r14.A01 = r0
            X.5bM r0 = r6.A04
            r14.A04 = r0
            float r0 = r6.A00
            r14.A00 = r0
            X.5bW r0 = r6.A02
            r14.A02 = r0
            if (r1 == 0) goto L_0x019d
            X.5R6 r0 = X.AnonymousClass5WH.A02(r14)
            r0.A0L()
            goto L_0x019d
        L_0x032f:
            r1 = 1
            goto L_0x030e
        L_0x0331:
            boolean r0 = r1 instanceof com.instagram.compose.perf.render.OnFirstContentDrawModifierElement
            if (r0 == 0) goto L_0x0346
            r0 = r1
            com.instagram.compose.perf.render.OnFirstContentDrawModifierElement r0 = (com.instagram.compose.perf.render.OnFirstContentDrawModifierElement) r0
            X.5cY r14 = (X.C288825cY) r14
            r1 = 0
            X.0qQ.A0B(r14, r1)
            X.0sa r0 = r0.A00
            X.0qQ.A0B(r0, r1)
            r14.A00 = r0
            return
        L_0x0346:
            boolean r0 = r1 instanceof androidx.compose.foundation.layout.SizeElement
            if (r0 == 0) goto L_0x0363
            androidx.compose.foundation.layout.SizeElement r1 = (androidx.compose.foundation.layout.SizeElement) r1
            X.5cF r14 = (X.C288645cF) r14
            float r0 = r1.A03
            r14.A03 = r0
            float r0 = r1.A02
            r14.A02 = r0
            float r0 = r1.A01
            r14.A01 = r0
            float r0 = r1.A00
            r14.A00 = r0
            boolean r0 = r1.A04
            r14.A04 = r0
            return
        L_0x0363:
            boolean r0 = r1 instanceof androidx.compose.foundation.HoverableElement
            if (r0 == 0) goto L_0x037c
            r0 = r1
            androidx.compose.foundation.HoverableElement r0 = (androidx.compose.foundation.HoverableElement) r0
            androidx.compose.foundation.HoverableNode r14 = (androidx.compose.foundation.HoverableNode) r14
            X.5aT r1 = r0.A00
            X.5aT r0 = r14.A00
            boolean r0 = X.0qQ.A0K(r0, r1)
            if (r0 != 0) goto L_0x0032
            androidx.compose.foundation.HoverableNode.A02(r14)
            r14.A00 = r1
            return
        L_0x037c:
            boolean r0 = r1 instanceof androidx.compose.foundation.FocusableElement
            if (r0 == 0) goto L_0x038b
            r0 = r1
            androidx.compose.foundation.FocusableElement r0 = (androidx.compose.foundation.FocusableElement) r0
            X.5cK r14 = (X.C288695cK) r14
            X.5aT r0 = r0.A00
            r14.A0J(r0)
            return
        L_0x038b:
            boolean r0 = r1 instanceof com.instagram.compose.core.ui.NoIndicationClickableElement
            if (r0 == 0) goto L_0x03b4
            com.instagram.compose.core.ui.NoIndicationClickableElement r1 = (com.instagram.compose.core.ui.NoIndicationClickableElement) r1
            X.5cX r14 = (X.C288815cX) r14
            r0 = 0
            X.0qQ.A0B(r14, r0)
            X.5aT r3 = r1.A00
            boolean r10 = r1.A06
            java.lang.String r6 = r1.A02
            X.5aV r4 = r1.A01
            r2 = 0
            X.0sa r8 = r1.A05
            X.0sa r9 = r1.A04
            X.0sa r7 = r1.A03
            X.0qQ.A0B(r3, r0)
            r0 = 7
            X.0qQ.A0B(r7, r0)
            X.5cH r1 = r14.A00
            r5 = r2
            r1.FJX(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        L_0x03b4:
            boolean r0 = r1 instanceof androidx.compose.ui.graphics.GraphicsLayerElement
            if (r0 == 0) goto L_0x03f5
            r2 = r1
            androidx.compose.ui.graphics.GraphicsLayerElement r2 = (androidx.compose.ui.graphics.GraphicsLayerElement) r2
            X.4dP r14 = (X.C268444dP) r14
            float r0 = r2.A03
            r14.A03 = r0
            float r0 = r2.A04
            r14.A04 = r0
            float r0 = r2.A00
            r14.A00 = r0
            float r0 = r2.A02
            r14.A02 = r0
            float r0 = r2.A01
            r14.A01 = r0
            long r0 = r2.A07
            r14.A07 = r0
            X.5S2 r0 = r2.A08
            r14.A08 = r0
            boolean r0 = r2.A09
            r14.A0A = r0
            long r0 = r2.A05
            r14.A05 = r0
            long r0 = r2.A06
            r14.A06 = r0
            r0 = 2
            X.4cg r0 = X.AnonymousClass5WH.A04(r14, r0)
            X.4cg r2 = r0.A06
            if (r2 == 0) goto L_0x0032
            X.0sP r1 = r14.A09
        L_0x03f0:
            r0 = 1
            r2.A0o(r1, r0)
            return
        L_0x03f5:
            boolean r0 = r1 instanceof androidx.compose.ui.graphics.BlockGraphicsLayerElement
            if (r0 == 0) goto L_0x040e
            r0 = r1
            androidx.compose.ui.graphics.BlockGraphicsLayerElement r0 = (androidx.compose.ui.graphics.BlockGraphicsLayerElement) r0
            X.4dN r14 = (X.C268424dN) r14
            X.0sP r0 = r0.A00
            r14.A00 = r0
            r0 = 2
            X.4cg r0 = X.AnonymousClass5WH.A04(r14, r0)
            X.4cg r2 = r0.A06
            if (r2 == 0) goto L_0x0032
            X.0sP r1 = r14.A00
            goto L_0x03f0
        L_0x040e:
            boolean r0 = r1 instanceof com.instagram.compose.ui.bouncy.BouncyClickableElement
            if (r0 == 0) goto L_0x0470
            com.instagram.compose.ui.bouncy.BouncyClickableElement r1 = (com.instagram.compose.ui.bouncy.BouncyClickableElement) r1
            X.6Dm r14 = (X.C304446Dm) r14
            r0 = 0
            X.0qQ.A0B(r14, r0)
            boolean r7 = r1.A09
            float r6 = r1.A02
            float r5 = r1.A01
            float r4 = r1.A03
            float r3 = r1.A00
            X.5aT r10 = r1.A04
            java.lang.String r13 = r1.A06
            X.5aV r11 = r1.A05
            X.0sa r2 = r1.A08
            X.0sa r0 = r1.A07
            r1 = 5
            X.0qQ.A0B(r10, r1)
            r1 = 9
            X.0qQ.A0B(r0, r1)
            X.5cX r8 = r14.A00
            if (r2 == 0) goto L_0x046e
            X.5WL r1 = r14.A01
            X.Imr r15 = new X.Imr
            r15.<init>(r1)
        L_0x0442:
            r9 = 0
            X.5WL r1 = r14.A01
            X.Ims r14 = new X.Ims
            r14.<init>(r1)
            X.5cH r8 = r8.A00
            r12 = r9
            r16 = r9
            r17 = r7
            r8.FJX(r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r1.A05 = r0
            r1.A06 = r2
            r1.A02 = r6
            r1.A01 = r5
            r1.A03 = r4
            r1.A00 = r3
            X.5aT r0 = r1.A04
            boolean r0 = X.0qQ.A0K(r0, r10)
            if (r0 != 0) goto L_0x0032
            r1.A04 = r10
            X.AnonymousClass5WL.A01(r1)
            return
        L_0x046e:
            r15 = 0
            goto L_0x0442
        L_0x0470:
            boolean r0 = r1 instanceof androidx.compose.foundation.BackgroundElement
            if (r0 == 0) goto L_0x048a
            r2 = r1
            androidx.compose.foundation.BackgroundElement r2 = (androidx.compose.foundation.BackgroundElement) r2
            X.6GF r14 = (X.AnonymousClass6GF) r14
            long r0 = r2.A01
            r14.A01 = r0
            X.6Ff r0 = r2.A02
            r14.A03 = r0
            float r0 = r2.A00
            r14.A00 = r0
            X.5S2 r0 = r2.A03
            r14.A06 = r0
            return
        L_0x048a:
            boolean r0 = r1 instanceof androidx.compose.ui.input.key.KeyInputElement
            if (r0 == 0) goto L_0x049b
            androidx.compose.ui.input.key.KeyInputElement r1 = (androidx.compose.ui.input.key.KeyInputElement) r1
            X.5WF r14 = (X.AnonymousClass5WF) r14
            X.0sP r0 = r1.A00
            r14.A00 = r0
            X.0sP r0 = r1.A01
            r14.A01 = r0
            return
        L_0x049b:
            boolean r0 = r1 instanceof androidx.compose.ui.layout.OnPlacedElement
            if (r0 == 0) goto L_0x04a9
            r0 = r1
            androidx.compose.ui.layout.OnPlacedElement r0 = (androidx.compose.ui.layout.OnPlacedElement) r0
            X.5cP r14 = (X.C288745cP) r14
            X.0sP r0 = r0.A00
            r14.A00 = r0
            return
        L_0x04a9:
            boolean r0 = r1 instanceof com.instagram.feed.tifu.ui.VisibilityUpdateModifier
            if (r0 == 0) goto L_0x04d3
            r2 = r1
            com.instagram.feed.tifu.ui.VisibilityUpdateModifier r2 = (com.instagram.feed.tifu.ui.VisibilityUpdateModifier) r2
            X.Gee r14 = (X.C52904Gee) r14
            r1 = 0
            X.0qQ.A0B(r14, r1)
            X.0sP r0 = r2.A03
            X.0qQ.A0B(r0, r1)
            r14.A04 = r0
            X.0sa r0 = r2.A01
            X.0qQ.A0B(r0, r1)
            r14.A02 = r0
            X.0sa r0 = r2.A02
            X.0qQ.A0B(r0, r1)
            r14.A03 = r0
            java.lang.Integer r0 = r2.A00
            X.0qQ.A0B(r0, r1)
            r14.A01 = r0
            return
        L_0x04d3:
            boolean r0 = r1 instanceof com.instagram.compose.ui.gradientspinner.GradientSpinnerModifierElement
            if (r0 == 0) goto L_0x0511
            com.instagram.compose.ui.gradientspinner.GradientSpinnerModifierElement r1 = (com.instagram.compose.ui.gradientspinner.GradientSpinnerModifierElement) r1
            com.instagram.compose.ui.gradientspinner.GradientSpinnerNode r14 = (com.instagram.compose.ui.gradientspinner.GradientSpinnerNode) r14
            r0 = 0
            X.0qQ.A0B(r14, r0)
            X.GRo r4 = r1.A01
            X.GRc r3 = r1.A02
            float r2 = r1.A00
            X.0sK r1 = r1.A03
            X.0qQ.A0B(r4, r0)
            r0 = 1
            X.0qQ.A0B(r3, r0)
            r0 = 3
            X.0qQ.A0B(r1, r0)
            X.GRo r0 = r14.A01
            if (r0 == r4) goto L_0x04fb
            r14.A01 = r4
            r14.DUu()
        L_0x04fb:
            X.GRc r0 = r14.A02
            boolean r0 = X.0qQ.A0K(r0, r3)
            if (r0 != 0) goto L_0x050c
            X.GRs r0 = new X.GRs
            r0.<init>(r3)
            r14.A03 = r0
            r14.A02 = r3
        L_0x050c:
            r14.A00 = r2
            r14.A04 = r1
            return
        L_0x0511:
            boolean r0 = r1 instanceof com.instagram.compose.igds.core.IgdsAlphaIndicationElement
            if (r0 == 0) goto L_0x0587
            com.instagram.compose.igds.core.IgdsAlphaIndicationElement r1 = (com.instagram.compose.igds.core.IgdsAlphaIndicationElement) r1
            X.5WM r14 = (X.AnonymousClass5WM) r14
            r0 = 0
            X.0qQ.A0B(r14, r0)
            X.5aT r2 = r1.A01
            boolean r4 = r1.A02
            float r5 = r1.A00
            X.0qQ.A0B(r2, r0)
            X.5aT r0 = r14.A00
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x0578
            X.4Co r1 = r14.A01
            r0 = 0
            if (r1 == 0) goto L_0x0536
            r1.AG7(r0)
        L_0x0536:
            r14.A01 = r0
            r14.A00 = r2
            if (r4 == 0) goto L_0x0552
        L_0x053c:
            X.4Cq r3 = r14.A05()
            r1 = 0
            r0 = 16
            X.9Js r2 = new X.9Js
            r2.<init>(r14, r1, r0)
            X.19B r1 = X.19B.A00
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            X.1Er r1 = X.1Eo.A03(r0, r1, r2, r3)
        L_0x0550:
            r14.A01 = r1
        L_0x0552:
            r3 = 0
            if (r4 != 0) goto L_0x0568
            X.4Cq r2 = r14.A05()
            r0 = 8
            X.JUx r1 = new X.JUx
            r1.<init>(r14, r3, r5, r0)
        L_0x0560:
            X.19B r0 = X.19B.A00
            X.1Eo.A05(r0, r1, r2)
        L_0x0565:
            r14.A02 = r4
            return
        L_0x0568:
            boolean r0 = r14.A02
            if (r0 == r4) goto L_0x0565
            X.4Cq r2 = r14.A05()
            r0 = 33
            X.MG7 r1 = new X.MG7
            r1.<init>(r14, r3, r0)
            goto L_0x0560
        L_0x0578:
            boolean r0 = r14.A02
            if (r4 == r0) goto L_0x0552
            if (r4 != 0) goto L_0x053c
            X.4Co r0 = r14.A01
            r1 = 0
            if (r0 == 0) goto L_0x0550
            r0.AG7(r1)
            goto L_0x0550
        L_0x0587:
            boolean r0 = r1 instanceof com.instagram.barcelonaig.tixu.vpvd.VPVDElement
            if (r0 == 0) goto L_0x05a3
            r2 = r1
            com.instagram.barcelonaig.tixu.vpvd.VPVDElement r2 = (com.instagram.barcelonaig.tixu.vpvd.VPVDElement) r2
            X.6Di r14 = (X.C304406Di) r14
            r1 = 0
            X.0qQ.A0B(r14, r1)
            java.lang.String r0 = r2.A00
            X.0qQ.A0B(r0, r1)
            r14.A01 = r0
            X.0sL r0 = r2.A01
            X.0qQ.A0B(r0, r1)
            r14.A02 = r0
            return
        L_0x05a3:
            boolean r0 = r1 instanceof androidx.compose.foundation.layout.PaddingElement
            if (r0 == 0) goto L_0x05c0
            androidx.compose.foundation.layout.PaddingElement r1 = (androidx.compose.foundation.layout.PaddingElement) r1
            X.5cB r14 = (X.C288605cB) r14
            float r0 = r1.A02
            r14.A02 = r0
            float r0 = r1.A03
            r14.A03 = r0
            float r0 = r1.A01
            r14.A01 = r0
            float r0 = r1.A00
            r14.A00 = r0
            boolean r0 = r1.A04
            r14.A04 = r0
            return
        L_0x05c0:
            boolean r0 = r1 instanceof androidx.compose.ui.layout.OnGloballyPositionedElement
            if (r0 == 0) goto L_0x05ce
            r0 = r1
            androidx.compose.ui.layout.OnGloballyPositionedElement r0 = (androidx.compose.ui.layout.OnGloballyPositionedElement) r0
            X.Gc2 r14 = (X.C52750Gc2) r14
            X.0sP r0 = r0.A00
            r14.A00 = r0
            return
        L_0x05ce:
            boolean r0 = r1 instanceof androidx.compose.foundation.BorderModifierNodeElement
            if (r0 == 0) goto L_0x060b
            r2 = r1
            androidx.compose.foundation.BorderModifierNodeElement r2 = (androidx.compose.foundation.BorderModifierNodeElement) r2
            X.6GG r14 = (X.AnonymousClass6GG) r14
            float r1 = r2.A00
            float r0 = r14.A00
            boolean r0 = X.C289095d0.A01(r0, r1)
            if (r0 != 0) goto L_0x05e8
            r14.A00 = r1
            X.5SO r0 = r14.A04
            r0.CNm()
        L_0x05e8:
            X.6Ff r1 = r2.A01
            X.6Ff r0 = r14.A02
            boolean r0 = X.0qQ.A0K(r0, r1)
            if (r0 != 0) goto L_0x05f9
            r14.A02 = r1
            X.5SO r0 = r14.A04
            r0.CNm()
        L_0x05f9:
            X.5S2 r1 = r2.A02
            X.5S2 r0 = r14.A03
            boolean r0 = X.0qQ.A0K(r0, r1)
            if (r0 != 0) goto L_0x0032
            r14.A03 = r1
            X.5SO r0 = r14.A04
            r0.CNm()
            return
        L_0x060b:
            boolean r0 = r1 instanceof androidx.compose.foundation.layout.OffsetElement
            if (r0 == 0) goto L_0x0620
            androidx.compose.foundation.layout.OffsetElement r1 = (androidx.compose.foundation.layout.OffsetElement) r1
            X.64y r14 = (X.C3027064y) r14
            float r0 = r1.A00
            r14.A00 = r0
            float r0 = r1.A01
            r14.A01 = r0
            boolean r0 = r1.A02
            r14.A02 = r0
            return
        L_0x0620:
            boolean r0 = r1 instanceof androidx.compose.foundation.gestures.ScrollableElement
            if (r0 == 0) goto L_0x06a2
            r0 = r1
            androidx.compose.foundation.gestures.ScrollableElement r0 = (androidx.compose.foundation.gestures.ScrollableElement) r0
            X.6IS r14 = (X.AnonymousClass6IS) r14
            X.6Gn r1 = r0.A04
            X.6Gj r11 = r0.A03
            X.6Hs r10 = r0.A00
            boolean r9 = r0.A06
            boolean r8 = r0.A07
            X.6HS r7 = r0.A02
            X.5aT r6 = r0.A05
            X.JS2 r5 = r0.A01
            boolean r0 = r14.A03
            if (r0 == r9) goto L_0x06a0
            androidx.compose.foundation.gestures.ScrollableNestedScrollConnection r0 = r14.A08
            r0.A00 = r9
            X.6Gf r0 = r14.A07
            r0.A00 = r9
            r13 = 1
        L_0x0646:
            if (r7 != 0) goto L_0x069e
            X.6IU r12 = r14.A06
        L_0x064a:
            androidx.compose.foundation.gestures.ScrollingLogic r4 = r14.A09
            androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher r3 = r14.A0A
            X.6Gn r0 = r4.A05
            boolean r0 = X.0qQ.A0K(r0, r1)
            r19 = 1
            if (r0 != 0) goto L_0x069c
            r4.A05 = r1
            r2 = 1
        L_0x065b:
            r4.A01 = r10
            X.6Gj r1 = r4.A03
            if (r1 == r11) goto L_0x0665
            r4.A03 = r11
            r1 = r11
            r2 = 1
        L_0x0665:
            boolean r0 = r4.A07
            if (r0 == r8) goto L_0x0699
            r4.A07 = r8
        L_0x066b:
            r4.A02 = r12
            r4.A06 = r3
            X.6IZ r0 = r14.A05
            r0.A02 = r11
            r0.A05 = r8
            r0.A01 = r5
            r14.A00 = r10
            r14.A01 = r7
            X.0sP r17 = androidx.compose.foundation.gestures.ScrollableKt.A03
            X.6Gj r15 = X.AnonymousClass6Gj.Vertical
            if (r1 == r15) goto L_0x0683
            X.6Gj r15 = X.AnonymousClass6Gj.Horizontal
        L_0x0683:
            r16 = r6
            r18 = r9
            r14.A0N(r15, r16, r17, r18, r19)
            if (r13 == 0) goto L_0x0032
            r0 = 0
            r14.A03 = r0
            r14.A04 = r0
        L_0x0691:
            X.5R6 r0 = X.AnonymousClass5WH.A02(r14)
            r0.A0M()
            return
        L_0x0699:
            r19 = r2
            goto L_0x066b
        L_0x069c:
            r2 = 0
            goto L_0x065b
        L_0x069e:
            r12 = r7
            goto L_0x064a
        L_0x06a0:
            r13 = 0
            goto L_0x0646
        L_0x06a2:
            boolean r0 = r1 instanceof com.instagram.compose.core.ui.NoIndicationCombinedClickableKt$FocusableInNonTouchModeElement$1
            if (r0 != 0) goto L_0x0032
            boolean r0 = r1 instanceof androidx.compose.ui.semantics.EmptySemanticsElement
            if (r0 != 0) goto L_0x0032
            boolean r0 = r1 instanceof androidx.compose.ui.platform.TestTagElement
            if (r0 == 0) goto L_0x06b8
            r0 = r1
            androidx.compose.ui.platform.TestTagElement r0 = (androidx.compose.ui.platform.TestTagElement) r0
            X.6GE r14 = (X.AnonymousClass6GE) r14
            java.lang.String r0 = r0.A00
            r14.A00 = r0
            return
        L_0x06b8:
            boolean r0 = r1 instanceof androidx.compose.ui.platform.DragAndDropModifierOnDragListener$modifier$1
            if (r0 != 0) goto L_0x0032
            boolean r0 = r1 instanceof androidx.compose.ui.input.rotary.RotaryInputElement
            if (r0 == 0) goto L_0x06ca
            r0 = r1
            androidx.compose.ui.input.rotary.RotaryInputElement r0 = (androidx.compose.ui.input.rotary.RotaryInputElement) r0
            X.5WE r14 = (X.AnonymousClass5WE) r14
            X.0sP r0 = r0.A00
            r14.A00 = r0
            return
        L_0x06ca:
            boolean r0 = r1 instanceof androidx.compose.ui.focus.FocusTargetNode$FocusTargetElement
            if (r0 != 0) goto L_0x0032
            boolean r0 = r1 instanceof androidx.compose.ui.focus.FocusPropertiesElement
            if (r0 == 0) goto L_0x06dc
            r0 = r1
            androidx.compose.ui.focus.FocusPropertiesElement r0 = (androidx.compose.ui.focus.FocusPropertiesElement) r0
            X.5WG r14 = (X.AnonymousClass5WG) r14
            X.5Qg r0 = r0.A00
            r14.A00 = r0
            return
        L_0x06dc:
            boolean r0 = r1 instanceof androidx.compose.ui.focus.FocusOwnerImpl$modifier$2
            if (r0 != 0) goto L_0x0032
            boolean r0 = r1 instanceof androidx.compose.foundation.lazy.layout.TraversablePrefetchStateModifierElement
            if (r0 == 0) goto L_0x06ee
            r0 = r1
            androidx.compose.foundation.lazy.layout.TraversablePrefetchStateModifierElement r0 = (androidx.compose.foundation.lazy.layout.TraversablePrefetchStateModifierElement) r0
            androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode r14 = (androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode) r14
            X.6H8 r0 = r0.A00
            r14.A00 = r0
            return
        L_0x06ee:
            boolean r0 = r1 instanceof androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsModifier
            if (r0 == 0) goto L_0x0722
            androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsModifier r1 = (androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsModifier) r1
            X.6IP r14 = (X.AnonymousClass6IP) r14
            X.0sa r4 = r1.A02
            X.6Hc r0 = r1.A01
            X.6Gj r3 = r1.A00
            boolean r2 = r1.A04
            boolean r1 = r1.A03
            r14.A02 = r4
            r14.A01 = r0
            X.6Gj r0 = r14.A00
            if (r0 == r3) goto L_0x0711
            r14.A00 = r3
            X.5R6 r0 = X.AnonymousClass5WH.A02(r14)
            r0.A0M()
        L_0x0711:
            boolean r0 = r14.A04
            if (r0 != r2) goto L_0x0719
            boolean r0 = r14.A03
            if (r0 == r1) goto L_0x0032
        L_0x0719:
            r14.A04 = r2
            r14.A03 = r1
            X.AnonymousClass6IP.A00(r14)
            goto L_0x0691
        L_0x0722:
            boolean r0 = r1 instanceof androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator$DisplayingDisappearingItemsElement
            if (r0 == 0) goto L_0x0745
            r0 = r1
            androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator$DisplayingDisappearingItemsElement r0 = (androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator$DisplayingDisappearingItemsElement) r0
            X.6IR r14 = (X.AnonymousClass6IR) r14
            X.6H4 r1 = r0.A00
            X.6H4 r0 = r14.A00
            boolean r0 = X.0qQ.A0K(r0, r1)
            if (r0 != 0) goto L_0x0032
            X.4cD r0 = r14.A03
            boolean r0 = r0.A08
            if (r0 == 0) goto L_0x0032
            X.6H4 r0 = r14.A00
            r0.A06()
            r1.A02 = r14
            r14.A00 = r1
            return
        L_0x0745:
            boolean r0 = r1 instanceof androidx.compose.foundation.lazy.ParentSizeElement
            if (r0 == 0) goto L_0x075a
            androidx.compose.foundation.lazy.ParentSizeElement r1 = (androidx.compose.foundation.lazy.ParentSizeElement) r1
            X.6F4 r14 = (X.AnonymousClass6F4) r14
            float r0 = r1.A00
            r14.A00 = r0
            X.4gU r0 = r1.A02
            r14.A02 = r0
            X.4gU r0 = r1.A01
            r14.A01 = r0
            return
        L_0x075a:
            boolean r0 = r1 instanceof androidx.compose.foundation.layout.WrapContentElement
            if (r0 == 0) goto L_0x076b
            androidx.compose.foundation.layout.WrapContentElement r1 = (androidx.compose.foundation.layout.WrapContentElement) r1
            X.5cE r14 = (X.C288635cE) r14
            java.lang.Integer r0 = r1.A00
            r14.A00 = r0
            X.0sL r0 = r1.A01
            r14.A01 = r0
            return
        L_0x076b:
            boolean r0 = r1 instanceof androidx.compose.foundation.layout.VerticalAlignElement
            if (r0 == 0) goto L_0x0779
            r0 = r1
            androidx.compose.foundation.layout.VerticalAlignElement r0 = (androidx.compose.foundation.layout.VerticalAlignElement) r0
            X.6Dk r14 = (X.C304426Dk) r14
            X.5Zp r0 = r0.A00
            r14.A00 = r0
            return
        L_0x0779:
            boolean r0 = r1 instanceof androidx.compose.foundation.layout.UnspecifiedConstraintsElement
            if (r0 == 0) goto L_0x078a
            androidx.compose.foundation.layout.UnspecifiedConstraintsElement r1 = (androidx.compose.foundation.layout.UnspecifiedConstraintsElement) r1
            X.6Dg r14 = (X.C304386Dg) r14
            float r0 = r1.A01
            r14.A01 = r0
            float r0 = r1.A00
            r14.A00 = r0
            return
        L_0x078a:
            boolean r0 = r1 instanceof androidx.compose.foundation.layout.PaddingValuesElement
            if (r0 == 0) goto L_0x0798
            r0 = r1
            androidx.compose.foundation.layout.PaddingValuesElement r0 = (androidx.compose.foundation.layout.PaddingValuesElement) r0
            X.6Dh r14 = (X.C304396Dh) r14
            X.6Fk r0 = r0.A00
            r14.A00 = r0
            return
        L_0x0798:
            boolean r0 = r1 instanceof androidx.compose.foundation.layout.LayoutWeightElement
            if (r0 == 0) goto L_0x07a9
            androidx.compose.foundation.layout.LayoutWeightElement r1 = (androidx.compose.foundation.layout.LayoutWeightElement) r1
            X.6GD r14 = (X.AnonymousClass6GD) r14
            float r0 = r1.A00
            r14.A00 = r0
            boolean r0 = r1.A01
            r14.A01 = r0
            return
        L_0x07a9:
            boolean r0 = r1 instanceof androidx.compose.foundation.layout.IntrinsicHeightElement
            if (r0 == 0) goto L_0x07ba
            androidx.compose.foundation.layout.IntrinsicHeightElement r1 = (androidx.compose.foundation.layout.IntrinsicHeightElement) r1
            X.GeR r14 = (X.C52891GeR) r14
            java.lang.Integer r0 = r1.A00
            r14.A00 = r0
            boolean r0 = r1.A01
            r14.A01 = r0
            return
        L_0x07ba:
            boolean r0 = r1 instanceof androidx.compose.foundation.layout.HorizontalAlignElement
            if (r0 == 0) goto L_0x07c8
            r0 = r1
            androidx.compose.foundation.layout.HorizontalAlignElement r0 = (androidx.compose.foundation.layout.HorizontalAlignElement) r0
            X.5hY r14 = (X.C291585hY) r14
            X.5Zr r0 = r0.A00
            r14.A00 = r0
            return
        L_0x07c8:
            boolean r0 = r1 instanceof androidx.compose.foundation.layout.FillElement
            if (r0 == 0) goto L_0x07d9
            androidx.compose.foundation.layout.FillElement r1 = (androidx.compose.foundation.layout.FillElement) r1
            X.5cC r14 = (X.C288615cC) r14
            java.lang.Integer r0 = r1.A01
            r14.A01 = r0
            float r0 = r1.A00
            r14.A00 = r0
            return
        L_0x07d9:
            boolean r0 = r1 instanceof androidx.compose.foundation.layout.BoxChildDataElement
            if (r0 == 0) goto L_0x07ea
            androidx.compose.foundation.layout.BoxChildDataElement r1 = (androidx.compose.foundation.layout.BoxChildDataElement) r1
            X.5d1 r14 = (X.C289105d1) r14
            androidx.compose.ui.Alignment r0 = r1.A00
            r14.A00 = r0
            boolean r0 = r1.A01
            r14.A01 = r0
            return
        L_0x07ea:
            androidx.compose.animation.SizeAnimationModifierElement r1 = (androidx.compose.animation.SizeAnimationModifierElement) r1
            X.5WJ r14 = (X.AnonymousClass5WJ) r14
            X.5b8 r0 = r1.A00
            r14.A01 = r0
            androidx.compose.ui.Alignment r0 = r1.A01
            r14.A02 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5QP.A01(X.4cD):void");
    }

    public final /* synthetic */ Object AW8(Object obj, 0sL r3) {
        return r3.invoke(obj, this);
    }
}
