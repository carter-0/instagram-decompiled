package X;

import android.view.View;
import androidx.fragment.app.Fragment;

/* renamed from: X.FcS  reason: case insensitive filesystem */
public final class C50480FcS implements C367608rH {
    public final int A00;
    public final Object A01;

    public C50480FcS(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void onClick() {
        switch (this.A00) {
            case 0:
                Fragment fragment = (Fragment) this.A01;
                C48374EdV.A00(fragment.requireActivity(), new C51651FyD(fragment, 0));
                return;
            case 1:
                C47468E3r e3r = (C47468E3r) this.A01;
                e3r.A0E.putExtra(C273654mx.A00(2169), true);
                C47468E3r.A04(e3r);
                return;
            case 2:
                C47468E3r.A05((C47468E3r) this.A01, (String) null);
                return;
            default:
                ((C67293MlS) this.A01).A0A.onClick((View) null);
                return;
        }
    }
}
