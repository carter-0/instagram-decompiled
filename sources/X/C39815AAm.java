package X;

import android.content.Context;
import android.text.Spannable;

/* renamed from: X.AAm  reason: case insensitive filesystem */
public abstract class C39815AAm {
    public static final float A00(Context context, Spannable spannable, C358868bb r7, C306386Ly r8, float f) {
        float f2;
        float f3;
        float f4;
        C306396Lz r0;
        float f5;
        0qQ.A0B(r7, 2);
        C358938bi r3 = r7.A06;
        0qQ.A0A(context);
        float f6 = f;
        0qQ.A0B(context, 0);
        Integer num = r3.A09;
        if (num == null || num.intValue() != 0) {
            f2 = r3.A01;
        } else {
            f2 = AnonymousClass7TE.A01(context.getResources(), r3.A07);
            f6 = r3.A01;
        }
        float f7 = f6 * f2;
        float f8 = 0.0f;
        if (r8 instanceof AnonymousClass91c) {
            f3 = ((AnonymousClass91c) r8).A0U();
        } else {
            f3 = 0.0f;
        }
        0qQ.A0A(spannable);
        C306576Mr A00 = C358948bj.A00(spannable, 0, spannable.length());
        C360708f1 r1 = r7.A04;
        if (r1 != null && (A00 == C306576Mr.DEFAULT || A00 == C306576Mr.INVERTED)) {
            0qQ.A0A(r1);
            if (!(r1 instanceof C360858fG)) {
                if (!(r1 instanceof C360868fH)) {
                    if (r1 instanceof C349277zs) {
                        f5 = 0.9f;
                    } else {
                        if (!(r1 instanceof C360788f9)) {
                            if (!(r1 instanceof C360878fI) && !(r1 instanceof C360688ez)) {
                                if (!(r1 instanceof C349287zt)) {
                                    if (!(r1 instanceof C389959qV)) {
                                        if (!(r1 instanceof C360838fE)) {
                                            if (r1 instanceof C360898fK) {
                                                f5 = 0.7f;
                                            } else if (r1 instanceof C360888fJ) {
                                                f5 = 0.2f;
                                            } else if (r1 instanceof C360848fF) {
                                                f5 = (float) Math.tan(Math.toRadians(22.25d));
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        f5 = 0.3f;
                    }
                    f4 = f * f5;
                    if (!(r8 == null || (r0 = r8.A0I) == null)) {
                        f8 = C39814AAl.A00(r0, f);
                    }
                    return f7 + f3 + Math.max(f4, f8);
                }
                f5 = 0.8f;
                f4 = f * f5;
                f8 = C39814AAl.A00(r0, f);
                return f7 + f3 + Math.max(f4, f8);
            }
            f5 = 0.4f;
            f4 = f * f5;
            f8 = C39814AAl.A00(r0, f);
            return f7 + f3 + Math.max(f4, f8);
        }
        f4 = 0.0f;
        f8 = C39814AAl.A00(r0, f);
        return f7 + f3 + Math.max(f4, f8);
    }

    public static final float A01(Context context, Spannable spannable, C358868bb r7, C306386Ly r8, float f) {
        float f2;
        float f3;
        float f4;
        C306396Lz r0;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        0qQ.A0B(r7, 2);
        C358938bi r2 = r7.A06;
        0qQ.A0A(context);
        float f11 = f;
        0qQ.A0B(context, 0);
        Integer num = r2.A09;
        if (num == null || num.intValue() != 0) {
            f2 = r2.A04;
        } else {
            f2 = AnonymousClass7TE.A01(context.getResources(), r2.A07);
            f11 = r2.A04;
        }
        float f12 = f11 * f2;
        float f13 = 0.0f;
        if (r8 instanceof AnonymousClass91c) {
            f3 = ((AnonymousClass91c) r8).A0V();
        } else {
            f3 = 0.0f;
        }
        0qQ.A0A(spannable);
        C306576Mr A00 = C358948bj.A00(spannable, 0, spannable.length());
        C360708f1 r3 = r7.A04;
        if (r3 != null && (A00 == C306576Mr.DEFAULT || A00 == C306576Mr.INVERTED)) {
            0qQ.A0A(r3);
            if (r3 instanceof C360858fG) {
                f8 = 0.55f;
            } else {
                if (r3 instanceof C360868fH) {
                    f10 = 0.6f;
                } else {
                    if (r3 instanceof C349267zr) {
                        f5 = f * 0.15f;
                        f7 = 0.2f;
                    } else if (r3 instanceof C349277zs) {
                        f5 = f * 0.7f;
                        f7 = 0.55f;
                    } else {
                        if (r3 instanceof C360788f9) {
                            f9 = 0.0f;
                        } else if (r3 instanceof C349297zu) {
                            f10 = 0.0f;
                        } else if (r3 instanceof C360878fI) {
                            f10 = 0.4f;
                        } else if (r3 instanceof C360688ez) {
                            f5 = f * 0.15f;
                            f7 = 0.25f;
                        } else if (r3 instanceof C349287zt) {
                            f5 = f * 0.2f;
                            f7 = 0.3f;
                        } else if (r3 instanceof C389959qV) {
                            f9 = 0.2f;
                        } else if (r3 instanceof C360838fE) {
                            f8 = 0.15f;
                        } else if (r3 instanceof C360898fK) {
                            f5 = f * 0.6f;
                            f7 = 0.45f;
                        } else if (r3 instanceof C360888fJ) {
                            f5 = f * -0.1f;
                            f7 = -0.05f;
                        } else if (r3 instanceof C360848fF) {
                            f5 = f * 0.2f;
                            f6 = 2.5f * f5;
                            f4 = f5 + f6;
                            if (!(r8 == null || (r0 = r8.A0I) == null)) {
                                f13 = C39814AAl.A00(r0, f);
                            }
                            return f12 + f3 + Math.max(f4, f13);
                        }
                        f5 = f * f9;
                        f7 = -0.01f;
                    }
                    f6 = f7 * f;
                    f4 = f5 + f6;
                    f13 = C39814AAl.A00(r0, f);
                    return f12 + f3 + Math.max(f4, f13);
                }
                float f14 = f * f10;
                f4 = f14 + f14;
                f13 = C39814AAl.A00(r0, f);
                return f12 + f3 + Math.max(f4, f13);
            }
            f4 = f * f8;
            f13 = C39814AAl.A00(r0, f);
            return f12 + f3 + Math.max(f4, f13);
        }
        f4 = 0.0f;
        f13 = C39814AAl.A00(r0, f);
        return f12 + f3 + Math.max(f4, f13);
    }
}
