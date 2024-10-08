package X;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.Tpv  reason: case insensitive filesystem */
public final class C14102Tpv implements C253183qL {
    public final C14537Txx A00;
    public final C14544Ty5 A01;

    /* JADX WARNING: type inference failed for: r1v3, types: [X.52T, X.52S, X.52V] */
    public final /* bridge */ /* synthetic */ Object ADM(Context context, Object obj, Object obj2, Object obj3) {
        C249393jf r0;
        RecyclerView recyclerView = (RecyclerView) obj;
        C14544Ty5 ty5 = this.A01;
        C14537Txx txx = this.A00;
        if (txx.A00 == 1) {
            r0 = txx.A01.A02.AgE().Bq8();
        } else {
            r0 = null;
        }
        ty5.A08 = r0;
        ty5.A07 = recyclerView;
        recyclerView.A15(ty5.A06);
        int i = ty5.A00;
        if (i != -1) {
            if (!ty5.A0A) {
                recyclerView.A0o(i);
            } else if (!ty5.A09.equals("")) {
                ? r1 = new AnonymousClass52S(context);
                r1.A00 = 0;
                r1.A03 = true;
                r1.A01 = 0;
                r1.A0F(ty5.A09);
                r1.A00 = ty5.A03;
                r1.A03 = ty5.A0C;
                r1.A00 = ty5.A00;
                C252553pI r02 = recyclerView.A0D;
                if (r02 != null) {
                    r02.A0t(r1);
                }
            } else {
                recyclerView.A0p(i);
            }
            ty5.A00 = -1;
            ty5.A0A = false;
            ty5.A09 = "";
            ty5.A03 = 0;
            ty5.A0C = true;
        }
        int i2 = ty5.A01;
        if (!(i2 == -1 && ty5.A02 == -1)) {
            boolean z = ty5.A0B;
            int i3 = ty5.A02;
            if (z) {
                recyclerView.A0u(i2, i3);
            } else {
                recyclerView.scrollBy(i2, i3);
            }
            ty5.A01 = -1;
            ty5.A02 = -1;
            ty5.A0B = false;
        }
        C249393jf r03 = ty5.A08;
        if (r03 == null) {
            return null;
        }
        recyclerView.A15(r03);
        return null;
    }

    public final /* bridge */ /* synthetic */ void FIN(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
        RecyclerView recyclerView = (RecyclerView) obj;
        C14544Ty5 ty5 = this.A01;
        RecyclerView recyclerView2 = ty5.A07;
        if (recyclerView2 != null) {
            recyclerView2.setImportantForAutofill(0);
        }
        ty5.A07 = null;
        recyclerView.A16(ty5.A06);
        C249393jf r0 = ty5.A08;
        if (r0 != null) {
            recyclerView.A16(r0);
        }
        ty5.A08 = null;
    }

    public C14102Tpv(C14537Txx txx, C14544Ty5 ty5) {
        this.A01 = ty5;
        this.A00 = txx;
    }

    public final /* synthetic */ Class CAe() {
        return getClass();
    }

    public final /* synthetic */ String getDescription() {
        return C13988Tno.A0d(this);
    }

    public final /* bridge */ /* synthetic */ boolean Ete(Object obj, Object obj2, Object obj3, Object obj4) {
        return true;
    }
}
