package X;

import java.util.HashMap;

/* renamed from: X.OSd  reason: case insensitive filesystem */
public abstract class C70930OSd {
    public final int A00;

    static {
        HashMap hashMap = AnonymousClass9EA.A03;
    }

    public C70930OSd(int i) {
        if (i == 16 || i == 32) {
            this.A00 = i;
            return;
        }
        throw new Exception(002.A0O("Unsupported key length: ", i));
    }
}
