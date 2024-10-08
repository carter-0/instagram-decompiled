package X;

import com.instagram.video.live.mvvm.model.repository.core.IgLiveBroadcastInfoManager;

/* renamed from: X.Jgf  reason: case insensitive filesystem */
public final class C60160Jgf extends 2YL {
    public final C59720JVe A00;
    public final boolean A01;
    public final IgLiveBroadcastInfoManager A02;
    public final C62010KVj A03;

    public C60160Jgf(IgLiveBroadcastInfoManager igLiveBroadcastInfoManager, C59720JVe jVe, C62010KVj kVj, boolean z) {
        C61013JvD A0Q;
        AnonymousClass7TG.A1U(igLiveBroadcastInfoManager, jVe, kVj);
        this.A02 = igLiveBroadcastInfoManager;
        this.A00 = jVe;
        this.A03 = kVj;
        this.A01 = z;
        if (!z && (A0Q = JTQ.A0Q(igLiveBroadcastInfoManager)) != null) {
            kVj.A01(AnonymousClass05K.A0Y, A0Q.A09, A0Q.A08, "INSTAGRAM_USERPAY_BADGES");
        }
    }
}
