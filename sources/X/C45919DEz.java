package X;

import com.instagram.common.session.UserSession;
import com.instagram.schools.management.data.SchoolSettingsRepository;

/* renamed from: X.DEz  reason: case insensitive filesystem */
public final class C45919DEz implements 2Kw {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C45919DEz(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public final void invoke(Throwable th) {
        switch (this.A00) {
            case 0:
                C8294Qna qna = (C8294Qna) this.A01;
                qna.A00 = C11097S9y.A01((Throwable) ((AnonymousClass2hV) this.A02).apply(th));
                qna.A02(qna.A00);
                return;
            case 1:
                0wb.A06("attribution_sdk:GraphQLAttributionEventsClient", "GraphQL error for event reportAdid", th);
                ((C46214DQs) this.A01).DEd("GraphQL error for event reportAdid", th);
                return;
            case 2:
                ((C56079HsS) this.A02).A01(String.valueOf(th.getMessage()));
                19E.A04(String.valueOf(th.getMessage()), (C262224Cq) this.A01);
                return;
            case 3:
                0qQ.A0A(th);
                ((C66675Mai) this.A01).A01((UserSession) this.A02, th);
                return;
            default:
                ((C62320sa) this.A01).invoke();
                ((INA) ((SchoolSettingsRepository) this.A02).A02.getValue()).A07(AnonymousClass000.A00(3100));
                return;
        }
    }
}
