package X;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.app.AlertController$RecycleListView;

/* renamed from: X.WCg  reason: case insensitive filesystem */
public final class C18912WCg implements AdapterView.OnItemClickListener {
    public final /* synthetic */ C17742VdB A00;
    public final /* synthetic */ AlertController$RecycleListView A01;
    public final /* synthetic */ C18743VzO A02;

    public C18912WCg(C17742VdB vdB, AlertController$RecycleListView alertController$RecycleListView, C18743VzO vzO) {
        this.A00 = vdB;
        this.A01 = alertController$RecycleListView;
        this.A02 = vzO;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        C17742VdB vdB = this.A00;
        boolean[] zArr = vdB.A0K;
        if (zArr != null) {
            zArr[i] = this.A01.isItemChecked(i);
        }
        vdB.A07.onClick(this.A02.A0V, i, this.A01.isItemChecked(i));
    }
}
