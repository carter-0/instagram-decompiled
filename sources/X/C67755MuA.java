package X;

import com.instagram.api.schemas.GIFNoteResponseInfo;
import com.instagram.api.schemas.LocationNoteResponseInfo;
import com.instagram.api.schemas.Lyrics;
import com.instagram.api.schemas.NotePogImageDict;
import com.instagram.api.schemas.NotePogVideoDict;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.direct.inbox.notes.NotesRepository;
import com.instagram.direct.inbox.notes.models.NoteAudience;
import com.instagram.direct.inbox.notes.reply.MusicNoteQuickReplySheetContent;
import com.instagram.direct.inbox.notes.reply.QuickReplySheetContent;
import com.instagram.friendmap.data.FriendMapRepository;

/* renamed from: X.MuA  reason: case insensitive filesystem */
public final class C67755MuA extends 2YL {
    public long A00;
    public boolean A01 = true;
    public final UserSession A02;
    public final AnonymousClass4JK A03;
    public final NotesRepository A04;
    public final FriendMapRepository A05;
    public final String A06;
    public final 05G A07;
    public final 05G A08;
    public final AnonymousClass0Ud A09;
    public final AnonymousClass0Ud A0A;
    public final QuickReplySheetContent A0B;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v0, resolved type: X.N3C} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v1, resolved type: X.N3C} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v2, resolved type: X.N3C} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v3, resolved type: X.N3C} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r38v1, resolved type: com.instagram.api.schemas.Lyrics} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v5, resolved type: X.N3C} */
    /* JADX WARNING: type inference failed for: r20v4, types: [com.instagram.api.schemas.Lyrics] */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0068, code lost:
        if (r2 == null) goto L_0x0199;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x006a, code lost:
        r12 = r2.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x006c, code lost:
        r2 = r0.A0B;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x006e, code lost:
        if (r2 == null) goto L_0x019f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0070, code lost:
        r11 = r2.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0072, code lost:
        r16 = X.182.A06(X.0Tu.A05, r4, 36328143354674133L);
        r20 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x007f, code lost:
        if (r0 == null) goto L_0x00da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0081, code lost:
        r2 = r0.A07;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0083, code lost:
        if (r2 == null) goto L_0x013a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0085, code lost:
        r3 = r2.A00;
        r44 = X.DbX.A01(r3.BUp().AdU());
        r4 = r3.BUp().BZg();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x009b, code lost:
        if (r4 == null) goto L_0x0136;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x009d, code lost:
        r45 = r4.intValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00a1, code lost:
        r43 = r3.BUp().getDerivedContentId();
        r46 = r3.BUp().getShouldMuteAudio();
        r39 = r3.BUk();
        r5 = r2.A01;
        r4 = r2.A02;
        r2 = r2.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00bb, code lost:
        if (r16 == false) goto L_0x00cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00bd, code lost:
        r3 = r3.BUk().BOn();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00c5, code lost:
        if (r3 == null) goto L_0x00cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00c7, code lost:
        r20 = r3.F5h();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00cb, code lost:
        r37 = new X.N3C(r20, r39, r5, r4, r2, r43, r44, r45, r46);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00d8, code lost:
        r20 = r37;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00da, code lost:
        if (r0 == null) goto L_0x0129;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00dc, code lost:
        r6 = r0.A06;
        r2 = r0.A09;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00e0, code lost:
        if (r2 == null) goto L_0x012b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00e2, code lost:
        r5 = r2.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00e4, code lost:
        r2 = r0.A09;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00e6, code lost:
        if (r2 == null) goto L_0x0130;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00e8, code lost:
        r4 = r2.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00ea, code lost:
        r2 = r0.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00ec, code lost:
        r34 = X.AnonymousClass7TF.A1Y(r1.A0E, true);
        r1 = r1.A0O;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00f4, code lost:
        if (r0 == null) goto L_0x0108;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00f6, code lost:
        r0 = r0.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00f8, code lost:
        if (r0 == null) goto L_0x0108;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00fa, code lost:
        r0 = r0.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00fc, code lost:
        if (r0 == null) goto L_0x0108;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00fe, code lost:
        r0 = r0.BUk();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0102, code lost:
        if (r0 == null) goto L_0x0108;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0104, code lost:
        r29 = r0.getAudioClusterId();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0108, code lost:
        r10.Epw(new X.C68770NWf(r2, r6, r4, r5, r17, (com.instagram.contentnotes.data.metadata.ContentNoteMetadata) null, r9, r20, r15, r22, r23, r14, r8, r26, r12, r11, r29, r30, r31, r32, r13, r34, r35, r36, r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0128, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0129, code lost:
        r6 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x012b, code lost:
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x012d, code lost:
        if (r0 == null) goto L_0x0130;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0130, code lost:
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0132, code lost:
        if (r0 != null) goto L_0x00ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0134, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0136, code lost:
        r45 = 30000;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x013a, code lost:
        r2 = r0.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x013c, code lost:
        if (r2 == null) goto L_0x00da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x013e, code lost:
        r3 = r2.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0140, code lost:
        if (r3 == null) goto L_0x00da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0142, code lost:
        r4 = r3.BUp();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0146, code lost:
        if (r4 == null) goto L_0x0196;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0148, code lost:
        r4 = r4.AdU();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x014c, code lost:
        if (r4 == null) goto L_0x0196;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x014e, code lost:
        r44 = r4.intValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0152, code lost:
        r4 = r3.BUp();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0156, code lost:
        if (r4 == null) goto L_0x0193;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0158, code lost:
        r4 = r4.BZg();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x015c, code lost:
        if (r4 == null) goto L_0x0193;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x015e, code lost:
        r45 = r4.intValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0162, code lost:
        r4 = r3.BUp();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0060, code lost:
        if (r0.A0B == null) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0166, code lost:
        if (r4 == null) goto L_0x0190;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0168, code lost:
        r43 = r4.getDerivedContentId();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x016c, code lost:
        r4 = r3.BUp();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0170, code lost:
        if (r4 == null) goto L_0x018d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0172, code lost:
        r46 = r4.getShouldMuteAudio();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0176, code lost:
        r37 = new X.N3C((com.instagram.api.schemas.Lyrics) null, r3.BUk(), (com.instagram.user.model.User) null, false, r2.A02, r43, r44, r45, r46);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x018d, code lost:
        r46 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0190, code lost:
        r43 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0193, code lost:
        r45 = 30000;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0196, code lost:
        r44 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0199, code lost:
        r12 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x019b, code lost:
        if (r0 == null) goto L_0x019f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x019f, code lost:
        r11 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0064, code lost:
        if (r0 != null) goto L_0x0066;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0066, code lost:
        r2 = r0.A0B;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A02(X.C279864zZ r45, X.C67755MuA r46) {
        /*
            r6 = 0
            r3 = r46
            r3.A01 = r6
            X.05G r10 = r3.A08
            r1 = r45
            int r0 = r1.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            com.instagram.direct.inbox.notes.models.NoteAudience r9 = X.AnonymousClass916.A00(r0)
            java.lang.String r15 = r1.A0H
            com.instagram.user.model.User r0 = r1.A0D
            java.lang.String r22 = r0.getUsername()
            java.lang.String r23 = r0.getFullName()
            if (r23 != 0) goto L_0x0023
            java.lang.String r23 = ""
        L_0x0023:
            com.instagram.common.typedurl.ImageUrl r17 = r0.Bh3()
            java.lang.String r14 = r1.A0J
            java.lang.String r8 = r1.A0K
            com.instagram.direct.inbox.notes.NotesRepository r2 = r3.A04
            com.instagram.common.session.UserSession r4 = r3.A02
            java.lang.String r0 = r4.A06
            int r30 = r2.A05(r0)
            long r2 = r1.A02
            java.lang.String r26 = java.lang.String.valueOf(r2)
            com.instagram.direct.inbox.notes.models.NoteAudience r0 = com.instagram.direct.inbox.notes.models.NoteAudience.CLOSE_FRIENDS
            r7 = 1
            boolean r31 = X.AnonymousClass7TF.A1W(r9, r0)
            com.instagram.user.model.User r0 = X.DbV.A0j(r4, r8)
            boolean r32 = X.AnonymousClass9O2.A00(r0)
            boolean r13 = r1.A0P
            int r2 = r1.A01
            com.instagram.direct.inbox.notes.models.NoteStyle r0 = com.instagram.direct.inbox.notes.models.NoteStyle.UNSUPPORTED
            int r0 = r0.A00
            boolean r35 = X.AnonymousClass7TF.A1S(r2, r0)
            X.5y2 r0 = r1.A0A
            r29 = 0
            if (r0 == 0) goto L_0x0062
            X.60F r2 = r0.A0B
            r36 = 1
            if (r2 != 0) goto L_0x0066
        L_0x0062:
            r36 = 0
            if (r0 == 0) goto L_0x0199
        L_0x0066:
            X.60F r2 = r0.A0B
            if (r2 == 0) goto L_0x0199
            java.lang.String r12 = r2.A03
        L_0x006c:
            X.60F r2 = r0.A0B
            if (r2 == 0) goto L_0x019f
            java.lang.String r11 = r2.A02
        L_0x0072:
            X.0Tu r5 = X.0Tu.A05
            r2 = 36328143354674133(0x81104100013bd5, double:3.03740236696327E-306)
            boolean r16 = X.182.A06(r5, r4, r2)
            r20 = 0
            if (r0 == 0) goto L_0x00da
            com.instagram.api.schemas.MusicNoteResponseInfo r2 = r0.A07
            if (r2 == 0) goto L_0x013a
            com.instagram.api.schemas.MusicInfo r3 = r2.A00
            com.instagram.music.common.model.MusicConsumptionModel r4 = r3.BUp()
            java.lang.Integer r4 = r4.AdU()
            int r44 = X.DbX.A01(r4)
            com.instagram.music.common.model.MusicConsumptionModel r4 = r3.BUp()
            java.lang.Integer r4 = r4.BZg()
            if (r4 == 0) goto L_0x0136
            int r45 = r4.intValue()
        L_0x00a1:
            com.instagram.music.common.model.MusicConsumptionModel r4 = r3.BUp()
            java.lang.String r43 = r4.getDerivedContentId()
            com.instagram.music.common.model.MusicConsumptionModel r4 = r3.BUp()
            boolean r46 = r4.getShouldMuteAudio()
            com.instagram.api.schemas.TrackData r39 = r3.BUk()
            com.instagram.user.model.User r5 = r2.A01
            java.lang.Boolean r4 = r2.A02
            java.lang.Boolean r2 = r2.A03
            if (r16 == 0) goto L_0x00cb
            com.instagram.api.schemas.TrackData r3 = r3.BUk()
            com.instagram.api.schemas.LyricsIntf r3 = r3.BOn()
            if (r3 == 0) goto L_0x00cb
            com.instagram.api.schemas.Lyrics r20 = r3.F5h()
        L_0x00cb:
            X.N3C r37 = new X.N3C
            r38 = r20
            r40 = r5
            r41 = r4
            r42 = r2
            r37.<init>(r38, r39, r40, r41, r42, r43, r44, r45, r46)
        L_0x00d8:
            r20 = r37
        L_0x00da:
            if (r0 == 0) goto L_0x0129
            com.instagram.api.schemas.LocationNoteResponseInfo r6 = r0.A06
            X.60C r2 = r0.A09
            if (r2 == 0) goto L_0x012b
            com.instagram.api.schemas.NotePogVideoDict r5 = r2.A01
        L_0x00e4:
            X.60C r2 = r0.A09
            if (r2 == 0) goto L_0x0130
            com.instagram.api.schemas.NotePogImageDict r4 = r2.A00
        L_0x00ea:
            com.instagram.api.schemas.GIFNoteResponseInfo r2 = r0.A02
        L_0x00ec:
            java.lang.Boolean r3 = r1.A0E
            boolean r34 = X.AnonymousClass7TF.A1Y(r3, r7)
            boolean r1 = r1.A0O
            if (r0 == 0) goto L_0x0108
            com.instagram.api.schemas.ListeningNowResponseInfo r0 = r0.A04
            if (r0 == 0) goto L_0x0108
            com.instagram.api.schemas.MusicInfo r0 = r0.A01
            if (r0 == 0) goto L_0x0108
            com.instagram.api.schemas.TrackData r0 = r0.BUk()
            if (r0 == 0) goto L_0x0108
            java.lang.String r29 = r0.getAudioClusterId()
        L_0x0108:
            r18 = 0
            X.NWf r0 = new X.NWf
            r21 = r15
            r24 = r14
            r25 = r8
            r27 = r12
            r28 = r11
            r33 = r13
            r37 = r1
            r13 = r2
            r14 = r6
            r15 = r4
            r16 = r5
            r19 = r9
            r12 = r0
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37)
            r10.Epw(r0)
            return
        L_0x0129:
            r6 = r29
        L_0x012b:
            r5 = r29
            if (r0 == 0) goto L_0x0130
            goto L_0x00e4
        L_0x0130:
            r4 = r29
            if (r0 != 0) goto L_0x00ea
            r2 = r4
            goto L_0x00ec
        L_0x0136:
            r45 = 30000(0x7530, float:4.2039E-41)
            goto L_0x00a1
        L_0x013a:
            com.instagram.api.schemas.ListeningNowResponseInfo r2 = r0.A04
            if (r2 == 0) goto L_0x00da
            com.instagram.api.schemas.MusicInfo r3 = r2.A01
            if (r3 == 0) goto L_0x00da
            com.instagram.music.common.model.MusicConsumptionModel r4 = r3.BUp()
            if (r4 == 0) goto L_0x0196
            java.lang.Integer r4 = r4.AdU()
            if (r4 == 0) goto L_0x0196
            int r44 = r4.intValue()
        L_0x0152:
            com.instagram.music.common.model.MusicConsumptionModel r4 = r3.BUp()
            if (r4 == 0) goto L_0x0193
            java.lang.Integer r4 = r4.BZg()
            if (r4 == 0) goto L_0x0193
            int r45 = r4.intValue()
        L_0x0162:
            com.instagram.music.common.model.MusicConsumptionModel r4 = r3.BUp()
            if (r4 == 0) goto L_0x0190
            java.lang.String r43 = r4.getDerivedContentId()
        L_0x016c:
            com.instagram.music.common.model.MusicConsumptionModel r4 = r3.BUp()
            if (r4 == 0) goto L_0x018d
            boolean r46 = r4.getShouldMuteAudio()
        L_0x0176:
            com.instagram.api.schemas.TrackData r39 = r3.BUk()
            java.lang.Boolean r41 = java.lang.Boolean.valueOf(r6)
            java.lang.Boolean r2 = r2.A02
            X.N3C r37 = new X.N3C
            r38 = r29
            r40 = r29
            r42 = r2
            r37.<init>(r38, r39, r40, r41, r42, r43, r44, r45, r46)
            goto L_0x00d8
        L_0x018d:
            r46 = 0
            goto L_0x0176
        L_0x0190:
            r43 = r29
            goto L_0x016c
        L_0x0193:
            r45 = 30000(0x7530, float:4.2039E-41)
            goto L_0x0162
        L_0x0196:
            r44 = 0
            goto L_0x0152
        L_0x0199:
            r12 = r29
            if (r0 == 0) goto L_0x019f
            goto L_0x006c
        L_0x019f:
            r11 = r29
            goto L_0x0072
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67755MuA.A02(X.4zZ, X.MuA):void");
    }

    public C67755MuA(UserSession userSession, AnonymousClass4JK r45, NotesRepository notesRepository, QuickReplySheetContent quickReplySheetContent, FriendMapRepository friendMapRepository, String str, long j) {
        AnonymousClass0Ud r2;
        C73566Pfn pfn;
        N3C n3c;
        this.A02 = userSession;
        NotesRepository notesRepository2 = notesRepository;
        this.A04 = notesRepository2;
        this.A03 = r45;
        this.A05 = friendMapRepository;
        this.A00 = j;
        this.A06 = str;
        QuickReplySheetContent quickReplySheetContent2 = quickReplySheetContent;
        this.A0B = quickReplySheetContent2;
        02z A012 = 106.A01(C68772NWh.A00);
        this.A08 = A012;
        this.A0A = 10b.A03(A012);
        02z A013 = 106.A01((Object) null);
        this.A07 = A013;
        this.A09 = 10b.A03(A013);
        if (quickReplySheetContent != null) {
            String valueOf = String.valueOf(quickReplySheetContent2.A00);
            String str2 = quickReplySheetContent2.A0F;
            String str3 = quickReplySheetContent2.A0A;
            ImageUrl imageUrl = quickReplySheetContent2.A05;
            String str4 = quickReplySheetContent2.A0B;
            String str5 = quickReplySheetContent2.A09;
            NotesRepository notesRepository3 = this.A04;
            UserSession userSession2 = this.A02;
            int A052 = notesRepository3.A05(userSession2.A06);
            NoteAudience noteAudience = quickReplySheetContent2.A07;
            String str6 = quickReplySheetContent2.A0E;
            boolean A1W = AnonymousClass7TF.A1W(noteAudience, NoteAudience.CLOSE_FRIENDS);
            boolean A002 = AnonymousClass9O2.A00(DbV.A0j(userSession2, str5));
            boolean z = quickReplySheetContent2.A0H;
            boolean z2 = quickReplySheetContent2.A0J;
            boolean z3 = quickReplySheetContent2.A0I;
            String str7 = quickReplySheetContent2.A0D;
            String str8 = quickReplySheetContent2.A0C;
            MusicNoteQuickReplySheetContent musicNoteQuickReplySheetContent = quickReplySheetContent2.A08;
            if (musicNoteQuickReplySheetContent != null) {
                int i = musicNoteQuickReplySheetContent.A01;
                int i2 = musicNoteQuickReplySheetContent.A00;
                String str9 = musicNoteQuickReplySheetContent.A06;
                boolean z4 = musicNoteQuickReplySheetContent.A07;
                n3c = new N3C((Lyrics) null, musicNoteQuickReplySheetContent.A02, musicNoteQuickReplySheetContent.A03, musicNoteQuickReplySheetContent.A04, musicNoteQuickReplySheetContent.A05, str9, i, i2, z4);
            } else {
                n3c = null;
            }
            LocationNoteResponseInfo locationNoteResponseInfo = quickReplySheetContent2.A02;
            NotePogVideoDict notePogVideoDict = quickReplySheetContent2.A04;
            NotePogImageDict notePogImageDict = quickReplySheetContent2.A03;
            GIFNoteResponseInfo gIFNoteResponseInfo = quickReplySheetContent2.A01;
            boolean z5 = z2;
            boolean z6 = z3;
            A012.Epw(new C68770NWf(gIFNoteResponseInfo, locationNoteResponseInfo, notePogImageDict, notePogVideoDict, imageUrl, quickReplySheetContent2.A06, noteAudience, n3c, valueOf, str2, str3, str4, str5, str6, str7, str8, (String) null, A052, A1W, A002, z, quickReplySheetContent2.A0G, z5, z6, true));
            return;
        }
        if (str != null) {
            r2 = notesRepository2.A0r;
            pfn = new C73566Pfn(this, (AnonymousClass4D7) null, 23);
        } else {
            r2 = notesRepository2.A0p;
            pfn = new C73566Pfn(this, (AnonymousClass4D7) null, 24);
        }
        DbY.A19(this, pfn, r2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: X.4zZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: X.4zZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: X.4zZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: X.4zZ} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C279864zZ A00(X.C67755MuA r6, java.util.Map r7) {
        /*
            java.lang.String r0 = r6.A06
            java.lang.Object r0 = r7.get(r0)
            X.4zc r0 = (X.C279894zc) r0
            r5 = 0
            if (r0 == 0) goto L_0x0031
            java.util.List r0 = r0.A05
            if (r0 == 0) goto L_0x0031
            java.util.Iterator r4 = r0.iterator()
        L_0x0013:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x002f
            java.lang.Object r3 = r4.next()
            r0 = r3
            X.4zZ r0 = (X.C279864zZ) r0
            java.lang.String r2 = r0.A0H
            long r0 = r6.A00
            java.lang.String r0 = java.lang.String.valueOf(r0)
            boolean r0 = X.0qQ.A0K(r2, r0)
            if (r0 == 0) goto L_0x0013
            r5 = r3
        L_0x002f:
            X.4zZ r5 = (X.C279864zZ) r5
        L_0x0031:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67755MuA.A00(X.MuA, java.util.Map):X.4zZ");
    }

    public static Object A01(AnonymousClass0eM r0) {
        return ((C67755MuA) r0.getValue()).A0A.getValue();
    }
}
