package X;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import com.google.common.collect.ImmutableList;
import com.instagram.android.R;
import com.instagram.api.schemas.BrandedContentGatingInfo;
import com.instagram.api.schemas.BrandedContentProjectMetadata;
import com.instagram.api.schemas.BrandedContentProjectMetadataIntf;
import com.instagram.api.schemas.MediaGenAIDetectionMethod;
import com.instagram.common.session.UserSession;
import com.instagram.feed.media.ReelCTA;
import com.instagram.modal.TransparentModalActivity;
import com.instagram.model.shopping.reels.InstagramShopLink;
import com.instagram.model.shopping.reels.ProductCollectionLink;
import com.instagram.model.shopping.reels.ProfileShopLink;
import com.instagram.model.shopping.reels.ReelMultiProductLink;
import com.instagram.model.shopping.reels.ReelProductLink;
import com.instagram.reels.fragment.model.ReelMoreOptionsModel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.8C9  reason: invalid class name */
public final class AnonymousClass8C9 implements AnonymousClass89Y {
    public ImageView A00;
    public 1wn A01;
    public 1wn A02;
    public ReelMoreOptionsModel A03 = AnonymousClass8CB.A00((BrandedContentGatingInfo) null, (BrandedContentProjectMetadataIntf) null, (MediaGenAIDetectionMethod) null, (InstagramShopLink) null, (ProductCollectionLink) null, (ProductCollectionLink) null, (ProfileShopLink) null, (ReelMultiProductLink) null, (ReelProductLink) null, AnonymousClass8CA.NONE, (String) null, (String) null, (String) null, (List) null, false, false, false, false);
    public String A04;
    public String A05;
    public String A06;
    public List A07;
    public boolean A08;
    public boolean A09;
    public final View A0A;
    public final AnonymousClass4DH A0B;
    public final UserSession A0C;
    public final AnonymousClass8C8 A0D;
    public final C3499482o A0E;
    public final AnonymousClass88Z A0F;
    public final AnonymousClass846 A0G;
    public final Integer A0H;

    public AnonymousClass8C9(View view, AnonymousClass4DH r24, UserSession userSession, AnonymousClass8C8 r26, C3499582p r27, AnonymousClass88Z r28, AnonymousClass846 r29, Integer num) {
        this.A0E = r27.A02;
        this.A0F = r28;
        this.A0H = num;
        AnonymousClass4DH r5 = r24;
        this.A0B = r5;
        this.A0G = r29;
        UserSession userSession2 = userSession;
        this.A0C = userSession2;
        this.A0A = view;
        this.A0D = r26;
        this.A04 = r5.getString(182.A06(0Tu.A05, userSession2, 36314386574346771L) ? 2131966739 : 2131954125);
    }

    public final void A00() {
        ImageView imageView = this.A00;
        if (imageView != null) {
            imageView.setImageResource(R.drawable.instagram_user_following_pano_outline_24);
            Context context = this.A0A.getContext();
            imageView.setColorFilter(context.getColor(2Yu.A0H(context, R.attr.igds_color_primary_button_on_media)));
        }
    }

