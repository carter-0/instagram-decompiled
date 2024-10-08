package X;

import android.content.Context;
import android.content.res.Resources;
import android.text.Spanned;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;
import org.webrtc.CameraCapturer;

/* renamed from: X.4i2  reason: invalid class name */
public abstract class AnonymousClass4i2 {
    public static String A02(User user) {
        return 002.A0R("@", user.getUsername());
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x01e3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C253003q3 A00(android.content.Context r13, com.instagram.common.session.UserSession r14, X.C253023q5 r15, java.lang.String r16, java.util.List r17, int r18, int r19, boolean r20, boolean r21, boolean r22) {
        /*
            android.content.res.Resources r7 = r13.getResources()
            android.text.SpannableStringBuilder r6 = new android.text.SpannableStringBuilder
            r6.<init>()
            r9 = r17
            int r0 = r9.size()
            r3 = 0
            r5 = 1
            if (r0 == r5) goto L_0x0099
            r1 = 3
            r2 = 2
            if (r20 == 0) goto L_0x00a4
            boolean r0 = r9.isEmpty()
            if (r0 != 0) goto L_0x00a4
            int r2 = r18 + -1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            X.0qQ.A0B(r7, r5)
            r0 = 10000(0x2710, float:1.4013E-41)
            java.lang.String r11 = X.C253673rC.A04(r7, r1, r0, r3, r3)
            r10 = 2131820616(0x7f110048, float:1.9273952E38)
            java.lang.Object r0 = r9.get(r3)
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            java.lang.String r1 = A02(r0)
            java.lang.String r0 = ""
            java.lang.String[] r0 = new java.lang.String[]{r1, r11, r0}
            android.text.Spanned r0 = X.0bC.A02(r7, r0, r10, r2)
            java.lang.String r12 = r0.toString()
            r0 = 2131956272(0x7f131230, float:1.9549095E38)
            java.lang.String r2 = r7.getString(r0)
            boolean r13 = X.0mk.A02(r13)
            int r1 = r12.indexOf(r2)
            java.lang.String r8 = "@"
            r4 = 0
            r0 = -1
            if (r1 == r0) goto L_0x01a9
            if (r13 != 0) goto L_0x01a9
            java.lang.String r3 = r12.substring(r3, r1)
            if (r2 == 0) goto L_0x0097
            int r0 = r2.length()
        L_0x0068:
            int r1 = r1 + r0
            java.lang.String r0 = r12.substring(r1)
            java.lang.String r1 = r0.trim()
            java.lang.String r0 = "\\s+"
            java.lang.String[] r7 = r1.split(r0)
            android.text.SpannableStringBuilder r0 = r6.append(r3)
            android.text.SpannableStringBuilder r0 = r0.append(r2)
            java.lang.String r3 = " "
            r0.append(r3)
            int r2 = r7.length
        L_0x0085:
            if (r4 >= r2) goto L_0x01ca
            r1 = r7[r4]
            android.text.SpannableStringBuilder r0 = r6.append(r8)
            android.text.SpannableStringBuilder r0 = r0.append(r1)
            r0.append(r3)
            int r4 = r4 + 1
            goto L_0x0085
        L_0x0097:
            r0 = 0
            goto L_0x0068
        L_0x0099:
            java.lang.Object r0 = r9.get(r3)
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            java.lang.String r0 = A02(r0)
            goto L_0x00ed
        L_0x00a4:
            int r4 = r9.size()
            if (r4 == r5) goto L_0x0099
            if (r4 == r2) goto L_0x0149
            if (r4 == r1) goto L_0x0123
            r10 = 4
            if (r4 == r10) goto L_0x00f2
            r0 = 5
            if (r4 == r0) goto L_0x016a
            r4 = 2131956271(0x7f13122f, float:1.9549093E38)
            java.lang.Object r0 = r9.get(r3)
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            java.lang.String r8 = A02(r0)
            java.lang.Object r0 = r9.get(r5)
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            java.lang.String r3 = A02(r0)
            java.lang.Object r0 = r9.get(r2)
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            java.lang.String r2 = A02(r0)
            java.lang.Object r0 = r9.get(r1)
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            java.lang.String r1 = A02(r0)
            int r0 = r18 + -4
            java.lang.String r0 = java.lang.Integer.toString(r0)
            java.lang.String[] r0 = new java.lang.String[]{r8, r3, r2, r1, r0}
            android.text.Spanned r0 = X.0bC.A01(r7, r0, r4)
        L_0x00ed:
            r6.append(r0)
            goto L_0x01ca
        L_0x00f2:
            r8 = 2131956270(0x7f13122e, float:1.954909E38)
            java.lang.Object r0 = r9.get(r3)
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            java.lang.String r4 = A02(r0)
            java.lang.Object r0 = r9.get(r5)
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            java.lang.String r3 = A02(r0)
            java.lang.Object r0 = r9.get(r2)
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            java.lang.String r2 = A02(r0)
            java.lang.Object r0 = r9.get(r1)
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            java.lang.String r0 = A02(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r4, r3, r2, r0}
            goto L_0x01a3
        L_0x0123:
            r8 = 2131956275(0x7f131233, float:1.9549101E38)
            java.lang.Object r0 = r9.get(r3)
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            java.lang.String r3 = A02(r0)
            java.lang.Object r0 = r9.get(r5)
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            java.lang.String r1 = A02(r0)
            java.lang.Object r0 = r9.get(r2)
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            java.lang.String r0 = A02(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r3, r1, r0}
            goto L_0x01a3
        L_0x0149:
            r8 = 2131956273(0x7f131231, float:1.9549097E38)
            if (r21 == 0) goto L_0x0151
            r8 = 2131956274(0x7f131232, float:1.95491E38)
        L_0x0151:
            java.lang.Object r0 = r9.get(r3)
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            java.lang.String r1 = A02(r0)
            java.lang.Object r0 = r9.get(r5)
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            java.lang.String r0 = A02(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r1, r0}
            goto L_0x01a3
        L_0x016a:
            r8 = 2131956269(0x7f13122d, float:1.9549089E38)
            java.lang.Object r0 = r9.get(r3)
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            java.lang.String r4 = A02(r0)
            java.lang.Object r0 = r9.get(r5)
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            java.lang.String r3 = A02(r0)
            java.lang.Object r0 = r9.get(r2)
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            java.lang.String r2 = A02(r0)
            java.lang.Object r0 = r9.get(r1)
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            java.lang.String r1 = A02(r0)
            java.lang.Object r0 = r9.get(r10)
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            java.lang.String r0 = A02(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r4, r3, r2, r1, r0}
        L_0x01a3:
            java.lang.String r0 = r7.getString(r8, r0)
            goto L_0x00ed
        L_0x01a9:
            int r2 = java.lang.Integer.parseInt(r11)
            java.lang.Object r0 = r9.get(r3)
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            java.lang.String r1 = A02(r0)
            java.lang.String r0 = X.002.A0R(r8, r11)
            java.lang.String[] r0 = new java.lang.String[]{r1, r0, r8}
            android.text.Spanned r0 = X.0bC.A02(r7, r0, r10, r2)
            java.lang.String r0 = r0.toString()
            r6.append(r0)
        L_0x01ca:
            X.3q3 r0 = new X.3q3
            r0.<init>(r6, r14)
            r1 = r22
            r0.A0L = r1
            r1 = r19
            r0.A01 = r1
            r0.A0Q = r5
            r0.A0D = r15
            r0.A0X = r5
            r0.A0Y = r5
            r1 = r16
            if (r16 == 0) goto L_0x01e5
            r0.A0F = r1
        L_0x01e5:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4i2.A00(android.content.Context, com.instagram.common.session.UserSession, X.3q5, java.lang.String, java.util.List, int, int, boolean, boolean, boolean):X.3q3");
    }

    public static String A01(Context context, ArrayList arrayList, int i, boolean z, boolean z2) {
        int i2;
        Object[] objArr;
        Spanned A01;
        Resources resources = context.getResources();
        if (arrayList.size() != 1) {
            if (!z || arrayList.isEmpty()) {
                int size = arrayList.size();
                if (size != 1) {
                    if (size == 2) {
                        i2 = 2131956273;
                        if (z2) {
                            i2 = 2131956274;
                        }
                        objArr = new Object[]{((User) arrayList.get(0)).getUsername(), ((User) arrayList.get(1)).getUsername()};
                    } else if (size == 3) {
                        i2 = 2131956275;
                        objArr = new Object[]{((User) arrayList.get(0)).getUsername(), ((User) arrayList.get(1)).getUsername(), ((User) arrayList.get(2)).getUsername()};
                    } else if (size == 4) {
                        i2 = 2131956270;
                        objArr = new Object[]{((User) arrayList.get(0)).getUsername(), ((User) arrayList.get(1)).getUsername(), ((User) arrayList.get(2)).getUsername(), ((User) arrayList.get(3)).getUsername()};
                    } else if (size != 5) {
                        A01 = 0bC.A01(resources, new String[]{((User) arrayList.get(0)).getUsername(), ((User) arrayList.get(1)).getUsername(), ((User) arrayList.get(2)).getUsername(), ((User) arrayList.get(3)).getUsername(), Integer.toString(i - 4)}, 2131956271);
                    } else {
                        i2 = 2131956269;
                        objArr = new Object[]{((User) arrayList.get(0)).getUsername(), ((User) arrayList.get(1)).getUsername(), ((User) arrayList.get(2)).getUsername(), ((User) arrayList.get(3)).getUsername(), ((User) arrayList.get(4)).getUsername()};
                    }
                    return resources.getString(i2, objArr);
                }
            } else {
                int i3 = i - 1;
                String username = ((User) arrayList.get(0)).getUsername();
                Integer valueOf = Integer.valueOf(i3);
                0qQ.A0B(resources, 1);
                A01 = 0bC.A02(resources, new String[]{username, 002.A0R("@", C253673rC.A04(resources, valueOf, CameraCapturer.OPEN_CAMERA_TIMEOUT, false, false)), "@"}, R.plurals.collaborators_w_and_n_others, i3);
            }
            return A01.toString();
        }
        return ((User) arrayList.get(0)).getUsername();
    }

    public static boolean A03(UserSession userSession, ArrayList arrayList, int i) {
        if (arrayList.size() <= i || !182.A06(0Tu.A05, userSession, 36317350101783623L)) {
            return false;
        }
        return true;
    }
}
