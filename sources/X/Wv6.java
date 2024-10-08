package X;

import android.view.ViewGroup;

public final class Wv6 extends UFM {
    public final /* synthetic */ UFT A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Wv6(08m r1, UFT uft) {
        super(r1);
        this.A00 = uft;
    }

    public final int getItemPosition(Object obj) {
        int itemPosition = this.A01.getItemPosition(obj);
        if (itemPosition >= 0) {
            return (getCount() - itemPosition) - 1;
        }
        return itemPosition;
    }

    public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        super.destroyItem(viewGroup, (getCount() - i) - 1, obj);
    }

    public final CharSequence getPageTitle(int i) {
        return this.A01.getPageTitle((getCount() - i) - 1);
    }

    public final float getPageWidth(int i) {
        return this.A01.getPageWidth((getCount() - i) - 1);
    }

    public final Object instantiateItem(ViewGroup viewGroup, int i) {
        return this.A01.instantiateItem(viewGroup, (getCount() - i) - 1);
    }

    public final void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
        super.setPrimaryItem(viewGroup, (getCount() - i) - 1, obj);
    }
}
