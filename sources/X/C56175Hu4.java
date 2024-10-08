package X;

import android.graphics.Matrix;
import android.provider.Settings;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import com.airbnb.lottie.compose.AnimateLottieCompositionAsStateKt$animateLottieCompositionAsState$3;
import com.facebook.common.dextricks.Constants;
import java.util.Map;

/* renamed from: X.Hu4  reason: case insensitive filesystem */
public abstract class C56175Hu4 {
    public static final void A00(C286575Wy r39, Alignment alignment, Modifier modifier, C288095bM r42, S7N s7n, C8874RDq rDq, Map map, float f, int i, int i2, int i3, int i4, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        float f2 = f;
        int i5 = i;
        Alignment alignment2 = alignment;
        C8874RDq rDq2 = rDq;
        Modifier modifier2 = modifier;
        C288095bM r19 = r42;
        Map map2 = map;
        C286575Wy r2 = r39;
        r2.ExV(185154698);
        int i6 = i4;
        if ((i4 & 2) != 0) {
            modifier2 = Modifier.A00;
        }
        boolean A1R = C51966G9m.A1R(i4 & 4, z);
        boolean A1R2 = C51966G9m.A1R(i4 & 8, z2);
        if ((i4 & 32) != 0) {
            f2 = 1.0f;
        }
        if ((i4 & 64) != 0) {
            i5 = 1;
        }
        boolean A1Q = C51966G9m.A1Q(i6 & 128, z3);
        boolean A1Q2 = C51966G9m.A1Q(i6 & 256, z4);
        boolean A1Q3 = C51966G9m.A1Q(i6 & 512, z5);
        if ((i6 & 1024) != 0) {
            rDq2 = C8874RDq.AUTOMATIC;
        }
        boolean A1Q4 = C51966G9m.A1Q(i6 & C249703kE.FLAG_MOVED, z6);
        boolean A1Q5 = C51966G9m.A1Q(i6 & 4096, z7);
        if ((i6 & Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET) != 0) {
            alignment2 = C287215Zl.A09;
        }
        if ((32768 & i4) != 0) {
            r19 = C288075bK.A04;
        }
        boolean A1R3 = C51966G9m.A1R(65536 & i4, z8);
        if ((131072 & i4) != 0) {
            map2 = null;
        }
        r2.ExT(-180607681);
        Integer num = AnonymousClass05K.A00;
        if (Float.isInfinite(f2) || Float.isNaN(f2)) {
            throw AnonymousClass7TE.A0w(002.A0F("Speed must be a finite number. It is ", '.', f2));
        }
        r2.ExT(-610207901);
        Object A0f = G9w.A0f(r2, -3687241);
        Object obj = AnonymousClass5XT.A00;
        if (A0f == obj) {
            A0f = new C56867IFo();
            r2.FLL(A0f);
        }
        C286565Wx A0H = C51965G9l.A0H(r2, false);
        C56867IFo iFo = (C56867IFo) A0f;
        C286565Wx.A0L(A0H, false);
        Object A0Z = C51974G9v.A0Z(r2, G9w.A0f(r2, -3687241), obj, A1R);
        C286565Wx.A0L(A0H, false);
        r2.ExT(-180606834);
        float f3 = f2 / Settings.Global.getFloat(C51968G9o.A0I(r2).getContentResolver(), AnonymousClass000.A00(506), 1.0f);
        S7N s7n2 = s7n;
        C286645Xf.A07(r2, new AnimateLottieCompositionAsStateKt$animateLottieCompositionAsState$3((C284945Oz) A0Z, s7n2, iFo, num, (AnonymousClass4D7) null, f3, i5, A1R, A1R2, A1Q4, false), new Object[]{s7n2, C51967G9n.A0f(A0H, A1R), null, Float.valueOf(f3), Integer.valueOf(i5)});
        C286565Wx.A0L(A0H, false);
        r2.ExT(-3686930);
        boolean AGu = r2.AGu(iFo);
        Object ECw = r2.ECw();
        if (AGu || ECw == obj) {
            ECw = new C13347TVu(iFo, 28);
            r2.FLL(ECw);
        }
        C286565Wx.A0L(A0H, false);
        int i7 = i2;
        int i8 = i2 >> 12;
        int i9 = i3;
        int i10 = i3 >> 15;
        A01(r2, alignment2, modifier2, r19, s7n2, rDq2, map2, (C62320sa) ECw, C51972G9s.A06(29360128, i3 << 15, 134217736 | ((i2 << 3) & 896) | (i8 & 7168) | (i8 & 57344) | (i8 & 458752) | ((i3 << 18) & 3670016)), (i10 & 112) | (i10 & 14) | 512, 0, A1Q, A1Q2, A1Q3, A1Q5, A1R3);
        C286625Xd ASQ = r2.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new JDK(alignment2, modifier2, r19, s7n2, rDq2, map2, f2, i5, i7, i9, i6, A1R, A1R2, A1Q, A1Q2, A1Q3, A1Q4, A1Q5, A1R3);
        }
    }

    public static final void A01(C286575Wy r23, Alignment alignment, Modifier modifier, C288095bM r26, S7N s7n, C8874RDq rDq, Map map, C62320sa r30, int i, int i2, int i3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        Modifier modifier2 = modifier;
        Map map2 = map;
        C8874RDq rDq2 = rDq;
        C288095bM r11 = r26;
        Alignment alignment2 = alignment;
        C62320sa r15 = r30;
        0qQ.A0B(r15, 1);
        C286575Wy r1 = r23;
        r1.ExV(185150686);
        int i4 = i3;
        if ((i3 & 4) != 0) {
            modifier2 = Modifier.A00;
        }
        boolean A1Q = C51966G9m.A1Q(i3 & 8, z);
        boolean A1Q2 = C51966G9m.A1Q(i3 & 16, z2);
        boolean A1Q3 = C51966G9m.A1Q(i3 & 32, z3);
        if ((i3 & 64) != 0) {
            rDq2 = C8874RDq.AUTOMATIC;
        }
        boolean A1Q4 = C51966G9m.A1Q(i4 & 128, z4);
        if ((i4 & 512) != 0) {
            alignment2 = C287215Zl.A09;
        }
        if ((i4 & 1024) != 0) {
            r11 = C288075bK.A04;
        }
        boolean A1R = C51966G9m.A1R(i4 & C249703kE.FLAG_MOVED, z5);
        if ((i4 & 4096) != 0) {
            map2 = null;
        }
        Object A0f = G9w.A0f(r1, -3687241);
        Object obj = AnonymousClass5XT.A00;
        if (A0f == obj) {
            A0f = new Q6Y();
            r1.FLL(A0f);
        }
        C286565Wx A0G = C51965G9l.A0G(r1);
        Q6Y q6y = (Q6Y) A0f;
        Object A0f2 = G9w.A0f(r1, -3687241);
        if (A0f2 == obj) {
            A0f2 = new Matrix();
            r1.FLL(A0f2);
        }
        C286565Wx.A0I(A0G);
        Matrix matrix = (Matrix) A0f2;
        Object A0f3 = G9w.A0f(r1, -3687241);
        if (A0f3 == obj) {
            A0f3 = G9t.A0o(r1, (Object) null);
        }
        C286565Wx.A0L(A0G, false);
        C284945Oz r5 = (C284945Oz) A0f3;
        r1.ExT(185151463);
        int i5 = i2;
        S7N s7n2 = s7n;
        int i6 = i;
        if (s7n == null || s7n2.A00() == 0.0f) {
            C286565Wx.A0L(A0G, false);
            C286625Xd ASQ = r1.ASQ();
            if (ASQ != null) {
                ASQ.A06 = new C59268JCu(alignment2, modifier2, r11, s7n2, rDq2, map2, r15, i6, i5, i4, A1Q, A1Q2, A1Q3, A1Q4, A1R);
            }
            C287675aa.A02(r1, modifier2, (i >> 6) & 14);
            return;
        }
        C286565Wx.A0L(A0G, false);
        float A00 = SSo.A00();
        C289565do.A00(r1, C287205Zk.A0G(modifier2, ((float) s7n2.A05.width()) / A00, ((float) s7n2.A05.height()) / A00), new TWY(matrix, r5, alignment2, r11, s7n2, q6y, rDq2, map2, r15, A1Q3, A1Q, A1Q2, A1Q4, A1R), 0);
        C286625Xd ASQ2 = r1.ASQ();
        if (ASQ2 != null) {
            ASQ2.A06 = new C59268JCu(alignment2, modifier2, r11, s7n2, rDq2, map2, r15, i6, i5, i4, A1Q, A1Q2, A1Q3, A1Q4, A1R);
        }
    }
}
