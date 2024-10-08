package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.TreeJNI;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import com.instagram.fbpay.graphql.FBPayIGGraphQLQueryExecutor;
import com.instagram.feed.media.ImmutablePandoMediaDict;
import com.instagram.model.androidlink.AndroidLink;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.model.mediasize.ImageInfo;
import com.instagram.model.mediasize.VideoVersionIntf;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import com.instagram.user.model.ImmutablePandoProductCollection;
import com.instagram.user.model.ImmutablePandoProductDetailsProductItemDict;
import com.instagram.user.model.ImmutablePandoUserDict;
import com.instagram.user.model.ProductCollection;
import com.instagram.user.model.ProductDetailsProductItemDictIntf;
import com.instagram.user.model.User;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.B3o  reason: case insensitive filesystem */
public abstract class C41847B3o {
    public static int A01(C250663lr r2) {
        return r2.getCoercedIntField(0, IgReactMediaPickerNativeModule.HEIGHT);
    }

    public static int A02(C250663lr r2) {
        return r2.getCoercedIntField(3, "offset");
    }

    public static 1E9 A0p() {
        return new 1E9(new 1hu((UserSession) null), 6, false);
    }

    public static 1E9 A0q(1E6 r3) {
        0qQ.A0B(r3, 0);
        return new 1E9(r3, 6, false);
    }

    public static CMa A0s(TreeJNI treeJNI, UserSession userSession) {
        0qQ.A0B(userSession, 1);
        1E5 A00 = 1E4.A00(userSession);
        CMa cMa = (CMa) treeJNI.reinterpret(CMa.class);
        cMa.A0q(new 1E9(A00, new HashSet(), false));
        return cMa;
    }

    public static void A1M(16F r4, AbstractMap abstractMap) {
        String str = null;
        String A1P = r4.A1P();
        r4.A1J();
        if (r4.A11() == 16L.A0G || (str = r4.A1P()) != null) {
            abstractMap.put(A1P, str);
        }
    }

    public static void A1N(16F r4, AbstractMap abstractMap) {
        Integer num = null;
        String A1P = r4.A1P();
        r4.A1J();
        if (r4.A11() == 16L.A0G || (num = Integer.valueOf(r4.A1D())) != null) {
            abstractMap.put(A1P, num);
        }
    }

    public static int A00(Parcel parcel, Number number) {
        if (number == null) {
            return 0;
        }
        parcel.writeInt(1);
        return number.intValue();
    }

    public static 1vR A04(AnonymousClass0Jz r1, 2IS r2, String str) {
        r2.A00.A02().A0E(r1, str);
        AnonymousClass2IY r0 = PandoGraphQLRequest.Companion;
        return AnonymousClass1vS.A00();
    }

    public static AnonymousClass4Kp A05(Class cls, int i) {
        return new AnonymousClass4Kp(cls, "friendship_status", i);
    }

    public static AnonymousClass4L7 A06() {
        return new AnonymousClass4L7(AnonymousClass4L8.A00, "rating_count");
    }

    public static AnonymousClass4L7 A07() {
        return new AnonymousClass4L7(AnonymousClass69U.A00, "latest_reel_media");
    }

    public static AnonymousClass4L7 A09(AnonymousClass4L1 r2) {
        return new AnonymousClass4L7(r2, "interop_messaging_user_fbid");
    }

    public static AnonymousClass4L7 A0B(AnonymousClass4L1 r2) {
        return new AnonymousClass4L7(r2, "third_party_downloads_enabled");
    }

    public static AnonymousClass4L7 A0C(AnonymousClass4L1 r2) {
        return new AnonymousClass4L7(r2, "duration_in_ms");
    }

    public static AnonymousClass4L7 A0D(AnonymousClass4L1 r2) {
        return new AnonymousClass4L7(r2, "is_fb_sticker");
    }

    public static AnonymousClass4L7 A0E(AnonymousClass4L1 r2) {
        return new AnonymousClass4L7(r2, "has_anonymous_profile_picture");
    }

    public static AnonymousClass4L7 A0F(AnonymousClass4L1 r2) {
        return new AnonymousClass4L7(r2, "has_onboarded_to_text_post_app");
    }

