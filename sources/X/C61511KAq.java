package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.facebook.fbavatar.cdsavatareditor.richavatarretextureview.impl.AvatarRetextureSparkPreviewController;

/* renamed from: X.KAq  reason: case insensitive filesystem */
public final class C61511KAq extends C14097Tpp {
    public final AnonymousClass07Z A00;

    public final /* bridge */ /* synthetic */ Object A0K(View view, C307786Rm r12, C276544tV r13, Object obj) {
        AnonymousClass7TG.A1N(view, r12);
        0qQ.A0B(r13, 2);
        Object A06 = C307476Qg.A06(r12, r13);
        AnonymousClass0xx A002 = AnonymousClass07a.A00(this.A00);
        AnonymousClass4CZ r0 = AnonymousClass12W.A00;
        1Eo.A05(AnonymousClass12y.A00, new JVZ((AnonymousClass4D7) null, (Object) this, A06, (Object) A002, (Object) r12, (Object) view, (Object) r13, 2), A002);
        return null;
    }

    public final /* bridge */ /* synthetic */ Object ALg(Context context) {
        0qQ.A0B(context, 0);
        return new FrameLayout(context);
    }

    public final /* bridge */ /* synthetic */ void A0L(View view, C307786Rm r5, C276544tV r6, Object obj, Object obj2) {
        ViewGroup viewGroup = (ViewGroup) view;
        AnonymousClass7TG.A1T(viewGroup, r5, r6);
        AvatarRetextureSparkPreviewController avatarRetextureSparkPreviewController = (AvatarRetextureSparkPreviewController) C307476Qg.A06(r5, r6);
        if (avatarRetextureSparkPreviewController != null) {
            AnonymousClass07Z r1 = this.A00;
            0qQ.A0B(r1, 0);
            r1.getLifecycle().A0A(avatarRetextureSparkPreviewController.A04);
        }
        viewGroup.removeAllViews();
    }

    public C61511KAq(AnonymousClass07Z r1, C307786Rm r2, C276544tV r3) {
        super(r2, r3);
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ View A0J(Context context) {
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* bridge */ /* synthetic */ void A0M(View view, C307786Rm r2, C276544tV r3, Object obj, Object obj2) {
    }
}
