package X;

import android.text.Layout;
import android.text.TextPaint;
import java.text.BreakIterator;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;

/* renamed from: X.5hx  reason: invalid class name and case insensitive filesystem */
public final class C291835hx implements C291845hy {
    public C39773A8n A00;
    public final int A01;
    public final AnonymousClass5Z4 A02;
    public final C291965iA A03;
    public final C286305Uu A04;
    public final C291855hz A05;
    public final CharSequence A06;
    public final C268024cd A07;
    public final String A08;
    public final List A09;
    public final List A0A;
    public final boolean A0B;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v0, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v2, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v36, resolved type: java.lang.CharSequence} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v37, resolved type: java.lang.CharSequence} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v39, resolved type: android.text.Spannable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v4, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v93, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v95, resolved type: android.text.Spannable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v96, resolved type: java.lang.CharSequence} */
    /* JADX WARNING: type inference failed for: r3v0, types: [android.text.TextPaint, android.graphics.Paint, X.5hz] */
    /* JADX WARNING: type inference failed for: r1v41, types: [java.lang.CharSequence] */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0229, code lost:
        if (r3 == X.AnonymousClass5RW.A07) goto L_0x022b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x023e, code lost:
        if (r15 == false) goto L_0x0240;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0289, code lost:
        if (X.AnonymousClass5Z7.A02(r4.A04) != false) goto L_0x028b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:334:0x070f, code lost:
        r1 = X.AnonymousClass5Z5.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x014c, code lost:
        r1 = ((X.C291785hs) r7.A01.get(0)).A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0162, code lost:
        if (r1 == 1) goto L_0x0167;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x021b, code lost:
        if (X.AnonymousClass5Z5.A00(r1) == 0.0f) goto L_0x021d;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x02ee  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x031a  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x033e  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x0403  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x040f  */
    /* JADX WARNING: Removed duplicated region for block: B:209:0x044b  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:260:0x0571  */
    /* JADX WARNING: Removed duplicated region for block: B:287:0x05ff  */
    /* JADX WARNING: Removed duplicated region for block: B:289:0x0623  */
    /* JADX WARNING: Removed duplicated region for block: B:308:0x0680  */
    /* JADX WARNING: Removed duplicated region for block: B:346:0x076b  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0121  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0136  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01ef  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0065  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C291835hx(X.AnonymousClass5Z4 r40, X.C286305Uu r41, X.C268024cd r42, java.lang.String r43, java.util.List r44, java.util.List r45) {
        /*
            r39 = this;
            r0 = r39
            r18 = r44
            r0.<init>()
            r1 = r43
            r0.A08 = r1
            r6 = r40
            r0.A02 = r6
            r1 = r18
            r0.A0A = r1
            r1 = r45
            r0.A09 = r1
            r1 = r41
            r0.A04 = r1
            r4 = r42
            r0.A07 = r4
            float r1 = r4.AwL()
            r9 = 1
            X.5hz r3 = new X.5hz
            r3.<init>(r9)
            r3.density = r1
            X.5ht r1 = X.C291795ht.A02
            r3.A05 = r1
            r10 = 3
            r3.A00 = r10
            X.5hu r1 = X.C291805hu.A03
            r3.A04 = r1
            r0.A05 = r3
            r5 = 0
            X.5i1 r2 = X.C291865i0.A00
            X.5i2 r2 = (X.C291885i2) r2
            X.4gU r1 = r2.A00
            if (r1 != 0) goto L_0x004b
            X.Tnu r1 = X.C13993Tnu.A09
            if (r1 == 0) goto L_0x016a
            X.4gU r1 = X.C291885i2.A00(r2)
            r2.A00 = r1
        L_0x004b:
            X.0qQ.A0A(r1)
        L_0x004e:
            java.lang.Object r1 = r1.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            r0.A0B = r1
            X.5ZC r2 = r6.A00
            int r11 = r2.A03
            X.5ZB r6 = r6.A02
            X.5Ud r7 = r6.A09
            r1 = 4
            if (r11 == r1) goto L_0x0164
            r8 = 0
            r1 = 5
            if (r11 == r1) goto L_0x0167
            if (r11 == r9) goto L_0x006f
            r1 = 2
            if (r11 != r1) goto L_0x013c
            r8 = 1
        L_0x006f:
            r0.A01 = r8
            X.9LQ r11 = new X.9LQ
            r11.<init>(r0, r9)
            X.5hw r10 = r2.A07
            if (r10 != 0) goto L_0x007c
            X.5hw r10 = X.C291825hw.A02
        L_0x007c:
            boolean r8 = r10.A01
            int r2 = r3.getFlags()
            r1 = r2 & -129(0xffffffffffffff7f, float:NaN)
            if (r8 == 0) goto L_0x0088
            r1 = r2 | 128(0x80, float:1.794E-43)
        L_0x0088:
            r3.setFlags(r1)
            int r1 = r10.A00
            if (r1 != r9) goto L_0x0136
            r2 = 0
            int r1 = r3.getFlags()
            r1 = r1 | 64
            r3.setFlags(r1)
        L_0x0099:
            r3.setHinting(r2)
            boolean r1 = r18.isEmpty()
            r21 = r1 ^ 1
            long r1 = r6.A01
            long r19 = X.AnonymousClass5Z5.A01(r1)
            r14 = 4294967296(0x100000000, double:2.121995791E-314)
            r16 = 4294967296(0x100000000, double:2.121995791E-314)
            int r8 = (r19 > r14 ? 1 : (r19 == r14 ? 0 : -1))
            if (r8 != 0) goto L_0x0123
            float r8 = r4.F05(r1)
        L_0x00ba:
            r3.setTextSize(r8)
        L_0x00bd:
            X.4dQ r12 = r6.A05
            if (r12 != 0) goto L_0x00c9
            X.5hl r1 = r6.A06
            if (r1 != 0) goto L_0x00c9
            X.5ZD r1 = r6.A08
            if (r1 == 0) goto L_0x00ee
        L_0x00c9:
            X.5ZD r10 = r6.A08
            if (r10 != 0) goto L_0x00cf
            X.5ZD r10 = X.AnonymousClass5ZD.A04
        L_0x00cf:
            X.5hl r1 = r6.A06
            if (r1 == 0) goto L_0x0121
            int r1 = r1.A00
        L_0x00d5:
            X.5hl r8 = new X.5hl
            r8.<init>(r1)
            X.5hm r1 = r6.A07
            if (r1 == 0) goto L_0x011f
            int r2 = r1.A00
        L_0x00e0:
            X.5hm r1 = new X.5hm
            r1.<init>(r2)
            java.lang.Object r1 = r11.invoke(r12, r10, r8, r1)
            android.graphics.Typeface r1 = (android.graphics.Typeface) r1
            r3.setTypeface(r1)
        L_0x00ee:
            if (r7 == 0) goto L_0x0185
            X.5Ud r1 = X.C286155Ud.A02
            X.5hr r1 = X.C291755hp.A00
            X.5Ud r1 = r1.Atj()
            boolean r1 = r7.equals(r1)
            if (r1 != 0) goto L_0x0185
            r1 = 10
            int r1 = X.0Yv.A1E(r7, r1)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r1)
            java.util.Iterator r7 = r7.iterator()
        L_0x010d:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L_0x016e
            java.lang.Object r1 = r7.next()
            X.5hs r1 = (X.C291785hs) r1
            java.util.Locale r1 = r1.A00
            r2.add(r1)
            goto L_0x010d
        L_0x011f:
            r2 = 1
            goto L_0x00e0
        L_0x0121:
            r1 = 0
            goto L_0x00d5
        L_0x0123:
            r12 = 8589934592(0x200000000, double:4.243991582E-314)
            int r8 = (r19 > r12 ? 1 : (r19 == r12 ? 0 : -1))
            if (r8 != 0) goto L_0x00bd
            float r8 = r3.getTextSize()
            float r1 = X.AnonymousClass5Z5.A00(r1)
            float r8 = r8 * r1
            goto L_0x00ba
        L_0x0136:
            r3.getFlags()
            r2 = 1
            goto L_0x0099
        L_0x013c:
            if (r11 == r10) goto L_0x014a
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r11 == r1) goto L_0x014a
            java.lang.String r1 = "Invalid TextDirection."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x014a:
            if (r7 == 0) goto L_0x0158
            java.util.List r1 = r7.A01
            java.lang.Object r1 = r1.get(r5)
            X.5hs r1 = (X.C291785hs) r1
            java.util.Locale r1 = r1.A00
            if (r1 != 0) goto L_0x015c
        L_0x0158:
            java.util.Locale r1 = java.util.Locale.getDefault()
        L_0x015c:
            int r1 = android.text.TextUtils.getLayoutDirectionFromLocale(r1)
            if (r1 == 0) goto L_0x0164
            if (r1 == r9) goto L_0x0167
        L_0x0164:
            r8 = 2
            goto L_0x006f
        L_0x0167:
            r8 = 3
            goto L_0x006f
        L_0x016a:
            X.5i3 r1 = X.VJH.A00
            goto L_0x004e
        L_0x016e:
            java.util.Locale[] r1 = new java.util.Locale[r5]
            java.lang.Object[] r2 = r2.toArray(r1)
            java.util.Locale[] r2 = (java.util.Locale[]) r2
            int r1 = r2.length
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r1)
            java.util.Locale[] r2 = (java.util.Locale[]) r2
            android.os.LocaleList r1 = new android.os.LocaleList
            r1.<init>(r2)
            r3.setTextLocales(r1)
        L_0x0185:
            java.lang.String r2 = r6.A0E
            if (r2 == 0) goto L_0x0194
            java.lang.String r1 = ""
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L_0x0194
            r3.setFontFeatureSettings(r2)
        L_0x0194:
            X.5ho r7 = r6.A0D
            if (r7 == 0) goto L_0x01b4
            X.5ho r1 = X.C291745ho.A02
            boolean r1 = r7.equals(r1)
            if (r1 != 0) goto L_0x01b4
            float r2 = r3.getTextScaleX()
            float r1 = r7.A00
            float r2 = r2 * r1
            r3.setTextScaleX(r2)
            float r2 = r3.getTextSkewX()
            float r1 = r7.A01
            float r2 = r2 + r1
            r3.setTextSkewX(r2)
        L_0x01b4:
            X.5ZA r7 = r6.A0C
            long r1 = r7.Aoz()
            r3.A02(r1)
            X.6Ff r8 = r7.AiJ()
            r1 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            float r7 = r7.AbF()
            r3.A03(r8, r7, r1)
            X.5hu r1 = r6.A03
            r3.A04(r1)
            X.5ht r1 = r6.A0B
            r3.A06(r1)
            X.5dx r1 = r6.A04
            r3.A05(r1)
            long r1 = r6.A02
            long r12 = X.AnonymousClass5Z5.A01(r1)
            int r7 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r7 != 0) goto L_0x076b
            float r7 = X.AnonymousClass5Z5.A00(r1)
            r10 = 0
            int r7 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r7 == 0) goto L_0x076b
            float r8 = r3.getTextSize()
            float r7 = r3.getTextScaleX()
            float r8 = r8 * r7
            float r7 = r4.F05(r1)
            int r4 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r4 == 0) goto L_0x0204
            float r7 = r7 / r8
        L_0x0201:
            r3.setLetterSpacing(r7)
        L_0x0204:
            long r3 = r6.A00
            X.5hn r10 = r6.A0A
            r15 = 1
            if (r21 == 0) goto L_0x021d
            long r7 = X.AnonymousClass5Z5.A01(r1)
            int r6 = (r7 > r16 ? 1 : (r7 == r16 ? 0 : -1))
            if (r6 != 0) goto L_0x021d
            float r7 = X.AnonymousClass5Z5.A00(r1)
            r6 = 0
            int r6 = (r7 > r6 ? 1 : (r7 == r6 ? 0 : -1))
            r14 = 1
            if (r6 != 0) goto L_0x021e
        L_0x021d:
            r14 = 0
        L_0x021e:
            long r12 = X.AnonymousClass5RW.A08
            int r6 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r6 == 0) goto L_0x022b
            long r7 = X.AnonymousClass5RW.A07
            int r6 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            r8 = 1
            if (r6 != 0) goto L_0x022c
        L_0x022b:
            r8 = 0
        L_0x022c:
            if (r10 == 0) goto L_0x0237
            float r7 = r10.A00
            r6 = 0
            int r6 = java.lang.Float.compare(r7, r6)
            if (r6 != 0) goto L_0x0238
        L_0x0237:
            r15 = 0
        L_0x0238:
            r21 = 0
            if (r14 != 0) goto L_0x0711
            if (r8 != 0) goto L_0x070f
            if (r15 != 0) goto L_0x070f
        L_0x0240:
            java.lang.String r7 = r0.A08
            X.5hz r1 = r0.A05
            float r8 = r1.getTextSize()
            X.5Z4 r6 = r0.A02
            java.util.List r1 = r0.A09
            r36 = r1
            X.4cd r1 = r0.A07
            r35 = r1
            boolean r2 = r0.A0B
            X.5i8 r1 = X.C291935i7.A00
            if (r2 == 0) goto L_0x070c
            X.Tnu r1 = X.C13993Tnu.A09
            if (r1 == 0) goto L_0x070c
            X.Tnu r2 = X.C13993Tnu.A00()
            int r1 = r7.length()
            java.lang.CharSequence r1 = r2.A02(r7, r5, r1)
            X.0qQ.A0A(r1)
        L_0x026b:
            boolean r2 = r18.isEmpty()
            if (r2 == 0) goto L_0x0299
            boolean r2 = r36.isEmpty()
            if (r2 == 0) goto L_0x0299
            X.5ZC r4 = r6.A00
            X.5hv r3 = r4.A06
            X.5hv r2 = X.C291815hv.A02
            boolean r2 = X.0qQ.A0K(r3, r2)
            if (r2 == 0) goto L_0x0299
            long r2 = r4.A04
            boolean r2 = X.AnonymousClass5Z7.A02(r2)
            if (r2 == 0) goto L_0x0299
        L_0x028b:
            r0.A06 = r1
            X.5hz r4 = r0.A05
            int r3 = r0.A01
            X.5iA r2 = new X.5iA
            r2.<init>(r4, r1, r3)
            r0.A03 = r2
            return
        L_0x0299:
            boolean r2 = r1 instanceof android.text.Spannable
            if (r2 != 0) goto L_0x02a3
            android.text.SpannableString r2 = new android.text.SpannableString
            r2.<init>(r1)
            r1 = r2
        L_0x02a3:
            android.text.Spannable r1 = (android.text.Spannable) r1
            X.5ZB r4 = r6.A02
            X.5ht r3 = r4.A0B
            X.5ht r2 = X.C291795ht.A03
            boolean r2 = X.0qQ.A0K(r3, r2)
            if (r2 == 0) goto L_0x02bc
            X.5i8 r10 = X.C291935i7.A00
            int r3 = r7.length()
            r2 = 33
            r1.setSpan(r10, r5, r3, r2)
        L_0x02bc:
            X.5ZC r10 = r6.A00
            long r6 = r10.A04
            long r14 = X.AnonymousClass5Z5.A01(r6)
            int r2 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r2 != 0) goto L_0x03e0
            float r2 = r35.B77()
            double r2 = (double) r2
            r13 = 4607407598781385933(0x3ff0cccccccccccd, double:1.05)
            int r12 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            r2 = r35
            if (r12 <= 0) goto L_0x03da
            long r2 = r2.FHA(r8)
            float r23 = X.AnonymousClass5Z5.A00(r6)
            float r2 = X.AnonymousClass5Z5.A00(r2)
            float r23 = r23 / r2
        L_0x02e6:
            float r23 = r23 * r8
        L_0x02e8:
            boolean r2 = java.lang.Float.isNaN(r23)
            if (r2 != 0) goto L_0x0316
            int r2 = r1.length()
            if (r2 == 0) goto L_0x03d2
            char r3 = X.00R.A00(r1)
            r2 = 10
            if (r3 == r2) goto L_0x03d2
            int r25 = r1.length()
        L_0x0300:
            r24 = -1082130432(0xffffffffbf800000, float:-1.0)
            X.5i9 r2 = new X.5i9
            r22 = r2
            r26 = r9
            r27 = r9
            r22.<init>(r23, r24, r25, r26, r27)
            int r6 = r1.length()
            r3 = 33
            r1.setSpan(r2, r5, r6, r3)
        L_0x0316:
            X.5hv r10 = r10.A06
            if (r10 == 0) goto L_0x032e
            long r2 = r10.A00
            long r12 = X.AnonymousClass5Z7.A01(r5)
            int r6 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r6 != 0) goto L_0x0365
            long r6 = r10.A01
            long r13 = X.AnonymousClass5Z7.A01(r5)
            int r12 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
            if (r12 != 0) goto L_0x0365
        L_0x032e:
            int r2 = r18.size()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>(r2)
            int r10 = r18.size()
            r8 = 0
        L_0x033c:
            if (r8 >= r10) goto L_0x03f3
            r2 = r18
            java.lang.Object r12 = r2.get(r8)
            r6 = r12
            X.62b r6 = (X.C3022062b) r6
            java.lang.Object r3 = r6.A02
            X.5ZB r3 = (X.AnonymousClass5ZB) r3
            X.4dQ r2 = r3.A05
            if (r2 != 0) goto L_0x035f
            X.5hl r2 = r3.A06
            if (r2 != 0) goto L_0x035f
            X.5ZD r2 = r3.A08
            if (r2 != 0) goto L_0x035f
            java.lang.Object r2 = r6.A02
            X.5ZB r2 = (X.AnonymousClass5ZB) r2
            X.5hm r2 = r2.A07
            if (r2 == 0) goto L_0x0362
        L_0x035f:
            r7.add(r12)
        L_0x0362:
            int r8 = r8 + 1
            goto L_0x033c
        L_0x0365:
            boolean r6 = X.AnonymousClass5Z7.A02(r2)
            if (r6 != 0) goto L_0x032e
            long r6 = r10.A01
            boolean r10 = X.AnonymousClass5Z7.A02(r6)
            if (r10 != 0) goto L_0x032e
            long r19 = X.AnonymousClass5Z5.A01(r2)
            int r10 = (r19 > r16 ? 1 : (r19 == r16 ? 0 : -1))
            r12 = 0
            if (r10 != 0) goto L_0x037d
            r12 = 1
        L_0x037d:
            r10 = 0
            if (r12 == 0) goto L_0x03c1
            r12 = r35
            float r3 = r12.F05(r2)
        L_0x0386:
            long r14 = X.AnonymousClass5Z5.A01(r6)
            int r2 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r2 != 0) goto L_0x03b2
            r2 = r35
            float r10 = r2.F05(r6)
        L_0x0394:
            double r2 = (double) r3
            double r2 = java.lang.Math.ceil(r2)
            float r6 = (float) r2
            int r7 = (int) r6
            double r2 = (double) r10
            double r2 = java.lang.Math.ceil(r2)
            float r6 = (float) r2
            int r2 = (int) r6
            android.text.style.LeadingMarginSpan$Standard r6 = new android.text.style.LeadingMarginSpan$Standard
            r6.<init>(r7, r2)
            int r3 = r1.length()
            r2 = 33
            r1.setSpan(r6, r5, r3, r2)
            goto L_0x032e
        L_0x03b2:
            r12 = 8589934592(0x200000000, double:4.243991582E-314)
            int r2 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r2 != 0) goto L_0x0394
            float r10 = X.AnonymousClass5Z5.A00(r6)
            float r10 = r10 * r8
            goto L_0x0394
        L_0x03c1:
            r13 = 8589934592(0x200000000, double:4.243991582E-314)
            int r12 = (r19 > r13 ? 1 : (r19 == r13 ? 0 : -1))
            if (r12 != 0) goto L_0x03d0
            float r3 = X.AnonymousClass5Z5.A00(r2)
            float r3 = r3 * r8
            goto L_0x0386
        L_0x03d0:
            r3 = 0
            goto L_0x0386
        L_0x03d2:
            int r2 = r1.length()
            int r25 = r2 + 1
            goto L_0x0300
        L_0x03da:
            float r23 = r2.F05(r6)
            goto L_0x02e8
        L_0x03e0:
            r12 = 8589934592(0x200000000, double:4.243991582E-314)
            int r2 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r2 != 0) goto L_0x03ef
            float r23 = X.AnonymousClass5Z5.A00(r6)
            goto L_0x02e6
        L_0x03ef:
            r23 = 2143289344(0x7fc00000, float:NaN)
            goto L_0x02e8
        L_0x03f3:
            X.4dQ r10 = r4.A05
            if (r10 != 0) goto L_0x05ff
            X.5hl r2 = r4.A06
            if (r2 != 0) goto L_0x05ff
            X.5ZD r2 = r4.A08
            if (r2 != 0) goto L_0x05ff
            X.5hm r2 = r4.A07
            if (r2 != 0) goto L_0x05ff
            r8 = 0
        L_0x0404:
            X.9M2 r12 = new X.9M2
            r12.<init>(r5, r1, r11)
            int r2 = r7.size()
            if (r2 > r9) goto L_0x0571
            boolean r2 = r7.isEmpty()
            r2 = r2 ^ 1
            if (r2 == 0) goto L_0x0442
            java.lang.Object r2 = r7.get(r5)
            X.62b r2 = (X.C3022062b) r2
            java.lang.Object r4 = r2.A02
            X.5ZB r4 = (X.AnonymousClass5ZB) r4
            if (r8 == 0) goto L_0x0427
            X.5ZB r4 = r8.A00(r4)
        L_0x0427:
            java.lang.Object r2 = r7.get(r5)
            X.62b r2 = (X.C3022062b) r2
            int r2 = r2.A01
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            java.lang.Object r2 = r7.get(r5)
            X.62b r2 = (X.C3022062b) r2
            int r2 = r2.A00
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r12.invoke(r4, r3, r2)
        L_0x0442:
            int r10 = r18.size()
            r9 = 0
            r8 = 0
            r14 = 0
        L_0x0449:
            if (r8 >= r10) goto L_0x0621
            r2 = r18
            java.lang.Object r7 = r2.get(r8)
            X.62b r7 = (X.C3022062b) r7
            int r4 = r7.A01
            int r3 = r7.A00
            if (r4 < 0) goto L_0x055b
            int r2 = r1.length()
            if (r4 >= r2) goto L_0x055b
            if (r3 <= r4) goto L_0x055b
            int r2 = r1.length()
            if (r3 > r2) goto L_0x055b
            int r6 = r7.A01
            int r5 = r7.A00
            java.lang.Object r4 = r7.A02
            X.5ZB r4 = (X.AnonymousClass5ZB) r4
            X.5hn r2 = r4.A0A
            if (r2 == 0) goto L_0x047f
            float r2 = r2.A00
            X.5iO r3 = new X.5iO
            r3.<init>(r2)
            r2 = 33
            r1.setSpan(r3, r6, r5, r2)
        L_0x047f:
            X.5ZA r11 = r4.A0C
            long r2 = r11.Aoz()
            X.AnonymousClass6BU.A00(r1, r6, r5, r2)
            X.6Ff r12 = r11.AiJ()
            float r11 = r11.AbF()
            if (r12 == 0) goto L_0x049d
            boolean r2 = r12 instanceof X.C304776Fe
            if (r2 == 0) goto L_0x055f
            X.6Fe r12 = (X.C304776Fe) r12
            long r2 = r12.A00
            X.AnonymousClass6BU.A00(r1, r6, r5, r2)
        L_0x049d:
            X.5ht r2 = r4.A0B
            if (r2 == 0) goto L_0x04b9
            int r12 = r2.A00
            r2 = r12 | 1
            r11 = 0
            if (r2 != r12) goto L_0x04a9
            r11 = 1
        L_0x04a9:
            r3 = r12 | 2
            r2 = 0
            if (r3 != r12) goto L_0x04af
            r2 = 1
        L_0x04af:
            X.U29 r3 = new X.U29
            r3.<init>(r11, r2)
            r2 = 33
            r1.setSpan(r3, r6, r5, r2)
        L_0x04b9:
            long r2 = r4.A01
            r19 = r1
            r20 = r35
            r21 = r6
            r22 = r5
            r23 = r2
            X.AnonymousClass6BU.A02(r19, r20, r21, r22, r23)
            java.lang.String r2 = r4.A0E
            if (r2 == 0) goto L_0x04d6
            X.U2P r3 = new X.U2P
            r3.<init>(r2)
            r2 = 33
            r1.setSpan(r3, r6, r5, r2)
        L_0x04d6:
            X.5ho r12 = r4.A0D
            if (r12 == 0) goto L_0x04f0
            float r3 = r12.A00
            android.text.style.ScaleXSpan r2 = new android.text.style.ScaleXSpan
            r2.<init>(r3)
            r11 = 33
            r1.setSpan(r2, r6, r5, r11)
            float r3 = r12.A01
            X.U2Q r2 = new X.U2Q
            r2.<init>(r3)
            r1.setSpan(r2, r6, r5, r11)
        L_0x04f0:
            X.5Ud r2 = r4.A09
            X.AnonymousClass6BU.A01(r1, r2, r6, r5)
            long r2 = r4.A00
            r12 = 16
            int r11 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r11 == 0) goto L_0x050b
            int r2 = X.C285595Rx.A00(r2)
            android.text.style.BackgroundColorSpan r3 = new android.text.style.BackgroundColorSpan
            r3.<init>(r2)
            r2 = 33
            r1.setSpan(r3, r6, r5, r2)
        L_0x050b:
            X.5hu r11 = r4.A03
            if (r11 == 0) goto L_0x0531
            long r2 = r11.A01
            int r13 = X.C285595Rx.A00(r2)
            long r2 = r11.A02
            float r12 = X.C289295dM.A01(r2)
            float r2 = X.C289295dM.A02(r2)
            float r11 = r11.A00
            r3 = 0
            int r3 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r3 != 0) goto L_0x0527
            r11 = 1
        L_0x0527:
            X.U2A r3 = new X.U2A
            r3.<init>(r12, r2, r11, r13)
            r2 = 33
            r1.setSpan(r3, r6, r5, r2)
        L_0x0531:
            X.5dx r2 = r4.A04
            if (r2 == 0) goto L_0x053f
            X.Gd7 r3 = new X.Gd7
            r3.<init>(r2)
            r2 = 33
            r1.setSpan(r3, r6, r5, r2)
        L_0x053f:
            java.lang.Object r2 = r7.A02
            X.5ZB r2 = (X.AnonymousClass5ZB) r2
            long r2 = r2.A02
            long r5 = X.AnonymousClass5Z5.A01(r2)
            int r4 = (r5 > r16 ? 1 : (r5 == r16 ? 0 : -1))
            if (r4 == 0) goto L_0x055a
            long r5 = X.AnonymousClass5Z5.A01(r2)
            r3 = 8589934592(0x200000000, double:4.243991582E-314)
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 != 0) goto L_0x055b
        L_0x055a:
            r14 = 1
        L_0x055b:
            int r8 = r8 + 1
            goto L_0x0449
        L_0x055f:
            boolean r2 = r12 instanceof X.C298605tj
            if (r2 == 0) goto L_0x049d
            X.5tj r12 = (X.C298605tj) r12
            X.5iV r3 = new X.5iV
            r3.<init>(r12, r11)
            r2 = 33
            r1.setSpan(r3, r6, r5, r2)
            goto L_0x049d
        L_0x0571:
            int r10 = r7.size()
            int r13 = r10 * 2
            java.lang.Integer[] r11 = new java.lang.Integer[r13]
            r3 = 0
        L_0x057a:
            if (r3 >= r13) goto L_0x0585
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)
            r11[r3] = r2
            int r3 = r3 + 1
            goto L_0x057a
        L_0x0585:
            int r5 = r7.size()
            r4 = 0
        L_0x058a:
            if (r4 >= r5) goto L_0x05a7
            java.lang.Object r6 = r7.get(r4)
            X.62b r6 = (X.C3022062b) r6
            int r2 = r6.A01
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r11[r4] = r2
            int r3 = r4 + r10
            int r2 = r6.A00
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r11[r3] = r2
            int r4 = r4 + 1
            goto L_0x058a
        L_0x05a7:
            if (r13 <= r9) goto L_0x05ac
            java.util.Arrays.sort(r11)
        L_0x05ac:
            java.lang.Object r2 = X.03t.A05(r11)
            java.lang.Number r2 = (java.lang.Number) r2
            int r15 = r2.intValue()
            r14 = 0
        L_0x05b7:
            if (r14 >= r13) goto L_0x0442
            r2 = r11[r14]
            int r10 = r2.intValue()
            if (r10 == r15) goto L_0x05fc
            int r9 = r7.size()
            r2 = r8
            r6 = 0
        L_0x05c7:
            if (r6 >= r9) goto L_0x05ee
            java.lang.Object r5 = r7.get(r6)
            X.62b r5 = (X.C3022062b) r5
            int r4 = r5.A01
            int r3 = r5.A00
            if (r4 == r3) goto L_0x05e6
            int r4 = r5.A01
            int r3 = r5.A00
            boolean r3 = X.C3021962a.A02(r15, r10, r4, r3)
            if (r3 == 0) goto L_0x05e6
            java.lang.Object r3 = r5.A02
            X.5ZB r3 = (X.AnonymousClass5ZB) r3
            if (r2 != 0) goto L_0x05e9
            r2 = r3
        L_0x05e6:
            int r6 = r6 + 1
            goto L_0x05c7
        L_0x05e9:
            X.5ZB r2 = r2.A00(r3)
            goto L_0x05e6
        L_0x05ee:
            if (r2 == 0) goto L_0x05fb
            java.lang.Integer r4 = java.lang.Integer.valueOf(r15)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r10)
            r12.invoke(r2, r4, r3)
        L_0x05fb:
            r15 = r10
        L_0x05fc:
            int r14 = r14 + 1
            goto L_0x05b7
        L_0x05ff:
            X.5ZD r6 = r4.A08
            X.5hl r3 = r4.A06
            X.5hm r2 = r4.A07
            r29 = 0
            r28 = 65475(0xffc3, float:9.175E-41)
            X.5ZB r8 = new X.5ZB
            r22 = r8
            r23 = r10
            r24 = r3
            r25 = r2
            r26 = r6
            r27 = r21
            r31 = r29
            r33 = r29
            r22.<init>(r23, r24, r25, r26, r27, r28, r29, r31, r33)
            goto L_0x0404
        L_0x0621:
            if (r14 == 0) goto L_0x0679
            int r8 = r18.size()
        L_0x0627:
            if (r9 >= r8) goto L_0x0679
            r2 = r18
            java.lang.Object r2 = r2.get(r9)
            X.62b r2 = (X.C3022062b) r2
            int r10 = r2.A01
            int r7 = r2.A00
            java.lang.Object r3 = r2.A02
            X.5ZB r3 = (X.AnonymousClass5ZB) r3
            if (r10 < 0) goto L_0x0663
            int r2 = r1.length()
            if (r10 >= r2) goto L_0x0663
            if (r7 <= r10) goto L_0x0663
            int r2 = r1.length()
            if (r7 > r2) goto L_0x0663
            long r2 = r3.A02
            long r11 = X.AnonymousClass5Z5.A01(r2)
            int r4 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1))
            if (r4 != 0) goto L_0x0666
            r4 = r35
            float r3 = r4.F05(r2)
            X.5iF r2 = new X.5iF
            r2.<init>(r3)
        L_0x065e:
            r3 = 33
            r1.setSpan(r2, r10, r7, r3)
        L_0x0663:
            int r9 = r9 + 1
            goto L_0x0627
        L_0x0666:
            r5 = 8589934592(0x200000000, double:4.243991582E-314)
            int r4 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r4 != 0) goto L_0x0663
            float r3 = X.AnonymousClass5Z5.A00(r2)
            X.5iG r2 = new X.5iG
            r2.<init>(r3)
            goto L_0x065e
        L_0x0679:
            int r7 = r36.size()
            r6 = 0
        L_0x067e:
            if (r6 >= r7) goto L_0x028b
            r2 = r36
            java.lang.Object r2 = r2.get(r6)
            X.62b r2 = (X.C3022062b) r2
            java.lang.Object r8 = r2.A02
            X.GQa r8 = (X.GQa) r8
            int r5 = r2.A01
            int r4 = r2.A00
            java.lang.Class<X.5wK> r2 = X.C299975wK.class
            java.lang.Object[] r10 = r1.getSpans(r5, r4, r2)
            int r9 = r10.length
            r3 = 0
        L_0x0698:
            if (r3 >= r9) goto L_0x06a2
            r2 = r10[r3]
            r1.removeSpan(r2)
            int r3 = r3 + 1
            goto L_0x0698
        L_0x06a2:
            long r2 = r8.A02
            float r19 = X.AnonymousClass5Z5.A00(r2)
            long r11 = X.AnonymousClass5Z5.A01(r2)
            int r2 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1))
            if (r2 != 0) goto L_0x06fe
            r22 = 0
        L_0x06b2:
            long r2 = r8.A01
            float r20 = X.AnonymousClass5Z5.A00(r2)
            long r11 = X.AnonymousClass5Z5.A01(r2)
            int r2 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1))
            if (r2 != 0) goto L_0x06f0
            r23 = 0
        L_0x06c2:
            float r21 = r35.B77()
            float r2 = r35.AwL()
            float r21 = r21 * r2
            int r3 = r8.A00
            r2 = 4
            if (r3 != r2) goto L_0x06e2
            r24 = 3
        L_0x06d3:
            X.5iW r3 = new X.5iW
            r18 = r3
            r18.<init>(r19, r20, r21, r22, r23, r24)
            r2 = 33
            r1.setSpan(r3, r5, r4, r2)
            int r6 = r6 + 1
            goto L_0x067e
        L_0x06e2:
            r2 = 5
            if (r3 != r2) goto L_0x06e8
            r24 = 4
            goto L_0x06d3
        L_0x06e8:
            r2 = 6
            r24 = 6
            if (r3 != r2) goto L_0x06d3
            r24 = 5
            goto L_0x06d3
        L_0x06f0:
            r9 = 8589934592(0x200000000, double:4.243991582E-314)
            int r2 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            r23 = 2
            if (r2 != 0) goto L_0x06c2
            r23 = 1
            goto L_0x06c2
        L_0x06fe:
            r9 = 8589934592(0x200000000, double:4.243991582E-314)
            int r2 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            r22 = 2
            if (r2 != 0) goto L_0x06b2
            r22 = 1
            goto L_0x06b2
        L_0x070c:
            r1 = r7
            goto L_0x026b
        L_0x070f:
            long r1 = X.AnonymousClass5Z5.A01
        L_0x0711:
            if (r8 != 0) goto L_0x0714
            r3 = r12
        L_0x0714:
            r28 = r21
            if (r15 == 0) goto L_0x071a
            r28 = r10
        L_0x071a:
            long r33 = X.AnonymousClass5Z5.A01
            X.5ZA r30 = X.AnonymousClass5Z8.A00(r12)
            X.5ZB r6 = new X.5ZB
            r20 = r6
            r22 = r21
            r23 = r21
            r24 = r21
            r25 = r21
            r26 = r21
            r27 = r21
            r29 = r21
            r31 = r21
            r32 = r21
            r35 = r1
            r37 = r3
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r35, r37)
            int r1 = r18.size()
            int r3 = r1 + 1
            java.util.ArrayList r18 = new java.util.ArrayList
            r1 = r18
            r1.<init>(r3)
            r4 = 0
        L_0x074b:
            if (r4 >= r3) goto L_0x0240
            if (r4 != 0) goto L_0x0762
            java.lang.String r1 = r0.A08
            int r1 = r1.length()
            X.62b r2 = new X.62b
            r2.<init>(r6, r5, r1)
        L_0x075a:
            r1 = r18
            r1.add(r2)
            int r4 = r4 + 1
            goto L_0x074b
        L_0x0762:
            java.util.List r2 = r0.A0A
            int r1 = r4 + -1
            java.lang.Object r2 = r2.get(r1)
            goto L_0x075a
        L_0x076b:
            long r12 = X.AnonymousClass5Z5.A01(r1)
            r7 = 8589934592(0x200000000, double:4.243991582E-314)
            int r4 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r4 != 0) goto L_0x0204
            float r7 = X.AnonymousClass5Z5.A00(r1)
            goto L_0x0201
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C291835hx.<init>(X.5Z4, X.5Uu, X.4cd, java.lang.String, java.util.List, java.util.List):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean BC8() {
        /*
            r3 = this;
            X.A8n r0 = r3.A00
            r2 = 0
            if (r0 == 0) goto L_0x000b
            boolean r0 = r0.A00()
            if (r0 != 0) goto L_0x0030
        L_0x000b:
            boolean r0 = r3.A0B
            if (r0 != 0) goto L_0x0031
            X.5i1 r1 = X.C291865i0.A00
            X.5i2 r1 = (X.C291885i2) r1
            X.4gU r0 = r1.A00
            if (r0 != 0) goto L_0x0021
            X.Tnu r0 = X.C13993Tnu.A09
            if (r0 == 0) goto L_0x0032
            X.4gU r0 = X.C291885i2.A00(r1)
            r1.A00 = r0
        L_0x0021:
            X.0qQ.A0A(r0)
        L_0x0024:
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0031
        L_0x0030:
            r2 = 1
        L_0x0031:
            return r2
        L_0x0032:
            X.5i3 r0 = X.VJH.A00
            goto L_0x0024
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C291835hx.BC8():boolean");
    }

    public final float BP9() {
        return this.A03.A00();
    }

    public final float BT7() {
        C291965iA r6 = this.A03;
        float f = r6.A00;
        if (Float.isNaN(f)) {
            CharSequence charSequence = r6.A06;
            TextPaint textPaint = r6.A05;
            BreakIterator lineInstance = BreakIterator.getLineInstance(textPaint.getTextLocale());
            lineInstance.setText(new TLX(charSequence, charSequence.length()));
            PriorityQueue priorityQueue = new PriorityQueue(10, new ArC());
            int next = lineInstance.next();
            int i = next;
            int i2 = 0;
            while (next != -1) {
                if (priorityQueue.size() >= 10) {
                    0eP r2 = (0eP) priorityQueue.peek();
                    if (r2 != null && ((Number) r2.A01).intValue() - ((Number) r2.A00).intValue() < next - i2) {
                        priorityQueue.poll();
                    }
                    next = lineInstance.next();
                    i2 = i;
                    i = next;
                }
                priorityQueue.add(new 0eP(Integer.valueOf(i2), Integer.valueOf(next)));
                next = lineInstance.next();
                i2 = i;
                i = next;
            }
            f = 0.0f;
            Iterator it = priorityQueue.iterator();
            while (it.hasNext()) {
                0eP r22 = (0eP) it.next();
                f = Math.max(f, Layout.getDesiredWidth(charSequence, ((Number) r22.A00).intValue(), ((Number) r22.A01).intValue(), textPaint));
            }
            r6.A00 = f;
        }
        return f;
    }
}
