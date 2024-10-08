package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.creation.base.MediaSession;
import com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel;

public final class LFT {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public MediaSession A04;
    public A6E A05;
    public String A06;
    public boolean A07;
    public FilterGroupModel A08;

    public final FilterGroupModel A00() {
        FilterGroupModel filterGroupModel = this.A08;
        if (filterGroupModel != null) {
            return filterGroupModel.E1g();
        }
        0f9 AEf = 0wj.A01.AEf("getFilterGroupModel", 817891240);
        AEf.ABQ(DialogModule.KEY_MESSAGE, "filter group model was null");
        AEf.report();
        return null;
    }

    public final void A01(FilterGroupModel filterGroupModel) {
        if (filterGroupModel == null) {
            0f9 AEf = 0wj.A01.AEf("setFilterGroupModel", 817891240);
            AEf.ABQ(DialogModule.KEY_MESSAGE, "FilterGroupModel passed into setFilterGroupModel was null");
            AEf.report();
            return;
        }
        this.A08 = filterGroupModel.E1g();
    }
}
