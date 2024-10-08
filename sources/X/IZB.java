package X;

import com.instagram.showreelnative.ui.common.ShowreelNativeMediaView;
import com.instagram.sponsored.serverrendered.ServerRenderedSponsoredContentView;
import java.util.concurrent.TimeUnit;

public final class IZB implements C273454mb {
    public final /* synthetic */ ServerRenderedSponsoredContentView A00;
    public final /* synthetic */ boolean A01;

    public IZB(ServerRenderedSponsoredContentView serverRenderedSponsoredContentView, boolean z) {
        this.A00 = serverRenderedSponsoredContentView;
        this.A01 = z;
    }

    public final int Atx() {
        ShowreelNativeMediaView showreelNativeMediaView = this.A00.A03;
        if (showreelNativeMediaView != null) {
            return (int) (showreelNativeMediaView.getProgress() * ((float) TimeUnit.SECONDS.toMillis(showreelNativeMediaView.getDurationSeconds())));
        }
        return 0;
    }

    public final boolean Erz() {
        return this.A01;
    }
}
