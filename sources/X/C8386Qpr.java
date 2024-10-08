package X;

import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: X.Qpr  reason: case insensitive filesystem */
public final class C8386Qpr extends C3023963c {
    public final SparseArray A00 = Pxe.A0L();

    public final void A08(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        for (int i = 0; i < this.A00.size(); i++) {
            SxB A01 = A01(i);
            if (A01 != null) {
                printWriter.append(str).append("GoogleApiClient #").print(A01.A00);
                printWriter.println(":");
                A01.A02.A0E(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
            }
        }
    }

    public final void A09() {
        for (int i = 0; i < this.A00.size(); i++) {
            SxB A01 = A01(i);
            if (A01 != null) {
                A01.A02.A08();
            }
        }
    }

    public C8386Qpr(C13806ThV thV) {
        super(GoogleApiAvailability.A00, thV);
        this.A00.A7u(this, "AutoManageHelper");
    }

    private final SxB A01(int i) {
        SparseArray sparseArray = this.A00;
        if (sparseArray.size() <= i) {
            return null;
        }
        return (SxB) sparseArray.get(sparseArray.keyAt(i));
    }

    public final void A0A(ConnectionResult connectionResult, int i) {
        Log.w("AutoManageHelper", "Unresolved error while connecting client. Stopping auto-manage.");
        if (i < 0) {
            Log.wtf("AutoManageHelper", "AutoManageLifecycleHelper received onErrorResolutionFailed callback but no failing client ID is set", new Exception());
            return;
        }
        SparseArray sparseArray = this.A00;
        SxB sxB = (SxB) sparseArray.get(i);
        if (sxB != null) {
            SxB sxB2 = (SxB) sparseArray.get(i);
            sparseArray.remove(i);
            if (sxB2 != null) {
                AnonymousClass63S r5 = sxB2.A02;
                C11456SVu sVu = ((QpU) r5).A0B;
                synchronized (sVu.A03) {
                    if (!sVu.A06.remove(sxB2)) {
                        Pxf.A1L("unregisterConnectionFailedListener(): listener ", String.valueOf(sxB2), " not found", "GmsClientEvents");
                    }
                }
                r5.A09();
            }
            sxB.A01.D5m(connectionResult);
        }
    }

    public final void A06() {
        super.A06();
        SparseArray sparseArray = this.A00;
        String.valueOf(sparseArray);
        if (this.A01.get() == null) {
            for (int i = 0; i < sparseArray.size(); i++) {
                SxB A01 = A01(i);
                if (A01 != null) {
                    A01.A02.A08();
                }
            }
        }
    }

    public final void A07() {
        super.A07();
        for (int i = 0; i < this.A00.size(); i++) {
            SxB A01 = A01(i);
            if (A01 != null) {
                A01.A02.A09();
            }
        }
    }
}
