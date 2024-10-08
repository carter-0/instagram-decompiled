package X;

import com.instagram.api.schemas.NoteCustomThemeImpl;
import com.instagram.common.session.UserSession;
import com.instagram.direct.inbox.notes.NotesRepository;
import com.instagram.direct.inbox.notes.NotesRepository$deleteNote$1;
import com.instagram.friendmap.data.FriendMapRepository;
import com.instagram.spotlight.fetch.SpotlightFetchRepository;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* renamed from: X.49u  reason: invalid class name and case insensitive filesystem */
public final class C2614949u extends 2YL {
    public Integer A00;
    public final UserSession A01;
    public final AnonymousClass4JK A02;
    public final NotesRepository A03;
    public final C2615249x A04;
    public final FriendMapRepository A05;
    public final SpotlightFetchRepository A06;
    public final String A07;
    public final SortedMap A08;
    public final AnonymousClass0eM A09 = AnonymousClass0eN.A01(new AnonymousClass9LO(this, 22));
    public final AnonymousClass0eM A0A;
    public final AnonymousClass0r6 A0B;
    public final AnonymousClass0r6 A0C;
    public final 05G A0D;
    public final C61770pa A0E;
    public final C61770pa A0F;

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0042, code lost:
        if (r1 != false) goto L_0x0044;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C376539Ij A00(X.C61063Jw1 r8, X.AnonymousClass4A9 r9, X.C2614949u r10, java.lang.String r11, java.util.List r12, java.util.List r13) {
        /*
            com.instagram.common.session.UserSession r3 = r10.A01
            boolean r0 = X.AnonymousClass4AJ.A03(r3)
            r6 = 0
            if (r0 == 0) goto L_0x002e
            X.49x r2 = r10.A04
            java.lang.String r1 = r3.A06
            monitor-enter(r2)
            java.util.Map r0 = r2.A01     // Catch:{ all -> 0x0017 }
            java.lang.Object r0 = r0.get(r1)     // Catch:{ all -> 0x0017 }
            X.4AB r0 = (X.AnonymousClass4AB) r0     // Catch:{ all -> 0x0017 }
            goto L_0x001a
        L_0x0017:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x001a:
            monitor-exit(r2)
            if (r0 != 0) goto L_0x002e
            com.instagram.user.model.User r1 = X.AnonymousClass69P.A05(r3)
            com.instagram.user.model.User r0 = X.AnonymousClass69P.A05(r3)
            boolean r0 = X.AnonymousClass9O2.A00(r0)
            X.4AS r6 = new X.4AS
            r6.<init>(r1, r11, r0)
        L_0x002e:
            X.49x r0 = r10.A04
            com.instagram.direct.inbox.notes.NotesRepository r2 = r0.A06
            X.0Ud r5 = r2.A0l
            java.lang.Object r0 = r5.getValue()
            java.util.Collection r0 = (java.util.Collection) r0
            r4 = 0
            if (r0 == 0) goto L_0x0044
            boolean r1 = r0.isEmpty()
            r0 = 0
            if (r1 == 0) goto L_0x0045
        L_0x0044:
            r0 = 1
        L_0x0045:
            r7 = 0
            if (r0 != 0) goto L_0x0085
            X.0Ud r0 = r2.A0p
            java.lang.Object r0 = r0.getValue()
            java.util.List r0 = (java.util.List) r0
            java.util.Iterator r3 = r0.iterator()
            r2 = 0
        L_0x0055:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0080
            java.lang.Object r0 = r3.next()
            X.4zZ r0 = (X.C279864zZ) r0
            X.5y2 r0 = r0.A0A
            if (r0 == 0) goto L_0x007e
            X.60F r0 = r0.A0B
            if (r0 == 0) goto L_0x007e
            java.lang.String r1 = r0.A02
        L_0x006b:
            java.lang.Object r0 = r5.getValue()
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r0 = r0.get(r4)
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x0081
            int r2 = r2 + 1
            goto L_0x0055
        L_0x007e:
            r1 = r7
            goto L_0x006b
        L_0x0080:
            r2 = -1
        L_0x0081:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r2)
        L_0x0085:
            X.9Ij r3 = new X.9Ij
            r4 = r8
            r5 = r9
            r8 = r12
            r9 = r13
            r3.<init>((X.C61063Jw1) r4, (X.AnonymousClass4A9) r5, (X.AnonymousClass4AS) r6, (java.lang.Integer) r7, (java.util.List) r8, (java.util.List) r9)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2614949u.A00(X.Jw1, X.4A9, X.49u, java.lang.String, java.util.List, java.util.List):X.9Ij");
    }

    public static final List A01(List list, Map map) {
        Boolean bool;
        List<AnonymousClass4AT> list2 = list;
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(0Yv.A1E(list2, 10));
        for (AnonymousClass4AT r14 : list2) {
            Map map2 = map;
            if (map == null || (bool = (Boolean) map2.get(r14.A08)) == null) {
                bool = r14.A07;
            }
            String str = r14.A0A;
            User user = r14.A06;
            boolean z = r14.A0G;
            Map map3 = r14.A0E;
            boolean z2 = r14.A0F;
            List list3 = r14.A0D;
            int i = r14.A01;
            int i2 = r14.A03;
            int i3 = r14.A04;
            String str2 = r14.A0C;
            String str3 = r14.A0B;
            String str4 = r14.A08;
            String str5 = r14.A09;
            NoteCustomThemeImpl noteCustomThemeImpl = r14.A05;
            0qQ.A0B(str, 0);
            0qQ.A0B(user, 1);
            0qQ.A0B(map3, 3);
            String str6 = str;
            String str7 = str2;
            String str8 = str3;
            String str9 = str4;
            NoteCustomThemeImpl noteCustomThemeImpl2 = noteCustomThemeImpl;
            User user2 = user;
            Boolean bool2 = bool;
            arrayList.add(new AnonymousClass4AT(noteCustomThemeImpl2, user2, bool2, str6, str7, str8, str9, str5, list3, map3, r14.A02, i, i2, i3, z, z2));
        }
        return arrayList;
    }

    public final void A02(long j) {
        if (j != 0) {
            this.A03.A0D(j, (String) null);
        }
    }

    public final void A03(long j) {
        long j2 = j;
        if (j != 0) {
            NotesRepository notesRepository = this.A03;
            C262224Cq r2 = notesRepository.A01;
            NotesRepository$deleteNote$1 notesRepository$deleteNote$1 = new NotesRepository$deleteNote$1(notesRepository, (String) null, (AnonymousClass4D7) null, j2);
            1Eo.A03(AnonymousClass05K.A00, 19B.A00, notesRepository$deleteNote$1, r2);
        }
    }

    public final void A04(long j) {
        if (j != 0) {
            this.A03.A0E(j, (String) null);
        }
    }

    public final void A05(AnonymousClass4AB r4, boolean z) {
        AnonymousClass4AB r1;
        if (r4.A08 != null) {
            if (z) {
                Integer num = r4.A02;
                if (num != null) {
                    this.A08.put(num, r4);
                }
            } else {
                Set entrySet = this.A08.entrySet();
                if (entrySet != null) {
                    entrySet.removeIf(new MBC(new C73934PmE(r4, 49)));
                }
            }
            Collection values = this.A08.values();
            Integer num2 = null;
            if (values != null) {
                r1 = (AnonymousClass4AB) 00k.A0A(values);
                if (r1 != null) {
                    num2 = r1.A02;
                }
            } else {
                r1 = null;
            }
            this.A00 = num2;
            this.A04.A0J.Epw(r1);
        }
    }

    public final void A06(Integer num, Runnable runnable, boolean z) {
        this.A04.A02(num, runnable, z);
        if (AnonymousClass3HF.A02(this.A01)) {
            this.A05.A08((Double) null, (Double) null, new C377089Km(this, 29), false, false);
        }
    }

    public final boolean A07() {
        Integer num;
        Object obj;
        AnonymousClass4AB r3;
        Integer num2;
        int i;
        SortedMap sortedMap = this.A08;
        Set entrySet = sortedMap.entrySet();
        0qQ.A07(entrySet);
        Iterator it = entrySet.iterator();
        while (true) {
            num = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            int intValue = ((Number) ((Map.Entry) obj).getKey()).intValue();
            Integer num3 = this.A00;
            if (num3 != null) {
                i = num3.intValue();
                continue;
            } else {
                i = -1;
                continue;
            }
            if (intValue > i) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry == null || (r3 = (AnonymousClass4AB) entry.getValue()) == null) {
            Collection values = sortedMap.values();
            0qQ.A07(values);
            r3 = (AnonymousClass4AB) 00k.A0A(values);
        }
        Integer num4 = this.A00;
        if (r3 != null) {
            num2 = r3.A02;
        } else {
            num2 = null;
        }
        if (0qQ.A0K(num4, num2)) {
            return false;
        }
        if (r3 != null) {
            num = r3.A02;
        }
        this.A00 = num;
        this.A04.A0J.Epw(r3);
        return true;
    }

    public C2614949u(UserSession userSession, AnonymousClass4JK r10, NotesRepository notesRepository, C2615249x r12, FriendMapRepository friendMapRepository, SpotlightFetchRepository spotlightFetchRepository, String str) {
        this.A01 = userSession;
        this.A04 = r12;
        this.A03 = notesRepository;
        this.A05 = friendMapRepository;
        this.A06 = spotlightFetchRepository;
        this.A02 = r10;
        this.A07 = str;
        User A012 = AnonymousClass0t1.A01.A01(userSession);
        List list = 0sn.A00;
        this.A0D = new 02z(new AnonymousClass4A9(A012, (String) null, list, list, 0, false));
        this.A0F = notesRepository.A0j;
        this.A0E = notesRepository.A0c;
        this.A0A = AnonymousClass0eN.A01(new AnonymousClass9LO(this, 23));
        this.A08 = new TreeMap();
        this.A0B = r12.A0E;
        this.A0C = r12.A0F;
    }
}
