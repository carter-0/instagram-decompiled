package X;

import android.content.Context;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.recyclerview.ViewModelListUpdate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.OMu  reason: case insensitive filesystem */
public final class C70822OMu {
    public AnonymousClass7L0 A00;
    public C3260475e A01;
    public Integer A02;
    public final View A03;
    public final RecyclerView A04;
    public final View A05;
    public final AnonymousClass0iw A06;
    public final AnonymousClass2t9 A07;
    public final C72657PEk A08;

    /* JADX WARNING: type inference failed for: r0v3, types: [X.2tF, java.lang.Object] */
    public C70822OMu(View view, View view2, RecyclerView recyclerView, AnonymousClass0iw r9, AnonymousClass7L0 r10, C3260475e r11, Integer num) {
        this.A03 = view;
        this.A05 = view2;
        this.A04 = recyclerView;
        this.A02 = num;
        this.A00 = r10;
        this.A01 = r11;
        this.A06 = r9;
        C72657PEk pEk = new C72657PEk(this);
        this.A08 = pEk;
        C71439Oke.A01(view, 8, this);
        Context context = recyclerView.getContext();
        AnonymousClass2tC A002 = AnonymousClass2t9.A00(context);
        A002.A01(new NO6(pEk));
        A002.A01(new NON(r9, pEk));
        A002.A01(new Object());
        A002.A09 = true;
        AnonymousClass2t9 A003 = A002.A00();
        this.A07 = A003;
        recyclerView.setAdapter(A003);
        DbU.A15(context, recyclerView, 1, false);
        recyclerView.setItemAnimator((AnonymousClass3AS) null);
        AnonymousClass7L0 r0 = this.A00;
        if (r0 != null) {
            this.A00 = r0;
            this.A04.setBackgroundColor(r0.A01);
        }
        Integer num2 = this.A02;
        if (num2 != null) {
            A00(num2.intValue());
        }
    }

    public final void A01(List list) {
        0qQ.A0B(list, 0);
        ViewModelListUpdate A0R = DbS.A0R();
        ArrayList A1C = AnonymousClass7TE.A1C();
        ArrayList A1C2 = AnonymousClass7TE.A1C();
        ArrayList A1C3 = AnonymousClass7TE.A1C();
        ArrayList A1C4 = AnonymousClass7TE.A1C();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C3260875i r5 = (C3260875i) it.next();
            Integer A032 = r5.A03();
            if (A032 != null && A032.intValue() == 5) {
                A1C.add(new N5S(r5));
            } else if (r5 instanceof AnonymousClass77I) {
                A1C2.add(new N5U((AnonymousClass77I) r5));
            } else {
                AnonymousClass7OR A022 = r5.A02();
                if (A022 == AnonymousClass7OR.MENTION) {
                    A1C3.add(new N5S(r5));
                } else if (A022 == AnonymousClass7OR.ACTION) {
                    A1C4.add(new N5S(r5));
                }
            }
        }
        A0R.A01(A1C);
        A0R.A01(A1C2);
        A0R.A01(A1C3);
        if (A1C4.size() > 2 && list.size() > A1C4.size()) {
            A0R.A00(new N5T());
        }
        A0R.A01(A1C4);
        this.A07.A05(A0R);
        if (A0R.A00.size() > 0) {
            this.A03.setVisibility(0);
        } else {
            this.A03.setVisibility(8);
        }
    }

    public final void A00(int i) {
        this.A02 = Integer.valueOf(i);
        View view = this.A05;
        0qQ.A0C(view, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int dimensionPixelSize = (int) (4.5d * ((double) DbU.A05(this.A04).getDimensionPixelSize(R.dimen.add_to_story_dual_destination_share_sheet_story_row_height)));
        if (i > dimensionPixelSize) {
            i = dimensionPixelSize;
        }
        constraintLayout.setMaxHeight(i);
    }
}
