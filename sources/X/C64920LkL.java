package X;

import com.instagram.creation.base.PhotoSession;
import com.instagram.filterkit.filtergroup.model.impl.FilterGroupModelImpl;
import com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel;

/* renamed from: X.LkL  reason: case insensitive filesystem */
public final class C64920LkL implements C66435MRp {
    public final PhotoSession A00;

    public final void EK1() {
        FilterGroupModelImpl filterGroupModelImpl;
        PhotoSession photoSession = this.A00;
        FilterGroupModel filterGroupModel = photoSession.A07;
        if (filterGroupModel != null) {
            filterGroupModelImpl = filterGroupModel.E1g();
        } else {
            filterGroupModelImpl = null;
        }
        photoSession.A08 = filterGroupModelImpl;
    }

    public C64920LkL(PhotoSession photoSession) {
        this.A00 = photoSession;
    }
}
