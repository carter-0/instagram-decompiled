package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;

/* renamed from: X.Udt  reason: case insensitive filesystem */
public final class C15504Udt extends C231632rz {
    public final Context A00;

    public final int getViewTypeCount() {
        return AnonymousClass05K.A00(2).length;
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r2, Object obj, Object obj2) {
        V38 v38 = (V38) obj;
        AnonymousClass7TG.A1N(r2, v38);
        r2.A7U(v38.A00.intValue());
    }

    public C15504Udt(Context context) {
        this.A00 = context;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        AnonymousClass0fD.A0A(97211782, AnonymousClass0fD.A03(-971280847));
    }

    public final View createView(int i, ViewGroup viewGroup) {
        LayoutInflater from;
        int i2;
        int A03 = AnonymousClass0fD.A03(1225349337);
        0qQ.A0B(viewGroup, 1);
        int A08 = C13989Tnp.A08(2, i);
        if (A08 == 1) {
            from = LayoutInflater.from(this.A00);
            i2 = R.layout.row_divider;
        } else if (A08 == 0) {
            from = LayoutInflater.from(this.A00);
            i2 = R.layout.row_divider_thick;
        } else {
            RuntimeException runtimeException = new RuntimeException();
            AnonymousClass0fD.A0A(-1135844003, A03);
            throw runtimeException;
        }
        View inflate = from.inflate(i2, viewGroup, false);
        AnonymousClass0fD.A0A(397229717, A03);
        return inflate;
    }
}