    public static AnonymousClass4L7 A0G(AnonymousClass4L1 r2) {
        return new AnonymousClass4L7(r2, "start_time_ms");
    }

    public static AnonymousClass4L7 A0H(AnonymousClass4L1 r2) {
        return new AnonymousClass4L7(r2, "x");
    }

    public static AnonymousClass4L7 A0I(AnonymousClass4L1 r2) {
        return new AnonymousClass4L7(r2, "y");
    }

    public static AnonymousClass4L7 A0J(AnonymousClass4L1 r2) {
        return new AnonymousClass4L7(r2, "uri");
    }

    public static AnonymousClass4L7 A0K(AnonymousClass4L1 r2) {
        return new AnonymousClass4L7(r2, "length");
    }

    public static AnonymousClass4L7 A0L(AnonymousClass4L1 r2) {
        return new AnonymousClass4L7(r2, "offset");
    }

    public static AnonymousClass4L7 A0M(AnonymousClass4L1 r2) {
        return new AnonymousClass4L7(r2, "media_id");
    }

    public static AnonymousClass4L7 A0N(AnonymousClass4L1 r2) {
        return new AnonymousClass4L7(r2, "rotation");
    }

    public static AnonymousClass4L7 A0O(AnonymousClass4L1 r2) {
        return new AnonymousClass4L7(r2, "subtitle");
    }

    public static AnonymousClass4L7 A0P(AnonymousClass4L1 r2) {
        return new AnonymousClass4L7(r2, "is_bestie");
    }

    public static AnonymousClass4L7 A0Q(AnonymousClass4L1 r2) {
        return new AnonymousClass4L7(r2, "is_hidden");
    }

    public static AnonymousClass4L7 A0R(AnonymousClass4L1 r2) {
        return new AnonymousClass4L7(r2, "is_pinned");
    }

    public static AnonymousClass4L7 A0S(AnonymousClass4L1 r2) {
        return new AnonymousClass4L7(r2, "is_sticker");
    }

    public static AnonymousClass4L7 A0U(AnonymousClass4L1 r2) {
        return new AnonymousClass4L7(r2, DevServerEntity.COLUMN_DESCRIPTION);
    }

    public static AnonymousClass4L7 A0V(AnonymousClass4L1 r2) {
        return new AnonymousClass4L7(r2, "end_time_ms");
    }

    public static AnonymousClass4L7 A0W(AnonymousClass4L1 r2) {
        return new AnonymousClass4L7(r2, "is_in_stock");
    }

    public static AnonymousClass4L7 A0X(AnonymousClass4L1 r2) {
        return new AnonymousClass4L7(r2, "strong_id__");
    }

    public static AnonymousClass4L7 A0Y(AnonymousClass4L1 r2) {
        return new AnonymousClass4L7(r2, "z");
    }

    public static AnonymousClass4L7 A0Z(AnonymousClass4L1 r2) {
        return new AnonymousClass4L7(r2, "pk_id");
    }

    public static AnonymousClass4L7 A0a(AnonymousClass4L1 r2) {
        return new AnonymousClass4L7(r2, "fbid_v2");
    }

    public static AnonymousClass4L7 A0b(AnonymousClass4L1 r2) {
        return new AnonymousClass4L7(r2, "following");
    }

    public static AnonymousClass4L7 A0c(AnonymousClass4L1 r2) {
        return new AnonymousClass4L7(r2, "is_private");
    }

    public static AnonymousClass4L7 A0d(AnonymousClass4L1 r2) {
        return new AnonymousClass4L7(r2, "profile_pic_id");
    }

    public static AnonymousClass4L7 A0e(AnonymousClass4L1 r2) {
        return new AnonymousClass4L7(r2, "has_variants");
    }

    public static AnonymousClass4L7 A0f(AnonymousClass4L1 r2) {
        return new AnonymousClass4L7(r2, "external_url");
    }

