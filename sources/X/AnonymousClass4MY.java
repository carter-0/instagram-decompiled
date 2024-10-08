package X;

import com.facebook.cameracore.instagram.ardelivery.networkconsentmanager.IgNetworkConsentStorage;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.4MY  reason: invalid class name */
public final class AnonymousClass4MY implements AnonymousClass4MZ, C263444Ma {
    public final 2Bq A00;
    public final WeakReference A01;

    public AnonymousClass4MY(2Bq r2, AnonymousClass4MM r3) {
        0qQ.A0B(r2, 2);
        this.A00 = r2;
        this.A01 = new WeakReference(r3);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00ae  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Chd(X.C297475ro r24, X.C263684My r25, X.C263674Mx r26, java.lang.Integer r27, java.lang.String r28, java.lang.String r29, java.lang.String r30, java.lang.String r31, boolean r32) {
        /*
            r23 = this;
            r6 = 0
            r3 = r23
            java.lang.ref.WeakReference r0 = r3.A01
            java.lang.Object r0 = r0.get()
            X.4MM r0 = (X.AnonymousClass4MM) r0
            if (r0 == 0) goto L_0x00ad
            X.3uU r4 = r3.A00()
            if (r4 == 0) goto L_0x0068
            java.lang.String r5 = r4.A0G
            r2 = 1
            if (r5 == 0) goto L_0x0068
            X.3uR r1 = r4.A07
            if (r1 == 0) goto L_0x00b4
            int r1 = r1.ordinal()
            if (r1 == r6) goto L_0x00b0
            if (r1 != r2) goto L_0x00b4
            java.lang.Integer r13 = X.AnonymousClass05K.A0C
        L_0x0026:
            X.2Bq r1 = r3.A00
            X.2C3 r7 = r1.A05
            java.lang.String r16 = r0.BdG()
            X.4Ms r1 = r0.A09
            X.4OI r1 = r1.A08
            if (r1 == 0) goto L_0x00ae
            java.lang.String r6 = r1.A07
        L_0x0036:
            int r22 = r0.getCurrentPosition()
            boolean r4 = r4.A03()
            java.lang.Integer r12 = X.AnonymousClass05K.A0Y
            r10 = 0
            r9 = 0
            r1 = 0
            r2 = 0
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r4)
            X.Cwk r4 = r7.A00
            if (r4 == 0) goto L_0x0056
            int r1 = r4.A00
            java.lang.Integer r10 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = r4.A01
            java.lang.String r1 = r4.A02
        L_0x0056:
            r11 = r9
            r14 = r9
            r15 = r9
            r17 = r9
            r19 = r2
            r20 = r5
            r21 = r6
            r18 = r1
            X.2C3.A00(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r7.A00 = r9
        L_0x0068:
            X.4Ms r1 = r0.A09
            X.4Mt r1 = r1.A0I
            boolean r1 = r1.A0X
            if (r1 != 0) goto L_0x00ad
            X.2C7 r7 = r3.A01()
            r6 = r24
            if (r7 == 0) goto L_0x008c
            int r10 = r0.getCurrentPosition()
            X.3uU r8 = r3.A00()
            java.lang.Integer r9 = r3.A02()
            int r11 = r6.A00
            long r1 = r6.A02
            int r12 = (int) r1
            r7.A01(r8, r9, r10, r11, r12)
        L_0x008c:
            java.lang.String r5 = r0.BdG()
            java.lang.String r4 = r3.A03()
            if (r4 != 0) goto L_0x0098
            java.lang.String r4 = ""
        L_0x0098:
            int r1 = r6.A00
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            long r1 = r6.A02
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.Object[] r2 = new java.lang.Object[]{r5, r4, r3, r1}
            java.lang.String r1 = "COMPLETED: playerid %s for vid %s, stallCount: %d, stallTime: %s"
            r0.A09(r1, r2)
        L_0x00ad:
            return
        L_0x00ae:
            r6 = 0
            goto L_0x0036
        L_0x00b0:
            java.lang.Integer r13 = X.AnonymousClass05K.A01
            goto L_0x0026
        L_0x00b4:
            java.lang.Integer r13 = X.AnonymousClass05K.A0N
            goto L_0x0026
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4MY.Chd(X.5ro, X.4My, X.4Mx, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean):void");
    }

    private final C255653uU A00() {
        AnonymousClass4MM r0 = (AnonymousClass4MM) this.A01.get();
        if (r0 != null) {
            return r0.A0I;
        }
        return null;
    }

    private final 2C7 A01() {
        AnonymousClass4MM r0 = (AnonymousClass4MM) this.A01.get();
        if (r0 != null) {
            return r0.A0K;
        }
        return null;
    }

    private final Integer A02() {
        AnonymousClass4MM r0 = (AnonymousClass4MM) this.A01.get();
        if (r0 != null) {
            return r0.A0Q;
        }
        return null;
    }

    public final void ChQ(C263684My r7, C263674Mx r8, String str, String str2, String str3, String str4, int i, long j, boolean z, boolean z2) {
        AnonymousClass4MM r2 = (AnonymousClass4MM) this.A01.get();
        if (r2 != null) {
            String BdG = r2.BdG();
            String A03 = A03();
            if (A03 == null) {
                A03 = "";
            }
            r2.A09("CANCELLED: playerid %s for vid %s", BdG, A03);
            2C7 A012 = A01();
            if (A012 != null) {
                A012.A00(A00(), (0xF) null, A02(), "live_video_cancelled", r2.getCurrentPosition());
            }
        }
    }

    public final void Chs(C297475ro r7, int i, long j, long j2, long j3, boolean z, boolean z2) {
        1Cd r0;
        AnonymousClass4MM r3 = (AnonymousClass4MM) this.A01.get();
        if (r3 != null) {
            String BdG = r3.BdG();
            String A03 = A03();
            if (A03 == null) {
                A03 = "";
            }
            r3.A09("STOP_BUFFERING: playerId %s for vid %s for time: %d", BdG, A03, Long.valueOf(j));
            2C7 A012 = A01();
            if (A012 != null) {
                A012.A00(A00(), (0xF) null, A02(), "live_video_end_buffering", r3.getCurrentPosition());
            }
            String A032 = A03();
            if (A032 != null && (r0 = this.A00.A07) != null) {
                r0.A0g(A032);
            }
        }
    }

    public final void Chw(C297475ro r13, C284815Oa r14, C263684My r15, C263674Mx r16, String str, boolean z) {
        String str2;
        AnonymousClass4MM r2 = (AnonymousClass4MM) this.A01.get();
        if (r2 != null) {
            C255653uU A002 = A00();
            2C7 A012 = A01();
            if (A012 != null) {
                String str3 = r14.A02;
                int currentPosition = r2.getCurrentPosition();
                Integer A02 = A02();
                0xF r5 = new 0xF();
                if (str3 == null) {
                    str3 = "unknown";
                }
                0xF.A00(r5, str3, "reason");
                0xF.A00(r5, "ERROR", AnonymousClass000.A00(1318));
                A012.A00(A002, r5, A02, "live_video_error", currentPosition);
            }
            if (A002 != null && (str2 = A002.A0G) != null) {
                2C3 r1 = this.A00.A05;
                String BdG = r2.BdG();
                String A05 = r2.A05();
                String str4 = r14.A01.A00;
                String name = r14.A00.name();
                String str5 = r14.A02;
                if (r1.A03.A00()) {
                    int hashCode = str2.hashCode();
                    02m r4 = r1.A01;
                    r4.markerStart(28180483, hashCode);
                    HashMap hashMap = new HashMap();
                    hashMap.put(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATE, "PLAYER_ERROR");
                    hashMap.put("time_ms", Long.toString(System.currentTimeMillis()));
                    hashMap.put("video_id", str2);
                    hashMap.put("player_id", String.valueOf(BdG));
                    hashMap.put("vp_session_id", A05);
                    if (str4 != null) {
                        hashMap.put(TraceFieldType.ErrorDomain, str4);
                    }
                    if (name != null) {
                        hashMap.put(TraceFieldType.ErrorCode, name);
                    }
                    if (str5 != null) {
                        hashMap.put("error_details", str5);
                    }
                    2Bq.A0D.A03(28180483, hashCode, hashMap);
                    r4.markerEnd(28180483, hashCode, 2);
                }
            }
        }
    }

    public final void Cjd(C297475ro r19, C263684My r20, C263674Mx r21, Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, int i2, int i3, long j, boolean z) {
        int hashCode;
        0xF r14;
        AnonymousClass4MM r5 = (AnonymousClass4MM) this.A01.get();
        if (r5 != null) {
            String BdG = r5.BdG();
            String A03 = A03();
            if (A03 == null) {
                A03 = "";
            }
            C297475ro r0 = r19;
            int i4 = r0.A00;
            Integer valueOf = Integer.valueOf(i4);
            long j2 = r0.A02;
            Long valueOf2 = Long.valueOf(j2);
            Long valueOf3 = Long.valueOf(j);
            r5.A09("PAUSED: playerid %s for vid %s, stallCount: %d, stallTime: %d, blackscreenDurationMs: %d", BdG, A03, valueOf, valueOf2, valueOf3);
            2C7 A012 = A01();
            if (A012 != null) {
                int currentPosition = r5.getCurrentPosition();
                C255653uU A002 = A00();
                Integer A02 = A02();
                int i5 = (int) j2;
                if (i4 > 0) {
                    r14 = new 0xF();
                    0xF.A00(r14, valueOf, "stall_count");
                    0xF.A00(r14, Integer.valueOf(i5), "stall_time");
                } else {
                    r14 = null;
                }
                A012.A00(A002, r14, A02, "live_video_paused", currentPosition);
            }
            if (r5.A0l && j > 0) {
                AnonymousClass2C6 r02 = this.A00.A02;
                C255653uU A003 = A00();
                if (A003 != null) {
                    String str9 = A003.A0G;
                    if (str9 == null) {
                        hashCode = -1;
                    } else {
                        hashCode = str9.hashCode();
                    }
                    02m r7 = r02.A00;
                    r7.markerStart(61673387, hashCode);
                    C256333vb.A00(r7, 0Yt.A06(new 0eP[]{new 0eP("VIDEO_ID", str9), new 0eP("PLAY_ORIGIN", A003.A0A), new 0eP("VIDEO_CODEC", A003.A0F), new 0eP("FORMAT_TYPE", A003.A07.name()), new 0eP("BLACK_SCREEN_TIME", valueOf3)}), 61673387, hashCode);
                    r7.markerEnd(61673387, hashCode, 2);
                }
            }
        }
    }

    public final void Ck3(AnonymousClass4Yf r8, String str, List list, int i, long j, long j2) {
        Integer valueOf = Integer.valueOf(r8.A05);
        Integer valueOf2 = Integer.valueOf(r8.A04);
        int i2 = r8.A02;
        AnonymousClass4MM r3 = (AnonymousClass4MM) this.A01.get();
        if (r3 != null) {
            String BdG = r3.BdG();
            String A03 = A03();
            if (A03 == null) {
                A03 = "";
            }
            r3.A09("REPRESENTATION_ENDED: playerid [%s] for vid %s: next format bitrate: %d kbps, w: %d, h: %d", BdG, A03, Integer.valueOf(i2 / IgNetworkConsentStorage.MAX_ENTRIES), valueOf, valueOf2);
        }
    }

    public final void Ck6(String str, String str2, int i, long j, long j2) {
        1Cd r1;
        AnonymousClass4MM r3 = (AnonymousClass4MM) this.A01.get();
        if (r3 != null) {
            String BdG = r3.BdG();
            String A03 = A03();
            if (A03 == null) {
                A03 = "";
            }
            r3.A09("REQUESTED_PLAYING: playerId %s may start stall for vid %s", BdG, A03);
            2C7 A012 = A01();
            if (A012 != null) {
                A012.A00(A00(), (0xF) null, A02(), "live_video_requested_playing", i);
            }
            String A032 = A03();
            if (A032 != null && (r1 = this.A00.A07) != null) {
                r1.A0k(A032);
                r1.A0m(A032, r3.A0e.A0y.A06);
            }
        }
    }

    public final void CkW(C263684My r7, C263674Mx r8, String str, int i, long j, boolean z, boolean z2) {
        1Cd r0;
        AnonymousClass4MM r2 = (AnonymousClass4MM) this.A01.get();
        if (r2 != null) {
            String BdG = r2.BdG();
            String A03 = A03();
            if (A03 == null) {
                A03 = "";
            }
            r2.A09("START_BUFFERING: playerId %s for vid %s", BdG, A03);
            2C7 A012 = A01();
            if (A012 != null) {
                A012.A00(A00(), (0xF) null, A02(), "live_video_start_buffering", r2.getCurrentPosition());
            }
            String A032 = A03();
            if (A032 != null && (r0 = this.A00.A07) != null) {
                r0.A0w(A032, z2);
            }
        }
    }

    public final void Ckb(C263684My r13, C263674Mx r14, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, int i2, int i3, long j, boolean z, boolean z2) {
        1Cd r0;
        int i4;
        AnonymousClass4MM r3 = (AnonymousClass4MM) this.A01.get();
        if (r3 != null) {
            String BdG = r3.BdG();
            String A03 = A03();
            if (A03 == null) {
                A03 = "";
            }
            Integer valueOf = Integer.valueOf((int) r3.A09.A0I.A08());
            AnonymousClass4Yf r02 = r3.A0E;
            if (r02 != null) {
                i4 = r02.A02;
            } else {
                i4 = 0;
            }
            r3.A09("STARTED PLAYING: playerId %s start playing for vid %s , position: %d, bitrate: %d kbps, w: %d, h: %d", BdG, A03, valueOf, Integer.valueOf(i4 / IgNetworkConsentStorage.MAX_ENTRIES), Integer.valueOf(r3.A05), Integer.valueOf(r3.A04));
            2C7 A012 = A01();
            if (A012 != null) {
                A012.A00(A00(), (0xF) null, A02(), "live_video_started_playing", r3.getCurrentPosition());
            }
        }
        String A032 = A03();
        if (A032 != null && (r0 = this.A00.A07) != null) {
            r0.A0o(A032, j, str3, str5, str6, str7);
        }
    }

    public final void ClB(C284815Oa r7, AnonymousClass4Yf r8, AnonymousClass4Yf r9, String str, String str2, int i, long j) {
        AnonymousClass4MM r5 = (AnonymousClass4MM) this.A01.get();
        if (r5 != null) {
            String str3 = r8.A0B;
            String str4 = r9.A0B;
            String str5 = r7.A02;
            String BdG = r5.BdG();
            String A03 = A03();
            if (A03 == null) {
                A03 = "";
            }
            r5.A09("VIDEO_PLAYBACK_FALLBACK: playerid [%s] for vid %s: blocked format %s, fallback to format %s, error %s", BdG, A03, str3, str4, str5);
        }
    }

    private final String A03() {
        C255653uU A002 = A00();
        if (A002 != null) {
            return A002.A0G;
        }
        return null;
    }

    public final void Chh(long j, String str, boolean z) {
        1Cd r0;
        String A03 = A03();
        if (A03 != null && (r0 = this.A00.A07) != null) {
            r0.A0c(j, A03, z, str);
        }
    }

    public final void Chj() {
        1Cd r0;
        String A03 = A03();
        if (A03 != null && (r0 = this.A00.A07) != null) {
            r0.A0i(A03);
        }
    }

    public final void CjZ(long j) {
        1Cd r0;
        String A03 = A03();
        if (A03 != null && (r0 = this.A00.A07) != null) {
            r0.A0n(A03, j);
        }
    }

    public final void Cjg(long j, String str) {
        1Cd r0;
        String A03 = A03();
        if (A03 != null && (r0 = this.A00.A07) != null) {
            r0.A0j(A03);
        }
    }

    public final void ClF(C284815Oa r11) {
        String A03 = A03();
        if (A03 != null) {
            2C3 r1 = this.A00.A05;
            String name = r11.A01.name();
            String name2 = r11.A00.name();
            String str = r11.A02;
            if (r1.A03.A00()) {
                int hashCode = A03.hashCode();
                02m r4 = r1.A01;
                r4.markerStart(28180483, hashCode);
                HashMap hashMap = new HashMap();
                hashMap.put(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATE, "PLAYER_WARNING");
                hashMap.put("time_ms", Long.toString(System.currentTimeMillis()));
                hashMap.put("video_id", A03);
                hashMap.put("player_id", "0");
                if (name != null) {
                    hashMap.put(TraceFieldType.ErrorDomain, name);
                }
                if (name2 != null) {
                    hashMap.put(TraceFieldType.ErrorCode, name2);
                }
                if (str != null) {
                    hashMap.put("error_details", str);
                }
                2Bq.A0D.A03(28180483, hashCode, hashMap);
                r4.markerEnd(28180483, hashCode, 2);
            }
        }
    }
}
