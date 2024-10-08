package X;

import android.content.Context;
import android.view.ActionProvider;

public final class U7Q extends AnonymousClass02c implements ActionProvider.VisibilityListener {
    public C585502b A00;
    public final ActionProvider A01;
    public final /* synthetic */ C14732U5u A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public U7Q(Context context, ActionProvider actionProvider, C14732U5u u5u) {
        super(context);
        this.A02 = u5u;
        this.A01 = actionProvider;
    }

    public final void onActionProviderVisibilityChanged(boolean z) {
        C585502b r0 = this.A00;
        if (r0 != null) {
            C18932WDk wDk = ((C18937WDq) r0).A00.A0A;
            wDk.A0B = true;
            wDk.A0D(true);
        }
    }
}
