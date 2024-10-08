package X;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.StyleSpan;
import com.instagram.android.R;
import com.instagram.api.schemas.SocialContextType;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.webrtc.CameraCapturer;

/* renamed from: X.4h2  reason: invalid class name and case insensitive filesystem */
public final class C270624h2 {
    public static final C270624h2 A00 = new Object();

    public static final SpannableStringBuilder A00(Context context, C258223yf r12, UserSession userSession, 1Xj r14) {
        String A0D;
        0qQ.A0B(userSession, 1);
        0qQ.A0B(r12, 3);
        List<User> BxQ = r12.BxQ();
        int socialContextUsersCount = r12.getSocialContextUsersCount();
        SocialContextType BxW = r12.BxW();
        0qQ.A0B(BxQ, 3);
        0qQ.A0B(BxW, 5);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayList arrayList = new ArrayList();
        for (User username : BxQ) {
            String username2 = username.getUsername();
            if (BxW != SocialContextType.BLEND_MEDIA_SUGGESTED_BY || !0qQ.A0K(0eE.A00(userSession).A00().getUsername(), username2)) {
                A0D = 002.A0D(username2, '@');
            } else {
                A0D = context.getResources().getString(2131953867);
                0qQ.A0A(A0D);
            }
            arrayList.add(A0D);
        }
        if (socialContextUsersCount > BxQ.size() || socialContextUsersCount > 2) {
            C243483Yy r4 = C243483Yy.A00;
            Resources resources = context.getResources();
            0qQ.A07(resources);
            r4.A09(resources, spannableStringBuilder, BxW, arrayList, socialContextUsersCount, 1);
        } else {
            Resources resources2 = context.getResources();
            0qQ.A07(resources2);
            C243483Yy.A03(resources2, spannableStringBuilder, BxW, arrayList, 2);
        }
        C253003q3 r1 = new C253003q3(spannableStringBuilder, userSession);
        r1.A0F = "sans-serif-medium";
        r1.A01 = -1;
        r1.A0Q = true;
        if (BxW == SocialContextType.BLEND_MEDIA_SUGGESTED_BY) {
            r1.A0R = true;
        } else {
            r1.A03(new C253013q4(userSession, r14, false));
        }
        SpannableStringBuilder A002 = r1.A00();
        0qQ.A07(A002);
        return A002;
    }

    public static final String A03(Context context, 1Xj r6) {
        0qQ.A0B(r6, 1);
        List BxO = r6.A0C.BxO();
        if (BxO == null || BxO.isEmpty()) {
            return "";
        }
        Resources resources = context.getResources();
        StringBuilder sb = new StringBuilder();
        if (((C258223yf) BxO.get(0)).BxW().ordinal() == 7) {
            sb.append(resources.getString(2131962593));
        }
        String obj = sb.toString();
        0qQ.A07(obj);
        return obj;
    }

