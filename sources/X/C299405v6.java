package X;

import android.content.Context;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.5v6  reason: invalid class name and case insensitive filesystem */
public final class C299405v6 implements C247813gx {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C282555Dn A02;
    public final /* synthetic */ C274114nj A03;
    public final /* synthetic */ C274154nn A04;
    public final /* synthetic */ C262804Gb A05;
    public final /* synthetic */ AnonymousClass4DU A06;
    public final /* synthetic */ AnonymousClass3W1 A07;

    public C299405v6(Context context, UserSession userSession, C282555Dn r3, C274114nj r4, C274154nn r5, C262804Gb r6, AnonymousClass4DU r7, AnonymousClass3W1 r8) {
        this.A05 = r6;
        this.A07 = r8;
        this.A04 = r5;
        this.A06 = r7;
        this.A01 = userSession;
        this.A00 = context;
        this.A03 = r4;
        this.A02 = r3;
    }

    public final /* synthetic */ void DEN() {
    }

    public final void DO4(C240983Nk r9) {
        C262804Gb r5 = this.A05;
        r5.A0F.A06(R.id.listener_id_for_media_tag_indicator);
        AnonymousClass3W1 r7 = this.A07;
        C274154nn r4 = this.A04;
        AnonymousClass4DU r6 = this.A06;
        UserSession userSession = this.A01;
        AnonymousClass4GB.A01(this.A00, userSession, this.A02, this.A03, r4, r5, r6, r7);
    }
}
