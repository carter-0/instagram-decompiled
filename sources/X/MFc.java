package X;

import com.instagram.api.schemas.ProductTaggingFeedComponentType;
import com.instagram.common.session.UserSession;
import com.instagram.direct.securityalert.data.SecurityAlertLocalDataSource;
import com.instagram.shopping.intf.taggingfeed.ShoppingTaggingFeedArguments;
import com.instagram.shopping.model.taggingfeed.SourceType;
import java.util.ArrayList;
import java.util.List;

public final class MFc extends AnonymousClass1Ek implements 0sL {
    public Object A00;
    public final int A01;
    public final Object A02;
    public final String A03;
    public final boolean A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MFc(Object obj, String str, AnonymousClass4D7 r4, int i, boolean z) {
        super(2, r4);
        this.A01 = i;
        this.A02 = obj;
        this.A03 = str;
        this.A04 = z;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [X.MFc, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r12) {
        Object obj2;
        String str;
        boolean z;
        int i;
        AnonymousClass4D7 r3 = r12;
        switch (this.A01) {
            case 0:
                obj2 = this.A02;
                str = this.A03;
                z = this.A04;
                i = 0;
                break;
            case 1:
                String str2 = this.A03;
                boolean z2 = this.A04;
                return new MFc((AnonymousClass0iw) this.A00, (UserSession) this.A02, str2, r12, z2);
            default:
                obj2 = this.A02;
                str = this.A03;
                z = this.A04;
                i = 2;
                break;
        }
        ? mFc = new MFc(obj2, str, r3, i, z);
        mFc.A00 = obj;
        return mFc;
    }

    public final Object invokeSuspend(Object obj) {
        String str;
        int i;
        C60340gF r0;
        String str2;
        C263944Ny r1;
        switch (this.A01) {
            case 0:
                0eS.A00(obj);
                SecurityAlertLocalDataSource securityAlertLocalDataSource = (SecurityAlertLocalDataSource) this.A02;
                String str3 = this.A03;
                boolean z = this.A04;
                try {
                    C66558MWm A012 = securityAlertLocalDataSource.A02.A01();
                    boolean A1P = AnonymousClass7TF.A1P(z ? 1 : 0);
                    C65279LqY lqY = (C65279LqY) A012;
                    C251983oI r5 = lqY.A02;
                    r5.assertNotSuspendingTransaction();
                    1Vg r4 = lqY.A04;
                    AnonymousClass1WV acquire = r4.acquire();
                    acquire.ADa(1, A1P ? 1 : 0);
                    acquire.ADh(2, str3);
                    try {
                        r5.beginTransaction();
                        acquire.ATQ();
                        r5.setTransactionSuccessful();
                        r5.endTransaction();
                        r4.release(acquire);
                        r0 = C60340gF.A00;
                    } catch (Throwable th) {
                        r4.release(acquire);
                        throw th;
                    }
                } catch (Throwable th2) {
                    r0 = JTO.A1B(th2);
                }
                boolean z2 = !(r0 instanceof 0eQ);
                securityAlertLocalDataSource.A03.FIA("setIsConfirmedPeerDeviceChangeAlert");
                return Boolean.valueOf(z2);
            case 1:
                0eS.A00(obj);
                UserSession userSession = (UserSession) this.A02;
                String str4 = this.A03;
                boolean A05 = 2R8.A05(userSession, str4);
                if (this.A04) {
                    if (A05) {
                        i = 5095;
                    } else {
                        i = 1650;
                    }
                    str = AnonymousClass000.A00(i);
                } else if (A05) {
                    str = "self_profile";
                } else {
                    str = "profile";
                }
                C49049EoT.A00((AnonymousClass0iw) this.A00, userSession, "impression", AnonymousClass000.A00(341), str, str4, (String) null);
                break;
            default:
                0eS.A00(obj);
                C59678JTj jTj = (C59678JTj) this.A00;
                C64141LQd lQd = (C64141LQd) this.A02;
                String str5 = this.A03;
                boolean z3 = this.A04;
                C64141LQd.A01(lQd, str5, new C58736Iwj(26, jTj, z3));
                C17999Vjb vjb = lQd.A03;
                K1Y k1y = (K1Y) jTj.A01;
                0qQ.A0B(k1y, 0);
                List list = k1y.A02;
                if (list != null) {
                    ArrayList A1C = AnonymousClass7TE.A1C();
                    for (Object next : list) {
                        if (((C68169N3k) next).A02 == ProductTaggingFeedComponentType.COMMERCE_ITEM) {
                            A1C.add(next);
                        }
                    }
                    int size = A1C.size();
                    0qQ.A0B(str5, 1);
                    ShoppingTaggingFeedArguments shoppingTaggingFeedArguments = vjb.A02;
                    C61069Jw7 jw7 = k1y.A00;
                    if (jw7 != null) {
                        C61062Jw0 jw0 = (C61062Jw0) jw7.A01;
                        0Aj A0e = AnonymousClass7TE.A0e((0wc) vjb.A03.getValue(), "instagram_shopping_product_tagging_feed_load_success");
                        A0e.AAJ("prior_module", shoppingTaggingFeedArguments.A0B);
                        A0e.AAJ("session_instance_id", shoppingTaggingFeedArguments.A0F);
                        A0e.AAJ("waterfall_id", shoppingTaggingFeedArguments.A0G);
                        A0e.AAJ("usage", shoppingTaggingFeedArguments.A03.A00);
                        A0e.AAJ("source_type", jw0.A01.toString());
                        A0e.AAJ("source_id", jw0.A03);
                        A0e.A7p("is_initial_load", JTP.A0g(A0e, "source_name", jw0.A04, z3));
                        A0e.A9F(C66579MXk.A00(158), DbS.A0j(size));
                        A0e.A7p(AnonymousClass000.A00(4829), Boolean.valueOf(k1y.A03));
                        A0e.AAe(AnonymousClass000.A00(1291), (List) jw0.A00);
                        String str6 = jw0.A02;
                        if (str6 != null) {
                            r1 = new C263944Ny(Long.valueOf(DbZ.A07(str6)));
                        } else {
                            r1 = null;
                        }
                        A0e.AAE(r1, "merchant_id");
                        A0e.AAJ("search_text", str5);
                        A0e.AAK((0bb) vjb.A04.getValue(), "suggested_tags_info");
                        A0e.A7p("is_organic_product_tagging", Boolean.valueOf(shoppingTaggingFeedArguments.A00));
                        A0e.Cgf();
                        if (z3) {
                            C64834Liw A002 = C17053VGb.A00(lQd.A02);
                            C61069Jw7 jw72 = k1y.A00;
                            if (jw72 != null) {
                                A002.A04((Boolean) null, (String) null, ((SourceType) ((C61062Jw0) jw72.A01).A01).A00, (String) null, (String) null, false);
                                break;
                            }
                        }
                    }
                    str2 = "meta";
                } else {
                    str2 = "feed";
                }
                0qQ.A0F(str2);
                throw AnonymousClass00P.createAndThrow();
        }
        return C60340gF.A00;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((MFc) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MFc(AnonymousClass0iw r2, UserSession userSession, String str, AnonymousClass4D7 r5, boolean z) {
        super(2, r5);
        this.A01 = 1;
        this.A02 = userSession;
        this.A03 = str;
        this.A04 = z;
        this.A00 = r2;
    }
}
