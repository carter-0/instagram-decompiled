package X;

import com.instagram.opal.impl.data.OpalAudienceSelectorRepository;

/* renamed from: X.GqO  reason: case insensitive filesystem */
public final class C53553GqO extends AnonymousClass0T0 implements JOQ {
    public final OpalAudienceSelectorRepository.OpalAudience A00;

    public C53553GqO(OpalAudienceSelectorRepository.OpalAudience opalAudience) {
        0qQ.A0B(opalAudience, 1);
        this.A00 = opalAudience;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C53553GqO) && 0qQ.A0K(this.A00, ((C53553GqO) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String getId() {
        return this.A00.A01;
    }
}
