package X;

import com.instagram.api.schemas.IGAIAgentType;
import com.instagram.api.schemas.ListeningNowResponseInfo;
import com.instagram.api.schemas.MusicInfo;
import com.instagram.api.schemas.MusicNoteResponseInfo;
import com.instagram.api.schemas.TrackData;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.direct.inbox.notes.NotesRepository;
import com.instagram.direct.inbox.notes.models.NoteAudience;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.webrtc.CameraCapturer;

/* renamed from: X.60k  reason: invalid class name and case insensitive filesystem */
public final class C3018760k implements 0lm {
    public A7U A00;
    public C319496qh A01;
    public AnonymousClass4A9 A02;
    public Map A03 = new LinkedHashMap();
    public boolean A04;
    public final 0wc A05;
    public final UserSession A06;
    public final AnonymousClass6W2 A07 = new AnonymousClass6W2(new C3018860l(this));
    public final NotesRepository A08;
    public final HashMap A09 = new HashMap();
    public final HashSet A0A = new HashSet();
    public final HashSet A0B = new HashSet();
    public final List A0C = new ArrayList();
    public final List A0D = new ArrayList();
    public final AnonymousClass0eM A0E = AnonymousClass0eN.A01(new AnonymousClass9LO(this, 21));

    public C3018760k(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A06 = userSession;
        this.A08 = AnonymousClass43C.A00(userSession);
        this.A05 = AnonymousClass0kN.A02(userSession);
    }

    public static final C319746r9 A00(User user) {
        IGAIAgentType AaX;
        if (user == null || (AaX = user.A03.AaX()) == null) {
            return null;
        }
        int ordinal = AaX.ordinal();
        if (ordinal == 1) {
            return C319746r9.ig_creator;
        }
        if (ordinal == 2) {
            return C319746r9.meta_generated_consumer_agent;
        }
        if (ordinal == 3) {
            return C319746r9.official_meta_assistant;
        }
        if (ordinal == 4) {
            return C319746r9.user_generated_consumer_agent;
        }
        return null;
    }

    public static final void A05(C3018760k r3) {
        r3.A04 = false;
        AnonymousClass6W2 r1 = r3.A07;
        String str = r1.A00;
        if (str == null || str.length() == 0) {
            r1.A02();
        }
        NotesRepository notesRepository = r3.A08;
        HashMap hashMap = r3.A09;
        0qQ.A0B(hashMap, 0);
        notesRepository.A03 = hashMap;
        HashSet hashSet = r3.A0A;
        0qQ.A0B(hashSet, 0);
        notesRepository.A04 = hashSet;
    }

    public final void A0B(C69506Nmo nmo) {
        A0E(nmo, (GT1) null, (HOK) null, (Boolean) null, Boolean.TRUE, (Long) null, (String) null, (String) null);
    }

    public final void A0C(C69506Nmo nmo) {
        A0E(nmo, (GT1) null, (HOK) null, (Boolean) null, Boolean.FALSE, (Long) null, (String) null, (String) null);
    }

    public final void A0H(C319726r6 r15, AnonymousClass4AS r16) {
        AnonymousClass4AS r0 = r16;
        0qQ.A0B(r0, 0);
        this.A01 = new C319496qh((C319746r9) null, r15, (C319736r8) null, (NoteAudience) null, (Long) null, (Long) null, r0.A00.getId(), (String) null, (String) null, (String) null, 0sn.A00, 0, false);
    }

    public final void A0I(C319726r6 r17, AnonymousClass4AB r18) {
        Long l;
        AnonymousClass4AB r3 = r18;
        0qQ.A0B(r3, 0);
        User user = r3.A0A;
        String id = user.getId();
        ArrayList A042 = A04(r3, false);
        Integer num = r3.A02;
        if (num != null) {
            int intValue = num.intValue();
            String str = r3.A03;
            String A032 = A03(r3);
            Integer num2 = r3.A01;
            if (num2 != null) {
                l = Long.valueOf((long) num2.intValue());
            } else {
                l = null;
            }
            this.A01 = new C319496qh(A00(user), r17, (C319736r8) null, r3.A09, l, A01(r3, true), id, str, A032, (String) null, A042, intValue, false);
        }
    }

