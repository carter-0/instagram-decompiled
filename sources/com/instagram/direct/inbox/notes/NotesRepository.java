package com.instagram.direct.inbox.notes;

import X.00k;
import X.018;
import X.02m;
import X.02z;
import X.05D;
import X.05G;
import X.0KC;
import X.0Tu;
import X.0V1;
import X.0V2;
import X.0Ym;
import X.0Yt;
import X.0Yv;
import X.0qQ;
import X.0sL;
import X.0se;
import X.0sn;
import X.0sr;
import X.106;
import X.10D;
import X.10b;
import X.17h;
import X.17i;
import X.182;
import X.19B;
import X.1Eo;
import X.1Er;
import X.1Zm;
import X.1Zp;
import X.1vm;
import X.28K;
import X.AnonymousClass05K;
import X.AnonymousClass0Ud;
import X.AnonymousClass1Nd;
import X.AnonymousClass3Q2;
import X.AnonymousClass43D;
import X.AnonymousClass43E;
import X.AnonymousClass43F;
import X.AnonymousClass4AJ;
import X.AnonymousClass4D7;
import X.AnonymousClass60F;
import X.AnonymousClass60G;
import X.AnonymousClass69P;
import X.AnonymousClass9K1;
import X.AnonymousClass9KZ;
import X.AnonymousClass9M5;
import X.C241063Ns;
import X.C252733pa;
import X.C262204Co;
import X.C262224Cq;
import X.C268654dm;
import X.C279844zW;
import X.C279864zZ;
import X.C279894zc;
import X.C300845y2;
import X.C300855y3;
import X.C300865y4;
import X.C376909Ju;
import X.C376979Kb;
import X.C44237Cay;
import X.C45459Cwq;
import X.C45461Cws;
import X.C45463Cwu;
import X.C53370Gmu;
import X.C61770pa;
import X.C66149MEc;
import X.C66579MXk;
import X.C68176N3r;
import X.C71913Osv;
import X.C73924Pm4;
import X.C73934PmE;
import X.JVS;
import X.MEV;
import android.content.Context;
import com.instagram.api.schemas.NoteEmojiReactionInfo;
import com.instagram.common.session.UserSession;
import com.instagram.direct.inbox.notes.models.NoteAudience;
import com.instagram.direct.inbox.notes.models.NoteCreationSource;
import com.instagram.direct.inbox.notes.models.NoteStyle;
import com.instagram.pendingmedia.store.PendingMediaStore;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;

public final class NotesRepository extends C252733pa {
    public int A00;
    public long A01;
    public C279844zW A02;
    public HashMap A03;
    public HashSet A04;
    public List A05;
    public C241063Ns A06;
    public C262204Co A07;
    public C262204Co A08;
    public C262204Co A09;
    public final Context A0A;
    public final UserSession A0B;
    public final NotesApi A0C;
    public final AnonymousClass43E A0D;
    public final AnonymousClass43F A0E;
    public final PendingMediaStore A0F;
    public final 17i A0G;
    public final HashMap A0H;
    public final HashMap A0I;
    public final Map A0J;
    public final 0V2 A0K;
    public final 0V2 A0L;
    public final 0V2 A0M;
    public final 0V2 A0N;
    public final 0V2 A0O;
    public final 0V2 A0P;
    public final 0V2 A0Q;
    public final 0V2 A0R;
    public final 0V2 A0S;
    public final 05G A0T;
    public final 05G A0U;
    public final 05G A0V;
    public final 05G A0W;
    public final 05G A0X;
    public final 05G A0Y;
    public final 05G A0Z;
    public final 05G A0a;
    public final 05G A0b;
    public final C61770pa A0c;
    public final C61770pa A0d;
    public final C61770pa A0e;
    public final C61770pa A0f;
    public final C61770pa A0g;
    public final C61770pa A0h;
    public final C61770pa A0i;
    public final C61770pa A0j;
    public final C61770pa A0k;
    public final AnonymousClass0Ud A0l;
    public final AnonymousClass0Ud A0m;
    public final AnonymousClass0Ud A0n;
    public final AnonymousClass0Ud A0o;
    public final AnonymousClass0Ud A0p;
    public final AnonymousClass0Ud A0q;
    public final AnonymousClass0Ud A0r;
    public final AnonymousClass0Ud A0s;
    public final AnonymousClass0Ud A0t;

    public static final synchronized void A01(C279864zZ r9, NotesRepository notesRepository, String str, String str2, List list, Map map) {
        0sn r4;
        synchronized (notesRepository) {
            17i r1 = notesRepository.A0G;
            UserSession userSession = notesRepository.A0B;
            User A022 = r1.A02(userSession.A06);
            if (A022 != null) {
                if (str2 == null) {
                    r4 = 0sn.A00;
                } else {
                    r4 = Collections.singletonList(new NoteEmojiReactionInfo(A022, (Boolean) null, str2));
                    0qQ.A07(r4);
                }
                C300865y4 r3 = r9.A07;
                if (r3 != null) {
                    C45463Cwu cwu = new C45463Cwu(r9);
                    cwu.A07 = C44237Cay.A00(r3, r3.A00(), r4);
                    List list2 = list;
                    list.set(list.indexOf(r9), AnonymousClass69P.A02(cwu.A00(), userSession));
                    C279894zc r0 = (C279894zc) map.get(str);
                    if (r0 != null) {
                        String str3 = r0.A03;
                        String str4 = r0.A04;
                        User user = r0.A00;
                        String str5 = r0.A02;
                        String str6 = r0.A01;
                        0qQ.A0B(str3, 0);
                        0qQ.A0B(str4, 1);
                        map.put(str, new C279894zc(user, str3, str4, str5, str6, list2));
                    }
                }
            }
        }
    }

    public static final synchronized void A02(C279864zZ r14, NotesRepository notesRepository, String str, List list, Map map) {
        C279894zc r4;
        String str2;
        AnonymousClass60F r0;
        synchronized (notesRepository) {
            String str3 = str;
            List list2 = list;
            Map map2 = map;
            if (list != null) {
                018.A1A(list2, new C73934PmE(notesRepository, 44));
                list2.add(0, r14);
                C279894zc r02 = (C279894zc) map2.get(str3);
                if (r02 != null) {
                    String str4 = r02.A03;
                    String str5 = r02.A04;
                    User user = r02.A00;
                    String str6 = r02.A02;
                    String str7 = r02.A01;
                    0qQ.A0B(str4, 0);
                    0qQ.A0B(str5, 1);
                    r4 = new C279894zc(user, str4, str5, str6, str7, list2);
                }
            } else {
                C300845y2 r03 = r14.A0A;
                if (r03 == null || (r0 = r03.A0B) == null || (str2 = r0.A03) == null) {
                    str2 = "";
                }
                UserSession userSession = notesRepository.A0B;
                r4 = new C279894zc(17h.A00(userSession).A02(userSession.A06), str3, str2, (String) null, (String) null, 0sr.A1M(new C279864zZ[]{r14}));
            }
            map2.put(str3, r4);
        }
    }

