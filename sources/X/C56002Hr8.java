package X;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;

/* renamed from: X.Hr8  reason: case insensitive filesystem */
public final class C56002Hr8 {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ Fragment A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ PendingRecipient A03;
    public final /* synthetic */ AnonymousClass6ST A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ boolean A06;
    public final /* synthetic */ boolean A07;

    public final void A00(C369968vc r12) {
        C369968vc r5 = r12;
        0qQ.A0B(r12, 0);
        this.A04.dismiss();
        UserSession userSession = this.A02;
        Activity activity = this.A00;
        Fragment fragment = this.A01;
        PendingRecipient pendingRecipient = this.A03;
        boolean z = this.A07;
        boolean z2 = this.A06;
        String str = this.A05;
        int ordinal = r12.A04.ordinal();
        if (ordinal == 0 || ordinal == 1) {
            11Z.A03(new C41262Aqy(activity, fragment, r5, userSession, pendingRecipient, str, z2, z));
        }
    }

    public C56002Hr8(Activity activity, Fragment fragment, UserSession userSession, PendingRecipient pendingRecipient, AnonymousClass6ST r5, String str, boolean z, boolean z2) {
        this.A04 = r5;
        this.A02 = userSession;
        this.A00 = activity;
        this.A01 = fragment;
        this.A03 = pendingRecipient;
        this.A07 = z;
        this.A06 = z2;
        this.A05 = str;
    }
}
