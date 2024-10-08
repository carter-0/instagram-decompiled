package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.3yk  reason: invalid class name and case insensitive filesystem */
public final class C258273yk {
    public View A00;
    public ViewGroup A01;
    public ViewGroup A02;
    public ViewGroup A03;
    public ViewGroup A04;
    public TextView A05;
    public TextView A06;
    public TextView A07;
    public TextView A08;
    public AnonymousClass3NM A09;
    public IgImageView A0A;
    public C252063oV A0B;
    public C252063oV A0C;
    public C252063oV A0D;
    public final C252063oV A0E;
    public final AnonymousClass0eM A0F = AnonymousClass1YB.A00(new C377219Kz(this, 24));
    public final AnonymousClass0eM A0G = AnonymousClass1YB.A00(new C377219Kz(this, 25));
    public final AnonymousClass0eM A0H = AnonymousClass1YB.A00(new C377219Kz(this, 26));
    public final AnonymousClass0eM A0I = AnonymousClass1YB.A00(new C377219Kz(this, 27));
    public final AnonymousClass0eM A0J = AnonymousClass1YB.A00(new C377219Kz(this, 28));

    public final void A02(AnonymousClass3W1 r4) {
        0qQ.A0B(r4, 0);
        AnonymousClass3NM r0 = this.A09;
        if (r0 != null) {
            r0.A03();
        }
        this.A09 = null;
        if (r4.A2G) {
            A01().setOnTouchListener((View.OnTouchListener) null);
            TextView textView = this.A08;
            if (textView != null) {
                textView.setOnClickListener((View.OnClickListener) null);
            }
            A00().setOnClickListener((View.OnClickListener) null);
            TextView textView2 = this.A07;
            if (textView2 != null) {
                textView2.setOnClickListener((View.OnClickListener) null);
            }
        }
        r4.A0f(false);
    }

    public final View A00() {
        View view = this.A00;
        if (view != null) {
            return view;
        }
        0qQ.A0F("endscreenBackdrop");
        throw AnonymousClass00P.createAndThrow();
    }

    public final ViewGroup A01() {
        ViewGroup viewGroup = this.A02;
        if (viewGroup != null) {
            return viewGroup;
        }
        0qQ.A0F("feedPreviewKeepWatchingButton");
        throw AnonymousClass00P.createAndThrow();
    }

    public C258273yk(ViewStub viewStub) {
        C252063oV A012 = 2b1.A01(viewStub, false, false);
        this.A0E = A012;
        A012.EeU(new C2607646y(this));
    }
}
