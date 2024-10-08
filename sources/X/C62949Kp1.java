package X;

import com.instagram.api.schemas.IGAIAgentType;

/* renamed from: X.Kp1  reason: case insensitive filesystem */
public abstract class C62949Kp1 {
    public final IGAIAgentType A00() {
        if (this instanceof K0Y) {
            return IGAIAgentType.A04;
        }
        if (!(this instanceof K0Z)) {
            throw AnonymousClass7TE.A1K();
        } else if (((K0Z) this).A01) {
            return IGAIAgentType.A05;
        } else {
            return IGAIAgentType.A08;
        }
    }

    public final String A01() {
        if (this instanceof K0Y) {
            return "";
        }
        if (this instanceof K0Z) {
            return ((K0Z) this).A00;
        }
        throw AnonymousClass7TE.A1K();
    }

    public final String A02() {
        if (this instanceof K0Y) {
            return ((K0Y) this).A00;
        }
        if (this instanceof K0Z) {
            return "";
        }
        throw AnonymousClass7TE.A1K();
    }

    public final String A03() {
        if (this instanceof K0Y) {
            return ((K0Y) this).A00;
        }
        if (this instanceof K0Z) {
            return ((K0Z) this).A00;
        }
        throw AnonymousClass7TE.A1K();
    }
}
