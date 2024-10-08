package X;

import com.instagram.api.schemas.BrandedContentGatingInfo;
import com.instagram.api.schemas.BrandedContentProjectMetadata;
import com.instagram.api.schemas.MediaGenAIDetectionMethod;
import com.instagram.api.schemas.MusicProduct;
import com.instagram.model.venue.LocationDict;
import com.instagram.model.venue.Venue;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.common.model.MusicAssetModel;
import com.instagram.music.common.model.MusicOverlayStickerModel;
import com.instagram.pendingmedia.model.BrandedContentTag;
import com.instagram.pendingmedia.model.ClipInfo;
import com.instagram.shopping.model.taggingfeed.ProductCollectionFeedTaggingMeta;
import com.instagram.user.model.UpcomingEvent;
import com.instagram.user.model.UpcomingEventImpl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.LSu  reason: case insensitive filesystem */
public abstract class C64187LSu {
    /* JADX WARNING: type inference failed for: r6v2, types: [com.instagram.model.venue.Venue, java.lang.Object] */
    public static final C61075JwD A00(AnonymousClass3Q2 r66) {
        Venue venue;
        AudioOverlayTrack audioOverlayTrack;
        AnonymousClass3Q2 r7 = r66;
        0qQ.A0B(r7, 0);
        String str = r7.A35;
        ArrayList arrayList = r7.A40;
        List list = r7.A4L;
        String str2 = r7.A2d;
        Jv3 jv3 = new Jv3(r7.A1o, r7.A41, r7.A43, r7.A4X, r7.A48);
        ClipInfo clipInfo = r7.A1N;
        List A0L = r7.A0L();
        ArrayList A0r = AnonymousClass7TG.A0r(A0L);
        Iterator it = A0L.iterator();
        while (it.hasNext()) {
            A0r.add(A00(JTO.A0m(it)));
        }
        LocationDict locationDict = r7.A1H;
        if (locationDict != null) {
            ? obj = new Object();
            obj.A00 = locationDict;
            venue = obj;
        } else {
            venue = null;
        }
        0eP A1L = AnonymousClass7TE.A1L(Double.valueOf(r7.A00), Double.valueOf(r7.A01));
        MusicOverlayStickerModel musicOverlayStickerModel = r7.A1J;
        if (musicOverlayStickerModel != null) {
            MusicAssetModel A03 = MusicAssetModel.A03(musicOverlayStickerModel);
            Integer num = musicOverlayStickerModel.A0K;
            if (num != null) {
                int intValue = num.intValue();
                Integer num2 = musicOverlayStickerModel.A0O;
                if (num2 != null) {
                    audioOverlayTrack = new AudioOverlayTrack(A03, intValue, num2.intValue());
                } else {
                    throw AnonymousClass7TE.A0z("Required value was null.");
                }
            } else {
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
        } else {
            audioOverlayTrack = null;
        }
        boolean z = r7.A67;
        C61100JxB jxB = r7.A0v;
        boolean z2 = r7.A5a;
        boolean z3 = r7.A5s;
        AnonymousClass3QO r29 = r7.A1F;
        String str3 = r7.A13.A03;
        UpcomingEventImpl upcomingEventImpl = r7.A1p;
        String str4 = r7.A3F;
        boolean z4 = r7.A5f;
        C61000Juw juw = r7.A1B;
        MediaGenAIDetectionMethod mediaGenAIDetectionMethod = r7.A0w;
        List list2 = r7.A4F;
        boolean A0o = r7.A0o();
        C63815L7w l7w = new C63815L7w();
        List list3 = r7.A4C;
        if (list3 != null) {
            l7w.A02 = list3;
        }
        l7w.A00 = r7.A0s;
        l7w.A03 = r7.A5i;
        l7w.A01 = r7.A0t;
        C59721JVf jVf = new C59721JVf(43, (Object) l7w, (Object) r7.A08());
        return new C61075JwD((AnonymousClass9J6) null, (C61080JwI) null, (C61066Jw4) null, jVf, (C61046Jvk) null, (C61077JwF) null, (C61079JwH) null, (C61062Jw0) null, jxB, mediaGenAIDetectionMethod, juw, jv3, r29, r7.A1G, venue, audioOverlayTrack, clipInfo, (C272024jy) null, upcomingEventImpl, str, "", str2, (String) null, (String) null, (String) null, (String) null, str3, str4, arrayList, list, list2, (List) null, A0r, (List) null, A1L, r7.A04, true, A0o, false, false, z, false, z2, z3, false, true, false, z4, true, true);
    }

    public static final void A01(C61075JwD jwD, AnonymousClass3Q2 r9) {
        List list;
        ArrayList arrayList;
        List list2;
        ProductCollectionFeedTaggingMeta productCollectionFeedTaggingMeta;
        double A00;
        boolean z;
        BrandedContentTag brandedContentTag;
        C63815L7w l7w;
        BrandedContentProjectMetadata brandedContentProjectMetadata;
        C63815L7w l7w2;
        BrandedContentGatingInfo brandedContentGatingInfo;
        C63815L7w l7w3;
        MusicAssetModel musicAssetModel;
        Object obj;
        0qQ.A0B(jwD, 1);
        List list3 = jwD.A0W;
        if (list3 != null) {
            ArrayList A1D = AnonymousClass7TE.A1D(list3);
            0qQ.A0B(A1D, 0);
            r9.A40 = A1D;
        }
        Jv3 jv3 = jwD.A0B;
        if (jv3 == null || (list = jv3.A03) == null) {
            list = AnonymousClass7TE.A1C();
        }
        r9.A48 = list;
        if (jv3 != null) {
            ArrayList arrayList2 = jv3.A01;
            if (arrayList2 != null) {
                if (r9.A0p() && arrayList2.isEmpty() && !r9.A5i) {
                    r9.A0s = null;
                }
                r9.A41 = arrayList2;
            }
            arrayList = jv3.A02;
        } else {
            arrayList = null;
        }
        r9.A43 = arrayList;
        if (jv3 != null) {
            list2 = jv3.A04;
        } else {
            list2 = null;
        }
        r9.A4X = list2;
        ClipInfo clipInfo = jwD.A0G;
        if (clipInfo != null) {
            r9.A1N = clipInfo;
        }
        if (jv3 != null) {
            productCollectionFeedTaggingMeta = jv3.A00;
        } else {
            productCollectionFeedTaggingMeta = null;
        }
        r9.A1o = productCollectionFeedTaggingMeta;
        r9.A4L = jwD.A0V;
        r9.A2d = jwD.A0M;
        List<C61075JwD> list4 = jwD.A0S;
        if (list4 != null) {
            ArrayList A1C = AnonymousClass7TE.A1C();
            for (C61075JwD jwD2 : list4) {
                Iterator A0g = JTQ.A0g(r9);
                while (true) {
                    if (!A0g.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = A0g.next();
                    if (0qQ.A0K(((AnonymousClass3Q2) obj).A35, jwD2.A0N)) {
                        break;
                    }
                }
                AnonymousClass3Q2 r2 = (AnonymousClass3Q2) obj;
                if (r2 != null) {
                    A01(jwD2, r2);
                    A1C.add(C60340gF.A00);
                }
            }
        }
        r9.A0W(jwD.A0E);
        0eP r22 = jwD.A0Y;
        if (r22 == null) {
            A00 = 0.0d;
            r9.A00 = 0.0d;
        } else {
            r9.A00 = JTO.A00(r22.A00);
            A00 = JTO.A00(r22.A01);
        }
        r9.A01 = A00;
        AudioOverlayTrack audioOverlayTrack = jwD.A0F;
        if (!(audioOverlayTrack == null || (musicAssetModel = audioOverlayTrack.A08) == null)) {
            r9.A1J = C59670JTa.A01(MusicProduct.MUSIC_IN_FEED, audioOverlayTrack, musicAssetModel, (String) null);
        }
        r9.A67 = jwD.A0j;
        r9.A0v = jwD.A08;
        r9.A5a = jwD.A0b;
        r9.A5s = jwD.A0c;
        AnonymousClass3QO r0 = jwD.A0C;
        if (r0 == null) {
            r0 = AnonymousClass3QO.DEFAULT;
        }
        r9.A1F = r0;
        UpcomingEvent upcomingEvent = jwD.A0I;
        UpcomingEventImpl upcomingEventImpl = null;
        if (upcomingEvent != null) {
            upcomingEventImpl = upcomingEvent.FGz((1E6) null);
        }
        r9.A1p = upcomingEventImpl;
        r9.A3F = jwD.A0P;
        r9.A5f = jwD.A0g;
        r9.A1B = jwD.A0A;
        r9.A0w = jwD.A09;
        r9.A4F = jwD.A0T;
        r9.A65 = jwD.A0i;
        C59721JVf jVf = jwD.A03;
        if (jVf == null || (l7w3 = (C63815L7w) jVf.A01) == null) {
            z = false;
        } else {
            z = l7w3.A03;
        }
        r9.A5i = z;
        List list5 = null;
        if (jVf != null) {
            C63815L7w l7w4 = (C63815L7w) jVf.A01;
            if (!(l7w4 == null || (brandedContentGatingInfo = l7w4.A00) == null)) {
                r9.A0s = brandedContentGatingInfo;
            }
            brandedContentTag = (BrandedContentTag) jVf.A00;
        } else {
            brandedContentTag = null;
        }
        r9.A1M = brandedContentTag;
        if (!(jVf == null || (l7w2 = (C63815L7w) jVf.A01) == null)) {
            list5 = l7w2.A02;
        }
        r9.A4C = list5;
        if (jVf != null && (l7w = (C63815L7w) jVf.A01) != null && (brandedContentProjectMetadata = l7w.A01) != null) {
            r9.A0t = brandedContentProjectMetadata;
        }
    }

    public static final boolean A02(C61075JwD jwD) {
        ArrayList arrayList;
        0qQ.A0B(jwD, 0);
        if (jwD.A0D == 1iA.A09) {
            List<C61075JwD> list = jwD.A0S;
            if (list == null) {
                return false;
            }
            for (C61075JwD A02 : list) {
                if (A02(A02)) {
                    return true;
                }
            }
            return false;
        }
        Jv3 jv3 = jwD.A0B;
        if (jv3 == null || (arrayList = jv3.A01) == null || !DbT.A1b(arrayList)) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x002e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A03(X.C61075JwD r4) {
        /*
            r0 = 0
            X.0qQ.A0B(r4, r0)
            java.util.List r0 = r4.A0V
            r3 = 1
            if (r0 == 0) goto L_0x0010
            boolean r0 = X.AnonymousClass7TE.A1b(r0)
            if (r0 != r3) goto L_0x0010
        L_0x000f:
            return r3
        L_0x0010:
            java.lang.String r0 = r4.A0M
            if (r0 != 0) goto L_0x000f
            java.util.List r1 = r4.A0S
            if (r1 == 0) goto L_0x0022
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L_0x0024
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x0024
        L_0x0022:
            r3 = 0
            return r3
        L_0x0024:
            java.util.Iterator r2 = r1.iterator()
        L_0x0028:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0022
            java.lang.Object r1 = r2.next()
            X.JwD r1 = (X.C61075JwD) r1
            java.util.List r0 = r1.A0V
            if (r0 == 0) goto L_0x003f
            boolean r0 = X.AnonymousClass7TE.A1b(r0)
            if (r0 != r3) goto L_0x003f
            return r3
        L_0x003f:
            java.lang.String r0 = r1.A0M
            if (r0 == 0) goto L_0x0028
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64187LSu.A03(X.JwD):boolean");
    }

    public static final boolean A04(C61075JwD jwD) {
        0qQ.A0B(jwD, 0);
        1iA r2 = jwD.A0D;
        if (r2 == 1iA.A09) {
            List<C61075JwD> list = jwD.A0S;
            if (list == null) {
                return true;
            }
            for (C61075JwD jwD2 : list) {
                if (jwD2.A0D == 1iA.A0a) {
                }
            }
            return true;
        } else if (r2 != 1iA.A0a) {
            return true;
        }
        return false;
    }

    public static final boolean A05(C61075JwD jwD) {
        1iA r1 = jwD.A0D;
        if (r1 == 1iA.A09) {
            List<C61075JwD> list = jwD.A0S;
            if (list == null) {
                return true;
            }
            for (C61075JwD jwD2 : list) {
                if (jwD2.A0D != 1iA.A0a) {
                    return false;
                }
            }
            return true;
        } else if (r1 != 1iA.A0a) {
            return false;
        } else {
            return true;
        }
    }
}
