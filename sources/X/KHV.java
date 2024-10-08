package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.model.fundraiser.NewFundraiserInfo;
import com.instagram.wellbeing.fundraiser.model.ExistingStandaloneFundraiserForFeedModel;
import java.util.List;

public final class KHV extends IgLinearLayout {
    public LOL A00;
    public LCR A01;
    public boolean A02;
    public View A03;
    public DV3 A04;
    public NewFundraiserInfo A05;
    public ExistingStandaloneFundraiserForFeedModel A06;
    public final AnonymousClass0iw A07;
    public final UserSession A08;
    public final L12 A09;
    public final String A0A;

    public final void setExistingFundraiserInfo(DV3 dv3) {
        if (dv3 == null || !dv3.Al4()) {
            dv3 = null;
        }
        this.A04 = dv3;
        A00();
    }

    private final void A00() {
        LCR lcr = this.A01;
        if (lcr != null) {
            NewFundraiserInfo newFundraiserInfo = this.A05;
            DV3 dv3 = this.A04;
            ExistingStandaloneFundraiserForFeedModel existingStandaloneFundraiserForFeedModel = this.A06;
            lcr.A00(new LBA(dv3, newFundraiserInfo, new C65833M0z(this), new C63823L8e(this.A07, this.A08, "REELS", this.A0A), existingStandaloneFundraiserForFeedModel, DbW.A01(this.A02 ? 1 : 0)));
        }
    }

    public final DV3 getExistingFundraiserInfo() {
        return this.A04;
    }

    public final ExistingStandaloneFundraiserForFeedModel getFundraiserToAttach() {
        return this.A06;
    }

    public final NewFundraiserInfo getNewFundraiserModel() {
        return this.A05;
    }

    public final boolean getShowIcon() {
        return this.A02;
    }

    public final LOL getSuggestionsRowController() {
        return this.A00;
    }

    public final void setFundraiserToAttach(ExistingStandaloneFundraiserForFeedModel existingStandaloneFundraiserForFeedModel) {
        this.A06 = existingStandaloneFundraiserForFeedModel;
        A00();
    }

    public final void setNewFundraiserModel(NewFundraiserInfo newFundraiserInfo) {
        this.A05 = newFundraiserInfo;
        A00();
    }

    public KHV(Context context, AnonymousClass0iw r2, UserSession userSession, L12 l12, String str) {
        super(context);
        this.A09 = l12;
        this.A08 = userSession;
        this.A07 = r2;
        this.A0A = str;
    }

    public final void onAttachedToWindow() {
        List list;
        int A062 = AnonymousClass0fD.A06(-1516840094);
        super.onAttachedToWindow();
        if (this.A03 == null) {
            View A0D = DbT.A0D(LayoutInflater.from(AnonymousClass7TE.A0S(this)), this, R.layout.layout_share_content_row_action_with_suggestions, false);
            this.A01 = new LCR(new M11(A0D));
            A00();
            0eE r0 = AnonymousClass0t1.A01;
            UserSession userSession = this.A08;
            C253353qe AYk = DbS.A0h(userSession, r0).AYk();
            if (AYk != null) {
                list = AYk.B8h();
            } else {
                list = null;
            }
            LOL lol = new LOL(A0D, userSession, new C63637L0z(this), new L4J(this.A07, userSession));
            this.A00 = lol;
            if (list == null) {
                list = AnonymousClass7TE.A1C();
            }
            lol.A01(list);
            addView(A0D);
            this.A03 = A0D;
        }
        AnonymousClass0fD.A0D(-907959682, A062);
    }

    public final void setShowIcon(boolean z) {
        this.A02 = z;
    }

    public final void setSuggestionsRowController(LOL lol) {
        this.A00 = lol;
    }
}
