package X;

import android.content.res.Resources;
import android.view.View;
import androidx.fragment.app.Fragment;

public final /* synthetic */ class FSF implements AnonymousClass2Kv {
    public final /* synthetic */ View A00;
    public final /* synthetic */ Fragment A01;

    public /* synthetic */ FSF(View view, Fragment fragment) {
        this.A01 = fragment;
        this.A00 = view;
    }

    public final void invoke(AnonymousClass3JD r9) {
        Fragment fragment = this.A01;
        View view = this.A00;
        Object Bny = r9.Bny();
        if (Bny != null) {
            C250663lr r5 = (C250663lr) Bny;
            Class<C43126BtC> cls = C43126BtC.class;
            String A002 = AnonymousClass000.A00(4270);
            if (r5.getOptionalTreeField(0, A002, cls, -164551825) != null) {
                String optionalStringField = r5.getOptionalTreeField(0, A002, cls, -164551825).getOptionalStringField(0, AnonymousClass000.A00(4220));
                if (optionalStringField == null || optionalStringField.isEmpty()) {
                    C310336ap A0a = DbS.A0a();
                    Resources resources = view.getResources();
                    DbT.A1D(resources, A0a, 2131976861);
                    A0a.A0I = resources.getString(2131976860);
                    DbY.A1N(A0a);
                    return;
                }
                FH7.A03(fragment.requireActivity(), optionalStringField);
            }
        }
    }
}
