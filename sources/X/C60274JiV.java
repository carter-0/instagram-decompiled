package X;

import com.instagram.common.session.UserSession;
import com.instagram.quicksnap.data.repository.QuickSnapArchiveRepository;
import com.instagram.quicksnap.data.repository.QuickSnapRepository;
import com.instagram.quicksnap.util.QuickSnapMediaSaver;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.JiV  reason: case insensitive filesystem */
public final class C60274JiV extends 2YL {
    public boolean A00;
    public final C359098c0 A01;
    public final QuickSnapArchiveRepository A02;
    public final QuickSnapRepository A03;
    public final QuickSnapMediaSaver A04;
    public final String A05;
    public final AnonymousClass0r6 A06;
    public final 0V2 A07;
    public final 05G A08;
    public final AnonymousClass0Ud A09;
    public final UserSession A0A;

    public C60274JiV(UserSession userSession, C359098c0 r7, QuickSnapArchiveRepository quickSnapArchiveRepository, QuickSnapRepository quickSnapRepository, QuickSnapMediaSaver quickSnapMediaSaver, String str) {
        AnonymousClass7TG.A1Q(str, quickSnapRepository);
        this.A0A = userSession;
        this.A05 = str;
        this.A03 = quickSnapRepository;
        this.A02 = quickSnapArchiveRepository;
        this.A01 = r7;
        this.A04 = quickSnapMediaSaver;
        02z A10 = DbS.A10(new C61078JwG((C49654F0l) null, (DefaultConstructorMarker) null, 1, 37));
        this.A08 = A10;
        this.A09 = A10;
        Integer num = AnonymousClass05K.A00;
        05D A012 = 10D.A01(num, 0, 0);
        this.A07 = A012;
        this.A06 = A012;
        if (str.length() == 0) {
            A00(new Fk8(false), this);
            return;
        }
        JTO.A1Y(num, new C66166MGd((AnonymousClass4D7) null, (Object) this, 24), C318116oQ.A00(this));
    }

    public static final void A00(G5C g5c, C60274JiV jiV) {
        AnonymousClass7TE.A1Z(new C66166MGd(jiV, g5c, (AnonymousClass4D7) null, 25), C318116oQ.A00(jiV));
    }
}
