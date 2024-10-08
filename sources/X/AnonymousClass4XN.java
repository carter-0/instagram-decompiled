package X;

import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.webrtc.MediaStreamTrack;

/* renamed from: X.4XN  reason: invalid class name */
public class AnonymousClass4XN implements AnonymousClass4XO {
    public static HashMap A0k = new HashMap();
    public int A00 = 0;
    public int A01 = -1;
    public int A02;
    public int A03 = 0;
    public long A04 = -9223372036854775807L;
    public long A05;
    public long A06 = -9223372036854775807L;
    public long A07 = -9223372036854775807L;
    public 27s A08;
    public C264114Oq A09;
    public 27k A0A;
    public C266194Xx A0B;
    public AnonymousClass4XX A0C;
    public C256633w6 A0D;
    public AnonymousClass4RX A0E;
    public IOException A0F;
    public IOException A0G;
    public HashMap A0H = new HashMap();
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public int A0N = 0;
    public long A0O = -9223372036854775807L;
    public long A0P = 0;
    public final int A0Q;
    public final int A0R;
    public final long A0S;
    public final C257163wx A0T;
    public final C264544Qh A0U;
    public final C264034Oi A0V;
    public final AnonymousClass4SY A0W;
    public final C265174Sv A0X;
    public final C265194Sx A0Y;
    public final AnonymousClass4XQ A0Z;
    public final C290505fQ A0a;
    public final AnonymousClass4TL A0b;
    public final C257113ws A0c;
    public final AnonymousClass4T1 A0d;
    public final Map A0e = new HashMap();
    public final AnonymousClass4XR[] A0f;
    public final AnonymousClass4SZ A0g;
    public final C250823m7 A0h;
    public final int[] A0i;
    public final AnonymousClass4SV A0j;

    public final void A08(long j, Map map) {
        try {
            List list = (List) map.get(AnonymousClass000.A00(4222));
            if (list != null && list.size() > 0) {
                long parseLong = Long.parseLong((String) list.get(0));
                if (parseLong > j) {
                    int i = this.A0U.A09;
                    while (i > 0 && parseLong > j) {
                        this.A0H.put(Long.valueOf(j), Long.valueOf(parseLong));
                        i--;
                        j++;
                    }
                }
            }
        } catch (NumberFormatException unused) {
        }
    }

    public boolean D1p(C266194Xx r24, XDS xds, C265084Sm r26, long j, boolean z, boolean z2) {
        String str;
        Boolean bool;
        Object obj;
        String str2;
        int i;
        C290505fQ r0;
        HashMap A072 = A07();
        C266194Xx r5 = r24;
        XDS xds2 = xds;
        if (2BY.A02(2BQ.A0Q)) {
            A0A(A072);
            C257253x6 r3 = r5.A06.A07;
            A072.put("is_predicted", Boolean.valueOf(r3.A0U));
            A072.put("segment_predicted_number", Integer.valueOf(r3.A02));
            IOException iOException = xds2.A03;
            if (iOException != null) {
                A072.put("exception", iOException.getLocalizedMessage());
                StringWriter stringWriter = new StringWriter();
                iOException.printStackTrace(new PrintWriter(stringWriter));
                A072.put("stack_trace", stringWriter.toString());
            }
        }
        boolean z3 = false;
        if (!z) {
            str2 = "non_cancelable";
        } else {
            C264544Qh r12 = this.A0U;
            boolean z4 = r12.A0G;
            if (!z4) {
                this.A0P++;
            }
            long j2 = this.A0O;
            long j3 = r5.A02;
            if (j2 != j3) {
                z3 = true;
            }
            this.A0O = j3;
            IOException iOException2 = xds2.A03;
            boolean z5 = iOException2 instanceof C2609447q;
            if (z5) {
                C2609447q r9 = (C2609447q) iOException2;
                Map map = r9.A01;
                boolean A022 = C21993XpG.A02(map);
                int i2 = r9.A00;
                A072.put("response_code", Integer.valueOf(i2));
                if (i2 == 404) {
                    if (z4) {
                        this.A0P++;
                    }
                    if (r5 instanceof AnonymousClass4Y1) {
                        long j4 = ((AnonymousClass4Y1) r5).A04;
                        if (j4 > 0) {
                            A08(j4, map);
                        }
                    }
                }
                if (i2 == 404) {
                    if (this.A0P < 5) {
                        C290505fQ r02 = this.A0a;
                        if (r02 != null && r02.A01(r5, true)) {
                            this.A0K = true;
                            A072.put("cancel", "true");
                            A072.put("reason", "requested_manifest_refresh");
                            return true;
                        } else if (this.A0D.A0R) {
                            A072.put("cancel", "true");
                            A072.put("reason", "dynamic_manifest");
                            return true;
                        }
                    }
                    if (!this.A0D.A0R && r5.A06.A07.A0U && r12.A0L) {
                        str = "static_manifest_and_predicted";
                        A072.put("reason", str);
                        z3 = true;
                        A072.put("cancel", Boolean.valueOf(z3));
                        return z3;
                    }
                } else if (!(i2 == 410 || i2 == 417 || i2 == 403)) {
                    if (i2 != 504 || (r0 = this.A0a) == null || !r0.A01(r5, z3)) {
                        if (this.A0P >= 5) {
                            this.A0F = r9;
                            A072.put("reason", "too_many_retries");
                        } else if (i2 == 503) {
                            if (A022) {
                                this.A0N++;
                                A072.put("reason", "one_503");
                                if (this.A0R == 3 || (i = r12.A05) <= 0 || this.A0N < i) {
                                    z3 = false;
                                    A072.put("cancel", Boolean.valueOf(z3));
                                    return z3;
                                }
                                this.A0F = r9;
                            }
                        } else if (i2 == 416 && A022) {
                            str = "416";
                            A072.put("reason", str);
                            z3 = true;
                            A072.put("cancel", Boolean.valueOf(z3));
                            return z3;
                        }
                        A072.put("cancel", true);
                        A072.put("exception", r9);
                        return true;
                    }
                    z3 = true;
                    this.A0K = true;
                    str2 = "504";
                }
                this.A0F = r9;
                str = "fatal";
                A072.put("reason", str);
                z3 = true;
                A072.put("cancel", Boolean.valueOf(z3));
                return z3;
            }
            C290505fQ r1 = this.A0a;
            if (r1 == null || !r1.A01(r5, false)) {
                if (!this.A0D.A0R && (r5 instanceof AnonymousClass4Y2) && z5 && ((C2609447q) iOException2).A00 == 404) {
                    AnonymousClass4XR r8 = this.A0f[this.A0E.CMA(r5.A05)];
                    long BrO = r8.A02.BrO(r8.A00);
                    if (!(BrO == -1 || BrO == 0)) {
                        if (((AnonymousClass4Y2) r5).A00() > ((r8.A02.B6B() + r8.A01) + BrO) - 1) {
                            z3 = true;
                            this.A0L = true;
                            str2 = "missing_segment_workaround";
                        }
                    }
                }
                long j5 = j;
                if (j != -9223372036854775807L) {
                    AnonymousClass4RX r92 = this.A0E;
                    bool = Boolean.valueOf(r92.ADu(r92.CMA(r5.A05), j5));
                } else {
                    bool = null;
                }
                C256683wB r93 = r5.A05;
                if (z5) {
                    obj = Integer.valueOf(((C2609447q) iOException2).A00);
                } else {
                    obj = "N/A";
                }
                Log.w("DefaultDashChunkSource", String.format("BlockListTrack: blockListed=%s, skipChunkedTrackBlockListUtil=%b, chunk.trackFormat=%s, responseCode=%s", new Object[]{bool, true, r93, obj}));
                if (bool != null) {
                    int CMA = this.A0E.CMA(r93);
                    int i3 = -1;
                    if (bool.booleanValue()) {
                        i3 = CMA;
                    }
                    this.A01 = i3;
                    this.A0G = iOException2;
                    this.A0X.A0D(new WML(new WMO(iOException2, this.A0f[CMA].A07.A03, String.format("BlockListTrack:[%b, %d of %d, %s]", new Object[]{bool, Integer.valueOf(CMA), Integer.valueOf(this.A0E.length()), r93.toString()}))));
                }
                z3 = Boolean.TRUE.equals(bool);
                str2 = "skip_chunked_track_block";
            } else {
                str = "fall_through_manifest_refrsh";
                A072.put("reason", str);
                z3 = true;
                A072.put("cancel", Boolean.valueOf(z3));
                return z3;
            }
        }
        A072.put("reason", str2);
        A072.put("cancel", Boolean.valueOf(z3));
        return z3;
    }

