package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Spannable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.MovementMethod;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.View;
import android.widget.EditText;
import com.facebook.litho.annotations.Comparable;
import com.facebook.litho.annotations.Prop;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.Gxh  reason: case insensitive filesystem */
public final class C53999Gxh extends C251253mo {
    @Prop(optional = true, resType = C54606HKp.A0A)
    @Comparable(type = 3)
    public int A00 = 8388627;
    @Prop(optional = true, resType = C54606HKp.A0A)
    @Comparable(type = 3)
    public int A01 = 1;
    @Prop(optional = true, resType = C54606HKp.A0A)
    @Comparable(type = 3)
    public int A02 = Integer.MAX_VALUE;
    @Prop(optional = true, resType = C54606HKp.A0A)
    @Comparable(type = 3)
    public int A03 = 1;
    @Prop(optional = true, resType = C54606HKp.A0A)
    @Comparable(type = 3)
    public int A04 = 1;
    @Prop(optional = true, resType = C54606HKp.A05)
    @Comparable(type = 3)
    public int A05 = -1;
    @Prop(optional = true, resType = C54606HKp.A0A)
    @Comparable(type = 13)
    public ColorStateList A06 = C55421HhR.A00;
    @Prop(optional = true, resType = C54606HKp.A0A)
    @Comparable(type = 13)
    public ColorStateList A07 = C55421HhR.A01;
    @Prop(optional = true, resType = C54606HKp.A0A)
    @Comparable(type = 13)
    public Typeface A08 = C55421HhR.A03;
    @Prop(optional = true, resType = C54606HKp.A06)
    @Comparable(type = 13)
    public Drawable A09 = C55421HhR.A05;
    @Prop(optional = true, resType = C54606HKp.A0A)
    @Comparable(type = 13)
    public MovementMethod A0A = C55421HhR.A06;
    public 2Sg A0B;
    public 2Vh A0C;
    public 2Vh A0D;
    public 2Vh A0E;
    public 2Vh A0F;
    public 2Vh A0G;
    public 2Vh A0H;
    public 2Vh A0I;
    public 2Vh A0J;
    public 2Vh A0K;
    public 2Vh A0L;
    public 2Vh A0M;
    public 2Vh A0N;
    public 2Vh A0O;
    @Prop(optional = true, resType = C54606HKp.A0B)
    @Comparable(type = 13)
    public CharSequence A0P = "";
    @Prop(optional = true, resType = C54606HKp.A0B)
    @Comparable(type = 13)
    public CharSequence A0Q = "";
    @Prop(optional = true, resType = C54606HKp.A02)
    @Comparable(type = 13)
    public Integer A0R;
    @Prop(optional = true, resType = C54606HKp.A0A, varArg = "inputFilter")
    @Comparable(type = 5)
    public List A0S = Collections.emptyList();
    @Prop(optional = true, resType = C54606HKp.A0A, varArg = "textWatcher")
    @Comparable(type = 5)
    public List A0T = Collections.emptyList();
    @Prop(optional = true, resType = C54606HKp.A0A)
    @Comparable(type = 3)
    public boolean A0U = true;
    @Prop(optional = true, resType = C54606HKp.A0A)
    @Comparable(type = 3)
    public boolean A0V = false;

    public final boolean A0N() {
        return true;
    }

    public final boolean A0O() {
        return true;
    }

    public final boolean A0P() {
        return true;
    }

