package X;

import android.content.Context;
import android.graphics.Rect;
import android.text.Layout;
import java.util.ArrayList;

/* renamed from: X.8f1  reason: invalid class name and case insensitive filesystem */
public abstract class C360708f1 {
    public AnonymousClass6MP A00(Context context, Layout layout, Integer num, float f, int i, int i2) {
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        boolean z;
        float f9;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        C19712WeE weE;
        boolean z2;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        float f20;
        float f21;
        float f22;
        float f23 = f;
        Context context2 = context;
        Layout layout2 = layout;
        if (this instanceof C360828fD) {
            0qQ.A0B(context2, 0);
            float f24 = f * 0.05f;
            int lineCount = layout2.getLineCount();
            float[][] fArr = new float[lineCount][];
            for (int i3 = 0; i3 < lineCount; i3++) {
                fArr[i3] = new float[]{layout2.getLineLeft(i3), (float) layout2.getLineBaseline(i3)};
            }
            return new U2T(context2, fArr, f24);
        }
        if (this instanceof C349287zt) {
            z2 = false;
            0qQ.A0B(context2, 0);
            f15 = f / 4.0f;
            f16 = 0.4f;
            f17 = f * 0.4f;
            f18 = 0.2f;
            f19 = f * 0.2f;
            f20 = 0.3f;
            f21 = f * 0.3f;
            f22 = 1.0f;
        } else {
            int i4 = i;
            int i5 = i2;
            if (this instanceof C360818fC) {
                return new C19710WeC(VIL.A00(layout2, f23, i4, i5));
            }
            if (this instanceof C360688ez) {
                Layout layout3 = layout2;
                return new C19713WeF(C19713WeF.A07.A01(layout3, num, f23, 0, layout2.getText().length()), f * 0.1f);
            } else if (this instanceof C349267zr) {
                z2 = false;
                0qQ.A0B(context2, 0);
                f15 = f / 4.0f;
                f16 = 0.3f;
                f17 = f * 0.3f;
                f18 = 0.15f;
                f19 = f * 0.15f;
                f20 = 0.2f;
                f21 = f * 0.2f;
                f22 = 0.85f;
            } else {
                if (this instanceof C360868fH) {
                    0qQ.A0B(context2, 0);
                    weE = new C19712WeE(context2, new Rect(), 0.6f, 0.6f, 0.8f);
                } else if (this instanceof C360808fB) {
                    0qQ.A0B(context2, 0);
                    return new C380239Xe(context2);
                } else {
                    if (this instanceof C360788f9) {
                        0qQ.A0B(context2, 0);
                        f2 = f / 4.0f;
                        f3 = 0.3f;
                        f4 = f * 0.3f;
                        f5 = 0.0f;
                    } else {
                        if (this instanceof C349297zu) {
                            z = false;
                            0qQ.A0B(context2, 0);
                            f9 = f / 4.0f;
                            f10 = 0.3f;
                            f11 = f * 0.3f;
                            f12 = 0.0f;
                            f13 = f * 0.0f;
                            f14 = 0.6f;
                        } else if (this instanceof C360838fE) {
                            0qQ.A0B(context2, 0);
                            return new U2V(context2, U2V.A07.A00(layout2, f23));
                        } else if (this instanceof C360858fG) {
                            return new C19711WeD(VIN.A00(layout2, f23));
                        } else {
                            if (this instanceof C360898fK) {
                                0qQ.A0B(context2, 0);
                                f6 = 0.6f;
                                f7 = 0.45f;
                                f8 = 0.7f;
                            } else if (this instanceof C360888fJ) {
                                0qQ.A0B(context2, 0);
                                ArrayList A02 = C306496Mj.A02(layout2, f * 0.2f, f * -0.1f, f * -0.05f, 0.0f, 0.8f);
                                0qQ.A0C(A02, AnonymousClass000.A00(337));
                                return new C19714WeG(context2, A02, 0.0f, -0.1f, -0.05f, 0.2f, 0.8f, false);
                            } else if (this instanceof C360878fI) {
                                z = false;
                                0qQ.A0B(context2, 0);
                                f9 = f / 3.0f;
                                f10 = 0.8f;
                                f11 = f * 0.8f;
                                f12 = 0.4f;
                                f13 = f * 0.4f;
                                f14 = 0.85f;
                            } else if (this instanceof C360798fA) {
                                z = false;
                                0qQ.A0B(context2, 0);
                                f9 = f / 4.0f;
                                f10 = 0.3f;
                                f11 = f * 0.3f;
                                f12 = 0.2f;
                                f13 = f * 0.2f;
                                f14 = 1.0f;
                            } else if (this instanceof C349277zs) {
                                0qQ.A0B(context2, 0);
                                f6 = 0.7f;
                                f7 = 0.55f;
                                f8 = 0.9f;
                            } else if (this instanceof C389959qV) {
                                0qQ.A0B(context2, 0);
                                f2 = f / 4.0f;
                                f3 = 0.3f;
                                f4 = f * 0.3f;
                                f5 = 0.2f;
                            } else {
                                C17758Veh veh = U2U.A07;
                                Layout layout4 = layout2;
                                float f25 = f23;
                                int i6 = i4;
                                int i7 = i5;
                                return new U2U(veh.A00(layout4, f25, i6, i7, true), veh.A00(layout4, f25, i6, i7, false));
                            }
                            weE = new C19712WeE(context2, new Rect(), f6, f7, f8);
                        }
                        ArrayList A022 = C306496Mj.A02(layout2, f11, f13, f13, f9, f14);
                        0qQ.A0C(A022, AnonymousClass000.A00(337));
                        return new C19714WeG(context2, A022, f9, f12, f12, f10, f14, z);
                    }
                    ArrayList A023 = C306496Mj.A02(layout2, f4, f * f5, f * -0.01f, f2, 1.0f);
                    0qQ.A0C(A023, AnonymousClass000.A00(337));
                    return new C19714WeG(context2, A023, f2, f5, -0.01f, f3, 1.0f, true);
                }
                weE.A00(layout2, f23);
                return weE;
            }
        }
        ArrayList A024 = C306496Mj.A02(layout2, f17, f19, f21, f15, f22);
        0qQ.A0C(A024, AnonymousClass000.A00(337));
        return new C19714WeG(context2, A024, f15, f18, f20, f16, f22, z2);
    }

