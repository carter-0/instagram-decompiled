package X;

import android.content.Context;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.4zu  reason: invalid class name and case insensitive filesystem */
public final class C280044zu implements C247813gx {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C279104y5 A02;
    public final /* synthetic */ AnonymousClass4GD A03;
    public final /* synthetic */ C279064y1 A04;
    public final /* synthetic */ AnonymousClass4DU A05;
    public final /* synthetic */ AnonymousClass3W1 A06;

    public C280044zu(Context context, UserSession userSession, C279104y5 r3, AnonymousClass4GD r4, C279064y1 r5, AnonymousClass4DU r6, AnonymousClass3W1 r7) {
        this.A04 = r5;
        this.A02 = r3;
        this.A06 = r7;
        this.A05 = r6;
        this.A03 = r4;
        this.A01 = userSession;
        this.A00 = context;
    }

    public final /* synthetic */ void DEN() {
    }

    public final void DO4(C240983Nk r8) {
        C279064y1 r4 = this.A04;
        r4.A0E.A06(R.id.listener_id_for_media_tag_indicator);
        C279104y5 r2 = this.A02;
        AnonymousClass3W1 r6 = this.A06;
        AnonymousClass4DU r5 = this.A05;
        AnonymousClass4GD r3 = this.A03;
        AnonymousClass4GG.A01(this.A00, this.A01, r2, r3, r4, r5, r6);
    }
}
