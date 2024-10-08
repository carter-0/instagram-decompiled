package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.PendingShareToFriendsStoryBadgePreviewState;
import java.util.List;

/* renamed from: X.3If  reason: invalid class name */
public final class AnonymousClass3If extends AnonymousClass0T0 implements AnonymousClass3Ig {
    public final PendingShareToFriendsStoryBadgePreviewState A00;
    public final String A01;
    public final List A02;

    public final AnonymousClass3If F7Q(1E9 r1) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass3If) {
                AnonymousClass3If r5 = (AnonymousClass3If) obj;
                if (this.A00 != r5.A00 || !0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        PendingShareToFriendsStoryBadgePreviewState pendingShareToFriendsStoryBadgePreviewState = this.A00;
        int i = 0;
        int hashCode = (pendingShareToFriendsStoryBadgePreviewState == null ? 0 : pendingShareToFriendsStoryBadgePreviewState.hashCode()) * 31;
        String str = this.A01;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        List list = this.A02;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode2 + i;
    }

    public final PendingShareToFriendsStoryBadgePreviewState Af3() {
        return this.A00;
    }

    public final String Aum() {
        return this.A01;
    }

    public final List BQT() {
        return this.A02;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTPendingShareToFriendsStoryMediaResponse", CbN.A00(this));
    }

    public AnonymousClass3If(PendingShareToFriendsStoryBadgePreviewState pendingShareToFriendsStoryBadgePreviewState, String str, List list) {
        this.A00 = pendingShareToFriendsStoryBadgePreviewState;
        this.A01 = str;
        this.A02 = list;
    }
}
