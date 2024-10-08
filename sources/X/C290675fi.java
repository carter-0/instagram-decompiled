package X;

import com.facebook.quicklog.MarkerEditor;
import com.facebook.quicklog.PointEditor;
import com.google.common.collect.ArrayListMultimap;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.5fi  reason: invalid class name and case insensitive filesystem */
public final class C290675fi {
    public C70623ODu A00;
    public final C257513xW A01;
    public final C290655fg A02;
    public final UserSession A03;
    public final C61480nO A04;
    public final 0xa A05;
    public final ArrayList A06;
    public final Map A07;
    public final Map A08;
    public final Map A09;
    public final Map A0A;
    public final AtomicBoolean A0B;
    public final AtomicBoolean A0C;

    public static final void A00(C290675fi r10, C293635l6 r11) {
        String str;
        String str2;
        try {
            0xY AR4 = r10.A05.AR4();
            AR4.AHM();
            for (User user : r10.A0A.values()) {
                0qQ.A0A(user);
                AR4.E5g(002.A0R("user:", user.getId()), 17V.A00(user));
            }
            for (C290915gD r2 : r10.A08.values()) {
                if (r2 != null) {
                    AR4.E5g(002.A0R("thread:", r2.A09), C290905gC.A00(r2));
                }
            }
            for (C290935gF r8 : r10.A07.values()) {
                String A0R = 002.A0R("ranking_store:", r8.A03);
                StringWriter stringWriter = new StringWriter();
                17W A0A2 = AnonymousClass15o.A00.A0A(stringWriter);
                A0A2.A0c();
                String str3 = r8.A03;
                if (str3 != null) {
                    A0A2.A0R("view_name", str3);
                }
                A0A2.A0Q("expiration_ms", r8.A00);
                A0A2.A0q("score_map");
                A0A2.A0c();
                for (Map.Entry entry : r8.A04.entrySet()) {
                    if (!16P.A04(A0A2, entry)) {
                        C290955gH r7 = (C290955gH) entry.getValue();
                        A0A2.A0c();
                        A0A2.A0N("score", r7.A00);
                        String str4 = r7.A01;
                        if (str4 != null) {
                            A0A2.A0R("entity_type", str4);
                        }
                        A0A2.A0Z();
                    }
                }
                A0A2.A0Z();
                String str5 = r8.A02;
                if (str5 != null) {
                    A0A2.A0R("ranking_request_id", str5);
                }
                A0A2.A0Q("expiration_timestamp", r8.A01);
                A0A2.A0Z();
                A0A2.close();
                AR4.E5g(A0R, stringWriter.toString());
            }
            AR4.apply();
            str = null;
        } catch (IOException e) {
            str = e.getMessage();
            0wb.A06("BanyanCache", "Unable to save to disk", e);
        }
        if (r11 != null) {
            C290855g4 A002 = C290825g1.A00(r11.A01.A0I);
            String str6 = r11.A00;
            C290875g6 r72 = A002.A00;
            if (r72 != null) {
                02m r1 = 02m.A0p;
                if (str != null) {
                    r72.A02.add(str);
                }
                List list = r72.A00;
                list.remove(str6);
                MarkerEditor withMarker = r1.withMarker(135806945);
                if (str6.equals("GraphQL")) {
                    str2 = "disk_persist_gql_end";
                } else if (str6.equals("banyan")) {
                    str2 = "disk_persist_banyan_end";
                } else {
                    str2 = "";
                }
                PointEditor pointEditor = withMarker.pointEditor(str2);
                boolean z = true;
                boolean z2 = false;
                if (str == null) {
                    z2 = true;
                }
                pointEditor.addPointData("is_successful", z2).addPointData("error_descriptions", str).markerEditingCompleted();
                if (!r72.A03 && !r72.A04 && list.isEmpty()) {
                    if (str != null) {
                        z = false;
                    }
                    A002.A03(z);
                }
            }
        }
    }

