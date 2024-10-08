package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.util.Base64;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.fbusertag.FBUserTag;
import com.instagram.model.people.PeopleTag;
import com.instagram.tagging.activity.mediaTaggingInfo.MediaTaggingInfo;
import com.instagram.tagging.model.Tag;
import com.instagram.user.model.User;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public abstract class LTZ {
    public static final Integer A02(MediaTaggingInfo mediaTaggingInfo, boolean z) {
        0qQ.A0B(mediaTaggingInfo, 0);
        if (!mediaTaggingInfo.A0C.isEmpty()) {
            return AnonymousClass05K.A00;
        }
        if (!mediaTaggingInfo.A0B.isEmpty() || (z && !mediaTaggingInfo.A0A.isEmpty())) {
            return AnonymousClass05K.A01;
        }
        return AnonymousClass05K.A0C;
    }

    public static final ArrayList A04(UserSession userSession, C3499682q r6, boolean z) {
        ArrayList A0q = AnonymousClass7TF.A0q(userSession, 0);
        Iterator A0w = JTP.A0w(r6);
        while (A0w.hasNext()) {
            AnonymousClass3Q2 A0U = JTS.A0U(userSession, A0w);
            if (A0U != null) {
                List list = A0U.A48;
                if (!z || list.isEmpty()) {
                    list = A0U.A40;
                }
                A0q.addAll(list);
            }
        }
        return A0q;
    }

    public static final void A09(Fragment fragment, UserSession userSession, 1Xj r22, AnonymousClass4DU r23, C262944Gp r24, String str, boolean z, boolean z2) {
        int i;
        Bundle A0a = AnonymousClass7TE.A0a();
        String A0n = C51972G9s.A0n();
        1Xj r4 = r22;
        A08(A0a, r4);
        AnonymousClass4DU r19 = r23;
        A0a.putString("prior_module", r19.getModuleName());
        A0a.putString(AnonymousClass000.A00(263), A0n);
        String A00 = AnonymousClass000.A00(528);
        String A002 = AnonymousClass000.A00(262);
        A0a.putString(A00, A002);
        ArrayList A3E = r4.A3E();
        boolean z3 = true;
        UserSession userSession2 = userSession;
        if (z) {
            A3E = A06(r4.A3E(), r4.A0C.getCoauthorProducers());
            User A2A = r4.A2A(userSession2);
            if (A2A != null) {
                A3E.add(0, new PeopleTag(A2A));
            }
            A0a.putBoolean(AnonymousClass000.A00(1504), true);
        }
        String str2 = str;
        if (str != null) {
            A0a.putString(AnonymousClass000.A00(71), str2);
        }
        if (r4.A28() != null) {
            if (A3E == null) {
                A3E = AnonymousClass7TE.A1C();
            }
            A3E.add(new PeopleTag(r4.A28()));
        }
        if (z2) {
            A3E = A06(r4.A3E(), r4.A3a());
        }
        A0a.putParcelableArrayList("tagged_people", A3E);
        DbU.A1D(A0a, userSession2);
        ArrayList A3I = r4.A3I();
        String str3 = null;
        User A2A2 = r4.A2A(userSession2);
        if (A2A2 != null) {
            str3 = A2A2.getId();
        }
        if (A3I == null || A3I.isEmpty() || !LOQ.A00.A01(userSession2, str3, r4.A5G()) || z || z2) {
            z3 = false;
        }
        ArrayList A1C = AnonymousClass7TE.A1C();
        if (z3) {
            A0a.putParcelableArrayList(AnonymousClass000.A00(1872), AnonymousClass7TE.A1D(A3I));
            if (A3E != null) {
                A1C.addAll(A3E);
            }
            if (A3I != null) {
                A1C.addAll(A3I);
            }
            if (!A1C.isEmpty()) {
                String id = r4.getId();
                ArrayList A02 = AnonymousClass4H4.A02(A1C);
                if (AnonymousClass4H4.A04(A02)) {
                    AnonymousClass4H4.A03((HOH) null, C62669KkV.CROSSPOST_WITH_FB_TAGS_ICON_CLICK, (C53175Gjl) null, userSession2, userSession2.A06, id, (String) null, AnonymousClass4H4.A01(id, A02), (Map) null);
                }
            }
        }
        if (z2) {
            i = 2131974955;
        } else if (z) {
            i = 2131974954;
        } else if (z3) {
            i = 2131975422;
        } else {
            i = 2131975421;
            if (r4.CeS()) {
                i = 2131975425;
            }
        }
        Fragment fragment2 = fragment;
        UserSession userSession3 = userSession2;
        Bundle bundle = A0a;
        Fragment fragment3 = fragment2;
        A07(bundle, fragment3, userSession3, r19, r24, DbU.A0m(fragment2, i));
        if (z3 && !A1C.isEmpty()) {
            AnonymousClass4H4.A00.A08(userSession2, r4.getId(), A0n, A002, A1C);
        }
    }

    public static final void A0B(Fragment fragment, UserSession userSession, 1Xj r5, AnonymousClass4DU r6, String str) {
        if (r5.A0z() == 1) {
            ArrayList A3E = r5.A3E();
            if (A3E != null) {
                String id = ((Tag) A3E.get(0)).getId();
                0qQ.A07(id);
                C46474Dfc A01 = C46548Dgp.A01(userSession, id, AnonymousClass000.A00(1581), r6.getModuleName());
                A01.A0L = str;
                C309516Yo A0H = DbW.A0H(fragment, userSession);
                A0H.A08();
                C46474Dfc.A03(A0H, userSession, C46447Df9.A02(), A01);
                return;
            }
            return;
        }
        throw DbT.A0m();
    }

    public static final void A0C(Fragment fragment, UserSession userSession, 1Xj r12, AnonymousClass4DU r13, String str, List list) {
        UserSession userSession2 = userSession;
        C51972G9s.A1D(userSession, list);
        String str2 = str;
        Bundle A0B = DbV.A0B(str, 6);
        A08(A0B, r12);
        AnonymousClass4DU r7 = r13;
        A0B.putString("prior_module", r13.getModuleName());
        A0B.putBoolean(AnonymousClass000.A00(1818), true);
        A0B.putBoolean(AnonymousClass000.A00(2594), false);
        ArrayList A1C = AnonymousClass7TE.A1C();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A1C.add(new PeopleTag(DbT.A0k(it)));
        }
        A0B.putParcelableArrayList("tagged_people", A1C);
        DbU.A1D(A0B, userSession);
        A07(A0B, fragment, userSession2, r7, (C262944Gp) null, str2);
    }

    public static final void A0D(Fragment fragment, UserSession userSession, 1Xj r7, FBUserTag fBUserTag) {
        0qQ.A0B(r7, 0);
        Context context = fragment.getContext();
        if (context != null) {
            FBUserTag.FBUserInfo fBUserInfo = fBUserTag.A02;
            C49907FEf.A00(context, fBUserInfo.A02, fBUserInfo.A04);
        }
        ArrayList A1C = AnonymousClass7TE.A1C();
        ArrayList A3E = r7.A3E();
        if (A3E != null) {
            A1C.addAll(A3E);
        }
        ArrayList A3I = r7.A3I();
        if (A3I != null) {
            A1C.addAll(A3I);
        }
        if (!A1C.isEmpty()) {
            String id = r7.getId();
            ArrayList A02 = AnonymousClass4H4.A02(A1C);
            if (AnonymousClass4H4.A04(A02)) {
                ArrayList A01 = AnonymousClass4H4.A01(id, A02);
                AnonymousClass4H4.A03((HOH) null, C62669KkV.FB_TAG_TOOLTIP_IN_CROSSPOST_CLICK, AnonymousClass4H4.A00(fBUserTag, id), userSession, userSession.A06, id, (String) null, A01, (Map) null);
            }
        }
    }

    public static final boolean A0E(Activity activity, UserSession userSession, G6R g6r, Boolean bool) {
        0qQ.A0B(userSession, 0);
        Boolean bool2 = false;
        if (JTS.A0e(userSession) == AnonymousClass05K.A0C) {
            Boolean bool3 = true;
            if (((bool3.equals(bool) && AnonymousClass7TE.A0q(userSession).getInt(AnonymousClass000.A00(3405), 0) == 0) || (bool2.equals(bool) && AnonymousClass7TE.A0q(userSession).getInt(AnonymousClass000.A00(3404), 0) == 0)) && 182.A06(0Tu.A05, userSession, 36313012184811092L)) {
                E60 e60 = new E60();
                Bundle A09 = DbY.A09(userSession);
                A09.putBoolean(AnonymousClass000.A00(2644), bool3.equals(bool));
                e60.setArguments(A09);
                e60.A00 = g6r;
                C331127Pr A0W = DbS.A0W(userSession);
                A0W.A0T = e60;
                A0W.A0a = bool2;
                DbU.A0y(activity, e60, A0W);
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001d, code lost:
        if (X.182.A06(r2, r5, 36313012185138775L) != false) goto L_0x0036;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A0F(X.28D r4, com.instagram.common.session.UserSession r5, java.lang.Boolean r6) {
        /*
            r0 = 0
            X.0qQ.A0B(r5, r0)
            r3 = 1
            if (r6 == 0) goto L_0x001f
            X.0Tu r2 = X.0Tu.A05
            r0 = 36594487161784045(0x82027e000406ed, double:3.205839263060006E-306)
            int r0 = X.DbS.A04(r2, r5, r0)
            if (r0 <= r3) goto L_0x001f
            r0 = 36313012185138775(0x81027e00050657, double:3.02783335442078E-306)
            boolean r0 = X.182.A06(r2, r5, r0)
            if (r0 != 0) goto L_0x0036
        L_0x001f:
            X.28D r0 = X.28D.A0x
            if (r4 != r0) goto L_0x0037
            X.0Tu r2 = X.0Tu.A05
            r0 = 36597923137719358(0x82059e00240c3e, double:3.2080121880770626E-306)
            int r0 = X.DbS.A04(r2, r5, r0)
            if (r0 <= r3) goto L_0x0037
            boolean r0 = A0H(r5)
            if (r0 == 0) goto L_0x0037
        L_0x0036:
            return r3
        L_0x0037:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LTZ.A0F(X.28D, com.instagram.common.session.UserSession, java.lang.Boolean):boolean");
    }

    public static final boolean A0G(28D r3, UserSession userSession, Boolean bool, int i) {
        0qQ.A0B(userSession, 0);
        if (bool != null) {
            0Tu r2 = 0Tu.A05;
            if (i >= DbS.A04(r2, userSession, 36594487161784045L) && 182.A06(r2, userSession, 36313012185138775L)) {
                return true;
            }
        }
        if (28D.A0x != r3 || i < DbS.A04(0Tu.A05, userSession, 36597923137719358L) || !A0H(userSession)) {
            return false;
        }
        return true;
    }

    public static final boolean A0I(UserSession userSession, C3499682q r3, boolean z) {
        if (A0K(userSession, z)) {
            return true;
        }
        if (!A0L(A04(userSession, r3, true)) || !A0J(userSession, z)) {
            return false;
        }
        return true;
    }

    public static final boolean A0J(UserSession userSession, boolean z) {
        0Tu r2;
        0qQ.A0B(userSession, 0);
        if (AnonymousClass7TF.A0Q(userSession).A1Q()) {
            if (z) {
                r2 = 0Tu.A05;
            } else {
                r2 = 0Tu.A06;
            }
            if (!182.A06(r2, userSession, 36314648567352048L)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public static final boolean A0K(UserSession userSession, boolean z) {
        0Tu r2;
        0qQ.A0B(userSession, 0);
        if (AnonymousClass7TF.A0Q(userSession).A1Q()) {
            if (z) {
                r2 = 0Tu.A05;
            } else {
                r2 = 0Tu.A06;
            }
            if (!182.A06(r2, userSession, 36314648567876339L)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public static final boolean A0L(ArrayList arrayList) {
        0qQ.A0B(arrayList, 1);
        Iterator A1G = AnonymousClass7TE.A1G(arrayList);
        while (A1G.hasNext()) {
            if (((PeopleTag) AnonymousClass7TF.A0a(A1G)).A07().A1V()) {
                return true;
            }
        }
        return false;
    }

    public static final float A00(MediaTaggingInfo mediaTaggingInfo) {
        if (mediaTaggingInfo.A0H) {
            return mediaTaggingInfo.A00;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        ImageUrl imageUrl = mediaTaggingInfo.A02;
        if (imageUrl != null) {
            BitmapFactory.decodeFile(0cp.A03(imageUrl.getUrl()).getPath(), options);
        }
        return ((float) options.outWidth) / ((float) options.outHeight);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0036, code lost:
        if (r3.A5v() == false) goto L_0x0038;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001b, code lost:
        if (r0.BZ6() == null) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String A03(android.content.Context r2, X.1Xj r3) {
        /*
            if (r3 == 0) goto L_0x0038
            boolean r0 = r3.A5G()
            if (r0 == 0) goto L_0x0025
            X.1sQ r0 = X.C51966G9m.A0n(r3)
            if (r0 == 0) goto L_0x001d
            X.1s9 r0 = r0.BP1()
            if (r0 == 0) goto L_0x001d
            X.4bJ r0 = r0.BZ6()
            r1 = 2131975424(0x7f135d00, float:1.958794E38)
            if (r0 != 0) goto L_0x0020
        L_0x001d:
            r1 = 2131975419(0x7f135cfb, float:1.958793E38)
        L_0x0020:
            java.lang.String r0 = X.AnonymousClass7TE.A16(r2, r1)
            return r0
        L_0x0025:
            boolean r0 = r3.CeS()
            if (r0 == 0) goto L_0x002f
            r1 = 2131975425(0x7f135d01, float:1.9587942E38)
            goto L_0x0020
        L_0x002f:
            boolean r0 = r3.A5v()
            r1 = 2131975418(0x7f135cfa, float:1.9587928E38)
            if (r0 != 0) goto L_0x0020
        L_0x0038:
            r1 = 2131975421(0x7f135cfd, float:1.9587934E38)
            goto L_0x0020
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LTZ.A03(android.content.Context, X.1Xj):java.lang.String");
    }

    public static final int A01(UserSession userSession, C3499682q r6) {
        AnonymousClass7TG.A1N(userSession, r6);
        ArrayList A1C = AnonymousClass7TE.A1C();
        Iterator A0w = JTP.A0w(r6);
        while (A0w.hasNext()) {
            AnonymousClass3Q2 A0U = JTS.A0U(userSession, A0w);
            if (A0U != null) {
                Iterator A1G = AnonymousClass7TE.A1G(A0U.A41);
                while (A1G.hasNext()) {
                    Tag tag = (Tag) AnonymousClass7TF.A0a(A1G);
                    if (!A1C.contains(tag.getId())) {
                        String id = tag.getId();
                        0qQ.A07(id);
                        A1C.add(id);
                    }
                }
            }
        }
        return A1C.size();
    }

    public static final ArrayList A05(List list) {
        ArrayList A1C = AnonymousClass7TE.A1C();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String A18 = AnonymousClass7TE.A18(it);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            Bitmap decodeFile = BitmapFactory.decodeFile(A18);
            if (decodeFile != null) {
                JZK.A00(Bitmap.CompressFormat.JPEG, decodeFile, byteArrayOutputStream);
                String encodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
                0qQ.A07(encodeToString);
                A1C.add(encodeToString);
            }
        }
        return A1C;
    }

    public static final ArrayList A06(List list, List list2) {
        ArrayList A1C = AnonymousClass7TE.A1C();
        if (!(list == null || list2 == null)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                PeopleTag peopleTag = (PeopleTag) it.next();
                JTR.A1R(peopleTag.A07(), peopleTag, A1C, list2);
            }
        }
        return A1C;
    }

    public static final void A07(Bundle bundle, Fragment fragment, UserSession userSession, AnonymousClass4DU r7, C262944Gp r8, String str) {
        DbY.A1S(fragment, userSession);
        E6X e6x = new E6X();
        e6x.setArguments(bundle);
        0hq r0 = fragment.mFragmentManager;
        if (r0 != null) {
            C71342cb.A00(userSession).A0D(r7, (String) null, r0.A0M());
        }
        C331127Pr A0W = DbS.A0W(userSession);
        A0W.A0d = str;
        A0W.A0T = e6x;
        A0W.A0U = new FmA(4, fragment, e6x);
        if (r8 != null) {
            A0W.A0X = r8;
        }
        C331157Pu A00 = A0W.A00();
        e6x.A01 = new C49409EvB(A00);
        FragmentActivity activity = fragment.getActivity();
        if (activity != null) {
            A00.A02(activity, e6x);
        }
    }

    public static void A08(Bundle bundle, 1Xj r3) {
        bundle.putString("media_id", r3.getId());
        bundle.putSerializable("media_type", r3.BR7());
    }

    public static final void A0A(Fragment fragment, UserSession userSession, 1Xj r7, AnonymousClass4DU r8, C262934Go r9) {
        Bundle A0a = AnonymousClass7TE.A0a();
        A08(A0a, r7);
        ArrayList A1C = AnonymousClass7TE.A1C();
        Iterator it = r7.A3Q().iterator();
        while (it.hasNext()) {
            User A0k = DbT.A0k(it);
            0qQ.A0C(A0k, C66579MXk.A00(18));
            A1C.add(new PeopleTag(A0k));
        }
        A0a.putParcelableArrayList("tagged_people", A1C);
        A0a.putString("prior_module", r8.getModuleName());
        DbU.A1D(A0a, userSession);
        E6X e6x = new E6X();
        e6x.setArguments(A0a);
        C71342cb.A00(userSession).A0D(r8, (String) null, fragment.getParentFragmentManager().A0M());
        C331127Pr A0W = DbS.A0W(userSession);
        A0W.A0d = fragment.getString(2131969137);
        A0W.A0T = e6x;
        if (r9 != null) {
            A0W.A0X = r9;
        }
        DbY.A13(fragment, e6x, A0W);
    }

    public static final boolean A0H(UserSession userSession) {
        Integer A0e = JTS.A0e(userSession);
        if (A0e == AnonymousClass05K.A0C && 182.A06(0Tu.A05, userSession, 36316448160878976L)) {
            return true;
        }
        if (A0e != AnonymousClass05K.A01 || !182.A06(0Tu.A05, userSession, 36316448160944513L)) {
            return false;
        }
        return true;
    }
}
