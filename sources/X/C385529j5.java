package X;

import java.util.Map;

/* renamed from: X.9j5  reason: invalid class name and case insensitive filesystem */
public final class C385529j5 extends C360018dr {
    public final C46620Di0 A00;
    public final Map A01;
    public final C361118fh A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C385529j5(C46620Di0 di0, C361118fh r3, Map map) {
        super(r3);
        0qQ.A0B(map, 2);
        this.A00 = di0;
        this.A01 = map;
        this.A02 = r3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C385529j5) {
                C385529j5 r5 = (C385529j5) obj;
                if (!0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A02, AnonymousClass7TF.A07(this.A01, AnonymousClass7TE.A0K(this.A00)));
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("SuccessWithAction(action=");
        A1A.append(this.A00);
        A1A.append(", externalVariables=");
        A1A.append(this.A01);
        A1A.append(", fetchSummaryData=");
        return AnonymousClass7TG.A0n(this.A02, A1A);
    }
}
