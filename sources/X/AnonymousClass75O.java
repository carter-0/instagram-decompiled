package X;

import com.instagram.model.direct.messageid.DirectMessageIdentifier;

/* renamed from: X.75O  reason: invalid class name */
public final class AnonymousClass75O extends C327997Da implements C3266277n {
    public final C3266277n A00;
    public final Class A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass75O(AnonymousClass7DR r2, C3266277n r3, AnonymousClass78H r4, Class cls) {
        super(r2, r4);
        0qQ.A0B(r4, 1);
        0qQ.A0B(r2, 2);
        this.A01 = cls;
        this.A00 = r3;
    }

    public final AnonymousClass758 CEa(DirectMessageIdentifier directMessageIdentifier) {
        C3266277n r0 = this.A00;
        if (r0 != null) {
            return r0.CEa(directMessageIdentifier);
        }
        return null;
    }

    public final Class modelClass() {
        return this.A01;
    }
}
