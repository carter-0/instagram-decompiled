package X;

/* renamed from: X.Ic5  reason: case insensitive filesystem */
public final class C57517Ic5 implements JQQ {
    public final /* synthetic */ AnonymousClass5WP A00;

    public C57517Ic5(AnonymousClass5WP r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ C254253sB B3L() {
        Integer num;
        AnonymousClass5WP r7 = this.A00;
        C254523sc A002 = HX7.A00(r7.A00, r7.A01, (0wc) r7.A07.getValue(), r7.A03, r7.A04);
        if (A002 == null) {
            return null;
        }
        C56509Hzf hzf = (C56509Hzf) r7.A06.getValue();
        String A0R = 002.A0R("comment_list_prefix", r7.A00.A00);
        0qQ.A0B(A0R, 0);
        C229312nB r2 = hzf.A01;
        if (!r2.A00.A0F(A0R)) {
            r2.A02(A0R);
            num = AnonymousClass05K.A00;
        } else if (r2.A03(A0R, hzf.A00)) {
            r2.A02(A0R);
            num = AnonymousClass05K.A01;
        } else {
            num = AnonymousClass05K.A0C;
        }
        0qQ.A0B(num, 0);
        A002.A2t = num;
        return new C254563sg(A002);
    }

    public final /* synthetic */ C254253sB B3M() {
        return null;
    }

    public final /* synthetic */ C254253sB BqR() {
        return null;
    }
}
