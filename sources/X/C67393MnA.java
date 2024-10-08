package X;

import com.instagram.api.schemas.OriginalSoundData;
import com.instagram.api.schemas.TrackDataImpl;
import com.instagram.api.schemas.TrackMetadataImpl;
import com.instagram.model.hashtag.Hashtag;
import com.instagram.model.keyword.Keyword;
import com.instagram.model.mapquery.MapQuery;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.MnA  reason: case insensitive filesystem */
public abstract class C67393MnA {
    /* JADX WARNING: type inference failed for: r5v3, types: [X.Nfh, X.Mfb] */
    /* JADX WARNING: type inference failed for: r5v5, types: [X.Nff, X.Mfb] */
    /* JADX WARNING: type inference failed for: r5v6, types: [X.Nfi, X.Mfb] */
    /* JADX WARNING: type inference failed for: r5v7, types: [X.Nfi, X.Mfb] */
    public static final List A00(1UV r6, List list) {
        C66942Mfb mfb;
        ArrayList<C67365Mmh> A0q = AnonymousClass7TF.A0q(r6, 1);
        for (Object next : list) {
            if (r6.apply(next)) {
                A0q.add(next);
            }
        }
        ArrayList A0r = AnonymousClass7TG.A0r(A0q);
        for (C67365Mmh mmh : A0q) {
            int i = mmh.A01;
            if (i == 0) {
                Object A00 = mmh.A00();
                0qQ.A0C(A00, "null cannot be cast to non-null type com.instagram.user.model.User");
                mfb = new C66632Ma1((User) A00);
            } else if (i == 1) {
                Object A002 = mmh.A00();
                0qQ.A0C(A002, "null cannot be cast to non-null type com.instagram.model.hashtag.Hashtag");
                mfb = new C69160Nfj(((Hashtag) A002).FEY());
            } else if (i == 2) {
                Object A003 = mmh.A00();
                0qQ.A0C(A003, "null cannot be cast to non-null type com.instagram.model.place.Place");
                C18072Vl0 vl0 = (C18072Vl0) A003;
                0qQ.A0B(vl0, 1);
                ? mfb2 = new C66942Mfb(2);
                mfb2.A00 = vl0;
                mfb = mfb2;
            } else if (i == 4) {
                Object A004 = mmh.A00();
                0qQ.A0C(A004, "null cannot be cast to non-null type com.instagram.model.keyword.Keyword");
                mfb = new C67387Mn4((Keyword) A004);
            } else if (i == 6) {
                Object A005 = mmh.A00();
                0qQ.A0C(A005, "null cannot be cast to non-null type com.instagram.model.mapquery.MapQuery");
                MapQuery mapQuery = (MapQuery) A005;
                0qQ.A0B(mapQuery, 1);
                ? mfb3 = new C66942Mfb(6);
                mfb3.A00 = mapQuery;
                mfb = mfb3;
            } else if (i == 7) {
                TrackDataImpl trackDataImpl = mmh.A01;
                if (trackDataImpl != null) {
                    TrackMetadataImpl trackMetadataImpl = mmh.A02;
                    if (trackMetadataImpl != null) {
                        ? mfb4 = new C66942Mfb(7);
                        mfb4.A01 = trackDataImpl.FCv();
                        mfb4.A02 = trackMetadataImpl.FCw();
                        JVX jvx = new JVX(trackDataImpl);
                        mfb4.A03 = jvx;
                        jvx.A00 = trackMetadataImpl;
                        mfb = mfb4;
                    } else {
                        throw AnonymousClass7TE.A0y();
                    }
                } else {
                    OriginalSoundData originalSoundData = mmh.A00;
                    if (originalSoundData != null) {
                        ? mfb5 = new C66942Mfb(7);
                        mfb5.A00 = originalSoundData;
                        mfb5.A03 = new DHT(originalSoundData);
                        mfb = mfb5;
                    } else {
                        throw AnonymousClass7TE.A0y();
                    }
                }
            } else {
                throw DbW.A0b("Unknown blended search type: ", i);
            }
            mfb.A02 = mmh.A02;
            mfb.A01 = mmh.A01;
            A0r.add(mfb);
        }
        return A0r;
    }

    public static final List A01(Collection collection) {
        0qQ.A0B(collection, 0);
        ArrayList arrayList = new ArrayList(0Yv.A1E(collection, 10));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(new C66632Ma1((User) it.next()));
        }
        return arrayList;
    }

    public static final boolean A02(String str, String str2) {
        if (str != null) {
            return DbT.A12(AnonymousClass1Q2.A02(), str).startsWith(DbT.A12(AnonymousClass1Q2.A02(), str2));
        }
        return false;
    }
}
