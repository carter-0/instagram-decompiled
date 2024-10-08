package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.recyclerview.ViewModelListUpdate;
import java.util.ArrayList;

/* renamed from: X.2t8  reason: invalid class name */
public final class AnonymousClass2t8 extends C231632rz {
    public final Context A00;
    public final AnonymousClass2t9 A01;

    /* JADX WARNING: type inference failed for: r0v1, types: [X.2tF, java.lang.Object] */
    public AnonymousClass2t8(Context context) {
        0qQ.A0B(context, 1);
        this.A00 = context;
        AnonymousClass2tC A002 = AnonymousClass2t9.A00(context);
        A002.A01(new Object());
        AnonymousClass2t9 A003 = A002.A00();
        ViewModelListUpdate viewModelListUpdate = new ViewModelListUpdate();
        ArrayList arrayList = new ArrayList(4);
        int i = 0;
        do {
            arrayList.add(new AnonymousClass2tK(i));
            i++;
        } while (i < 4);
        viewModelListUpdate.A01(arrayList);
        A003.A05(viewModelListUpdate);
        this.A01 = A003;
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r2, Object obj, Object obj2) {
        0qQ.A0B(r2, 0);
        r2.A7U(0);
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        AnonymousClass0fD.A0A(559599985, AnonymousClass0fD.A03(1402471294));
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = AnonymousClass0fD.A03(1128162983);
        0qQ.A0B(viewGroup, 1);
        Context context = this.A00;
        View inflate = LayoutInflater.from(context).inflate(R.layout.clips_netego_shimmer_view, viewGroup, false);
        inflate.addOnAttachStateChangeListener(new LWh());
        View requireViewById = inflate.requireViewById(R.id.clips_items_view);
        0qQ.A07(requireViewById);
        RecyclerView recyclerView = (RecyclerView) requireViewById;
        recyclerView.setLayoutManager(new LinearLayoutManager(context, 0, false));
        recyclerView.setAdapter(this.A01);
        AnonymousClass0fD.A0A(-2108730986, A03);
        return inflate;
    }
}
