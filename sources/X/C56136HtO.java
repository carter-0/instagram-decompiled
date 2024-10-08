package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.HtO  reason: case insensitive filesystem */
public final class C56136HtO {
    public final int A00;
    public final IIN A01;
    public final IIO A02;
    public final List A03;
    public volatile 2T4 A04 = null;
    public volatile C244843bq A05 = null;
    public volatile AnonymousClass3XI A06;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C56136HtO) {
                C56136HtO htO = (C56136HtO) obj;
                if (this.A00 != htO.A00 || !0qQ.A0K(this.A06, htO.A06) || !0qQ.A0K(this.A05, htO.A05) || !0qQ.A0K(this.A04, htO.A04) || !0qQ.A0K(this.A03, htO.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [X.IIO, java.lang.Object] */
    public /* synthetic */ C56136HtO(AnonymousClass3XI r4) {
        int andIncrement = AnonymousClass3XH.A06.getAndIncrement();
        ArrayList A1C = AnonymousClass7TE.A1C();
        this.A00 = andIncrement;
        this.A06 = r4;
        this.A03 = A1C;
        this.A02 = new Object();
        this.A01 = new IIN();
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int i = this.A00 * 31;
        int i2 = 0;
        if (this.A06 == null) {
            hashCode = 0;
        } else {
            hashCode = this.A06.hashCode();
        }
        int i3 = (i + hashCode) * 31;
        if (this.A05 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = this.A05.hashCode();
        }
        int i4 = (i3 + hashCode2) * 31;
        if (this.A04 != null) {
            i2 = this.A04.hashCode();
        }
        return AnonymousClass7TE.A0N(this.A03, (i4 + i2) * 31);
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("NestedLithoTreeState(id=");
        A1A.append(this.A00);
        A1A.append(", currentState=");
        A1A.append(this.A06);
        A1A.append(", currentResolveResult=");
        A1A.append(this.A05);
        A1A.append(AnonymousClass000.A00(2008));
        A1A.append(this.A04);
        A1A.append(", pendingStateUpdates=");
        return AnonymousClass7TG.A0n(this.A03, A1A);
    }
}
