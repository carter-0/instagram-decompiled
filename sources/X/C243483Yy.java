package X;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import com.instagram.android.R;
import com.instagram.api.schemas.SocialContextType;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.webrtc.CameraCapturer;

/* renamed from: X.3Yy  reason: invalid class name and case insensitive filesystem */
public final class C243483Yy {
    public static final C243483Yy A00 = new Object();

    public static final List A01(SocialContextType socialContextType, UserSession userSession, 1Xj r10, boolean z) {
        C258223yf r6;
        boolean A01;
        List BxQ;
        C258203yd r0;
        Object obj;
        List BxO = r10.A0C.BxO();
        if (BxO != null) {
            Iterator it = BxO.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((C258223yf) obj).BxW() == socialContextType) {
                    break;
                }
            }
            r6 = (C258223yf) obj;
        } else {
            r6 = null;
        }
        if (z) {
            A01 = !182.A06(0Tu.A05, userSession, 2342165843989178859L);
        } else {
            A01 = AnonymousClass3DI.A01(userSession);
        }
        if (A01) {
            if (r6 != null) {
                return r6.BxQ();
            }
            return null;
        } else if (r6 == null || (BxQ = r6.BxQ()) == null) {
            return null;
        } else {
            ArrayList arrayList = new ArrayList();
            int i = 0;
            for (Object next : BxQ) {
                int i2 = i + 1;
                if (i < 0) {
                    0sr.A1T();
                    throw AnonymousClass00P.createAndThrow();
                }
                List BxP = r6.BxP();
                if (!(BxP == null || (r0 = (C258203yd) 00k.A0O(BxP, i)) == null || !0qQ.A0K(r0.CUi(), true))) {
                    arrayList.add(next);
                }
                i = i2;
            }
            return arrayList;
        }
    }

    public static final void A02(Context context, Resources resources, SpannableStringBuilder spannableStringBuilder, UserSession userSession, User user, int i) {
        int i2;
        0qQ.A0B(resources, 0);
        0qQ.A0B(userSession, 2);
        List A0V = user.A0V();
        if (A0V != null) {
            Integer BVD = user.A03.BVD();
            if (BVD != null) {
                i2 = BVD.intValue();
            } else {
                i2 = 0;
            }
            A04(resources, spannableStringBuilder, A0V, i, i2);
            C253003q3 r1 = new C253003q3(spannableStringBuilder, userSession);
            r1.A0L = true;
            r1.A01 = 2Yu.A0F(context, R.attr.textColorBoldLink);
            r1.A0Q = true;
            r1.A03((C253023q5) null);
            r1.A00();
        }
    }

    public static final void A03(Resources resources, SpannableStringBuilder spannableStringBuilder, SocialContextType socialContextType, List list, int i) {
        int i2;
        int i3;
        Object[] objArr;
        int i4;
        int size = list.size();
        if (size > i) {
            size = i;
        }
        int ordinal = socialContextType.ordinal();
        if (size == 1) {
            if (ordinal != 7) {
                i2 = 2131953864;
                if (ordinal != 1) {
                    i2 = 2131964948;
                }
            } else {
                i2 = 2131962596;
            }
            objArr = new Object[]{list.get(0)};
        } else if (size != 2) {
            if (ordinal != 7) {
                i3 = 2131953866;
                if (ordinal != 1) {
                    i3 = 2131964952;
                }
            } else {
                i3 = 2131962600;
            }
            objArr = new Object[]{list.get(0), list.get(1), list.get(2)};
        } else {
            if (ordinal != 7) {
                i4 = 2131953865;
                if (ordinal != 1) {
                    i4 = 2131964950;
                }
            } else {
                i4 = 2131962598;
            }
            objArr = new Object[]{list.get(0), list.get(1)};
        }
        spannableStringBuilder.append(resources.getString(i3, objArr));
    }

    public final List A05(UserSession userSession, 1Xj r5) {
        List<User> BxQ;
        0qQ.A0B(userSession, 0);
        if (182.A06(0Tu.A05, userSession, 36327752512649898L)) {
            C258223yf A002 = A00(r5);
            if (A002 == null || (BxQ = A002.BxQ()) == null) {
                return 0sn.A00;
            }
            ArrayList arrayList = new ArrayList(0Yv.A1E(BxQ, 10));
            for (User A003 : BxQ) {
                arrayList.add(AnonymousClass50Q.A00(A003));
            }
            return arrayList;
        }
        List<User> B3e = r5.A0C.B3e();
        if (B3e == null) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList(0Yv.A1E(B3e, 10));
        for (User A004 : B3e) {
            arrayList2.add(AnonymousClass50Q.A00(A004));
        }
        return arrayList2;
    }

    public final List A06(UserSession userSession, 1Xj r6) {
        List<User> BxQ;
        0qQ.A0B(r6, 1);
        if (!182.A06(0Tu.A05, userSession, 36327752512649898L) || C243353Yk.A00(userSession, r6)) {
            List C8S = r6.A0C.C8S();
            if (C8S != null) {
                return C8S;
            }
        } else {
            C258223yf A002 = A00(r6);
            if (!(A002 == null || (BxQ = A002.BxQ()) == null)) {
                ArrayList arrayList = new ArrayList(0Yv.A1E(BxQ, 10));
                for (User username : BxQ) {
                    arrayList.add(username.getUsername());
                }
                List A0d = 00k.A0d(arrayList, 1);
                if (A0d != null) {
                    return A0d;
                }
            }
        }
        return 0sn.A00;
    }

    public final void A09(Resources resources, SpannableStringBuilder spannableStringBuilder, SocialContextType socialContextType, List list, int i, int i2) {
        int i3;
        int i4;
        int i5;
        String[] strArr;
        int i6;
        int size = list.size();
        if (size > i2) {
            size = i2;
        }
        if (size != 1) {
            int ordinal = socialContextType.ordinal();
            if (size != 2) {
                if (ordinal != 7) {
                    i4 = R.plurals.blend_recommended_for_x_y_z_and_n_others;
                    if (ordinal != 1) {
                        i4 = R.plurals.liked_by_x_y_z_and_n_others;
                    }
                } else {
                    i4 = R.plurals.followed_by_x_y_z_and_n_others;
                }
                i5 = i - 3;
                String format = NumberFormat.getInstance(Locale.getDefault()).format((long) i5);
                0qQ.A07(format);
                strArr = new String[]{(String) list.get(0), (String) list.get(1), (String) list.get(2), format};
            } else {
                if (ordinal != 7) {
                    i6 = R.plurals.blend_recommended_for_x_y_and_n_others;
                    if (ordinal != 1) {
                        i6 = R.plurals.liked_by_x_y_and_n_others;
                    }
                } else {
                    i6 = R.plurals.followed_by_x_y_and_n_others;
                }
                i5 = i - 2;
                String format2 = NumberFormat.getInstance(Locale.getDefault()).format((long) i5);
                0qQ.A07(format2);
                strArr = new String[]{(String) list.get(0), (String) list.get(1), format2};
            }
        } else {
            int ordinal2 = socialContextType.ordinal();
            if (ordinal2 != 7) {
                i3 = R.plurals.blend_recommended_for_x_and_n_others;
                if (ordinal2 != 1) {
                    i3 = R.plurals.liked_by_x_and_n_others;
                }
            } else {
                i3 = R.plurals.followed_by_x_and_n_others;
            }
            i5 = i - 1;
            String format3 = NumberFormat.getInstance(Locale.getDefault()).format((long) i5);
            0qQ.A07(format3);
            strArr = new String[]{(String) list.get(0), format3};
        }
        spannableStringBuilder.append(0bC.A02(resources, strArr, i4, i5));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: X.3yf} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: X.3yf} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: X.3yf} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: X.3yf} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C258223yf A00(X.1Xj r4) {
        /*
            X.1Xy r0 = r4.A0C
            java.util.List r0 = r0.BxO()
            r4 = 0
            if (r0 == 0) goto L_0x0025
            java.util.Iterator r3 = r0.iterator()
        L_0x000d:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0023
            java.lang.Object r2 = r3.next()
            r0 = r2
            X.3yf r0 = (X.C258223yf) r0
            com.instagram.api.schemas.SocialContextType r1 = r0.BxW()
            com.instagram.api.schemas.SocialContextType r0 = com.instagram.api.schemas.SocialContextType.LIKED_BY
            if (r1 != r0) goto L_0x000d
            r4 = r2
        L_0x0023:
            X.3yf r4 = (X.C258223yf) r4
        L_0x0025:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C243483Yy.A00(X.1Xj):X.3yf");
    }

    public static final void A04(Resources resources, SpannableStringBuilder spannableStringBuilder, List list, int i, int i2) {
        CharSequence string;
        boolean z = false;
        if (i2 > i) {
            z = true;
        }
        int size = list.size();
        if (size > i) {
            size = i;
        }
        if (size != 0) {
            if (size != 1) {
                if (size != 2) {
                    if (z) {
                        int i3 = i2 - 3;
                        string = 0bC.A02(resources, new String[]{(String) list.get(0), (String) list.get(1), (String) list.get(2), C253673rC.A04(resources, Integer.valueOf(i3), CameraCapturer.OPEN_CAMERA_TIMEOUT, false, false)}, R.plurals.followed_by_x_y_z_and_n_others, i3);
                    } else {
                        string = resources.getString(2131962600, new Object[]{list.get(0), list.get(1), list.get(2)});
                    }
                } else if (z) {
                    int i4 = i2 - 2;
                    string = 0bC.A02(resources, new String[]{(String) list.get(0), (String) list.get(1), C253673rC.A04(resources, Integer.valueOf(i4), CameraCapturer.OPEN_CAMERA_TIMEOUT, false, false)}, R.plurals.followed_by_x_y_and_n_others, i4);
                } else {
                    string = resources.getString(2131962598, new Object[]{list.get(0), list.get(1)});
                }
            } else if (z) {
                int i5 = i2 - 1;
                string = 0bC.A02(resources, new String[]{(String) list.get(0), C253673rC.A04(resources, Integer.valueOf(i5), CameraCapturer.OPEN_CAMERA_TIMEOUT, false, false)}, R.plurals.followed_by_x_and_n_others, i5);
            } else {
                string = resources.getString(2131962596, new Object[]{list.get(0)});
            }
            spannableStringBuilder.append(string);
            return;
        }
        0f9 AEf = 0wj.A01.AEf("exception", 817903143);
        AEf.ABQ("error", "usernames list is empty.");
        AEf.report();
    }

    public final List A07(1Xj r9) {
        List BxQ;
        C258203yd r0;
        C258223yf A002 = A00(r9);
        if (A002 == null || (BxQ = A002.BxQ()) == null) {
            return 0sn.A00;
        }
        ArrayList<User> arrayList = new ArrayList<>();
        int i = 0;
        for (Object next : BxQ) {
            int i2 = i + 1;
            if (i < 0) {
                0sr.A1T();
                throw AnonymousClass00P.createAndThrow();
            }
            List BxP = A002.BxP();
            if (BxP == null || (r0 = (C258203yd) 00k.A0O(BxP, i)) == null || (!0qQ.A0K(r0.CUi(), true))) {
                arrayList.add(next);
            }
            i = i2;
        }
        ArrayList arrayList2 = new ArrayList(0Yv.A1E(arrayList, 10));
        for (User A003 : arrayList) {
            arrayList2.add(AnonymousClass50Q.A00(A003));
        }
        return arrayList2;
    }

    public final List A08(1Xj r10) {
        int i;
        List BxQ;
        C258203yd r0;
        C258223yf A002 = A00(r10);
        List C8S = r10.A0C.C8S();
        if (C8S != null) {
            i = C8S.size();
        } else {
            i = 0;
        }
        if (!(A002 == null || (BxQ = A002.BxQ()) == null)) {
            ArrayList<User> arrayList = new ArrayList<>();
            int i2 = 0;
            for (Object next : BxQ) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    0sr.A1T();
                    throw AnonymousClass00P.createAndThrow();
                }
                List BxP = A002.BxP();
                if (BxP == null || (r0 = (C258203yd) 00k.A0O(BxP, i2)) == null || (!0qQ.A0K(r0.CUi(), true))) {
                    arrayList.add(next);
                }
                i2 = i3;
            }
            ArrayList arrayList2 = new ArrayList(0Yv.A1E(arrayList, 10));
            for (User username : arrayList) {
                arrayList2.add(username.getUsername());
            }
            List A0d = 00k.A0d(arrayList2, i);
            if (A0d != null) {
                return A0d;
            }
        }
        return 0sn.A00;
    }
}
