package X;

import com.instagram.model.direct.DirectShareTarget;

public final class IOQ implements C232262tL {
    public final DirectShareTarget A00;

    public IOQ(DirectShareTarget directShareTarget) {
        0qQ.A0B(directShareTarget, 1);
        this.A00 = directShareTarget;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        String A09 = this.A00.A09();
        0qQ.A07(A09);
        return A09;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        String str;
        IOQ ioq = (IOQ) obj;
        String A09 = this.A00.A09();
        0qQ.A07(A09);
        if (ioq != null) {
            str = ioq.A00.A09();
            0qQ.A07(str);
        } else {
            str = null;
        }
        return A09.equals(str);
    }
}
