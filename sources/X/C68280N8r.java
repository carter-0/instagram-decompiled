package X;

import java.util.List;
import java.util.Set;

/* renamed from: X.N8r  reason: case insensitive filesystem */
public final class C68280N8r extends AnonymousClass0T0 implements JM9 {
    public final O93 A00;
    public final C53367Gmr A01;
    public final List A02;
    public final Set A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C68280N8r) {
                C68280N8r n8r = (C68280N8r) obj;
                if (!0qQ.A0K(this.A03, n8r.A03) || !0qQ.A0K(this.A02, n8r.A02) || !0qQ.A0K(this.A01, n8r.A01) || !0qQ.A0K(this.A00, n8r.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A00, AnonymousClass7TF.A07(this.A01, AnonymousClass7TF.A07(this.A02, AnonymousClass7TE.A0K(this.A03))));
    }

    public C68280N8r(O93 o93, C53367Gmr gmr, List list, Set set) {
        this.A03 = set;
        this.A02 = list;
        this.A01 = gmr;
        this.A00 = o93;
    }

    public static final C68280N8r A00(O93 o93, C53367Gmr gmr, List list, Set set) {
        C51974G9v.A1O(set, list, gmr, o93);
        return new C68280N8r(o93, gmr, list, set);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C68280N8r() {
        /*
            r23 = this;
            r6 = 0
            X.0sl r2 = X.0sl.A00
            X.0sn r1 = X.0sn.A00
            r8 = 1
            r7 = 0
            com.instagram.direct.inbox.notes.models.NoteAudience r5 = com.instagram.direct.inbox.notes.models.NoteAudience.MUTUAL_FOLLOWERS
            X.Gmr r4 = new X.Gmr
            r9 = r7
            r10 = r7
            r11 = r8
            r12 = r7
            r13 = r7
            r14 = r8
            r15 = r7
            r16 = r7
            r17 = r7
            r18 = r8
            r19 = r7
            r20 = r8
            r21 = r7
            r22 = r7
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            X.NdI r0 = X.C69031NdI.A00
            r3 = r23
            r3.<init>(r0, r4, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C68280N8r.<init>():void");
    }
}
