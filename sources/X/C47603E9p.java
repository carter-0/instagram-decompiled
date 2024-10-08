package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import com.instagram.android.R;
import com.instagram.user.model.User;

/* renamed from: X.E9p  reason: case insensitive filesystem */
public final class C47603E9p extends C231632rz {
    public final E4j A00;
    public final AnonymousClass0iw A01;

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r2, Object obj, Object obj2) {
        r2.A7U(0);
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public C47603E9p(E4j e4j, AnonymousClass0iw r2) {
        this.A01 = r2;
        this.A00 = e4j;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = AnonymousClass0fD.A03(-1368348544);
        C49536ExI exI = (C49536ExI) DbT.A0o(view);
        C49445Evm evm = (C49445Evm) obj;
        AnonymousClass0iw r3 = this.A01;
        E4j e4j = this.A00;
        User user = evm.A01;
        ? r1 = exI.A01;
        F44.A01(r1.getContext(), r3, r1, user);
        DbU.A1H(exI.A00, user);
        C71662eb r32 = exI.A02;
        r32.A01().setBackgroundDrawable(AnonymousClass3JT.A07(view.getContext(), R.color.badge_color));
        ((CompoundButton) r32.A01()).setChecked(evm.A00);
        FPE.A01(view, 0, evm, e4j);
        AnonymousClass0fD.A0A(255625654, A03);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = AnonymousClass0fD.A03(2041397109);
        ViewGroup viewGroup2 = (ViewGroup) DbT.A0C(DbV.A0D(viewGroup), viewGroup, R.layout.row_account_linking_child_account_for_selection);
        viewGroup2.setTag(new C49536ExI(viewGroup2));
        AnonymousClass0fD.A0A(-974288455, A03);
        return viewGroup2;
    }
}
