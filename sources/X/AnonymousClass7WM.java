package X;

import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.metadata.utils.ThreadMetadataOverrideBroadcastReceiver;

/* renamed from: X.7WM  reason: invalid class name */
public final class AnonymousClass7WM {
    public final AnonymousClass4DH A00;
    public final ThreadMetadataOverrideBroadcastReceiver A01;
    public final AnonymousClass7WN A02;
    public final AnonymousClass7WQ A03;

    public AnonymousClass7WM(AnonymousClass4DH r4, UserSession userSession, C62320sa r6) {
        0qQ.A0B(r4, 1);
        0qQ.A0B(r6, 3);
        this.A00 = r4;
        this.A02 = new AnonymousClass7WN(r4);
        this.A03 = new AnonymousClass7WQ(new AnonymousClass7WP(r4), userSession, new C377109Ko(r6, 11));
        this.A01 = new ThreadMetadataOverrideBroadcastReceiver(new AnonymousClass7WR(r4), userSession, new C377109Ko(r6, 12));
    }
}
