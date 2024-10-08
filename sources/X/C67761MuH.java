package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.inbox.notes.NotesRepository;
import com.instagram.music.common.model.AudioOverlayTrack;
import java.util.List;

/* renamed from: X.MuH  reason: case insensitive filesystem */
public final class C67761MuH extends 2YL {
    public int A00;
    public C337257fy A01;
    public Float A02;
    public Float A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public List A08;
    public 05G A09;
    public 05G A0A;
    public 05G A0B;
    public 05G A0C;
    public 05G A0D;
    public 05G A0E;
    public boolean A0F;
    public boolean A0G;
    public 05G A0H;
    public 05G A0I;
    public 05G A0J;
    public 05G A0K;
    public final int A0L;
    public final UserSession A0M;
    public final AnonymousClass4JK A0N;
    public final NotesRepository A0O;
    public final C62026KWa A0P;
    public final 05G A0Q;
    public final 05G A0R;
    public final 05G A0S;
    public final 05G A0T;
    public final 05G A0U;
    public final AnonymousClass0Ud A0V;
    public final AnonymousClass0Ud A0W;
    public final AnonymousClass0Ud A0X;
    public final AnonymousClass0Ud A0Y;
    public final AnonymousClass0Ud A0Z;
    public final AnonymousClass0Ud A0a;
    public final AnonymousClass0Ud A0b;
    public final AnonymousClass0Ud A0c;
    public final AnonymousClass0Ud A0d;
    public final AnonymousClass0Ud A0e;
    public final AnonymousClass0Ud A0f;
    public final AnonymousClass0Ud A0g;
    public final AnonymousClass0Ud A0h;
    public final AnonymousClass0Ud A0i;
    public final AnonymousClass0Ud A0j;

