package X;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import java.util.List;

public final class WEC implements AnonymousClass2gO {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public WEC(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj;
        this.A01 = obj2;
    }

    public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
        String str;
        int i;
        switch (this.A00) {
            case 0:
                ((View) this.A02).setVisibility(DbW.A01(((Boolean) obj).booleanValue() ? 1 : 0));
                return;
            case 1:
                C61082JwK jwK = (C61082JwK) obj;
                0qQ.A0B(jwK, 0);
                if (jwK.A01) {
                    FBP.A00((C49331Etm) this.A01, (FBP) this.A02, (List) jwK.A00);
                    return;
                }
                return;
            case 2:
                VT2 vt2 = (VT2) obj;
                if (vt2.A01) {
                    AnonymousClass6ST r2 = (AnonymousClass6ST) this.A02;
                    if (!r2.isShowing()) {
                        AnonymousClass0fN.A00(r2);
                    }
                    Integer num = vt2.A00;
                    if (num != null) {
                        str = ((Context) this.A01).getString(num.intValue());
                    } else {
                        str = "";
                    }
                    r2.A00(str);
                    return;
                }
                ((Dialog) this.A02).dismiss();
                return;
            case 3:
                UKV ukv = (UKV) obj;
                0qQ.A0B(ukv, 0);
                if (!ukv.A05) {
                    C18012Vjo vjo = ((C15401Uc7) this.A02).A06;
                    if (vjo == null) {
                        DbS.A13();
                        throw AnonymousClass00P.createAndThrow();
                    }
                    C14200Trf trf = (C14200Trf) vjo.A02.getValue();
                    if (ukv.A04) {
                        i = ukv.A01;
                    } else {
                        i = trf.A02;
                    }
                    trf.A00 = i;
                    trf.A03.Dhi(ukv);
                    return;
                }
                ((2Fk) this.A01).A05((Fragment) this.A02);
                return;
            default:
                List list = (List) obj;
                Bundle bundle = (Bundle) this.A02;
                if (bundle != null) {
                    0qQ.A0A(list);
                    bundle.putStringArrayList(AnonymousClass000.A00(641), FBZ.A00(list));
                    return;
                }
                return;
        }
    }
}
