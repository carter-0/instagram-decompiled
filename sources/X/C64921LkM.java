package X;

import com.instagram.creation.base.VideoSession;
import com.instagram.filterkit.filtergroup.model.impl.FilterGroupModelImpl;
import com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel;

/* renamed from: X.LkM  reason: case insensitive filesystem */
public final class C64921LkM implements C66435MRp {
    public final VideoSession A00;

    public final void EK1() {
        FilterGroupModelImpl filterGroupModelImpl;
        VideoSession videoSession = this.A00;
        FilterGroupModel filterGroupModel = videoSession.A0D;
        if (filterGroupModel != null) {
            filterGroupModelImpl = filterGroupModel.E1g();
        } else {
            filterGroupModelImpl = null;
        }
        videoSession.A0E = filterGroupModelImpl;
    }

    public C64921LkM(VideoSession videoSession) {
        this.A00 = videoSession;
    }
}
