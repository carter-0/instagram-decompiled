package X;

import android.view.LayoutInflater;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: X.2tC  reason: invalid class name */
public final class AnonymousClass2tC {
    public View.OnLongClickListener A00 = null;
    public AnonymousClass4AI A01;
    public C232292tQ A02;
    public C232302tS A03;
    public C232312tT A04 = null;
    public AnonymousClass2tR A05;
    public Object A06;
    public Map A07 = null;
    public boolean A08 = false;
    public boolean A09 = false;
    public boolean A0A;
    public final LayoutInflater A0B;
    public final List A0C = new ArrayList();

    public final AnonymousClass2t9 A00() {
        AnonymousClass2tH r8;
        C232252tJ r6;
        if (this.A08) {
            Executor executor = C362388ho.A05;
            C61480nO A002 = 0nY.A00();
            0qQ.A07(A002);
            r8 = new C362388ho(A002, executor);
        } else if (this.A09) {
            r8 = new C67005Mgd(0nY.A00(), C67005Mgd.A02);
        } else {
            r8 = new AnonymousClass2tG();
        }
        Map map = this.A07;
        if (map != null) {
            r6 = new C232252tJ(map);
        } else {
            r6 = new C232252tJ(this.A0C);
        }
        LayoutInflater layoutInflater = this.A0B;
        boolean z = this.A0A;
        C232292tQ r4 = this.A02;
        AnonymousClass2tR r9 = this.A05;
        Object obj = this.A06;
        C232302tS r5 = this.A03;
        return new AnonymousClass2t9(layoutInflater, this.A00, this.A01, r4, r5, r6, this.A04, r8, r9, obj, z);
    }

    public final void A01(C232232tF r2) {
        this.A0C.add(r2);
    }

    public AnonymousClass2tC(LayoutInflater layoutInflater) {
        this.A0B = layoutInflater;
    }
}
