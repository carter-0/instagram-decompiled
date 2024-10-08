package X;

import instagram.features.feed.fragment.ContextualFeedFragment;

public final class GUJ implements 27S {
    public final /* synthetic */ ContextualFeedFragment A00;

    public GUJ(ContextualFeedFragment contextualFeedFragment) {
        this.A00 = contextualFeedFragment;
    }

    public final /* bridge */ /* synthetic */ boolean A72(Object obj) {
        C2370436c r2 = (C2370436c) obj;
        0qQ.A0B(r2, 0);
        return r2.A01;
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        String id;
        int A03 = AnonymousClass0fD.A03(-758962237);
        C2370436c r5 = (C2370436c) obj;
        int A0D = AnonymousClass7TG.A0D(r5, 215323294);
        if (r5.A01 && (id = r5.A00.getId()) != null) {
            GAR gar = this.A00.A0B;
            if (gar == null) {
                0qQ.A0F("contextualFeedController");
                throw AnonymousClass00P.createAndThrow();
            }
            gar.A0O(id);
        }
        AnonymousClass0fD.A0A(-442918710, A0D);
        AnonymousClass0fD.A0A(-395912909, A03);
    }
}
