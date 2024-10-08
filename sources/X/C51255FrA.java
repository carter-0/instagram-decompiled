package X;

import com.instagram.profile.fragment.ProfileFollowRelationshipFragment;

/* renamed from: X.FrA  reason: case insensitive filesystem */
public final class C51255FrA implements Runnable {
    public final /* synthetic */ ProfileFollowRelationshipFragment A00;

    public C51255FrA(ProfileFollowRelationshipFragment profileFollowRelationshipFragment) {
        this.A00 = profileFollowRelationshipFragment;
    }

    public final void run() {
        C51028FnK fnK = this.A00.A00;
        if (fnK == null) {
            0qQ.A0F("delegate");
            throw AnonymousClass00P.createAndThrow();
        }
        AnonymousClass71F r1 = fnK.A06;
        if (r1 != null) {
            r1.Dkl(fnK.A05.getId());
        }
    }
}
