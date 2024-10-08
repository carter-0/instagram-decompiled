package X;

import android.content.DialogInterface;

/* renamed from: X.Oeo  reason: case insensitive filesystem */
public final /* synthetic */ class C71174Oeo implements DialogInterface.OnCancelListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C74485Pvf A01;
    public final /* synthetic */ C74421Pub A02;
    public final /* synthetic */ C71011OYj A03;

    public /* synthetic */ C71174Oeo(C74485Pvf pvf, C74421Pub pub, C71011OYj oYj, int i) {
        this.A03 = oYj;
        this.A00 = i;
        this.A01 = pvf;
        this.A02 = pub;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        int i = this.A00;
        C74485Pvf pvf = this.A01;
        C74421Pub pub = this.A02;
        pvf.onCancel();
        pub.D0M(i);
    }
}