    public Class A01() {
        if (this instanceof C360868fH) {
            return C19712WeE.class;
        }
        if (this instanceof C349287zt) {
            return C19714WeG.class;
        }
        if (this instanceof C360828fD) {
            return U2T.class;
        }
        if (this instanceof C349267zr) {
            return C19714WeG.class;
        }
        if (this instanceof C360818fC) {
            return C19710WeC.class;
        }
        if (this instanceof C360878fI) {
            return C19714WeG.class;
        }
        if (this instanceof C360688ez) {
            return C19713WeF.class;
        }
        if (this instanceof C360798fA) {
            return C19714WeG.class;
        }
        if (this instanceof C349277zs) {
            return C19712WeE.class;
        }
        if (this instanceof C360808fB) {
            return C380239Xe.class;
        }
        if ((this instanceof C360788f9) || (this instanceof C349297zu)) {
            return C19714WeG.class;
        }
        if (this instanceof C360838fE) {
            return U2V.class;
        }
        if (this instanceof C360858fG) {
            return C19711WeD.class;
        }
        if (this instanceof C360898fK) {
            return C19712WeE.class;
        }
        if ((this instanceof C360888fJ) || (this instanceof C389959qV)) {
            return C19714WeG.class;
        }
        return U2U.class;
    }

    public boolean A02() {
        if (this instanceof C360808fB) {
            return false;
        }
        return true;
    }

    public boolean A03() {
        if (this instanceof C360818fC) {
            return true;
        }
        return false;
    }
}
