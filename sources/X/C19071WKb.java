package X;

import com.facebook.proxygen.LigerSamplePolicy;
import com.facebook.video.heroplayer.setting.HeroPlayerSetting;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: X.WKb  reason: case insensitive filesystem */
public final class C19071WKb implements C263654Mv {
    public final /* synthetic */ C14711U2w A00;

    public final /* synthetic */ void Cwg(AnonymousClass4Yf r1) {
    }

    public final /* synthetic */ void D4H(String str, boolean z) {
    }

    public final void D7z(long j, String str, boolean z) {
    }

    public final void D80(int i, int i2, int i3, int i4) {
    }

    public final void DAN(AnonymousClass4Yf r1, String str, List list, long j, boolean z) {
    }

    public final void DCz(C284815Oa r1, String str, String str2, String str3, long j) {
    }

    public final /* synthetic */ void DGr(String str, long j) {
    }

    public final /* synthetic */ void DKJ(String str, byte[] bArr, long j) {
    }

    public final void DNp(boolean z) {
    }

    public final void DNr(String str, byte[] bArr, long j, long j2) {
    }

    public final /* synthetic */ void DNz(C17183VLn vLn) {
    }

    public final /* synthetic */ void DS6(Object obj) {
    }

    public final void DTt(byte[] bArr, long j) {
    }

    public final /* synthetic */ void DWg(String str, String str2) {
    }

    public final /* synthetic */ void DXc(2Co r1) {
    }

    public final void DXg(C263674Mx r1, float f, long j) {
    }

    public final void DZ3() {
    }

    public final void DmQ(C263684My r1, C263674Mx r2, String str, long j, boolean z, boolean z2) {
    }

    public final void DnM(long j, long j2, boolean z, boolean z2, boolean z3) {
    }

    public final void Dnv(boolean z) {
    }

    public final void Drl(List list) {
    }

    public final void Dt8(C284815Oa r1, AnonymousClass4Yf r2, AnonymousClass4Yf r3, String str, String str2, List list, long j) {
    }

    public final void DxA(C263684My r1, C263674Mx r2, String str, String str2, String str3, String str4, long j, boolean z) {
    }

    public final void Dxb(C297475ro r1, C263684My r2, C263674Mx r3, Integer num, String str, String str2, String str3, String str4, String str5, long j, long j2, boolean z) {
    }

    public final void DyA() {
    }

    public final void DyF() {
    }

    public final void Dzh(boolean z, boolean z2) {
    }

    public final void E06(C284815Oa r1) {
    }

    public final void onCues(List list) {
    }

    public final void onDrawnToSurface() {
    }

    public final void onSeeking(long j) {
    }

    public C19071WKb(C14711U2w u2w) {
        this.A00 = u2w;
    }

    public final void DXW() {
        C14711U2w u2w = this.A00;
        HeroPlayerSetting heroPlayerSetting = C14711U2w.A0A;
        int i = u2w.A07;
        C20843X0u x0u = u2w.A04;
        if (x0u != null) {
            W1V w1v = ((C19076WKg) x0u).A00;
            int i2 = w1v.A00 % 2;
            if (i != w1v.A01) {
                w1v.A01 = i;
                if (i == i2) {
                    for (AnonymousClass7QJ r0 : w1v.A0A) {
                        AnonymousClass7QL r1 = r0.A00.A00;
                        if (r1 != null) {
                            r1.A03(AnonymousClass7QM.VIDEO_ABOUT_TO_FINISH);
                        }
                    }
                }
            }
        }
    }

    public final void DXX(C297475ro r4, C284815Oa r5, C263684My r6, C263674Mx r7, String str) {
        C14711U2w u2w = this.A00;
        HeroPlayerSetting heroPlayerSetting = C14711U2w.A0A;
        int i = u2w.A07;
        if (r5 == null) {
            r5 = new C284815Oa();
        }
        u2w.A02 = r5;
        C20843X0u x0u = u2w.A04;
        if (x0u != null) {
            if (str == null) {
                str = "";
            }
            W1V w1v = ((C19076WKg) x0u).A00;
            if (i == w1v.A00 % 2) {
                String str2 = w1v.A03;
                if (str2 != null && str2.equals(w1v.A04)) {
                    W1V.A02(w1v, str, false);
                    return;
                }
                return;
            }
            ConcurrentLinkedQueue concurrentLinkedQueue = w1v.A0B;
            if (!concurrentLinkedQueue.isEmpty()) {
                AnonymousClass4OI r1 = (AnonymousClass4OI) concurrentLinkedQueue.poll();
                0qQ.A0A(r1);
                W1V.A00(r1, w1v, false);
            }
        }
    }

