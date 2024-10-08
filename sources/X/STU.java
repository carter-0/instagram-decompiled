package X;

import android.content.Context;
import com.facebook.videolite.transcoder.base.composition.MediaComposition;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public final class STU {
    public static final String[] A0R = {"post_cap", "post_cap_draft", "post_cap_stories", "reel_memory_share_stories", "mention_reshare_stories", "shoutout_share_stories", "igtv_share_stories", "reels_reshare_stories", "photo_credit_stories"};
    public float A00;
    public float A01;
    public int A02;
    public int A03;
    public C13862Tii A04;
    public C10850RzA A05;
    public C13753TgP A06;
    public C388789oO A07;
    public boolean A08;
    public boolean A09;
    public MediaComposition A0A;
    public final Context A0B;
    public final C13886Tj9 A0C;
    public final C13724Tfu A0D;
    public final C7255Q1d A0E;
    public final C13587TdF A0F;
    public final C10425Rs1 A0G;
    public final AnonymousClass8MA A0H;
    public final C13781Tgw A0I;
    public final C10796RyI A0J;
    public final SJN A0K;
    public final Boolean A0L;
    public final String A0M;
    public final String A0N;
    public final String A0O;
    public final Map A0P;
    public final AnonymousClass0eM A0Q;

    /* JADX WARNING: type inference failed for: r1v1, types: [com.facebook.videolite.transcoder.base.composition.MediaEffect, java.lang.Object, X.Srf] */
    public final void A08(float f) {
        if (f < 0.0f) {
            f = 0.0f;
        } else if (f > 1.0f) {
            f = 1.0f;
        }
        if (Float.compare(f, this.A01) != 0) {
            this.A01 = f;
            if (this.A0K.A0k) {
                C13862Tii tii = this.A04;
                if (tii != null) {
                    C266714aE r2 = C266714aE.AUDIO;
                    ? obj = new Object();
                    obj.A00 = f;
                    if (tii.FKF(r2, obj, "global_volume")) {
                        return;
                    }
                } else {
                    return;
                }
            }
            A04(this, (List) null);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x008d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0A(com.facebook.videolite.transcoder.base.composition.MediaComposition r30, int r31, int r32, int r33, int r34, int r35, boolean r36) {
        /*
            r29 = this;
            r1 = 0
            r5 = r30
            X.0qQ.A0B(r5, r1)
            r2 = r29
            r0 = r36
            r2.A09 = r0
            java.util.HashSet r14 = X.AnonymousClass7TE.A1F()
            X.SJN r4 = r2.A0K
            boolean r0 = r4.A1C
            if (r0 == 0) goto L_0x0029
            boolean r0 = r4.A0G
            if (r0 == 0) goto L_0x0029
            X.4aE r3 = X.C266714aE.AUDIO
            java.lang.String r0 = "video_audio_0"
            int r3 = r5.A02(r3, r0)
            r0 = -1
            if (r3 == r0) goto L_0x0029
            X.AnonymousClass7TF.A1M(r14, r3)
        L_0x0029:
            r8 = 0
            r0 = 1
            com.facebook.videolite.transcoder.base.composition.MediaComposition r10 = r2.A01(r5, r8)
            X.Q4k r13 = r4.A0B
            java.lang.Boolean r3 = r2.A0L
            boolean r20 = X.AnonymousClass7TF.A1Y(r3, r0)
            r11 = 0
            boolean r3 = r4.A0g     // Catch:{ all -> 0x0082 }
            if (r3 == 0) goto L_0x0088
            java.lang.String r6 = r2.A0M     // Catch:{ all -> 0x0082 }
            if (r6 == 0) goto L_0x0088
            java.lang.String[] r7 = A0R     // Catch:{ all -> 0x0082 }
            java.util.Map r5 = r2.A0P     // Catch:{ all -> 0x0082 }
            if (r5 == 0) goto L_0x0080
            java.lang.String r3 = "source_type"
            java.lang.String r3 = X.DbT.A11(r3, r5)     // Catch:{ all -> 0x0082 }
        L_0x004d:
            boolean r3 = X.03t.A0O(r3, r7)     // Catch:{ all -> 0x0082 }
            if (r3 == 0) goto L_0x0088
            java.lang.String r5 = "ig4a_media_accuracy_dyn_sampling"
            boolean r3 = r4.A0h     // Catch:{ all -> 0x0082 }
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch:{ all -> 0x0082 }
            java.util.Map r27 = X.AnonymousClass7TF.A0w(r5, r3)     // Catch:{ all -> 0x0082 }
            android.content.Context r3 = r2.A0B     // Catch:{ all -> 0x0082 }
            java.io.File r24 = r3.getCacheDir()     // Catch:{ all -> 0x0082 }
            X.0qQ.A07(r24)     // Catch:{ all -> 0x0082 }
            java.lang.String r7 = r4.A0D     // Catch:{ all -> 0x0082 }
            X.8MA r5 = r2.A0H     // Catch:{ all -> 0x0082 }
            boolean r4 = r4.A0f     // Catch:{ all -> 0x0082 }
            X.SBa r23 = X.C11121SBa.A00     // Catch:{ all -> 0x0082 }
            X.S2m r3 = new X.S2m     // Catch:{ all -> 0x0082 }
            r21 = r3
            r22 = r5
            r25 = r7
            r26 = r6
            r28 = r4
            r21.<init>(r22, r23, r24, r25, r26, r27, r28)     // Catch:{ all -> 0x0082 }
            goto L_0x0089
        L_0x0080:
            r3 = r11
            goto L_0x004d
        L_0x0082:
            r3 = move-exception
            X.0eQ r3 = X.JTO.A1B(r3)
            goto L_0x0089
        L_0x0088:
            r3 = r11
        L_0x0089:
            boolean r4 = r3 instanceof X.0eQ
            if (r4 != 0) goto L_0x008e
            r11 = r3
        L_0x008e:
            X.S2m r11 = (X.C10954S2m) r11
            X.Rs1 r7 = r2.A0G
            r15 = 3000000(0x2dc6c0, float:4.203895E-39)
            r16 = 5
            X.RzA r6 = new X.RzA
            r19 = r31
            r18 = r32
            r9 = r8
            r12 = r8
            r21 = r0
            r17 = r1
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            r2.A05 = r6
            com.facebook.videolite.transcoder.base.composition.MediaComposition r0 = r6.A09
            r2.A0A = r0
            r0 = r33
            r2.A03 = r0
            r0 = r34
            r2.A02 = r0
            r0 = r35
            A03(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.STU.A0A(com.facebook.videolite.transcoder.base.composition.MediaComposition, int, int, int, int, int, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0037, code lost:
        if (X.0qQ.A0K(r7.A01(), "") != false) goto L_0x0039;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final X.C13588TdG A00() {
        /*
            r10 = this;
            X.SJN r6 = r10.A0K
            boolean r0 = r6.A1E
            if (r0 == 0) goto L_0x00c0
            X.SrE r5 = new X.SrE
            r5.<init>()
        L_0x000b:
            X.TdG r5 = (X.C13588TdG) r5
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1C()
            boolean r0 = r6.A1C
            if (r0 == 0) goto L_0x007d
            X.S7P r7 = r6.A0A
            r2 = r7
            boolean r0 = r7.A03()
            r9 = 0
            if (r0 == 0) goto L_0x0039
            boolean r0 = r7 instanceof X.QM3
            if (r0 == 0) goto L_0x0039
            r0 = r7
            X.QM3 r0 = (X.QM3) r0
            X.SJN r0 = r0.A00
            boolean r0 = r0.A0K
            if (r0 == 0) goto L_0x0039
            java.lang.String r1 = r7.A01()
            java.lang.String r0 = ""
            boolean r1 = X.0qQ.A0K(r1, r0)
            r0 = 1
            if (r1 == 0) goto L_0x003a
        L_0x0039:
            r0 = 0
        L_0x003a:
            r8 = 0
            if (r0 == 0) goto L_0x0095
            java.lang.String r1 = r7.A01()
            X.SrP r0 = new X.SrP
            r0.<init>(r1)
            r4.add(r0)
            X.Tj9 r3 = r10.A0C
            java.lang.String r2 = r10.A0O
            java.util.Map r0 = r10.A02()
            X.RrP r1 = new X.RrP
            r1.<init>(r3, r2, r0)
            X.SrQ r0 = new X.SrQ
            r0.<init>(r7, r1)
            r4.add(r0)
            X.RrP r7 = new X.RrP
            r7.<init>(r3, r2, r8)
            java.lang.String r1 = "VVP ML"
        L_0x0065:
            java.lang.String r0 = "error_code"
            java.util.HashMap r3 = X.DbY.A0m(r0, r1)
            java.lang.String r2 = "cvat_ae_error"
            java.util.HashMap r0 = r7.A01
            java.util.HashMap r1 = X.Pxe.A19(r0)
            r1.putAll(r3)
            X.Tj9 r0 = r7.A00
            if (r0 == 0) goto L_0x007d
            r0.logEvent(r2, r1)
        L_0x007d:
            boolean r0 = r6.A1D
            if (r0 == 0) goto L_0x0089
            X.SrN r0 = new X.SrN
            r0.<init>()
            r4.add(r0)
        L_0x0089:
            boolean r0 = X.DbT.A1b(r4)
            if (r0 == 0) goto L_0x00c7
            X.SrF r0 = new X.SrF
            r0.<init>(r5, r4)
            return r0
        L_0x0095:
            boolean r0 = r7.A03()
            if (r0 == 0) goto L_0x00a1
            r9 = 1
            X.QM2 r7 = new X.QM2
            r7.<init>(r2)
        L_0x00a1:
            X.Tj9 r3 = r10.A0C
            java.lang.String r2 = r10.A0O
            java.util.Map r0 = r10.A02()
            X.RrP r1 = new X.RrP
            r1.<init>(r3, r2, r0)
            X.SrQ r0 = new X.SrQ
            r0.<init>(r7, r1)
            r4.add(r0)
            if (r9 == 0) goto L_0x007d
            X.RrP r7 = new X.RrP
            r7.<init>(r3, r2, r8)
            java.lang.String r1 = "VVP DSP Fallback"
            goto L_0x0065
        L_0x00c0:
            X.SrO r5 = new X.SrO
            r5.<init>()
            goto L_0x000b
        L_0x00c7:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.STU.A00():X.TdG");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.facebook.videolite.transcoder.base.composition.MediaEffect, java.lang.Object, X.Srf] */
    /* JADX WARNING: type inference failed for: r0v8, types: [com.facebook.videolite.transcoder.base.composition.MediaEffect, java.lang.Object, X.8Yx] */
    /* JADX WARNING: type inference failed for: r0v38, types: [com.facebook.videolite.transcoder.base.composition.MediaEffect, java.lang.Object, X.Srf] */
    private final MediaComposition A01(MediaComposition mediaComposition, List list) {
        boolean A0d;
        MediaComposition mediaComposition2 = mediaComposition;
        C266824aP A032 = mediaComposition2.A03();
        C266714aE r3 = C266714aE.AUDIO;
        List A1B = Pxe.A1B(r3, mediaComposition2.A00);
        if (A1B != null) {
            ArrayList A1C = AnonymousClass7TE.A1C();
            for (Object next : A1B) {
                if (((SIO) next).A01 instanceof C12333Srf) {
                    A1C.add(next);
                }
            }
            Iterator it = A1C.iterator();
            while (it.hasNext()) {
                Object next2 = it.next();
                List A1B2 = Pxe.A1B(r3, A032.A00);
                if (A1B2 != null) {
                    A1B2.remove(next2);
                }
                0KC.A0D("VirtualVideoPlayerWrapper", "A global volume effect was already applied");
            }
        }
        SJN sjn = this.A0K;
        boolean z = sjn.A0k;
        float f = this.A01;
        ? obj = new Object();
        obj.A00 = f;
        if (z) {
            A032.A02(new C266724aF(TimeUnit.MILLISECONDS, -1, -1), r3, obj, "global_volume");
        } else {
            A032.A03(r3, obj);
        }
        if (list != null) {
            Map map = (Map) A032.A02.get(r3);
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                0eP r9 = (0eP) it2.next();
                String str = (String) r9.A00;
                if (str.length() != 0) {
                    LinkedHashSet A0y = DbS.A0y();
                    if (map != null) {
                        Iterator A0u = AnonymousClass7TF.A0u(map);
                        while (A0u.hasNext()) {
                            Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
                            boolean A1a = C66580MXl.A1a("video_audio_", 1, str);
                            String str2 = ((C266794aM) A1J.getValue()).A02;
                            if (A1a) {
                                0qQ.A07(str2);
                                if (C66580MXl.A1a("video_audio_", 1, str2)) {
                                    String str3 = ((C266794aM) A1J.getValue()).A02;
                                    0qQ.A07(str3);
                                    if (00l.A0K(str3, str, str3).length() != 0) {
                                        String str4 = ((C266794aM) A1J.getValue()).A02;
                                        0qQ.A07(str4);
                                        A0d = 00l.A0Z(00l.A0K(str4, str, str4), '_');
                                    }
                                    Object key = A1J.getKey();
                                    0qQ.A07(key);
                                    A0y.add(key);
                                }
                            } else {
                                0qQ.A07(str2);
                                A0d = 00l.A0d(str2, str, false);
                            }
                            if (!A0d) {
                            }
                            Object key2 = A1J.getKey();
                            0qQ.A07(key2);
                            A0y.add(key2);
                        }
                    }
                    Iterator it3 = A0y.iterator();
                    while (it3.hasNext()) {
                        int A0F2 = AnonymousClass7TG.A0F(it3);
                        if (map != null) {
                            Integer valueOf = Integer.valueOf(A0F2);
                            C266794aM r0 = (C266794aM) map.get(valueOf);
                            if (r0 != null) {
                                C266764aJ A002 = r0.A00();
                                List<SIO> list2 = A002.A05;
                                for (SIO sio : list2) {
                                    if (sio.A01 instanceof C12333Srf) {
                                        list2.remove(sio);
                                        C266724aF r4 = sio.A00;
                                        float A042 = AnonymousClass7TE.A04(r9.A01);
                                        ? obj2 = new Object();
                                        obj2.A00 = A042;
                                        SIO.A00(r4, obj2, A002);
                                        map.put(valueOf, new C266794aM(A002));
                                    }
                                }
                                throw new NoSuchElementException(AnonymousClass000.A00(3));
                            }
                            continue;
                        }
                    }
                    continue;
                }
            }
        }
        if (sjn.A1C && this.A00 != -1.0f) {
            C266724aF r42 = new C266724aF(TimeUnit.MILLISECONDS, -1, -1);
            float f2 = this.A00;
            ? obj3 = new Object();
            obj3.A00 = f2;
            SIO sio2 = new SIO(r42, obj3);
            AbstractMap abstractMap = (AbstractMap) A032.A02.get(r3);
            if (abstractMap != null) {
                Iterator A0s = AnonymousClass7TF.A0s(abstractMap);
                while (A0s.hasNext()) {
                    Map.Entry A1J2 = AnonymousClass7TE.A1J(A0s);
                    C266794aM r02 = (C266794aM) A1J2.getValue();
                    0qQ.A0B(r02, 0);
                    String str5 = r02.A02;
                    0qQ.A07(str5);
                    if (00l.A0d(str5, "video_audio_", false)) {
                        Object key3 = A1J2.getKey();
                        C266794aM r03 = (C266794aM) A1J2.getValue();
                        C266764aJ A003 = r03.A00();
                        for (SIO sio3 : r03.A05) {
                            if (sio3.A01.getClass().equals(sio2.A01.getClass())) {
                                A003.A05.remove(sio3);
                                A003.A03(sio2);
                            }
                        }
                        abstractMap.put(key3, new C266794aM(A003));
                    }
                }
            }
        }
        return new MediaComposition(A032);
    }

    private final Map A02() {
        int i;
        int A022;
        C10850RzA rzA = this.A05;
        if (rzA != null) {
            MediaComposition mediaComposition = rzA.A09;
            HashSet A1F = AnonymousClass7TE.A1F();
            SJN sjn = this.A0K;
            if (sjn.A1C && sjn.A0G && (A022 = mediaComposition.A02(C266714aE.AUDIO, "video_audio_0")) != -1) {
                AnonymousClass7TF.A1M(A1F, A022);
            }
            Number number = (Number) 00k.A0A(A1F);
            if (number != null) {
                C266794aM A042 = mediaComposition.A04(C266714aE.AUDIO, number.intValue());
                if (A042 != null) {
                    long A012 = Q1Z.A01(new SrT(this.A0B, C9955RkA.A00), A042);
                    if (Long.valueOf(A012) != null) {
                        Map map = this.A0P;
                        if (map != null) {
                            i = map.size();
                        } else {
                            i = 0;
                        }
                        0Ym r2 = new 0Ym(i + 1);
                        r2.put("video_duration", String.valueOf(TimeUnit.MICROSECONDS.toMillis(A012)));
                        if (map != null) {
                            r2.putAll(map);
                        }
                        return 0se.A0N(r2);
                    }
                } else {
                    throw AnonymousClass7TE.A0y();
                }
            }
        }
        return null;
    }

    /* JADX WARNING: type inference failed for: r25v0, types: [X.ThT, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v11 */
    /* JADX WARNING: type inference failed for: r22v1, types: [X.ThT, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r15v3, types: [X.Ss2] */
    /* JADX WARNING: type inference failed for: r12v11, types: [X.Ss3] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A03(X.STU r34, int r35) {
        /*
            r9 = r34
            X.RyI r7 = r9.A0J
            boolean r0 = r7 instanceof X.Qe6
            if (r0 != 0) goto L_0x001b
            boolean r0 = r7 instanceof X.Qe7
            if (r0 == 0) goto L_0x001b
            r0 = r7
            X.Qe7 r0 = (X.Qe7) r0
            android.view.TextureView r0 = r0.A00
            android.graphics.SurfaceTexture r0 = r0.getSurfaceTexture()
            boolean r0 = X.AnonymousClass7TF.A1V(r0)
            if (r0 == 0) goto L_0x0059
        L_0x001b:
            X.RzA r0 = r9.A05
            r6 = 0
            if (r0 == 0) goto L_0x0059
            com.facebook.videolite.transcoder.base.composition.MediaComposition r0 = r0.A09
            com.facebook.videolite.transcoder.base.composition.MediaComposition r5 = r9.A01(r0, r6)
            X.Tii r10 = r9.A04
            r8 = r35
            if (r10 == 0) goto L_0x005e
            r10.ETy(r6)
            boolean r0 = r9.A09
            r10.Eka(r0)
            if (r35 < 0) goto L_0x005a
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r0 = (long) r8
            long r0 = r2.toNanos(r0)
            r10.FKl(r5, r0)
        L_0x0040:
            int r2 = r9.A03
            r1 = -1
            if (r2 != r1) goto L_0x0049
            int r0 = r9.A02
            if (r0 == r1) goto L_0x0056
        L_0x0049:
            long r3 = (long) r2
            int r0 = r9.A02
            long r1 = (long) r0
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
            X.4aF r0 = X.Pxe.A0V(r0, r3, r1)
            r10.Efv(r0)
        L_0x0056:
            r9.A06()
        L_0x0059:
            return
        L_0x005a:
            r10.FKk(r5)
            goto L_0x0040
        L_0x005e:
            X.SJN r0 = r9.A0K
            boolean r1 = r0.A0x
            java.lang.String r13 = "Required value was null."
            if (r1 == 0) goto L_0x0135
            android.content.Context r11 = r9.A0B
            java.lang.String r1 = r9.A0O
            r27 = r1
            X.Q0h r1 = X.C9955RkA.A00
            X.SrT r10 = new X.SrT
            r10.<init>(r11, r1)
            X.Srk r20 = new X.Srk
            r20.<init>()
            boolean r1 = r0.A0Z
            if (r1 == 0) goto L_0x012e
            X.Q4k r1 = r0.A0B
            X.Srm r4 = new X.Srm
            r4.<init>(r11, r1)
        L_0x0083:
            X.Tgv r4 = (X.C13780Tgv) r4
            X.Q1f r2 = new X.Q1f
            r2.<init>()
            X.Tgw r1 = r9.A0I
            X.SsN r3 = new X.SsN
            r3.<init>(r2, r1)
            X.RzA r2 = r9.A05
            if (r2 == 0) goto L_0x01ab
            X.Q1d r1 = r9.A0E
            r35 = r1
            X.0eM r1 = r9.A0Q
            java.lang.Object r1 = r1.getValue()
            java.io.File r1 = (java.io.File) r1
            X.Sru r22 = new X.Sru
            r22.<init>()
            X.TdG r18 = r9.A00()
            X.Tj9 r12 = r9.A0C
            r34 = r12
            java.util.Map r12 = r9.A0P
            r21 = r12
            X.Tfu r12 = r9.A0D
            r19 = r12
            X.TdF r12 = r9.A0F
            r17 = r12
            java.lang.String r12 = r9.A0N
            r16 = r12
            long r14 = r0.A09
            long r12 = r0.A08
            X.Ss3 r0 = new X.Ss3
            r23 = r7
            r24 = r2
            r25 = r3
            r26 = r1
            r28 = r16
            r29 = r21
            r30 = r14
            r32 = r12
            r12 = r0
            r13 = r11
            r14 = r34
            r15 = r19
            r16 = r35
            r19 = r10
            r21 = r4
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r32)
        L_0x00e3:
            X.Tii r0 = (X.C13862Tii) r0
            r0.APK()
            r0.ETy(r6)
            boolean r1 = r9.A09
            r0.Eka(r1)
            X.SsE r1 = new X.SsE
            r1.<init>(r9)
            r0.Eg3(r1)
            X.Rpq r3 = new X.Rpq
            r3.<init>(r9)
            r1 = 50
            r0.Eg0(r3, r1)
            X.AVt r1 = new X.AVt
            r1.<init>(r0, r9)
            r0.Efy(r1)
            if (r8 < 0) goto L_0x012a
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r1 = (long) r8
            long r1 = r3.toNanos(r1)
            r0.E3v(r1)
        L_0x0116:
            int r1 = r9.A03
            long r3 = (long) r1
            int r1 = r9.A02
            long r1 = (long) r1
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.MILLISECONDS
            X.4aF r1 = X.Pxe.A0V(r6, r3, r1)
            r0.Efv(r1)
            r9.A04 = r0
            r9.A0A = r5
            return
        L_0x012a:
            r0.E3m()
            goto L_0x0116
        L_0x012e:
            X.Q4U r4 = new X.Q4U
            r4.<init>()
            goto L_0x0083
        L_0x0135:
            android.content.Context r11 = r9.A0B
            java.lang.String r1 = r9.A0O
            r16 = r1
            X.Q0h r1 = X.C9955RkA.A00
            X.SrT r10 = new X.SrT
            r10.<init>(r11, r1)
            X.Srk r23 = new X.Srk
            r23.<init>()
            boolean r1 = r0.A0Z
            if (r1 == 0) goto L_0x01a5
            X.Q4k r0 = r0.A0B
            X.Srm r12 = new X.Srm
            r12.<init>(r11, r0)
        L_0x0152:
            X.Tgv r12 = (X.C13780Tgv) r12
            X.Q1f r1 = new X.Q1f
            r1.<init>()
            X.Tgw r0 = r9.A0I
            X.SsN r4 = new X.SsN
            r4.<init>(r1, r0)
            X.RzA r3 = r9.A05
            if (r3 == 0) goto L_0x01b0
            X.Q1d r0 = r9.A0E
            r19 = r0
            X.0eM r0 = r9.A0Q
            java.lang.Object r2 = r0.getValue()
            java.io.File r2 = (java.io.File) r2
            X.Sru r25 = new X.Sru
            r25.<init>()
            X.TdG r21 = r9.A00()
            X.Tj9 r0 = r9.A0C
            r17 = r0
            java.util.Map r15 = r9.A0P
            X.Tfu r14 = r9.A0D
            X.TdF r13 = r9.A0F
            java.lang.String r1 = r9.A0N
            X.Ss2 r0 = new X.Ss2
            r26 = r7
            r27 = r3
            r28 = r4
            r29 = r2
            r30 = r16
            r31 = r1
            r32 = r15
            r15 = r0
            r16 = r11
            r18 = r14
            r20 = r13
            r22 = r10
            r24 = r12
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            goto L_0x00e3
        L_0x01a5:
            X.Q4U r12 = new X.Q4U
            r12.<init>()
            goto L_0x0152
        L_0x01ab:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r13)
            throw r0
        L_0x01b0:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r13)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.STU.A03(X.STU, int):void");
    }

    public static final void A04(STU stu, List list) {
        C13862Tii tii = stu.A04;
        MediaComposition mediaComposition = stu.A0A;
        if (tii != null && mediaComposition != null) {
            MediaComposition A012 = stu.A01(mediaComposition, list);
            if (C9602Rdg.A00(mediaComposition, A012)) {
                C266714aE r0 = C266714aE.AUDIO;
                if (!(!mediaComposition.A06(r0).equals(A012.A06(r0)))) {
                    return;
                }
            }
            tii.FKk(A012);
            stu.A0A = A012;
        }
    }

    public final void A05() {
        C13862Tii tii = this.A04;
        if (tii != null) {
            tii.pause();
            C13753TgP tgP = this.A06;
            if (tgP != null) {
                tgP.DXi((C390949s6) null, C390949s6.PAUSED);
            }
        }
    }

    public final void A06() {
        boolean z;
        C10796RyI ryI = this.A0J;
        if ((ryI instanceof Qe6) || !(ryI instanceof Qe7) || AnonymousClass7TF.A1V(((Qe7) ryI).A00.getSurfaceTexture())) {
            C13862Tii tii = this.A04;
            if (tii != null) {
                tii.E2p();
                C13753TgP tgP = this.A06;
                if (tgP != null) {
                    tgP.DXi((C390949s6) null, C390949s6.PLAYING);
                }
                z = false;
            } else {
                return;
            }
        } else {
            z = true;
        }
        this.A08 = z;
    }

    public final void A07() {
        C13862Tii tii = this.A04;
        if (tii != null) {
            tii.release();
        }
        this.A04 = null;
    }

    public final void A09(int i) {
        C13862Tii tii = this.A04;
        if (tii != null) {
            tii.EKz(TimeUnit.MILLISECONDS.toNanos((long) i));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: X.Tfu} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: X.Q1d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: X.Tfu} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: X.Q1d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: X.Q1d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: X.Tfu} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ STU(android.content.Context r99, X.C13886Tj9 r100, X.C13724Tfu r101, X.C7255Q1d r102, X.C13587TdF r103, X.C10425Rs1 r104, X.AnonymousClass8MA r105, X.C13781Tgw r106, X.SJN r107, X.C62736Kla r108, java.lang.String r109, java.lang.String r110, java.lang.String r111, java.util.Map r112, int r113) {
        /*
            r98 = this;
            r97 = r100
            r1 = r113
            r11 = r104
            r0 = r109
            r2 = r108
            r6 = r101
            r8 = r111
            r5 = r107
            r7 = r112
            r10 = r105
            r9 = r110
            r12 = r103
            r4 = r102
            r3 = 0
            r16 = 0
            r13 = r113 & 8
            if (r13 == 0) goto L_0x0023
            r97 = r3
        L_0x0023:
            r13 = r113 & 16
            if (r13 == 0) goto L_0x0028
            r11 = r3
        L_0x0028:
            r13 = r113 & 32
            if (r13 == 0) goto L_0x0030
            java.lang.String r0 = X.AnonymousClass7TF.A0b()
        L_0x0030:
            r13 = r113 & 64
            if (r13 == 0) goto L_0x0039
            X.Sr5 r6 = new X.Sr5
            r6.<init>()
        L_0x0039:
            r13 = r1 & 256(0x100, float:3.59E-43)
            if (r13 == 0) goto L_0x00da
            X.SJN r5 = new X.SJN
            r39 = 1
            r34 = 0
            r20 = 5
            java.lang.String r18 = ""
            r21 = 5000(0x1388, float:7.006E-42)
            r22 = -1
            java.lang.String r19 = "0"
            r26 = -1
            r28 = 0
            r32 = 10
            r23 = r22
            r24 = r22
            r25 = r22
            r30 = r28
            r35 = r34
            r36 = r34
            r37 = r34
            r38 = r34
            r40 = r39
            r41 = r39
            r42 = r34
            r43 = r34
            r44 = r34
            r45 = r34
            r46 = r34
            r47 = r34
            r48 = r34
            r49 = r34
            r50 = r34
            r51 = r34
            r52 = r34
            r53 = r34
            r54 = r34
            r55 = r34
            r56 = r34
            r57 = r34
            r58 = r34
            r59 = r34
            r60 = r34
            r61 = r34
            r62 = r34
            r63 = r34
            r64 = r34
            r65 = r34
            r66 = r34
            r67 = r34
            r68 = r34
            r69 = r34
            r70 = r34
            r71 = r34
            r72 = r34
            r73 = r34
            r74 = r34
            r75 = r34
            r76 = r34
            r77 = r34
            r78 = r34
            r79 = r34
            r80 = r34
            r81 = r34
            r82 = r34
            r83 = r34
            r84 = r34
            r85 = r34
            r86 = r34
            r87 = r34
            r88 = r34
            r89 = r34
            r90 = r34
            r91 = r34
            r92 = r34
            r93 = r34
            r94 = r34
            r95 = r34
            r96 = r34
            r17 = r5
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r28, r30, r32, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72, r73, r74, r75, r76, r77, r78, r79, r80, r81, r82, r83, r84, r85, r86, r87, r88, r89, r90, r91, r92, r93, r94, r95, r96)
        L_0x00da:
            r13 = r1 & 512(0x200, float:7.175E-43)
            r14 = r99
            if (r13 == 0) goto L_0x0192
            r15 = 27
            X.Wvs r13 = new X.Wvs
            r13.<init>(r14, r15)
            X.0t0 r13 = X.AnonymousClass0eN.A01(r13)
        L_0x00eb:
            r15 = r1 & 1024(0x400, float:1.435E-42)
            if (r15 == 0) goto L_0x00f3
            java.lang.Boolean r3 = X.AnonymousClass7TE.A0u()
        L_0x00f3:
            r15 = r1 & 2048(0x800, float:2.87E-42)
            if (r15 == 0) goto L_0x00f9
            r7 = r16
        L_0x00f9:
            r15 = r1 & 4096(0x1000, float:5.74E-42)
            if (r15 == 0) goto L_0x00ff
            r12 = r16
        L_0x00ff:
            r15 = r1 & 8192(0x2000, float:1.14794E-41)
            if (r15 == 0) goto L_0x0105
            r10 = r16
        L_0x0105:
            r15 = r1 & 16384(0x4000, float:2.2959E-41)
            if (r15 == 0) goto L_0x010b
            r9 = r16
        L_0x010b:
            r15 = 32768(0x8000, float:4.5918E-41)
            r15 = r15 & r113
            if (r15 == 0) goto L_0x0114
            r8 = r16
        L_0x0114:
            r15 = 65536(0x10000, float:9.18355E-41)
            r1 = r113 & r15
            if (r1 == 0) goto L_0x011f
            X.Q1d r4 = new X.Q1d
            r4.<init>()
        L_0x011f:
            r1 = 1
            r15 = 6
            X.C51969G9p.A1N(r0, r15, r13)
            r15 = r98
            r15.<init>()
            r15.A0B = r14
            r14 = r106
            r15.A0I = r14
            r14 = r97
            r15.A0C = r14
            r15.A0G = r11
            r15.A0O = r0
            r15.A0D = r6
            r15.A0K = r5
            r15.A0Q = r13
            r15.A0L = r3
            r15.A0P = r7
            r15.A0F = r12
            r15.A0H = r10
            r15.A0N = r9
            r15.A0M = r8
            r15.A0E = r4
            boolean r0 = r2 instanceof X.C8775R9b
            if (r0 == 0) goto L_0x0176
            X.ALu r0 = new X.ALu
            r0.<init>(r15, r1)
            X.R9b r2 = (X.C8775R9b) r2
            android.view.TextureView r4 = r2.A00
            r4.setSurfaceTextureListener(r0)
            boolean r3 = r2.A02
            boolean r0 = r2.A01
            X.Qe7 r2 = new X.Qe7
            r2.<init>(r4, r3, r0)
        L_0x0164:
            r15.A0J = r2
            r0 = -1
            r15.A03 = r0
            r15.A02 = r0
            r15.A09 = r1
            r0 = 1065353216(0x3f800000, float:1.0)
            r15.A01 = r0
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r15.A00 = r0
            return
        L_0x0176:
            boolean r0 = r2 instanceof X.C61518KAx
            if (r0 == 0) goto L_0x0184
            X.KAx r2 = (X.C61518KAx) r2
            android.graphics.SurfaceTexture r0 = r2.A00
            X.Qe8 r2 = new X.Qe8
            r2.<init>(r0)
            goto L_0x0164
        L_0x0184:
            boolean r0 = r2 instanceof X.C385559jA
            if (r0 == 0) goto L_0x0195
            X.9jA r2 = (X.C385559jA) r2
            android.view.Surface r0 = r2.A00
            X.Qe6 r2 = new X.Qe6
            r2.<init>(r0)
            goto L_0x0164
        L_0x0192:
            r13 = r3
            goto L_0x00eb
        L_0x0195:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.STU.<init>(android.content.Context, X.Tj9, X.Tfu, X.Q1d, X.TdF, X.Rs1, X.8MA, X.Tgw, X.SJN, X.Kla, java.lang.String, java.lang.String, java.lang.String, java.util.Map, int):void");
    }
}
