package X;

import android.content.Context;
import com.instagram.android.R;
import com.instagram.api.schemas.ProductDiscountInformationDict;
import com.instagram.common.session.UserSession;
import com.instagram.model.shopping.incentives.igfunded.IgFundedIncentive;
import com.instagram.model.shopping.productfeed.MultiProductComponent;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class W1F {
    public UO2 A00;
    public AnonymousClass2tB A01;
    public IgFundedIncentive A02;
    public MultiProductComponent A03;
    public C17456VWj A04;
    public C18622VvF A05;
    public String A06;
    public Set A07;
    public final AnonymousClass2t9 A08;
    public final C19560Wbk A09;
    public final Context A0A;
    public final UO2 A0B;
    public final UO2 A0C;
    public final UserSession A0D;
    public final C3253572b A0E;
    public final C3253572b A0F;

    private final AnonymousClass4AA A00() {
        int i;
        String string;
        String str;
        Iterator it;
        ProductDiscountInformationDict productDiscountInformationDict;
        String name;
        Set set = this.A07;
        if (set == null || set.isEmpty()) {
            Context context = this.A0A;
            return new C15806Uip(AnonymousClass7TE.A16(context, 2131960842), context.getString(2131976608));
        }
        Set set2 = this.A07;
        if (set2 != null) {
            i = set2.size();
        } else {
            i = 0;
        }
        String str2 = "";
        Integer num = null;
        if (i > 1) {
            Context context2 = this.A0A;
            Set set3 = this.A07;
            if (set3 != null) {
                num = Integer.valueOf(set3.size());
            }
            str = DbW.A0h(context2, num, 2131967741);
            string = context2.getString(2131967742);
        } else {
            Set set4 = this.A07;
            if (!(set4 == null || (it = set4.iterator()) == null || (productDiscountInformationDict = (ProductDiscountInformationDict) it.next()) == null || (name = productDiscountInformationDict.getName()) == null)) {
                str2 = name;
            }
            Context context3 = this.A0A;
            String string2 = context3.getString(2131964328);
            string = context3.getString(2131972983);
            str = str2;
            str2 = string2;
        }
        return new C15809Uis(str, str2, string);
    }

    private final WSI A01(IgFundedIncentive igFundedIncentive) {
        String str = igFundedIncentive.A07;
        return new WSI(new C61073JwB(igFundedIncentive.A0A, igFundedIncentive.A06, this.A0A.getString(2131972983)), new C17464VWr(new C20613Wvu(15, this, igFundedIncentive), new C20613Wvu(16, this, igFundedIncentive), this.A09.A00.isVisible()), str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003b, code lost:
        if (r1 != false) goto L_0x003d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00e3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A02(X.W1F r9) {
        /*
            com.instagram.common.recyclerview.ViewModelListUpdate r4 = new com.instagram.common.recyclerview.ViewModelListUpdate
            r4.<init>()
            X.VvF r3 = r9.A05
            if (r3 == 0) goto L_0x0090
            int r8 = r3.A00
            java.lang.String r6 = "incentive_divider"
            r7 = 1
            r5 = 0
            if (r8 != 0) goto L_0x0096
            com.instagram.model.shopping.incentives.igfunded.IgFundedIncentive r1 = r9.A02
            if (r1 == 0) goto L_0x002a
            java.lang.Integer r0 = r1.A04
            if (r0 == 0) goto L_0x0091
            X.WSI r0 = r9.A01(r1)
            r4.A00(r0)
            X.WRt r0 = new X.WRt
            r0.<init>(r6)
        L_0x0025:
            X.2tL r0 = (X.C232262tL) r0
            r4.A00(r0)
        L_0x002a:
            com.instagram.user.model.User r6 = r3.A05
            X.72b r5 = r9.A0E
            com.instagram.model.shopping.productfeed.MultiProductComponent r0 = r9.A03
            if (r0 == 0) goto L_0x003d
            com.instagram.model.shopping.productfeed.ProductFeedResponse r0 = r0.A03
            java.util.List r0 = r0.A03
            boolean r1 = X.C13988Tno.A1a(r0)
            r0 = 1
            if (r1 == 0) goto L_0x003e
        L_0x003d:
            r0 = 0
        L_0x003e:
            r5.A0M = r0
            android.content.Context r2 = r9.A0A
            r1 = 2131973740(0x7f13566c, float:1.9584524E38)
            java.lang.String r0 = X.C13988Tno.A0b(r6)
            java.lang.String r0 = X.DbW.A0h(r2, r0, r1)
            r5.A0C = r0
            X.PQx r0 = new X.PQx
            r0.<init>(r7, r9, r6)
            r5.A06 = r0
            X.6rr r1 = X.C320156rr.EMPTY
            X.NPA r0 = new X.NPA
            r0.<init>(r5, r1)
        L_0x005d:
            X.2tL r0 = (X.C232262tL) r0
            r4.A00(r0)
            com.instagram.model.shopping.productfeed.MultiProductComponent r0 = r9.A03
            if (r0 == 0) goto L_0x007c
            com.instagram.model.shopping.productfeed.ProductFeedResponse r0 = r0.A03
            java.util.List r0 = r0.A03
            boolean r0 = X.C13988Tno.A1a(r0)
            if (r0 != 0) goto L_0x007c
            com.instagram.model.shopping.productfeed.MultiProductComponent r1 = r9.A03
            if (r1 == 0) goto L_0x007c
            X.WS0 r0 = new X.WS0
            r0.<init>(r1)
            r4.A00(r0)
        L_0x007c:
            X.UO2 r1 = r9.A00
            if (r1 == 0) goto L_0x0087
            int r0 = r3.A00
            if (r0 <= 0) goto L_0x0087
            r4.A00(r1)
        L_0x0087:
            X.2tB r1 = r9.A01
            X.2t9 r0 = r9.A08
            if (r1 == 0) goto L_0x0152
            r0.A06(r4, r1)
        L_0x0090:
            return
        L_0x0091:
            X.4AA r0 = r9.A00()
            goto L_0x0025
        L_0x0096:
            int r0 = r3.A01
            int r8 = r8 - r0
            r2 = 0
            if (r8 <= 0) goto L_0x0123
            java.util.List r0 = r3.A09
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0123
            android.content.Context r0 = r9.A0A
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131820601(0x7f110039, float:1.9273922E38)
            java.lang.String r1 = X.DbY.A0d(r1, r8, r0)
            X.0qQ.A07(r1)
            X.Uip r0 = new X.Uip
            r0.<init>(r1, r2)
        L_0x00b9:
            r4.A00(r0)
        L_0x00bc:
            X.UO2 r0 = r9.A0C
            r4.A00(r0)
            com.instagram.user.model.User r2 = r3.A05
            X.0qQ.A07(r2)
            android.content.Context r1 = r9.A0A
            r0 = 2131962355(0x7f1329f3, float:1.9561433E38)
            java.lang.String r1 = X.AnonymousClass7TE.A16(r1, r0)
            X.IOX r0 = new X.IOX
            r0.<init>(r2, r1, r5)
            r4.A00(r0)
            java.util.List r0 = r3.A06
            java.util.Iterator r6 = X.JTQ.A0h(r0)
        L_0x00dd:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x014e
            java.lang.Object r5 = r6.next()
            X.W0O r5 = (X.W0O) r5
            java.lang.String r1 = r9.A06
            if (r1 == 0) goto L_0x00f8
            java.lang.String r0 = r5.A04()
            boolean r0 = X.0qQ.A0K(r0, r1)
            if (r0 == 0) goto L_0x00f8
            goto L_0x00dd
        L_0x00f8:
            X.0qQ.A0A(r5)
            java.lang.String r1 = r5.A04()
            X.0qQ.A07(r1)
            X.VWj r0 = r9.A04
            r2 = 0
            if (r0 == 0) goto L_0x011a
            java.util.Map r0 = r0.A00
            java.lang.Object r1 = r0.get(r1)
            X.VTg r1 = (X.C17379VTg) r1
            if (r1 == 0) goto L_0x011a
            boolean r0 = r1.A01
            if (r0 == 0) goto L_0x011a
            boolean r0 = r1.A00
            if (r0 != 0) goto L_0x011a
            r2 = 1
        L_0x011a:
            X.WRz r0 = new X.WRz
            r0.<init>(r5, r2)
            r4.A00(r0)
            goto L_0x00dd
        L_0x0123:
            java.util.Set r0 = r9.A07
            if (r0 == 0) goto L_0x012d
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0131
        L_0x012d:
            com.instagram.model.shopping.incentives.igfunded.IgFundedIncentive r0 = r9.A02
            if (r0 == 0) goto L_0x00bc
        L_0x0131:
            com.instagram.model.shopping.incentives.igfunded.IgFundedIncentive r1 = r9.A02
            if (r1 == 0) goto L_0x0149
            java.lang.Integer r0 = r1.A04
            if (r0 == 0) goto L_0x0149
            X.WSI r0 = r9.A01(r1)
            r4.A00(r0)
            X.WRt r0 = new X.WRt
            r0.<init>(r6)
        L_0x0145:
            X.2tL r0 = (X.C232262tL) r0
            goto L_0x00b9
        L_0x0149:
            X.4AA r0 = r9.A00()
            goto L_0x0145
        L_0x014e:
            X.UO2 r0 = r9.A0B
            goto L_0x005d
        L_0x0152:
            r0.A05(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.W1F.A02(X.W1F):void");
    }

    /* JADX WARNING: type inference failed for: r0v16, types: [X.2tF, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v19, types: [X.2tF, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v20, types: [X.2tF, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v22, types: [X.2tF, java.lang.Object] */
    public W1F(Context context, AnonymousClass0iw r8, C14819UAy uAy, UserSession userSession, C19560Wbk wbk, Map map) {
        AnonymousClass7TG.A1Q(userSession, wbk);
        0qQ.A0B(uAy, 5);
        this.A0A = context;
        this.A0D = userSession;
        this.A09 = wbk;
        2Yu.A0F(context, R.attr.igds_color_primary_background);
        C3253572b r1 = new C3253572b();
        r1.A02 = R.drawable.loadmore_icon_refresh_compound;
        r1.A00 = 2Yu.A0F(context, R.attr.igds_color_primary_background);
        WBC.A01(r1, wbk, 28);
        this.A0F = r1;
        C3253572b r12 = new C3253572b();
        r12.A02 = R.drawable.instagram_shopping_cart_outline_96;
        r12.A0D = context.getString(2131966182);
        r12.A07 = context.getString(2131973754);
        r12.A00 = 2Yu.A0F(context, R.attr.igds_color_primary_background);
        this.A0E = r12;
        this.A0C = new UO2(Integer.valueOf(2Yu.A0H(context, R.attr.igds_color_primary_background)), (Integer) null, "top_padding_view_model_key", R.dimen.abc_button_padding_horizontal_material);
        this.A0B = new UO2(Integer.valueOf(2Yu.A0H(context, R.attr.igds_color_primary_background)), (Integer) null, "bag_items_bottom_padding_view_model_key", R.dimen.ab_test_media_thumbnail_preview_item_internal_padding);
        AnonymousClass2tC A002 = AnonymousClass2t9.A00(context);
        A002.A01(new C15756Ui1(wbk));
        A002.A01(new C15755Ui0(wbk));
        A002.A01(new Object());
        A002.A01(new C15763Ui8((C17269VOw) null));
        A002.A01(new H7G(r8, wbk, AnonymousClass05K.A00));
        C13991Tnr.A1E(A002, new Object());
        A002.A01(new Object());
        A002.A01(new C15789UiY(r8, userSession, wbk, map));
        A002.A01(new Object());
        this.A08 = DbU.A0U(A002, new C15790UiZ(r8, uAy, userSession, wbk));
    }
}
