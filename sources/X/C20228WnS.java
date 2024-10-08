package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.igds.components.peoplecell.IgdsPeopleCell;
import com.instagram.leadgen.core.model.LeadGenFormBaseQuestion;
import com.instagram.leadgen.core.model.LeadGenProfileContentInfo;
import com.instagram.leadgen.core.ui.LeadGenFormShortAnswerQuestionView;
import java.util.List;

/* renamed from: X.WnS  reason: case insensitive filesystem */
public final class C20228WnS implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C15998Umf A01;

    public C20228WnS(C15998Umf umf, int i) {
        this.A01 = umf;
        this.A00 = i;
    }

    public final void run() {
        View view;
        String str;
        IgImageView igImageView;
        C14898UEa uEa;
        Un0 un0;
        RecyclerView recyclerView;
        C15998Umf umf = this.A01;
        ViewPager2 viewPager2 = umf.A00;
        int i = 0;
        C249703kE r7 = null;
        if (viewPager2 != null) {
            view = AnonymousClass046.A00(viewPager2, 0);
        } else {
            view = null;
        }
        if ((view instanceof RecyclerView) && (recyclerView = (RecyclerView) view) != null) {
            r7 = recyclerView.A0W(this.A00);
        }
        if ((r7 instanceof C14898UEa) && (uEa = (C14898UEa) r7) != null && !(uEa instanceof C16028UnH) && !(uEa instanceof C16027UnG) && !(uEa instanceof C16025UnE)) {
            if (uEa instanceof C16032UnL) {
                C16032UnL unL = (C16032UnL) uEa;
                LeadGenFormShortAnswerQuestionView leadGenFormShortAnswerQuestionView = unL.A03;
                leadGenFormShortAnswerQuestionView.A0I();
                if (00l.A0W(leadGenFormShortAnswerQuestionView.getText()) && !unL.A01) {
                    leadGenFormShortAnswerQuestionView.A0E();
                }
                C15045UKy uKy = unL.A00;
                if (uKy != null && uKy.A0D && unL.getBindingAdapterPosition() == 0) {
                    LeadGenFormBaseQuestion leadGenFormBaseQuestion = (LeadGenFormBaseQuestion) AnonymousClass7TE.A13(uKy.A08);
                    C18077Vl6 vl6 = unL.A00;
                    if (vl6 != null) {
                        vl6.A05(leadGenFormBaseQuestion, leadGenFormBaseQuestion.A00, true);
                    }
                    C18077Vl6 vl62 = unL.A00;
                    if (vl62 != null) {
                        vl62.A06(true);
                    }
                }
            } else if (uEa instanceof C16030UnJ) {
                C16030UnJ unJ = (C16030UnJ) uEa;
                C15045UKy uKy2 = unJ.A00;
                if (uKy2 != null && uKy2.A0D && unJ.getBindingAdapterPosition() == 0) {
                    boolean z = false;
                    LeadGenFormBaseQuestion leadGenFormBaseQuestion2 = (LeadGenFormBaseQuestion) uKy2.A08.get(0);
                    List list = leadGenFormBaseQuestion2.A0C;
                    if (list != null && list.contains(leadGenFormBaseQuestion2.A00)) {
                        z = true;
                    }
                    C18077Vl6 vl63 = unJ.A00;
                    if (vl63 != null) {
                        vl63.A05(leadGenFormBaseQuestion2, leadGenFormBaseQuestion2.A00, true);
                    }
                    C18077Vl6 vl64 = unJ.A00;
                    if (vl64 != null) {
                        vl64.A06(!z);
                    }
                }
            } else if (!(uEa instanceof C16024UnD) && !(uEa instanceof C16026UnF) && !(uEa instanceof C16029UnI) && !(uEa instanceof C16033UnM)) {
                0kx r2 = new 0kx(((C16031UnK) uEa).A00);
                while (r2.hasNext()) {
                    View view2 = (View) r2.next();
                    if ((view2 instanceof Un0) && (un0 = (Un0) view2) != null) {
                        un0.A0I();
                    }
                }
            }
        }
        C16039UnS A0R = C13990Tnq.A0R(umf);
        int i2 = this.A00;
        A0R.A03(i2);
        C16039UnS A0R2 = C13990Tnq.A0R(umf);
        C15045UKy A0Q = C13991Tnr.A0Q(A0R2.A0a, i2);
        if (A0Q != null && A0R2.A04 && A0Q.A03 == C16527UwW.CUSTOMER_INFO && !A0R2.A0D) {
            UserSession userSession = A0R2.A0H;
            0qQ.A0B(userSession, 0);
            0qQ.A0A(AnonymousClass7TF.A0R(0Tu.A05, userSession, 36317908447532683L));
        }
        boolean A1U = Dba.A1U(i2);
        C15263UYd uYd = umf.A03;
        if (!(uYd == null || (igImageView = uYd.A03) == null)) {
            igImageView.setVisibility(DbW.A01(A1U ^ true ? 1 : 0));
        }
        C15263UYd uYd2 = umf.A03;
        if (uYd2 != null) {
            boolean A1X = Dba.A1X(C16527UwW.SINGLE_SCREEN_PRIVACY_POLICY, C15998Umf.A02(umf));
            IgTextView igTextView = uYd2.A01;
            if (igTextView != null) {
                if (A1X) {
                    str = uYd2.getString(2131964684);
                } else {
                    str = uYd2.A04;
                }
                igTextView.setText(str);
            }
        }
        IgdsPeopleCell igdsPeopleCell = umf.A01;
        if (igdsPeopleCell != null) {
            if (!A1U || !C13990Tnq.A0R(umf).A09) {
                i = 8;
            }
            igdsPeopleCell.setVisibility(i);
        }
        if (C13990Tnq.A0R(umf).A0B) {
            C15998Umf.A04(umf, (LeadGenProfileContentInfo) C13990Tnq.A0R(umf).A0b.getValue());
        }
    }
}
