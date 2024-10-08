package com.instagram.direct.ui.polls;

import X.0qQ;
import X.0sr;
import X.2Yu;
import X.AnonymousClass00P;
import X.AnonymousClass0iw;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C253673rC;
import X.C67640MrT;
import X.DbT;
import X.DbU;
import X.JTT;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.facebook.cameracore.instagram.ardelivery.networkconsentmanager.IgNetworkConsentStorage;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class PollMessageVotersView extends FrameLayout implements AnonymousClass0iw {
    public int A00;
    public int A01;
    public final int A02;
    public final IgTextView A03;
    public final C67640MrT A04;
    public final List A05;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PollMessageVotersView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        0qQ.A0B(context, 1);
    }

    public final void A00(List list, long j) {
        0qQ.A0B(list, 0);
        List list2 = this.A05;
        int i = 0;
        for (Object next : list2) {
            int i2 = i + 1;
            if (i < 0) {
                0sr.A1T();
                throw AnonymousClass00P.createAndThrow();
            }
            IgImageView igImageView = (IgImageView) next;
            if (i < list.size()) {
                igImageView.setVisibility(0);
                igImageView.setUrl((ImageUrl) list.get(i), this);
            } else {
                igImageView.setVisibility(8);
            }
            i = i2;
        }
        int min = Math.min(list2.size(), 100);
        if (j > ((long) min)) {
            int i3 = min - 1;
            IgTextView igTextView = this.A03;
            igTextView.setVisibility(0);
            Integer valueOf = Integer.valueOf((int) (j - ((long) i3)));
            Resources A052 = DbU.A05(this);
            0qQ.A07(A052);
            igTextView.setText(C253673rC.A04(A052, valueOf, IgNetworkConsentStorage.MAX_ENTRIES, true, false));
            ((View) list2.get(i3)).setVisibility(8);
        }
    }

    public String getModuleName() {
        return "PollMessageVotersView";
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PollMessageVotersView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
        ArrayList A1C = AnonymousClass7TE.A1C();
        this.A05 = A1C;
        int A042 = AnonymousClass7TG.A04(context);
        this.A02 = A042;
        this.A01 = 2Yu.A0F(context, R.attr.messageFromOthersGrayBackground);
        this.A00 = context.getColor(2Yu.A0C(context));
        context.getColor(2Yu.A07(context));
        View.inflate(context, R.layout.direct_poll_message_voters, this);
        A1C.add(AnonymousClass7TF.A0G(this, R.id.voter_avatar_1));
        A1C.add(AnonymousClass7TF.A0G(this, R.id.voter_avatar_2));
        A1C.add(AnonymousClass7TF.A0G(this, R.id.voter_avatar_3));
        IgTextView A0a = DbT.A0a(this, R.id.avatar_count);
        this.A03 = A0a;
        C67640MrT mrT = new C67640MrT(A042, this.A01, this.A00);
        this.A04 = mrT;
        A0a.setBackground(mrT);
        int i2 = this.A01;
        for (CircularImageView circularImageView : this.A05) {
            circularImageView.A0H(this.A02, i2);
            circularImageView.A02 = true;
        }
    }

    public /* synthetic */ PollMessageVotersView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JTT.A0D(attributeSet, i2), JTT.A01(i2, i));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PollMessageVotersView(Context context) {
        this(context, (AttributeSet) null, 0);
        0qQ.A0B(context, 1);
    }
}
