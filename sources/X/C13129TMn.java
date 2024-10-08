package X;

import java.util.ListIterator;

/* renamed from: X.TMn  reason: case insensitive filesystem */
public final class C13129TMn implements ListIterator, C62650uo {
    public int A00;
    public final int A01;
    public final int A02;
    public final /* synthetic */ AnonymousClass5T7 A03;

    public C13129TMn(AnonymousClass5T7 r1, int i, int i2, int i3) {
        this.A03 = r1;
        this.A00 = i;
        this.A02 = i2;
        this.A01 = i3;
    }

    public final boolean hasNext() {
        return AnonymousClass7TF.A1T(this.A00, this.A01);
    }

    public final boolean hasPrevious() {
        return C51970G9q.A1W(this.A00, this.A02);
    }

    public final /* bridge */ /* synthetic */ Object next() {
        Object[] objArr = this.A03.A04;
        int i = this.A00;
        this.A00 = i + 1;
        Object obj = objArr[i];
        0qQ.A0C(obj, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
        return obj;
    }

    public final int nextIndex() {
        return this.A00 - this.A02;
    }

    public final /* bridge */ /* synthetic */ Object previous() {
        Object[] objArr = this.A03.A04;
        int i = this.A00 - 1;
        this.A00 = i;
        Object obj = objArr[i];
        0qQ.A0C(obj, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
        return obj;
    }

    public final int previousIndex() {
        return (this.A00 - this.A02) - 1;
    }

    public final /* bridge */ /* synthetic */ void add(Object obj) {
        throw Pxh.A0s();
    }

    public final void remove() {
        throw Pxh.A0s();
    }

    public final /* bridge */ /* synthetic */ void set(Object obj) {
        throw Pxh.A0s();
    }
}
