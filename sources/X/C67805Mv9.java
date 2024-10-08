package X;

import android.view.ViewGroup;
import com.facebook.cameracore.instagram.ardelivery.networkconsentmanager.IgNetworkConsentStorage;
import com.instagram.android.R;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.Mv9  reason: case insensitive filesystem */
public final class C67805Mv9 extends 2Rw {
    public int A00;
    public int A01;
    public final Set A02 = AnonymousClass7TE.A1F();

    public final /* bridge */ /* synthetic */ C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C68043MzA(DbT.A0D(DbX.A0E(viewGroup), viewGroup, R.layout.equalizer_bar_item, false));
    }

    public final void A00(List list, int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
        Set set = this.A02;
        set.clear();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int A0F = AnonymousClass7TG.A0F(it);
                int i3 = i2 / 15;
                int i4 = IgNetworkConsentStorage.MAX_ENTRIES;
                if (1000 < i3) {
                    i4 = i3;
                }
                set.add(Integer.valueOf(A0F / i4));
            }
        }
        notifyDataSetChanged();
    }

    public final /* bridge */ /* synthetic */ void onBindViewHolder(C249703kE r5, int i) {
        C68043MzA mzA = (C68043MzA) r5;
        0qQ.A0B(mzA, 0);
        boolean contains = this.A02.contains(Integer.valueOf(i));
        C67645MrY mrY = mzA.A00;
        float f = 0.3f;
        if (i % 2 == 0) {
            f = 0.54f;
        }
        if (mrY.A00 != f) {
            mrY.A00 = f;
            C67645MrY.A00(mrY);
        }
        if (mrY.A02 != contains) {
            mrY.A02 = contains;
            C67645MrY.A00(mrY);
        }
        if (mzA.itemView.isLaidOut()) {
            mzA.A00();
        } else {
            0nA.A0q(JTO.A0F(mzA), new C73100PWh(mzA));
        }
    }

    public final int getItemCount() {
        int i;
        int A03 = AnonymousClass0fD.A03(-736866976);
        int i2 = this.A01;
        int i3 = this.A00;
        if (i2 > 0) {
            int i4 = i3 / 15;
            int i5 = IgNetworkConsentStorage.MAX_ENTRIES;
            if (1000 < i4) {
                i5 = i4;
            }
            i = (i2 / i5) + 1;
        } else {
            i = 0;
        }
        AnonymousClass0fD.A0A(1104334087, A03);
        return i;
    }
}
