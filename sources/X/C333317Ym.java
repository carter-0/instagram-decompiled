package X;

import com.instagram.common.session.UserSession;
import com.instagram.creator.agent.disclosure.inthread.repository.CreatorAIFanNuxRepository;
import java.util.Set;

/* renamed from: X.7Ym  reason: invalid class name and case insensitive filesystem */
public final class C333317Ym extends 2YL {
    public String A00;
    public Set A01 = 0sl.A00;
    public final UserSession A02;
    public final CreatorAIFanNuxRepository A03;
    public final C317986oA A04;
    public final C333357Yq A05;
    public final 05G A06;
    public final AnonymousClass0Ud A07;

    public C333317Ym(UserSession userSession, CreatorAIFanNuxRepository creatorAIFanNuxRepository, C317986oA r10, C333357Yq r11) {
        0qQ.A0B(userSession, 1);
        0qQ.A0B(creatorAIFanNuxRepository, 2);
        this.A02 = userSession;
        this.A03 = creatorAIFanNuxRepository;
        this.A05 = r11;
        this.A04 = r10;
        02z r0 = new 02z(new AnonymousClass7PG((N49) null, AnonymousClass7PF.NONE, false, (String) null, false));
        this.A06 = r0;
        this.A07 = r0;
    }

    public final void A00() {
        Object value;
        AnonymousClass7PG r0;
        AnonymousClass7PF r4;
        this.A01 = 094.A01(((AnonymousClass7PG) this.A07.getValue()).A01, this.A01);
        05G r6 = this.A06;
        do {
            value = r6.getValue();
            r0 = (AnonymousClass7PG) value;
            r4 = AnonymousClass7PF.NONE;
        } while (!r6.AIY(value, AnonymousClass7PG.A00(r0.A00, r4, r0.A02, r0.A03, r0.A04)));
    }
}
