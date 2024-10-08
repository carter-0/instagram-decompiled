package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgEditText;
import com.instagram.ui.widget.editphonenumber.EditPhoneNumberView;

/* renamed from: X.UeH  reason: case insensitive filesystem */
public final class C15528UeH extends C231632rz {
    public final Context A00;
    public final 0hq A01;
    public final UserSession A02;

    public final int getViewTypeCount() {
        return AnonymousClass05K.A00(4).length;
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r3, Object obj, Object obj2) {
        throw new NullPointerException("getType");
    }

    public C15528UeH(Context context, 0hq r2, UserSession userSession) {
        this.A00 = context;
        this.A02 = userSession;
        this.A01 = r2;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = AnonymousClass0fD.A03(2003403690);
        0qQ.A0B(view, 1);
        int A08 = C13989Tnp.A08(4, i);
        if (A08 == 0) {
            0qQ.A0C(view.getTag(), "null cannot be cast to non-null type com.instagram.business.promote.binder.PromoteSimpleEditTextViewBinder.Holder");
            throw new NullPointerException("getHint");
        } else if (A08 == 1) {
            0qQ.A0C(view.getTag(), "null cannot be cast to non-null type com.instagram.business.promote.binder.PromoteNameEditTextViewBinder.Holder");
            throw new NullPointerException("getHint");
        } else if (A08 == 2) {
            Context context = this.A00;
            0qQ.A0C(view.getTag(), "null cannot be cast to non-null type com.instagram.business.promote.binder.PromoteEmailEditTextViewBinder.Holder");
            0qQ.A0B(context, 0);
            Drawable drawable = context.getDrawable(R.drawable.instagram_error_outline_16);
            if (drawable != null) {
                DbX.A11(context, drawable, 2Yu.A03(context));
                Drawable drawable2 = context.getDrawable(R.drawable.instagram_circle_check_outline_16);
                if (drawable2 != null) {
                    DbX.A11(context, drawable2, 2Yu.A0H(context, R.attr.igds_color_success));
                    throw new NullPointerException("getHint");
                }
                throw new IllegalStateException("Required value was null.");
            }
            throw new IllegalStateException("Required value was null.");
        } else if (A08 == 3) {
            Context context2 = this.A00;
            UserSession userSession = this.A02;
            0hq r2 = this.A01;
            Object tag = view.getTag();
            0qQ.A0C(tag, "null cannot be cast to non-null type com.instagram.business.promote.binder.PromotePhoneEditTextViewBinder.Holder");
            0qQ.A0B(context2, 0);
            0qQ.A0B(userSession, 1);
            0qQ.A0B(r2, 2);
            0qQ.A0B(tag, 3);
            0qQ.A0B((Object) null, 4);
            throw AnonymousClass00P.createAndThrow();
        } else {
            RuntimeException runtimeException = new RuntimeException();
            AnonymousClass0fD.A0A(-1141745542, A03);
            throw runtimeException;
        }
    }

    public final View createView(int i, ViewGroup viewGroup) {
        Object vmr;
        EditPhoneNumberView editPhoneNumberView;
        int A03 = AnonymousClass0fD.A03(-1303101236);
        0qQ.A0B(viewGroup, 1);
        int A08 = C13989Tnp.A08(4, i);
        if (A08 == 0) {
            View A09 = DbW.A09(DbT.A0B(this.A00), viewGroup, R.layout.promote_recycler_simple_edit_text_view, false);
            vmr = new VMR((IgEditText) AnonymousClass7TF.A0F(A09, R.id.edit_text));
            editPhoneNumberView = A09;
        } else if (A08 == 1) {
            View A092 = DbW.A09(DbT.A0B(this.A00), viewGroup, R.layout.promote_recycler_name_edit_text_view, false);
            vmr = new VMN((IgEditText) AnonymousClass7TF.A0F(A092, R.id.edit_text));
            editPhoneNumberView = A092;
        } else if (A08 == 2) {
            View A093 = DbW.A09(DbT.A0B(this.A00), viewGroup, R.layout.promote_recycler_email_edit_text_view, false);
            vmr = new VMK((IgEditText) AnonymousClass7TF.A0F(A093, R.id.edit_text));
            editPhoneNumberView = A093;
        } else if (A08 == 3) {
            View inflate = DbT.A0B(this.A00).inflate(R.layout.promote_recycler_phone_edit_text_view, viewGroup, false);
            0qQ.A0C(inflate, "null cannot be cast to non-null type com.instagram.ui.widget.editphonenumber.EditPhoneNumberView");
            EditPhoneNumberView editPhoneNumberView2 = (EditPhoneNumberView) inflate;
            vmr = new VMO(editPhoneNumberView2);
            editPhoneNumberView = editPhoneNumberView2;
        } else {
            RuntimeException runtimeException = new RuntimeException();
            AnonymousClass0fD.A0A(458070563, A03);
            throw runtimeException;
        }
        editPhoneNumberView.setTag(vmr);
        AnonymousClass0fD.A0A(1916077829, A03);
        return editPhoneNumberView;
    }
}
