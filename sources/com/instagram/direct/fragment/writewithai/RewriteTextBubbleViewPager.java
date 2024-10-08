package com.instagram.direct.fragment.writewithai;

import X.0fE;
import X.0qQ;
import X.AnonymousClass3TG;
import X.AnonymousClass7TF;
import X.C62320sa;
import X.C67969Mxt;
import X.C68172N3n;
import X.C72239Oz7;
import X.C73204PYi;
import X.C73756PjH;
import X.C73899Pla;
import X.C74241PrU;
import X.JTT;
import X.NR2;
import X.OTG;
import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import android.widget.Adapter;
import com.instagram.android.R;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class RewriteTextBubbleViewPager extends ReboundViewPager {
    public int A00;
    public C74241PrU A01;
    public C62320sa A02;
    public final NR2 A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RewriteTextBubbleViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        0qQ.A0B(context, 1);
        NR2 nr2 = new NR2(new C73899Pla(this, 23));
        this.A03 = nr2;
        this.A02 = C73756PjH.A00;
        setAdapter((Adapter) nr2);
        A0P(new C72239Oz7(this, 3));
        Context context2 = getContext();
        this.A0C = AnonymousClass7TF.A0E(context2).widthPixels - context2.getResources().getDimensionPixelSize(R.dimen.add_to_story_dual_destination_share_sheet_story_row_height);
    }

    public final void A0T(Integer num, String str, String str2, String str3, String str4) {
        int count;
        0qQ.A0B(str, 0);
        if (this.A0N == AnonymousClass3TG.DISABLED) {
            setScrollMode(AnonymousClass3TG.DISCRETE_PAGING);
        }
        NR2 nr2 = this.A03;
        nr2.A03.add(new C68172N3n(str, str2, str3, str4));
        0fE.A00(nr2, -80578615);
        if (num == null || (count = num.intValue()) >= nr2.getCount()) {
            count = nr2.getCount() - 1;
        }
        this.A00 = count;
        Handler handler = getHandler();
        if (handler != null) {
            handler.post(new C73204PYi(this, count));
        }
        if (count >= 1) {
            nr2.A00(count, count - 1);
        }
    }

    public final void setApplyReWrite(C62320sa r2) {
        0qQ.A0B(r2, 0);
        this.A02 = r2;
    }

    public final void setBotResponseFeedbackController(OTG otg) {
        0qQ.A0B(otg, 0);
        this.A03.A02 = otg;
    }

    public final String getAppliedPromptOfCurrentPage() {
        NR2 nr2 = this.A03;
        return ((C68172N3n) nr2.A03.get(this.A00)).A02;
    }

    public final C62320sa getApplyReWrite() {
        return this.A02;
    }

    public final C74241PrU getCustomFieldChangeListener() {
        return this.A01;
    }

    public final String getTextToRewriteFromCurrentPage() {
        NR2 nr2 = this.A03;
        return ((C68172N3n) nr2.A03.get(this.A00)).A05;
    }

    public final String getTextToRewriteFromOriginalPage() {
        NR2 nr2 = this.A03;
        return ((C68172N3n) nr2.A03.get(this.A00)).A04;
    }

    public final void setTextBubbleMaxHeight(int i) {
        NR2 nr2 = this.A03;
        nr2.A00 = i;
        C67969Mxt mxt = nr2.A01;
        if (mxt != null) {
            mxt.A00.setMaxHeight(i);
        }
        0fE.A00(nr2, 1643333874);
    }

    public final void setCustomFieldChangeListener(C74241PrU prU) {
        this.A01 = prU;
    }

    public /* synthetic */ RewriteTextBubbleViewPager(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JTT.A0D(attributeSet, i));
    }
}
