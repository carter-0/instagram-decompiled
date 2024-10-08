package X;

import com.instagram.archive.data.ArchiveStoryRecycleBinRepository;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.Jih  reason: case insensitive filesystem */
public final class C60285Jih extends 2YL {
    public final ArchiveStoryRecycleBinRepository A00;
    public final UserSession A01;
    public final 05G A02;
    public final AnonymousClass0Ud A03;
    public final AnonymousClass0Ud A04;

    public /* synthetic */ C60285Jih(UserSession userSession, String str) {
        ArchiveStoryRecycleBinRepository archiveStoryRecycleBinRepository = new ArchiveStoryRecycleBinRepository(userSession);
        AnonymousClass7TG.A1O(userSession, str);
        this.A01 = userSession;
        this.A00 = archiveStoryRecycleBinRepository;
        02z A10 = DbS.A10(new C59721JVf((Integer) null, (Map) null, (DefaultConstructorMarker) null, 3, 21));
        this.A02 = A10;
        this.A03 = 10b.A03(A10);
        MCA A002 = MCA.A00(this, archiveStoryRecycleBinRepository.A07, 18);
        this.A04 = 10b.A02(new C61079JwH((Integer) null, (List) null, 7), C318116oQ.A00(this), A002, AnonymousClass10A.A01);
    }

    public final void onCleared() {
        this.A00.onUserSessionWillEnd(false);
    }

    public static final List A00(UserSession userSession, Map map) {
        0sn A0p;
        Collection<AnonymousClass34S> values = map.values();
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (AnonymousClass34S r0 : values) {
            C60991Jun jun = (C60991Jun) r0.A00;
            Reel reel = (Reel) r0.A01;
            if (reel.A14(userSession)) {
                A0p = 0sn.A00;
            } else {
                int i = 0;
                if (!reel.A15(userSession)) {
                    List A0O = reel.A0O(userSession);
                    0qQ.A07(A0O);
                    ArrayList A0p2 = AnonymousClass7TF.A0p(A0O);
                    int i2 = 0;
                    for (Object next : A0O) {
                        i++;
                        if (i2 < 0) {
                            0sr.A1T();
                            throw AnonymousClass00P.createAndThrow();
                        }
                        C255773uh r11 = (C255773uh) next;
                        0qQ.A0A(r11);
                        long j = jun.A01;
                        0qQ.A0B(r11, 1);
                        A0p2.add(new C55977Hqi(reel, r11, i2, j));
                        i2 = i;
                    }
                    A0p = 00k.A0U(A0p2);
                    Set<Number> set = reel.A1A;
                    0qQ.A07(set);
                    for (Number A09 : set) {
                        A0p.add(new C61324K2l(reel, JTP.A09(A09), jun.A01));
                    }
                } else {
                    2HY A0C = C229632nm.A0C(0, jun.A00);
                    A0p = AnonymousClass7TF.A0p(A0C);
                    0sh it = A0C.iterator();
                    while (it.hasNext()) {
                        A0p.add(new C61323K2k(reel, it.A00(), jun.A01));
                    }
                }
            }
            018.A16(A0p, A1C);
        }
        return A1C;
    }

    public final void A01(boolean z) {
        Dba.A1S(this, C318116oQ.A00(this), 3, z);
    }
}
