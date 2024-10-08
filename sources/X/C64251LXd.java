package X;

import android.view.View;

/* renamed from: X.LXd  reason: case insensitive filesystem */
public final class C64251LXd implements View.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;
    public final String A04;

    public C64251LXd(Object obj, Object obj2, String str, String str2, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
        this.A04 = str;
        this.A03 = str2;
    }

    public final void onClick(View view) {
        int A05;
        int i;
        if (this.A00 != 0) {
            A05 = AnonymousClass0fD.A05(1876710462);
            int i2 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
            ((KVK) this.A02).A05.Dt5((C66569MWx) this.A01, (Integer) null, this.A03, this.A04);
            i = -1226818080;
        } else {
            A05 = AnonymousClass0fD.A05(220441908);
            Number number = (Number) this.A01;
            if (number != null) {
                C60405Jky jky = (C60405Jky) this.A02;
                C59888JbD.A01(jky.A00, new KPX(this.A04, this.A03, jky.A01, number.floatValue()));
            }
            i = -1439727568;
        }
        AnonymousClass0fD.A0C(i, A05);
    }
}
