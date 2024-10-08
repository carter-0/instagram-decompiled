package X;

import com.instagram.api.schemas.NoteCustomThemeImpl;
import com.instagram.api.schemas.NoteEmojiReactionInfo;
import com.instagram.api.schemas.NotePogImageDict;
import com.instagram.api.schemas.NotePogVideoDict;
import com.instagram.common.session.UserSession;
import com.instagram.direct.inbox.notes.models.NoteAudience;
import com.instagram.direct.inbox.notes.models.NoteStyle;
import com.instagram.direct.model.thread.CreatorBroadcastThreadInfo;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: X.911  reason: invalid class name */
public abstract class AnonymousClass911 {
    public static final String A01(UserSession userSession, User user) {
        0qQ.A0B(user, 0);
        2Dm A00 = 1bJ.A00(userSession);
        List singletonList = Collections.singletonList(new PendingRecipient(user));
        0qQ.A07(singletonList);
        return A00.BYg((CreatorBroadcastThreadInfo) null, (String) null, (String) null, singletonList).C6C();
    }

    public static final ArrayList A02(C279864zZ r4, boolean z) {
        Object obj;
        int i;
        ArrayList arrayList = new ArrayList();
        NoteStyle noteStyle = (NoteStyle) NoteStyle.A01.get(Integer.valueOf(r4.A01));
        if (noteStyle == null) {
            noteStyle = NoteStyle.UNKNOWN;
        }
        switch (noteStyle.ordinal()) {
            case 1:
                obj = new AnonymousClass91B(r4);
                break;
            case 2:
                obj = new AnonymousClass912(r4);
                break;
            case 4:
                i = 4;
                break;
            case 5:
                obj = new C382039cz(r4, 1);
                break;
            case 7:
                i = 5;
                break;
            case 8:
                i = 2;
                if (z) {
                    i = 3;
                    break;
                }
                break;
            case 9:
                i = 1;
                break;
            case 10:
                obj = new AnonymousClass9IJ(r4, 0);
                break;
            case 11:
                obj = new C382039cz(r4, 0);
                break;
            default:
                return arrayList;
        }
        obj = new AnonymousClass9IJ(r4, i);
        arrayList.add(obj);
        return arrayList;
    }

