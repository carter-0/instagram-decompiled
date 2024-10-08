package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.inbox.notes.NotesRepository;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.MuG  reason: case insensitive filesystem */
public final class C67760MuG extends 2YL {
    public boolean A00 = true;
    public final NotesRepository A01;
    public final C60261JiI A02;
    public final String A03;
    public final 05G A04;
    public final 05G A05;
    public final AnonymousClass0Ud A06;
    public final AnonymousClass0Ud A07;
    public final AnonymousClass0Ud A08;
    public final UserSession A09;
    public final OIR A0A;

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0048, code lost:
        if (r12 != null) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004c, code lost:
        if (r12.A0D == true) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004e, code lost:
        r2 = r12.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0050, code lost:
        if (r5 == null) goto L_0x006a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0052, code lost:
        X.DbY.A19(r9, new X.C73561Pfh(r4, r5, r6, (X.AnonymousClass4D7) null, 4), r11.A0r);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005d, code lost:
        X.DbY.A19(r9, new X.C73566Pfn(r9, (X.AnonymousClass4D7) null, 22), r13.A02);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0069, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006a, code lost:
        if (r1 == false) goto L_0x007c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006c, code lost:
        if (r2 == null) goto L_0x007c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x006e, code lost:
        r9.A02.A02(false);
        r3.Epw(A02(r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x007c, code lost:
        X.DbY.A19(r9, new X.C59842JaI((java.lang.Object) r9, r6, (X.AnonymousClass4D7) null, 17), r11.A0p);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0089, code lost:
        r1 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x008a, code lost:
        if (r12 != null) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x008c, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0042, code lost:
        r6 = (r0 = r12.A03).A0H;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C67760MuG(com.instagram.common.session.UserSession r10, com.instagram.direct.inbox.notes.NotesRepository r11, X.OIR r12, X.C60261JiI r13, java.lang.String r14, java.lang.String r15) {
        /*
            r9 = this;
            r4 = r9
            r6 = r14
            r5 = r15
            r9.<init>()
            r9.A09 = r10
            r9.A01 = r11
            r9.A02 = r13
            r9.A0A = r12
            r9.A03 = r15
            X.NWe r0 = X.C68769NWe.A00
            X.02z r3 = X.106.A01(r0)
            r9.A05 = r3
            X.05F r0 = X.10b.A03(r3)
            r9.A08 = r0
            X.NWa r0 = X.C68765NWa.A00
            X.02z r0 = X.106.A01(r0)
            r9.A04 = r0
            X.05F r0 = X.10b.A03(r0)
            r9.A07 = r0
            X.0Ud r0 = r13.A03
            r9.A06 = r0
            r1 = 1
            r9.A00 = r1
            r7 = 0
            if (r15 != 0) goto L_0x003a
            if (r12 == 0) goto L_0x008e
            java.lang.String r5 = r12.A09
        L_0x003a:
            if (r14 != 0) goto L_0x0048
            if (r12 == 0) goto L_0x0046
            X.4zZ r0 = r12.A03
            if (r0 == 0) goto L_0x0046
            java.lang.String r6 = r0.A0H
            if (r6 != 0) goto L_0x004a
        L_0x0046:
            java.lang.String r6 = ""
        L_0x0048:
            if (r12 == 0) goto L_0x0089
        L_0x004a:
            boolean r0 = r12.A0D
            if (r0 != r1) goto L_0x0089
        L_0x004e:
            X.4zZ r2 = r12.A03
        L_0x0050:
            if (r5 == 0) goto L_0x006a
            X.0Ud r0 = r11.A0r
            r8 = 4
            X.Pfh r3 = new X.Pfh
            r3.<init>(r4, r5, r6, r7, r8)
            X.DbY.A19(r9, r3, r0)
        L_0x005d:
            X.0Ud r2 = r13.A02
            r1 = 22
            X.Pfn r0 = new X.Pfn
            r0.<init>(r9, r7, r1)
            X.DbY.A19(r9, r0, r2)
            return
        L_0x006a:
            if (r1 == 0) goto L_0x007c
            if (r2 == 0) goto L_0x007c
            X.JiI r1 = r9.A02
            r0 = 0
            r1.A02(r0)
            X.NWb r0 = r9.A02(r2)
            r3.Epw(r0)
            goto L_0x005d
        L_0x007c:
            X.0Ud r2 = r11.A0p
            r1 = 17
            X.JaI r0 = new X.JaI
            r0.<init>((java.lang.Object) r9, (java.lang.String) r6, (X.AnonymousClass4D7) r7, (int) r1)
            X.DbY.A19(r9, r0, r2)
            goto L_0x005d
        L_0x0089:
            r1 = 0
            if (r12 != 0) goto L_0x004e
            r2 = r7
            goto L_0x0050
        L_0x008e:
            r5 = r7
            goto L_0x003a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67760MuG.<init>(com.instagram.common.session.UserSession, com.instagram.direct.inbox.notes.NotesRepository, X.OIR, X.JiI, java.lang.String, java.lang.String):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: X.4zZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: X.4zZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: X.4zZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: X.4zZ} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C279864zZ A00(X.C279894zc r5, X.C67760MuG r6) {
        /*
            r4 = 0
            if (r5 == 0) goto L_0x0025
            java.util.List r0 = r5.A05
            if (r0 == 0) goto L_0x0025
            java.util.Iterator r3 = r0.iterator()
        L_0x000b:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0023
            java.lang.Object r2 = r3.next()
            r0 = r2
            X.4zZ r0 = (X.C279864zZ) r0
            java.lang.String r1 = r0.A0K
            com.instagram.common.session.UserSession r0 = r6.A09
            boolean r0 = X.C51966G9m.A1W(r0, r1)
            if (r0 == 0) goto L_0x000b
            r4 = r2
        L_0x0023:
            X.4zZ r4 = (X.C279864zZ) r4
        L_0x0025:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67760MuG.A00(X.4zc, X.MuG):X.4zZ");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00c9, code lost:
        if (r10 == null) goto L_0x00cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00cd, code lost:
        if (r10 != null) goto L_0x0051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00d1, code lost:
        if (r10 != null) goto L_0x0057;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00d8, code lost:
        if (r11 != null) goto L_0x00da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00dc, code lost:
        if (r0 != null) goto L_0x00e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00de, code lost:
        r0 = X.0sn.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0109, code lost:
        return new X.C68766NWb(r7, r12, r13, r14, r15, r2, r5, r6, r9, r8, r27, r0, r29, r19, r4, r3, r18, r10, r1, r0, r37, r38);
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00d6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final X.C68766NWb A02(X.C279864zZ r40) {
        /*
            r39 = this;
            r8 = r40
            com.instagram.user.model.User r0 = r8.A0D
            com.instagram.common.typedurl.ImageUrl r27 = r0.Bh3()
            java.lang.String r0 = r8.A0J
            r19 = r0
            r0 = r39
            com.instagram.direct.inbox.notes.NotesRepository r1 = r0.A01
            com.instagram.common.session.UserSession r11 = r0.A09
            java.lang.String r0 = r11.A06
            int r37 = r1.A05(r0)
            int r0 = r8.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            com.instagram.direct.inbox.notes.models.NoteAudience r3 = X.AnonymousClass916.A00(r0)
            r2 = 0
            r14 = 0
            r12 = 0
            r1 = 0
            com.instagram.direct.inbox.notes.models.NoteAudienceItem r17 = new com.instagram.direct.inbox.notes.models.NoteAudienceItem
            r0 = r17
            r0.<init>(r3, r2, r2, r1)
            int r1 = r8.A01
            com.instagram.direct.inbox.notes.models.NoteStyle r0 = com.instagram.direct.inbox.notes.models.NoteStyle.UNSUPPORTED
            int r0 = r0.A00
            boolean r38 = X.AnonymousClass7TF.A1S(r1, r0)
            X.5y2 r10 = r8.A0A
            if (r10 == 0) goto L_0x00c5
            com.instagram.api.schemas.MusicNoteResponseInfo r15 = r10.A07
            com.instagram.api.schemas.LocationNoteResponseInfo r14 = r10.A06
            com.instagram.api.schemas.LiveNoteResponseInfo r13 = r10.A05
            com.instagram.api.schemas.ListeningNowResponseInfo r12 = r10.A04
            com.instagram.api.schemas.GIFNoteResponseInfo r7 = r10.A02
            X.60C r0 = r10.A09
            if (r0 == 0) goto L_0x00c8
            com.instagram.api.schemas.NotePogVideoDict r6 = r0.A01
        L_0x004b:
            X.60C r0 = r10.A09
            if (r0 == 0) goto L_0x00cc
            com.instagram.api.schemas.NotePogImageDict r5 = r0.A00
        L_0x0051:
            X.60F r0 = r10.A0B
            if (r0 == 0) goto L_0x00d0
            java.lang.String r4 = r0.A02
        L_0x0057:
            X.60F r0 = r10.A0B
            if (r0 == 0) goto L_0x00d4
            java.lang.String r3 = r0.A03
        L_0x005d:
            com.instagram.direct.inbox.notes.models.NoteStyle r0 = com.instagram.direct.inbox.notes.models.NoteStyle.NOTE_CHAT
            int r0 = r0.A00
            boolean r0 = X.AnonymousClass7TF.A1S(r1, r0)
            java.lang.Boolean r29 = java.lang.Boolean.valueOf(r0)
            if (r10 == 0) goto L_0x006d
            com.instagram.api.schemas.NoteChatResponseInfo r2 = r10.A08
        L_0x006d:
            java.lang.String r0 = r8.A0H
            r18 = r0
            X.0Tu r9 = X.0Tu.A05
            r0 = 36321237047715005(0x8109f9000824bd, double:3.0330347906328514E-306)
            boolean r0 = X.182.A06(r9, r11, r0)
            if (r0 == 0) goto L_0x00c2
            boolean r0 = X.AnonymousClass4AJ.A05(r11)
            if (r0 == 0) goto L_0x0094
            if (r10 == 0) goto L_0x0094
            X.60F r0 = r10.A0B
            if (r0 == 0) goto L_0x0094
            java.lang.String r0 = r0.A03
            if (r0 == 0) goto L_0x0094
            int r0 = r0.length()
            if (r0 != 0) goto L_0x00c2
        L_0x0094:
            X.0sn r10 = X.0sn.A00
        L_0x0096:
            boolean r0 = X.AnonymousClass4AJ.A07(r11)
            if (r0 == 0) goto L_0x00c0
            X.60L r9 = r8.A09
        L_0x009e:
            X.60J r11 = r8.A04
            if (r11 == 0) goto L_0x00d6
            java.util.List r0 = r11.A00
            if (r0 == 0) goto L_0x00d6
            java.util.ArrayList r1 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r16 = r0.iterator()
        L_0x00ae:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x00da
            java.lang.Object r0 = r16.next()
            X.BEK r0 = (X.BEK) r0
            com.instagram.user.model.User r0 = r0.A01
            r1.add(r0)
            goto L_0x00ae
        L_0x00c0:
            r9 = 0
            goto L_0x009e
        L_0x00c2:
            java.util.List r10 = r8.A0N
            goto L_0x0096
        L_0x00c5:
            r15 = 0
            r13 = 0
            r7 = 0
        L_0x00c8:
            r6 = 0
            if (r10 == 0) goto L_0x00cc
            goto L_0x004b
        L_0x00cc:
            r5 = 0
            if (r10 == 0) goto L_0x00d0
            goto L_0x0051
        L_0x00d0:
            r4 = 0
            if (r10 == 0) goto L_0x00d4
            goto L_0x0057
        L_0x00d4:
            r3 = 0
            goto L_0x005d
        L_0x00d6:
            X.0sn r1 = X.0sn.A00
            if (r11 == 0) goto L_0x00de
        L_0x00da:
            java.util.List r0 = r11.A01
            if (r0 != 0) goto L_0x00e0
        L_0x00de:
            X.0sn r0 = X.0sn.A00
        L_0x00e0:
            X.NWb r16 = new X.NWb
            r28 = r17
            r30 = r19
            r31 = r4
            r32 = r3
            r33 = r18
            r34 = r10
            r35 = r1
            r36 = r0
            r22 = r2
            r23 = r5
            r24 = r6
            r25 = r9
            r26 = r8
            r18 = r12
            r19 = r13
            r20 = r14
            r21 = r15
            r17 = r7
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38)
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67760MuG.A02(X.4zZ):X.NWb");
    }

    public static final void A03(C279864zZ r2, C67760MuG muG) {
        muG.A02.A02(false);
        muG.A00 = false;
        muG.A05.Epw(muG.A02(r2));
    }

    public static final void A04(C67760MuG muG) {
        if (muG.A00 && !0qQ.A0K(muG.A05.getValue(), C68767NWc.A00)) {
            AnonymousClass7TE.A1Z(new C66167MGe(muG, (AnonymousClass4D7) null, 11), C318116oQ.A00(muG));
        }
    }

    public static final C279864zZ A01(C67760MuG muG, List list) {
        Object obj;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (C51966G9m.A1W(muG.A09, ((C279864zZ) obj).A0K)) {
                break;
            }
        }
        return (C279864zZ) obj;
    }
}