    public static final void A03(C67761MuH muH, String str) {
        05G r5;
        boolean z;
        boolean z2 = true;
        if (str == null || str.length() == 0) {
            r5 = muH.A0H;
            z = false;
        } else {
            05G r4 = muH.A0I;
            UserSession userSession = muH.A0M;
            JTP.A1W(r4, AnonymousClass4AJ.A00(userSession) - 0mp.A00(str));
            r5 = muH.A0H;
            if (182.A06(0Tu.A05, userSession, 36317633569822109L) && AnonymousClass7TE.A0M(r4.getValue()) > 5) {
                z2 = false;
            }
            z = Boolean.valueOf(z2);
        }
        r5.Epw(z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0003, code lost:
        r0 = X.DbV.A12(r4);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean A05(java.lang.String r4) {
        /*
            r3 = this;
            r2 = 1
            if (r4 == 0) goto L_0x0021
            java.lang.String r0 = X.DbV.A12(r4)
            if (r0 == 0) goto L_0x0021
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x0021
            com.instagram.common.session.UserSession r0 = r3.A0M
            int r1 = X.AnonymousClass4AJ.A00(r0)
            java.lang.String r0 = X.DbV.A12(r4)
            int r0 = X.0mp.A00(r0)
            int r1 = r1 - r0
            if (r1 < 0) goto L_0x0021
            return r2
        L_0x0021:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67761MuH.A05(java.lang.String):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:118:0x02c1, code lost:
        if (r2.A03 == null) goto L_0x02c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x007f, code lost:
        if (r3 == false) goto L_0x0081;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A06(android.content.Context r39, com.instagram.direct.inbox.notes.models.NoteAudienceItem r40, com.instagram.direct.inbox.notes.models.NoteCreationSource r41, java.lang.String r42, java.util.List r43, boolean r44, boolean r45) {
        /*
            r38 = this;
            r0 = 0
            r4 = 1
            r2 = r38
            X.05G r12 = r2.A0J
            java.lang.Object r1 = r12.getValue()
            X.JwJ r1 = (X.C61081JwJ) r1
            java.lang.String r34 = ""
            r23 = 0
            if (r1 == 0) goto L_0x00fe
            java.lang.Object r8 = r1.A00
            com.instagram.music.common.model.AudioOverlayTrack r8 = (com.instagram.music.common.model.AudioOverlayTrack) r8
            java.lang.String r7 = r8.A0B
            if (r7 == 0) goto L_0x032a
            java.lang.String r6 = r8.A0A
            com.instagram.music.common.model.MusicAssetModel r3 = r8.A08
            if (r3 == 0) goto L_0x0024
            java.lang.String r5 = r3.A09
            if (r5 != 0) goto L_0x0026
        L_0x0024:
            r5 = r34
        L_0x0026:
            int r3 = r8.A02
            java.lang.Integer r15 = java.lang.Integer.valueOf(r3)
            int r3 = r8.A03
            java.lang.Integer r16 = java.lang.Integer.valueOf(r3)
            java.lang.String r3 = r2.A04
            boolean r8 = r2.A0G
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r8)
            java.lang.String r1 = r1.A01
            X.N38 r13 = new X.N38
            r20 = r42
            r21 = r3
            r22 = r1
            r17 = r7
            r18 = r6
            r19 = r5
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22)
        L_0x004d:
            X.05G r11 = r2.A0T
            java.lang.Object r1 = r11.getValue()
            com.instagram.model.venue.Venue r1 = (com.instagram.model.venue.Venue) r1
            if (r1 == 0) goto L_0x00fa
            java.lang.String r3 = r1.A02()
            X.0qQ.A07(r3)
            r1 = 6
            X.BBV r8 = new X.BBV
            r8.<init>(r3, r1)
        L_0x0064:
            java.lang.String r6 = r2.A06
            if (r6 == 0) goto L_0x00f7
            java.lang.String r5 = r2.A07
            int r7 = r2.A00
            if (r7 <= 0) goto L_0x0081
            java.util.List r3 = r2.A08
            if (r3 == 0) goto L_0x00f5
            int r7 = r7 - r4
            int r1 = r2.A0L
            int r7 = r7 % r1
            java.lang.Object r1 = r3.get(r7)
        L_0x007a:
            boolean r3 = r6.equals(r1)
            r1 = 1
            if (r3 != 0) goto L_0x0082
        L_0x0081:
            r1 = 0
        L_0x0082:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            r1 = 6
            X.JV7 r7 = new X.JV7
            r7.<init>((java.lang.Integer) r3, (java.lang.String) r5, (java.lang.String) r6, (int) r1)
        L_0x008c:
            java.lang.Float r1 = r2.A02
            if (r1 == 0) goto L_0x00f2
            float r5 = r1.floatValue()
            java.lang.Float r1 = r2.A03
            if (r1 == 0) goto L_0x00ef
            float r3 = r1.floatValue()
            boolean r1 = r2.A0F
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            X.Gmu r6 = new X.Gmu
            r6.<init>((java.lang.Boolean) r1, (float) r5, (float) r3)
        L_0x00a7:
            X.05G r5 = r2.A0A
            java.lang.Object r3 = r5.getValue()
            X.Noa r3 = (X.C69592Noa) r3
            if (r3 == 0) goto L_0x00ec
            boolean r1 = r3 instanceof X.NWS
            if (r1 == 0) goto L_0x00e9
            X.NWS r3 = (X.NWS) r3
            com.instagram.api.schemas.MusicInfo r1 = r3.A00
            com.instagram.api.schemas.TrackData r1 = r1.BUk()
            java.lang.String r9 = r1.getAudioClusterId()
        L_0x00c1:
            r1 = 5
            X.BBV r3 = new X.BBV
            r3.<init>(r9, r1)
        L_0x00c7:
            X.05G r1 = r2.A0C
            java.lang.Object r1 = r1.getValue()
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto L_0x0105
            boolean r9 = X.AnonymousClass7TE.A1b(r1)
            if (r9 == 0) goto L_0x0102
            java.util.ArrayList r10 = X.AnonymousClass7TG.A0r(r1)
            java.util.Iterator r1 = r1.iterator()
        L_0x00df:
            boolean r9 = r1.hasNext()
            if (r9 == 0) goto L_0x0108
            X.DbY.A1W(r10, r1)
            goto L_0x00df
        L_0x00e9:
            r9 = r23
            goto L_0x00c1
        L_0x00ec:
            r3 = r23
            goto L_0x00c7
        L_0x00ef:
            r6 = r23
            goto L_0x00a7
        L_0x00f2:
            r6 = r23
            goto L_0x00a7
        L_0x00f5:
            r1 = 0
            goto L_0x007a
        L_0x00f7:
            r7 = r23
            goto L_0x008c
        L_0x00fa:
            r8 = r23
            goto L_0x0064
        L_0x00fe:
            r13 = r23
            goto L_0x004d
        L_0x0102:
            r1 = r23
            goto L_0x010e
        L_0x0105:
            r1 = r23
            goto L_0x010e
        L_0x0108:
            r9 = 5
            X.JwG r1 = new X.JwG
            r1.<init>((java.util.List) r10, (int) r9)
        L_0x010e:
            X.0Ud r9 = r2.A0j
            java.lang.Object r10 = r9.getValue()
            java.lang.String r10 = (java.lang.String) r10
            if (r10 == 0) goto L_0x0278
            X.Jvk r9 = new X.Jvk
            r9.<init>((java.lang.String) r10, (boolean) r0, (int) r4)
            r10 = 16
            X.JwI r0 = new X.JwI
            r0.<init>((java.lang.Object) r9, (int) r10)
        L_0x0124:
            if (r13 == 0) goto L_0x01da
            X.N3r r22 = new X.N3r
            r24 = r23
            r25 = r6
            r26 = r23
            r27 = r23
            r28 = r23
            r29 = r23
            r30 = r7
            r31 = r13
            r22.<init>(r23, r24, r25, r26, r27, r28, r29, r30, r31)
        L_0x013b:
            java.lang.Object r0 = r12.getValue()
            if (r0 == 0) goto L_0x018d
            com.instagram.direct.inbox.notes.models.NoteStyle r5 = com.instagram.direct.inbox.notes.models.NoteStyle.MUSIC
        L_0x0143:
            com.instagram.common.session.UserSession r3 = r2.A0M
            X.0Tu r7 = X.0Tu.A05
            r0 = 36324917834428902(0x810d52000431e6, double:3.0353625349720584E-306)
            boolean r37 = X.182.A06(r7, r3, r0)
            java.lang.Float r0 = r2.A02
            r6 = r40
            r32 = r41
            r35 = r43
            if (r0 == 0) goto L_0x027c
            java.lang.Float r0 = r2.A03
            if (r0 == 0) goto L_0x027c
            r0 = 36321769625691887(0x810a75002726ef, double:3.033371595089951E-306)
            boolean r0 = X.182.A06(r7, r3, r0)
            if (r0 == 0) goto L_0x027c
            X.1Ng r3 = X.AnonymousClass1Nd.A00(r3)
            java.lang.String r2 = r2.A05
            if (r2 != 0) goto L_0x0173
            r2 = r34
        L_0x0173:
            com.instagram.direct.inbox.notes.models.NoteAudience r0 = r6.A00
            X.GnT r1 = new X.GnT
            r6 = r1
            r7 = r0
            r8 = r22
            r9 = r32
            r10 = r5
            r11 = r2
            r12 = r35
            r6.<init>(r7, r8, r9, r10, r11, r12)
            X.Osk r0 = new X.Osk
            r0.<init>(r1)
            r3.A00(r0)
            return
        L_0x018d:
            java.lang.Object r0 = r11.getValue()
            if (r0 == 0) goto L_0x0196
            com.instagram.direct.inbox.notes.models.NoteStyle r5 = com.instagram.direct.inbox.notes.models.NoteStyle.LOCATION
            goto L_0x0143
        L_0x0196:
            X.05G r0 = r2.A0E
            java.lang.Object r1 = r0.getValue()
            X.NjF r0 = X.C69314NjF.NOTE_CHAT
            if (r1 != r0) goto L_0x01a3
            com.instagram.direct.inbox.notes.models.NoteStyle r5 = com.instagram.direct.inbox.notes.models.NoteStyle.NOTE_CHAT
            goto L_0x0143
        L_0x01a3:
            X.05G r0 = r2.A0R
            java.lang.Object r0 = r0.getValue()
            if (r0 != 0) goto L_0x01b3
            X.05G r0 = r2.A0Q
            java.lang.Object r0 = r0.getValue()
            if (r0 == 0) goto L_0x01c0
        L_0x01b3:
            java.lang.String r0 = r2.A05
            if (r0 == 0) goto L_0x01bd
            int r0 = r0.length()
            if (r0 != 0) goto L_0x01c0
        L_0x01bd:
            com.instagram.direct.inbox.notes.models.NoteStyle r5 = com.instagram.direct.inbox.notes.models.NoteStyle.EMPTY
            goto L_0x0143
        L_0x01c0:
            java.lang.Object r0 = r5.getValue()
            if (r0 == 0) goto L_0x01ca
            com.instagram.direct.inbox.notes.models.NoteStyle r5 = com.instagram.direct.inbox.notes.models.NoteStyle.LISTENING_NOW
            goto L_0x0143
        L_0x01ca:
            X.05G r0 = r2.A0D
            java.lang.Object r0 = r0.getValue()
            if (r0 == 0) goto L_0x01d6
            com.instagram.direct.inbox.notes.models.NoteStyle r5 = com.instagram.direct.inbox.notes.models.NoteStyle.GIF
            goto L_0x0143
        L_0x01d6:
            com.instagram.direct.inbox.notes.models.NoteStyle r5 = com.instagram.direct.inbox.notes.models.NoteStyle.TEXT
            goto L_0x0143
        L_0x01da:
            if (r8 == 0) goto L_0x01f3
            X.N3r r22 = new X.N3r
            r24 = r23
            r25 = r6
            r26 = r8
            r27 = r23
            r28 = r23
            r29 = r23
            r30 = r7
            r31 = r23
            r22.<init>(r23, r24, r25, r26, r27, r28, r29, r30, r31)
            goto L_0x013b
        L_0x01f3:
            if (r7 == 0) goto L_0x020c
            X.N3r r22 = new X.N3r
            r24 = r23
            r25 = r6
            r26 = r23
            r27 = r23
            r28 = r23
            r29 = r23
            r30 = r7
            r31 = r23
            r22.<init>(r23, r24, r25, r26, r27, r28, r29, r30, r31)
            goto L_0x013b
        L_0x020c:
            if (r6 == 0) goto L_0x0225
            X.N3r r22 = new X.N3r
            r24 = r23
            r25 = r6
            r26 = r23
            r27 = r23
            r28 = r23
            r29 = r23
            r30 = r23
            r31 = r23
            r22.<init>(r23, r24, r25, r26, r27, r28, r29, r30, r31)
            goto L_0x013b
        L_0x0225:
            if (r3 == 0) goto L_0x023e
            X.N3r r22 = new X.N3r
            r24 = r23
            r25 = r23
            r26 = r23
            r27 = r23
            r28 = r23
            r29 = r3
            r30 = r23
            r31 = r23
            r22.<init>(r23, r24, r25, r26, r27, r28, r29, r30, r31)
            goto L_0x013b
        L_0x023e:
            if (r1 == 0) goto L_0x025b
            X.N3r r22 = new X.N3r
            r24 = r22
            r25 = r1
            r26 = r23
            r27 = r23
            r28 = r23
            r29 = r23
            r30 = r23
            r31 = r23
            r32 = r23
            r33 = r23
            r24.<init>(r25, r26, r27, r28, r29, r30, r31, r32, r33)
            goto L_0x013b
        L_0x025b:
            if (r0 == 0) goto L_0x0274
            X.N3r r22 = new X.N3r
            r24 = r0
            r25 = r23
            r26 = r23
            r27 = r23
            r28 = r23
            r29 = r23
            r30 = r23
            r31 = r23
            r22.<init>(r23, r24, r25, r26, r27, r28, r29, r30, r31)
            goto L_0x013b
        L_0x0274:
            r22 = r23
            goto L_0x013b
        L_0x0278:
            r0 = r23
            goto L_0x0124
        L_0x027c:
            long r0 = java.lang.System.currentTimeMillis()
            int r7 = (int) r0
            java.lang.String r1 = X.AnonymousClass69P.A06(r5)
            com.instagram.direct.inbox.notes.NotesRepository r8 = r2.A0O
            boolean r0 = com.instagram.direct.inbox.notes.NotesRepository.A04(r35)
            if (r0 == 0) goto L_0x0326
            java.lang.String r0 = "_with_pog_video"
        L_0x028f:
            java.lang.String r1 = X.002.A0R(r1, r0)
            X.OJi r0 = new X.OJi
            r9 = r39
            r0.<init>(r9, r3)
            r0.A00(r7, r1)
            java.lang.String r0 = r2.A05
            if (r0 == 0) goto L_0x02a3
            r34 = r0
        L_0x02a3:
            com.instagram.direct.inbox.notes.models.NoteAudience r0 = r6.A00
            r29 = r8
            r30 = r0
            r31 = r22
            r33 = r5
            r36 = r7
            r29.A0J(r30, r31, r32, r33, r34, r35, r36, r37)
            X.60k r7 = X.C3018660j.A01(r3)
            boolean r6 = r2.A08()
            java.lang.Float r1 = r2.A02
            if (r1 == 0) goto L_0x02c3
            java.lang.Float r2 = r2.A03
            r1 = 1
            if (r2 != 0) goto L_0x02c4
        L_0x02c3:
            r1 = 0
        L_0x02c4:
            r7.A0O(r5, r6, r1)
            if (r44 == 0) goto L_0x031a
            X.60k r2 = X.C3018660j.A01(r3)
            X.6r6 r1 = X.C319726r6.REPLY_SHEET_TRY_IT
            r2.A0G(r1)
        L_0x02d2:
            com.instagram.direct.inbox.notes.models.NoteStyle r1 = com.instagram.direct.inbox.notes.models.NoteStyle.EMPTY
            if (r5 == r1) goto L_0x0306
            X.60k r5 = X.C3018660j.A01(r3)
            X.Nmo r6 = X.C69506Nmo.A06
            int r1 = r0.ordinal()
            r0 = 2
            if (r1 != r0) goto L_0x0317
            X.GT1 r7 = X.GT1.CLOSE_FRIENDS
        L_0x02e5:
            java.lang.Object r0 = r12.getValue()
            X.JwJ r0 = (X.C61081JwJ) r0
            if (r0 == 0) goto L_0x02f9
            java.lang.Object r0 = r0.A00
            com.instagram.music.common.model.AudioOverlayTrack r0 = (com.instagram.music.common.model.AudioOverlayTrack) r0
            if (r0 == 0) goto L_0x02f9
            java.lang.String r0 = r0.A0B
            java.lang.Long r23 = X.C51972G9s.A0i(r0)
        L_0x02f9:
            r8 = 0
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r4)
            r9 = r8
            r12 = r8
            r13 = r8
            r11 = r23
            r5.A0E(r6, r7, r8, r9, r10, r11, r12, r13)
        L_0x0306:
            X.0xY r3 = X.AnonymousClass7TF.A0N(r3)
            long r1 = java.lang.System.currentTimeMillis()
            java.lang.String r0 = "notes_last_created_timestamp_ms"
            r3.E5c(r0, r1)
            r3.apply()
            return
        L_0x0317:
            X.GT1 r7 = X.GT1.MUTUAL_FOLLOWERS
            goto L_0x02e5
        L_0x031a:
            if (r45 == 0) goto L_0x02d2
            X.60k r2 = X.C3018660j.A01(r3)
            X.6r6 r1 = X.C319726r6.SHARESHEET_HSCROLL
            r2.A0G(r1)
            goto L_0x02d2
        L_0x0326:
            r0 = r34
            goto L_0x028f
        L_0x032a:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67761MuH.A06(android.content.Context, com.instagram.direct.inbox.notes.models.NoteAudienceItem, com.instagram.direct.inbox.notes.models.NoteCreationSource, java.lang.String, java.util.List, boolean, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0050, code lost:
        if (r3.A04() == false) goto L_0x0053;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A02(X.C67761MuH r3) {
        /*
            X.05G r2 = r3.A0K
            boolean r0 = r3.A08()
            if (r0 == 0) goto L_0x0044
            java.lang.String r0 = r3.A06
            boolean r1 = r3.A05(r0)
            java.lang.String r0 = r3.A05
            boolean r0 = r3.A05(r0)
            if (r1 == 0) goto L_0x002f
            if (r0 != 0) goto L_0x0026
            com.instagram.common.session.UserSession r0 = r3.A0M
            boolean r0 = X.AnonymousClass4AJ.A0B(r0)
            if (r0 == 0) goto L_0x002c
            boolean r0 = r3.A04()
            if (r0 == 0) goto L_0x002c
        L_0x0026:
            X.Nio r0 = X.C69288Nio.Enabled
        L_0x0028:
            r2.Epw(r0)
            return
        L_0x002c:
            X.Nio r0 = X.C69288Nio.PromptWithoutNote
            goto L_0x0028
        L_0x002f:
            if (r0 != 0) goto L_0x0041
            com.instagram.common.session.UserSession r0 = r3.A0M
            boolean r0 = X.AnonymousClass4AJ.A0B(r0)
            if (r0 == 0) goto L_0x0053
            X.0Ud r0 = r3.A0c
            java.lang.Object r0 = r0.getValue()
            if (r0 == 0) goto L_0x0053
        L_0x0041:
            X.Nio r0 = X.C69288Nio.NoteWithoutPrompt
            goto L_0x0028
        L_0x0044:
            java.lang.String r0 = r3.A05
            boolean r0 = r3.A05(r0)
            if (r0 != 0) goto L_0x0026
            boolean r0 = r3.A04()
            if (r0 == 0) goto L_0x0053
            goto L_0x0026
        L_0x0053:
            X.Nio r0 = X.C69288Nio.Disabled
            goto L_0x0028
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67761MuH.A02(X.MuH):void");
    }

    private final boolean A04() {
        UserSession userSession = this.A0M;
        if (!AnonymousClass4AJ.A06(userSession) || 182.A06(0Tu.A05, userSession, 36321456090588555L) || this.A0c.getValue() == null) {
            0Tu r2 = 0Tu.A05;
            if ((!182.A06(r2, userSession, 36320055931183006L) || this.A0g.getValue() == null) && ((this.A0W.getValue() == null || (182.A06(r2, userSession, 36320502607913470L) && (this.A02 == null || this.A03 == null))) && ((this.A0V.getValue() == null || (182.A06(r2, userSession, 36320502607913470L) && (this.A02 == null || this.A03 == null))) && !AnonymousClass7TF.A1W(this.A0E.getValue(), C69314NjF.SPOTIFY_NOTE)))) {
                return false;
            }
        }
        return true;
    }

    public final void A07(AudioOverlayTrack audioOverlayTrack, String str) {
        05G r2;
        C69314NjF njF;
        05G r1 = this.A0J;
        if (audioOverlayTrack == null) {
            r1.Epw((Object) null);
            r2 = this.A0E;
            if (r2.getValue() == C69314NjF.PROMPT_NOTE_WITH_MUSIC) {
                njF = C69314NjF.PROMPT_NOTE;
            } else {
                njF = C69314NjF.A06;
            }
        } else {
            r1.Epw(new C61081JwJ(audioOverlayTrack, str));
            r2 = this.A0E;
            if (r2.getValue() == C69314NjF.PROMPT_NOTE) {
                njF = C69314NjF.PROMPT_NOTE_WITH_MUSIC;
            } else {
                njF = C69314NjF.MUSIC_NOTE;
            }
        }
        r2.Epw(njF);
        A02(this);
    }

    public final boolean A08() {
        05G r2 = this.A0E;
        if (r2.getValue() == C69314NjF.PROMPT_NOTE || r2.getValue() == C69314NjF.PROMPT_NOTE_WITH_MUSIC) {
            return true;
        }
        return false;
    }

    public C67761MuH(UserSession userSession, AnonymousClass4JK r5, NotesRepository notesRepository, C62026KWa kWa) {
        C51974G9v.A1M(notesRepository, r5, kWa);
        this.A0M = userSession;
        this.A0O = notesRepository;
        this.A0N = r5;
        this.A0P = kWa;
        02z A10 = DbS.A10(C69314NjF.A06);
        this.A0E = A10;
        this.A0h = 10b.A03(A10);
        02z A012 = 106.A01(Integer.valueOf(AnonymousClass4AJ.A00(userSession)));
        this.A0I = A012;
        this.A0Z = 10b.A03(A012);
        0Tu r2 = 0Tu.A05;
        02z A0s = JTQ.A0s(C51965G9l.A1a(r2, userSession, 36317633569822109L));
        this.A0H = A0s;
        this.A0Y = 10b.A03(A0s);
        02z A013 = 106.A01((Object) null);
        this.A0J = A013;
        this.A0c = 10b.A03(A013);
        02z A014 = 106.A01((Object) null);
        this.A0D = A014;
        this.A0j = 10b.A03(A014);
        02z A102 = DbS.A10(C69288Nio.Disabled);
        this.A0K = A102;
        this.A0e = 10b.A03(A102);
        02z A015 = 106.A01(N44.A03);
        this.A0U = A015;
        this.A0i = 10b.A03(A015);
        02z A016 = 106.A01((Object) null);
        this.A0T = A016;
        this.A0g = 10b.A03(A016);
        02z A017 = 106.A01((Object) null);
        this.A0R = A017;
        this.A0W = 10b.A03(A017);
        02z A018 = 106.A01((Object) null);
        this.A0Q = A018;
        this.A0V = 10b.A03(A018);
        02z A019 = 106.A01((Object) null);
        this.A0S = A019;
        this.A0X = 10b.A03(A019);
        02z A0110 = 106.A01((Object) null);
        this.A09 = A0110;
        this.A0a = 10b.A03(A0110);
        02z A0111 = 106.A01((Object) null);
        this.A0B = A0111;
        this.A0d = 10b.A03(A0111);
        02z A0112 = 106.A01((Object) null);
        this.A0C = A0112;
        this.A0f = 10b.A03(A0112);
        02z A0113 = 106.A01((Object) null);
        this.A0A = A0113;
        this.A0b = 10b.A03(A0113);
        this.A0L = DbS.A04(r2, userSession, 36607303344002594L);
        if (182.A06(r2, userSession, 36329165556825950L)) {
            C73565Pfm.A02(this, C318116oQ.A00(this), 38);
        }
    }

    public static Object A00(C68449NIn nIn) {
        return C68449NIn.A02(nIn).A0W.getValue();
    }

    public static Object A01(C68449NIn nIn) {
        return C68449NIn.A02(nIn).A0V.getValue();
    }
}
