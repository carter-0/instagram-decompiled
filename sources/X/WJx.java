package X;

import android.content.Context;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

public final class WJx implements C253183qL {
    public final /* bridge */ /* synthetic */ Object ADM(Context context, Object obj, Object obj2, Object obj3) {
        ViewGroup viewGroup = (ViewGroup) obj;
        C15168UTt uTt = (C15168UTt) obj2;
        AnonymousClass7TG.A1O(viewGroup, uTt);
        View childAt = viewGroup.getChildAt(1);
        0qQ.A0C(childAt, C273654mx.A00(4));
        RecyclerView recyclerView = (RecyclerView) childAt;
        recyclerView.setAdapter(uTt.A00);
        Parcelable parcelable = ((C19210WPq) C13988Tno.A0V(uTt.A01, uTt.A02)).A00;
        if (parcelable == null) {
            return null;
        }
        C252553pI r0 = recyclerView.A0D;
        if (r0 != null) {
            r0.A1P(parcelable);
            return null;
        }
        throw new IllegalStateException("LayoutManager for the RecyclerView was null by the time the SaveInstanceState binder was invoked");
    }

    public final /* bridge */ /* synthetic */ boolean Ete(Object obj, Object obj2, Object obj3, Object obj4) {
        C15168UTt uTt = (C15168UTt) obj;
        C15168UTt uTt2 = (C15168UTt) obj2;
        AnonymousClass7TG.A1N(uTt, uTt2);
        return C51966G9m.A1a(uTt.A00, uTt2.A00);
    }

    public final /* bridge */ /* synthetic */ void FIN(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
        ViewGroup viewGroup = (ViewGroup) obj;
        C15168UTt uTt = (C15168UTt) obj2;
        AnonymousClass7TG.A1O(viewGroup, uTt);
        View childAt = viewGroup.getChildAt(1);
        0qQ.A0C(childAt, C273654mx.A00(4));
        RecyclerView recyclerView = (RecyclerView) childAt;
        C252553pI r2 = recyclerView.A0D;
        if (r2 != null) {
            ((C19210WPq) C13988Tno.A0V(uTt.A01, uTt.A02)).A00 = r2.A1M();
            recyclerView.setAdapter((2Rw) null);
            return;
        }
        throw new IllegalStateException("LayoutManager for the RecyclerView was null by the time the SaveInstanceState binder was invoked");
    }

    public final /* synthetic */ Class CAe() {
        return getClass();
    }

    public final /* synthetic */ String getDescription() {
        return C13988Tno.A0d(this);
    }
}
