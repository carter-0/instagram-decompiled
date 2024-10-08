package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;

/* renamed from: X.UiM  reason: case insensitive filesystem */
public final class C15777UiM extends C232222tE {
    public final AnonymousClass0iw A00;
    public final X1Z A01;

    public final /* bridge */ /* synthetic */ void bind(C232262tL r9, C249703kE r10) {
        WSS wss = (WSS) r9;
        C14823UBc uBc = (C14823UBc) r10;
        AnonymousClass7TF.A1H(wss, uBc);
        C18043VkR vkR = wss.A02;
        C18250VoH.A01(wss.A00, wss.A01, this.A00, this.A01, uBc, vkR, wss.A03, false);
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        0qQ.A0B(viewGroup, 0);
        return C18250VoH.A00(viewGroup);
    }

    public final Class modelClass() {
        return WSS.class;
    }

    public C15777UiM(AnonymousClass0iw r1, X1Z x1z) {
        this.A00 = r1;
        this.A01 = x1z;
    }
}