    public static AnonymousClass4Kx A0g() {
        AnonymousClass4L8 r6 = AnonymousClass4L8.A00;
        AnonymousClass4L7 r5 = new AnonymousClass4L7(r6, IgReactMediaPickerNativeModule.HEIGHT);
        AnonymousClass4Kz r1 = AnonymousClass4Kz.A00;
        return new AnonymousClass4Kx(new AnonymousClass4Kr[]{r5, new AnonymousClass4L7(r1, PublicKeyCredentialControllerUtility.JSON_KEY_ID), new AnonymousClass4L7(r6, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE), new AnonymousClass4L7(r1, "url"), new AnonymousClass4L7(r6, IgReactMediaPickerNativeModule.WIDTH)});
    }

    public static AnonymousClass4Kx A0h() {
        return new AnonymousClass4Kx(new AnonymousClass4Kr[]{new AnonymousClass4L7(AnonymousClass4Kz.A00, "text")});
    }

    public static AnonymousClass4Kx A0i(AnonymousClass4Kw r1, AnonymousClass4Kr r2, Class cls, String str, int i) {
        return new AnonymousClass4Kx(new AnonymousClass4Kr[]{r2, new AnonymousClass4Kp(r1, cls, str, i)});
    }

    public static AnonymousClass4Kx A0j(AnonymousClass4L1 r1, AnonymousClass4Kr r2, AnonymousClass4Kr r3, AnonymousClass4Kr r4, String str) {
        return new AnonymousClass4Kx(new AnonymousClass4Kr[]{r2, r3, r4, new AnonymousClass4L7(r1, str)});
    }

    public static AnonymousClass4Kx A0k(AnonymousClass4Kr r1, AnonymousClass4Kr r2, Class cls, String str, int i) {
        return new AnonymousClass4Kx(new AnonymousClass4Kr[]{r1, r2, new AnonymousClass4Kp(cls, str, i)});
    }

    public static AnonymousClass4Kx A0l(AnonymousClass4Kr r1, C295935p9 r2, String str) {
        return new AnonymousClass4Kx(new AnonymousClass4Kr[]{r1, new AnonymousClass612(r2, str)});
    }

    public static AnonymousClass4Kx A0m(AnonymousClass4Kr r1, Class cls, String str, int i) {
        return new AnonymousClass4Kx(new AnonymousClass4Kr[]{r1, new AnonymousClass4Kp(cls, str, i)});
    }

    public static AnonymousClass4Kx A0n(C295935p9 r1, String str) {
        return new AnonymousClass4Kx(new AnonymousClass4Kr[]{new AnonymousClass612(r1, str)});
    }

    public static AnonymousClass17K A0r(1E9 r2, 17P r3, int i) {
        Parcelable.Creator creator = User.CREATOR;
        return r2.A00(1aC.A01(r2, (ImmutablePandoUserDict) r3.A04(i, ImmutablePandoUserDict.class)));
    }

    public static 1Xj A0u(1E9 r2, 17P r3, int i) {
        ImmutablePandoMediaDict immutablePandoMediaDict = (ImmutablePandoMediaDict) r3.A05(i, ImmutablePandoMediaDict.class);
        if (immutablePandoMediaDict == null) {
            return null;
        }
        1Xv r0 = 1Xj.A0h;
        return 1Xv.A00(r2, immutablePandoMediaDict);
    }

    public static ProductCollection A0w(17P r2, ProductCollection productCollection) {
        if (productCollection == null) {
            return (ProductCollection) r2.A05(1848938416, ImmutablePandoProductCollection.class);
        }
        return productCollection;
    }

    public static ProductDetailsProductItemDictIntf A0x(17P r2, ProductDetailsProductItemDictIntf productDetailsProductItemDictIntf) {
        if (productDetailsProductItemDictIntf == null) {
            return (ProductDetailsProductItemDictIntf) r2.A05(-309474065, ImmutablePandoProductDetailsProductItemDict.class);
        }
        return productDetailsProductItemDictIntf;
    }

    public static User A0y(1E9 r2, 17P r3) {
        ImmutablePandoUserDict immutablePandoUserDict = (ImmutablePandoUserDict) r3.A07(ImmutablePandoUserDict.class);
        if (immutablePandoUserDict == null) {
            return null;
        }
        Parcelable.Creator creator = User.CREATOR;
        return 1aC.A01(r2, immutablePandoUserDict);
    }

