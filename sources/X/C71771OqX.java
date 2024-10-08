package X;

import java.util.Set;

/* renamed from: X.OqX  reason: case insensitive filesystem */
public final class C71771OqX implements C74497Pvr {
    public final OLJ A00;
    public final boolean A01;
    public final C70684OGf A02;
    public final Set A03 = DbS.A0y();
    public final boolean A04;

    public final boolean EtZ(C69336Njb njb, String str) {
        0qQ.A0B(njb, 1);
        0eP A1L = AnonymousClass7TE.A1L(str, njb);
        Set set = this.A03;
        if (set.contains(A1L)) {
            return false;
        }
        set.add(A1L);
        return true;
    }

    public static void A00(C14533Txt txt, C71771OqX oqX, String str) {
        txt.CmF("call_type", str);
        txt.CmG("is_rsys", true);
        txt.AAI("call_ui_shown");
        txt.AAI("signaling_connected");
        txt.AAI("media_connected");
        txt.AAI("self_first_frame_rendered");
        txt.AAI("remote_first_frame_rendered");
        if (oqX.A01) {
            txt.AAI("remote_audio_played");
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, X.PxB] */
    /* JADX WARNING: type inference failed for: r1v2, types: [X.FSr, X.PxB] */
    public final C74562PxB BWh(Long l) {
        G8K g8k;
        if (this.A04) {
            OLJ olj = this.A00;
            long A06 = JTS.A06(l);
            C276904u6 r1 = olj.A02;
            synchronized (r1) {
                g8k = (G8K) r1.A00.get(A06);
            }
            if (g8k != null) {
                return new C50185FSr(g8k);
            }
        }
        return new Object();
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [X.FSr, X.PxA] */
    /* JADX WARNING: type inference failed for: r0v4, types: [java.lang.Object, X.PxA] */
    public final C74561PxA C90(Long l) {
        G8K g8k;
        OLJ olj = this.A00;
        long A06 = JTS.A06(l);
        C276904u6 r2 = olj.A02;
        synchronized (r2) {
            g8k = (G8K) r2.A00.get(A06);
        }
        if (g8k == null) {
            return new Object();
        }
        return new C50185FSr(g8k);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00e3, code lost:
        if (r3 == 7) goto L_0x00d7;
     */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0086 A[EDGE_INSN: B:111:0x0086->B:32:0x0086 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0133  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DgO(X.C69662Npk r16, java.lang.Long r17) {
        /*
            r15 = this;
            r1 = r16
            X.OGf r11 = r15.A02
            r0 = r17
            X.PxA r12 = r15.C90(r0)
            r10 = 0
            X.2LV r0 = com.facebook.rsys.state.gen.State.CONVERTER
            X.0qQ.A08(r0)
            X.NDp r1 = (X.C68372NDp) r1
            X.OKD r9 = r1.A00
            java.lang.Object r0 = r9.A00(r0)
            com.facebook.rsys.state.gen.State r0 = (com.facebook.rsys.state.gen.State) r0
            if (r0 == 0) goto L_0x00e2
            int r1 = r0.callState
            r8 = 3
            if (r1 == r8) goto L_0x0186
            r0 = 4
            if (r1 == r0) goto L_0x0186
            r0 = 2
            if (r1 != r0) goto L_0x00e2
            X.2LV r0 = com.facebook.rsys.call.gen.CallModel.CONVERTER
            X.0qQ.A08(r0)
            java.lang.Object r7 = r9.A00(r0)
            if (r7 == 0) goto L_0x0181
            com.facebook.rsys.call.gen.CallModel r7 = (com.facebook.rsys.call.gen.CallModel) r7
            int r6 = r7.inCallState
            int r0 = r11.A00
            r5 = 7
            r4 = 1
            if (r6 == r0) goto L_0x0045
            if (r6 == r4) goto L_0x0040
            if (r6 != r5) goto L_0x0045
        L_0x0040:
            java.lang.String r0 = "signaling_connected"
            r12.AIe(r0)
        L_0x0045:
            com.facebook.rsys.call.gen.CallParticipant r0 = r7.selfParticipant
            int r3 = r0.state
            boolean r0 = r11.A04
            java.lang.String r2 = "remote_first_frame_rendered"
            if (r0 == 0) goto L_0x008d
            if (r6 == r4) goto L_0x0053
            if (r6 != r5) goto L_0x008d
        L_0x0053:
            java.util.ArrayList r1 = r7.remoteParticipants
            X.0qQ.A06(r1)
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L_0x013e
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x013e
        L_0x0062:
            r12.Ey1(r2)
        L_0x0065:
            com.facebook.rsys.call.gen.CallParticipant r0 = r7.selfParticipant
            com.facebook.rsys.call.gen.ParticipantMediaState r0 = r0.mediaState
            java.util.ArrayList r0 = r0.videoStreams
            if (r0 == 0) goto L_0x0086
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0086
            com.facebook.rsys.call.gen.CallParticipant r0 = r7.selfParticipant
            com.facebook.rsys.call.gen.ParticipantMediaState r0 = r0.mediaState
            java.util.ArrayList r1 = r0.videoStreams
            X.0qQ.A06(r1)
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L_0x0129
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x0129
        L_0x0086:
            java.lang.String r0 = "self_first_frame_rendered"
            r12.Ey1(r0)
        L_0x008b:
            r11.A04 = r10
        L_0x008d:
            boolean r0 = r11.A05
            if (r0 == 0) goto L_0x00c9
            boolean r0 = r11.A03
            java.lang.String r1 = "remote_audio_played"
            if (r0 == 0) goto L_0x00af
            if (r6 == r4) goto L_0x009b
            if (r6 != r5) goto L_0x00af
        L_0x009b:
            java.util.ArrayList r13 = r7.remoteParticipants
            X.0qQ.A06(r13)
            boolean r0 = r13 instanceof java.util.Collection
            if (r0 == 0) goto L_0x00e6
            boolean r0 = r13.isEmpty()
            if (r0 == 0) goto L_0x00e6
        L_0x00aa:
            r12.Ey1(r1)
        L_0x00ad:
            r11.A03 = r10
        L_0x00af:
            boolean r0 = r11.A02
            if (r0 != 0) goto L_0x00c9
            X.2LV r0 = com.facebook.rsys.audioevents.gen.AudioEventsModel.CONVERTER
            X.0qQ.A08(r0)
            java.lang.Object r0 = r9.A00(r0)
            com.facebook.rsys.audioevents.gen.AudioEventsModel r0 = (com.facebook.rsys.audioevents.gen.AudioEventsModel) r0
            if (r0 == 0) goto L_0x00c9
            boolean r0 = r0.hasAudioPlayed
            if (r0 == 0) goto L_0x00c9
            r11.A02 = r4
            r12.AIe(r1)
        L_0x00c9:
            int r0 = r11.A01
            if (r3 == r0) goto L_0x00da
            java.lang.String r1 = "media_connected"
            if (r6 != r4) goto L_0x00e3
            r0 = 5
            if (r3 != r0) goto L_0x00e3
            r12.Ey1(r2)
        L_0x00d7:
            r12.AIe(r1)
        L_0x00da:
            r11.A00 = r6
            com.facebook.rsys.call.gen.CallParticipant r0 = r7.selfParticipant
            int r0 = r0.state
            r11.A01 = r0
        L_0x00e2:
            return
        L_0x00e3:
            if (r3 != r5) goto L_0x00da
            goto L_0x00d7
        L_0x00e6:
            java.util.Iterator r14 = r13.iterator()
        L_0x00ea:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x00aa
            java.lang.Object r13 = r14.next()
            com.facebook.rsys.call.gen.CallParticipant r13 = (com.facebook.rsys.call.gen.CallParticipant) r13
            com.facebook.rsys.call.gen.ParticipantMediaState r0 = r13.mediaState
            java.util.ArrayList r0 = r0.audioStreams
            if (r0 == 0) goto L_0x00ea
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x00ea
            com.facebook.rsys.call.gen.ParticipantMediaState r0 = r13.mediaState
            java.util.ArrayList r13 = r0.audioStreams
            X.0qQ.A06(r13)
            boolean r0 = r13 instanceof java.util.Collection
            if (r0 == 0) goto L_0x0114
            boolean r0 = r13.isEmpty()
            if (r0 == 0) goto L_0x0114
            goto L_0x00ea
        L_0x0114:
            java.util.Iterator r13 = r13.iterator()
        L_0x0118:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x00ea
            java.lang.Object r0 = r13.next()
            com.facebook.rsys.audio.gen.AudioStream r0 = (com.facebook.rsys.audio.gen.AudioStream) r0
            int r0 = r0.streamState
            if (r0 == r8) goto L_0x00ad
            goto L_0x0118
        L_0x0129:
            java.util.Iterator r1 = r1.iterator()
        L_0x012d:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0086
            java.lang.Object r0 = r1.next()
            com.facebook.rsys.video.gen.VideoStream r0 = (com.facebook.rsys.video.gen.VideoStream) r0
            int r0 = r0.streamState
            if (r0 == r8) goto L_0x008b
            goto L_0x012d
        L_0x013e:
            java.util.Iterator r13 = r1.iterator()
        L_0x0142:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x0062
            java.lang.Object r1 = r13.next()
            com.facebook.rsys.call.gen.CallParticipant r1 = (com.facebook.rsys.call.gen.CallParticipant) r1
            com.facebook.rsys.call.gen.ParticipantMediaState r0 = r1.mediaState
            java.util.ArrayList r0 = r0.videoStreams
            if (r0 == 0) goto L_0x0142
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0142
            com.facebook.rsys.call.gen.ParticipantMediaState r0 = r1.mediaState
            java.util.ArrayList r1 = r0.videoStreams
            X.0qQ.A06(r1)
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L_0x016c
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x016c
            goto L_0x0142
        L_0x016c:
            java.util.Iterator r1 = r1.iterator()
        L_0x0170:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0142
            java.lang.Object r0 = r1.next()
            com.facebook.rsys.video.gen.VideoStream r0 = (com.facebook.rsys.video.gen.VideoStream) r0
            int r0 = r0.streamState
            if (r0 == r8) goto L_0x0065
            goto L_0x0170
        L_0x0181:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0186:
            r0 = 1
            r11.A04 = r0
            r11.A03 = r0
            r11.A02 = r10
            r11.A00 = r10
            r11.A01 = r10
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71771OqX.DgO(X.Npk, java.lang.Long):void");
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [X.FSr, X.PxA] */
    public final C74561PxA Ex3(Boolean bool, boolean z, boolean z2) {
        Integer num;
        if (z) {
            num = AnonymousClass05K.A0Y;
        } else {
            num = AnonymousClass05K.A0N;
        }
        Boolean valueOf = Boolean.valueOf(z2);
        String str = "group";
        if (3 - num.intValue() == 0) {
            str = "1p";
        }
        C14533Txt A002 = this.A00.A00(816061304);
        if (valueOf != null) {
            A002.CmG("is_video", valueOf.booleanValue());
        }
        A00(A002, this, str);
        return new C50185FSr(A002);
    }

    /* JADX WARNING: type inference failed for: r0v10, types: [X.FSr, X.PxB] */
    /* JADX WARNING: type inference failed for: r0v11, types: [java.lang.Object, X.PxB] */
    public final C74562PxB ExK() {
        if (!this.A04) {
            return new Object();
        }
        C14533Txt A002 = this.A00.A00(746591017);
        A002.AAI("alert_ack_notification");
        A002.AAI("notif_displayed");
        A002.AAI("notification_parsed");
        A002.AAI("notif_removed");
        A002.AAI("reach_rtc_intent_handler_activity");
        A002.AAI("launch_call_activity");
        A002.AAI("call_activity_on_resume");
        A002.AAI("incoming_call_screen_displayed");
        return new C50185FSr(A002);
    }

    public C71771OqX(C70684OGf oGf, OLJ olj, boolean z, boolean z2) {
        this.A01 = z;
        this.A04 = z2;
        this.A00 = olj;
        this.A02 = oGf;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.FSr, X.PxA] */
    public final C74561PxA Ex9(Boolean bool, boolean z) {
        Boolean valueOf = Boolean.valueOf(z);
        C14533Txt A002 = this.A00.A00(816066612);
        if (valueOf != null) {
            A002.CmG("is_video", valueOf.booleanValue());
        }
        A00(A002, this, "group_join");
        return new C50185FSr(A002);
    }

    /* JADX WARNING: type inference failed for: r0v8, types: [X.FSr, X.PxA] */
    public final C74561PxA ExN(Boolean bool, String str, boolean z, boolean z2) {
        Integer A0l = C51967G9n.A0l(z ? 1 : 0);
        Boolean valueOf = Boolean.valueOf(z2);
        int intValue = A0l.intValue();
        String str2 = "group";
        if (intValue == 0) {
            str2 = "1p";
        }
        C14533Txt A002 = this.A00.A00(816066612);
        if (valueOf != null) {
            A002.CmG("is_video", valueOf.booleanValue());
        }
        A002.CmF("call_type", str2);
        A002.CmG("is_rsys", true);
        A002.CmF("link_source", str);
        A002.AAI("call_ui_shown");
        if (intValue != 0) {
            A002.AAI("signaling_connected");
            A002.AAI("media_connected");
        } else {
            A002.AAI("signaling_connected");
        }
        if (AnonymousClass7TF.A1Y(valueOf, true)) {
            A002.AAI("self_first_frame_rendered");
        }
        return new C50185FSr(A002);
    }
}
