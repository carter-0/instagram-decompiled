package X;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.WRi  reason: case insensitive filesystem */
public final class C19249WRi implements C61110lV {
    public final int A00;
    public final Object A01;

    public C19249WRi(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void onAppBackgrounded() {
        int A03;
        int i;
        switch (this.A00) {
            case 0:
                A03 = AnonymousClass0fD.A03(-936863195);
                C58900Bc r10 = ((C18447Vru) this.A01).A00;
                synchronized (r10) {
                    SparseArray sparseArray = r10.A01;
                    int size = sparseArray.size();
                    if (size != 0) {
                        List unmodifiableList = Collections.unmodifiableList(new ArrayList(r10.A05));
                        for (int i2 = 0; i2 < size; i2++) {
                            r10.A04.Ew5(new 0Ba(AnonymousClass05K.A00, (Throwable) sparseArray.valueAt(i2), unmodifiableList), "CameraLeakListener:LEFT_OPEN_IN_BACKGROUND");
                        }
                    }
                }
                i = -1718021212;
                break;
            case 1:
                A03 = AnonymousClass0fD.A03(-627223570);
                C18806W2y.A02(((C15381Ube) this.A01).A0c, AnonymousClass000.A00(249));
                i = 1815338893;
                break;
            default:
                A03 = AnonymousClass0fD.A03(-1807636899);
                i = 667500561;
                break;
        }
        AnonymousClass0fD.A0A(i, A03);
    }

    public final void onAppForegrounded() {
        int A03;
        int i;
        switch (this.A00) {
            case 0:
                A03 = AnonymousClass0fD.A03(2013870803);
                i = -1143644945;
                break;
            case 1:
                A03 = AnonymousClass0fD.A03(1447904703);
                i = -201750687;
                break;
            default:
                A03 = AnonymousClass0fD.A03(1576049527);
                ((X2j) this.A01).onComplete();
                i = -1835746686;
                break;
        }
        AnonymousClass0fD.A0A(i, A03);
    }
}
