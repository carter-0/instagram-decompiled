package X;

import android.view.View;

/* renamed from: X.Oiu  reason: case insensitive filesystem */
public final class C71345Oiu implements View.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;

    public C71345Oiu(Object obj, Object obj2, String str, int i) {
        this.A00 = i;
        this.A02 = obj2;
        this.A03 = str;
        this.A01 = obj;
    }

    /* JADX WARNING: type inference failed for: r1v16, types: [com.facebook.pando.TreeJNI, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r61) {
        /*
            r60 = this;
            r2 = r60
            int r0 = r2.A00
            switch(r0) {
                case 0: goto L_0x02ec;
                case 1: goto L_0x0256;
                case 2: goto L_0x0066;
                default: goto L_0x0007;
            }
        L_0x0007:
            r0 = -844164531(0xffffffffcdaf124d, float:-3.6715152E8)
            int r10 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r6 = r2.A02
            X.OBi r6 = (X.C70560OBi) r6
            java.lang.String r5 = r2.A03
            java.lang.Object r4 = r2.A01
            android.app.Activity r4 = (android.app.Activity) r4
            android.os.Bundle r3 = X.AnonymousClass7TE.A0a()
            java.lang.String r0 = "target_user_id"
            r3.putString(r0, r5)
            if (r5 == 0) goto L_0x0030
            com.instagram.common.session.UserSession r2 = r6.A01
            java.lang.Class<com.instagram.modal.ModalActivity> r1 = com.instagram.modal.ModalActivity.class
            java.lang.String r0 = "recs_from_friends_sender"
            X.6W8 r0 = X.DbW.A0W(r4, r3, r2, r1, r0)
            r0.A0C(r4)
        L_0x0030:
            com.instagram.common.session.UserSession r2 = r6.A01
            X.0iw r0 = r6.A00
            X.ONF r1 = new X.ONF
            r1.<init>(r0, r2)
            java.lang.Long r4 = X.DbZ.A0d(r5)
            java.lang.String r3 = r0.getModuleName()
            java.lang.String r2 = "tap_sender_entry_point"
            r0 = 2
            X.0qQ.A0B(r3, r0)
            X.0wc r1 = r1.A00
            java.lang.String r0 = "ig_recs_from_friends_xma_click_events"
            X.0Aj r1 = X.AnonymousClass7TE.A0e(r1, r0)
            X.DbS.A1J(r1, r2)
            java.lang.String r0 = "target_id"
            r1.A9F(r0, r4)
            java.lang.String r0 = "module"
            r1.AAJ(r0, r3)
            r1.Cgf()
            r0 = 1447082036(0x5640b834, float:5.2974345E13)
        L_0x0062:
            X.AnonymousClass0fD.A0C(r0, r10)
            return
        L_0x0066:
            r0 = 263747426(0xfb87762, float:1.8189785E-29)
            int r10 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r2.A02
            X.NJf r1 = (X.C68467NJf) r1
            X.0eM r0 = r1.A0k
            java.lang.Object r7 = r0.getValue()
            X.MuA r7 = (X.C67755MuA) r7
            androidx.fragment.app.FragmentActivity r27 = r1.requireActivity()
            java.lang.Object r3 = r2.A01
            X.N3C r3 = (X.N3C) r3
            com.instagram.api.schemas.TrackData r1 = r3.A03
            int r0 = r3.A01
            r59 = r0
            int r0 = r3.A00
            r58 = r0
            java.lang.String r0 = r2.A03
            r57 = r0
            r26 = 0
            X.C51972G9s.A1B(r1, r0)
            boolean r52 = r1.getAllowsSaving()
            java.lang.String r9 = r1.getArtistId()
            java.lang.String r8 = r1.getAudioAssetId()
            java.lang.String r6 = r1.getAudioClusterId()
            r1.Arq()
            com.instagram.common.typedurl.ImageUrl r31 = r1.Arr()
            java.lang.String r4 = r1.Av6()
            java.lang.String r3 = r1.getDashManifest()
            java.lang.String r2 = r1.getDisplayArtist()
            java.lang.Integer r0 = r1.AzJ()
            java.lang.String r5 = r1.getFastStartProgressiveDownloadUrl()
            java.lang.Boolean r13 = r1.BBW()
            java.util.List r14 = r1.BDX()
            java.lang.String r15 = r1.getId()
            java.lang.String r25 = r1.getIgUsername()
            java.lang.Boolean r24 = r1.CRq()
            java.lang.Boolean r23 = r1.CSQ()
            boolean r53 = r1.isExplicit()
            com.instagram.api.schemas.LyricsIntf r22 = r1.BOn()
            java.lang.String r21 = r1.getProgressiveDownloadUrl()
            java.lang.String r20 = r1.Bjs()
            java.lang.String r19 = r1.BpH()
            java.lang.String r18 = r1.getSubtitle()
            java.lang.String r17 = r1.getTitle()
            java.lang.String r16 = r1.CGG()
            com.instagram.common.typedurl.ImageUrl r30 = r1.Arr()
            boolean r11 = r1 instanceof com.instagram.api.schemas.ImmutablePandoTrackData
            if (r11 == 0) goto L_0x021d
            com.facebook.pando.TreeUpdaterJNI r11 = com.facebook.pando.TreeUpdaterJNI.$redex_init_class
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r52)
            java.lang.String r11 = "allows_saving"
            X.0eP r32 = X.AnonymousClass7TE.A1L(r11, r12)
            java.lang.String r11 = "artist_id"
            X.0eP r33 = X.AnonymousClass7TE.A1L(r11, r9)
            java.lang.String r9 = "audio_asset_id"
            X.0eP r34 = X.AnonymousClass7TE.A1L(r9, r8)
            java.lang.String r8 = "audio_cluster_id"
            X.0eP r35 = X.AnonymousClass7TE.A1L(r8, r6)
            r6 = 0
            if (r30 == 0) goto L_0x021a
            java.lang.String r9 = r30.getUrl()
        L_0x0124:
            java.lang.String r8 = "cover_artwork_thumbnail_uri"
            X.0eP r36 = X.AnonymousClass7TE.A1L(r8, r9)
            java.lang.String r9 = r31.getUrl()
            java.lang.String r8 = "cover_artwork_uri"
            X.0eP r37 = X.AnonymousClass7TE.A1L(r8, r9)
            java.lang.String r8 = "dark_message"
            X.0eP r38 = X.AnonymousClass7TE.A1L(r8, r4)
            java.lang.String r4 = "dash_manifest"
            X.0eP r39 = X.AnonymousClass7TE.A1L(r4, r3)
            java.lang.String r3 = "display_artist"
            X.0eP r40 = X.AnonymousClass7TE.A1L(r3, r2)
            java.lang.String r2 = "duration_in_ms"
            X.0eP r41 = X.AnonymousClass7TE.A1L(r2, r0)
            java.lang.String r0 = "fast_start_progressive_download_url"
            X.0eP r42 = X.AnonymousClass7TE.A1L(r0, r5)
            java.lang.String r0 = "has_lyrics"
            X.0eP r43 = X.AnonymousClass7TE.A1L(r0, r13)
            java.lang.String r0 = "highlight_start_times_in_ms"
            X.0eP r44 = X.AnonymousClass7TE.A1L(r0, r14)
            java.lang.String r0 = "id"
            X.0eP r45 = X.AnonymousClass7TE.A1L(r0, r15)
            java.lang.String r2 = "ig_username"
            r0 = r25
            X.0eP r46 = X.AnonymousClass7TE.A1L(r2, r0)
            java.lang.String r2 = "is_eligible_for_audio_effects"
            r0 = r24
            X.0eP r47 = X.AnonymousClass7TE.A1L(r2, r0)
            java.lang.String r2 = "is_eligible_for_vinyl_sticker"
            r0 = r23
            X.0eP r48 = X.AnonymousClass7TE.A1L(r2, r0)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r53)
            java.lang.String r0 = "is_explicit"
            X.0eP r49 = X.AnonymousClass7TE.A1L(r0, r2)
            if (r22 == 0) goto L_0x018c
            com.facebook.pando.TreeUpdaterJNI r6 = r22.FHC()
        L_0x018c:
            java.lang.String r0 = "lyrics"
            X.0eP r50 = X.AnonymousClass7TE.A1L(r0, r6)
            java.lang.String r2 = "progressive_download_url"
            r0 = r21
            X.0eP r51 = X.AnonymousClass7TE.A1L(r2, r0)
            java.lang.String r2 = "reactive_audio_download_url"
            r0 = r20
            X.0eP r52 = X.AnonymousClass7TE.A1L(r2, r0)
            java.lang.String r2 = "sanitized_title"
            r0 = r19
            X.0eP r53 = X.AnonymousClass7TE.A1L(r2, r0)
            java.lang.String r2 = "subtitle"
            r0 = r18
            X.0eP r54 = X.AnonymousClass7TE.A1L(r2, r0)
            java.lang.String r2 = "title"
            r0 = r17
            X.0eP r55 = X.AnonymousClass7TE.A1L(r2, r0)
            java.lang.String r2 = "web_30s_preview_download_url"
            r0 = r16
            X.0eP r56 = X.AnonymousClass7TE.A1L(r2, r0)
            X.0eP[] r0 = new X.0eP[]{r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56}
            java.util.LinkedHashMap r2 = X.0Yt.A06(r0)
            com.facebook.pando.TreeJNI r1 = (com.facebook.pando.TreeJNI) r1
            com.facebook.pando.TreeUpdaterJNI r0 = new com.facebook.pando.TreeUpdaterJNI
            r0.<init>(r2, r1)
            com.facebook.pando.TreeJNI r1 = r0.applyToTree(r1)
            X.0qQ.A07(r1)
        L_0x01d8:
            com.instagram.api.schemas.TrackData r1 = (com.instagram.api.schemas.TrackData) r1
            r0 = r26
            com.instagram.music.common.model.MusicAssetModel r3 = com.instagram.music.common.model.MusicAssetModel.A01(r1, r0)
            com.instagram.music.common.model.AudioOverlayTrack r2 = new com.instagram.music.common.model.AudioOverlayTrack
            r1 = r59
            r0 = r58
            r2.<init>(r3, r1, r0)
            java.lang.String r0 = "arg_music_to_preload"
            X.0eP r2 = X.AnonymousClass7TE.A1L(r0, r2)
            java.lang.String r1 = "arg_music_note_original_author_id"
            r0 = r57
            android.os.Bundle r4 = X.AnonymousClass7TG.A0P(r1, r0, r2)
            com.instagram.common.session.UserSession r3 = r7.A02
            java.lang.Class<com.instagram.modal.ModalActivity> r2 = com.instagram.modal.ModalActivity.class
            java.lang.String r1 = "notes_creation"
            r0 = r27
            X.Dbb.A0i(r0, r4, r3, r2, r1)
            X.60k r1 = X.C3018660j.A01(r3)
            X.Nmo r0 = X.C69506Nmo.A0H
            r1.A0B(r0)
            X.43E r1 = new X.43E
            r1.<init>(r3)
            java.lang.Integer r0 = X.AnonymousClass05K.A0u
            r1.A00(r0)
            r0 = 855420342(0x32fcadb6, float:2.9415656E-8)
            goto L_0x0062
        L_0x021a:
            r9 = r6
            goto L_0x0124
        L_0x021d:
            if (r22 == 0) goto L_0x0253
            com.instagram.api.schemas.Lyrics r29 = r22.F5h()
        L_0x0223:
            com.instagram.api.schemas.TrackDataImpl r1 = new com.instagram.api.schemas.TrackDataImpl
            r33 = r24
            r34 = r23
            r35 = r0
            r36 = r9
            r37 = r8
            r38 = r6
            r39 = r4
            r40 = r3
            r41 = r2
            r42 = r5
            r43 = r15
            r44 = r25
            r45 = r21
            r46 = r20
            r47 = r19
            r48 = r18
            r49 = r17
            r50 = r16
            r51 = r14
            r28 = r1
            r32 = r13
            r28.<init>(r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53)
            goto L_0x01d8
        L_0x0253:
            r29 = 0
            goto L_0x0223
        L_0x0256:
            r0 = 243642346(0xe85afea, float:3.295643E-30)
            int r10 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r2.A02
            X.NIz r4 = (X.C68461NIz) r4
            X.OSj r3 = r4.A00
            if (r3 != 0) goto L_0x026f
            java.lang.String r0 = "logger"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x026f:
            java.lang.String r1 = "extend_ad"
            java.lang.String r0 = "ad_action_type"
            java.util.Map r1 = X.AnonymousClass7TF.A0w(r0, r1)
            java.lang.String r0 = "igd_campaign_card_action_button_click"
            X.C70936OSj.A00(r3, r0, r1)
            X.1Yh r11 = X.C18138VmE.A00()
            X.0eM r0 = r4.A04
            com.instagram.common.session.UserSession r13 = X.AnonymousClass7TE.A0l(r0)
            androidx.fragment.app.FragmentActivity r12 = r4.requireActivity()
            java.lang.String r14 = r2.A03
            java.lang.Object r1 = r2.A01
            android.os.Bundle r1 = (android.os.Bundle) r1
            r0 = 1753(0x6d9, float:2.456E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r16 = X.C320236s2.A01(r1, r0)
            r0 = 1754(0x6da, float:2.458E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r17 = X.C320236s2.A01(r1, r0)
            r0 = 582(0x246, float:8.16E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r18 = X.C320236s2.A01(r1, r0)
            r0 = 4028(0xfbc, float:5.644E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            int r20 = r1.getInt(r0)
            r0 = 4122(0x101a, float:5.776E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            int r21 = r1.getInt(r0)
            r0 = 3045(0xbe5, float:4.267E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            int r22 = r1.getInt(r0)
            r0 = 4123(0x101b, float:5.778E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            int r23 = r1.getInt(r0)
            r0 = 761(0x2f9, float:1.066E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            int r24 = r1.getInt(r0)
            r19 = 0
            java.lang.String r15 = "inbox_campaign_message_list"
            r11.A05(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r0 = 366087426(0x15d20d02, float:8.483885E-26)
            goto L_0x0062
        L_0x02ec:
            r0 = 42448672(0x287b720, float:1.9941576E-37)
            int r10 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r12 = r2.A02
            X.NJ7 r12 = (X.NJ7) r12
            X.0eM r0 = r12.A0G
            com.instagram.common.session.UserSession r13 = X.AnonymousClass7TE.A0l(r0)
            java.lang.Object r0 = r2.A01
            android.view.View r0 = (android.view.View) r0
            android.content.Context r11 = X.AnonymousClass7TE.A0S(r0)
            java.lang.String r15 = r2.A03
            X.3t3 r14 = X.NJ7.A00(r12)
            java.lang.String r16 = X.NJ7.A02(r12)
            boolean r18 = X.NJ7.A08(r12)
            boolean r0 = r12.A02
            int r17 = X.C66583MXo.A03(r12)
            r19 = r0
            X.C69934Nua.A00(r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r0 = 881842534(0x348fd966, float:2.6794004E-7)
            goto L_0x0062
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71345Oiu.onClick(android.view.View):void");
    }
}
