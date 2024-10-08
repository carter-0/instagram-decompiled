package X;

import java.util.List;

/* renamed from: X.Vz2  reason: case insensitive filesystem */
public final class C18727Vz2 {
    public final float[] A00;
    public final int[] A01;

    public C18727Vz2(int i, int i2, int i3) {
        this.A01 = new int[]{i, i2, i3};
        this.A00 = new float[]{0.0f, 0.5f, 1.0f};
    }

    public C18727Vz2(List list, List list2) {
        int size = list.size();
        this.A01 = new int[size];
        this.A00 = new float[size];
        for (int i = 0; i < size; i++) {
            this.A01[i] = C51971G9r.A0I(list, i);
            this.A00[i] = AnonymousClass7TG.A00(list2, i);
        }
    }

    public C18727Vz2(int i, int i2) {
        this.A01 = new int[]{i, i2};
        this.A00 = new float[]{0.0f, 1.0f};
    }
}
