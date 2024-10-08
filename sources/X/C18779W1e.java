package X;

import android.content.Context;
import android.telephony.PhoneNumberUtils;
import android.text.SpannableStringBuilder;
import com.instagram.api.schemas.InstagramProfileCallToActionDestinations;
import com.instagram.api.schemas.XIGIGBoostCallToAction;
import com.instagram.api.schemas.XIGIGBoostDestination;
import com.instagram.business.promote.model.PromoteData;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;

/* renamed from: X.W1e  reason: case insensitive filesystem */
public final class C18779W1e {
    public final String A03(Context context, XIGIGBoostCallToAction xIGIGBoostCallToAction, PromoteData promoteData, U5O u5o, String str) {
        0qQ.A0B(u5o, 4);
        if (xIGIGBoostCallToAction == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        if (str != null) {
            sb.append(A02(str));
        }
        sb.append("\n");
        C18677Vwa.A02(context, xIGIGBoostCallToAction, sb, 2131970447);
        if (u5o.isChecked() && W3E.A04(promoteData)) {
            int i = 2131968777;
            if (promoteData.A1x.isEmpty()) {
                i = 2131968751;
            }
            String A0p = C51967G9n.A0p(context, i);
            sb.append("\n");
            C13988Tno.A0s(context, sb, 2131970451);
            sb.append(": ");
            sb.append(A0p);
        }
        return sb.toString();
    }

    public final String A04(Context context, XIGIGBoostCallToAction xIGIGBoostCallToAction, PromoteData promoteData, U5O u5o, String str) {
        0qQ.A0B(u5o, 4);
        if (str == null || xIGIGBoostCallToAction == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder(A02(str));
        sb.append("\n");
        C18677Vwa.A02(context, xIGIGBoostCallToAction, sb, 2131970447);
        if (u5o.isChecked() && W3E.A04(promoteData)) {
            int i = 2131968777;
            if (promoteData.A1x.isEmpty()) {
                i = 2131968751;
            }
            String A0p = C51967G9n.A0p(context, i);
            sb.append("\n");
            C13988Tno.A0s(context, sb, 2131970451);
            sb.append(": ");
            sb.append(A0p);
        }
        return sb.toString();
    }

    public final String A06(Context context, PromoteData promoteData, String str, String str2, List list, Set set, boolean z) {
        int i;
        String A0g;
        InstagramProfileCallToActionDestinations instagramProfileCallToActionDestinations;
        0qQ.A0B(str, 2);
        StringBuilder sb = new StringBuilder(str);
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            InstagramProfileCallToActionDestinations instagramProfileCallToActionDestinations2 = (InstagramProfileCallToActionDestinations) next;
            if (W3E.A08(promoteData, false) || W3E.A00(instagramProfileCallToActionDestinations2, promoteData)) {
                arrayList.add(next);
            }
        }
        if (!arrayList.isEmpty()) {
            if (z && arrayList.size() == 1 && arrayList.get(0) == (instagramProfileCallToActionDestinations = InstagramProfileCallToActionDestinations.WEBSITE)) {
                boolean contains = set.contains(instagramProfileCallToActionDestinations);
                if (str2 != null) {
                    int i2 = 2131970443;
                    if (contains) {
                        i2 = 2131970442;
                    }
                    A0g = C66580MXl.A10(AnonymousClass7TE.A16(context, i2), str2);
                }
            } else {
                String A16 = AnonymousClass7TE.A16(context, 2131970415);
                if (set.isEmpty()) {
                    i = 2131968751;
                } else {
                    if (set.size() != 1 || !set.contains(InstagramProfileCallToActionDestinations.WEBSITE)) {
                        i = 2131968777;
                    }
                    A0g = 002.A0g(A16, " | ", str2);
                }
                str2 = context.getString(i);
                A0g = 002.A0g(A16, " | ", str2);
            }
            if (A0g != null) {
                sb.append("\n");
                sb.append(A0g);
            }
        }
        return DbT.A10(sb);
    }

    public static final SpannableStringBuilder A00(Context context, XIGIGBoostCallToAction xIGIGBoostCallToAction, UserSession userSession, User user) {
        new SpannableStringBuilder();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(0bC.A01(context.getResources(), new String[]{WGS.A00.A05(context, (XIGIGBoostCallToAction) null, userSession), user.getUsername()}, 2131954022));
        if (xIGIGBoostCallToAction != null) {
            String string = context.getString(C18677Vwa.A00(xIGIGBoostCallToAction));
            spannableStringBuilder.append("\n");
            spannableStringBuilder.append(DbU.A07(context.getResources(), string, 2131970409));
        }
        return spannableStringBuilder;
    }

    public static final XIGIGBoostCallToAction A01(PromoteData promoteData) {
        String name;
        XIGIGBoostCallToAction valueOf;
        String name2;
        XIGIGBoostCallToAction valueOf2;
        XIGIGBoostDestination xIGIGBoostDestination = promoteData.A0i;
        if (xIGIGBoostDestination != null) {
            switch (xIGIGBoostDestination.ordinal()) {
                case 1:
                    XIGIGBoostCallToAction xIGIGBoostCallToAction = promoteData.A0e;
                    if (xIGIGBoostCallToAction == null || (name2 = xIGIGBoostCallToAction.name()) == null || (valueOf2 = XIGIGBoostCallToAction.valueOf(name2)) == null) {
                        return XIGIGBoostCallToAction.INSTAGRAM_MESSAGE;
                    }
                    return valueOf2;
                case 2:
                case 10:
                    XIGIGBoostCallToAction xIGIGBoostCallToAction2 = promoteData.A0b;
                    if (xIGIGBoostCallToAction2 != null) {
                        return xIGIGBoostCallToAction2;
                    }
                    throw new IllegalStateException("When destination is website, CTA can not be null");
                case 4:
                    XIGIGBoostCallToAction xIGIGBoostCallToAction3 = promoteData.A0d;
                    if (xIGIGBoostCallToAction3 != null) {
                        return xIGIGBoostCallToAction3;
                    }
                    throw new IllegalStateException("When destination is lead gen, CTA can not be null");
                case 5:
                case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                    XIGIGBoostCallToAction xIGIGBoostCallToAction4 = promoteData.A0e;
                    if (xIGIGBoostCallToAction4 == null || (name = xIGIGBoostCallToAction4.name()) == null || (valueOf = XIGIGBoostCallToAction.valueOf(name)) == null) {
                        return XIGIGBoostCallToAction.WHATSAPP_MESSAGE;
                    }
                    return valueOf;
                case 7:
                    return XIGIGBoostCallToAction.NO_BUTTON;
                case 8:
                    return XIGIGBoostCallToAction.VIEW_INSTAGRAM_PROFILE;
                default:
                    throw new Throwable("Unknown destination type");
            }
        } else {
            throw new IllegalStateException("Unknown destination type");
        }
    }

    public static final String A02(String str) {
        Matcher matcher = WGS.A01.matcher(str);
        0qQ.A07(matcher);
        if (matcher.matches()) {
            str = matcher.group(3);
            if (str != null) {
                Matcher matcher2 = WGS.A02.matcher(str);
                if (matcher2.find() && (str = matcher2.group(1)) == null) {
                    throw new IllegalStateException("Required value was null.");
                }
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        return str;
    }

    public final String A05(Context context, XIGIGBoostCallToAction xIGIGBoostCallToAction, UserSession userSession) {
        String str;
        C375999Gd r1;
        String A00;
        Class<WGS> cls = WGS.class;
        C376009Ge A01 = AnonymousClass9F0.A01(AnonymousClass9F0.A00(cls), userSession);
        if (A01 == null || (r1 = A01.A00) == null || (A00 = r1.A00(AnonymousClass9F0.A00(cls), userSession)) == null || (str = PhoneNumberUtils.formatNumber(A00, AnonymousClass1Q2.A02().getCountry())) == null) {
            str = "";
        }
        StringBuilder sb = new StringBuilder(str);
        if (xIGIGBoostCallToAction != null) {
            sb.append("\n");
            C18677Vwa.A02(context, xIGIGBoostCallToAction, sb, 2131970409);
        }
        String obj = sb.toString();
        0qQ.A0A(obj);
        return obj;
    }
}
