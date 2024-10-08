package X;

import com.facebook.videolite.transcoder.base.composition.MediaComposition;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.SsU  reason: case insensitive filesystem */
public final class C12380SsU implements C13828Thz {
    public int A00;
    public C10939S1u A01;
    public Exception A02;
    public Integer A03;
    public Integer A04;
    public Map A05;
    public C10688RwS A06;
    public final int A07;
    public final long A08;
    public final long A09;
    public final C13886Tj9 A0A;
    public final C7232Q0d A0B;
    public final C11354SOn A0C;
    public final MediaComposition A0D;
    public final C7339Q4p A0E;
    public final C10864RzP A0F;
    public final SNK A0G;
    public final REA A0H;
    public final STT A0I;
    public final C13863Tij A0J;
    public final File A0K;
    public final Integer A0L;
    public final HashMap A0M;
    public final HashMap A0N;
    public final List A0O = AnonymousClass7TE.A1C();
    public final List A0P = AnonymousClass7TE.A1C();
    public final List A0Q = AnonymousClass7TE.A1C();
    public final TreeSet A0R;
    public final ExecutorService A0S;
    public final boolean A0T;
    public final boolean A0U;
    public final C10427Rs3 A0V;
    public final C13821Thq A0W;

    private final STT A00(C13886Tj9 tj9, C11354SOn sOn, REA rea, RR8 rr8, Map map) {
        String str;
        switch (this.A03.intValue()) {
            case 0:
                str = "NO_RECORD";
                break;
            case 1:
                str = "RECOVERY_FAILED";
                break;
            default:
                str = "RECOVERY_SUCCESS";
                break;
        }
        map.put("crash_recovery_mode", str);
        REA rea2 = rea;
        map.put("video_transcode_is_segmented", String.valueOf(AnonymousClass7TF.A1W(rea, REA.SEGMENTED_TRANSCODE)));
        C7232Q0d q0d = this.A0B;
        if (q0d != null) {
            map.put("source_color_space", S91.A00(q0d.A01));
        }
        C13886Tj9 tj92 = this.A0A;
        C10939S1u s1u = new C10939S1u(tj92, sOn, map);
        this.A01 = s1u;
        HashMap A19 = Pxe.A19(s1u.A02);
        this.A05 = A19;
        C10746RxQ rxQ = new C10746RxQ(tj9, A19);
        C11187SEn sEn = new C11187SEn(tj9, this.A05);
        C10542Rtw rtw = new C10542Rtw(tj92, this.A05, -1);
        0qQ.A07(this.A0K.getPath());
        return rr8.A00(rtw, q0d, this, sEn, rxQ, rea2);
    }

