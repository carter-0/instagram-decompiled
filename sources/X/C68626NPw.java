package X;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.model.mediasize.ExtendedImageUrl;

/* renamed from: X.NPw  reason: case insensitive filesystem */
public final class C68626NPw extends C232232tF {
    public final AnonymousClass4DH A00;
    public final UserSession A01;
    public final C70936OSj A02;

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        JTQ.A1L(viewGroup, layoutInflater);
        return new C68039Mz6(DbT.A0D(layoutInflater, viewGroup, R.layout.direct_inbox_campaign_item_layout, false), this.A00, this.A01, this.A02);
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r9, C249703kE r10) {
        String str;
        Ou9 ou9 = (Ou9) r9;
        C68039Mz6 mz6 = (C68039Mz6) r10;
        AnonymousClass7TG.A1N(ou9, mz6);
        IgImageView igImageView = mz6.A07;
        String str2 = ou9.A0D;
        ExtendedImageUrl extendedImageUrl = new ExtendedImageUrl(str2, 100, 100);
        AnonymousClass4DH r7 = mz6.A01;
        igImageView.setUrl(extendedImageUrl, r7);
        IgTextView igTextView = mz6.A06;
        long j = ou9.A08;
        igTextView.setText(C14240TsN.A04("MMM d", j));
        String str3 = ou9.A0B;
        Integer num = ou9.A0A;
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putLong("bundle_key_start_time", j);
        A0a.putString("bundle_key_thumbnail_image", str2);
        if (str3 == null || num == null) {
            mz6.A03.setVisibility(8);
        }
        String str4 = null;
        if (str3 != null) {
            IgTextView igTextView2 = mz6.A04;
            Resources A05 = DbV.A05(r7);
            if (A05 != null) {
                str = AnonymousClass7TF.A0e(A05, str3, 2131964237);
            } else {
                str = null;
            }
            igTextView2.setText(str);
            A0a.putString("bundle_key_budget_spent", str3);
        }
        if (num != null) {
            IgTextView igTextView3 = mz6.A05;
            Resources A052 = DbV.A05(r7);
            if (A052 != null) {
                str4 = DbV.A0v(A052, num, R.plurals.inbox_campaign_ad_item_message_count, num.intValue());
            }
            igTextView3.setText(str4);
            A0a.putInt("bundle_key_message_count", num.intValue());
        }
        A0a.putString("bundle_key_media_id", ou9.A0C);
        A0a.putString("bundle_key_boosting_status", DbX.A0t(ou9.A09));
        Bundle A0a2 = AnonymousClass7TE.A0a();
        A0a2.putString(AnonymousClass000.A00(1753), String.valueOf(ou9.A02));
        A0a2.putString(AnonymousClass000.A00(1754), String.valueOf(ou9.A03));
        A0a2.putString(AnonymousClass000.A00(582), String.valueOf(ou9.A00));
        A0a2.putInt(AnonymousClass000.A00(4028), ou9.A04);
        A0a2.putInt(AnonymousClass000.A00(4122), ou9.A06);
        A0a2.putInt(AnonymousClass000.A00(3045), ou9.A01);
        A0a2.putInt(AnonymousClass000.A00(4123), ou9.A07);
        A0a2.putInt(AnonymousClass000.A00(761), ou9.A05);
        A0a.putBundle("extra_bundle_for_boosting", A0a2);
        C71399Ojy.A00(mz6.A00, ou9, mz6, A0a, 13);
    }

    public final Class modelClass() {
        return Ou9.class;
    }

    public C68626NPw(AnonymousClass4DH r1, UserSession userSession, C70936OSj oSj) {
        this.A00 = r1;
        this.A01 = userSession;
        this.A02 = oSj;
    }
}
