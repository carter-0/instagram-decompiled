package X;

import com.instagram.quickpromotion.intf.QuickPromotionSlot;
import com.instagram.quickpromotion.intf.QuickPromotionSurface;
import com.instagram.quickpromotion.intf.Trigger;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.2kY  reason: invalid class name */
public abstract class AnonymousClass2kY {
    public static final Map A00;
    public static final Map A01;
    public static final List A02;

    public static final EnumSet A00(QuickPromotionSlot quickPromotionSlot, QuickPromotionSurface quickPromotionSurface) {
        Object obj;
        EnumSet enumSet;
        0qQ.A0B(quickPromotionSurface, 1);
        Iterator it = A01(quickPromotionSlot).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((C227972ka) obj).A00 == quickPromotionSurface) {
                break;
            }
        }
        C227972ka r1 = (C227972ka) obj;
        if (r1 != null && (enumSet = r1.A01) != null) {
            return enumSet;
        }
        EnumSet<E> noneOf = EnumSet.noneOf(Trigger.class);
        0qQ.A07(noneOf);
        return noneOf;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x02cb, code lost:
        r0 = java.util.EnumSet.of(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x02cf, code lost:
        r6.put(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0528, code lost:
        r0 = java.util.EnumSet.of(r6, r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0651, code lost:
        r0 = java.util.Collections.singletonList(r0);
        X.0qQ.A07(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x066e, code lost:
        r0 = java.util.EnumSet.of(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x06d6, code lost:
        r0 = java.util.EnumSet.of(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x06da, code lost:
        r7.put(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x06dd, code lost:
        r3 = r3 + 1;
     */
    static {
        /*
            r0 = 55
            com.instagram.quickpromotion.intf.QuickPromotionSlot[] r2 = new com.instagram.quickpromotion.intf.QuickPromotionSlot[r0]
            com.instagram.quickpromotion.intf.QuickPromotionSlot r3 = com.instagram.quickpromotion.intf.QuickPromotionSlot.A0k
            com.instagram.quickpromotion.intf.QuickPromotionSlot r4 = com.instagram.quickpromotion.intf.QuickPromotionSlot.A0j
            com.instagram.quickpromotion.intf.QuickPromotionSlot r5 = com.instagram.quickpromotion.intf.QuickPromotionSlot.A0e
            com.instagram.quickpromotion.intf.QuickPromotionSlot r6 = com.instagram.quickpromotion.intf.QuickPromotionSlot.A0g
            com.instagram.quickpromotion.intf.QuickPromotionSlot r7 = com.instagram.quickpromotion.intf.QuickPromotionSlot.A03
            com.instagram.quickpromotion.intf.QuickPromotionSlot r8 = com.instagram.quickpromotion.intf.QuickPromotionSlot.A05
            com.instagram.quickpromotion.intf.QuickPromotionSlot r9 = com.instagram.quickpromotion.intf.QuickPromotionSlot.A0B
            com.instagram.quickpromotion.intf.QuickPromotionSlot r10 = com.instagram.quickpromotion.intf.QuickPromotionSlot.A0C
            com.instagram.quickpromotion.intf.QuickPromotionSlot r11 = com.instagram.quickpromotion.intf.QuickPromotionSlot.A0H
            com.instagram.quickpromotion.intf.QuickPromotionSlot r12 = com.instagram.quickpromotion.intf.QuickPromotionSlot.A0J
            com.instagram.quickpromotion.intf.QuickPromotionSlot r13 = com.instagram.quickpromotion.intf.QuickPromotionSlot.A0K
            com.instagram.quickpromotion.intf.QuickPromotionSlot r14 = com.instagram.quickpromotion.intf.QuickPromotionSlot.A0M
            com.instagram.quickpromotion.intf.QuickPromotionSlot r15 = com.instagram.quickpromotion.intf.QuickPromotionSlot.A0O
            com.instagram.quickpromotion.intf.QuickPromotionSlot r16 = com.instagram.quickpromotion.intf.QuickPromotionSlot.A0R
            com.instagram.quickpromotion.intf.QuickPromotionSlot r17 = com.instagram.quickpromotion.intf.QuickPromotionSlot.A0S
            com.instagram.quickpromotion.intf.QuickPromotionSlot r18 = com.instagram.quickpromotion.intf.QuickPromotionSlot.A0U
            com.instagram.quickpromotion.intf.QuickPromotionSlot r19 = com.instagram.quickpromotion.intf.QuickPromotionSlot.A0W
            com.instagram.quickpromotion.intf.QuickPromotionSlot r20 = com.instagram.quickpromotion.intf.QuickPromotionSlot.A0V
            com.instagram.quickpromotion.intf.QuickPromotionSlot r21 = com.instagram.quickpromotion.intf.QuickPromotionSlot.A0b
            com.instagram.quickpromotion.intf.QuickPromotionSlot r22 = com.instagram.quickpromotion.intf.QuickPromotionSlot.A0x
            com.instagram.quickpromotion.intf.QuickPromotionSlot r23 = com.instagram.quickpromotion.intf.QuickPromotionSlot.A0y
            com.instagram.quickpromotion.intf.QuickPromotionSlot r24 = com.instagram.quickpromotion.intf.QuickPromotionSlot.A0s
            com.instagram.quickpromotion.intf.QuickPromotionSlot r25 = com.instagram.quickpromotion.intf.QuickPromotionSlot.A0d
            com.instagram.quickpromotion.intf.QuickPromotionSlot r26 = com.instagram.quickpromotion.intf.QuickPromotionSlot.A0v
            com.instagram.quickpromotion.intf.QuickPromotionSlot r27 = com.instagram.quickpromotion.intf.QuickPromotionSlot.A0w
            com.instagram.quickpromotion.intf.QuickPromotionSlot r28 = com.instagram.quickpromotion.intf.QuickPromotionSlot.A1A
            com.instagram.quickpromotion.intf.QuickPromotionSlot r29 = com.instagram.quickpromotion.intf.QuickPromotionSlot.A02
            com.instagram.quickpromotion.intf.QuickPromotionSlot[] r3 = new com.instagram.quickpromotion.intf.QuickPromotionSlot[]{r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29}
            r0 = 0
            r1 = 27
            java.lang.System.arraycopy(r3, r0, r2, r0, r1)
            com.instagram.quickpromotion.intf.QuickPromotionSlot r3 = com.instagram.quickpromotion.intf.QuickPromotionSlot.A18
            com.instagram.quickpromotion.intf.QuickPromotionSlot r4 = com.instagram.quickpromotion.intf.QuickPromotionSlot.A0Q
            com.instagram.quickpromotion.intf.QuickPromotionSlot r5 = com.instagram.quickpromotion.intf.QuickPromotionSlot.A0G
            com.instagram.quickpromotion.intf.QuickPromotionSlot r6 = com.instagram.quickpromotion.intf.QuickPromotionSlot.A0E
            com.instagram.quickpromotion.intf.QuickPromotionSlot r7 = com.instagram.quickpromotion.intf.QuickPromotionSlot.A0F
            com.instagram.quickpromotion.intf.QuickPromotionSlot r8 = com.instagram.quickpromotion.intf.QuickPromotionSlot.A1B
            com.instagram.quickpromotion.intf.QuickPromotionSlot r9 = com.instagram.quickpromotion.intf.QuickPromotionSlot.A0L
            com.instagram.quickpromotion.intf.QuickPromotionSlot r10 = com.instagram.quickpromotion.intf.QuickPromotionSlot.A0Y
            com.instagram.quickpromotion.intf.QuickPromotionSlot r11 = com.instagram.quickpromotion.intf.QuickPromotionSlot.A0X
            com.instagram.quickpromotion.intf.QuickPromotionSlot r12 = com.instagram.quickpromotion.intf.QuickPromotionSlot.A0u
            com.instagram.quickpromotion.intf.QuickPromotionSlot r13 = com.instagram.quickpromotion.intf.QuickPromotionSlot.A17
            com.instagram.quickpromotion.intf.QuickPromotionSlot r14 = com.instagram.quickpromotion.intf.QuickPromotionSlot.A07
            com.instagram.quickpromotion.intf.QuickPromotionSlot r15 = com.instagram.quickpromotion.intf.QuickPromotionSlot.A0p
            com.instagram.quickpromotion.intf.QuickPromotionSlot r16 = com.instagram.quickpromotion.intf.QuickPromotionSlot.A0q
            com.instagram.quickpromotion.intf.QuickPromotionSlot r17 = com.instagram.quickpromotion.intf.QuickPromotionSlot.A14
            com.instagram.quickpromotion.intf.QuickPromotionSlot r18 = com.instagram.quickpromotion.intf.QuickPromotionSlot.A15
            com.instagram.quickpromotion.intf.QuickPromotionSlot r19 = com.instagram.quickpromotion.intf.QuickPromotionSlot.A0h
            com.instagram.quickpromotion.intf.QuickPromotionSlot r20 = com.instagram.quickpromotion.intf.QuickPromotionSlot.A0i
            com.instagram.quickpromotion.intf.QuickPromotionSlot r21 = com.instagram.quickpromotion.intf.QuickPromotionSlot.A0n
            com.instagram.quickpromotion.intf.QuickPromotionSlot r22 = com.instagram.quickpromotion.intf.QuickPromotionSlot.A0Z
            com.instagram.quickpromotion.intf.QuickPromotionSlot r23 = com.instagram.quickpromotion.intf.QuickPromotionSlot.A08
            com.instagram.quickpromotion.intf.QuickPromotionSlot r24 = com.instagram.quickpromotion.intf.QuickPromotionSlot.A0A
            com.instagram.quickpromotion.intf.QuickPromotionSlot r25 = com.instagram.quickpromotion.intf.QuickPromotionSlot.A09
            com.instagram.quickpromotion.intf.QuickPromotionSlot r26 = com.instagram.quickpromotion.intf.QuickPromotionSlot.A0f
            com.instagram.quickpromotion.intf.QuickPromotionSlot r27 = com.instagram.quickpromotion.intf.QuickPromotionSlot.A0l
            com.instagram.quickpromotion.intf.QuickPromotionSlot r28 = com.instagram.quickpromotion.intf.QuickPromotionSlot.A04
            com.instagram.quickpromotion.intf.QuickPromotionSlot r29 = com.instagram.quickpromotion.intf.QuickPromotionSlot.A0T
            com.instagram.quickpromotion.intf.QuickPromotionSlot[] r3 = new com.instagram.quickpromotion.intf.QuickPromotionSlot[]{r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29}
            java.lang.System.arraycopy(r3, r0, r2, r1, r1)
            com.instagram.quickpromotion.intf.QuickPromotionSlot r1 = com.instagram.quickpromotion.intf.QuickPromotionSlot.A0N
            com.instagram.quickpromotion.intf.QuickPromotionSlot[] r4 = new com.instagram.quickpromotion.intf.QuickPromotionSlot[]{r1}
            r3 = 54
            r1 = 1
            java.lang.System.arraycopy(r4, r0, r2, r3, r1)
            java.util.List r0 = X.0sr.A1P(r2)
            A02 = r0
            java.lang.Class<com.instagram.quickpromotion.intf.QuickPromotionSlot> r1 = com.instagram.quickpromotion.intf.QuickPromotionSlot.class
            java.util.EnumMap r0 = new java.util.EnumMap
            r0.<init>(r1)
            A01 = r0
            java.util.EnumMap r0 = new java.util.EnumMap
            r0.<init>(r1)
            A00 = r0
            com.instagram.quickpromotion.intf.QuickPromotionSlot[] r5 = com.instagram.quickpromotion.intf.QuickPromotionSlot.values()
            int r4 = r5.length
            r3 = 0
        L_0x00a9:
            if (r3 >= r4) goto L_0x06e1
            r2 = r5[r3]
            int r0 = r2.ordinal()
            switch(r0) {
                case 0: goto L_0x00ba;
                case 1: goto L_0x00e9;
                case 2: goto L_0x010c;
                case 3: goto L_0x0163;
                case 4: goto L_0x0194;
                case 5: goto L_0x0544;
                case 6: goto L_0x01b1;
                case 7: goto L_0x01d4;
                case 8: goto L_0x01fc;
                case 9: goto L_0x01e8;
                case 10: goto L_0x014a;
                case 11: goto L_0x013d;
                case 12: goto L_0x0236;
                case 13: goto L_0x0262;
                case 14: goto L_0x0275;
                case 15: goto L_0x02aa;
                case 16: goto L_0x0297;
                case 17: goto L_0x02b9;
                case 18: goto L_0x02d4;
                case 19: goto L_0x02fe;
                case 20: goto L_0x0312;
                case 21: goto L_0x0326;
                case 22: goto L_0x033a;
                case 23: goto L_0x0367;
                case 24: goto L_0x0394;
                case 25: goto L_0x03a8;
                case 26: goto L_0x03bf;
                case 27: goto L_0x03d3;
                case 28: goto L_0x03e7;
                case 29: goto L_0x0400;
                case 30: goto L_0x037b;
                case 31: goto L_0x0558;
                case 32: goto L_0x013d;
                case 33: goto L_0x0414;
                case 34: goto L_0x041a;
                case 35: goto L_0x042e;
                case 36: goto L_0x0447;
                case 37: goto L_0x045b;
                case 38: goto L_0x046f;
                case 39: goto L_0x034e;
                case 40: goto L_0x0512;
                case 41: goto L_0x052e;
                case 42: goto L_0x0210;
                case 43: goto L_0x0224;
                case 44: goto L_0x055e;
                case 45: goto L_0x0572;
                case 46: goto L_0x0578;
                case 47: goto L_0x058c;
                case 48: goto L_0x05a7;
                case 49: goto L_0x05bb;
                case 50: goto L_0x0180;
                case 51: goto L_0x05cf;
                case 52: goto L_0x05e3;
                case 53: goto L_0x05f7;
                case 54: goto L_0x0483;
                case 55: goto L_0x0497;
                case 56: goto L_0x04ab;
                case 57: goto L_0x04d6;
                case 58: goto L_0x04bf;
                case 59: goto L_0x04ea;
                case 60: goto L_0x04fe;
                case 61: goto L_0x060b;
                case 62: goto L_0x065a;
                case 63: goto L_0x0673;
                case 64: goto L_0x0620;
                case 65: goto L_0x0686;
                case 66: goto L_0x0699;
                case 67: goto L_0x06b1;
                case 68: goto L_0x06c4;
                case 69: goto L_0x0625;
                case 70: goto L_0x0639;
                case 71: goto L_0x064d;
                default: goto L_0x00b4;
            }
        L_0x00b4:
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x00ba:
            java.util.Map r9 = A01
            X.2ka r8 = X.C227972ka.A1I
            X.2ka r7 = X.C227972ka.A1M
            X.2ka r6 = X.C227972ka.A1H
            X.2ka r1 = X.C227972ka.A1G
            X.2ka r0 = X.C227972ka.A1F
            X.2ka[] r0 = new X.C227972ka[]{r8, r7, r6, r1, r0}
            java.util.List r0 = X.0sr.A1P(r0)
            r9.put(r2, r0)
            java.util.Map r6 = A00
            com.instagram.quickpromotion.intf.Trigger r10 = com.instagram.quickpromotion.intf.Trigger.A1e
            com.instagram.quickpromotion.intf.Trigger r9 = com.instagram.quickpromotion.intf.Trigger.A1j
            com.instagram.quickpromotion.intf.Trigger r8 = com.instagram.quickpromotion.intf.Trigger.A1k
            com.instagram.quickpromotion.intf.Trigger r7 = com.instagram.quickpromotion.intf.Trigger.A1c
            com.instagram.quickpromotion.intf.Trigger r1 = com.instagram.quickpromotion.intf.Trigger.A1B
            com.instagram.quickpromotion.intf.Trigger r0 = com.instagram.quickpromotion.intf.Trigger.A1C
            com.instagram.quickpromotion.intf.Trigger[] r0 = new com.instagram.quickpromotion.intf.Trigger[]{r9, r8, r7, r1, r0}
            java.util.EnumSet r0 = java.util.EnumSet.of(r10, r0)
            goto L_0x02cf
        L_0x00e9:
            java.util.Map r7 = A01
            X.2ka r6 = X.C227972ka.A1K
            X.2ka r1 = X.C227972ka.A1L
            X.2ka r0 = X.C227972ka.A1J
            X.2ka[] r0 = new X.C227972ka[]{r6, r1, r0}
            java.util.List r0 = X.0sr.A1P(r0)
            r7.put(r2, r0)
            java.util.Map r6 = A00
            com.instagram.quickpromotion.intf.Trigger r8 = com.instagram.quickpromotion.intf.Trigger.A1f
            com.instagram.quickpromotion.intf.Trigger r7 = com.instagram.quickpromotion.intf.Trigger.A1g
            com.instagram.quickpromotion.intf.Trigger r1 = com.instagram.quickpromotion.intf.Trigger.A1h
            com.instagram.quickpromotion.intf.Trigger r0 = com.instagram.quickpromotion.intf.Trigger.A1i
            java.util.EnumSet r0 = java.util.EnumSet.of(r8, r7, r1, r0)
            goto L_0x02cf
        L_0x010c:
            java.util.Map r9 = A01
            X.2ka r8 = X.C227972ka.A0f
            X.2ka r7 = X.C227972ka.A0k
            X.2ka r6 = X.C227972ka.A0n
            X.2ka r1 = X.C227972ka.A0j
            X.2ka r0 = X.C227972ka.A0g
            X.2ka[] r0 = new X.C227972ka[]{r8, r7, r6, r1, r0}
            java.util.List r0 = X.0sr.A1P(r0)
            r9.put(r2, r0)
            java.util.Map r6 = A00
            com.instagram.quickpromotion.intf.Trigger r1 = com.instagram.quickpromotion.intf.Trigger.A0X
            com.instagram.quickpromotion.intf.Trigger r7 = com.instagram.quickpromotion.intf.Trigger.A0Z
            com.instagram.quickpromotion.intf.Trigger r8 = com.instagram.quickpromotion.intf.Trigger.A0c
            com.instagram.quickpromotion.intf.Trigger r9 = com.instagram.quickpromotion.intf.Trigger.A1Z
            com.instagram.quickpromotion.intf.Trigger r10 = com.instagram.quickpromotion.intf.Trigger.A0T
            com.instagram.quickpromotion.intf.Trigger r11 = com.instagram.quickpromotion.intf.Trigger.A0Y
            com.instagram.quickpromotion.intf.Trigger r12 = com.instagram.quickpromotion.intf.Trigger.A0U
            com.instagram.quickpromotion.intf.Trigger[] r0 = new com.instagram.quickpromotion.intf.Trigger[]{r7, r8, r9, r10, r11, r12}
            java.util.EnumSet r0 = java.util.EnumSet.of(r1, r0)
            goto L_0x02cf
        L_0x013d:
            java.util.Map r6 = A01
            X.2ka r0 = X.C227972ka.A0n
            java.util.List r0 = java.util.Collections.singletonList(r0)
            X.0qQ.A07(r0)
            goto L_0x02cf
        L_0x014a:
            java.util.Map r7 = A01
            X.2ka r6 = X.C227972ka.A0n
            X.2ka r1 = X.C227972ka.A0i
            X.2ka r0 = X.C227972ka.A0h
            X.2ka[] r0 = new X.C227972ka[]{r6, r1, r0}
            java.util.List r0 = X.0sr.A1P(r0)
            r7.put(r2, r0)
            java.util.Map r6 = A00
            com.instagram.quickpromotion.intf.Trigger r0 = com.instagram.quickpromotion.intf.Trigger.A0V
            goto L_0x02cb
        L_0x0163:
            java.util.Map r6 = A01
            X.2ka r1 = X.C227972ka.A0l
            X.2ka r0 = X.C227972ka.A0m
            X.2ka[] r0 = new X.C227972ka[]{r1, r0}
            java.util.List r0 = X.0sr.A1P(r0)
            r6.put(r2, r0)
            java.util.Map r6 = A00
            com.instagram.quickpromotion.intf.Trigger r1 = com.instagram.quickpromotion.intf.Trigger.A0a
            com.instagram.quickpromotion.intf.Trigger r0 = com.instagram.quickpromotion.intf.Trigger.A0b
            java.util.EnumSet r0 = java.util.EnumSet.of(r1, r0)
            goto L_0x02cf
        L_0x0180:
            java.util.Map r1 = A01
            X.2ka r0 = X.C227972ka.A1h
            java.util.List r0 = java.util.Collections.singletonList(r0)
            X.0qQ.A07(r0)
            r1.put(r2, r0)
            java.util.Map r6 = A00
            com.instagram.quickpromotion.intf.Trigger r0 = com.instagram.quickpromotion.intf.Trigger.A23
            goto L_0x02cb
        L_0x0194:
            java.util.Map r6 = A01
            X.2ka r1 = X.C227972ka.A05
            X.2ka r0 = X.C227972ka.A1T
            X.2ka[] r0 = new X.C227972ka[]{r1, r0}
            java.util.List r0 = X.0sr.A1P(r0)
            r6.put(r2, r0)
            java.util.Map r6 = A00
            com.instagram.quickpromotion.intf.Trigger r1 = com.instagram.quickpromotion.intf.Trigger.A05
            com.instagram.quickpromotion.intf.Trigger r0 = com.instagram.quickpromotion.intf.Trigger.A1r
            java.util.EnumSet r0 = java.util.EnumSet.of(r1, r0)
            goto L_0x02cf
        L_0x01b1:
            java.util.Map r8 = A01
            X.2ka r7 = X.C227972ka.A08
            X.2ka r6 = X.C227972ka.A09
            X.2ka r1 = X.C227972ka.A0A
            X.2ka r0 = X.C227972ka.A07
            X.2ka[] r0 = new X.C227972ka[]{r7, r6, r1, r0}
            java.util.List r0 = X.0sr.A1P(r0)
            r8.put(r2, r0)
            java.util.Map r6 = A00
            com.instagram.quickpromotion.intf.Trigger r7 = com.instagram.quickpromotion.intf.Trigger.A07
            com.instagram.quickpromotion.intf.Trigger r1 = com.instagram.quickpromotion.intf.Trigger.A08
            com.instagram.quickpromotion.intf.Trigger r0 = com.instagram.quickpromotion.intf.Trigger.A09
            java.util.EnumSet r0 = java.util.EnumSet.of(r7, r1, r0)
            goto L_0x02cf
        L_0x01d4:
            java.util.Map r1 = A01
            X.2ka r0 = X.C227972ka.A0I
            java.util.List r0 = java.util.Collections.singletonList(r0)
            X.0qQ.A07(r0)
            r1.put(r2, r0)
            java.util.Map r6 = A00
            com.instagram.quickpromotion.intf.Trigger r0 = com.instagram.quickpromotion.intf.Trigger.A0E
            goto L_0x02cb
        L_0x01e8:
            java.util.Map r1 = A01
            X.2ka r0 = X.C227972ka.A0K
            java.util.List r0 = java.util.Collections.singletonList(r0)
            X.0qQ.A07(r0)
            r1.put(r2, r0)
            java.util.Map r6 = A00
            com.instagram.quickpromotion.intf.Trigger r0 = com.instagram.quickpromotion.intf.Trigger.A0G
            goto L_0x02cb
        L_0x01fc:
            java.util.Map r1 = A01
            X.2ka r0 = X.C227972ka.A0J
            java.util.List r0 = java.util.Collections.singletonList(r0)
            X.0qQ.A07(r0)
            r1.put(r2, r0)
            java.util.Map r6 = A00
            com.instagram.quickpromotion.intf.Trigger r0 = com.instagram.quickpromotion.intf.Trigger.A0F
            goto L_0x02cb
        L_0x0210:
            java.util.Map r1 = A01
            X.2ka r0 = X.C227972ka.A0L
            java.util.List r0 = java.util.Collections.singletonList(r0)
            X.0qQ.A07(r0)
            r1.put(r2, r0)
            java.util.Map r6 = A00
            com.instagram.quickpromotion.intf.Trigger r0 = com.instagram.quickpromotion.intf.Trigger.A0I
            goto L_0x02cb
        L_0x0224:
            java.util.Map r6 = A01
            X.2ka r7 = X.C227972ka.A0M
            X.2ka r1 = X.C227972ka.A0N
            X.2ka r0 = X.C227972ka.A13
            X.2ka[] r0 = new X.C227972ka[]{r7, r1, r0}
            java.util.List r0 = X.0sr.A1P(r0)
            goto L_0x02cf
        L_0x0236:
            java.util.Map r8 = A01
            X.2ka r7 = X.C227972ka.A0w
            X.2ka r6 = X.C227972ka.A0x
            X.2ka r1 = X.C227972ka.A0z
            X.2ka r0 = X.C227972ka.A0u
            X.2ka[] r0 = new X.C227972ka[]{r7, r6, r1, r0}
            java.util.List r0 = X.0sr.A1P(r0)
            r8.put(r2, r0)
            java.util.Map r6 = A00
            com.instagram.quickpromotion.intf.Trigger r10 = com.instagram.quickpromotion.intf.Trigger.A0l
            com.instagram.quickpromotion.intf.Trigger r9 = com.instagram.quickpromotion.intf.Trigger.A0o
            com.instagram.quickpromotion.intf.Trigger r8 = com.instagram.quickpromotion.intf.Trigger.A0q
            com.instagram.quickpromotion.intf.Trigger r7 = com.instagram.quickpromotion.intf.Trigger.A0k
            com.instagram.quickpromotion.intf.Trigger r1 = com.instagram.quickpromotion.intf.Trigger.A0n
            com.instagram.quickpromotion.intf.Trigger r0 = com.instagram.quickpromotion.intf.Trigger.A0m
            com.instagram.quickpromotion.intf.Trigger[] r0 = new com.instagram.quickpromotion.intf.Trigger[]{r9, r8, r7, r1, r0}
            java.util.EnumSet r0 = java.util.EnumSet.of(r10, r0)
            goto L_0x02cf
        L_0x0262:
            java.util.Map r1 = A01
            X.2ka r0 = X.C227972ka.A0y
            java.util.List r0 = java.util.Collections.singletonList(r0)
            X.0qQ.A07(r0)
            r1.put(r2, r0)
            java.util.Map r6 = A00
            com.instagram.quickpromotion.intf.Trigger r0 = com.instagram.quickpromotion.intf.Trigger.A0p
            goto L_0x02cb
        L_0x0275:
            java.util.Map r9 = A01
            X.2ka r8 = X.C227972ka.A0R
            X.2ka r7 = X.C227972ka.A0S
            X.2ka r6 = X.C227972ka.A0U
            X.2ka r1 = X.C227972ka.A0P
            X.2ka r0 = X.C227972ka.A0Q
            X.2ka[] r0 = new X.C227972ka[]{r8, r7, r6, r1, r0}
            java.util.List r0 = X.0sr.A1P(r0)
            r9.put(r2, r0)
            java.util.Map r6 = A00
            com.instagram.quickpromotion.intf.Trigger r1 = com.instagram.quickpromotion.intf.Trigger.A0N
            com.instagram.quickpromotion.intf.Trigger r0 = com.instagram.quickpromotion.intf.Trigger.A1L
            java.util.EnumSet r0 = java.util.EnumSet.of(r1, r0)
            goto L_0x02cf
        L_0x0297:
            java.util.Map r1 = A01
            X.2ka r0 = X.C227972ka.A0T
            java.util.List r0 = java.util.Collections.singletonList(r0)
            X.0qQ.A07(r0)
            r1.put(r2, r0)
            java.util.Map r6 = A00
            com.instagram.quickpromotion.intf.Trigger r0 = com.instagram.quickpromotion.intf.Trigger.A1M
            goto L_0x02cb
        L_0x02aa:
            java.util.Map r6 = A01
            X.2ka r1 = X.C227972ka.A0X
            X.2ka r0 = X.C227972ka.A0W
            X.2ka[] r0 = new X.C227972ka[]{r1, r0}
            java.util.List r0 = X.0sr.A1P(r0)
            goto L_0x02cf
        L_0x02b9:
            java.util.Map r1 = A01
            X.2ka r0 = X.C227972ka.A0Y
            java.util.List r0 = java.util.Collections.singletonList(r0)
            X.0qQ.A07(r0)
            r1.put(r2, r0)
            java.util.Map r6 = A00
            com.instagram.quickpromotion.intf.Trigger r0 = com.instagram.quickpromotion.intf.Trigger.A1H
        L_0x02cb:
            java.util.EnumSet r0 = java.util.EnumSet.of(r0)
        L_0x02cf:
            r6.put(r2, r0)
            goto L_0x06dd
        L_0x02d4:
            java.util.Map r8 = A01
            X.2ka r7 = X.C227972ka.A0b
            X.2ka r6 = X.C227972ka.A0c
            X.2ka r1 = X.C227972ka.A0d
            X.2ka r0 = X.C227972ka.A0a
            X.2ka[] r0 = new X.C227972ka[]{r7, r6, r1, r0}
            java.util.List r0 = X.0sr.A1P(r0)
            r8.put(r2, r0)
            java.util.Map r9 = A00
            com.instagram.quickpromotion.intf.Trigger r8 = com.instagram.quickpromotion.intf.Trigger.A0P
            com.instagram.quickpromotion.intf.Trigger r7 = com.instagram.quickpromotion.intf.Trigger.A0Q
            com.instagram.quickpromotion.intf.Trigger r6 = com.instagram.quickpromotion.intf.Trigger.A0x
            com.instagram.quickpromotion.intf.Trigger r1 = com.instagram.quickpromotion.intf.Trigger.A19
            com.instagram.quickpromotion.intf.Trigger r0 = com.instagram.quickpromotion.intf.Trigger.A0w
            java.util.EnumSet r0 = java.util.EnumSet.of(r8, r7, r6, r1, r0)
            r9.put(r2, r0)
            goto L_0x06dd
        L_0x02fe:
            java.util.Map r1 = A01
            X.2ka r0 = X.C227972ka.A0e
            java.util.List r0 = java.util.Collections.singletonList(r0)
            X.0qQ.A07(r0)
            r1.put(r2, r0)
            java.util.Map r7 = A00
            com.instagram.quickpromotion.intf.Trigger r0 = com.instagram.quickpromotion.intf.Trigger.A0v
            goto L_0x06d6
        L_0x0312:
            java.util.Map r1 = A01
            X.2ka r0 = X.C227972ka.A0r
            java.util.List r0 = java.util.Collections.singletonList(r0)
            X.0qQ.A07(r0)
            r1.put(r2, r0)
            java.util.Map r7 = A00
            com.instagram.quickpromotion.intf.Trigger r0 = com.instagram.quickpromotion.intf.Trigger.A0f
            goto L_0x06d6
        L_0x0326:
            java.util.Map r1 = A01
            X.2ka r0 = X.C227972ka.A0t
            java.util.List r0 = java.util.Collections.singletonList(r0)
            X.0qQ.A07(r0)
            r1.put(r2, r0)
            java.util.Map r7 = A00
            com.instagram.quickpromotion.intf.Trigger r0 = com.instagram.quickpromotion.intf.Trigger.A0i
            goto L_0x06d6
        L_0x033a:
            java.util.Map r1 = A01
            X.2ka r0 = X.C227972ka.A0s
            java.util.List r0 = java.util.Collections.singletonList(r0)
            X.0qQ.A07(r0)
            r1.put(r2, r0)
            java.util.Map r7 = A00
            com.instagram.quickpromotion.intf.Trigger r0 = com.instagram.quickpromotion.intf.Trigger.A0h
            goto L_0x06d6
        L_0x034e:
            java.util.Map r6 = A01
            X.2ka r1 = X.C227972ka.A16
            X.2ka r0 = X.C227972ka.A15
            X.2ka[] r0 = new X.C227972ka[]{r1, r0}
            java.util.List r0 = X.0sr.A1P(r0)
            r6.put(r2, r0)
            java.util.Map r7 = A00
            com.instagram.quickpromotion.intf.Trigger r1 = com.instagram.quickpromotion.intf.Trigger.A1R
            com.instagram.quickpromotion.intf.Trigger r0 = com.instagram.quickpromotion.intf.Trigger.A1S
            goto L_0x066e
        L_0x0367:
            java.util.Map r1 = A01
            X.2ka r0 = X.C227972ka.A1Z
            java.util.List r0 = java.util.Collections.singletonList(r0)
            X.0qQ.A07(r0)
            r1.put(r2, r0)
            java.util.Map r7 = A00
            com.instagram.quickpromotion.intf.Trigger r0 = com.instagram.quickpromotion.intf.Trigger.A20
            goto L_0x06d6
        L_0x037b:
            java.util.Map r6 = A01
            X.2ka r1 = X.C227972ka.A1d
            X.2ka r0 = X.C227972ka.A1X
            X.2ka[] r0 = new X.C227972ka[]{r1, r0}
            java.util.List r0 = X.0sr.A1P(r0)
            r6.put(r2, r0)
            java.util.Map r7 = A00
            com.instagram.quickpromotion.intf.Trigger r1 = com.instagram.quickpromotion.intf.Trigger.A1y
            com.instagram.quickpromotion.intf.Trigger r0 = com.instagram.quickpromotion.intf.Trigger.A1D
            goto L_0x066e
        L_0x0394:
            java.util.Map r1 = A01
            X.2ka r0 = X.C227972ka.A1Y
            java.util.List r0 = java.util.Collections.singletonList(r0)
            X.0qQ.A07(r0)
            r1.put(r2, r0)
            java.util.Map r7 = A00
            com.instagram.quickpromotion.intf.Trigger r0 = com.instagram.quickpromotion.intf.Trigger.A1w
            goto L_0x06d6
        L_0x03a8:
            java.util.Map r6 = A01
            X.2ka r1 = X.C227972ka.A1a
            X.2ka r0 = X.C227972ka.A1b
            X.2ka[] r0 = new X.C227972ka[]{r1, r0}
            java.util.List r0 = X.0sr.A1P(r0)
            r6.put(r2, r0)
            java.util.Map r7 = A00
            com.instagram.quickpromotion.intf.Trigger r0 = com.instagram.quickpromotion.intf.Trigger.A1z
            goto L_0x06d6
        L_0x03bf:
            java.util.Map r1 = A01
            X.2ka r0 = X.C227972ka.A1R
            java.util.List r0 = java.util.Collections.singletonList(r0)
            X.0qQ.A07(r0)
            r1.put(r2, r0)
            java.util.Map r7 = A00
            com.instagram.quickpromotion.intf.Trigger r0 = com.instagram.quickpromotion.intf.Trigger.A1n
            goto L_0x06d6
        L_0x03d3:
            java.util.Map r1 = A01
            X.2ka r0 = X.C227972ka.A18
            java.util.List r0 = java.util.Collections.singletonList(r0)
            X.0qQ.A07(r0)
            r1.put(r2, r0)
            java.util.Map r7 = A00
            com.instagram.quickpromotion.intf.Trigger r0 = com.instagram.quickpromotion.intf.Trigger.A1W
            goto L_0x06d6
        L_0x03e7:
            java.util.Map r6 = A01
            X.2ka r1 = X.C227972ka.A1W
            X.2ka r0 = X.C227972ka.A1V
            X.2ka[] r0 = new X.C227972ka[]{r1, r0}
            java.util.List r0 = X.0sr.A1P(r0)
            r6.put(r2, r0)
            java.util.Map r7 = A00
            com.instagram.quickpromotion.intf.Trigger r1 = com.instagram.quickpromotion.intf.Trigger.A1t
            com.instagram.quickpromotion.intf.Trigger r0 = com.instagram.quickpromotion.intf.Trigger.A0W
            goto L_0x066e
        L_0x0400:
            java.util.Map r1 = A01
            X.2ka r0 = X.C227972ka.A1W
            java.util.List r0 = java.util.Collections.singletonList(r0)
            X.0qQ.A07(r0)
            r1.put(r2, r0)
            java.util.Map r7 = A00
            com.instagram.quickpromotion.intf.Trigger r0 = com.instagram.quickpromotion.intf.Trigger.A1t
            goto L_0x06d6
        L_0x0414:
            java.util.Map r7 = A01
            X.2ka r0 = X.C227972ka.A1l
            goto L_0x0651
        L_0x041a:
            java.util.Map r1 = A01
            X.2ka r0 = X.C227972ka.A04
            java.util.List r0 = java.util.Collections.singletonList(r0)
            X.0qQ.A07(r0)
            r1.put(r2, r0)
            java.util.Map r7 = A00
            com.instagram.quickpromotion.intf.Trigger r0 = com.instagram.quickpromotion.intf.Trigger.A04
            goto L_0x06d6
        L_0x042e:
            java.util.Map r6 = A01
            X.2ka r1 = X.C227972ka.A1j
            X.2ka r0 = X.C227972ka.A0E
            X.2ka[] r0 = new X.C227972ka[]{r1, r0}
            java.util.List r0 = X.0sr.A1P(r0)
            r6.put(r2, r0)
            java.util.Map r7 = A00
            com.instagram.quickpromotion.intf.Trigger r1 = com.instagram.quickpromotion.intf.Trigger.A25
            com.instagram.quickpromotion.intf.Trigger r0 = com.instagram.quickpromotion.intf.Trigger.A24
            goto L_0x066e
        L_0x0447:
            java.util.Map r1 = A01
            X.2ka r0 = X.C227972ka.A1O
            java.util.List r0 = java.util.Collections.singletonList(r0)
            X.0qQ.A07(r0)
            r1.put(r2, r0)
            java.util.Map r7 = A00
            com.instagram.quickpromotion.intf.Trigger r0 = com.instagram.quickpromotion.intf.Trigger.A1l
            goto L_0x06d6
        L_0x045b:
            java.util.Map r1 = A01
            X.2ka r0 = X.C227972ka.A0Z
            java.util.List r0 = java.util.Collections.singletonList(r0)
            X.0qQ.A07(r0)
            r1.put(r2, r0)
            java.util.Map r7 = A00
            com.instagram.quickpromotion.intf.Trigger r0 = com.instagram.quickpromotion.intf.Trigger.A0O
            goto L_0x06d6
        L_0x046f:
            java.util.Map r1 = A01
            X.2ka r0 = X.C227972ka.A0O
            java.util.List r0 = java.util.Collections.singletonList(r0)
            X.0qQ.A07(r0)
            r1.put(r2, r0)
            java.util.Map r7 = A00
            com.instagram.quickpromotion.intf.Trigger r0 = com.instagram.quickpromotion.intf.Trigger.A0K
            goto L_0x06d6
        L_0x0483:
            java.util.Map r1 = A01
            X.2ka r0 = X.C227972ka.A0C
            java.util.List r0 = java.util.Collections.singletonList(r0)
            X.0qQ.A07(r0)
            r1.put(r2, r0)
            java.util.Map r7 = A00
            com.instagram.quickpromotion.intf.Trigger r0 = com.instagram.quickpromotion.intf.Trigger.A0B
            goto L_0x06d6
        L_0x0497:
            java.util.Map r1 = A01
            X.2ka r0 = X.C227972ka.A1Q
            java.util.List r0 = java.util.Collections.singletonList(r0)
            X.0qQ.A07(r0)
            r1.put(r2, r0)
            java.util.Map r7 = A00
            com.instagram.quickpromotion.intf.Trigger r0 = com.instagram.quickpromotion.intf.Trigger.A15
            goto L_0x06d6
        L_0x04ab:
            java.util.Map r1 = A01
            X.2ka r0 = X.C227972ka.A1P
            java.util.List r0 = java.util.Collections.singletonList(r0)
            X.0qQ.A07(r0)
            r1.put(r2, r0)
            java.util.Map r7 = A00
            com.instagram.quickpromotion.intf.Trigger r0 = com.instagram.quickpromotion.intf.Trigger.A14
            goto L_0x06d6
        L_0x04bf:
            java.util.Map r1 = A01
            X.2ka r0 = X.C227972ka.A1f
            java.util.List r0 = java.util.Collections.singletonList(r0)
            X.0qQ.A07(r0)
            r1.put(r2, r0)
            java.util.Map r7 = A00
            com.instagram.quickpromotion.intf.Trigger r6 = com.instagram.quickpromotion.intf.Trigger.A1E
            com.instagram.quickpromotion.intf.Trigger r1 = com.instagram.quickpromotion.intf.Trigger.A1G
            com.instagram.quickpromotion.intf.Trigger r0 = com.instagram.quickpromotion.intf.Trigger.A1K
            goto L_0x0528
        L_0x04d6:
            java.util.Map r1 = A01
            X.2ka r0 = X.C227972ka.A1g
            java.util.List r0 = java.util.Collections.singletonList(r0)
            X.0qQ.A07(r0)
            r1.put(r2, r0)
            java.util.Map r7 = A00
            com.instagram.quickpromotion.intf.Trigger r0 = com.instagram.quickpromotion.intf.Trigger.A1J
            goto L_0x06d6
        L_0x04ea:
            java.util.Map r1 = A01
            X.2ka r0 = X.C227972ka.A1B
            java.util.List r0 = java.util.Collections.singletonList(r0)
            X.0qQ.A07(r0)
            r1.put(r2, r0)
            java.util.Map r7 = A00
            com.instagram.quickpromotion.intf.Trigger r0 = com.instagram.quickpromotion.intf.Trigger.A0z
            goto L_0x06d6
        L_0x04fe:
            java.util.Map r1 = A01
            X.2ka r0 = X.C227972ka.A1C
            java.util.List r0 = java.util.Collections.singletonList(r0)
            X.0qQ.A07(r0)
            r1.put(r2, r0)
            java.util.Map r7 = A00
            com.instagram.quickpromotion.intf.Trigger r0 = com.instagram.quickpromotion.intf.Trigger.A10
            goto L_0x06d6
        L_0x0512:
            java.util.Map r1 = A01
            X.2ka r0 = X.C227972ka.A17
            java.util.List r0 = java.util.Collections.singletonList(r0)
            X.0qQ.A07(r0)
            r1.put(r2, r0)
            java.util.Map r7 = A00
            com.instagram.quickpromotion.intf.Trigger r6 = com.instagram.quickpromotion.intf.Trigger.A1U
            com.instagram.quickpromotion.intf.Trigger r1 = com.instagram.quickpromotion.intf.Trigger.A1V
            com.instagram.quickpromotion.intf.Trigger r0 = com.instagram.quickpromotion.intf.Trigger.A1P
        L_0x0528:
            java.util.EnumSet r0 = java.util.EnumSet.of(r6, r1, r0)
            goto L_0x06da
        L_0x052e:
            java.util.Map r1 = A01
            X.2ka r0 = X.C227972ka.A14
            java.util.List r0 = java.util.Collections.singletonList(r0)
            X.0qQ.A07(r0)
            r1.put(r2, r0)
            java.util.Map r7 = A00
            com.instagram.quickpromotion.intf.Trigger r1 = com.instagram.quickpromotion.intf.Trigger.A1Q
            com.instagram.quickpromotion.intf.Trigger r0 = com.instagram.quickpromotion.intf.Trigger.A1T
            goto L_0x066e
        L_0x0544:
            java.util.Map r1 = A01
            X.2ka r0 = X.C227972ka.A1E
            java.util.List r0 = java.util.Collections.singletonList(r0)
            X.0qQ.A07(r0)
            r1.put(r2, r0)
            java.util.Map r7 = A00
            com.instagram.quickpromotion.intf.Trigger r0 = com.instagram.quickpromotion.intf.Trigger.A1b
            goto L_0x06d6
        L_0x0558:
            java.util.Map r7 = A01
            X.2ka r0 = X.C227972ka.A1e
            goto L_0x0651
        L_0x055e:
            java.util.Map r1 = A01
            X.2ka r0 = X.C227972ka.A1m
            java.util.List r0 = java.util.Collections.singletonList(r0)
            X.0qQ.A07(r0)
            r1.put(r2, r0)
            java.util.Map r7 = A00
            com.instagram.quickpromotion.intf.Trigger r0 = com.instagram.quickpromotion.intf.Trigger.A28
            goto L_0x06d6
        L_0x0572:
            java.util.Map r7 = A01
            X.2ka r0 = X.C227972ka.A1n
            goto L_0x0651
        L_0x0578:
            java.util.Map r1 = A01
            X.2ka r0 = X.C227972ka.A0V
            java.util.List r0 = java.util.Collections.singletonList(r0)
            X.0qQ.A07(r0)
            r1.put(r2, r0)
            java.util.Map r7 = A00
            com.instagram.quickpromotion.intf.Trigger r0 = com.instagram.quickpromotion.intf.Trigger.A0M
            goto L_0x06d6
        L_0x058c:
            java.util.Map r7 = A01
            X.2ka r6 = X.C227972ka.A11
            X.2ka r1 = X.C227972ka.A12
            X.2ka r0 = X.C227972ka.A1A
            X.2ka[] r0 = new X.C227972ka[]{r6, r1, r0}
            java.util.List r0 = X.0sr.A1P(r0)
            r7.put(r2, r0)
            java.util.Map r7 = A00
            com.instagram.quickpromotion.intf.Trigger r1 = com.instagram.quickpromotion.intf.Trigger.A11
            com.instagram.quickpromotion.intf.Trigger r0 = com.instagram.quickpromotion.intf.Trigger.A12
            goto L_0x066e
        L_0x05a7:
            java.util.Map r1 = A01
            X.2ka r0 = X.C227972ka.A10
            java.util.List r0 = java.util.Collections.singletonList(r0)
            X.0qQ.A07(r0)
            r1.put(r2, r0)
            java.util.Map r7 = A00
            com.instagram.quickpromotion.intf.Trigger r0 = com.instagram.quickpromotion.intf.Trigger.A0y
            goto L_0x06d6
        L_0x05bb:
            java.util.Map r1 = A01
            X.2ka r0 = X.C227972ka.A1c
            java.util.List r0 = java.util.Collections.singletonList(r0)
            X.0qQ.A07(r0)
            r1.put(r2, r0)
            java.util.Map r7 = A00
            com.instagram.quickpromotion.intf.Trigger r0 = com.instagram.quickpromotion.intf.Trigger.A1x
            goto L_0x06d6
        L_0x05cf:
            java.util.Map r1 = A01
            X.2ka r0 = X.C227972ka.A1U
            java.util.List r0 = java.util.Collections.singletonList(r0)
            X.0qQ.A07(r0)
            r1.put(r2, r0)
            java.util.Map r7 = A00
            com.instagram.quickpromotion.intf.Trigger r0 = com.instagram.quickpromotion.intf.Trigger.A1s
            goto L_0x06d6
        L_0x05e3:
            java.util.Map r1 = A01
            X.2ka r0 = X.C227972ka.A1k
            java.util.List r0 = java.util.Collections.singletonList(r0)
            X.0qQ.A07(r0)
            r1.put(r2, r0)
            java.util.Map r7 = A00
            com.instagram.quickpromotion.intf.Trigger r0 = com.instagram.quickpromotion.intf.Trigger.A26
            goto L_0x06d6
        L_0x05f7:
            java.util.Map r1 = A01
            X.2ka r0 = X.C227972ka.A1i
            java.util.List r0 = java.util.Collections.singletonList(r0)
            X.0qQ.A07(r0)
            r1.put(r2, r0)
            java.util.Map r7 = A00
            com.instagram.quickpromotion.intf.Trigger r0 = com.instagram.quickpromotion.intf.Trigger.A1I
            goto L_0x06d6
        L_0x060b:
            java.util.Map r1 = A01
            X.2ka r0 = X.C227972ka.A1N
            java.util.List r0 = java.util.Collections.singletonList(r0)
            X.0qQ.A07(r0)
            r1.put(r2, r0)
            java.util.Map r7 = A00
            com.instagram.quickpromotion.intf.Trigger r1 = com.instagram.quickpromotion.intf.Trigger.A0r
            com.instagram.quickpromotion.intf.Trigger r0 = com.instagram.quickpromotion.intf.Trigger.A0s
            goto L_0x066e
        L_0x0620:
            java.util.Map r7 = A01
            X.2ka r0 = X.C227972ka.A0D
            goto L_0x0651
        L_0x0625:
            java.util.Map r1 = A01
            X.2ka r0 = X.C227972ka.A0F
            java.util.List r0 = java.util.Collections.singletonList(r0)
            X.0qQ.A07(r0)
            r1.put(r2, r0)
            java.util.Map r7 = A00
            com.instagram.quickpromotion.intf.Trigger r0 = com.instagram.quickpromotion.intf.Trigger.A0C
            goto L_0x06d6
        L_0x0639:
            java.util.Map r1 = A01
            X.2ka r0 = X.C227972ka.A0H
            java.util.List r0 = java.util.Collections.singletonList(r0)
            X.0qQ.A07(r0)
            r1.put(r2, r0)
            java.util.Map r7 = A00
            com.instagram.quickpromotion.intf.Trigger r0 = com.instagram.quickpromotion.intf.Trigger.A0D
            goto L_0x06d6
        L_0x064d:
            java.util.Map r7 = A01
            X.2ka r0 = X.C227972ka.A0G
        L_0x0651:
            java.util.List r0 = java.util.Collections.singletonList(r0)
            X.0qQ.A07(r0)
            goto L_0x06da
        L_0x065a:
            java.util.Map r1 = A01
            X.2ka r0 = X.C227972ka.A19
            java.util.List r0 = java.util.Collections.singletonList(r0)
            X.0qQ.A07(r0)
            r1.put(r2, r0)
            java.util.Map r7 = A00
            com.instagram.quickpromotion.intf.Trigger r1 = com.instagram.quickpromotion.intf.Trigger.A0A
            com.instagram.quickpromotion.intf.Trigger r0 = com.instagram.quickpromotion.intf.Trigger.A1q
        L_0x066e:
            java.util.EnumSet r0 = java.util.EnumSet.of(r1, r0)
            goto L_0x06da
        L_0x0673:
            java.util.Map r1 = A01
            X.2ka r0 = X.C227972ka.A1D
            java.util.List r0 = java.util.Collections.singletonList(r0)
            X.0qQ.A07(r0)
            r1.put(r2, r0)
            java.util.Map r7 = A00
            com.instagram.quickpromotion.intf.Trigger r0 = com.instagram.quickpromotion.intf.Trigger.A0g
            goto L_0x06d6
        L_0x0686:
            java.util.Map r1 = A01
            X.2ka r0 = X.C227972ka.A06
            java.util.List r0 = java.util.Collections.singletonList(r0)
            X.0qQ.A07(r0)
            r1.put(r2, r0)
            java.util.Map r7 = A00
            com.instagram.quickpromotion.intf.Trigger r0 = com.instagram.quickpromotion.intf.Trigger.A06
            goto L_0x06d6
        L_0x0699:
            java.util.Map r7 = A01
            X.2ka r6 = X.C227972ka.A0q
            X.2ka r1 = X.C227972ka.A0p
            X.2ka r0 = X.C227972ka.A0o
            X.2ka[] r0 = new X.C227972ka[]{r6, r1, r0}
            java.util.List r0 = X.0sr.A1P(r0)
            r7.put(r2, r0)
            java.util.Map r7 = A00
            com.instagram.quickpromotion.intf.Trigger r0 = com.instagram.quickpromotion.intf.Trigger.A0e
            goto L_0x06d6
        L_0x06b1:
            java.util.Map r1 = A01
            X.2ka r0 = X.C227972ka.A0B
            java.util.List r0 = java.util.Collections.singletonList(r0)
            X.0qQ.A07(r0)
            r1.put(r2, r0)
            java.util.Map r7 = A00
            com.instagram.quickpromotion.intf.Trigger r0 = com.instagram.quickpromotion.intf.Trigger.A1F
            goto L_0x06d6
        L_0x06c4:
            java.util.Map r1 = A01
            X.2ka r0 = X.C227972ka.A1S
            java.util.List r0 = java.util.Collections.singletonList(r0)
            X.0qQ.A07(r0)
            r1.put(r2, r0)
            java.util.Map r7 = A00
            com.instagram.quickpromotion.intf.Trigger r0 = com.instagram.quickpromotion.intf.Trigger.A18
        L_0x06d6:
            java.util.EnumSet r0 = java.util.EnumSet.of(r0)
        L_0x06da:
            r7.put(r2, r0)
        L_0x06dd:
            int r3 = r3 + 1
            goto L_0x00a9
        L_0x06e1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2kY.<clinit>():void");
    }

    public static final List A01(QuickPromotionSlot quickPromotionSlot) {
        List list = (List) A01.get(quickPromotionSlot);
        if (list == null || !(!list.isEmpty())) {
            return 0sn.A00;
        }
        return new ArrayList(list);
    }
}
