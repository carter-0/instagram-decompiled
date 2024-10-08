package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;

public final class FPV implements View.OnLongClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public FPV(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    /* JADX WARNING: type inference failed for: r0v9, types: [X.KH7, X.11X] */
    public final boolean onLongClick(View view) {
        switch (this.A00) {
            case 0:
                ((C355568Qm) this.A01).A07((C249703kE) this.A02);
                return false;
            case 1:
                C319156q8 r2 = (C319156q8) this.A02;
                FmF fmF = ((C49386Euo) this.A01).A00.A00;
                if (fmF == null) {
                    return true;
                }
                fmF.A01 = true;
                fmF.A00(r2);
                return true;
            case 2:
                int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
                Object obj = this.A01;
                0qQ.A0A(obj);
                1ES.A03(new KH7(3, obj, this.A02));
                return true;
            case 3:
                Context context = ((View) this.A01).getContext();
                AnonymousClass5Gt A0f = AnonymousClass7TG.A0f((Activity) context, context.getString(2131969204));
                A0f.A03((View) this.A02);
                A0f.A04 = new FdU(this, 2);
                DbU.A1T(A0f);
                return true;
            default:
                return false;
        }
    }
}