    public final void DYz(long j, String str) {
        String str2;
        String str3;
        C14711U2w u2w = this.A00;
        HeroPlayerSetting heroPlayerSetting = C14711U2w.A0A;
        int i = u2w.A07;
        C20843X0u x0u = u2w.A04;
        if (x0u != null) {
            AnonymousClass4OI r0 = u2w.A03;
            if (r0 != null) {
                str2 = r0.A0K.A0G;
            } else {
                str2 = null;
            }
            boolean z = u2w.A06;
            String str4 = u2w.A05;
            0qQ.A0B(str4, 3);
            W1V w1v = ((C19076WKg) x0u).A00;
            w1v.A04 = str2;
            int i2 = w1v.A00;
            if (i == i2 % 2) {
                for (AnonymousClass7QJ r02 : w1v.A0A) {
                    AnonymousClass7QL r03 = r02.A00.A00;
                    if (r03 != null) {
                        r03.A02();
                    }
                }
            } else if (i == (i2 + 1) % 2) {
                for (AnonymousClass7QJ r04 : w1v.A0A) {
                    AnonymousClass7QL r05 = r04.A00.A00;
                    if (r05 != null) {
                        r05.A07.schedule(new Wv3(r05), LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT);
                    }
                }
            }
            if (z && (str3 = w1v.A03) != null && str3.equals(w1v.A04)) {
                W1V.A02(w1v, str4, true);
            }
        }
    }

