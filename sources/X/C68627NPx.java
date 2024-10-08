package X;

import android.app.Activity;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.NPx  reason: case insensitive filesystem */
public final class C68627NPx extends C232232tF {
    public final Activity A00;
    public final AnonymousClass4DH A01;
    public final UserSession A02;

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        JTQ.A1L(viewGroup, layoutInflater);
        return new C68041Mz8(this.A00, DbT.A0D(layoutInflater, viewGroup, R.layout.direct_inbox_campaign_thread_item, false), this.A01, this.A02);
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r7, C249703kE r8) {
        Activity activity;
        int i;
        Ou6 ou6 = (Ou6) r7;
        C68041Mz8 mz8 = (C68041Mz8) r8;
        boolean A1U = AnonymousClass7TF.A1U(0, ou6, mz8);
        mz8.A08.setUrl(ou6.A03, mz8.A02);
        IgTextView igTextView = mz8.A04;
        igTextView.setText(ou6.A04);
        IgTextView igTextView2 = mz8.A06;
        igTextView2.setText(ou6.A01);
        if (ou6.A02) {
            igTextView.setTypeface((Typeface) null, A1U ? 1 : 0);
            igTextView2.setTypeface((Typeface) null, A1U);
            activity = mz8.A00;
            i = R.attr.igds_color_primary_text;
        } else {
            igTextView.setTypeface((Typeface) null, 0);
            igTextView2.setTypeface((Typeface) null, 0);
            activity = mz8.A00;
            i = R.attr.igds_color_secondary_text;
        }
        JTS.A0u(activity, igTextView2, i);
        String str = ou6.A00;
        if (str == null || str.length() == 0) {
            mz8.A05.setVisibility(8);
            mz8.A07.setVisibility(8);
        } else {
            mz8.A05.setVisibility(0);
            IgTextView igTextView3 = mz8.A07;
            igTextView3.setVisibility(0);
            igTextView3.setText(str);
            igTextView2.setMaxWidth((int) (((double) 0nA.A0D(activity).x) * 0.6d));
        }
        C71405Ok4.A01(mz8.A01, 67, ou6, mz8);
    }

    public final Class modelClass() {
        return Ou6.class;
    }

    public C68627NPx(Activity activity, AnonymousClass4DH r2, UserSession userSession) {
        this.A01 = r2;
        this.A02 = userSession;
        this.A00 = activity;
    }
}
