package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.NPo  reason: case insensitive filesystem */
public final class C68618NPo extends C232232tF {
    public final Context A00;
    public final OJT A01;

    public C68618NPo(Context context, OJT ojt) {
        0qQ.A0B(ojt, 2);
        this.A00 = context;
        this.A01 = ojt;
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TF.A1H(viewGroup, layoutInflater);
        return new C68021Myn(DbT.A0D(layoutInflater, viewGroup, R.layout.direct_channel_discovery_header_container, false));
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r11, C249703kE r12) {
        String str;
        String str2;
        C71956Oth oth = (C71956Oth) r11;
        C68021Myn myn = (C68021Myn) r12;
        boolean A1U = AnonymousClass7TF.A1U(0, oth, myn);
        View view = myn.A02;
        view.setSelected(false);
        IgTextView igTextView = myn.A05;
        C69374NkE nkE = C69374NkE.A0A;
        Integer num = nkE.A01;
        String str3 = null;
        if (num != null) {
            str = this.A00.getString(num.intValue());
        } else {
            str = null;
        }
        igTextView.setText(str);
        C71407Ok6.A00(view, 57, this);
        View view2 = myn.A00;
        view2.setSelected(A1U);
        IgTextView igTextView2 = myn.A03;
        C69374NkE nkE2 = C69374NkE.A06;
        Integer num2 = nkE2.A01;
        if (num2 != null) {
            str2 = this.A00.getString(num2.intValue());
        } else {
            str2 = null;
        }
        igTextView2.setText(str2);
        C71407Ok6.A00(view2, 58, this);
        View view3 = myn.A01;
        view3.setSelected(false);
        IgTextView igTextView3 = myn.A04;
        C69374NkE nkE3 = C69374NkE.A09;
        Integer num3 = nkE3.A01;
        if (num3 != null) {
            str3 = this.A00.getString(num3.intValue());
        }
        igTextView3.setText(str3);
        C71407Ok6.A00(view3, 59, this);
        C69374NkE nkE4 = oth.A00;
        boolean z = true;
        view2.setSelected(AnonymousClass7TF.A1W(nkE2, nkE4));
        view.setSelected(AnonymousClass7TF.A1W(nkE, nkE4));
        if (nkE3 != nkE4) {
            z = false;
        }
        view3.setSelected(z);
    }

    public final Class modelClass() {
        return C71956Oth.class;
    }
}