    public static final boolean A04(List list) {
        0qQ.A0B(list, 0);
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((AnonymousClass3Q2) next).A12()) {
                if (next == null) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public final C279864zZ A06(String str) {
        Object obj;
        0qQ.A0B(str, 0);
        Collection values = this.A0I.values();
        0qQ.A07(values);
        Iterator it = values.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (0qQ.A0K(((C279864zZ) obj).A0H, str)) {
                break;
            }
        }
        return (C279864zZ) obj;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: X.4zZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: X.4zZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: X.4zZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: X.4zZ} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C279864zZ A07(java.lang.String r5, java.lang.String r6) {
        /*
            r4 = this;
            r0 = 1
            X.0qQ.A0B(r6, r0)
            X.0Ud r0 = r4.A0r
            java.lang.Object r0 = r0.getValue()
            java.util.Map r0 = (java.util.Map) r0
            java.lang.Object r0 = r0.get(r5)
            X.4zc r0 = (X.C279894zc) r0
            r3 = 0
            if (r0 == 0) goto L_0x0035
            java.util.List r0 = r0.A05
            if (r0 == 0) goto L_0x0035
            java.util.Iterator r2 = r0.iterator()
        L_0x001d:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0033
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.4zZ r0 = (X.C279864zZ) r0
            java.lang.String r0 = r0.A0H
            boolean r0 = X.0qQ.A0K(r0, r6)
            if (r0 == 0) goto L_0x001d
            r3 = r1
        L_0x0033:
            X.4zZ r3 = (X.C279864zZ) r3
        L_0x0035:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.inbox.notes.NotesRepository.A07(java.lang.String, java.lang.String):X.4zZ");
    }

    public final synchronized void A0C() {
        UserSession userSession = this.A0B;
        if (182.A06(0Tu.A05, userSession, 36323242796985366L) && this.A02 == null) {
            this.A02 = (C279844zW) userSession.A01(C279844zW.class, new C73924Pm4(userSession, 1));
            C262224Cq r3 = this.A01;
            C376909Ju r2 = new C376909Ju(this, (AnonymousClass4D7) null, 9);
            1Eo.A03(AnonymousClass05K.A00, 19B.A00, r2, r3);
        }
    }

    public final void A0E(long j, String str) {
        int i;
        boolean A062 = 182.A06(0Tu.A05, this.A0B, 36323650819337575L);
        C262224Cq r1 = this.A01;
        if (A062) {
            i = 1;
        } else {
            i = 2;
        }
        1Eo.A05(19B.A00, new MEV(this, str, (AnonymousClass4D7) null, i, j), r1);
    }

    public final synchronized void A0F(C53370Gmu gmu, C279864zZ r4, Integer num) {
        if (r4 != null) {
            AnonymousClass1Nd.A00(this.A0B).A00(new C71913Osv(gmu, r4, num));
        }
    }

    public final synchronized void A0G(C279864zZ r6) {
        05G r4 = this.A0X;
        ArrayList A0U2 = 00k.A0U((Collection) r4.getValue());
        HashMap hashMap = this.A0I;
        String str = this.A0B.A06;
        C279864zZ r0 = (C279864zZ) hashMap.remove(str);
        if (r0 != null) {
            A0U2.remove(r0);
        }
        if (r6 != null) {
            hashMap.put(str, r6);
            A0U2.add(0, r6);
        }
        r4.Epw(A0U2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004c, code lost:
        if (r1.get(r6.A0B.A06) != null) goto L_0x004e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void A0H(X.C279864zZ r7, java.lang.Integer r8) {
        /*
            r6 = this;
            monitor-enter(r6)
            r5 = 1
            r4 = 0
            X.05G r3 = r6.A0X     // Catch:{ all -> 0x006a }
            java.lang.Object r0 = r3.getValue()     // Catch:{ all -> 0x006a }
            java.util.Collection r0 = (java.util.Collection) r0     // Catch:{ all -> 0x006a }
            java.util.ArrayList r2 = X.00k.A0U(r0)     // Catch:{ all -> 0x006a }
            int r0 = r8.intValue()     // Catch:{ all -> 0x006a }
            if (r0 == r4) goto L_0x003b
            if (r0 == r5) goto L_0x0038
            java.util.HashMap r1 = r6.A0I     // Catch:{ all -> 0x006a }
            java.lang.String r0 = "2"
            java.lang.Object r0 = r1.remove(r0)     // Catch:{ all -> 0x006a }
            X.4zZ r0 = (X.C279864zZ) r0     // Catch:{ all -> 0x006a }
            if (r0 == 0) goto L_0x0026
            r2.remove(r0)     // Catch:{ all -> 0x006a }
        L_0x0026:
            if (r7 == 0) goto L_0x0065
            java.lang.String r0 = r7.A0H     // Catch:{ all -> 0x006a }
            r1.put(r0, r7)     // Catch:{ all -> 0x006a }
            com.instagram.common.session.UserSession r0 = r6.A0B     // Catch:{ all -> 0x006a }
            java.lang.String r0 = r0.A06     // Catch:{ all -> 0x006a }
            java.lang.Object r0 = r1.get(r0)     // Catch:{ all -> 0x006a }
            if (r0 == 0) goto L_0x0052
            goto L_0x004e
        L_0x0038:
            if (r7 == 0) goto L_0x0065
            goto L_0x0056
        L_0x003b:
            if (r7 == 0) goto L_0x0065
            java.util.HashMap r1 = r6.A0I     // Catch:{ all -> 0x006a }
            java.lang.String r0 = r7.A0H     // Catch:{ all -> 0x006a }
            r1.put(r0, r7)     // Catch:{ all -> 0x006a }
            com.instagram.common.session.UserSession r0 = r6.A0B     // Catch:{ all -> 0x006a }
            java.lang.String r0 = r0.A06     // Catch:{ all -> 0x006a }
            java.lang.Object r0 = r1.get(r0)     // Catch:{ all -> 0x006a }
            if (r0 == 0) goto L_0x0052
        L_0x004e:
            r2.add(r5, r7)     // Catch:{ all -> 0x006a }
            goto L_0x0065
        L_0x0052:
            r2.add(r4, r7)     // Catch:{ all -> 0x006a }
            goto L_0x0065
        L_0x0056:
            java.util.HashMap r1 = r6.A0I     // Catch:{ all -> 0x006a }
            java.lang.String r0 = r7.A0H     // Catch:{ all -> 0x006a }
            java.lang.Object r0 = r1.remove(r0)     // Catch:{ all -> 0x006a }
            X.4zZ r0 = (X.C279864zZ) r0     // Catch:{ all -> 0x006a }
            if (r0 == 0) goto L_0x0065
            r2.remove(r0)     // Catch:{ all -> 0x006a }
        L_0x0065:
            r3.Epw(r2)     // Catch:{ all -> 0x006a }
            monitor-exit(r6)
            return
        L_0x006a:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.inbox.notes.NotesRepository.A0H(X.4zZ, java.lang.Integer):void");
    }

    public final void A0I(C279864zZ r11, String str) {
        05G r8 = this.A0X;
        ArrayList A0U2 = 00k.A0U((Collection) r8.getValue());
        if (r11 == null) {
            Object remove = this.A0I.remove(str);
            if (remove != null) {
                A0U2.remove(remove);
            }
        } else {
            HashMap hashMap = this.A0I;
            C279864zZ r5 = (C279864zZ) hashMap.get(str);
            if (r5 == null) {
                hashMap.put(str, r11);
                A0U2.add(r11);
            } else if (r5.A02 <= r11.A02) {
                hashMap.put(str, r11);
                int indexOf = A0U2.indexOf(r5);
                if (indexOf < 0) {
                    indexOf = 0;
                }
                A0U2.set(indexOf, r11);
            }
        }
        r8.Epw(A0U2);
    }

    public final void A0J(NoteAudience noteAudience, C68176N3r n3r, NoteCreationSource noteCreationSource, NoteStyle noteStyle, String str, List list, int i, boolean z) {
        String str2 = str;
        0qQ.A0B(str2, 1);
        NoteAudience noteAudience2 = noteAudience;
        0qQ.A0B(noteAudience, 2);
        NoteCreationSource noteCreationSource2 = noteCreationSource;
        0qQ.A0B(noteCreationSource2, 4);
        List list2 = list;
        0qQ.A0B(list2, 6);
        C262204Co r1 = this.A09;
        if (r1 != null) {
            r1.AG7((CancellationException) null);
        }
        C262224Cq r12 = this.A01;
        this.A09 = 1Eo.A04(19B.A00, new NotesRepository$postNote$1(this, noteAudience2, n3r, noteCreationSource2, noteStyle, str2, list2, (AnonymousClass4D7) null, i, z), r12);
    }

    public final void A0K(Integer num, Runnable runnable, boolean z, boolean z2) {
        C262204Co r0 = this.A07;
        if (r0 == null || !r0.isActive()) {
            boolean z3 = z;
            if (A0R(z)) {
                C262224Cq r2 = this.A01;
                NotesRepository$fetchNotes$1 notesRepository$fetchNotes$1 = new NotesRepository$fetchNotes$1(this, num, (AnonymousClass4D7) null, z2, z3);
                1Er A032 = 1Eo.A03(AnonymousClass05K.A00, 19B.A00, notesRepository$fetchNotes$1, r2);
                A032.CO3(new AnonymousClass9M5(8, this, runnable));
                this.A07 = A032;
            }
        }
    }

    public final synchronized void A0L(String str) {
        0qQ.A0B(str, 0);
        A00(str, 0sn.A00, (Map) this.A0V.getValue());
    }

    public final synchronized void A0M(String str) {
        AnonymousClass60F r10;
        List<C279864zZ> list;
        05G r4 = this.A0X;
        ArrayList A0U2 = 00k.A0U((Collection) r4.getValue());
        HashMap hashMap = this.A0I;
        C279864zZ r7 = (C279864zZ) hashMap.get(str);
        if (r7 != null) {
            int indexOf = A0U2.indexOf(r7);
            C300845y2 r8 = r7.A0A;
            if (!(r8 == null || (r10 = r8.A0B) == null || !0qQ.A0K(r10.A00, true))) {
                C279894zc r0 = (C279894zc) ((Map) this.A0Z.getValue()).get(str);
                if (!(r0 == null || (list = r0.A05) == null)) {
                    ArrayList arrayList = new ArrayList(0Yv.A1E(list, 10));
                    for (C279864zZ r02 : list) {
                        arrayList.add(r02.A0H);
                    }
                    C262224Cq r9 = this.A01;
                    AnonymousClass9K1 r6 = new AnonymousClass9K1((Object) arrayList, (Object) this, (AnonymousClass4D7) null, 2);
                    1Eo.A03(AnonymousClass05K.A00, 19B.A00, r6, r9);
                }
                C45459Cwq cwq = new C45459Cwq(r10);
                cwq.A00 = false;
                AnonymousClass60G A012 = cwq.A01();
                C45461Cws cws = new C45461Cws(r8);
                cws.A0B = A012;
                C300855y3 A013 = cws.A01();
                if (A013 != null) {
                    C45463Cwu cwu = new C45463Cwu(r7);
                    cwu.A0A = A013;
                    C279864zZ A022 = AnonymousClass69P.A02(cwu.A00(), this.A0B);
                    hashMap.put(str, A022);
                    if (indexOf != -1) {
                        A0U2.set(indexOf, A022);
                    }
                    r4.Epw(A0U2);
                }
            }
        }
    }

    public final void A0N(String str, String str2) {
        C262224Cq r2 = this.A01;
        C376979Kb r3 = new C376979Kb(this, str2, str, (AnonymousClass4D7) null, 1);
        1Eo.A03(AnonymousClass05K.A00, 19B.A00, r3, r2);
    }

    public final synchronized void A0O(String str, String str2) {
        List list;
        Object obj;
        0qQ.A0B(str, 0);
        05G r2 = this.A0Z;
        LinkedHashMap A032 = 0Yt.A03((Map) r2.getValue());
        C279894zc r0 = (C279894zc) ((Map) r2.getValue()).get(str2);
        if (!(r0 == null || (list = r0.A05) == null)) {
            ArrayList arrayList = new ArrayList(list);
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (0qQ.A0K(((C279864zZ) obj).A0H, str)) {
                    break;
                }
            }
            C279864zZ r5 = (C279864zZ) obj;
            if (r5 != null && r5.A0R) {
                C45463Cwu cwu = new C45463Cwu(r5);
                cwu.A0R = false;
                arrayList.set(arrayList.indexOf(r5), AnonymousClass69P.A02(cwu.A00(), this.A0B));
                C279894zc r02 = (C279894zc) A032.get(str2);
                if (r02 != null) {
                    String str3 = r02.A03;
                    String str4 = r02.A04;
                    User user = r02.A00;
                    String str5 = r02.A02;
                    String str6 = r02.A01;
                    0qQ.A0B(str3, 0);
                    0qQ.A0B(str4, 1);
                    A032.put(str2, new C279894zc(user, str3, str4, str5, str6, arrayList));
                }
                r2.Epw(A032);
                05G r1 = this.A0X;
                r1.Epw(00k.A0U((Collection) r1.getValue()));
            }
        }
    }

    public final void A0P(String str, String str2, String str3, boolean z) {
        Object obj;
        C279864zZ r5;
        C262224Cq r1;
        int i;
        JVS jvs;
        C300865y4 r9;
        List list;
        Object obj2;
        C262204Co r0 = this.A08;
        if (r0 == null || !r0.isActive()) {
            String str4 = str;
            String str5 = str2;
            if (str2 != null) {
                C279894zc r02 = (C279894zc) ((Map) this.A0Z.getValue()).get(str5);
                if (r02 != null && (list = r02.A05) != null) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it.next();
                        if (0qQ.A0K(((C279864zZ) obj2).A0H, str4)) {
                            break;
                        }
                    }
                    r5 = (C279864zZ) obj2;
                } else {
                    return;
                }
            } else {
                Iterator it2 = ((Iterable) this.A0X.getValue()).iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it2.next();
                    if (0qQ.A0K(((C279864zZ) obj).A0H, str4)) {
                        break;
                    }
                }
                r5 = (C279864zZ) obj;
            }
            if (r5 != null && r5.A01 != NoteStyle.NOTE_CHAT.A00) {
                String str6 = r5.A0H;
                if (z) {
                    boolean A062 = 182.A06(0Tu.A05, this.A0B, 36323650819206501L);
                    r1 = this.A01;
                    if (A062) {
                        jvs = new JVS(this, r5, (String) null, str5, (AnonymousClass4D7) null, 7);
                    } else {
                        jvs = new JVS(this, r5, (String) null, str5, (AnonymousClass4D7) null, 8);
                    }
                } else {
                    String str7 = str3;
                    if (str3 != null || (r9 = r5.A07) == null) {
                        boolean A063 = 182.A06(0Tu.A05, this.A0B, 36323650819206501L);
                        r1 = this.A01;
                        if (A063) {
                            i = 7;
                        } else {
                            i = 8;
                        }
                        jvs = new JVS(this, r5, str7, str5, (AnonymousClass4D7) null, i);
                    } else {
                        C262224Cq r2 = this.A01;
                        1Eo.A03(AnonymousClass05K.A00, 19B.A00, new AnonymousClass9KZ(this, r9, str6, (AnonymousClass4D7) null, 5), r2);
                        return;
                    }
                }
                this.A08 = 1Eo.A04(19B.A00, jvs, r1);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0079, code lost:
        if (r18 != false) goto L_0x007b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x007e, code lost:
        if (r18 != false) goto L_0x0080;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0080, code lost:
        r10 = r10 + 1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00b8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void A0Q(java.lang.String r14, java.util.List r15, boolean r16, boolean r17, boolean r18) {
        /*
            r13 = this;
            r12 = r13
            monitor-enter(r12)
            java.util.HashMap r9 = r13.A0I     // Catch:{ all -> 0x00cb }
            java.lang.Object r8 = r9.get(r14)     // Catch:{ all -> 0x00cb }
            X.4zZ r8 = (X.C279864zZ) r8     // Catch:{ all -> 0x00cb }
            if (r8 == 0) goto L_0x00c9
            int r7 = r15.indexOf(r8)     // Catch:{ all -> 0x00cb }
            X.5y2 r6 = r8.A0A     // Catch:{ all -> 0x00cb }
            if (r6 == 0) goto L_0x00c1
            X.60F r5 = r6.A0B     // Catch:{ all -> 0x00cb }
            if (r5 == 0) goto L_0x00c1
            java.util.List r0 = r5.A04     // Catch:{ all -> 0x00cb }
            if (r0 == 0) goto L_0x0022
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x00cb }
            r4.<init>(r0)     // Catch:{ all -> 0x00cb }
            goto L_0x0027
        L_0x0022:
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x00cb }
            r4.<init>()     // Catch:{ all -> 0x00cb }
        L_0x0027:
            X.17i r0 = r13.A0G     // Catch:{ all -> 0x00bf }
            com.instagram.common.session.UserSession r3 = r13.A0B     // Catch:{ all -> 0x00bf }
            java.lang.String r2 = r3.A06     // Catch:{ all -> 0x00bf }
            com.instagram.user.model.User r1 = r0.A02(r2)     // Catch:{ all -> 0x00bf }
            java.util.Iterator r11 = r4.iterator()     // Catch:{ all -> 0x00bf }
        L_0x0035:
            boolean r0 = r11.hasNext()     // Catch:{ all -> 0x00bf }
            if (r0 == 0) goto L_0x0051
            java.lang.Object r0 = r11.next()     // Catch:{ all -> 0x00bf }
            r10 = r0
            com.instagram.user.model.User r10 = (com.instagram.user.model.User) r10     // Catch:{ all -> 0x00bf }
            java.lang.String r10 = r10.getId()     // Catch:{ all -> 0x00bf }
            boolean r10 = X.0qQ.A0K(r10, r2)     // Catch:{ all -> 0x00bf }
            if (r10 == 0) goto L_0x0035
        L_0x004c:
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0     // Catch:{ all -> 0x00bf }
            if (r1 == 0) goto L_0x006b
            goto L_0x0053
        L_0x0051:
            r0 = 0
            goto L_0x004c
        L_0x0053:
            r2 = 0
            if (r16 == 0) goto L_0x005e
            if (r17 != 0) goto L_0x006b
            if (r18 == 0) goto L_0x0068
            r4.remove(r1)     // Catch:{ all -> 0x00bf }
            goto L_0x006b
        L_0x005e:
            if (r18 != 0) goto L_0x0068
            java.util.Collection r1 = X.0u4.A00(r4)     // Catch:{ all -> 0x00bf }
            r1.remove(r0)     // Catch:{ all -> 0x00bf }
            goto L_0x006b
        L_0x0068:
            r4.add(r2, r1)     // Catch:{ all -> 0x00bf }
        L_0x006b:
            java.lang.Integer r0 = r5.A01     // Catch:{ all -> 0x00cb }
            if (r0 == 0) goto L_0x0074
            int r10 = r0.intValue()     // Catch:{ all -> 0x00cb }
            goto L_0x0075
        L_0x0074:
            r10 = 0
        L_0x0075:
            if (r16 == 0) goto L_0x007e
            if (r17 != 0) goto L_0x0082
            if (r18 == 0) goto L_0x0080
        L_0x007b:
            int r10 = r10 + -1
            goto L_0x0082
        L_0x007e:
            if (r18 == 0) goto L_0x007b
        L_0x0080:
            int r10 = r10 + 1
        L_0x0082:
            X.Cwq r1 = new X.Cwq     // Catch:{ all -> 0x00cb }
            r1.<init>(r5)     // Catch:{ all -> 0x00cb }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x00cb }
            r1.A01 = r0     // Catch:{ all -> 0x00cb }
            r1.A04 = r4     // Catch:{ all -> 0x00cb }
            X.60G r2 = r1.A01()     // Catch:{ all -> 0x00cb }
            X.Cwu r1 = new X.Cwu     // Catch:{ all -> 0x00cb }
            r1.<init>(r8)     // Catch:{ all -> 0x00cb }
            X.Cws r0 = new X.Cws     // Catch:{ all -> 0x00cb }
            r0.<init>(r6)     // Catch:{ all -> 0x00cb }
            r0.A0B = r2     // Catch:{ all -> 0x00cb }
            X.5y3 r0 = r0.A01()     // Catch:{ all -> 0x00cb }
            r1.A0A = r0     // Catch:{ all -> 0x00cb }
            X.4zZ r0 = r1.A00()     // Catch:{ all -> 0x00cb }
            X.4zZ r1 = X.AnonymousClass69P.A02(r0, r3)     // Catch:{ all -> 0x00cb }
            r9.put(r14, r1)     // Catch:{ all -> 0x00cb }
            r0 = -1
            if (r7 == r0) goto L_0x00b6
            r15.set(r7, r1)     // Catch:{ all -> 0x00cb }
        L_0x00b6:
            if (r10 != 0) goto L_0x00c9
            r9.remove(r14)     // Catch:{ all -> 0x00cb }
            r15.remove(r1)     // Catch:{ all -> 0x00cb }
            goto L_0x00c9
        L_0x00bf:
            r1 = move-exception
            goto L_0x00c8
        L_0x00c1:
            java.lang.String r0 = "Required value was null."
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00cb }
            r1.<init>(r0)     // Catch:{ all -> 0x00cb }
        L_0x00c8:
            throw r1     // Catch:{ all -> 0x00cb }
        L_0x00c9:
            monitor-exit(r12)
            return
        L_0x00cb:
            r0 = move-exception
            monitor-exit(r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.inbox.notes.NotesRepository.A0Q(java.lang.String, java.util.List, boolean, boolean, boolean):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ NotesRepository(UserSession userSession) {
        super("Direct", AnonymousClass43D.A01(4599877, 182.A06(0Tu.A05, userSession, 36323242797116440L) ? 2 : 3));
        Context A062 = userSession.A03.A06();
        PendingMediaStore A002 = 28K.A00(userSession);
        this.A0B = userSession;
        this.A0A = A062;
        this.A0F = A002;
        this.A0C = new NotesApi(userSession, 1vm.A01(userSession));
        this.A0I = new HashMap();
        0sn r3 = 0sn.A00;
        02z A012 = 106.A01(r3);
        this.A0X = A012;
        Integer num = AnonymousClass05K.A00;
        05D A013 = 10D.A01(num, 0, 0);
        this.A0M = A013;
        this.A0e = new 0V1((C262204Co) null, A013);
        05D A014 = 10D.A01(num, 0, 0);
        this.A0O = A014;
        this.A0g = new 0V1((C262204Co) null, A014);
        02z A015 = 106.A01(0Yt.A0E());
        this.A0Z = A015;
        this.A0r = 10b.A03(A015);
        02z A016 = 106.A01(r3);
        this.A0b = A016;
        this.A0t = 10b.A03(A016);
        02z A017 = 106.A01(r3);
        this.A0T = A017;
        this.A0l = 10b.A03(A017);
        Integer num2 = AnonymousClass05K.A0C;
        05D A018 = 10D.A01(num2, 0, 1);
        this.A0S = A018;
        this.A0k = new 0V1((C262204Co) null, A018);
        05D A019 = 10D.A01(num2, 0, 1);
        this.A0R = A019;
        this.A0j = new 0V1((C262204Co) null, A019);
        this.A0p = 10b.A03(A012);
        this.A0G = 17h.A00(userSession);
        this.A0D = new AnonymousClass43E(userSession);
        this.A0H = new HashMap();
        02z A0110 = 106.A01(0Yt.A0E());
        this.A0V = A0110;
        this.A0n = 10b.A03(A0110);
        this.A0J = new LinkedHashMap();
        02z r0 = new 02z(false);
        this.A0W = r0;
        this.A0o = 10b.A03(r0);
        05D A0111 = 10D.A01(num2, 0, 1);
        this.A0L = A0111;
        this.A0d = new 0V1((C262204Co) null, A0111);
        02z A0112 = 106.A01((Object) null);
        this.A0a = A0112;
        this.A0s = 10b.A03(A0112);
        02z r02 = new 02z(false);
        this.A0Y = r02;
        this.A0q = 10b.A03(r02);
        this.A06 = new C241063Ns();
        02z A0113 = 106.A01((Object) null);
        this.A0U = A0113;
        this.A0m = 10b.A03(A0113);
        05D A0114 = 10D.A01(num, 0, 0);
        this.A0Q = A0114;
        this.A0i = new 0V1((C262204Co) null, A0114);
        05D A0115 = 10D.A01(num, 0, 0);
        this.A0P = A0115;
        this.A0h = new 0V1((C262204Co) null, A0115);
        05D A0116 = 10D.A01(num2, 0, 1);
        this.A0K = A0116;
        this.A0c = new 0V1((C262204Co) null, A0116);
        this.A0E = new AnonymousClass43F();
        this.A03 = new HashMap();
        this.A04 = new HashSet();
        05D A0117 = 10D.A01(AnonymousClass05K.A01, 0, 1);
        this.A0N = A0117;
        this.A0f = new 0V1((C262204Co) null, A0117);
    }

    public static final Map A00(Object obj, Object obj2, Map map) {
        0Ym r0 = new 0Ym();
        r0.putAll(map);
        r0.put(obj, obj2);
        return 0se.A0N(r0);
    }

    public static final void A03(C268654dm r4, NotesRepository notesRepository) {
        String A002 = C66579MXk.A00(590);
        StringBuilder sb = new StringBuilder();
        sb.append("Fetch Notes error: ");
        sb.append(r4);
        0KC.A0C(A002, sb.toString());
        AnonymousClass43E r1 = notesRepository.A0D;
        String obj = r4.toString();
        0qQ.A0B(obj, 0);
        02m r2 = r1.A00;
        r2.markerPoint(275915771, "notes_fetch_server_failure");
        r2.markerAnnotate(275915771, "error_message", obj);
        r2.markerEnd(275915771, 3);
        1Zp A012 = 1Zm.A00(notesRepository.A0B).A01(AnonymousClass05K.A0N, AnonymousClass05K.A0K, true);
        A012.A03("error_message: ", r4.toString());
        A012.A00();
    }

    public final int A05(String str) {
        ArrayList arrayList = new ArrayList();
        for (Object next : (Iterable) this.A0p.getValue()) {
            C279864zZ r1 = (C279864zZ) next;
            if (!0qQ.A0K(r1.A0K, str) || r1.A01 == NoteStyle.PROMPT_QUESTION.A00) {
                arrayList.add(next);
            }
        }
        return arrayList.size();
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [X.9JX, X.4D7] */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A08(X.C53370Gmu r12, java.lang.String r13, java.util.List r14, X.AnonymousClass4D7 r15) {
        /*
            r11 = this;
            r3 = 33
            boolean r0 = X.AnonymousClass9JX.A00(r3, r15)
            if (r0 == 0) goto L_0x00ac
            r5 = r15
            X.9JX r5 = (X.AnonymousClass9JX) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00ac
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0016:
            java.lang.Object r0 = r5.A02
            X.1Hj r6 = X.1Hj.A02
            int r1 = r5.A00
            r2 = 0
            r4 = 2
            r3 = 0
            r7 = 1
            if (r1 == 0) goto L_0x0030
            if (r1 == r7) goto L_0x002a
            if (r1 != r4) goto L_0x00b3
            X.0eS.A00(r0)
        L_0x0029:
            return r0
        L_0x002a:
            java.lang.Object r7 = r5.A01
            X.0eS.A00(r0)
            goto L_0x0090
        L_0x0030:
            X.0eS.A00(r0)
            java.util.Iterator r10 = r14.iterator()
            r9 = 0
        L_0x0038:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x0056
            java.lang.Object r8 = r10.next()
            X.1Xj r8 = (X.1Xj) r8
            X.1iA r1 = r8.BR7()
            X.1iA r0 = X.1iA.A0Q
            if (r1 == r0) goto L_0x0054
            X.1iA r1 = r8.BR7()
            X.1iA r0 = X.1iA.A0a
            if (r1 != r0) goto L_0x0038
        L_0x0054:
            r9 = 1
            goto L_0x0038
        L_0x0056:
            if (r9 != 0) goto L_0x00bb
            if (r12 != 0) goto L_0x00bb
            if (r13 != 0) goto L_0x00bb
            android.content.Context r1 = r11.A0A
            X.1Cn r0 = new X.1Cn
            r0.<init>(r1)
            boolean r0 = r0.A07(r2)
            if (r0 != 0) goto L_0x00bb
            com.instagram.common.session.UserSession r8 = r11.A0B
            X.0Tu r2 = X.0Tu.A05
            r0 = 36326373828081392(0x810ea5000036f0, double:3.036283311220709E-306)
            boolean r0 = X.182.A06(r2, r8, r0)
            if (r0 == 0) goto L_0x00bb
            X.3Ns r0 = new X.3Ns
            r0.<init>()
            r11.A06 = r0
            X.05G r1 = r11.A0Y
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r7)
            r5.A01 = r11
            r5.A00 = r7
            java.lang.Object r0 = r1.emit(r0, r5)
            if (r0 == r6) goto L_0x00ab
            r7 = r11
        L_0x0090:
            X.12T r2 = X.AnonymousClass12T.A00
            r1 = 480314591(0x1ca104df, float:1.0655345E-21)
            r0 = 3
            X.0nV r2 = r2.CO6(r1, r0)
            r1 = 24
            X.Pfm r0 = new X.Pfm
            r0.<init>(r7, r3, r1)
            r5.A01 = r3
            r5.A00 = r4
            java.lang.Object r0 = X.1Eo.A00(r5, r2, r0)
            if (r0 != r6) goto L_0x0029
        L_0x00ab:
            return r6
        L_0x00ac:
            X.9JX r5 = new X.9JX
            r5.<init>(r11, r15, r3)
            goto L_0x0016
        L_0x00b3:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x00bb:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.inbox.notes.NotesRepository.A08(X.Gmu, java.lang.String, java.util.List, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.MDx, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A09(com.instagram.common.session.UserSession r6, java.lang.String r7, X.AnonymousClass4D7 r8) {
        /*
            r5 = this;
            r3 = 20
            boolean r0 = X.C66145MDx.A02(r3, r8)
            if (r0 == 0) goto L_0x004a
            r4 = r8
            X.MDx r4 = (X.C66145MDx) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x004a
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r4.A03
            X.1Hj r3 = X.1Hj.A02
            int r0 = r4.A00
            r2 = 1
            if (r0 == 0) goto L_0x0030
            if (r0 != r2) goto L_0x0074
            java.lang.Object r7 = r4.A02
            java.lang.Object r3 = r4.A01
            com.instagram.direct.inbox.notes.NotesRepository r3 = (com.instagram.direct.inbox.notes.NotesRepository) r3
            X.0eS.A00(r1)
        L_0x002a:
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x007d
            monitor-enter(r3)
            goto L_0x0050
        L_0x0030:
            X.0eS.A00(r1)
            X.1vn r1 = X.1vm.A01(r6)
            com.instagram.direct.inbox.notes.NotesApi r0 = new com.instagram.direct.inbox.notes.NotesApi
            r0.<init>(r6, r1)
            r4.A01 = r5
            r4.A02 = r7
            r4.A00 = r2
            java.lang.Object r1 = r0.A05(r7, r4)
            if (r1 == r3) goto L_0x007f
            r3 = r5
            goto L_0x002a
        L_0x004a:
            X.MDx r4 = new X.MDx
            r4.<init>(r5, r8, r3)
            goto L_0x0016
        L_0x0050:
            r0 = 0
            X.0qQ.A0B(r7, r0)     // Catch:{ all -> 0x0071 }
            X.05G r2 = r3.A0X     // Catch:{ all -> 0x0071 }
            java.lang.Object r0 = r2.getValue()     // Catch:{ all -> 0x0071 }
            java.util.Collection r0 = (java.util.Collection) r0     // Catch:{ all -> 0x0071 }
            java.util.ArrayList r1 = X.00k.A0U(r0)     // Catch:{ all -> 0x0071 }
            java.util.HashMap r0 = r3.A0I     // Catch:{ all -> 0x0071 }
            java.lang.Object r0 = r0.remove(r7)     // Catch:{ all -> 0x0071 }
            X.4zZ r0 = (X.C279864zZ) r0     // Catch:{ all -> 0x0071 }
            if (r0 == 0) goto L_0x007c
            r1.remove(r0)     // Catch:{ all -> 0x0071 }
            r2.Epw(r1)     // Catch:{ all -> 0x0071 }
            goto L_0x007c
        L_0x0071:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x0074:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x007c:
            monitor-exit(r3)
        L_0x007d:
            X.0gF r3 = X.C60340gF.A00
        L_0x007f:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.inbox.notes.NotesRepository.A09(com.instagram.common.session.UserSession, java.lang.String, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.4D7, X.9JZ] */
    /* JADX WARNING: type inference failed for: r4v80 */
    /* JADX WARNING: type inference failed for: r4v81 */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x02c8, code lost:
        if (r0 == null) goto L_0x02ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x05db, code lost:
        if (r14 == false) goto L_0x05dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01d4, code lost:
        if (r5 != null) goto L_0x0206;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01d9, code lost:
        if (r5 != null) goto L_0x022b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x028d  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:320:0x0753  */
    /* JADX WARNING: Removed duplicated region for block: B:342:0x07ee  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:396:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x014a  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A0A(X.AnonymousClass4D7 r51, boolean r52) {
        /*
            r50 = this;
            r17 = r52
            r3 = 1
            r6 = r51
            boolean r0 = r6 instanceof X.AnonymousClass9JZ
            r5 = r50
            if (r0 == 0) goto L_0x014c
            r4 = r6
            X.9JZ r4 = (X.AnonymousClass9JZ) r4
            int r0 = r4.A04
            if (r0 != r3) goto L_0x014c
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x014c
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x001d:
            java.lang.Object r6 = r4.A02
            X.1Hj r2 = X.1Hj.A02
            int r0 = r4.A00
            if (r0 == 0) goto L_0x007a
            if (r0 != r3) goto L_0x0768
            boolean r0 = r4.A03
            r17 = r0
            java.lang.Object r1 = r4.A01
            com.instagram.direct.inbox.notes.NotesRepository r1 = (com.instagram.direct.inbox.notes.NotesRepository) r1
            X.0eS.A00(r6)
        L_0x0032:
            X.3Ii r6 = (X.C239803Ii) r6
            boolean r0 = r6 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0753
            X.3Ih r6 = (X.C239793Ih) r6
            java.lang.Object r0 = r6.A00
            X.3JC r0 = (X.AnonymousClass3JC) r0
            java.lang.Object r5 = r0.A01
            X.5xc r5 = (X.C300685xc) r5
            r21 = 0
            if (r5 == 0) goto L_0x01d0
            java.util.List r4 = r1.A05
            if (r4 == 0) goto L_0x0153
            r0 = 10
            int r0 = X.0Yv.A1E(r4, r0)
            int r2 = X.0se.A0L(r0)
            r0 = 16
            if (r2 >= r0) goto L_0x005a
            r2 = 16
        L_0x005a:
            java.util.LinkedHashMap r9 = new java.util.LinkedHashMap
            r9.<init>(r2)
            java.util.Iterator r6 = r4.iterator()
        L_0x0063:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0157
            java.lang.Object r4 = r6.next()
            r2 = r4
            X.3lr r2 = (X.C250663lr) r2
            java.lang.String r0 = "inbox_tray_item_id"
            java.lang.String r0 = r2.getRequiredStringField(r3, r0)
            r9.put(r0, r4)
            goto L_0x0063
        L_0x007a:
            X.0eS.A00(r6)
            com.instagram.direct.inbox.notes.NotesApi r6 = r5.A0C
            com.instagram.common.session.UserSession r8 = r5.A0B
            X.0Tu r7 = X.0Tu.A05
            r0 = 36328263615003822(0x81105d00143cae, double:3.037478420080015E-306)
            boolean r0 = X.182.A06(r7, r8, r0)
            if (r0 == 0) goto L_0x00c4
            java.util.HashMap r0 = r5.A03
            java.util.Set r0 = r0.keySet()
            X.0qQ.A07(r0)
        L_0x0097:
            java.util.List r12 = X.00k.A0a(r0)
        L_0x009b:
            java.util.List r1 = r5.A05
            if (r1 == 0) goto L_0x00e1
            r0 = 10
            int r0 = X.0Yv.A1E(r1, r0)
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>(r0)
            java.util.Iterator r7 = r1.iterator()
        L_0x00ae:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x00e2
            java.lang.Object r1 = r7.next()
            X.3lr r1 = (X.C250663lr) r1
            java.lang.String r0 = "inbox_tray_item_id"
            java.lang.String r0 = r1.getRequiredStringField(r3, r0)
            r11.add(r0)
            goto L_0x00ae
        L_0x00c4:
            r0 = 36328263615069359(0x81105d00153caf, double:3.0374784201214606E-306)
            boolean r0 = X.182.A06(r7, r8, r0)
            if (r0 == 0) goto L_0x00df
            java.util.HashMap r0 = r5.A03
            java.util.Set r1 = r0.keySet()
            X.0qQ.A07(r1)
            java.util.HashSet r0 = r5.A04
            java.util.Set r0 = X.00k.A0n(r1, r0)
            goto L_0x0097
        L_0x00df:
            r12 = 0
            goto L_0x009b
        L_0x00e1:
            r11 = 0
        L_0x00e2:
            r4.A01 = r5
            r0 = r17
            r4.A03 = r0
            r4.A00 = r3
            r25 = 0
            X.2IS r10 = new X.2IS
            r10.<init>()
            X.2IS r9 = new X.2IS
            r9.<init>()
            X.2IV r8 = new X.2IV
            r8.<init>()
            r1 = 0
            if (r12 == 0) goto L_0x014a
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>(r12)
        L_0x0103:
            java.lang.String r0 = "additional_seen_ids_to_log"
            r8.A05(r0, r7)
            if (r11 == 0) goto L_0x010f
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r11)
        L_0x010f:
            java.lang.String r0 = "inbox_tray_item_ids_on_client"
            r8.A05(r0, r1)
            java.lang.String r0 = "request"
            r10.A00(r8, r0)
            X.2IY r0 = com.facebook.pando.PandoGraphQLRequest.Companion
            X.1vR r19 = X.AnonymousClass1vS.A00()
            java.util.Map r21 = r10.getParamsCopy()
            java.util.Map r22 = r9.getParamsCopy()
            java.lang.Class<X.5xc> r23 = X.C300685xc.class
            java.util.ArrayList r29 = new java.util.ArrayList
            r29.<init>()
            java.lang.String r20 = "InboxTrayRequest"
            r24 = 0
            java.lang.String r28 = "xdt_get_inbox_tray_items"
            com.facebook.pando.PandoGraphQLRequest r1 = new com.facebook.pando.PandoGraphQLRequest
            r26 = r24
            r27 = r25
            r18 = r1
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            X.1vn r0 = r6.A00
            java.lang.Object r6 = r0.A04(r1, r4)
            if (r6 == r2) goto L_0x07f4
            r1 = r5
            goto L_0x0032
        L_0x014a:
            r7 = r1
            goto L_0x0103
        L_0x014c:
            X.9JZ r4 = new X.9JZ
            r4.<init>(r5, r6, r3)
            goto L_0x001d
        L_0x0153:
            X.0sm r9 = X.0Yt.A0E()
        L_0x0157:
            X.60X r6 = r5.A0E()
            if (r6 == 0) goto L_0x01df
            java.lang.Class<X.60Y> r4 = X.AnonymousClass60Y.class
            r8 = 0
            java.lang.String r2 = "inbox_tray_items"
            r0 = -741638930(0xffffffffd3cb7cee, float:-1.74794867E12)
            com.google.common.collect.ImmutableList r0 = r6.getRequiredCompactedTreeListField(r8, r2, r4, r0)
            if (r0 == 0) goto L_0x01df
            java.util.ArrayList r20 = new java.util.ArrayList
            r20.<init>()
            java.util.Iterator r12 = r0.iterator()
        L_0x0174:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x01e1
            java.lang.Object r4 = r12.next()
            X.3lr r4 = (X.C250663lr) r4
            java.lang.Class<X.69I> r2 = X.AnonymousClass69I.class
            r0 = -1665516441(0xffffffff9cba3c67, float:-1.2324061E-21)
            X.3lr r7 = r4.reinterpretRequired(r8, r2, r0)
            X.69I r7 = (X.AnonymousClass69I) r7
            X.0qQ.A07(r7)
            java.lang.String r0 = "inbox_tray_item_id"
            java.lang.String r0 = r7.getRequiredStringField(r3, r0)
            java.lang.Object r11 = r9.get(r0)
            X.69I r11 = (X.AnonymousClass69I) r11
            X.69J r0 = r7.A0E()
            if (r0 != 0) goto L_0x01ca
            X.69L r0 = r7.A0G()
            if (r0 != 0) goto L_0x01ca
            java.lang.Class<X.69M> r10 = X.AnonymousClass69M.class
            r6 = 5
            java.lang.String r4 = "media_note_stack_dict"
            r2 = -1752473624(0xffffffff978b5fe8, float:-9.006875E-25)
            X.3lr r0 = r7.getOptionalTreeField(r6, r4, r10, r2)
            if (r0 != 0) goto L_0x01ca
            if (r11 == 0) goto L_0x0174
            r7 = r11
            X.69J r0 = r11.A0E()
            if (r0 != 0) goto L_0x01ca
            X.69L r0 = r11.A0G()
            if (r0 != 0) goto L_0x01ca
            X.3lr r0 = r11.getOptionalTreeField(r6, r4, r10, r2)
            if (r0 != 0) goto L_0x01ca
            goto L_0x0174
        L_0x01ca:
            r0 = r20
            r0.add(r7)
            goto L_0x0174
        L_0x01d0:
            r20 = r21
        L_0x01d2:
            r16 = r21
            if (r5 == 0) goto L_0x01d7
            goto L_0x0206
        L_0x01d7:
            r24 = r21
            if (r5 == 0) goto L_0x01dc
            goto L_0x022b
        L_0x01dc:
            r5 = 0
            goto L_0x026d
        L_0x01df:
            r20 = 0
        L_0x01e1:
            X.60X r6 = r5.A0E()
            if (r6 == 0) goto L_0x01d2
            java.lang.Class<X.60Z> r4 = X.AnonymousClass60Z.class
            java.lang.String r2 = "inbox_tray_metadata"
            r0 = -1796128239(0xffffffff94f14211, float:-2.436084E-26)
            X.3lr r6 = r6.getOptionalTreeField(r3, r2, r4, r0)
            if (r6 == 0) goto L_0x01d2
            java.lang.Class<X.60a> r2 = X.AnonymousClass60a.class
            r4 = 0
            r0 = 1724039676(0x66c2c1fc, float:4.5985874E23)
            X.3lr r2 = r6.reinterpretRequired(r4, r2, r0)
            if (r2 == 0) goto L_0x01d2
            java.lang.String r0 = "stackable_prompt_ids"
            com.google.common.collect.ImmutableList r16 = r2.getOptionalCompactedStringListField(r4, r0)
        L_0x0206:
            X.60X r6 = r5.A0E()
            if (r6 == 0) goto L_0x01d7
            java.lang.Class<X.60Z> r4 = X.AnonymousClass60Z.class
            java.lang.String r2 = "inbox_tray_metadata"
            r0 = -1796128239(0xffffffff94f14211, float:-2.436084E-26)
            X.3lr r6 = r6.getOptionalTreeField(r3, r2, r4, r0)
            if (r6 == 0) goto L_0x01d7
            java.lang.Class<X.60a> r4 = X.AnonymousClass60a.class
            r2 = 0
            r0 = 1724039676(0x66c2c1fc, float:4.5985874E23)
            X.3lr r2 = r6.reinterpretRequired(r2, r4, r0)
            if (r2 == 0) goto L_0x01d7
            java.lang.String r0 = "ranking_session_id"
            java.lang.String r24 = r2.getOptionalStringField(r3, r0)
        L_0x022b:
            X.60X r6 = r5.A0E()
            if (r6 == 0) goto L_0x0255
            java.lang.Class<X.60Z> r4 = X.AnonymousClass60Z.class
            java.lang.String r2 = "inbox_tray_metadata"
            r0 = -1796128239(0xffffffff94f14211, float:-2.436084E-26)
            X.3lr r6 = r6.getOptionalTreeField(r3, r2, r4, r0)
            if (r6 == 0) goto L_0x0255
            java.lang.Class<X.60a> r4 = X.AnonymousClass60a.class
            r2 = 0
            r0 = 1724039676(0x66c2c1fc, float:4.5985874E23)
            X.3lr r4 = r6.reinterpretRequired(r2, r4, r0)
            if (r4 == 0) goto L_0x0255
            r2 = 2
            java.lang.String r0 = "display_expired_ln_toast"
            boolean r0 = r4.getCoercedBooleanField(r2, r0)
            java.lang.Boolean r21 = java.lang.Boolean.valueOf(r0)
        L_0x0255:
            X.60X r6 = r5.A0E()
            if (r6 == 0) goto L_0x01dc
            java.lang.Class<X.60Y> r5 = X.AnonymousClass60Y.class
            r4 = 0
            java.lang.String r2 = "inbox_tray_items"
            r0 = -741638930(0xffffffffd3cb7cee, float:-1.74794867E12)
            com.google.common.collect.ImmutableList r0 = r6.getRequiredCompactedTreeListField(r4, r2, r5, r0)
            if (r0 == 0) goto L_0x01dc
            int r5 = r0.size()
        L_0x026d:
            X.43E r0 = r1.A0D
            X.02m r4 = r0.A00
            r2 = 275915771(0x107223fb, float:4.7753803E-29)
            java.lang.String r0 = "notes_fetch_server_success"
            r4.markerPoint(r2, r0)
            java.lang.String r0 = "num_notes"
            r4.markerAnnotate(r2, r0, r5)
            r26 = 2
            r0 = r26
            r4.markerEnd(r2, r0)
            long r4 = java.lang.System.currentTimeMillis()
            r1.A01 = r4
            if (r20 == 0) goto L_0x07df
            r2 = 0
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            java.util.Iterator r8 = r20.iterator()
        L_0x0297:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x02f0
            java.lang.Object r6 = r8.next()
            X.69I r6 = (X.AnonymousClass69I) r6
            X.69J r5 = r6.A0E()
            if (r5 == 0) goto L_0x02ca
            java.lang.Class<X.69N> r4 = X.AnonymousClass69N.class
            r0 = -1739341165(0xffffffff9853c293, float:-2.7369346E-24)
            X.3lr r7 = r5.reinterpretRequired(r2, r4, r0)
            X.69N r7 = (X.AnonymousClass69N) r7
            if (r7 == 0) goto L_0x02ca
            X.69K r0 = r6.A0F()
            if (r0 == 0) goto L_0x02ee
            X.69O r5 = r0.A0E()
        L_0x02c0:
            X.17i r4 = r1.A0G
            com.instagram.common.session.UserSession r0 = r1.A0B
            X.4zZ r0 = X.AnonymousClass69P.A03(r0, r5, r7, r4)
            if (r0 != 0) goto L_0x02e8
        L_0x02ca:
            X.69L r0 = r6.A0G()
            if (r0 == 0) goto L_0x0297
            X.Biy r5 = r0.A0E()
            if (r5 == 0) goto L_0x0297
            X.69K r0 = r6.A0F()
            if (r0 == 0) goto L_0x02ec
            X.69O r4 = r0.A0E()
        L_0x02e0:
            com.instagram.common.session.UserSession r0 = r1.A0B
            X.4zZ r0 = X.AnonymousClass69P.A04(r0, r4, r5)
            if (r0 == 0) goto L_0x0297
        L_0x02e8:
            r15.add(r0)
            goto L_0x0297
        L_0x02ec:
            r4 = 0
            goto L_0x02e0
        L_0x02ee:
            r5 = 0
            goto L_0x02c0
        L_0x02f0:
            X.43F r0 = r1.A0E
            com.instagram.common.session.UserSession r6 = r1.A0B
            r0.A01(r6, r15)
            java.util.ArrayList r25 = new java.util.ArrayList
            r25.<init>()
            java.util.Iterator r23 = r20.iterator()
        L_0x0300:
            boolean r0 = r23.hasNext()
            java.lang.String r22 = ""
            if (r0 == 0) goto L_0x0499
            java.lang.Object r4 = r23.next()
            X.69I r4 = (X.AnonymousClass69I) r4
            X.69L r0 = r4.A0G()
            if (r0 == 0) goto L_0x0496
            X.Biy r12 = r0.A0E()
        L_0x0318:
            X.69K r0 = r4.A0F()
            if (r0 == 0) goto L_0x0493
            X.69O r13 = r0.A0E()
        L_0x0322:
            if (r12 == 0) goto L_0x0300
            java.lang.String r0 = "strong_id__"
            java.lang.String r11 = r12.getRequiredStringField(r2, r0)
            if (r11 == 0) goto L_0x0300
            java.lang.Class<X.Biw> r7 = X.C42822Biw.class
            r5 = 3
            java.lang.String r4 = "creator"
            r0 = 1602719634(0x5f878f92, float:1.9536373E19)
            X.3lr r5 = r12.getOptionalTreeField(r5, r4, r7, r0)
            if (r5 == 0) goto L_0x048f
            java.lang.Class<X.69R> r4 = X.AnonymousClass69R.class
            r0 = -1791809412(0xffffffff9533287c, float:-3.61807E-26)
            X.3lr r4 = r5.reinterpretRequired(r2, r4, r0)
            X.69R r4 = (X.AnonymousClass69R) r4
            if (r4 == 0) goto L_0x048f
            X.1E5 r0 = X.1E4.A00(r6)
            com.instagram.user.model.User r41 = r4.A0E(r0)
        L_0x034f:
            java.lang.Class<X.Bix> r7 = X.C42823Bix.class
            r5 = 4
            java.lang.String r4 = "prompt_responses"
            r0 = 1661840459(0x630dac4b, float:2.613406E21)
            com.google.common.collect.ImmutableList r0 = r12.getRequiredCompactedTreeListField(r5, r4, r7, r0)
            if (r0 == 0) goto L_0x0439
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Iterator r19 = r0.iterator()
        L_0x0366:
            boolean r0 = r19.hasNext()
            if (r0 == 0) goto L_0x043b
            java.lang.Object r5 = r19.next()
            X.3lr r5 = (X.C250663lr) r5
            java.lang.Class<X.69N> r4 = X.AnonymousClass69N.class
            r0 = -1739341165(0xffffffff9853c293, float:-2.7369346E-24)
            X.3lr r4 = r5.reinterpretRequired(r2, r4, r0)
            X.69N r4 = (X.AnonymousClass69N) r4
            X.0qQ.A07(r4)
            X.17i r0 = r1.A0G
            X.4zZ r14 = X.AnonymousClass69P.A03(r6, r13, r4, r0)
            if (r14 == 0) goto L_0x0366
            X.Cwu r9 = new X.Cwu
            r9.<init>(r14)
            X.5y2 r8 = r14.A0A
            if (r8 == 0) goto L_0x042d
            X.D9e r4 = X.AnonymousClass60G.A00
            java.lang.String r0 = "prompt_text"
            java.lang.String r0 = r12.getOptionalStringField(r3, r0)
            if (r0 != 0) goto L_0x039d
            r0 = r22
        L_0x039d:
            X.Cwq r7 = r4.A00(r11, r0)
            if (r13 == 0) goto L_0x03d4
            com.google.common.collect.ImmutableList r4 = r13.A0E()
            if (r4 == 0) goto L_0x03d4
            r0 = 10
            int r0 = X.0Yv.A1E(r4, r0)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>(r0)
            java.util.Iterator r18 = r4.iterator()
        L_0x03b8:
            boolean r0 = r18.hasNext()
            if (r0 == 0) goto L_0x03d5
            java.lang.Object r0 = r18.next()
            X.69Q r0 = (X.AnonymousClass69Q) r0
            X.69R r4 = r0.A0E()
            X.1E5 r0 = X.1E4.A00(r6)
            com.instagram.user.model.User r0 = r4.A0E(r0)
            r5.add(r0)
            goto L_0x03b8
        L_0x03d4:
            r5 = 0
        L_0x03d5:
            r7.A04 = r5
            if (r13 == 0) goto L_0x042b
            java.lang.String r0 = "num_pog_users"
            int r0 = r13.getRequiredIntField(r2, r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x03e3:
            r7.A01 = r0
            boolean r0 = r14.A0R
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r7.A00 = r0
            X.60F r39 = r7.A00()
            com.instagram.api.schemas.AudioNoteResponseInfo r0 = r8.A00
            r28 = r0
            com.instagram.api.schemas.AvatarNoteResponseInfo r0 = r8.A01
            r29 = r0
            com.instagram.api.schemas.GIFNoteResponseInfo r0 = r8.A02
            r30 = r0
            X.605 r0 = r8.A03
            r31 = r0
            com.instagram.api.schemas.ListeningNowResponseInfo r0 = r8.A04
            r32 = r0
            com.instagram.api.schemas.LiveNoteResponseInfo r0 = r8.A05
            r33 = r0
            com.instagram.api.schemas.LocationNoteResponseInfo r0 = r8.A06
            r34 = r0
            com.instagram.api.schemas.MusicNoteResponseInfo r0 = r8.A07
            r18 = r0
            com.instagram.api.schemas.NoteChatResponseInfo r14 = r8.A08
            X.60C r5 = r8.A09
            X.60E r4 = r8.A0A
            X.60H r7 = r8.A0C
            X.5y2 r0 = new X.5y2
            r27 = r0
            r35 = r18
            r36 = r14
            r37 = r5
            r38 = r4
            r40 = r7
            r27.<init>(r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40)
            goto L_0x042e
        L_0x042b:
            r0 = 0
            goto L_0x03e3
        L_0x042d:
            r0 = 0
        L_0x042e:
            r9.A0A = r0
            X.4zZ r0 = r9.A01()
            r10.add(r0)
            goto L_0x0366
        L_0x0439:
            X.0sn r10 = X.0sn.A00
        L_0x043b:
            java.util.Iterator r5 = r10.iterator()
        L_0x043f:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x048d
            java.lang.Object r4 = r5.next()
            r0 = r4
            X.4zZ r0 = (X.C279864zZ) r0
            X.5y2 r0 = r0.A0A
            if (r0 == 0) goto L_0x043f
            X.60F r0 = r0.A0B
            if (r0 == 0) goto L_0x043f
        L_0x0454:
            X.4zZ r4 = (X.C279864zZ) r4
            if (r4 == 0) goto L_0x0464
            X.5y2 r0 = r4.A0A
            if (r0 == 0) goto L_0x0464
            X.60F r0 = r0.A0B
            if (r0 == 0) goto L_0x0464
            java.lang.String r4 = r0.A03
            if (r4 != 0) goto L_0x0466
        L_0x0464:
            r4 = r22
        L_0x0466:
            r5 = 6
            java.lang.String r0 = "creation_edu_text"
            java.lang.String r44 = r12.getOptionalStringField(r5, r0)
            r5 = 5
            java.lang.String r0 = "attribution_text"
            java.lang.String r45 = r12.getOptionalStringField(r5, r0)
            X.4zc r0 = new X.4zc
            r40 = r0
            r42 = r11
            r43 = r4
            r46 = r10
            r40.<init>(r41, r42, r43, r44, r45, r46)
            X.0eP r4 = new X.0eP
            r4.<init>(r11, r0)
            r0 = r25
            r0.add(r4)
            goto L_0x0300
        L_0x048d:
            r4 = 0
            goto L_0x0454
        L_0x048f:
            r41 = 0
            goto L_0x034f
        L_0x0493:
            r13 = 0
            goto L_0x0322
        L_0x0496:
            r12 = 0
            goto L_0x0318
        L_0x0499:
            java.util.Map r13 = X.0Yt.A08(r25)
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.Iterator r19 = r20.iterator()
            r39 = 0
        L_0x04a8:
            boolean r0 = r19.hasNext()
            if (r0 == 0) goto L_0x06ff
            java.lang.Object r5 = r19.next()
            int r18 = r39 + 1
            if (r39 >= 0) goto L_0x04be
            X.0sr.A1T()
            X.00P r1 = X.AnonymousClass00P.createAndThrow()
            throw r1
        L_0x04be:
            X.69I r5 = (X.AnonymousClass69I) r5
            java.lang.Class<X.69M> r8 = X.AnonymousClass69M.class
            r7 = 5
            java.lang.String r4 = "media_note_stack_dict"
            r0 = -1752473624(0xffffffff978b5fe8, float:-9.006875E-25)
            X.3lr r7 = r5.getOptionalTreeField(r7, r4, r8, r0)
            if (r7 == 0) goto L_0x06d6
            java.lang.Class<X.C7g> r4 = X.C43736C7g.class
            r0 = -1047293074(0xffffffffc193936e, float:-18.446987)
            X.3lr r0 = r7.reinterpretRequired(r2, r4, r0)
            X.C7g r0 = (X.C43736C7g) r0
            if (r0 == 0) goto L_0x06d6
            java.lang.Class<com.instagram.feed.media.ImmutablePandoMediaDict> r7 = com.instagram.feed.media.ImmutablePandoMediaDict.class
            java.lang.String r4 = "media_stack"
            com.google.common.collect.ImmutableList r4 = r0.getTreeList(r4, r7)
            com.google.common.collect.ImmutableList$Builder r9 = new com.google.common.collect.ImmutableList$Builder
            r9.<init>()
            X.3kO r8 = r4.iterator()
        L_0x04ec:
            boolean r4 = r8.hasNext()
            if (r4 == 0) goto L_0x0501
            java.lang.Object r7 = r8.next()
            com.instagram.feed.media.ImmutablePandoMediaDict r7 = (com.instagram.feed.media.ImmutablePandoMediaDict) r7
            X.1q3 r4 = new X.1q3
            r4.<init>(r7)
            r9.add(r4)
            goto L_0x04ec
        L_0x0501:
            com.google.common.collect.ImmutableList r4 = r9.build()
            X.0qQ.A07(r4)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r10 = r4.iterator()
        L_0x0511:
            boolean r4 = r10.hasNext()
            if (r4 == 0) goto L_0x052f
            java.lang.Object r9 = r10.next()
            X.1Xy r9 = (X.1Xy) r9
            X.1Xv r4 = X.1Xj.A0h
            X.0qQ.A0A(r9)
            X.1E5 r8 = X.1E4.A00(r6)
            X.1Xj r4 = new X.1Xj
            r4.<init>(r8, r9)
            r7.add(r4)
            goto L_0x0511
        L_0x052f:
            boolean r4 = r7.isEmpty()
            r4 = r4 ^ 1
            if (r4 == 0) goto L_0x06d6
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r10 = r7.iterator()
        L_0x0540:
            boolean r4 = r10.hasNext()
            if (r4 == 0) goto L_0x0561
            java.lang.Object r4 = r10.next()
            X.1Xj r4 = (X.1Xj) r4
            java.lang.String r8 = r4.getId()
            if (r8 == 0) goto L_0x0540
            com.instagram.common.typedurl.ImageUrl r7 = r4.A1Q()
            if (r7 == 0) goto L_0x0540
            X.0eP r4 = new X.0eP
            r4.<init>(r8, r7)
            r9.add(r4)
            goto L_0x0540
        L_0x0561:
            java.util.Map r37 = X.0Yt.A08(r9)
            boolean r4 = r37.isEmpty()
            r4 = r4 ^ 1
            if (r4 == 0) goto L_0x06d6
            X.NkO r7 = X.C69384NkO.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r4 = "inbox_tray_item_type"
            java.lang.Enum r8 = r5.getRequiredEnumField(r2, r4, r7)
            if (r8 == 0) goto L_0x05ba
            java.lang.String r9 = r8.toString()
        L_0x057b:
            java.lang.String r8 = "media_note_author_stack"
            boolean r14 = X.0qQ.A0K(r9, r8)
            X.69K r8 = r5.A0F()
            if (r8 == 0) goto L_0x05bc
            X.69O r8 = r8.A0E()
            if (r8 == 0) goto L_0x05bc
            com.google.common.collect.ImmutableList r8 = r8.A0E()
            if (r8 == 0) goto L_0x05bc
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Iterator r12 = r8.iterator()
        L_0x059c:
            boolean r8 = r12.hasNext()
            if (r8 == 0) goto L_0x05bd
            java.lang.Object r8 = r12.next()
            X.69Q r8 = (X.AnonymousClass69Q) r8
            X.69R r9 = r8.A0E()
            X.1E5 r8 = X.1E4.A00(r6)
            com.instagram.user.model.User r8 = r9.A0E(r8)
            if (r8 == 0) goto L_0x059c
            r10.add(r8)
            goto L_0x059c
        L_0x05ba:
            r9 = 0
            goto L_0x057b
        L_0x05bc:
            r10 = 0
        L_0x05bd:
            if (r14 == 0) goto L_0x06f7
            if (r10 == 0) goto L_0x06f7
            boolean r8 = r10.isEmpty()
            if (r8 != 0) goto L_0x06f7
            java.lang.Object r12 = r10.get(r2)
            com.instagram.user.model.User r12 = (com.instagram.user.model.User) r12
        L_0x05cd:
            java.lang.String r9 = r12.getId()
            java.lang.String r8 = r6.A06
            boolean r8 = X.0qQ.A0K(r9, r8)
            if (r8 == 0) goto L_0x05dd
            r42 = 1
            if (r14 != 0) goto L_0x05df
        L_0x05dd:
            r42 = 0
        L_0x05df:
            java.lang.String r8 = "inbox_tray_item_id"
            java.lang.String r31 = r5.getRequiredStringField(r3, r8)
            X.0qQ.A07(r31)
            java.lang.String r9 = "num_media"
            r8 = r26
            int r38 = r0.getCoercedIntField(r8, r9)
            java.lang.String r8 = "has_unseen_media"
            boolean r43 = r0.getCoercedBooleanField(r2, r8)
            java.lang.String r9 = "latest_visible_content_note_timestamp"
            boolean r8 = r0.hasFieldValue(r9)
            if (r8 == 0) goto L_0x06f3
            r8 = 3
            int r40 = r0.getCoercedIntField(r8, r9)
        L_0x0603:
            int r41 = r20.size()
            java.lang.Enum r4 = r5.getRequiredEnumField(r2, r4, r7)
            if (r4 == 0) goto L_0x06ef
            java.lang.String r32 = r4.toString()
        L_0x0611:
            X.69K r4 = r5.A0F()
            if (r4 == 0) goto L_0x06eb
            X.69O r5 = r4.A0E()
            if (r5 == 0) goto L_0x06eb
            X.Kia r7 = X.C62603Kia.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r4 = "pog_style"
            java.lang.Enum r4 = r5.getRequiredEnumField(r3, r4, r7)
            if (r4 == 0) goto L_0x06eb
            java.lang.String r33 = r4.toString()
        L_0x062b:
            X.Bis r4 = r0.A0E()
            if (r4 == 0) goto L_0x06e7
            java.lang.String r5 = "id"
            java.lang.String r34 = r4.getOptionalStringField(r2, r5)
        L_0x0637:
            X.Bis r5 = r0.A0E()
            if (r5 == 0) goto L_0x06e3
            java.lang.String r7 = "text"
            r4 = r26
            java.lang.String r35 = r5.getOptionalStringField(r4, r7)
        L_0x0645:
            X.Bis r4 = r0.A0E()
            if (r4 == 0) goto L_0x06df
            r7 = 3
            java.lang.String r5 = "viewer_has_liked"
            boolean r4 = r4.getCoercedBooleanField(r7, r5)
            java.lang.Boolean r30 = java.lang.Boolean.valueOf(r4)
        L_0x0656:
            X.Bis r0 = r0.A0E()
            if (r0 == 0) goto L_0x06dc
            java.lang.Class<X.Bir> r7 = X.C42817Bir.class
            r8 = 4
            java.lang.String r5 = "custom_theme"
            r4 = -1552412378(0xffffffffa3781126, float:-1.3447738E-17)
            X.3lr r0 = r0.getOptionalTreeField(r8, r5, r7, r4)
            if (r0 == 0) goto L_0x06dc
            java.lang.Class<X.UQO> r5 = X.UQO.class
            r4 = 1820191152(0x6c7de9b0, float:1.22784716E27)
            X.3lr r4 = r0.reinterpretRequired(r2, r5, r4)
            X.0qQ.A07(r4)
            X.UyY r7 = X.C16636UyY.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            r5 = 3
            r0 = 229(0xe5, float:3.21E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            java.lang.Enum r0 = r4.getOptionalEnumField(r5, r0, r7)
            if (r0 == 0) goto L_0x06da
            java.lang.String r5 = r0.toString()
            java.util.Map r0 = com.instagram.api.schemas.NoteActivationType.A01
            java.lang.Object r5 = r0.get(r5)
            com.instagram.api.schemas.NoteActivationType r5 = (com.instagram.api.schemas.NoteActivationType) r5
            if (r5 != 0) goto L_0x0695
            com.instagram.api.schemas.NoteActivationType r5 = com.instagram.api.schemas.NoteActivationType.UNRECOGNIZED
        L_0x0695:
            r0 = 1519(0x5ef, float:2.129E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            java.lang.String r46 = r4.getOptionalStringField(r2, r0)
            r0 = 263(0x107, float:3.69E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            java.lang.String r47 = r4.getOptionalStringField(r8, r0)
            r0 = 400(0x190, float:5.6E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            java.lang.String r48 = r4.getOptionalStringField(r3, r0)
            r0 = 3415(0xd57, float:4.785E-42)
            java.lang.String r7 = X.C273654mx.A00(r0)
            r0 = r26
            java.lang.String r49 = r4.getOptionalStringField(r0, r7)
            com.instagram.api.schemas.NoteCustomThemeImpl r28 = new com.instagram.api.schemas.NoteCustomThemeImpl
            r44 = r28
            r45 = r5
            r44.<init>(r45, r46, r47, r48, r49)
        L_0x06c8:
            X.4AT r0 = new X.4AT
            r27 = r0
            r29 = r12
            r36 = r10
            r27.<init>(r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43)
            r11.add(r0)
        L_0x06d6:
            r39 = r18
            goto L_0x04a8
        L_0x06da:
            r5 = 0
            goto L_0x0695
        L_0x06dc:
            r28 = 0
            goto L_0x06c8
        L_0x06df:
            r30 = 0
            goto L_0x0656
        L_0x06e3:
            r35 = 0
            goto L_0x0645
        L_0x06e7:
            r34 = 0
            goto L_0x0637
        L_0x06eb:
            r33 = 0
            goto L_0x062b
        L_0x06ef:
            r32 = 0
            goto L_0x0611
        L_0x06f3:
            r40 = -1
            goto L_0x0603
        L_0x06f7:
            X.0eE r8 = X.AnonymousClass0t1.A01
            com.instagram.user.model.User r12 = r8.A01(r6)
            goto L_0x05cd
        L_0x06ff:
            X.05G r4 = r1.A0X
            java.lang.Object r0 = r4.getValue()
            boolean r0 = X.0qQ.A0K(r0, r15)
            if (r0 == 0) goto L_0x0717
            X.05G r0 = r1.A0U
            java.lang.Object r0 = r0.getValue()
            boolean r0 = X.0qQ.A0K(r0, r11)
            if (r0 != 0) goto L_0x07df
        L_0x0717:
            java.util.HashMap r5 = r1.A0I
            r5.clear()
            java.util.Iterator r9 = r15.iterator()
        L_0x0720:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x0770
            java.lang.Object r2 = r9.next()
            r8 = r2
            X.4zZ r8 = (X.C279864zZ) r8
            int r7 = r8.A01
            com.instagram.direct.inbox.notes.models.NoteStyle r0 = com.instagram.direct.inbox.notes.models.NoteStyle.NOTE_CHAT
            int r0 = r0.A00
            if (r7 != r0) goto L_0x073b
            java.lang.String r0 = r8.A0H
        L_0x0737:
            r5.put(r0, r2)
            goto L_0x0720
        L_0x073b:
            com.instagram.direct.inbox.notes.models.NoteStyle r0 = com.instagram.direct.inbox.notes.models.NoteStyle.PROMPT_QUESTION
            int r0 = r0.A00
            if (r7 != r0) goto L_0x0750
            X.5y2 r0 = r8.A0A
            if (r0 == 0) goto L_0x074d
            X.60F r0 = r0.A0B
            if (r0 == 0) goto L_0x074d
            java.lang.String r0 = r0.A02
            if (r0 != 0) goto L_0x0737
        L_0x074d:
            r0 = r22
            goto L_0x0737
        L_0x0750:
            java.lang.String r0 = r8.A0K
            goto L_0x0737
        L_0x0753:
            boolean r0 = r6 instanceof X.C297815sO
            if (r0 == 0) goto L_0x0762
            X.5sO r6 = (X.C297815sO) r6
            java.lang.Object r0 = r6.A00
            X.4dm r0 = (X.C268654dm) r0
            A03(r0, r1)
            goto L_0x07f2
        L_0x0762:
            X.Wub r1 = new X.Wub
            r1.<init>()
            throw r1
        L_0x0768:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        L_0x0770:
            X.05G r0 = r1.A0Z
            r0.Epw(r13)
            r4.Epw(r15)
            X.05G r2 = r1.A0b
            if (r16 != 0) goto L_0x077e
            X.0sn r16 = X.0sn.A00
        L_0x077e:
            r0 = r16
            r2.Epw(r0)
            X.05G r2 = r1.A0T
            X.0sn r0 = X.0sn.A00
            r2.Epw(r0)
            X.05G r2 = r1.A0a
            r0 = r24
            r2.Epw(r0)
            X.05G r0 = r1.A0U
            r0.Epw(r11)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r3)
            r0 = r21
            boolean r0 = X.0qQ.A0K(r0, r2)
            if (r0 == 0) goto L_0x07b1
            X.4Cq r4 = r1.A01
            r3 = 0
            r0 = 25
            X.Pfm r2 = new X.Pfm
            r2.<init>(r1, r3, r0)
            X.19B r0 = X.19B.A00
            X.1Eo.A05(r0, r2, r4)
        L_0x07b1:
            if (r17 != 0) goto L_0x07c3
            X.0Tu r0 = X.0Tu.A05
            r2 = 36322555602151668(0x810b2c000028f4, double:3.0338686497679897E-306)
            boolean r0 = X.182.A06(r0, r6, r2)
            if (r0 != 0) goto L_0x07c3
            r1.A0B()
        L_0x07c3:
            X.4zW r3 = r1.A02
            if (r3 == 0) goto L_0x07df
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r2.addAll(r15)
            java.util.Collection r0 = r13.values()
            r2.addAll(r0)
            r2.addAll(r11)
            r3.A01(r2)
            r20.size()
        L_0x07df:
            com.instagram.common.session.UserSession r4 = r1.A0B
            X.0Tu r0 = X.0Tu.A05
            r2 = 36328263615265969(0x81105d00183cb1, double:3.0374784202457976E-306)
            boolean r0 = X.182.A06(r0, r4, r2)
            if (r0 == 0) goto L_0x07f2
            r0 = r20
            r1.A05 = r0
        L_0x07f2:
            X.0gF r2 = X.C60340gF.A00
        L_0x07f4:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.inbox.notes.NotesRepository.A0A(X.4D7, boolean):java.lang.Object");
    }

    public final void A0B() {
        C262224Cq r3 = this.A01;
        C376909Ju r2 = new C376909Ju(this, (AnonymousClass4D7) null, 12);
        1Eo.A03(AnonymousClass05K.A00, 19B.A00, r2, r3);
    }

    public final void A0D(long j, String str) {
        0sL mEc;
        boolean A062 = 182.A06(0Tu.A05, this.A0B, 36323650819075427L);
        C262224Cq r2 = this.A01;
        long j2 = j;
        String str2 = str;
        if (A062) {
            mEc = new NotesRepository$createNoteEmojiReaction$1(this, "❤️", str2, (AnonymousClass4D7) null, j2);
        } else {
            mEc = new C66149MEc(this, str2, "❤️", (AnonymousClass4D7) null, 1, j2);
        }
        1Eo.A03(AnonymousClass05K.A00, 19B.A00, mEc, r2);
    }

    public final boolean A0R(boolean z) {
        UserSession userSession = this.A0B;
        if (AnonymousClass4AJ.A03(userSession)) {
            long A012 = 182.A01(0Tu.A05, userSession, 36603618262062021L);
            boolean z2 = false;
            if (this.A01 + TimeUnit.SECONDS.toMillis(A012) >= System.currentTimeMillis()) {
                z2 = true;
                02m r2 = this.A0D.A00;
                r2.markerStart(275915771);
                r2.markerPoint(275915771, "notes_fetch_cooldown_enforced");
                r2.markerEnd(275915771, 2);
            }
            C262204Co r0 = this.A09;
            if ((r0 == null || !r0.isActive()) && (z || !z2)) {
                return true;
            }
        }
        return false;
    }
}
