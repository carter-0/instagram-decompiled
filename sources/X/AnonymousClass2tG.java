package X;

import com.instagram.common.recyclerview.ViewModelListUpdate;
import java.util.List;

/* renamed from: X.2tG  reason: invalid class name */
public final class AnonymousClass2tG implements AnonymousClass2tH {
    public C231452rh A00 = new Object();
    public List A01 = 0sn.A00;

    public final void EcF(C231452rh r2) {
        0qQ.A0B(r2, 0);
        this.A00 = r2;
    }

    public final void Eyp(ViewModelListUpdate viewModelListUpdate, AnonymousClass2tB r5) {
        0qQ.A0B(viewModelListUpdate, 0);
        0qQ.A0B(r5, 1);
        11Z.A06("This operation must be run on UI thread.");
        List A0a = 00k.A0a(viewModelListUpdate.A00);
        List list = this.A01;
        this.A01 = 00k.A0a(A0a);
        C232332tX.A00(new AnonymousClass2tV(list, A0a)).A02(this.A00);
        r5.DvY();
    }

    public final List Au8() {
        return this.A01;
    }
}
