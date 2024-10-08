package X;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.ui.widget.searchedittext.SearchEditText;

/* renamed from: X.87D  reason: invalid class name */
public final class AnonymousClass87D implements View.OnFocusChangeListener, AnonymousClass8Z3, AnonymousClass8Z4, AnonymousClass87E {
    public int A00;
    public View A01;
    public TextView A02;
    public IgTextView A03;
    public C71662eb A04;
    public C71662eb A05;
    public C71662eb A06;
    public SearchEditText A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public final AnonymousClass87C A0B;
    public final AnonymousClass87A A0C;
    public final AnonymousClass87F A0D;
    public final int A0E;
    public final Context A0F;
    public final AnonymousClass80U A0G;

    public final void DzC(int i, int i2) {
        this.A0A = true;
        float f = (float) (this.A00 + this.A0E);
        C71662eb r0 = this.A06;
        r0.getClass();
        View A012 = r0.A01();
        C71662eb r02 = this.A04;
        r02.getClass();
        r02.A01().setY(((float) i2) - f);
        A012.setY((float) ((i2 - (A012.getHeight() - this.A03.getHeight())) / 2));
        if (this.A09) {
            A01(this);
            C71662eb r03 = this.A04;
            r03.getClass();
            View[] viewArr = {r03.A01()};
            C71392co r04 = C315596kB.A02;
            C294975nL.A04((C295005nO) null, viewArr, false);
        }
    }

    public static SearchEditText A00(AnonymousClass87D r1) {
        C71662eb r0 = r1.A06;
        r0.getClass();
        return (SearchEditText) r0.A01().requireViewById(R.id.canvas_text_view_input_text);
    }

    public static void A01(AnonymousClass87D r4) {
        C71662eb r0 = r4.A04;
        r0.getClass();
        if (!r0.A04()) {
            ((RecyclerView) r4.A04.A01()).setLayoutManager(new LinearLayoutManager(r4.A0F, 0, false));
        }
    }

    public final void A02() {
        C71662eb r0 = this.A06;
        r0.getClass();
        if (r0.A04()) {
            C315596kB.A08(new View[]{this.A06.A01()}, true);
        }
        C71662eb r02 = this.A05;
        r02.getClass();
        if (r02.A04()) {
            C315596kB.A08(new View[]{this.A05.A01()}, false);
        }
        C71662eb r03 = this.A04;
        r03.getClass();
        if (r03.A04()) {
            C315596kB.A08(new View[]{this.A04.A01()}, false);
        }
    }

    public final void A03() {
        if (this.A0A) {
            AnonymousClass87B r1 = this.A0B.A00;
            r1.A00.getClass();
            r1.A00.setBackgroundColor(0);
            r1.A00.setOnTouchListener((View.OnTouchListener) null);
            this.A08 = false;
            this.A0A = false;
            this.A07.clearFocus();
            this.A07.setOnFocusChangeListener((View.OnFocusChangeListener) null);
            SearchEditText searchEditText = this.A07;
            searchEditText.A0C = null;
            searchEditText.A0F = null;
            C71662eb r0 = this.A04;
            r0.getClass();
            if (r0.A04()) {
                C315596kB.A08(new View[]{this.A04.A01()}, false);
            }
            View view = this.A01;
            view.getClass();
            C71662eb r02 = this.A06;
            r02.getClass();
            View A012 = r02.A01();
            A012.setY((float) (((view.getHeight() - view.getPaddingBottom()) - A012.getHeight()) / 2));
        }
    }

    public final void Dir(SearchEditText searchEditText, int i, int i2) {
        C3509386y r2 = this.A0C.A00;
        AnonymousClass87G A012 = r2.A0H.A01();
        if (A012 == null || C3509386y.A01(A012)) {
            0kD.A01("CanvasDialController::onSearchQuerySelectionChanged", "Null dial element for onSearchQuerySelectionChanged");
        } else if (r2.A02(A012) instanceof C387549mO) {
            AnonymousClass7TH.A0S(searchEditText, i, i2);
        }
    }

    public final void onFocusChange(View view, boolean z) {
        if (z) {
            this.A0D.A00();
            C63183Ksq.A00(view);
            return;
        }
        0qQ.A0B(view, 0);
        0nA.A0N(view);
        this.A0D.A01();
    }

    public final void onSearchSubmitted(SearchEditText searchEditText, String str) {
        C3509386y r1 = this.A0C.A00;
        AnonymousClass87G A012 = r1.A0H.A01();
        A012.getClass();
        r1.A02(A012).A08();
    }

    public AnonymousClass87D(Context context, AnonymousClass3E6 r4, AnonymousClass87C r5, AnonymousClass87A r6, AnonymousClass80U r7) {
        this.A0F = context;
        this.A0D = new AnonymousClass87F(context, r4, this);
        this.A0G = r7;
        this.A0C = r6;
        this.A0B = r5;
        this.A0E = context.getResources().getDimensionPixelSize(R.dimen.account_discovery_bottom_gap);
    }

    public final void DMp() {
        A03();
        this.A0G.E3H(new Object());
    }

    public final void onSearchTextChanged(SearchEditText searchEditText, CharSequence charSequence, int i, int i2, int i3) {
        String charSequence2 = charSequence.toString();
        C3509386y r1 = this.A0C.A00;
        AnonymousClass87G A012 = r1.A0H.A01();
        A012.getClass();
        r1.A02(A012).A0D(charSequence2);
        this.A03.setText((CharSequence) null);
    }
}
