package X;

import com.instagram.igds.components.button.IgdsButton;

/* renamed from: X.FbJ  reason: case insensitive filesystem */
public final class C50410FbJ implements MSL {
    public final /* synthetic */ C47830EJc A00;

    public C50410FbJ(C47830EJc eJc) {
        this.A00 = eJc;
    }

    public final void onSuccess() {
        C47830EJc eJc = this.A00;
        IgdsButton igdsButton = eJc.A00;
        if (igdsButton != null) {
            igdsButton.setLoading(false);
            DbZ.A17(eJc);
            return;
        }
        0qQ.A0F("ctaButton");
        throw AnonymousClass00P.createAndThrow();
    }
}