    public static Float A11(16F r1, Float f, Object obj) {
        if ("z".equals(obj)) {
            return new Float(r1.A0U());
        }
        return f;
    }

    public static Object A16(Class cls) {
        return cls.getMethod("create", new Class[0]).invoke((Object) null, new Object[0]);
    }

    public static Object A17(Class cls, String str, int i) {
        return cls.getMethod(str, new Class[i]).invoke((Object) null, new Object[i]);
    }

    public static String A18(C250663lr r1) {
        return r1.A07("text");
    }

    public static String A1E(Object obj) {
        String str = (String) obj;
        0qQ.A0B(str, 0);
        return str;
    }

    public static ArrayList A1F(C250663lr r2, Object obj) {
        0qQ.A07(obj);
        C383579fo r0 = (C383579fo) r2.A01(C383579fo.class, -851351358);
        0qQ.A07(r0);
        return AJ5.A03(r0);
    }

    public static 0t0 A1G(Object obj, int i) {
        return AnonymousClass0eN.A01(new C41562AwU(obj, i));
    }

    public static C66143MDv A1H(Object obj, AnonymousClass4D7 r3, int i) {
        return new C66143MDv(obj, r3, i, 42);
    }

    public static void A1J(17Z r1, ImageInfo imageInfo) {
        if (imageInfo != null) {
            r1.A0q("image_versions2");
            1dH.A00(r1, imageInfo.FEa());
        }
    }

    public static void A1T(Object obj, 05G r2, int i) {
        r2.Epw(new C59678JTj(obj, i));
    }

    public static boolean A1a(TreeJNI treeJNI) {
        return treeJNI.hasFieldValue("is_verified");
    }

    public static boolean A1b(C250663lr r1, int i) {
        return r1.getCoercedBooleanField(i, "is_verified");
    }

    public static Parcelable A03(Parcel parcel, Class cls) {
        return parcel.readParcelable(cls.getClassLoader());
    }

    public static AnonymousClass4L7 A08(AnonymousClass4L1 r2) {
        return new AnonymousClass4L7(r2, Dbm.A01());
    }

    public static AnonymousClass4L7 A0A(AnonymousClass4L1 r2) {
        return new AnonymousClass4L7(r2, C46367Ddj.A00());
    }

    public static AnonymousClass4L7 A0T(AnonymousClass4L1 r2) {
        return new AnonymousClass4L7(r2, AnonymousClass9PN.A00());
    }

    public static TreeJNI A0o(Object obj, 0eP[] r3) {
        TreeJNI treeJNI = (TreeJNI) obj;
        TreeJNI applyToTree = new TreeUpdaterJNI(0Yt.A06(r3), treeJNI).applyToTree(treeJNI);
        0qQ.A07(applyToTree);
        return applyToTree;
    }

    public static FBPayIGGraphQLQueryExecutor A0t() {
        return AnonymousClass2E0.A06().A00.A01;
    }

    public static C43239Bv1 A0v(C86 c86) {
        return (C43239Bv1) c86.A0E().A02(C43239Bv1.class, "credit_card", -1936747117);
    }

    public static Boolean A0z(16F r1, Boolean bool, Object obj, String str) {
        if (str.equals(obj)) {
            return Boolean.valueOf(r1.A0d());
        }
        return bool;
    }

    public static Enum A10(C250663lr r0, Enum enumR, String str, int i) {
        Enum requiredEnumField = r0.getRequiredEnumField(i, str, enumR);
        0qQ.A07(requiredEnumField);
        return requiredEnumField;
    }

    public static Integer A12(Parcel parcel) {
        return Integer.valueOf(parcel.readInt());
    }

    public static Integer A13(16F r1, Integer num, Object obj, String str) {
        if (str.equals(obj)) {
            return Integer.valueOf(r1.A1D());
        }
        return num;
    }

    public static Long A14(16F r1, Long l, Object obj, String str) {
        if (str.equals(obj)) {
            return Long.valueOf(r1.A0y());
        }
        return l;
    }

