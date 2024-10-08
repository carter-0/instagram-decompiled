package X;

import android.content.Context;
import android.os.SystemClock;
import com.facebook.common.time.RealtimeSinceBootClock;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;
import com.instagram.model.mediatype.ProductType;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import org.webrtc.MediaStreamTrack;

/* renamed from: X.4MD  reason: invalid class name */
public final class AnonymousClass4MD implements AnonymousClass4ME {
    public int A00;
    public Boolean A01;
    public Boolean A02 = Boolean.valueOf(0tS.A00().A0X());
    public String A03;
    public AnonymousClass4MB A04;
    public C263844No A05;
    public String A06;
    public final Context A07;
    public final UserSession A08;
    public final C252323ov A09;
    public final 2Bq A0A;
    public final 1Cd A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;

    private String A02(C263844No r4) {
        if (r4 == null) {
            return null;
        }
        if (!this.A0E) {
            AnonymousClass3WR r1 = r4.A04;
            if (r1 == null || r4.A0B == null) {
                return null;
            }
            return r1.A0G;
        } else if (r4.A02 == 1iA.A09) {
            return r4.A06;
        } else {
            return r4.A0B;
        }
    }

    public final void EG5(C257183wz r1, Object obj) {
    }

    public final void EH0(Object obj, int i) {
    }

    public final void EH4(C263834Nn r13, Object obj, String str) {
        String str2;
        1Cd r0;
        String str3 = str;
        if (obj != null) {
            C252323ov r1 = this.A09;
            C263844No A072 = r1.A07(obj);
            this.A05 = A072;
            this.A01 = null;
            this.A00 = 1;
            if ((r1 instanceof C263914Nv) && ((C263914Nv) r1).A0H.Cau()) {
                str3 = "cobroadcast_finish";
            }
            UserSession userSession = this.A08;
            0qQ.A0B(userSession, 1);
            C263934Nx r10 = new C263934Nx(userSession);
            AnonymousClass4DU r9 = r1.A00;
            C263954Nz r6 = new C263954Nz(this.A07, userSession, r9, r10, "video_should_start");
            r6.A0A = r13.A06;
            r6.A15 = str3;
            r6.A1F = r1.A09();
            r6.A0m = r1.A02();
            r6.A0M = this.A00;
            r6.A0b = r13.A0H;
            if (A072 != null) {
                r6.A01(A072);
            }
            A03(r6, r1, A072, r10);
            String A022 = A02(A072);
            if (!(A022 == null || (r0 = this.A0B) == null)) {
                r0.A0q(A022, str3);
            }
            if (A072 != null && A072.A04 != null && (str2 = A072.A0B) != null) {
                this.A0A.A03.A00(A072, str2, str3, r1.A09(), r9.getModuleName(), r13.A05);
            }
        }
    }

    public static int A00(C263834Nn r3, C263844No r4) {
        1iA r2 = r4.A02;
        1iA r0 = 1iA.A0L;
        int i = r3.A05;
        if (r2 != r0) {
            return Math.min(i, r3.A06);
        }
        return i;
    }