    public static final List A03(UserSession userSession, String str, String str2, String str3, List list, Map map) {
        String str4;
        NotePogVideoDict notePogVideoDict;
        boolean z;
        Boolean bool;
        AnonymousClass60C r6;
        List list2;
        NoteEmojiReactionInfo noteEmojiReactionInfo;
        String str5 = str2;
        0qQ.A0B(str5, 3);
        ArrayList arrayList = new ArrayList();
        List<C279864zZ> list3 = list;
        for (C279864zZ r0 : list3) {
            UserSession userSession2 = userSession;
            17i A00 = 17h.A00(userSession2);
            String str6 = r0.A0K;
            User A02 = A00.A02(str6);
            List list4 = null;
            if (A02 != null) {
                ArrayList A022 = A02(r0, false);
                int indexOf = list3.indexOf(r0);
                int size = list3.size();
                String A01 = A01(userSession2, A02);
                NoteAudience A002 = AnonymousClass916.A00(Integer.valueOf(r0.A00));
                C300865y4 r9 = r0.A07;
                if (r9 == null || (list2 = r9.A01) == null || (noteEmojiReactionInfo = (NoteEmojiReactionInfo) 00k.A0J(list2)) == null) {
                    str4 = null;
                } else {
                    str4 = noteEmojiReactionInfo.A02;
                }
                C300845y2 r62 = r0.A0A;
                if (r62 == null || (r6 = r62.A09) == null) {
                    notePogVideoDict = null;
                } else {
                    notePogVideoDict = r6.A01;
                }
                if (0qQ.A0K(str6, userSession2.A06) && r9 != null) {
                    list4 = r9.A01;
                }
                boolean z2 = r0.A0R;
                String str7 = r0.A0H;
                boolean A0K = 0qQ.A0K(str3, str7);
                NoteCustomThemeImpl noteCustomThemeImpl = r0.A06;
                Map map2 = map;
                if (map == null || (bool = (Boolean) map2.get(str7)) == null) {
                    z = false;
                } else {
                    z = bool.booleanValue();
                }
                arrayList.add(new AnonymousClass4AB(noteCustomThemeImpl, (NotePogImageDict) null, notePogVideoDict, A002, A02, false, Integer.valueOf(indexOf), Integer.valueOf(size), (Integer) null, (Integer) null, A01, str, str5, str4, A022, (List) null, (List) null, list4, (List) null, (List) null, 0, false, false, A0K, false, false, true, false, false, false, false, z2, z));
            }
        }
        return arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00a2, code lost:
        if (r10 != null) goto L_0x00a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0021, code lost:
        if (r7.A0H.equals("2") == false) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0160, code lost:
        if (r10 != null) goto L_0x00aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0168, code lost:
        if (r3 != null) goto L_0x016a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0120  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x015c  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0167  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.AnonymousClass4AB A00(X.C279864zZ r45, com.instagram.common.session.UserSession r46, java.lang.Integer r47, int r48, int r49, boolean r50, boolean r51, boolean r52, boolean r53, boolean r54, boolean r55, boolean r56, boolean r57) {
        /*
            r43 = 0
            r17 = 1
            r7 = r45
            X.5y2 r10 = r7.A0A
            r9 = 0
            if (r10 == 0) goto L_0x009d
            X.60F r3 = r10.A0B
            com.instagram.api.schemas.NoteChatResponseInfo r8 = r10.A08
        L_0x000f:
            int r1 = r7.A01
            com.instagram.direct.inbox.notes.models.NoteStyle r0 = com.instagram.direct.inbox.notes.models.NoteStyle.NOTE_CHAT
            int r0 = r0.A00
            if (r1 != r0) goto L_0x0023
            java.lang.String r4 = r7.A0H
            java.lang.String r2 = "2"
            boolean r2 = r4.equals(r2)
            r16 = 1
            if (r2 != 0) goto L_0x0025
        L_0x0023:
            r16 = 0
        L_0x0025:
            com.instagram.user.model.User r11 = r7.A0D
            r19 = r55
            r2 = r19
            java.util.ArrayList r31 = A02(r7, r2)
            r6 = r46
            java.lang.String r27 = A01(r6, r11)
            com.instagram.direct.inbox.notes.models.NoteStyle r2 = com.instagram.direct.inbox.notes.models.NoteStyle.PROMPT_QUESTION
            int r2 = r2.A00
            r41 = 0
            if (r1 != r2) goto L_0x003f
            r41 = 1
        L_0x003f:
            if (r3 == 0) goto L_0x009a
            java.lang.Integer r2 = r3.A01
            r18 = r2
        L_0x0045:
            if (r16 == 0) goto L_0x008c
            java.lang.Integer r26 = java.lang.Integer.valueOf(r17)
        L_0x004b:
            if (r3 == 0) goto L_0x008a
            java.lang.String r15 = r3.A02
        L_0x004f:
            if (r10 == 0) goto L_0x0088
            X.60F r2 = r10.A0B
            if (r2 == 0) goto L_0x0088
            java.lang.String r14 = r2.A03
        L_0x0057:
            r5 = 10
            if (r10 == 0) goto L_0x00a1
            X.60F r2 = r10.A0B
            if (r2 == 0) goto L_0x00a1
            java.util.List r3 = r2.A04
            if (r3 == 0) goto L_0x00a1
            int r2 = X.0Yv.A1E(r3, r5)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r2)
            java.util.Iterator r3 = r3.iterator()
        L_0x0070:
            boolean r2 = r3.hasNext()
            if (r2 == 0) goto L_0x00a4
            java.lang.Object r2 = r3.next()
            com.instagram.user.model.User r2 = (com.instagram.user.model.User) r2
            com.instagram.common.typedurl.ImageUrl r2 = r2.Bh3()
            java.lang.String r2 = r2.getUrl()
            r4.add(r2)
            goto L_0x0070
        L_0x0088:
            r14 = r9
            goto L_0x0057
        L_0x008a:
            r15 = r9
            goto L_0x004f
        L_0x008c:
            if (r8 == 0) goto L_0x0097
            int r2 = r8.BWz()
            java.lang.Integer r26 = java.lang.Integer.valueOf(r2)
            goto L_0x004b
        L_0x0097:
            r26 = r9
            goto L_0x004b
        L_0x009a:
            r18 = r9
            goto L_0x0045
        L_0x009d:
            r3 = r9
            r8 = r9
            goto L_0x000f
        L_0x00a1:
            r4 = r9
            if (r10 == 0) goto L_0x015f
        L_0x00a4:
            X.60C r2 = r10.A09
            if (r2 == 0) goto L_0x015f
            com.instagram.api.schemas.NotePogVideoDict r13 = r2.A01
        L_0x00aa:
            X.60C r2 = r10.A09
            if (r2 == 0) goto L_0x0164
            com.instagram.api.schemas.NotePogImageDict r12 = r2.A00
        L_0x00b0:
            X.5y4 r3 = r7.A07
            if (r3 == 0) goto L_0x015c
            java.util.List r2 = r3.A01
            if (r2 == 0) goto L_0x015c
            java.lang.Object r2 = X.00k.A0J(r2)
            com.instagram.api.schemas.NoteEmojiReactionInfo r2 = (com.instagram.api.schemas.NoteEmojiReactionInfo) r2
            if (r2 == 0) goto L_0x015c
            java.lang.String r10 = r2.A02
        L_0x00c2:
            int r2 = r7.A00
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            com.instagram.direct.inbox.notes.models.NoteAudience r20 = X.AnonymousClass916.A00(r2)
            r46 = 0
            if (r1 != r0) goto L_0x00d2
            r46 = 1
        L_0x00d2:
            if (r16 == 0) goto L_0x0120
            com.instagram.common.typedurl.ImageUrl r0 = r11.Bh3()
            java.lang.String r0 = r0.getUrl()
            java.util.List r2 = java.util.Collections.singletonList(r0)
            X.0qQ.A07(r2)
            java.lang.Boolean r22 = java.lang.Boolean.valueOf(r17)
        L_0x00e7:
            java.lang.String r0 = r7.A0K
            java.lang.String r1 = r6.A06
            boolean r0 = X.0qQ.A0K(r0, r1)
            if (r0 == 0) goto L_0x011e
            if (r3 == 0) goto L_0x011e
            java.util.List r8 = r3.A01
        L_0x00f5:
            com.instagram.api.schemas.NoteCustomThemeImpl r6 = r7.A06
            X.60J r3 = r7.A04
            if (r3 == 0) goto L_0x0167
            java.util.List r1 = r3.A00
            if (r1 == 0) goto L_0x0167
            int r5 = X.0Yv.A1E(r1, r5)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r5)
            java.util.Iterator r5 = r1.iterator()
        L_0x010c:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L_0x016a
            java.lang.Object r1 = r5.next()
            X.BEK r1 = (X.BEK) r1
            com.instagram.user.model.User r1 = r1.A01
            r0.add(r1)
            goto L_0x010c
        L_0x011e:
            r8 = r9
            goto L_0x00f5
        L_0x0120:
            if (r8 == 0) goto L_0x014d
            java.util.List r1 = r8.BxY()
            if (r1 == 0) goto L_0x014d
            int r0 = X.0Yv.A1E(r1, r5)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r0)
            java.util.Iterator r1 = r1.iterator()
        L_0x0135:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0153
            java.lang.Object r0 = r1.next()
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            com.instagram.common.typedurl.ImageUrl r0 = r0.Bh3()
            java.lang.String r0 = r0.getUrl()
            r2.add(r0)
            goto L_0x0135
        L_0x014d:
            r2 = r9
            if (r8 != 0) goto L_0x0153
            r22 = r9
            goto L_0x00e7
        L_0x0153:
            boolean r0 = r8.CXA()
            java.lang.Boolean r22 = java.lang.Boolean.valueOf(r0)
            goto L_0x00e7
        L_0x015c:
            r10 = r9
            goto L_0x00c2
        L_0x015f:
            r13 = r9
            if (r10 == 0) goto L_0x0164
            goto L_0x00aa
        L_0x0164:
            r12 = r9
            goto L_0x00b0
        L_0x0167:
            r0 = r9
            if (r3 == 0) goto L_0x016c
        L_0x016a:
            java.util.List r9 = r3.A01
        L_0x016c:
            java.lang.Integer r24 = java.lang.Integer.valueOf(r48)
            X.4AB r16 = new X.4AB
            r23 = r47
            r37 = r49
            r38 = r50
            r39 = r51
            r40 = r52
            r42 = r53
            r45 = r54
            r47 = r56
            r48 = r57
            r25 = r18
            r28 = r15
            r29 = r14
            r30 = r10
            r32 = r4
            r33 = r2
            r34 = r8
            r35 = r0
            r36 = r9
            r44 = r19
            r49 = r43
            r17 = r6
            r18 = r12
            r19 = r13
            r21 = r11
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49)
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass911.A00(X.4zZ, com.instagram.common.session.UserSession, java.lang.Integer, int, int, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean):X.4AB");
    }
}
