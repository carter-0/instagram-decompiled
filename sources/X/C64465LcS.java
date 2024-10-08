package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.shopping.model.taggingfeed.ShoppingTaggingFeedHeader;

/* renamed from: X.LcS  reason: case insensitive filesystem */
public final class C64465LcS implements AnonymousClass4DS {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C64465LcS(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    public final void configureActionBar(2da r23) {
        TextView textView;
        2da r3 = r23;
        if (this.A00 != 0) {
            0qQ.A0B(r3, 0);
            r3.Eu4(true);
            ShoppingTaggingFeedHeader shoppingTaggingFeedHeader = ((ULE) this.A01).A01;
            if (shoppingTaggingFeedHeader.A03) {
                AnonymousClass3JR A0K = DbS.A0K();
                C15337Uam uam = (C15337Uam) this.A02;
                A0K.A0K = C15337Uam.A02(uam, (C14784U8u) uam.A0B.getValue(), shoppingTaggingFeedHeader.A05);
                DbX.A19(new WB0(uam, 2), A0K, r3);
            }
            if (shoppingTaggingFeedHeader.A06) {
                r3.ETg(R.layout.tagging_feed_action_bar_shimmer, 2Yu.A0G(DbT.A07(this.A02), R.attr.actionBarStartSpacing), 0, true);
                return;
            }
            String str = shoppingTaggingFeedHeader.A02;
            String str2 = shoppingTaggingFeedHeader.A01;
            if (str != null) {
                r3.EfN(str2, str);
            } else {
                r3.setTitle(str2);
            }
        } else {
            0qQ.A0B(r3, 0);
            Integer num = AnonymousClass05K.A00;
            LtB ltB = (LtB) this.A02;
            r3.ErJ(new AnonymousClass57Z((Resources.Theme) null, (ColorFilter) null, (ColorFilter) null, new ColorDrawable(ltB.A0H), ltB.A0J, LY6.A00(ltB, 49), num, -2, -2, -2, 2131953555, -2, -2, -2, true));
            r3.Eu4(true);
            C62466KgG kgG = ltB.A0C;
            C62466KgG kgG2 = C62466KgG.EDIT;
            int i = 2131966654;
            if (!AnonymousClass7TF.A1W(kgG, kgG2)) {
                i = 2131966655;
            }
            ltB.A07 = r3.Eol(i, 2Yu.A0E((Context) this.A01));
            if (!AnonymousClass7TF.A1W(ltB.A0C, kgG2) && ltB.A0M.A01) {
                AnonymousClass3JR A0K2 = DbS.A0K();
                A0K2.A0F = ltB.A0K;
                A0K2.A05 = 2131966723;
                DbX.A19(LY6.A00(ltB, 50), A0K2, r3);
            }
            if (AnonymousClass7TF.A1W(ltB.A0C, kgG2) && ltB.A0M.A01) {
                AnonymousClass3JR A0K3 = DbS.A0K();
                A0K3.A0C = 2131966622;
                A0K3.A0G = LY6.A00(ltB, 51);
                View A0P = C51970G9q.A0P(A0K3, r3);
                if (A0P instanceof TextView) {
                    textView = (TextView) A0P;
                } else {
                    textView = null;
                }
                ltB.A08 = textView;
            }
            ltB.A04 = ((2dZ) r3).A0L;
            LtB.A00(ltB);
        }
    }
}