    /* JADX WARNING: type inference failed for: r2v6, types: [android.os.Parcelable, com.instagram.reels.fragment.model.ReelMoreOptionsModel, java.lang.Object] */
    public final void A01() {
        String str;
        int i;
        boolean z;
        List of;
        0lg r1 = this.A0C;
        0lg r21 = r1;
        if (182.A06(0Tu.A05, r1, 36330557126230709L)) {
            if (this.A01 == null) {
                this.A01 = new C64688LgH(this);
            }
            if (this.A02 == null) {
                this.A02 = new AY6(this);
            }
            1Ng A002 = AnonymousClass1Nd.A00(r21);
            A002.A01(this.A01, C64679Lg6.class);
            A002.A01(this.A02, Lg8.class);
            if (this.A03.A00() != null) {
                of = this.A03.A00();
            } else {
                of = ImmutableList.of();
            }
            C49892FBu.A02();
            ReelMoreOptionsModel reelMoreOptionsModel = this.A03;
            boolean z2 = reelMoreOptionsModel.A0E;
            BrandedContentProjectMetadata brandedContentProjectMetadata = reelMoreOptionsModel.A01;
            AnonymousClass4DH r2 = this.A0B;
            AnonymousClass6W8 r3 = new AnonymousClass6W8(r2.requireActivity(), LSU.A00(reelMoreOptionsModel.A00, brandedContentProjectMetadata, "story", (String) null, of, z2, true, reelMoreOptionsModel.A0H), r21, TransparentModalActivity.class, C273654mx.A00(1335));
            r3.A07();
            r3.A0C(r2.requireContext());
        } else {
            Bundle bundle = new Bundle();
            ReelMoreOptionsModel reelMoreOptionsModel2 = this.A03;
            AnonymousClass8CA r12 = reelMoreOptionsModel2.A09;
            String str2 = reelMoreOptionsModel2.A0C;
            String str3 = reelMoreOptionsModel2.A0B;
            String str4 = reelMoreOptionsModel2.A0A;
            ProfileShopLink profileShopLink = reelMoreOptionsModel2.A06;
            InstagramShopLink instagramShopLink = reelMoreOptionsModel2.A03;
            ProductCollectionLink productCollectionLink = reelMoreOptionsModel2.A04;
            ProductCollectionLink productCollectionLink2 = reelMoreOptionsModel2.A05;
            ReelProductLink reelProductLink = reelMoreOptionsModel2.A08;
            ReelMultiProductLink reelMultiProductLink = reelMoreOptionsModel2.A07;
            BrandedContentGatingInfo brandedContentGatingInfo = reelMoreOptionsModel2.A00;
            List list = reelMoreOptionsModel2.A0D;
            BrandedContentProjectMetadata brandedContentProjectMetadata2 = reelMoreOptionsModel2.A01;
            boolean z3 = reelMoreOptionsModel2.A0H;
            boolean z4 = reelMoreOptionsModel2.A0E;
            boolean z5 = reelMoreOptionsModel2.A0G;
            boolean z6 = reelMoreOptionsModel2.A0F;
            MediaGenAIDetectionMethod mediaGenAIDetectionMethod = reelMoreOptionsModel2.A02;
            if (r12 == null) {
                r12 = AnonymousClass8CA.NONE;
            }
            ? obj = new Object();
            obj.A09 = r12;
            obj.A0C = str2;
            obj.A0B = str3;
            obj.A0A = str4;
            obj.A06 = profileShopLink;
            obj.A03 = instagramShopLink;
            obj.A04 = productCollectionLink;
            obj.A05 = productCollectionLink2;
            obj.A08 = reelProductLink;
            obj.A07 = reelMultiProductLink;
            obj.A00 = brandedContentGatingInfo;
            obj.A0D = list;
            BrandedContentProjectMetadata brandedContentProjectMetadata3 = null;
            if (brandedContentProjectMetadata2 != null) {
                brandedContentProjectMetadata3 = brandedContentProjectMetadata2;
            }
            obj.A01 = brandedContentProjectMetadata3;
            obj.A0H = z3;
            obj.A0E = z4;
            obj.A0G = z5;
            obj.A0F = z6;
            obj.A02 = mediaGenAIDetectionMethod;
            C3499482o r6 = this.A0E;
            Integer A032 = r6.A03();
            bundle.putString(AnonymousClass000.A00(2362), this.A04);
            bundle.putParcelable(AnonymousClass000.A00(456), obj);
            bundle.putInt(AnonymousClass000.A00(2121), 2AL.A01(A032));
            bundle.putString(AnonymousClass000.A00(2117), r6.A04());
            bundle.putString(AnonymousClass000.A00(4305), r6.A01().A01);
            boolean z7 = false;
            bundle.putBoolean(AnonymousClass000.A00(2538), false);
            bundle.putBoolean("OWNS_IGTV_VIDEOS", false);
            bundle.putBoolean(AnonymousClass000.A00(2315), false);
            AnonymousClass88Z r4 = this.A0F;
            C3512388c r32 = C3512188a.A0l;
            bundle.putBoolean("HAS_PRODUCT_STICKERS", !r4.Cb8(r32));
            AnonymousClass82Y r7 = r6.A01;
            String str5 = null;
            if (r7.A03() != null) {
                str = r7.A03().A06();
            } else {
                str = null;
            }
            bundle.putString(AnonymousClass000.A00(2071), str);
            if (r7.A03() != null) {
                i = r7.A03().A07;
            } else {
                i = 0;
            }
            bundle.putInt(AnonymousClass000.A00(2080), i);
            if (r7.A03() != null) {
                z = r7.A03().A13;
            } else {
                z = false;
            }
            bundle.putBoolean(AnonymousClass000.A00(2072), z);
            if (r7.A04() != null) {
                str5 = r7.A04().A0k;
            }
            bundle.putString(AnonymousClass000.A00(2073), str5);
            bundle.putBoolean(AnonymousClass000.A00(2110), false);
            if (this.A08 && !C347037wA.A04(r21)) {
                z7 = true;
            }
            bundle.putBoolean("GO_TO_BRANDED_CONTENT_OPT_IN", z7);
            bundle.putBoolean("GO_TO_BRANDED_CONTENT_TAG_BUSINESS_PARTNER", this.A09);
            bundle.putBoolean(AnonymousClass000.A00(408), !((AnonymousClass8ME) this.A0D.A00.A1g.get()).A17().isEmpty());
            if (!r4.Cb8(r32)) {
                bundle.putString(C273654mx.A00(509), this.A05);
                bundle.putString(C273654mx.A00(510), this.A06);
            }
            AnonymousClass4DH r33 = this.A0B;
            new AnonymousClass6W8(r33.requireActivity(), bundle, r21, TransparentModalActivity.class, C273654mx.A00(3229)).A0D(r33, 4217);
        }
        27r A012 = 27p.A01(r21);
        Boolean valueOf = Boolean.valueOf(this.A03.A0G);
        29R r42 = A012.A09;
        1Ln A082 = 1Ln.A08(r42.A01);
        C279294yP A0J = r42.A0J();
        if (A082.A00.isSampled() && A0J != null) {
            A082.A0t("IG_CAMERA_ENTITY_TAP");
            A082.A0r("ADS_MODE_PARTNER_ADS_SETTINGS_BUTTON_TAP");
            29R.A00(A082, r42);
            A082.A0a(A0J);
            AnonymousClass283 r43 = r42.A04;
            A082.A0b(r43.A09);
            A082.A0W(2);
            A082.A0d(C59725JVj.POST_CAPTURE);
            A082.A0n(27x.A08.getModuleName());
            A082.A0R("sticker_tray_session_id", r43.A0U);
            A082.A0c(r43.A0A);
            A082.A0R("composition_str_id", r43.A0M);
            A082.A0M(r43.A0A, "composition_media_type");
            A082.A0u(AnonymousClass1QI.A00.A02.A00);
            A082.A0O("ads_mode_boost_story_enabled", valueOf);
            A082.Cgf();
        }
    }

