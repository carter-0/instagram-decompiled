package X;

import java.util.List;

/* renamed from: X.8cv  reason: invalid class name and case insensitive filesystem */
public final class C359498cv implements AnonymousClass2gO {
    public final /* synthetic */ C359318cb A00;

    public C359498cv(C359318cb r1) {
        this.A00 = r1;
    }

    public final void onChanged(Object obj) {
        C390759rn r1;
        C56038Hrl hrl;
        C359318cb r2 = this.A00;
        C359318cb.A09(r2);
        if (((List) r2.A0s.A0N.A0E.getValue()).size() > 1) {
            AnonymousClass0eM r22 = r2.A1B;
            C56038Hrl hrl2 = (C56038Hrl) r22.getValue();
            if (hrl2 != null) {
                r1 = hrl2.A00();
            } else {
                r1 = null;
            }
            if (r1 == C390759rn.AssetHubCutoutTextSticker && (hrl = (C56038Hrl) r22.getValue()) != null) {
                hrl.A01(C390759rn.None);
            }
        }
    }
}
