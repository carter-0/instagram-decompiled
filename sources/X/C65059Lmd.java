package X;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* renamed from: X.Lmd  reason: case insensitive filesystem */
public abstract class C65059Lmd implements MXJ {
    public RecyclerView A00;
    public AnonymousClass8IM A01;

    public final /* synthetic */ void ADC(View view) {
    }

    public final void AJD() {
        this.A01 = null;
    }

    public final /* synthetic */ void Cyg() {
    }

    public final /* synthetic */ void D6z(View view) {
    }

    public final /* synthetic */ void onActivityResult(int i, int i2, Intent intent) {
    }

    public final /* synthetic */ void onConfigurationChanged(Configuration configuration) {
    }

    public final /* synthetic */ void onCreate() {
    }

    public final /* synthetic */ void onDestroy() {
    }

    public final /* synthetic */ void onDestroyView() {
    }

    public final /* synthetic */ void onPause() {
    }

    public final /* synthetic */ void onResume() {
    }

    public final /* synthetic */ void onSaveInstanceState(Bundle bundle) {
    }

    public final /* synthetic */ void onStart() {
    }

    public final /* synthetic */ void onStop() {
    }

    public final /* synthetic */ void onViewCreated(View view, Bundle bundle) {
    }

    public final /* synthetic */ void onViewStateRestored(Bundle bundle) {
    }

    public final RecyclerView A00() {
        RecyclerView recyclerView = this.A00;
        if (recyclerView != null) {
            return recyclerView;
        }
        0qQ.A0F("bottomSheetListView");
        throw AnonymousClass00P.createAndThrow();
    }

    public final List Bdz() {
        if (this instanceof C61776KLp) {
            return AnonymousClass7TE.A1I(C62562Khs.HALF);
        }
        return 0sr.A1P(new C62562Khs[]{C62562Khs.DEFAULT, C62562Khs.HALF, C62562Khs.FULL});
    }

    public final void AQD(float f) {
        A00().scrollBy(0, (int) f);
    }

    public final boolean CQZ() {
        return !A00().canScrollVertically(1);
    }

    public final boolean CQa() {
        return !JTP.A1Y(A00());
    }

    public final void DG2(float f, float f2) {
        A00().A1F(0, (int) f2);
    }

    public final void cancel() {
        C60382Jkb jkb;
        0sP r0;
        RecyclerView A002 = A00();
        boolean z = this instanceof C61775KLo;
        if (z) {
            jkb = ((C61775KLo) this).A02;
        } else {
            jkb = ((C61776KLp) this).A06;
        }
        A002.suppressLayout(false);
        RecyclerView.A0J(jkb, A002, true);
        A002.A19(true);
        A002.requestLayout();
        AnonymousClass8IM r1 = this.A01;
        if (r1 != null && !r1.CbS()) {
            if (z) {
                r0 = ((C61775KLo) this).A04;
            } else {
                r0 = ((C61776KLp) this).A08;
            }
            r0.invoke(r1);
        }
        this.A01 = null;
    }
}
