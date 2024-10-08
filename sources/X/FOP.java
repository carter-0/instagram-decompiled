package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.facebookpay.common.recyclerview.adapteritems.SelectionPaymentMethodItem;
import com.instagram.api.schemas.INLINE_SURVEY_QUESTION_TYPES;
import com.instagram.common.session.UserSession;
import com.instagram.feed.media.EffectPreviewIntf;
import com.instagram.model.reels.Reel;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import com.instagram.user.model.User;
import java.util.Iterator;
import java.util.List;

public final class FOP implements View.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final boolean A06;

    public FOP(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, boolean z) {
        this.A00 = i;
        this.A05 = obj4;
        this.A06 = z;
        this.A02 = obj2;
        this.A01 = obj;
        this.A04 = obj3;
        this.A03 = obj5;
    }

    public final void onClick(View view) {
        int i;
        int i2;
        String str;
        Context context;
        int i3;
        String str2;
        switch (this.A00) {
            case 0:
                i = AnonymousClass0fD.A05(-112023888);
                C8013Qf0 qf0 = (C8013Qf0) this.A05;
                0sJ r7 = qf0.A08;
                boolean z = this.A06;
                if (z) {
                    str = Pxd.A00(856);
                } else {
                    str = "remove_card";
                }
                SelectionPaymentMethodItem selectionPaymentMethodItem = (SelectionPaymentMethodItem) this.A02;
                r7.invoke(Pxd.A00(924), str, DbV.A0q(selectionPaymentMethodItem.A0F), selectionPaymentMethodItem.A09);
                Context context2 = (Context) this.A01;
                0qQ.A0A(context2);
                GVB gvb = new GVB(0, qf0, selectionPaymentMethodItem, this.A04, this.A03, z);
                GL3 gl3 = new GL3(1, selectionPaymentMethodItem, qf0, z);
                0qQ.A0B(context2, 0);
                SIG A0H = AnonymousClass2E0.A0H();
                int i4 = 2131961314;
                int i5 = 2131961313;
                if (z) {
                    i4 = 2131961318;
                    i5 = 2131961317;
                }
                AnonymousClass0fN.A00(A0H.A01(context2, SA0.A00(C50023FJi.A00(gvb, 1), C50023FJi.A00(gl3, 2), i4, i5, 2131961310, 2131961303, 0, 2)));
                i2 = 575144240;
                break;
            case 1:
                i = AnonymousClass0fD.A05(188311918);
                boolean z2 = this.A06;
                C46939Dnt dnt = (C46939Dnt) this.A05;
                int i6 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
                if (z2) {
                    C49678F1k f1k = dnt.A00;
                    GradientSpinnerAvatarView gradientSpinnerAvatarView = dnt.A01.A08;
                    Reel reel = (Reel) this.A02;
                    DbY.A1S(gradientSpinnerAvatarView, reel);
                    E7M e7m = f1k.A00;
                    AnonymousClass32A r4 = new AnonymousClass32A(e7m, AnonymousClass7TE.A0l(e7m.A01), DbV.A0f(e7m));
                    r4.A0C = AnonymousClass7TF.A0b();
                    r4.A05 = new C16165Upq((Activity) e7m.requireActivity(), (View) gradientSpinnerAvatarView, (C230222pE) new C50896Fkb(e7m, 4));
                    r4.A08(reel, AnonymousClass3BQ.SUBSCRIPTION_LIST, gradientSpinnerAvatarView);
                } else {
                    UserSession userSession = (UserSession) this.A04;
                    ((Fragment) this.A01).requireActivity();
                    dnt.A00.A00(userSession, (User) this.A03);
                }
                i2 = 907004194;
                break;
            case 2:
                i = AnonymousClass0fD.A05(-334998636);
                if (view.isActivated()) {
                    C17983VjL vjL = (C17983VjL) this.A03;
                    Boolean bool = vjL.A00.A04;
                    if (bool != null && bool.booleanValue()) {
                        ((C230202p9) this.A02).DFm(vjL, this.A05);
                    }
                    if (this.A06 || !((C17997VjZ) this.A04).A02) {
                        C17997VjZ vjZ = (C17997VjZ) this.A04;
                        if (vjZ.A01) {
                            C17927ViI viI = (C17927ViI) this.A05;
                            if (viI.A05) {
                                viI.A05 = false;
                                ((C230202p9) this.A02).DFo(vjL, viI);
                            }
                        } else {
                            AnonymousClass0eM r3 = vjZ.A04;
                            Object value = r3.getValue();
                            C17927ViI viI2 = (C17927ViI) this.A05;
                            int i7 = viI2.A01 + 1;
                            if (value != null) {
                                Iterator it = ((List) r3.getValue()).iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        VSD vsd = (VSD) it.next();
                                        String BW8 = vsd.A01.BW8();
                                        if (BW8 != null && BW8.length() != 0) {
                                            i7 = W2c.A00(vjL, vsd, viI2.A01 + 1);
                                        }
                                    }
                                }
                            }
                            viI2.A00(i7);
                        }
                    } else {
                        ((C230202p9) this.A02).DFo(vjL, this.A05);
                    }
                } else {
                    C17997VjZ vjZ2 = (C17997VjZ) this.A04;
                    if (vjZ2.A01) {
                        context = (Context) this.A01;
                        i3 = 2131961753;
                        str2 = AnonymousClass000.A00(3068);
                    } else {
                        boolean A1W = AnonymousClass7TF.A1W(vjZ2.A03.A00, INLINE_SURVEY_QUESTION_TYPES.COMMENT);
                        context = (Context) this.A01;
                        if (A1W) {
                            i3 = 2131961752;
                            str2 = "error_message_awr_comment";
                        } else {
                            i3 = 2131961754;
                            str2 = "error_message_awr_multiple_question";
                        }
                    }
                    C59689JTv.A01(context, str2, i3, 0);
                }
                i2 = -1249986613;
                break;
            case 3:
                i = AnonymousClass0fD.A05(1701426783);
                E7G e7g = (E7G) this.A03;
                List A0a = 00k.A0a(e7g.A02);
                if ((!A0a.isEmpty()) || e7g.A01) {
                    UserSession userSession2 = (UserSession) this.A05;
                    boolean z3 = e7g.A01;
                    F5s.A01(C50165FRx.A00, new FSG(2, e7g, userSession2), userSession2, A0a, z3);
                }
                ((G74) this.A04).DZL();
                FEU feu = (FEU) this.A01;
                int size = A0a.size();
                0Aj A002 = FEU.A00(feu);
                Dbb.A18(C48138EZg.BOTTOMSHEET, A002);
                A002.A9F("num_requests", DbS.A0j(size));
                FEU.A01(A002, feu);
                if (this.A06) {
                    boolean z4 = e7g.A01;
                    0Aj A003 = FEU.A00(feu);
                    C48138EZg eZg = C48138EZg.SYSTEM_SETTING;
                    if (z4) {
                        A003.A8M(eZg, "format");
                        A003.A8M(C48139EZh.TOGGLE_ON, "action");
                        FEU.A01(A003, feu);
                    } else {
                        A003.A8M(eZg, "format");
                        A003.A8M(C48139EZh.TOGGLE_OFF, "action");
                        FEU.A01(A003, feu);
                    }
                }
                ((0r1) this.A02).A00 = true;
                i2 = 1647711798;
                break;
            case 4:
                i = AnonymousClass0fD.A05(-1167412501);
                EffectPreviewIntf effectPreviewIntf = (EffectPreviewIntf) this.A01;
                ((GBI) this.A05).A02((AnonymousClass8ZN) this.A02, effectPreviewIntf, (1Xj) this.A03, (AnonymousClass3W1) this.A04);
                i2 = -556785839;
                break;
            default:
                return;
        }
        AnonymousClass0fD.A0C(i2, i);
    }
}
