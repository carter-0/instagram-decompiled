package X;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;
import java.util.List;

/* renamed from: X.Dg1  reason: case insensitive filesystem */
public final class C46498Dg1 {
    public Context A00;
    public View A01;
    public AnonymousClass2k4 A02 = AnonymousClass2k4.DEFAULT;
    public AnonymousClass6ZA A03;
    public C46448DfA A04;
    public boolean A05;
    public boolean A06 = true;
    public boolean A07 = true;
    public final 0lg A08;
    public final List A09 = AnonymousClass7TE.A1C();

    public C46498Dg1(Context context, 0lg r4) {
        AnonymousClass7TF.A1B(context, 1, r4);
        this.A00 = context;
        this.A08 = r4;
    }

    public final void A02(View.OnClickListener onClickListener, int i) {
        0qQ.A0B(onClickListener, 1);
        this.A09.add(new C67293MlS(onClickListener, 1.0f, i, 2Yu.A03(this.A00)));
    }

    public final void A04(View.OnClickListener onClickListener, int i) {
        0qQ.A0B(onClickListener, 1);
        this.A09.add(new C67293MlS(onClickListener, 1.0f, i, 2Yu.A0H(this.A00, R.attr.igds_color_primary_text)));
    }

    public final void A05(View.OnClickListener onClickListener, String str, float f) {
        0qQ.A0B(str, 0);
        int i = R.attr.igds_color_error_or_destructive;
        Context context = this.A00;
        Object systemService = context.getSystemService("accessibility");
        if ((systemService instanceof AccessibilityManager) && 2eO.A02((AccessibilityManager) systemService, true) && AnonymousClass1GD.A03()) {
            i = R.attr.igds_color_gradient_pink;
        }
        this.A09.add(new C67293MlS(onClickListener, str, f, 2Yu.A0H(context, i)));
    }

    public final void A06(View.OnClickListener onClickListener, String str, int i) {
        0qQ.A0B(str, 0);
        this.A09.add(new C67293MlS(onClickListener, str, 2Yu.A07(this.A00), i));
    }

    public final void A09(String str) {
        this.A04 = new C46448DfA((CharSequence) null, str, (CharSequence) null);
    }

    public final void A0D(String str, String str2) {
        this.A04 = new C46448DfA(str, str2, (CharSequence) null);
    }

    public final void A03(View.OnClickListener onClickListener, int i) {
        this.A09.add(new C67293MlS(onClickListener, 1.0f, i, 2Yu.A0D(this.A00)));
    }

    public final void A07(ImageUrl imageUrl) {
        C46448DfA dfA = this.A04;
        if (dfA != null && imageUrl != null) {
            dfA.A0B = imageUrl;
        }
    }

    public final void A08(String str) {
        this.A04 = new C46448DfA((CharSequence) str);
    }

    public static C46498Dg1 A00(Context context, AnonymousClass0eM r3) {
        return new C46498Dg1(context, (0lg) r3.getValue());
    }

    public final void A01(int i) {
        this.A04 = C46448DfA.A00(i);
    }

    public final void A0A(String str, View.OnClickListener onClickListener) {
        AnonymousClass7TG.A1N(str, onClickListener);
        A05(onClickListener, str, 1.0f);
    }

    public final void A0B(String str, View.OnClickListener onClickListener) {
        AnonymousClass7TG.A1N(str, onClickListener);
        this.A09.add(new C67293MlS(onClickListener, str, 1.0f, 2Yu.A0D(this.A00)));
    }

    public final void A0C(String str, View.OnClickListener onClickListener) {
        AnonymousClass7TG.A1N(str, onClickListener);
        this.A09.add(new C67293MlS(onClickListener, str, 1.0f, 2Yu.A07(this.A00)));
    }
}
