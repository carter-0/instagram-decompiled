package com.instagram.music.search;

import X.002;
import X.0Aj;
import X.0eP;
import X.0kD;
import X.0qQ;
import X.0s1;
import X.0wb;
import X.10b;
import X.17W;
import X.1ES;
import X.1Ln;
import X.1NY;
import X.27p;
import X.27r;
import X.28t;
import X.29E;
import X.29H;
import X.29R;
import X.29Z;
import X.2AL;
import X.2b1;
import X.AnonymousClass000;
import X.AnonymousClass00P;
import X.AnonymousClass0iw;
import X.AnonymousClass283;
import X.AnonymousClass4D7;
import X.AnonymousClass4DH;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.AnonymousClass7TH;
import X.AnonymousClass80P;
import X.AnonymousClass80X;
import X.AnonymousClass8ZN;
import X.C14245TsS;
import X.C229122ms;
import X.C229132mt;
import X.C229402nK;
import X.C234462xu;
import X.C234502xy;
import X.C238693Db;
import X.C249383je;
import X.C250563lf;
import X.C252063oV;
import X.C252233om;
import X.C2808154f;
import X.C3251771i;
import X.C3515589i;
import X.C371088xY;
import X.C51965G9l;
import X.C51970G9q;
import X.C51971G9r;
import X.C51973G9u;
import X.C51974G9v;
import X.C54689HOu;
import X.C59689JTv;
import X.C59725JVj;
import X.C60246Ji3;
import X.C60329JjY;
import X.C60353Jk1;
import X.C60379JkY;
import X.C60473Jm5;
import X.C61094Jx5;
import X.C61423K6w;
import X.C61985KUi;
import X.C63352KvZ;
import X.C63353Kva;
import X.C63732L4q;
import X.C63863L9s;
import X.C64161LRc;
import X.C64181LSn;
import X.C65493LuH;
import X.C66447MSb;
import X.C66569MWx;
import X.C697329a;
import X.DbS;
import X.DbT;
import X.DbU;
import X.DbV;
import X.DbW;
import X.DbX;
import X.DbY;
import X.Dba;
import X.JTO;
import X.JTP;
import X.JTQ;
import X.JTR;
import X.JTS;
import X.JV7;
import X.K7A;
import X.L24;
import X.LFN;
import X.MGW;
import X.MJG;
import X.MLE;
import X.MXU;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.common.collect.ImmutableList;
import com.instagram.android.R;
import com.instagram.api.schemas.MusicProduct;
import com.instagram.clips.model.metadata.AudioPageMetadata;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;
import com.instagram.modal.ModalActivity;
import com.instagram.music.common.config.MusicAttributionConfig;
import com.instagram.music.common.constants.AudioTrackType;
import com.instagram.music.common.model.MusicBrowseCategory;
import com.instagram.music.common.model.MusicSearchArtist;
import com.instagram.music.common.model.MusicSearchPlaylist;
import com.instagram.music.common.model.MusicSearchPlaylistType;
import com.instagram.music.search.tabloader.MusicOverlaySearchTab;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class MusicOverlayResultsListController extends C252233om implements C238693Db, MXU {
    public int A00;
    public int A01;
    public int A02;
    public C252063oV A03;
    public MusicBrowseCategory A04;
    public L24 A05;
    public MusicOverlaySearchTab A06;
    public K7A A07;
    public final C59725JVj A08;
    public final MusicProduct A09;
    public final AnonymousClass4DH A0A;
    public final UserSession A0B;
    public final C234502xy A0C;
    public final C63732L4q A0D;
    public final C60379JkY A0E;
    public final LFN A0F;
    public final C60246Ji3 A0G;
    public final C60329JjY A0H;
    public final String A0I;
    public final String A0J;
    public final String A0K;
    public final boolean A0L;
    public final int A0M;
    public final C3515589i A0N;
    public final ImmutableList A0O;
    public final ImmutableList A0P;
    public final 29H A0Q;
    public final C64161LRc A0R = new C64161LRc();
    public final ClipsCreationViewModel A0S;
    public final C229132mt A0T;
    public final MusicAttributionConfig A0U;
    public final C234462xu A0V;
    public final C66447MSb A0W;
    public final C229122ms A0X;
    public final AnonymousClass80X A0Y;
    public final String A0Z;
    public final Map A0a;
    public final boolean A0b;
    public C229402nK dropFrameWatcher;
    public View eligibilityWarningView;
    public LinearLayoutManager layoutManager;
    public View parentView;
    public RecyclerView recyclerView;

    /* JADX WARNING: type inference failed for: r1v0, types: [boolean] */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
        if (r17 == false) goto L_0x0010;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A09(com.instagram.music.common.model.MusicBrowseCategory r13, java.lang.String r14, java.lang.String r15, java.util.List r16, boolean r17, boolean r18) {
        /*
            r12 = this;
            r3 = 0
            r4 = r16
            boolean r1 = X.AnonymousClass7TF.A1U(r3, r14, r4)
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L_0x0010
            r0 = 1
            if (r17 != 0) goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            boolean r0 = r12.A04(r0)
            java.lang.String r5 = "trending"
            java.lang.String r8 = "browse"
            java.lang.String r7 = "clips_browse"
            r6 = 0
            if (r0 == 0) goto L_0x006d
            if (r17 == 0) goto L_0x004e
            if (r13 == 0) goto L_0x004f
            r13.A00()
            java.lang.String r0 = r13.A00()
            boolean r0 = X.0qQ.A0K(r0, r7)
            if (r0 != 0) goto L_0x0043
            java.lang.String r0 = r13.A00()
            boolean r0 = X.0qQ.A0K(r0, r8)
            if (r0 != 0) goto L_0x0043
            java.lang.String r0 = r13.A00()
            boolean r0 = X.0qQ.A0K(r0, r5)
            if (r0 == 0) goto L_0x004e
        L_0x0043:
            X.29H r2 = r12.A0Q
            java.lang.String r1 = r13.A00()
            java.lang.String r0 = "Item List Empty"
            r2.A0E(r0, r1)
        L_0x004e:
            return
        L_0x004f:
            X.29H r2 = r12.A0Q
            java.lang.String r5 = ""
            java.lang.String r4 = "No music available"
            java.lang.String r0 = r2.A05
            if (r0 == 0) goto L_0x005f
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L_0x004e
        L_0x005f:
            X.29E r3 = r2.A0E
            long r7 = r2.A03
            r6 = 17636867(0x10d1e03, float:2.5919142E-38)
            long r0 = r3.A07(r4, r5, r6, r7)
            r2.A03 = r0
            return
        L_0x006d:
            if (r13 == 0) goto L_0x022d
            java.lang.String r0 = r13.A00()
        L_0x0073:
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x022a
            com.google.common.collect.ImmutableList r9 = r12.A0O
            if (r9 == 0) goto L_0x022a
            int r0 = r9.size()
            if (r0 <= r1) goto L_0x022a
            X.89i r2 = r12.A0N
            X.89i r0 = X.C3515589i.POST_CAPTURE_AUDIO_BUTTON
            if (r2 != r0) goto L_0x022a
            com.instagram.common.session.UserSession r0 = r12.A0B
            boolean r0 = X.AnonymousClass8IK.A07(r0)
            if (r0 == 0) goto L_0x022a
            X.LQp r2 = X.JZC.A0J
            X.4DH r0 = r12.A0A
            android.content.Context r0 = r0.requireContext()
            X.JZC r9 = r2.A02(r0, r9)
        L_0x009d:
            if (r15 == 0) goto L_0x00ae
            X.L4q r0 = r12.A0D
            java.util.Map r2 = X.C62557Khn.A01
            java.lang.Object r2 = r2.get(r15)
            if (r2 == 0) goto L_0x00ae
            X.05G r0 = r0.A01
            r0.Epw(r2)
        L_0x00ae:
            X.Ji3 r2 = r12.A0G
            com.instagram.music.common.config.MusicAttributionConfig r0 = r12.A0U
            r2.A01 = r0
            r2.A02 = r9
            java.util.Set r0 = r2.A09
            if (r17 == 0) goto L_0x00bf
            r0.clear()
            r2.A00 = r6
        L_0x00bf:
            r0.addAll(r4)
            r2.A00()
            if (r17 == 0) goto L_0x004e
            if (r13 == 0) goto L_0x017c
            r13.A00()
            java.lang.String r0 = r13.A00()
            boolean r0 = X.0qQ.A0K(r0, r7)
            if (r0 != 0) goto L_0x011b
            java.lang.String r0 = r13.A00()
            boolean r0 = X.0qQ.A0K(r0, r8)
            if (r0 != 0) goto L_0x011b
            java.lang.String r0 = r13.A00()
            boolean r0 = X.0qQ.A0K(r0, r5)
            if (r0 != 0) goto L_0x011b
            java.lang.String r1 = r13.A00()
            java.lang.String r0 = "playlists"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0115
            X.29H r5 = r12.A0Q
            X.29E r4 = r5.A0E
            long r2 = r5.A02
            r1 = 17641988(0x10d3204, float:2.5933494E-38)
            com.facebook.quicklog.reliability.UserFlowLoggerImpl r0 = r4.A00
            r0.flowDrop(r2)
            X.29E.A01(r4, r1, r2)
            java.util.Map r1 = r4.A06
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r1.remove(r0)
            r0 = 17641988(0x10d3204, double:8.7163E-317)
            r5.A02 = r0
        L_0x0115:
            if (r18 == 0) goto L_0x004e
            A03(r12)
            return
        L_0x011b:
            X.29H r4 = r12.A0Q
            java.lang.String r6 = r13.A00()
            int r2 = r6.hashCode()
            r0 = -1380604278(0xffffffffadb5a68a, float:-2.0651276E-11)
            if (r2 == r0) goto L_0x0173
            r0 = -745857242(0xffffffffd38b1f26, float:-1.19504608E12)
            if (r2 == r0) goto L_0x016a
            r0 = 1394955557(0x53255525, float:7.1009809E11)
            if (r2 != r0) goto L_0x013c
            boolean r0 = r6.equals(r5)
            if (r0 == 0) goto L_0x013c
            r4.A0A = r1
        L_0x013c:
            X.29E r5 = r4.A0E
            long r0 = r4.A02
            java.lang.String r2 = "Received response for : "
            X.JTP.A1L(r5, r2, r6, r0)
            boolean r0 = r4.A08
            if (r0 == 0) goto L_0x014d
            boolean r0 = r4.A0A
            if (r0 != 0) goto L_0x0151
        L_0x014d:
            boolean r0 = r4.A09
            if (r0 == 0) goto L_0x0115
        L_0x0151:
            long r1 = r4.A02
            java.lang.String r0 = "music_browser_success_category"
            r5.A09(r1, r0, r6)
            r2 = 17641988(0x10d3204, float:2.5933494E-38)
            long r0 = r4.A02
            long r0 = r5.A02(r2, r0)
            r4.A02 = r0
            r4.A08 = r3
            r4.A0A = r3
            r4.A09 = r3
            goto L_0x0115
        L_0x016a:
            boolean r0 = r6.equals(r7)
            if (r0 == 0) goto L_0x013c
            r4.A09 = r1
            goto L_0x013c
        L_0x0173:
            boolean r0 = r6.equals(r8)
            if (r0 == 0) goto L_0x013c
            r4.A08 = r1
            goto L_0x013c
        L_0x017c:
            X.29H r0 = r12.A0Q
            int r3 = r4.size()
            X.05G r1 = r2.A0C
            java.util.List r5 = X.JTO.A16(r1)
            boolean r1 = r5.isEmpty()
            if (r1 == 0) goto L_0x020e
            r4 = -1
        L_0x018f:
            java.lang.String r1 = r0.A06
            if (r1 == 0) goto L_0x0204
            boolean r1 = r1.equals(r14)
            if (r1 == 0) goto L_0x0204
            java.lang.String r1 = r0.A05
            if (r1 == 0) goto L_0x01c8
            boolean r1 = r1.equals(r14)
            if (r1 == 0) goto L_0x01c8
            int r1 = r0.A00
            if (r1 <= 0) goto L_0x01c2
            if (r3 > 0) goto L_0x01c2
            X.29E r4 = r0.A0E
            long r1 = r0.A0C
            r7 = 17636867(0x10d1e03, float:2.5919142E-38)
            long r8 = r4.A03(r7, r1)
            java.lang.String r2 = r0.A07
            java.lang.String r1 = "search_session_id"
            r4.A09(r8, r1, r2)
            java.lang.String r5 = "Overwriting with empty results"
            java.lang.String r6 = ""
            r4.A07(r5, r6, r7, r8)
        L_0x01c2:
            r0.A05 = r14
            r0.A00 = r3
            goto L_0x0115
        L_0x01c8:
            X.29E r6 = r0.A0E
            long r1 = r0.A03
            java.lang.String r5 = java.lang.String.valueOf(r4)
            java.lang.String r4 = "num_ui_items"
            r6.A09(r1, r4, r5)
            if (r3 <= 0) goto L_0x01e3
            r4 = 17636867(0x10d1e03, float:2.5919142E-38)
            long r1 = r0.A03
            long r1 = r6.A02(r4, r1)
        L_0x01e0:
            r0.A03 = r1
            goto L_0x01c2
        L_0x01e3:
            long r1 = r0.A03
            int r4 = r14.length()
            java.lang.String r5 = java.lang.String.valueOf(r4)
            r4 = 1059(0x423, float:1.484E-42)
            java.lang.String r4 = X.C66579MXk.A00(r4)
            r6.A09(r1, r4, r5)
            long r10 = r0.A03
            java.lang.String r7 = "Search successful but still empty results"
            r9 = 17636867(0x10d1e03, float:2.5919142E-38)
            java.lang.String r8 = ""
            long r1 = r6.A07(r7, r8, r9, r10)
            goto L_0x01e0
        L_0x0204:
            X.29E r5 = r0.A0E
            long r1 = r0.A03
            java.lang.String r4 = "old_results"
            r5.A0C(r4, r1)
            goto L_0x01c2
        L_0x020e:
            r4 = 0
            java.util.Iterator r2 = r5.iterator()
        L_0x0213:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x0224
            java.lang.Object r1 = r2.next()
            boolean r1 = r1 instanceof X.C61993KUq
            if (r1 == 0) goto L_0x0213
            int r4 = r4 + 1
            goto L_0x0213
        L_0x0224:
            int r4 = X.DbT.A02(r5, r4)
            goto L_0x018f
        L_0x022a:
            r9 = r6
            goto L_0x009d
        L_0x022d:
            r0 = r6
            goto L_0x0073
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.music.search.MusicOverlayResultsListController.A09(com.instagram.music.common.model.MusicBrowseCategory, java.lang.String, java.lang.String, java.util.List, boolean, boolean):void");
    }

    public final void D1I(C65493LuH luH) {
        0qQ.A0B(luH, 0);
        MusicBrowseCategory A032 = C64181LSn.A03("category", luH.A00.getId(), luH.A00.getTitle());
        A06();
        A02(A032);
        C64161LRc.A01(this.A08, this.A0B, this.A04.A00(), luH.A00.getTitle(), this.A0J);
    }

    public final void DGl(Fragment fragment) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0041, code lost:
        if (r0 != null) goto L_0x0043;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DXs(com.instagram.music.common.model.MusicSearchPlaylist r12) {
        /*
            r11 = this;
            r0 = 0
            X.0qQ.A0B(r12, r0)
            java.lang.String r1 = X.JTP.A0s(r12)
            java.lang.String r0 = "PLAYLIST_ID.FOR_YOU"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x004c
            com.instagram.music.common.model.MusicBrowseCategory r0 = r11.A04
            java.lang.String r8 = r0.A04
            java.lang.String r4 = ""
            if (r8 != 0) goto L_0x0019
            r8 = r4
        L_0x0019:
            X.4DH r0 = r11.A0A
            android.content.res.Resources r1 = X.DbV.A05(r0)
            r0 = 2131967821(0x7f133f4d, float:1.957252E38)
            java.lang.String r9 = X.AnonymousClass7TF.A0d(r1, r0)
            com.instagram.music.common.model.MusicBrowseCategory r0 = r11.A04
            android.os.Bundle r5 = r0.A00
            r10 = 0
            com.instagram.music.common.model.MusicSearchPlaylistType r6 = r0.A01
            java.lang.String r7 = "trending"
            com.instagram.music.common.model.MusicBrowseCategory r0 = X.C64181LSn.A00(r5, r6, r7, r8, r9, r10)
            r11.A06()
            r11.A02(r0)
            com.instagram.common.session.UserSession r3 = r11.A0B
            java.lang.String r2 = r0.A00()
            java.lang.String r0 = r0.A06
            if (r0 == 0) goto L_0x0044
        L_0x0043:
            r4 = r0
        L_0x0044:
            java.lang.String r1 = r11.A0J
            X.JVj r0 = r11.A08
            X.C64161LRc.A01(r0, r3, r2, r4, r1)
            return
        L_0x004c:
            X.LSn r0 = com.instagram.music.common.model.MusicBrowseCategory.A08
            com.instagram.music.common.model.MusicBrowseCategory r0 = r0.A04(r12)
            r11.A06()
            r11.A02(r0)
            X.29H r1 = r11.A0Q
            r0 = 901(0x385, float:1.263E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r1.A07(r0)
            com.instagram.common.session.UserSession r3 = r11.A0B
            com.instagram.music.common.model.MusicBrowseCategory r0 = r11.A04
            java.lang.String r2 = r0.A00()
            java.lang.String r0 = X.JTQ.A0b(r12)
            goto L_0x0043
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.music.search.MusicOverlayResultsListController.DXs(com.instagram.music.common.model.MusicSearchPlaylist):void");
    }

    public final void Dhc(MusicSearchArtist musicSearchArtist, int i) {
        A06();
        Bundle A0a2 = AnonymousClass7TE.A0a();
        A0a2.putString("music_search_session_id", musicSearchArtist.A00);
        C61094Jx5 jx5 = (C61094Jx5) musicSearchArtist.A01;
        String str = jx5.A03;
        String str2 = jx5.A01;
        if (str2 != null) {
            A02(C64181LSn.A00(A0a2, (MusicSearchPlaylistType) null, "artist_song_list", str, str2, (String) null));
            UserSession userSession = this.A0B;
            String str3 = this.A0J;
            String str4 = this.A0K;
            MusicProduct musicProduct = this.A09;
            C59725JVj jVj = this.A08;
            0qQ.A0B(userSession, 0);
            C51974G9v.A1M(str3, str4, musicProduct);
            0qQ.A0B(jVj, 6);
            27r A012 = 27p.A01(userSession);
            String str5 = musicSearchArtist.A00;
            29Z r3 = A012.A0F;
            0Aj A0d = JTR.A0d(r3);
            if (A0d.isSampled()) {
                JTO.A1O(AnonymousClass80P.MUSIC_ARTIST, A0d);
                JTO.A1T(A0d, "IG_CAMERA_MUSIC_BROWSE_ARTIST_SELECT");
                AnonymousClass283 r9 = r3.A04;
                JTO.A1S(A0d, JTP.A0p(r9));
                A0d.AAJ("artist_name", str2);
                A0d.A9F("artist_id", C51971G9r.A0n(0, str));
                JTQ.A12(A0d, r3);
                JTS.A14(r9.A09, A0d);
                A0d.AAJ("browse_session_id", str3);
                A0d.AAJ("alacorn_session_id", str5);
                JTR.A1J(A0d, musicProduct);
                DbS.A1K(A0d, str4);
                C51965G9l.A1A(jVj, A0d);
                A0d.A9F("audio_index", DbS.A0j(i));
                DbY.A1C(A0d);
                JTS.A1A(A0d, r3);
                A0d.Cgf();
                return;
            }
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final void Dhd(MusicSearchArtist musicSearchArtist, int i) {
        C64161LRc lRc = this.A0R;
        UserSession userSession = this.A0B;
        String str = this.A0J;
        String str2 = this.A0K;
        MusicProduct musicProduct = this.A09;
        C59725JVj jVj = this.A08;
        0qQ.A0B(userSession, 0);
        C51974G9v.A1M(str, str2, musicProduct);
        0qQ.A0B(jVj, 6);
        Set set = lRc.A03;
        C61094Jx5 jx5 = (C61094Jx5) musicSearchArtist.A01;
        String str3 = jx5.A03;
        if (set.add(str3)) {
            27r A012 = 27p.A01(userSession);
            String str4 = musicSearchArtist.A00;
            C697329a r3 = A012.A0G;
            0Aj A0e = AnonymousClass7TE.A0e(r3.A01, "ig_camera_ui_tool_impression");
            if (A0e.isSampled()) {
                JTO.A1O(AnonymousClass80P.MUSIC_ARTIST, A0e);
                JTO.A1T(A0e, "IG_CAMERA_MUSIC_BROWSE_ARTIST_IMPRESSION");
                AnonymousClass283 r9 = r3.A04;
                JTO.A1S(A0e, JTP.A0p(r9));
                A0e.AAJ("artist_name", jx5.A01);
                A0e.A9F("artist_id", C51971G9r.A0n(0, str3));
                JTQ.A12(A0e, r3);
                JTS.A14(r9.A09, A0e);
                A0e.AAJ("browse_session_id", str);
                A0e.AAJ("alacorn_session_id", str4);
                JTR.A1J(A0e, musicProduct);
                A0e.A9F("audio_index", DbV.A0p(A0e, "module", str2, i));
                C51965G9l.A1A(jVj, A0e);
                DbY.A1C(A0e);
                JTS.A1A(A0e, r3);
                A0e.Cgf();
            }
        }
    }

    public final void Dhl(String str) {
        this.A0C.EHu(false);
        L24 l24 = this.A05;
        if (l24 != null) {
            l24.A00.Dhl(str);
        }
    }

    public final void Dm9(AudioPageMetadata audioPageMetadata, C66569MWx mWx, MusicSearchPlaylist musicSearchPlaylist, String str, String str2, int i) {
        C64161LRc lRc = this.A0R;
        UserSession userSession = this.A0B;
        lRc.A05(userSession, mWx, JTP.A0s(musicSearchPlaylist), JTQ.A0b(musicSearchPlaylist), i);
        Bundle A022 = C250563lf.A02((C54689HOu) null, AnonymousClass8ZN.CAMERA_AUDIO_BROWSER_ARTIST_SPOTLIGHT, audioPageMetadata, str2);
        A022.putBoolean(AnonymousClass000.A00(890), true);
        AnonymousClass4DH r2 = this.A0A;
        Dba.A0K(r2.requireActivity(), A022, userSession, ModalActivity.class, "audio_page").A0D(r2, 9688);
    }

    public final void DmA(AnonymousClass0iw r10, C66569MWx mWx, MusicSearchPlaylist musicSearchPlaylist, int i) {
        0qQ.A0B(r10, 1);
        UserSession userSession = this.A0B;
        String A0s = JTP.A0s(musicSearchPlaylist);
        String A0b2 = JTQ.A0b(musicSearchPlaylist);
        String moduleName = r10.getModuleName();
        String str = this.A0J;
        C64161LRc.A00(this.A08, this.A09, userSession, mWx, A0s, A0b2, moduleName, str, i);
    }

    public final void DnN(C66569MWx mWx, String str, int i) {
        0qQ.A0B(str, 2);
        this.A0C.EHu(false);
        this.A0E.notifyItemChanged(i);
        UserSession userSession = this.A0B;
        int A002 = A00(mWx, this);
        String str2 = this.A0I;
        String A003 = this.A04.A00();
        String str3 = this.A04.A06;
        String str4 = this.A0J;
        MusicProduct musicProduct = this.A09;
        C59725JVj jVj = this.A08;
        boolean A1X = AnonymousClass7TG.A1X((Boolean) this.A0H.A00(mWx).A02());
        AnonymousClass7TF.A1D(userSession, 0, str2);
        C51973G9u.A0t(7, str4, musicProduct, jVj);
        if (str.length() == 0) {
            str = "unknown";
        }
        27r A012 = 27p.A01(userSession);
        if (str3 == null) {
            str3 = "";
        }
        29R r6 = A012.A09;
        1Ln A0N2 = JTO.A0N(r6);
        if (DbT.A1Y(A0N2)) {
            A0N2.A0t("IG_CAMERA_MUSIC_BROWSE_SONG_PREVIEW_PAUSE");
            A0N2.A0r("MUSIC_BROWSE_SONG_PREVIEW_PAUSE");
            29R.A00(A0N2, r6);
            A0N2.A0R("artist_name", mWx.getDisplayArtist());
            A0N2.A0Q("audio_asset_id", C51971G9r.A0n(0, mWx.getId()));
            A0N2.A0Q("audio_cluster_id", 2AL.A08(mWx.getAudioClusterId()));
            A0N2.A0Q("audio_index", DbS.A0j(A002));
            A0N2.A0R("song_name", mWx.getTitle());
            JTQ.A18(A0N2, r6);
            A0N2.A0R("category", A003);
            A0N2.A0R("subcategory", str3);
            AnonymousClass283 r4 = r6.A04;
            A0N2.A0b(r4.A09);
            A0N2.A0W(2);
            A0N2.A0R("browse_session_id", str4);
            JTQ.A1A(A0N2);
            A0N2.A0R("section_name", str);
            Long A0m = C51971G9r.A0m();
            A0N2.A0Q("section_index", A0m);
            A0N2.A0R("audio_browser_surface", str2);
            A0N2.A0R("audio_type", mWx.CAc().A00);
            A0N2.A0a(r6.A0J());
            A0N2.A0V(JTR.A0D(r4));
            A0N2.A0Q("capture_format_index", A0m);
            A0N2.A0d(jVj);
            A0N2.A0c(r4.A0A);
            A0N2.A0O("is_bookmarked", Boolean.valueOf(A1X));
            JTS.A1E(A0N2);
        }
    }

    public final void EHe(C66569MWx mWx, String str) {
        String str2 = str;
        0qQ.A0B(str, 1);
        C66569MWx mWx2 = mWx;
        if (mWx != null) {
            A04(AnonymousClass7TF.A1Q(this.A0G.A09.size()));
            this.A0H.A01(mWx, new MJG(mWx2, this, str2, A00(mWx, this), true, true), MLE.A00, true);
        }
    }

    public final void EHh(C66569MWx mWx, String str) {
        String str2 = str;
        0qQ.A0B(str, 1);
        C66569MWx mWx2 = mWx;
        if (mWx != null) {
            A04(AnonymousClass7TF.A1Q(this.A0G.A09.size()));
            this.A0H.A01(mWx, new MJG(mWx2, this, str2, A00(mWx, this), false, false), MLE.A00, false);
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        0qQ.A0B(view, 0);
        this.parentView = view;
        RecyclerView A0I2 = DbT.A0I(view, R.id.music_list);
        0qQ.A0B(A0I2, 0);
        this.recyclerView = A0I2;
        A05().setAdapter(this.A0E);
        View view2 = this.parentView;
        if (view2 != null) {
            View findViewById = view2.findViewById(R.id.music_search_no_results);
            boolean z = false;
            if (findViewById != null) {
                this.A03 = 2b1.A01(findViewById, false, false);
            }
            View view3 = this.parentView;
            if (view3 != null) {
                View findViewById2 = view3.findViewById(R.id.import_oa_gallery_container);
                if (0qQ.A0K(this.A04.A00(), "gallery")) {
                    UserSession userSession = this.A0B;
                    27r A012 = 27p.A01(userSession);
                    A012.A1Q(A012.A04.A0C, "AUDIO_BROWSER_IMPORT_TAB");
                    0qQ.A0B(userSession, 0);
                    K7A k7a = new K7A();
                    k7a.setArguments(DbY.A09(userSession));
                    this.A07 = k7a;
                    0s1 A0C2 = DbW.A0C(this.A0A);
                    K7A k7a2 = this.A07;
                    if (k7a2 != null) {
                        A0C2.A0A(k7a2, R.id.import_oa_gallery_container);
                        A0C2.A00();
                        if (findViewById2 != null) {
                            findViewById2.setVisibility(0);
                        }
                    } else {
                        throw AnonymousClass7TE.A0y();
                    }
                }
                this.layoutManager = new LinearLayoutManager(A05().getContext());
                RecyclerView A052 = A05();
                LinearLayoutManager linearLayoutManager = this.layoutManager;
                if (linearLayoutManager != null) {
                    A052.setLayoutManager(linearLayoutManager);
                    int i = C249383je.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
                    Fragment fragment = this.A0A;
                    C229402nK r0 = new C229402nK(fragment.requireActivity(), DbS.A0O(002.A0R("music_browser_", this.A04.A00())), this.A0B, 23592974);
                    this.dropFrameWatcher = r0;
                    fragment.registerLifecycleListener(r0);
                    RecyclerView A053 = A05();
                    C229402nK r02 = this.dropFrameWatcher;
                    if (r02 != null) {
                        A053.A15(r02);
                        C60473Jm5.A00(A05(), this, 12);
                        RecyclerView A054 = A05();
                        C229132mt r2 = this.A0T;
                        C3251771i r1 = C3251771i.A0G;
                        LinearLayoutManager linearLayoutManager2 = this.layoutManager;
                        if (linearLayoutManager2 != null) {
                            JTQ.A0y(linearLayoutManager2, A054, r2, r1);
                            A05().setItemAnimator(new C60353Jk1());
                            A05().setPadding(A05().getPaddingLeft(), A05().getPaddingTop(), A05().getPaddingRight(), this.A0M);
                            fragment.addFragmentVisibilityListener(this);
                            if (!this.A0X.isLoading()) {
                                if (this.A0G.A09.size() == 0) {
                                    z = true;
                                }
                                A04(z);
                            }
                            JTS.A10(fragment, new MGW(this, view, (AnonymousClass4D7) null, 35), 10b.A03(this.A0D.A01));
                            A01(view, this);
                            return;
                        }
                    } else {
                        str = "dropFrameWatcher";
                        0qQ.A0F(str);
                        throw AnonymousClass00P.createAndThrow();
                    }
                }
                str = "layoutManager";
                0qQ.A0F(str);
                throw AnonymousClass00P.createAndThrow();
            }
        }
        str = "parentView";
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0036, code lost:
        if (((X.KV4) r1).A00(r4) == false) goto L_0x0038;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final int A00(X.C66569MWx r4, com.instagram.music.search.MusicOverlayResultsListController r5) {
        /*
            androidx.recyclerview.widget.LinearLayoutManager r0 = r5.layoutManager
            r3 = -1
            if (r0 == 0) goto L_0x0050
            int r2 = r0.A1a()
        L_0x0009:
            X.JkY r1 = r5.A0E
            int r0 = r1.getItemCount()
            if (r2 >= r0) goto L_0x0050
            androidx.recyclerview.widget.LinearLayoutManager r0 = r5.layoutManager
            if (r0 == 0) goto L_0x0046
            int r0 = r0.A1b()
            if (r2 > r0) goto L_0x0050
            if (r2 == r3) goto L_0x0050
            X.2re r0 = r1.mDiffer
            java.util.List r0 = r0.A02
            java.lang.Object r1 = r0.get(r2)
            X.L25 r1 = (X.L25) r1
            r0 = 0
            X.0qQ.A0B(r1, r0)
            boolean r0 = r1 instanceof X.KV4
            if (r0 == 0) goto L_0x0038
            X.KV4 r1 = (X.KV4) r1
            boolean r1 = r1.A00(r4)
            r0 = 1
            if (r1 != 0) goto L_0x0039
        L_0x0038:
            r0 = 0
        L_0x0039:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0051
            int r2 = r2 + 1
            goto L_0x0009
        L_0x0046:
            java.lang.String r0 = "layoutManager"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0050:
            r2 = -1
        L_0x0051:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.music.search.MusicOverlayResultsListController.A00(X.MWx, com.instagram.music.search.MusicOverlayResultsListController):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00b3, code lost:
        if (r0 != 0) goto L_0x00b5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(android.view.View r13, com.instagram.music.search.MusicOverlayResultsListController r14) {
        /*
            X.L4q r2 = r14.A0D
            X.05G r11 = r2.A01
            java.lang.Object r0 = r11.getValue()
            X.Khn r10 = X.C62557Khn.BUSINESS_ACCOUNT
            if (r0 == r10) goto L_0x0014
            java.lang.Object r1 = r11.getValue()
            X.Khn r0 = X.C62557Khn.UNLAUNCHED_COUNTRY
            if (r1 != r0) goto L_0x00c8
        L_0x0014:
            com.instagram.common.session.UserSession r7 = r2.A00
            X.0Tu r2 = X.0Tu.A05
            r0 = 36326481202329376(0x810ebe00013720, double:3.0363512151274954E-306)
            boolean r0 = X.182.A06(r2, r7, r0)
            if (r0 == 0) goto L_0x00c8
            r0 = 2131435420(0x7f0b1f9c, float:1.8492682E38)
            android.view.ViewStub r1 = X.DbS.A0F(r13, r0)
            if (r1 == 0) goto L_0x003c
            android.view.ViewParent r0 = r1.getParent()
            if (r0 == 0) goto L_0x003c
            android.view.View r1 = r1.inflate()
            r0 = 0
            X.0qQ.A0B(r1, r0)
            r14.eligibilityWarningView = r1
        L_0x003c:
            X.4DH r0 = r14.A0A
            boolean r0 = r0 instanceof X.C61423K6w
            if (r0 == 0) goto L_0x00b9
            android.view.View r5 = r14.eligibilityWarningView
            if (r5 == 0) goto L_0x00cf
            java.lang.String r0 = "null cannot be cast to non-null type android.widget.TextView"
            X.0qQ.A0C(r5, r0)
            android.widget.TextView r5 = (android.widget.TextView) r5
            android.content.Context r6 = r13.getContext()
            r0 = 2130970724(0x7f040864, float:1.7550166E38)
        L_0x0054:
            int r4 = X.2Yu.A0F(r6, r0)
            X.0qQ.A07(r6)
            r0 = 2131964884(0x7f1333d4, float:1.9566562E38)
            java.lang.String r3 = X.AnonymousClass7TE.A16(r6, r0)
            java.lang.Object r0 = r11.getValue()
            r12 = 2
            r8 = 1
            if (r0 != r10) goto L_0x0091
            r0 = 36607956179228301(0x820ebe0004168d, double:3.2143571239271335E-306)
            long r1 = X.182.A01(r2, r7, r0)
            int r0 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r0 != 0) goto L_0x00ae
            r1 = 2131967770(0x7f133f1a, float:1.9572416E38)
        L_0x007c:
            java.lang.String r1 = X.AnonymousClass7TE.A16(r6, r1)
            X.Kas r0 = new X.Kas
            r0.<init>((com.instagram.music.search.MusicOverlayResultsListController) r14, (int) r4)
            X.AnonymousClass7AV.A07(r0, r5, r3, r1)
            android.view.View r1 = r14.eligibilityWarningView
            if (r1 == 0) goto L_0x0090
            r0 = 0
        L_0x008d:
            r1.setVisibility(r0)
        L_0x0090:
            return
        L_0x0091:
            java.lang.Object r1 = r11.getValue()
            X.Khn r0 = X.C62557Khn.UNLAUNCHED_COUNTRY
            if (r1 != r0) goto L_0x00b5
            r0 = 36607956179293838(0x820ebe0005168e, double:3.2143571239685794E-306)
            long r1 = X.182.A01(r2, r7, r0)
            int r0 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r0 == 0) goto L_0x00aa
            int r0 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r0 != 0) goto L_0x00b5
        L_0x00aa:
            r1 = 2131967773(0x7f133f1d, float:1.9572422E38)
            goto L_0x007c
        L_0x00ae:
            int r0 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            r1 = 2131967771(0x7f133f1b, float:1.9572418E38)
            if (r0 == 0) goto L_0x007c
        L_0x00b5:
            r1 = 2131967772(0x7f133f1c, float:1.957242E38)
            goto L_0x007c
        L_0x00b9:
            r0 = 2131435421(0x7f0b1f9d, float:1.8492684E38)
            android.widget.TextView r5 = X.AnonymousClass7TG.A0R(r13, r0)
            android.content.Context r6 = r13.getContext()
            r0 = 2130970725(0x7f040865, float:1.7550168E38)
            goto L_0x0054
        L_0x00c8:
            android.view.View r1 = r14.eligibilityWarningView
            if (r1 == 0) goto L_0x0090
            r0 = 8
            goto L_0x008d
        L_0x00cf:
            java.lang.String r0 = "eligibilityWarningView"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.music.search.MusicOverlayResultsListController.A01(android.view.View, com.instagram.music.search.MusicOverlayResultsListController):void");
    }

    private final void A02(MusicBrowseCategory musicBrowseCategory) {
        C66447MSb mSb = this.A0W;
        if (mSb == null) {
            0kD.A05("MusicOverlayResultsListController", "itemSelectionController is null in navigateToDetailFragment()", (Throwable) null);
            return;
        }
        UserSession userSession = this.A0B;
        MusicProduct musicProduct = this.A09;
        ImmutableList immutableList = this.A0P;
        String str = this.A0J;
        AnonymousClass80X r14 = this.A0Y;
        C59725JVj jVj = this.A08;
        C3515589i r5 = this.A0N;
        ImmutableList immutableList2 = this.A0O;
        int i = this.A0M;
        boolean z = this.A0b;
        C61423K6w A002 = C63352KvZ.A00(r5, jVj, immutableList, immutableList2, musicProduct, userSession, (MusicAttributionConfig) null, musicBrowseCategory, (MusicOverlaySearchTab) null, r14, str, (String) null, "full_list", this.A0a, i, false, z);
        A002.A05 = mSb;
        C234462xu r0 = this.A0V;
        if (r0 != null) {
            A002.A03 = r0;
        }
        C63353Kva.A00(this.A0A, A002, this.A0L);
    }

    public static final void A03(MusicOverlayResultsListController musicOverlayResultsListController) {
        int size = musicOverlayResultsListController.A0G.A09.size() / 2;
        LinearLayoutManager linearLayoutManager = musicOverlayResultsListController.layoutManager;
        if (linearLayoutManager == null) {
            0qQ.A0F("layoutManager");
            throw AnonymousClass00P.createAndThrow();
        } else if (size >= linearLayoutManager.A1a() && size <= linearLayoutManager.A1b()) {
            musicOverlayResultsListController.A0T.ACw();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00cb, code lost:
        if (X.0qQ.A0K(r1, "server_loaded") != false) goto L_0x003e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean A04(boolean r9) {
        /*
            r8 = this;
            com.instagram.music.common.model.MusicBrowseCategory r0 = r8.A04
            java.lang.String r1 = r0.A00()
            java.lang.String r0 = "gallery"
            boolean r0 = X.0qQ.A0K(r1, r0)
            r3 = 8
            r2 = 0
            if (r0 == 0) goto L_0x0020
            androidx.recyclerview.widget.RecyclerView r0 = r8.A05()
            r0.setVisibility(r3)
        L_0x0018:
            X.3oV r0 = r8.A03
            if (r0 == 0) goto L_0x001f
            r0.setVisibility(r3)
        L_0x001f:
            return r2
        L_0x0020:
            boolean r0 = r8.A0L
            if (r0 != 0) goto L_0x00b9
            com.instagram.music.common.model.MusicBrowseCategory r0 = r8.A04
            java.lang.String r1 = r0.A00()
            java.lang.String r0 = "playlists"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x00b9
            com.instagram.music.common.model.MusicBrowseCategory r0 = r8.A04
            java.lang.String r1 = r0.A04
            java.lang.String r0 = "bookmarked"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x00b9
        L_0x003e:
            androidx.recyclerview.widget.RecyclerView r0 = r8.A05()
            if (r9 == 0) goto L_0x00d1
            r0.setVisibility(r3)
            X.3oV r1 = r8.A03
            r7 = 1
            if (r1 == 0) goto L_0x00ad
            boolean r0 = r1.CVM()
            if (r0 != 0) goto L_0x00ad
            r0 = 0
            android.view.View r3 = r1.getView()
            if (r3 == 0) goto L_0x00d6
            r1 = 2131436730(0x7f0b24ba, float:1.8495339E38)
            android.widget.ImageView r6 = X.DbX.A0J(r3, r1)
            r1 = 2131436731(0x7f0b24bb, float:1.849534E38)
            android.widget.TextView r5 = X.AnonymousClass7TG.A0R(r3, r1)
            r1 = 2131436729(0x7f0b24b9, float:1.8495337E38)
            android.widget.TextView r4 = X.AnonymousClass7TG.A0R(r3, r1)
            com.instagram.music.search.tabloader.MusicOverlaySearchTab r1 = r8.A06
            if (r1 == 0) goto L_0x00b7
            com.instagram.music.common.model.MusicBrowseCategory r1 = r1.A01
            if (r1 == 0) goto L_0x00b7
            java.lang.String r3 = r1.A00()
        L_0x007a:
            java.lang.String r1 = "server_loaded"
            boolean r1 = X.0qQ.A0K(r3, r1)
            if (r1 == 0) goto L_0x00ad
            com.instagram.music.search.tabloader.MusicOverlaySearchTab r1 = r8.A06
            if (r1 == 0) goto L_0x00b5
            com.instagram.music.common.model.MusicBrowseCategory r1 = r1.A01
            if (r1 == 0) goto L_0x00b5
            java.lang.String r3 = r1.A03
        L_0x008c:
            java.lang.String r1 = "bookmarked"
            boolean r1 = X.0qQ.A0K(r3, r1)
            if (r1 != 0) goto L_0x00ad
            r1 = 2131238577(0x7f081eb1, float:1.8093437E38)
            r6.setImageResource(r1)
            r1 = 2131967779(0x7f133f23, float:1.9572434E38)
            r5.setText(r1)
            com.instagram.music.search.tabloader.MusicOverlaySearchTab r1 = r8.A06
            if (r1 == 0) goto L_0x00aa
            com.instagram.music.common.model.MusicBrowserCategoryModel r1 = r1.A02
            if (r1 == 0) goto L_0x00aa
            java.lang.String r0 = r1.A02
        L_0x00aa:
            r4.setText(r0)
        L_0x00ad:
            X.3oV r0 = r8.A03
            if (r0 == 0) goto L_0x00b4
            r0.setVisibility(r2)
        L_0x00b4:
            return r7
        L_0x00b5:
            r3 = 0
            goto L_0x008c
        L_0x00b7:
            r3 = 0
            goto L_0x007a
        L_0x00b9:
            com.instagram.music.search.tabloader.MusicOverlaySearchTab r0 = r8.A06
            if (r0 == 0) goto L_0x00cf
            com.instagram.music.common.model.MusicBrowseCategory r0 = r0.A01
            if (r0 == 0) goto L_0x00cf
            java.lang.String r1 = r0.A00()
        L_0x00c5:
            java.lang.String r0 = "server_loaded"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x001f
            goto L_0x003e
        L_0x00cf:
            r1 = 0
            goto L_0x00c5
        L_0x00d1:
            r0.setVisibility(r2)
            goto L_0x0018
        L_0x00d6:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.music.search.MusicOverlayResultsListController.A04(boolean):boolean");
    }

    public final RecyclerView A05() {
        RecyclerView recyclerView2 = this.recyclerView;
        if (recyclerView2 != null) {
            return recyclerView2;
        }
        0qQ.A0F("recyclerView");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void A06() {
        if (this.A0A.isResumed()) {
            A05().requestFocus();
        }
    }

    public final void A07() {
        A02(C64181LSn.A03("gallery", "import", DbU.A0m(this.A0A, 2131964181)));
    }

    public final boolean A0A() {
        K7A k7a = this.A07;
        if (k7a != null) {
            if (!k7a.isScrolledToBottom()) {
                return false;
            }
        } else if (this.layoutManager == null) {
            return false;
        }
        LinearLayoutManager linearLayoutManager = this.layoutManager;
        if (linearLayoutManager == null) {
            0qQ.A0F("layoutManager");
            throw AnonymousClass00P.createAndThrow();
        } else if (C2808154f.A02(linearLayoutManager)) {
            return true;
        } else {
            return false;
        }
    }

    public final boolean A0B() {
        View A0X2;
        K7A k7a = this.A07;
        if (k7a != null) {
            return k7a.isScrolledToTop();
        }
        LinearLayoutManager linearLayoutManager = this.layoutManager;
        if (linearLayoutManager == null || (A0X2 = linearLayoutManager.A0X(0)) == null) {
            return true;
        }
        int A1a = linearLayoutManager.A1a();
        Rect A0W2 = AnonymousClass7TE.A0W();
        A0X2.getLocalVisibleRect(A0W2);
        if (A1a == 0 && A0W2.top == 0) {
            return true;
        }
        return false;
    }

    public final void DGh(Fragment fragment) {
        this.A0C.release();
    }

    public final void DHj(JV7 jv7) {
        MusicBrowseCategory A032 = C64181LSn.A03("genres", jv7.A01, jv7.A02);
        A06();
        A02(A032);
    }

    public final void DSI(JV7 jv7) {
        MusicBrowseCategory A032 = C64181LSn.A03("moods", jv7.A01, jv7.A02);
        A06();
        A02(A032);
    }

    public final void DXR(C66569MWx mWx, String str, int i) {
        String str2;
        String str3 = str;
        0qQ.A0B(str3, 2);
        UserSession userSession = this.A0B;
        C66569MWx mWx2 = mWx;
        A00(mWx2, this);
        String str4 = this.A0I;
        MusicBrowseCategory musicBrowseCategory = this.A04;
        String str5 = this.A0J;
        MusicProduct musicProduct = this.A09;
        C59725JVj jVj = this.A08;
        AnonymousClass7TF.A1D(userSession, 0, str4);
        0qQ.A0B(musicBrowseCategory, 6);
        C51973G9u.A0t(7, str5, musicProduct, jVj);
        if (str3.length() == 0) {
            str3 = "unknown";
        }
        29H r3 = 27p.A01(userSession).A03;
        29E r2 = r3.A0E;
        long A032 = r2.A03(17645025, r3.A0D);
        r3.A04 = A032;
        r2.A09(A032, "use_case", "music_overlay_results_play_icon");
        27r A012 = 27p.A01(userSession);
        musicBrowseCategory.A00();
        String str6 = musicBrowseCategory.A04;
        0Aj A0e = AnonymousClass7TE.A0e(A012.A01, "ig_camera_music_browse_song_preview");
        if (A0e.isSampled()) {
            AnonymousClass283 r0 = A012.A04;
            String str7 = r0.A0L;
            if (str7 == null || r0.A0C == null) {
                String str8 = "";
                if (str7 == null) {
                    str2 = "mCameraSession";
                } else {
                    str2 = str8;
                }
                if (r0.A0C == null) {
                    str8 = "mSurface";
                }
                0kD.A01("IgCameraLoggerImpl", String.format("logMusicPreviewTrack() %s %s null", new Object[]{str2, str8}));
            } else {
                C66569MWx.A03(A0e, mWx2);
                JTO.A1S(A0e, str7);
                JTS.A15(r0.A09, A0e, 2);
                AnonymousClass7TH.A0U(A0e);
                JTR.A1J(A0e, musicProduct);
                A0e.AAJ("section_name", str3);
                C66569MWx.A04(A0e, mWx2, "song_name", mWx2.getTitle());
                A0e.A9F("audio_asset_id", DbV.A0q(mWx2.getId()));
                A0e.A9F("audio_cluster_id", 2AL.A08(mWx2.getAudioClusterId()));
                String str9 = mWx2.CAc().A00;
                A0e.AAJ("audio_type", str9);
                A0e.AAJ("browse_session_id", str5);
                AnonymousClass7TH.A0W(A0e, A012);
                AnonymousClass7TE.A1W(A0e, "camera_position", JTR.A0D(r0));
                AnonymousClass7TH.A0X(A0e, A012);
                A0e.AAJ("category", str9);
                A0e.AAJ("discovery_session_id", r0.A0O);
                A0e.AAJ("search_text", (String) null);
                C66569MWx.A02(A0e, mWx2);
                JTO.A1P(28t.A02, A0e);
                A0e.AAJ("search_session_id", r0.A0P);
                A0e.AAJ("subcategory", str6);
                C51965G9l.A1A(jVj, A0e);
                DbY.A1C(A0e);
                JTS.A1A(A0e, A012);
                A0e.Cgf();
            }
        }
        C234502xy r1 = this.A0C;
        r1.EHu(true);
        r1.ETw(mWx2.BUq(), new C61985KUi(mWx2, this), (String) null, 0, -1, -1, false, false);
        this.A0E.notifyItemChanged(i);
    }

    public final void DXt(MusicSearchPlaylist musicSearchPlaylist) {
        MusicBrowseCategory A042 = MusicBrowseCategory.A08.A04(musicSearchPlaylist);
        A06();
        A02(A042);
        this.A0Q.A07(AnonymousClass000.A00(901));
    }

    public final void Dt1(C66569MWx mWx, C63863L9s l9s) {
        C64161LRc lRc = this.A0R;
        UserSession userSession = this.A0B;
        MusicBrowseCategory musicBrowseCategory = this.A04;
        String str = this.A0J;
        MusicProduct musicProduct = this.A09;
        String str2 = this.A0K;
        lRc.A04(this.A0N, this.A08, musicProduct, userSession, mWx, musicBrowseCategory, l9s, str, str2, this.A0Z);
    }

    public final void Dt5(C66569MWx mWx, Integer num, String str, String str2) {
        String str3 = str2;
        boolean A1Y = C51970G9q.A1Y(str3);
        C64161LRc lRc = this.A0R;
        UserSession userSession = this.A0B;
        String str4 = this.A0I;
        C60246Ji3 ji3 = this.A0G;
        String str5 = ji3.A04;
        MusicBrowseCategory musicBrowseCategory = this.A04;
        String str6 = this.A0J;
        MusicProduct musicProduct = this.A09;
        C59725JVj jVj = this.A08;
        C66569MWx mWx2 = mWx;
        String str7 = str;
        String str8 = str4;
        String str9 = str5;
        String str10 = str6;
        String str11 = str7;
        MusicBrowseCategory musicBrowseCategory2 = musicBrowseCategory;
        C66569MWx mWx3 = mWx2;
        UserSession userSession2 = userSession;
        MusicProduct musicProduct2 = musicProduct;
        C59725JVj jVj2 = jVj;
        lRc.A03(this.A0N, (C371088xY) null, jVj2, musicProduct2, userSession2, mWx3, musicBrowseCategory2, num, str11, str3, str8, str9, str10, this.A0K, this.A0Z);
        this.A0C.EHu(A1Y);
        C66447MSb mSb = this.A0W;
        if (mSb != null) {
            String str12 = ji3.A04;
            if (str12 == null || str12.length() == 0) {
                27p.A01(userSession).A03.A07 = "not_search";
            }
            mSb.Dt4(mWx2, this.A04, str7);
            A06();
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        String str;
        String str2;
        if (i == 9688) {
            C64161LRc lRc = this.A0R;
            if (i2 == 9689) {
                C66569MWx mWx = lRc.A00;
                if (mWx != null) {
                    C63863L9s l9s = lRc.A01;
                    if (l9s == null || (str = l9s.A04) == null) {
                        MusicBrowseCategory musicBrowseCategory = this.A04;
                        str = musicBrowseCategory.A04;
                        if (l9s == null) {
                            str2 = musicBrowseCategory.A06;
                            if (str2 == null || str2.length() == 0) {
                                str2 = "unknown";
                            }
                            Dt5(mWx, (Integer) null, str, str2);
                            return;
                        }
                    }
                    str2 = l9s.A05;
                    Dt5(mWx, (Integer) null, str, str2);
                    return;
                }
                0kD.A05("spotlight_banner_selection", "ResultListController state has been reaped on Audio Page track confirmed", (Throwable) null);
                C59689JTv.A01(this.A0A.requireContext(), "music_browser_use_audio_error", 2131967751, 1);
            } else if (lRc.A00 == null) {
                0kD.A05("spotlight_banner_selection", "ResultListController state has been reaped on Audio Page back navigation", (Throwable) null);
            }
        }
    }

    public final void onDestroy() {
        List list = this.A0R.A02;
        if (AnonymousClass7TE.A1b(list)) {
            MusicProduct musicProduct = this.A09;
            UserSession userSession = this.A0B;
            String str = this.A0J;
            AnonymousClass7TG.A1N(musicProduct, userSession);
            1NY A0a2 = AnonymousClass7TG.A0a(userSession);
            A0a2.A0A("music/search_session_tracking/");
            String A002 = C14245TsS.A00(musicProduct);
            if (A002 == null) {
                A002 = "";
            }
            A0a2.A9m("product", A002);
            DbX.A1M(A0a2, "browse_session_id", str);
            try {
                StringWriter A0v = JTO.A0v();
                17W A0e = C51970G9q.A0e(A0v);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    0eP A1A = JTO.A1A(it);
                    C66569MWx mWx = (C66569MWx) A1A.A00;
                    C63863L9s l9s = (C63863L9s) A1A.A01;
                    A0e.A0c();
                    A0e.A0R("audio_asset_id", mWx.getId());
                    String Aab = mWx.Aab();
                    if (Aab != null) {
                        A0e.A0R("alacorn_session_id", Aab);
                    }
                    A0e.A0R(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "song_selection");
                    Long l = l9s.A02;
                    if (l != null) {
                        A0e.A0R("event_time", String.valueOf(l.longValue()));
                    }
                    A0e.A0Z();
                }
                A0a2.A9m("search_sessions", JTS.A0k(A0e, A0v));
            } catch (IOException e) {
                0wb.A06("MusicSearchApiUtil", "Failed to generate search session data", e);
            }
            1ES.A03(A0a2.A0M());
        }
    }

    public final void onPause() {
        this.A0C.release();
    }

    public final void A08() {
        String str;
        A06();
        this.A0Q.A07(AnonymousClass000.A00(2197));
        if (!this.A0P.contains(AudioTrackType.ORIGINAL)) {
            str = "playlists";
        } else {
            str = "saved_music";
        }
        A02(C64181LSn.A03(str, "bookmarked", DbU.A0m(this.A0A, 2131967864)));
    }

    public final void onDestroyView() {
        A05().A0b();
        AnonymousClass4DH r1 = this.A0A;
        C229402nK r0 = this.dropFrameWatcher;
        if (r0 != null) {
            r1.unregisterLifecycleListener(r0);
            r1.removeFragmentVisibilityListener(this);
            MusicOverlayResultsListControllerLifecycleUtil.cleanupReferences(this);
            return;
        }
        0qQ.A0F("dropFrameWatcher");
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX WARNING: type inference failed for: r14v0, types: [X.07Z, androidx.fragment.app.Fragment, X.4DH] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MusicOverlayResultsListController(X.C3515589i r25, X.C59725JVj r26, com.google.common.collect.ImmutableList r27, com.google.common.collect.ImmutableList r28, com.instagram.api.schemas.MusicProduct r29, X.AnonymousClass4DH r30, com.instagram.common.session.UserSession r31, X.C60090JfW r32, com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r33, X.C229132mt r34, com.instagram.music.common.config.MusicAttributionConfig r35, com.instagram.music.common.model.MusicBrowseCategory r36, X.C234502xy r37, X.C234462xu r38, X.C66447MSb r39, X.C60246Ji3 r40, X.C60329JjY r41, X.C229122ms r42, X.AnonymousClass80X r43, java.lang.String r44, java.lang.String r45, java.lang.String r46, java.lang.String r47, java.util.Map r48, int r49, boolean r50, boolean r51) {
        /*
            r24 = this;
            r10 = r31
            boolean r5 = X.DbW.A1Y(r10)
            r0 = 15
            r6 = r26
            r1 = r45
            X.C51969G9p.A1S(r1, r0, r6)
            r0 = 20
            r7 = r32
            X.0qQ.A0B(r7, r0)
            r0 = 21
            r4 = r41
            X.0qQ.A0B(r4, r0)
            r0 = 22
            r9 = r40
            X.0qQ.A0B(r9, r0)
            r0 = 23
            r11 = r33
            X.0qQ.A0B(r11, r0)
            r3 = r24
            r3.<init>()
            r14 = r30
            r3.A0A = r14
            r3.A0B = r10
            r15 = r29
            r3.A09 = r15
            r0 = r27
            r3.A0P = r0
            r0 = r44
            r3.A0J = r0
            r0 = r36
            r3.A04 = r0
            r0 = r39
            r3.A0W = r0
            r0 = r38
            r3.A0V = r0
            r0 = r35
            r3.A0U = r0
            r2 = r37
            r3.A0C = r2
            r0 = r34
            r3.A0T = r0
            r8 = r42
            r3.A0X = r8
            r0 = r50
            r3.A0L = r0
            r0 = r49
            r3.A0M = r0
            r3.A0K = r1
            r0 = r43
            r3.A0Y = r0
            r3.A08 = r6
            r13 = r25
            r3.A0N = r13
            r12 = r28
            r3.A0O = r12
            r3.A0H = r4
            r3.A0G = r9
            r3.A0S = r11
            r0 = r46
            r3.A0Z = r0
            r6 = r51
            r3.A0b = r6
            r0 = r48
            r3.A0a = r0
            r0 = r47
            r3.A0I = r0
            X.LRc r0 = new X.LRc
            r0.<init>()
            r3.A0R = r0
            X.27r r0 = X.27p.A01(r10)
            X.29H r0 = r0.A03
            X.0qQ.A07(r0)
            r3.A0Q = r0
            r0 = 29
            X.MMS r1 = X.MMS.A00(r10, r0)
            java.lang.Class<X.L4q> r0 = X.C63732L4q.class
            java.lang.Object r0 = r10.A01(r0, r1)
            X.L4q r0 = (X.C63732L4q) r0
            r3.A0D = r0
            X.LFN r1 = new X.LFN
            r16 = r1
            r17 = r13
            r18 = r12
            r19 = r10
            r20 = r11
            r21 = r2
            r16.<init>(r17, r18, r19, r20, r21)
            r3.A0F = r1
            android.content.Context r13 = r14.requireContext()
            boolean r0 = r14 instanceof X.AnonymousClass0iw
            r2 = 0
            r16 = r2
            if (r0 == 0) goto L_0x00ce
            r16 = r14
        L_0x00ce:
            com.instagram.music.common.model.MusicBrowseCategory r0 = r3.A04
            X.JkY r12 = new X.JkY
            r21 = r4
            r22 = r8
            r23 = r6
            r18 = r0
            r19 = r3
            r20 = r1
            r17 = r10
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            r3.A0E = r12
            r12.setHasStableIds(r5)
            X.0r6 r1 = r9.A0B
            r0 = 32
            X.MGW r0 = X.MGW.A01(r3, r2, r0)
            X.JTS.A10(r14, r0, r1)
            X.0r6 r1 = r7.A02
            r0 = 33
            X.MGW r0 = X.MGW.A01(r3, r2, r0)
            X.JTS.A10(r14, r0, r1)
            X.0r6 r1 = r4.A07
            r0 = 34
            X.MGW r0 = X.MGW.A01(r3, r2, r0)
            X.JTS.A10(r14, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.music.search.MusicOverlayResultsListController.<init>(X.89i, X.JVj, com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableList, com.instagram.api.schemas.MusicProduct, X.4DH, com.instagram.common.session.UserSession, X.JfW, com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel, X.2mt, com.instagram.music.common.config.MusicAttributionConfig, com.instagram.music.common.model.MusicBrowseCategory, X.2xy, X.2xu, X.MSb, X.Ji3, X.JjY, X.2ms, X.80X, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.Map, int, boolean, boolean):void");
    }
}
