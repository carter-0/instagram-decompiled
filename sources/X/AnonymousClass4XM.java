package X;

import android.os.SystemClock;
import android.util.Log;
import com.instagram.direct.stella.StellaIpcDirectMessagingServiceClient;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* renamed from: X.4XM  reason: invalid class name */
public final class AnonymousClass4XM extends AnonymousClass4XN {
    public static HashMap A00 = new HashMap();

    public final boolean D1p(C266194Xx r26, XDS xds, C265084Sm r28, long j, boolean z, boolean z2) {
        boolean z3;
        boolean z4;
        String str;
        boolean z5;
        String str2;
        int i;
        long j2;
        String str3;
        int i2;
        C290505fQ r0;
        C264544Qh r11 = this.A0U;
        C266194Xx r7 = r26;
        XDS xds2 = xds;
        boolean z6 = z;
        if (r11.A0S) {
            return super.D1p(r7, xds2, r28, j, z6, true);
        }
        HashMap A07 = A07();
        A0A(A07);
        C257253x6 r2 = r7.A06.A07;
        boolean z7 = r2.A0U;
        A07.put("is_predicted", Boolean.valueOf(z7));
        A07.put("segment_predicted_number", Integer.valueOf(r2.A02));
        IOException iOException = xds2.A03;
        if (iOException != null) {
            A07.put("exception", iOException.getLocalizedMessage());
            StringWriter stringWriter = new StringWriter();
            iOException.printStackTrace(new PrintWriter(stringWriter));
            A07.put("stack_trace", stringWriter.toString());
        }
        boolean z8 = false;
        if (!z) {
            str3 = "non_cancelable";
        } else {
            boolean z9 = r11.A0G;
            if (!z9) {
                this.A0P++;
            }
            long j3 = this.A0O;
            long j4 = r7.A02;
            boolean z10 = false;
            if (j3 != j4) {
                z10 = true;
            }
            this.A0O = j4;
            boolean z11 = iOException instanceof C2609447q;
            boolean z12 = z11;
            if (z11) {
                C2609447q r9 = (C2609447q) iOException;
                Map map = r9.A01;
                boolean A02 = C21993XpG.A02(map);
                int i3 = r9.A00;
                A07.put("response_code", Integer.valueOf(i3));
                if (i3 == 404) {
                    if (z9) {
                        this.A0P++;
                    }
                    if (r7 instanceof AnonymousClass4Y1) {
                        long j5 = ((AnonymousClass4Y1) r7).A04;
                        if (j5 > 0) {
                            A08(j5, map);
                        }
                    }
                }
                if (i3 == 404) {
                    if (this.A0P < 5) {
                        C290505fQ r02 = this.A0a;
                        if (r02 != null && r02.A01(r7, true)) {
                            this.A0K = true;
                            A07.put("cancel", "true");
                            A07.put("reason", "requested_manifest_refresh");
                            return true;
                        } else if (this.A0D.A0R) {
                            A07.put("cancel", "true");
                            A07.put("reason", "dynamic_manifest");
                            return true;
                        }
                    }
                    if (!this.A0D.A0R && z7 && r11.A0L) {
                        str = "static_manifest_and_predicted";
                        A07.put("reason", str);
                        z5 = true;
                        z4 = Boolean.valueOf(z3);
                        A07.put("cancel", z4);
                        return z3;
                    }
                } else if (!(i3 == 410 || i3 == 417 || i3 == 403)) {
                    if (i3 != 504 || (r0 = this.A0a) == null || !r0.A01(r7, z10)) {
                        if (this.A0P >= 5) {
                            this.A0F = r9;
                            A07.put("reason", "too_many_retries");
                        } else if (i3 == 503) {
                            if (A02) {
                                this.A0N++;
                                A07.put("reason", "one_503");
                                if (this.A0R != 3 && (i2 = r11.A05) > 0 && this.A0N >= i2) {
                                    this.A0F = r9;
                                }
                                z5 = false;
                                z4 = Boolean.valueOf(z3);
                                A07.put("cancel", z4);
                                return z3;
                            }
                        } else if (i3 == 416 && A02) {
                            str = "416";
                            A07.put("reason", str);
                            z5 = true;
                            z4 = Boolean.valueOf(z3);
                            A07.put("cancel", z4);
                            return z3;
                        }
                        A07.put("cancel", true);
                        A07.put("exception", r9);
                        return true;
                    }
                    z3 = true;
                    this.A0K = true;
                    A07.put("reason", "504");
                    z4 = true;
                    A07.put("cancel", z4);
                    return z3;
                }
                this.A0F = r9;
                str = "fatal";
                A07.put("reason", str);
                z5 = true;
                z4 = Boolean.valueOf(z3);
                A07.put("cancel", z4);
                return z3;
            }
            C290505fQ r03 = this.A0a;
            if (r03 == null || !r03.A01(r7, false)) {
                if (!this.A0D.A0R && (r7 instanceof AnonymousClass4Y2) && z12 && ((C2609447q) iOException).A00 == 404) {
                    AnonymousClass4XR r12 = this.A0f[this.A0E.CMA(r7.A05)];
                    long BrO = r12.A02.BrO(r12.A00);
                    if (!(BrO == -1 || BrO == 0)) {
                        if (((AnonymousClass4Y2) r7).A00() > ((r12.A02.B6B() + r12.A01) + BrO) - 1) {
                            z8 = true;
                            this.A0L = true;
                            str3 = "missing_segment_workaround";
                        }
                    }
                }
                AnonymousClass4RX r04 = this.A0E;
                C256683wB r92 = r7.A05;
                int CMA = r04.CMA(r92);
                AnonymousClass4XR[] r122 = this.A0f;
                AnonymousClass4XR r72 = r122[CMA];
                C265194Sx r112 = this.A0Y;
                C256383vg A022 = r112.A02(r72.A03.A04);
                if (A022 == null || r72.A07.equals(A022)) {
                    AnonymousClass4RX r14 = this.A0E;
                    List list = r72.A03.A04;
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    int length = r14.length();
                    int i4 = 0;
                    for (int i5 = 0; i5 < length; i5++) {
                        if (r14.CPT(i5, elapsedRealtime)) {
                            i4++;
                        }
                    }
                    HashSet hashSet = new HashSet();
                    for (int i6 = 0; i6 < list.size(); i6++) {
                        hashSet.add(Integer.valueOf(((C256383vg) list.get(i6)).A00));
                    }
                    int size = hashSet.size();
                    HashSet hashSet2 = new HashSet();
                    ArrayList A002 = C265194Sx.A00(r112, list);
                    for (int i7 = 0; i7 < A002.size(); i7++) {
                        hashSet2.add(Integer.valueOf(((C256383vg) A002.get(i7)).A00));
                    }
                    int size2 = size - hashSet2.size();
                    int i8 = length - i4;
                    if (i8 > 1 || size - size2 > 1) {
                        if (z12 && ((i = ((C2609447q) iOException).A00) == 403 || i == 404 || i == 410 || i == 416 || i == 500 || i == 503)) {
                            char c = 1;
                            if (size - size2 > 1) {
                                j2 = 300000;
                            } else {
                                c = 2;
                                if (i8 > 1) {
                                    j2 = StellaIpcDirectMessagingServiceClient.KEEP_CONNECTION_ALIVE_MS;
                                    size = length;
                                    size2 = i4;
                                }
                            }
                            if (size - size2 > 1) {
                                if (c == 2) {
                                    AnonymousClass4RX r5 = this.A0E;
                                    z3 = r5.ADu(r5.CMA(r92), j2);
                                } else {
                                    C256383vg r22 = r72.A07;
                                    long elapsedRealtime2 = SystemClock.elapsedRealtime() + j2;
                                    String str4 = r22.A02;
                                    Map map2 = r112.A01;
                                    long j6 = elapsedRealtime2;
                                    if (map2.containsKey(str4)) {
                                        j6 = Math.max(elapsedRealtime2, ((Number) map2.get(str4)).longValue());
                                    }
                                    map2.put(str4, Long.valueOf(j6));
                                    int i9 = r22.A00;
                                    if (i9 != Integer.MIN_VALUE) {
                                        Integer valueOf = Integer.valueOf(i9);
                                        Map map3 = r112.A00;
                                        if (map3.containsKey(valueOf)) {
                                            elapsedRealtime2 = Math.max(elapsedRealtime2, ((Number) map3.get(valueOf)).longValue());
                                        }
                                        map3.put(valueOf, Long.valueOf(elapsedRealtime2));
                                    }
                                    z3 = true;
                                }
                                z4 = Boolean.valueOf(z3);
                                Log.w("DefaultDashChunkSourceUpgraded", String.format("Track: blockListed=%s, chunk.trackFormat=%s, responseCode=%s", new Object[]{z4, r92, Integer.valueOf(i)}));
                                int i10 = -1;
                                if (z3) {
                                    i10 = CMA;
                                }
                                this.A01 = i10;
                                this.A0G = iOException;
                                this.A0X.A0D(new WML(new WMP(iOException, r122[CMA].A07.A03, String.format("Track:[%b, %d of %d, %s]", new Object[]{z4, Integer.valueOf(CMA), Integer.valueOf(this.A0E.length()), r92.toString()}))));
                                A07.put("cancel", z4);
                                return z3;
                            }
                        }
                        str2 = "no_fallback_resources_are_available";
                    } else {
                        str2 = "no_fallback_options_are_available";
                    }
                    A07.put("reason", str2);
                    z5 = false;
                    z4 = Boolean.valueOf(z3);
                    A07.put("cancel", z4);
                    return z3;
                }
                str = "base_url_has_changed";
                A07.put("reason", str);
                z5 = true;
                z4 = Boolean.valueOf(z3);
                A07.put("cancel", z4);
                return z3;
            }
            str = "fall_through_manifest_refrsh";
            A07.put("reason", str);
            z5 = true;
            z4 = Boolean.valueOf(z3);
            A07.put("cancel", z4);
            return z3;
        }
        A07.put("reason", str3);
        A07.put("cancel", Boolean.valueOf(z8));
        return z8;
    }

