package X;

import android.graphics.Typeface;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.TypefaceSpan;
import android.util.TypedValue;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.6TV  reason: invalid class name */
public final class AnonymousClass6TV {
    public static final AnonymousClass6TV A00 = new Object();

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000a, code lost:
        if (r6 == 16917) goto L_0x000c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.VXV A00(X.C307786Rm r7, X.C276544tV r8, X.C276544tV r9, X.C276544tV r10, int r11, int r12, boolean r13) {
        /*
            r5 = r10
            int r6 = r10.A04
            r0 = 16891(0x41fb, float:2.367E-41)
            if (r6 == r0) goto L_0x000c
            r0 = 16917(0x4215, float:2.3706E-41)
            r10 = 0
            if (r6 != r0) goto L_0x000d
        L_0x000c:
            r10 = 1
        L_0x000d:
            X.ViE r1 = new X.ViE
            r2 = r7
            r4 = r8
            r3 = r9
            r7 = r11
            r8 = r12
            r9 = r13
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            X.VXV r0 = new X.VXV
            r0.<init>(r1, r11, r12, r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6TV.A00(X.6Rm, X.4tV, X.4tV, X.4tV, int, int, boolean):X.VXV");
    }

    public static final AnonymousClass6TZ A02(C307786Rm r9, C276544tV r10, List list, boolean z) {
        List list2 = list;
        0qQ.A0B(list, 0);
        C307786Rm r4 = r9;
        0qQ.A0B(r9, 1);
        AnonymousClass6TV r2 = A00;
        C276544tV r5 = r10;
        if (!z) {
            return A01(r9, r10, list);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        StringBuilder sb = new StringBuilder();
        ArrayList A03 = r2.A03(spannableStringBuilder, r4, r5, sb, list2);
        ArrayList arrayList = new ArrayList();
        Iterator it = A03.iterator();
        while (it.hasNext()) {
            VXV vxv = (VXV) it.next();
            if (vxv.A03) {
                arrayList.add(vxv);
            } else {
                vxv.A02.A00((Layout) null, spannableStringBuilder, vxv, -1, -1);
            }
        }
        String obj = sb.toString();
        0qQ.A07(obj);
        return new AnonymousClass6TZ(spannableStringBuilder, obj, arrayList);
    }

    public static final void A04(Spannable spannable, C307786Rm r5, String str, int i, int i2) {
        if (str != null) {
            try {
                spannable.setSpan(new AbsoluteSizeSpan((int) TypedValue.applyDimension(2, AnonymousClass6Su.A02(str), r5.A00.getResources().getDisplayMetrics())), i, i2, 0);
            } catch (C258053yO e) {
                1Kn.A00(r5, "TextNodeUtils:TextSpan:size-parsing", "Error parsing TextSpan size", e);
            }
        }
    }

    public static final void A05(Spannable spannable, C307786Rm r6, String str, String str2, int i, int i2) {
        Typeface typeface;
        if (str != null) {
            typeface = C64361Kj.A00().A05.A00(r6.A00, str);
        } else {
            typeface = null;
        }
        if (str2 != null) {
            try {
                typeface = AnonymousClass6TW.A00(typeface, str2);
            } catch (C258053yO e) {
                1Kn.A00(r6, "TextNodeUtils:TextSpan:text-style-parsing", "Error parsing TextSpan textStyle", e);
            }
        }
        if (typeface != null) {
            spannable.setSpan(new TypefaceSpan(typeface), i, i2, 0);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0057, code lost:
        if (r8 != 0) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00cb, code lost:
        if (r9 != 0) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00ce, code lost:
        r8 = r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A06(android.text.Spannable r17, X.C307786Rm r18, X.C276544tV r19, X.C276544tV r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, int r24, int r25, boolean r26) {
        /*
            r2 = 0
            if (r21 == 0) goto L_0x00e5
            if (r22 == 0) goto L_0x00e5
            r14 = r19
            if (r19 == 0) goto L_0x00e5
            r13 = r18
            float r3 = X.AnonymousClass6Su.A01(r21)     // Catch:{ 3yO -> 0x00d6 }
            float r4 = X.AnonymousClass6Su.A01(r22)     // Catch:{ 3yO -> 0x00dc }
            r1 = 0
            r10 = 1
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x00ec
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x00ec
            r1 = r20
            if (r20 == 0) goto L_0x00d0
            r0 = 42
            float r0 = X.C16918VAv.A00(r1, r0)
            int r8 = (int) r0
            r0 = 40
            float r0 = X.C16918VAv.A00(r1, r0)
            int r7 = (int) r0
            r0 = 41
            float r0 = X.C16918VAv.A00(r1, r0)
            int r9 = (int) r0
            r0 = 35
            float r0 = X.C16918VAv.A00(r1, r0)
            int r6 = (int) r0
            r0 = 36
            float r0 = X.C16918VAv.A00(r1, r0)
            int r5 = (int) r0
            r0 = 38
            float r0 = X.C16918VAv.A00(r1, r0)
            int r1 = (int) r0
            android.content.Context r0 = r13.A00
            boolean r0 = X.C16919VAw.A00(r0)
            if (r0 == 0) goto L_0x00c6
            r0 = r9
            if (r9 != 0) goto L_0x0057
            r0 = r5
        L_0x0057:
            if (r8 == 0) goto L_0x00ce
        L_0x0059:
            android.graphics.Rect r12 = new android.graphics.Rect
            r12.<init>(r0, r7, r8, r6)
        L_0x005e:
            X.2nJ r0 = r13.A02
            X.2nt r0 = r0.AgE()
            X.2np r0 = r0.BGG()
            if (r0 == 0) goto L_0x00ec
            r16 = 1
            r5 = r23
            if (r23 == 0) goto L_0x008d
            int r1 = r5.hashCode()
            r0 = -1720785339(0xffffffff996ee645, float:-1.2350814E-23)
            if (r1 == r0) goto L_0x008d
            r0 = -1383228885(0xffffffffad8d9a2b, float:-1.6098308E-11)
            if (r1 == r0) goto L_0x00bb
            r0 = -1364013995(0xffffffffaeb2cc55, float:-8.1307995E-11)
            if (r1 != r0) goto L_0x008d
            java.lang.String r0 = "center"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x008d
            r16 = 2
        L_0x008d:
            r6 = 0
            X.5uo r11 = new X.5uo
            r15 = r26
            r11.<init>(r12, r13, r14, r15, r16)
            int r5 = (int) r3
            int r3 = (int) r4
            r7 = r17
            int r0 = r7.length()
            r4 = r25
            if (r4 > r0) goto L_0x00ba
            X.2hm r1 = r11.A03
            r0 = 13
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0qQ.A0C(r1, r0)
            android.graphics.drawable.Drawable r1 = (android.graphics.drawable.Drawable) r1
            r1.setBounds(r2, r2, r5, r3)
            r11.A00 = r6
            r0 = 33
            r1 = r24
            r7.setSpan(r11, r1, r4, r0)
        L_0x00ba:
            return r10
        L_0x00bb:
            java.lang.String r0 = "bottom"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x008d
            r16 = 0
            goto L_0x008d
        L_0x00c6:
            r0 = r8
            if (r8 != 0) goto L_0x00ca
            r0 = r5
        L_0x00ca:
            r8 = r9
            if (r9 == 0) goto L_0x00ce
            goto L_0x0059
        L_0x00ce:
            r8 = r1
            goto L_0x0059
        L_0x00d0:
            android.graphics.Rect r12 = new android.graphics.Rect
            r12.<init>()
            goto L_0x005e
        L_0x00d6:
            r3 = move-exception
            java.lang.String r1 = "TextNodeUtils:ImageSpan:img-width-parsing"
            java.lang.String r0 = "Error parsing image width"
            goto L_0x00e1
        L_0x00dc:
            r3 = move-exception
            java.lang.String r1 = "TextNodeUtils:ImageSpan:img-height-parsing"
            java.lang.String r0 = "Error parsing image height"
        L_0x00e1:
            X.1Kn.A00(r13, r1, r0, r3)
            return r2
        L_0x00e5:
            java.lang.String r1 = "TextNodeUtils:ImageSpan:invalid-attributes"
            java.lang.String r0 = "Invalid image span attributes specified."
            X.1Kn.A02(r1, r0)
        L_0x00ec:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6TV.A06(android.text.Spannable, X.6Rm, X.4tV, X.4tV, java.lang.String, java.lang.String, java.lang.String, int, int, boolean):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0076, code lost:
        if (r0.A0K(35) != null) goto L_0x0078;
     */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x014a  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x015a  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x017f  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0198  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.AnonymousClass6TZ A01(X.C307786Rm r23, X.C276544tV r24, java.util.List r25) {
        /*
            android.text.SpannableStringBuilder r13 = new android.text.SpannableStringBuilder
            r13.<init>()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.util.Iterator r12 = r25.iterator()
        L_0x000e:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x01d5
            java.lang.Object r0 = r12.next()
            X.4tV r0 = (X.C276544tV) r0
            int r2 = r13.length()
            r1 = 59
            X.4tV r1 = r0.A07(r1)
            r6 = 0
            if (r1 == 0) goto L_0x0028
            r6 = 1
        L_0x0028:
            r1 = 41
            X.4tV r5 = r0.A07(r1)
            java.lang.String r3 = ""
            r1 = 38
            java.lang.String r1 = r0.A0K(r1)
            if (r1 == 0) goto L_0x0039
            r3 = r1
        L_0x0039:
            if (r6 == 0) goto L_0x01ca
            java.lang.String r3 = " "
        L_0x003d:
            r13.append(r3)
            int r1 = r13.length()
            r14 = r23
            if (r6 == 0) goto L_0x00ff
            r5 = 62
            java.lang.String r17 = r0.A0K(r5)
            r5 = 61
            java.lang.String r18 = r0.A0K(r5)
            r5 = 59
            X.4tV r15 = r0.A07(r5)
            r5 = 68
            java.lang.String r19 = r0.A0K(r5)
            r5 = 69
            X.4tV r16 = r0.A07(r5)
            r5 = 42
            java.lang.String r5 = r0.A0K(r5)
            if (r5 != 0) goto L_0x0078
            r5 = 35
            java.lang.String r5 = r0.A0K(r5)
            r22 = 0
            if (r5 == 0) goto L_0x007a
        L_0x0078:
            r22 = 1
        L_0x007a:
            r20 = r2
            r21 = r1
            boolean r5 = A06(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            if (r5 == 0) goto L_0x00aa
            r5 = 42
            java.lang.String r5 = r0.A0K(r5)
            A04(r13, r14, r5, r2, r1)
            r5 = 35
            java.lang.String r8 = r0.A0K(r5)
            r7 = 0
            if (r8 == 0) goto L_0x00aa
            android.content.Context r6 = r14.A00
            X.1Kj r5 = X.C64361Kj.A00()
            X.4dY r5 = r5.A05
            android.graphics.Typeface r6 = r5.A00(r6, r8)
            X.TzO r5 = new X.TzO
            r5.<init>(r6)
            r13.setSpan(r5, r2, r1, r7)
        L_0x00aa:
            r5 = 66
            java.lang.String r20 = r0.A0K(r5)
            r5 = 67
            java.lang.String r21 = r0.A0K(r5)
            r5 = 36
            X.4uI r19 = r0.A0A(r5)
            r6 = 0
            r17 = r24
            if (r19 == 0) goto L_0x00d0
            X.6TX r5 = new X.6TX
            r15 = r5
            r16 = r14
            r18 = r0
            r22 = r6
            r15.<init>(r16, r17, r18, r19, r20, r21, r22)
            r13.setSpan(r5, r2, r1, r6)
        L_0x00d0:
            r5 = 57
            X.4uI r19 = r0.A0A(r5)
            if (r19 == 0) goto L_0x00e7
            r22 = 1
            X.6TX r5 = new X.6TX
            r15 = r5
            r16 = r14
            r18 = r0
            r15.<init>(r16, r17, r18, r19, r20, r21, r22)
            r13.setSpan(r5, r2, r1, r6)
        L_0x00e7:
            r1 = 66
            java.lang.String r1 = r0.A0K(r1)
            if (r1 == 0) goto L_0x00fa
            int r0 = r1.length()
            if (r0 == 0) goto L_0x00fa
            r4.append(r1)
            goto L_0x000e
        L_0x00fa:
            r4.append(r3)
            goto L_0x000e
        L_0x00ff:
            r5 = 44
            X.4tV r6 = r0.A07(r5)
            r5 = 40
            java.lang.String r5 = r0.A0K(r5)
            if (r6 == 0) goto L_0x01b4
            r5 = 0
            int r5 = X.AnonymousClass6TP.A00(r14, r6, r5)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
        L_0x0116:
            if (r5 == 0) goto L_0x0125
            int r5 = r5.intValue()
            android.text.style.ForegroundColorSpan r6 = new android.text.style.ForegroundColorSpan
            r6.<init>(r5)
            r5 = 0
            r13.setSpan(r6, r2, r1, r5)
        L_0x0125:
            r5 = 42
            java.lang.String r5 = r0.A0K(r5)
            A04(r13, r14, r5, r2, r1)
            r5 = 35
            java.lang.String r7 = r0.A0K(r5)
            r5 = 43
            java.lang.String r8 = r0.A0K(r5)
            r5 = r13
            r6 = r14
            r9 = r2
            r10 = r1
            A05(r5, r6, r7, r8, r9, r10)
            r5 = 45
            r8 = 0
            boolean r5 = r0.A0R(r5, r8)
            if (r5 == 0) goto L_0x0152
            android.text.style.StrikethroughSpan r5 = new android.text.style.StrikethroughSpan
            r5.<init>()
            r13.setSpan(r5, r2, r1, r8)
        L_0x0152:
            r5 = 52
            boolean r5 = r0.A0R(r5, r8)
            if (r5 == 0) goto L_0x0162
            android.text.style.UnderlineSpan r5 = new android.text.style.UnderlineSpan
            r5.<init>()
            r13.setSpan(r5, r2, r1, r8)
        L_0x0162:
            r5 = 56
            r11 = 0
            float r10 = r0.A02(r5, r11)
            r5 = 54
            float r9 = r0.A02(r5, r11)
            r5 = 55
            float r7 = r0.A02(r5, r11)
            r5 = 53
            X.4tV r6 = r0.A07(r5)
            int r5 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r5 <= 0) goto L_0x018d
            if (r6 == 0) goto L_0x01b2
            int r6 = X.AnonymousClass6TP.A00(r14, r6, r8)
        L_0x0185:
            X.U2B r5 = new X.U2B
            r5.<init>(r10, r9, r7, r6)
            r13.setSpan(r5, r2, r1, r8)
        L_0x018d:
            r6 = 49
            r5 = 1
            float r7 = r0.A02(r6, r5)
            int r5 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r5 == 0) goto L_0x00aa
            X.1Kj r5 = X.C64361Kj.A00()
            android.content.Context r5 = r5.A00
            android.content.res.Resources r5 = r5.getResources()
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
            float r6 = r5.scaledDensity
            X.TyH r5 = new X.TyH
            r5.<init>(r7, r6)
            r13.setSpan(r5, r2, r1, r8)
            goto L_0x00aa
        L_0x01b2:
            r6 = 0
            goto L_0x0185
        L_0x01b4:
            if (r5 == 0) goto L_0x0125
            int r5 = X.AnonymousClass6Su.A03(r5)     // Catch:{ 3yO -> 0x01c0 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ 3yO -> 0x01c0 }
            goto L_0x0116
        L_0x01c0:
            r7 = move-exception
            java.lang.String r6 = "TextNodeUtils:TextSpan:color-parsing"
            java.lang.String r5 = "Error parsing TextSpan color"
            X.1Kn.A00(r14, r6, r5, r7)
            goto L_0x0125
        L_0x01ca:
            if (r5 == 0) goto L_0x01d0
            java.lang.CharSequence r3 = X.C9813Rhb.A00(r5)
        L_0x01d0:
            X.0qQ.A0A(r3)
            goto L_0x003d
        L_0x01d5:
            java.lang.String r2 = r4.toString()
            X.0qQ.A07(r2)
            X.0sn r1 = X.0sn.A00
            X.6TZ r0 = new X.6TZ
            r0.<init>(r13, r2, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6TV.A01(X.6Rm, X.4tV, java.util.List):X.6TZ");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v7, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r7v0, types: [java.lang.String] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.ArrayList A03(android.text.SpannableStringBuilder r21, X.C307786Rm r22, X.C276544tV r23, java.lang.StringBuilder r24, java.util.List r25) {
        /*
            r20 = this;
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r8 = r25.iterator()
        L_0x0009:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x00fa
            java.lang.Object r11 = r8.next()
            X.4tV r11 = (X.C276544tV) r11
            int r2 = r11.A04
            r0 = 16887(0x41f7, float:2.3664E-41)
            r15 = r21
            r9 = r22
            r10 = r23
            r4 = r24
            if (r2 != r0) goto L_0x0070
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r7 = r11.A0D()
            r0 = 36
            java.util.List r19 = r11.A0N(r0)
            X.0qQ.A07(r19)
            int r13 = r15.length()
            r14 = r20
            r16 = r9
            r17 = r10
            r18 = r5
            java.util.ArrayList r6 = r14.A03(r15, r16, r17, r18, r19)
            int r14 = r15.length()
            r0 = 38
            java.util.List r0 = r11.A0N(r0)
            X.0qQ.A07(r0)
            java.util.Iterator r3 = r0.iterator()
        L_0x005b:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x00ec
            java.lang.Object r12 = r3.next()
            X.4tV r12 = (X.C276544tV) r12
            r15 = 0
            X.VXV r0 = A00(r9, r10, r11, r12, r13, r14, r15)
            r2.add(r0)
            goto L_0x005b
        L_0x0070:
            r0 = 16898(0x4202, float:2.3679E-41)
            if (r2 != r0) goto L_0x00e4
            r6 = 1
            r2 = 0
        L_0x0076:
            java.lang.String r5 = ""
            if (r6 == 0) goto L_0x00d3
            java.lang.String r5 = " "
        L_0x007c:
            int r13 = r15.length()
            r15.append(r5)
            int r14 = r15.length()
            r0 = 35
            if (r6 == 0) goto L_0x008d
            r0 = 44
        L_0x008d:
            java.lang.String r2 = r11.A0K(r0)
            if (r2 == 0) goto L_0x009a
            int r0 = r2.length()
            if (r0 == 0) goto L_0x009a
            r5 = r2
        L_0x009a:
            r0 = 36
            if (r6 == 0) goto L_0x00a0
            r0 = 43
        L_0x00a0:
            java.util.List r3 = r11.A0N(r0)
            X.0qQ.A07(r3)
            r4.append(r5)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            if (r6 == 0) goto L_0x00ba
            r15 = 1
            r12 = r11
            X.VXV r0 = A00(r9, r10, r11, r12, r13, r14, r15)
            r2.add(r0)
        L_0x00ba:
            java.util.Iterator r3 = r3.iterator()
        L_0x00be:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x00f5
            java.lang.Object r12 = r3.next()
            X.4tV r12 = (X.C276544tV) r12
            r15 = 0
            X.VXV r0 = A00(r9, r10, r11, r12, r13, r14, r15)
            r2.add(r0)
            goto L_0x00be
        L_0x00d3:
            java.lang.String r0 = r11.A0H()
            if (r0 == 0) goto L_0x00da
            r5 = r0
        L_0x00da:
            if (r2 == 0) goto L_0x00e0
            java.lang.CharSequence r5 = X.C9813Rhb.A00(r2)
        L_0x00e0:
            X.0qQ.A0A(r5)
            goto L_0x007c
        L_0x00e4:
            r6 = 0
            r0 = 40
            X.4tV r2 = r11.A07(r0)
            goto L_0x0076
        L_0x00ec:
            r2.addAll(r6)
            if (r7 == 0) goto L_0x00f2
            r5 = r7
        L_0x00f2:
            r4.append(r5)
        L_0x00f5:
            r1.addAll(r2)
            goto L_0x0009
        L_0x00fa:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6TV.A03(android.text.SpannableStringBuilder, X.6Rm, X.4tV, java.lang.StringBuilder, java.util.List):java.util.ArrayList");
    }
}
