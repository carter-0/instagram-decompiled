package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.feed.media.EffectPreviewIntf;
import com.instagram.model.venue.Venue;
import java.util.List;

public final /* synthetic */ class GFB extends 03J implements 0sF {
    public GFB(Object obj) {
        super(8, obj, GBI.class, "launchVideoEffectSheet", "launchVideoEffectSheet(Lcom/instagram/feed/media/Media;Lcom/instagram/feed/ui/state/MediaState;Ljava/util/List;Ljava/util/List;Lcom/instagram/model/venue/Venue;Ljava/lang/Integer;Lcom/facebook/analytics/structuredlogger/enums/InstagramPivotPageEntryPoint;Z)V", 0);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        List<EffectPreviewIntf> list = (List) obj3;
        List<GNW> list2 = (List) obj4;
        Venue venue = (Venue) obj5;
        Number number = (Number) obj6;
        boolean A1a = AnonymousClass7TE.A1a(obj8);
        Object obj9 = obj;
        Object obj10 = obj2;
        C51974G9v.A1O(obj9, obj10, list, list2);
        Object obj11 = obj7;
        GBI gbi = (GBI) C51965G9l.A0s(obj11, this, 6);
        FragmentActivity fragmentActivity = gbi.A01;
        C46498Dg1 dg1 = new C46498Dg1(fragmentActivity, gbi.A04);
        if (number != null) {
            dg1.A01(number.intValue());
        }
        for (EffectPreviewIntf effectPreviewIntf : list) {
            dg1.A0C(effectPreviewIntf.getName(), new FOP(4, effectPreviewIntf, obj11, obj10, gbi, obj9, A1a));
        }
        for (GNW gnw : list2) {
            dg1.A04(new ID0(31, (Object) gnw, obj9, (Object) gbi), gnw.A01);
        }
        if (venue != null) {
            String name = venue.A00.getName();
            if (name == null) {
                name = "";
            }
            dg1.A0C(name, new ICB(16, venue, obj9, obj10, gbi));
        }
        C51969G9p.A11(fragmentActivity, dg1);
        return C60340gF.A00;
    }
}
