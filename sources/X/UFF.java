package X;

public abstract class UFF extends V4N {
    public int A00;
    public int A01 = 0;
    public String A02;
    public C18728Vz3[] A03 = null;

    public UFF(UFF uff) {
        this.A02 = uff.A02;
        this.A00 = uff.A00;
        C18728Vz3[] vz3Arr = uff.A03;
        int length = vz3Arr.length;
        C18728Vz3[] vz3Arr2 = new C18728Vz3[length];
        for (int i = 0; i < length; i++) {
            vz3Arr2[i] = new C18728Vz3(vz3Arr[i]);
        }
        this.A03 = vz3Arr2;
    }

    public C18728Vz3[] getPathData() {
        return this.A03;
    }

    public String getPathName() {
        return this.A02;
    }

    public void setPathData(C18728Vz3[] vz3Arr) {
        int length;
        int length2;
        C18728Vz3[] vz3Arr2 = this.A03;
        if (!(vz3Arr2 == null || vz3Arr == null || (length = vz3Arr2.length) != (length2 = vz3Arr.length))) {
            int i = 0;
            while (i < length) {
                if (vz3Arr2[i].A00 == vz3Arr[i].A00 && vz3Arr2[i].A01.length == vz3Arr[i].A01.length) {
                    i++;
                }
            }
            for (int i2 = 0; i2 < length2; i2++) {
                vz3Arr2[i2].A00 = vz3Arr[i2].A00;
                for (int i3 = 0; i3 < vz3Arr[i2].A01.length; i3++) {
                    vz3Arr2[i2].A01[i3] = vz3Arr[i2].A01[i3];
                }
            }
            return;
        }
        int length3 = vz3Arr.length;
        C18728Vz3[] vz3Arr3 = new C18728Vz3[length3];
        for (int i4 = 0; i4 < length3; i4++) {
            vz3Arr3[i4] = new C18728Vz3(vz3Arr[i4]);
        }
        this.A03 = vz3Arr3;
    }

    public UFF() {
    }
}
