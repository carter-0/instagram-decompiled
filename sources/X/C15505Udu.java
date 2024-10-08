package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.Udu  reason: case insensitive filesystem */
public final class C15505Udu extends C231632rz {
    public final Context A00;

    public final int getViewTypeCount() {
        return AnonymousClass05K.A00(4).length;
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r2, Object obj, Object obj2) {
        C17330VRj vRj = (C17330VRj) obj;
        AnonymousClass7TG.A1N(r2, vRj);
        r2.A7U(vRj.A00.intValue());
    }

    public C15505Udu(Context context) {
        this.A00 = context;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        C17330VRj vRj;
        IgTextView igTextView;
        int A03 = AnonymousClass0fD.A03(1455059213);
        int A02 = DbW.A02(1, view, obj);
        int A08 = C13989Tnp.A08(4, i);
        if (A08 != 0) {
            if (A08 == A02 || A08 == 1) {
                Object tag = view.getTag();
                0qQ.A0C(tag, "null cannot be cast to non-null type com.instagram.business.promote.binder.PromoteCenterDisplayBodyViewBinder.Holder");
                VVP vvp = (VVP) tag;
                vRj = (C17330VRj) obj;
                0qQ.A0B(vvp, 0);
                0qQ.A0B(vRj, 1);
                igTextView = vvp.A01;
            } else if (A08 == 3) {
                Object tag2 = view.getTag();
                0qQ.A0C(tag2, "null cannot be cast to non-null type com.instagram.business.promote.binder.PromoteLegalInfoFooterViewBinder.Holder");
                VMM vmm = (VMM) tag2;
                vRj = (C17330VRj) obj;
                0qQ.A0B(vmm, 0);
                0qQ.A0B(vRj, 1);
                igTextView = vmm.A00;
            } else {
                RuntimeException runtimeException = new RuntimeException();
                AnonymousClass0fD.A0A(-262334219, A03);
                throw runtimeException;
            }
            DbX.A1G(igTextView, vRj.A01);
        } else {
            Object tag3 = view.getTag();
            0qQ.A0C(tag3, "null cannot be cast to non-null type com.instagram.business.promote.binder.PromoteCenterDisplayTitleViewBinder.Holder");
            VMJ vmj = (VMJ) tag3;
            C17330VRj vRj2 = (C17330VRj) obj;
            0qQ.A0B(vmj, 0);
            0qQ.A0B(vRj2, 1);
            vmj.A00.setText(vRj2.A01);
        }
        AnonymousClass0fD.A0A(977834949, A03);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        IgTextView A0V;
        Object vmj;
        int A03 = AnonymousClass0fD.A03(1747124147);
        0qQ.A0B(viewGroup, 1);
        int A08 = C13989Tnp.A08(4, i);
        if (A08 == 0) {
            A0V = C13989Tnp.A0V(DbT.A0B(this.A00), viewGroup, R.layout.promote_recycler_center_display_title_view);
            vmj = new VMJ(A0V);
        } else if (A08 == 2 || A08 == 1) {
            A0V = DbW.A09(DbT.A0B(this.A00), viewGroup, R.layout.promote_recycler_center_display_body_view, false);
            vmj = new VVP(A0V, DbX.A0Z(A0V, R.id.dot_text_view), DbX.A0Z(A0V, R.id.text_view));
        } else if (A08 == 3) {
            A0V = C13989Tnp.A0V(DbT.A0B(this.A00), viewGroup, R.layout.promote_recycler_legal_info_footer_view);
            vmj = new VMM(A0V);
        } else {
            RuntimeException runtimeException = new RuntimeException();
            AnonymousClass0fD.A0A(-886857435, A03);
            throw runtimeException;
        }
        A0V.setTag(vmj);
        AnonymousClass0fD.A0A(510751137, A03);
        return A0V;
    }
}
