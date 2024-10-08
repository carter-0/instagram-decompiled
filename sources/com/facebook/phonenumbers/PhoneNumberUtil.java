package com.facebook.phonenumbers;

import X.002;
import X.AnonymousClass05K;
import X.AnonymousClass79x;
import X.AnonymousClass7A3;
import X.C3259474u;
import X.C3271879t;
import X.C3271979u;
import X.C3272079v;
import X.C3272179w;
import X.C3272279y;
import X.C3272379z;
import X.T91;
import X.T92;
import X.T93;
import android.content.Context;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class PhoneNumberUtil {
    public static PhoneNumberUtil A06;
    public static Pattern A07;
    public static Pattern A08;
    public static Pattern A09;
    public static Pattern A0A;
    public static Pattern A0B;
    public static Pattern A0C;
    public static Pattern A0D;
    public static Pattern A0E;
    public static Pattern A0F;
    public static Pattern A0G;
    public static final C3271979u A0H = new C3272079v();
    public static final C3271979u A0I = new C3272179w();
    public static final C3271979u A0J = new C3271879t();
    public static final Logger A0K = Logger.getLogger(PhoneNumberUtil.class.getName());
    public final C3272279y A00;
    public final C3272379z A01 = new C3272379z(100);
    public final Context A02;
    public final AnonymousClass79x A03;
    public final Map A04 = Collections.synchronizedMap(new HashMap());
    public final Map A05 = Collections.synchronizedMap(new HashMap());

    private int A00(String str) {
        C3272279y r4 = this.A00;
        int A002 = r4.A00(str);
        if (A002 != -1) {
            return A002;
        }
        T93 A0E2 = A0E(str);
        if (A0E2 != null) {
            int i = A0E2.A00;
            if (str == null || str.length() == 0 || i < 0 || i > 32767) {
                throw new IllegalArgumentException();
            }
            if (r4.A00(str) == -1) {
                synchronized (r4) {
                    Map map = r4.A00;
                    if (map == null) {
                        map = new HashMap();
                        r4.A00 = map;
                    }
                    if (!map.containsKey(str)) {
                        r4.A00.put(str, Integer.valueOf(i));
                    }
                }
            }
            return A0E2.A00;
        }
        throw new IllegalArgumentException(002.A0R("Invalid region code: ", str));
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, X.79y] */
    public static synchronized PhoneNumberUtil A01(Context context) {
        PhoneNumberUtil phoneNumberUtil;
        synchronized (PhoneNumberUtil.class) {
            phoneNumberUtil = A06;
            if (phoneNumberUtil == null) {
                Context applicationContext = context.getApplicationContext();
                phoneNumberUtil = new PhoneNumberUtil(applicationContext, new AnonymousClass79x(applicationContext), new Object());
                A06 = phoneNumberUtil;
            }
        }
        return phoneNumberUtil;
    }

    private Integer A02(T93 t93, String str) {
        if (A0L(t93.A04, str)) {
            if (A0L(t93.A09, str)) {
                return AnonymousClass05K.A0Y;
            }
            if (A0L(t93.A0D, str)) {
                return AnonymousClass05K.A0N;
            }
            if (A0L(t93.A0A, str)) {
                return AnonymousClass05K.A0j;
            }
            if (A0L(t93.A0G, str)) {
                return AnonymousClass05K.A0u;
            }
            if (A0L(t93.A08, str)) {
                return AnonymousClass05K.A15;
            }
            if (A0L(t93.A07, str)) {
                return AnonymousClass05K.A1F;
            }
            if (A0L(t93.A0E, str)) {
                return AnonymousClass05K.A1I;
            }
            if (A0L(t93.A0F, str)) {
                return AnonymousClass05K.A02;
            }
            boolean A0L = A0L(t93.A03, str);
            boolean z = t93.A0q;
            if (A0L) {
                if (z || A0L(t93.A05, str)) {
                    return AnonymousClass05K.A0C;
                }
                return AnonymousClass05K.A00;
            } else if (!z && A0L(t93.A05, str)) {
                return AnonymousClass05K.A01;
            }
        }
        return AnonymousClass05K.A03;
    }

    public static final String A04(C3259474u r3) {
        StringBuilder sb = new StringBuilder();
        if (r3.A0F) {
            char[] cArr = new char[r3.A01];
            Arrays.fill(cArr, '0');
            sb.append(new String(cArr));
        }
        sb.append(r3.A02);
        return sb.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a1, code lost:
        if (r5.matcher(r7).lookingAt() == false) goto L_0x00a3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0202  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0216  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x02a4  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0185  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01a4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A06(com.facebook.phonenumbers.PhoneNumberUtil r9, X.C3259474u r10, java.lang.String r11, java.lang.String r12, boolean r13, boolean r14) {
        /*
            if (r11 == 0) goto L_0x02ca
            int r1 = r11.length()
            r0 = 250(0xfa, float:3.5E-43)
            if (r1 > r0) goto L_0x02c0
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = ";phone-context="
            int r3 = r11.indexOf(r0)
            if (r3 <= 0) goto L_0x00b3
            int r2 = r3 + 15
            char r1 = r11.charAt(r2)
            r0 = 43
            if (r1 != r0) goto L_0x0030
            r0 = 59
            int r0 = r11.indexOf(r0, r2)
            if (r0 <= 0) goto L_0x00ad
            java.lang.String r0 = r11.substring(r2, r0)
        L_0x002d:
            r6.append(r0)
        L_0x0030:
            java.lang.String r0 = "tel:"
            int r1 = r11.indexOf(r0)
            r0 = 0
            if (r1 < 0) goto L_0x003b
            int r0 = r1 + 4
        L_0x003b:
            java.lang.String r3 = r11.substring(r0, r3)
        L_0x003f:
            r6.append(r3)
            java.lang.String r0 = ";isub="
            int r1 = r6.indexOf(r0)
            if (r1 <= 0) goto L_0x0051
            int r0 = r6.length()
            r6.delete(r1, r0)
        L_0x0051:
            java.lang.String r4 = r6.toString()
            int r0 = r4.length()
            r3 = 2
            if (r0 < r3) goto L_0x02b6
            java.util.regex.Pattern r1 = A0F
            java.lang.String r2 = "\\p{Nd}{2}|[+＋]*+(?:[-x‐-―−ー－-／  ­​⁠　()（）［］.\\[\\]/~⁓∼～*]*\\p{Nd}){3,}[-x‐-―−ー－-／  ­​⁠　()（）［］.\\[\\]/~⁓∼～*ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz\\p{Nd}]*(?:;ext=(\\p{Nd}{1,7})|[  \\t,]*(?:e?xt(?:ensi(?:ó?|ó))?n?|ｅ?ｘｔｎ?|[,xｘ#＃~～]|int|anexo|ｉｎｔ)[:\\.．]?[  \\t,-]*(\\p{Nd}{1,7})#?|[- ]+(\\p{Nd}{1,5})#)?"
            r0 = 66
            if (r1 != 0) goto L_0x0068
            java.util.regex.Pattern r1 = java.util.regex.Pattern.compile(r2, r0)
        L_0x0068:
            A0F = r1
            java.util.regex.Matcher r0 = r1.matcher(r4)
            boolean r0 = r0.matches()
            if (r0 == 0) goto L_0x02b6
            r8 = r9
            r4 = r12
            if (r14 == 0) goto L_0x0121
            java.lang.String r7 = r6.toString()
            X.79y r0 = r9.A00
            boolean r0 = r0.A03(r12)
            if (r0 != 0) goto L_0x0121
            if (r7 == 0) goto L_0x00a3
            int r0 = r7.length()
            if (r0 == 0) goto L_0x00a3
            java.util.regex.Pattern r5 = A0B
            java.lang.String r1 = "[+＋]+"
            r0 = 0
            if (r5 != 0) goto L_0x0097
            java.util.regex.Pattern r5 = java.util.regex.Pattern.compile(r1, r0)
        L_0x0097:
            A0B = r5
            java.util.regex.Matcher r0 = r5.matcher(r7)
            boolean r0 = r0.lookingAt()
            if (r0 != 0) goto L_0x0121
        L_0x00a3:
            java.lang.Integer r2 = X.AnonymousClass05K.A00
            java.lang.String r1 = "Missing or invalid default region."
            X.2sh r0 = new X.2sh
            r0.<init>(r2, r1)
            throw r0
        L_0x00ad:
            java.lang.String r0 = r11.substring(r2)
            goto L_0x002d
        L_0x00b3:
            java.util.regex.Pattern r1 = A0G
            java.lang.String r0 = "[+＋\\p{Nd}]"
            r4 = 0
            if (r1 != 0) goto L_0x00be
            java.util.regex.Pattern r1 = java.util.regex.Pattern.compile(r0, r4)
        L_0x00be:
            A0G = r1
            java.util.regex.Matcher r1 = r1.matcher(r11)
            boolean r0 = r1.find()
            if (r0 == 0) goto L_0x011d
            int r0 = r1.start()
            java.lang.String r3 = r11.substring(r0)
            java.util.regex.Pattern r1 = A0D
            java.lang.String r0 = "[[\\P{N}&&\\P{L}]&&[^#]]+$"
            if (r1 != 0) goto L_0x00dc
            java.util.regex.Pattern r1 = java.util.regex.Pattern.compile(r0, r4)
        L_0x00dc:
            A0D = r1
            java.util.regex.Matcher r1 = r1.matcher(r3)
            boolean r0 = r1.find()
            if (r0 == 0) goto L_0x00fd
            int r0 = r1.start()
            java.lang.String r3 = r3.substring(r4, r0)
            java.util.logging.Logger r2 = A0K
            java.util.logging.Level r1 = java.util.logging.Level.FINER
            java.lang.String r0 = "Stripped trailing characters: "
            java.lang.String r0 = X.002.A0R(r0, r3)
            r2.log(r1, r0)
        L_0x00fd:
            java.util.regex.Pattern r1 = A0C
            java.lang.String r0 = "[\\\\/] *x"
            if (r1 != 0) goto L_0x0107
            java.util.regex.Pattern r1 = java.util.regex.Pattern.compile(r0, r4)
        L_0x0107:
            A0C = r1
            java.util.regex.Matcher r1 = r1.matcher(r3)
            boolean r0 = r1.find()
            if (r0 == 0) goto L_0x003f
            int r0 = r1.start()
            java.lang.String r3 = r3.substring(r4, r0)
            goto L_0x003f
        L_0x011d:
            java.lang.String r3 = ""
            goto L_0x003f
        L_0x0121:
            if (r13 == 0) goto L_0x0128
            r0 = 1
            r10.A0E = r0
            r10.A06 = r11
        L_0x0128:
            java.util.regex.Pattern r1 = A08
            java.lang.String r0 = "(?:;ext=(\\p{Nd}{1,7})|[  \\t,]*(?:e?xt(?:ensi(?:ó?|ó))?n?|ｅ?ｘｔｎ?|[,xｘ#＃~～]|int|anexo|ｉｎｔ)[:\\.．]?[  \\t,-]*(\\p{Nd}{1,7})#?|[- ]+(\\p{Nd}{1,5})#)$"
            r7 = 66
            if (r1 != 0) goto L_0x0134
            java.util.regex.Pattern r1 = java.util.regex.Pattern.compile(r0, r7)
        L_0x0134:
            A08 = r1
            java.util.regex.Matcher r5 = r1.matcher(r6)
            boolean r0 = r5.find()
            if (r0 == 0) goto L_0x0197
            r1 = 0
            int r0 = r5.start()
            java.lang.String r1 = r6.substring(r1, r0)
            int r0 = r1.length()
            if (r0 < r3) goto L_0x0197
            java.util.regex.Pattern r0 = A0F
            if (r0 != 0) goto L_0x0157
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r2, r7)
        L_0x0157:
            A0F = r0
            java.util.regex.Matcher r0 = r0.matcher(r1)
            boolean r0 = r0.matches()
            if (r0 == 0) goto L_0x0197
            int r2 = r5.groupCount()
            r1 = 1
        L_0x0168:
            if (r1 > r2) goto L_0x0197
            java.lang.String r0 = r5.group(r1)
            if (r0 == 0) goto L_0x0194
            java.lang.String r2 = r5.group(r1)
            int r1 = r5.start()
            int r0 = r6.length()
            r6.delete(r1, r0)
        L_0x017f:
            int r0 = r2.length()
            if (r0 <= 0) goto L_0x018a
            r0 = 1
            r10.A09 = r0
            r10.A04 = r2
        L_0x018a:
            X.T93 r9 = r9.A0E(r12)
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            goto L_0x019a
        L_0x0194:
            int r1 = r1 + 1
            goto L_0x0168
        L_0x0197:
            java.lang.String r2 = ""
            goto L_0x017f
        L_0x019a:
            java.lang.String r11 = r6.toString()     // Catch:{ 2sh -> 0x01be }
            int r5 = r8.A09(r9, r10, r11, r12, r13)     // Catch:{ 2sh -> 0x01be }
            if (r5 != 0) goto L_0x01f6
            A07(r6)
            r12.append(r6)
            if (r4 == 0) goto L_0x01b4
            int r1 = r9.A00
            r0 = 1
            r10.A07 = r0
            r10.A00 = r1
            goto L_0x020e
        L_0x01b4:
            if (r13 == 0) goto L_0x020e
            r0 = 0
            r10.A08 = r0
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            r10.A03 = r0
            goto L_0x020e
        L_0x01be:
            r7 = move-exception
            java.util.regex.Pattern r2 = A0B
            java.lang.String r1 = "[+＋]+"
            r0 = 0
            if (r2 != 0) goto L_0x01ca
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r1, r0)
        L_0x01ca:
            A0B = r2
            java.lang.String r0 = r6.toString()
            java.util.regex.Matcher r1 = r2.matcher(r0)
            java.lang.Integer r5 = r7.A00
            java.lang.Integer r2 = X.AnonymousClass05K.A00
            if (r5 != r2) goto L_0x02ac
            boolean r0 = r1.lookingAt()
            if (r0 == 0) goto L_0x02ac
            int r0 = r1.end()
            java.lang.String r11 = r6.substring(r0)
            int r5 = r8.A09(r9, r10, r11, r12, r13)
            if (r5 != 0) goto L_0x01f6
            java.lang.String r1 = "Could not interpret numbers after plus-sign."
            X.2sh r0 = new X.2sh
            r0.<init>(r2, r1)
            throw r0
        L_0x01f6:
            X.79y r0 = r8.A00
            java.lang.String r1 = r0.A01(r5)
            boolean r0 = r1.equals(r4)
            if (r0 != 0) goto L_0x020e
            java.lang.String r0 = "001"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x027a
            X.T93 r9 = r8.A0D(r5)
        L_0x020e:
            int r0 = r12.length()
            java.lang.String r2 = "The string supplied is too short to be a phone number."
            if (r0 < r3) goto L_0x02a4
            if (r9 == 0) goto L_0x024a
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r12)
            r8.A0K(r9, r4, r6)
            java.lang.String r5 = r4.toString()
            X.79z r1 = r8.A01
            X.T91 r0 = r9.A04
            java.lang.String r0 = r0.A02
            java.util.regex.Pattern r0 = r1.A00(r0)
            java.lang.Integer r1 = A03(r5, r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r1 == r0) goto L_0x024a
            if (r13 == 0) goto L_0x0249
            java.lang.String r1 = r6.toString()
            r1.getClass()
            r0 = 1
            r10.A0D = r0
            r10.A05 = r1
        L_0x0249:
            r12 = r4
        L_0x024a:
            int r1 = r12.length()
            if (r1 < r3) goto L_0x029c
            r0 = 17
            if (r1 > r0) goto L_0x0292
            java.lang.String r5 = r12.toString()
            int r4 = r5.length()
            r3 = 1
            if (r4 <= r3) goto L_0x0285
            r0 = 0
            char r0 = r5.charAt(r0)
            r2 = 48
            if (r0 != r2) goto L_0x0285
            r10.A0A = r3
            r10.A0F = r3
            r1 = 1
        L_0x026d:
            int r0 = r4 - r3
            if (r1 >= r0) goto L_0x027f
            char r0 = r5.charAt(r1)
            if (r0 != r2) goto L_0x027f
            int r1 = r1 + 1
            goto L_0x026d
        L_0x027a:
            X.T93 r9 = r8.A0E(r1)
            goto L_0x020e
        L_0x027f:
            if (r1 == r3) goto L_0x0285
            r10.A0C = r3
            r10.A01 = r1
        L_0x0285:
            java.lang.String r0 = r12.toString()
            long r0 = java.lang.Long.parseLong(r0)
            r10.A0B = r3
            r10.A02 = r0
            return
        L_0x0292:
            java.lang.Integer r2 = X.AnonymousClass05K.A0Y
            java.lang.String r1 = "The string supplied is too long to be a phone number."
            X.2sh r0 = new X.2sh
            r0.<init>(r2, r1)
            throw r0
        L_0x029c:
            java.lang.Integer r1 = X.AnonymousClass05K.A0N
            X.2sh r0 = new X.2sh
            r0.<init>(r1, r2)
            throw r0
        L_0x02a4:
            java.lang.Integer r1 = X.AnonymousClass05K.A0N
            X.2sh r0 = new X.2sh
            r0.<init>(r1, r2)
            throw r0
        L_0x02ac:
            java.lang.String r1 = r7.getMessage()
            X.2sh r0 = new X.2sh
            r0.<init>(r5, r1)
            throw r0
        L_0x02b6:
            java.lang.Integer r2 = X.AnonymousClass05K.A01
            java.lang.String r1 = "The string supplied did not seem to be a phone number."
            X.2sh r0 = new X.2sh
            r0.<init>(r2, r1)
            throw r0
        L_0x02c0:
            java.lang.Integer r2 = X.AnonymousClass05K.A0Y
            java.lang.String r1 = "The string supplied was too long to parse."
            X.2sh r0 = new X.2sh
            r0.<init>(r2, r1)
            throw r0
        L_0x02ca:
            java.lang.Integer r2 = X.AnonymousClass05K.A01
            java.lang.String r1 = "The phone number supplied was null."
            X.2sh r0 = new X.2sh
            r0.<init>(r2, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.phonenumbers.PhoneNumberUtil.A06(com.facebook.phonenumbers.PhoneNumberUtil, X.74u, java.lang.String, java.lang.String, boolean, boolean):void");
    }

    public final int A0A(String str) {
        if (this.A00.A03(str)) {
            return A00(str);
        }
        Logger logger = A0K;
        Level level = Level.WARNING;
        if (str == null) {
            str = "null";
        }
        logger.log(level, 002.A0g("Invalid or missing region code (", str, ") provided."));
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0024, code lost:
        return (X.T93) r3.get(r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.T93 A0D(int r5) {
        /*
            r4 = this;
            java.util.Map r3 = r4.A04
            monitor-enter(r3)
            short[] r1 = X.AnonymousClass7A3.A01     // Catch:{ all -> 0x0028 }
            short r0 = (short) r5     // Catch:{ all -> 0x0028 }
            int r0 = java.util.Arrays.binarySearch(r1, r0)     // Catch:{ all -> 0x0028 }
            if (r0 < 0) goto L_0x0025
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0028 }
            boolean r0 = r3.containsKey(r2)     // Catch:{ all -> 0x0028 }
            if (r0 != 0) goto L_0x001d
            java.lang.String r1 = "001"
            X.79x r0 = r4.A03     // Catch:{ all -> 0x0028 }
            r4.A0J(r0, r1, r5)     // Catch:{ all -> 0x0028 }
        L_0x001d:
            monitor-exit(r3)     // Catch:{ all -> 0x0028 }
            java.lang.Object r0 = r3.get(r2)
            X.T93 r0 = (X.T93) r0
            return r0
        L_0x0025:
            r0 = 0
            monitor-exit(r3)     // Catch:{ all -> 0x0028 }
            return r0
        L_0x0028:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0028 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.phonenumbers.PhoneNumberUtil.A0D(int):X.T93");
    }

    public final T93 A0E(String str) {
        if (!this.A00.A03(str)) {
            return null;
        }
        Map map = this.A05;
        synchronized (map) {
            if (!map.containsKey(str)) {
                A0J(this.A03, str, 0);
            }
        }
        return (T93) map.get(str);
    }

    public final C3259474u A0F(String str, String str2) {
        C3259474u r1 = new C3259474u();
        A06(this, r1, str, str2, false, true);
        return r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0080, code lost:
        if (r2 == r1) goto L_0x0082;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Integer A0G(X.C3259474u r7, X.C3259474u r8) {
        /*
            r6 = this;
            X.74u r4 = new X.74u
            r4.<init>()
            r4.A00(r7)
            X.74u r3 = new X.74u
            r3.<init>()
            r3.A00(r8)
            r5 = 0
            r4.A0E = r5
            java.lang.String r2 = ""
            r4.A06 = r2
            r4.A08 = r5
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            r4.A03 = r0
            r4.A0D = r5
            r4.A05 = r2
            r3.A0E = r5
            r3.A06 = r2
            r3.A08 = r5
            r3.A03 = r0
            r3.A0D = r5
            r3.A05 = r2
            boolean r0 = r4.A09
            if (r0 == 0) goto L_0x003d
            java.lang.String r0 = r4.A04
            int r0 = r0.length()
            if (r0 != 0) goto L_0x003d
            r4.A09 = r5
            r4.A04 = r2
        L_0x003d:
            boolean r1 = r3.A09
            if (r1 == 0) goto L_0x004e
            java.lang.String r0 = r3.A04
            int r0 = r0.length()
            if (r0 != 0) goto L_0x004e
            r3.A09 = r5
            r1 = 0
            r3.A04 = r2
        L_0x004e:
            boolean r0 = r4.A09
            if (r0 == 0) goto L_0x0061
            if (r1 == 0) goto L_0x0061
            java.lang.String r1 = r4.A04
            java.lang.String r0 = r3.A04
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0061
        L_0x005e:
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            return r0
        L_0x0061:
            int r2 = r4.A00
            int r1 = r3.A00
            if (r2 == 0) goto L_0x0072
            if (r1 == 0) goto L_0x0072
            boolean r0 = r4.A01(r3)
            if (r0 == 0) goto L_0x0080
            java.lang.Integer r0 = X.AnonymousClass05K.A0Y
            return r0
        L_0x0072:
            r0 = 1
            r4.A07 = r0
            r4.A00 = r1
            boolean r0 = r4.A01(r3)
            if (r0 == 0) goto L_0x0082
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            return r0
        L_0x0080:
            if (r2 != r1) goto L_0x005e
        L_0x0082:
            long r0 = r4.A02
            java.lang.String r2 = java.lang.String.valueOf(r0)
            long r0 = r3.A02
            java.lang.String r1 = java.lang.String.valueOf(r0)
            boolean r0 = r2.endsWith(r1)
            if (r0 != 0) goto L_0x009a
            boolean r0 = r1.endsWith(r2)
            if (r0 == 0) goto L_0x005e
        L_0x009a:
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.phonenumbers.PhoneNumberUtil.A0G(X.74u, X.74u):java.lang.Integer");
    }

    public final String A0H(C3259474u r7) {
        int i = r7.A00;
        ArrayList A022 = this.A00.A02(i);
        if (A022 == null) {
            A0K.log(Level.WARNING, 002.A05(i, "Missing/invalid country_code (", ") for number ", A04(r7)));
            return null;
        } else if (A022.size() == 1) {
            return (String) A022.get(0);
        } else {
            String A042 = A04(r7);
            Iterator it = A022.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                T93 A0E2 = A0E(str);
                if (A0E2.A0V) {
                    if (this.A01.A00(A0E2.A0J).matcher(A042).lookingAt()) {
                        return str;
                    }
                } else if (A02(A0E2, A042) != AnonymousClass05K.A03) {
                    return str;
                }
            }
            return null;
        }
    }

    public final String A0I(C3259474u r10, Integer num) {
        T93 A0E2;
        char c;
        String str;
        if (r10.A02 == 0 && r10.A0E) {
            String str2 = r10.A06;
            if (str2.length() > 0) {
                return str2;
            }
        }
        StringBuilder sb = new StringBuilder(20);
        sb.setLength(0);
        int i = r10.A00;
        String A042 = A04(r10);
        if (num == AnonymousClass05K.A00) {
            sb.append(A042);
            c = '+';
        } else {
            C3272279y r2 = this.A00;
            if (Arrays.binarySearch(AnonymousClass7A3.A01, (short) i) >= 0) {
                String A012 = r2.A01(i);
                if ("001".equals(A012)) {
                    A0E2 = A0D(i);
                } else {
                    A0E2 = A0E(A012);
                }
                List list = A0E2.A0P;
                if (list.size() == 0 || num == AnonymousClass05K.A0C) {
                    list = A0E2.A0Q;
                }
                T92 A0C2 = A0C(A042, list);
                if (A0C2 != null) {
                    String str3 = A0C2.A01;
                    Matcher matcher = this.A01.A00(A0C2.A03).matcher(A042);
                    Integer num2 = AnonymousClass05K.A0C;
                    String str4 = A0C2.A02;
                    if (num != num2 || str4 == null || str4.length() <= 0) {
                        A042 = matcher.replaceAll(str3);
                    } else {
                        Pattern pattern = A0A;
                        if (pattern == null) {
                            pattern = Pattern.compile("(\\$\\d)", 0);
                        }
                        A0A = pattern;
                        A042 = matcher.replaceAll(pattern.matcher(str3).replaceFirst(str4));
                    }
                }
                sb.append(A042);
                if (r10.A09) {
                    String str5 = r10.A04;
                    if (str5.length() > 0) {
                        if (A0E2.A0d) {
                            str = A0E2.A0N;
                        } else {
                            str = " ext. ";
                        }
                        sb.append(str);
                        sb.append(str5);
                    }
                }
                int intValue = num.intValue();
                c = '+';
                if (intValue != 0) {
                    if (intValue == 1) {
                        sb.insert(0, " ");
                    }
                }
            } else {
                sb.append(A042);
            }
            return sb.toString();
        }
        sb.insert(0, i);
        sb.insert(0, c);
        return sb.toString();
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:30:0x007d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x0089 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0J(X.AnonymousClass79x r11, java.lang.String r12, int r13) {
        /*
            r10 = this;
            java.lang.String r3 = "PhoneNumberMetadataProto"
            java.lang.String r4 = "empty metadata: "
            java.lang.String r0 = "001"
            boolean r9 = r0.equals(r12)
            java.lang.String r2 = "libphone_data/"
            java.lang.String r1 = "_"
            if (r9 == 0) goto L_0x0019
            java.lang.String r0 = java.lang.String.valueOf(r13)
        L_0x0014:
            java.lang.String r5 = X.002.A0u(r2, r3, r1, r0)
            goto L_0x001b
        L_0x0019:
            r0 = r12
            goto L_0x0014
        L_0x001b:
            android.content.Context r0 = r11.A00     // Catch:{ IOException -> 0x00e7 }
            android.content.res.AssetManager r1 = r0.getAssets()     // Catch:{ IOException -> 0x00e7 }
            java.lang.String r0 = "libphone_data.zip"
            java.io.InputStream r0 = r1.open(r0)     // Catch:{ IOException -> 0x00e7 }
            java.util.zip.ZipInputStream r1 = new java.util.zip.ZipInputStream     // Catch:{ IOException -> 0x00e7 }
            r1.<init>(r0)     // Catch:{ IOException -> 0x00e7 }
        L_0x002c:
            java.util.zip.ZipEntry r0 = r1.getNextEntry()     // Catch:{ IOException -> 0x00e7 }
            if (r0 == 0) goto L_0x00e7
            java.lang.String r0 = r0.getName()     // Catch:{ IOException -> 0x00e7 }
            boolean r0 = r0.equals(r5)     // Catch:{ IOException -> 0x00e7 }
            if (r0 == 0) goto L_0x002c
            java.io.ObjectInputStream r8 = new java.io.ObjectInputStream     // Catch:{ IOException -> 0x00cf }
            r8.<init>(r1)     // Catch:{ IOException -> 0x00cf }
            java.lang.String r7 = "error closing input stream (ignored)"
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ IOException -> 0x00cf }
            r3.<init>()     // Catch:{ IOException -> 0x00cf }
            int r2 = r8.readInt()     // Catch:{ IOException -> 0x006a }
            r1 = 0
        L_0x004d:
            if (r1 >= r2) goto L_0x005d
            X.T93 r0 = new X.T93     // Catch:{ IOException -> 0x006a }
            r0.<init>()     // Catch:{ IOException -> 0x006a }
            r0.readExternal(r8)     // Catch:{ IOException -> 0x006a }
            r3.add(r0)     // Catch:{ IOException -> 0x006a }
            int r1 = r1 + 1
            goto L_0x004d
        L_0x005d:
            r8.close()     // Catch:{ IOException -> 0x0061 }
            goto L_0x0089
        L_0x0061:
            r2 = move-exception
            java.util.logging.Logger r1 = A0K     // Catch:{ all -> 0x0089 }
            java.util.logging.Level r0 = java.util.logging.Level.WARNING     // Catch:{ all -> 0x0089 }
            r1.log(r0, r7, r2)     // Catch:{ all -> 0x0089 }
            goto L_0x0089
        L_0x006a:
            r6 = move-exception
            java.util.logging.Logger r2 = A0K     // Catch:{ all -> 0x007d }
            java.util.logging.Level r1 = java.util.logging.Level.WARNING     // Catch:{ all -> 0x007d }
            java.lang.String r0 = "error reading input (ignored)"
            r2.log(r1, r0, r6)     // Catch:{ all -> 0x007d }
            r8.close()     // Catch:{ IOException -> 0x0078 }
            goto L_0x0089
        L_0x0078:
            r0 = move-exception
            r2.log(r1, r7, r0)     // Catch:{ all -> 0x0089 }
            goto L_0x0089
        L_0x007d:
            r8.close()     // Catch:{ IOException -> 0x0081 }
            goto L_0x0089
        L_0x0081:
            r2 = move-exception
            java.util.logging.Logger r1 = A0K     // Catch:{ all -> 0x0089 }
            java.util.logging.Level r0 = java.util.logging.Level.WARNING     // Catch:{ all -> 0x0089 }
            r1.log(r0, r7, r2)     // Catch:{ all -> 0x0089 }
        L_0x0089:
            boolean r0 = r3.isEmpty()     // Catch:{ IOException -> 0x00cf }
            if (r0 != 0) goto L_0x00ba
            int r1 = r3.size()     // Catch:{ IOException -> 0x00cf }
            r0 = 1
            if (r1 <= r0) goto L_0x00a3
            java.util.logging.Logger r2 = A0K     // Catch:{ IOException -> 0x00cf }
            java.util.logging.Level r1 = java.util.logging.Level.WARNING     // Catch:{ IOException -> 0x00cf }
            java.lang.String r0 = "invalid metadata (too many entries): "
            java.lang.String r0 = X.002.A0R(r0, r5)     // Catch:{ IOException -> 0x00cf }
            r2.log(r1, r0)     // Catch:{ IOException -> 0x00cf }
        L_0x00a3:
            r0 = 0
            java.lang.Object r2 = r3.get(r0)     // Catch:{ IOException -> 0x00cf }
            if (r9 == 0) goto L_0x00b4
            java.util.Map r1 = r10.A04     // Catch:{ IOException -> 0x00cf }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r13)     // Catch:{ IOException -> 0x00cf }
            r1.put(r0, r2)     // Catch:{ IOException -> 0x00cf }
            return
        L_0x00b4:
            java.util.Map r0 = r10.A05     // Catch:{ IOException -> 0x00cf }
            r0.put(r12, r2)     // Catch:{ IOException -> 0x00cf }
            return
        L_0x00ba:
            java.util.logging.Logger r2 = A0K     // Catch:{ IOException -> 0x00cf }
            java.util.logging.Level r1 = java.util.logging.Level.SEVERE     // Catch:{ IOException -> 0x00cf }
            java.lang.String r0 = X.002.A0R(r4, r5)     // Catch:{ IOException -> 0x00cf }
            r2.log(r1, r0)     // Catch:{ IOException -> 0x00cf }
            java.lang.String r1 = X.002.A0R(r4, r5)     // Catch:{ IOException -> 0x00cf }
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ IOException -> 0x00cf }
            r0.<init>(r1)     // Catch:{ IOException -> 0x00cf }
            throw r0     // Catch:{ IOException -> 0x00cf }
        L_0x00cf:
            r4 = move-exception
            java.util.logging.Logger r3 = A0K
            java.util.logging.Level r2 = java.util.logging.Level.SEVERE
            java.lang.String r1 = "cannot load/parse metadata: "
            java.lang.String r0 = X.002.A0R(r1, r5)
            r3.log(r2, r0, r4)
            java.lang.String r0 = X.002.A0R(r1, r5)
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0, r4)
            throw r1
        L_0x00e7:
            java.util.logging.Logger r3 = A0K
            java.util.logging.Level r2 = java.util.logging.Level.SEVERE
            java.lang.String r1 = "missing metadata: "
            java.lang.String r0 = X.002.A0R(r1, r5)
            r3.log(r2, r0)
            java.lang.String r0 = X.002.A0R(r1, r5)
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.phonenumbers.PhoneNumberUtil.A0J(X.79x, java.lang.String, int):void");
    }

    public final boolean A0L(T91 t91, String str) {
        C3272379z r2 = this.A01;
        Matcher matcher = r2.A00(t91.A01).matcher(str);
        if (!r2.A00(t91.A02).matcher(str).matches() || !matcher.matches()) {
            return false;
        }
        return true;
    }

    public PhoneNumberUtil(Context context, AnonymousClass79x r4, C3272279y r5) {
        this.A02 = context;
        this.A03 = r4;
        this.A00 = r5;
    }

    public static Integer A03(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.matches()) {
            return AnonymousClass05K.A00;
        }
        if (matcher.lookingAt()) {
            return AnonymousClass05K.A0N;
        }
        return AnonymousClass05K.A0C;
    }

    public static String A05(String str) {
        StringBuilder sb = new StringBuilder(str.length());
        for (char digit : str.toCharArray()) {
            int digit2 = Character.digit(digit, 10);
            if (digit2 != -1) {
                sb.append(digit2);
            }
        }
        return sb.toString();
    }

    public static void A07(StringBuilder sb) {
        String str;
        String obj = sb.toString();
        Pattern pattern = A0E;
        if (pattern == null) {
            pattern = Pattern.compile("(?:.*?[A-Za-z]){3}.*", 0);
        }
        A0E = pattern;
        if (pattern.matcher(obj).matches()) {
            C3271979u r5 = A0I;
            int length = obj.length();
            StringBuilder sb2 = new StringBuilder(length);
            for (int i = 0; i < length; i++) {
                char AWt = r5.AWt(Character.toUpperCase(obj.charAt(i)), 55296);
                if (AWt != 55296) {
                    sb2.append(AWt);
                }
            }
            str = sb2.toString();
        } else {
            str = A05(obj);
        }
        sb.replace(0, sb.length(), str);
    }

    public static boolean A08(String str) {
        if (str.length() != 0) {
            Pattern pattern = A09;
            if (pattern == null) {
                pattern = Pattern.compile("\\(?\\$1\\)?", 0);
            }
            A09 = pattern;
            if (pattern.matcher(str).matches()) {
                return true;
            }
            return false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00b6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A09(X.T93 r10, X.C3259474u r11, java.lang.String r12, java.lang.StringBuilder r13, boolean r14) {
        /*
            r9 = this;
            int r0 = r12.length()
            r3 = 0
            if (r0 == 0) goto L_0x0121
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r12)
            if (r10 == 0) goto L_0x00a8
            java.lang.String r2 = r10.A0I
        L_0x0010:
            int r0 = r4.length()
            if (r0 == 0) goto L_0x009f
            java.util.regex.Pattern r1 = A0B
            java.lang.String r0 = "[+＋]+"
            if (r1 != 0) goto L_0x0020
            java.util.regex.Pattern r1 = java.util.regex.Pattern.compile(r0, r3)
        L_0x0020:
            A0B = r1
            java.util.regex.Matcher r1 = r1.matcher(r4)
            boolean r0 = r1.lookingAt()
            if (r0 == 0) goto L_0x005d
            int r0 = r1.end()
            r4.delete(r3, r0)
            A07(r4)
            java.lang.Integer r1 = X.AnonymousClass05K.A00
        L_0x0038:
            if (r14 == 0) goto L_0x0042
            r1.getClass()
            r0 = 1
            r11.A08 = r0
            r11.A03 = r1
        L_0x0042:
            java.lang.Integer r5 = X.AnonymousClass05K.A0N
            if (r1 == r5) goto L_0x00b6
            int r1 = r4.length()
            r0 = 2
            if (r1 <= r0) goto L_0x00ac
            int r2 = r9.A0B(r4, r13)
            if (r2 != 0) goto L_0x0116
            java.lang.Integer r2 = X.AnonymousClass05K.A00
            java.lang.String r1 = "Country calling code supplied was not recognised."
            X.2sh r0 = new X.2sh
            r0.<init>(r2, r1)
            throw r0
        L_0x005d:
            X.79z r0 = r9.A01
            java.util.regex.Pattern r0 = r0.A00(r2)
            A07(r4)
            java.util.regex.Matcher r1 = r0.matcher(r4)
            boolean r0 = r1.lookingAt()
            if (r0 == 0) goto L_0x009f
            int r5 = r1.end()
            java.util.regex.Pattern r1 = A07
            java.lang.String r0 = "(\\p{Nd})"
            if (r1 != 0) goto L_0x007e
            java.util.regex.Pattern r1 = java.util.regex.Pattern.compile(r0, r3)
        L_0x007e:
            A07 = r1
            java.lang.String r0 = r4.substring(r5)
            java.util.regex.Matcher r2 = r1.matcher(r0)
            boolean r1 = r2.find()
            r0 = 1
            if (r1 == 0) goto L_0x00a2
            java.lang.String r0 = r2.group(r0)
            java.lang.String r1 = A05(r0)
            java.lang.String r0 = "0"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00a2
        L_0x009f:
            java.lang.Integer r1 = X.AnonymousClass05K.A0N
            goto L_0x0038
        L_0x00a2:
            r4.delete(r3, r5)
            java.lang.Integer r1 = X.AnonymousClass05K.A01
            goto L_0x0038
        L_0x00a8:
            java.lang.String r2 = "NonMatch"
            goto L_0x0010
        L_0x00ac:
            java.lang.Integer r2 = X.AnonymousClass05K.A0C
            java.lang.String r1 = "Phone number had an IDD, but after this was not long enough to be a viable phone number."
            X.2sh r0 = new X.2sh
            r0.<init>(r2, r1)
            throw r0
        L_0x00b6:
            if (r10 == 0) goto L_0x011c
            int r2 = r10.A00
            java.lang.String r6 = java.lang.String.valueOf(r2)
            java.lang.String r1 = r4.toString()
            boolean r0 = r1.startsWith(r6)
            if (r0 == 0) goto L_0x011c
            int r0 = r6.length()
            java.lang.String r0 = r1.substring(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            X.T91 r8 = r10.A04
            X.79z r6 = r9.A01
            java.lang.String r0 = r8.A01
            java.util.regex.Pattern r7 = r6.A00(r0)
            r0 = 0
            r9.A0K(r10, r1, r0)
            java.lang.String r0 = r8.A02
            java.util.regex.Pattern r6 = r6.A00(r0)
            java.util.regex.Matcher r0 = r7.matcher(r4)
            boolean r0 = r0.matches()
            if (r0 != 0) goto L_0x00fd
            java.util.regex.Matcher r0 = r7.matcher(r1)
            boolean r0 = r0.matches()
            if (r0 != 0) goto L_0x0107
        L_0x00fd:
            java.lang.String r0 = r4.toString()
            java.lang.Integer r0 = A03(r0, r6)
            if (r0 != r5) goto L_0x011c
        L_0x0107:
            r13.append(r1)
            if (r14 == 0) goto L_0x0116
            java.lang.Integer r1 = X.AnonymousClass05K.A0C
            r1.getClass()
            r0 = 1
            r11.A08 = r0
            r11.A03 = r1
        L_0x0116:
            r0 = 1
            r11.A07 = r0
            r11.A00 = r2
            return r2
        L_0x011c:
            r0 = 1
            r11.A07 = r0
            r11.A00 = r3
        L_0x0121:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.phonenumbers.PhoneNumberUtil.A09(X.T93, X.74u, java.lang.String, java.lang.StringBuilder, boolean):int");
    }

    public final int A0B(StringBuilder sb, StringBuilder sb2) {
        if (sb.length() != 0 && sb.charAt(0) != '0') {
            int length = sb.length();
            int i = 1;
            while (i <= length) {
                int parseInt = Integer.parseInt(sb.substring(0, i));
                if (Arrays.binarySearch(AnonymousClass7A3.A01, (short) parseInt) < 0) {
                    i++;
                    if (i > 3) {
                        break;
                    }
                } else {
                    sb2.append(sb.substring(i));
                    return parseInt;
                }
            }
        }
        return 0;
    }

    public final T92 A0C(String str, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            T92 t92 = (T92) it.next();
            List list2 = t92.A04;
            int size = list2.size();
            if ((size == 0 || this.A01.A00((String) list2.get(size - 1)).matcher(str).lookingAt()) && this.A01.A00(t92.A03).matcher(str).matches()) {
                return t92;
            }
        }
        return null;
    }

    public final boolean A0K(T93 t93, StringBuilder sb, StringBuilder sb2) {
        int length = sb.length();
        String str = t93.A0K;
        if (!(length == 0 || str.length() == 0)) {
            C3272379z r2 = this.A01;
            Matcher matcher = r2.A00(str).matcher(sb);
            if (matcher.lookingAt()) {
                Pattern A002 = r2.A00(t93.A04.A01);
                boolean matches = A002.matcher(sb).matches();
                int groupCount = matcher.groupCount();
                String str2 = t93.A0L;
                if (str2 != null && str2.length() != 0 && matcher.group(groupCount) != null) {
                    StringBuilder sb3 = new StringBuilder(sb);
                    sb3.replace(0, length, matcher.replaceFirst(str2));
                    if (!matches || A002.matcher(sb3.toString()).matches()) {
                        if (sb2 != null && groupCount > 1) {
                            sb2.append(matcher.group(1));
                        }
                        sb.replace(0, sb.length(), sb3.toString());
                        return true;
                    }
                } else if (matches && !A002.matcher(sb.substring(matcher.end())).matches()) {
                    return false;
                } else {
                    if (!(sb2 == null || groupCount <= 0 || matcher.group(groupCount) == null)) {
                        sb2.append(matcher.group(1));
                    }
                    sb.delete(0, matcher.end());
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean A0M(C3259474u r6) {
        Integer num;
        T93 A0E2;
        String A042 = A04(r6);
        int i = r6.A00;
        C3272279y r2 = this.A00;
        if (Arrays.binarySearch(AnonymousClass7A3.A01, (short) i) >= 0) {
            String A012 = r2.A01(i);
            if ("001".equals(A012)) {
                A0E2 = A0D(i);
            } else {
                A0E2 = A0E(A012);
            }
            num = A03(A042, this.A01.A00(A0E2.A04.A02));
        } else {
            num = AnonymousClass05K.A01;
        }
        if (num == AnonymousClass05K.A00) {
            return true;
        }
        return false;
    }

    public final boolean A0N(C3259474u r6) {
        T93 A0E2;
        String A0H2 = A0H(r6);
        int i = r6.A00;
        boolean equals = "001".equals(A0H2);
        if (equals) {
            A0E2 = A0D(i);
        } else {
            A0E2 = A0E(A0H2);
        }
        if (A0E2 == null || ((!equals && i != A00(A0H2)) || A02(A0E2, A04(r6)) == AnonymousClass05K.A03)) {
            return false;
        }
        return true;
    }
}
