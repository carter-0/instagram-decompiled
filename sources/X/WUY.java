package X;

import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import com.instagram.android.R;
import com.instagram.api.schemas.SubscriptionStickerDict;
import com.instagram.common.session.UserSession;
import com.instagram.ui.text.fittingtextview.FittingTextView;

public final class WUY implements B21 {
    public View A00;
    public final View A01;
    public final ViewStub A02;
    public final UserSession A03;
    public final AnonymousClass8MF A04;
    public final C40590Aee A05;
    public final FittingTextView A06;

    /* JADX WARNING: type inference failed for: r0v2, types: [X.Aee, java.lang.Object] */
    public WUY(Context context, View view, UserSession userSession, AnonymousClass8MF r7) {
        0qQ.A0B(context, 3);
        this.A03 = userSession;
        this.A04 = r7;
        SubscriptionStickerDict subscriptionStickerDict = new SubscriptionStickerDict(DbT.A0j(userSession), (String) null, (String) null, (String) null);
        ? obj = new Object();
        obj.A00 = subscriptionStickerDict;
        this.A05 = obj;
        this.A01 = AnonymousClass7TF.A0G(view, R.id.text_overlay_edit_text_container);
        this.A06 = (FittingTextView) AnonymousClass7TF.A0F(view, R.id.done_button);
        ViewStub A0X = JTR.A0X(view, R.id.subscriptions_sticker_editor_stub);
        this.A02 = A0X;
        A0X.setOnInflateListener(new C71441Okg(0, context, view, this));
    }

    public final void DCS(Object obj) {
        View view = this.A00;
        if (view == null) {
            view = this.A02.inflate();
            this.A00 = view;
        }
        View view2 = this.A01;
        if (view == null) {
            0qQ.A0F("containerView");
            throw AnonymousClass00P.createAndThrow();
        } else {
            C294975nL.A07(new View[]{view2, view, this.A06}, false);
        }
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [X.Aee, X.50v, java.lang.Object] */
    public final void DDW() {
        AnonymousClass8MF r3 = this.A04;
        SubscriptionStickerDict subscriptionStickerDict = new SubscriptionStickerDict(DbT.A0j(this.A03), (String) null, (String) null, (String) null);
        ? obj = new Object();
        obj.A00 = subscriptionStickerDict;
        r3.Dn8(obj, (String) null);
        View view = this.A01;
        View view2 = this.A00;
        if (view2 == null) {
            0qQ.A0F("containerView");
            throw AnonymousClass00P.createAndThrow();
        } else {
            C294975nL.A05(new View[]{view, view2, this.A06}, false);
        }
    }
}
