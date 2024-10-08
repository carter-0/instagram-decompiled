package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;

public final class U44 extends ArrayAdapter {
    public final /* synthetic */ C17742VdB A00;
    public final /* synthetic */ AlertController$RecycleListView A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public U44(Context context, C17742VdB vdB, AlertController$RecycleListView alertController$RecycleListView, CharSequence[] charSequenceArr, int i) {
        super(context, i, 16908308, charSequenceArr);
        this.A00 = vdB;
        this.A01 = alertController$RecycleListView;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i, view, viewGroup);
        boolean[] zArr = this.A00.A0K;
        if (zArr != null && zArr[i]) {
            this.A01.setItemChecked(i, true);
        }
        return view2;
    }
}
