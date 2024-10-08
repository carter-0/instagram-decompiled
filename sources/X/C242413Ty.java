package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.TypedValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* renamed from: X.3Ty  reason: invalid class name and case insensitive filesystem */
public final class C242413Ty {
    public int A00 = -1;
    public int A01 = 0;
    public Typeface A02;
    public VXS A03;
    public VXS A04;
    public VXS A05;
    public VXS A06;
    public VXS A07;
    public VXS A08;
    public VXS A09;
    public boolean A0A;
    public final TextView A0B;
    public final AnonymousClass3Tz A0C;

    private void A01(Context context, 2Yi r14) {
        String string;
        Typeface create;
        Typeface A032;
        int i = this.A01;
        TypedArray typedArray = r14.A02;
        this.A01 = typedArray.getInt(2, i);
        boolean z = false;
        int i2 = typedArray.getInt(11, -1);
        this.A00 = i2;
        if (i2 != -1) {
            this.A01 &= 2;
        }
        if (typedArray.hasValue(10) || typedArray.hasValue(12)) {
            this.A02 = null;
            int i3 = 10;
            if (typedArray.hasValue(12)) {
                i3 = 12;
            }
            int i4 = this.A00;
            int i5 = this.A01;
            if (!context.isRestricted()) {
                AnonymousClass3U0 r7 = new AnonymousClass3U0(this, new WeakReference(this.A0B), i4, i5);
                try {
                    int i6 = this.A01;
                    int resourceId = typedArray.getResourceId(i3, 0);
                    if (resourceId != 0) {
                        TypedValue typedValue = r14.A00;
                        if (typedValue == null) {
                            typedValue = new TypedValue();
                            r14.A00 = typedValue;
                        }
                        Context context2 = r14.A01;
                        if (!context2.isRestricted() && (A032 = AnonymousClass3U3.A03(context2, typedValue, r7, resourceId, i6, true, false)) != null) {
                            if (this.A00 != -1) {
                                Typeface create2 = Typeface.create(A032, 0);
                                int i7 = this.A00;
                                boolean z2 = false;
                                if ((this.A01 & 2) != 0) {
                                    z2 = true;
                                }
                                A032 = Typeface.create(create2, i7, z2);
                            }
                            this.A02 = A032;
                        }
                    }
                    boolean z3 = false;
                    if (this.A02 == null) {
                        z3 = true;
                    }
                    this.A0A = z3;
                } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
                }
            }
            if (this.A02 == null && (string = typedArray.getString(i3)) != null) {
                if (this.A00 != -1) {
                    Typeface create3 = Typeface.create(string, 0);
                    int i8 = this.A00;
                    if ((this.A01 & 2) != 0) {
                        z = true;
                    }
                    create = Typeface.create(create3, i8, z);
                } else {
                    create = Typeface.create(string, this.A01);
                }
            } else {
                return;
            }
        } else if (typedArray.hasValue(1)) {
            this.A0A = false;
            int i9 = typedArray.getInt(1, 1);
            if (i9 == 1) {
                create = Typeface.SANS_SERIF;
            } else if (i9 == 2) {
                create = Typeface.SERIF;
            } else if (i9 == 3) {
                create = Typeface.MONOSPACE;
            } else {
                return;
            }
        } else {
            return;
        }
        this.A02 = create;
    }

    private void A02(Drawable drawable, VXS vxs) {
        if (drawable != null && vxs != null) {
            2X8.A03(drawable, vxs, this.A0B.getDrawableState());
        }
    }

    public static final void A03(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        if (Build.VERSION.SDK_INT < 30 && inputConnection != null) {
            05P.A00(editorInfo, textView.getText());
        }
    }

    public final void A04() {
        if (!(this.A05 == null && this.A09 == null && this.A06 == null && this.A03 == null)) {
            Drawable[] compoundDrawables = this.A0B.getCompoundDrawables();
            A02(compoundDrawables[0], this.A05);
            A02(compoundDrawables[1], this.A09);
            A02(compoundDrawables[2], this.A06);
            A02(compoundDrawables[3], this.A03);
        }
        if (this.A07 != null || this.A04 != null) {
            Drawable[] compoundDrawablesRelative = this.A0B.getCompoundDrawablesRelative();
            A02(compoundDrawablesRelative[0], this.A07);
            A02(compoundDrawablesRelative[2], this.A04);
        }
    }

    public final void A05(Context context, int i) {
        String string;
        2Yi r4 = new 2Yi(context, context.obtainStyledAttributes(i, AnonymousClass2Z3.A0N));
        TypedArray typedArray = r4.A02;
        if (typedArray.hasValue(14)) {
            this.A0B.setAllCaps(typedArray.getBoolean(14, false));
        }
        if (typedArray.hasValue(0) && typedArray.getDimensionPixelSize(0, -1) == 0) {
            this.A0B.setTextSize(0, 0.0f);
        }
        A01(context, r4);
        if (typedArray.hasValue(13) && (string = typedArray.getString(13)) != null) {
            this.A0B.setFontVariationSettings(string);
        }
        typedArray.recycle();
        Typeface typeface = this.A02;
        if (typeface != null) {
            this.A0B.setTypeface(typeface, this.A01);
        }
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [X.VXS, java.lang.Object] */
    public final void A06(ColorStateList colorStateList) {
        VXS vxs = this.A08;
        VXS vxs2 = vxs;
        if (vxs == null) {
            ? obj = new Object();
            this.A08 = obj;
            vxs2 = obj;
        }
        vxs2.A00 = colorStateList;
        boolean z = false;
        if (colorStateList != null) {
            z = true;
        }
        vxs2.A02 = z;
        this.A05 = vxs2;
        this.A09 = vxs2;
        this.A06 = vxs2;
        this.A03 = vxs2;
        this.A07 = vxs2;
        this.A04 = vxs2;
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [X.VXS, java.lang.Object] */
    public final void A07(PorterDuff.Mode mode) {
        VXS vxs = this.A08;
        VXS vxs2 = vxs;
        if (vxs == null) {
            ? obj = new Object();
            this.A08 = obj;
            vxs2 = obj;
        }
        vxs2.A01 = mode;
        boolean z = false;
        if (mode != null) {
            z = true;
        }
        vxs2.A03 = z;
        this.A05 = vxs2;
        this.A09 = vxs2;
        this.A06 = vxs2;
        this.A03 = vxs2;
        this.A07 = vxs2;
        this.A04 = vxs2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:123:0x028b  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x028e  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00dd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A08(android.util.AttributeSet r27, int r28) {
        /*
            r26 = this;
            r1 = r26
            android.widget.TextView r7 = r1.A0B
            android.content.Context r8 = r7.getContext()
            X.2X7 r6 = X.AnonymousClass2X7.A01()
            int[] r3 = X.AnonymousClass2Z3.A07
            r5 = 0
            r25 = r27
            r2 = r28
            r0 = r25
            X.2Yi r0 = X.2Yi.A00(r8, r0, r3, r2, r5)
            android.content.res.TypedArray r10 = r0.A02
            r15 = 0
            r16 = r8
            r17 = r10
            r18 = r25
            r19 = r7
            r20 = r3
            r21 = r2
            r22 = r5
            X.03v.A06(r16, r17, r18, r19, r20, r21, r22)
            r4 = -1
            int r3 = r10.getResourceId(r5, r4)
            r9 = 3
            boolean r0 = r10.hasValue(r9)
            if (r0 == 0) goto L_0x0043
            int r0 = r10.getResourceId(r9, r5)
            X.VXS r0 = A00(r8, r6, r0)
            r1.A05 = r0
        L_0x0043:
            r9 = 1
            boolean r0 = r10.hasValue(r9)
            if (r0 == 0) goto L_0x0054
            int r0 = r10.getResourceId(r9, r5)
            X.VXS r0 = A00(r8, r6, r0)
            r1.A09 = r0
        L_0x0054:
            r9 = 4
            boolean r0 = r10.hasValue(r9)
            if (r0 == 0) goto L_0x0065
            int r0 = r10.getResourceId(r9, r5)
            X.VXS r0 = A00(r8, r6, r0)
            r1.A06 = r0
        L_0x0065:
            r9 = 2
            boolean r0 = r10.hasValue(r9)
            if (r0 == 0) goto L_0x0076
            int r0 = r10.getResourceId(r9, r5)
            X.VXS r0 = A00(r8, r6, r0)
            r1.A03 = r0
        L_0x0076:
            r22 = 5
            r0 = r22
            boolean r0 = r10.hasValue(r0)
            if (r0 == 0) goto L_0x008c
            r0 = r22
            int r0 = r10.getResourceId(r0, r5)
            X.VXS r0 = A00(r8, r6, r0)
            r1.A07 = r0
        L_0x008c:
            r9 = 6
            boolean r0 = r10.hasValue(r9)
            if (r0 == 0) goto L_0x009d
            int r0 = r10.getResourceId(r9, r5)
            X.VXS r0 = A00(r8, r6, r0)
            r1.A04 = r0
        L_0x009d:
            r10.recycle()
            android.text.method.TransformationMethod r0 = r7.getTransformationMethod()
            boolean r11 = r0 instanceof android.text.method.PasswordTransformationMethod
            if (r3 == r4) goto L_0x0294
            int[] r0 = X.AnonymousClass2Z3.A0N
            android.content.res.TypedArray r0 = r8.obtainStyledAttributes(r3, r0)
            X.2Yi r12 = new X.2Yi
            r12.<init>(r8, r0)
            if (r11 != 0) goto L_0x0291
            r9 = 14
            android.content.res.TypedArray r3 = r12.A02
            boolean r0 = r3.hasValue(r9)
            if (r0 == 0) goto L_0x0291
            boolean r10 = r3.getBoolean(r9, r5)
            r15 = 1
        L_0x00c4:
            r1.A01(r8, r12)
            r3 = 15
            android.content.res.TypedArray r12 = r12.A02
            boolean r0 = r12.hasValue(r3)
            if (r0 == 0) goto L_0x028e
            java.lang.String r14 = r12.getString(r3)
        L_0x00d5:
            r3 = 13
            boolean r0 = r12.hasValue(r3)
            if (r0 == 0) goto L_0x028b
            java.lang.String r9 = r12.getString(r3)
        L_0x00e1:
            r12.recycle()
        L_0x00e4:
            int[] r3 = X.AnonymousClass2Z3.A0N
            r0 = r25
            X.2Yi r12 = X.2Yi.A00(r8, r0, r3, r2, r5)
            if (r11 != 0) goto L_0x00fd
            r13 = 14
            android.content.res.TypedArray r3 = r12.A02
            boolean r0 = r3.hasValue(r13)
            if (r0 == 0) goto L_0x00fd
            boolean r10 = r3.getBoolean(r13, r5)
            r15 = 1
        L_0x00fd:
            r21 = 15
            android.content.res.TypedArray r3 = r12.A02
            r0 = r21
            boolean r0 = r3.hasValue(r0)
            if (r0 == 0) goto L_0x010f
            r0 = r21
            java.lang.String r14 = r3.getString(r0)
        L_0x010f:
            r20 = 13
            r0 = r20
            boolean r0 = r3.hasValue(r0)
            if (r0 == 0) goto L_0x011f
            r0 = r20
            java.lang.String r9 = r3.getString(r0)
        L_0x011f:
            boolean r0 = r3.hasValue(r5)
            if (r0 == 0) goto L_0x012f
            int r0 = r3.getDimensionPixelSize(r5, r4)
            if (r0 != 0) goto L_0x012f
            r0 = 0
            r7.setTextSize(r5, r0)
        L_0x012f:
            r1.A01(r8, r12)
            r3.recycle()
            if (r11 != 0) goto L_0x013c
            if (r15 == 0) goto L_0x013c
            r7.setAllCaps(r10)
        L_0x013c:
            android.graphics.Typeface r3 = r1.A02
            if (r3 == 0) goto L_0x0149
            int r0 = r1.A00
            if (r0 != r4) goto L_0x0286
            int r0 = r1.A01
            r7.setTypeface(r3, r0)
        L_0x0149:
            if (r9 == 0) goto L_0x014e
            r7.setFontVariationSettings(r9)
        L_0x014e:
            if (r14 == 0) goto L_0x0157
            android.os.LocaleList r0 = android.os.LocaleList.forLanguageTags(r14)
            r7.setTextLocales(r0)
        L_0x0157:
            X.3Tz r10 = r1.A0C
            android.content.Context r0 = r10.A06
            r24 = r0
            int[] r19 = X.AnonymousClass2Z3.A08
            r3 = r0
            r1 = r25
            r0 = r19
            android.content.res.TypedArray r13 = r3.obtainStyledAttributes(r1, r0, r2, r5)
            android.widget.TextView r0 = r10.A07
            r23 = r0
            android.content.Context r12 = r23.getContext()
            r14 = r1
            r15 = r0
            r16 = r19
            r17 = r2
            r18 = r5
            X.03v.A06(r12, r13, r14, r15, r16, r17, r18)
            r0 = r22
            boolean r0 = r13.hasValue(r0)
            if (r0 == 0) goto L_0x018b
            r0 = r22
            int r0 = r13.getInt(r0, r5)
            r10.A03 = r0
        L_0x018b:
            r1 = 4
            boolean r0 = r13.hasValue(r1)
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r0 == 0) goto L_0x0282
            float r12 = r13.getDimension(r1, r3)
        L_0x0198:
            r9 = 2
            boolean r0 = r13.hasValue(r9)
            if (r0 == 0) goto L_0x027e
            float r11 = r13.getDimension(r9, r3)
        L_0x01a3:
            r2 = 1
            boolean r0 = r13.hasValue(r2)
            if (r0 == 0) goto L_0x027a
            float r1 = r13.getDimension(r2, r3)
        L_0x01ae:
            r18 = 3
            r0 = r18
            boolean r0 = r13.hasValue(r0)
            if (r0 == 0) goto L_0x0200
            r0 = r18
            int r14 = r13.getResourceId(r0, r5)
            if (r14 <= 0) goto L_0x0200
            android.content.res.Resources r0 = r13.getResources()
            android.content.res.TypedArray r17 = r0.obtainTypedArray(r14)
            int r14 = r17.length()
            int[] r0 = new int[r14]
            r16 = r0
            if (r14 <= 0) goto L_0x01fd
            r15 = 0
        L_0x01d3:
            r0 = r17
            int r0 = r0.getDimensionPixelSize(r15, r4)
            r16[r15] = r0
            int r15 = r15 + 1
            if (r15 < r14) goto L_0x01d3
            int[] r15 = X.AnonymousClass3Tz.A00(r16)
            r10.A05 = r15
            int r14 = r15.length
            r0 = 0
            if (r14 <= 0) goto L_0x01ea
            r0 = 1
        L_0x01ea:
            r10.A04 = r0
            if (r0 == 0) goto L_0x01fd
            r10.A03 = r2
            r0 = r15[r5]
            float r0 = (float) r0
            r10.A01 = r0
            int r14 = r14 - r2
            r0 = r15[r14]
            float r0 = (float) r0
            r10.A00 = r0
            r10.A02 = r3
        L_0x01fd:
            r17.recycle()
        L_0x0200:
            r13.recycle()
            r0 = r23
            boolean r0 = r0 instanceof X.AnonymousClass3U5
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x02d5
            int r14 = r10.A03
            if (r14 != r2) goto L_0x02de
            boolean r0 = r10.A04
            if (r0 != 0) goto L_0x0250
            android.content.res.Resources r0 = r24.getResources()
            android.util.DisplayMetrics r13 = r0.getDisplayMetrics()
            int r0 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x0225
            r0 = 1094713344(0x41400000, float:12.0)
            float r11 = android.util.TypedValue.applyDimension(r9, r0, r13)
        L_0x0225:
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x022f
            r0 = 1121976320(0x42e00000, float:112.0)
            float r1 = android.util.TypedValue.applyDimension(r9, r0, r13)
        L_0x022f:
            int r0 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x0235
            r12 = 1065353216(0x3f800000, float:1.0)
        L_0x0235:
            java.lang.String r13 = "px) is less or equal to (0px)"
            r14 = 0
            int r0 = (r11 > r14 ? 1 : (r11 == r14 ? 0 : -1))
            if (r0 <= 0) goto L_0x02c9
            int r0 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r0 <= 0) goto L_0x02a5
            int r0 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r0 <= 0) goto L_0x0299
            r10.A03 = r2
            r14 = 1
            r10.A01 = r11
            r10.A00 = r1
            r10.A02 = r12
            r10.A04 = r5
            r0 = 0
        L_0x0250:
            r13 = 0
            if (r14 != r2) goto L_0x02de
            if (r0 == 0) goto L_0x025a
            int[] r0 = r10.A05
            int r0 = r0.length
            if (r0 != 0) goto L_0x02de
        L_0x025a:
            float r0 = r10.A00
            float r12 = r10.A01
            float r0 = r0 - r12
            float r11 = r10.A02
            float r0 = r0 / r11
            double r0 = (double) r0
            double r0 = java.lang.Math.floor(r0)
            int r14 = (int) r0
            int r14 = r14 + 1
            int[] r1 = new int[r14]
        L_0x026c:
            if (r13 >= r14) goto L_0x02d8
            float r0 = (float) r13
            float r0 = r0 * r11
            float r0 = r0 + r12
            int r0 = java.lang.Math.round(r0)
            r1[r13] = r0
            int r13 = r13 + 1
            goto L_0x026c
        L_0x027a:
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            goto L_0x01ae
        L_0x027e:
            r11 = -1082130432(0xffffffffbf800000, float:-1.0)
            goto L_0x01a3
        L_0x0282:
            r12 = -1082130432(0xffffffffbf800000, float:-1.0)
            goto L_0x0198
        L_0x0286:
            r7.setTypeface(r3)
            goto L_0x0149
        L_0x028b:
            r9 = 0
            goto L_0x00e1
        L_0x028e:
            r14 = 0
            goto L_0x00d5
        L_0x0291:
            r10 = 0
            goto L_0x00c4
        L_0x0294:
            r9 = 0
            r10 = 0
            r14 = 0
            goto L_0x00e4
        L_0x0299:
            java.lang.String r0 = "The auto-size step granularity ("
            java.lang.String r1 = X.002.A0Z(r0, r13, r12)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x02a5:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "Maximum auto-size text size ("
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = "px) is less or equal to minimum auto-size text size ("
            r2.append(r0)
            r2.append(r11)
            java.lang.String r0 = "px)"
            r2.append(r0)
            java.lang.String r1 = r2.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x02c9:
            java.lang.String r0 = "Minimum auto-size text size ("
            java.lang.String r1 = X.002.A0Z(r0, r13, r11)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x02d5:
            r10.A03 = r5
            goto L_0x02de
        L_0x02d8:
            int[] r0 = X.AnonymousClass3Tz.A00(r1)
            r10.A05 = r0
        L_0x02de:
            int r0 = r10.A03
            if (r0 == 0) goto L_0x0305
            int[] r1 = r10.A05
            int r0 = r1.length
            if (r0 <= 0) goto L_0x0305
            int r0 = r7.getAutoSizeStepGranularity()
            float r0 = (float) r0
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x0431
            float r0 = r10.A01
            int r11 = java.lang.Math.round(r0)
            float r0 = r10.A00
            int r1 = java.lang.Math.round(r0)
            float r0 = r10.A02
            int r0 = java.lang.Math.round(r0)
            r7.setAutoSizeTextTypeUniformWithConfiguration(r11, r1, r0, r5)
        L_0x0305:
            r1 = r25
            r0 = r19
            android.content.res.TypedArray r0 = r8.obtainStyledAttributes(r1, r0)
            X.2Yi r15 = new X.2Yi
            r15.<init>(r8, r0)
            r0 = 8
            android.content.res.TypedArray r14 = r15.A02
            int r0 = r14.getResourceId(r0, r4)
            if (r0 == r4) goto L_0x042e
            android.graphics.drawable.Drawable r13 = r6.A04(r8, r0)
        L_0x0320:
            r0 = r20
            int r0 = r14.getResourceId(r0, r4)
            if (r0 == r4) goto L_0x042b
            android.graphics.drawable.Drawable r12 = r6.A04(r8, r0)
        L_0x032c:
            r0 = 9
            int r0 = r14.getResourceId(r0, r4)
            if (r0 == r4) goto L_0x0428
            android.graphics.drawable.Drawable r11 = r6.A04(r8, r0)
        L_0x0338:
            r0 = 6
            int r0 = r14.getResourceId(r0, r4)
            if (r0 == r4) goto L_0x0425
            android.graphics.drawable.Drawable r10 = r6.A04(r8, r0)
        L_0x0343:
            r0 = 10
            int r0 = r14.getResourceId(r0, r4)
            if (r0 == r4) goto L_0x0422
            android.graphics.drawable.Drawable r1 = r6.A04(r8, r0)
        L_0x034f:
            r0 = 7
            int r0 = r14.getResourceId(r0, r4)
            if (r0 == r4) goto L_0x041f
            android.graphics.drawable.Drawable r6 = r6.A04(r8, r0)
        L_0x035a:
            if (r1 != 0) goto L_0x03fb
            if (r6 != 0) goto L_0x03fb
            if (r13 != 0) goto L_0x0366
            if (r12 != 0) goto L_0x0366
            if (r11 != 0) goto L_0x0366
            if (r10 == 0) goto L_0x0389
        L_0x0366:
            android.graphics.drawable.Drawable[] r6 = r7.getCompoundDrawablesRelative()
            r1 = r6[r5]
            if (r1 != 0) goto L_0x0410
            r0 = r6[r9]
            if (r0 != 0) goto L_0x0410
            android.graphics.drawable.Drawable[] r0 = r7.getCompoundDrawables()
            if (r13 != 0) goto L_0x037a
            r13 = r0[r5]
        L_0x037a:
            if (r12 != 0) goto L_0x037e
            r12 = r0[r2]
        L_0x037e:
            if (r11 != 0) goto L_0x0382
            r11 = r0[r9]
        L_0x0382:
            if (r10 != 0) goto L_0x0386
            r10 = r0[r18]
        L_0x0386:
            r7.setCompoundDrawablesWithIntrinsicBounds(r13, r12, r11, r10)
        L_0x0389:
            r1 = 11
            boolean r0 = r14.hasValue(r1)
            if (r0 == 0) goto L_0x0398
            android.content.res.ColorStateList r0 = r15.A01(r1)
            r7.setCompoundDrawableTintList(r0)
        L_0x0398:
            r1 = 12
            boolean r0 = r14.hasValue(r1)
            if (r0 == 0) goto L_0x03ac
            int r1 = r14.getInt(r1, r4)
            r0 = 0
            android.graphics.PorterDuff$Mode r0 = X.AnonymousClass3NX.A00(r0, r1)
            r7.setCompoundDrawableTintMode(r0)
        L_0x03ac:
            r0 = r21
            int r8 = r14.getDimensionPixelSize(r0, r4)
            r0 = 18
            int r6 = r14.getDimensionPixelSize(r0, r4)
            r5 = 19
            boolean r0 = r14.hasValue(r5)
            if (r0 == 0) goto L_0x03f7
            android.util.TypedValue r2 = r14.peekValue(r5)
            if (r2 == 0) goto L_0x03f1
            int r1 = r2.type
            r0 = r22
            if (r1 != r0) goto L_0x03f1
            int r1 = r2.data
            int r0 = r1 >> 0
            r2 = r0 & 15
            float r1 = android.util.TypedValue.complexToFloat(r1)
        L_0x03d6:
            r14.recycle()
            if (r8 == r4) goto L_0x03e1
            X.02V.A00(r8)
            r7.setFirstBaselineToTopHeight(r8)
        L_0x03e1:
            if (r6 == r4) goto L_0x03e6
            X.W0V.A02(r7, r6)
        L_0x03e6:
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x03f0
            if (r2 != r4) goto L_0x0436
            int r0 = (int) r1
            X.W0V.A03(r7, r0)
        L_0x03f0:
            return
        L_0x03f1:
            int r0 = r14.getDimensionPixelSize(r5, r4)
            float r1 = (float) r0
            goto L_0x03f9
        L_0x03f7:
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
        L_0x03f9:
            r2 = -1
            goto L_0x03d6
        L_0x03fb:
            android.graphics.drawable.Drawable[] r0 = r7.getCompoundDrawablesRelative()
            if (r1 != 0) goto L_0x0403
            r1 = r0[r5]
        L_0x0403:
            if (r12 != 0) goto L_0x0407
            r12 = r0[r2]
        L_0x0407:
            if (r6 != 0) goto L_0x040b
            r6 = r0[r9]
        L_0x040b:
            if (r10 != 0) goto L_0x041a
            r10 = r0[r18]
            goto L_0x041a
        L_0x0410:
            if (r12 != 0) goto L_0x0414
            r12 = r6[r2]
        L_0x0414:
            if (r10 != 0) goto L_0x0418
            r10 = r6[r18]
        L_0x0418:
            r6 = r6[r9]
        L_0x041a:
            r7.setCompoundDrawablesRelativeWithIntrinsicBounds(r1, r12, r6, r10)
            goto L_0x0389
        L_0x041f:
            r6 = 0
            goto L_0x035a
        L_0x0422:
            r1 = 0
            goto L_0x034f
        L_0x0425:
            r10 = 0
            goto L_0x0343
        L_0x0428:
            r11 = 0
            goto L_0x0338
        L_0x042b:
            r12 = 0
            goto L_0x032c
        L_0x042e:
            r13 = 0
            goto L_0x0320
        L_0x0431:
            r7.setAutoSizeTextTypeUniformWithPresetSizes(r1, r5)
            goto L_0x0305
        L_0x0436:
            X.W0V.A01(r7, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C242413Ty.A08(android.util.AttributeSet, int):void");
    }

    public C242413Ty(TextView textView) {
        this.A0B = textView;
        this.A0C = new AnonymousClass3Tz(textView);
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [X.VXS, java.lang.Object] */
    public static VXS A00(Context context, AnonymousClass2X7 r1, int i) {
        ColorStateList A032 = r1.A03(context, i);
        if (A032 == null) {
            return null;
        }
        ? obj = new Object();
        obj.A02 = true;
        obj.A00 = A032;
        return obj;
    }
}
