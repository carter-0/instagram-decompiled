package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.api.schemas.SellerShoppableFeedType;
import com.instagram.common.session.UserSession;
import com.instagram.model.business.Address;
import com.instagram.model.business.ProfileAddressData;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.703  reason: invalid class name */
public abstract class AnonymousClass703 {
    public static C318666pK A01(Context context, UserSession userSession, User user, int i, boolean z) {
        switch (i) {
            case 0:
                if (z) {
                    return C318666pK.MESSAGE;
                }
                break;
            case 1:
                if (z && C324066yY.A05(user)) {
                    return C318666pK.SUPPORT;
                }
            case 2:
                if (user.A03.B4Q() != null && user.A1y()) {
                    return C318666pK.CALL_TO_ACTION;
                }
            case 3:
                if (z && A0A(userSession, user)) {
                    return C318666pK.SHOP;
                }
            case 4:
                if (!TextUtils.isEmpty(user.A03.BiH())) {
                    if (user.A0L() == AnonymousClass05K.A01) {
                        return C318666pK.CALL;
                    }
                    return C318666pK.TEXT;
                }
                break;
            case 5:
                if (user.A2M()) {
                    return C318666pK.NATIVE_CALL;
                }
                break;
            case 6:
                if (!TextUtils.isEmpty(user.A03.BiE())) {
                    return C318666pK.A08;
                }
                break;
            case 8:
                if (z && A09(userSession, user)) {
                    return C318666pK.DONATE;
                }
            case 9:
                if (A08(context, userSession, user)) {
                    return C318666pK.WHATSAPP;
                }
                break;
        }
        return null;
    }

