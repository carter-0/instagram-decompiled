package X;

import com.instagram.common.recyclerview.ViewModelListUpdate;
import com.instagram.creation.capture.quickcapture.controller.magicmediaremix.MagicMediaRemixEditController;
import java.util.List;

/* renamed from: X.An5  reason: case insensitive filesystem */
public final class C41021An5 implements Runnable {
    public final /* synthetic */ MagicMediaRemixEditController A00;
    public final /* synthetic */ List A01;

    public C41021An5(MagicMediaRemixEditController magicMediaRemixEditController, List list) {
        this.A01 = list;
        this.A00 = magicMediaRemixEditController;
    }

    public final void run() {
        ViewModelListUpdate viewModelListUpdate = new ViewModelListUpdate();
        viewModelListUpdate.A01(this.A01);
        this.A00.A07.A05(viewModelListUpdate);
    }
}