    public final long AZp(AnonymousClass4P6 r19, long j) {
        AnonymousClass4P6 r11 = r19;
        long j2 = j;
        if (this.A0U.A0R) {
            return super.AZp(r11, j2);
        }
        for (AnonymousClass4XR r6 : this.A0f) {
            if (r6.A02 != null) {
                long BrO = r6.A02.BrO(r6.A00);
                if (BrO != 0) {
                    long A04 = r6.A04(j2);
                    long C7P = r6.A02.C7P(A04 - r6.A01);
                    long j3 = C7P;
                    if (C7P < j && (BrO == -1 || A04 < ((r6.A02.B6B() + r6.A01) + BrO) - 1)) {
                        C7P = r6.A02.C7P((A04 + 1) - r6.A01);
                    }
                    return r11.A00(j2, j3, C7P);
                }
            }
        }
        return j;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0304, code lost:
        if (r24.A00 != false) goto L_0x0306;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0141, code lost:
        if (r1.A00 != false) goto L_0x0143;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x023f, code lost:
        if (r37 <= r3) goto L_0x0241;
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0277  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x02b3  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x038b  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0111  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0178  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0185  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01db  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x020c  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0253  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void BW6(X.AnonymousClass4Xb r68, X.AnonymousClass4Y2 r69, java.util.List r70, long r71, long r73, long r75, long r77) {
        /*
            r67 = this;
            r2 = r67
            r19 = r73
            r17 = r77
            X.4Qh r0 = r2.A0U
            r65 = r0
            boolean r0 = r0.A0T
            r66 = r68
            r1 = r70
            r53 = r71
            r45 = r75
            if (r0 == 0) goto L_0x0027
            r3 = r66
            r5 = r1
            r6 = r53
            r8 = r19
            r10 = r45
            r12 = r17
            r4 = r69
            super.BW6(r3, r4, r5, r6, r8, r10, r12)
        L_0x0026:
            return
        L_0x0027:
            java.lang.Long r5 = java.lang.Long.valueOf(r53)
            java.lang.Long r4 = java.lang.Long.valueOf(r19)
            r26 = 1
            java.lang.Long r3 = java.lang.Long.valueOf(r45)
            boolean r0 = r2.A0K
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            java.lang.Object[] r3 = new java.lang.Object[]{r5, r4, r3, r0}
            java.lang.String r0 = "Loading next chunk, playbackPositionUs %d, loadPositionUs %d, bufferedDurationUs %d interrupted: %b"
            java.lang.String.format(r0, r3)
            java.io.IOException r0 = r2.A0F
            if (r0 != 0) goto L_0x0026
            boolean r0 = r2.A0K
            if (r0 == 0) goto L_0x0053
            X.3w6 r0 = r2.A0D
            boolean r0 = r0.A0R
            if (r0 == 0) goto L_0x0053
            return
        L_0x0053:
            boolean r0 = r1.isEmpty()
            r27 = 0
            if (r0 == 0) goto L_0x03e5
            r21 = r27
        L_0x005d:
            X.4Xx r1 = r2.A0B
            if (r1 == 0) goto L_0x0070
            r0 = r21
            if (r1 != r0) goto L_0x0070
            X.3w6 r0 = r2.A0D
            boolean r0 = r0.A0R
            r12 = r0 ^ 1
        L_0x006b:
            r0 = r66
            r0.A01 = r12
            return
        L_0x0070:
            X.3w6 r4 = r2.A0D
            long r0 = r4.A04
            long r0 = com.google.android.exoplayer2.util.Util.A07(r0)
            int r3 = r2.A02
            X.3wM r3 = r4.A02(r3)
            long r3 = r3.A00
            long r3 = com.google.android.exoplayer2.util.Util.A07(r3)
            long r0 = r0 + r3
            long r0 = r0 + r73
            X.5fQ r3 = r2.A0a
            if (r3 == 0) goto L_0x0092
            boolean r0 = r3.A00(r0)
            if (r0 == 0) goto L_0x0092
            return
        L_0x0092:
            long r0 = r2.A0S
            long r0 = com.google.android.exoplayer2.util.Util.A06(r0)
            long r3 = com.google.android.exoplayer2.util.Util.A07(r0)
            long r43 = r2.A01(r3)
            X.3w6 r0 = r2.A0D
            boolean r0 = r0.A0R
            if (r0 == 0) goto L_0x03de
            X.4XR[] r7 = r2.A0f
            r10 = 0
            r0 = r7[r10]
            X.4XE r5 = r0.A02
            long r0 = r0.A00
            long r8 = r5.BrO(r0)
            r5 = 0
            int r0 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x03de
            r0 = r7[r10]
            long r0 = r0.A01(r3)
            r7 = r7[r10]
            long r7 = r7.A03(r0)
            long r0 = r2.A01(r3)
            long r0 = java.lang.Math.min(r0, r7)
            long r0 = r0 - r71
            long r35 = java.lang.Math.max(r5, r0)
        L_0x00d3:
            boolean r0 = r2.A0M
            if (r0 == 0) goto L_0x038b
            X.4RX r5 = r2.A0E
            boolean r1 = r2.A0J
            boolean r0 = r2.A0L
            r28 = r5
            r29 = r2
            r30 = r21
            r31 = r53
            r33 = r45
            r37 = r19
            r39 = r1
            r40 = r0
            r28.FLS(r29, r30, r31, r33, r35, r37, r39, r40)
        L_0x00f0:
            X.4RX r0 = r2.A0E
            java.lang.Object r25 = r0.Brx()
            r0 = r25
            X.4Xu r0 = (X.C266164Xu) r0
            r25 = r0
            r2.A09(r0)
            X.4RX r0 = r2.A0E
            int r0 = r0.Brh()
            X.4XR r5 = r2.A05(r0)
            boolean r57 = r2.A0B(r5)
            X.4Se r0 = r5.A06
            if (r0 == 0) goto L_0x016c
            X.3wG r6 = r5.A03
            X.4Sc r0 = (X.C264994Sc) r0
            X.3wB[] r0 = r0.A01
            if (r0 != 0) goto L_0x0169
            X.3vz r0 = r6.A03
        L_0x011b:
            X.4XE r1 = r5.A02
            if (r1 != 0) goto L_0x0123
            X.3vz r27 = r6.A01()
        L_0x0123:
            if (r0 != 0) goto L_0x0127
            if (r27 == 0) goto L_0x016c
        L_0x0127:
            X.3ws r4 = r2.A0c
            X.4RX r1 = r2.A0E
            X.3wB r24 = r1.Brg()
            int r30 = r1.Brz()
            java.lang.Object r29 = r1.Brx()
            int r3 = r2.A0R
            X.4Oi r1 = r2.A0V
            if (r1 == 0) goto L_0x0143
            boolean r1 = r1.A00
            r39 = 1
            if (r1 == 0) goto L_0x0145
        L_0x0143:
            r39 = 0
        L_0x0145:
            r1 = r65
            boolean r1 = r1.A0F
            r23 = r2
            r25 = r5
            r26 = r0
            r28 = r4
            r31 = r3
            r32 = r45
            r34 = r53
            r36 = r19
            r38 = r57
            r40 = r1
            X.4Xw r1 = r23.A04(r24, r25, r26, r27, r28, r29, r30, r31, r32, r34, r36, r38, r39, r40)
            r0 = r66
            r0.A00 = r1
            r0 = 1
        L_0x0166:
            r2.A0J = r0
            return
        L_0x0169:
            r0 = r27
            goto L_0x011b
        L_0x016c:
            long r13 = r5.A00
            r15 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            r12 = 0
            if (r0 == 0) goto L_0x0179
            r12 = 1
        L_0x0179:
            X.4XE r0 = r5.A02
            long r6 = r0.BrO(r13)
            r22 = 0
            int r0 = (r6 > r22 ? 1 : (r6 == r22 ? 0 : -1))
            if (r0 == 0) goto L_0x006b
            X.4XE r6 = r5.A02
            long r0 = r5.A00
            long r6 = r6.B61(r0, r3)
            long r0 = r5.A01
            long r6 = r6 + r0
            long r3 = r5.A01(r3)
            if (r21 != 0) goto L_0x02a4
            r0 = r19
            long r0 = r5.A04(r0)
            long r0 = java.lang.Math.min(r0, r3)
            long r9 = java.lang.Math.max(r6, r0)
        L_0x01a4:
            int r0 = (r77 > r15 ? 1 : (r77 == r15 ? 0 : -1))
            if (r0 == 0) goto L_0x02a0
            r0 = r17
            long r62 = r5.A04(r0)
            int r0 = (r9 > r62 ? 1 : (r9 == r62 ? 0 : -1))
            if (r0 >= 0) goto L_0x02a0
            java.lang.Long r8 = java.lang.Long.valueOf(r17)
            java.lang.Long r1 = java.lang.Long.valueOf(r9)
            java.lang.Long r0 = java.lang.Long.valueOf(r62)
            java.lang.Object[] r1 = new java.lang.Object[]{r8, r1, r0}
            java.lang.String r0 = "Discontinuity was detected, align to the minimumLoadPosition %d: segment num %d -> %d"
            java.lang.String.format(r0, r1)
        L_0x01c7:
            X.4Oi r0 = r2.A0V
            r24 = r0
            if (r0 == 0) goto L_0x0206
            boolean r0 = r0.A00
            if (r0 == 0) goto L_0x0206
            r0 = r65
            int r8 = r0.A03
            if (r8 <= 0) goto L_0x0277
            int r10 = r0.A04
            if (r10 <= 0) goto L_0x0277
            long r0 = r5.A03(r3)
            int r8 = r8 * 1000
            long r8 = (long) r8
            long r0 = r0 - r8
            int r8 = r10 * 1000
            long r10 = (long) r8
            long r8 = r0 - r10
            long r8 = r5.A04(r8)
            long r8 = java.lang.Math.min(r8, r3)
            long r6 = java.lang.Math.max(r6, r8)
            int r8 = (r62 > r6 ? 1 : (r62 == r6 ? 0 : -1))
            if (r8 >= 0) goto L_0x0206
            long r0 = r5.A04(r0)
            long r0 = java.lang.Math.min(r0, r3)
            long r6 = java.lang.Math.max(r6, r0)
        L_0x0204:
            r62 = r6
        L_0x0206:
            r6 = -1
            int r0 = (r62 > r6 ? 1 : (r62 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x03f7
            X.4XE r8 = r5.A02
            long r6 = r5.A01
            long r0 = r62 - r6
            int r0 = r8.BeW(r0)
            long r6 = (long) r0
            java.util.HashMap r1 = r2.A0H
            java.lang.Long r0 = java.lang.Long.valueOf(r6)
            java.lang.Object r9 = r1.get(r0)
            java.lang.Number r9 = (java.lang.Number) r9
            if (r9 == 0) goto L_0x0256
            long r0 = r9.longValue()
            long r10 = r0 - r6
            int r6 = (r10 > r22 ? 1 : (r10 == r22 ? 0 : -1))
            if (r6 <= 0) goto L_0x0256
            X.4XE r6 = r5.A02
            long r37 = r6.BrT(r0)
            long r0 = r5.A01
            long r37 = r37 + r0
            int r0 = (r37 > r22 ? 1 : (r37 == r22 ? 0 : -1))
            if (r0 <= 0) goto L_0x0256
            int r0 = (r37 > r3 ? 1 : (r37 == r3 ? 0 : -1))
            if (r0 > 0) goto L_0x0256
        L_0x0241:
            r62 = r3
        L_0x0243:
            if (r12 == 0) goto L_0x02b3
            X.4XE r8 = r5.A02
            long r6 = r5.A01
            long r0 = r37 - r6
            long r6 = r8.C7P(r0)
            int r0 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
            if (r0 < 0) goto L_0x02b3
            r12 = 1
            goto L_0x006b
        L_0x0256:
            r37 = r62
            int r0 = (r62 > r3 ? 1 : (r62 == r3 ? 0 : -1))
            if (r0 > 0) goto L_0x0264
            boolean r0 = r2.A0L
            if (r0 == 0) goto L_0x0241
            int r0 = (r62 > r3 ? 1 : (r62 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x0241
        L_0x0264:
            r0 = r66
            r0.A01 = r12
            r58 = r2
            r59 = r5
            r60 = r3
            r64 = r12
            boolean r0 = r58.A0C(r59, r60, r62, r64)
            if (r0 == 0) goto L_0x0026
            goto L_0x0243
        L_0x0277:
            X.3w6 r0 = r2.A0D
            boolean r0 = r0.A0S
            if (r0 == 0) goto L_0x0206
            r0 = 10
            long r6 = r3 - r0
            int r0 = (r62 > r6 ? 1 : (r62 == r6 ? 0 : -1))
            if (r0 >= 0) goto L_0x0206
            r1 = r26
            r0 = r66
            r0.A02 = r1
            r0 = 10
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r3)
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r0}
            java.lang.String r0 = "Using latest %d segments from total of %d segments"
            java.lang.String.format(r0, r1)
            goto L_0x0204
        L_0x02a0:
            r62 = r9
            goto L_0x01c7
        L_0x02a4:
            long r9 = r21.A00()
            int r0 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r0 >= 0) goto L_0x01a4
            boolean r0 = r2.A0I
            if (r0 == 0) goto L_0x03f7
            r9 = r6
            goto L_0x01a4
        L_0x02b3:
            long r0 = r62 - r37
            r22 = 1
            long r0 = r0 + r22
            int r10 = (int) r0
            int r0 = r2.A0Q
            if (r0 > 0) goto L_0x02c4
            r1 = r26
            int r10 = java.lang.Math.min(r1, r10)
        L_0x02c4:
            if (r21 == 0) goto L_0x02cb
            r19 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x02cb:
            X.3wG r1 = r5.A03
            boolean r1 = r1.A04()
            if (r1 == 0) goto L_0x0387
            int r1 = (r3 > r62 ? 1 : (r3 == r62 ? 0 : -1))
            if (r1 >= 0) goto L_0x0387
            r60 = 1
            int r1 = r2.A00
            int r1 = r1 + 1
            r2.A00 = r1
        L_0x02df:
            X.3ws r1 = r2.A0c
            r30 = r1
            int r1 = r2.A0R
            r33 = r1
            X.4RX r1 = r2.A0E
            X.3wB r28 = r1.Brg()
            int r34 = r1.Brz()
            java.lang.Object r31 = r1.Brx()
            long r13 = (long) r0
            r0 = r66
            boolean r0 = r0.A02
            r58 = r0
            if (r24 == 0) goto L_0x0306
            r0 = r24
            boolean r0 = r0.A00
            r59 = 1
            if (r0 == 0) goto L_0x0308
        L_0x0306:
            r59 = 0
        L_0x0308:
            X.3wx r0 = r2.A0T
            r21 = r0
            int r0 = (r77 > r15 ? 1 : (r77 == r15 ? 0 : -1))
            if (r0 == 0) goto L_0x0385
            r0 = 1000(0x3e8, double:4.94E-321)
            long r17 = r77 / r0
            r0 = r17
            int r11 = (int) r0
        L_0x0317:
            X.4XE r8 = r5.A02
            long r6 = r5.A01
            long r0 = r37 - r6
            int r0 = r8.BeW(r0)
            long r6 = (long) r0
            if (r9 == 0) goto L_0x0382
            long r51 = r9.longValue()
        L_0x0328:
            X.3w6 r1 = r2.A0D
            X.4SY r0 = r2.A0W
            java.lang.String r12 = r0.A00
            X.4Oq r9 = r2.A09
            long r0 = r1.A00
            X.27s r8 = r2.A08
            r24 = r25
            r25 = r8
            r26 = r21
            r27 = r9
            r29 = r5
            r32 = r12
            r35 = r10
            r36 = r11
            r39 = r13
            r41 = r19
            r47 = r3
            r49 = r6
            r55 = r0
            X.4Y1 r3 = X.AnonymousClass4XN.A00(r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r39, r41, r43, r45, r47, r49, r51, r53, r55, r57, r58, r59, r60)
            r0 = r66
            r0.A00 = r3
            int r0 = (r37 > r62 ? 1 : (r37 == r62 ? 0 : -1))
            if (r0 == 0) goto L_0x0364
            boolean r0 = r2.A0L
            if (r0 == 0) goto L_0x0380
            long r62 = r62 - r22
            int r0 = (r37 > r62 ? 1 : (r37 == r62 ? 0 : -1))
            if (r0 != 0) goto L_0x0380
        L_0x0364:
            r1 = 1
        L_0x0365:
            X.3w6 r0 = r2.A0D
            boolean r0 = r0.A0R
            if (r0 != 0) goto L_0x0372
            if (r1 == 0) goto L_0x036f
            r2.A0B = r3
        L_0x036f:
            r0 = 0
            goto L_0x0166
        L_0x0372:
            if (r1 == 0) goto L_0x036f
            r0 = r65
            boolean r0 = r0.A0O
            if (r0 == 0) goto L_0x036f
            X.4TL r0 = r2.A0b
            r0.A01()
            goto L_0x036f
        L_0x0380:
            r1 = 0
            goto L_0x0365
        L_0x0382:
            r51 = -1
            goto L_0x0328
        L_0x0385:
            r11 = -1
            goto L_0x0317
        L_0x0387:
            r60 = 0
            goto L_0x02df
        L_0x038b:
            X.4RX r0 = r2.A0E
            int r12 = r0.length()
            X.YBF[] r11 = new X.YBF[r12]
            r7 = 0
        L_0x0394:
            if (r7 >= r12) goto L_0x00f0
            X.4XR[] r0 = r2.A0f
            r8 = r0[r7]
            X.4XE r0 = r8.A02
            if (r0 != 0) goto L_0x03a5
            X.YBF r0 = X.YBF.A00
            r11[r7] = r0
        L_0x03a2:
            int r7 = r7 + 1
            goto L_0x0394
        L_0x03a5:
            X.4XE r5 = r8.A02
            long r0 = r8.A00
            long r5 = r5.B61(r0, r3)
            long r0 = r8.A01
            long r5 = r5 + r0
            long r9 = r8.A01(r3)
            if (r21 == 0) goto L_0x03c3
            long r0 = r21.A00()
        L_0x03ba:
            int r8 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r8 >= 0) goto L_0x03d2
            X.YBF r0 = X.YBF.A00
            r11[r7] = r0
            goto L_0x03a2
        L_0x03c3:
            r0 = r19
            long r0 = r8.A04(r0)
            long r0 = java.lang.Math.min(r0, r9)
            long r0 = java.lang.Math.max(r5, r0)
            goto L_0x03ba
        L_0x03d2:
            X.4XR r1 = r2.A05(r7)
            X.Xyw r0 = new X.Xyw
            r0.<init>(r1)
            r11[r7] = r0
            goto L_0x03a2
        L_0x03de:
            r35 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x00d3
        L_0x03e5:
            int r0 = r1.size()
            int r0 = r0 - r26
            java.lang.Object r21 = r1.get(r0)
            r0 = r21
            X.4Y2 r0 = (X.AnonymousClass4Y2) r0
            r21 = r0
            goto L_0x005d
        L_0x03f7:
            X.4UN r0 = new X.4UN
            r0.<init>()
            r2.A0F = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4XM.BW6(X.4Xb, X.4Y2, java.util.List, long, long, long, long):void");
    }
}
