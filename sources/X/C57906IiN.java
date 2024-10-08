package X;

import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;

/* renamed from: X.IiN  reason: case insensitive filesystem */
public final class C57906IiN implements Runnable {
    public final /* synthetic */ C230292pL A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;

    public C57906IiN(C230292pL r1, String str, String str2) {
        this.A00 = r1;
        this.A02 = str;
        this.A01 = str2;
    }

    public final void run() {
        C230292pL r5 = this.A00;
        if (r5.A02 == null) {
            String str = this.A02;
            String str2 = this.A01;
            r5.A02 = AnonymousClass05K.A00;
            r5.A05 = 0Yt.A07(new 0eP[]{AnonymousClass7TE.A1L("multi_ads_unit_id", str), AnonymousClass7TE.A1L(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, r5.A09.A06), AnonymousClass7TE.A1L("trigger_type", "dwell")});
            r5.A01 = AnonymousClass05K.A01;
            r5.A04 = str2;
        }
    }
}
