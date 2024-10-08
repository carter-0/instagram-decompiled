package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.9TY  reason: invalid class name */
public final class AnonymousClass9TY implements Runnable {
    public final /* synthetic */ AnonymousClass8L5 A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ ArrayList A02;
    public final /* synthetic */ ArrayList A03;
    public final /* synthetic */ ArrayList A04;
    public final /* synthetic */ ArrayList A05;
    public final /* synthetic */ AtomicBoolean A06;
    public final /* synthetic */ Integer[] A07;

    public AnonymousClass9TY(AnonymousClass8L5 r1, String str, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, AtomicBoolean atomicBoolean, Integer[] numArr) {
        this.A06 = atomicBoolean;
        this.A00 = r1;
        this.A03 = arrayList;
        this.A01 = str;
        this.A07 = numArr;
        this.A05 = arrayList2;
        this.A04 = arrayList3;
        this.A02 = arrayList4;
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [X.A7z, java.lang.Object] */
    public final void run() {
        if (!this.A06.get()) {
            AnonymousClass8L5 r10 = this.A00;
            ArrayList arrayList = this.A03;
            0qQ.A0B(arrayList, 0);
            int size = arrayList.size();
            float[] fArr = new float[size];
            int size2 = arrayList.size();
            for (int i = 0; i < size2; i++) {
                if (arrayList.get(i) == null) {
                    if (i > 0) {
                        fArr[i] = fArr[i - 1];
                    } else {
                        fArr[i] = 0.0f;
                    }
                }
                C39684A5a a5a = (C39684A5a) arrayList.get(i);
                if (a5a != null) {
                    fArr[i] = a5a.A00;
                }
            }
            float[] fArr2 = new float[size];
            double[] dArr = new double[201];
            int i2 = -100;
            int i3 = 0;
            do {
                dArr[i3] = Math.exp((-Math.pow((double) i2, 2.0d)) / (2.0d * Math.pow(15.0d, 2.0d))) / (15.0d * Math.sqrt(6.283185307179586d));
                i2++;
                i3++;
                if (i2 > 100 || i3 >= 201) {
                }
                dArr[i3] = Math.exp((-Math.pow((double) i2, 2.0d)) / (2.0d * Math.pow(15.0d, 2.0d))) / (15.0d * Math.sqrt(6.283185307179586d));
                i2++;
                i3++;
                break;
            } while (i3 >= 201);
            for (int i4 = 0; i4 < size; i4++) {
                float f = 0.0f;
                int i5 = i4 - 100;
                int i6 = i4 + 100;
                if (i5 <= i6) {
                    while (true) {
                        int i7 = i5;
                        while (true) {
                            if (i7 >= 0) {
                                if (i7 < size) {
                                    break;
                                }
                            } else {
                                i7 = -i7;
                            }
                            if (i7 >= size) {
                                i7 = ((size * 2) - i7) - 2;
                            }
                        }
                        f += (float) (((double) ((float) dArr[(i5 - i4) + 100])) * ((double) fArr[i7]));
                        if (i5 == i6) {
                            break;
                        }
                        i5++;
                    }
                }
                fArr2[i4] = f;
            }
            int size3 = arrayList.size();
            for (int i8 = 0; i8 < size3; i8++) {
                C39684A5a a5a2 = (C39684A5a) arrayList.get(i8);
                if (a5a2 != null) {
                    a5a2.A00 = fArr2[i8];
                }
            }
            String str = this.A01;
            Integer[] numArr = this.A07;
            int intValue = numArr[0].intValue();
            int intValue2 = numArr[1].intValue();
            ArrayList arrayList2 = this.A05;
            ArrayList arrayList3 = this.A04;
            ArrayList arrayList4 = this.A02;
            0qQ.A0B(str, 1);
            AnonymousClass7TG.A1R(arrayList2, arrayList3);
            0qQ.A0B(arrayList4, 6);
            ? obj = new Object();
            obj.A02 = str;
            obj.A01 = intValue;
            obj.A00 = intValue2;
            obj.A06 = arrayList2;
            obj.A05 = arrayList3;
            obj.A03 = arrayList4;
            obj.A04 = arrayList;
            AnonymousClass8LF.A00(r10.A02).A01(obj);
            Iterator A1G = AnonymousClass7TE.A1G(r10.A00);
            while (A1G.hasNext()) {
                AnonymousClass8LA r1 = (AnonymousClass8LA) AnonymousClass7TF.A0a(A1G);
                r1.DtD(100);
                r1.DtC();
            }
            r10.A04.remove(str);
            11Z.A02(new C40886Aku(r10));
        }
    }
}
