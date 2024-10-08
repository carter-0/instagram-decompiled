package X;

import com.instagram.common.recyclerview.ViewModelListUpdate;
import kotlin.Deprecated;

/* renamed from: X.Mhv  reason: case insensitive filesystem */
public final class C67080Mhv implements C231272rL {
    public final AnonymousClass2t9 A00;
    public final 2B9 A01;

    public final void A00(ViewModelListUpdate viewModelListUpdate) {
        0qQ.A0B(viewModelListUpdate, 0);
        this.A00.A05(viewModelListUpdate);
        this.A01.A00 = viewModelListUpdate;
    }

    public final /* bridge */ /* synthetic */ Object getAdapter() {
        return this.A00;
    }

    public final int getCount() {
        return this.A00.getItemCount();
    }

    @Deprecated(message = "Getting an item by position leads to bad practices, since you rely on unsafe casting. Adapter could change type of internal items and your code will be broken.")
    public final Object getItem(int i) {
        return this.A00.A04(i);
    }

    public C67080Mhv(AnonymousClass2t9 r1, 2B9 r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
