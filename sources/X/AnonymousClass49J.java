package X;

import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.49J  reason: invalid class name */
public final class AnonymousClass49J extends C249703kE implements AnonymousClass3P0 {
    public TextView A00;
    public C376499If A01;
    public View A02;
    public final View A03;
    public final ViewStub A04;
    public final boolean A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass49J(View view, boolean z) {
        super(view);
        0qQ.A0B(view, 1);
        this.A03 = view;
        this.A05 = z;
        this.A04 = (ViewStub) view.findViewById(R.id.row_feed_view_all_comments_stub);
    }

    public final void DEA() {
    }

    public final void A00() {
        View inflate;
        TextView textView;
        ViewStub viewStub = this.A04;
        if (viewStub == null) {
            inflate = this.A03;
        } else if (this.A02 == null) {
            inflate = viewStub.inflate();
            this.A02 = inflate;
            if (inflate == null) {
                textView = null;
                this.A00 = textView;
            }
        } else {
            return;
        }
        textView = (TextView) inflate.findViewById(R.id.row_feed_view_all_comments_text);
        this.A00 = textView;
    }

    public final void A01(C376499If r4) {
        if (r4 != null) {
            TextView textView = this.A00;
            if (textView != null) {
                textView.setVisibility(0);
                textView.setText((CharSequence) r4.A03);
                textView.setMovementMethod(LinkMovementMethod.getInstance());
                textView.setLongClickable(false);
                AnonymousClass0fU.A00(new AnonymousClass5DS(textView, r4), textView);
            }
            TextView textView2 = this.A00;
            if (textView2 != null) {
                2eS.A04(textView2, AnonymousClass05K.A01);
                if (this.A05) {
                    2eQ.A04(textView2, 4);
                }
            }
        }
    }

    public final void DEB() {
        AnonymousClass3W1 r0;
        C376499If r02 = this.A01;
        if (r02 != null && (r0 = (AnonymousClass3W1) r02.A02) != null && r0.A3E) {
            A00();
            A01(this.A01);
        }
    }

    public final void DEC(float f) {
        AnonymousClass3W1 r0;
        TextView textView;
        C376499If r02 = this.A01;
        if (r02 != null && (r0 = (AnonymousClass3W1) r02.A02) != null && r0.A3E && (textView = this.A00) != null) {
            textView.setAlpha(f);
        }
    }
}
