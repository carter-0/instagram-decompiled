package X;

import androidx.paging.PagingSource;
import com.instagram.creation.capture.quickcapture.controller.magicmediaremix.MagicMediaRemixEditController;
import com.instagram.direct.magicmediaremix.MagicMediaRemixContentCompositor;
import com.instagram.newsfeed.followrequests.data.FollowRequestsActionDataSource;
import com.instagram.stickersearch.AvatarStickerInteractor;
import com.instagram.user.follow.mvvm.data.FollowUserDataSourceImpl;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.JZl  reason: case insensitive filesystem */
public final class C59814JZl extends C64101El {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public Object A07;
    public final int A08;
    public final Object A09;

    /* JADX WARNING: type inference failed for: r11v0, types: [X.JZl, X.4D7] */
    public final Object invokeSuspend(Object obj) {
        int i = this.A08;
        A00(obj, this);
        switch (i) {
            case 0:
                return ((PagingSource) this.A09).A04((LCU) null, this);
            case 1:
                return MagicMediaRemixEditController.A00((AnonymousClass07Z) null, (MagicMediaRemixEditController) this.A09, (List) null, this, 0, 0);
            case 2:
                return MagicMediaRemixContentCompositor.A00((AnonymousClass4DH) null, (MagicMediaRemixContentCompositor) this.A09, (List) null, this);
            case 3:
                return ((FollowRequestsActionDataSource) this.A09).ClV((FollowStatus) null, (EWA) null, (User) null, this, (C62320sa) null);
            case 4:
                return C64185LSs.A00(this.A09, this);
            case 5:
                return ((AvatarStickerInteractor) this.A09).A02((C61082JwK) null, (C317846nw) null, (C317866ny) null, (Integer) null, this);
            default:
                return ((FollowUserDataSourceImpl) this.A09).ClV((FollowStatus) null, (EWA) null, (User) null, this, (C62320sa) null);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59814JZl(Object obj, AnonymousClass4D7 r2, int i) {
        super(r2);
        this.A08 = i;
        this.A09 = obj;
    }

    public static void A00(Object obj, C59814JZl jZl) {
        jZl.A07 = obj;
        jZl.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
    }

    public static boolean A01(int i, Object obj) {
        if (!(obj instanceof C59814JZl) || ((C59814JZl) obj).A08 != i) {
            return false;
        }
        return true;
    }
}
