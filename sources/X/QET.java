package X;

import com.google.common.collect.ImmutableList;

public final class QET extends C232322tW {
    public final ImmutableList A00;
    public final ImmutableList A01;
    public final /* synthetic */ QEd A02;

    public QET(QEd qEd, ImmutableList immutableList, ImmutableList immutableList2) {
        this.A02 = qEd;
        this.A01 = immutableList;
        this.A00 = immutableList2;
    }

    public final int A02() {
        return this.A00.size();
    }

    public final int A03() {
        return this.A01.size();
    }

    public final boolean A04(int i, int i2) {
        return ((C11345SOd) this.A01.get(i)).A04((C11345SOd) this.A00.get(i2));
    }

    public final boolean A05(int i, int i2) {
        return AnonymousClass7TF.A1S(((C11345SOd) this.A01.get(i)).A00.A05, ((C11345SOd) this.A00.get(i2)).A00.A05);
    }
}
