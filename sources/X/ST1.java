package X;

import android.text.SpannableStringBuilder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

public final class ST1 {
    public List A00;
    public final long A01;
    public final long A02;
    public final ST1 A03;
    public final C10968S3a A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final boolean A09;
    public final String[] A0A;
    public final HashMap A0B = AnonymousClass7TE.A1E();
    public final HashMap A0C = AnonymousClass7TE.A1E();

    public static void A02(ST1 st1, String str, Map map, long j, boolean z) {
        int size;
        boolean z2;
        String str2 = str;
        HashMap hashMap = st1.A0C;
        hashMap.clear();
        HashMap hashMap2 = st1.A0B;
        hashMap2.clear();
        String str3 = st1.A07;
        if (!"metadata".equals(str3)) {
            String str4 = st1.A06;
            if (!"".equals(str4)) {
                str2 = str4;
            }
            Map map2 = map;
            if (st1.A09 && z) {
                SpannableStringBuilder A002 = A00(str2, map);
                String str5 = st1.A08;
                str5.getClass();
                A002.append(str5);
            } else if (!"br".equals(str3) || !z) {
                long j2 = j;
                if (st1.A06(j)) {
                    Iterator A0u = AnonymousClass7TF.A0u(map);
                    while (A0u.hasNext()) {
                        Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
                        Object key = A1J.getKey();
                        CharSequence charSequence = ((S3W) A1J.getValue()).A0E;
                        charSequence.getClass();
                        C66581MXm.A1S(key, hashMap, charSequence.length());
                    }
                    boolean equals = "p".equals(str3);
                    int i = 0;
                    while (true) {
                        List list = st1.A00;
                        if (list == null) {
                            size = 0;
                        } else {
                            size = list.size();
                        }
                        if (i >= size) {
                            break;
                        }
                        ST1 A052 = st1.A05(i);
                        if (!z) {
                            z2 = false;
                            if (!equals) {
                                A02(A052, str2, map2, j2, z2);
                                i++;
                            }
                        }
                        z2 = true;
                        A02(A052, str2, map2, j2, z2);
                        i++;
                    }
                    if (equals) {
                        SpannableStringBuilder A003 = A00(str2, map);
                        int length = A003.length();
                        while (true) {
                            length--;
                            if (length < 0) {
                                break;
                            } else if (A003.charAt(length) != ' ') {
                                if (A003.charAt(length) != 10) {
                                    A003.append(10);
                                }
                            }
                        }
                    }
                    Iterator A0u2 = AnonymousClass7TF.A0u(map);
                    while (A0u2.hasNext()) {
                        Map.Entry A1J2 = AnonymousClass7TE.A1J(A0u2);
                        Object key2 = A1J2.getKey();
                        CharSequence charSequence2 = ((S3W) A1J2.getValue()).A0E;
                        charSequence2.getClass();
                        C66581MXm.A1S(key2, hashMap2, charSequence2.length());
                    }
                }
            } else {
                A00(str2, map).append(10);
            }
        }
    }

