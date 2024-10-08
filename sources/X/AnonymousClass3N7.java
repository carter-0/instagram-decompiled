package X;

import android.view.View;
import android.view.ViewParent;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.3N7  reason: invalid class name */
public final class AnonymousClass3N7 extends AnonymousClass3N8 {
    public final View A00;
    public final TextView A01;
    public final C252063oV A02 = 2b1.A01(this.A00.requireViewById(R.id.subtitle), false, false);
    public final C252063oV A03 = 2b1.A01(this.A00.requireViewById(R.id.plus_cobroadcaster_count), false, false);
    public final View A04;
    public final C252063oV A05;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass3N7(android.view.View r5) {
        /*
            r4 = this;
            r0 = 1
            X.0qQ.A0B(r5, r0)
            android.content.Context r1 = r5.getContext()
            X.0qQ.A07(r1)
            android.content.res.Resources r0 = r5.getResources()
            X.0qQ.A07(r0)
            r4.<init>(r1, r0)
            r4.A00 = r5
            r0 = 2131442874(0x7f0b3cba, float:1.85078E38)
            android.view.View r0 = r5.requireViewById(r0)
            X.0qQ.A07(r0)
            r4.A04 = r0
            android.view.View r1 = r4.A00
            r0 = 2131443595(0x7f0b3f8b, float:1.8509263E38)
            android.view.View r0 = r1.requireViewById(r0)
            X.0qQ.A07(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r4.A01 = r0
            android.view.View r1 = r4.A00
            r0 = 2131442048(0x7f0b3980, float:1.8506125E38)
            android.view.View r1 = r1.requireViewById(r0)
            r0 = 0
            r3 = 0
            X.3oV r1 = X.2b1.A01(r1, r3, r3)
            r4.A02 = r1
            android.view.View r2 = r4.A00
            r1 = 2131437781(0x7f0b28d5, float:1.849747E38)
            android.view.View r1 = r2.requireViewById(r1)
            X.3oV r1 = X.2b1.A01(r1, r3, r3)
            r4.A03 = r1
            android.view.View r2 = r4.A00
            r1 = 2131437123(0x7f0b2643, float:1.8496136E38)
            android.view.View r1 = r2.findViewById(r1)
            if (r1 == 0) goto L_0x0062
            X.3oV r0 = X.2b1.A01(r1, r3, r3)
        L_0x0062:
            r4.A05 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3N7.<init>(android.view.View):void");
    }

    public final View A00() {
        return this.A00;
    }

    public final View A01() {
        return this.A04;
    }

    public final TextView A03() {
        return (TextView) this.A02.getView();
    }

    public final TextView A04() {
        return this.A01;
    }

    public final TextView A05() {
        TextView textView;
        C252063oV r0 = this.A03;
        if (r0 != null) {
            textView = (TextView) r0.getView();
        } else {
            textView = null;
        }
        0qQ.A0A(textView);
        return textView;
    }

    public final C252063oV A06() {
        return this.A03;
    }

    public final C252063oV A07() {
        return this.A05;
    }

    public final boolean A08() {
        ViewParent viewParent;
        View findViewById = this.A00.findViewById(R.id.subtitle);
        if (findViewById != null) {
            viewParent = findViewById.getParent();
        } else {
            viewParent = null;
        }
        if (this.A02.CVM() || viewParent != null) {
            return true;
        }
        return false;
    }
}
