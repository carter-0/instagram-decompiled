package X;

import android.content.Context;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.io.IOException;

/* renamed from: X.6Sr  reason: invalid class name and case insensitive filesystem */
public abstract class C308096Sr implements C253183qL {
    public final long A00;

    public final /* synthetic */ String getDescription() {
        return V6I.A00(this);
    }

    public Object A00(Context context, View view, Object obj, Object obj2) {
        int i;
        Paint paint;
        C273704n3 r14 = (C273704n3) view;
        C308026Sk r15 = (C308026Sk) obj;
        if (r15.A06 != null) {
            try {
                C307786Rm r7 = r15.A0B;
                r7.getClass();
                C299085uY r142 = (C299085uY) r14;
                C276544tV r6 = r15.A06;
                0qQ.A0B(r142, 1);
                0qQ.A0B(r6, 2);
                C308076Sp r5 = r15.A07;
                0qQ.A06(r5);
                r5.A00 = r142.getOutlineAmbientShadowColor();
                r5.A01 = r142.getOutlineSpotShadowColor();
                String A0K = r6.A0K(48);
                if (A0K != null) {
                    float A01 = AnonymousClass6Su.A01(A0K);
                    if (A01 != 0.0f) {
                        r142.setElevation(A01);
                        r142.setOutlineProvider(new C14650Tzw(r6));
                        if (r6.A07(68) != null) {
                            int i2 = r5.A00;
                            C276544tV A07 = r6.A07(68);
                            if (A07 != null) {
                                i2 = AnonymousClass6TP.A00(r7, A07, i2);
                            }
                            r142.setOutlineAmbientShadowColor(i2);
                        }
                        if (r6.A07(69) != null) {
                            int i3 = r5.A01;
                            C276544tV A072 = r6.A07(69);
                            if (A072 != null) {
                                i3 = AnonymousClass6TP.A00(r7, A072, i3);
                            }
                            r142.setOutlineSpotShadowColor(i3);
                        }
                    }
                }
                String A0K2 = r6.A0K(46);
                float f = 0.0f;
                if (A0K2 != null) {
                    f = AnonymousClass6Su.A01(A0K2);
                }
                int i4 = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
                if (r6.A0R(43, false)) {
                    if (i4 != 0) {
                        r142.setOutlineProvider(new C299105ua(r6, f));
                        String A0K3 = r6.A0K(40);
                        float f2 = 0.0f;
                        if (A0K3 != null) {
                            f2 = AnonymousClass6Su.A01(A0K3);
                        }
                        int A002 = C308156Sy.A00(r6.A0N(56), 0);
                        if (f2 != 0.0f || !C308156Sy.A02(A002)) {
                            C299095uZ r52 = r142.A00;
                            r52.A04 = true;
                            r52.A0B.setLayerType(2, (Paint) null);
                            C276544tV A073 = r6.A07(45);
                            String A0K4 = r6.A0K(44);
                            if (A0K4 != null) {
                                i = AnonymousClass6Su.A03(A0K4);
                            } else {
                                i = 0;
                            }
                            if (A073 != null) {
                                try {
                                    String A0K5 = A073.A0K(35);
                                    if (A0K5 == null || AnonymousClass6Su.A03(A0K5) == 0) {
                                        String A0F = A073.A0F();
                                        if (A0F != null) {
                                            if (AnonymousClass6Su.A03(A0F) == 0) {
                                            }
                                        }
                                    }
                                } catch (C258053yO unused) {
                                    1Kn.A02("ThemedColorUtils", "Error parsing themed color");
                                }
                                i = AnonymousClass6TP.A00(r7, A073, 0);
                            }
                            int A003 = C308136Sw.A00(r7, r6);
                            float[] A02 = C308136Sw.A02(r6.A0N(62));
                            String A0K6 = r6.A0K(63);
                            float f3 = 0.0f;
                            if (A0K6 != null) {
                                f3 = AnonymousClass6Su.A01(A0K6);
                            }
                            r52.A03 = A002;
                            r52.A02 = f;
                            Paint paint2 = r52.A06;
                            paint2.setColor(i);
                            if (i == 0) {
                                paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                            }
                            if (f2 != 0.0f) {
                                paint = r52.A05;
                                paint.setColor(A003);
                            } else {
                                paint = r52.A05;
                                paint.setColor(0);
                            }
                            paint.setStyle(Paint.Style.STROKE);
                            paint.setStrokeWidth(f2);
                            if (f2 > 0.0f && A02 != null) {
                                paint.setPathEffect(new DashPathEffect(A02, f3));
                            }
                            Path path = r52.A08;
                            path.setFillType(Path.FillType.EVEN_ODD);
                            float f4 = f2 / 2.0f;
                            r52.A00 = f4;
                            r52.A01 = r52.A02 - f4;
                            path.reset();
                        } else {
                            r142.setClipToOutline(true);
                        }
                    }
                } else if (i4 != 0) {
                    r142.setOutlineProvider(new C299255up(r6));
                }
                Drawable drawable = r15.A04;
                Drawable drawable2 = r15.A03;
                if (drawable instanceof Animatable) {
                    ((Animatable) drawable).start();
                }
                if (drawable2 instanceof Animatable) {
                    ((Animatable) drawable2).start();
                    return null;
                }
            } catch (IOException e) {
                1Kn.A00((C307786Rm) null, "HostWithDecoratorRenderUnit", "Parse exception while binding Box Decoration", e);
            }
        }
        return null;
    }

    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.lang.Object[]} */
    /* JADX WARNING: type inference failed for: r7v0, types: [java.lang.Object, X.Vfg] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object ADM(android.content.Context r12, java.lang.Object r13, java.lang.Object r14, java.lang.Object r15) {
        /*
            r11 = this;
            android.view.View r13 = (android.view.View) r13
            r6 = 0
            X.0qQ.A0B(r12, r6)
            r8 = 1
            X.0qQ.A0B(r13, r8)
            long r0 = r11.A00
            X.4tk r4 = X.C276674ti.A00()
            if (r4 != 0) goto L_0x0017
            java.lang.Object r10 = r11.A00(r12, r13, r14, r15)
        L_0x0016:
            return r10
        L_0x0017:
            X.Vfg r7 = new X.Vfg
            r7.<init>()
            java.lang.Object[] r2 = X.C276694tk.A00()
            r3 = r2[r8]
            java.lang.Object[] r2 = X.C276694tk.A00()
            r2[r8] = r7
            boolean r2 = r3 instanceof X.C17769Vfg     // Catch:{ all -> 0x006d }
            r5 = 0
            r9 = r3
            if (r2 != 0) goto L_0x002f
            r9 = r5
        L_0x002f:
            X.Vfg r9 = (X.C17769Vfg) r9     // Catch:{ all -> 0x006d }
            java.lang.Object r10 = r11.A00(r12, r13, r14, r15)     // Catch:{ all -> 0x006d }
            java.util.LinkedHashSet r2 = r7.A00     // Catch:{ all -> 0x006d }
            if (r2 == 0) goto L_0x003e
            boolean r2 = r2.isEmpty()     // Catch:{ all -> 0x006d }
            goto L_0x003f
        L_0x003e:
            r2 = 1
        L_0x003f:
            if (r2 != 0) goto L_0x0046
            if (r9 == 0) goto L_0x0046
            r9.A00(r0)     // Catch:{ all -> 0x006d }
        L_0x0046:
            java.lang.Object[] r2 = X.C276694tk.A00()
            r2[r8] = r3
            java.util.LinkedHashSet r2 = r7.A00
            if (r2 == 0) goto L_0x006b
            boolean r2 = r2.isEmpty()
        L_0x0054:
            if (r2 != 0) goto L_0x0016
            X.VjJ r4 = r4.A03
            java.util.LinkedHashSet r2 = r7.A00
            if (r2 == 0) goto L_0x0069
            long[] r3 = X.00k.A0y(r2)
        L_0x0060:
            X.VVU r2 = new X.VVU
            r2.<init>(r5, r5, r3)
            r4.A01(r2, r0, r6)
            return r10
        L_0x0069:
            r3 = 0
            goto L_0x0060
        L_0x006b:
            r2 = 1
            goto L_0x0054
        L_0x006d:
            r1 = move-exception
            java.lang.Object[] r0 = X.C276694tk.A00()
            r0[r8] = r3
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C308096Sr.ADM(android.content.Context, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public C308096Sr(long j) {
        this.A00 = C308106Ss.A00(getClass(), j);
    }

    public boolean A01(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C276674ti.A00() == null) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ Class CAe() {
        return getClass();
    }

    public final boolean Ete(Object obj, Object obj2, Object obj3, Object obj4) {
        Object A01;
        C276694tk A002 = C276674ti.A00();
        Object obj5 = obj;
        Object obj6 = obj2;
        Object obj7 = obj3;
        Object obj8 = obj4;
        if (A002 == null) {
            A01 = Boolean.valueOf(A01(obj, obj2, obj3, obj4));
        } else {
            A01 = C276674ti.A01(C276704tl.UNTRACKED, A002, new C58218IoM(13, obj7, obj5, this, obj8, obj6));
        }
        if (((Boolean) A01).booleanValue()) {
            return true;
        }
        long j = this.A00;
        if (C16921VAy.A00(j)) {
            return true;
        }
        if (C276674ti.A00() == null) {
            return false;
        }
        Object obj9 = C276694tk.A00()[1];
        if (obj9 == null) {
            obj9 = null;
        }
        C17769Vfg vfg = (C17769Vfg) obj9;
        if (vfg == null) {
            return false;
        }
        vfg.A00(j);
        return false;
    }
}
