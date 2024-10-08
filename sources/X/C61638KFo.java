package X;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.ui.widget.base.AspectRatioFrameLayout;

/* renamed from: X.KFo  reason: case insensitive filesystem */
public final class C61638KFo extends C232222tE {
    public final Context A00;
    public final AnonymousClass0iw A01;
    public final C63680L2q A02;

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        View A0D = DbT.A0D(DbX.A0E(viewGroup), viewGroup, R.layout.layout_iglive_suggested_live_thumbnail, false);
        A0D.setTag(new C60655Jp2(A0D));
        Object tag = A0D.getTag();
        if (tag instanceof C60655Jp2) {
            return (C249703kE) tag;
        }
        return null;
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r11, C249703kE r12) {
        C61170JyM jyM = (C61170JyM) r11;
        C60655Jp2 jp2 = (C60655Jp2) r12;
        AnonymousClass7TF.A1H(jyM, jp2);
        Context context = this.A00;
        AnonymousClass0iw r2 = this.A01;
        C63680L2q l2q = this.A02;
        int i = 0;
        int A03 = DbW.A03(0, context, r2);
        AspectRatioFrameLayout aspectRatioFrameLayout = jp2.A04;
        0nA.A0V(aspectRatioFrameLayout, jyM.A01);
        String str = jyM.A06;
        Integer valueOf = Integer.valueOf(jyM.A02);
        aspectRatioFrameLayout.setContentDescription(DbV.A0u(context, str, valueOf, 2131965375));
        aspectRatioFrameLayout.setAspectRatio(0.643f);
        LY7.A00(aspectRatioFrameLayout, 62, l2q, jyM);
        jp2.A02.setText(C253673rC.A03(AnonymousClass7TF.A0A(context), valueOf));
        jp2.A01.getViewTreeObserver().addOnPreDrawListener(new LZ3(A03, jp2, jyM));
        jp2.A03.setUrl(jyM.A03, r2);
        String str2 = jyM.A07;
        boolean isEmpty = TextUtils.isEmpty(str2);
        IgTextView igTextView = jp2.A00;
        if (!isEmpty) {
            igTextView.setText(str2);
        } else {
            igTextView.setText((CharSequence) null);
            i = 8;
        }
        igTextView.setVisibility(i);
    }

    public final Class modelClass() {
        return C61170JyM.class;
    }

    public C61638KFo(Context context, AnonymousClass0iw r2, C63680L2q l2q) {
        this.A00 = context;
        this.A01 = r2;
        this.A02 = l2q;
    }
}
