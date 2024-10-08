package X;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: X.366  reason: invalid class name */
public final class AnonymousClass366 implements C252243on {
    public final C227812jx A00;
    public final AnonymousClass343 A01;
    public final C249383je A02 = new AnonymousClass367(this);

    public final /* synthetic */ void ADC(View view) {
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

    /* JADX WARNING: type inference failed for: r0v2, types: [X.36A, java.lang.Object] */
    public AnonymousClass366(C227812jx r4, C2355030c r5, AnonymousClass2rI r6, AnonymousClass35L r7) {
        this.A00 = r4;
        ArrayList arrayList = new ArrayList();
        arrayList.add(r7);
        arrayList.add(new AnonymousClass368(r5, r6));
        ? obj = new Object();
        obj.A00 = RecyclerView.class;
        arrayList.add(obj);
        C2355130d[] r1 = (C2355130d[]) arrayList.toArray(new C2355130d[0]);
        this.A01 = new AnonymousClass343((Adapter) r6, (AnonymousClass4DV) r4, (C2355130d[]) Arrays.copyOf(r1, r1.length));
    }
}
