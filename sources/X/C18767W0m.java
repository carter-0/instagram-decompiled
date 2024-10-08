package X;

import android.content.Context;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.model.hashtag.Hashtag;

/* renamed from: X.W0m  reason: case insensitive filesystem */
public abstract class C18767W0m {
    public static final void A00(Context context) {
        0qQ.A0B(context, 0);
        C59689JTv.A03(context, context.getString(2131962556), "follow_hashtag_error", 0);
    }

    public static final void A01(Context context) {
        0qQ.A0B(context, 0);
        C59689JTv.A03(context, context.getString(2131975860), "unfollow_hashtag_error", 0);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: android.text.SpannableString} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A02(android.widget.TextView r8, java.lang.String r9) {
        /*
            r7 = 0
            X.0qQ.A0B(r8, r7)
            r6 = 1
            if (r9 == 0) goto L_0x004e
            int r5 = r9.length()
            if (r5 == 0) goto L_0x004e
            java.lang.String r0 = "1"
            boolean r4 = r0.equals(r9)
            android.content.Context r3 = r8.getContext()
            android.content.res.Resources r2 = r3.getResources()
            r1 = 2131820867(0x7f110143, float:1.9274461E38)
            r0 = 100
            if (r4 == 0) goto L_0x0023
            r0 = 1
        L_0x0023:
            java.lang.String r0 = X.DbV.A0v(r2, r9, r1, r0)
            X.0qQ.A07(r0)
            int r2 = X.00l.A08(r0, r9, r7, r7)
            android.text.SpannableString r4 = new android.text.SpannableString
            r4.<init>(r0)
            int r1 = X.C51968G9o.A04(r3)
            android.text.style.ForegroundColorSpan r0 = new android.text.style.ForegroundColorSpan
            r0.<init>(r1)
            int r5 = r5 + r2
            r1 = 33
            r4.setSpan(r0, r2, r5, r1)
            android.text.style.StyleSpan r0 = new android.text.style.StyleSpan
            r0.<init>(r6)
            r4.setSpan(r0, r2, r5, r1)
        L_0x004a:
            r8.setText(r4)
            return
        L_0x004e:
            java.lang.String r4 = ""
            goto L_0x004a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18767W0m.A02(android.widget.TextView, java.lang.String):void");
    }

    public static final void A03(AnonymousClass0iw r2, IgImageView igImageView, Hashtag hashtag) {
        AnonymousClass7TF.A1H(igImageView, hashtag);
        if (C253833rU.A02(hashtag.Bh3())) {
            Context A0S = AnonymousClass7TE.A0S(igImageView);
            DbU.A13(A0S, igImageView, R.drawable.instagram_hashtag_pano_outline_24);
            int A01 = DbY.A01(A0S);
            igImageView.setPadding(A01, A01, A01, A01);
            return;
        }
        ImageUrl Bh3 = hashtag.Bh3();
        if (Bh3 != null) {
            igImageView.setUrl(Bh3, r2);
            igImageView.setPadding(0, 0, 0, 0);
            return;
        }
        throw DbU.A0h();
    }
}
