package X;

import androidx.paging.PagingDataAdapter;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.common.ui.widget.recyclerview.RefreshableRecyclerViewLayout;
import com.instagram.shopping.widget.pdp.herocarousel.HeroCarouselScrollbarView;

public final class UAY extends C231402rc {
    public final int A00;
    public final Object A01;

    public UAY(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(UAY uay) {
        HeroCarouselScrollbarView heroCarouselScrollbarView = (HeroCarouselScrollbarView) uay.A01;
        heroCarouselScrollbarView.post(new C20082Wkg(heroCarouselScrollbarView));
    }

    public final void onChanged() {
        switch (this.A00) {
            case 1:
                C17549Va2 va2 = (C17549Va2) this.A01;
                va2.A00 = va2.A03.getItemCount();
                WEU weu = (WEU) va2.A02;
                weu.A03.notifyDataSetChanged();
                WEU.A02(weu);
                return;
            case 2:
                ((C14220Ts0) this.A01).A00(true);
                return;
            case 4:
                RefreshableRecyclerViewLayout refreshableRecyclerViewLayout = (RefreshableRecyclerViewLayout) this.A01;
                if (!refreshableRecyclerViewLayout.A0R.A0E(0.0d)) {
                    refreshableRecyclerViewLayout.A0C = true;
                    return;
                }
                return;
            case 5:
                A00(this);
                return;
            case 6:
                C65809M0b m0b = (C65809M0b) this.A01;
                m0b.A09.A00 = m0b.A07.getItemCount();
                return;
            case 7:
                ((C19378WWu) this.A01).A00.notifyChanged();
                return;
            default:
                super.onChanged();
                return;
        }
    }

    public final void onItemRangeChanged(int i, int i2, Object obj) {
        switch (this.A00) {
            case 1:
                C17549Va2 va2 = (C17549Va2) this.A01;
                WEU weu = (WEU) va2.A02;
                weu.A03.notifyItemRangeChanged(i + WEU.A00(weu, va2), i2, obj);
                return;
            case 2:
            case 7:
                onChanged();
                return;
            default:
                super.onItemRangeChanged(i, i2, obj);
                return;
        }
    }

    public final void onItemRangeInserted(int i, int i2) {
        switch (this.A00) {
            case 0:
                PagingDataAdapter pagingDataAdapter = (PagingDataAdapter) this.A01;
                if (pagingDataAdapter.mStateRestorationPolicy == C231372rZ.PREVENT && !pagingDataAdapter.A00) {
                    pagingDataAdapter.setStateRestorationPolicy(C231372rZ.ALLOW);
                }
                pagingDataAdapter.unregisterAdapterDataObserver(this);
                return;
            case 1:
                C17549Va2 va2 = (C17549Va2) this.A01;
                va2.A00 += i2;
                WEU weu = (WEU) va2.A02;
                weu.A03.notifyItemRangeInserted(i + WEU.A00(weu, va2), i2);
                if (va2.A00 > 0 && va2.A03.mStateRestorationPolicy == C231372rZ.PREVENT_WHEN_EMPTY) {
                    WEU.A02(weu);
                    return;
                }
                return;
            case 2:
            case 7:
                onChanged();
                return;
            case 3:
                if (i == 0) {
                    RecyclerView recyclerView = (RecyclerView) this.A01;
                    if (recyclerView.getChildCount() != 0) {
                        recyclerView.A0o(0);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                A00(this);
                return;
            case 6:
                C65809M0b m0b = (C65809M0b) this.A01;
                m0b.A09.A00 = m0b.A07.getItemCount();
                return;
            default:
                super.onItemRangeInserted(i, i2);
                return;
        }
    }

    public final void onItemRangeMoved(int i, int i2, int i3) {
        switch (this.A00) {
            case 1:
                02V.A06(C66581MXm.A1V(i3), "moving more than 1 item is not supported in RecyclerView");
                C17549Va2 va2 = (C17549Va2) this.A01;
                WEU weu = (WEU) va2.A02;
                int A002 = WEU.A00(weu, va2);
                weu.A03.notifyItemMoved(i + A002, i2 + A002);
                return;
            case 2:
            case 7:
                onChanged();
                return;
            case 5:
                A00(this);
                return;
            default:
                super.onItemRangeMoved(i, i2, i3);
                return;
        }
    }

    public final void onItemRangeRemoved(int i, int i2) {
        switch (this.A00) {
            case 1:
                C17549Va2 va2 = (C17549Va2) this.A01;
                va2.A00 -= i2;
                WEU weu = (WEU) va2.A02;
                weu.A03.notifyItemRangeRemoved(i + WEU.A00(weu, va2), i2);
                if (va2.A00 < 1 && va2.A03.mStateRestorationPolicy == C231372rZ.PREVENT_WHEN_EMPTY) {
                    WEU.A02(weu);
                    return;
                }
                return;
            case 2:
            case 7:
                onChanged();
                return;
            case 5:
                A00(this);
                return;
            case 6:
                C65809M0b m0b = (C65809M0b) this.A01;
                m0b.A09.A00 = m0b.A07.getItemCount();
                return;
            default:
                super.onItemRangeRemoved(i, i2);
                return;
        }
    }

    public final void onStateRestorationPolicyChanged() {
        if (1 - this.A00 != 0) {
            super.onStateRestorationPolicyChanged();
        } else {
            WEU.A02((WEU) ((C17549Va2) this.A01).A02);
        }
    }

    public final void onItemRangeChanged(int i, int i2) {
        switch (this.A00) {
            case 1:
                C17549Va2 va2 = (C17549Va2) this.A01;
                WEU weu = (WEU) va2.A02;
                weu.A03.notifyItemRangeChanged(i + WEU.A00(weu, va2), i2, (Object) null);
                return;
            case 2:
            case 7:
                onChanged();
                return;
            case 5:
                A00(this);
                return;
            default:
                super.onItemRangeChanged(i, i2);
                return;
        }
    }
}
