package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.common.session.UserSession;
import com.instagram.model.hashtag.Hashtag;
import com.instagram.model.hashtag.HashtagImpl;
import com.instagram.model.keyword.Keyword;
import com.instagram.model.mapquery.MapQuery;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Ma5  reason: case insensitive filesystem */
public final class C66636Ma5 implements C20998X8v {
    public final int A00;

    public C66636Ma5(int i) {
        this.A00 = i;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.Ma1, X.Mfb] */
    /* JADX WARNING: type inference failed for: r2v1, types: [X.Nff, X.Mfb] */
    /* JADX WARNING: type inference failed for: r2v2, types: [X.Mn4, X.Mfb] */
    /* JADX WARNING: type inference failed for: r2v3, types: [X.Nfj, X.Mfb] */
    /* JADX WARNING: type inference failed for: r2v4, types: [X.72J, X.Mfb] */
    /* JADX WARNING: type inference failed for: r2v5, types: [X.Nfh, X.Mfb] */
    public final /* bridge */ /* synthetic */ C66942Mfb ALz(UserSession userSession, Object obj, long j) {
        switch (this.A00) {
            case 0:
                String str = (String) obj;
                0qQ.A0B(str, 2);
                ? mfb = new C66942Mfb(5);
                mfb.A02 = j;
                mfb.A00 = str;
                return mfb;
            case 1:
            case 3:
                Hashtag hashtag = (Hashtag) obj;
                0qQ.A0B(hashtag, 2);
                HashtagImpl FEY = hashtag.FEY();
                ? mfb2 = new C66942Mfb(1);
                mfb2.A02 = j;
                mfb2.A00 = FEY.FEY();
                return mfb2;
            case 2:
                Keyword keyword = (Keyword) obj;
                0qQ.A0B(keyword, 2);
                ? mfb3 = new C66942Mfb(4);
                mfb3.A02 = j;
                mfb3.A01 = keyword;
                return mfb3;
            case 4:
                MapQuery mapQuery = (MapQuery) obj;
                0qQ.A0B(mapQuery, 2);
                ? mfb4 = new C66942Mfb(6);
                mfb4.A02 = j;
                mfb4.A00 = mapQuery;
                return mfb4;
            case 7:
                User user = (User) obj;
                0qQ.A0B(user, 2);
                ? mfb5 = new C66942Mfb(0);
                mfb5.A02 = j;
                mfb5.A00 = user;
                return mfb5;
            default:
                C18072Vl0 vl0 = (C18072Vl0) obj;
                0qQ.A0B(vl0, 2);
                ? mfb6 = new C66942Mfb(2);
                mfb6.A02 = j;
                mfb6.A00 = vl0;
                return mfb6;
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.Ma1, java.lang.Object, X.Mfb] */
    public final ArrayList AOm(UserSession userSession, String str) {
        List list;
        switch (this.A00) {
            case 0:
                list = O2Y.parseFromJson(16P.A00(str)).A00;
                break;
            case 1:
            case 3:
                list = C67425Mng.parseFromJson(16P.A00(str)).A00;
                break;
            case 2:
                list = C67435Mnq.parseFromJson(16P.A00(str)).A00;
                break;
            case 4:
                list = C70323O2b.parseFromJson(16P.A00(str)).A00;
                break;
            case 7:
                AnonymousClass7TG.A1N(userSession, str);
                16F A03 = AnonymousClass15o.A00.A03(str);
                A03.A1J();
                16L A11 = A03.A11();
                16L r4 = 16L.A0D;
                if (A11 != r4) {
                    return null;
                }
                ArrayList A1C = AnonymousClass7TE.A1C();
                while (true) {
                    16L A1J = A03.A1J();
                    16L r3 = 16L.A09;
                    if (A1J == r3) {
                        return A1C;
                    }
                    String A0q = A03.A0q();
                    A03.A1J();
                    if ("users".equals(A0q) && A03.A11() == 16L.A0C) {
                        while (A03.A1J() != 16L.A08) {
                            ? mfb = new C66942Mfb(0);
                            if (A03.A11() == r4) {
                                while (A03.A1J() != r3) {
                                    String A0q2 = A03.A0q();
                                    A03.A1J();
                                    if (PublicKeyCredentialControllerUtility.JSON_KEY_USER.equals(A0q2)) {
                                        0c5 r0 = 0c9.A04;
                                        mfb.A00 = AnonymousClass16y.A00(0c5.A00(A03, userSession));
                                    } else {
                                        C66941Mfa.A01(A03, mfb, A0q2);
                                    }
                                }
                                mfb.A06();
                                A1C.add(mfb);
                            }
                        }
                    }
                }
            default:
                AnonymousClass7TG.A1N(userSession, str);
                list = C67423Mne.parseFromJson(0c9.A04.A01(userSession, str)).A00;
                break;
        }
        return 00k.A0U(list);
    }

    public final /* bridge */ /* synthetic */ Object AvK(C66942Mfb mfb) {
        switch (this.A00) {
            case 0:
                AnonymousClass72J r2 = (AnonymousClass72J) mfb;
                0qQ.A0B(r2, 0);
                return r2.A00;
            case 1:
            case 3:
                C69160Nfj nfj = (C69160Nfj) mfb;
                0qQ.A0B(nfj, 0);
                return nfj.A00;
            case 2:
                C67387Mn4 mn4 = (C67387Mn4) mfb;
                0qQ.A0B(mn4, 0);
                return mn4.A01;
            case 4:
                C69156Nff nff = (C69156Nff) mfb;
                0qQ.A0B(nff, 0);
                return nff.A00;
            case 7:
                C66632Ma1 ma1 = (C66632Ma1) mfb;
                0qQ.A0B(ma1, 0);
                return ma1.A06();
            default:
                C69158Nfh nfh = (C69158Nfh) mfb;
                0qQ.A0B(nfh, 0);
                return nfh.A00;
        }
    }

    public final /* bridge */ /* synthetic */ String BEa(Object obj) {
        switch (this.A00) {
            case 0:
                String str = (String) obj;
                0qQ.A0B(str, 0);
                return 002.A0R("entry_id_", str);
            case 1:
            case 3:
                Hashtag hashtag = (Hashtag) obj;
                0qQ.A0B(hashtag, 0);
                return String.valueOf(hashtag.getId());
            case 2:
                Keyword keyword = (Keyword) obj;
                0qQ.A0B(keyword, 0);
                return keyword.A04;
            case 4:
                MapQuery mapQuery = (MapQuery) obj;
                0qQ.A0B(mapQuery, 0);
                return mapQuery.A00;
            case 7:
                User user = (User) obj;
                0qQ.A0B(user, 0);
                return user.getId();
            default:
                C18072Vl0 vl0 = (C18072Vl0) obj;
                0qQ.A0B(vl0, 0);
                String A05 = vl0.A00().A05();
                0qQ.A07(A05);
                return A05;
        }
    }

    /* JADX WARNING: type inference failed for: r1v6, types: [java.lang.Object, X.Mnh] */
    /* JADX WARNING: type inference failed for: r1v10, types: [X.Mnf, java.lang.Object] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String ENA(com.instagram.common.session.UserSession r7, java.util.List r8) {
        /*
            r6 = this;
            int r1 = r6.A00
            r0 = 1
            switch(r1) {
                case 0: goto L_0x004d;
                case 1: goto L_0x007f;
                case 2: goto L_0x00c6;
                case 3: goto L_0x007f;
                case 4: goto L_0x00e9;
                case 5: goto L_0x0006;
                case 6: goto L_0x0006;
                case 7: goto L_0x0120;
                default: goto L_0x0006;
            }
        L_0x0006:
            X.0qQ.A0B(r8, r0)
            X.Mnf r1 = new X.Mnf
            r1.<init>()
            r1.A00 = r8
            java.io.StringWriter r4 = X.JTO.A0v()
            X.17W r3 = X.AnonymousClass7TF.A0K(r4)
            java.util.List r0 = r1.A00
            if (r0 == 0) goto L_0x0160
            java.lang.String r0 = "places"
            X.16P.A03(r3, r0)
            java.util.List r0 = r1.A00
            java.util.Iterator r2 = r0.iterator()
        L_0x0027:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x015d
            java.lang.Object r1 = r2.next()
            X.Nfh r1 = (X.C69158Nfh) r1
            if (r1 == 0) goto L_0x0027
            r3.A0c()
            X.Vl0 r0 = r1.A00
            if (r0 == 0) goto L_0x0046
            java.lang.String r0 = "place"
            r3.A0q(r0)
            X.Vl0 r0 = r1.A00
            X.C18226Vnq.A00(r3, r0)
        L_0x0046:
            X.C66941Mfa.A00(r3, r1)
            r3.A0Z()
            goto L_0x0027
        L_0x004d:
            X.0qQ.A0B(r8, r0)
            java.io.StringWriter r4 = X.JTO.A0v()
            X.17W r3 = X.AnonymousClass7TF.A0K(r4)
            java.lang.String r0 = "effect_search_entries"
            java.util.Iterator r5 = X.C41845B3m.A0s(r3, r0, r8)
        L_0x005e:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x015d
            java.lang.Object r2 = r5.next()
            X.72J r2 = (X.AnonymousClass72J) r2
            if (r2 == 0) goto L_0x005e
            r3.A0c()
            java.lang.String r1 = r2.A00
            if (r1 == 0) goto L_0x0078
            java.lang.String r0 = "query"
            r3.A0R(r0, r1)
        L_0x0078:
            X.C66941Mfa.A00(r3, r2)
            r3.A0Z()
            goto L_0x005e
        L_0x007f:
            X.0qQ.A0B(r8, r0)
            X.Mnh r1 = new X.Mnh
            r1.<init>()
            r1.A00 = r8
            java.io.StringWriter r4 = X.JTO.A0v()
            X.17W r3 = X.AnonymousClass7TF.A0K(r4)
            java.util.List r0 = r1.A00
            if (r0 == 0) goto L_0x0160
            java.lang.String r0 = "hashtags"
            X.16P.A03(r3, r0)
            java.util.List r0 = r1.A00
            java.util.Iterator r2 = r0.iterator()
        L_0x00a0:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x015d
            java.lang.Object r1 = r2.next()
            X.Nfj r1 = (X.C69160Nfj) r1
            if (r1 == 0) goto L_0x00a0
            r3.A0c()
            com.instagram.model.hashtag.HashtagImpl r0 = r1.A00
            if (r0 == 0) goto L_0x00bf
            java.lang.String r0 = "hashtag"
            r3.A0q(r0)
            com.instagram.model.hashtag.HashtagImpl r0 = r1.A00
            X.C279594yt.A00(r3, r0)
        L_0x00bf:
            X.C66941Mfa.A00(r3, r1)
            r3.A0Z()
            goto L_0x00a0
        L_0x00c6:
            X.0qQ.A0B(r8, r0)
            java.io.StringWriter r4 = X.JTO.A0v()
            X.17W r3 = X.AnonymousClass7TF.A0K(r4)
            java.lang.String r0 = "keywords"
            java.util.Iterator r1 = X.C41845B3m.A0s(r3, r0, r8)
        L_0x00d7:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x015d
            java.lang.Object r0 = r1.next()
            X.Mn4 r0 = (X.C67387Mn4) r0
            if (r0 == 0) goto L_0x00d7
            X.C67386Mn3.A00(r3, r0)
            goto L_0x00d7
        L_0x00e9:
            X.0qQ.A0B(r8, r0)
            java.io.StringWriter r4 = X.JTO.A0v()
            X.17W r3 = X.AnonymousClass7TF.A0K(r4)
            java.lang.String r0 = "mapQueries"
            java.util.Iterator r2 = X.C41845B3m.A0s(r3, r0, r8)
        L_0x00fa:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x015d
            java.lang.Object r1 = r2.next()
            X.Nff r1 = (X.C69156Nff) r1
            if (r1 == 0) goto L_0x00fa
            r3.A0c()
            com.instagram.model.mapquery.MapQuery r0 = r1.A00
            if (r0 == 0) goto L_0x0119
            java.lang.String r0 = "map_query"
            r3.A0q(r0)
            com.instagram.model.mapquery.MapQuery r0 = r1.A00
            X.C70896OQo.A00(r3, r0)
        L_0x0119:
            X.C66941Mfa.A00(r3, r1)
            r3.A0Z()
            goto L_0x00fa
        L_0x0120:
            X.0qQ.A0B(r8, r0)
            java.io.StringWriter r4 = X.JTO.A0v()
            X.17W r3 = X.AnonymousClass7TF.A0K(r4)
            java.lang.String r0 = "users"
            r3.A0q(r0)
            r3.A0b()
            java.util.Iterator r2 = r8.iterator()
        L_0x0137:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x015d
            java.lang.Object r1 = r2.next()
            X.Ma1 r1 = (X.C66632Ma1) r1
            r3.A0c()
            java.lang.String r0 = "user"
            r3.A0q(r0)
            com.instagram.user.model.User r0 = r1.A06()
            X.16S r0 = X.17c.A00(r0)
            X.AnonymousClass16R.A00(r3, r0)
            X.C66941Mfa.A00(r3, r1)
            r3.A0Z()
            goto L_0x0137
        L_0x015d:
            r3.A0Y()
        L_0x0160:
            java.lang.String r0 = X.AnonymousClass7TG.A0k(r3, r4)
            X.0qQ.A07(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66636Ma5.ENA(com.instagram.common.session.UserSession, java.util.List):java.lang.String");
    }
}
