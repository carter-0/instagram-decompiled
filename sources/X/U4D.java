package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.feed.widget.IgProgressImageView;
import com.instagram.model.mediasize.ExtendedImageUrl;
import java.util.List;

public final class U4D extends BaseAdapter {
    public 1Xj A00;
    public Uw7 A01 = Uw7.A02;
    public List A02 = 0sn.A00;
    public final AnonymousClass0iw A03;
    public final UserSession A04;
    public final C18065Vkr A05;
    public final C15329Uae A06;
    public final AnonymousClass4UR A07;
    public final C17389VTq A08;

    public final long getItemId(int i) {
        return (long) i;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        Uw7 uw7;
        Uw7 uw72;
        Uw7 uw73;
        Object vwu;
        0qQ.A0B(viewGroup, 2);
        int itemViewType = getItemViewType(i);
        if (view == null) {
            if (itemViewType == 0) {
                view = DbU.A0A(DbV.A0D(viewGroup), viewGroup, R.layout.lightbox_product_image, false);
                vwu = new VWU(view);
            } else if (itemViewType == 1) {
                view = DbU.A0A(LayoutInflater.from(AnonymousClass7TE.A0S(viewGroup)), viewGroup, R.layout.lightbox_product_video, false);
                vwu = new VYX(view);
            } else if (itemViewType == 2) {
                view = DbU.A0A(LayoutInflater.from(AnonymousClass7TE.A0S(viewGroup)), viewGroup, R.layout.lightbox_feed_photo, false);
                vwu = new VWS(view);
            } else if (itemViewType != 3) {
                LayoutInflater from = LayoutInflater.from(AnonymousClass7TE.A0S(viewGroup));
                if (itemViewType != 4) {
                    view = DbU.A0A(from, viewGroup, R.layout.lightbox_story_video, false);
                    vwu = new C19516Wb2(view);
                } else {
                    view = DbU.A0A(from, viewGroup, R.layout.lightbox_story_photo, false);
                    vwu = new C19515Wb1(view);
                }
            } else {
                view = DbU.A0A(LayoutInflater.from(AnonymousClass7TE.A0S(viewGroup)), viewGroup, R.layout.lightbox_feed_video, false);
                vwu = new VWT(view);
            }
            view.setTag(vwu);
        }
        C18001Vjd vjd = (C18001Vjd) this.A02.get(i);
        if (itemViewType == 0) {
            Object tag = view.getTag();
            if (tag != null) {
                VWU vwu2 = (VWU) tag;
                C15329Uae uae = this.A06;
                UserSession userSession = this.A04;
                AnonymousClass0iw r3 = this.A03;
                AnonymousClass7TG.A1N(vwu2, vjd);
                AnonymousClass7TG.A0w(2, uae, userSession, r3);
                VGQ.A00(userSession, uae, vwu2.A02, vjd);
                ExtendedImageUrl A002 = vjd.A00(vwu2.A00);
                if (A002 != null) {
                    vwu2.A01.setUrl(A002, r3);
                }
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        } else if (itemViewType == 1) {
            0qQ.A0C(vjd, "null cannot be cast to non-null type com.instagram.shopping.model.pdp.herocarousel.HeroCarouselProductVideoModel");
            C16271UrY urY = (C16271UrY) vjd;
            Object tag2 = view.getTag();
            if (tag2 != null) {
                VYX vyx = (VYX) tag2;
                if (urY.A00 == this.A00) {
                    uw7 = this.A01;
                } else {
                    uw7 = Uw7.A02;
                }
                VGS.A00(this.A03, this.A04, this.A06, vyx, this.A05, uw7, urY);
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        } else if (itemViewType == 2) {
            AnonymousClass0iw r6 = this.A03;
            UserSession userSession2 = this.A04;
            Object tag3 = view.getTag();
            if (tag3 != null) {
                VWS vws = (VWS) tag3;
                0qQ.A0C(vjd, "null cannot be cast to non-null type com.instagram.shopping.model.pdp.herocarousel.HeroCarouselFeedMediaModel");
                C16272UrZ urZ = (C16272UrZ) vjd;
                C15329Uae uae2 = this.A06;
                Dba.A0j(1, r6, userSession2);
                AnonymousClass7TG.A0w(2, vws, urZ, uae2);
                VGQ.A00(userSession2, uae2, vws.A01, urZ);
                VGP.A00(userSession2, uae2, vws.A02, urZ);
                C246923fS r4 = new C246923fS(userSession2);
                1Xj r32 = urZ.A00;
                IgProgressImageView igProgressImageView = vws.A00;
                C247843h0.A00(r6, r4.A00(AnonymousClass7TE.A0S(igProgressImageView), r32), igProgressImageView);
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        } else if (itemViewType == 3) {
            0qQ.A0C(vjd, "null cannot be cast to non-null type com.instagram.shopping.model.pdp.herocarousel.HeroCarouselFeedMediaModel");
            C16272UrZ urZ2 = (C16272UrZ) vjd;
            UserSession userSession3 = this.A04;
            Object tag4 = view.getTag();
            if (tag4 != null) {
                VWT vwt = (VWT) tag4;
                if (urZ2.A00 == this.A00) {
                    uw72 = this.A01;
                } else {
                    uw72 = Uw7.A02;
                }
                AnonymousClass4UR r10 = this.A07;
                C18065Vkr vkr = this.A05;
                AnonymousClass0iw r42 = this.A03;
                C15329Uae uae3 = this.A06;
                AnonymousClass7TG.A1N(userSession3, vwt);
                C51974G9v.A1S(urZ2, uw72, r10, vkr, r42);
                0qQ.A0B(uae3, 7);
                VGQ.A00(userSession3, uae3, vwt.A00, urZ2);
                VGP.A00(userSession3, uae3, vwt.A01, urZ2);
                VGW.A00(r42, uae3, vwt.A02, vkr, uw72, urZ2, r10, urZ2.A00);
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        } else if (itemViewType != 4) {
            0qQ.A0C(vjd, "null cannot be cast to non-null type com.instagram.shopping.model.pdp.herocarousel.HeroCarouselReelModel");
            C16274Urb urb = (C16274Urb) vjd;
            Object tag5 = view.getTag();
            if (tag5 != null) {
                C19516Wb2 wb2 = (C19516Wb2) tag5;
                UserSession userSession4 = this.A04;
                if (urb.A00 == this.A00) {
                    uw73 = this.A01;
                } else {
                    uw73 = Uw7.A02;
                }
                AnonymousClass4UR r9 = this.A07;
                VGV.A00(this.A03, userSession4, this.A06, wb2, this.A05, uw73, urb, r9);
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        } else {
            AnonymousClass0iw r5 = this.A03;
            UserSession userSession5 = this.A04;
            Object tag6 = view.getTag();
            if (tag6 != null) {
                0qQ.A0C(vjd, "null cannot be cast to non-null type com.instagram.shopping.model.pdp.herocarousel.HeroCarouselReelModel");
                VGU.A00(r5, userSession5, this.A06, (C19515Wb1) tag6, (C16274Urb) vjd);
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        C17389VTq vTq = this.A08;
        0qQ.A0B(vjd, 1);
        2el r33 = vTq.A00;
        C2354830a A003 = AnonymousClass30Y.A00(vjd, (Object) null, 002.A0R("lightbox_", vjd.A01()));
        A003.A00(vTq.A01);
        C51967G9n.A0z(view, A003, r33);
        return view;
    }

    public final int getViewTypeCount() {
        return 6;
    }

    public final boolean hasStableIds() {
        return true;
    }

    public final int getCount() {
        return this.A02.size();
    }

    public final /* bridge */ /* synthetic */ Object getItem(int i) {
        return this.A02.get(i);
    }

    public final int getItemViewType(int i) {
        C18001Vjd vjd = (C18001Vjd) this.A02.get(i);
        Integer num = vjd.A02;
        int intValue = num.intValue();
        if (intValue == 3) {
            return 0;
        }
        if (intValue == 4) {
            return 1;
        }
        if (intValue != 1) {
            if (intValue != 5) {
                throw DbW.A0c("Unexpected item type: ", C18269Voj.A01(num));
            } else if (((C16274Urb) vjd).A00.CeS()) {
                return 5;
            } else {
                return 4;
            }
        } else if (((C16272UrZ) vjd).A00.CeS()) {
            return 3;
        } else {
            return 2;
        }
    }

    public U4D(AnonymousClass0iw r2, UserSession userSession, C18065Vkr vkr, C15329Uae uae, C17389VTq vTq, AnonymousClass4UR r7) {
        C51974G9v.A1P(r2, userSession, vTq, r7);
        0qQ.A0B(vkr, 5);
        this.A03 = r2;
        this.A04 = userSession;
        this.A08 = vTq;
        this.A07 = r7;
        this.A05 = vkr;
        this.A06 = uae;
    }
}
