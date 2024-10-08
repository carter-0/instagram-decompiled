package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.7Dq  reason: invalid class name and case insensitive filesystem */
public final class C328137Dq implements C328007Db {
    public float A00;
    public float A01;
    public int A02;
    public View A03;
    public C71662eb A04;
    public C252063oV A05;
    public C66645MaE A06;
    public boolean A07;
    public final View A08;
    public final ViewStub A09;
    public final C328167Dt A0A;
    public final AnonymousClass9HC A0B;

    public final void A00(TextView textView) {
        C252063oV r2 = this.A05;
        if (!r2.CVM()) {
            View view = this.A08;
            View view2 = textView;
            if (textView == null) {
                view2 = r2.getView();
            }
            this.A03 = view2;
            if (view2 != null) {
                this.A07 = 0mk.A02(view.getContext());
                int dimensionPixelSize = view.getResources().getDimensionPixelSize(R.dimen.direct_row_message_sidebar_width);
                int i = dimensionPixelSize;
                if (this.A07) {
                    i = -dimensionPixelSize;
                }
                this.A02 = i;
                ViewGroup.LayoutParams layoutParams = this.A03.getLayoutParams();
                layoutParams.width = dimensionPixelSize;
                this.A03.setLayoutParams(layoutParams);
                this.A03.setTranslationX((float) this.A02);
                if (((Boolean) this.A0B.A0a.getValue()).booleanValue()) {
                    this.A03.setVisibility(8);
                }
            }
        }
    }

    public final View BJd() {
        return this.A08;
    }

    public C328137Dq(ViewGroup viewGroup, 2cp r4, AnonymousClass9HC r5) {
        this.A08 = viewGroup;
        this.A0B = r5;
        ViewStub viewStub = (ViewStub) viewGroup.findViewById(R.id.message_status_stub);
        this.A09 = viewStub;
        this.A05 = 2b1.A01(viewStub, false, false);
        this.A04 = new C71662eb((ViewStub) viewGroup.findViewById(R.id.action_icon_stub));
        this.A0A = new C328167Dt(r4, new C328147Dr(this));
    }
}
