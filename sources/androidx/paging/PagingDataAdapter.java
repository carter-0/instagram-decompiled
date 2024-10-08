package androidx.paging;

import X.002;
import X.018;
import X.0qQ;
import X.0sP;
import X.1Hj;
import X.2Rw;
import X.AnonymousClass0fD;
import X.AnonymousClass0r6;
import X.AnonymousClass12W;
import X.AnonymousClass4CZ;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.C16705V2i;
import X.C231372rZ;
import X.C231442rg;
import X.C252303ot;
import X.C51591Fwf;
import X.C56521Hzs;
import X.C60340gF;
import X.C62914KoS;
import X.C64332La7;
import X.GPB;
import X.JTO;
import X.LQS;
import X.LRX;
import X.MRP;
import X.MTH;
import X.UAY;
import X.Wv8;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import kotlin.Deprecated;

public abstract class PagingDataAdapter extends 2Rw {
    public boolean A00;
    public final AsyncPagingDataDiffer A01;
    public final AnonymousClass0r6 A02;
    public final AnonymousClass0r6 A03;

    public final void setStateRestorationPolicy(C231372rZ r2) {
        0qQ.A0B(r2, 0);
        this.A00 = true;
        PagingDataAdapter.super.setStateRestorationPolicy(r2);
    }

    @Deprecated(level = C16705V2i.HIDDEN, message = "Superseded by constructors which accept CoroutineContext")
    public /* synthetic */ PagingDataAdapter(C252303ot r4, AnonymousClass4CZ r5) {
        AnonymousClass4CZ r1 = AnonymousClass12W.A00;
        AsyncPagingDataDiffer asyncPagingDataDiffer = AsyncPagingDataDiffer.$redex_init_class;
        AsyncPagingDataDiffer asyncPagingDataDiffer2 = new AsyncPagingDataDiffer(r4, new C231442rg(this), r5, r1);
        this.A01 = asyncPagingDataDiffer2;
        PagingDataAdapter.super.setStateRestorationPolicy(C231372rZ.PREVENT);
        registerAdapterDataObserver(new UAY(this, 0));
        A06(new C51591Fwf(this));
        this.A02 = asyncPagingDataDiffer2.A07;
        this.A03 = asyncPagingDataDiffer2.A08;
    }

    public final Wv8 A01() {
        C64332La7 la7 = this.A01.A01.A01;
        int i = la7.A01;
        int i2 = la7.A00;
        List<LRX> list = la7.A03;
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (LRX lrx : list) {
            018.A16(lrx.A01, A1C);
        }
        return new Wv8(A1C, i, i2);
    }

    /* JADX INFO: finally extract failed */
    public final Object A02(int i) {
        Object obj;
        AsyncPagingDataDiffer asyncPagingDataDiffer = this.A01;
        try {
            asyncPagingDataDiffer.A00 = true;
            AsyncPagingDataDiffer$differBase$1 asyncPagingDataDiffer$differBase$1 = asyncPagingDataDiffer.A01;
            asyncPagingDataDiffer$differBase$1.A0C = true;
            asyncPagingDataDiffer$differBase$1.A0B = i;
            if (C62914KoS.A00 != null && JTO.A1b(2)) {
                0qQ.A0B(002.A0I("Accessing item index[", ']', i), 1);
            }
            MRP mrp = asyncPagingDataDiffer$differBase$1.A00;
            if (mrp != null) {
                mrp.A78(asyncPagingDataDiffer$differBase$1.A01.A02(i));
            }
            C64332La7 la7 = asyncPagingDataDiffer$differBase$1.A01;
            if (i < 0 || i >= la7.getSize()) {
                throw new IndexOutOfBoundsException(002.A02(i, la7.getSize(), "Index: ", ", Size: "));
            }
            int i2 = i - la7.A01;
            if (i2 < 0 || i2 >= la7.A02) {
                obj = null;
            } else {
                obj = la7.B8H(i2);
            }
            asyncPagingDataDiffer.A00 = false;
            return obj;
        } catch (Throwable th) {
            asyncPagingDataDiffer.A00 = false;
            throw th;
        }
    }

    public final Object A03(C56521Hzs hzs, AnonymousClass4D7 r7) {
        AsyncPagingDataDiffer asyncPagingDataDiffer = this.A01;
        asyncPagingDataDiffer.A05.incrementAndGet();
        AsyncPagingDataDiffer$differBase$1 asyncPagingDataDiffer$differBase$1 = asyncPagingDataDiffer.A01;
        Object A002 = asyncPagingDataDiffer$differBase$1.A06.A00(r7, new GPB(asyncPagingDataDiffer$differBase$1, hzs, (AnonymousClass4D7) null, 0));
        1Hj r0 = 1Hj.A02;
        if (A002 != r0) {
            A002 = C60340gF.A00;
        }
        if (A002 != r0) {
            A002 = C60340gF.A00;
        }
        if (A002 != r0) {
            return C60340gF.A00;
        }
        return A002;
    }

    public final void A04() {
        AsyncPagingDataDiffer$differBase$1 asyncPagingDataDiffer$differBase$1 = this.A01.A01;
        if (C62914KoS.A00 != null) {
            Log.isLoggable("Paging", 3);
        }
        MTH mth = asyncPagingDataDiffer$differBase$1.A02;
        if (mth != null) {
            mth.EB8();
        }
    }

    public final void A05() {
        AsyncPagingDataDiffer$differBase$1 asyncPagingDataDiffer$differBase$1 = this.A01.A01;
        if (C62914KoS.A00 != null) {
            Log.isLoggable("Paging", 3);
        }
        MTH mth = asyncPagingDataDiffer$differBase$1.A02;
        if (mth != null) {
            mth.EJE();
        }
    }

    public final void A06(0sP r3) {
        LQS lqs = this.A01.A01.A04;
        lqs.A00.add(r3);
        Object value = lqs.A01.getValue();
        if (value != null) {
            r3.invoke(value);
        }
    }

    public final void setHasStableIds(boolean z) {
        throw AnonymousClass7TE.A1B("Stable ids are unsupported on PagingDataAdapter.");
    }

    public int getItemCount() {
        int A032 = AnonymousClass0fD.A03(-931894484);
        int size = this.A01.A01.A01.getSize();
        AnonymousClass0fD.A0A(-1013771373, A032);
        return size;
    }

    public final long getItemId(int i) {
        int A032 = AnonymousClass0fD.A03(-1405007841);
        long itemId = PagingDataAdapter.super.getItemId(i);
        AnonymousClass0fD.A0A(-1251830307, A032);
        return itemId;
    }
}
