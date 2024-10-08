package X;

import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;

/* renamed from: X.GZm  reason: case insensitive filesystem */
public final class C52613GZm {
    public Object A00;
    public boolean A01;
    public final C305176Gv A02;
    public final GZF A03;
    public final AnonymousClass5PZ A04;
    public final C289495dh A05;

    public C52613GZm(GZF gzf, float f, int i) {
        this.A03 = gzf;
        AnonymousClass0eM r0 = C284905Ot.A01;
        this.A05 = new ParcelableSnapshotMutableIntState(i);
        this.A04 = new ParcelableSnapshotMutableFloatState(f);
        this.A02 = new C305176Gv(i, 30, 100);
    }
}
