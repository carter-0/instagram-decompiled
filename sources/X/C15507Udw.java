package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.Udw  reason: case insensitive filesystem */
public final class C15507Udw extends C231632rz {
    public final Context A00;

    public final int getViewTypeCount() {
        return AnonymousClass05K.A00(4).length;
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r2, Object obj, Object obj2) {
        VVS vvs = (VVS) obj;
        AnonymousClass7TG.A1N(r2, vvs);
        r2.A7U(vvs.A00.intValue());
    }

    public C15507Udw(Context context) {
        this.A00 = context;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        View.OnClickListener onClickListener;
        IgTextView igTextView;
        int A03 = AnonymousClass0fD.A03(610624553);
        0qQ.A0B(view, 1);
        0qQ.A0B(obj, 2);
        int A08 = C13989Tnp.A08(4, i);
        if (A08 == 0) {
            Object tag = view.getTag();
            0qQ.A0C(tag, "null cannot be cast to non-null type com.instagram.business.promote.binder.PromoteTextButtonViewBinder.Holder");
            VMS vms = (VMS) tag;
            VVS vvs = (VVS) obj;
            0qQ.A0B(vms, 0);
            0qQ.A0B(vvs, 1);
            CharSequence charSequence = vvs.A02;
            if (charSequence != null) {
                vms.A00.setText(charSequence);
            }
            onClickListener = vvs.A01;
            igTextView = vms.A00;
        } else if (A08 == 3) {
            Object tag2 = view.getTag();
            0qQ.A0C(tag2, "null cannot be cast to non-null type com.instagram.business.promote.binder.PromoteErrorOrDestructiveActionRowTextButtonViewBinder.Holder");
            VML vml = (VML) tag2;
            VVS vvs2 = (VVS) obj;
            0qQ.A0B(vml, 0);
            0qQ.A0B(vvs2, 1);
            CharSequence charSequence2 = vvs2.A02;
            if (charSequence2 != null) {
                vml.A00.setText(charSequence2);
            }
            onClickListener = vvs2.A01;
            igTextView = vml.A00;
        } else if (A08 == 2) {
            Object tag3 = view.getTag();
            0qQ.A0C(tag3, "null cannot be cast to non-null type com.instagram.business.promote.binder.PromotePrimaryActionRowTextButtonViewBinder.Holder");
            VMP vmp = (VMP) tag3;
            VVS vvs3 = (VVS) obj;
            0qQ.A0B(vmp, 0);
            0qQ.A0B(vvs3, 1);
            CharSequence charSequence3 = vvs3.A02;
            if (charSequence3 != null) {
                vmp.A00.setText(charSequence3);
            }
            onClickListener = vvs3.A01;
            igTextView = vmp.A00;
        } else if (A08 == 1) {
            Object tag4 = view.getTag();
            0qQ.A0C(tag4, "null cannot be cast to non-null type com.instagram.business.promote.binder.PromoteSeeMoreButtonViewBinder.Holder");
            VMQ vmq = (VMQ) tag4;
            VVS vvs4 = (VVS) obj;
            0qQ.A0B(vmq, 0);
            0qQ.A0B(vvs4, 1);
            CharSequence charSequence4 = vvs4.A02;
            if (charSequence4 != null) {
                vmq.A00.setText(charSequence4);
            }
            onClickListener = vvs4.A01;
            igTextView = vmq.A00;
        } else {
            RuntimeException runtimeException = new RuntimeException();
            AnonymousClass0fD.A0A(-2006164894, A03);
            throw runtimeException;
        }
        AnonymousClass0fU.A00(onClickListener, igTextView);
        AnonymousClass0fD.A0A(-1777658998, A03);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        IgTextView A0V;
        Object vms;
        int A03 = AnonymousClass0fD.A03(-328002904);
        0qQ.A0B(viewGroup, 1);
        int A08 = C13989Tnp.A08(4, i);
        if (A08 == 0) {
            A0V = C13989Tnp.A0V(DbT.A0B(this.A00), viewGroup, R.layout.promote_recycler_text_button_view);
            vms = new VMS(A0V);
        } else if (A08 == 3) {
            A0V = C13989Tnp.A0V(DbT.A0B(this.A00), viewGroup, R.layout.promote_recycler_error_or_distructive_action_row_text_button_view);
            vms = new VML(A0V);
        } else if (A08 == 2) {
            A0V = C13989Tnp.A0V(DbT.A0B(this.A00), viewGroup, R.layout.promote_recycler_primary_action_row_text_button_view);
            vms = new VMP(A0V);
        } else if (A08 == 1) {
            A0V = C13989Tnp.A0V(DbT.A0B(this.A00), viewGroup, R.layout.promote_recycler_see_more_button_view);
            vms = new VMQ(A0V);
        } else {
            RuntimeException runtimeException = new RuntimeException();
            AnonymousClass0fD.A0A(-754015295, A03);
            throw runtimeException;
        }
        A0V.setTag(vms);
        AnonymousClass0fD.A0A(-723057140, A03);
        return A0V;
    }
}
