package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.RectF;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.MediaControlEventSourceEnum;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.reshare.model.ClipsCelebrationReshareViewModel;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.mediatype.ProductType;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import com.instagram.realtimeclient.RealtimeConstants;
import com.instagram.save.model.SavedCollection;
import com.instagram.user.model.User;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: X.IVm  reason: case insensitive filesystem */
public final class C57277IVm implements MVB {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;

    public final /* synthetic */ void onTextClick(View view) {
    }

    public C57277IVm(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.A00 = i;
        this.A04 = obj3;
        this.A05 = obj4;
        this.A01 = obj5;
        this.A02 = obj;
        this.A03 = obj2;
    }

    public static void A00(0Aj r2, C57277IVm iVm) {
        r2.A8M((C54669HOa) iVm.A02, "project");
        r2.A8M((EZb) iVm.A03, "screen");
    }

    public final void onButtonClick(View view) {
        String str;
        switch (this.A00) {
            case 0:
                GJT gjt = (GJT) this.A05;
                Context context = (Context) this.A02;
                if (AnonymousClass7TE.A0M(this.A01) != 0) {
                    str = "see_less";
                } else {
                    str = "see_more";
                }
                if (this.A04 != MediaControlEventSourceEnum.UFI) {
                    1xC r3 = 1xC.A01;
                    C310336ap A0a = DbS.A0a();
                    A0a.A01 = Dc5.A00();
                    DbS.A19(context, A0a, 2131975852);
                    A0a.A0R = true;
                    DbY.A1K(r3, A0a);
                    gjt.A00.Cl2(str);
                }
                C55792HnR hnR = (C55792HnR) this.A03;
                if (hnR != null) {
                    C52029GCb gCb = hnR.A02;
                    C267324bN r2 = hnR.A01;
                    gCb.D3o(r2, C54973Ha6.A00(hnR.A03), false);
                    Integer num = gCb.A03;
                    if (num != null) {
                        int intValue = num.intValue();
                        gCb.A0O.A0A.A0b(r2, intValue);
                        gCb.A0e.A0I(intValue, true);
                        gCb.A0d.A0D();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                2Eq r22 = (2Eq) this.A04;
                if (r22.C6C() != null && r22.C6f() != null) {
                    List list = (List) this.A03;
                    O36.A00((Context) this.A02, (AnonymousClass0iw) this.A01, (UserSession) this.A05, C66579MXk.A00(156), (String) null, AnonymousClass7TE.A1I(new DirectShareTarget(C66662MaV.A00(r22.C6C(), list), r22.C6f(), list, true)));
                    return;
                }
                return;
            case 2:
                C54237H4g h4g = (C54237H4g) this.A05;
                Activity activity = h4g.A01;
                if (activity != null) {
                    Context context2 = h4g.A02;
                    int A012 = AnonymousClass0nB.A01(context2);
                    float A002 = (float) AnonymousClass0nB.A00(context2);
                    RectF rectF = new RectF(0.0f, 0.0f, (float) A012, A002);
                    rectF.offsetTo(0.0f, A002);
                    Object obj = this.A04;
                    if (obj == ProductType.CLIPS) {
                        UserSession userSession = h4g.A04;
                        C243473Yx.A02(activity, h4g.A03, 28D.A1S, userSession, (ClipsCelebrationReshareViewModel) null, h4g.A06, (String) null, false);
                    } else if (obj == ProductType.FEED) {
                        FFV.A02(activity, rectF, new RectF(0.0f, 0.0f, 0.0f, 0.0f), h4g.A04, (ClipsCelebrationReshareViewModel) null, h4g.A06, AnonymousClass000.A00(2412), (String) null, h4g.A00, false);
                    } else {
                        throw AnonymousClass7TE.A0w(AnonymousClass000.A00(2530));
                    }
                    0Aj A0e = AnonymousClass7TE.A0e((0wc) this.A01, "ig_creator_connections_events");
                    DbS.A1I(A0e, "click");
                    A00(A0e, this);
                    A0e.AAJ(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS, RealtimeConstants.SEND_SUCCESS);
                    A0e.Cgf();
                    return;
                }
                return;
            case 3:
                0qQ.A0B(view, 0);
                IN9 in9 = IN9.A00;
                UserSession userSession2 = (UserSession) this.A04;
                in9.A01(userSession2);
                I6J i6j = I6J.A00;
                1Xj r1 = (1Xj) this.A02;
                ProductType A1v = r1.A1v();
                String A2n = r1.A2n();
                if (A2n != null) {
                    C47191Dsd dsd = (C47191Dsd) ((G8Q) this.A03);
                    List list2 = dsd.A04;
                    0eP A1L = AnonymousClass7TE.A1L(AnonymousClass000.A00(543), "true");
                    String str2 = dsd.A01;
                    i6j.A05(userSession2, A1v, (String) null, "post_publish_toast", (String) null, A2n, (List) null, (List) null, list2, (List) null, (List) null, (Map) null, DbY.A0p("deeplink_url", str2, A1L));
                    FragmentActivity fragmentActivity = (FragmentActivity) this.A01;
                    if (!fragmentActivity.getSupportFragmentManager().A12()) {
                        FH7.A03(DbT.A05(fragmentActivity), str2);
                        return;
                    }
                    return;
                }
                throw AnonymousClass7TE.A0y();
            case 4:
                C56669I6y.A05((Context) this.A03, (AnonymousClass0iw) this.A01, (UserSession) this.A05, (SavedCollection) this.A02, (List) this.A04);
                return;
            default:
                C48088EVg eVg = C48088EVg.HIDE_STORY_FROM;
                AnonymousClass73V.A0C((0wc) this.A04, eVg, "restrict_plus", (String) null, (String) null, C66579MXk.A00(43));
                UserSession userSession3 = (UserSession) this.A05;
                User user = (User) this.A01;
                Context context3 = (Context) this.A02;
                E66 A003 = C49925FFb.A00(userSession3, user, eVg, new C51104FoY(context3, (Fragment) this.A03, userSession3, user), (JSONObject) null, false);
                if (A003 != null) {
                    C331127Pr A0W = DbS.A0W(userSession3);
                    A0W.A0U = null;
                    A0W.A00().A03(context3, A003);
                    return;
                }
                return;
        }
    }

    public final void onDismiss() {
        if (2 - this.A00 == 0) {
            0Aj A0e = AnonymousClass7TE.A0e((0wc) this.A01, "ig_creator_connections_events");
            DbS.A1I(A0e, "dismiss");
            A00(A0e, this);
            A0e.AAJ(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS, RealtimeConstants.SEND_SUCCESS);
            A0e.Cgf();
        }
    }

    public final void onShow() {
        0Aj r6;
        String str;
        String str2;
        switch (this.A00) {
            case 0:
                C55792HnR hnR = (C55792HnR) this.A03;
                if (hnR != null) {
                    C52029GCb gCb = hnR.A02;
                    GBE gbe = gCb.A0M;
                    C267324bN r3 = hnR.A01;
                    String A002 = C54973Ha6.A00(hnR.A03);
                    gbe.A0N(r3, A002, true, false);
                    C52029GCb.A0D(r3, gCb, A002, hnR.A00, false);
                    return;
                }
                return;
            case 2:
                r6 = AnonymousClass7TE.A0e((0wc) this.A01, "ig_creator_connections_events");
                DbS.A1I(r6, "impression");
                A00(r6, this);
                str = RealtimeConstants.SEND_SUCCESS;
                str2 = IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS;
                break;
            case 3:
                I6J i6j = I6J.A00;
                UserSession userSession = (UserSession) this.A04;
                1Xj r4 = (1Xj) this.A02;
                ProductType A1v = r4.A1v();
                String A2n = r4.A2n();
                if (A2n != null) {
                    C47191Dsd dsd = (C47191Dsd) ((G8Q) this.A03);
                    List<Object> list = dsd.A04;
                    List list2 = list;
                    i6j.A04(userSession, A1v, (String) null, "post_publish_toast", (String) null, A2n, (List) null, (List) null, list2, (List) null, (List) null, (List) null, DbY.A0p("deeplink_url", dsd.A01, AnonymousClass7TE.A1L(AnonymousClass000.A00(543), "true")));
                    for (Object A0R : list) {
                        long A0R2 = AnonymousClass7TE.A0R(A0R);
                        String A2n2 = r4.A2n();
                        if (A2n2 != null) {
                            AnonymousClass0kM r1 = new AnonymousClass0kM(userSession);
                            r1.A01 = "ig_achievements";
                            0Aj A0e = AnonymousClass7TE.A0e(r1.A00(), "ig_achievements_post_publish_toast_impression");
                            Long A10 = AnonymousClass7TE.A10(A2n2);
                            if (A0e.isSampled() && A10 != null) {
                                A0e.A9F("media_igid", A10);
                                A0e.A9F("challenge_id", Long.valueOf(A0R2));
                                A0e.A7p("is_challenge_earned", (Boolean) null);
                                A0e.Cgf();
                            }
                        } else {
                            throw AnonymousClass7TE.A0z("Required value was null.");
                        }
                    }
                    String A2n3 = r4.A2n();
                    if (A2n3 != null) {
                        1ES.A03(new C56022HrU(userSession).A01(A2n3, (List) null, list));
                        return;
                    }
                    throw AnonymousClass7TE.A0z("Required value was null.");
                }
                throw AnonymousClass7TE.A0z("Required value was null.");
            case 5:
                C48088EVg eVg = C48088EVg.HIDE_STORY_FROM;
                String A003 = C66579MXk.A00(43);
                str = "restrict_plus";
                r6 = AnonymousClass7TE.A0e((0wc) this.A04, "instagram_wellbeing_upsells_impression");
                if (r6.isSampled()) {
                    Map A0w = AnonymousClass7TF.A0w("nav_chain", DbS.A0k());
                    DbS.A1M(r6, A003);
                    C51969G9p.A1F(r6, "entrypoint", AnonymousClass73V.A01(eVg), A0w);
                    str2 = "step";
                    break;
                } else {
                    return;
                }
            default:
                return;
        }
        r6.AAJ(str2, str);
        r6.Cgf();
    }
}
