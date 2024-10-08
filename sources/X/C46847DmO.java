package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.instagram.android.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.DmO  reason: case insensitive filesystem */
public final class C46847DmO extends 2Rw {
    public int A00;
    public int A01;
    public HashMap A02;
    public List A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public final Context A08;
    public final 2el A09;
    public final C47447E2t A0A;

    public final C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        0qQ.A0B(viewGroup, 0);
        return new C46917DnX(DbU.A09(LayoutInflater.from(this.A08), viewGroup, R.layout.pill_container, false));
    }

    /* JADX WARNING: type inference failed for: r10v11, types: [X.0r1, java.lang.Object] */
    public final void onBindViewHolder(C249703kE r27, int i) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        Long A10;
        C249703kE r0 = r27;
        0qQ.A0B(r0, 0);
        LinearLayout linearLayout = ((C46917DnX) r0).A00;
        linearLayout.removeAllViews();
        Context context = this.A08;
        View inflate = LayoutInflater.from(context).inflate(R.layout.pill_container_row, linearLayout, false);
        String A002 = C273654mx.A00(1);
        0qQ.A0C(inflate, A002);
        ViewGroup viewGroup = (ViewGroup) inflate;
        List list = this.A03;
        if (list != null) {
            ArrayList A1C = AnonymousClass7TE.A1C();
            for (Object next : list) {
                C51954G8x g8x = (C51954G8x) next;
                if (!(g8x.getName() == null || g8x.B6N() == null)) {
                    A1C.add(next);
                }
            }
            int size = A1C.size();
            int i2 = 0;
            while (true) {
                boolean z = true;
                while (i2 < size) {
                    C51954G8x g8x2 = (C51954G8x) A1C.get(i2);
                    if (g8x2 != null) {
                        boolean z2 = false;
                        View inflate2 = LayoutInflater.from(context).inflate(R.layout.subinterest_pill, viewGroup, false);
                        0qQ.A0C(inflate2, A002);
                        TextView textView = (TextView) AnonymousClass7TF.A0G(inflate2, R.id.pill_text);
                        textView.setText(g8x2.getName());
                        String B6N = g8x2.B6N();
                        if (!(B6N == null || (A10 = AnonymousClass7TE.A10(B6N)) == null)) {
                            ? obj = new Object();
                            Boolean bool = (Boolean) this.A02.get(A10);
                            if (bool != null) {
                                z2 = bool.booleanValue();
                            }
                            obj.A00 = z2;
                            int i3 = R.attr.igds_color_primary_text;
                            if (z2) {
                                i3 = R.attr.igds_color_selected_pill_text;
                            }
                            DbT.A17(context, textView, 2Yu.A0H(context, i3));
                            inflate2.setSelected(obj.A00);
                            AnonymousClass0fU.A00(new FOW(4, context, inflate2, textView, g8x2, this, A10, obj), inflate2);
                        }
                        if (z) {
                            ViewGroup.LayoutParams layoutParams = inflate2.getLayoutParams();
                            if ((layoutParams instanceof LinearLayout.LayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                                marginLayoutParams.setMarginStart(0);
                            }
                        } else {
                            inflate2.measure(View.MeasureSpec.makeMeasureSpec(this.A01, AnonymousClass972.MUTABLE_FLAG_MASK), 0);
                            viewGroup.measure(View.MeasureSpec.makeMeasureSpec(this.A01, AnonymousClass972.MUTABLE_FLAG_MASK), 0);
                            int measuredWidth = inflate2.getMeasuredWidth();
                            int measuredWidth2 = viewGroup.getMeasuredWidth();
                            int marginStart = DbX.A0H(inflate2).getMarginStart();
                            int i4 = this.A01;
                            if (measuredWidth + measuredWidth2 + marginStart > i4) {
                                if (!this.A06) {
                                    viewGroup.measure(View.MeasureSpec.makeMeasureSpec(i4, AnonymousClass972.MUTABLE_FLAG_MASK), 0);
                                    int measuredWidth3 = (i4 - viewGroup.getMeasuredWidth()) / 2;
                                    0nA.A0Z(viewGroup, measuredWidth3);
                                    0nA.A0b(viewGroup, measuredWidth3);
                                }
                                linearLayout.addView(viewGroup);
                                View inflate3 = LayoutInflater.from(context).inflate(R.layout.pill_container_row, linearLayout, false);
                                0qQ.A0C(inflate3, A002);
                                viewGroup = (ViewGroup) inflate3;
                            }
                        }
                        viewGroup.addView(inflate2);
                        String name = g8x2.getName();
                        String B6N2 = g8x2.B6N();
                        if (!(name == null || B6N2 == null)) {
                            this.A09.A05(inflate2, DbU.A0a(new FZP(this.A0A), AnonymousClass30Y.A00(name, (Object) null, B6N2)));
                        }
                        i2++;
                        if (i2 == size) {
                            if (!this.A06) {
                                int i5 = this.A01;
                                viewGroup.measure(View.MeasureSpec.makeMeasureSpec(i5, AnonymousClass972.MUTABLE_FLAG_MASK), 0);
                                int measuredWidth4 = (i5 - viewGroup.getMeasuredWidth()) / 2;
                                0nA.A0Z(viewGroup, measuredWidth4);
                                0nA.A0b(viewGroup, measuredWidth4);
                            }
                            linearLayout.addView(viewGroup);
                        }
                        z = false;
                    }
                }
                return;
            }
        }
        0qQ.A0F("interestList");
        throw AnonymousClass00P.createAndThrow();
    }

    public C46847DmO(Context context, 2el r3, C47447E2t e2t) {
        this.A08 = context;
        this.A0A = e2t;
        this.A09 = r3;
        this.A02 = AnonymousClass7TE.A1E();
    }

    public final int getItemCount() {
        int A032 = AnonymousClass0fD.A03(-119868321);
        int i = this.A00;
        AnonymousClass0fD.A0A(710205326, A032);
        return i;
    }

    public C46847DmO() {
    }
}
