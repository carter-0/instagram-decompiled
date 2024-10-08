package X;

import android.net.Uri;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.direct.armadilloexpress.transportpayload.Collection;
import com.instagram.direct.armadilloexpress.transportpayload.CommonMediaTransport;
import com.instagram.direct.armadilloexpress.transportpayload.Media;
import com.instagram.direct.armadilloexpress.transportpayload.Thumbnail;
import com.instagram.direct.armadilloexpress.transportpayload.Video;
import com.instagram.model.mediasize.GifUrlImpl;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.OaT  reason: case insensitive filesystem */
public abstract class C71051OaT {
    public static final C254873tC createGenericFBAttachment(Media media, List list, C254703su r18, UserSession userSession, C68145N2l n2l) {
        CommonMediaTransport commonMediaTransport;
        String str;
        String A0u;
        String str2;
        GifUrlImpl gifUrlImpl;
        int i;
        int i2;
        SimpleImageUrl simpleImageUrl;
        long j;
        long j2;
        Video A0O;
        float f;
        String str3;
        Media media2 = media;
        List list2 = list;
        C254703su r6 = r18;
        boolean A1b = C51973G9u.A1b(media2, list2, r6);
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession2, 3);
        if (media2.mediaCase_ == 3) {
            commonMediaTransport = media2.A0O().mediaTransport_;
        } else {
            commonMediaTransport = media2.A0N().mediaTransport_;
        }
        if (commonMediaTransport == null) {
            commonMediaTransport = CommonMediaTransport.DEFAULT_INSTANCE;
        }
        String str4 = commonMediaTransport.mediaId_;
        0qQ.A0A(str4);
        if (list2.size() > 3) {
            C254763t0 A0U = r6.A0U();
            if (A0U != null) {
                str3 = A0U.A00;
            } else {
                str3 = null;
            }
            A0u = 002.A13("instagram://direct_media_collection?collection_type=stacks&thread_id=", str3, "&collection_id=", r6.A0g(), "&client_context=", r6.A0f());
        } else {
            if (media2.mediaCase_ == 3) {
                str = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
            } else {
                str = "0";
            }
            A0u = 002.A0u("instagram://media_viewer?is_video=", str, "&media_fbid=", str4);
        }
        1Xj A03 = C71113Od4.A03(userSession2, (C68145N2l) null, media2, r6.A0M().A00, r6.A1S());
        C68145N2l n2l2 = n2l;
        Uri A01 = C66834MdS.A01(n2l2, media2);
        if (A01 == null || (str2 = A01.toString()) == null) {
            str2 = "";
        }
        if (media2.mediaCase_ == 3) {
            float f2 = 0.0f;
            if (A03 != null) {
                f = (float) A03.A0y();
                f2 = (float) A03.A0x();
            } else {
                f = 0.0f;
            }
            gifUrlImpl = new GifUrlImpl(str2, f, f2);
        } else {
            gifUrlImpl = null;
        }
        if (media2.mediaCase_ != 3 || (A0O = media2.A0O()) == null || (A0O.bitField0_ & 8) == 0) {
            if (A03 != null) {
                i = A03.A0y();
                i2 = A03.A0x();
            } else {
                i = 0;
                i2 = 0;
            }
            simpleImageUrl = new SimpleImageUrl(str2, i, i2);
        } else {
            Thumbnail thumbnail = A0O.thumbnail_;
            if (thumbnail == null) {
                thumbnail = Thumbnail.DEFAULT_INSTANCE;
            }
            0qQ.A07(thumbnail);
            CommonMediaTransport commonMediaTransport2 = thumbnail.mediaTransport_;
            if (commonMediaTransport2 == null) {
                commonMediaTransport2 = CommonMediaTransport.DEFAULT_INSTANCE;
            }
            0qQ.A07(commonMediaTransport2);
            simpleImageUrl = new SimpleImageUrl(DbT.A10(C66834MdS.A00(n2l2, commonMediaTransport2, (List) null)), thumbnail.width_, thumbnail.height_);
        }
        int i3 = 0;
        if (media2.mediaCase_ == 3) {
            i3 = 2;
        }
        C254883tD r9 = C254883tD.SINGLE;
        0qQ.A0B(str4, 0);
        Long A0n = 00y.A0n(10, str4);
        if (A0n != null) {
            j = A0n.longValue();
        } else {
            j = 0;
        }
        Long A0n2 = 00y.A0n(10, str4);
        if (A0n2 != null) {
            j2 = A0n2.longValue();
        } else {
            j2 = 0;
        }
        return new C254873tC(simpleImageUrl, r9, gifUrlImpl, A0u, i3, 9, j, j2, A1b);
    }

    public static final void A00(UserSession userSession, Collection collection, C254703su r9, Long l, String str) {
        C68145N2l n2l;
        AnonymousClass7TG.A1O(userSession, collection);
        String A0f = r9.A0f();
        String str2 = str;
        if (str == null || A0f == null) {
            n2l = null;
        } else {
            n2l = new C68145N2l(l, str2, A0f, r9.C7c(), r9.A1d());
        }
        addCollectionData(r9, collection, userSession, n2l);
    }

    public static final Object addCollectionData(C254703su r2, Collection collection, UserSession userSession, C68145N2l n2l) {
        AnonymousClass7TG.A1T(r2, collection, userSession);
        List collectionData = getCollectionData(r2, collection, userSession, n2l);
        if (collectionData == null) {
            return new C2814857z("need_update");
        }
        r2.A17(2FW.A0y, collectionData);
        return collectionData;
    }

    public static final List getCollectionData(C254703su r4, Collection collection, UserSession userSession, C68145N2l n2l) {
        int ordinal;
        AnonymousClass7TG.A1T(r4, collection, userSession);
        if (!AnonymousClass7F3.A01(r4, userSession.A06) && (ordinal = r4.A0M().A00.ordinal()) != 0) {
            0Tu r2 = 0Tu.A05;
            if (ordinal == 1 ? !182.A06(r2, userSession, 2342166801766493711L) : 182.A06(r2, userSession, 36322869135092359L)) {
                return null;
            }
        }
        C13982TnY<Media> tnY = collection.media_;
        ArrayList A15 = DbV.A15(tnY);
        for (Media createGenericFBAttachment : tnY) {
            A15.add(createGenericFBAttachment(createGenericFBAttachment, tnY, r4, userSession, n2l));
        }
        return A15;
    }
}
