package X;

import com.instagram.api.schemas.ClipsPrefetchTriggerType;

public final class H8O extends 0vM {
    public final /* synthetic */ AnonymousClass2m7 A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public H8O(AnonymousClass2m7 r7) {
        super("maybePrefetchVideoTabFeed", 678, 2, false, false);
        this.A00 = r7;
    }

    public final void loggedRun() {
        AnonymousClass2m7 r0 = this.A00;
        C243473Yx.A05.A09(r0.A01, r0.A00, ClipsPrefetchTriggerType.COLD_START.A00);
    }
}