    public final void DnZ(C297475ro r6) {
        C14711U2w u2w = this.A00;
        HeroPlayerSetting heroPlayerSetting = C14711U2w.A0A;
        C20843X0u x0u = u2w.A04;
        if (x0u != null) {
            C263634Mt r0 = u2w.A08;
            if (r0 != null) {
                r0.A08();
            }
            C284815Oa r1 = u2w.A02;
            if (r1 == null) {
                r1 = new C284815Oa();
            }
            String str = u2w.A05;
            if (str == null) {
                str = "";
            }
            0qQ.A0B(r1, 7);
            for (AnonymousClass7QJ r02 : ((C19076WKg) x0u).A00.A0A) {
                AnonymousClass7QL r12 = r02.A00.A00;
                if (r12 != null) {
                    r12.A04.get(str);
                    Iterator it = r12.A06.iterator();
                    while (it.hasNext()) {
                        it.next();
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006b, code lost:
        if (r1.equals(r14.A04) == false) goto L_0x006d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DxH(X.C297475ro r28, X.C263684My r29, X.C263674Mx r30, java.lang.Integer r31, java.lang.String r32, java.lang.String r33, java.lang.String r34, boolean r35, boolean r36) {
        /*
            r27 = this;
            r0 = r27
            r24 = r34
            X.U2w r3 = r0.A00
            com.facebook.video.heroplayer.setting.HeroPlayerSetting r0 = X.C14711U2w.A0A
            X.X0u r2 = r3.A04
            if (r2 == 0) goto L_0x01a9
            X.4OI r0 = r3.A03
            if (r0 == 0) goto L_0x018f
            X.3uU r0 = r0.A0K
            java.lang.String r0 = r0.A0G
            r23 = r0
        L_0x0016:
            java.lang.String r22 = ""
            if (r23 != 0) goto L_0x001c
            r23 = r22
        L_0x001c:
            long r0 = r3.A00
            r25 = r0
            r9 = 0
            r0 = r28
            if (r28 == 0) goto L_0x0189
            long r7 = r0.A02
            int r0 = r0.A00
            r21 = r0
        L_0x002c:
            X.4Mt r0 = r3.A08
            if (r0 == 0) goto L_0x0185
            long r5 = r0.A08()
            long r9 = r0.A09()
        L_0x0038:
            X.5Oa r15 = r3.A02
            if (r15 != 0) goto L_0x0041
            X.5Oa r15 = new X.5Oa
            r15.<init>()
        L_0x0041:
            if (r34 != 0) goto L_0x0045
            r24 = r22
        L_0x0045:
            X.WKg r2 = (X.C19076WKg) r2
            r0 = 7
            X.0qQ.A0B(r15, r0)
            X.W1V r14 = r2.A00
            java.util.Set r0 = r14.A0A
            java.util.Iterator r20 = r0.iterator()
        L_0x0053:
            boolean r0 = r20.hasNext()
            if (r0 == 0) goto L_0x0193
            java.lang.Object r2 = r20.next()
            X.7QJ r2 = (X.AnonymousClass7QJ) r2
            java.lang.String r1 = r14.A03
            if (r1 == 0) goto L_0x006d
            java.lang.String r0 = r14.A04
            boolean r0 = r1.equals(r0)
            r19 = 1
            if (r0 != 0) goto L_0x006f
        L_0x006d:
            r19 = 0
        L_0x006f:
            X.7QH r0 = r2.A00
            X.7QL r2 = r0.A00
            if (r2 == 0) goto L_0x0053
            android.util.LruCache r1 = r2.A04
            r0 = r24
            java.lang.Object r13 = r1.get(r0)
            X.Jw0 r13 = (X.C61062Jw0) r13
            java.util.Set r0 = r2.A06
            java.util.Iterator r18 = r0.iterator()
        L_0x0085:
            boolean r0 = r18.hasNext()
            if (r0 == 0) goto L_0x0053
            java.lang.Object r0 = r18.next()
            X.7QV r0 = (X.AnonymousClass7QV) r0
            X.7Zs r2 = r0.A00
            X.7I3 r1 = r2.A02
            X.0sa r0 = r2.A04
            java.lang.Object r12 = r0.invoke()
            java.lang.String r12 = (java.lang.String) r12
            java.lang.String r17 = r2.A00()
            r2 = 2
            r0 = r17
            X.0qQ.A0B(r0, r2)
            X.0wc r1 = r1.A01
            java.lang.String r0 = "ai_agent_embodiment_playback"
            X.0Aj r0 = X.AnonymousClass7TE.A0e(r1, r0)
            X.1Ln r11 = new X.1Ln
            r11.<init>(r0, r2)
            boolean r0 = X.DbT.A1Y(r11)
            if (r0 == 0) goto L_0x0085
            r16 = 0
            if (r13 == 0) goto L_0x0181
            java.lang.Object r4 = r13.A00
            X.7QP r4 = (X.AnonymousClass7QP) r4
        L_0x00c2:
            java.lang.String r1 = "video_id"
            r0 = r23
            r11.A0R(r1, r0)
            r2 = r25
            double r0 = (double) r2
            java.lang.Double r1 = java.lang.Double.valueOf(r0)
            java.lang.String r0 = "playback_start_latency_ms"
            r11.A0P(r0, r1)
            r0 = r21
            long r0 = (long) r0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "playback_stall_count"
            r11.A0Q(r0, r1)
            double r0 = (double) r7
            java.lang.Double r1 = java.lang.Double.valueOf(r0)
            java.lang.String r0 = "playback_stall_time_ms"
            r11.A0P(r0, r1)
            double r0 = (double) r5
            java.lang.Double r1 = java.lang.Double.valueOf(r0)
            r0 = 1690(0x69a, float:2.368E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r11.A0P(r0, r1)
            double r0 = (double) r9
            java.lang.Double r1 = java.lang.Double.valueOf(r0)
            java.lang.String r0 = "video_duration"
            r11.A0P(r0, r1)
            X.4Yz r1 = r15.A00
            X.4Yz r0 = X.C266464Yz.A1Y
            if (r1 != r0) goto L_0x0171
            r1 = r22
        L_0x010b:
            java.lang.String r0 = "playback_error"
            r11.A0R(r0, r1)
            if (r4 == 0) goto L_0x016e
            java.lang.String r1 = r4.A03
        L_0x0114:
            java.lang.String r0 = "state_name"
            r11.A0R(r0, r1)
            if (r4 == 0) goto L_0x016b
            java.lang.String r1 = r4.A00
        L_0x011d:
            r0 = 37
            java.lang.String r0 = X.C273654mx.A00(r0)
            r11.A0R(r0, r1)
            if (r4 == 0) goto L_0x0168
            java.lang.String r1 = r4.A02
        L_0x012a:
            java.lang.String r0 = "sentiment_name"
            r11.A0R(r0, r1)
            if (r4 == 0) goto L_0x0165
            java.lang.String r1 = r4.A01
        L_0x0133:
            java.lang.String r0 = "intensity_name"
            r11.A0R(r0, r1)
            r0 = r19 ^ 1
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "is_video_not_ready"
            r11.A0O(r0, r1)
            if (r13 == 0) goto L_0x0149
            java.lang.String r0 = r13.A02
            r16 = r0
        L_0x0149:
            r0 = 3101(0xc1d, float:4.345E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            r0 = r16
            r11.A0R(r1, r0)
            java.lang.String r0 = "thread_id"
            r11.A0R(r0, r12)
            java.lang.String r1 = "thread_session_id"
            r0 = r17
            r11.A0R(r1, r0)
            r11.Cgf()
            goto L_0x0085
        L_0x0165:
            r1 = r16
            goto L_0x0133
        L_0x0168:
            r1 = r16
            goto L_0x012a
        L_0x016b:
            r1 = r16
            goto L_0x011d
        L_0x016e:
            r1 = r16
            goto L_0x0114
        L_0x0171:
            java.lang.String r0 = r1.toString()
            java.lang.String r2 = r15.A02
            java.lang.String r1 = "%s,%s"
            java.lang.String r1 = com.facebook.common.stringformat.StringFormatUtil.formatStrLocaleSafe(r1, r0, r2)
            X.0qQ.A0A(r1)
            goto L_0x010b
        L_0x0181:
            r4 = r16
            goto L_0x00c2
        L_0x0185:
            r5 = 0
            goto L_0x0038
        L_0x0189:
            r7 = 0
            r21 = 0
            goto L_0x002c
        L_0x018f:
            r23 = 0
            goto L_0x0016
        L_0x0193:
            boolean r0 = r14.A05
            if (r0 != 0) goto L_0x01a9
            java.lang.String r1 = r14.A03
            if (r1 == 0) goto L_0x01aa
            java.lang.String r0 = r14.A04
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x01aa
            r1 = 0
            r0 = r24
            X.W1V.A02(r14, r0, r1)
        L_0x01a9:
            return
        L_0x01aa:
            boolean r0 = r14.A08
            if (r0 == 0) goto L_0x01a9
            int r0 = r14.A00
            int r1 = r0 % 2
            X.U2w[] r0 = r14.A0D
            r0 = r0[r1]
            r0.A01()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19071WKb.DxH(X.5ro, X.4My, X.4Mx, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, boolean, boolean):void");
    }

    public final void DyH(int i, int i2, float f) {
        C14711U2w u2w = this.A00;
        HeroPlayerSetting heroPlayerSetting = C14711U2w.A0A;
        int i3 = u2w.A07;
        C20843X0u x0u = u2w.A04;
        if (x0u != null) {
            ULB ulb = new ULB(i, i2, f);
            W1V w1v = ((C19076WKg) x0u).A00;
            w1v.A0C[i3] = ulb;
            W1V.A01(w1v, i3);
            for (AnonymousClass7QJ r0 : w1v.A0A) {
                AnonymousClass7QL r02 = r0.A00.A00;
                if (r02 != null) {
                    Iterator it = r02.A06.iterator();
                    while (it.hasNext()) {
                        it.next();
                    }
                }
            }
        }
    }

    public final void DyV(C263684My r4, C263674Mx r5, String str, String str2, String str3, String str4, String str5, String str6, String str7, long j, boolean z, boolean z2) {
        AnonymousClass4OI r1;
        C14711U2w u2w = this.A00;
        HeroPlayerSetting heroPlayerSetting = C14711U2w.A0A;
        u2w.A02 = null;
        u2w.A00 = j;
        C20843X0u x0u = u2w.A04;
        if (x0u != null) {
            W1V w1v = ((C19076WKg) x0u).A00;
            if (!w1v.A06) {
                ConcurrentLinkedQueue concurrentLinkedQueue = w1v.A0B;
                if (!concurrentLinkedQueue.isEmpty() && (r1 = (AnonymousClass4OI) concurrentLinkedQueue.poll()) != null) {
                    W1V.A00(r1, w1v, false);
                }
            }
        }
    }

    public C19071WKb() {
    }
}