    public final boolean A11() {
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002f, code lost:
        if (r1.equals(r0) == false) goto L_0x0031;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A18(X.C251263mp r5, boolean r6) {
        /*
            r4 = this;
            r3 = 1
            if (r4 == r5) goto L_0x00f0
            r2 = 0
            if (r5 == 0) goto L_0x0031
            java.lang.Class r1 = r4.getClass()
            java.lang.Class r0 = r5.getClass()
            if (r1 != r0) goto L_0x0031
            X.Gxh r5 = (X.C53999Gxh) r5
            r0 = 0
            boolean r0 = java.util.Arrays.equals(r0, r0)
            if (r0 == 0) goto L_0x0031
            boolean r1 = r4.A0U
            boolean r0 = r5.A0U
            if (r1 != r0) goto L_0x0031
            int r1 = r4.A00
            int r0 = r5.A00
            if (r1 != r0) goto L_0x0031
            java.lang.Integer r1 = r4.A0R
            java.lang.Integer r0 = r5.A0R
            if (r1 == 0) goto L_0x0032
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0035
        L_0x0031:
            return r2
        L_0x0032:
            if (r0 == 0) goto L_0x0035
            return r2
        L_0x0035:
            java.lang.CharSequence r1 = r4.A0P
            java.lang.CharSequence r0 = r5.A0P
            if (r1 == 0) goto L_0x0042
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0045
            return r2
        L_0x0042:
            if (r0 == 0) goto L_0x0045
            return r2
        L_0x0045:
            android.content.res.ColorStateList r1 = r4.A06
            android.content.res.ColorStateList r0 = r5.A06
            if (r1 == 0) goto L_0x0052
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0055
            return r2
        L_0x0052:
            if (r0 == 0) goto L_0x0055
            return r2
        L_0x0055:
            java.lang.CharSequence r1 = r4.A0Q
            java.lang.CharSequence r0 = r5.A0Q
            if (r1 == 0) goto L_0x0062
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0065
            return r2
        L_0x0062:
            if (r0 == 0) goto L_0x0065
            return r2
        L_0x0065:
            android.graphics.drawable.Drawable r1 = r4.A09
            android.graphics.drawable.Drawable r0 = r5.A09
            if (r1 == 0) goto L_0x0072
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0075
            return r2
        L_0x0072:
            if (r0 == 0) goto L_0x0075
            return r2
        L_0x0075:
            java.util.List r1 = r4.A0S
            java.util.List r0 = r5.A0S
            if (r1 == 0) goto L_0x0082
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0085
            return r2
        L_0x0082:
            if (r0 == 0) goto L_0x0085
            return r2
        L_0x0085:
            int r1 = r4.A01
            int r0 = r5.A01
            if (r1 != r0) goto L_0x0031
            int r1 = r4.A02
            int r0 = r5.A02
            if (r1 != r0) goto L_0x0031
            int r1 = r4.A03
            int r0 = r5.A03
            if (r1 != r0) goto L_0x0031
            android.text.method.MovementMethod r1 = r4.A0A
            android.text.method.MovementMethod r0 = r5.A0A
            if (r1 == 0) goto L_0x00a4
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x00a7
            return r2
        L_0x00a4:
            if (r0 == 0) goto L_0x00a7
            return r2
        L_0x00a7:
            boolean r1 = r4.A0V
            boolean r0 = r5.A0V
            if (r1 != r0) goto L_0x0031
            r0 = 0
            int r0 = java.lang.Float.compare(r0, r0)
            if (r0 != 0) goto L_0x0031
            int r1 = r4.A04
            int r0 = r5.A04
            if (r1 != r0) goto L_0x0031
            android.content.res.ColorStateList r1 = r4.A07
            android.content.res.ColorStateList r0 = r5.A07
            if (r1 == 0) goto L_0x00c7
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x00ca
            return r2
        L_0x00c7:
            if (r0 == 0) goto L_0x00ca
            return r2
        L_0x00ca:
            int r1 = r4.A05
            int r0 = r5.A05
            if (r1 != r0) goto L_0x0031
            java.util.List r1 = r4.A0T
            java.util.List r0 = r5.A0T
            if (r1 == 0) goto L_0x00dd
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x00e0
            return r2
        L_0x00dd:
            if (r0 == 0) goto L_0x00e0
            return r2
        L_0x00e0:
            android.graphics.Typeface r1 = r4.A08
            android.graphics.Typeface r0 = r5.A08
            if (r1 == 0) goto L_0x00ed
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x00f0
            return r2
        L_0x00ed:
            if (r0 == 0) goto L_0x00f0
            return r2
        L_0x00f0:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C53999Gxh.A18(X.3mp, boolean):boolean");
    }

    public C53999Gxh() {
        super("TextInput");
    }

    public final Integer A0G() {
        return AnonymousClass05K.A0C;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.Ge1, android.widget.TextView, java.lang.Object, android.widget.TextView$OnEditorActionListener, android.widget.EditText] */
    public final Object A0H(Context context) {
        InputFilter[] inputFilterArr = C55421HhR.A09;
        ? editText = new EditText(context);
        editText.A00 = -1;
        editText.setOnEditorActionListener(editText);
        editText.setEditableFactory(new Editable.Factory());
        return editText;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:155:0x01ab, code lost:
        if (r9 == null) goto L_0x01ad;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A0T(X.C251263mp r60, X.C251263mp r61, X.2TB r62, X.2TB r63) {
        /*
            r59 = this;
            r2 = r62
            r13 = r63
            r14 = r61
            r15 = r60
            X.Gxh r15 = (X.C53999Gxh) r15
            X.Gxh r14 = (X.C53999Gxh) r14
            if (r15 != 0) goto L_0x039d
            r58 = 0
        L_0x0010:
            if (r14 != 0) goto L_0x0397
            r57 = 0
        L_0x0014:
            if (r15 != 0) goto L_0x0391
            r56 = 0
        L_0x0018:
            if (r14 != 0) goto L_0x038b
            r55 = 0
        L_0x001c:
            if (r15 != 0) goto L_0x0387
            r12 = 0
        L_0x001f:
            if (r14 != 0) goto L_0x0383
            r11 = 0
        L_0x0022:
            if (r15 != 0) goto L_0x037d
            r54 = 0
        L_0x0026:
            if (r14 != 0) goto L_0x0377
            r53 = 0
        L_0x002a:
            if (r15 != 0) goto L_0x0371
            r52 = 0
        L_0x002e:
            if (r14 != 0) goto L_0x036b
            r51 = 0
        L_0x0032:
            if (r15 != 0) goto L_0x0365
            r50 = 0
        L_0x0036:
            if (r14 != 0) goto L_0x035f
            r49 = 0
        L_0x003a:
            if (r15 != 0) goto L_0x0356
            r48 = 0
        L_0x003e:
            if (r14 != 0) goto L_0x034d
            r47 = 0
        L_0x0042:
            if (r15 != 0) goto L_0x0347
            r46 = 0
        L_0x0046:
            if (r14 != 0) goto L_0x0341
            r45 = 0
        L_0x004a:
            if (r15 != 0) goto L_0x033b
            r44 = 0
        L_0x004e:
            if (r14 != 0) goto L_0x0335
            r43 = 0
        L_0x0052:
            if (r15 != 0) goto L_0x032f
            r42 = 0
        L_0x0056:
            if (r14 != 0) goto L_0x0329
            r41 = 0
        L_0x005a:
            if (r15 != 0) goto L_0x0321
            r40 = 0
        L_0x005e:
            if (r14 != 0) goto L_0x0319
            r39 = 0
        L_0x0062:
            if (r15 != 0) goto L_0x0313
            r38 = 0
        L_0x0066:
            if (r14 != 0) goto L_0x030d
            r37 = 0
        L_0x006a:
            if (r15 != 0) goto L_0x0305
            r36 = 0
        L_0x006e:
            if (r14 != 0) goto L_0x02fd
            r35 = 0
        L_0x0072:
            if (r15 != 0) goto L_0x02f5
            r34 = 0
        L_0x0076:
            if (r14 != 0) goto L_0x02ed
            r33 = 0
        L_0x007a:
            if (r15 != 0) goto L_0x02e5
            r32 = 0
        L_0x007e:
            if (r14 != 0) goto L_0x02dd
            r31 = 0
        L_0x0082:
            if (r15 != 0) goto L_0x02d7
            r30 = 0
        L_0x0086:
            if (r14 != 0) goto L_0x02d1
            r29 = 0
        L_0x008a:
            if (r15 != 0) goto L_0x02c9
            r28 = 0
        L_0x008e:
            if (r14 != 0) goto L_0x02c1
            r27 = 0
        L_0x0092:
            if (r15 != 0) goto L_0x02bb
            r26 = 0
        L_0x0096:
            if (r14 != 0) goto L_0x02b5
            r25 = 0
        L_0x009a:
            if (r15 != 0) goto L_0x02af
            r24 = 0
        L_0x009e:
            if (r14 != 0) goto L_0x02a9
            r23 = 0
        L_0x00a2:
            r10 = 0
            if (r15 == 0) goto L_0x00a7
            java.util.List r10 = r15.A0S
        L_0x00a7:
            if (r14 != 0) goto L_0x02a5
            r9 = 0
        L_0x00aa:
            r22 = 0
            if (r15 == 0) goto L_0x00b4
            boolean r0 = r15.A0V
            java.lang.Boolean r22 = java.lang.Boolean.valueOf(r0)
        L_0x00b4:
            if (r14 != 0) goto L_0x029d
            r21 = 0
        L_0x00b8:
            if (r15 != 0) goto L_0x0295
            r20 = 0
        L_0x00bc:
            if (r14 != 0) goto L_0x028d
            r19 = 0
        L_0x00c0:
            if (r15 != 0) goto L_0x0285
            r18 = 0
        L_0x00c4:
            if (r14 != 0) goto L_0x027d
            r17 = 0
        L_0x00c8:
            if (r15 != 0) goto L_0x0277
            r8 = 0
        L_0x00cb:
            if (r14 != 0) goto L_0x0271
            r7 = 0
        L_0x00ce:
            if (r15 != 0) goto L_0x026d
            r6 = 0
        L_0x00d1:
            if (r14 != 0) goto L_0x0269
            r5 = 0
        L_0x00d4:
            r1 = 0
            if (r15 == 0) goto L_0x00dc
            r0 = r2
            X.Gxp r0 = (X.C54007Gxp) r0
            java.lang.Integer r1 = r0.A00
        L_0x00dc:
            if (r14 != 0) goto L_0x0262
            r0 = 0
        L_0x00df:
            if (r15 != 0) goto L_0x025b
            r4 = 0
        L_0x00e2:
            if (r14 != 0) goto L_0x0254
            r3 = 0
        L_0x00e5:
            if (r15 != 0) goto L_0x024e
            r2 = 0
        L_0x00e8:
            if (r14 != 0) goto L_0x0248
            r13 = 0
        L_0x00eb:
            android.text.InputFilter[] r14 = X.C55421HhR.A09
            boolean r0 = X.02S.A00(r1, r0)
            r16 = 1
            if (r0 == 0) goto L_0x01d1
            r1 = r58
            r0 = r57
            boolean r0 = X.02S.A00(r1, r0)
            if (r0 == 0) goto L_0x01d1
            r1 = r56
            r0 = r55
            boolean r0 = X.02S.A00(r1, r0)
            if (r0 == 0) goto L_0x01d1
            r1 = r54
            r0 = r53
            boolean r0 = X.02S.A00(r1, r0)
            if (r0 == 0) goto L_0x01d1
            r1 = r52
            r0 = r51
            boolean r0 = X.02S.A00(r1, r0)
            if (r0 == 0) goto L_0x01d1
            r1 = r50
            r0 = r49
            boolean r0 = X.02S.A00(r1, r0)
            if (r0 == 0) goto L_0x01d1
            r1 = r48
            r0 = r47
            boolean r0 = X.02S.A00(r1, r0)
            if (r0 == 0) goto L_0x01d1
            r1 = r46
            r0 = r45
            boolean r0 = X.02S.A00(r1, r0)
            if (r0 == 0) goto L_0x01d1
            r1 = r44
            r0 = r43
            boolean r0 = X.02S.A00(r1, r0)
            if (r0 == 0) goto L_0x01d1
            r1 = r42
            r0 = r41
            boolean r0 = X.02S.A00(r1, r0)
            if (r0 == 0) goto L_0x01d1
            r1 = r40
            r0 = r39
            boolean r0 = X.02S.A00(r1, r0)
            if (r0 == 0) goto L_0x01d1
            r1 = r38
            r0 = r37
            boolean r0 = X.02S.A00(r1, r0)
            if (r0 == 0) goto L_0x01d1
            r1 = r36
            r0 = r35
            boolean r0 = X.02S.A00(r1, r0)
            if (r0 == 0) goto L_0x01d1
            r1 = r34
            r0 = r33
            boolean r0 = X.02S.A00(r1, r0)
            if (r0 == 0) goto L_0x01d1
            r1 = r32
            r0 = r31
            boolean r0 = X.02S.A00(r1, r0)
            if (r0 == 0) goto L_0x01d1
            r1 = r30
            r0 = r29
            boolean r0 = X.02S.A00(r1, r0)
            if (r0 == 0) goto L_0x01d1
            r1 = r28
            r0 = r27
            boolean r0 = X.02S.A00(r1, r0)
            if (r0 == 0) goto L_0x01d1
            r1 = r26
            r0 = r25
            boolean r0 = X.02S.A00(r1, r0)
            if (r0 == 0) goto L_0x01d1
            r1 = r24
            r0 = r23
            boolean r0 = X.02S.A00(r1, r0)
            if (r0 == 0) goto L_0x01d1
            if (r10 != 0) goto L_0x0200
            if (r9 != 0) goto L_0x01d1
        L_0x01ad:
            r1 = r22
            r0 = r21
            boolean r0 = X.02S.A00(r1, r0)
            if (r0 == 0) goto L_0x01d1
            boolean r0 = r21.booleanValue()
            if (r0 == 0) goto L_0x01d2
            r1 = r20
            r0 = r19
            boolean r0 = X.02S.A00(r1, r0)
            if (r0 == 0) goto L_0x01d1
            r1 = r18
            r0 = r17
            boolean r0 = X.02S.A00(r1, r0)
            if (r0 != 0) goto L_0x01d2
        L_0x01d1:
            return r16
        L_0x01d2:
            boolean r0 = X.02S.A00(r8, r7)
            if (r0 == 0) goto L_0x01d1
            boolean r0 = X.02S.A00(r6, r5)
            if (r0 == 0) goto L_0x01d1
            if (r4 != r3) goto L_0x01d1
            if (r2 != r13) goto L_0x01d1
            if (r12 != 0) goto L_0x01e7
            if (r11 == 0) goto L_0x03b2
            return r16
        L_0x01e7:
            if (r11 == 0) goto L_0x01d1
            boolean r0 = r12 instanceof android.graphics.drawable.ColorDrawable
            if (r0 == 0) goto L_0x03a3
            boolean r0 = r11 instanceof android.graphics.drawable.ColorDrawable
            if (r0 == 0) goto L_0x03a3
            android.graphics.drawable.ColorDrawable r12 = (android.graphics.drawable.ColorDrawable) r12
            android.graphics.drawable.ColorDrawable r11 = (android.graphics.drawable.ColorDrawable) r11
            int r1 = r12.getColor()
            int r0 = r11.getColor()
            if (r1 == r0) goto L_0x03b2
            return r16
        L_0x0200:
            if (r9 == 0) goto L_0x01d1
            int r1 = r10.size()
            int r0 = r9.size()
            if (r1 != r0) goto L_0x01d1
            r14 = 0
        L_0x020d:
            int r0 = r10.size()
            if (r14 >= r0) goto L_0x01ad
            java.lang.Object r1 = r10.get(r14)
            android.text.InputFilter r1 = (android.text.InputFilter) r1
            java.lang.Object r15 = r9.get(r14)
            android.text.InputFilter r15 = (android.text.InputFilter) r15
            boolean r0 = r1 instanceof android.text.InputFilter.AllCaps
            if (r0 == 0) goto L_0x022a
            boolean r0 = r15 instanceof android.text.InputFilter.AllCaps
            if (r0 == 0) goto L_0x022a
        L_0x0227:
            int r14 = r14 + 1
            goto L_0x020d
        L_0x022a:
            boolean r0 = r1 instanceof android.text.InputFilter.LengthFilter
            if (r0 == 0) goto L_0x0241
            boolean r0 = r15 instanceof android.text.InputFilter.LengthFilter
            if (r0 == 0) goto L_0x0241
            android.text.InputFilter$LengthFilter r1 = (android.text.InputFilter.LengthFilter) r1
            int r1 = r1.getMax()
            android.text.InputFilter$LengthFilter r15 = (android.text.InputFilter.LengthFilter) r15
            int r0 = r15.getMax()
            if (r1 == r0) goto L_0x0227
            return r16
        L_0x0241:
            boolean r0 = X.02S.A00(r1, r15)
            if (r0 != 0) goto L_0x0227
            return r16
        L_0x0248:
            X.Gxp r13 = (X.C54007Gxp) r13
            java.util.concurrent.atomic.AtomicReference r13 = r13.A02
            goto L_0x00eb
        L_0x024e:
            X.Gxp r2 = (X.C54007Gxp) r2
            java.util.concurrent.atomic.AtomicReference r2 = r2.A02
            goto L_0x00e8
        L_0x0254:
            r3 = r13
            X.Gxp r3 = (X.C54007Gxp) r3
            java.util.concurrent.atomic.AtomicReference r3 = r3.A01
            goto L_0x00e5
        L_0x025b:
            r3 = r2
            X.Gxp r3 = (X.C54007Gxp) r3
            java.util.concurrent.atomic.AtomicReference r4 = r3.A01
            goto L_0x00e2
        L_0x0262:
            r0 = r13
            X.Gxp r0 = (X.C54007Gxp) r0
            java.lang.Integer r0 = r0.A00
            goto L_0x00df
        L_0x0269:
            android.text.method.MovementMethod r5 = r14.A0A
            goto L_0x00d4
        L_0x026d:
            android.text.method.MovementMethod r6 = r15.A0A
            goto L_0x00d1
        L_0x0271:
            java.lang.Integer r7 = X.C51967G9n.A0j()
            goto L_0x00ce
        L_0x0277:
            java.lang.Integer r8 = X.C51967G9n.A0j()
            goto L_0x00cb
        L_0x027d:
            int r0 = r14.A02
            java.lang.Integer r17 = java.lang.Integer.valueOf(r0)
            goto L_0x00c8
        L_0x0285:
            int r0 = r15.A02
            java.lang.Integer r18 = java.lang.Integer.valueOf(r0)
            goto L_0x00c4
        L_0x028d:
            int r0 = r14.A03
            java.lang.Integer r19 = java.lang.Integer.valueOf(r0)
            goto L_0x00c0
        L_0x0295:
            int r0 = r15.A03
            java.lang.Integer r20 = java.lang.Integer.valueOf(r0)
            goto L_0x00bc
        L_0x029d:
            boolean r0 = r14.A0V
            java.lang.Boolean r21 = java.lang.Boolean.valueOf(r0)
            goto L_0x00b8
        L_0x02a5:
            java.util.List r9 = r14.A0S
            goto L_0x00aa
        L_0x02a9:
            java.lang.Integer r23 = X.C51967G9n.A0k()
            goto L_0x00a2
        L_0x02af:
            java.lang.Integer r24 = X.C51967G9n.A0k()
            goto L_0x009e
        L_0x02b5:
            java.lang.Integer r25 = X.C51967G9n.A0k()
            goto L_0x009a
        L_0x02bb:
            java.lang.Integer r26 = X.C51967G9n.A0k()
            goto L_0x0096
        L_0x02c1:
            int r0 = r14.A01
            java.lang.Integer r27 = java.lang.Integer.valueOf(r0)
            goto L_0x0092
        L_0x02c9:
            int r0 = r15.A01
            java.lang.Integer r28 = java.lang.Integer.valueOf(r0)
            goto L_0x008e
        L_0x02d1:
            java.lang.Boolean r29 = X.AnonymousClass7TE.A0v()
            goto L_0x008a
        L_0x02d7:
            java.lang.Boolean r30 = X.AnonymousClass7TE.A0v()
            goto L_0x0086
        L_0x02dd:
            boolean r0 = r14.A0U
            java.lang.Boolean r31 = java.lang.Boolean.valueOf(r0)
            goto L_0x0082
        L_0x02e5:
            boolean r0 = r15.A0U
            java.lang.Boolean r32 = java.lang.Boolean.valueOf(r0)
            goto L_0x007e
        L_0x02ed:
            int r0 = r14.A00
            java.lang.Integer r33 = java.lang.Integer.valueOf(r0)
            goto L_0x007a
        L_0x02f5:
            int r0 = r15.A00
            java.lang.Integer r34 = java.lang.Integer.valueOf(r0)
            goto L_0x0076
        L_0x02fd:
            int r0 = r14.A04
            java.lang.Integer r35 = java.lang.Integer.valueOf(r0)
            goto L_0x0072
        L_0x0305:
            int r0 = r15.A04
            java.lang.Integer r36 = java.lang.Integer.valueOf(r0)
            goto L_0x006e
        L_0x030d:
            android.graphics.Typeface r0 = r14.A08
            r37 = r0
            goto L_0x006a
        L_0x0313:
            android.graphics.Typeface r0 = r15.A08
            r38 = r0
            goto L_0x0066
        L_0x0319:
            int r0 = r14.A05
            java.lang.Integer r39 = java.lang.Integer.valueOf(r0)
            goto L_0x0062
        L_0x0321:
            int r0 = r15.A05
            java.lang.Integer r40 = java.lang.Integer.valueOf(r0)
            goto L_0x005e
        L_0x0329:
            java.lang.Integer r0 = r14.A0R
            r41 = r0
            goto L_0x005a
        L_0x032f:
            java.lang.Integer r0 = r15.A0R
            r42 = r0
            goto L_0x0056
        L_0x0335:
            android.content.res.ColorStateList r0 = r14.A06
            r43 = r0
            goto L_0x0052
        L_0x033b:
            android.content.res.ColorStateList r0 = r15.A06
            r44 = r0
            goto L_0x004e
        L_0x0341:
            android.content.res.ColorStateList r0 = r14.A07
            r45 = r0
            goto L_0x004a
        L_0x0347:
            android.content.res.ColorStateList r0 = r15.A07
            r46 = r0
            goto L_0x0046
        L_0x034d:
            r0 = -7829368(0xffffffffff888888, float:NaN)
            java.lang.Integer r47 = java.lang.Integer.valueOf(r0)
            goto L_0x0042
        L_0x0356:
            r0 = -7829368(0xffffffffff888888, float:NaN)
            java.lang.Integer r48 = java.lang.Integer.valueOf(r0)
            goto L_0x003e
        L_0x035f:
            java.lang.Float r49 = X.C51967G9n.A0g()
            goto L_0x003a
        L_0x0365:
            java.lang.Float r50 = X.C51967G9n.A0g()
            goto L_0x0036
        L_0x036b:
            java.lang.Float r51 = X.C51967G9n.A0g()
            goto L_0x0032
        L_0x0371:
            java.lang.Float r52 = X.C51967G9n.A0g()
            goto L_0x002e
        L_0x0377:
            java.lang.Float r53 = X.C51967G9n.A0g()
            goto L_0x002a
        L_0x037d:
            java.lang.Float r54 = X.C51967G9n.A0g()
            goto L_0x0026
        L_0x0383:
            android.graphics.drawable.Drawable r11 = r14.A09
            goto L_0x0022
        L_0x0387:
            android.graphics.drawable.Drawable r12 = r15.A09
            goto L_0x001f
        L_0x038b:
            java.lang.CharSequence r0 = r14.A0P
            r55 = r0
            goto L_0x001c
        L_0x0391:
            java.lang.CharSequence r0 = r15.A0P
            r56 = r0
            goto L_0x0018
        L_0x0397:
            java.lang.CharSequence r0 = r14.A0Q
            r57 = r0
            goto L_0x0014
        L_0x039d:
            java.lang.CharSequence r0 = r15.A0Q
            r58 = r0
            goto L_0x0010
        L_0x03a3:
            android.graphics.drawable.Drawable$ConstantState r1 = r12.getConstantState()
            android.graphics.drawable.Drawable$ConstantState r0 = r11.getConstantState()
            boolean r0 = X.02S.A00(r1, r0)
            if (r0 != 0) goto L_0x03b2
            return r16
        L_0x03b2:
            r16 = 0
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C53999Gxh.A0T(X.3mp, X.3mp, X.2TB, X.2TB):boolean");
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.2TB, java.lang.Object] */
    public final /* bridge */ /* synthetic */ 2TB A0f() {
        return new Object();
    }

    public final void A0n(2V1 r4) {
        InputFilter[] inputFilterArr = C55421HhR.A09;
        TypedArray A022 = r4.A02(0, new int[]{16842905});
        try {
            Integer valueOf = Integer.valueOf(A022.getColor(0, 0));
            if (valueOf != null) {
                this.A0R = valueOf;
            }
        } finally {
            A022.recycle();
        }
    }

    public final void A0p(2V1 r2, AnonymousClass2V9 r3) {
        C51971G9r.A1H(r2, this.A0K, this, r3);
        C51971G9r.A1H(r2, this.A0C, this, r3);
        C51971G9r.A1H(r2, this.A0O, this, r3);
        C51971G9r.A1H(r2, this.A0H, this, r3);
        C51971G9r.A1H(r2, this.A0G, this, r3);
        C51971G9r.A1H(r2, this.A0E, this, r3);
        C51971G9r.A1H(r2, this.A0N, this, r3);
        C51971G9r.A1H(r2, this.A0J, this, r3);
        C51971G9r.A1H(r2, this.A0D, this, r3);
        C51971G9r.A1H(r2, this.A0L, this, r3);
        C51971G9r.A1H(r2, this.A0M, this, r3);
        C51971G9r.A1H(r2, this.A0I, this, r3);
        C51971G9r.A1H(r2, this.A0F, this, r3);
    }

    public final void A0q(2V1 r25, C70672Tq r26, AnonymousClass2T3 r27, 2Tc r28, int i, int i2) {
        int i3;
        InputFilter[] inputFilterArr;
        int min;
        2V1 r1 = r25;
        CharSequence charSequence = this.A0P;
        Drawable drawable = this.A09;
        ColorStateList colorStateList = this.A07;
        ColorStateList colorStateList2 = this.A06;
        Integer num = this.A0R;
        int i4 = this.A05;
        Typeface typeface = this.A08;
        int i5 = this.A04;
        int i6 = this.A00;
        boolean z = this.A0U;
        int i7 = this.A01;
        List list = this.A0S;
        boolean z2 = this.A0V;
        int i8 = this.A03;
        int i9 = this.A02;
        AtomicReference atomicReference = C51969G9p.A0e(r1).A02;
        InputFilter[] inputFilterArr2 = C55421HhR.A09;
        CharSequence charSequence2 = (CharSequence) atomicReference.get();
        Context context = r1.A0C;
        EditText editText = new EditText(context);
        if (charSequence2 instanceof Spannable) {
            charSequence2 = charSequence2.toString();
        }
        Drawable drawable2 = C55421HhR.A04;
        if (drawable == drawable2) {
            drawable = editText.getBackground();
        }
        if (drawable == drawable2) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, new int[]{16842964}, 16842862, 0);
            drawable = obtainStyledAttributes.getDrawable(0);
            obtainStyledAttributes.recycle();
        }
        MovementMethod movementMethod = editText.getMovementMethod();
        if (i4 == -1) {
            editText.setTextSize(2, 14.0f);
        } else {
            editText.setTextSize(0, (float) i4);
        }
        if (z2) {
            i3 = i7 | 131073;
            editText.setMinLines(i8);
            editText.setMaxLines(i9);
        } else {
            i3 = i7 & -131073;
            editText.setLines(1);
        }
        if (!z) {
            i3 = 0;
        }
        if (i3 != editText.getInputType()) {
            editText.setInputType(i3);
        }
        if (list != null) {
            inputFilterArr = (InputFilter[]) list.toArray(new InputFilter[list.size()]);
        } else {
            inputFilterArr = C55421HhR.A09;
        }
        editText.setFilters(inputFilterArr);
        editText.setHint(charSequence);
        editText.setBackground(drawable);
        if (drawable == null || !drawable.getPadding(C55421HhR.A02)) {
            editText.setPadding(0, 0, 0, 0);
        }
        editText.setShadowLayer(0.0f, 0.0f, 0.0f, -7829368);
        editText.setTypeface(typeface, 0);
        editText.setGravity(i6);
        editText.setImeOptions(0);
        editText.setFocusable(z);
        editText.setFocusableInTouchMode(z);
        editText.setLongClickable(z);
        editText.setCursorVisible(true);
        editText.setTextColor(colorStateList);
        editText.setHintTextColor(colorStateList2);
        if (num != null) {
            editText.setHighlightColor(num.intValue());
        }
        editText.setMovementMethod(movementMethod);
        editText.setError((CharSequence) null, (Drawable) null);
        editText.setEllipsize((TextUtils.TruncateAt) null);
        editText.setTextAlignment(i5);
        if (charSequence2 != null && !02S.A00(AnonymousClass7TF.A0f(editText), charSequence2.toString())) {
            editText.setText(charSequence2);
        }
        editText.setImportantForAutofill(0);
        editText.setAutofillHints((String[]) null);
        editText.measure(C253713rG.A00(i), C253713rG.A00(i2));
        AnonymousClass2T3 r2 = r27;
        r2.A00 = editText.getMeasuredHeight();
        if (View.MeasureSpec.getMode(i) == 0) {
            min = 0;
        } else {
            min = Math.min(View.MeasureSpec.getSize(i), editText.getMeasuredWidth());
        }
        r2.A01 = min;
    }

    public final void A0s(2V1 r6, C70672Tq r7, Object obj) {
        2Sg r2;
        TextWatcher i9j;
        C52868Ge1 ge1 = (C52868Ge1) obj;
        List list = this.A0T;
        InputFilter[] inputFilterArr = C55421HhR.A09;
        C251263mp r0 = r6.A01;
        if (r0 == null) {
            r2 = null;
        } else {
            r2 = ((C53999Gxh) r0).A0B;
        }
        if (list != null && list.size() > 0) {
            if (list.size() == 1) {
                i9j = (TextWatcher) AnonymousClass7TE.A13(list);
            } else {
                i9j = new C56723I9j(list);
            }
            ge1.A01 = i9j;
            ge1.addTextChangedListener(i9j);
        }
        ge1.setCustomSelectionActionModeCallback((ActionMode.Callback) null);
        ge1.setCustomInsertionActionModeCallback((ActionMode.Callback) null);
        ge1.A02 = r6;
        ge1.A03 = r2;
    }

    public final void A0t(2V1 r26, C70672Tq r27, Object obj) {
        int i;
        InputFilter[] inputFilterArr;
        2V1 r1 = r26;
        C54007Gxp A0e = C51969G9p.A0e(r1);
        C52868Ge1 ge1 = (C52868Ge1) obj;
        CharSequence charSequence = this.A0P;
        Drawable drawable = this.A09;
        ColorStateList colorStateList = this.A07;
        ColorStateList colorStateList2 = this.A06;
        Integer num = this.A0R;
        int i2 = this.A05;
        Typeface typeface = this.A08;
        int i3 = this.A04;
        int i4 = this.A00;
        boolean z = this.A0U;
        int i5 = this.A01;
        List list = this.A0S;
        boolean z2 = this.A0V;
        int i6 = this.A03;
        int i7 = this.A02;
        MovementMethod movementMethod = this.A0A;
        AtomicReference atomicReference = A0e.A02;
        AtomicReference atomicReference2 = A0e.A01;
        InputFilter[] inputFilterArr2 = C55421HhR.A09;
        atomicReference2.set(ge1);
        if (drawable == C55421HhR.A04) {
            TypedArray obtainStyledAttributes = r1.A0C.obtainStyledAttributes((AttributeSet) null, new int[]{16842964}, 16842862, 0);
            drawable = obtainStyledAttributes.getDrawable(0);
            obtainStyledAttributes.recycle();
        }
        CharSequence charSequence2 = (CharSequence) atomicReference.get();
        if (i2 == -1) {
            ge1.setTextSize(2, 14.0f);
        } else {
            ge1.setTextSize(0, (float) i2);
        }
        if (z2) {
            i = i5 | 131073;
            ge1.setMinLines(i6);
            ge1.setMaxLines(i7);
        } else {
            i = i5 & -131073;
            ge1.setLines(1);
        }
        if (!z) {
            i = 0;
        }
        if (i != ge1.getInputType()) {
            ge1.setInputType(i);
        }
        if (list != null) {
            inputFilterArr = (InputFilter[]) list.toArray(new InputFilter[list.size()]);
        } else {
            inputFilterArr = C55421HhR.A09;
        }
        ge1.setFilters(inputFilterArr);
        ge1.setHint(charSequence);
        ge1.setBackground(drawable);
        if (drawable == null || !drawable.getPadding(C55421HhR.A02)) {
            ge1.setPadding(0, 0, 0, 0);
        }
        ge1.setShadowLayer(0.0f, 0.0f, 0.0f, -7829368);
        ge1.setTypeface(typeface, 0);
        ge1.setGravity(i4);
        ge1.setImeOptions(0);
        ge1.setFocusable(z);
        ge1.setFocusableInTouchMode(z);
        ge1.setLongClickable(z);
        ge1.setCursorVisible(true);
        ge1.setTextColor(colorStateList);
        ge1.setHintTextColor(colorStateList2);
        if (num != null) {
            ge1.setHighlightColor(num.intValue());
        }
        ge1.setMovementMethod(movementMethod);
        ge1.setError((CharSequence) null, (Drawable) null);
        ge1.setEllipsize((TextUtils.TruncateAt) null);
        ge1.setTextAlignment(i3);
        if (charSequence2 != null && !02S.A00(AnonymousClass7TF.A0f(ge1), charSequence2.toString())) {
            ge1.setText(charSequence2);
            ge1.setSelection(AnonymousClass7TF.A0f(ge1).length());
        }
        ge1.setImportantForAutofill(0);
        ge1.setAutofillHints((String[]) null);
        ge1.A04 = atomicReference;
    }

    public final void A0u(2V1 r2, C70672Tq r3, Object obj) {
        C52868Ge1 ge1 = (C52868Ge1) obj;
        InputFilter[] inputFilterArr = C55421HhR.A09;
        TextWatcher textWatcher = ge1.A01;
        if (textWatcher != null) {
            ge1.removeTextChangedListener(textWatcher);
            ge1.A01 = null;
        }
        ge1.A02 = null;
        ge1.A03 = null;
        ge1.setCustomSelectionActionModeCallback((ActionMode.Callback) null);
        ge1.setCustomInsertionActionModeCallback((ActionMode.Callback) null);
    }

    public final void A0w(2V1 r5, 2TB r6) {
        C54007Gxp gxp = (C54007Gxp) r6;
        CharSequence charSequence = this.A0Q;
        InputFilter[] inputFilterArr = C55421HhR.A09;
        AtomicReference atomicReference = new AtomicReference();
        Integer A0k = C51967G9n.A0k();
        AtomicReference atomicReference2 = new AtomicReference(charSequence);
        gxp.A01 = atomicReference;
        gxp.A02 = atomicReference2;
        gxp.A00 = A0k;
    }

    public final /* bridge */ /* synthetic */ C251263mp A0E() {
        return super.A0E();
    }

    public final void A0v(2V1 r4, C70672Tq r5, Object obj) {
        C52868Ge1 ge1 = (C52868Ge1) obj;
        AtomicReference atomicReference = C51969G9p.A0e(r4).A01;
        InputFilter[] inputFilterArr = C55421HhR.A09;
        ge1.A04 = null;
        ge1.setPrivateImeOptions((String) null);
        atomicReference.set((Object) null);
    }
}
