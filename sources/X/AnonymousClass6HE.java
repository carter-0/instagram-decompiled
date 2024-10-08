package X;

import java.util.Arrays;
import java.util.ListIterator;

/* renamed from: X.6HE  reason: invalid class name */
public final class AnonymousClass6HE<E> extends AnonymousClass6HF<E> implements AnonymousClass6HH<E> {
    public static final AnonymousClass6HE A01 = new AnonymousClass6HE(new Object[0]);
    public final Object[] A00;

    public final int A08() {
        return this.A00.length;
    }

    public final C20583WvB AEq() {
        return new C20583WvB(this, (Object[]) null, this.A00, 0);
    }

    public final AnonymousClass6HG EDB(0sP r10) {
        Object[] objArr = this.A00;
        Object[] objArr2 = objArr;
        int size = size();
        int size2 = size();
        boolean z = false;
        for (int i = 0; i < size2; i++) {
            Object obj = objArr2[i];
            if (((Boolean) r10.invoke(obj)).booleanValue()) {
                if (!z) {
                    objArr = Arrays.copyOf(objArr2, objArr2.length);
                    0qQ.A07(objArr);
                    z = true;
                    size = i;
                }
            } else if (z) {
                objArr[size] = obj;
                size++;
            }
        }
        if (size == size()) {
            return this;
        }
        if (size == 0) {
            return A01;
        }
        return new AnonymousClass6HE(0Yw.A0Z(objArr, 0, size));
    }

    public final int indexOf(Object obj) {
        return 03t.A02(this.A00, obj);
    }

    public final int lastIndexOf(Object obj) {
        return 03t.A03(this.A00, obj);
    }

    public AnonymousClass6HE(Object[] objArr) {
        this.A00 = objArr;
    }

    public final AnonymousClass6HG A7O(Object obj) {
        if (size() < 32) {
            Object[] copyOf = Arrays.copyOf(this.A00, size() + 1);
            0qQ.A07(copyOf);
            copyOf[size()] = obj;
            return new AnonymousClass6HE(copyOf);
        }
        Object[] objArr = new Object[32];
        objArr[0] = obj;
        return new C14740U6e(this.A00, objArr, size() + 1, 0);
    }

    public final AnonymousClass6HG A7j(Object obj, int i) {
        C18664VwM.A01(i, size());
        if (i == size()) {
            return A7O(obj);
        }
        if (size() < 32) {
            Object[] objArr = new Object[(size() + 1)];
            Object[] objArr2 = this.A00;
            0Yw.A0V(objArr2, objArr, 0, 0, i);
            0Yw.A0V(objArr2, objArr, i + 1, i, size());
            objArr[i] = obj;
            return new AnonymousClass6HE(objArr);
        }
        Object[] objArr3 = this.A00;
        Object[] copyOf = Arrays.copyOf(objArr3, objArr3.length);
        0qQ.A07(copyOf);
        System.arraycopy(objArr3, i, copyOf, i + 1, (size() - 1) - i);
        copyOf[i] = obj;
        Object obj2 = objArr3[31];
        Object[] objArr4 = new Object[32];
        objArr4[0] = obj2;
        return new C14740U6e(copyOf, objArr4, size() + 1, 0);
    }

    public final AnonymousClass6HG EDL(int i) {
        C18664VwM.A00(i, size());
        if (size() == 1) {
            return A01;
        }
        Object[] objArr = this.A00;
        Object[] copyOf = Arrays.copyOf(objArr, size() - 1);
        0qQ.A07(copyOf);
        0Yw.A0V(objArr, copyOf, i, i + 1, size());
        return new AnonymousClass6HE(copyOf);
    }

    public final AnonymousClass6HG ENM(Object obj, int i) {
        C18664VwM.A00(i, size());
        Object[] objArr = this.A00;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        0qQ.A07(copyOf);
        copyOf[i] = obj;
        return new AnonymousClass6HE(copyOf);
    }

    public final Object get(int i) {
        C18664VwM.A00(i, size());
        return this.A00[i];
    }

    public final ListIterator listIterator(int i) {
        C18664VwM.A01(i, size());
        return new U6Z(this.A00, i, size());
    }
}
