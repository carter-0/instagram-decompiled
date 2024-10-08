package X;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.pando.TreeJNI;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.api.schemas.IGTVAccountLevelMonetizationToggleSetting;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import com.instagram.feed.media.ImmutablePandoMediaDict;
import com.instagram.model.payments.CurrencyAmountInfoImpl;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import com.instagram.realtimeclient.RealtimeConstants;
import com.instagram.user.model.ImmutablePandoUserDict;
import com.instagram.user.model.ProductDetailsProductItemDictIntf;
import com.instagram.user.model.User;
import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.B3p  reason: case insensitive filesystem */
public abstract class C41848B3p {
    public static int A00(Parcel parcel) {
        0qQ.A0B(parcel, 0);
        return parcel.readInt();
    }

    public static String A1D(Parcel parcel) {
        0qQ.A0B(parcel, 0);
        return parcel.readString();
    }

    public static Iterator A1G(Parcel parcel, List list) {
        parcel.writeInt(1);
        parcel.writeInt(list.size());
        return list.iterator();
    }

    public static void A1I(Parcel parcel, Boolean bool) {
        if (bool == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(bool.booleanValue() ? 1 : 0);
    }

    public static void A1K(Parcel parcel, Number number) {
        if (number == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeLong(number.longValue());
    }

    public static C295925p8 A02() {
        return new C295925p8(C43173Btx.class, "AiStudioAiPersona", -1227888073);
    }

    public static C295925p8 A03() {
        return new C295925p8(C43347Bwl.class, "PersonaAdditionalInfo", 1777778047);
    }

    public static AnonymousClass612 A04(Class cls, int i) {
        return new AnonymousClass612(new C295925p8(cls, "InlineXFBGenAIImagineResultSuccess", i), "XFBGenAIImagineResultSuccess");
    }

    public static AnonymousClass4L7 A09() {
        return new AnonymousClass4L7(new AnonymousClass4L3(AnonymousClass4LF.A00), "can_viewer_link_back_to_original_media_from_vcr");
    }

    public static AnonymousClass4L7 A0A() {
        return new AnonymousClass4L7(AnonymousClass4L8.A00, "non_privacy_filtered_mashups_media_count");
    }

    public static AnonymousClass4L7 A0B() {
        return new AnonymousClass4L7(C342787pA.A00, "average_rating");
    }

    public static AnonymousClass4L7 A0C() {
        return new AnonymousClass4L7(new AnonymousClass4L3(AnonymousClass4LF.A00), RealtimeConstants.SEND_SUCCESS);
    }

    public static AnonymousClass4L7 A0D() {
        return new AnonymousClass4L7(AnonymousClass4LF.A00, "has_next_page");
    }

    public static AnonymousClass4L7 A0E() {
        return new AnonymousClass4L7(AnonymousClass4Kz.A00, "text");
    }

    public static AnonymousClass4L7 A0F() {
        return new AnonymousClass4L7(AnonymousClass4Kz.A00, "block_type");
    }

    public static AnonymousClass4L7 A0G() {
        return new AnonymousClass4L7(new AnonymousClass4L5(new AnonymousClass4L3(AnonymousClass4L8.A00)), "highlight_start_times_in_ms");
    }

    public static AnonymousClass4L7 A0H(AnonymousClass4L0 r3) {
        return new AnonymousClass4L7(new AnonymousClass4L3(r3), "owner_username");
    }

    public static AnonymousClass4L7 A0I(AnonymousClass4L0 r3) {
        return new AnonymousClass4L7(new AnonymousClass4L3(r3), "should_show_content_preview");
    }

    public static AnonymousClass4L7 A0J(AnonymousClass4L0 r3) {
        return new AnonymousClass4L7(new AnonymousClass4L3(r3), "original_media_id");
    }

    public static AnonymousClass4L7 A0K(AnonymousClass4L0 r3) {
        return new AnonymousClass4L7(new AnonymousClass4L3(r3), "is_explicit");
    }

    public static AnonymousClass4L7 A0L(AnonymousClass4L0 r3) {
        return new AnonymousClass4L7(new AnonymousClass4L3(r3), "save_status");
    }

    public static AnonymousClass4L7 A0M(AnonymousClass4L0 r3) {
        return new AnonymousClass4L7(new AnonymousClass4L3(r3), "is_audio_automatically_attributed");
    }

    public static AnonymousClass4L7 A0N(AnonymousClass4L0 r3) {
        return new AnonymousClass4L7(new AnonymousClass4L3(r3), "placeholder_profile_pic_url");
    }

    public static AnonymousClass4L7 A0O(AnonymousClass4L0 r3) {
        return new AnonymousClass4L7(new AnonymousClass4L3(r3), "dark");
    }

    public static AnonymousClass4L7 A0P(AnonymousClass4L0 r3) {
        return new AnonymousClass4L7(new AnonymousClass4L3(r3), IgReactMediaPickerNativeModule.HEIGHT);
    }

    public static AnonymousClass4L7 A0Q(AnonymousClass4L0 r3) {
        return new AnonymousClass4L7(new AnonymousClass4L3(r3), IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS);
    }

    public static AnonymousClass4L7 A0R(AnonymousClass4L0 r3) {
        return new AnonymousClass4L7(new AnonymousClass4L3(r3), "progressive_download_url");
    }

    public static AnonymousClass4L7 A0S(AnonymousClass4L0 r3) {
        return new AnonymousClass4L7(new AnonymousClass4L3(r3), "offset_x");
    }

    public static AnonymousClass4L7 A0T(AnonymousClass4L0 r3) {
        return new AnonymousClass4L7(new AnonymousClass4L3(r3), "cta_title");
    }

    public static AnonymousClass4L7 A0U(AnonymousClass4L0 r3) {
        return new AnonymousClass4L7(new AnonymousClass4L3(r3), "original_audio_title");
    }

    public static AnonymousClass4L7 A0V(AnonymousClass4L0 r3) {
        return new AnonymousClass4L7(new AnonymousClass4L3(r3), DialogModule.KEY_TITLE);
    }

    public static AnonymousClass4L7 A0W(AnonymousClass4L0 r3) {
        return new AnonymousClass4L7(new AnonymousClass4L3(r3), "is_pivot_page_available");
    }

    public static AnonymousClass4L7 A0X(AnonymousClass4L0 r3) {
        return new AnonymousClass4L7(new AnonymousClass4L3(r3), "allows_saving");
    }

    public static AnonymousClass4L7 A0Y(AnonymousClass4L0 r3) {
        return new AnonymousClass4L7(new AnonymousClass4L3(r3), "thumbnail_uri");
    }

    public static AnonymousClass4L7 A0Z(AnonymousClass4L0 r3) {
        return new AnonymousClass4L7(new AnonymousClass4L3(r3), "cover_artwork_uri");
    }

    public static AnonymousClass4L7 A0a(AnonymousClass4L0 r3) {
        return new AnonymousClass4L7(new AnonymousClass4L3(r3), "audio_asset_id");
    }

    public static AnonymousClass4L7 A0b(AnonymousClass4L0 r3) {
        return new AnonymousClass4L7(new AnonymousClass4L3(r3), "audio_start_time_in_ms");
    }

    public static AnonymousClass4L7 A0c(AnonymousClass4L0 r3) {
        return new AnonymousClass4L7(new AnonymousClass4L3(r3), "display_artist");
    }

    public static AnonymousClass4L7 A0d(AnonymousClass4L0 r3) {
        return new AnonymousClass4L7(new AnonymousClass4L3(r3), "music_canonical_id");
    }

    public static AnonymousClass4L7 A0e(AnonymousClass4L0 r3) {
        return new AnonymousClass4L7(new AnonymousClass4L3(r3), "should_mute_audio_reason");
    }

    public static AnonymousClass4L7 A0f(AnonymousClass4L0 r3) {
        return new AnonymousClass4L7(new AnonymousClass4L3(r3), "should_mute_audio");
    }

    public static AnonymousClass4L7 A0g(AnonymousClass4L0 r3) {
        return new AnonymousClass4L7(new AnonymousClass4L3(r3), "duration_in_ms");
    }

    public static AnonymousClass4L7 A0h(AnonymousClass4L0 r3) {
        return new AnonymousClass4L7(new AnonymousClass4L3(r3), "audio_type");
    }

    public static AnonymousClass4L7 A0i(AnonymousClass4L0 r3) {
        return new AnonymousClass4L7(new AnonymousClass4L3(r3), "original_audio_subtype");
    }

    public static AnonymousClass4L7 A0j(AnonymousClass4L0 r3) {
        return new AnonymousClass4L7(new AnonymousClass4L3(r3), "dash_manifest");
    }

    public static AnonymousClass4L7 A0k(AnonymousClass4L0 r3) {
        return new AnonymousClass4L7(new AnonymousClass4L3(r3), "display_title");
    }

    public static AnonymousClass4L7 A0l(AnonymousClass4L0 r3) {
        return new AnonymousClass4L7(new AnonymousClass4L3(r3), "hide_remixing");
    }

    public static AnonymousClass4L7 A0m(AnonymousClass4L0 r3) {
        return new AnonymousClass4L7(new AnonymousClass4L3(r3), "is_bookmarked");
    }

    public static AnonymousClass4L7 A0n(AnonymousClass4L0 r3) {
        return new AnonymousClass4L7(new AnonymousClass4L3(r3), "allow_creator_to_rename");
    }

    public static AnonymousClass4Kx A0o() {
        AnonymousClass4L8 r5 = AnonymousClass4L8.A00;
        AnonymousClass4L7 r4 = new AnonymousClass4L7(r5, IgReactMediaPickerNativeModule.HEIGHT);
        AnonymousClass4Kz r1 = AnonymousClass4Kz.A00;
        return new AnonymousClass4Kx(new AnonymousClass4Kr[]{r4, new AnonymousClass4L7(r1, "scans_profile"), new AnonymousClass4L7(r1, "url"), new AnonymousClass4L7(r5, IgReactMediaPickerNativeModule.WIDTH)});
    }

    public static AnonymousClass4Kx A0p() {
        AnonymousClass4Kz r6 = AnonymousClass4Kz.A00;
        AnonymousClass4L7 r5 = new AnonymousClass4L7(r6, "start_cursor");
        AnonymousClass4L7 r4 = new AnonymousClass4L7(r6, "end_cursor");
        AnonymousClass4LF r1 = AnonymousClass4LF.A00;
        return new AnonymousClass4Kx(new AnonymousClass4Kr[]{r5, r4, new AnonymousClass4L7(r1, "has_next_page"), new AnonymousClass4L7(r1, "has_previous_page"), new AnonymousClass4L7(r6, "delta_cursor")});
    }

    public static AnonymousClass4Kx A0q() {
        AnonymousClass4Kz r1 = AnonymousClass4Kz.A00;
        return new AnonymousClass4Kx(new AnonymousClass4Kr[]{new AnonymousClass4L7(r1, PublicKeyCredentialControllerUtility.JSON_KEY_ID), new AnonymousClass4L7(r1, Dbj.A03()), new AnonymousClass4L7(r1, "full_name"), new AnonymousClass4L7(r1, "profile_pic_url"), new AnonymousClass4L7(AnonymousClass4LF.A00, "is_verified")});
    }

    public static AnonymousClass4Kx A0r() {
        return new AnonymousClass4Kx(new AnonymousClass4Kr[]{new AnonymousClass4L7(AnonymousClass4Kz.A00, PublicKeyCredentialControllerUtility.JSON_KEY_ID), new AnonymousClass4L7(C342787pA.A00, "score")});
    }

    public static AnonymousClass4Kx A0s() {
        AnonymousClass4L8 r4 = AnonymousClass4L8.A00;
        return new AnonymousClass4Kx(new AnonymousClass4Kr[]{new AnonymousClass4L7(r4, IgReactMediaPickerNativeModule.HEIGHT), new AnonymousClass4L7(AnonymousClass4Kz.A00, "url"), new AnonymousClass4L7(r4, IgReactMediaPickerNativeModule.WIDTH)});
    }

    public static AnonymousClass4Kx A0t() {
        AnonymousClass4L8 r4 = AnonymousClass4L8.A00;
        return new AnonymousClass4Kx(new AnonymousClass4Kr[]{new AnonymousClass4L7(r4, "inline_style"), new AnonymousClass4L7(r4, "length"), new AnonymousClass4L7(r4, "offset")});
    }

    public static AnonymousClass4Kx A0u() {
        AnonymousClass4L8 r1 = AnonymousClass4L8.A00;
        AnonymousClass4L7 r5 = new AnonymousClass4L7(r1, IgReactMediaPickerNativeModule.WIDTH);
        AnonymousClass4L7 r4 = new AnonymousClass4L7(r1, IgReactMediaPickerNativeModule.HEIGHT);
        AnonymousClass4Kz r3 = AnonymousClass4Kz.A00;
        return new AnonymousClass4Kx(new AnonymousClass4Kr[]{r5, r4, new AnonymousClass4L7(r3, "url"), new AnonymousClass4L7(r3, "scans_profile")});
    }

    public static AnonymousClass4Kx A0v() {
        AnonymousClass4Kz r1 = AnonymousClass4Kz.A00;
        return new AnonymousClass4Kx(new AnonymousClass4Kr[]{new AnonymousClass4L7(r1, "amount"), new AnonymousClass4L7(r1, "amount_with_offset"), new AnonymousClass4L7(r1, "currency"), new AnonymousClass4L7(AnonymousClass4L8.A00, "offset")});
    }

    public static AnonymousClass4Kx A0w() {
        AnonymousClass4LF r1 = AnonymousClass4LF.A00;
        return new AnonymousClass4Kx(new AnonymousClass4Kr[]{new AnonymousClass4L7(r1, "following"), new AnonymousClass4L7(r1, "is_bestie"), new AnonymousClass4L7(r1, "is_feed_favorite"), new AnonymousClass4L7(r1, "is_restricted"), new AnonymousClass4L7(r1, "is_viewer_unconnected"), new AnonymousClass4L7(r1, "outgoing_request")});
    }

    public static AnonymousClass4Kx A0x() {
        AnonymousClass4LF r1 = AnonymousClass4LF.A00;
        AnonymousClass4L7 r2 = new AnonymousClass4L7(r1, "disabled_sharing_products_to_guides");
        AnonymousClass4L7 r3 = new AnonymousClass4L7(r1, "is_verified");
        AnonymousClass4Kz r12 = AnonymousClass4Kz.A00;
        return new AnonymousClass4Kx(new AnonymousClass4Kr[]{r2, r3, new AnonymousClass4L7(r12, "pk"), new AnonymousClass4L7(r12, "profile_pic_url"), new AnonymousClass4L7(r12, "storefront_attribution_username"), new AnonymousClass4L7(r12, C46476Dff.A01())});
    }

    public static AnonymousClass4Kx A0y() {
        AnonymousClass4LF r2 = AnonymousClass4LF.A00;
        return new AnonymousClass4Kx(new AnonymousClass4Kr[]{new AnonymousClass4L7(new AnonymousClass4L3(r2), "is_bookmarked"), new AnonymousClass4L7(new AnonymousClass4L3(r2), "is_trending_in_clips"), new AnonymousClass4L7(new AnonymousClass4L3(AnonymousClass4Kz.A00), "should_mute_audio_reason")});
    }

    public static AnonymousClass4Kx A0z() {
        AnonymousClass4L8 r5 = AnonymousClass4L8.A00;
        return new AnonymousClass4Kx(new AnonymousClass4Kr[]{new AnonymousClass4L7(new AnonymousClass4L3(r5), IgReactMediaPickerNativeModule.HEIGHT), new AnonymousClass4L7(new AnonymousClass4L3(AnonymousClass4Kz.A00), "url"), new AnonymousClass4L7(new AnonymousClass4L3(r5), IgReactMediaPickerNativeModule.WIDTH)});
    }

    public static AnonymousClass4Kx A10() {
        AnonymousClass4Kz r6 = AnonymousClass4Kz.A00;
        return new AnonymousClass4Kx(new AnonymousClass4Kr[]{new AnonymousClass4L7(r6, "uri"), new AnonymousClass4L7(r6, "response_id"), new AnonymousClass4L7(r6, "image_id"), new AnonymousClass4L7(r6, TraceFieldType.RequestID), new AnonymousClass4L7(r6, "media_type")});
    }

    public static AnonymousClass4Kx A11() {
        AnonymousClass4L8 r1 = AnonymousClass4L8.A00;
        return new AnonymousClass4Kx(new AnonymousClass4Kr[]{new AnonymousClass4L7(r1, "icon_glyph"), new AnonymousClass4L7(r1, "icon_type"), new AnonymousClass4L7(AnonymousClass4Kz.A00, PublicKeyCredentialControllerUtility.JSON_KEY_NAME)});
    }

    public static AnonymousClass4Kx A12() {
        AnonymousClass4Kz r6 = AnonymousClass4Kz.A00;
        return new AnonymousClass4Kx(new AnonymousClass4Kr[]{new AnonymousClass4L7(r6, "cta_text"), new AnonymousClass4L7(r6, DevServerEntity.COLUMN_DESCRIPTION), new AnonymousClass4L7(new AnonymousClass4L3(r6), PublicKeyCredentialControllerUtility.JSON_KEY_ID), new AnonymousClass4L7(r6, PublicKeyCredentialControllerUtility.JSON_KEY_NAME), new AnonymousClass4L7(r6, "see_details_text")});
    }

    public static AnonymousClass4Kx A13(AnonymousClass4Kw r4, Class cls, int i) {
        return new AnonymousClass4Kx(new AnonymousClass4Kr[]{new AnonymousClass4Kp(r4, cls, "image_versions2", i), new AnonymousClass4L7(AnonymousClass4Kz.A00, "preview")});
    }

    public static AnonymousClass4Kx A14(AnonymousClass4L1 r7, AnonymousClass4L1 r8, AnonymousClass4Kr r9, AnonymousClass4Kr r10, AnonymousClass4Kr r11) {
        return new AnonymousClass4Kx(new AnonymousClass4Kr[]{r9, r10, r11, new AnonymousClass4L7(r7, "webp"), new AnonymousClass4L7(r7, "mp4"), new AnonymousClass4L7(r8, "size_bytes"), new AnonymousClass4L7(r8, "webp_size_bytes"), new AnonymousClass4L7(r8, "mp4_size_bytes")});
    }

    public static AnonymousClass4Kx A15(AnonymousClass4L1 r6, AnonymousClass4Kr r7) {
        AnonymousClass4L7 r5 = new AnonymousClass4L7(r6, "is_verified");
        AnonymousClass4Kz r4 = AnonymousClass4Kz.A00;
        return new AnonymousClass4Kx(new AnonymousClass4Kr[]{r7, r5, new AnonymousClass4L7(r4, "pk"), new AnonymousClass4L7(r4, "profile_pic_url"), new AnonymousClass4L7(r4, C46476Dff.A01())});
    }

    public static C250663lr A16(Object obj) {
        return (C250663lr) ((AnonymousClass3JD) ((C239793Ih) obj).A00).Bny();
    }

    public static IGTVAccountLevelMonetizationToggleSetting A17(Object obj) {
        IGTVAccountLevelMonetizationToggleSetting iGTVAccountLevelMonetizationToggleSetting = (IGTVAccountLevelMonetizationToggleSetting) IGTVAccountLevelMonetizationToggleSetting.A01.get(obj);
        if (iGTVAccountLevelMonetizationToggleSetting == null) {
            return IGTVAccountLevelMonetizationToggleSetting.UNRECOGNIZED;
        }
        return iGTVAccountLevelMonetizationToggleSetting;
    }

    public static 1Xj A18(1E9 r2, 17P r3, int i) {
        1Xv r0 = 1Xj.A0h;
        return 1Xv.A00(r2, (ImmutablePandoMediaDict) r3.A04(i, ImmutablePandoMediaDict.class));
    }

    public static CurrencyAmountInfoImpl A19(C250663lr r3, String str, String str2) {
        return new CurrencyAmountInfoImpl(Integer.valueOf(r3.getCoercedIntField(3, "offset")), str, str2, r3.A09("currency"));
    }

    public static ProductDetailsProductItemDictIntf A1A(1E9 r0, ProductDetailsProductItemDictIntf productDetailsProductItemDictIntf) {
        if (productDetailsProductItemDictIntf == null) {
            return null;
        }
        productDetailsProductItemDictIntf.EAY(r0);
        return productDetailsProductItemDictIntf;
    }

    public static User A1B(1E9 r2, 17P r3, int i) {
        ImmutablePandoUserDict immutablePandoUserDict = (ImmutablePandoUserDict) r3.A05(i, ImmutablePandoUserDict.class);
        if (immutablePandoUserDict == null) {
            return null;
        }
        Parcelable.Creator creator = User.CREATOR;
        return 1aC.A01(r2, immutablePandoUserDict);
    }

    public static String A1E(Object obj) {
        17P r1 = (17P) obj;
        0qQ.A0B(r1, 0);
        return r1.A0j(356255459);
    }

    public static List A1H(17P r2, List list) {
        if (list == null) {
            return r2.A0o(1367927716, B5k.class);
        }
        return list;
    }

    public static void A1L(AnonymousClass0Jz r2, 2IS r3) {
        r3.A00.A02().A0E(r2, "data");
    }

    public static boolean A1Y(Parcel parcel, Boolean bool) {
        if (bool == null) {
            return false;
        }
        parcel.writeInt(1);
        return bool.booleanValue();
    }

    public static boolean A1a(Object obj, 0sL r2, int i) {
        r2.invoke(obj, Integer.valueOf(i & 14));
        return 0fL.A02();
    }

    public static int A01(C286575Wy r0, Object obj) {
        if (r0.AGw(obj)) {
            return 4;
        }
        return 2;
    }

    public static AnonymousClass4Kp A05(Class cls, int i) {
        return new AnonymousClass4Kp(AnonymousClass4Ks.A01(), cls, "consumption_info", i);
    }

    public static AnonymousClass4Kp A06(Class cls, int i) {
        return new AnonymousClass4Kp(AnonymousClass4Ks.A01(), cls, "ig_artist", i);
    }

    public static AnonymousClass4Kp A07(Class cls, int i) {
        return new AnonymousClass4Kp(AnonymousClass4Ks.A00(), cls, "goodness", i);
    }

    public static AnonymousClass4Kp A08(Class cls, int i) {
        return new AnonymousClass4Kp(AnonymousClass4Ks.A02(), cls, "audio_parts", i);
    }

    public static Boolean A1C(TreeJNI treeJNI, int i) {
        treeJNI.getBooleanValueByHashCode(i);
        return Boolean.valueOf(treeJNI.getBooleanValueByHashCode(i));
    }

    public static Iterator A1F(Parcel parcel, List list) {
        parcel.writeInt(list.size());
        return list.iterator();
    }

    public static void A1J(Parcel parcel, Class cls, AbstractCollection abstractCollection) {
        abstractCollection.add(parcel.readParcelable(cls.getClassLoader()));
    }

    public static void A1M(0Df r2, Object obj, String str) {
        0Df.A00(r2, obj, str);
        0Df.A00(r2, AnonymousClass0HM.A00().toString(), "client_mutation_id");
    }

    public static void A1N(QNI qni) {
        qni.A07(AnonymousClass0HM.A00().toString(), "client_mutation_id");
    }

    public static void A1O(17Z r2, Iterator it) {
        1Xj r1 = (1Xj) it.next();
        if (r1 != null) {
            1Xv r0 = 1Xj.A0h;
            1Xv.A07(r2, r1);
        }
    }

    public static void A1P(16F r0, AbstractCollection abstractCollection) {
        C254873tC parseFromJson = C254863tB.parseFromJson(r0);
        if (parseFromJson != null) {
            abstractCollection.add(parseFromJson);
        }
    }

    public static void A1Q(1E9 r1, AbstractCollection abstractCollection, Iterator it) {
        abstractCollection.add(((C276024sM) it.next()).F1W(r1));
    }

    public static void A1R(1E9 r1, AbstractCollection abstractCollection, Iterator it) {
        ProductDetailsProductItemDictIntf productDetailsProductItemDictIntf = (ProductDetailsProductItemDictIntf) it.next();
        productDetailsProductItemDictIntf.EAY(r1);
        abstractCollection.add(productDetailsProductItemDictIntf);
    }

    public static void A1S(1E9 r1, AbstractCollection abstractCollection, Iterator it) {
        abstractCollection.add(((ProductDetailsProductItemDictIntf) it.next()).FGq(r1));
    }

    public static void A1T(1E9 r2, AbstractCollection abstractCollection, Iterator it) {
        1Xv r0 = 1Xj.A0h;
        abstractCollection.add(1Xv.A00(r2, (ImmutablePandoMediaDict) it.next()));
    }

    public static void A1U(1E9 r1, AbstractCollection abstractCollection, Iterator it) {
        C276024sM r0 = (C276024sM) it.next();
        r0.E7A(r1);
        abstractCollection.add(r0);
    }

    public static void A1V(1E9 r1, AbstractCollection abstractCollection, Iterator it) {
        abstractCollection.add(r1.A00((1Xj) it.next()));
    }

    public static void A1W(AbstractCollection abstractCollection, Iterator it) {
        ProductDetailsProductItemDictIntf productDetailsProductItemDictIntf = (ProductDetailsProductItemDictIntf) it.next();
        if (productDetailsProductItemDictIntf != null) {
            abstractCollection.add(productDetailsProductItemDictIntf.FHC());
        }
    }

    public static boolean A1X(Parcel parcel) {
        if (parcel.readInt() != 0) {
            return true;
        }
        return false;
    }

    public static boolean A1Z(2IS r0, String str, String str2) {
        r0.A04(str, str2);
        if (str2 != null) {
            return true;
        }
        return false;
    }

    public static AnonymousClass4Kr[] A1b(AnonymousClass4L1 r6, AnonymousClass4L1 r7, Class cls, int i) {
        AnonymousClass4Kp r5 = new AnonymousClass4Kp(AnonymousClass4Ks.A00(), cls, "sponsor_tags", i);
        AnonymousClass4L7 r4 = new AnonymousClass4L7(r6, "sup_active");
        C342787pA r1 = C342787pA.A00;
        return new AnonymousClass4Kr[]{r5, r4, new AnonymousClass4L7(r1, "video_duration"), new AnonymousClass4L7(r1, "viewer_count"), new AnonymousClass4L7(r7, "visibility")};
    }
}
