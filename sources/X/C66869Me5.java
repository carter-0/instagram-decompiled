package X;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.direct.ui.countertextview.CounterTextView;

/* renamed from: X.Me5  reason: case insensitive filesystem */
public final class C66869Me5 extends C249703kE {
    public C2607246u A00;
    public AnonymousClass7E5 A01;
    public final LayoutInflater A02;
    public final View A03;
    public final LinearLayout A04;
    public final LinearLayout A05;
    public final LinearLayout A06;
    public final TextView A07;
    public final AnonymousClass0iw A08;
    public final AnonymousClass7D5 A09;
    public final AnonymousClass7EE A0A = new Object();
    public final C332807Wl A0B;
    public final CounterTextView A0C;
    public final boolean A0D;

    /* JADX WARNING: type inference failed for: r0v15, types: [java.lang.Object, X.7EE] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66869Me5(LayoutInflater layoutInflater, View view, AnonymousClass0iw r4, AnonymousClass7D5 r5, C332807Wl r6, boolean z) {
        super(view);
        C51972G9s.A1B(view, r4);
        0qQ.A0B(r5, 6);
        this.A03 = view;
        this.A02 = layoutInflater;
        this.A0D = z;
        this.A08 = r4;
        this.A0B = r6;
        this.A09 = r5;
        this.A04 = (LinearLayout) AnonymousClass7TF.A0F(view, R.id.message_single_reaction_pill_container);
        this.A05 = (LinearLayout) AnonymousClass7TF.A0F(view, R.id.reaction);
        this.A06 = (LinearLayout) AnonymousClass7TF.A0F(view, R.id.reactors);
        this.A07 = AnonymousClass7TE.A0d(view, R.id.reactors_number);
        this.A0C = (CounterTextView) view.findViewById(R.id.reactors_number_counter);
    }
}
