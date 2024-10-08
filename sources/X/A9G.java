package X;

import com.instagram.api.schemas.ShoppingSwipeUpCTATextIcon;
import com.instagram.common.session.UserSession;
import com.instagram.feed.media.EffectPreview;
import com.instagram.feed.media.EffectPreviewIntf;
import com.instagram.feed.media.ReelCTA;
import com.instagram.feed.media.ReelCTAIntf;
import com.instagram.model.androidlink.AndroidLink;
import com.instagram.model.shopping.reels.ProductCollectionLink;
import com.instagram.model.shopping.reels.ProductCollectionLinkIntf;
import com.instagram.model.shopping.reels.ProfileShopLink;
import com.instagram.model.shopping.reels.ProfileShopLinkIntf;
import com.instagram.model.shopping.reels.ReelMultiProductLink;
import com.instagram.model.shopping.reels.ReelMultiProductLinkIntf;
import com.instagram.model.shopping.reels.ReelProductLink;
import com.instagram.model.shopping.reels.ReelProductLinkIntf;
import java.util.ArrayList;
import java.util.List;

public final class A9G {
    public ShoppingSwipeUpCTATextIcon A00;
    public EffectPreviewIntf A01;
    public ProductCollectionLinkIntf A02;
    public ProfileShopLinkIntf A03;
    public ReelMultiProductLinkIntf A04;
    public ReelProductLinkIntf A05;
    public Boolean A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public List A0D;
    public List A0E;
    public final ReelCTAIntf A0F;

    public final ReelCTA A00() {
        EffectPreview effectPreview;
        ArrayList arrayList;
        ReelMultiProductLink reelMultiProductLink;
        ArrayList arrayList2;
        ProductCollectionLink productCollectionLink;
        ReelProductLink reelProductLink;
        ProfileShopLink profileShopLink = null;
        1E9 r11 = new 1E9(new 1hu((UserSession) null), 6, false);
        ShoppingSwipeUpCTATextIcon shoppingSwipeUpCTATextIcon = this.A00;
        String str = this.A07;
        String str2 = this.A08;
        String str3 = this.A09;
        EffectPreviewIntf effectPreviewIntf = this.A01;
        if (effectPreviewIntf != null) {
            effectPreview = effectPreviewIntf.FE1();
        } else {
            effectPreview = null;
        }
        String str4 = this.A0A;
        String str5 = this.A0B;
        Boolean bool = this.A06;
        List<AndroidLink> list = this.A0D;
        if (list != null) {
            arrayList = AnonymousClass7TF.A0p(list);
            for (AndroidLink FES : list) {
                arrayList.add(FES.FES());
            }
        } else {
            arrayList = null;
        }
        ReelMultiProductLinkIntf reelMultiProductLinkIntf = this.A04;
        if (reelMultiProductLinkIntf != null) {
            reelMultiProductLink = reelMultiProductLinkIntf.FFp(r11);
        } else {
            reelMultiProductLink = null;
        }
        String str6 = this.A0C;
        List<AndroidLink> list2 = this.A0E;
        if (list2 != null) {
            arrayList2 = AnonymousClass7TF.A0p(list2);
            for (AndroidLink FES2 : list2) {
                arrayList2.add(FES2.FES());
            }
        } else {
            arrayList2 = null;
        }
        ProductCollectionLinkIntf productCollectionLinkIntf = this.A02;
        if (productCollectionLinkIntf != null) {
            productCollectionLink = productCollectionLinkIntf.FFg();
        } else {
            productCollectionLink = null;
        }
        ReelProductLinkIntf reelProductLinkIntf = this.A05;
        if (reelProductLinkIntf != null) {
            reelProductLink = reelProductLinkIntf.FFq(r11);
        } else {
            reelProductLink = null;
        }
        ProfileShopLinkIntf profileShopLinkIntf = this.A03;
        if (profileShopLinkIntf != null) {
            profileShopLink = profileShopLinkIntf.FFo();
        }
        return new ReelCTA(shoppingSwipeUpCTATextIcon, effectPreview, productCollectionLink, profileShopLink, reelMultiProductLink, reelProductLink, bool, str, str2, str3, str4, str5, str6, arrayList, arrayList2);
    }

    public A9G(ReelCTA reelCTA) {
        this.A0F = reelCTA;
        this.A00 = reelCTA.AtJ();
        this.A07 = reelCTA.AtK();
        this.A08 = reelCTA.AtL();
        this.A09 = reelCTA.AtU();
        this.A01 = reelCTA.B0A();
        this.A0A = reelCTA.B5a();
        this.A0B = reelCTA.B5b();
        this.A06 = reelCTA.BBN();
        this.A0D = reelCTA.BN4();
        this.A04 = reelCTA.BUd();
        this.A0C = reelCTA.BXk();
        this.A0E = reelCTA.Bfy();
        this.A02 = reelCTA.Bg1();
        this.A05 = reelCTA.BgL();
        this.A03 = reelCTA.BhE();
    }
}
