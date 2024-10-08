package X;

import android.view.View;
import com.facebook.cameracore.instagram.ardelivery.networkconsentmanager.IgNetworkConsentStorage;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.PaH  reason: case insensitive filesystem */
public final class C73296PaH implements Runnable {
    public final /* synthetic */ IgTextView A00;
    public final /* synthetic */ NVC A01;
    public final /* synthetic */ Integer A02;

    public C73296PaH(IgTextView igTextView, NVC nvc, Integer num) {
        this.A02 = num;
        this.A01 = nvc;
        this.A00 = igTextView;
    }

    public final void run() {
        Integer num = this.A02;
        View view = this.A01.A02.A03.getView();
        if (num != null) {
            view.setVisibility(0);
            IgTextView igTextView = this.A00;
            igTextView.setVisibility(0);
            igTextView.setText(C347917xa.A01(num.intValue() * IgNetworkConsentStorage.MAX_ENTRIES));
            return;
        }
        view.setVisibility(8);
        this.A00.setVisibility(8);
    }
}
