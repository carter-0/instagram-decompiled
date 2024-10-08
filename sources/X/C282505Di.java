package X;

import android.view.View;
import android.view.ViewGroup;
import com.instagram.user.follow.FollowButton;
import com.instagram.user.follow.FollowButtonBase;

/* renamed from: X.5Di  reason: invalid class name and case insensitive filesystem */
public final class C282505Di extends 0Yg implements 0sP {
    public static final C282505Di A00 = new C282505Di();

    public C282505Di() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        ViewGroup viewGroup;
        AnonymousClass2WA r5 = (AnonymousClass2WA) obj;
        0qQ.A0B(r5, 0);
        View view = r5.A00;
        View view2 = null;
        if ((view instanceof ViewGroup) && (viewGroup = (ViewGroup) view) != null) {
            view2 = viewGroup.getChildAt(0);
        }
        if (view2 instanceof FollowButton) {
            FollowButtonBase followButtonBase = (FollowButtonBase) view2;
            followButtonBase.A0J.A0C = C243943aO.FOLLOW_BUTTON_EXPANDED_AREA;
            followButtonBase.performClick();
        }
        return C60340gF.A00;
    }
}