    private C263844No A01(Object obj) {
        if (obj != null) {
            return this.A09.A07(obj);
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002c, code lost:
        if (r0 != false) goto L_0x002e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A03(X.C263954Nz r5, X.C252323ov r6, X.C263844No r7, X.C263934Nx r8) {
        /*
            r4 = this;
            java.lang.Boolean r0 = r4.A02
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x002e
            if (r7 == 0) goto L_0x004e
            boolean r0 = r7.A0P
            if (r0 != 0) goto L_0x0052
            X.1iA r1 = r7.A02
            X.1iA r0 = X.1iA.A0L
            if (r1 != r0) goto L_0x004f
            java.lang.String r1 = r5.A1Q
            java.lang.String r0 = "video_viewed"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x002e
            java.lang.String r0 = "video_paused"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x002e
            java.lang.String r0 = "video_playing_update"
            boolean r0 = r1.equals(r0)
        L_0x002c:
            if (r0 == 0) goto L_0x0052
        L_0x002e:
            r5.A00(r6)
            com.instagram.common.session.UserSession r2 = r4.A08
            X.3ov r1 = r4.A09
            r0 = 2
            X.0qQ.A0B(r2, r0)
            X.0kM r3 = new X.0kM
            r3.<init>(r2)
            X.4DU r0 = r1.A00
            r3.A00 = r0
            X.0kJ r0 = X.0kJ.A05
            r3.A01(r0)
        L_0x0047:
            X.0wc r0 = r3.A00()
            r8.A00(r0)
        L_0x004e:
            return
        L_0x004f:
            boolean r0 = r7.A0Q
            goto L_0x002c
        L_0x0052:
            r5.A00(r6)
            com.instagram.common.session.UserSession r2 = r4.A08
            X.3ov r1 = r4.A09
            r0 = 2
            X.0qQ.A0B(r2, r0)
            X.0kM r3 = new X.0kM
            r3.<init>(r2)
            X.4DU r0 = r1.A00
            r3.A00 = r0
            goto L_0x0047
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4MD.A03(X.4Nz, X.3ov, X.4No, X.4Nx):void");
    }

    public final void EFa(C291485hN r47) {
        C69852Bz r4 = this.A0A.A06;
        2By r10 = r4.A03;
        C291485hN r5 = r47;
        if (r10.A00()) {
            long now = RealtimeSinceBootClock.A00.now();
            2Bs r24 = 2Bq.A0D;
            String str = r5.A0Q;
            int hashCode = str.hashCode();
            02m r0 = r4.A02;
            02m r44 = r0;
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            r0.markerStart(28180481, hashCode, now, timeUnit);
            HashMap hashMap = new HashMap();
            hashMap.put("time_ms", String.valueOf(r5.A0E));
            hashMap.put("video_id", 2Bs.A00(str));
            hashMap.put("ig_video_id", str);
            long j = r5.A0B;
            hashMap.put("player_id", String.valueOf(j));
            String str2 = r5.A0R;
            String str3 = str2;
            hashMap.put("vp_session_id", str2);
            hashMap.put("is_live", Boolean.toString(r5.A0T));
            hashMap.put("video_position_ms", String.valueOf(r5.A0F));
            hashMap.put("buffer_duration_ms", String.valueOf(r5.A0A));
            hashMap.put("segment_start_ms", String.valueOf(r5.A0D));
            hashMap.put("segment_duration_ms", String.valueOf(r5.A0C));
            String valueOf = String.valueOf(r5.A08);
            hashMap.put("bandwidth_estimate", valueOf);
            hashMap.put("current_bitrate", String.valueOf(r5.A05));
            hashMap.put("next_bitrate", String.valueOf(r5.A07));
            hashMap.put("constraint_bitrate", String.valueOf(r5.A03));
            hashMap.put("decision_reasons", r5.A0K);
            hashMap.put("decision_reason_details", r5.A0J);
            hashMap.put("constraint_width", String.valueOf(r5.A04));
            hashMap.put("constraint_reasons", r5.A0H);
            hashMap.put("format_bandwidth_estimate", r5.A0M);
            hashMap.put("is_prefetch", Boolean.toString(r5.A0U));
            String bool = Boolean.toString(false);
            hashMap.put("is_buffer_falling", bool);
            hashMap.put("bandwidth_confidence_pct", String.valueOf(r5.A02));
            hashMap.put("bandwidth_estimate_confidence_based", String.valueOf(r5.A09));
            hashMap.put("min_viewport_dimension", String.valueOf(r5.A06));
            hashMap.put("format_mos", String.valueOf(r5.A00));
            hashMap.put("player_origin", r5.A0P);
            hashMap.put("is_audio", Boolean.toString(r5.A0S));
            hashMap.put("is_wifi", Boolean.toString(r5.A0V));
            String str4 = r5.A0I;
            if (str4 != null) {
                hashMap.put("current_quality_label", str4);
            }
            String str5 = r5.A0O;
            if (str5 != null) {
                hashMap.put("next_quality_label", str5);
            }
            String str6 = r5.A0N;
            if (str6 != null) {
                hashMap.put("highest_quality_label_from_manifest", str6);
            }
            String str7 = r5.A0G;
            if (str7 != null) {
                hashMap.put("constraint_quality_label", str7);
            }
            hashMap.put("data_connection_quality", "UNKNOWN");
            String str8 = r5.A0L;
            if (str8 != null) {
                hashMap.put("encoding_tag", str8);
            }
            hashMap.put("kbps_estimate", valueOf);
            hashMap.put("playback_speed", String.valueOf(r5.A01));
            r24.A03(28180481, hashCode, hashMap);
            r44.markerEnd(28180481, hashCode, 2, now, timeUnit);
            if (r10.A00() && !str.equals(r4.A00)) {
                r4.A00 = str;
                C291475hM[] r11 = r5.A0W;
                if (r11 != null) {
                    for (C291475hM r02 : r11) {
                        int hashCode2 = 002.A0R(str, r02.A08).hashCode();
                        r44.markerStart(28180484, hashCode2, now, timeUnit);
                        String str9 = r02.A08;
                        String A002 = 2Bs.A00(str);
                        int i = r02.A00;
                        int i2 = r02.A03;
                        int i3 = r02.A02;
                        boolean z = r02.A0F;
                        boolean z2 = r02.A0G;
                        boolean z3 = r02.A0E;
                        boolean z4 = r02.A0D;
                        boolean z5 = r02.A0C;
                        boolean z6 = r02.A0B;
                        boolean z7 = r02.A0A;
                        boolean z8 = r02.A09;
                        String str10 = r02.A07;
                        String str11 = r02.A05;
                        String str12 = r02.A06;
                        String str13 = r02.A04;
                        int i4 = r02.A01;
                        HashMap hashMap2 = new HashMap();
                        boolean endsWith = str9.endsWith("vd");
                        hashMap2.put("is_audio", bool);
                        hashMap2.put("time_ms", Long.toString(System.currentTimeMillis()));
                        hashMap2.put("video_id", A002);
                        hashMap2.put("format_id", str9);
                        hashMap2.put(TraceFieldType.Bitrate, Integer.toString(i));
                        hashMap2.put(IgReactMediaPickerNativeModule.WIDTH, Integer.toString(i2));
                        hashMap2.put(IgReactMediaPickerNativeModule.HEIGHT, Integer.toString(i3));
                        hashMap2.put(GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT, Boolean.toString(endsWith));
                        hashMap2.put("fb_max_bandwidth", Integer.toString(i4));
                        hashMap2.put("hvq_landscape", Boolean.toString(z));
                        hashMap2.put("hvq_portrait", Boolean.toString(z2));
                        hashMap2.put("avoid_on_cell", Boolean.toString(z3));
                        hashMap2.put("avoid_on_cell_intentional", Boolean.toString(z4));
                        hashMap2.put("avoid_on_cell_datasaver", Boolean.toString(z5));
                        hashMap2.put("avoid_on_cell_datasaver_intentional", Boolean.toString(z6));
                        hashMap2.put("avoid_on_abr", Boolean.toString(z7));
                        hashMap2.put("avoid_on_abr_intentional", Boolean.toString(z8));
                        hashMap2.put("quality_label", str10);
                        hashMap2.put("mos", str11.replaceAll(",", ";"));
                        hashMap2.put("mos_confidence", str12);
                        hashMap2.put("mos_csvqm", str13.replaceAll(",", ";"));
                        hashMap2.put("upload_mos", str11.replaceAll(",", ";"));
                        hashMap2.put("player_id", Long.toString(j));
                        hashMap2.put("vp_session_id", str3);
                        hashMap2.put("ig_video_id", str);
                        int i5 = hashCode2;
                        r24.A03(28180484, i5, hashMap2);
                        r44.markerEnd(28180484, i5, 2, now, timeUnit);
                    }
                }
            }
        }
        1Cd r1 = this.A0B;
        if (r1 != null) {
            r1.A0d(r5, r5.A0Q);
        }
    }

    public final void EFf(AnonymousClass3WR r11) {
        int hashCode;
        String A042;
        String str;
        2C4 r0 = this.A0A.A01;
        if (r11 != null) {
            String str2 = r11.A0G;
            if (str2 == null) {
                hashCode = -1;
            } else {
                hashCode = str2.hashCode();
            }
            02m r5 = r0.A01;
            r5.markerStart(61683940, hashCode);
            UserSession userSession = r0.A02;
            Context context = r0.A00;
            if (182.A06(0Tu.A05, userSession, 36321988666533762L)) {
                A042 = String.valueOf(r11.A01(context));
            } else {
                A042 = r11.A04();
            }
            0eP r9 = new 0eP("VIDEO_ID", str2);
            0eP r8 = new 0eP("SOURCE_TYPE", AnonymousClass4O2.A00(r11.A0E));
            ProductType productType = r11.A09;
            if (productType == null || (str = productType.A00) == null) {
                str = "";
            }
            C256333vb.A00(r5, 0Yt.A06(new 0eP[]{r9, r8, new 0eP("PRODUCT_TYPE", str), new 0eP("VIDEO_CODEC", A042), new 0eP("IS_DASH", Boolean.valueOf(r11.A08()))}), 61683940, hashCode);
            r5.markerEnd(61683940, hashCode, 2);
        }
    }

    public final void EFo(C263834Nn r27, Object obj, String str, String str2, int i, int i2) {
        AnonymousClass3WR r0;
        String str3 = str2;
        boolean startsWith = str3.startsWith(MediaStreamTrack.VIDEO_TRACK_KIND);
        boolean startsWith2 = str3.startsWith(MediaStreamTrack.AUDIO_TRACK_KIND);
        C263834Nn r2 = r27;
        Object obj2 = obj;
        String str4 = str;
        int i3 = i;
        if (startsWith) {
            C263844No A012 = A01(obj2);
            if (A012 != null) {
                UserSession userSession = this.A08;
                0qQ.A0B(userSession, 1);
                C263934Nx r12 = new C263934Nx(userSession);
                C252323ov r6 = this.A09;
                C263954Nz r8 = new C263954Nz(this.A07, userSession, r6.A00, r12, "video_format_changed");
                r8.A01(A012);
                r8.A0P = r2.A0D;
                r8.A0O = r2.A0C;
                r8.A01 = (float) i3;
                r8.A0y = str3;
                r8.A0A = r2.A06;
                int i4 = r2.A05;
                r8.A09 = i4;
                r8.A0F = r2.A09;
                r8.A02 = (float) r2.A0A;
                r8.A08 = r2.A04;
                r8.A0E = r2.A08;
                int i5 = this.A00 + 1;
                this.A00 = i5;
                r8.A0M = i5;
                r8.A0b = r2.A0H;
                if (!A012.A0N && ((r0 = A012.A04) == null || r0.A08())) {
                    r8.A16 = str4;
                }
                A03(r8, r6, A012, r12);
                String str5 = A012.A0B;
                if (str5 != null) {
                    2C3 r10 = this.A0A.A05;
                    String str6 = r2.A0K;
                    String str7 = r2.A00;
                    String str8 = r2.A0L;
                    if (r10.A03.A00()) {
                        C45453Cwk cwk = new C45453Cwk(str4, i3, 002.A04(i2, "w_", str4));
                        C45453Cwk cwk2 = r10.A00;
                        if (cwk2 != null && !cwk2.equals(cwk)) {
                            Integer num = AnonymousClass05K.A0j;
                            0qQ.A0B(str6, 3);
                            Integer valueOf = Integer.valueOf(cwk2.A00);
                            String str9 = cwk2.A02;
                            Integer valueOf2 = Integer.valueOf(cwk.A00);
                            String str10 = cwk.A02;
                            String str11 = str10;
                            2C3.A00(r10, (Boolean) null, (Boolean) null, valueOf, valueOf2, num, (Integer) null, (Integer) null, str11, str6, str8, str9, cwk2.A01, str5, str7, i4);
                        }
                        r10.A00 = cwk;
                    }
                }
            }
        } else if (startsWith2 && this.A0C) {
            String str12 = this.A06;
            if (str12 == null || !str12.equals(str4)) {
                this.A06 = str4;
                C263844No A013 = A01(obj2);
                if (A013 != null) {
                    UserSession userSession2 = this.A08;
                    0qQ.A0B(userSession2, 1);
                    C263934Nx r11 = new C263934Nx(userSession2);
                    C252323ov r5 = this.A09;
                    C263954Nz r7 = new C263954Nz(this.A07, userSession2, r5.A00, r11, "video_format_changed");
                    r7.A01(A013);
                    r7.A0h = str4;
                    r7.A0P = r2.A0D;
                    r7.A0O = r2.A0C;
                    r7.A01 = (float) i3;
                    r7.A0y = str3;
                    r7.A0A = r2.A06;
                    r7.A09 = r2.A05;
                    r7.A0F = r2.A09;
                    r7.A02 = (float) r2.A0A;
                    r7.A08 = r2.A04;
                    r7.A0E = r2.A08;
                    int i6 = this.A00 + 1;
                    this.A00 = i6;
                    r7.A0M = i6;
                    r7.A0b = r2.A0H;
                    A03(r7, r5, A013, r11);
                }
            }
        }
    }

    public final void EFv(C257183wz r3, Object obj) {
        if (this.A0D) {
            boolean z = false;
            if (r3 == C257183wz.CACHED) {
                z = true;
            }
            A04(obj, z);
        }
    }

    public final void EGA(2Yz r12) {
        C69852Bz r2 = this.A0A.A06;
        0qQ.A0B(r12, 0);
        2By r1 = r2.A03;
        if (r1.A00() && r1.A01) {
            2C0 r22 = r2.A01;
            int i = r12.A00;
            Integer num = r12.A03;
            switch (num.intValue()) {
                case 0:
                case 2:
                    r22.A00.markerStart(28196231, i, r12.A01, TimeUnit.MILLISECONDS);
                    r22.A01(i, 2C0.A00(r12));
                    return;
                case 1:
                case 4:
                    r22.A00.markerPoint(28196231, i, C393159vz.A00(num), r12.A01, TimeUnit.MILLISECONDS);
                    return;
                default:
                    r22.A01(i, 2C0.A00(r12));
                    r22.A00.markerEnd(28196231, i, 2, r12.A01, TimeUnit.MILLISECONDS);
                    return;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0067, code lost:
        if (r8 != false) goto L_0x0069;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0157, code lost:
        if (r8 != false) goto L_0x0069;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x015b, code lost:
        if (r8 != false) goto L_0x0071;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0154  */
    /* JADX WARNING: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void EGs(X.C263834Nn r28, java.lang.Object r29, int r30, boolean r31) {
        /*
            r27 = this;
            r11 = r27
            r0 = r29
            X.4No r9 = r11.A01(r0)
            if (r9 == 0) goto L_0x002b
            if (r31 == 0) goto L_0x000f
            r0 = 0
            r11.A03 = r0
        L_0x000f:
            r10 = r28
            int r3 = A00(r10, r9)
            boolean r0 = r9.A0M
            if (r0 != 0) goto L_0x0181
            java.lang.String r1 = "no_audio_track"
        L_0x001b:
            java.lang.String r0 = "not_disabled"
            boolean r8 = r0.equals(r1)
            java.lang.Boolean r0 = r11.A01
            if (r0 == 0) goto L_0x002c
            boolean r0 = r0.booleanValue()
            if (r0 != r8) goto L_0x002c
        L_0x002b:
            return
        L_0x002c:
            r11.A03 = r1
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r8)
            r11.A01 = r7
            com.instagram.common.session.UserSession r2 = r11.A08
            r4 = 1
            if (r8 == 0) goto L_0x0177
            X.0qQ.A0B(r2, r4)
            X.6Kr r6 = new X.6Kr
            r6.<init>(r2)
        L_0x0041:
            X.0tS r12 = X.0tS.A00()
            X.0s0 r1 = r12.A18
            X.0YZ[] r0 = X.0tS.A4G
            r5 = 4
            r0 = r0[r5]
            java.lang.Object r0 = r1.CDM(r12, r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x015b
            int r13 = r10.A06
            int r12 = r10.A0A
            java.lang.Integer r0 = X.VKr.A03
            int r1 = r0.intValue()
            r0 = 0
            if (r1 == r0) goto L_0x0157
            if (r1 == r4) goto L_0x015f
            if (r8 == 0) goto L_0x0173
        L_0x0069:
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            X.VKr.A03 = r0
            X.VKr.A01 = r3
            X.VKr.A00 = r12
        L_0x0071:
            java.lang.String r20 = "video_audio_enabled"
        L_0x0073:
            X.3ov r4 = r11.A09
            X.4DU r1 = r4.A00
            android.content.Context r0 = r11.A07
            X.4Nz r15 = new X.4Nz
            r19 = r6
            r16 = r0
            r17 = r2
            r18 = r1
            r15.<init>(r16, r17, r18, r19, r20)
            r15.A09 = r3
            int r0 = r10.A06
            r15.A0A = r0
            double r12 = (double) r3
            double r2 = (double) r0
            r0 = 0
            int r14 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r14 <= 0) goto L_0x0096
            double r0 = r12 / r2
        L_0x0096:
            r15.A00 = r0
            int r0 = r10.A0A
            float r0 = (float) r0
            r15.A02 = r0
            r12 = 0
            r15.A01(r9)
            java.lang.String r0 = r4.A09()
            r15.A1F = r0
            java.lang.String r0 = r4.A02()
            r15.A0m = r0
            int r0 = r10.A0D
            r15.A0P = r0
            int r0 = r10.A02
            r15.A0J = r0
            r0 = -7
            r1 = r30
            if (r1 == r0) goto L_0x0154
            r0 = -6
            if (r1 == r0) goto L_0x0151
            r0 = -5
            if (r1 == r0) goto L_0x014e
            r0 = -4
            if (r1 == r0) goto L_0x014b
            r0 = -3
            if (r1 == r0) goto L_0x0148
            r0 = -1
            if (r1 == r0) goto L_0x0145
            if (r1 == r5) goto L_0x0142
            r0 = 164(0xa4, float:2.3E-43)
            if (r1 == r0) goto L_0x013f
            r0 = 24
            if (r1 == r0) goto L_0x013c
            r0 = 25
            if (r1 == r0) goto L_0x0139
            r0 = 0
        L_0x00d8:
            r15.A0i = r0
            r15.A0V = r7
            java.lang.String r0 = r11.A03
            r15.A0g = r0
            boolean r0 = r10.A0O
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r15.A0W = r0
            int r0 = r10.A07
            r15.A0C = r0
            int r0 = r10.A04
            r15.A08 = r0
            int r0 = r11.A00
            int r0 = r0 + 1
            r11.A00 = r0
            r15.A0M = r0
            r11.A03(r15, r4, r9, r6)
            java.lang.String r5 = r9.A0B
            if (r5 == 0) goto L_0x002b
            X.2Bq r0 = r11.A0A
            X.2C3 r11 = r0.A05
            java.lang.String r4 = r10.A0K
            java.lang.String r3 = r10.A00
            int r2 = r10.A05
            java.lang.String r1 = r10.A0L
            X.2By r0 = r11.A03
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x002b
            if (r8 == 0) goto L_0x0136
            java.lang.Integer r16 = X.AnonymousClass05K.A02
        L_0x0117:
            r0 = 3
            X.0qQ.A0B(r4, r0)
            r13 = r12
            r14 = r12
            r15 = r12
            r17 = r12
            r18 = r12
            r19 = r12
            r20 = r4
            r21 = r1
            r22 = r12
            r23 = r12
            r24 = r5
            r25 = r3
            r26 = r2
            X.2C3.A00(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            return
        L_0x0136:
            java.lang.Integer r16 = X.AnonymousClass05K.A03
            goto L_0x0117
        L_0x0139:
            java.lang.String r0 = "volume_down"
            goto L_0x00d8
        L_0x013c:
            java.lang.String r0 = "volume_up"
            goto L_0x00d8
        L_0x013f:
            java.lang.String r0 = "volume_mute"
            goto L_0x00d8
        L_0x0142:
            java.lang.String r0 = "back"
            goto L_0x00d8
        L_0x0145:
            java.lang.String r0 = "video_tapped"
            goto L_0x00d8
        L_0x0148:
            java.lang.String r0 = "control_tapped"
            goto L_0x00d8
        L_0x014b:
            java.lang.String r0 = "sound_on"
            goto L_0x00d8
        L_0x014e:
            java.lang.String r0 = "sticky_audio"
            goto L_0x00d8
        L_0x0151:
            java.lang.String r0 = "headphones"
            goto L_0x00d8
        L_0x0154:
            java.lang.String r0 = "product_behavior"
            goto L_0x00d8
        L_0x0157:
            if (r8 == 0) goto L_0x016f
            goto L_0x0069
        L_0x015b:
            if (r8 == 0) goto L_0x0173
            goto L_0x0071
        L_0x015f:
            if (r8 != 0) goto L_0x0071
            int r4 = X.VKr.A02
            int r0 = X.VKr.A00
            int r12 = r12 - r0
            int r12 = r12 * r13
            int r1 = r3 + r12
            int r0 = X.VKr.A01
            int r1 = r1 - r0
            int r4 = r4 + r1
            X.VKr.A02 = r4
        L_0x016f:
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            X.VKr.A03 = r0
        L_0x0173:
            java.lang.String r20 = "video_audio_disabled"
            goto L_0x0073
        L_0x0177:
            X.0qQ.A0B(r2, r4)
            X.4WH r6 = new X.4WH
            r6.<init>(r2)
            goto L_0x0041
        L_0x0181:
            float r1 = r10.A01
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x018c
            java.lang.String r1 = "player_volume_zero"
            goto L_0x001b
        L_0x018c:
            X.1wD r0 = X.1w8.A00()
            int r0 = r0.A0C
            if (r0 > 0) goto L_0x0198
            java.lang.String r1 = "device_volume_zero"
            goto L_0x001b
        L_0x0198:
            java.lang.String r1 = "not_disabled"
            goto L_0x001b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4MD.EGs(X.4Nn, java.lang.Object, int, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x002b, code lost:
        if (r12.A0N == false) goto L_0x002d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void EGt(X.C263834Nn r34, java.lang.Object r35, int r36) {
        /*
            r33 = this;
            r13 = r33
            r0 = r35
            X.4No r11 = r13.A01(r0)
            if (r11 == 0) goto L_0x0171
            com.instagram.common.session.UserSession r4 = r13.A08
            r0 = 1
            X.0qQ.A0B(r4, r0)
            X.4WC r10 = new X.4WC
            r10.<init>(r4)
            r12 = r34
            int r3 = A00(r12, r11)
            int r9 = r12.A09
            int r8 = r12.A06
            int r2 = r12.A07
            int r14 = r12.A0A
            boolean r0 = r11.A0M
            if (r0 == 0) goto L_0x002d
            boolean r0 = r12.A0N
            r16 = 1
            if (r0 != 0) goto L_0x002f
        L_0x002d:
            r16 = 0
        L_0x002f:
            X.3ov r7 = r13.A09
            X.4DU r1 = r7.A00
            java.lang.String r22 = "video_buffering_finished"
            android.content.Context r0 = r13.A07
            X.4Nz r6 = new X.4Nz
            r19 = r4
            r20 = r1
            r21 = r10
            r17 = r6
            r18 = r0
            r17.<init>(r18, r19, r20, r21, r22)
            r6.A0C = r2
            r6.A09 = r3
            r6.A0A = r8
            double r4 = (double) r3
            double r2 = (double) r8
            r0 = 0
            int r15 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r15 <= 0) goto L_0x0056
            double r0 = r4 / r2
        L_0x0056:
            r6.A00 = r0
            r6.A0F = r9
            float r0 = (float) r14
            r6.A02 = r0
            r18 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r16)
            r6.A0V = r0
            r6.A01(r11)
            java.lang.String r0 = r7.A09()
            r6.A1F = r0
            java.lang.String r0 = r7.A02()
            r6.A0m = r0
            int r0 = r12.A0D
            r6.A0P = r0
            int r0 = r12.A02
            r6.A0J = r0
            r14 = r36
            r6.A07 = r14
            r6.A0B = r14
            int r0 = r12.A04
            r6.A08 = r0
            int r0 = r12.A08
            r6.A0E = r0
            int r0 = r13.A00
            int r0 = r0 + 1
            r13.A00 = r0
            r6.A0M = r0
            boolean r0 = r12.A0Q
            if (r0 == 0) goto L_0x009a
            java.lang.String r0 = "looping"
            r6.A0k = r0
        L_0x009a:
            r13.A03(r6, r7, r11, r10)
            java.lang.String r6 = r11.A0B
            if (r6 == 0) goto L_0x0171
            X.2Bq r10 = r13.A0A
            int r15 = r12.A05
            java.lang.String r7 = r12.A0K
            java.lang.String r13 = r12.A00
            java.lang.String r5 = r12.A0L
            r0 = 5
            X.0qQ.A0B(r7, r0)
            X.2Bv r1 = r10.A00
            boolean r0 = r1.A01
            if (r0 != 0) goto L_0x00c8
            r0 = 1900596(0x1d0034, float:2.663302E-39)
            boolean r0 = X.C59470Vi.A01(r0)
            if (r0 != 0) goto L_0x00c8
            boolean r0 = X.AnonymousClass20W.A02()
            if (r0 != 0) goto L_0x00c8
            boolean r0 = r1.A00
            if (r0 == 0) goto L_0x0171
        L_0x00c8:
            X.2C2 r11 = r10.A04
            X.2Bs r4 = X.2Bq.A0D
            int r3 = r6.hashCode()
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            java.lang.String r1 = java.lang.String.valueOf(r15)
            java.lang.String r0 = "end_buffering_current_position_ms"
            r2.put(r0, r1)
            java.lang.String r1 = java.lang.String.valueOf(r9)
            java.lang.String r0 = "end_buffering_last_start_position_ms"
            r2.put(r0, r1)
            long r0 = (long) r8
            r16 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 / r16
            float r8 = (float) r0
            java.lang.String r1 = java.lang.String.valueOf(r8)
            java.lang.String r0 = "end_buffering_duration_sec"
            r2.put(r0, r1)
            long r0 = (long) r14
            long r0 = r0 / r16
            float r8 = (float) r0
            java.lang.String r1 = java.lang.String.valueOf(r8)
            java.lang.String r0 = "buffering_duration_sec"
            r2.put(r0, r1)
            r8 = 1900562(0x1d0012, float:2.663255E-39)
            r4.A03(r8, r3, r2)
            X.02m r1 = r11.A00
            r0 = 291(0x123, float:4.08E-43)
            r1.markerEnd(r8, r3, r0)
            X.2C3 r0 = r10.A05
            java.lang.Integer r22 = X.AnonymousClass05K.A15
            r19 = r18
            r20 = r18
            r21 = r18
            r23 = r18
            r24 = r18
            r25 = r18
            r26 = r7
            r27 = r5
            r28 = r18
            r29 = r18
            r30 = r6
            r31 = r13
            r32 = r15
            r17 = r0
            X.2C3.A00(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            long r5 = android.os.SystemClock.uptimeMillis()
            java.util.Map r1 = X.2Bq.A0E
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            java.lang.Object r9 = r1.get(r0)
            X.Xcg r9 = (X.C21489Xcg) r9
            if (r9 == 0) goto L_0x0171
            r9.A01(r5)
            monitor-enter(r9)
            boolean r0 = r9.A05     // Catch:{ all -> 0x016e }
            monitor-exit(r9)
            if (r0 == 0) goto L_0x0171
            monitor-enter(r9)
            X.XTx r0 = r9.A02     // Catch:{ all -> 0x016e }
            monitor-exit(r9)
            if (r0 == 0) goto L_0x0171
            long r7 = r0.A01
            r1 = 0
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0171
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            X.2Bs.A01(r9, r1, r5)
            r0 = 1900557(0x1d000d, float:2.663248E-39)
            r4.A03(r0, r3, r1)
            r9.A00()
            return
        L_0x016e:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        L_0x0171:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4MD.EGt(X.4Nn, java.lang.Object, int):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: X.Xcg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v7, resolved type: X.Xcg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v8, resolved type: X.Xcg} */
    /* JADX WARNING: type inference failed for: r6v2, types: [X.XTx, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0099, code lost:
        if (r13.A0N == false) goto L_0x009b;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void EGu(X.C263834Nn r37, java.lang.Object r38, java.util.List r39) {
        /*
            r36 = this;
            r11 = r36
            r0 = r38
            X.4No r10 = r11.A01(r0)
            if (r10 == 0) goto L_0x0217
            r9 = 0
            int r0 = r39.size()
            if (r0 <= 0) goto L_0x006c
            X.0xE r9 = new X.0xE
            r9.<init>()
            X.0xE r8 = new X.0xE
            r8.<init>()
            X.0xE r7 = new X.0xE
            r7.<init>()
            java.util.ArrayList r20 = new java.util.ArrayList
            r20.<init>()
            java.util.ArrayList r19 = new java.util.ArrayList
            r19.<init>()
            java.util.ArrayList r18 = new java.util.ArrayList
            r18.<init>()
            java.util.Iterator r3 = r39.iterator()
        L_0x0033:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0074
            java.lang.Object r2 = r3.next()
            X.5MU r2 = (X.AnonymousClass5MU) r2
            int r0 = r2.A00
            r9.A01(r0)
            long r0 = (long) r0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            r0 = r20
            r0.add(r1)
            long r0 = r2.A02
            r8.A02(r0)
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            r0 = r19
            r0.add(r1)
            int r0 = r2.A01
            r7.A01(r0)
            long r0 = (long) r0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            r0 = r18
            r0.add(r1)
            goto L_0x0033
        L_0x006c:
            r7 = r9
            r8 = r9
            r18 = r9
            r20 = r9
            r19 = r9
        L_0x0074:
            com.instagram.common.session.UserSession r2 = r11.A08
            r0 = 1
            X.0qQ.A0B(r2, r0)
            X.4UP r12 = new X.4UP
            r12.<init>(r2)
            r13 = r37
            int r1 = A00(r13, r10)
            int r0 = r13.A09
            r28 = r0
            int r6 = r13.A06
            int r3 = r13.A07
            int r0 = r13.A0A
            r27 = r0
            boolean r0 = r10.A0M
            if (r0 == 0) goto L_0x009b
            boolean r0 = r13.A0N
            r17 = 1
            if (r0 != 0) goto L_0x009d
        L_0x009b:
            r17 = 0
        L_0x009d:
            X.3ov r5 = r11.A09
            X.4DU r14 = r5.A00
            java.lang.String r26 = "video_buffering_started"
            android.content.Context r0 = r11.A07
            X.4Nz r4 = new X.4Nz
            r21 = r4
            r22 = r0
            r23 = r2
            r24 = r14
            r25 = r12
            r21.<init>(r22, r23, r24, r25, r26)
            r4.A0C = r3
            r4.A09 = r1
            r4.A0A = r6
            double r14 = (double) r1
            double r2 = (double) r6
            r0 = 0
            int r16 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r16 <= 0) goto L_0x00c4
            double r0 = r14 / r2
        L_0x00c4:
            r4.A00 = r0
            r0 = r28
            r4.A0F = r0
            r0 = r27
            float r0 = (float) r0
            r4.A02 = r0
            r21 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r17)
            r4.A0V = r0
            r4.A01(r10)
            java.lang.String r0 = r5.A09()
            r4.A1F = r0
            java.lang.String r0 = r5.A02()
            r4.A0m = r0
            int r0 = r13.A0D
            r4.A0P = r0
            int r0 = r13.A02
            r4.A0J = r0
            int r0 = r13.A04
            r4.A08 = r0
            int r0 = r13.A08
            r4.A0E = r0
            r4.A0S = r9
            r0 = r20
            r4.A1H = r0
            r4.A0R = r8
            r0 = r19
            r4.A1G = r0
            r4.A0T = r7
            r0 = r18
            r4.A1I = r0
            int r0 = r11.A00
            int r0 = r0 + 1
            r11.A00 = r0
            r4.A0M = r0
            boolean r0 = r13.A0Q
            if (r0 == 0) goto L_0x0118
            java.lang.String r0 = "looping"
            r4.A0k = r0
        L_0x0118:
            r11.A03(r4, r5, r10, r12)
            java.lang.String r5 = r10.A0B
            if (r5 == 0) goto L_0x0217
            X.2Bq r10 = r11.A0A
            int r15 = r13.A05
            java.lang.String r4 = r13.A0K
            java.lang.String r0 = r13.A00
            r19 = r0
            java.lang.String r0 = r13.A0L
            r18 = r0
            r0 = 7
            X.0qQ.A0B(r4, r0)
            X.2Bv r1 = r10.A00
            boolean r0 = r1.A01
            if (r0 != 0) goto L_0x014a
            r0 = 1900596(0x1d0034, float:2.663302E-39)
            boolean r0 = X.C59470Vi.A01(r0)
            if (r0 != 0) goto L_0x014a
            boolean r0 = X.AnonymousClass20W.A02()
            if (r0 != 0) goto L_0x014a
            boolean r0 = r1.A00
            if (r0 == 0) goto L_0x0217
        L_0x014a:
            X.2C2 r2 = r10.A04
            X.2Bs r14 = X.2Bq.A0D
            int r13 = r5.hashCode()
            long r0 = android.os.SystemClock.uptimeMillis()
            X.02m r2 = r2.A00
            r12 = 1900562(0x1d0012, float:2.663255E-39)
            r2.markerStart(r12, r13)
            java.util.HashMap r11 = new java.util.HashMap
            r11.<init>()
            java.lang.String r2 = "video_id"
            r11.put(r2, r5)
            java.lang.String r3 = java.lang.String.valueOf(r15)
            java.lang.String r2 = "start_buffering_current_position_ms"
            r11.put(r2, r3)
            java.lang.String r3 = java.lang.String.valueOf(r28)
            java.lang.String r2 = "start_buffering_last_start_position_ms"
            r11.put(r2, r3)
            long r2 = (long) r6
            r16 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 / r16
            float r6 = (float) r2
            java.lang.String r3 = java.lang.String.valueOf(r6)
            java.lang.String r2 = "start_buffering_duration_sec"
            r11.put(r2, r3)
            if (r9 == 0) goto L_0x01aa
            if (r8 == 0) goto L_0x01aa
            if (r7 == 0) goto L_0x01aa
            java.lang.String r3 = r9.toString()
            java.lang.String r2 = "start_buffering_historical_requested_bytes"
            r11.put(r2, r3)
            java.lang.String r3 = r8.toString()
            java.lang.String r2 = "start_buffering_historical_bitrates"
            r11.put(r2, r3)
            java.lang.String r3 = r7.toString()
            java.lang.String r2 = "start_buffering_historical_stream_types"
            r11.put(r2, r3)
        L_0x01aa:
            r14.A03(r12, r13, r11)
            java.util.Map r9 = X.2Bq.A0E
            java.lang.Integer r8 = java.lang.Integer.valueOf(r13)
            java.lang.Object r7 = r9.get(r8)
            X.Xcg r7 = (X.C21489Xcg) r7
            if (r7 != 0) goto L_0x01c0
            X.Xcg r7 = new X.Xcg
            r7.<init>()
        L_0x01c0:
            long r2 = (long) r15
            monitor-enter(r7)
            X.XTx r6 = new X.XTx     // Catch:{ all -> 0x0214 }
            r6.<init>()     // Catch:{ all -> 0x0214 }
            r6.A01 = r2     // Catch:{ all -> 0x0214 }
            r6.A02 = r0     // Catch:{ all -> 0x0214 }
            X.XTx r3 = r7.A02     // Catch:{ all -> 0x0214 }
            if (r3 != 0) goto L_0x01db
            r7.A02 = r6     // Catch:{ all -> 0x0214 }
        L_0x01d1:
            r0 = 1
            r7.A06 = r0     // Catch:{ all -> 0x0214 }
            int r0 = r7.A00     // Catch:{ all -> 0x0214 }
            int r0 = r0 + 1
            r7.A00 = r0     // Catch:{ all -> 0x0214 }
            goto L_0x01ec
        L_0x01db:
            long r0 = r3.A00     // Catch:{ all -> 0x0214 }
            r11 = 0
            int r2 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r2 != 0) goto L_0x01e9
            long r0 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x0214 }
            r3.A00 = r0     // Catch:{ all -> 0x0214 }
        L_0x01e9:
            r7.A03 = r6     // Catch:{ all -> 0x0214 }
            goto L_0x01d1
        L_0x01ec:
            monitor-exit(r7)
            r9.put(r8, r7)
            X.2C3 r0 = r10.A05
            java.lang.Integer r25 = X.AnonymousClass05K.A0u
            r20 = r0
            r22 = r21
            r23 = r21
            r24 = r21
            r26 = r21
            r27 = r21
            r28 = r21
            r29 = r4
            r30 = r18
            r31 = r21
            r32 = r21
            r33 = r5
            r34 = r19
            r35 = r15
            X.2C3.A00(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)
            return
        L_0x0214:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        L_0x0217:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4MD.EGu(X.4Nn, java.lang.Object, java.util.List):void");
    }

    public final void EGx(Object obj, boolean z) {
        if (!this.A0D) {
            A04(obj, z);
        }
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [X.Xcg, java.lang.Object] */
    public final void EGy(C263834Nn r17, Object obj, String str) {
        String str2;
        C263844No A012 = A01(obj);
        if (A012 != null) {
            AnonymousClass3WR r15 = A012.A04;
            String str3 = A012.A0B;
            if (r15 != null && str3 != null) {
                2C1 r13 = this.A0A.A03;
                String A002 = AnonymousClass4O1.A00(A012);
                C263834Nn r2 = r17;
                int i = r2.A03;
                C252323ov r1 = this.A09;
                String moduleName = r1.A00.getModuleName();
                long j = (long) r2.A06;
                String A042 = r1.A04(str);
                0qQ.A0B(A002, 1);
                0qQ.A0B(moduleName, 4);
                2By r5 = r13.A01;
                if (r5.A00()) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    2Bs r22 = 2Bq.A0D;
                    int hashCode = str3.hashCode();
                    HashMap hashMap = new HashMap();
                    r22.A04(hashMap, hashCode, uptimeMillis);
                    hashMap.put(TraceFieldType.Duration, String.valueOf((int) (j / 1000)));
                    r22.A03(1900557, hashCode, hashMap);
                    02m r4 = r13.A00;
                    r4.markerEnd(1900557, hashCode, 2);
                    if (r5.A00()) {
                        r4.markerStart(1900557, hashCode);
                    }
                    ? obj2 = new Object();
                    synchronized (obj2) {
                        obj2.A05 = true;
                    }
                    2Bq.A0E.put(Integer.valueOf(hashCode), obj2);
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put("video_id", str3);
                    hashMap2.put("player_type", A002);
                    hashMap2.put("start_bitrate", String.valueOf(i));
                    hashMap2.put("streaming_format", C263284Kb.A00(r15));
                    if (A002.equals("live")) {
                        str2 = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
                    } else {
                        str2 = "0";
                    }
                    hashMap2.put("is_live_streaming", str2);
                    hashMap2.put("player_origin", moduleName);
                    hashMap2.put("original_play_reason", A042);
                    r22.A03(1900557, hashCode, hashMap2);
                }
            }
        }
    }

    public final void EH1(Object obj) {
        1Cd r0;
        if (obj != null) {
            C252323ov r1 = this.A09;
            C263844No A072 = r1.A07(obj);
            C263844No r02 = this.A05;
            if (r02 != null && A072 != null) {
                String str = A072.A09;
                if (str.equals(r02.A09)) {
                    this.A05 = null;
                    this.A01 = null;
                    UserSession userSession = this.A08;
                    0qQ.A0B(userSession, 1);
                    C263934Nx r10 = new C263934Nx(userSession);
                    C263954Nz r6 = new C263954Nz(this.A07, userSession, r1.A00, r10, "video_exited");
                    r6.A01(A072);
                    r6.A1F = r1.A09();
                    r6.A0m = r1.A02();
                    int i = this.A00 + 1;
                    this.A00 = i;
                    r6.A0M = i;
                    A03(r6, r1, A072, r10);
                    2C1 r12 = this.A0A.A03;
                    if (r12.A01.A00()) {
                        long uptimeMillis = SystemClock.uptimeMillis();
                        2Bs r7 = 2Bq.A0D;
                        int hashCode = str.hashCode();
                        02m r5 = r12.A00;
                        if (!r5.isMarkerOn(1900557, hashCode)) {
                            2Bq.A0E.remove(Integer.valueOf(hashCode));
                        } else {
                            HashMap hashMap = new HashMap();
                            r7.A04(hashMap, hashCode, uptimeMillis);
                            r7.A03(1900557, hashCode, hashMap);
                            r5.markerEnd(1900557, hashCode, 477);
                        }
                    }
                    String A022 = A02(A072);
                    if (A022 != null && (r0 = this.A0B) != null) {
                        r0.A0h(A022);
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00ac, code lost:
        if (r8.A0N == false) goto L_0x00ae;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void EH2(X.C263834Nn r33, java.lang.Object r34, java.lang.String r35, java.lang.String r36, java.lang.String r37, java.lang.String r38) {
        /*
            r32 = this;
            r9 = r32
            r0 = r34
            X.4No r10 = r9.A01(r0)
            if (r10 == 0) goto L_0x01e5
            r8 = r33
            int r2 = A00(r8, r10)
            X.0tS r4 = X.0tS.A00()
            X.0s0 r3 = r4.A18
            X.0YZ[] r1 = X.0tS.A4G
            r0 = 4
            r0 = r1[r0]
            java.lang.Object r0 = r3.CDM(r4, r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0066
            int r5 = r8.A05
            int r7 = r8.A06
            int r1 = r8.A09
            int r6 = r8.A0A
            int r0 = r7 * r6
            int r4 = r5 + r0
            int r4 = r4 - r1
            java.lang.Integer r1 = X.VKr.A03
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            int r3 = X.VKr.A02
            if (r1 != r0) goto L_0x0045
            int r3 = r3 + r5
            int r0 = X.VKr.A00
            int r6 = r6 - r0
            int r6 = r6 * r7
            int r3 = r3 + r6
            int r0 = X.VKr.A01
            int r3 = r3 - r0
        L_0x0045:
            r0 = 0
            X.VKr.A02 = r0
            X.VKr.A00 = r0
            X.VKr.A01 = r0
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            X.VKr.A03 = r0
            java.util.Set r0 = X.VKr.A04
            java.util.Iterator r1 = r0.iterator()
        L_0x0056:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0066
            java.lang.Object r0 = r1.next()
            com.instagram.debug.devoptions.section.videodebug.VideoUtilityFragment r0 = (com.instagram.debug.devoptions.section.videodebug.VideoUtilityFragment) r0
            r0.onTimeChanged(r4, r5, r3)
            goto L_0x0056
        L_0x0066:
            com.instagram.common.session.UserSession r1 = r9.A08
            r0 = 1
            X.0qQ.A0B(r1, r0)
            X.5ri r11 = new X.5ri
            r11.<init>(r1)
            X.3ov r6 = r9.A09
            X.4DU r0 = r6.A00
            android.content.Context r15 = r9.A07
            java.lang.String r19 = "video_paused"
            X.4Nz r14 = new X.4Nz
            r18 = r11
            r16 = r1
            r17 = r0
            r14.<init>(r15, r16, r17, r18, r19)
            int r0 = r8.A07
            r14.A0C = r0
            r14.A09 = r2
            int r7 = r8.A06
            r14.A0A = r7
            double r4 = (double) r2
            double r2 = (double) r7
            r0 = 0
            int r12 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r12 <= 0) goto L_0x0098
            double r0 = r4 / r2
        L_0x0098:
            r14.A00 = r0
            int r12 = r8.A09
            r14.A0F = r12
            int r0 = r8.A0A
            float r0 = (float) r0
            r14.A02 = r0
            r18 = 0
            boolean r0 = r10.A0M
            if (r0 == 0) goto L_0x00ae
            boolean r1 = r8.A0N
            r0 = 1
            if (r1 != 0) goto L_0x00af
        L_0x00ae:
            r0 = 0
        L_0x00af:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r14.A0V = r0
            boolean r0 = r8.A0O
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r14.A0W = r0
            r0 = r35
            java.lang.String r0 = r6.A04(r0)
            r14.A0z = r0
            r13 = r36
            r14.A15 = r13
            r14.A01(r10)
            java.lang.String r0 = r6.A09()
            r14.A1F = r0
            java.lang.String r0 = r6.A02()
            r14.A0m = r0
            int r0 = r8.A0D
            r14.A0P = r0
            int r0 = r8.A02
            r14.A0J = r0
            int r0 = r8.A04
            r14.A08 = r0
            int r0 = r8.A08
            r14.A0E = r0
            int r0 = r9.A00
            int r0 = r0 + 1
            r9.A00 = r0
            r14.A0M = r0
            java.lang.Integer r0 = r8.A0H
            r14.A0b = r0
            r0 = r37
            r14.A0s = r0
            java.lang.String r0 = r8.A0J
            r14.A0f = r0
            X.4MB r0 = r9.A04
            if (r0 == 0) goto L_0x0106
            java.lang.String r0 = r0.A00()
            r14.A0v = r0
        L_0x0106:
            java.lang.Boolean r0 = r8.A0E
            if (r0 == 0) goto L_0x0110
            boolean r0 = r0.booleanValue()
            r14.A0H = r0
        L_0x0110:
            java.lang.Float r0 = r8.A0G
            if (r0 == 0) goto L_0x0124
            java.lang.Float r1 = r8.A0F
            if (r1 == 0) goto L_0x0124
            float r0 = r0.floatValue()
            r14.A05 = r0
            float r0 = r1.floatValue()
            r14.A04 = r0
        L_0x0124:
            r9.A03(r14, r6, r10, r11)
            X.3WR r6 = r10.A04
            if (r6 == 0) goto L_0x01e5
            java.lang.String r5 = r10.A0B
            if (r5 == 0) goto L_0x01e5
            X.2Bq r0 = r9.A0A
            X.2C3 r9 = r0.A05
            int r0 = r8.A05
            r31 = r0
            int r0 = r8.A03
            java.lang.String r4 = r8.A0K
            java.lang.String r15 = r8.A00
            java.lang.String r8 = r8.A0L
            X.2By r1 = r9.A03
            boolean r1 = r1.A00()
            if (r1 == 0) goto L_0x01e5
            long r2 = android.os.SystemClock.uptimeMillis()
            int r14 = r5.hashCode()
            java.util.HashMap r11 = new java.util.HashMap
            r11.<init>()
            java.lang.String r1 = java.lang.Integer.toString(r0)
            java.lang.String r0 = "last_bitrate"
            r11.put(r0, r1)
            long r0 = (long) r7
            r16 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 / r16
            int r10 = (int) r0
            java.lang.String r1 = java.lang.Integer.toString(r10)
            java.lang.String r0 = "duration"
            r11.put(r0, r1)
            java.lang.String r1 = java.lang.Integer.toString(r12)
            java.lang.String r0 = "last_start_video_time_position_ms"
            r11.put(r0, r1)
            java.lang.String r1 = java.lang.Integer.toString(r31)
            java.lang.String r0 = "end_video_time_position_ms"
            r11.put(r0, r1)
            java.lang.String r0 = "pause_reason"
            r11.put(r0, r13)
            X.2Bs r0 = X.2Bq.A0D
            r0.A04(r11, r14, r2)
            r2 = 1900557(0x1d000d, float:2.663248E-39)
            r0.A03(r2, r14, r11)
            X.02m r1 = r9.A01
            r0 = 237(0xed, float:3.32E-43)
            r1.markerEnd(r2, r14, r0)
            java.lang.Integer r2 = X.AnonymousClass05K.A0N
            r19 = 0
            r0 = 0
            r1 = 0
            r3 = 3
            X.0qQ.A0B(r4, r3)
            boolean r3 = r6.A08()
            if (r3 == 0) goto L_0x01e2
            java.lang.Integer r3 = r6.A0E
            if (r3 != r2) goto L_0x01df
            java.lang.Integer r22 = X.AnonymousClass05K.A0C
        L_0x01ab:
            java.lang.Integer r23 = java.lang.Integer.valueOf(r7)
            java.lang.Integer r6 = r6.A0E
            r3 = 0
            if (r6 != r2) goto L_0x01b5
            r3 = 1
        L_0x01b5:
            java.lang.Boolean r17 = java.lang.Boolean.valueOf(r3)
            X.Cwk r3 = r9.A00
            if (r3 == 0) goto L_0x01c7
            int r0 = r3.A00
            java.lang.Integer r19 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = r3.A01
            java.lang.String r0 = r3.A02
        L_0x01c7:
            r20 = r18
            r21 = r2
            r24 = r18
            r25 = r4
            r26 = r8
            r27 = r0
            r28 = r1
            r29 = r5
            r30 = r15
            r16 = r9
            X.2C3.A00(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            return
        L_0x01df:
            java.lang.Integer r22 = X.AnonymousClass05K.A01
            goto L_0x01ab
        L_0x01e2:
            java.lang.Integer r22 = X.AnonymousClass05K.A0N
            goto L_0x01ab
        L_0x01e5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4MD.EH2(X.4Nn, java.lang.Object, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    public final void EH3(C263834Nn r28, Object obj, int i) {
        AnonymousClass3WR r9;
        String str;
        Integer num;
        Integer num2;
        Object obj2 = obj;
        if (obj != null) {
            C263844No A072 = this.A09.A07(obj2);
            this.A05 = A072;
            this.A01 = null;
            if (A072 != null && (r9 = A072.A04) != null && (str = A072.A0B) != null) {
                2C3 r11 = this.A0A.A05;
                C263834Nn r0 = r28;
                String str2 = r0.A0K;
                String str3 = r0.A00;
                String str4 = r0.A0L;
                boolean z = A072.A0Q;
                if (r11.A03.A00()) {
                    C69842Bx r10 = r11.A02;
                    if (!C59470Vi.A01(1900596)) {
                        02m r1 = r10.A01;
                        r1.markerStart(1900596, false);
                        if (!C59470Vi.A01(1900596)) {
                            r1.markerEnd(1900596, 2);
                        } else {
                            r10.A00.postDelayed(new Fs8(r10), 120000);
                        }
                    }
                    Integer num3 = AnonymousClass05K.A00;
                    Integer num4 = null;
                    String str5 = null;
                    String str6 = null;
                    0qQ.A0B(str2, 3);
                    if (r9.A08()) {
                        Integer num5 = r9.A0E;
                        num2 = AnonymousClass05K.A0N;
                        if (num5 == num2) {
                            num = AnonymousClass05K.A0C;
                        } else {
                            num = AnonymousClass05K.A01;
                        }
                    } else {
                        num = AnonymousClass05K.A0N;
                        num2 = num;
                    }
                    boolean z2 = false;
                    if (r9.A0E == num2) {
                        z2 = true;
                    }
                    Boolean valueOf = Boolean.valueOf(z2);
                    Boolean valueOf2 = Boolean.valueOf(z);
                    C45453Cwk cwk = r11.A00;
                    if (cwk != null) {
                        num4 = Integer.valueOf(cwk.A00);
                        str6 = cwk.A01;
                        str5 = cwk.A02;
                    }
                    2C3.A00(r11, valueOf, valueOf2, num4, (Integer) null, num3, num, (Integer) null, (String) null, str2, str4, str5, str6, str, str3, i);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:1:0x0002, code lost:
        r1 = r10.A09;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0043, code lost:
        if (r11.A0N == false) goto L_0x0045;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void EH5(X.C263834Nn r11, java.lang.Object r12, int r13) {
        /*
            r10 = this;
            if (r12 == 0) goto L_0x007b
            X.3ov r1 = r10.A09
            X.4No r2 = r1.A07(r12)
            if (r2 == 0) goto L_0x007b
            com.instagram.common.session.UserSession r6 = r10.A08
            r0 = 1
            X.0qQ.A0B(r6, r0)
            X.XQ3 r8 = new X.XQ3
            r8.<init>(r6)
            X.4DU r7 = r1.A00
            android.content.Context r5 = r10.A07
            r0 = 1925(0x785, float:2.697E-42)
            java.lang.String r9 = X.AnonymousClass000.A00(r0)
            X.4Nz r4 = new X.4Nz
            r4.<init>(r5, r6, r7, r8, r9)
            r4.A01(r2)
            int r0 = r11.A05
            r4.A09 = r0
            r4.A0K = r0
            r4.A0L = r13
            int r0 = r11.A09
            r4.A0F = r0
            int r0 = r11.A06
            r4.A0A = r0
            int r0 = r11.A0A
            float r0 = (float) r0
            r4.A02 = r0
            boolean r0 = r2.A0M
            if (r0 == 0) goto L_0x0045
            boolean r3 = r11.A0N
            r0 = 1
            if (r3 != 0) goto L_0x0046
        L_0x0045:
            r0 = 0
        L_0x0046:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r4.A0V = r0
            boolean r0 = r11.A0O
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r4.A0W = r0
            java.lang.String r0 = r1.A09()
            r4.A1F = r0
            java.lang.String r0 = r1.A02()
            r4.A0m = r0
            int r0 = r11.A0D
            r4.A0P = r0
            int r0 = r11.A02
            r4.A0J = r0
            int r0 = r10.A00
            int r0 = r0 + 1
            r10.A00 = r0
            r4.A0M = r0
            java.lang.Integer r0 = r11.A0H
            r4.A0b = r0
            java.lang.String r0 = r11.A0M
            r4.A18 = r0
            r10.A03(r4, r1, r2, r8)
        L_0x007b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4MD.EH5(X.4Nn, java.lang.Object, int):void");
    }

    public final void EH6(C263834Nn r14, Object obj, String str, int i) {
        String str2;
        1Cd r0;
        String str3 = str;
        if (obj != null) {
            C252323ov r2 = this.A09;
            C263844No A072 = r2.A07(obj);
            this.A05 = A072;
            this.A01 = null;
            this.A00 = 1;
            if ((r2 instanceof C263914Nv) && ((C263914Nv) r2).A0H.Cau()) {
                str3 = "cobroadcast_finish";
            }
            UserSession userSession = this.A08;
            0qQ.A0B(userSession, 1);
            C263934Nx r11 = new C263934Nx(userSession);
            AnonymousClass4DU r10 = r2.A00;
            C263954Nz r7 = new C263954Nz(this.A07, userSession, r10, r11, "video_should_start");
            r7.A15 = str3;
            r7.A1F = r2.A09();
            r7.A0m = r2.A02();
            r7.A0M = this.A00;
            r7.A03 = (float) r14.A0B;
            r7.A0b = r14.A0H;
            if (A072 != null) {
                r7.A01(A072);
            }
            AnonymousClass4MB r02 = this.A04;
            if (r02 != null) {
                r7.A0v = r02.A00();
            }
            A03(r7, r2, A072, r11);
            if (A072 != null) {
                String A022 = A02(A072);
                if (!(A022 == null || (r0 = this.A0B) == null)) {
                    r0.A0p(A022, str3);
                }
                if (A072.A04 != null && (str2 = A072.A0B) != null) {
                    this.A0A.A03.A00(A072, str2, str3, r2.A09(), r10.getModuleName(), i);
                }
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v29, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v30, resolved type: X.Xcg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v44, resolved type: X.Xcg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v45, resolved type: X.Xcg} */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0037, code lost:
        if (r2.A0N == false) goto L_0x0039;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void EH7(X.C263834Nn r32, java.lang.Object r33, java.lang.String r34, long r35, boolean r37, boolean r38, boolean r39) {
        /*
            r31 = this;
            r1 = r31
            r0 = r33
            X.4No r0 = r1.A01(r0)
            if (r0 == 0) goto L_0x01be
            com.instagram.common.session.UserSession r9 = r1.A08
            r4 = 1
            X.0qQ.A0B(r9, r4)
            X.4WF r11 = new X.4WF
            r11.<init>(r9)
            r2 = r32
            int r5 = A00(r2, r0)
            X.3ov r3 = r1.A09
            X.4DU r10 = r3.A00
            android.content.Context r8 = r1.A07
            java.lang.String r12 = "video_started_playing"
            X.4Nz r7 = new X.4Nz
            r7.<init>(r8, r9, r10, r11, r12)
            r19 = 0
            r7.A09 = r5
            int r5 = r2.A07
            r7.A0C = r5
            boolean r5 = r0.A0M
            if (r5 == 0) goto L_0x0039
            boolean r6 = r2.A0N
            r5 = 1
            if (r6 != 0) goto L_0x003a
        L_0x0039:
            r5 = 0
        L_0x003a:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            r7.A0V = r5
            boolean r5 = r2.A0O
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            r7.A0W = r5
            r14 = r34
            java.lang.String r5 = r3.A04(r14)
            r7.A15 = r5
            r15 = r35
            r7.A0Q = r15
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r37)
            r7.A0Y = r5
            r5 = r39
            r7.A1K = r5
            r6 = r38
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r6)
            r7.A0a = r5
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r7.A0Z = r4
            r10 = 512(0x200, float:7.175E-43)
            r7.A0I = r10
            r7.A01(r0)
            java.lang.String r4 = r3.A09()
            r7.A1F = r4
            java.lang.String r4 = r3.A02()
            r7.A0m = r4
            int r4 = r2.A0D
            r7.A0P = r4
            int r4 = r2.A0C
            r7.A0O = r4
            int r4 = r2.A02
            r7.A0J = r4
            int r4 = r2.A06
            r7.A0A = r4
            java.lang.String r4 = r2.A0I
            r7.A0d = r4
            int r4 = r1.A00
            int r4 = r4 + 1
            r1.A00 = r4
            r7.A0M = r4
            int r4 = r2.A0B
            float r4 = (float) r4
            r7.A03 = r4
            java.lang.Integer r4 = r2.A0H
            r7.A0b = r4
            java.lang.String r4 = r2.A0J
            r7.A0f = r4
            X.4MB r4 = r1.A04
            if (r4 == 0) goto L_0x00b2
            java.lang.String r4 = r4.A00()
            r7.A0v = r4
        L_0x00b2:
            java.lang.Boolean r4 = r2.A0E
            if (r4 == 0) goto L_0x00bc
            boolean r4 = r4.booleanValue()
            r7.A0H = r4
        L_0x00bc:
            java.lang.Float r4 = r2.A0G
            if (r4 == 0) goto L_0x00d0
            java.lang.Float r5 = r2.A0F
            if (r5 == 0) goto L_0x00d0
            float r4 = r4.floatValue()
            r7.A05 = r4
            float r4 = r5.floatValue()
            r7.A04 = r4
        L_0x00d0:
            r1.A03(r7, r3, r0, r11)
            X.3WR r9 = r0.A04
            if (r9 == 0) goto L_0x01b1
            java.lang.String r8 = r0.A0B
            if (r8 == 0) goto L_0x01b1
            X.2Bq r3 = r1.A0A
            X.2C3 r7 = r3.A05
            int r3 = r2.A03
            r18 = r3
            int r3 = r2.A05
            r30 = r3
            java.lang.String r5 = r2.A0K
            java.lang.String r3 = r2.A00
            r29 = r3
            java.lang.String r2 = r2.A0L
            r25 = r2
            boolean r2 = r0.A0Q
            r17 = r2
            X.2By r2 = r7.A03
            boolean r2 = r2.A00()
            if (r2 == 0) goto L_0x01b1
            long r2 = android.os.SystemClock.uptimeMillis()
            int r13 = r8.hashCode()
            java.util.HashMap r12 = new java.util.HashMap
            r12.<init>()
            java.lang.String r11 = java.lang.Integer.toString(r18)
            java.lang.String r4 = "start_bitrate"
            r12.put(r4, r11)
            java.lang.String r11 = java.lang.Integer.toString(r30)
            java.lang.String r4 = "start_video_time_position_ms"
            r12.put(r4, r11)
            if (r37 == 0) goto L_0x01d8
            java.lang.Integer r4 = X.AnonymousClass05K.A01
        L_0x0120:
            int r4 = r4.intValue()
            if (r4 == 0) goto L_0x01d4
            r4 = 3165(0xc5d, float:4.435E-42)
            java.lang.String r11 = X.AnonymousClass000.A00(r4)
        L_0x012c:
            java.lang.String r4 = "stream_type"
            r12.put(r4, r11)
            java.lang.String r11 = java.lang.Long.toString(r15)
            java.lang.String r4 = "start_delay"
            r12.put(r4, r11)
            java.lang.String r10 = java.lang.Integer.toString(r10)
            java.lang.String r4 = "prefetch_size"
            r12.put(r4, r10)
            if (r38 == 0) goto L_0x01d0
            java.lang.String r10 = "true"
        L_0x0147:
            java.lang.String r4 = "player_warmed"
            r12.put(r4, r10)
            java.util.Map r11 = X.2Bq.A0E
            java.lang.Integer r10 = java.lang.Integer.valueOf(r13)
            java.lang.Object r4 = r11.get(r10)
            X.Xcg r4 = (X.C21489Xcg) r4
            if (r4 == 0) goto L_0x01c7
            r4.A01(r2)
            X.2Bs.A01(r4, r12, r2)
        L_0x0160:
            r4.A00()
            r3 = 1900557(0x1d000d, float:2.663248E-39)
            X.2Bs r2 = X.2Bq.A0D
            r2.A03(r3, r13, r12)
            java.lang.Integer r20 = X.AnonymousClass05K.A01
            r2 = 0
            r3 = 0
            r4 = 3
            X.0qQ.A0B(r5, r4)
            boolean r4 = r9.A08()
            if (r4 == 0) goto L_0x01c2
            java.lang.Integer r4 = r9.A0E
            java.lang.Integer r10 = X.AnonymousClass05K.A0N
            if (r4 != r10) goto L_0x01bf
            java.lang.Integer r21 = X.AnonymousClass05K.A0C
        L_0x0181:
            java.lang.Integer r18 = java.lang.Integer.valueOf(r18)
            java.lang.Integer r9 = r9.A0E
            r4 = 0
            if (r9 != r10) goto L_0x018b
            r4 = 1
        L_0x018b:
            java.lang.Boolean r16 = java.lang.Boolean.valueOf(r4)
            java.lang.Boolean r17 = java.lang.Boolean.valueOf(r17)
            X.Cwk r4 = r7.A00
            if (r4 == 0) goto L_0x01a1
            int r2 = r4.A00
            java.lang.Integer r18 = java.lang.Integer.valueOf(r2)
            java.lang.String r3 = r4.A01
            java.lang.String r2 = r4.A02
        L_0x01a1:
            r22 = r19
            r23 = r19
            r24 = r5
            r26 = r2
            r27 = r3
            r28 = r8
            r15 = r7
            X.2C3.A00(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
        L_0x01b1:
            java.lang.String r2 = r1.A02(r0)
            if (r2 == 0) goto L_0x01be
            X.1Cd r0 = r1.A0B
            if (r0 == 0) goto L_0x01be
            r0.A0x(r2, r6, r14)
        L_0x01be:
            return
        L_0x01bf:
            java.lang.Integer r21 = X.AnonymousClass05K.A01
            goto L_0x0181
        L_0x01c2:
            java.lang.Integer r21 = X.AnonymousClass05K.A0N
            r10 = r21
            goto L_0x0181
        L_0x01c7:
            X.Xcg r4 = new X.Xcg
            r4.<init>()
            r11.put(r10, r4)
            goto L_0x0160
        L_0x01d0:
            java.lang.String r10 = "false"
            goto L_0x0147
        L_0x01d4:
            java.lang.String r11 = "stream"
            goto L_0x012c
        L_0x01d8:
            java.lang.Integer r4 = X.AnonymousClass05K.A00
            goto L_0x0120
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4MD.EH7(X.4Nn, java.lang.Object, java.lang.String, long, boolean, boolean, boolean):void");
    }

    public final void EHE(C263834Nn r10, Object obj, int i) {
        UserSession userSession = this.A08;
        0qQ.A0B(userSession, 1);
        C263934Nx r7 = new C263934Nx(userSession);
        C263844No A012 = A01(obj);
        if (A012 != null) {
            int A002 = A00(r10, A012);
            C252323ov r1 = this.A09;
            C263954Nz r3 = new C263954Nz(this.A07, userSession, r1.A00, r7, "instagram_video_viewability_changed");
            r3.A01(A012);
            r3.A09 = A002;
            r3.A0b = Integer.valueOf(i);
            int i2 = this.A00 + 1;
            this.A00 = i2;
            r3.A0M = i2;
            A03(r3, r1, A012, r7);
        }
    }

    public AnonymousClass4MD(Context context, AnonymousClass4MB r5, UserSession userSession, C252323ov r7, 2Bq r8) {
        this.A04 = r5;
        this.A09 = r7;
        this.A08 = userSession;
        this.A07 = context;
        this.A0A = r8;
        this.A0B = r8.A07;
        0Tu r2 = 0Tu.A05;
        this.A0C = 182.A06(r2, userSession, 36315975712247638L);
        this.A0D = 182.A06(r2, userSession, 36318479678183568L);
        this.A0E = 182.A06(r2, userSession, 36315610640158126L);
    }

    private void A04(Object obj, boolean z) {
        C263844No A012 = A01(obj);
        if (A012 != null) {
            UserSession userSession = this.A08;
            0qQ.A0B(userSession, 1);
            C263934Nx r7 = new C263934Nx(userSession);
            C252323ov r1 = this.A09;
            C263954Nz r3 = new C263954Nz(this.A07, userSession, r1.A00, r7, "video_fetched");
            r3.A01(A012);
            r3.A0Y = Boolean.valueOf(z);
            int i = this.A00 + 1;
            this.A00 = i;
            r3.A0M = i;
            A03(r3, r1, A012, r7);
        }
    }

    public final void EGv(C263834Nn r10, Object obj, String str, String str2, String str3) {
        C263844No A012 = A01(obj);
        if (A012 != null) {
            UserSession userSession = this.A08;
            0qQ.A0B(userSession, 1);
            C263934Nx r7 = new C263934Nx(userSession);
            C252323ov r1 = this.A09;
            C263954Nz r3 = new C263954Nz(this.A07, userSession, r1.A00, r7, AnonymousClass000.A00(4191));
            r3.A01(A012);
            r3.A15 = 002.A0g(str, ":", str2);
            r3.A0q = str3;
            r3.A03 = (float) r10.A0B;
            A03(r3, r1, A012, r7);
        }
    }

    public final void EGz(C263834Nn r14, Object obj) {
        String str;
        String str2;
        boolean z;
        boolean z2;
        String str3;
        String str4;
        C263844No A012 = A01(obj);
        if (A012 != null) {
            AnonymousClass3WR r1 = A012.A04;
            String A022 = A02(A012);
            if (A022 != null) {
                String str5 = null;
                if (r1 != null) {
                    ProductType productType = r1.A09;
                    if (productType != null) {
                        str2 = productType.A00;
                    } else {
                        str2 = null;
                    }
                    str3 = AnonymousClass4O2.A00(r1.A0E);
                    Boolean bool = r1.A0B;
                    if (bool != null) {
                        z = bool.booleanValue();
                    } else {
                        z = false;
                    }
                    str4 = r1.A0L;
                    z2 = r1.A0T;
                } else {
                    1iA r0 = A012.A02;
                    if (r0 != null) {
                        str = r0.toString();
                    } else {
                        str = null;
                    }
                    z = A012.A0M;
                    z2 = A012.A0Q;
                    str3 = null;
                    str4 = null;
                }
                AnonymousClass4MB r12 = this.A04;
                if (r12 != null) {
                    str5 = r12.A00();
                }
                1Cd r13 = this.A0B;
                if (r13 != null) {
                    String str6 = r14.A0L;
                    r13.A0e(Boolean.valueOf(z), Integer.valueOf(r14.A07), A022, str2, str6, str3, str4, r14.A00, str5, r14.A0P, z2);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0028, code lost:
        if (r11.A0N == false) goto L_0x002a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void EH8(X.C263834Nn r11, java.lang.Object r12, int r13, int r14, int r15) {
        /*
            r10 = this;
            X.4No r2 = r10.A01(r12)
            if (r2 == 0) goto L_0x0072
            com.instagram.common.session.UserSession r6 = r10.A08
            r0 = 1
            X.0qQ.A0B(r6, r0)
            X.XQ2 r8 = new X.XQ2
            r8.<init>(r6)
            X.3ov r1 = r10.A09
            X.4DU r7 = r1.A00
            android.content.Context r5 = r10.A07
            java.lang.String r9 = "video_playing_update"
            X.4Nz r4 = new X.4Nz
            r4.<init>(r5, r6, r7, r8, r9)
            r4.A01(r2)
            boolean r0 = r2.A0M
            if (r0 == 0) goto L_0x002a
            boolean r3 = r11.A0N
            r0 = 1
            if (r3 != 0) goto L_0x002b
        L_0x002a:
            r0 = 0
        L_0x002b:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r4.A0V = r0
            boolean r0 = r11.A0O
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r4.A0W = r0
            int r0 = r11.A05
            r4.A09 = r0
            int r0 = r11.A09
            r4.A0F = r0
            int r0 = r11.A06
            r4.A0A = r0
            r4.A0N = r15
            java.lang.String r0 = r1.A09()
            r4.A1F = r0
            java.lang.String r0 = r1.A02()
            r4.A0m = r0
            int r0 = r11.A0D
            r4.A0P = r0
            int r0 = r11.A02
            r4.A0J = r0
            int r0 = r11.A04
            r4.A08 = r0
            int r0 = r11.A08
            r4.A0E = r0
            r4.A06 = r13
            r4.A0G = r14
            int r0 = r10.A00
            int r0 = r0 + 1
            r10.A00 = r0
            r4.A0M = r0
            r10.A03(r4, r1, r2, r8)
        L_0x0072:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4MD.EH8(X.4Nn, java.lang.Object, int, int, int):void");
    }

    public final void EH9(Object obj, String str, String str2, int i, long j) {
        String str3;
        C263844No A012 = A01(obj);
        if (A012 != null && (str3 = A012.A0B) != null && this.A0A.A03.A01.A00()) {
            2Bs r5 = 2Bq.A0D;
            int hashCode = str3.hashCode();
            HashMap hashMap = new HashMap();
            hashMap.put("video_id", str3);
            hashMap.put("render_delay", String.valueOf(j));
            hashMap.put("video_decoder", str);
            hashMap.put("audio_decoder", str2);
            hashMap.put("video_decoder_init_time", String.valueOf(i));
            r5.A03(1900557, hashCode, hashMap);
        }
    }

    public final void EHA(Object obj) {
        String A022;
        1Cd r0;
        C263844No A012 = A01(obj);
        if (A012 != null && (A022 = A02(A012)) != null && (r0 = this.A0B) != null) {
            r0.A0l(A022);
        }
    }

    public final void EHB(C263834Nn r11, Object obj) {
        Float f;
        C263844No A012 = A01(obj);
        if (A012 != null) {
            int A002 = A00(r11, A012);
            UserSession userSession = this.A08;
            0qQ.A0B(userSession, 1);
            C263934Nx r8 = new C263934Nx(userSession);
            C252323ov r2 = this.A09;
            C263954Nz r4 = new C263954Nz(this.A07, userSession, r2.A00, r8, AnonymousClass000.A00(4198));
            r4.A01(A012);
            r4.A0P = r11.A0D;
            r4.A0O = r11.A0C;
            r4.A0d = r11.A0I;
            r4.A09 = A002;
            r4.A0F = r11.A09;
            r4.A02 = (float) r11.A0A;
            int i = this.A00 + 1;
            this.A00 = i;
            r4.A0M = i;
            Boolean bool = r11.A0E;
            if (bool != null) {
                r4.A0H = bool.booleanValue() ? 1 : 0;
            }
            Float f2 = r11.A0G;
            if (!(f2 == null || (f = r11.A0F) == null)) {
                r4.A05 = f2.floatValue();
                r4.A04 = f.floatValue();
            }
            A03(r4, r2, A012, r8);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0028, code lost:
        if (r11.A0N == false) goto L_0x002a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void EHC(X.C263834Nn r11, java.lang.Object r12) {
        /*
            r10 = this;
            X.4No r2 = r10.A01(r12)
            if (r2 == 0) goto L_0x006c
            com.instagram.common.session.UserSession r6 = r10.A08
            r0 = 1
            X.0qQ.A0B(r6, r0)
            X.XQ5 r8 = new X.XQ5
            r8.<init>(r6)
            X.3ov r1 = r10.A09
            X.4DU r7 = r1.A00
            android.content.Context r5 = r10.A07
            java.lang.String r9 = "video_viewed"
            X.4Nz r4 = new X.4Nz
            r4.<init>(r5, r6, r7, r8, r9)
            r4.A01(r2)
            boolean r0 = r2.A0M
            if (r0 == 0) goto L_0x002a
            boolean r3 = r11.A0N
            r0 = 1
            if (r3 != 0) goto L_0x002b
        L_0x002a:
            r0 = 0
        L_0x002b:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r4.A0V = r0
            boolean r0 = r11.A0O
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r4.A0W = r0
            int r0 = r11.A05
            r4.A09 = r0
            int r0 = r11.A09
            r4.A0F = r0
            int r0 = r11.A06
            r4.A0A = r0
            java.lang.String r0 = r1.A09()
            r4.A1F = r0
            java.lang.String r0 = r1.A02()
            r4.A0m = r0
            int r0 = r11.A0D
            r4.A0P = r0
            int r0 = r11.A02
            r4.A0J = r0
            int r0 = r11.A04
            r4.A08 = r0
            int r0 = r11.A08
            r4.A0E = r0
            int r0 = r10.A00
            int r0 = r0 + 1
            r10.A00 = r0
            r4.A0M = r0
            r10.A03(r4, r1, r2, r8)
        L_0x006c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4MD.EHC(X.4Nn, java.lang.Object):void");
    }

    public final void EHD(Object obj, String str, String str2, String str3) {
        C263844No A012 = A01(obj);
        if (A012 != null) {
            UserSession userSession = this.A08;
            0qQ.A0B(userSession, 1);
            C263934Nx r7 = new C263934Nx(userSession);
            C252323ov r1 = this.A09;
            C263954Nz r3 = new C263954Nz(this.A07, userSession, r1.A00, r7, "video_playback_warning");
            r3.A01(A012);
            r3.A15 = 002.A0g(str, ":", str2);
            r3.A0q = str3;
            A03(r3, r1, A012, r7);
        }
    }
}
