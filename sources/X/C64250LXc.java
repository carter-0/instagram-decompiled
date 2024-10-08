package X;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.CameraTool;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.button.IgdsButton;
import com.instagram.model.fundraiser.FundraiserCampaignTypeEnum;
import com.instagram.reels.prompt.model.PromptStickerModel;
import com.instagram.user.model.User;
import com.instagram.video.live.mvvm.viewmodel.optionsdialog.IgLiveOptionsDialogViewModel;
import java.util.Map;

/* renamed from: X.LXc  reason: case insensitive filesystem */
public final class C64250LXc implements View.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final String A04;

    public C64250LXc(Object obj, Object obj2, Object obj3, String str, int i) {
        this.A00 = i;
        this.A03 = obj3;
        this.A01 = obj;
        this.A02 = obj2;
        this.A04 = str;
    }

    public final void onClick(View view) {
        int A05;
        int i;
        switch (this.A00) {
            case 0:
                A05 = AnonymousClass0fD.A05(1737246984);
                C61436K7l k7l = (C61436K7l) this.A03;
                02m r4 = ((OTV) k7l.A04.getValue()).A00;
                r4.markerStart(31786177);
                r4.markerPoint(31786177, "Follow_Creator_Start");
                C313756gx r5 = k7l.A00;
                if (r5 != null) {
                    r5.A0F(C69318NjJ.UNSPECIFIED, this.A04, 0);
                    IgdsButton igdsButton = (IgdsButton) this.A01;
                    igdsButton.setLoading(true);
                    FragmentActivity requireActivity = k7l.requireActivity();
                    UserSession A0l = AnonymousClass7TE.A0l(k7l.A05);
                    User user = (User) this.A02;
                    FH6.A00(requireActivity, (0xF) null, new KAR(5, igdsButton, user, k7l), A0l, (1Xj) null, (AnonymousClass3W1) null, user);
                    i = 229845070;
                    break;
                } else {
                    0qQ.A0F("broadcastLogger");
                    throw AnonymousClass00P.createAndThrow();
                }
            case 1:
                A05 = AnonymousClass0fD.A05(2072997786);
                Context context = (Context) this.A01;
                C358248ab A0Y = DbS.A0Y(context);
                A0Y.A09(2131976309);
                A0Y.A0q(AnonymousClass7TF.A0e(context.getResources(), this.A04, 2131976307));
                A0Y.A0O(new LUV(1, context, this.A03, this.A02), C358278ae.RED, 2131971974);
                A0Y.A0D((DialogInterface.OnClickListener) null);
                DbT.A1V(A0Y);
                i = 1799503440;
                break;
            case 2:
                A05 = AnonymousClass0fD.A05(879939134);
                LNN.A00.A00((Activity) this.A01, 28D.A4j, (CameraTool) this.A02, (UserSession) this.A03, (PromptStickerModel) null, this.A04, (String) null);
                i = -351714374;
                break;
            case 3:
                A05 = AnonymousClass0fD.A05(-67044974);
                LNN.A00.A00((Activity) this.A01, 28D.A4j, (CameraTool) this.A02, (UserSession) this.A03, (PromptStickerModel) null, this.A04, (String) null);
                i = -145536590;
                break;
            case 4:
                A05 = AnonymousClass0fD.A05(-1312224787);
                IgLiveOptionsDialogViewModel A002 = LRB.A00(this.A03);
                Object obj = this.A02;
                String str = this.A04;
                AnonymousClass7TE.A1Z(new C66173MGk(obj, A002, str, (AnonymousClass4D7) null, 25), JTP.A0J(A002, str, 2));
                i = 1467740200;
                break;
            default:
                A05 = AnonymousClass0fD.A05(-1965923379);
                0nA.A0N(((LAX) this.A02).A01);
                FundraiserCampaignTypeEnum B8e = ((C65231bS) this.A01).B8e();
                FundraiserCampaignTypeEnum fundraiserCampaignTypeEnum = FundraiserCampaignTypeEnum.IG_CHARITY_BUSINESS_PROFILE;
                L3T l3t = ((L9S) this.A03).A02;
                String str2 = this.A04;
                C334677bg r42 = l3t.A01;
                C62320sa r1 = r42.A05;
                if (B8e == fundraiserCampaignTypeEnum) {
                    Context context2 = (Context) r1.invoke();
                    if (context2 != null) {
                        1Xj BPf = l3t.A00.BPf();
                        UserSession userSession = r42.A03;
                        LTV.A02(context2, userSession, str2, C51973G9u.A0j(userSession, BPf), BPf.A2n());
                    }
                    i = 1949565462;
                    break;
                } else {
                    FragmentActivity fragmentActivity = (FragmentActivity) r1.invoke();
                    if (fragmentActivity != null) {
                        1Xj BPf2 = l3t.A00.BPf();
                        UserSession userSession2 = r42.A03;
                        LTM.A07(r42.A04, userSession2, "feed_post_comments_upsell", "FEED_POST_COMMENTS", str2, (Map) null);
                        String id = BPf2.getId();
                        String A2w = BPf2.A2w();
                        C240063Jl.A01 = id;
                        C240063Jl.A00 = A2w;
                        LTV.A09(fragmentActivity, userSession2, str2, "FEED_POST_COMMENTS", C51973G9u.A0j(userSession2, BPf2), BPf2.A2n());
                    }
                    i = 1949565462;
                }
                r42.A06.invoke();
                i = 1949565462;
        }
        AnonymousClass0fD.A0C(i, A05);
    }
}
