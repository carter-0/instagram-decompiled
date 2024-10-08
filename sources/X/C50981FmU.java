package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.model.MusicAssetModel;
import com.instagram.user.model.User;

/* renamed from: X.FmU  reason: case insensitive filesystem */
public final class C50981FmU implements C332277Ui {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ AnonymousClass4DH A01;
    public final /* synthetic */ AnonymousClass0iw A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ MusicAssetModel A04;
    public final /* synthetic */ C234502xy A05;
    public final /* synthetic */ AnonymousClass70J A06;
    public final /* synthetic */ User A07;
    public final /* synthetic */ boolean A08;

    public final void D9a() {
    }

    public C50981FmU(Context context, AnonymousClass4DH r2, AnonymousClass0iw r3, UserSession userSession, MusicAssetModel musicAssetModel, C234502xy r6, AnonymousClass70J r7, User user, boolean z) {
        this.A05 = r6;
        this.A00 = context;
        this.A03 = userSession;
        this.A01 = r2;
        this.A07 = user;
        this.A08 = z;
        this.A04 = musicAssetModel;
        this.A02 = r3;
        this.A06 = r7;
    }

    public final void D9V() {
        C234502xy r5 = this.A05;
        if (r5 != null && r5.isPlaying()) {
            r5.pause();
        }
        Context context = this.A00;
        UserSession userSession = this.A03;
        AnonymousClass4DH r1 = this.A01;
        User user = this.A07;
        boolean z = this.A08;
        AnonymousClass708.A02(context, r1, this.A02, userSession, this.A04, r5, this.A06, user, z);
    }
}
