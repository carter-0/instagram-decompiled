package X;

import android.content.Context;
import android.view.PointerIcon;
import androidx.compose.ui.platform.AndroidComposeView;
import com.facebook.cameracore.instagram.ardelivery.networkconsentmanager.IgNetworkConsentStorage;

/* renamed from: X.5We  reason: invalid class name and case insensitive filesystem */
public final class C286395We implements C286405Wf {
    public C286445Wj A00 = C286415Wg.A00;
    public final /* synthetic */ AndroidComposeView A01;

    public C286395We(AndroidComposeView androidComposeView) {
        this.A01 = androidComposeView;
    }

    public final void EZO(C286445Wj r4) {
        int i;
        if (r4 == null) {
            r4 = C286415Wg.A00;
        }
        this.A00 = r4;
        AndroidComposeView androidComposeView = this.A01;
        boolean z = r4 instanceof C286435Wi;
        Context context = androidComposeView.getContext();
        if (z) {
            i = ((C286435Wi) r4).A00;
        } else {
            i = IgNetworkConsentStorage.MAX_ENTRIES;
        }
        PointerIcon systemIcon = PointerIcon.getSystemIcon(context, i);
        if (!0qQ.A0K(androidComposeView.getPointerIcon(), systemIcon)) {
            androidComposeView.setPointerIcon(systemIcon);
        }
    }
}
