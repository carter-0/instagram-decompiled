package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgSimpleImageView;

/* renamed from: X.Udx  reason: case insensitive filesystem */
public final class C15508Udx extends C231632rz {
    public final Context A00;

    public final int getViewTypeCount() {
        return AnonymousClass05K.A00(1).length;
    }

    public C15508Udx(Context context) {
        this.A00 = context;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = AnonymousClass0fD.A03(1668513078);
        AnonymousClass7TF.A1B(view, 1, obj);
        if (C13989Tnp.A08(1, i) == 0) {
            Object tag = view.getTag();
            0qQ.A0C(tag, "null cannot be cast to non-null type com.instagram.business.promote.binder.PromoteThumbnailDrawableImageViewBinder.Holder");
            VMT vmt = (VMT) tag;
            VMY vmy = (VMY) obj;
            0qQ.A0B(vmt, 0);
            0qQ.A0B(vmy, 1);
            vmt.A00.setImageDrawable(vmy.A00);
            AnonymousClass0fD.A0A(708215190, A03);
            return;
        }
        RuntimeException runtimeException = new RuntimeException();
        AnonymousClass0fD.A0A(-1801684464, A03);
        throw runtimeException;
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r2, Object obj, Object obj2) {
        AnonymousClass7TG.A1N(r2, obj);
        r2.A7U(0);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = AnonymousClass0fD.A03(-470867676);
        0qQ.A0B(viewGroup, 1);
        if (C13989Tnp.A08(1, i) == 0) {
            View inflate = DbT.A0B(this.A00).inflate(R.layout.promote_recycler_thumbnail_drawable_image_view, viewGroup, false);
            0qQ.A0C(inflate, "null cannot be cast to non-null type com.instagram.common.ui.base.IgSimpleImageView");
            IgSimpleImageView igSimpleImageView = (IgSimpleImageView) inflate;
            igSimpleImageView.setTag(new VMT(igSimpleImageView));
            AnonymousClass0fD.A0A(-1332356112, A03);
            return igSimpleImageView;
        }
        RuntimeException runtimeException = new RuntimeException();
        AnonymousClass0fD.A0A(-996750080, A03);
        throw runtimeException;
    }
}