    public final void A02(ReelMoreOptionsModel reelMoreOptionsModel) {
        A9G a9g;
        List list;
        ReelCTA A002;
        if (this.A00 != null) {
            this.A03 = reelMoreOptionsModel;
            if (!TextUtils.isEmpty(reelMoreOptionsModel.A0C)) {
                A002 = AGe.A00();
                String str = this.A03.A0C;
                if (str == null) {
                    str = "";
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(C271714jT.A00(str));
                A9G a9g2 = new A9G(A002);
                a9g2.A0D = arrayList;
                a9g2.A00();
            } else {
                ReelMoreOptionsModel reelMoreOptionsModel2 = this.A03;
                String str2 = reelMoreOptionsModel2.A0B;
                if (str2 != null) {
                    a9g = new A9G(AGe.A00());
                    a9g.A0B = str2;
                } else {
                    ProfileShopLink profileShopLink = reelMoreOptionsModel2.A06;
                    if (profileShopLink != null) {
                        a9g = new A9G(AGe.A00());
                        a9g.A03 = profileShopLink;
                    } else if (reelMoreOptionsModel2.A03 != null) {
                        A002 = AGe.A00();
                    } else {
                        ProductCollectionLink productCollectionLink = reelMoreOptionsModel2.A04;
                        if (productCollectionLink == null && (productCollectionLink = reelMoreOptionsModel2.A05) == null) {
                            ReelProductLink reelProductLink = reelMoreOptionsModel2.A08;
                            if (reelProductLink != null) {
                                a9g = new A9G(AGe.A00());
                                a9g.A05 = reelProductLink;
                            } else {
                                ReelMultiProductLink reelMultiProductLink = reelMoreOptionsModel2.A07;
                                if (reelMultiProductLink != null) {
                                    a9g = new A9G(AGe.A00());
                                    a9g.A04 = reelMultiProductLink;
                                } else {
                                    AnonymousClass8CA r1 = reelMoreOptionsModel2.A09;
                                    if (r1 == null) {
                                        r1 = AnonymousClass8CA.NONE;
                                    }
                                    if (r1 == AnonymousClass8CA.BUSINESS_TRANSACTION) {
                                        A002 = AGe.A00();
                                        String B4Q = AnonymousClass0t1.A01.A01(this.A0C).A03.B4Q();
                                        ArrayList arrayList2 = new ArrayList();
                                        if (B4Q != null) {
                                            arrayList2.add(C271714jT.A00(B4Q));
                                            A9G a9g3 = new A9G(A002);
                                            a9g3.A0D = arrayList2;
                                            A002 = a9g3.A00();
                                        }
                                    } else {
                                        String str3 = reelMoreOptionsModel2.A0A;
                                        if (str3 != null) {
                                            a9g = new A9G(AGe.A00());
                                            a9g.A09 = "ar_effect";
                                            a9g.A0C = str3;
                                        } else {
                                            list = null;
                                            this.A07 = list;
                                            A00();
                                            AnonymousClass88Z r12 = this.A0F;
                                            r12.Dc7(this.A07);
                                            r12.DLj(this.A03.A0H);
                                            r12.D6o(this.A03.A0E);
                                            r12.Cz2(this.A03.A00());
                                            r12.DQD(this.A03.A00);
                                            r12.DaB(this.A03.A06);
                                            r12.DZs(this.A03.A08);
                                        }
                                    }
                                }
                            }
                        } else {
                            a9g = new A9G(AGe.A00());
                            a9g.A02 = productCollectionLink;
                        }
                    }
                }
                A002 = a9g.A00();
            }
            list = Collections.singletonList(A002);
            this.A07 = list;
            A00();
            AnonymousClass88Z r122 = this.A0F;
            r122.Dc7(this.A07);
            r122.DLj(this.A03.A0H);
            r122.D6o(this.A03.A0E);
            r122.Cz2(this.A03.A00());
            r122.DQD(this.A03.A00);
            r122.DaB(this.A03.A06);
            r122.DZs(this.A03.A08);
        }
    }

    public final /* synthetic */ boolean onBackPressed() {
        return false;
    }
}
