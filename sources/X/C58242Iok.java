package X;

import android.animation.ValueAnimator;
import android.graphics.Color;
import android.view.animation.OvershootInterpolator;
import com.instagram.android.R;

/* renamed from: X.Iok  reason: case insensitive filesystem */
public final class C58242Iok extends 0Yg implements C62320sa {
    public final float A00;
    public final int A01;
    public final int A02;
    public final long A03;
    public final long A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;
    public final Object A08;
    public final Object A09;
    public final Object A0A;
    public final Object A0B;
    public final Object A0C;
    public final Object A0D;
    public final Object A0E;
    public final Object A0F;
    public final boolean A0G;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58242Iok(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, float f, int i, int i2, long j, long j2, boolean z) {
        super(0);
        this.A01 = i2;
        this.A07 = obj;
        this.A06 = obj2;
        this.A08 = obj3;
        this.A02 = i;
        this.A0G = z;
        this.A0E = obj4;
        this.A0D = obj5;
        this.A0F = obj6;
        this.A04 = j;
        this.A0A = obj7;
        this.A0C = obj8;
        this.A05 = obj9;
        this.A03 = j2;
        this.A0B = obj10;
        this.A09 = obj11;
        this.A00 = f;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        boolean z;
        int i;
        Object obj;
        2V5 r1;
        Object obj2;
        String str;
        Integer A0D2;
        int i2;
        long j;
        0Yg wxR;
        C267324bN r0;
        String str2;
        Integer A0D3;
        int i3;
        long j2;
        C267324bN r02;
        if (this.A01 != 0) {
            C53928GwY gwY = (C53928GwY) this.A07;
            OvershootInterpolator overshootInterpolator = C53928GwY.A0r;
            Boolean bool = gwY.A05;
            GZG gzg = gwY.A04;
            i = 0;
            z = false;
            if (gzg != null) {
                AnonymousClass3W1 r10 = gwY.A03;
                if (C55165HdH.A00(r10, gzg) && bool != null) {
                    AnonymousClass3Y5 r5 = (AnonymousClass3Y5) this.A08;
                    Double d = gzg.A03;
                    String str3 = gzg.A08;
                    int A022 = C244013aV.A02(r5, R.color.black_50_transparent);
                    int i4 = this.A02;
                    if (gwY.A0O) {
                        A022 = C244013aV.A02(r5, R.color.button_background_color);
                    } else if (gwY.A0N) {
                        A022 = 0nH.A07(2eL.A03(0.7f, i4, -16777216), 0.4f);
                    } else if (d != null && (str2 = gwY.A07) != null && (A0D3 = 0nH.A0D(str2)) != null) {
                        A022 = 0nH.A02((float) d.doubleValue(), A0D3.intValue(), -1);
                    } else if (str3 != null && !00l.A0W(str3)) {
                        try {
                            A022 = Color.parseColor(str3);
                        } catch (IllegalArgumentException unused) {
                        }
                    }
                    0sP iwv = new C58748Iwv(r5, gwY, this.A00, 14);
                    boolean booleanValue = bool.booleanValue();
                    if ((booleanValue && !gwY.A0C) || this.A0G) {
                        ((2Wa) this.A0E).A03(J6P.A00(gwY, 8));
                        2Wa r3 = (2Wa) this.A0D;
                        0eP r03 = gwY.A08;
                        if (r03 != null) {
                            Number number = (Number) r03.A01;
                            if (number.intValue() != 0) {
                                i3 = number.intValue();
                                C51967G9n.A1H(r3, i3);
                                ((2Wa) this.A0F).A01(C51965G9l.A0e(this.A04));
                                r1 = (2V5) this.A0A;
                                obj2 = iwv.invoke(Integer.valueOf(A022));
                                r1.A00(obj2);
                                ((2Wa) this.A0C).A00();
                                wxR = new 0Yg(i);
                                return C51965G9l.A0V(wxR);
                            }
                        }
                        i3 = 12;
                        C51967G9n.A1H(r3, i3);
                        ((2Wa) this.A0F).A01(C51965G9l.A0e(this.A04));
                        r1 = (2V5) this.A0A;
                        obj2 = iwv.invoke(Integer.valueOf(A022));
                        r1.A00(obj2);
                        ((2Wa) this.A0C).A00();
                        wxR = new 0Yg(i);
                        return C51965G9l.A0V(wxR);
                    } else if (booleanValue || AnonymousClass7TE.A1a(C51968G9o.A0y(this.A05))) {
                        ((2Wa) this.A06).A01(bool);
                        C243673Zt r4 = (C243673Zt) this.A09;
                        C51973G9u.A18(r4);
                        float[] A1b = C51965G9l.A1b();
                        // fill-array-data instruction
                        A1b[0] = 0;
                        A1b[1] = 1065353216;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(A1b);
                        2V5 r2 = (2V5) this.A0A;
                        Object obj3 = this.A0E;
                        Object obj4 = this.A0D;
                        Object obj5 = this.A0F;
                        long j3 = this.A04;
                        long j4 = this.A03;
                        Object obj6 = this.A0C;
                        Object obj7 = this.A05;
                        if (gwY.A0M) {
                            j2 = 150;
                        } else {
                            j2 = 300;
                        }
                        ofFloat.setDuration(j2);
                        ofFloat.addUpdateListener(new C56693I7z(r5, r2, bool, iwv, A022, 1));
                        if (gwY.A0K && (r02 = gwY.A02) != null && r02.CcK()) {
                            C51966G9m.A1N(r10.A3a, r10, true);
                            ofFloat.setStartDelay(500);
                        }
                        ofFloat.addListener(new C56676I7g(1, j3, j4, obj3, obj4, obj5, gwY, bool));
                        ofFloat.addListener(new C56677I7h(A022, 1, r5, r2, obj7, obj6, gwY, bool, iwv));
                        ofFloat.start();
                        r4.A00(ofFloat);
                        wxR = new C58703IwC(r4, 4);
                        return C51965G9l.A0V(wxR);
                    } else {
                        C51967G9n.A1H((2Wa) this.A0D, 0);
                        ((2Wa) this.A0F).A01(C51965G9l.A0e(this.A03));
                        ((2V5) this.A0A).A00(this.A0B);
                        obj = this.A0C;
                    }
                }
            }
            obj = this.A06;
        } else {
            C52646GaK gaK = (C52646GaK) this.A07;
            OvershootInterpolator overshootInterpolator2 = C52646GaK.A0u;
            Boolean bool2 = gaK.A05;
            GZG gzg2 = gaK.A04;
            i = 0;
            z = false;
            if (gzg2 != null) {
                AnonymousClass3W1 r102 = gaK.A03;
                if (C55165HdH.A00(r102, gzg2) && bool2 != null) {
                    AnonymousClass3Y5 r7 = (AnonymousClass3Y5) this.A08;
                    Double d2 = gzg2.A03;
                    String str4 = gzg2.A08;
                    int A023 = C244013aV.A02(r7, R.color.black_50_transparent);
                    int i5 = this.A02;
                    if (gaK.A0O) {
                        A023 = C244013aV.A02(r7, R.color.button_background_color);
                    } else if (gaK.A0N) {
                        A023 = 0nH.A07(2eL.A03(0.7f, i5, -16777216), 0.4f);
                    } else if (d2 != null && (str = gaK.A07) != null && (A0D2 = 0nH.A0D(str)) != null) {
                        A023 = 0nH.A02((float) d2.doubleValue(), A0D2.intValue(), -1);
                    } else if (str4 != null && !00l.A0W(str4)) {
                        try {
                            A023 = Color.parseColor(str4);
                        } catch (IllegalArgumentException unused2) {
                        }
                    }
                    0sP iwv2 = new C58748Iwv(r7, gaK, this.A00, 12);
                    boolean booleanValue2 = bool2.booleanValue();
                    if ((booleanValue2 && !gaK.A0C) || this.A0G) {
                        ((2Wa) this.A0E).A03(new MP8(gaK, 2));
                        2Wa r32 = (2Wa) this.A0D;
                        0eP r04 = gaK.A08;
                        if (r04 != null) {
                            Number number2 = (Number) r04.A01;
                            if (number2.intValue() != 0) {
                                i2 = number2.intValue();
                                C51967G9n.A1H(r32, i2);
                                ((2Wa) this.A0F).A01(C51965G9l.A0e(this.A04));
                                r1 = (2V5) this.A0A;
                                obj2 = iwv2.invoke(Integer.valueOf(A023));
                                r1.A00(obj2);
                                ((2Wa) this.A0C).A00();
                                wxR = new 0Yg(i);
                                return C51965G9l.A0V(wxR);
                            }
                        }
                        i2 = 12;
                        C51967G9n.A1H(r32, i2);
                        ((2Wa) this.A0F).A01(C51965G9l.A0e(this.A04));
                        r1 = (2V5) this.A0A;
                        obj2 = iwv2.invoke(Integer.valueOf(A023));
                        r1.A00(obj2);
                        ((2Wa) this.A0C).A00();
                        wxR = new 0Yg(i);
                        return C51965G9l.A0V(wxR);
                    } else if (booleanValue2 || AnonymousClass7TE.A1a(C51968G9o.A0y(this.A05))) {
                        ((2Wa) this.A06).A01(bool2);
                        C243673Zt r52 = (C243673Zt) this.A09;
                        C51973G9u.A18(r52);
                        float[] A1b2 = C51965G9l.A1b();
                        // fill-array-data instruction
                        A1b2[0] = 0;
                        A1b2[1] = 1065353216;
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(A1b2);
                        2V5 r33 = (2V5) this.A0A;
                        Object obj8 = this.A0E;
                        Object obj9 = this.A0D;
                        Object obj10 = this.A0F;
                        long j5 = this.A04;
                        long j6 = this.A03;
                        Object obj11 = this.A0C;
                        Object obj12 = this.A05;
                        if (gaK.A0M) {
                            j = 150;
                        } else {
                            j = 300;
                        }
                        ofFloat2.setDuration(j);
                        ofFloat2.addUpdateListener(new C56693I7z(r7, r33, bool2, iwv2, A023, 0));
                        if (gaK.A0K && (r0 = gaK.A02) != null && r0.CcK()) {
                            C51966G9m.A1N(r102.A3a, r102, true);
                            ofFloat2.setStartDelay(500);
                        }
                        ofFloat2.addListener(new C56676I7g(0, j5, j6, obj8, obj9, obj10, gaK, bool2));
                        ofFloat2.addListener(new C56677I7h(A023, 0, r7, r33, obj12, obj11, gaK, bool2, iwv2));
                        ofFloat2.start();
                        r52.A00(ofFloat2);
                        wxR = new C20695WxR(r52, 16);
                        return C51965G9l.A0V(wxR);
                    } else {
                        C51967G9n.A1H((2Wa) this.A0D, 0);
                        ((2Wa) this.A0F).A01(C51965G9l.A0e(this.A03));
                        ((2V5) this.A0A).A00(this.A0B);
                        obj = this.A0C;
                    }
                }
            }
            obj = this.A06;
        }
        ((2Wa) obj).A01(z);
        wxR = new 0Yg(i);
        return C51965G9l.A0V(wxR);
    }
}
