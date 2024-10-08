package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.facebook.android.maps.StaticMapView;
import com.instagram.android.R;
import com.instagram.api.schemas.AppstoreMetadataDict;
import com.instagram.api.schemas.MusicInfo;
import com.instagram.api.schemas.OriginalSoundConsumptionInfoIntf;
import com.instagram.api.schemas.OriginalSoundDataIntf;
import com.instagram.api.schemas.TrackData;
import com.instagram.api.schemas.WorldLocationPagesInfo;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.feed.media.CreativeConfigIntf;
import com.instagram.feed.media.EffectPreviewIntf;
import com.instagram.maps.ui.IgStaticMapView;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.model.mediasize.ImageInfo;
import com.instagram.model.people.PeopleTag;
import com.instagram.model.venue.Venue;
import com.instagram.music.common.model.MusicConsumptionModel;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class I76 {
    public static final I76 A00 = new Object();
    public static final AnonymousClass0eM A01;
    public static final AnonymousClass0eM A02;

    public static final C43885CGz A02(UserSession userSession, 1Xj r15) {
        MusicInfo BUr;
        TrackData BUk;
        String str;
        boolean z;
        MusicConsumptionModel BUp;
        Boolean Cde;
        MusicConsumptionModel BUp2;
        1Xj r5 = r15;
        C67231sQ A0n = C51966G9m.A0n(r15);
        if (A0n == null || (BUr = A0n.BUr()) == null || (BUk = BUr.BUk()) == null) {
            return null;
        }
        String audioClusterId = BUk.getAudioClusterId();
        if (audioClusterId == null) {
            audioClusterId = "";
        }
        String title = BUk.getTitle();
        if (title == null) {
            title = "";
        }
        String A05 = C291335gz.A05(A0n);
        MusicInfo BUr2 = A0n.BUr();
        if (BUr2 == null || (BUp2 = BUr2.BUp()) == null || (str = BUp2.getFormattedClipsMediaCount()) == null) {
            str = "";
        }
        SimpleImageUrl Arq = BUk.Arq();
        if (Arq == null) {
            Arq = DbS.A0V("");
        }
        boolean A08 = C291335gz.A08(A0n);
        String id = r15.getId();
        if (id != null) {
            String A0r = C51972G9s.A0r(userSession, r15);
            boolean isExplicit = BUk.isExplicit();
            MusicInfo BUr3 = A0n.BUr();
            if (BUr3 == null || (BUp = BUr3.BUp()) == null || (Cde = BUp.Cde()) == null) {
                z = false;
            } else {
                z = Cde.booleanValue();
            }
            MusicInfo BUr4 = A0n.BUr();
            0qQ.A0A(BUr4);
            return new C43885CGz(Arq, r5, BUr4.BUp(), title, A05, str, audioClusterId, id, A0r, A08, isExplicit, z);
        }
        throw AnonymousClass7TE.A0y();
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [java.lang.Object, X.CTz] */
    public static final CH0 A03(UserSession userSession, 1Xj r15) {
        OriginalSoundDataIntf BZB;
        1Xj r4 = r15;
        C67231sQ A0n = C51966G9m.A0n(r15);
        if (A0n == null || (BZB = A0n.BZB()) == null) {
            return null;
        }
        C282025Bc r1 = new C282025Bc(BZB);
        String str = r1.A09;
        String str2 = r1.A0D;
        String A05 = C291335gz.A05(A0n);
        String str3 = r1.A0B;
        if (str3 == null) {
            str3 = "";
        }
        ImageUrl Bh3 = r1.A05.Bh3();
        boolean A08 = C291335gz.A08(A0n);
        String id = r15.getId();
        if (id != null) {
            String A0r = C51972G9s.A0r(userSession, r15);
            boolean z = r1.A0J;
            boolean z2 = r1.A0M;
            OriginalSoundConsumptionInfoIntf originalSoundConsumptionInfoIntf = r1.A02;
            0qQ.A0B(originalSoundConsumptionInfoIntf, 0);
            ? obj = new Object();
            obj.A00 = originalSoundConsumptionInfoIntf;
            return new CH0(Bh3, r4, obj, str2, A05, str3, str, id, A0r, A08, z, z2, false);
        }
        throw AnonymousClass7TE.A0y();
    }

    public static final ArrayList A05(1Xj r7) {
        ArrayList A0q = AnonymousClass7TF.A0q(r7, 0);
        ArrayList A3E = r7.A3E();
        if (A3E != null) {
            Iterator it = A3E.iterator();
            while (it.hasNext()) {
                PeopleTag peopleTag = (PeopleTag) it.next();
                String id = peopleTag.getId();
                0qQ.A07(id);
                PeopleTag.UserInfo userInfo = peopleTag.A00;
                String str = userInfo.A04;
                if (str == null) {
                    str = "";
                }
                String str2 = userInfo.A02;
                if (str2 == null) {
                    str2 = "";
                }
                ImageUrl imageUrl = userInfo.A01;
                0qQ.A07(imageUrl);
                A0q.add(new H3F(imageUrl, id, str, str2));
            }
        }
        return A0q;
    }

    public final float A06(Context context, UserSession userSession, 1Xj r10, boolean z) {
        float f;
        float f2;
        float f3;
        C2606046i A012;
        0qQ.A0B(userSession, 1);
        float A002 = A00(context);
        if (DbT.A1b(A05(r10))) {
            f = context.getResources().getDimension(R.dimen.abc_alert_dialog_button_dimen) + context.getResources().getDimension(R.dimen.account_recs_header_image_margin);
        } else {
            f = 0.0f;
        }
        if (z) {
            f2 = context.getResources().getDimension(R.dimen.account_discovery_bottom_gap) + context.getResources().getDimension(R.dimen.font_large) + context.getResources().getDimension(R.dimen.account_discovery_bottom_gap);
            C67231sQ A0n = C51966G9m.A0n(r10);
            if (!(A0n == null || (A012 = C291335gz.A01(A0n)) == null || !A012.Cdd())) {
                f3 = context.getResources().getDimension(R.dimen.account_discovery_bottom_gap) + context.getResources().getDimension(R.dimen.account_group_management_row_text_size);
            }
            f3 = 0.0f;
        } else {
            f2 = 0.0f;
            f3 = 0.0f;
        }
        float dimension = context.getResources().getDimension(R.dimen.avatar_reel_ring_size_extra_large) + context.getResources().getDimension(R.dimen.abc_button_padding_horizontal_material);
        float min = Math.min(((float) 0nA.A08(context)) * 0.5f, (((A002 + (((float) A07(context, userSession, r10).size()) * dimension)) + f) + f2) + f3) / ((float) 0nA.A08(context));
        if (z) {
            return min + 0.34f;
        }
        return min;
    }

    public final List A07(Context context, UserSession userSession, 1Xj r27) {
        H3J h3j;
        H3K h3k;
        H3I h3i;
        H3N h3n;
        Object obj;
        C270564gw A1P;
        String str;
        ExtendedImageUrl extendedImageUrl;
        ImageInfo BGO;
        JSO A0l;
        String attributionTitle;
        JSO A0l2;
        String attributionTitle2;
        JSO A0l3;
        String iconicHorizonWorldName;
        JSO A0l4;
        WorldLocationPagesInfo CGk;
        String coverPhoto;
        String str2;
        List A07;
        List<EffectPreviewIntf> B02;
        CH0 ch0;
        H3M h3m;
        C270854hQ B7C;
        String AyB;
        String A0c;
        C67061rp AZY;
        UserSession userSession2 = userSession;
        1Xj r12 = r27;
        boolean A1U = AnonymousClass7TF.A1U(0, userSession2, r12);
        r12.BpO();
        boolean CcK = r12.CcK();
        ArrayList A1C = AnonymousClass7TE.A1C();
        Context context2 = context;
        if (CcK) {
            C67231sQ A0n = C51966G9m.A0n(r12);
            if (A0n == null || (AZY = A0n.AZY()) == null) {
                ch0 = null;
            } else {
                String id = r12.getId();
                if (id != null) {
                    String A0d = AnonymousClass7TF.A0d(context2.getResources(), 2131969093);
                    String additionalAudioUsername = AZY.getAdditionalAudioUsername();
                    if (additionalAudioUsername == null) {
                        additionalAudioUsername = "";
                    }
                    User A11 = C51966G9m.A11(r12);
                    if (A11 != null) {
                        ImageUrl Bh3 = A11.Bh3();
                        String id2 = r12.getId();
                        if (id2 != null) {
                            User A2A = r12.A2A(userSession2);
                            if (A2A != null) {
                                ch0 = new CH0(Bh3, r12, (C44056CTz) null, A0d, additionalAudioUsername, "", id, id2, A2A.getId(), false, false, false, A1U);
                            } else {
                                throw AnonymousClass7TE.A0z("Required value was null.");
                            }
                        } else {
                            throw AnonymousClass7TE.A0z("Required value was null.");
                        }
                    } else {
                        throw AnonymousClass7TE.A0z("Required value was null.");
                    }
                } else {
                    throw AnonymousClass7TE.A0z("Required value was null.");
                }
            }
            A1C.add(ch0);
            AppstoreMetadataDict AcH = r12.A0C.AcH();
            if (AcH != null) {
                boolean A1V = AnonymousClass7TF.A1V(AcH.BXF());
                Drawable drawable = context2.getDrawable(R.drawable.instagram_icons_exceptions_google_play_pano_outline_32);
                if (A1V) {
                    A0c = C55061HbW.A00(context2, AcH);
                } else {
                    A0c = DbY.A0c(context2, AcH.BHr(), 2131952954);
                }
                String A16 = AnonymousClass7TE.A16(02K.A01(context2), 2131971363);
                String id3 = r12.getId();
                if (id3 != null) {
                    h3m = new H3M(drawable, id3, A0c, A16, A1V);
                } else {
                    throw AnonymousClass7TE.A0y();
                }
            } else {
                h3m = null;
            }
            A1C.add(h3m);
            A01.getValue();
            boolean A012 = GEJ.A01(userSession2, r12);
            AnonymousClass41Z BUC = r12.A0C.BUC();
            obj = null;
            if (!(BUC == null || (B7C = BUC.B7C()) == null || (AyB = B7C.AyB()) == null || !A012)) {
                User A2A2 = r12.A2A(userSession2);
                if (A2A2 != null) {
                    String id4 = A2A2.getId();
                    String id5 = r12.getId();
                    User A112 = C51966G9m.A11(r12);
                    if (A112 != null) {
                        obj = new H3G(A112.Bh3(), id4, AyB, id5);
                    } else {
                        throw AnonymousClass7TE.A0z("Required value was null.");
                    }
                } else {
                    throw AnonymousClass7TE.A0z("Required value was null.");
                }
            }
        } else {
            A1C.add(A04(r12));
            A1C.add(A03(userSession2, r12));
            A1C.add(A02(userSession2, r12));
            String BVF = r12.A0C.BVF();
            if (BVF == null) {
                BVF = "";
            }
            if (GJK.A02(userSession2, r12)) {
                h3j = new H3J(r12, BVF, GJK.A00(BVF));
            } else {
                h3j = null;
            }
            A1C.add(h3j);
            ArrayList A1C2 = AnonymousClass7TE.A1C();
            CreativeConfigIntf A0r = C51966G9m.A0r(r12);
            if (!(A0r == null || (B02 = A0r.B02()) == null)) {
                for (EffectPreviewIntf effectPreviewIntf : B02) {
                    String id6 = effectPreviewIntf.getId();
                    String name = effectPreviewIntf.getName();
                    String A03 = DDx.A03(effectPreviewIntf);
                    String formattedClipsMediaCount = effectPreviewIntf.getFormattedClipsMediaCount();
                    if (formattedClipsMediaCount == null) {
                        formattedClipsMediaCount = "";
                    }
                    ImageUrl A002 = DDx.A00(effectPreviewIntf);
                    if (A002 != null) {
                        A1C2.add(new H3R(A002, effectPreviewIntf, r12, id6, name, A03, formattedClipsMediaCount, "SAVED".equals(effectPreviewIntf.getSaveStatus())));
                    } else {
                        throw AnonymousClass7TE.A0y();
                    }
                }
                Iterator it = A1C2.iterator();
                while (it.hasNext()) {
                    A1C.add(it.next());
                }
            }
            CreativeConfigIntf A0r2 = C51966G9m.A0r(r12);
            H3O h3o = null;
            if (A0r2 != null && (A07 = C284745Nt.A07(context2, A0r2)) != null) {
                Iterator it2 = A07.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    GNW gnw = (GNW) it2.next();
                    if (gnw == GNW.CLIPS_LAYOUT) {
                        h3k = new H3K(gnw);
                        break;
                    }
                }
            }
            h3k = null;
            A1C.add(h3k);
            Venue A23 = r12.A23();
            if (A23 != null) {
                String A05 = A23.A05();
                0qQ.A07(A05);
                String name2 = A23.A00.getName();
                if (name2 == null) {
                    name2 = "";
                }
                String A022 = C18792W1y.A02(context2, userSession2, A23, "CLIPS_RECIPE_SHEET");
                0qQ.A07(A022);
                int dimensionPixelSize = context2.getResources().getDimensionPixelSize(R.dimen.action_button_settings_height);
                if (A23.A00() == null || A23.A01() == null) {
                    str2 = "";
                } else {
                    StaticMapView.StaticMapOptions staticMapOptions = new StaticMapView.StaticMapOptions("clips_recipe_sheet_location_row");
                    Double A003 = A23.A00();
                    if (A003 != null) {
                        double doubleValue = A003.doubleValue();
                        Double A013 = A23.A01();
                        if (A013 != null) {
                            staticMapOptions.A01(doubleValue, A013.doubleValue());
                            staticMapOptions.A03(11);
                            str2 = IgStaticMapView.A00(context2.getResources(), staticMapOptions, 2R6.A03, dimensionPixelSize, dimensionPixelSize).toString();
                            0qQ.A0A(str2);
                        } else {
                            throw AnonymousClass7TE.A0z("Required value was null.");
                        }
                    } else {
                        throw AnonymousClass7TE.A0z("Required value was null.");
                    }
                }
                h3i = new H3I(DbS.A0V(str2), r12, A05, name2, A022);
            } else {
                h3i = null;
            }
            A1C.add(h3i);
            H3L h3l = null;
            if (!(!r12.A6d(userSession2) || (A0l3 = C51966G9m.A0l(r12)) == null || (iconicHorizonWorldName = A0l3.getIconicHorizonWorldName()) == null || (A0l4 = C51966G9m.A0l(r12)) == null || (CGk = A0l4.CGk()) == null || (coverPhoto = CGk.getCoverPhoto()) == null)) {
                String id7 = r12.getId();
                if (id7 != null) {
                    h3l = new H3L(DbS.A0V(coverPhoto), r12, id7, iconicHorizonWorldName);
                } else {
                    throw AnonymousClass7TE.A0y();
                }
            }
            A1C.add(h3l);
            if (!r12.A6Z(userSession2) || (A0l2 = C51966G9m.A0l(r12)) == null || (attributionTitle2 = A0l2.getAttributionTitle()) == null) {
                h3n = null;
            } else {
                String id8 = r12.getId();
                if (id8 != null) {
                    h3n = new H3N(context2.getDrawable(R.drawable.horizon_worlds_foa_horizonlogo), r12, id8, attributionTitle2);
                } else {
                    throw AnonymousClass7TE.A0y();
                }
            }
            A1C.add(h3n);
            if (!(!r12.A6c(userSession2) || (A0l = C51966G9m.A0l(r12)) == null || (attributionTitle = A0l.getAttributionTitle()) == null)) {
                String id9 = r12.getId();
                if (id9 != null) {
                    h3o = new H3O(context2.getDrawable(R.drawable.instagram_meta_logo_pano_outline_24), r12, id9, attributionTitle);
                } else {
                    throw AnonymousClass7TE.A0y();
                }
            }
            A1C.add(h3o);
            A1C.add(A01(context2, userSession2, r12));
            if (B56.A01(userSession2, r12)) {
                ArrayList A1C3 = AnonymousClass7TE.A1C();
                for (Object add : H3S.A08.A00(context2, userSession2, r12, false)) {
                    A1C3.add(add);
                }
                Iterator it3 = A1C3.iterator();
                while (it3.hasNext()) {
                    A1C.add(it3.next());
                }
            }
            if (!r12.A6B() || !182.A06(0Tu.A05, userSession2, 36317221253223277L) || (A1P = r12.A1P()) == null) {
                obj = null;
            } else {
                String valueOf = String.valueOf(A1P.getTemplateClipsMediaId());
                String A162 = AnonymousClass7TE.A16(context2, 2131975065);
                C279484yi Ad4 = A1P.Ad4();
                if (Ad4 == null || (str = Ad4.getOwnerUsername()) == null) {
                    str = "";
                }
                C279484yi Ad42 = A1P.Ad4();
                if (Ad42 == null || (BGO = Ad42.BGO()) == null || (extendedImageUrl = 1iI.A03(BGO)) == null) {
                    extendedImageUrl = DbS.A0V("");
                }
                obj = new H3Q(extendedImageUrl, r12, valueOf, A162, str, r12.CbC());
            }
        }
        A1C.add(obj);
        return 00k.A0X(A1C);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.I76] */
    static {
        0eO r1 = 0eO.A02;
        A02 = AnonymousClass0eN.A00(r1, C58669Ive.A00);
        A01 = AnonymousClass0eN.A00(r1, C58668Ivd.A00);
    }

    public static final H3H A01(Context context, UserSession userSession, 1Xj r5) {
        if (!182.A06(0Tu.A05, userSession, 36324475452534894L)) {
            return null;
        }
        String A16 = AnonymousClass7TE.A16(02K.A01(context), 2131971368);
        String id = r5.getId();
        if (id != null) {
            return new H3H(r5, id, A16);
        }
        throw AnonymousClass7TE.A0y();
    }

    public static final float A00(Context context) {
        float A04;
        Resources resources = context.getResources();
        float dimension = resources.getDimension(R.dimen.account_discovery_bottom_gap);
        float dimension2 = resources.getDimension(R.dimen.abc_action_bar_elevation_material);
        float dimension3 = resources.getDimension(R.dimen.action_bar_item_spacing_right);
        float dimension4 = resources.getDimension(R.dimen.ads_disclosure_footer_top_divider_height);
        Drawable drawable = context.getDrawable(R.drawable.instagram_camera_outline_44);
        0qQ.A0C(drawable, C66579MXk.A00(145));
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicHeight > 0) {
            A04 = (float) intrinsicHeight;
        } else {
            A04 = 0nA.A04(context, 44);
        }
        return dimension + dimension2 + dimension3 + dimension4 + A04;
    }

    public static final H3P A04(1Xj r9) {
        C267284bJ BZ6;
        C67161s9 A1N = r9.A1N();
        if (A1N == null || (BZ6 = A1N.BZ6()) == null) {
            return null;
        }
        String pk = BZ6.getPk();
        String username = BZ6.CCd().getUsername();
        String B8Q = BZ6.CCd().B8Q();
        String B7i = BZ6.B7i();
        if (B7i == null) {
            B7i = "";
        }
        return new H3P(BZ6.CCd().Bh3(), pk, username, B8Q, B7i, BZ6.CCd().getId(), AnonymousClass7TF.A1W(r9.BpO(), C243373Ym.SAVED));
    }
}
