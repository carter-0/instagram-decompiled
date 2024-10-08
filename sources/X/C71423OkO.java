package X;

import android.view.View;
import com.instagram.model.direct.DirectShareTarget;
import java.util.ArrayList;

/* renamed from: X.OkO  reason: case insensitive filesystem */
public final class C71423OkO implements View.OnLongClickListener {
    public final /* synthetic */ C67058MhZ A00;
    public final /* synthetic */ C67283MlI A01;
    public final /* synthetic */ C74516PwB A02;
    public final /* synthetic */ OuA A03;
    public final /* synthetic */ P3T A04;
    public final /* synthetic */ C254743sy A05;

    public C71423OkO(C67058MhZ mhZ, C67283MlI mlI, C74516PwB pwB, OuA ouA, P3T p3t, C254743sy r6) {
        this.A04 = p3t;
        this.A05 = r6;
        this.A02 = pwB;
        this.A01 = mlI;
        this.A00 = mhZ;
        this.A03 = ouA;
    }

    public final boolean onLongClick(View view) {
        P3T p3t = this.A04;
        C254743sy r7 = this.A05;
        ArrayList A1C = AnonymousClass7TE.A1C();
        boolean CVr = this.A02.CVr();
        C67283MlI mlI = this.A01;
        p3t.DRf(0nA.A0F(mlI.A0O.A04), mlI.A07, this.A00, (DirectShareTarget) null, r7, "", A1C, CVr, this.A03.A07.CUG());
        return true;
    }
}
