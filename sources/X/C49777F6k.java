package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.fx.access.constants.FxcalAccountType;
import com.instagram.nux.cal.model.FxAccountInfo;
import java.util.Locale;

/* renamed from: X.F6k  reason: case insensitive filesystem */
public abstract class C49777F6k {
    /* JADX WARNING: type inference failed for: r3v1, types: [X.EbQ, java.lang.Object] */
    public static final ViewGroup A00(Context context, ViewGroup viewGroup) {
        ViewGroup viewGroup2 = (ViewGroup) DbW.A09(DbT.A0B(context), viewGroup, R.layout.account_row, false);
        0qQ.A0B(viewGroup2, 1);
        ? obj = new Object();
        View requireViewById = viewGroup2.requireViewById(R.id.avatar_container);
        String A00 = C66579MXk.A00(67);
        0qQ.A0C(requireViewById, A00);
        obj.A02 = (CircularImageView) requireViewById;
        View requireViewById2 = viewGroup2.requireViewById(R.id.badge_container);
        0qQ.A0C(requireViewById2, A00);
        obj.A03 = (CircularImageView) requireViewById2;
        IgTextView requireViewById3 = viewGroup2.requireViewById(R.id.accountTitle);
        String A002 = AnonymousClass000.A00(9);
        0qQ.A0C(requireViewById3, A002);
        obj.A01 = requireViewById3;
        IgTextView requireViewById4 = viewGroup2.requireViewById(R.id.accountSubtitle);
        0qQ.A0C(requireViewById4, A002);
        obj.A00 = requireViewById4;
        viewGroup2.setTag(obj);
        return viewGroup2;
    }

    /* JADX WARNING: type inference failed for: r0v12, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.widget.ImageView] */
    /* JADX WARNING: type inference failed for: r1v8, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.widget.ImageView] */
    public static final void A01(Context context, AnonymousClass0iw r5, C48245EbQ ebQ, FxAccountInfo fxAccountInfo) {
        int i;
        int i2;
        AnonymousClass7TG.A1T(context, ebQ, fxAccountInfo);
        ImageUrl imageUrl = fxAccountInfo.A00;
        if (C253833rU.A02(imageUrl)) {
            DbU.A13(context, ebQ.A02, R.drawable.profile_anonymous_user);
        } else if (!(imageUrl == null || r5 == null)) {
            ebQ.A02.setUrl(imageUrl, r5);
        }
        IgTextView igTextView = ebQ.A01;
        String str = fxAccountInfo.A02;
        if (str != null) {
            igTextView.setText(str);
            String str2 = fxAccountInfo.A01;
            if (str2 != null) {
                FxcalAccountType fxcalAccountType = FxcalAccountType.FACEBOOK;
                String valueOf = String.valueOf(str2);
                String obj = fxcalAccountType.toString();
                Locale locale = Locale.ROOT;
                if (Dbb.A1b(valueOf, DbT.A12(locale, obj), locale)) {
                    i = R.drawable.fb_badge_color_logo;
                    i2 = 2131961885;
                } else {
                    if (Dbb.A1b(String.valueOf(fxAccountInfo.A01), DbT.A12(locale, FxcalAccountType.INSTAGRAM.toString()), locale)) {
                        i = R.drawable.ig_badge_color_logo;
                        i2 = R.string.f0nameremoved;
                    } else {
                        return;
                    }
                }
                DbU.A13(context, ebQ.A03, i);
                ebQ.A00.setText(i2);
                return;
            }
            return;
        }
        throw AnonymousClass7TE.A0y();
    }
}