    public static Object A15(SparseArray sparseArray, int i) {
        Object obj = sparseArray.get(i);
        obj.getClass();
        return obj;
    }

    public static String A19(C250663lr r1, int i) {
        return r1.getOptionalStringField(i, AnonymousClass9PN.A00());
    }

    public static String A1A(C250663lr r0, String str, int i) {
        String requiredStringField = r0.getRequiredStringField(i, str);
        0qQ.A0C(requiredStringField, "null cannot be cast to non-null type kotlin.String");
        return requiredStringField;
    }

    public static String A1B(17P r1) {
        return r1.A0i(-1938614671);
    }

    public static String A1C(17P r1) {
        return r1.A0i(-1759410662);
    }

    public static String A1D(17P r1) {
        return r1.A0i(3226745);
    }

    public static void A1I(Parcel parcel, Iterator it, int i) {
        parcel.writeParcelable((Parcelable) it.next(), i);
    }

    public static void A1K(17Z r2, Iterator it) {
        Map.Entry entry = (Map.Entry) it.next();
        if (!16P.A04(r2, entry)) {
            r2.A0t((String) entry.getValue());
        }
    }

    public static void A1L(16F r1, AbstractCollection abstractCollection) {
        Long valueOf = Long.valueOf(r1.A0y());
        if (valueOf != null) {
            abstractCollection.add(valueOf);
        }
    }

    public static void A1O(1E9 r2, AbstractCollection abstractCollection, Iterator it) {
        ImmutablePandoMediaDict immutablePandoMediaDict = (ImmutablePandoMediaDict) it.next();
        1Xv r0 = 1Xj.A0h;
        0qQ.A0A(immutablePandoMediaDict);
        abstractCollection.add(1Xv.A00(r2, immutablePandoMediaDict));
    }

    public static void A1P(1E9 r2, AbstractCollection abstractCollection, Iterator it) {
        ImmutablePandoUserDict immutablePandoUserDict = (ImmutablePandoUserDict) it.next();
        Parcelable.Creator creator = User.CREATOR;
        0qQ.A0A(immutablePandoUserDict);
        abstractCollection.add(1aC.A01(r2, immutablePandoUserDict));
    }

    public static void A1Q(1E9 r1, AbstractCollection abstractCollection, Iterator it) {
        abstractCollection.add(r1.A00((User) it.next()));
    }

    public static void A1R(1E9 r2, AbstractCollection abstractCollection, Iterator it) {
        Parcelable.Creator creator = User.CREATOR;
        abstractCollection.add(1aC.A01(r2, (ImmutablePandoUserDict) it.next()));
    }

    public static void A1S(User user, Map map) {
        map.put("merchant", user.A08());
    }

    public static void A1U(AbstractCollection abstractCollection, Iterator it) {
        ExtendedImageUrl extendedImageUrl = (ExtendedImageUrl) it.next();
        if (extendedImageUrl != null) {
            abstractCollection.add(extendedImageUrl.A00());
        }
    }

    public static void A1V(AbstractCollection abstractCollection, Iterator it) {
        AndroidLink androidLink = (AndroidLink) it.next();
        if (androidLink != null) {
            abstractCollection.add(androidLink.FHC());
        }
    }

    public static void A1W(AbstractCollection abstractCollection, Iterator it) {
        C65211bM r0 = (C65211bM) it.next();
        if (r0 != null) {
            abstractCollection.add(r0.FHC());
        }
    }

    public static void A1X(AbstractCollection abstractCollection, Iterator it) {
        VideoVersionIntf videoVersionIntf = (VideoVersionIntf) it.next();
        if (videoVersionIntf != null) {
            abstractCollection.add(videoVersionIntf.FHC());
        }
    }

    public static void A1Y(AbstractCollection abstractCollection, Iterator it) {
        Double A0p = 012.A0p(String.valueOf(((Number) it.next()).floatValue()));
        if (A0p != null) {
            abstractCollection.add(A0p);
        }
    }

    public static void A1Z(AbstractCollection abstractCollection, Iterator it) {
        abstractCollection.add(((VideoVersionIntf) it.next()).FEd());
    }
}
