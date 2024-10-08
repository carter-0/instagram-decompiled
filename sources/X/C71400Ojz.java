package X;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.direct.messageid.DirectMessageIdentifier;
import com.instagram.model.reels.Reel;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.ui.widget.gradientspinner.GradientSpinner;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.webrtc.EglBase14Impl;

/* renamed from: X.Ojz  reason: case insensitive filesystem */
public final class C71400Ojz implements View.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public C71400Ojz(Dialog dialog, NHY nhy, C2367835b r3, C74381Ptw ptw, int i) {
        this.A00 = i;
        if (2 - i != 0) {
            this.A03 = r3;
            this.A02 = nhy;
            this.A01 = ptw;
            this.A04 = dialog;
        } else {
            this.A04 = dialog;
            this.A01 = ptw;
            this.A03 = r3;
            this.A02 = nhy;
        }
    }

    public final void onClick(View view) {
        int i;
        int i2;
        C252553pI r3;
        switch (this.A00) {
            case 0:
                i2 = AnonymousClass0fD.A05(1133138824);
                int i3 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
                UserSession userSession = (UserSession) this.A03;
                ((C68051MzI) this.A04).A00.Cqk(DbT.A0E(this.A01), userSession, (User) this.A02, "branded_content_people_cell");
                i = -405276580;
                break;
            case 1:
                i2 = AnonymousClass0fD.A05(1720064328);
                int i4 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
                UserSession userSession2 = (UserSession) this.A03;
                ((C68051MzI) this.A04).A00.Cqk(DbT.A0E(this.A01), userSession2, (User) this.A02, "branded_content_people_cell");
                i = 661810839;
                break;
            case 2:
                i2 = AnonymousClass0fD.A05(11629201);
                ((Dialog) this.A04).dismiss();
                ((C74381Ptw) this.A01).CId();
                if (((NHY) this.A02).A06 == null) {
                    0wb.A03("brand_experiences_reel_celebration", "promotionId was null when attempting to log");
                }
                i = 1960236928;
                break;
            case 3:
                i2 = AnonymousClass0fD.A05(-1427883913);
                if (((NHY) this.A02).A06 == null) {
                    0wb.A03("brand_experiences_reel_celebration", "promotionId was null when attempting to log");
                }
                ((C74381Ptw) this.A01).CJB();
                ((Dialog) this.A04).dismiss();
                i = 1869668880;
                break;
            case 4:
                i2 = AnonymousClass0fD.A05(1512058808);
                NJY njy = (NJY) this.A04;
                AnonymousClass0eM r4 = njy.A14;
                if (OPO.A01(AnonymousClass7TE.A0l(r4), (N4P) this.A03)) {
                    DbW.A1L(AnonymousClass7TF.A0N(AnonymousClass7TE.A0l(r4)), "bc_custom_themes_has_seen_new_icon_in_thread_details");
                }
                NJY.A05(C69491NmZ.THEME, njy);
                C327827Ci.A01((Context) this.A01, njy, AnonymousClass7TE.A0l(r4), (C47167Dri) this.A02);
                i = -1047897034;
                break;
            case 5:
                i2 = AnonymousClass0fD.A05(-345069742);
                Context context = (Context) this.A02;
                UserSession userSession3 = (UserSession) this.A04;
                View view2 = ((C70611ODi) this.A03).A00;
                List<C68744NVe> list = ((C68743NVd) this.A01).A02;
                ArrayList A0r = AnonymousClass7TG.A0r(list);
                for (C68744NVe nVe : list) {
                    A0r.add(new C367618rI((Drawable) null, context.getDrawable(nVe.A00), (C15048ULb) null, new PHN(nVe, 2), nVe.A04, AnonymousClass7TE.A16(context, nVe.A01), 0, 0, 0, false, false, false, true, false, false, false));
                }
                C66581MXm.A0c(context, userSession3, (Integer) null, A0r, false).showAsDropDown(view2, (-view2.getMeasuredWidth()) / 2, 0);
                i = -731697924;
                break;
            case 6:
                i2 = AnonymousClass0fD.A05(1019443189);
                C294875nB r32 = ((C67181Mjd) this.A04).A03;
                int i5 = ((C68200N5p) this.A02).A00;
                r32.Dk6((C67058MhZ) this.A01, (DirectShareTarget) this.A03, "inbox_channel_invitation", i5, i5, 0, 0, 39);
                i = 145641522;
                break;
            case 7:
                i2 = AnonymousClass0fD.A05(703306374);
                C66704MbB mbB = (C66704MbB) ((C66776McM) this.A04).A04;
                ((C74512Pw7) this.A01).Dg3((C67058MhZ) this.A02, mbB.A01, (List) this.A03, mbB.A00);
                i = -1723651455;
                break;
            case 8:
                C72549PAg pAg = (C72549PAg) this.A01;
                C69608Noq noq = (C69608Noq) this.A02;
                C72578PBj pBj = (C72578PBj) this.A03;
                Context context2 = (Context) this.A04;
                if (noq == null) {
                    return;
                }
                if (noq instanceof C68868Na0) {
                    C68868Na0 na0 = (C68868Na0) noq;
                    String str = na0.A04;
                    ((AnonymousClass7XH) pAg.A02).Cpy(na0.A01, str, na0.A02, na0.A06, na0.A03, na0.A05, na0.A00, na0.A07);
                    return;
                }
                GradientSpinner gradientSpinner = (GradientSpinner) pBj.A0G.A01();
                gradientSpinner.A04();
                if (noq instanceof C68866NZy) {
                    C68866NZy nZy = (C68866NZy) noq;
                    String str2 = nZy.A02;
                    ImageUrl imageUrl = nZy.A00;
                    AnonymousClass3OA r14 = nZy.A01;
                    String str3 = nZy.A04;
                    str3.getClass();
                    ((AnonymousClass7Wt) pAg.A02).CpS(0nA.A0F(pBj.A0I), imageUrl, new OMU(context2.getResources(), gradientSpinner), C66580MXl.A0i(str3, nZy.A03), r14, false, (Boolean) null, str2, (String) null, (String) null, (String) null, (String) null, false);
                    return;
                } else if (noq instanceof C68867NZz) {
                    C68867NZz nZz = (C68867NZz) noq;
                    String str4 = nZz.A02;
                    String str5 = nZz.A04;
                    ((AnonymousClass7X8) pAg.A02).CqX(0nA.A0F(pBj.A0K), new OMU(context2.getResources(), gradientSpinner), C66580MXl.A0i(nZz.A03, nZz.A01), nZz.A00, str4, str5, (String) null, (String) null, nZz.A05);
                    return;
                } else if (noq instanceof C68865NZx) {
                    C68865NZx nZx = (C68865NZx) noq;
                    String str6 = nZx.A03;
                    String str7 = nZx.A02;
                    ((C332847Wp) pAg.A02).Cqp((View) null, (ImageUrl) null, new C68168N3i(0nA.A0F(pBj.A0K), 0.0f), C66580MXl.A0i(nZx.A01, nZx.A00), gradientSpinner, (Long) null, (Long) null, str6, str7, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (List) null, (List) null, (List) null, (List) null, (Map) null, 1, false);
                    return;
                } else {
                    throw AnonymousClass7TE.A0z("ContextReplyMediaShareContentDefinition : Unhandled navigation fields passed");
                }
            case 9:
                i2 = AnonymousClass0fD.A05(-252781642);
                C328667Fr r9 = (C328667Fr) this.A03;
                DirectMessageIdentifier directMessageIdentifier = r9.A0L;
                if (directMessageIdentifier.A02 != null) {
                    P8O p8o = ((C72564PAv) this.A04).A00;
                    AnonymousClass9JN r1 = (AnonymousClass9JN) this.A01;
                    String str8 = r1.A04;
                    String str9 = r1.A05;
                    String str10 = r1.A06;
                    String str11 = r1.A02;
                    String str12 = r1.A03;
                    if (str10 == null) {
                        0wb.A03("StandardDxmaMessageClickDelegate", "Null CTA fields");
                    } else {
                        String str13 = str10;
                        String str14 = str11;
                        String str15 = str8;
                        String str16 = str9;
                        p8o.A00.CJS((RectF) null, r9.A0B.A04, directMessageIdentifier, (GradientSpinner) null, 0, str15, str16, str13, str14, str12, r9.A08.A00, (String) null, (String) null, (String) null, (Map) null);
                        P8O.A00(r9, p8o, true);
                    }
                }
                i = 560865876;
                break;
            case 10:
                i2 = AnonymousClass0fD.A05(-56057544);
                C67058MhZ mhZ = (C67058MhZ) this.A02;
                ((C74516PwB) this.A03).C6a();
                C71153OeR.A0B(mhZ, ((P3T) this.A01).A00, (C254743sy) this.A04);
                i = -965637824;
                break;
            case 11:
                i2 = AnonymousClass0fD.A05(-648959780);
                ((C52537GWo) this.A02).A00((Context) this.A01, ((C52435GSn) this.A04).BPf(), (AnonymousClass4DU) this.A03);
                i = 1423066753;
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                i2 = AnonymousClass0fD.A05(-1360193);
                ((WW4) this.A01).A0H((C296995qz) this.A02, (C67362Mme) this.A03, (C296925qs) this.A04);
                i = -1069001513;
                break;
            case 13:
                i2 = AnonymousClass0fD.A05(330494750);
                C67811MvF mvF = (C67811MvF) this.A04;
                AnonymousClass3UH r5 = mvF.A01;
                RecyclerView recyclerView = mvF.A00;
                if (recyclerView != null) {
                    r3 = recyclerView.A0D;
                } else {
                    r3 = null;
                }
                0qQ.A0C(r3, C273654mx.A00(7));
                r5.A00 = ((LinearLayoutManager) r3).A1a();
                C229992ok r33 = mvF.A03;
                UserSession userSession4 = ((C68040Mz7) this.A03).A05;
                AnonymousClass3UH r2 = mvF.A01;
                int i6 = r2.A01;
                AnonymousClass3UL r7 = (AnonymousClass3UL) this.A02;
                int A012 = r2.A01(r7);
                int bindingAdapterPosition = ((C249703kE) this.A01).getBindingAdapterPosition();
                AnonymousClass3UH r12 = mvF.A01;
                r33.DpF((Activity) null, (View) null, userSession4, r7, (Integer) null, r12.A0C, "profile", r12.getId(), r12.A0I, (String) null, (List) null, i6, A012, bindingAdapterPosition);
                i = -840934097;
                break;
            case 14:
                i2 = AnonymousClass0fD.A05(1425209591);
                C68206N5v n5v = (C68206N5v) this.A02;
                List list2 = n5v.A03;
                if (list2 != null) {
                    ((C68580NOc) this.A04).A03.DF1(n5v.A02, (Reel) this.A03, (PJS) this.A01, list2, n5v.A00);
                }
                i = 1741847886;
                break;
            case 15:
                i2 = AnonymousClass0fD.A05(1392896981);
                C74368Pti pti = (C74368Pti) this.A02;
                if (pti != null) {
                    pti.D9S((AnonymousClass0iw) this.A01, (C66942Mfb) this.A03, (C66967Mg0) this.A04);
                }
                i = -2040066530;
                break;
            case 16:
                i2 = AnonymousClass0fD.A05(-1399318360);
                C66967Mg0 mg0 = (C66967Mg0) this.A03;
                ((C74585PxY) this.A02).Dw5((AnonymousClass0iw) this.A01, mg0, (C66632Ma1) this.A04);
                i = 1841192706;
                break;
            case 17:
                i2 = AnonymousClass0fD.A05(-792036991);
                C66967Mg0 mg02 = (C66967Mg0) this.A03;
                AnonymousClass0iw r22 = (AnonymousClass0iw) this.A01;
                ((C67418MnZ) this.A02).A01.Dw5(r22, mg02, (C66632Ma1) this.A04);
                i = 883008048;
                break;
            case EglBase14Impl.EGLExt_SDK_VERSION:
                i2 = AnonymousClass0fD.A05(1410956856);
                Context context3 = (Context) this.A01;
                C358248ab A0Y = DbS.A0Y(context3);
                A0Y.A09(2131965564);
                A0Y.A08(2131965563);
                C74476PvW pvW = (C74476PvW) this.A02;
                A0Y.A0I(new C71189Of8(4, context3, this.A04, this.A03, pvW), 2131956481);
                A0Y.A05();
                DbT.A1V(A0Y);
                pvW.CxT();
                i = 1717130476;
                break;
            default:
                return;
        }
        AnonymousClass0fD.A0C(i, i2);
    }

    public C71400Ojz(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        this.A00 = i;
        this.A02 = obj;
        this.A04 = obj2;
        this.A03 = obj3;
        this.A01 = obj4;
    }
}