    public final void A0J(C319736r8 r15, AnonymousClass4AB r16) {
        AnonymousClass4AB r1 = r16;
        0qQ.A0B(r1, 0);
        C319726r6 r2 = C319726r6.POG;
        String id = r1.A0A.getId();
        ArrayList A042 = A04(r1, true);
        C319736r8 r3 = r15;
        this.A01 = new C319496qh((C319746r9) null, r2, r3, r1.A09, (Long) null, (Long) null, id, r1.A03, A03(r1), (String) null, A042, 0, false);
    }

    public final void A0L(AnonymousClass4AB r12) {
        int i;
        0qQ.A0B(r12, 0);
        String str = this.A07.A00;
        if (str != null) {
            User user = r12.A0A;
            DirectShareTarget directShareTarget = new DirectShareTarget(user);
            C254783t2 r0 = directShareTarget.A09;
            r0.getClass();
            if (r0 instanceof C254773t1) {
                AnonymousClass7VU A002 = AnonymousClass7VT.A00(this.A06);
                C254783t2 r3 = directShareTarget.A09;
                r3.getClass();
                List unmodifiableList = Collections.unmodifiableList(directShareTarget.A0Q);
                0qQ.A07(unmodifiableList);
                A002.A02((C254773t1) r3, unmodifiableList, new C377679Mt(this, r12, str, 5), false);
                return;
            }
            String id = user.getId();
            ArrayList A042 = A04(r12, false);
            String str2 = r12.A03;
            Integer num = r12.A02;
            if (num != null) {
                i = num.intValue();
            } else {
                i = 0;
            }
            this.A00 = new A7U(false, str, id, str2, A042, i);
        }
    }

