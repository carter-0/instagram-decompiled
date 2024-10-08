package X;

import com.instagram.model.direct.DirectMessageSearchMessage;
import com.instagram.model.direct.DirectMessageSearchThread;
import com.instagram.model.direct.DirectSearchResult;

public final class Ou5 implements C232262tL {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final DirectSearchResult A04;
    public final String A05;

    public Ou5(DirectSearchResult directSearchResult, int i, int i2, int i3, int i4) {
        String valueOf;
        StringBuilder A1A;
        String str;
        0qQ.A0B(directSearchResult, 1);
        this.A04 = directSearchResult;
        this.A00 = i;
        this.A01 = i2;
        this.A02 = i3;
        this.A03 = i4;
        if (directSearchResult instanceof DirectMessageSearchMessage) {
            A1A = AnonymousClass7TE.A1A();
            str = ((DirectMessageSearchMessage) directSearchResult).A07;
        } else if (directSearchResult instanceof DirectMessageSearchThread) {
            A1A = AnonymousClass7TE.A1A();
            DirectMessageSearchThread directMessageSearchThread = (DirectMessageSearchThread) directSearchResult;
            A1A.append(directMessageSearchThread.A08);
            str = directMessageSearchThread.A06;
        } else {
            valueOf = String.valueOf(directSearchResult.hashCode());
            this.A05 = valueOf;
        }
        A1A.append(str);
        A1A.append('_');
        A1A.append(directSearchResult.hashCode());
        valueOf = A1A.toString();
        this.A05 = valueOf;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A05;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        Ou5 ou5 = (Ou5) obj;
        0qQ.A0B(ou5, 0);
        return 0qQ.A0K(this.A04, ou5.A04);
    }
}
