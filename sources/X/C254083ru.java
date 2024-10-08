package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.3ru  reason: invalid class name and case insensitive filesystem */
public final class C254083ru extends C249703kE implements C254093rv {
    public AnonymousClass6NS A00;
    public final FrameLayout A01;
    public final ProgressBar A02;
    public final TextView A03;
    public final C273694n2 A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C254083ru(View view) {
        super(view);
        0qQ.A0B(view, 1);
        View requireViewById = view.requireViewById(R.id.bloks_loader);
        0qQ.A07(requireViewById);
        this.A02 = (ProgressBar) requireViewById;
        View requireViewById2 = view.requireViewById(R.id.error_message);
        0qQ.A07(requireViewById2);
        this.A03 = (TextView) requireViewById2;
        View requireViewById3 = view.requireViewById(R.id.bloks_container);
        0qQ.A07(requireViewById3);
        FrameLayout frameLayout = (FrameLayout) requireViewById3;
        this.A01 = frameLayout;
        Context context = view.getContext();
        0qQ.A07(context);
        C273694n2 r0 = new C273694n2(context);
        this.A04 = r0;
        frameLayout.addView(r0);
    }

    public final void DJV(AnonymousClass6NS r4, C49599EzI ezI) {
        AnonymousClass6NS r0 = this.A00;
        if (r0 != r4) {
            if (r0 != null) {
                r0.A04();
            }
            this.A00 = r4;
            r4.A07(this.A04);
        }
        this.A02.setVisibility(8);
        this.A01.setVisibility(0);
        this.A03.setVisibility(8);
        ezI.A02.DbK(ezI.A01);
        C229382nI r1 = ezI.A00;
        r1.A05(new H5I(r1, this));
    }

    public final void DOJ(String str) {
        String A002 = AnonymousClass000.A00(2115);
        this.A02.setVisibility(8);
        this.A01.setVisibility(8);
        TextView textView = this.A03;
        textView.setVisibility(0);
        textView.setText(A002);
    }
}
