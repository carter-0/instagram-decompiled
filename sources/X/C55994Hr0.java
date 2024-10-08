package X;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Hr0  reason: case insensitive filesystem */
public final class C55994Hr0 {
    public long A00 = 0;
    public long A01 = 0;
    public boolean A02 = false;
    public final SparseArray A03;
    public final C61076JwE A04;
    public final List A05;
    public final List A06;

    public /* synthetic */ C55994Hr0(C61076JwE jwE, List list) {
        SparseArray sparseArray = new SparseArray();
        ArrayList A1C = AnonymousClass7TE.A1C();
        this.A04 = jwE;
        this.A06 = list;
        this.A03 = sparseArray;
        this.A05 = A1C;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("SurfaceState(surfaceRegistration=");
        A1A.append(this.A04);
        A1A.append("\n, supportedRules=");
        A1A.append(this.A06);
        A1A.append("\n, visitedItems=");
        A1A.append(this.A03);
        A1A.append("\n, allSurfacesVisitedWhileInBackground=");
        A1A.append(this.A05);
        A1A.append("\n, isInForeground=");
        A1A.append(this.A02);
        A1A.append("\n, totalTimeSpentMillis=");
        A1A.append(this.A01);
        A1A.append("\n, lastForegroundTimeMillis=");
        A1A.append(this.A00);
        return AnonymousClass7TG.A0p(A1A);
    }
}
