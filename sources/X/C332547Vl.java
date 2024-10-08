package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;

/* renamed from: X.7Vl  reason: invalid class name and case insensitive filesystem */
public final class C332547Vl extends 0Yg implements C62320sa {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C332237Ue A01;
    public final /* synthetic */ String A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C332547Vl(C332237Ue r2, String str, int i) {
        super(0);
        this.A01 = r2;
        this.A00 = i;
        this.A02 = str;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        C332237Ue r1 = this.A01;
        AnonymousClass4DH r3 = r1.A0E;
        UserSession userSession = r1.A0G;
        C332067Tn r0 = r1.A0H;
        AnonymousClass0iw r4 = r0.A02;
        String str = r0.A09;
        String str2 = r1.A0K;
        int i = this.A00;
        C254923tH r7 = r0.A07;
        String str3 = this.A02;
        C62320sa r14 = r1.A0t;
        1a8 r5 = r1.A0F;
        Bundle bundle = r0.A00;
        return new C332557Vm(r3, r4, r5, userSession, r7, str, str2, str3, bundle.getString("direct_channel_creation_title", (String) null), bundle.getString("DirectThreadFragment.DIRECT_THREAD_FRAGMENT_ARGUMENT_DISPLAY_LOCATION", (String) null), bundle.getString("direct_story_creator_id", (String) null), r14, i, bundle.getBoolean("direct_is_creating_social_channel", false));
    }
}
