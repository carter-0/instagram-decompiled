package X;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

public final class MCy<T> extends AbstractList<T> implements MPZ<Object>, C22558YAp<T> {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public boolean A05;
    public final List A06;

    public final Object B8H(int i) {
        List list = this.A06;
        int size = list.size();
        int i2 = 0;
        while (i2 < size) {
            int size2 = ((C60347Jjs) list.get(i2)).A04.size();
            if (size2 > i) {
                break;
            }
            i -= size2;
            i2++;
        }
        return ((C60347Jjs) list.get(i2)).A04.get(i);
    }

    public final int Bcq() {
        return this.A01;
    }

    public final int Bcr() {
        return this.A02;
    }

    public final int Bzs() {
        return this.A04;
    }

    public final Object get(int i) {
        int i2 = i - this.A02;
        if (i < 0 || i >= size()) {
            throw new IndexOutOfBoundsException(002.A02(i, size(), "Index: ", ", Size: "));
        } else if (i2 < 0 || i2 >= this.A04) {
            return null;
        } else {
            return B8H(i2);
        }
    }

    public final int getSize() {
        return this.A02 + this.A04 + this.A01;
    }

    public MCy(MCy mCy) {
        ArrayList A1C = AnonymousClass7TE.A1C();
        this.A06 = A1C;
        this.A05 = true;
        A1C.addAll(mCy.A06);
        this.A02 = mCy.A02;
        this.A01 = mCy.A01;
        this.A03 = mCy.A03;
        this.A05 = mCy.A05;
        this.A04 = mCy.A04;
        this.A00 = mCy.A00;
    }

    public final /* bridge */ Object remove(int i) {
        return super.remove(i);
    }

    public final /* bridge */ int size() {
        return getSize();
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("leading ");
        A1A.append(this.A02);
        A1A.append(", storage ");
        A1A.append(this.A04);
        A1A.append(", trailing ");
        A1A.append(this.A01);
        A1A.append(' ');
        return AnonymousClass7TF.A0l(DbT.A0z(" ", this.A06, (0sP) null), A1A);
    }

    public MCy() {
        this.A06 = AnonymousClass7TE.A1C();
        this.A05 = true;
    }
}
