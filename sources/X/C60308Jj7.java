package X;

import com.instagram.archive.data.ArchiveStoryRepository;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.Jj7  reason: case insensitive filesystem */
public final class C60308Jj7 extends 2YL {
    public 1Xj A00;
    public final C64184LSr A01;
    public final ArchiveStoryRepository A02;
    public final C63971LGa A03;
    public final 1Ng A04;
    public final UserSession A05;
    public final String A06;
    public final Set A07 = DbS.A0y();
    public final 05G A08;
    public final AnonymousClass0Ud A09;
    public final boolean A0A;
    public final boolean A0B;

    public static final void A01(C60308Jj7 jj7, String str, boolean z) {
        Object value;
        C60308Jj7 jj72 = jj7;
        05G r4 = jj7.A08;
        Object obj = ((C61056Jvu) r4.getValue()).A03;
        Integer num = AnonymousClass05K.A01;
        if (obj != num) {
            do {
                value = r4.getValue();
            } while (!r4.AIY(value, C61056Jvu.A00((C61056Jvu) value, (1Xj) null, num, (Integer) null, (String) null, (Map) null, (Set) null, 0, 254, false)));
            C63971LGa lGa = jj72.A03;
            if (!lGa.A01) {
                lGa.A03.markerStart(18945137);
                lGa.A01 = true;
                lGa.A00 = C51966G9m.A1L(new MFS(lGa, (AnonymousClass4D7) null, 3), lGa.A02);
            }
            AnonymousClass7TE.A1Z(new MEW(jj72, str, (AnonymousClass4D7) null, 0, z), C318116oQ.A00(jj72));
        }
    }

    public /* synthetic */ C60308Jj7(C64184LSr lSr, ArchiveStoryRepository archiveStoryRepository, C63971LGa lGa, UserSession userSession, String str, boolean z, boolean z2) {
        UserSession userSession2 = userSession;
        1Ng A002 = AnonymousClass1Nd.A00(userSession2);
        String str2 = str;
        C51972G9s.A1B(userSession2, str2);
        0qQ.A0B(A002, 8);
        this.A05 = userSession2;
        this.A02 = archiveStoryRepository;
        this.A0A = z;
        this.A06 = str2;
        this.A0B = z2;
        this.A03 = lGa;
        this.A01 = lSr;
        this.A04 = A002;
        02z A10 = DbS.A10(new C61056Jvu((1Xj) null, (Integer) null, (Integer) null, (String) null, (Map) null, (Set) null, (DefaultConstructorMarker) null, 0, 255, 0, false));
        this.A08 = A10;
        MCA A003 = MCA.A00(this, A10, 19);
        this.A09 = 10b.A02(new C61056Jvu(), C318116oQ.A00(this), A003, AnonymousClass10A.A01);
        DbY.A19(this, new MGZ(this, (AnonymousClass4D7) null, 11), new AnonymousClass64X(A002).A00(C64642LfU.class));
    }

    public final void A02() {
        Object value;
        05G r4 = this.A08;
        do {
            value = r4.getValue();
        } while (!r4.AIY(value, C61056Jvu.A00((C61056Jvu) value, (1Xj) null, (Integer) null, AnonymousClass05K.A01, (String) null, (Map) null, (Set) null, 0, 247, false)));
        AnonymousClass7TE.A1Z(new MFS(this, (AnonymousClass4D7) null, 7), C318116oQ.A00(this));
    }

    public final void A03(int i) {
        Object value;
        05G r2 = this.A08;
        do {
            value = r2.getValue();
        } while (!r2.AIY(value, C61056Jvu.A00((C61056Jvu) value, (1Xj) null, (Integer) null, (Integer) null, (String) null, (Map) null, (Set) null, i, 127, false)));
    }

    public final void A04(1Xj r4) {
        ArchiveStoryRepository archiveStoryRepository = this.A02;
        MHD.A00(r4, archiveStoryRepository, archiveStoryRepository.A01, 31);
    }

    public final void A05(1Xj r9, boolean z) {
        ArchiveStoryRepository archiveStoryRepository = this.A02;
        AnonymousClass7TE.A1Z(new MFh(archiveStoryRepository, r9, "stories_archive", (AnonymousClass4D7) null, 0, z), archiveStoryRepository.A01);
    }

    public final void A06(Reel reel) {
        Object value;
        Set keySet;
        C64184LSr lSr = this.A01;
        lSr.A07(reel);
        05G r5 = this.A08;
        do {
            value = r5.getValue();
            keySet = lSr.A05.keySet();
            0qQ.A07(keySet);
        } while (!r5.AIY(value, C61056Jvu.A00((C61056Jvu) value, (1Xj) null, (Integer) null, (Integer) null, (String) null, (Map) null, 00k.A0k(keySet), 0, 223, false)));
    }

    public final void onCleared() {
        this.A02.onUserSessionWillEnd(false);
    }

    public static final List A00(UserSession userSession, Map map, boolean z) {
        0sn A0r;
        Collection<AnonymousClass34S> values = map.values();
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (AnonymousClass34S r0 : values) {
            C60991Jun jun = (C60991Jun) r0.A00;
            Reel reel = (Reel) r0.A01;
            if (reel.A14(userSession)) {
                A0r = 0sn.A00;
            } else if (!reel.A15(userSession)) {
                List A0O = reel.A0O(userSession);
                ArrayList A15 = DbV.A15(A0O);
                for (Object next : A0O) {
                    C255773uh r02 = (C255773uh) next;
                    if (!z || r02.A0B() != AnonymousClass3QO.CLOSE_FRIENDS) {
                        A15.add(next);
                    }
                }
                ArrayList A0r2 = AnonymousClass7TG.A0r(A15);
                int i = 0;
                for (Object next2 : A15) {
                    int i2 = i + 1;
                    if (i < 0) {
                        0sr.A1T();
                        throw AnonymousClass00P.createAndThrow();
                    }
                    C255773uh r11 = (C255773uh) next2;
                    0qQ.A0A(r11);
                    long j = jun.A01;
                    0qQ.A0B(r11, 1);
                    A0r2.add(new C55977Hqi(reel, r11, i, j));
                    i = i2;
                }
                A0r = 00k.A0U(A0r2);
                Set<Number> set = reel.A1A;
                0qQ.A07(set);
                for (Number A092 : set) {
                    A0r.add(new C61324K2l(reel, JTP.A09(A092), jun.A01));
                }
            } else {
                2HY A0C = C229632nm.A0C(0, jun.A00);
                A0r = AnonymousClass7TG.A0r(A0C);
                0sh it = A0C.iterator();
                while (it.hasNext()) {
                    A0r.add(new C61323K2k(reel, it.A00(), jun.A01));
                }
            }
            018.A16(A0r, A1C);
        }
        return A1C;
    }
}