    public static final Long A01(AnonymousClass4AB r6, boolean z) {
        MusicNoteResponseInfo musicNoteResponseInfo;
        MusicInfo musicInfo;
        TrackData BUk;
        String audioClusterId;
        ListeningNowResponseInfo listeningNowResponseInfo;
        List list = r6.A0J;
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            if (next instanceof AnonymousClass912) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object next2 : list) {
            if (AnonymousClass9IJ.A00(0, next2)) {
                arrayList2.add(next2);
            }
        }
        if ((!arrayList.isEmpty() || !arrayList2.isEmpty()) && (!z || r6.A08 == null)) {
            if (!arrayList2.isEmpty()) {
                C300845y2 r0 = ((C279864zZ) ((AnonymousClass9IJ) 00k.A0I(arrayList2)).A01).A0A;
                if (!(r0 == null || (listeningNowResponseInfo = r0.A04) == null)) {
                    musicInfo = listeningNowResponseInfo.A01;
                }
            } else {
                C300845y2 r02 = ((AnonymousClass912) 00k.A0I(arrayList)).A00.A0A;
                if (!(r02 == null || (musicNoteResponseInfo = r02.A07) == null)) {
                    musicInfo = musicNoteResponseInfo.A00;
                }
            }
            if (!(musicInfo == null || (BUk = musicInfo.BUk()) == null || (audioClusterId = BUk.getAudioClusterId()) == null)) {
                return 00y.A0n(10, audioClusterId);
            }
        }
        return null;
    }

    public static final String A02() {
        String str = AnonymousClass1QI.A00.A02.A00;
        if (str == null) {
            return "";
        }
        return str;
    }

    public static final String A03(AnonymousClass4AB r5) {
        List list = r5.A0J;
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            if (next instanceof AnonymousClass91B) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object next2 : list) {
            if (next2 instanceof AnonymousClass912) {
                arrayList2.add(next2);
            }
        }
        ArrayList A0S = 00k.A0S(arrayList2, arrayList);
        ArrayList arrayList3 = new ArrayList();
        for (Object next3 : list) {
            if (AnonymousClass9IJ.A00(5, next3)) {
                arrayList3.add(next3);
            }
        }
        ArrayList A0S2 = 00k.A0S(arrayList3, A0S);
        ArrayList arrayList4 = new ArrayList();
        for (Object next4 : list) {
            if (AnonymousClass9IJ.A00(2, next4)) {
                arrayList4.add(next4);
            }
        }
        ArrayList A0S3 = 00k.A0S(arrayList4, A0S2);
        ArrayList arrayList5 = new ArrayList();
        for (Object next5 : list) {
            if (AnonymousClass9IJ.A00(1, next5)) {
                arrayList5.add(next5);
            }
        }
        ArrayList A0S4 = 00k.A0S(arrayList5, A0S3);
        ArrayList arrayList6 = new ArrayList();
        for (Object next6 : list) {
            if (AnonymousClass9IJ.A00(3, next6)) {
                arrayList6.add(next6);
            }
        }
        ArrayList A0S5 = 00k.A0S(arrayList6, A0S4);
        ArrayList arrayList7 = new ArrayList();
        for (Object next7 : list) {
            if (AnonymousClass9IJ.A00(0, next7)) {
                arrayList7.add(next7);
            }
        }
        ArrayList A0S6 = 00k.A0S(arrayList7, A0S5);
        if (A0S6.isEmpty()) {
            return null;
        }
        AnonymousClass913 r2 = (AnonymousClass913) 00k.A0I(A0S6);
        if ((r2 instanceof AnonymousClass912) || (r2 instanceof AnonymousClass91B) || AnonymousClass9IJ.A00(5, r2) || AnonymousClass9IJ.A00(1, r2) || AnonymousClass9IJ.A00(2, r2) || AnonymousClass9IJ.A00(3, r2) || AnonymousClass9IJ.A00(0, r2)) {
            return r2.BWY().A0H;
        }
        return null;
    }

    public static final ArrayList A04(AnonymousClass4AB r4, boolean z) {
        C66947Mfg mfg;
        C66947Mfg mfg2;
        ArrayList arrayList = new ArrayList();
        if (r4.A0W) {
            arrayList.add(C66947Mfg.BIRTHDAY_INDICATOR);
        }
        if (r4.A0P) {
            arrayList.add(C66947Mfg.ACTIVE_NOW);
        }
        if (r4.A08 != null) {
            arrayList.add(C66947Mfg.POG_VIDEO);
        }
        if (r4.A0T) {
            mfg2 = C66947Mfg.PROMPT_RESPONSE_NOTE;
        } else if (z) {
            mfg2 = C66947Mfg.FRIEND_MAP_NOTE;
        } else {
            for (Object next : r4.A0J) {
                if (next instanceof AnonymousClass91B) {
                    mfg = C66947Mfg.NOTE;
                } else if (next instanceof AnonymousClass912) {
                    mfg = C66947Mfg.MUSIC_NOTE;
                } else if (C382039cz.A00(1, next)) {
                    mfg = C66947Mfg.LOCATION_NOTE;
                } else if (AnonymousClass9IJ.A00(2, next)) {
                    mfg = C66947Mfg.PROMPT_NOTE;
                } else if (AnonymousClass9IJ.A00(3, next)) {
                    mfg = C66947Mfg.STACKED_PROMPT;
                } else if (AnonymousClass9IJ.A00(1, next)) {
                    mfg = C66947Mfg.NOTE_CHAT;
                } else if (AnonymousClass9IJ.A00(0, next)) {
                    mfg = C66947Mfg.LISTENING_NOW;
                }
                arrayList.add(mfg);
            }
            return arrayList;
        }
        arrayList.add(mfg2);
        return arrayList;
    }

    public static final void A06(C3018760k r6, AnonymousClass4AB r7, String str, double d) {
        int i;
        GT1 gt1;
        String str2;
        0wc r2 = r6.A05;
        0Aj A002 = r2.A00(r2.A00, "ig_direct_inbox_v2_item_impression");
        if (A002.isSampled()) {
            A002.AAJ("nav_chain", A02());
            User user = r7.A0A;
            A002.AAJ("target_user_id", user.getId());
            Long l = null;
            A002.AAe("content", A04(r7, false));
            A002.AAJ("direct_session_id", str);
            Integer num = r7.A02;
            if (num != null) {
                A002.A9F("position", Long.valueOf((long) num.intValue()));
                Integer num2 = r7.A01;
                if (num2 != null) {
                    i = num2.intValue();
                } else {
                    i = 0;
                }
                A002.A9F("note_inventory_count", Long.valueOf((long) i));
                A002.AAJ(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, r7.A03);
                A002.AAJ("note_id", A03(r7));
                A002.A8D("dwell_time_ms", Double.valueOf(d));
                A002.A9F("audio_cluster_id", A01(r7, false));
                NoteAudience noteAudience = r7.A09;
                if (noteAudience != null) {
                    gt1 = C3018660j.A00(noteAudience);
                } else {
                    gt1 = null;
                }
                A002.A8M(gt1, "target_note_audience");
                Integer num3 = r7.A0D;
                if (num3 != null) {
                    l = Long.valueOf((long) num3.intValue());
                }
                A002.A9F("num_prompt_responses", l);
                if (r6.A04) {
                    str2 = "feed_timeline";
                } else {
                    str2 = "direct_inbox";
                }
                A002.AAJ("container_module", str2);
                A002.AAJ("ranking_session_id", (String) r6.A08.A0s.getValue());
                A002.A8M(A00(user), AnonymousClass000.A00(CameraCapturer.OPEN_CAMERA_DELAY_MS));
                A002.AAJ("canonical_nav_chain", AnonymousClass1K6.A00);
                A002.Cgf();
            }
        }
    }

    public final void A07() {
        if (182.A06(0Tu.A05, this.A06, 36322555602151668L)) {
            HashMap hashMap = this.A09;
            if (!hashMap.isEmpty()) {
                NotesRepository notesRepository = this.A08;
                Set keySet = hashMap.keySet();
                0qQ.A07(keySet);
                List A0a = 00k.A0a(keySet);
                C262224Cq r3 = notesRepository.A01;
                AnonymousClass9K1 r2 = new AnonymousClass9K1((Object) A0a, (Object) notesRepository, (AnonymousClass4D7) null, 2);
                1Eo.A03(AnonymousClass05K.A00, 19B.A00, r2, r3);
                this.A0A.addAll(hashMap.keySet());
                hashMap.clear();
            }
        }
    }

    public final void A08() {
        User user;
        C66947Mfg mfg;
        String str;
        String str2 = this.A07.A00;
        if (str2 != null || this.A04) {
            A07();
            AnonymousClass4A9 r3 = this.A02;
            if (r3 != null) {
                0wc r2 = this.A05;
                0Aj A002 = r2.A00(r2.A00, "ig_direct_inbox_v2_item_impression");
                if (A002.isSampled()) {
                    A002.AAJ("nav_chain", A02());
                    A002.AAJ("target_user_id", r3.A04.getId());
                    List singletonList = Collections.singletonList(C66947Mfg.FRIEND_MAP_ENTRYPOINT);
                    0qQ.A07(singletonList);
                    A002.AAe("content", singletonList);
                    A002.AAJ("direct_session_id", str2);
                    A002.A9F("position", Long.valueOf((long) r3.A00));
                    A002.A9F("note_inventory_count", Long.valueOf(r3.A01));
                    A002.AAJ("ranking_session_id", (String) this.A08.A0s.getValue());
                    A002.AAJ("canonical_nav_chain", AnonymousClass1K6.A00);
                    A002.Cgf();
                }
            }
            for (Map.Entry entry : this.A03.entrySet()) {
                AnonymousClass4AT r5 = (AnonymousClass4AT) entry.getKey();
                long longValue = ((Number) entry.getValue()).longValue();
                0wc r4 = this.A05;
                0Aj A003 = r4.A00(r4.A00, "ig_direct_inbox_v2_item_impression");
                if (A003.isSampled()) {
                    A003.AAJ("nav_chain", A02());
                    List list = r5.A0D;
                    if (list == null || (user = (User) 00k.A0J(list)) == null) {
                        user = r5.A06;
                    }
                    A003.AAJ("target_user_id", user.getId());
                    if (0qQ.A0K(r5.A0C, C66579MXk.A00(955))) {
                        mfg = C66947Mfg.MEDIA_NOTES_AUTHOR;
                    } else {
                        mfg = C66947Mfg.MEDIA_NOTES_STACK;
                    }
                    List singletonList2 = Collections.singletonList(mfg);
                    0qQ.A07(singletonList2);
                    A003.AAe("content", singletonList2);
                    A003.AAJ("direct_session_id", str2);
                    A003.A9F("position", Long.valueOf((long) r5.A01));
                    A003.A9F("note_inventory_count", Long.valueOf((long) r5.A04));
                    A003.AAJ("ranking_session_id", (String) this.A08.A0s.getValue());
                    A003.AAJ("note_id", r5.A0A);
                    A003.A8D("dwell_time_ms", Double.valueOf((double) longValue));
                    if (this.A04) {
                        str = "feed_timeline";
                    } else {
                        str = "direct_inbox";
                    }
                    A003.AAJ("container_module", str);
                    A003.AAJ("canonical_nav_chain", AnonymousClass1K6.A00);
                    A003.Cgf();
                }
            }
            if (182.A06(0Tu.A05, this.A06, 36327739627813531L)) {
                this.A0B.clear();
                return;
            }
            for (0eP r0 : this.A0C) {
                A06(this, (AnonymousClass4AB) r0.A00, str2, (double) ((Number) r0.A01).longValue());
            }
        }
    }

    public final void A09(C69466NmA nmA) {
        0wc r2 = this.A05;
        0Aj A002 = r2.A00(r2.A00, "direct_notes_create_format_tap_tray");
        if (A002.isSampled()) {
            A002.AAJ("action", "");
            A002.A8M(nmA, "selection");
            A002.Cgf();
        }
    }

    public final void A0A(C69467NmB nmB, String str) {
        0wc r2 = this.A05;
        0Aj A002 = r2.A00(r2.A00, "direct_notes_group_join_chat_button");
        if (A002.isSampled()) {
            A002.A8M(nmB, "action");
            A002.AAJ("open_thread_id", str);
            A002.Cgf();
        }
    }

    public final void A0D(C69506Nmo nmo) {
        0wc r2 = this.A05;
        0Aj A002 = r2.A00(r2.A00, "ig_direct_inbox_v2_item_interaction");
        if (A002.isSampled()) {
            A002.AAJ("nav_chain", A02());
            A002.A8M(nmo, "action");
            A002.AAJ("container_module", "feed_timeline");
            A002.AAJ("canonical_nav_chain", AnonymousClass1K6.A00);
            A002.Cgf();
        }
    }

    public final void A0E(C69506Nmo nmo, GT1 gt1, HOK hok, Boolean bool, Boolean bool2, Long l, String str, String str2) {
        List list;
        Long l2;
        String str3;
        C319496qh r3 = this.A01;
        if (r3 != null) {
            String str4 = this.A07.A00;
            if (this.A04 || r3.A0C || str4 != null || r3.A08 != null) {
                0wc r2 = this.A05;
                0Aj A002 = r2.A00(r2.A00, "ig_direct_inbox_v2_item_interaction");
                if (A002.isSampled()) {
                    A002.AAJ("nav_chain", A02());
                    A002.A8M(nmo, "action");
                    GT1 gt12 = null;
                    A002.AAJ("direct_session_id", (String) null);
                    A002.A8M(r3.A02, "tap_target");
                    if (bool2.equals(true)) {
                        list = r3.A0B;
                    } else {
                        list = null;
                    }
                    A002.AAe("content", list);
                    A002.AAJ("target_user_id", r3.A09);
                    A002.AAJ(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, r3.A0A);
                    if (!r3.A0C) {
                        l2 = Long.valueOf((long) r3.A00);
                    } else {
                        l2 = null;
                    }
                    A002.A9F("position", l2);
                    int ordinal = nmo.ordinal();
                    if (ordinal == 15 || ordinal == 11 || ordinal == 36 || ordinal == 8 || ordinal == 13) {
                        str3 = null;
                    } else {
                        str3 = r3.A07;
                    }
                    A002.AAJ("note_id", str3);
                    A002.A8M(gt1, "create_note_audience");
                    A002.A9F("note_inventory_count", r3.A06);
                    if (l == null) {
                        l = r3.A05;
                    }
                    A002.A9F("audio_cluster_id", l);
                    if (nmo != C69506Nmo.A0V) {
                        bool = null;
                    }
                    A002.A7p("is_e2ee", bool);
                    NoteAudience noteAudience = r3.A04;
                    if (noteAudience != null) {
                        gt12 = C3018660j.A00(noteAudience);
                    }
                    A002.A8M(gt12, "target_note_audience");
                    A002.AAJ(AnonymousClass000.A00(753), str);
                    A002.A8M(hok, "reaction_entrypoint");
                    A002.A8M(r3.A03, "interaction_source");
                    if (str2 == null) {
                        if (this.A04) {
                            str2 = "feed_timeline";
                        } else {
                            str2 = "direct_inbox";
                        }
                    }
                    A002.AAJ("container_module", str2);
                    A002.AAJ("ranking_session_id", (String) this.A08.A0s.getValue());
                    A002.A8M(r3.A01, AnonymousClass000.A00(CameraCapturer.OPEN_CAMERA_DELAY_MS));
                    A002.AAJ("canonical_nav_chain", AnonymousClass1K6.A00);
                    A002.Cgf();
                }
            }
        }
    }

    public final void A0F(C69474NmI nmI) {
        A7U a7u = this.A00;
        if (a7u != null) {
            0wc r2 = this.A05;
            0Aj A002 = r2.A00(r2.A00, "ig_direct_inbox_v2_conversion");
            if (A002.isSampled()) {
                A002.AAJ("nav_chain", A02());
                A002.AAJ("target_user_id", a7u.A03);
                A002.AAe("content", a7u.A05);
                A002.AAJ("direct_session_id", a7u.A02);
                A002.A8M(nmI, "conversion_type");
                A002.AAJ(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, a7u.A04);
                A002.A9F("position", Long.valueOf((long) a7u.A00));
                A002.A7p("is_e2ee", a7u.A01);
                A002.Cgf();
            }
        }
    }

    public final void A0G(C319726r6 r15) {
        C319496qh r0;
        C319496qh r02 = this.A01;
        if (r02 != null) {
            String str = r02.A09;
            List list = r02.A0B;
            int i = r02.A00;
            String str2 = r02.A0A;
            String str3 = r02.A07;
            Long l = r02.A06;
            Long l2 = r02.A05;
            NoteAudience noteAudience = r02.A04;
            String str4 = r02.A08;
            boolean z = r02.A0C;
            r0 = new C319496qh(r02.A01, r15, r02.A03, noteAudience, l, l2, str, str2, str3, str4, list, i, z);
        } else {
            r0 = null;
        }
        this.A01 = r0;
    }

    public final void A0K(AnonymousClass913 r15) {
        String str;
        NoteAudience noteAudience;
        User user;
        C279864zZ BWY;
        C319726r6 r2 = C319726r6.NOTE_BUBBLE;
        if (r15 == null || (BWY = r15.BWY()) == null || (str = BWY.A0K) == null) {
            str = this.A06.A06;
        }
        0sn r11 = 0sn.A00;
        if (r15 != null) {
            C279864zZ BWY2 = r15.BWY();
            noteAudience = AnonymousClass916.A00(Integer.valueOf(BWY2.A00));
            user = BWY2.A0D;
        } else {
            noteAudience = NoteAudience.UNKNOWN;
            user = null;
        }
        this.A01 = new C319496qh(A00(user), r2, (C319736r8) null, noteAudience, (Long) null, (Long) null, str, (String) null, (String) null, (String) null, r11, 0, true);
    }

    public final void A0M(AnonymousClass4AB r6, long j) {
        String str = this.A07.A00;
        if (str != null || this.A04) {
            String A032 = A03(r6);
            if (A032 == null) {
                A032 = r6.A0A.getId();
            }
            HashSet hashSet = this.A0B;
            if (!hashSet.contains(A032)) {
                A06(this, r6, str, (double) j);
                hashSet.add(A032);
            }
        }
    }

    public final void A0N(AnonymousClass4AB r7, long j) {
        C300845y2 r0;
        List list = r7.A0J;
        ArrayList<AnonymousClass913> arrayList = new ArrayList<>();
        for (Object next : list) {
            C279864zZ BWY = ((AnonymousClass913) next).BWY();
            if (!0qQ.A0K(BWY.A0D.getId(), this.A06.A06) || !((r0 = BWY.A0A) == null || r0.A08 == null)) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(0Yv.A1E(arrayList, 10));
        for (AnonymousClass913 BWY2 : arrayList) {
            arrayList2.add(BWY2.BWY().A0H);
        }
        for (Object next2 : 00k.A0W(arrayList2)) {
            if (!this.A0A.contains(next2)) {
                this.A09.put(next2, Long.valueOf(j));
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0021  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0O(com.instagram.direct.inbox.notes.models.NoteStyle r15, boolean r16, boolean r17) {
        /*
            r14 = this;
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            int r1 = r15.ordinal()
            r0 = 1
            if (r1 == r0) goto L_0x0055
            r0 = 2
            if (r1 == r0) goto L_0x0052
            r0 = 5
            if (r1 == r0) goto L_0x004f
            r0 = 9
            if (r1 == r0) goto L_0x004c
            r0 = 10
            if (r1 != r0) goto L_0x001f
            X.Mfg r0 = X.C66947Mfg.LISTENING_NOW
        L_0x001c:
            r11.add(r0)
        L_0x001f:
            if (r17 == 0) goto L_0x0026
            X.Mfg r0 = X.C66947Mfg.FRIEND_MAP_NOTE
            r11.add(r0)
        L_0x0026:
            X.6qh r0 = r14.A01
            if (r0 == 0) goto L_0x004a
            X.6r6 r2 = r0.A02
            java.lang.String r7 = r0.A09
            int r12 = r0.A00
            java.lang.String r8 = r0.A0A
            java.lang.String r9 = r0.A07
            java.lang.Long r5 = r0.A06
            java.lang.Long r6 = r0.A05
            com.instagram.direct.inbox.notes.models.NoteAudience r4 = r0.A04
            java.lang.String r10 = r0.A08
            boolean r13 = r0.A0C
            X.6r8 r3 = r0.A03
            X.6r9 r1 = r0.A01
            X.6qh r0 = new X.6qh
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
        L_0x0047:
            r14.A01 = r0
            return
        L_0x004a:
            r0 = 0
            goto L_0x0047
        L_0x004c:
            X.Mfg r0 = X.C66947Mfg.NOTE_CHAT
            goto L_0x001c
        L_0x004f:
            X.Mfg r0 = X.C66947Mfg.LOCATION_NOTE
            goto L_0x001c
        L_0x0052:
            X.Mfg r0 = X.C66947Mfg.MUSIC_NOTE
            goto L_0x001c
        L_0x0055:
            if (r16 == 0) goto L_0x005f
            X.Mfg r0 = X.C66947Mfg.PROMPT_NOTE
            r11.add(r0)
            X.Mfg r0 = X.C66947Mfg.PROMPT_RESPONSE_NOTE
            goto L_0x001c
        L_0x005f:
            X.Mfg r0 = X.C66947Mfg.NOTE
            goto L_0x001c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3018760k.A0O(com.instagram.direct.inbox.notes.models.NoteStyle, boolean, boolean):void");
    }

    public final void A0P(Double d, Double d2, Integer num, int i, int i2) {
        String str;
        Long l;
        0wc r2 = this.A05;
        0Aj A002 = r2.A00(r2.A00, "ig_direct_inbox_v2_impression");
        if (A002.isSampled()) {
            A002.AAJ("nav_chain", A02());
            A002.A9F("note_inventory_count", Long.valueOf((long) i));
            A002.A9F("total_inventory_count", Long.valueOf((long) i2));
            if (this.A04) {
                str = "feed_timeline";
            } else {
                str = "direct_inbox";
            }
            A002.AAJ("container_module", str);
            if (num != null) {
                l = Long.valueOf((long) num.intValue());
            } else {
                l = null;
            }
            A002.A9F("client_position", l);
            A002.A8D("dwell_time_ms", d);
            A002.A8D("percent_viewed", d2);
            A002.AAJ("ranking_session_id", (String) this.A08.A0s.getValue());
            A002.AAJ("canonical_nav_chain", AnonymousClass1K6.A00);
            A002.Cgf();
        }
    }

    public final void A0Q(Long l, String str, double d, long j, boolean z) {
        Double d2;
        C319496qh r2 = this.A01;
        if (r2 != null) {
            0wc r3 = this.A05;
            0Aj A002 = r3.A00(r3.A00, "ig_note_reply_sheet_impression");
            if (A002.isSampled()) {
                A002.AAJ("container_module", str);
                A002.A8D("dwell_time_ms", Double.valueOf(d));
                A002.A9F("note_id", Long.valueOf(j));
                A002.A9F("target_ig_id", Long.valueOf(Long.parseLong(r2.A09)));
                A002.A9F("note_position", Long.valueOf((long) r2.A00));
                if (l != null) {
                    d2 = Double.valueOf(d - ((double) l.longValue()));
                } else {
                    d2 = null;
                }
                A002.A8D("dwell_time_ms_since_first_keystroke", d2);
                A002.A7p("has_try_it", Boolean.valueOf(z));
                A002.AAJ("canonical_nav_chain", AnonymousClass1K6.A00);
                A002.Cgf();
            }
        }
    }

    public final void A0R(String str, String str2) {
        0wc r2 = this.A05;
        0Aj A002 = r2.A00(r2.A00, "ig_notes_item_effect_impression");
        if (A002.isSampled()) {
            A002.AAJ("trigger", str);
            A002.AAJ("visual_effect_type", str2);
            A002.Cgf();
        }
    }

    public final void onUserSessionWillEnd(boolean z) {
        AnonymousClass0gd A002 = AnonymousClass0gd.A00();
        Object value = this.A0E.getValue();
        if (value != null) {
            A002.A00.remove(value);
        }
        this.A0C.clear();
        this.A09.clear();
        this.A0A.clear();
        this.A0D.clear();
        this.A03.clear();
        this.A00 = null;
        this.A01 = null;
        this.A02 = null;
    }
}
