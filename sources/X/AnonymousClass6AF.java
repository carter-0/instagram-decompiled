package X;

/* renamed from: X.6AF  reason: invalid class name */
public class AnonymousClass6AF implements 2do {
    public int A00;
    public float[] A01;

    public final /* bridge */ /* synthetic */ Object CNj(float f, Object obj, Object obj2) {
        int i;
        int i2;
        float[] fArr;
        AnonymousClass6AF r8 = (AnonymousClass6AF) obj;
        AnonymousClass6AF r9 = (AnonymousClass6AF) obj2;
        int i3 = this.A00;
        if (i3 == r8.A00) {
            r9.A00 = i3;
            int i4 = 0;
            while (true) {
                i = this.A00;
                i2 = i;
                fArr = r9.A01;
                if (i4 >= i) {
                    break;
                }
                float f2 = r8.A01[i4];
                float f3 = this.A01[i4];
                fArr[i4] = ((f2 - f3) * f) + f3;
                i4++;
            }
            int length = fArr.length;
            if (length > i) {
                while (i < length) {
                    fArr[i] = fArr[i2 - 1];
                    i++;
                }
            }
            return r9;
        }
        throw new IllegalArgumentException("cannot interpolate between mismatched lengths");
    }
}