    public final long A01(long j) {
        C256633w6 r1 = this.A0D;
        long j2 = r1.A04;
        if (j2 != -9223372036854775807L) {
            return j - Util.A07(j2 + r1.A02(this.A02).A00);
        }
        return -9223372036854775807L;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x009a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long A02(X.AnonymousClass4Xb r16, X.AnonymousClass4Y2 r17, X.AnonymousClass4XR r18, long r19, long r21) {
        /*
            r15 = this;
            r8 = r18
            android.util.Pair r1 = r15.A03(r8)
            java.lang.Object r0 = r1.first
            java.lang.Number r0 = (java.lang.Number) r0
            long r4 = r0.longValue()
            java.lang.Object r0 = r1.second
            java.lang.Number r0 = (java.lang.Number) r0
            long r2 = r0.longValue()
            if (r17 != 0) goto L_0x008c
            r0 = r19
            long r0 = r8.A04(r0)
            long r0 = java.lang.Math.min(r0, r2)
            long r13 = java.lang.Math.max(r4, r0)
        L_0x0026:
            r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r0 = r21
            int r6 = (r21 > r9 ? 1 : (r21 == r9 ? 0 : -1))
            if (r6 == 0) goto L_0x008a
            long r11 = r8.A04(r0)
            int r6 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r6 >= 0) goto L_0x008a
            java.lang.Long r6 = java.lang.Long.valueOf(r0)
            java.lang.Long r1 = java.lang.Long.valueOf(r13)
            java.lang.Long r0 = java.lang.Long.valueOf(r11)
            java.lang.Object[] r1 = new java.lang.Object[]{r6, r1, r0}
            java.lang.String r0 = "Discontinuity was detected, align to the minimumLoadPosition %d: segment num %d -> %d"
            java.lang.String.format(r0, r1)
        L_0x004e:
            X.4Oi r0 = r15.A0V
            if (r0 == 0) goto L_0x00c3
            boolean r0 = r0.A00
            if (r0 == 0) goto L_0x00c3
            X.4Qh r1 = r15.A0U
            int r0 = r1.A03
            if (r0 <= 0) goto L_0x009a
            int r9 = r1.A04
            if (r9 <= 0) goto L_0x009a
            long r6 = r8.A03(r2)
            int r0 = r0 * 1000
            long r0 = (long) r0
            long r6 = r6 - r0
            int r0 = r9 * 1000
            long r9 = (long) r0
            long r0 = r6 - r9
            long r0 = r8.A04(r0)
            long r0 = java.lang.Math.min(r0, r2)
            long r0 = java.lang.Math.max(r4, r0)
            int r4 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r4 >= 0) goto L_0x00c3
            long r4 = r8.A04(r6)
            long r2 = java.lang.Math.min(r4, r2)
            long r4 = java.lang.Math.max(r0, r2)
            return r4
        L_0x008a:
            r11 = r13
            goto L_0x004e
        L_0x008c:
            long r13 = r17.A00()
            int r0 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x0026
            boolean r0 = r15.A0I
            if (r0 == 0) goto L_0x00c4
            r13 = r4
            goto L_0x0026
        L_0x009a:
            X.3w6 r0 = r15.A0D
            boolean r0 = r0.A0S
            if (r0 == 0) goto L_0x00c3
            r0 = 10
            long r4 = r2 - r0
            int r0 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x00c3
            r0 = 1
            r1 = r16
            if (r16 == 0) goto L_0x00af
            r1.A02 = r0
        L_0x00af:
            r0 = 10
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r0}
            java.lang.String r0 = "Using latest %d segments from total of %d segments"
            java.lang.String.format(r0, r1)
            return r4
        L_0x00c3:
            return r11
        L_0x00c4:
            r11 = -1
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4XN.A02(X.4Xb, X.4Y2, X.4XR, long, long):long");
    }

    public final Pair A03(AnonymousClass4XR r13) {
        long j;
        long currentTimeMillis;
        AnonymousClass4XE r4 = r13.A02;
        long B6B = r4.B6B() + r13.A01;
        long BrO = r4.BrO(r13.A00);
        if (BrO == -1) {
            long j2 = this.A0S;
            if (j2 != 0) {
                currentTimeMillis = SystemClock.elapsedRealtime() + j2;
            } else {
                currentTimeMillis = System.currentTimeMillis();
            }
            C256633w6 r8 = this.A0D;
            long j3 = r8.A04;
            UUID uuid = AnonymousClass4T7.A04;
            long A072 = ((currentTimeMillis * 1000) - Util.A07(j3)) - Util.A07(r8.A02(this.A02).A00);
            long j4 = this.A0D.A0E;
            if (j4 != -9223372036854775807L) {
                B6B = Math.max(B6B, r13.A04(A072 - Util.A07(j4)));
            }
            j = r13.A04(A072);
        } else {
            j = BrO + B6B;
        }
        return new Pair(Long.valueOf(B6B), Long.valueOf(j - 1));
    }

    public final C266184Xw A04(C256683wB r56, AnonymousClass4XR r57, C256573vz r58, C256573vz r59, C257113ws r60, Object obj, int i, int i2, long j, long j2, long j3, boolean z, boolean z2, boolean z3) {
        String str;
        String str2;
        long j4;
        long j5;
        AnonymousClass4XR r2 = r57;
        C256573vz r7 = r58;
        C256733wG r8 = r2.A03;
        C256573vz r1 = r59;
        if (r58 != null) {
            C256573vz A012 = r7.A01(r1, r2.A07.A03);
            if (A012 != null) {
                r7 = A012;
            }
        } else {
            r7 = r1;
        }
        C256733wG r3 = r2.A03;
        boolean z4 = r3 instanceof C256723wF;
        if (z4) {
            str = ((C256723wF) r3).A06;
        } else {
            str = null;
        }
        if (z4) {
            str2 = ((C256723wF) r3).A05;
        } else {
            str2 = null;
        }
        if (z4) {
            j4 = ((C256723wF) r3).A00;
        } else {
            j4 = -1;
        }
        long j6 = r7.A01;
        if (!z3 || j3 != 0 || j4 <= 0) {
            j5 = -1;
        } else {
            j5 = (j4 - j6) + 1;
        }
        String str3 = r2.A07.A03;
        C256683wB r11 = r8.A02;
        String str4 = r11.A0N.A07;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        String str5 = "";
        int i3 = (int) (j / 1000);
        long j7 = (long) r11.A05;
        String str6 = str2;
        String str7 = str4;
        String str8 = str;
        return new C266184Xw(r56, r2.A06, r60, C266174Xv.A00(r7, r8, new C257253x6(C257243x5.A02, new C257223x3(), str7, str8, str6, (String) null, "", str5, (String) null, (Map) null, 0, 0, i3, i2, -1, -1, -1, -1, -1, -1, j7, elapsedRealtime, -1, -1, -1, j2, j5, z, false, z2, false, false), str3, 0), obj, i);
    }

    public final AnonymousClass4XR A05(int i) {
        AnonymousClass4XR[] r1 = this.A0f;
        AnonymousClass4XR r3 = r1[i];
        C256383vg A022 = this.A0Y.A02(r3.A03.A04);
        if (A022 == null || A022.equals(r3.A07)) {
            return r3;
        }
        long j = r3.A04;
        long j2 = r3.A00;
        C256733wG r8 = r3.A03;
        C265014Se r5 = r3.A06;
        long j3 = r3.A01;
        AnonymousClass4XR r32 = new AnonymousClass4XR(r3.A05, r5, r3.A02, A022, r8, j, j2, j3, r3.A08);
        r1[i] = r32;
        return r32;
    }

    public final ArrayList A06() {
        List list = this.A0D.A02(this.A02).A03;
        ArrayList arrayList = new ArrayList();
        for (int i : this.A0i) {
            arrayList.addAll(((C256773wK) list.get(i)).A07);
        }
        return arrayList;
    }

    public final HashMap A07() {
        String format;
        HashMap hashMap = new HashMap();
        int i = this.A0R;
        if (i == 2) {
            format = MediaStreamTrack.VIDEO_TRACK_KIND;
        } else if (i == 1) {
            format = MediaStreamTrack.AUDIO_TRACK_KIND;
        } else if (i == 3) {
            format = "text";
        } else {
            format = String.format("other %s", new Object[]{Integer.valueOf(i)});
        }
        hashMap.put("track", format);
        return hashMap;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r1 = r10.A0E;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A09(X.C266164Xu r11) {
        /*
            r10 = this;
            int r3 = r10.A01
            r2 = -1
            if (r3 == r2) goto L_0x006b
            X.4RX r1 = r10.A0E
            int r0 = r1.Brh()
            if (r3 == r0) goto L_0x006b
            java.lang.String r6 = "DefaultDashChunkSource"
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            java.lang.String r4 = r11.A02
            X.3wB r0 = r1.Brg()
            java.lang.String r1 = r0.toString()
            java.io.IOException r0 = r10.A0G
            java.lang.String r0 = r0.getMessage()
            java.lang.Object[] r1 = new java.lang.Object[]{r5, r3, r4, r1, r0}
            java.lang.String r0 = "LaneSwitch: mLastBlockedTrackIndex=%d, trackSelection.getSelectedIndex()=%d, abrDecisionReason=%s, selectedFormat=%s, lastError=%s"
            java.lang.String r0 = java.lang.String.format(r0, r1)
            android.util.Log.w(r6, r0)
            X.4RX r3 = r10.A0E
            int r1 = r10.A01
            int r0 = r3.CM9(r1)
            if (r0 == r2) goto L_0x0069
            X.3wB r5 = r3.B7Q(r1)
            X.3wB r6 = r3.Brg()
            X.4XR[] r0 = r10.A0f
            r0 = r0[r1]
            X.3vg r0 = r0.A07
            java.lang.String r8 = r0.A03
            java.lang.Object[] r1 = new java.lang.Object[]{r4}
            java.lang.String r0 = "BlockListTrack:[abrDecisionReason: %s]"
            java.lang.String r9 = java.lang.String.format(r0, r1)
            java.io.IOException r7 = r10.A0G
            X.WMQ r4 = new X.WMQ
            r4.<init>(r5, r6, r7, r8, r9)
            X.4Sv r1 = r10.A0X
            X.WML r0 = new X.WML
            r0.<init>(r4)
            r1.A0D(r0)
        L_0x0069:
            r10.A01 = r2
        L_0x006b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4XN.A09(X.4Xu):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005f, code lost:
        r6 = (X.AnonymousClass4XD) r6;
        r7 = r6.A02;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0A(java.util.HashMap r11) {
        /*
            r10 = this;
            X.3w6 r0 = r10.A0D
            if (r0 != 0) goto L_0x000c
            java.lang.String r1 = "manifest"
            java.lang.String r0 = "null"
            r11.put(r1, r0)
            return
        L_0x000c:
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            boolean r0 = r0.A0R
            if (r0 == 0) goto L_0x0096
            java.lang.String r1 = "dynamic"
        L_0x0021:
            java.lang.String r0 = "manifest_type"
            r11.put(r0, r1)
            r5 = 0
        L_0x0027:
            X.3w6 r0 = r10.A0D
            java.util.List r0 = r0.A0Q
            int r0 = r0.size()
            if (r5 >= r0) goto L_0x0099
            X.3w6 r0 = r10.A0D
            X.3wM r0 = r0.A02(r5)
            java.util.List r0 = r0.A03
            java.util.Iterator r9 = r0.iterator()
        L_0x003d:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x0093
            java.lang.Object r0 = r9.next()
            X.3wK r0 = (X.C256773wK) r0
            java.util.List r0 = r0.A07
            java.util.Iterator r8 = r0.iterator()
        L_0x004f:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x003d
            java.lang.Object r6 = r8.next()
            X.3wG r6 = (X.C256733wG) r6
            boolean r0 = r6 instanceof X.AnonymousClass4XD
            if (r0 == 0) goto L_0x004f
            X.4XD r6 = (X.AnonymousClass4XD) r6
            X.3wB r7 = r6.A02
            java.lang.String r1 = r7.A0T
            if (r1 == 0) goto L_0x004f
            X.3wJ r6 = r6.A00
            boolean r0 = r6 instanceof X.C256753wI
            if (r0 == 0) goto L_0x0091
            X.3wI r6 = (X.C256753wI) r6
            X.CvC r0 = r6.A00
            if (r0 == 0) goto L_0x0091
            int r0 = r0.A01
        L_0x0075:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4.put(r1, r0)
            int r0 = r7.A05
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.put(r1, r0)
            X.3wA r0 = r7.A0N
            int r0 = r0.A01
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.put(r1, r0)
            goto L_0x004f
        L_0x0091:
            r0 = -1
            goto L_0x0075
        L_0x0093:
            int r5 = r5 + 1
            goto L_0x0027
        L_0x0096:
            java.lang.String r1 = "static"
            goto L_0x0021
        L_0x0099:
            java.lang.String r0 = "end_numbers"
            r11.put(r0, r4)
            java.lang.String r0 = "bitrates"
            r11.put(r0, r3)
            java.lang.String r0 = "max_bandwidths"
            r11.put(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4XN.A0A(java.util.HashMap):void");
    }

    public final boolean A0B(AnonymousClass4XR r7) {
        if (this.A0E.length() <= 1) {
            return false;
        }
        int i = Integer.MAX_VALUE;
        for (AnonymousClass4XR r0 : this.A0f) {
            int i2 = r0.A03.A02.A05;
            if (i > i2) {
                i = i2;
            }
        }
        if (i == r7.A03.A02.A05) {
            return true;
        }
        return false;
    }

    public long AZp(AnonymousClass4P6 r15, long j) {
        long j2 = j;
        for (AnonymousClass4XR r6 : this.A0f) {
            if (r6.A02 != null) {
                long A042 = r6.A04(j2);
                long C7P = r6.A02.C7P(A042 - r6.A01);
                long j3 = C7P;
                if (C7P < j && A042 < r6.A00()) {
                    C7P = r6.A02.C7P((A042 + 1) - r6.A01);
                }
                return r15.A00(j2, j3, C7P);
            }
        }
        return j2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00f9, code lost:
        if (r1.A00 != false) goto L_0x00fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x01ac, code lost:
        if (r35 <= r6) goto L_0x01ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0234, code lost:
        if (r0.A00 != false) goto L_0x0236;
     */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x028d  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0294  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x029b A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x02a9  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x02ab  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x02ae  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x02b0  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01f0  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x01f6  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0207  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0230  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0241  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0253  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BW6(X.AnonymousClass4Xb r64, X.AnonymousClass4Y2 r65, java.util.List r66, long r67, long r69, long r71, long r73) {
        /*
            r63 = this;
            r51 = r67
            r39 = r69
            r13 = r73
            java.lang.Long r4 = java.lang.Long.valueOf(r51)
            java.lang.Long r3 = java.lang.Long.valueOf(r39)
            r10 = 1
            r43 = r71
            java.lang.Long r1 = java.lang.Long.valueOf(r43)
            r2 = r63
            boolean r0 = r2.A0K
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            java.lang.Object[] r1 = new java.lang.Object[]{r4, r3, r1, r0}
            java.lang.String r0 = "Loading next chunk, playbackPositionUs %d, loadPositionUs %d, bufferedDurationUs %d interrupted: %b"
            java.lang.String.format(r0, r1)
            java.io.IOException r0 = r2.A0F
            if (r0 != 0) goto L_0x0034
            boolean r0 = r2.A0K
            if (r0 == 0) goto L_0x0035
            X.3w6 r0 = r2.A0D
            boolean r0 = r0.A0R
            if (r0 == 0) goto L_0x0035
        L_0x0034:
            return
        L_0x0035:
            X.4Xx r1 = r2.A0B
            r15 = r64
            r23 = r65
            if (r1 == 0) goto L_0x004a
            r0 = r23
            if (r1 != r0) goto L_0x004a
            X.3w6 r0 = r2.A0D
            boolean r0 = r0.A0R
            r12 = r0 ^ 1
        L_0x0047:
            r15.A01 = r12
            return
        L_0x004a:
            X.3w6 r3 = r2.A0D
            boolean r0 = r3.A0R
            r28 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r0 == 0) goto L_0x005f
            long r0 = r2.A05
            int r4 = (r0 > r28 ? 1 : (r0 == r28 ? 0 : -1))
            if (r4 == 0) goto L_0x005f
            long r0 = r0 - r67
            r28 = r0
        L_0x005f:
            long r0 = r3.A04
            long r0 = com.google.android.exoplayer2.util.Util.A07(r0)
            int r4 = r2.A02
            X.3wM r3 = r3.A02(r4)
            long r3 = r3.A00
            long r3 = com.google.android.exoplayer2.util.Util.A07(r3)
            long r0 = r0 + r3
            long r0 = r0 + r69
            X.5fQ r3 = r2.A0a
            if (r3 == 0) goto L_0x007f
            boolean r0 = r3.A00(r0)
            if (r0 == 0) goto L_0x007f
            return
        L_0x007f:
            long r0 = r2.A0S
            long r0 = com.google.android.exoplayer2.util.Util.A06(r0)
            long r0 = com.google.android.exoplayer2.util.Util.A07(r0)
            long r41 = r2.A01(r0)
            boolean r0 = r2.A0M
            if (r0 == 0) goto L_0x00a8
            X.4RX r3 = r2.A0E
            boolean r1 = r2.A0J
            boolean r0 = r2.A0L
            r21 = r3
            r22 = r2
            r24 = r51
            r26 = r43
            r30 = r39
            r32 = r1
            r33 = r0
            r21.FLS(r22, r23, r24, r26, r28, r30, r32, r33)
        L_0x00a8:
            X.4RX r0 = r2.A0E
            java.lang.Object r22 = r0.Brx()
            r0 = r22
            X.4Xu r0 = (X.C266164Xu) r0
            r22 = r0
            r2.A09(r0)
            X.4XR[] r1 = r2.A0f
            X.4RX r6 = r2.A0E
            int r0 = r6.Brh()
            r3 = r1[r0]
            boolean r55 = r2.A0B(r3)
            X.4Se r0 = r3.A06
            if (r0 == 0) goto L_0x0121
            X.3wG r4 = r3.A03
            X.4Sc r0 = (X.C264994Sc) r0
            X.3wB[] r0 = r0.A01
            r20 = 0
            if (r0 != 0) goto L_0x011e
            X.3vz r0 = r4.A03
        L_0x00d5:
            X.4XE r1 = r3.A02
            if (r1 != 0) goto L_0x00dd
            X.3vz r20 = r4.A01()
        L_0x00dd:
            if (r0 != 0) goto L_0x00e1
            if (r20 == 0) goto L_0x0121
        L_0x00e1:
            X.3ws r5 = r2.A0c
            X.3wB r17 = r6.Brg()
            int r23 = r6.Brz()
            java.lang.Object r22 = r6.Brx()
            int r4 = r2.A0R
            X.4Oi r1 = r2.A0V
            if (r1 == 0) goto L_0x00fb
            boolean r1 = r1.A00
            r32 = 1
            if (r1 == 0) goto L_0x00fd
        L_0x00fb:
            r32 = 0
        L_0x00fd:
            X.4Qh r1 = r2.A0U
            boolean r1 = r1.A0F
            r16 = r2
            r18 = r3
            r19 = r0
            r21 = r5
            r24 = r4
            r25 = r43
            r27 = r51
            r29 = r39
            r31 = r55
            r33 = r1
            X.4Xw r0 = r16.A04(r17, r18, r19, r20, r21, r22, r23, r24, r25, r27, r29, r31, r32, r33)
            r15.A00 = r0
            r2.A0J = r10
            return
        L_0x011e:
            r0 = r20
            goto L_0x00d5
        L_0x0121:
            r12 = 1
            long r0 = r3.A00
            r20 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r0 > r20 ? 1 : (r0 == r20 ? 0 : -1))
            if (r4 != 0) goto L_0x012e
            r10 = 0
        L_0x012e:
            X.4XE r4 = r3.A02
            long r5 = r4.BrO(r0)
            r18 = 0
            int r4 = (r5 > r18 ? 1 : (r5 == r18 ? 0 : -1))
            if (r4 != 0) goto L_0x013d
            r15.A01 = r10
            return
        L_0x013d:
            android.util.Pair r4 = r2.A03(r3)
            java.lang.Object r4 = r4.second
            java.lang.Number r4 = (java.lang.Number) r4
            long r6 = r4.longValue()
            X.3w6 r4 = r2.A0D
            boolean r4 = r4.A0R
            if (r4 == 0) goto L_0x0173
            long r4 = r3.A03(r6)
        L_0x0153:
            r2.A05 = r4
            r24 = r2
            r25 = r15
            r26 = r23
            r27 = r3
            r28 = r39
            r30 = r13
            long r60 = r24.A02(r25, r26, r27, r28, r30)
            r8 = -1
            int r4 = (r60 > r8 ? 1 : (r60 == r8 ? 0 : -1))
            if (r4 != 0) goto L_0x0179
            X.4UN r0 = new X.4UN
            r0.<init>()
            r2.A0F = r0
            return
        L_0x0173:
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x0153
        L_0x0179:
            X.4XE r11 = r3.A02
            long r8 = r3.A01
            long r4 = r60 - r8
            int r4 = r11.BeW(r4)
            long r8 = (long) r4
            java.util.HashMap r5 = r2.A0H
            java.lang.Long r4 = java.lang.Long.valueOf(r8)
            java.lang.Object r11 = r5.get(r4)
            java.lang.Number r11 = (java.lang.Number) r11
            if (r11 == 0) goto L_0x01c2
            long r4 = r11.longValue()
            long r16 = r4 - r8
            int r8 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r8 <= 0) goto L_0x01c2
            X.4XE r8 = r3.A02
            long r35 = r8.BrT(r4)
            long r4 = r3.A01
            long r35 = r35 + r4
            int r4 = (r35 > r18 ? 1 : (r35 == r18 ? 0 : -1))
            if (r4 <= 0) goto L_0x01c2
            int r4 = (r35 > r6 ? 1 : (r35 == r6 ? 0 : -1))
            if (r4 > 0) goto L_0x01c2
        L_0x01ae:
            r60 = r6
        L_0x01b0:
            if (r10 == 0) goto L_0x01e1
            X.4XE r10 = r3.A02
            long r8 = r3.A01
            long r4 = r35 - r8
            long r8 = r10.C7P(r4)
            int r4 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r4 < 0) goto L_0x01e1
            goto L_0x0047
        L_0x01c2:
            r35 = r60
            int r4 = (r60 > r6 ? 1 : (r60 == r6 ? 0 : -1))
            if (r4 > 0) goto L_0x01d0
            boolean r4 = r2.A0L
            if (r4 == 0) goto L_0x01ae
            int r4 = (r60 > r6 ? 1 : (r60 == r6 ? 0 : -1))
            if (r4 < 0) goto L_0x01ae
        L_0x01d0:
            r15.A01 = r10
            r56 = r2
            r57 = r3
            r58 = r6
            r62 = r10
            boolean r4 = r56.A0C(r57, r58, r60, r62)
            if (r4 == 0) goto L_0x0034
            goto L_0x01b0
        L_0x01e1:
            long r0 = r60 - r35
            r16 = 1
            long r0 = r0 + r16
            int r9 = (int) r0
            X.4Qh r0 = r2.A0U
            r59 = r0
            int r1 = r2.A0Q
            if (r1 > 0) goto L_0x01f4
            int r9 = java.lang.Math.min(r12, r9)
        L_0x01f4:
            if (r65 == 0) goto L_0x01fb
            r39 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x01fb:
            X.3wG r0 = r3.A03
            boolean r0 = r0.A04()
            if (r0 == 0) goto L_0x02b0
            int r0 = (r6 > r60 ? 1 : (r6 == r60 ? 0 : -1))
            if (r0 >= 0) goto L_0x02b0
            r58 = 1
            int r0 = r2.A00
            int r0 = r0 + 1
            r2.A00 = r0
        L_0x020f:
            X.3ws r0 = r2.A0c
            r28 = r0
            int r0 = r2.A0R
            r31 = r0
            X.4RX r0 = r2.A0E
            X.3wB r26 = r0.Brg()
            int r32 = r0.Brz()
            java.lang.Object r29 = r0.Brx()
            long r0 = (long) r1
            r45 = r0
            boolean r0 = r15.A02
            r19 = r0
            X.4Oi r0 = r2.A0V
            if (r0 == 0) goto L_0x0236
            boolean r0 = r0.A00
            r57 = 1
            if (r0 == 0) goto L_0x0238
        L_0x0236:
            r57 = 0
        L_0x0238:
            X.3wx r0 = r2.A0T
            r18 = r0
            r12 = 0
            int r0 = (r73 > r20 ? 1 : (r73 == r20 ? 0 : -1))
            if (r0 == 0) goto L_0x02ae
            r0 = 1000(0x3e8, double:4.94E-321)
            long r13 = r73 / r0
            int r10 = (int) r13
        L_0x0246:
            X.4XE r8 = r3.A02
            long r4 = r3.A01
            long r0 = r35 - r4
            int r0 = r8.BeW(r0)
            long r4 = (long) r0
            if (r11 == 0) goto L_0x02ab
            long r49 = r11.longValue()
        L_0x0257:
            X.3w6 r1 = r2.A0D
            X.4SY r0 = r2.A0W
            java.lang.String r13 = r0.A00
            X.4Oq r11 = r2.A09
            long r0 = r1.A00
            X.27s r8 = r2.A08
            r23 = r8
            r24 = r18
            r25 = r11
            r30 = r13
            r33 = r9
            r34 = r10
            r37 = r45
            r45 = r6
            r47 = r4
            r53 = r0
            r56 = r19
            X.4Y1 r3 = A00(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r37, r39, r41, r43, r45, r47, r49, r51, r53, r55, r56, r57, r58)
            r15.A00 = r3
            int r0 = (r35 > r60 ? 1 : (r35 == r60 ? 0 : -1))
            if (r0 == 0) goto L_0x028d
            boolean r0 = r2.A0L
            if (r0 == 0) goto L_0x02a9
            long r60 = r60 - r16
            int r0 = (r35 > r60 ? 1 : (r35 == r60 ? 0 : -1))
            if (r0 != 0) goto L_0x02a9
        L_0x028d:
            r1 = 1
        L_0x028e:
            X.3w6 r0 = r2.A0D
            boolean r0 = r0.A0R
            if (r0 != 0) goto L_0x029b
            if (r1 == 0) goto L_0x0298
            r2.A0B = r3
        L_0x0298:
            r2.A0J = r12
            return
        L_0x029b:
            if (r1 == 0) goto L_0x0298
            r0 = r59
            boolean r0 = r0.A0O
            if (r0 == 0) goto L_0x0298
            X.4TL r0 = r2.A0b
            r0.A01()
            goto L_0x0298
        L_0x02a9:
            r1 = 0
            goto L_0x028e
        L_0x02ab:
            r49 = -1
            goto L_0x0257
        L_0x02ae:
            r10 = -1
            goto L_0x0246
        L_0x02b0:
            r58 = 0
            goto L_0x020f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4XN.BW6(X.4Xb, X.4Y2, java.util.List, long, long, long, long):void");
    }

    public final void D1o(C266194Xx r32) {
        AnonymousClass4YN r6;
        this.A0P = 0;
        this.A0O = -9223372036854775807L;
        this.A0N = 0;
        this.A0G = null;
        C266194Xx r9 = r32;
        if (r9 instanceof C266184Xw) {
            int CMA = this.A0E.CMA(r9.A05);
            AnonymousClass4XR[] r11 = this.A0f;
            AnonymousClass4XR r8 = r11[CMA];
            if (r8.A02 == null) {
                C265014Se r7 = r8.A06;
                AnonymousClass4YO r62 = ((C264994Sc) r7).A00;
                if ((r62 instanceof AnonymousClass4YN) && (r6 = (AnonymousClass4YN) r62) != null) {
                    if (this.A0U.A0I) {
                        C256733wG r5 = r8.A03;
                        AnonymousClass4YP r2 = new AnonymousClass4YP(r6, r5.A01);
                        long j = r8.A04;
                        long j2 = r8.A00;
                        C256383vg r19 = r8.A07;
                        long j3 = r8.A01;
                        boolean z = r8.A08;
                        C257163wx r192 = r8.A05;
                        C265014Se r20 = r7;
                        r11[CMA] = new AnonymousClass4XR(r192, r20, r2, r19, r5, j, j2, j3, z);
                    } else {
                        r8.A02 = new AnonymousClass4YP(r6, r8.A03.A01);
                    }
                    this.A07 = r6.A01;
                }
            }
        }
        C290505fQ r72 = this.A0a;
        if (r72 != null) {
            long j4 = r72.A00;
            if (j4 == -9223372036854775807L || r9.A02 > j4) {
                r72.A00 = r9.A02;
            }
            r72.A04.A01 = true;
        }
        HashMap A072 = A07();
        if (r9 instanceof AnonymousClass4Y2) {
            A072.put("segment_identifier", Long.valueOf(((AnonymousClass4Y2) r9).A00));
        }
        A072.put("start_time_us", Long.valueOf(r9.A04));
        A072.put("end_time_us", Long.valueOf(r9.A02));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0026, code lost:
        if (r15 < (r13 + ((long) r0))) goto L_0x0028;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003d, code lost:
        if (r3 <= ((long) r2)) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0047, code lost:
        if (r4 == false) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if ((r11.A06 + ((long) r2)) >= r9) goto L_0x001c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A0C(X.AnonymousClass4XR r12, long r13, long r15, boolean r17) {
        /*
            r11 = this;
            long r9 = java.lang.System.currentTimeMillis()
            int r1 = r11.A03
            X.4Qh r4 = r11.A0U
            int r0 = r4.A08
            r8 = 1
            r7 = 0
            if (r1 < r0) goto L_0x000f
            r7 = 1
        L_0x000f:
            int r2 = r4.A07
            if (r2 < 0) goto L_0x001c
            long r0 = r11.A06
            long r2 = (long) r2
            long r0 = r0 + r2
            int r2 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            r6 = 0
            if (r2 < 0) goto L_0x001d
        L_0x001c:
            r6 = 1
        L_0x001d:
            int r0 = r4.A06
            if (r0 <= 0) goto L_0x0028
            long r0 = (long) r0
            long r13 = r13 + r0
            int r0 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
            r5 = 0
            if (r0 >= 0) goto L_0x0029
        L_0x0028:
            r5 = 1
        L_0x0029:
            int r2 = r4.A0A
            if (r2 <= 0) goto L_0x003f
            X.3wG r1 = r12.A03
            boolean r0 = r1 instanceof X.AnonymousClass4XD
            if (r0 == 0) goto L_0x00a1
            X.4XD r1 = (X.AnonymousClass4XD) r1
            X.3wJ r0 = r1.A00
            long r3 = r0.A03
        L_0x0039:
            long r1 = (long) r2
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            r4 = 0
            if (r0 > 0) goto L_0x0040
        L_0x003f:
            r4 = 1
        L_0x0040:
            if (r7 == 0) goto L_0x0049
            if (r6 == 0) goto L_0x0049
            if (r5 == 0) goto L_0x0049
            r3 = 1
            if (r4 != 0) goto L_0x004a
        L_0x0049:
            r3 = 0
        L_0x004a:
            X.3wG r0 = r12.A03
            boolean r0 = r0.A04()
            if (r0 == 0) goto L_0x0094
            if (r17 != 0) goto L_0x0094
            if (r3 != 0) goto L_0x0094
            java.util.HashMap r2 = r11.A07()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r7)
            java.lang.String r0 = "predictive_counter_far_enough"
            r2.put(r0, r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r6)
            java.lang.String r0 = "manifest_fresh_enough"
            r2.put(r0, r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r5)
            java.lang.String r0 = "segment_close_enough"
            r2.put(r0, r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r4)
            java.lang.String r0 = "segment_duration_small_enough"
            r2.put(r0, r1)
            long r0 = r11.A06
            long r9 = r9 - r0
            java.lang.Long r1 = java.lang.Long.valueOf(r9)
            java.lang.String r0 = "freshness"
            r2.put(r0, r1)
            r0 = 0
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "cache_start"
            r2.put(r0, r1)
        L_0x0094:
            X.3wG r0 = r12.A03
            boolean r0 = r0.A04()
            if (r0 == 0) goto L_0x00a4
            if (r17 != 0) goto L_0x00a4
            if (r3 == 0) goto L_0x00a4
            return r8
        L_0x00a1:
            r3 = 0
            goto L_0x0039
        L_0x00a4:
            r8 = 0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4XN.A0C(X.4XR, long, long, boolean):boolean");
    }

    /* JADX WARNING: type inference failed for: r0v28, types: [X.4XX, java.lang.Object] */
    public AnonymousClass4XN(AnonymousClass4SZ r35, AnonymousClass4SV r36, 27s r37, C257163wx r38, C264544Qh r39, C264114Oq r40, C264034Oi r41, AnonymousClass4SY r42, 27k r43, C264894Rs r44, C265174Sv r45, C265034Sg r46, C265194Sx r47, C290505fQ r48, AnonymousClass4TL r49, C256633w6 r50, AnonymousClass4RX r51, C257113ws r52, AnonymousClass4T1 r53, C250823m7 r54, List list, int[] iArr, int i, int i2, int i3, long j, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A0d = r53;
        C256633w6 r13 = r50;
        this.A0D = r13;
        C265194Sx r12 = r47;
        this.A0Y = r12;
        this.A0i = iArr;
        AnonymousClass4RX r11 = r51;
        this.A0E = r11;
        int i4 = i2;
        this.A0R = i4;
        this.A0c = r52;
        int i5 = i;
        this.A02 = i5;
        this.A0S = j;
        this.A0Q = i3;
        C290505fQ r33 = r48;
        this.A0a = r33;
        this.A0M = z2;
        boolean z5 = z3;
        this.A0I = z5;
        C264544Qh r9 = r39;
        this.A0U = r9;
        this.A0V = r41;
        this.A0b = r49;
        this.A0A = r43;
        this.A09 = r40;
        this.A08 = r37;
        this.A0Z = new AnonymousClass4XQ(r9);
        this.A0T = r38;
        this.A0X = r45;
        this.A0g = r35;
        this.A0W = r42;
        this.A0j = r36;
        this.A0h = r54;
        long A002 = r13.A00(i5);
        long j2 = r13.A02(i5).A00;
        this.A05 = -9223372036854775807L;
        ArrayList A062 = A06();
        this.A0f = new AnonymousClass4XR[r11.length()];
        for (int i6 = 0; i6 < this.A0f.length; i6++) {
            C256733wG r5 = (C256733wG) A062.get(r11.BGu(i6));
            List list2 = r5.A04;
            C256383vg A022 = r12.A02(list2);
            AnonymousClass4XR[] r4 = this.A0f;
            if (A022 == null) {
                A022 = (C256383vg) list2.get(0);
            }
            C256683wB r3 = r5.A02;
            C265034Sg r16 = r46;
            C256683wB r17 = r3;
            C290505fQ r19 = r33;
            r4[i6] = new AnonymousClass4XR(this.A0T, r16.AMh(r17, r44, r19, list, i4, r9.A02, z, false, z4, false), r5.A00(), A022, r5, j2, A002, 0, z5);
            this.A0e.put(r3.A0T, this.A0f[i6]);
        }
        1xr r1 = r9.A0C;
        ? obj = new Object();
        obj.A00 = r1;
        this.A0C = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0090, code lost:
        if (r2.A03(r11) <= r131) goto L_0x0092;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x01b2, code lost:
        if (r2.A03(r0) <= r131) goto L_0x01b4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x012b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AnonymousClass4Y1 A00(X.C266164Xu r112, X.27s r113, X.C257163wx r114, X.C264114Oq r115, X.C256683wB r116, X.AnonymousClass4XR r117, X.C257113ws r118, java.lang.Object r119, java.lang.String r120, int r121, int r122, int r123, int r124, long r125, long r127, long r129, long r131, long r133, long r135, long r137, long r139, long r141, long r143, boolean r145, boolean r146, boolean r147, boolean r148) {
        /*
            r2 = r117
            X.3wG r14 = r2.A03
            r0 = r135
            r11 = r125
            long r5 = r125 - r135
            long r3 = -r5
            r50 = r3
            r59 = r148
            if (r148 == 0) goto L_0x0030
            X.4XE r13 = r2.A02     // Catch:{ 4Yv -> 0x0024 }
            long r7 = r2.A01     // Catch:{ 4Yv -> 0x0024 }
            long r3 = r135 - r7
            long r107 = r13.C7P(r3)     // Catch:{ 4Yv -> 0x0024 }
            long r7 = r2.A02(r0)     // Catch:{ 4Yv -> 0x0024 }
            long r3 = r5 * r7
            long r107 = r107 + r3
            goto L_0x003a
        L_0x0024:
            X.4XE r13 = r2.A02
            long r7 = r2.A01
            long r3 = r135 - r7
            long r107 = r13.C7P(r3)
            goto L_0x0118
        L_0x0030:
            X.4XE r13 = r2.A02
            long r7 = r2.A01
            long r3 = r125 - r7
            long r107 = r13.C7P(r3)
        L_0x003a:
            if (r148 != 0) goto L_0x0118
            long r109 = r2.A03(r11)
        L_0x0040:
            r3 = r112
            if (r112 == 0) goto L_0x0112
            long r0 = r3.A01
            r17 = r0
            int r0 = r3.A00
            r24 = r0
        L_0x004c:
            X.4XE r5 = r2.A02
            long r3 = r2.A01
            long r0 = r125 - r3
            X.3vz r6 = r5.BrV(r0)
            r13 = r6
            X.4Se r0 = r2.A06
            r23 = r0
            r21 = 1000(0x3e8, double:4.94E-321)
            r40 = r124
            r105 = r122
            r35 = r121
            r104 = r119
            r102 = r118
            r58 = r147
            r57 = r146
            r15 = r139
            r121 = r137
            r52 = r141
            r100 = r116
            r56 = r145
            if (r0 != 0) goto L_0x012b
            X.4XE r0 = r2.A02
            boolean r0 = r0.isExplicit()
            if (r0 != 0) goto L_0x0092
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r131 > r3 ? 1 : (r131 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x0092
            long r3 = r2.A03(r11)
            int r0 = (r3 > r131 ? 1 : (r3 == r131 ? 0 : -1))
            r3 = 8
            if (r0 > 0) goto L_0x0093
        L_0x0092:
            r3 = 0
        L_0x0093:
            X.3vg r0 = r2.A07
            java.lang.String r2 = r0.A03
            X.3wB r1 = r14.A02
            X.3wA r0 = r1.A0N
            java.lang.String r0 = r0.A07
            r61 = r0
            int r0 = r1.A05
            long r7 = (long) r0
            long r0 = r107 / r21
            int r4 = (int) r0
            r20 = r4
            long r0 = r109 - r107
            long r0 = r0 / r21
            int r4 = (int) r0
            r19 = r4
            long r9 = r133 / r21
            int r13 = (int) r9
            r36 = -1
            long r44 = android.os.SystemClock.elapsedRealtime()
            X.3x3 r23 = new X.3x3
            r23.<init>()
            r46 = -1
            int r5 = (int) r15
            r0 = r121
            int r4 = (int) r0
            r25 = 0
            X.3x5 r22 = X.C257243x5.A02
            r60 = 0
            java.lang.String r28 = ""
            X.3x6 r0 = new X.3x6
            r26 = r25
            r27 = r25
            r29 = r28
            r30 = r25
            r31 = r25
            r32 = r20
            r33 = r19
            r34 = r13
            r37 = r5
            r38 = r4
            r39 = r24
            r41 = r36
            r42 = r7
            r48 = r50
            r50 = r17
            r54 = r46
            r24 = r61
            r21 = r0
            r21.<init>(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r44, r46, r48, r50, r52, r54, r56, r57, r58, r59, r60)
            X.3x7 r17 = X.C266174Xv.A00(r6, r14, r0, r2, r3)
            X.XOI r98 = new X.XOI
            r13 = r98
            r14 = r100
            r15 = r14
            r16 = r102
            r18 = r104
            r19 = r105
            r20 = r35
            r21 = r107
            r23 = r109
            r25 = r11
            r27 = r121
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r23, r25, r27)
            return r98
        L_0x0112:
            r17 = -1
            r24 = -1
            goto L_0x004c
        L_0x0118:
            long r109 = r2.A03(r0)     // Catch:{ 4Yv -> 0x0125 }
            long r0 = r2.A02(r0)     // Catch:{ 4Yv -> 0x0125 }
            long r5 = r5 * r0
            long r109 = r109 + r5
            goto L_0x0040
        L_0x0125:
            long r109 = r2.A03(r0)
            goto L_0x0040
        L_0x012b:
            r3 = 1
            r8 = 1
        L_0x012d:
            r0 = r123
            if (r3 >= r0) goto L_0x015a
            long r0 = (long) r3
            long r0 = r0 + r125
            X.4XE r7 = r2.A02
            long r4 = r2.A01
            long r0 = r0 - r4
            X.3vz r1 = r7.BrV(r0)
            X.3vg r0 = r2.A07
            java.lang.String r0 = r0.A03
            X.3vz r6 = r6.A01(r1, r0)
            if (r6 == 0) goto L_0x015a
            long r0 = (long) r8
            long r0 = r0 + r125
            long r19 = r2.A03(r0)
            r4 = 0
            int r0 = (r127 > r4 ? 1 : (r127 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0297
            long r4 = r19 - r107
            int r0 = (r4 > r127 ? 1 : (r4 == r127 ? 0 : -1))
            if (r0 <= 0) goto L_0x0297
        L_0x015a:
            X.3vg r0 = r2.A07
            java.lang.String r0 = r0.A03
            android.net.Uri r25 = r13.A00(r0)
            r0 = r115
            if (r115 == 0) goto L_0x0189
            java.util.concurrent.atomic.AtomicLong r0 = r0.A06
            long r5 = r0.get()
            r3 = 0
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x0189
            r3 = 2000(0x7d0, double:9.88E-321)
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x0189
            android.net.Uri$Builder r3 = r25.buildUpon()
            java.lang.String r1 = java.lang.Long.toString(r5)
            java.lang.String r0 = "chk_dur"
            r3.appendQueryParameter(r0, r1)
            android.net.Uri r25 = r3.build()
        L_0x0189:
            long r0 = (long) r8
            long r0 = r0 + r125
            r3 = 1
            long r0 = r0 - r3
            long r3 = r2.A00
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r5 == 0) goto L_0x0290
            int r5 = (r3 > r109 ? 1 : (r3 == r109 ? 0 : -1))
            if (r5 > 0) goto L_0x0290
        L_0x019e:
            X.4XE r5 = r2.A02
            boolean r5 = r5.isExplicit()
            if (r5 != 0) goto L_0x01b4
            int r5 = (r131 > r6 ? 1 : (r131 == r6 ? 0 : -1))
            if (r5 == 0) goto L_0x01b4
            long r1 = r2.A03(r0)
            int r0 = (r1 > r131 ? 1 : (r1 == r131 ? 0 : -1))
            r31 = 8
            if (r0 > 0) goto L_0x01b6
        L_0x01b4:
            r31 = 0
        L_0x01b6:
            X.3wB r1 = r14.A02
            X.3wA r0 = r1.A0N
            java.lang.String r0 = r0.A07
            r26 = r0
            int r0 = r1.A05
            long r5 = (long) r0
            long r0 = r107 / r21
            int r2 = (int) r0
            r20 = r2
            long r0 = r109 - r107
            long r0 = r0 / r21
            int r2 = (int) r0
            r19 = r2
            long r9 = r133 / r21
            int r0 = (int) r9
            r9 = r0
            r75 = -1
            long r83 = android.os.SystemClock.elapsedRealtime()
            X.3x3 r62 = new X.3x3
            r62.<init>()
            r85 = -1
            int r7 = (int) r15
            r0 = r121
            int r2 = (int) r0
            r64 = 0
            X.3x5 r61 = X.C257243x5.A02
            r0 = 0
            java.lang.String r67 = ""
            X.3x6 r60 = new X.3x6
            r68 = r120
            r65 = r64
            r66 = r64
            r69 = r64
            r70 = r64
            r71 = r20
            r72 = r19
            r73 = r9
            r76 = r7
            r77 = r2
            r78 = r24
            r80 = r75
            r81 = r5
            r87 = r50
            r89 = r17
            r93 = r85
            r99 = r0
            r63 = r26
            r74 = r35
            r79 = r40
            r91 = r52
            r95 = r56
            r96 = r57
            r97 = r58
            r98 = r59
            r60.<init>(r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72, r73, r74, r75, r76, r77, r78, r79, r80, r81, r83, r85, r87, r89, r91, r93, r95, r96, r97, r98, r99)
            java.util.Map r28 = java.util.Collections.emptyMap()
            long r9 = r13.A02
            long r5 = r13.A01
            java.lang.String r27 = r14.A02()
            if (r27 != 0) goto L_0x0240
            java.util.List r1 = r14.A04
            java.lang.Object r0 = r1.get(r0)
            X.3vg r0 = (X.C256383vg) r0
            java.lang.String r0 = r0.A03
            android.net.Uri r0 = r13.A00(r0)
            java.lang.String r27 = r0.toString()
        L_0x0240:
            X.C256703wD.A02(r25)
            r32 = 0
            r30 = 1
            X.3x7 r2 = new X.3x7
            r24 = r2
            r26 = r60
            r29 = r64
            r34 = r9
            r36 = r5
            r24.<init>(r25, r26, r27, r28, r29, r30, r31, r32, r34, r36)
            if (r113 == 0) goto L_0x0275
            boolean r0 = r113.A01()
            if (r0 != 0) goto L_0x0275
            r0 = r143
            int r5 = (r143 > r32 ? 1 : (r143 == r32 ? 0 : -1))
            if (r5 <= 0) goto L_0x0275
            java.lang.String r5 = "QUIC_MAX_PACING_RATE="
            java.lang.String r5 = X.002.A0Q(r5, r0)
            java.lang.String r1 = "x-fb-socket-option"
            if (r5 == 0) goto L_0x0275
            X.3x6 r0 = r2.A07
            java.util.Map r0 = r0.A0Q
            r0.put(r1, r5)
        L_0x0275:
            long r5 = r14.A01
            long r0 = -r5
            X.4YR r98 = new X.4YR
            r111 = r129
            r99 = r114
            r101 = r23
            r103 = r2
            r106 = r8
            r113 = r3
            r115 = r11
            r117 = r0
            r119 = r121
            r98.<init>(r99, r100, r101, r102, r103, r104, r105, r106, r107, r109, r111, r113, r115, r117, r119)
            return r98
        L_0x0290:
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x019e
        L_0x0297:
            int r8 = r8 + 1
            int r3 = r3 + 1
            r13 = r6
            r109 = r19
            goto L_0x012d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4XN.A00(X.4Xu, X.27s, X.3wx, X.4Oq, X.3wB, X.4XR, X.3ws, java.lang.Object, java.lang.String, int, int, int, int, long, long, long, long, long, long, long, long, long, long, boolean, boolean, boolean, boolean):X.4Y1");
    }
}
