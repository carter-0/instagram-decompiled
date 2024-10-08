package X;

import java.util.Comparator;
import java.util.regex.Pattern;

/* renamed from: X.7QZ  reason: invalid class name */
public final class AnonymousClass7QZ implements Comparator {
    public static final Pattern A00 = Pattern.compile("(\\d*)(\\D*)");

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003c, code lost:
        r7 = r7 + 1;
     */
    /* renamed from: A00 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int compare(java.lang.String r15, java.lang.String r16) {
        /*
            r14 = this;
            java.lang.String r0 = r15.trim()
            java.lang.String r1 = "\\."
            java.lang.String[] r12 = r0.split(r1)
            java.lang.String r0 = r16.trim()
            java.lang.String[] r11 = r0.split(r1)
            int r10 = r12.length
            int r9 = r11.length
            int r8 = java.lang.Math.max(r10, r9)
            r4 = 0
            r7 = 0
        L_0x001a:
            if (r7 >= r8) goto L_0x007d
            java.lang.String r13 = ""
            if (r7 >= r10) goto L_0x005d
            r2 = r12[r7]
        L_0x0022:
            if (r7 >= r9) goto L_0x005b
            r1 = r11[r7]
        L_0x0026:
            java.util.regex.Pattern r0 = A00
            java.util.regex.Matcher r6 = r0.matcher(r2)
            java.util.regex.Matcher r5 = r0.matcher(r1)
        L_0x0030:
            boolean r3 = r6.find()
            boolean r2 = r5.find()
            if (r3 != 0) goto L_0x003f
            if (r2 != 0) goto L_0x003f
            int r7 = r7 + 1
            goto L_0x001a
        L_0x003f:
            r4 = 1
            if (r3 == 0) goto L_0x004b
            java.lang.String r0 = r6.group(r4)
            int r1 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x004d }
            goto L_0x004e
        L_0x004b:
            r1 = 0
            goto L_0x004e
        L_0x004d:
            r1 = 0
        L_0x004e:
            if (r2 == 0) goto L_0x0059
            java.lang.String r0 = r5.group(r4)
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x005f }
            goto L_0x0060
        L_0x0059:
            r0 = 0
            goto L_0x0060
        L_0x005b:
            r1 = r13
            goto L_0x0026
        L_0x005d:
            r2 = r13
            goto L_0x0022
        L_0x005f:
            r0 = 0
        L_0x0060:
            if (r1 < r0) goto L_0x008a
            if (r1 > r0) goto L_0x007d
            r0 = 2
            if (r3 == 0) goto L_0x0080
            java.lang.String r3 = r6.group(r0)
        L_0x006b:
            if (r2 == 0) goto L_0x007e
            java.lang.String r2 = r5.group(r0)
        L_0x0071:
            int r1 = r3.length()
            if (r1 != 0) goto L_0x0082
            int r0 = r2.length()
            if (r0 <= 0) goto L_0x0082
        L_0x007d:
            return r4
        L_0x007e:
            r2 = r13
            goto L_0x0071
        L_0x0080:
            r3 = r13
            goto L_0x006b
        L_0x0082:
            int r0 = r2.length()
            if (r0 != 0) goto L_0x008c
            if (r1 <= 0) goto L_0x008c
        L_0x008a:
            r4 = -1
            return r4
        L_0x008c:
            int r4 = r3.compareTo(r2)
            if (r4 == 0) goto L_0x0030
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7QZ.compare(java.lang.String, java.lang.String):int");
    }
}