    public final SpannableStringBuilder A04(Context context, UserSession userSession, Integer num, List list, C62320sa r16, 0sP r17, boolean z, boolean z2, boolean z3) {
        CharSequence string;
        CharSequence charSequence;
        int i;
        int i2;
        String[] strArr;
        int i3;
        int i4;
        int i5;
        0qQ.A0B(userSession, 1);
        0qQ.A0B(list, 4);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(002.A0D((String) it.next(), '@'));
        }
        if (!z || num == null) {
            Resources resources = context.getResources();
            0qQ.A07(resources);
            int size = arrayList.size();
            if (size != 0) {
                if (size != 1) {
                    int i6 = 2131976909;
                    if (size != 2) {
                        i6 = 2131976918;
                    }
                    string = 0bC.A01(resources, new String[]{(String) arrayList.get(0), (String) arrayList.get(1)}, i6);
                } else {
                    string = resources.getString(2131976914, new Object[]{arrayList.get(0)});
                }
                charSequence = string;
            }
            C253003q3 r1 = new C253003q3(spannableStringBuilder, userSession);
            r1.A0F = "sans-serif-medium";
            r1.A01 = -1;
            r1.A0Q = true;
            r1.A03(new C57256IUr(r17));
            SpannableStringBuilder A002 = r1.A00();
            0qQ.A07(A002);
            return A002;
        }
        Resources resources2 = context.getResources();
        0qQ.A07(resources2);
        int intValue = num.intValue();
        int size2 = arrayList.size();
        if (size2 != 0) {
            if (size2 != 1) {
                if (intValue == 2) {
                    if (!z2) {
                        i5 = 2131976909;
                    } else {
                        i5 = 2131976910;
                        if (z3) {
                            i5 = 2131976911;
                        }
                    }
                    charSequence = 0bC.A01(resources2, new String[]{(String) arrayList.get(0), (String) arrayList.get(1)}, i5);
                } else {
                    if (!z2) {
                        i = R.plurals.x_y_and_n_others_voted;
                    } else {
                        i = R.plurals.x_y_and_n_others_voted_on_surfaces;
                        if (z3) {
                            i = R.plurals.x_y_and_n_others_voted_on_surfaces_voted_viewer;
                        }
                    }
                    i2 = intValue - 2;
                    strArr = new String[]{(String) arrayList.get(0), (String) arrayList.get(1), C253673rC.A04(resources2, Integer.valueOf(i2), CameraCapturer.OPEN_CAMERA_TIMEOUT, false, false)};
                }
            } else if (intValue == 1) {
                if (!z2) {
                    i4 = 2131976914;
                } else {
                    i4 = 2131976915;
                    if (z3) {
                        i4 = 2131976916;
                    }
                }
                charSequence = 0bC.A01(resources2, new String[]{(String) arrayList.get(0)}, i4);
                0qQ.A07(charSequence);
            } else {
                if (!z2) {
                    i3 = R.plurals.x_and_n_others_voted;
                } else {
                    i3 = R.plurals.x_and_n_others_voted_on_surfaces;
                    if (z3) {
                        i3 = R.plurals.x_and_n_others_voted_on_surfaces_voted_viewer;
                    }
                }
                i2 = intValue - 1;
                strArr = new String[]{(String) arrayList.get(0), C253673rC.A04(resources2, Integer.valueOf(i2), CameraCapturer.OPEN_CAMERA_TIMEOUT, false, false)};
            }
            Spanned A02 = 0bC.A02(resources2, strArr, i, i2);
            0qQ.A07(A02);
            spannableStringBuilder.append(A02);
            Object[] spans = spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), StyleSpan.class);
            0qQ.A07(spans);
            Object A05 = 03t.A05(spans);
            spannableStringBuilder.setSpan(new C389109ou(r16), A02.getSpanStart(A05), A02.getSpanEnd(A05), 33);
        }
        C253003q3 r12 = new C253003q3(spannableStringBuilder, userSession);
        r12.A0F = "sans-serif-medium";
        r12.A01 = -1;
        r12.A0Q = true;
        r12.A03(new C57256IUr(r17));
        SpannableStringBuilder A0022 = r12.A00();
        0qQ.A07(A0022);
        return A0022;
        spannableStringBuilder.append(charSequence);
        C253003q3 r122 = new C253003q3(spannableStringBuilder, userSession);
        r122.A0F = "sans-serif-medium";
        r122.A01 = -1;
        r122.A0Q = true;
        r122.A03(new C57256IUr(r17));
        SpannableStringBuilder A00222 = r122.A00();
        0qQ.A07(A00222);
        return A00222;
    }

    public static final SpannableStringBuilder A02(Context context, UserSession userSession, 1Xj r9, List list, int i, boolean z) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(002.A0D((String) it.next(), '@'));
        }
        int A0v = r9.A0v();
        if (A0v <= arrayList.size() || !z) {
            Resources resources = context.getResources();
            0qQ.A07(resources);
            C243483Yy.A03(resources, spannableStringBuilder, SocialContextType.LIKED_BY, arrayList, i);
        } else {
            C243483Yy r1 = C243483Yy.A00;
            Resources resources2 = context.getResources();
            0qQ.A07(resources2);
            r1.A09(resources2, spannableStringBuilder, SocialContextType.LIKED_BY, arrayList, A0v, 2);
        }
        C253003q3 r2 = new C253003q3(spannableStringBuilder, userSession);
        r2.A0F = "sans-serif-medium";
        r2.A01 = -1;
        r2.A0Q = true;
        r2.A02(new C253033q6(userSession, r9, false));
        r2.A03(new C253013q4(userSession, r9, false));
        SpannableStringBuilder A002 = r2.A00();
        0qQ.A07(A002);
        return A002;
    }

    public static final SpannableStringBuilder A01(Context context, UserSession userSession, 1Xj r11, List list) {
        int i;
        int i2;
        String[] strArr;
        CharSequence charSequence;
        Resources resources = context.getResources();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(002.A0D((String) it.next(), '@'));
        }
        int A0v = r11.A0v();
        if (A0v - arrayList.size() > 1) {
            0qQ.A0A(resources);
            0qQ.A0B(resources, 0);
            SocialContextType socialContextType = SocialContextType.LIKED_BY;
            int size = arrayList.size();
            if (size <= 2) {
                if (size == 1) {
                    int ordinal = socialContextType.ordinal();
                    if (A0v == 1) {
                        int i3 = 2131964948;
                        if (ordinal == 7) {
                            i3 = 2131962596;
                        }
                        charSequence = resources.getString(i3, new Object[]{arrayList.get(0)});
                        spannableStringBuilder.append(charSequence);
                    } else {
                        int i4 = 2131964949;
                        if (ordinal == 7) {
                            i4 = 2131962597;
                        }
                        strArr = new String[]{(String) arrayList.get(0)};
                    }
                } else if (size != 2) {
                    i2 = 2131964953;
                    if (socialContextType.ordinal() == 7) {
                        i2 = 2131962601;
                    }
                    strArr = new String[]{(String) arrayList.get(0), (String) arrayList.get(1), (String) arrayList.get(2)};
                }
                charSequence = 0bC.A01(resources, strArr, i2);
                spannableStringBuilder.append(charSequence);
            }
            int ordinal2 = socialContextType.ordinal();
            if (A0v == 2) {
                i = 2131964950;
                if (ordinal2 == 7) {
                    i = 2131962598;
                }
            } else {
                i = 2131964951;
                if (ordinal2 == 7) {
                    i = 2131962599;
                }
            }
            strArr = new String[]{(String) arrayList.get(0), (String) arrayList.get(1)};
            charSequence = 0bC.A01(resources, strArr, i2);
            spannableStringBuilder.append(charSequence);
        } else {
            0qQ.A0A(resources);
            0qQ.A0B(resources, 0);
            C243483Yy.A03(resources, spannableStringBuilder, SocialContextType.LIKED_BY, arrayList, 3);
        }
        C253003q3 r2 = new C253003q3(spannableStringBuilder, userSession);
        r2.A0F = "sans-serif-medium";
        r2.A01 = -1;
        r2.A0Q = true;
        r2.A02(new C253033q6(userSession, r11, false));
        r2.A03(new C253013q4(userSession, r11, false));
        SpannableStringBuilder A002 = r2.A00();
        0qQ.A07(A002);
        return A002;
    }
}
