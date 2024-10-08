package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.IaT  reason: case insensitive filesystem */
public final class C57423IaT implements YAw {
    public final /* synthetic */ C275794rx A00;

    public final /* bridge */ /* synthetic */ Object AER(Object obj) {
        C275794rx r2 = this.A00;
        ViewGroup A0C = DbU.A0C(r2.A0G, R.id.content);
        View view = r2.A0I.A01;
        view.getClass();
        A0C.addView(view);
        return null;
    }

    public final /* bridge */ /* synthetic */ Object AES(Object obj) {
        DbU.A0G(this.A00.A0G, R.id.content).setText("");
        return null;
    }

    public final /* bridge */ /* synthetic */ Object AEo(Object obj) {
        View requireViewById = this.A00.A0G.requireViewById(R.id.content);
        TextView A0G = DbU.A0G(requireViewById, R.id.tooltip_bold_text);
        TextView A0G2 = DbU.A0G(requireViewById, R.id.tooltip_plain_text);
        A0G.setText("");
        A0G2.setText((CharSequence) null);
        return null;
    }

    public C57423IaT(C275794rx r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ Object AEk(Object obj) {
        return null;
    }

    public final /* bridge */ /* synthetic */ Object AEl(Object obj) {
        return null;
    }

    public final /* bridge */ /* synthetic */ Object AEm(Object obj) {
        return null;
    }

    public final /* bridge */ /* synthetic */ Object AEn(Object obj) {
        return null;
    }
}
