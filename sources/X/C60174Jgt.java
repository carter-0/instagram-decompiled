package X;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.facebookpay.offsite.models.message.ServerW3CShippingAddressConstants;
import com.instagram.android.R;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Jgt  reason: case insensitive filesystem */
public final class C60174Jgt extends 2YL {
    public final Map A00 = AnonymousClass7TE.A1H();
    public final 05G A01;
    public final 05G A02;
    public final AnonymousClass0Ud A03;
    public final Resources A04;
    public final AnonymousClass0Ud A05;

    public C60174Jgt(Resources resources) {
        String A002;
        this.A04 = resources;
        02z A10 = DbS.A10(AnonymousClass7TE.A1H());
        this.A02 = A10;
        this.A03 = 10b.A03(A10);
        02z A102 = DbS.A10(AnonymousClass7TE.A1H());
        this.A01 = A102;
        this.A05 = 10b.A03(A102);
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        A1H.put("nature", AnonymousClass7TF.A0x(Integer.valueOf(R.drawable.nature_thumbnail), R.drawable.nature));
        A1H.put("workplace", AnonymousClass7TF.A0x(Integer.valueOf(R.drawable.workplace_thumbnail), R.drawable.workplace));
        A1H.put("mars", AnonymousClass7TF.A0x(Integer.valueOf(R.drawable.mars_thumbnail), R.drawable.mars));
        A1H.put("snowView", AnonymousClass7TF.A0x(Integer.valueOf(R.drawable.snow_view_thumbnail), R.drawable.snow_view));
        A1H.put("stars", AnonymousClass7TF.A0x(Integer.valueOf(R.drawable.stars_thumbnail), R.drawable.stars));
        A1H.put("fuji", AnonymousClass7TF.A0x(Integer.valueOf(R.drawable.fuji_thumbnail), R.drawable.fuji));
        A1H.put("largeClassroom", AnonymousClass7TF.A0x(Integer.valueOf(R.drawable.large_classroom_thumbnail), R.drawable.large_classroom));
        A1H.put("mall", AnonymousClass7TF.A0x(Integer.valueOf(R.drawable.mall_thumbnail), R.drawable.mall));
        A1H.put("livingroom", AnonymousClass7TF.A0x(Integer.valueOf(R.drawable.livingroom_thumbnail), R.drawable.livingroom));
        A1H.put("spacecraft", AnonymousClass7TF.A0x(Integer.valueOf(R.drawable.spacecraft_thumbnail), R.drawable.spacecraft));
        A1H.put("forest", AnonymousClass7TF.A0x(Integer.valueOf(R.drawable.forest_thumbnail), R.drawable.forest));
        A1H.put("beach", AnonymousClass7TF.A0x(Integer.valueOf(R.drawable.beach_thumbnail), R.drawable.beach));
        A1H.put("stair", AnonymousClass7TF.A0x(Integer.valueOf(R.drawable.stair_thumbnail), R.drawable.stair));
        A1H.put("flowerRoad", AnonymousClass7TF.A0x(Integer.valueOf(R.drawable.flower_road_thumbnail), R.drawable.flower_road));
        A1H.put("classroom", AnonymousClass7TF.A0x(Integer.valueOf(R.drawable.classroom_thumbnail), R.drawable.classroom));
        A1H.put("kitchen", AnonymousClass7TF.A0x(Integer.valueOf(R.drawable.kitchen_thumbnail), R.drawable.kitchen));
        A1H.put("rain", AnonymousClass7TF.A0x(Integer.valueOf(R.drawable.rain_thumbnail), R.drawable.rain));
        A1H.put("flower", AnonymousClass7TF.A0x(Integer.valueOf(R.drawable.flower_thumbnail), R.drawable.flower));
        A1H.put("privateJet", AnonymousClass7TF.A0x(Integer.valueOf(R.drawable.private_jet_thumbnail), R.drawable.private_jet));
        A1H.put("autumn", AnonymousClass7TF.A0x(Integer.valueOf(R.drawable.autumn_thumbnail), R.drawable.autumn));
        A1H.put(ServerW3CShippingAddressConstants.CITY, AnonymousClass7TF.A0x(Integer.valueOf(R.drawable.city_thumbnail), R.drawable.city));
        A1H.put("whiteShoppingMall", AnonymousClass7TF.A0x(Integer.valueOf(R.drawable.white_shopping_mall_thumbnail), R.drawable.white_shopping_mall));
        A1H.put("shoppingCenter", AnonymousClass7TF.A0x(Integer.valueOf(R.drawable.shopping_center_thumbnail), R.drawable.shopping_center));
        A1H.put("cafe", AnonymousClass7TF.A0x(Integer.valueOf(R.drawable.cafe_thumbnail), R.drawable.cafe));
        A1H.put("palace", AnonymousClass7TF.A0x(Integer.valueOf(R.drawable.palace_thumbnail), R.drawable.palace));
        A1H.put("town", AnonymousClass7TF.A0x(Integer.valueOf(R.drawable.town_thumbnail), R.drawable.town));
        A1H.put("aisle", AnonymousClass7TF.A0x(Integer.valueOf(R.drawable.aisle_thumbnail), R.drawable.aisle));
        LinkedHashMap A0o = C51975G9x.A0o(A1H);
        Iterator A0s = AnonymousClass7TF.A0s(A1H);
        while (true) {
            boolean hasNext = A0s.hasNext();
            A002 = C273654mx.A00(352);
            if (!hasNext) {
                break;
            }
            Map.Entry A1J = AnonymousClass7TE.A1J(A0s);
            Object key = A1J.getKey();
            Drawable A003 = AnonymousClass2dd.A00(this.A04, C51970G9q.A0B((0eP) A1J.getValue()));
            0qQ.A0C(A003, A002);
            A0o.put(key, A003);
        }
        A10.Epw(A0o);
        05G r5 = this.A01;
        LinkedHashMap A0o2 = C51975G9x.A0o(A1H);
        Iterator A0s2 = AnonymousClass7TF.A0s(A1H);
        while (A0s2.hasNext()) {
            Map.Entry A1J2 = AnonymousClass7TE.A1J(A0s2);
            Object key2 = A1J2.getKey();
            Drawable A004 = AnonymousClass2dd.A00(this.A04, C51969G9p.A0A((0eP) A1J2.getValue()));
            0qQ.A0C(A004, A002);
            A0o2.put(key2, A004);
        }
        r5.Epw(A0o2);
    }
}
