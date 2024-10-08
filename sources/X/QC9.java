package X;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.instagram.android.R;
import java.security.Signature;

public final class QC9 extends 0SM implements C13783Tgy, C13734Tg6 {
    public View A00;
    public C13608Tda A01;
    public QD2 A02;
    public C13783Tgy A03;
    public C13735Tg7 A04;

    /* JADX WARNING: type inference failed for: r3v0, types: [X.07Z, X.0SM, java.lang.Object, X.QC9] */
    public final void onViewCreated(View view, Bundle bundle) {
        Window window;
        Dialog dialog = this.A01;
        if (!(dialog == null || (window = dialog.getWindow()) == null)) {
            window.setStatusBarColor(0);
        }
        View requireViewById = view.requireViewById(R.id.progress_bar_layout);
        this.A00 = requireViewById;
        requireViewById.setVisibility(8);
        C11651Sdt.A01(this, this.A02.A00, C11652Sdu.A00(this, 10), 20);
    }

    public final void AVU(Bundle bundle, C11330SNj sNj, Throwable th) {
        C13735Tg7 tg7 = this.A04;
        if (tg7 != null) {
            if (th == null) {
                tg7.Cx0(new C10586Rug(bundle, sNj, (Signature) null));
            } else {
                tg7.Cwz(th);
            }
        }
        A08();
    }

    public final C11330SNj BLL() {
        return this.A03.BLL();
    }

    public final void DG8(Bundle bundle, C11330SNj sNj) {
        this.A03.DG8(bundle, sNj);
    }

    public final void DG9(Throwable th) {
        this.A03.DG9(th);
    }

    public final void EPF(C13735Tg7 tg7) {
        this.A04 = tg7;
    }

    public final Dialog A0F(Bundle bundle) {
        Dialog A0F = QC9.super.A0F(bundle);
        A0F.setOnKeyListener(new SVJ(this, 1));
        return A0F;
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [X.07Z, X.07g, androidx.fragment.app.Fragment, X.0SM, java.lang.Object, X.QC9] */
    public final void onCreate(Bundle bundle) {
        C13783Tgy sul;
        int A022 = AnonymousClass0fD.A02(-250985190);
        QC9.super.onCreate(bundle);
        A09(2, R.style.FBPayAuthContainerFullScreenDialog);
        2YN A0L = JTO.A0L(AnonymousClass2E0.A03().A00(), this);
        this.A02 = A0L.A00(QD2.class);
        QDE A002 = A0L.A00(QDE.class);
        String A0l = DbU.A0l(requireArguments(), "AUTH_METHOD_TYPE");
        QD2 qd2 = this.A02;
        Bundle requireArguments = requireArguments();
        if ("PIN".equalsIgnoreCase(A0l) || "BIO_OR_PIN".equalsIgnoreCase(A0l)) {
            sul = new C12453Sul(requireArguments, A002, qd2);
        } else if ("CSC".equalsIgnoreCase(A0l) || "PAYPAL_ACCESS_TOKEN".equalsIgnoreCase(A0l)) {
            sul = new C12452Suk(requireArguments, qd2);
        } else if ("THREE_DS".equalsIgnoreCase(A0l)) {
            sul = new C12450Sui(requireArguments, qd2);
        } else if ("SDC".equalsIgnoreCase(A0l)) {
            sul = new C12451Suj(requireArguments, qd2);
        } else {
            throw AnonymousClass7TF.A0W("Not yet Impl! : ", A0l);
        }
        this.A03 = sul;
        C11651Sdt.A01(this, this.A02.A02, C11652Sdu.A00(this, 7), 20);
        C11651Sdt.A01(this, this.A02.A01, C11652Sdu.A00(this, 8), 20);
        C11651Sdt.A01(this, A002.A05, C11652Sdu.A00(this, 9), 20);
        AnonymousClass0fD.A09(1317670437, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1205870356);
        View A0C = DbT.A0C(layoutInflater, viewGroup, R.layout.auth_container);
        AnonymousClass0fD.A09(1036948479, A022);
        return A0C;
    }
}