    public static final void A01(C290675fi r2, C290915gD r3) {
        r2.A02.A00();
        User user = (User) 00k.A0N(r3.A0B);
        if (user != null && r3.A0C) {
            r2.A09.put(user.getId(), r3);
        }
    }

    public final C290935gF A02(String str) {
        this.A02.A00();
        return (C290935gF) this.A07.get(str);
    }

    public final void A03(C290995gL r8) {
        this.A02.A00();
        for (C290935gF r4 : r8.A03) {
            if (!00k.A0u(r8.A04, r4.A03)) {
                r4.A01 = System.currentTimeMillis() + r4.A00;
            }
            this.A07.put(r4.A03, r4);
        }
        C293605l3 r6 = r8.A00;
        if (r6 != null) {
            List<User> unmodifiableList = Collections.unmodifiableList(r6.A01);
            0qQ.A07(unmodifiableList);
            for (User user : unmodifiableList) {
                this.A0A.put(user.getId(), user);
                C257513xW r3 = this.A01;
                String fullName = user.getFullName();
                if (fullName == null) {
                    fullName = "";
                }
                r3.E5L(002.A0T(fullName, user.getUsername(), ' '), user.getId());
            }
            List<C290915gD> unmodifiableList2 = Collections.unmodifiableList(r6.A00);
            0qQ.A07(unmodifiableList2);
            for (C290915gD r2 : unmodifiableList2) {
                this.A08.put(r2.A09, r2);
                A01(this, r2);
            }
        }
    }

    public final void A04(boolean z) {
        InterruptedException th;
        try {
            C290655fg r5 = this.A02;
            ReentrantReadWriteLock reentrantReadWriteLock = r5.A00;
            if (reentrantReadWriteLock.writeLock().tryLock(1, TimeUnit.SECONDS)) {
                try {
                    r5.A00();
                    this.A07.clear();
                    this.A0A.clear();
                    this.A08.clear();
                    this.A01.clear();
                    C70623ODu oDu = this.A00;
                    if (oDu != null) {
                        Object value = oDu.A01.getValue();
                        0qQ.A07(value);
                        ((1a8) value).A01();
                    }
                    if (z) {
                        0xY AR4 = this.A05.AR4();
                        AR4.AHM();
                        AR4.apply();
                    }
                    reentrantReadWriteLock.writeLock().unlock();
                } catch (Throwable th2) {
                    th = th2;
                    reentrantReadWriteLock.writeLock().unlock();
                }
            } else {
                th = new InterruptedException("Failed to claim lock after 1 seconds");
                throw th;
            }
        } catch (InterruptedException e) {
            0KC.A0F("BanyanCache", "Unable to acquire lock for executing this block.", e);
        }
    }

    public C290675fi(C290655fg r5, UserSession userSession) {
        Map map;
        0Tu r3 = 0Tu.A05;
        if (182.A06(r3, userSession, 36323410300906643L)) {
            map = C290685fj.A01;
        } else {
            map = C290685fj.A00;
        }
        ArrayList arrayList = new ArrayList(map.keySet());
        this.A06 = arrayList;
        this.A07 = new HashMap();
        this.A08 = new HashMap();
        this.A09 = new HashMap();
        this.A0A = new HashMap();
        this.A01 = new ArrayListMultimap();
        this.A05 = 1Al.A01(userSession).A03(1An.A0T);
        this.A02 = r5;
        this.A0C = new AtomicBoolean();
        this.A0B = new AtomicBoolean();
        C61480nO A002 = 0nY.A00();
        0qQ.A07(A002);
        this.A04 = A002;
        if (!182.A06(r3, userSession, 36317934219171503L)) {
            arrayList.remove("direct_ibc_inbox_discovery");
        }
        if (!182.A06(r3, userSession, 36317934218974892L)) {
            arrayList.remove("direct_ibc_inbox_invitations");
        }
        if (182.A06(r3, userSession, 36324355193450524L)) {
            arrayList.remove("forwarding_recipient_sheet");
            arrayList.remove("story_share_sheet");
        }
        arrayList.remove("direct_ibc_inbox_discovery_nullstate");
        this.A03 = userSession;
    }
}
