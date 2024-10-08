package X;

import com.facebook.msys.mci.AuthData;
import com.facebook.xapp.messaging.capability.vector.Capabilities;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: X.OPz  reason: case insensitive filesystem */
public abstract class C70882OPz {
    public static final User A00(AuthData authData, C74513Pw8 pw8, 17i r16, int i) {
        User user;
        Integer num;
        Integer num2;
        int intValue;
        FollowStatus followStatus;
        16V r0;
        Boolean bool;
        16V r1;
        Boolean bool2;
        Boolean bool3;
        Boolean bool4;
        Boolean bool5;
        Boolean bool6;
        Long l;
        ImageUrl imageUrl;
        ImageUrl imageUrl2;
        String str;
        Long l2;
        int i2 = i;
        C74513Pw8 pw82 = pw8;
        String BF8 = pw8.BF8(i2);
        String Bqh = pw8.Bqh(i2);
        Integer num3 = null;
        if (BF8 == null || Bqh == null) {
            0wb.A03("MsysUserFactory", "Unable to create a User from MSYS data");
            return null;
        }
        17i r10 = r16;
        if (r16 != null) {
            user = r10.A02(BF8);
        } else {
            user = null;
        }
        User user2 = new User(BF8, Bqh);
        LinkedHashSet A0y = DbS.A0y();
        Long BSU = pw8.BSU(i2);
        if (BSU != null) {
            user2.A0s(BSU);
            if (user != null) {
                l2 = user.BST();
            } else {
                l2 = null;
            }
            A01(BSU, l2, "messagingUserFbid", A0y);
        }
        user2.A0c(pw8.BJA(i2) ? 1 : 0);
        Integer valueOf = Integer.valueOf(user2.BIW());
        if (user != null) {
            num = Integer.valueOf(user.BIW());
        } else {
            num = null;
        }
        A01(valueOf, num, "interopUserType", A0y);
        String name = pw8.getName(i2);
        if (name != null) {
            user2.A0t(name);
            if (user != null) {
                str = user.getFullName();
            } else {
                str = null;
            }
            A01(name, str, "fullName", A0y);
        }
        if (authData != null) {
            Long BhA = pw8.BhA(i2);
            String Bh9 = pw8.Bh9(i2);
            String Bh7 = pw8.Bh7(i2);
            if (BhA != null) {
                l = C66582MXn.A0n(BhA);
            } else {
                l = null;
            }
            String A00 = C70117NxX.A00(authData, l, Bh9, Bh7);
            if (A00 != null) {
                ImageUrl A0V = DbS.A0V(A00);
                if (user == null || (imageUrl = user.A03.Bh3()) == null) {
                    imageUrl = A0V;
                }
                user2.A0l(imageUrl);
                if (user != null) {
                    imageUrl2 = user.Bh3();
                } else {
                    imageUrl2 = null;
                }
                A01(A0V, imageUrl2, "profilePicUrl", A0y);
            }
        }
        Integer CDh = pw8.CDh(i2);
        boolean z = false;
        if (CDh != null) {
            user2.A1F(AnonymousClass7TF.A1S(CDh.intValue(), 2));
            Boolean valueOf2 = Boolean.valueOf(user2.isVerified());
            if (user != null) {
                bool6 = Boolean.valueOf(user.isVerified());
            } else {
                bool6 = null;
            }
            A01(valueOf2, bool6, "isVerified", A0y);
        }
        Long AlH = pw8.AlH(i2);
        if (AlH != null) {
            user2.A1E(Capabilities.A01.A00(new long[]{0, AlH.longValue()}).A00.get(66));
            Boolean valueOf3 = Boolean.valueOf(user2.isRestricted());
            if (user != null) {
                bool5 = Boolean.valueOf(user.isRestricted());
            } else {
                bool5 = null;
            }
            A01(valueOf3, bool5, "isRestricted", A0y);
        }
        Integer AlF = pw82.AlF(i2);
        if (AlF != null) {
            user2.A1C(Capabilities.A01.A00(new long[]{(long) AlF.intValue()}).A00.get(26));
            Boolean valueOf4 = Boolean.valueOf(user2.CXR());
            if (user != null) {
                bool4 = Boolean.valueOf(user.CXR());
            } else {
                bool4 = null;
            }
            A01(valueOf4, bool4, "isMessagingPseudoBlocking", A0y);
        }
        Integer Ag6 = pw82.Ag6(i2);
        if (Ag6 != null) {
            int intValue2 = Ag6.intValue();
            user2.A0y(AnonymousClass7TF.A1S(intValue2, 1));
            Boolean valueOf5 = Boolean.valueOf(user2.CPV());
            if (user != null) {
                bool2 = Boolean.valueOf(user.CPV());
            } else {
                bool2 = null;
            }
            A01(valueOf5, bool2, "isBlocking", A0y);
            user2.A1B(AnonymousClass7TF.A1S(intValue2, 2));
            Boolean valueOf6 = Boolean.valueOf(user2.CXO());
            if (user != null) {
                bool3 = Boolean.valueOf(user.CXO());
            } else {
                bool3 = null;
            }
            A01(valueOf6, bool3, "isMessagingBlocking", A0y);
        }
        Integer AqI = pw82.AqI(i2);
        if (AqI != null) {
            int intValue3 = AqI.intValue();
            if (intValue3 == 11) {
                z = true;
            }
            user2.A03.EQB(Boolean.valueOf(z));
            if (intValue3 == 11) {
                r0 = 16V.A05;
            } else if (intValue3 != 12) {
                r0 = 16V.A07;
            } else {
                r0 = 16V.A06;
            }
            user2.A0o(r0);
            Boolean valueOf7 = Boolean.valueOf(user2.CPm());
            if (user != null) {
                bool = Boolean.valueOf(user.CPm());
            } else {
                bool = null;
            }
            A01(valueOf7, bool, "isBusiness", A0y);
            16V A0J = user2.A0J();
            if (user != null) {
                r1 = user.A0J();
            } else {
                r1 = null;
            }
            A01(A0J, r1, "accountType", A0y);
        }
        Integer B6r = pw82.B6r(i2);
        if (B6r != null && (intValue = B6r.intValue()) != 0) {
            if (intValue == 3 || intValue == 6 || intValue == 1) {
                user2.A0n(FollowStatus.A06);
            } else if (intValue == 7 || intValue == 2 || intValue == 4) {
                user2.A0n(FollowStatus.A05);
            } else if (intValue == 5 || intValue == 8 || intValue == 9) {
                user2.A0n(FollowStatus.A07);
            }
            FollowStatus B6o = user2.B6o();
            if (user != null) {
                followStatus = user.B6o();
            } else {
                followStatus = null;
            }
            A01(B6o, followStatus, "followStatus", A0y);
        } else if (user == null && B6r != null && B6r.intValue() == 0) {
            user2.A0n(FollowStatus.A04);
        }
        Integer AqH = pw82.AqH(i2);
        if (AqH != null) {
            user2.A0r(AqH);
            Integer Bjj = user2.Bjj();
            if (user != null) {
                num2 = user.Bjj();
            } else {
                num2 = null;
            }
            A01(Bjj, num2, C273654mx.A00(3207), A0y);
        }
        Integer BA6 = pw82.BA6(i2);
        if (BA6 != null) {
            user2.A00 = BA6.intValue();
            if (user != null) {
                num3 = Integer.valueOf(user.A00);
            }
            A01(BA6, num3, "groupParticipantJoinState", A0y);
        }
        if (A0y.size() > 0) {
            0wb.A03("MsysUserFactory", AnonymousClass7TG.A0m(A0y, "The following user data fields in MSYS conflict with the cached values in UserCache: ", AnonymousClass7TE.A1A()));
        }
        if (r10 != null) {
            return r10.A01(user2, true, false);
        }
        return user2;
    }

    public static final void A01(Object obj, Object obj2, String str, Set set) {
        if (obj2 != null && !obj2.equals(obj)) {
            set.add(str);
        }
    }
}