    public static void A01(ST1 st1, String str, List list, long j) {
        int size;
        String str2;
        String str3 = st1.A06;
        if (!"".equals(str3)) {
            str = str3;
        }
        if (!st1.A06(j) || !"div".equals(st1.A07) || (str2 = st1.A05) == null) {
            int i = 0;
            while (true) {
                List list2 = st1.A00;
                if (list2 == null) {
                    size = 0;
                } else {
                    size = list2.size();
                }
                if (i < size) {
                    A01(st1.A05(i), str, list, j);
                    i++;
                } else {
                    return;
                }
            }
        } else {
            list.add(Pxe.A0K(str, str2));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:103:0x01aa, code lost:
        if (r14 == -1) goto L_0x01ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00da, code lost:
        if (r13 == 1) goto L_0x00dc;
     */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x0020 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0124  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A03(X.ST1 r22, java.lang.String r23, java.util.Map r24, java.util.Map r25, java.util.Map r26, long r27) {
        /*
            r11 = r22
            r21 = r27
            r0 = r21
            boolean r0 = r11.A06(r0)
            if (r0 == 0) goto L_0x0218
            java.lang.String r0 = r11.A06
            r20 = r0
            java.lang.String r1 = ""
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x001a
            r20 = r23
        L_0x001a:
            java.util.HashMap r0 = r11.A0B
            java.util.Iterator r18 = X.AnonymousClass7TF.A0s(r0)
        L_0x0020:
            boolean r0 = r18.hasNext()
            r9 = 0
            r10 = r24
            r4 = r25
            r5 = r26
            if (r0 == 0) goto L_0x020b
            java.util.Map$Entry r3 = X.AnonymousClass7TE.A1J(r18)
            java.lang.Object r2 = r3.getKey()
            java.util.HashMap r1 = r11.A0C
            boolean r0 = r1.containsKey(r2)
            if (r0 == 0) goto L_0x0045
            java.lang.Object r0 = r1.get(r2)
            int r9 = X.AnonymousClass7TE.A0M(r0)
        L_0x0045:
            int r12 = X.C66582MXn.A08(r3)
            if (r9 == r12) goto L_0x0020
            java.lang.Object r8 = X.Pxe.A0r(r2, r5)
            X.S3W r8 = (X.S3W) r8
            r0 = r20
            java.lang.Object r0 = X.Pxe.A0r(r0, r4)
            X.Ryi r0 = (X.C10822Ryi) r0
            int r13 = r0.A08
            X.S3a r1 = r11.A04
            java.lang.String[] r0 = r11.A0A
            X.S3a r7 = X.RS5.A00(r1, r10, r0)
            java.lang.CharSequence r6 = r8.A0E
            android.text.SpannableStringBuilder r6 = (android.text.SpannableStringBuilder) r6
            if (r6 != 0) goto L_0x0070
            android.text.SpannableStringBuilder r6 = new android.text.SpannableStringBuilder
            r6.<init>()
            r8.A0E = r6
        L_0x0070:
            if (r7 == 0) goto L_0x0020
            X.ST1 r5 = r11.A03
            int r1 = r7.A03
            r4 = -1
            if (r1 != r4) goto L_0x01ef
            int r0 = r7.A06
            if (r0 != r4) goto L_0x01ef
            r1 = -1
        L_0x007e:
            r3 = 33
            if (r1 == r4) goto L_0x008a
            android.text.style.StyleSpan r0 = new android.text.style.StyleSpan
            r0.<init>(r1)
            r6.setSpan(r0, r9, r12, r3)
        L_0x008a:
            int r0 = r7.A07
            r15 = 1
            if (r0 != r15) goto L_0x0097
            android.text.style.StrikethroughSpan r0 = new android.text.style.StrikethroughSpan
            r0.<init>()
            r6.setSpan(r0, r9, r12, r3)
        L_0x0097:
            int r0 = r7.A0B
            if (r0 != r15) goto L_0x00a3
            android.text.style.UnderlineSpan r0 = new android.text.style.UnderlineSpan
            r0.<init>()
            r6.setSpan(r0, r9, r12, r3)
        L_0x00a3:
            boolean r0 = r7.A0I
            if (r0 == 0) goto L_0x00b1
            int r1 = r7.A04
            android.text.style.ForegroundColorSpan r0 = new android.text.style.ForegroundColorSpan
            r0.<init>(r1)
            X.C9174RRz.A00(r6, r0, r9, r12)
        L_0x00b1:
            boolean r0 = r7.A0H
            if (r0 == 0) goto L_0x00bf
            int r1 = r7.A02
            android.text.style.BackgroundColorSpan r0 = new android.text.style.BackgroundColorSpan
            r0.<init>(r1)
            X.C9174RRz.A00(r6, r0, r9, r12)
        L_0x00bf:
            java.lang.String r1 = r7.A0F
            if (r1 == 0) goto L_0x00cb
            android.text.style.TypefaceSpan r0 = new android.text.style.TypefaceSpan
            r0.<init>(r1)
            X.C9174RRz.A00(r6, r0, r9, r12)
        L_0x00cb:
            X.SF0 r0 = r7.A0E
            r17 = 3
            r2 = 2
            r1 = 1
            if (r0 == 0) goto L_0x00eb
            int r14 = r0.A01
            if (r14 != r4) goto L_0x01eb
            if (r13 == r2) goto L_0x00dc
            r14 = 1
            if (r13 != r15) goto L_0x00dd
        L_0x00dc:
            r14 = 3
        L_0x00dd:
            int r13 = r0.A02
            r0 = -2
            if (r13 != r0) goto L_0x00e3
            r13 = 1
        L_0x00e3:
            X.SEy r0 = new X.SEy
            r0.<init>(r14, r15, r13)
            X.C9174RRz.A00(r6, r0, r9, r12)
        L_0x00eb:
            int r13 = r7.A09
            if (r13 == r2) goto L_0x014f
            r0 = r17
            if (r13 == r0) goto L_0x01da
            r0 = 4
            if (r13 == r0) goto L_0x01da
        L_0x00f6:
            int r0 = r7.A0A
            if (r0 != r1) goto L_0x0102
            X.RRy r0 = new X.RRy
            r0.<init>()
            X.C9174RRz.A00(r6, r0, r9, r12)
        L_0x0102:
            int r3 = r7.A05
            if (r3 == r1) goto L_0x0146
            if (r3 == r2) goto L_0x0143
            r0 = r17
            if (r3 != r0) goto L_0x0119
            float r1 = r7.A00
            r0 = 1120403456(0x42c80000, float:100.0)
            float r1 = r1 / r0
        L_0x0111:
            android.text.style.RelativeSizeSpan r0 = new android.text.style.RelativeSizeSpan
            r0.<init>(r1)
        L_0x0116:
            X.C9174RRz.A00(r6, r0, r9, r12)
        L_0x0119:
            java.lang.String r1 = r11.A07
            java.lang.String r0 = "p"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0020
            float r1 = r7.A01
            r0 = 2139095039(0x7f7fffff, float:3.4028235E38)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x0135
            r0 = -1028390912(0xffffffffc2b40000, float:-90.0)
            float r1 = r1 * r0
            r0 = 1120403456(0x42c80000, float:100.0)
            float r1 = r1 / r0
            r8.A03 = r1
        L_0x0135:
            android.text.Layout$Alignment r0 = r7.A0D
            if (r0 == 0) goto L_0x013b
            r8.A0D = r0
        L_0x013b:
            android.text.Layout$Alignment r0 = r7.A0C
            if (r0 == 0) goto L_0x0020
            r8.A0C = r0
            goto L_0x0020
        L_0x0143:
            float r1 = r7.A00
            goto L_0x0111
        L_0x0146:
            float r0 = r7.A00
            int r2 = (int) r0
            android.text.style.AbsoluteSizeSpan r0 = new android.text.style.AbsoluteSizeSpan
            r0.<init>(r2, r1)
            goto L_0x0116
        L_0x014f:
            if (r5 == 0) goto L_0x00f6
            X.S3a r13 = r5.A04
            java.lang.String[] r0 = r5.A0A
            X.S3a r0 = X.RS5.A00(r13, r10, r0)
            if (r0 == 0) goto L_0x01d6
            int r0 = r0.A09
            if (r0 != r1) goto L_0x01d6
            java.util.ArrayDeque r16 = new java.util.ArrayDeque
            r16.<init>()
            r0 = r16
            r0.push(r5)
        L_0x0169:
            boolean r0 = r16.isEmpty()
            if (r0 != 0) goto L_0x00f6
            java.lang.Object r13 = r16.pop()
            X.ST1 r13 = (X.ST1) r13
            X.S3a r0 = r13.A04
            r19 = r0
            java.lang.String[] r14 = r13.A0A
            X.S3a r0 = X.RS5.A00(r0, r10, r14)
            if (r0 == 0) goto L_0x01c0
            int r15 = r0.A09
            r0 = r17
            if (r15 != r0) goto L_0x01c0
            java.util.List r0 = r13.A00
            if (r0 == 0) goto L_0x01e4
            int r0 = r0.size()
            if (r0 != r1) goto L_0x01e4
            r15 = 0
            X.ST1 r0 = r13.A05(r15)
            java.lang.String r0 = r0.A08
            if (r0 == 0) goto L_0x01e4
            X.ST1 r0 = r13.A05(r15)
            java.lang.String r13 = r0.A08
            r0 = r19
            X.S3a r0 = X.RS5.A00(r0, r10, r14)
            if (r0 == 0) goto L_0x01be
            int r14 = r0.A08
            if (r14 != r4) goto L_0x01b8
        L_0x01ac:
            X.S3a r4 = r5.A04
            java.lang.String[] r0 = r5.A0A
            X.S3a r0 = X.RS5.A00(r4, r10, r0)
            if (r0 == 0) goto L_0x01b8
            int r14 = r0.A08
        L_0x01b8:
            X.SEb r0 = new X.SEb
            r0.<init>(r13, r14)
            goto L_0x01df
        L_0x01be:
            r14 = -1
            goto L_0x01ac
        L_0x01c0:
            java.util.List r0 = r13.A00
            if (r0 == 0) goto L_0x0169
            int r15 = r0.size()
        L_0x01c8:
            int r15 = r15 + -1
            if (r15 < 0) goto L_0x0169
            X.ST1 r14 = r13.A05(r15)
            r0 = r16
            r0.push(r14)
            goto L_0x01c8
        L_0x01d6:
            X.ST1 r5 = r5.A03
            goto L_0x014f
        L_0x01da:
            X.RS4 r0 = new X.RS4
            r0.<init>()
        L_0x01df:
            r6.setSpan(r0, r9, r12, r3)
            goto L_0x00f6
        L_0x01e4:
            java.lang.String r0 = "Skipping rubyText node without exactly one text child."
            X.STH.A01(r0)
            goto L_0x00f6
        L_0x01eb:
            int r15 = r0.A00
            goto L_0x00dd
        L_0x01ef:
            r3 = 0
            r2 = 1
            boolean r1 = X.AnonymousClass7TF.A1S(r1, r2)
            int r0 = r7.A06
            if (r0 != r2) goto L_0x01fa
            r3 = 2
        L_0x01fa:
            r1 = r1 | r3
            goto L_0x007e
        L_0x01fd:
            X.ST1 r1 = r11.A05(r9)
            r2 = r20
            r3 = r10
            r6 = r21
            A03(r1, r2, r3, r4, r5, r6)
            int r9 = r9 + 1
        L_0x020b:
            java.util.List r0 = r11.A00
            if (r0 != 0) goto L_0x0213
            r0 = 0
        L_0x0210:
            if (r9 >= r0) goto L_0x0218
            goto L_0x01fd
        L_0x0213:
            int r0 = r0.size()
            goto L_0x0210
        L_0x0218:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ST1.A03(X.ST1, java.lang.String, java.util.Map, java.util.Map, java.util.Map, long):void");
    }

    public static void A04(ST1 st1, TreeSet treeSet, boolean z) {
        boolean z2;
        String str = st1.A07;
        boolean equals = "p".equals(str);
        boolean equals2 = "div".equals(str);
        if (z || equals || (equals2 && st1.A05 != null)) {
            long j = st1.A02;
            if (j != -9223372036854775807L) {
                AnonymousClass7TE.A1Y(treeSet, j);
            }
            long j2 = st1.A01;
            if (j2 != -9223372036854775807L) {
                AnonymousClass7TE.A1Y(treeSet, j2);
            }
        }
        if (st1.A00 != null) {
            for (int i = 0; i < st1.A00.size(); i++) {
                ST1 st12 = (ST1) st1.A00.get(i);
                if (!z) {
                    z2 = false;
                    if (!equals) {
                        A04(st12, treeSet, z2);
                    }
                }
                z2 = true;
                A04(st12, treeSet, z2);
            }
        }
    }

    public final ST1 A05(int i) {
        List list = this.A00;
        if (list != null) {
            return (ST1) list.get(i);
        }
        throw new IndexOutOfBoundsException();
    }

    public final boolean A06(long j) {
        long j2 = this.A02;
        if (j2 == -9223372036854775807L && this.A01 == -9223372036854775807L) {
            return true;
        }
        if (j2 <= j && this.A01 == -9223372036854775807L) {
            return true;
        }
        if (j2 == -9223372036854775807L && j < this.A01) {
            return true;
        }
        if (j2 > j || j >= this.A01) {
            return false;
        }
        return true;
    }

    public ST1(ST1 st1, C10968S3a s3a, String str, String str2, String str3, String str4, String[] strArr, long j, long j2) {
        this.A07 = str;
        this.A08 = str2;
        this.A05 = str4;
        this.A04 = s3a;
        this.A0A = strArr;
        this.A09 = AnonymousClass7TF.A1V(str2);
        this.A02 = j;
        this.A01 = j2;
        str3.getClass();
        this.A06 = str3;
        this.A03 = st1;
    }

    public static SpannableStringBuilder A00(String str, Map map) {
        if (!map.containsKey(str)) {
            S3W s3w = new S3W();
            s3w.A0E = new SpannableStringBuilder();
            map.put(str, s3w);
        }
        CharSequence charSequence = ((S3W) map.get(str)).A0E;
        charSequence.getClass();
        return (SpannableStringBuilder) charSequence;
    }
}
