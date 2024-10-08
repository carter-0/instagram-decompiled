package X;

import com.instagram.creation.fragment.EditMediaInfoFragment;
import com.instagram.location.intf.LocationSignalPackage;

/* renamed from: X.Lt6  reason: case insensitive filesystem */
public final class C65425Lt6 implements MSX {
    public final /* synthetic */ EditMediaInfoFragment A00;

    public C65425Lt6(EditMediaInfoFragment editMediaInfoFragment) {
        this.A00 = editMediaInfoFragment;
    }

    public final void DOn(LocationSignalPackage locationSignalPackage) {
        EditMediaInfoFragment editMediaInfoFragment = this.A00;
        editMediaInfoFragment.A01 = locationSignalPackage.BNg();
        editMediaInfoFragment.A0K = locationSignalPackage;
        EditMediaInfoFragment.A05(editMediaInfoFragment);
    }
}
