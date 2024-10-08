package X;

import android.os.Parcelable;
import com.instagram.shopping.model.pdp.herocarousel.HeroCarouselItemConverter$ParcelableHeroCarouselItemModel;
import java.util.ArrayList;
import java.util.List;

public abstract class VHI {
    public static Parcelable[] A00(List list) {
        HeroCarouselItemConverter$ParcelableHeroCarouselItemModel heroCarouselItemConverter$ParcelableHeroCarouselItemModel;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            C18001Vjd vjd = (C18001Vjd) list.get(i);
            Integer num = vjd.A02;
            switch (num.intValue()) {
                case 0:
                    heroCarouselItemConverter$ParcelableHeroCarouselItemModel = new HeroCarouselItemConverter$ParcelableHeroCarouselItemModel((C16276Urd) vjd);
                    break;
                case 1:
                    heroCarouselItemConverter$ParcelableHeroCarouselItemModel = new HeroCarouselItemConverter$ParcelableHeroCarouselItemModel((C16272UrZ) vjd);
                    break;
                case 2:
                    break;
                case 3:
                    heroCarouselItemConverter$ParcelableHeroCarouselItemModel = new HeroCarouselItemConverter$ParcelableHeroCarouselItemModel((C16273Ura) vjd);
                    break;
                case 4:
                    heroCarouselItemConverter$ParcelableHeroCarouselItemModel = new HeroCarouselItemConverter$ParcelableHeroCarouselItemModel((C16271UrY) vjd);
                    break;
                case 5:
                    heroCarouselItemConverter$ParcelableHeroCarouselItemModel = new HeroCarouselItemConverter$ParcelableHeroCarouselItemModel((C16274Urb) vjd);
                    break;
                default:
                    throw DbW.A0c(AnonymousClass000.A00(486), C18269Voj.A01(num));
            }
            arrayList.add(heroCarouselItemConverter$ParcelableHeroCarouselItemModel);
        }
        return (Parcelable[]) arrayList.toArray(new Parcelable[arrayList.size()]);
    }
}
