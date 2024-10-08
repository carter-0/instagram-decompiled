package X;

import com.instagram.creation.photo.edit.effectfilter.PhotoFilter;
import com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel;

public final class MA1 implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C64910LkA A02;
    public final /* synthetic */ PhotoFilter A03;
    public final /* synthetic */ FilterGroupModel A04;
    public final /* synthetic */ 0sP A05;

    public MA1(C64910LkA lkA, PhotoFilter photoFilter, FilterGroupModel filterGroupModel, 0sP r4, int i, int i2) {
        this.A04 = filterGroupModel;
        this.A03 = photoFilter;
        this.A02 = lkA;
        this.A01 = i;
        this.A00 = i2;
        this.A05 = r4;
    }

    public final void run() {
        FilterGroupModel filterGroupModel = this.A04;
        if (filterGroupModel != null) {
            filterGroupModel.EWj(this.A03.A03, 17);
        }
        C64910LkA lkA = this.A02;
        lkA.A08.A02.post(new C66057M9q(lkA, filterGroupModel, this.A05, this.A01, this.A00));
    }
}
