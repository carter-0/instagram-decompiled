package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.ui.widget.spinner.SpinnerImageView;

/* renamed from: X.3ux  reason: invalid class name and case insensitive filesystem */
public final class C255933ux extends C249703kE {
    public final View A00;
    public final SpinnerImageView A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C255933ux(View view) {
        super(view);
        0qQ.A0B(view, 1);
        this.A00 = view;
        View requireViewById = view.requireViewById(R.id.loading_spinner_view);
        0qQ.A07(requireViewById);
        SpinnerImageView spinnerImageView = (SpinnerImageView) requireViewById;
        this.A01 = spinnerImageView;
        spinnerImageView.setLoadingStatus(C255943uy.LOADING);
    }

    public final void A00(C228112ko r3) {
        SpinnerImageView spinnerImageView = this.A01;
        spinnerImageView.setLoadingStatus(C255943uy.SUCCESS);
        spinnerImageView.setOnClickListener((View.OnClickListener) null);
        if (r3.CJl()) {
            spinnerImageView.setLoadingStatus(C255943uy.FAILED);
            AnonymousClass0fU.A00(new C18856W9b(r3, this), spinnerImageView);
        } else if (r3.CKZ()) {
            spinnerImageView.setLoadingStatus(C255943uy.LOADING);
        }
    }
}