    public static final synchronized void A02(C12380SsU ssU) {
        IllegalStateException A0y;
        long j;
        synchronized (ssU) {
            while (true) {
                try {
                    TreeSet treeSet = ssU.A0R;
                    if (!treeSet.isEmpty()) {
                        Object first = treeSet.first();
                        if (first == null) {
                            A0y = AnonymousClass7TE.A0y();
                            break;
                        }
                        C11041S6z s6z = (C11041S6z) first;
                        HashMap hashMap = ssU.A0N;
                        C11041S6z s6z2 = (C11041S6z) hashMap.get(s6z.A04);
                        Iterator A0t = AnonymousClass7TF.A0t(hashMap);
                        long j2 = -1;
                        C11041S6z s6z3 = null;
                        while (A0t.hasNext()) {
                            C11041S6z s6z4 = (C11041S6z) A0t.next();
                            long j3 = s6z4.A03;
                            if (j3 > j2) {
                                j2 = j3;
                                s6z3 = s6z4;
                            }
                        }
                        if (s6z2 != null) {
                            if (s6z2.A00 + 1 != s6z.A00) {
                                break;
                            }
                        } else if (s6z.A00 != 0) {
                            break;
                        }
                        if (s6z3 != null && s6z3.A02 == -1) {
                            break;
                        }
                        if (s6z.A02 == -1) {
                            File file = s6z.A05;
                            0qQ.A0B(file, 0);
                            if (file instanceof RC3) {
                                if (!((RC3) file).A02) {
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                        Object pollFirst = treeSet.pollFirst();
                        if (pollFirst == null) {
                            A0y = AnonymousClass7TE.A0y();
                            break;
                        }
                        C11041S6z s6z5 = (C11041S6z) pollFirst;
                        Iterator A0t2 = AnonymousClass7TF.A0t(hashMap);
                        long j4 = -1;
                        C11041S6z s6z6 = null;
                        while (A0t2.hasNext()) {
                            C11041S6z s6z7 = (C11041S6z) A0t2.next();
                            long j5 = s6z7.A03;
                            if (j5 > j4) {
                                j4 = j5;
                                s6z6 = s6z7;
                            }
                        }
                        if (s6z6 == null) {
                            j = 0;
                        } else {
                            j = s6z6.A03 + s6z6.A02;
                        }
                        s6z5.A03 = j;
                        STT stt = ssU.A0I;
                        File file2 = s6z5.A05;
                        long j6 = s6z5.A02;
                        stt.A09(new C11284SJc(s6z5.A04, file2, s6z5.A06, s6z5.A00, j6, j, s6z5.A01));
                        hashMap.put(s6z5.A04, s6z5);
                    } else {
                        break;
                    }
                } catch (Exception e) {
                    A03(ssU, e);
                    C10939S1u s1u = ssU.A01;
                    if (s1u != null) {
                        s1u.A00(e);
                    } else {
                        throw AnonymousClass7TE.A0y();
                    }
                }
            }
            throw A0y;
        }
    }

    public final synchronized void Dig(C11284SJc sJc, float f) {
        float f2;
        C10688RwS rwS = this.A06;
        if (rwS != null) {
            RF9 rf9 = sJc.A04;
            RF9 rf92 = RF9.Video;
            if (rf9 == rf92) {
                Map map = rwS.A03;
                Float f3 = (Float) map.get(sJc);
                if (f3 != null) {
                    f2 = f3.floatValue();
                } else {
                    f2 = 0.0f;
                }
                float f4 = f - f2;
                if (f4 < 0.0f) {
                    f4 = 0.0f;
                } else if (f4 > 1.0f) {
                    f4 = 1.0f;
                }
                float f5 = rwS.A00 + (f4 / ((float) rwS.A01));
                rwS.A00 = f5;
                map.put(sJc, Float.valueOf(f));
                f = f5;
            }
            C7339Q4p q4p = rwS.A02;
            if (RF9.Audio == rf9) {
                q4p.A00 = f;
            } else {
                if (rf92 != rf9) {
                    q4p.A00 = f;
                }
                q4p.A02 = f;
            }
            C7339Q4p.A00(q4p);
        } else {
            throw AnonymousClass7TE.A0y();
        }
    }

    public final synchronized void Dta(Exception exc) {
        if (this.A04 == AnonymousClass05K.A01) {
            if (this.A0Q.size() == this.A00) {
                this.A04 = AnonymousClass05K.A0N;
                A03(this, exc);
            } else {
                this.A02 = exc;
            }
        }
    }

    public final synchronized void Dvj(C10689RwT rwT) {
        this.A0W.onSuccess(new C10940S1w(this.A0H, rwT, this.A0P));
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final synchronized void EKC() {
        /*
            r11 = this;
            monitor-enter(r11)
            X.SNK r5 = r11.A0G     // Catch:{ all -> 0x0142 }
            if (r5 == 0) goto L_0x0140
            org.json.JSONObject r6 = X.DbS.A11()     // Catch:{ JSONException -> 0x0131, RJd -> 0x0124 }
            java.util.HashMap r0 = r11.A0N     // Catch:{ JSONException -> 0x0131, RJd -> 0x0124 }
            java.util.Iterator r3 = X.AnonymousClass7TF.A0s(r0)     // Catch:{ JSONException -> 0x0131, RJd -> 0x0124 }
        L_0x000f:
            boolean r0 = r3.hasNext()     // Catch:{ JSONException -> 0x0131, RJd -> 0x0124 }
            if (r0 == 0) goto L_0x0033
            java.util.Map$Entry r1 = X.AnonymousClass7TE.A1J(r3)     // Catch:{ JSONException -> 0x0131, RJd -> 0x0124 }
            java.lang.Object r0 = r1.getKey()     // Catch:{ JSONException -> 0x0131, RJd -> 0x0124 }
            X.RF9 r0 = (X.RF9) r0     // Catch:{ JSONException -> 0x0131, RJd -> 0x0124 }
            java.lang.Object r2 = r1.getValue()     // Catch:{ JSONException -> 0x0131, RJd -> 0x0124 }
            X.S6z r2 = (X.C11041S6z) r2     // Catch:{ JSONException -> 0x0131, RJd -> 0x0124 }
            int r0 = r0.A00     // Catch:{ JSONException -> 0x0131, RJd -> 0x0124 }
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch:{ JSONException -> 0x0131, RJd -> 0x0124 }
            org.json.JSONObject r0 = r2.A00()     // Catch:{ JSONException -> 0x0131, RJd -> 0x0124 }
            r6.put(r1, r0)     // Catch:{ JSONException -> 0x0131, RJd -> 0x0124 }
            goto L_0x000f
        L_0x0033:
            org.json.JSONObject r4 = X.DbS.A11()     // Catch:{ JSONException -> 0x0131, RJd -> 0x0124 }
            java.lang.String r0 = "mPrevUploadedSegmentByType"
            r4.put(r0, r6)     // Catch:{ JSONException -> 0x0131, RJd -> 0x0124 }
            java.util.List r0 = r11.A0P     // Catch:{ JSONException -> 0x0131, RJd -> 0x0124 }
            org.json.JSONArray r1 = A01(r0)     // Catch:{ JSONException -> 0x0131, RJd -> 0x0124 }
            java.lang.String r0 = "mTranscodeResults"
            r4.put(r0, r1)     // Catch:{ JSONException -> 0x0131, RJd -> 0x0124 }
            java.util.List r0 = r11.A0O     // Catch:{ JSONException -> 0x0131, RJd -> 0x0124 }
            org.json.JSONArray r1 = A01(r0)     // Catch:{ JSONException -> 0x0131, RJd -> 0x0124 }
            java.lang.String r0 = "mSucceededTranscoderSegments"
            r4.put(r0, r1)     // Catch:{ JSONException -> 0x0131, RJd -> 0x0124 }
            X.STT r8 = r11.A0I     // Catch:{ JSONException -> 0x0131, RJd -> 0x0124 }
            monitor-enter(r8)     // Catch:{ JSONException -> 0x0131, RJd -> 0x0124 }
            org.json.JSONObject r7 = X.DbS.A11()     // Catch:{ all -> 0x0121 }
            java.lang.String r1 = "mStartInvoked"
            boolean r0 = r8.A04     // Catch:{ all -> 0x0121 }
            r7.put(r1, r0)     // Catch:{ all -> 0x0121 }
            java.lang.String r1 = "mEndInvoked"
            boolean r0 = r8.A01     // Catch:{ all -> 0x0121 }
            r7.put(r1, r0)     // Catch:{ all -> 0x0121 }
            X.RQK r0 = r8.A00     // Catch:{ all -> 0x0121 }
            if (r0 == 0) goto L_0x0072
            java.lang.String r1 = "mStartResponse"
            java.lang.String r0 = r0.A00     // Catch:{ all -> 0x0121 }
            r7.put(r1, r0)     // Catch:{ all -> 0x0121 }
        L_0x0072:
            java.lang.String r3 = "mSegments"
            java.util.Set r0 = r8.A0H     // Catch:{ all -> 0x0121 }
            org.json.JSONArray r2 = X.Pxe.A1E()     // Catch:{ all -> 0x0121 }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x0121 }
        L_0x007e:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0121 }
            if (r0 == 0) goto L_0x0092
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x0121 }
            X.SJc r0 = (X.C11284SJc) r0     // Catch:{ all -> 0x0121 }
            org.json.JSONObject r0 = r0.A00()     // Catch:{ all -> 0x0121 }
            r2.put(r0)     // Catch:{ all -> 0x0121 }
            goto L_0x007e
        L_0x0092:
            r7.put(r3, r2)     // Catch:{ all -> 0x0121 }
            java.lang.String r3 = "mTransfedSegments"
            java.util.Set r0 = r8.A0I     // Catch:{ all -> 0x0121 }
            org.json.JSONArray r2 = X.Pxe.A1E()     // Catch:{ all -> 0x0121 }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x0121 }
        L_0x00a1:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0121 }
            if (r0 == 0) goto L_0x00b5
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x0121 }
            X.SJc r0 = (X.C11284SJc) r0     // Catch:{ all -> 0x0121 }
            org.json.JSONObject r0 = r0.A00()     // Catch:{ all -> 0x0121 }
            r2.put(r0)     // Catch:{ all -> 0x0121 }
            goto L_0x00a1
        L_0x00b5:
            r7.put(r3, r2)     // Catch:{ all -> 0x0121 }
            java.lang.String r9 = "mTransferResults"
            java.util.Map r0 = r8.A0F     // Catch:{ all -> 0x0121 }
            org.json.JSONArray r6 = X.Pxe.A1E()     // Catch:{ all -> 0x0121 }
            java.util.Iterator r10 = X.AnonymousClass7TF.A0u(r0)     // Catch:{ all -> 0x0121 }
        L_0x00c4:
            boolean r0 = r10.hasNext()     // Catch:{ all -> 0x0121 }
            if (r0 == 0) goto L_0x00f4
            java.util.Map$Entry r1 = X.AnonymousClass7TE.A1J(r10)     // Catch:{ all -> 0x0121 }
            java.lang.Object r0 = r1.getKey()     // Catch:{ all -> 0x0121 }
            X.SJc r0 = (X.C11284SJc) r0     // Catch:{ all -> 0x0121 }
            java.lang.Object r3 = r1.getValue()     // Catch:{ all -> 0x0121 }
            X.SJe r3 = (X.C11286SJe) r3     // Catch:{ all -> 0x0121 }
            org.json.JSONObject r2 = X.DbS.A11()     // Catch:{ all -> 0x0121 }
            org.json.JSONObject r1 = r0.A00()     // Catch:{ all -> 0x0121 }
            java.lang.String r0 = "Segment"
            r2.put(r0, r1)     // Catch:{ all -> 0x0121 }
            org.json.JSONObject r1 = r3.A00()     // Catch:{ all -> 0x0121 }
            java.lang.String r0 = "UploadResult"
            r2.put(r0, r1)     // Catch:{ all -> 0x0121 }
            r6.put(r2)     // Catch:{ all -> 0x0121 }
            goto L_0x00c4
        L_0x00f4:
            r7.put(r9, r6)     // Catch:{ all -> 0x0121 }
            monitor-exit(r8)     // Catch:{ JSONException -> 0x0131, RJd -> 0x0124 }
            java.lang.String r0 = "uploadProtocol"
            r4.put(r0, r7)     // Catch:{ JSONException -> 0x0131, RJd -> 0x0124 }
            int r0 = r11.A07     // Catch:{ JSONException -> 0x0131, RJd -> 0x0124 }
            java.lang.String r2 = java.lang.String.valueOf(r0)     // Catch:{ JSONException -> 0x0131, RJd -> 0x0124 }
            r0 = 0
            X.0qQ.A0B(r2, r0)     // Catch:{ JSONException -> 0x0131, RJd -> 0x0124 }
            org.json.JSONObject r1 = r5.A00     // Catch:{ JSONException -> 0x0118 }
            java.lang.String r0 = "strategy_"
            java.lang.String r0 = X.002.A0R(r0, r2)     // Catch:{ JSONException -> 0x0118 }
            r1.put(r0, r4)     // Catch:{ JSONException -> 0x0118 }
            X.SNK.A01(r5)     // Catch:{ JSONException -> 0x0118 }
            goto L_0x0140
        L_0x0118:
            r2 = move-exception
            java.lang.String r1 = "Failed to update StrategyData"
            X.RJd r0 = new X.RJd     // Catch:{ JSONException -> 0x0131, RJd -> 0x0124 }
            r0.<init>(r1, r2)     // Catch:{ JSONException -> 0x0131, RJd -> 0x0124 }
            goto L_0x0123
        L_0x0121:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ JSONException -> 0x0131, RJd -> 0x0124 }
        L_0x0123:
            throw r0     // Catch:{ JSONException -> 0x0131, RJd -> 0x0124 }
        L_0x0124:
            r3 = move-exception
            X.RzP r0 = r11.A0F     // Catch:{ all -> 0x0142 }
            X.TdF r2 = r0.A0D     // Catch:{ all -> 0x0142 }
            java.lang.String r1 = "videolite-crash-recovery"
            java.lang.String r0 = "Cannot save state in SegmentedMediaUploadStrategy"
            if (r2 == 0) goto L_0x0140
            goto L_0x013d
        L_0x0131:
            r3 = move-exception
            X.RzP r0 = r11.A0F     // Catch:{ all -> 0x0142 }
            X.TdF r2 = r0.A0D     // Catch:{ all -> 0x0142 }
            java.lang.String r1 = "videolite-crash-recovery"
            java.lang.String r0 = "Cannot save state in SegmentedMediaUploadStrategy"
            if (r2 == 0) goto L_0x0140
        L_0x013d:
            r2.Chx(r3, r1, r0)     // Catch:{ all -> 0x0142 }
        L_0x0140:
            monitor-exit(r11)
            return
        L_0x0142:
            r0 = move-exception
            monitor-exit(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12380SsU.EKC():void");
    }

    public final synchronized void cancel() {
        if (this.A04 == AnonymousClass05K.A01) {
            this.A04 = AnonymousClass05K.A0C;
            A04("SegmentedMediaUploadStrategy canceled by user");
            this.A0W.D0h(new CancellationException("SegmentedMediaUploadStrategy canceled by user"));
        }
    }

    private final void A04(String str) {
        List<C13778Tgt> list = this.A0Q;
        if (list.size() != this.A00) {
            for (C13778Tgt AG6 : list) {
                AG6.AG6(str);
            }
        }
        this.A0I.A06();
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final synchronized void FMV() {
        /*
            r50 = this;
            r3 = r50
            monitor-enter(r3)
            X.Thq r0 = r3.A0W     // Catch:{ all -> 0x0237 }
            r49 = r0
            r49.onStart()     // Catch:{ all -> 0x0237 }
            X.Tij r12 = r3.A0J     // Catch:{ all -> 0x0237 }
            X.Q0d r2 = r3.A0B     // Catch:{ all -> 0x0237 }
            X.SOn r0 = r3.A0C     // Catch:{ all -> 0x0237 }
            r25 = r0
            r12.DtP(r2, r0)     // Catch:{ all -> 0x0237 }
            X.S1u r4 = r3.A01     // Catch:{ 4ZS | RuntimeException -> 0x022f }
            if (r4 == 0) goto L_0x0222
            X.Tj9 r5 = r4.A01     // Catch:{ 4ZS | RuntimeException -> 0x022f }
            long r0 = r5.now()     // Catch:{ 4ZS | RuntimeException -> 0x022f }
            r4.A00 = r0     // Catch:{ 4ZS | RuntimeException -> 0x022f }
            java.lang.String r7 = "media_upload_process_start"
            r6 = 0
            r9 = -1
            java.util.Map r8 = r4.A02     // Catch:{ 4ZS | RuntimeException -> 0x022f }
            X.C9596Rda.A00(r5, r6, r7, r8, r9)     // Catch:{ 4ZS | RuntimeException -> 0x022f }
            java.lang.Integer r0 = X.AnonymousClass05K.A01     // Catch:{ 4ZS | RuntimeException -> 0x022f }
            r3.A04 = r0     // Catch:{ 4ZS | RuntimeException -> 0x022f }
            java.util.Map r4 = r3.A05     // Catch:{ 4ZS | RuntimeException -> 0x022f }
            X.Tj9 r1 = r3.A0A     // Catch:{ 4ZS | RuntimeException -> 0x022f }
            X.SNV r0 = new X.SNV     // Catch:{ 4ZS | RuntimeException -> 0x022f }
            r0.<init>(r1, r4)     // Catch:{ 4ZS | RuntimeException -> 0x022f }
            X.Q4t r4 = new X.Q4t     // Catch:{ 4ZS | RuntimeException -> 0x022f }
            r4.<init>(r0, r3)     // Catch:{ 4ZS | RuntimeException -> 0x022f }
            java.util.concurrent.ExecutorService r1 = r3.A0S     // Catch:{ 4ZS | RuntimeException -> 0x022f }
            X.Q4r r22 = new X.Q4r     // Catch:{ 4ZS | RuntimeException -> 0x022f }
            r0 = r22
            r0.<init>(r4, r1)     // Catch:{ 4ZS | RuntimeException -> 0x022f }
            java.lang.Integer r0 = r3.A0L     // Catch:{ 4ZS | RuntimeException -> 0x022f }
            int r1 = r0.intValue()     // Catch:{ 4ZS | RuntimeException -> 0x022f }
            r8 = 0
            if (r1 == r8) goto L_0x0059
            r0 = 1
            if (r1 != r0) goto L_0x0227
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0y()     // Catch:{ 4ZS | RuntimeException -> 0x022f }
            goto L_0x022e
        L_0x0059:
            X.RzP r6 = r3.A0F     // Catch:{ 4ZS | RuntimeException -> 0x022f }
            X.SFw r5 = r6.A0A     // Catch:{ 4ZS | RuntimeException -> 0x022f }
            java.io.File r0 = r3.A0K     // Catch:{ 4ZS | RuntimeException -> 0x022f }
            r30 = r0
            java.util.List r15 = r3.A0O     // Catch:{ 4ZS | RuntimeException -> 0x022f }
            java.util.List r14 = r3.A0P     // Catch:{ 4ZS | RuntimeException -> 0x022f }
            X.REA r13 = r3.A0H     // Catch:{ 4ZS | RuntimeException -> 0x022f }
            com.facebook.videolite.transcoder.base.composition.MediaComposition r4 = r3.A0D     // Catch:{ 4ZS | RuntimeException -> 0x022f }
            boolean r0 = r3.A0U     // Catch:{ 4ZS | RuntimeException -> 0x022f }
            r48 = r0
            boolean r0 = r3.A0T     // Catch:{ 4ZS | RuntimeException -> 0x022f }
            r47 = r0
            long r0 = r3.A09     // Catch:{ 4ZS | RuntimeException -> 0x022f }
            r43 = r0
            long r0 = r3.A08     // Catch:{ 4ZS | RuntimeException -> 0x022f }
            r45 = r0
            X.Rzi r0 = r6.A01     // Catch:{ 4ZS | RuntimeException -> 0x022f }
            r0.A00()     // Catch:{ 4ZS | RuntimeException -> 0x022f }
            r5.A03 = r4     // Catch:{ 4ZS | RuntimeException -> 0x022f }
            java.util.Iterator r9 = r14.iterator()     // Catch:{ 4ZS | RuntimeException -> 0x022f }
            r21 = 0
            r31 = 0
            r39 = 0
            r20 = 0
            r18 = 0
            r17 = 0
        L_0x0090:
            boolean r0 = r9.hasNext()     // Catch:{ 4ZS | RuntimeException -> 0x022f }
            if (r0 == 0) goto L_0x00c2
            java.lang.Object r7 = r9.next()     // Catch:{ 4ZS | RuntimeException -> 0x022f }
            X.SRW r7 = (X.SRW) r7     // Catch:{ 4ZS | RuntimeException -> 0x022f }
            X.4aE r0 = r7.A0M     // Catch:{ 4ZS | RuntimeException -> 0x022f }
            int r1 = r0.ordinal()     // Catch:{ 4ZS | RuntimeException -> 0x022f }
            if (r1 == r8) goto L_0x00b9
            r0 = 1
            if (r1 == r0) goto L_0x00b0
            long r0 = r7.A0J     // Catch:{ 4ZS | RuntimeException -> 0x022f }
            long r18 = r18 + r0
            boolean r0 = r7.A0O     // Catch:{ 4ZS | RuntimeException -> 0x022f }
            r17 = r17 | r0
            goto L_0x0090
        L_0x00b0:
            long r0 = r7.A0J     // Catch:{ 4ZS | RuntimeException -> 0x022f }
            long r39 = r39 + r0
            boolean r0 = r7.A0O     // Catch:{ 4ZS | RuntimeException -> 0x022f }
            r20 = r20 | r0
            goto L_0x0090
        L_0x00b9:
            long r0 = r7.A0J     // Catch:{ 4ZS | RuntimeException -> 0x022f }
            long r31 = r31 + r0
            boolean r0 = r7.A0O     // Catch:{ 4ZS | RuntimeException -> 0x022f }
            r21 = r21 | r0
            goto L_0x0090
        L_0x00c2:
            X.RF9 r11 = X.RF9.Audio     // Catch:{ 4ZS | RuntimeException -> 0x022f }
            r10 = 1
            X.0qQ.A0B(r15, r10)     // Catch:{ 4ZS | RuntimeException -> 0x022f }
            java.util.Iterator r9 = r15.iterator()     // Catch:{ 4ZS | RuntimeException -> 0x022f }
            r7 = -1
        L_0x00cd:
            boolean r0 = r9.hasNext()     // Catch:{ 4ZS | RuntimeException -> 0x022f }
            if (r0 == 0) goto L_0x00e4
            java.lang.Object r1 = r9.next()     // Catch:{ 4ZS | RuntimeException -> 0x022f }
            X.S6z r1 = (X.C11041S6z) r1     // Catch:{ 4ZS | RuntimeException -> 0x022f }
            X.RF9 r0 = r1.A04     // Catch:{ 4ZS | RuntimeException -> 0x022f }
            if (r11 != r0) goto L_0x00cd
            int r0 = r1.A00     // Catch:{ 4ZS | RuntimeException -> 0x022f }
            int r7 = java.lang.Math.max(r7, r0)     // Catch:{ 4ZS | RuntimeException -> 0x022f }
            goto L_0x00cd
        L_0x00e4:
            r5.A00 = r7     // Catch:{ 4ZS | RuntimeException -> 0x022f }
            X.RF9 r9 = X.RF9.Video     // Catch:{ 4ZS | RuntimeException -> 0x022f }
            java.util.Iterator r16 = r15.iterator()     // Catch:{ 4ZS | RuntimeException -> 0x022f }
            r7 = -1
        L_0x00ed:
            boolean r0 = r16.hasNext()     // Catch:{ 4ZS | RuntimeException -> 0x022f }
            if (r0 == 0) goto L_0x0104
            java.lang.Object r1 = r16.next()     // Catch:{ 4ZS | RuntimeException -> 0x022f }
            X.S6z r1 = (X.C11041S6z) r1     // Catch:{ 4ZS | RuntimeException -> 0x022f }
            X.RF9 r0 = r1.A04     // Catch:{ 4ZS | RuntimeException -> 0x022f }
            if (r9 != r0) goto L_0x00ed
            int r0 = r1.A00     // Catch:{ 4ZS | RuntimeException -> 0x022f }
            int r7 = java.lang.Math.max(r7, r0)     // Catch:{ 4ZS | RuntimeException -> 0x022f }
            goto L_0x00ed
        L_0x0104:
            int r0 = r5.A00     // Catch:{ 4ZS | RuntimeException -> 0x022f }
            int r0 = r0 + 1
            r5.A00 = r0     // Catch:{ 4ZS | RuntimeException -> 0x022f }
            int r0 = r7 + 1
            r5.A02 = r0     // Catch:{ 4ZS | RuntimeException -> 0x022f }
            r2.getClass()     // Catch:{ 4ZS | RuntimeException -> 0x022f }
            X.Rp9 r0 = r6.A0J     // Catch:{ 4ZS | RuntimeException -> 0x022f }
            if (r0 == 0) goto L_0x014a
            java.util.HashMap r1 = r2.A0J     // Catch:{ 4ZS | RuntimeException -> 0x022f }
            r7 = 0
            if (r1 == 0) goto L_0x014c
            X.4aE r0 = X.C266714aE.AUDIO     // Catch:{ 4ZS | RuntimeException -> 0x022f }
            java.lang.Object r16 = r1.get(r0)     // Catch:{ 4ZS | RuntimeException -> 0x022f }
            if (r16 == 0) goto L_0x014c
            java.lang.Object r0 = r1.get(r0)     // Catch:{ 4ZS | RuntimeException -> 0x022f }
            java.util.HashMap r0 = (java.util.HashMap) r0     // Catch:{ 4ZS | RuntimeException -> 0x022f }
            java.util.Iterator r16 = X.AnonymousClass7TF.A0t(r0)     // Catch:{ 4ZS | RuntimeException -> 0x022f }
        L_0x012c:
            boolean r0 = r16.hasNext()     // Catch:{ 4ZS | RuntimeException -> 0x022f }
            if (r0 == 0) goto L_0x014c
            java.lang.Object r0 = r16.next()     // Catch:{ 4ZS | RuntimeException -> 0x022f }
            java.util.Iterator r1 = X.C51966G9m.A1H(r0)     // Catch:{ 4ZS | RuntimeException -> 0x022f }
        L_0x013a:
            boolean r0 = r1.hasNext()     // Catch:{ 4ZS | RuntimeException -> 0x022f }
            if (r0 == 0) goto L_0x012c
            java.lang.Object r0 = r1.next()     // Catch:{ 4ZS | RuntimeException -> 0x022f }
            X.Q0d r0 = (X.C7232Q0d) r0     // Catch:{ 4ZS | RuntimeException -> 0x022f }
            boolean r0 = r0.A0K     // Catch:{ 4ZS | RuntimeException -> 0x022f }
            r7 = r7 | r0
            goto L_0x013a
        L_0x014a:
            boolean r7 = r2.A0K     // Catch:{ 4ZS | RuntimeException -> 0x022f }
        L_0x014c:
            java.util.ArrayList r1 = X.AnonymousClass7TE.A1C()     // Catch:{ 4ZS | RuntimeException -> 0x022f }
            X.REA r0 = X.REA.NON_SEGMENTED_TRANSCODE     // Catch:{ 4ZS | RuntimeException -> 0x022f }
            if (r13 != r0) goto L_0x0163
            boolean r0 = r6.A0U     // Catch:{ 4ZS | RuntimeException -> 0x022f }
            if (r0 != 0) goto L_0x0160
            if (r7 == 0) goto L_0x0160
            X.RF9 r9 = X.RF9.Mixed     // Catch:{ 4ZS | RuntimeException -> 0x022f }
            r20 = r17
            r39 = r18
        L_0x0160:
            if (r20 != 0) goto L_0x01c4
            goto L_0x01a5
        L_0x0163:
            if (r7 == 0) goto L_0x0186
            boolean r0 = r6.A0U     // Catch:{ 4ZS | RuntimeException -> 0x022f }
            if (r0 != 0) goto L_0x0186
            if (r21 != 0) goto L_0x0186
            r24 = r2
            r26 = r6
            r27 = r11
            r28 = r22
            r29 = r13
            r33 = r43
            r35 = r45
            r37 = r8
            r38 = r48
            r23 = r5
            X.Q4l r0 = X.C11222SFw.A00(r23, r24, r25, r26, r27, r28, r29, r30, r31, r33, r35, r37, r38)     // Catch:{ 4ZS | RuntimeException -> 0x022f }
            r1.add(r0)     // Catch:{ 4ZS | RuntimeException -> 0x022f }
        L_0x0186:
            if (r20 != 0) goto L_0x01c4
            r31 = r5
            r32 = r2
            r33 = r25
            r34 = r6
            r35 = r9
            r36 = r22
            r37 = r13
            r38 = r30
            r41 = r43
            r43 = r45
            r45 = r47
            r46 = r48
            X.Q4l r0 = X.C11222SFw.A00(r31, r32, r33, r34, r35, r36, r37, r38, r39, r41, r43, r45, r46)     // Catch:{ 4ZS | RuntimeException -> 0x022f }
            goto L_0x01c1
        L_0x01a5:
            r31 = r5
            r32 = r2
            r33 = r25
            r34 = r6
            r35 = r9
            r36 = r22
            r37 = r13
            r38 = r30
            r41 = r43
            r43 = r45
            r45 = r8
            r46 = r48
            X.Q4l r0 = X.C11222SFw.A00(r31, r32, r33, r34, r35, r36, r37, r38, r39, r41, r43, r45, r46)     // Catch:{ 4ZS | RuntimeException -> 0x022f }
        L_0x01c1:
            r1.add(r0)     // Catch:{ 4ZS | RuntimeException -> 0x022f }
        L_0x01c4:
            r5 = 0
            java.util.Iterator r7 = r1.iterator()     // Catch:{ 4ZS | RuntimeException -> 0x022f }
        L_0x01c9:
            boolean r0 = r7.hasNext()     // Catch:{ 4ZS | RuntimeException -> 0x022f }
            if (r0 == 0) goto L_0x01e6
            java.lang.Object r2 = r7.next()     // Catch:{ 4ZS | RuntimeException -> 0x022f }
            X.Q4l r2 = (X.C7335Q4l) r2     // Catch:{ 4ZS | RuntimeException -> 0x022f }
            int r0 = r2.A01()     // Catch:{ 4ZS | RuntimeException -> 0x022f }
            int r5 = r5 + r0
            X.Rs3 r0 = r3.A0V     // Catch:{ 4ZS | RuntimeException -> 0x022f }
            X.Sr7 r2 = X.TL9.A00(r0, r2)     // Catch:{ 4ZS | RuntimeException -> 0x022f }
            java.util.List r0 = r3.A0Q     // Catch:{ 4ZS | RuntimeException -> 0x022f }
            r0.add(r2)     // Catch:{ 4ZS | RuntimeException -> 0x022f }
            goto L_0x01c9
        L_0x01e6:
            if (r5 != 0) goto L_0x01f0
            int r0 = r15.size()     // Catch:{ 4ZS | RuntimeException -> 0x022f }
            int r5 = java.lang.Math.max(r0, r10)     // Catch:{ 4ZS | RuntimeException -> 0x022f }
        L_0x01f0:
            boolean r0 = r1.isEmpty()     // Catch:{ 4ZS | RuntimeException -> 0x022f }
            if (r0 == 0) goto L_0x0208
            boolean r0 = X.AnonymousClass7TE.A1b(r14)     // Catch:{ 4ZS | RuntimeException -> 0x022f }
            if (r0 == 0) goto L_0x0208
            X.Q4p r1 = r3.A0E     // Catch:{ 4ZS | RuntimeException -> 0x022f }
            r0 = 1065353216(0x3f800000, float:1.0)
            r1.A01 = r0     // Catch:{ 4ZS | RuntimeException -> 0x022f }
            X.C7339Q4p.A00(r1)     // Catch:{ 4ZS | RuntimeException -> 0x022f }
            r12.DtR(r4, r6, r14, r10)     // Catch:{ 4ZS | RuntimeException -> 0x022f }
        L_0x0208:
            X.STT r4 = r3.A0I     // Catch:{ 4ZS | RuntimeException -> 0x022f }
            monitor-enter(r4)     // Catch:{ 4ZS | RuntimeException -> 0x022f }
            java.util.Set r0 = r4.A0I     // Catch:{ all -> 0x021f }
            int r2 = r0.size()     // Catch:{ all -> 0x021f }
            monitor-exit(r4)     // Catch:{ 4ZS | RuntimeException -> 0x022f }
            X.Q4p r1 = r3.A0E     // Catch:{ 4ZS | RuntimeException -> 0x022f }
            X.RwS r0 = new X.RwS     // Catch:{ 4ZS | RuntimeException -> 0x022f }
            r0.<init>(r1, r2, r5)     // Catch:{ 4ZS | RuntimeException -> 0x022f }
            r3.A06 = r0     // Catch:{ 4ZS | RuntimeException -> 0x022f }
            r4.A08()     // Catch:{ 4ZS | RuntimeException -> 0x022f }
            goto L_0x0235
        L_0x021f:
            r1 = move-exception
            monitor-exit(r4)     // Catch:{ 4ZS | RuntimeException -> 0x022f }
            goto L_0x022e
        L_0x0222:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0y()     // Catch:{ 4ZS | RuntimeException -> 0x022f }
            goto L_0x022e
        L_0x0227:
            java.lang.String r0 = "Unsupported mimetype for transcoding"
            X.4ZS r1 = new X.4ZS     // Catch:{ 4ZS | RuntimeException -> 0x022f }
            r1.<init>(r0)     // Catch:{ 4ZS | RuntimeException -> 0x022f }
        L_0x022e:
            throw r1     // Catch:{ 4ZS | RuntimeException -> 0x022f }
        L_0x022f:
            r1 = move-exception
            r0 = r49
            r0.DEb(r1)     // Catch:{ all -> 0x0237 }
        L_0x0235:
            monitor-exit(r3)
            return
        L_0x0237:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12380SsU.FMV():void");
    }

    public static final JSONArray A01(List list) {
        JSONObject A022;
        JSONArray A1E = Pxe.A1E();
        for (Object next : list) {
            if (next instanceof C11041S6z) {
                A022 = ((C11041S6z) next).A00();
            } else if (next instanceof SRW) {
                A022 = ((SRW) next).A02();
            }
            A1E.put(A022);
        }
        return A1E;
    }

    public static final void A03(C12380SsU ssU, Exception exc) {
        String message = exc.getMessage();
        if (message == null) {
            message = "";
        }
        ssU.A04(message);
        ssU.A0W.DEb(exc);
    }

    /* JADX WARNING: type inference failed for: r0v71, types: [X.RQK, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0271, code lost:
        if (r2.isEmpty() == false) goto L_0x0273;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x027b, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x027c, code lost:
        r13.A03 = X.AnonymousClass05K.A01;
        r0 = r13.A0F.A0D;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0284, code lost:
        if (r0 != null) goto L_0x0286;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0286, code lost:
        r0.Chx(r1, "videolite-crash-recovery", "Cannot restore state in SegmentedMediaUploadStrategy");
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C12380SsU(X.C13886Tj9 r33, X.C7232Q0d r34, X.C11354SOn r35, X.C10427Rs3 r36, com.facebook.videolite.transcoder.base.composition.MediaComposition r37, X.C10864RzP r38, X.SNK r39, X.REA r40, X.RR8 r41, X.C13821Thq r42, java.lang.Integer r43, java.lang.String r44, java.util.Map r45, java.util.concurrent.ExecutorService r46, int r47, long r48, long r50, boolean r52, boolean r53) {
        /*
            r32 = this;
            r12 = r33
            r1 = r36
            X.AnonymousClass7TG.A1S(r12, r1)
            r0 = 18
            r2 = r43
            X.0qQ.A0B(r2, r0)
            r13 = r32
            r13.<init>()
            r0 = r34
            r13.A0B = r0
            r5 = r38
            r13.A0F = r5
            r13.A0A = r12
            r13.A0V = r1
            r4 = r42
            r13.A0W = r4
            r31 = r35
            r0 = r31
            r13.A0C = r0
            r30 = r40
            r0 = r30
            r13.A0H = r0
            r0 = r52
            r13.A0U = r0
            r0 = r53
            r13.A0T = r0
            r0 = r48
            r13.A09 = r0
            r0 = r50
            r13.A08 = r0
            r0 = r39
            r13.A0G = r0
            r0 = r47
            r13.A07 = r0
            r0 = r46
            r13.A0S = r0
            r13.A0L = r2
            r0 = r37
            r13.A0D = r0
            java.io.File r0 = X.AnonymousClass7TE.A0t(r44)
            r13.A0K = r0
            X.Tij r3 = r5.A02
            r13.A0J = r3
            java.util.ArrayList r0 = X.AnonymousClass7TE.A1C()
            r13.A0Q = r0
            java.util.ArrayList r0 = X.AnonymousClass7TE.A1C()
            r13.A0P = r0
            java.util.ArrayList r0 = X.AnonymousClass7TE.A1C()
            r13.A0O = r0
            java.lang.Integer r2 = X.AnonymousClass05K.A00
            r13.A04 = r2
            java.util.Comparator r1 = X.C13108TLr.A00
            java.util.TreeSet r0 = new java.util.TreeSet
            r0.<init>(r1)
            r13.A0R = r0
            java.util.HashMap r0 = X.AnonymousClass7TE.A1E()
            r13.A0M = r0
            java.util.HashMap r0 = X.AnonymousClass7TE.A1E()
            r13.A0N = r0
            boolean r1 = r5.A0U
            X.Q4p r0 = new X.Q4p
            r0.<init>(r3, r4, r1)
            r13.A0E = r0
            r13.A03 = r2
            r28 = r41
            r29 = r45
            r24 = r13
            r25 = r12
            r26 = r31
            r27 = r30
            X.STT r11 = r24.A00(r25, r26, r27, r28, r29)
            java.lang.String r10 = "Cannot restore state in SegmentedMediaUploadStrategy"
            java.lang.String r9 = "videolite-crash-recovery"
            X.SNK r1 = r13.A0G
            if (r1 == 0) goto L_0x02a4
            r5 = 0
            int r0 = r13.A07     // Catch:{ RJd | JSONException -> 0x027b }
            java.lang.String r2 = java.lang.String.valueOf(r0)     // Catch:{ RJd | JSONException -> 0x027b }
            X.0qQ.A0B(r2, r5)     // Catch:{ RJd | JSONException -> 0x027b }
            X.SNK.A00(r1)     // Catch:{ RJd | JSONException -> 0x027b }
            org.json.JSONObject r1 = r1.A00     // Catch:{ RJd | JSONException -> 0x027b }
            java.lang.String r0 = "strategy_"
            java.lang.String r0 = X.002.A0R(r0, r2)     // Catch:{ RJd | JSONException -> 0x027b }
            org.json.JSONObject r14 = r1.optJSONObject(r0)     // Catch:{ RJd | JSONException -> 0x027b }
            if (r14 == 0) goto L_0x02a4
            java.lang.String r0 = "uploadProtocol"
            org.json.JSONObject r6 = r14.getJSONObject(r0)     // Catch:{ RJd | JSONException -> 0x027b }
            X.0qQ.A07(r6)     // Catch:{ RJd | JSONException -> 0x027b }
            monitor-enter(r11)     // Catch:{ RJd | JSONException -> 0x027b }
            java.lang.String r0 = "mStartInvoked"
            boolean r0 = r6.getBoolean(r0)     // Catch:{ all -> 0x0278 }
            r11.A04 = r0     // Catch:{ all -> 0x0278 }
            java.lang.String r0 = "mEndInvoked"
            boolean r0 = r6.getBoolean(r0)     // Catch:{ all -> 0x0278 }
            r11.A01 = r0     // Catch:{ all -> 0x0278 }
            java.lang.String r2 = "mStartResponse"
            java.lang.String r0 = ""
            java.lang.String r1 = r6.optString(r2, r0)     // Catch:{ all -> 0x0278 }
            X.0qQ.A07(r1)     // Catch:{ all -> 0x0278 }
            boolean r0 = r6.has(r2)     // Catch:{ all -> 0x0278 }
            if (r0 == 0) goto L_0x00fb
            X.RQK r0 = new X.RQK     // Catch:{ all -> 0x0278 }
            r0.<init>()     // Catch:{ all -> 0x0278 }
            r0.A00 = r1     // Catch:{ all -> 0x0278 }
            r11.A00 = r0     // Catch:{ all -> 0x0278 }
        L_0x00fb:
            java.util.Set r8 = r11.A0H     // Catch:{ all -> 0x0278 }
            java.lang.String r0 = "mSegments"
            org.json.JSONArray r4 = r6.getJSONArray(r0)     // Catch:{ all -> 0x0278 }
            X.0qQ.A07(r4)     // Catch:{ all -> 0x0278 }
            int r3 = r4.length()     // Catch:{ all -> 0x0278 }
            r2 = 0
        L_0x010b:
            if (r2 >= r3) goto L_0x011f
            org.json.JSONObject r1 = r4.getJSONObject(r2)     // Catch:{ all -> 0x0278 }
            X.0qQ.A07(r1)     // Catch:{ all -> 0x0278 }
            X.SJc r0 = new X.SJc     // Catch:{ all -> 0x0278 }
            r0.<init>(r1)     // Catch:{ all -> 0x0278 }
            r8.add(r0)     // Catch:{ all -> 0x0278 }
            int r2 = r2 + 1
            goto L_0x010b
        L_0x011f:
            java.util.Set r7 = r11.A0I     // Catch:{ all -> 0x0278 }
            java.lang.String r0 = "mTransfedSegments"
            org.json.JSONArray r4 = r6.getJSONArray(r0)     // Catch:{ all -> 0x0278 }
            X.0qQ.A07(r4)     // Catch:{ all -> 0x0278 }
            int r3 = r4.length()     // Catch:{ all -> 0x0278 }
            r2 = 0
        L_0x012f:
            if (r2 >= r3) goto L_0x0143
            org.json.JSONObject r1 = r4.getJSONObject(r2)     // Catch:{ all -> 0x0278 }
            X.0qQ.A07(r1)     // Catch:{ all -> 0x0278 }
            X.SJc r0 = new X.SJc     // Catch:{ all -> 0x0278 }
            r0.<init>(r1)     // Catch:{ all -> 0x0278 }
            r7.add(r0)     // Catch:{ all -> 0x0278 }
            int r2 = r2 + 1
            goto L_0x012f
        L_0x0143:
            java.util.Map r7 = r11.A0F     // Catch:{ all -> 0x0278 }
            java.lang.String r0 = "mTransferResults"
            org.json.JSONArray r6 = r6.getJSONArray(r0)     // Catch:{ all -> 0x0278 }
            X.0qQ.A07(r6)     // Catch:{ all -> 0x0278 }
            int r4 = r6.length()     // Catch:{ all -> 0x0278 }
            r3 = 0
        L_0x0153:
            if (r3 >= r4) goto L_0x017e
            org.json.JSONObject r1 = r6.getJSONObject(r3)     // Catch:{ all -> 0x0278 }
            X.0qQ.A07(r1)     // Catch:{ all -> 0x0278 }
            java.lang.String r0 = "Segment"
            org.json.JSONObject r0 = r1.getJSONObject(r0)     // Catch:{ all -> 0x0278 }
            X.0qQ.A07(r0)     // Catch:{ all -> 0x0278 }
            X.SJc r2 = new X.SJc     // Catch:{ all -> 0x0278 }
            r2.<init>(r0)     // Catch:{ all -> 0x0278 }
            java.lang.String r0 = "UploadResult"
            org.json.JSONObject r1 = r1.getJSONObject(r0)     // Catch:{ all -> 0x0278 }
            X.0qQ.A07(r1)     // Catch:{ all -> 0x0278 }
            X.SJe r0 = new X.SJe     // Catch:{ all -> 0x0278 }
            r0.<init>(r1)     // Catch:{ all -> 0x0278 }
            r7.put(r2, r0)     // Catch:{ all -> 0x0278 }
            int r3 = r3 + 1
            goto L_0x0153
        L_0x017e:
            monitor-exit(r11)     // Catch:{ RJd | JSONException -> 0x027b }
            java.lang.String r0 = "mPrevUploadedSegmentByType"
            org.json.JSONObject r4 = r14.getJSONObject(r0)     // Catch:{ RJd | JSONException -> 0x027b }
            X.0qQ.A07(r4)     // Catch:{ RJd | JSONException -> 0x027b }
            java.util.Iterator r6 = r4.keys()     // Catch:{ RJd | JSONException -> 0x027b }
        L_0x018c:
            boolean r0 = r6.hasNext()     // Catch:{ RJd | JSONException -> 0x027b }
            if (r0 == 0) goto L_0x01bc
            java.lang.Object r1 = X.AnonymousClass7TF.A0a(r6)     // Catch:{ RJd | JSONException -> 0x027b }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ RJd | JSONException -> 0x027b }
            org.json.JSONObject r0 = r4.getJSONObject(r1)     // Catch:{ RJd | JSONException -> 0x027b }
            X.0qQ.A07(r0)     // Catch:{ RJd | JSONException -> 0x027b }
            X.S6z r3 = new X.S6z     // Catch:{ RJd | JSONException -> 0x027b }
            r3.<init>(r0)     // Catch:{ RJd | JSONException -> 0x027b }
            java.util.HashMap r2 = r13.A0N     // Catch:{ RJd | JSONException -> 0x027b }
            int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ RJd | JSONException -> 0x027b }
            r0 = 1
            if (r1 == r0) goto L_0x01b3
            r0 = 2
            if (r1 == r0) goto L_0x01b6
            X.RF9 r0 = X.RF9.Mixed     // Catch:{ RJd | JSONException -> 0x027b }
            goto L_0x01b8
        L_0x01b3:
            X.RF9 r0 = X.RF9.Audio     // Catch:{ RJd | JSONException -> 0x027b }
            goto L_0x01b8
        L_0x01b6:
            X.RF9 r0 = X.RF9.Video     // Catch:{ RJd | JSONException -> 0x027b }
        L_0x01b8:
            r2.put(r0, r3)     // Catch:{ RJd | JSONException -> 0x027b }
            goto L_0x018c
        L_0x01bc:
            java.lang.String r0 = "mTranscodeResults"
            org.json.JSONArray r7 = r14.getJSONArray(r0)     // Catch:{ RJd | JSONException -> 0x027b }
            X.0qQ.A07(r7)     // Catch:{ RJd | JSONException -> 0x027b }
            int r4 = r7.length()     // Catch:{ RJd | JSONException -> 0x027b }
            r6 = 0
            r3 = 0
        L_0x01cb:
            if (r3 >= r4) goto L_0x01de
            java.util.List r2 = r13.A0P     // Catch:{ RJd | JSONException -> 0x027b }
            org.json.JSONObject r1 = r7.getJSONObject(r3)     // Catch:{ RJd | JSONException -> 0x027b }
            X.SRW r0 = new X.SRW     // Catch:{ RJd | JSONException -> 0x027b }
            r0.<init>(r1)     // Catch:{ RJd | JSONException -> 0x027b }
            r2.add(r0)     // Catch:{ RJd | JSONException -> 0x027b }
            int r3 = r3 + 1
            goto L_0x01cb
        L_0x01de:
            java.lang.String r0 = "mSucceededTranscoderSegments"
            org.json.JSONArray r4 = r14.getJSONArray(r0)     // Catch:{ RJd | JSONException -> 0x027b }
            X.0qQ.A07(r4)     // Catch:{ RJd | JSONException -> 0x027b }
            int r3 = r4.length()     // Catch:{ RJd | JSONException -> 0x027b }
        L_0x01eb:
            if (r6 >= r3) goto L_0x0201
            java.util.List r2 = r13.A0O     // Catch:{ RJd | JSONException -> 0x027b }
            org.json.JSONObject r1 = r4.getJSONObject(r6)     // Catch:{ RJd | JSONException -> 0x027b }
            X.0qQ.A07(r1)     // Catch:{ RJd | JSONException -> 0x027b }
            X.S6z r0 = new X.S6z     // Catch:{ RJd | JSONException -> 0x027b }
            r0.<init>(r1)     // Catch:{ RJd | JSONException -> 0x027b }
            r2.add(r0)     // Catch:{ RJd | JSONException -> 0x027b }
            int r6 = r6 + 1
            goto L_0x01eb
        L_0x0201:
            java.lang.Integer r0 = X.AnonymousClass05K.A0C     // Catch:{ RJd | JSONException -> 0x027b }
            r13.A03 = r0     // Catch:{ RJd | JSONException -> 0x027b }
            java.util.List r0 = r13.A0O     // Catch:{ RJd | JSONException -> 0x027b }
            X.0qQ.A0B(r0, r5)     // Catch:{ RJd | JSONException -> 0x027b }
            X.TLq r7 = X.C13107TLq.A00     // Catch:{ RJd | JSONException -> 0x027b }
            java.util.TreeSet r6 = new java.util.TreeSet     // Catch:{ RJd | JSONException -> 0x027b }
            r6.<init>(r7)     // Catch:{ RJd | JSONException -> 0x027b }
            java.util.Iterator r16 = r0.iterator()     // Catch:{ RJd | JSONException -> 0x027b }
        L_0x0215:
            boolean r0 = r16.hasNext()     // Catch:{ RJd | JSONException -> 0x027b }
            if (r0 == 0) goto L_0x0258
            java.lang.Object r1 = r16.next()     // Catch:{ RJd | JSONException -> 0x027b }
            X.S6z r1 = (X.C11041S6z) r1     // Catch:{ RJd | JSONException -> 0x027b }
            java.io.File r2 = r1.A05     // Catch:{ RJd | JSONException -> 0x027b }
            boolean r0 = r2.exists()     // Catch:{ RJd | JSONException -> 0x027b }
            if (r0 == 0) goto L_0x0215
            boolean r0 = r2.isFile()     // Catch:{ RJd | JSONException -> 0x027b }
            if (r0 == 0) goto L_0x0215
            java.io.File r0 = r1.A05     // Catch:{ RJd | JSONException -> 0x027b }
            r19 = r0
            long r4 = r1.A02     // Catch:{ RJd | JSONException -> 0x027b }
            X.RF9 r0 = r1.A04     // Catch:{ RJd | JSONException -> 0x027b }
            r18 = r0
            int r0 = r1.A00     // Catch:{ RJd | JSONException -> 0x027b }
            r17 = r0
            java.lang.String r14 = r1.A06     // Catch:{ RJd | JSONException -> 0x027b }
            long r2 = r1.A03     // Catch:{ RJd | JSONException -> 0x027b }
            long r0 = r1.A01     // Catch:{ RJd | JSONException -> 0x027b }
            X.SJc r15 = new X.SJc     // Catch:{ RJd | JSONException -> 0x027b }
            r20 = r14
            r21 = r17
            r22 = r4
            r24 = r2
            r26 = r0
            r17 = r15
            r17.<init>(r18, r19, r20, r21, r22, r24, r26)     // Catch:{ RJd | JSONException -> 0x027b }
            r6.add(r15)     // Catch:{ RJd | JSONException -> 0x027b }
            goto L_0x0215
        L_0x0258:
            java.util.TreeSet r2 = new java.util.TreeSet     // Catch:{ RJd | JSONException -> 0x027b }
            r2.<init>(r7)     // Catch:{ RJd | JSONException -> 0x027b }
            r2.addAll(r8)     // Catch:{ RJd | JSONException -> 0x027b }
            int r1 = r6.size()     // Catch:{ RJd | JSONException -> 0x027b }
            int r0 = r2.size()     // Catch:{ RJd | JSONException -> 0x027b }
            if (r1 != r0) goto L_0x0273
            r2.removeAll(r6)     // Catch:{ RJd | JSONException -> 0x027b }
            boolean r0 = r2.isEmpty()     // Catch:{ RJd | JSONException -> 0x027b }
            if (r0 != 0) goto L_0x02a4
        L_0x0273:
            java.lang.Integer r0 = X.AnonymousClass05K.A01     // Catch:{ RJd | JSONException -> 0x027b }
            r13.A03 = r0     // Catch:{ RJd | JSONException -> 0x027b }
            goto L_0x0289
        L_0x0278:
            r0 = move-exception
            monitor-exit(r11)     // Catch:{ RJd | JSONException -> 0x027b }
            throw r0     // Catch:{ RJd | JSONException -> 0x027b }
        L_0x027b:
            r1 = move-exception
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            r13.A03 = r0
            X.RzP r0 = r13.A0F
            X.TdF r0 = r0.A0D
            if (r0 == 0) goto L_0x0289
            r0.Chx(r1, r9, r10)
        L_0x0289:
            r24 = r13
            r25 = r12
            r26 = r31
            r27 = r30
            X.STT r11 = r24.A00(r25, r26, r27, r28, r29)
            java.util.HashMap r0 = r13.A0N
            r0.clear()
            java.util.List r0 = r13.A0P
            r0.clear()
            java.util.List r0 = r13.A0O
            r0.clear()
        L_0x02a4:
            r13.A0I = r11
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12380SsU.<init>(X.Tj9, X.Q0d, X.SOn, X.Rs3, com.facebook.videolite.transcoder.base.composition.MediaComposition, X.RzP, X.SNK, X.REA, X.RR8, X.Thq, java.lang.Integer, java.lang.String, java.util.Map, java.util.concurrent.ExecutorService, int, long, long, boolean, boolean):void");
    }
}
