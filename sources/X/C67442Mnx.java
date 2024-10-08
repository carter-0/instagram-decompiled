package X;

import android.content.Context;
import android.text.format.DateUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.instagram.android.R;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Mnx  reason: case insensitive filesystem */
public final class C67442Mnx {
    public final C252063oV A00;
    public final AnonymousClass0eM A01;
    public final AnonymousClass0eM A02;
    public final AnonymousClass0eM A03;
    public final AnonymousClass0eM A04 = AnonymousClass1YB.A00(new C73914Plp(this, 6));
    public final AnonymousClass0eM A05 = AnonymousClass1YB.A00(new C73914Plp(this, 7));
    public final AnonymousClass0eM A06 = AnonymousClass1YB.A00(new C73914Plp(this, 8));
    public final List A07;

    public static final View A00(C67442Mnx mnx) {
        return mnx.A00.getView();
    }

    public final void A01(long j) {
        DbW.A0B(this.A00.getView(), R.id.voice_message_bar_timer).setText(DateUtils.formatElapsedTime(TimeUnit.MILLISECONDS.toSeconds(j)));
    }

    public final void A02(boolean z) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        int i = 0;
        this.A00.getView().setVisibility(DbW.A01(z ? 1 : 0));
        if (z) {
            i = DbX.A07(this.A06);
        }
        Iterator it = this.A07.iterator();
        while (it.hasNext()) {
            View A0H = JTO.A0H(it);
            ViewGroup.LayoutParams layoutParams = A0H.getLayoutParams();
            if (!(!(layoutParams instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams) == null || marginLayoutParams2.topMargin == i)) {
                marginLayoutParams2.topMargin = i;
                A0H.setLayoutParams(marginLayoutParams2);
            }
        }
        View A0c = AnonymousClass7TE.A0c(this.A01);
        if (A0c != null) {
            ViewGroup.LayoutParams layoutParams2 = A0c.getLayoutParams();
            if ((layoutParams2 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2) != null && marginLayoutParams.topMargin != i) {
                marginLayoutParams.topMargin = i;
                A0c.setLayoutParams(marginLayoutParams);
            }
        }
    }

    public final void A03(boolean z) {
        View A062;
        Context context;
        int i;
        AnonymousClass0eM r2 = this.A04;
        ImageView A0Z = JTR.A0Z(r2);
        if (z) {
            A0Z.setImageDrawable(JTO.A0D(this.A03));
            A062 = AnonymousClass7TH.A06(r2);
            context = this.A00.getView().getContext();
            i = 2131976714;
        } else {
            A0Z.setImageDrawable(JTO.A0D(this.A02));
            A062 = AnonymousClass7TH.A06(r2);
            context = this.A00.getView().getContext();
            i = 2131976713;
        }
        DbU.A12(context, A062, i);
    }

    public C67442Mnx(2dZ r3, C252063oV r4, List list) {
        this.A07 = list;
        this.A00 = r4;
        this.A01 = AnonymousClass1YB.A00(new C73914Plp(r3, 3));
        this.A03 = AnonymousClass1YB.A00(new C73914Plp(this, 5));
        this.A02 = AnonymousClass1YB.A00(new C73914Plp(this, 4));
    }
}
