package X;

/* renamed from: X.P3w  reason: case insensitive filesystem */
public final class C72383P3w implements C74323Psz {
    public final /* synthetic */ C68467NJf A00;

    public C72383P3w(C68467NJf nJf) {
        this.A00 = nJf;
    }

    public final void DIb(double d, long j) {
        String str;
        C68467NJf nJf = this.A00;
        C3018760k A0S = C66582MXn.A0S(nJf.A0j);
        if (AnonymousClass7TF.A1Z(nJf.A0g)) {
            str = "ig_friend_map";
        } else {
            str = "note_quick_reply_sheet";
        }
        Long l = nJf.A0Z;
        Long l2 = null;
        if (l != null) {
            long longValue = l.longValue();
            C71126OdL odL = nJf.A0Q;
            if (odL == null) {
                0qQ.A0F("notesReplyComposerBarController");
                throw AnonymousClass00P.createAndThrow();
            }
            Long l3 = odL.A0E;
            if (l3 != null) {
                l2 = Long.valueOf(l3.longValue() - longValue);
            }
        }
        A0S.A0Q(l2, str, d, j, nJf.A0b);
    }
}
