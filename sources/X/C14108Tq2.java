package X;

import android.content.Context;

/* renamed from: X.Tq2  reason: case insensitive filesystem */
public final class C14108Tq2 implements C253183qL {
    public final /* bridge */ /* synthetic */ boolean Ete(Object obj, Object obj2, Object obj3, Object obj4) {
        if (obj3 == null || obj4 == null) {
            return false;
        }
        C14539Txz txz = (C14539Txz) obj3;
        C14539Txz txz2 = (C14539Txz) obj4;
        return (txz.A01 == txz2.A01 && txz.A00 == txz2.A00 && txz.A02.equals(txz2.A02)) ? false : true;
    }

    public final /* bridge */ /* synthetic */ Object ADM(Context context, Object obj, Object obj2, Object obj3) {
        C14100Tpt tpt = (C14100Tpt) obj2;
        if (obj3 != null) {
            tpt.A0D.A00((C14539Txz) obj3);
            return null;
        }
        throw new IllegalStateException("List data was not computed during layout");
    }

    public final /* synthetic */ Class CAe() {
        return getClass();
    }

    public final /* synthetic */ String getDescription() {
        return C13988Tno.A0d(this);
    }

    public final /* bridge */ /* synthetic */ void FIN(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
    }
}
