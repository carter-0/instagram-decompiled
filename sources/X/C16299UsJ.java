package X;

import android.os.Bundle;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.UsJ  reason: case insensitive filesystem */
public final class C16299UsJ extends C47518E6c implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "HashtagRecencyFragment";
    public C19510Waw A00;
    public VO8 A01;
    public C331157Pu A02;
    public String A03;
    public final AnonymousClass0eM A04 = C227642jf.A02(this);

    public final void configureActionBar(2da r1) {
    }

    public final String getModuleName() {
        return "feed_hashtag_recency_filter";
    }

    public static final void A06(C16299UsJ usJ, String str) {
        String str2;
        VO8 vo8 = usJ.A01;
        if (vo8 != null) {
            C15381Ube ube = vo8.A00;
            C18806W2y w2y = ube.A0c;
            HAI hai = ube.A08;
            if (hai == null) {
                str2 = "dataSource";
            } else {
                String obj = hai.A00.toString();
                0qQ.A0B(obj, 0);
                C18806W2y.A03(w2y, obj, 20643842);
                ube.A0O = str;
                C15381Ube.A08(ube, str, 20643842, true, false);
                C15812Uiv[] uivArr = {new C14386TvF(C14411Tvf.ONE_BY_ONE)};
                C14227TsA tsA = ube.A06;
                str2 = "adapter";
                if (tsA != null) {
                    tsA.A06 = uivArr;
                    C14227TsA.A00(tsA);
                    C14227TsA tsA2 = ube.A06;
                    if (tsA2 != null) {
                        C14227TsA.A00(tsA2);
                        if (0qQ.A0K(ube.A0O, "top_recent_posts")) {
                            AnonymousClass0eM r6 = ube.A0i;
                            if (AnonymousClass7TE.A0q(AnonymousClass7TE.A0l(r6)).getInt("hashtag_unified_snackbar_shown_count", 0) < 1) {
                                1xC r3 = 1xC.A01;
                                C310336ap r2 = new C310336ap();
                                r2.A0D = DbV.A05(ube).getString(2131963301);
                                r2.A02();
                                UserSession A0l = AnonymousClass7TE.A0l(r6);
                                0qQ.A0B(A0l, 0);
                                boolean booleanValue = C306096Kt.A00(A0l).booleanValue();
                                int i = R.drawable.instagram_sparkles_filled_16;
                                if (booleanValue) {
                                    i = R.drawable.instagram_effects_pano_filled_16;
                                }
                                r2.A07(i);
                                r2.A0A(new WYE(ube, 1));
                                DbY.A1K(r3, r2);
                            }
                        }
                        C19510Waw waw = usJ.A00;
                        if (waw != null) {
                            waw.A00 = str;
                            usJ.A03 = str;
                            C331157Pu r1 = usJ.A02;
                            if (r1 != null) {
                                r1.A0L((C332277Ui) null);
                                return;
                            }
                            str2 = "bottomSheet";
                        } else {
                            str2 = "holder";
                        }
                    }
                }
            }
        } else {
            str2 = "delegate";
        }
        0qQ.A0F(str2);
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A04);
    }

    public final boolean isElevated() {
        return 182.A06(0Tu.A05, DbT.A0X(this.A04), 36326352353310440L);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(343350929);
        super.onCreate(bundle);
        C19510Waw waw = this.A00;
        if (waw != null) {
            this.A03 = waw.A00;
            AnonymousClass0fD.A09(-388192759, A022);
            return;
        }
        0qQ.A0F("holder");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onResume() {
        List list;
        int A022 = AnonymousClass0fD.A02(-1351540955);
        super.onResume();
        if (182.A06(0Tu.A05, DbT.A0X(this.A04), 36326352353375977L)) {
            String A0m = DbU.A0m(this, 2131963300);
            C69349Njo njo = C69349Njo.TYPE_RADIO;
            String str = this.A03;
            if (str != null) {
                OIM oim = new OIM((View.OnClickListener) null, new WB9((Object) this, 31), (View.OnClickListener) null, (C358618bC) null, njo, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, A0m, (String) null, (String) null, true, str.equals(GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT));
                String A0m2 = DbU.A0m(this, 2131963294);
                String str2 = this.A03;
                if (str2 != null) {
                    list = 0sr.A1P(new OIM[]{oim, new OIM((View.OnClickListener) null, new WB9((Object) this, 32), (View.OnClickListener) null, (C358618bC) null, njo, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, A0m2, (String) null, (String) null, true, str2.equals("top_recent_posts"))});
                }
            }
            0qQ.A0F("currentFilterSelection");
            throw AnonymousClass00P.createAndThrow();
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new C70953OTa(GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT, getString(2131963300)));
        arrayList2.add(new C70953OTa("top_recent_posts", getString(2131963294)));
        String str3 = this.A03;
        if (str3 != null) {
            arrayList.add(new C70962OTj(new C71473OlH(5, this, arrayList2), str3, arrayList2));
            list = arrayList;
        }
        0qQ.A0F("currentFilterSelection");
        throw AnonymousClass00P.createAndThrow();
        setItems(list);
        AnonymousClass0fD.A09(-1289229020, A022);
    }
}
