package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.google.common.collect.ImmutableList;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.FQu  reason: case insensitive filesystem */
public final class C50137FQu implements AnonymousClass2gO {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public C50137FQu(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        this.A00 = i;
        this.A01 = obj4;
        this.A04 = obj;
        this.A03 = obj3;
        this.A02 = obj2;
    }

    public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
        Bundle bundle;
        if (this.A00 != 0) {
            List list = (List) obj;
            E1D e1d = (E1D) this.A01;
            if (e1d.A01 != null && (bundle = (Bundle) this.A04) != null) {
                bundle.putStringArrayList(AnonymousClass000.A00(641), FBZ.A00(list));
                ((C3021461u) this.A03).setPrimaryActionOnClickListener(new FPH(60, (Object) e1d, (Object) bundle, this.A02));
                return;
            }
            return;
        }
        C49507Ewm ewm = (C49507Ewm) obj;
        if (ewm == null) {
            return;
        }
        if (ewm.A01 || ((Fragment) this.A04).isResumed()) {
            C47532E6t e6t = (C47532E6t) this.A04;
            ImmutableList immutableList = C47532E6t.A02;
            C319866rM r5 = e6t.A00;
            if (r5 != null) {
                User user = ewm.A00;
                E96 e96 = new E96(e6t.getSession(), r5, user, (List) this.A01, (List) this.A03);
                ((RecyclerView) this.A02).setAdapter(e96);
                for (Object addModel : e96.A01) {
                    e96.addModel(addModel, e96.A00);
                }
                for (Object addModel2 : e96.A02) {
                    e96.addModel(addModel2, e96.A00);
                }
                e96.notifyDataSetChanged();
            }
        }
    }
}
