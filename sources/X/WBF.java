package X;

import android.app.Activity;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.FBProductItemDetailsDict;
import com.instagram.api.schemas.ProductTileProductImpl;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.reels.Reel;
import com.instagram.model.shopping.productfeed.ProductTile;
import com.instagram.model.venue.Venue;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.reels.question.model.QuestionResponseModel;
import com.instagram.user.follow.BlockButton;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;
import java.util.List;
import org.webrtc.EglBase14Impl;

public final class WBF implements View.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public WBF(Context context, C17490VXt vXt, AnonymousClass0iw r3, User user, int i) {
        this.A00 = i;
        this.A04 = vXt;
        this.A02 = context;
        switch (i) {
            case 2:
            case 3:
                this.A03 = user;
                this.A01 = r3;
                break;
            default:
                this.A01 = r3;
                this.A03 = user;
                break;
        }
    }

    public final void onClick(View view) {
        int A05;
        String str;
        int i;
        1Xj r3;
        N4R n4r;
        0sP r2;
        1Xj r32;
        N4R n4r2;
        0sP r22;
        1Xj r33;
        N4R n4r3;
        0sP r23;
        String str2;
        switch (this.A00) {
            case 0:
                1OP.A09((Activity) this.A04, (Fragment) this.A02, (UserSession) this.A01, (1Xj) this.A03, AnonymousClass000.A00(793), false);
                return;
            case 1:
                A05 = AnonymousClass0fD.A05(1280312334);
                Activity activity = (Activity) this.A01;
                AnonymousClass0iw r4 = (AnonymousClass0iw) this.A02;
                C17801VgE vgE = (C17801VgE) this.A03;
                UserSession userSession = ((C17490VXt) this.A04).A03;
                QuestionResponseModel questionResponseModel = vgE.A00;
                if (questionResponseModel != null) {
                    str = questionResponseModel.A07;
                } else {
                    str = null;
                }
                C71093OcF A012 = ORV.A01(activity, r4, userSession, C14068TpH.STORY, C16677UzD.STORY_QUESTION_RESPONSE, str);
                A012.A01 = vgE.A00.A04;
                A012.A07(new C16389Uu7(0));
                C71093OcF.A00((C331157Pu) null, A012);
                i = 1545752412;
                break;
            case 2:
                A05 = AnonymousClass0fD.A05(757152004);
                C17490VXt vXt = (C17490VXt) this.A04;
                Context context = (Context) this.A02;
                AnonymousClass07i r6 = vXt.A00;
                User user = (User) this.A03;
                AnonymousClass0iw r1 = (AnonymousClass0iw) this.A01;
                1YZ r42 = 1YZ.A02;
                if (r42 != null) {
                    r42.A02(context, r6, vXt.A03, new C19849WgU(0), user.getId(), r1.getModuleName());
                }
                i = 403591072;
                break;
            case 3:
                A05 = AnonymousClass0fD.A05(1600699357);
                C17490VXt vXt2 = (C17490VXt) this.A04;
                Context context2 = (Context) this.A02;
                AnonymousClass07i r62 = vXt2.A00;
                User user2 = (User) this.A03;
                AnonymousClass0iw r12 = (AnonymousClass0iw) this.A01;
                1YZ r43 = 1YZ.A02;
                if (r43 != null) {
                    r43.A03(context2, r62, vXt2.A03, new C19849WgU(1), user2.getId(), r12.getModuleName(), (String) null, (String) null);
                }
                i = -1065920541;
                break;
            case 4:
                A05 = AnonymousClass0fD.A05(-1406094603);
                User user3 = (User) this.A03;
                1Z4.A00.A00((Context) this.A02, (FragmentActivity) null, ((C17490VXt) this.A04).A03, user3, (G8B) null, ((AnonymousClass0iw) this.A01).getModuleName(), (String) null, user3.getUsername());
                i = 635227167;
                break;
            case 5:
                A05 = AnonymousClass0fD.A05(-114936981);
                C296995qz r13 = (C296995qz) this.A02;
                0qQ.A0A(view);
                ((XBv) this.A01).DJt(view, r13, (C296935qt) this.A04, (1Xj) this.A03);
                i = -225524433;
                break;
            case 6:
                A05 = AnonymousClass0fD.A05(-709135087);
                C296995qz r14 = (C296995qz) this.A02;
                0qQ.A0A(view);
                ((WW4) this.A01).A0D(view, r14, (C296935qt) this.A04, (1Xj) this.A03);
                i = -868469436;
                break;
            case 7:
                A05 = AnonymousClass0fD.A05(2074967314);
                VOO voo = (VOO) this.A01;
                if (voo != null) {
                    C15357Ub9.A00((ImageUrl) this.A03, voo.A00, (Venue) this.A04, true);
                }
                i = 1957335421;
                break;
            case 8:
                A05 = AnonymousClass0fD.A05(-1773614740);
                C61084JwM jwM = (C61084JwM) this.A03;
                if (!(jwM == null || (n4r = (N4R) jwM.A00) == null || (r2 = (0sP) n4r.A00) == null)) {
                    r2.invoke(this.A01);
                }
                C18650Vw2 vw2 = (C18650Vw2) this.A04;
                if (jwM != null) {
                    r3 = (1Xj) jwM.A01;
                } else {
                    r3 = null;
                }
                C18650Vw2.A00(vw2, r3, ((C17684VcF) this.A02).A07, AnonymousClass05K.A00);
                i = 1457171658;
                break;
            case 9:
                A05 = AnonymousClass0fD.A05(2045471298);
                C61084JwM jwM2 = (C61084JwM) this.A03;
                if (!(jwM2 == null || (n4r2 = (N4R) jwM2.A00) == null || (r22 = (0sP) n4r2.A02) == null)) {
                    r22.invoke(this.A01);
                }
                C18650Vw2 vw22 = (C18650Vw2) this.A04;
                if (jwM2 != null) {
                    r32 = (1Xj) jwM2.A01;
                } else {
                    r32 = null;
                }
                C18650Vw2.A00(vw22, r32, ((C17684VcF) this.A02).A07, AnonymousClass05K.A01);
                i = -775257012;
                break;
            case 10:
                A05 = AnonymousClass0fD.A05(2142884835);
                C61084JwM jwM3 = (C61084JwM) this.A03;
                if (!(jwM3 == null || (n4r3 = (N4R) jwM3.A00) == null || (r23 = (0sP) n4r3.A02) == null)) {
                    r23.invoke(this.A01);
                }
                C18650Vw2 vw23 = (C18650Vw2) this.A04;
                if (jwM3 != null) {
                    r33 = (1Xj) jwM3.A01;
                } else {
                    r33 = null;
                }
                C18650Vw2.A00(vw23, r33, ((C17684VcF) this.A02).A07, AnonymousClass05K.A01);
                i = 598606297;
                break;
            case 11:
                A05 = AnonymousClass0fD.A05(-1367866491);
                ((0sK) ((C14233TsG) this.A04).A01.A02).invoke(this.A03, ((C14235TsI) this.A01).A01, this.A02);
                i = 1014029656;
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                A05 = AnonymousClass0fD.A05(-894496781);
                ((VNO) this.A02).A00.A00.A0c((Reel) this.A04, (C19511Wax) this.A03, (List) this.A01);
                i = -1626135766;
                break;
            case 13:
                A05 = AnonymousClass0fD.A05(1758790131);
                C331127Pr r24 = new C331127Pr((0lg) this.A04);
                Context context3 = (Context) this.A01;
                DbZ.A0z(context3, r24, 2131963293);
                C331157Pu A002 = r24.A00();
                C16299UsJ usJ = new C16299UsJ();
                usJ.A01 = (VO8) this.A03;
                usJ.A00 = (C19510Waw) this.A02;
                usJ.A02 = A002;
                A002.A03(context3, usJ);
                i = 1028033131;
                break;
            case 14:
                Reel reel = (Reel) this.A01;
                X9R x9r = (X9R) this.A02;
                C17741VdA vdA = (C17741VdA) this.A03;
                C14631Tzd tzd = (C14631Tzd) this.A04;
                if (reel != null) {
                    x9r.D2y(reel, vdA.A0J);
                    return;
                } else {
                    x9r.DzU(tzd);
                    return;
                }
            case 15:
                A05 = AnonymousClass0fD.A05(447342231);
                C14631Tzd tzd2 = (C14631Tzd) this.A03;
                W0p.A00((0wc) this.A02, tzd2);
                C255773uh r25 = tzd2.A0K;
                r25.getClass();
                Reel reel2 = tzd2.A0J;
                reel2.getClass();
                ((X9R) this.A01).D8u(tzd2, r25, (User) this.A04, reel2.A0b());
                i = -431517009;
                break;
            case 16:
                A05 = AnonymousClass0fD.A05(-106283161);
                C14631Tzd tzd3 = (C14631Tzd) this.A03;
                W0p.A00((0wc) this.A02, tzd3);
                C255773uh r15 = tzd3.A0K;
                r15.getClass();
                ((X9R) this.A01).DRv(tzd3, r15, (User) this.A04);
                i = -1761911103;
                break;
            case 17:
                A05 = A00(this, -1142055660);
                i = 411460299;
                break;
            case EglBase14Impl.EGLExt_SDK_VERSION /*18*/:
                A05 = A01(this, -1844829546);
                i = -1678758350;
                break;
            case 19:
                A05 = A00(this, 2045387218);
                i = 239745939;
                break;
            case 20:
                A05 = A00(this, -1358554306);
                i = 1445069633;
                break;
            case 21:
                A05 = A01(this, 1739350880);
                i = -497501241;
                break;
            case 22:
                A05 = A00(this, 165591824);
                i = 866540255;
                break;
            case 23:
                A05 = A01(this, 1919877539);
                i = -1128821651;
                break;
            case 24:
                A05 = AnonymousClass0fD.A05(-1503063143);
                C17641VbX vbX = (C17641VbX) this.A04;
                UserSession userSession2 = vbX.A02;
                C46498Dg1 dg1 = (C46498Dg1) this.A03;
                Context context4 = dg1.A00;
                0qQ.A0C(context4, "null cannot be cast to non-null type android.app.Activity");
                Activity activity2 = (Activity) context4;
                AnonymousClass4DU r44 = vbX.A03;
                ProductTile productTile = (ProductTile) this.A02;
                Product product = productTile.A07;
                FBProductItemDetailsDict fBProductItemDetailsDict = null;
                if (product != null) {
                    str2 = product.A0H;
                } else {
                    str2 = null;
                }
                ProductTileProductImpl productTileProductImpl = productTile.A02;
                if (productTileProductImpl != null) {
                    fBProductItemDetailsDict = productTileProductImpl.A00;
                }
                if (str2 == null) {
                    if (fBProductItemDetailsDict != null) {
                        str2 = C45683D1i.A00(fBProductItemDetailsDict);
                    } else {
                        throw new IllegalStateException("There must be a non null feed item field");
                    }
                }
                C71093OcF A013 = ORV.A01(activity2, r44, userSession2, C14068TpH.PRODUCT, C16677UzD.PRODUCT, str2);
                A013.A07(new HH4(1, this.A01, productTile, dg1, vbX));
                C71093OcF.A00((C331157Pu) null, A013);
                i = -1217506212;
                break;
            case 25:
                A05 = AnonymousClass0fD.A05(-1136234662);
                BlockButton blockButton = (BlockButton) this.A04;
                blockButton.setEnabled(false);
                if (blockButton.A00) {
                    Context A0S = AnonymousClass7TE.A0S(blockButton);
                    User user4 = (User) this.A03;
                    Object obj = this.A02;
                    SpannableStringBuilder A0D = DbY.A0D(A0S, 002.A0D(user4.getUsername(), '@'), 2131953912);
                    C358248ab r45 = new C358248ab(A0S);
                    r45.A0n(user4.Bh3(), (AnonymousClass0iw) this.A01);
                    FH6.A0C(A0D);
                    r45.A0q(A0D);
                    r45.A0I(new W5R(9, obj, (Object) user4, (Object) blockButton), 2131953913);
                    DbX.A16(new W5U(blockButton, 50), r45);
                } else {
                    User user5 = (User) this.A03;
                    BlockButton.A00((C15395Uby) this.A02, blockButton, user5);
                    BlockButton.A02(blockButton, user5);
                }
                i = -111609805;
                break;
            default:
                A05 = AnonymousClass0fD.A05(-167033432);
                X9V x9v = (X9V) this.A02;
                if (x9v != null) {
                    x9v.DLc(((WSZ) this.A03).A01, C14899UEd.A00((AnonymousClass0iw) this.A01));
                }
                i = -1085321787;
                break;
        }
        AnonymousClass0fD.A0C(i, A05);
    }

    public static int A00(WBF wbf, int i) {
        int A05 = AnonymousClass0fD.A05(i);
        ((C14140Tqa) wbf.A02).A05((Fragment) wbf.A03, (0xG) wbf.A01, wbf.A04);
        return A05;
    }

    public static int A01(WBF wbf, int i) {
        int A05 = AnonymousClass0fD.A05(i);
        ((C14140Tqa) wbf.A02).A06((Fragment) wbf.A03, (0xG) wbf.A01, wbf.A04);
        return A05;
    }

    public WBF(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        this.A00 = i;
        this.A01 = obj3;
        this.A02 = obj2;
        this.A03 = obj4;
        this.A04 = obj;
    }
}
