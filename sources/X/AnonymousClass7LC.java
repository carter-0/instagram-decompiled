package X;

import android.view.View;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;

/* renamed from: X.7LC  reason: invalid class name */
public final class AnonymousClass7LC implements View.OnLongClickListener {
    public final /* synthetic */ AnonymousClass7TI A00;

    public AnonymousClass7LC(AnonymousClass7TI r1) {
        this.A00 = r1;
    }

    public final boolean onLongClick(View view) {
        AnonymousClass7TI r6 = this.A00;
        C333517Zg r0 = r6.A08;
        if (r0 == null) {
            0qQ.A0F("clientInfra");
            throw AnonymousClass00P.createAndThrow();
        }
        String A002 = AnonymousClass747.A00(r0);
        if (A002 == null) {
            return false;
        }
        0wc r4 = r6.A0W;
        boolean A003 = r6.A0v.A00();
        0qQ.A0B(r4, 0);
        0Aj A004 = r4.A00(r4.A00, "direct_thread_long_press");
        if (A004.isSampled()) {
            A004.AAJ(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, A002);
            A004.A7p("is_e2ee", Boolean.valueOf(A003));
            A004.Cgf();
        }
        if (!AnonymousClass7TI.A0G(r6)) {
            return true;
        }
        OX5.A02(r4, AnonymousClass7TI.A02(r6), A002, "long_press");
        r6.A0t.AGh("long_press");
        return true;
    }
}