    public static void A07(Context context, TextView textView, 0lg r10, String str, String str2, String str3) {
        Context context2 = context;
        int color = context.getColor(2Yu.A08(context));
        int color2 = context.getColor(2Yu.A0H(context, R.attr.textColorBoldLink));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str2);
        String A01 = SQU.A01(context2, str3);
        0qQ.A0B(A01, 3);
        AnonymousClass7AV.A05(spannableStringBuilder, new C69192Ngq(context2, r10, (OAJ) null, A01, color2), str);
        textView.setText(spannableStringBuilder);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setTextColor(color);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0011, code lost:
        if (r4.A1y() == false) goto L_0x0013;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A00(android.content.Context r2, com.instagram.common.session.UserSession r3, com.instagram.user.model.User r4, boolean r5, boolean r6) {
        /*
            if (r4 != 0) goto L_0x0004
            r1 = 0
        L_0x0003:
            return r1
        L_0x0004:
            X.4Cl r0 = r4.A03
            java.lang.String r0 = r0.B4Q()
            if (r0 == 0) goto L_0x0013
            boolean r0 = r4.A1y()
            r1 = 1
            if (r0 != 0) goto L_0x0014
        L_0x0013:
            r1 = 0
        L_0x0014:
            X.4Cl r0 = r4.A03
            java.lang.String r0 = r0.BiE()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0022
            int r1 = r1 + 1
        L_0x0022:
            X.4Cl r0 = r4.A03
            java.lang.String r0 = r0.BiH()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0030
            int r1 = r1 + 1
        L_0x0030:
            boolean r0 = A08(r2, r3, r4)
            if (r0 == 0) goto L_0x0038
            int r1 = r1 + 1
        L_0x0038:
            if (r5 == 0) goto L_0x0042
            boolean r0 = A0B(r4)
            if (r0 == 0) goto L_0x0042
            int r1 = r1 + 1
        L_0x0042:
            if (r6 == 0) goto L_0x005c
            boolean r0 = A0A(r3, r4)
            if (r0 == 0) goto L_0x004c
            int r1 = r1 + 1
        L_0x004c:
            boolean r0 = A09(r3, r4)
            if (r0 == 0) goto L_0x0054
            int r1 = r1 + 1
        L_0x0054:
            boolean r0 = X.C324066yY.A05(r4)
            if (r0 == 0) goto L_0x005c
            int r1 = r1 + 1
        L_0x005c:
            boolean r0 = r4.A2M()
            if (r0 == 0) goto L_0x0003
            int r1 = r1 + 1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass703.A00(android.content.Context, com.instagram.common.session.UserSession, com.instagram.user.model.User, boolean, boolean):int");
    }

    public static Address A02(Context context, User user) {
        String A05 = A05(context, user.A03.AZg(), user.A03.CHc(), user.A03.AnQ());
        if (TextUtils.isEmpty(A05) || TextUtils.isEmpty(user.A03.AnQ())) {
            return null;
        }
        return new Address(user.A03.AZg(), user.A03.AnQ(), user.A03.AnP(), user.A03.CHc(), A05);
    }

    public static Integer A03(Context context, User user, List list) {
        User user2 = user;
        C282195Cd AZe = user2.A03.AZe();
        if (AZe == null) {
            return null;
        }
        int i = 0;
        if (AZe.CRk() == null || !AZe.CRk().booleanValue()) {
            Integer BPF = AZe.BPF();
            Integer BWt = AZe.BWt();
            if (BPF == null || BWt == null) {
                return null;
            }
            int intValue = BWt.intValue();
            ArrayList arrayList = new ArrayList();
            Address A02 = A02(context, user2);
            if (A02 != null) {
                arrayList.add(new ProfileAddressData((Float) null, (Float) null, "primary", A02.A04, A02.A00, A02.A01, A02.A02, (String) null));
            }
            arrayList.addAll(A06(user2));
            HashMap hashMap = new HashMap();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ProfileAddressData profileAddressData = (ProfileAddressData) it.next();
                hashMap.put(profileAddressData.A02, profileAddressData);
            }
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                ProfileAddressData profileAddressData2 = (ProfileAddressData) it2.next();
                String str = profileAddressData2.A02;
                if (str != null) {
                    if (hashMap.containsKey(str)) {
                        ProfileAddressData profileAddressData3 = (ProfileAddressData) hashMap.get(str);
                        if (profileAddressData3 != null) {
                            String str2 = profileAddressData3.A04;
                            String str3 = null;
                            if (0qQ.A0K(str2, "0")) {
                                str2 = null;
                            }
                            String str4 = profileAddressData2.A04;
                            if (!0qQ.A0K(str4, "0")) {
                                str3 = str4;
                            }
                            String str5 = profileAddressData2.A03;
                            String str6 = "";
                            if (str5 == null) {
                                str5 = str6;
                            }
                            String str7 = profileAddressData3.A03;
                            if (str7 == null) {
                                str7 = str6;
                            }
                            if (str5.equals(str7)) {
                                if (str3 == null) {
                                    str3 = str6;
                                }
                                if (str2 == null) {
                                    str2 = str6;
                                }
                                if (str3.equals(str2)) {
                                    String str8 = profileAddressData2.A08;
                                    if (str8 == null) {
                                        str8 = str6;
                                    }
                                    String str9 = profileAddressData3.A08;
                                    if (str9 != null) {
                                        str6 = str9;
                                    }
                                    if (str8.equals(str6)) {
                                    }
                                }
                            }
                        }
                    }
                }
                intValue++;
            }
            int intValue2 = BPF.intValue();
            if (intValue < intValue2) {
                i = intValue2 - intValue;
            }
        }
        return Integer.valueOf(i);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x0010: MOVE  (r1v4 com.instagram.common.session.UserSession) = (r1v3 com.instagram.common.session.UserSession)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    public static java.lang.String A04(android.app.Activity r1) {
        /*
            boolean r0 = r1 instanceof X.G8D
            if (r0 == 0) goto L_0x001a
            X.G8D r1 = (X.G8D) r1
            com.instagram.base.activity.IgFragmentActivity r1 = (com.instagram.base.activity.IgFragmentActivity) r1
            X.0wW r1 = r1.getSession()
            boolean r0 = r1 instanceof com.instagram.common.session.UserSession
            if (r0 == 0) goto L_0x0017
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            if (r1 == 0) goto L_0x0017
            java.lang.String r0 = r1.A06
            return r0
        L_0x0017:
            java.lang.String r0 = "0"
            return r0
        L_0x001a:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass703.A04(android.app.Activity):java.lang.String");
    }

    public static ArrayList A06(User user) {
        ArrayList arrayList = new ArrayList();
        List<C46311DUo> AZa = user.A03.AZa();
        if (AZa != null) {
            for (C46311DUo dUo : AZa) {
                arrayList.add(new ProfileAddressData(dUo.BLe(), dUo.BOb(), dUo.AZZ(), dUo.AZg(), dUo.AnP(), dUo.AnQ(), dUo.CHd(), dUo.BHm()));
            }
        }
        return arrayList;
    }

    public static boolean A0B(User user) {
        if (!TextUtils.isEmpty(user.A03.AZg()) || !TextUtils.isEmpty(user.A03.AnQ()) || !TextUtils.isEmpty(user.A03.CHc())) {
            return true;
        }
        return false;
    }

    public static boolean A0C(User user) {
        Boolean Bn9;
        boolean z = (!TextUtils.isEmpty(user.A03.BiE())) ^ (!TextUtils.isEmpty(user.A03.BiH()));
        if (!2Ek.A03(user) || !user.A1g() || !z || user.A03.B6v() == null || user.A03.B6v().intValue() >= 100000 || (Bn9 = user.A03.Bn9()) == null || !Bn9.booleanValue()) {
            return false;
        }
        return true;
    }

    public static String A05(Context context, String str, String str2, String str3) {
        int i;
        Object[] objArr;
        if (TextUtils.isEmpty(str3)) {
            return "";
        }
        boolean isEmpty = TextUtils.isEmpty(str);
        boolean isEmpty2 = TextUtils.isEmpty(str2);
        if (!isEmpty) {
            context.getClass();
            if (isEmpty2) {
                i = 2131973910;
                objArr = new Object[]{str, str3};
            } else {
                i = 2131962816;
                objArr = new Object[]{str, str3, str2};
            }
        } else if (isEmpty2) {
            return str3;
        } else {
            context.getClass();
            i = 2131973911;
            objArr = new Object[]{str3, str2};
        }
        return context.getString(i, objArr);
    }

    public static boolean A08(Context context, UserSession userSession, User user) {
        if (2R8.A04(userSession, user)) {
            return user.A1d();
        }
        if (!user.A1d() || !Boolean.TRUE.equals(user.A03.Buh())) {
            return false;
        }
        if (0oI.A0G(context) || 0oI.A0I(context.getPackageManager(), "com.whatsapp.w4b")) {
            return true;
        }
        return false;
    }

    public static boolean A09(UserSession userSession, User user) {
        Boolean BAT;
        if (!user.A21() || (BAT = user.A03.BAT()) == null || !BAT.booleanValue()) {
            return false;
        }
        if (C64172LRz.A03(user) || C64172LRz.A02(userSession)) {
            return true;
        }
        return false;
    }

    public static boolean A0A(UserSession userSession, User user) {
        if ((user.A0B() != SellerShoppableFeedType.A07 || !182.A06(0Tu.A05, userSession, 36317526195442974L)) && (C324476zN.A0A(userSession, user) == AnonymousClass05K.A0N || C324476zN.A0S(userSession, user))) {
            return true;
        }
        return false;
    }
}
