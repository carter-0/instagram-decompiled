package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import com.instagram.common.session.UserSession;
import com.instagram.model.mediatype.ProductType;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class I6D {
    public final UserSession A00;

    public final JM7 A04(1Xj r10, JPP jpp, C55501Hij hij) {
        JM7 jm7;
        int i;
        int i2;
        Object[] objArr;
        SpannableStringBuilder spannableStringBuilder;
        int i3;
        SpannableStringBuilder spannableStringBuilder2;
        Context context;
        int i4;
        Object[] objArr2;
        int A02 = DbW.A02(0, r10, jpp);
        UserSession userSession = this.A00;
        if (AnonymousClass3YV.A07(userSession, r10)) {
            User A2A = r10.A2A(userSession);
            if (A2A != null) {
                int size = r10.A3a().size();
                if (size == 1 || !182.A06(0Tu.A05, userSession, 36323908517047899L)) {
                    String A022 = A02(this, A2A, false);
                    int i5 = 2131969626;
                    if (r10.A1v() == ProductType.CLIPS) {
                        i5 = 2131971535;
                    }
                    objArr2 = new Object[]{A022};
                } else if (size == A02) {
                    String A023 = A02(this, A2A, false);
                    List A3a = r10.A3a();
                    ArrayList A1C = AnonymousClass7TE.A1C();
                    for (Object next : A3a) {
                        DbY.A1T(AnonymousClass3ZA.A00((User) next), userSession.A06, next, A1C);
                    }
                    String A024 = A02(this, (User) 00k.A0J(A1C), false);
                    i4 = 2131969627;
                    if (r10.A1v() == ProductType.CLIPS) {
                        i4 = 2131971536;
                    }
                    objArr2 = new Object[]{A023, A024};
                } else {
                    String A025 = A02(this, A2A, false);
                    int A026 = DbT.A02(r10.A3a(), 1);
                    int i6 = 2131969628;
                    if (r10.A1v() == ProductType.CLIPS) {
                        i6 = 2131971537;
                    }
                    Object[] A1b = AnonymousClass7TF.A1b(A026);
                    context = hij.A00;
                    String string = context.getString(2131956255, Arrays.copyOf(A1b, 1));
                    0qQ.A07(string);
                    spannableStringBuilder2 = A00(context, r10, this, Arrays.copyOf(new Object[]{A025, string}, A02), i6);
                    AnonymousClass7AV.A03(spannableStringBuilder2, new Q8I(1, r10, jpp), string);
                    jm7 = new C53543GqE(spannableStringBuilder2, new C61081JwJ(AnonymousClass7TE.A16(context, 2131969582), (C62320sa) new C58186Inq(12, jpp, r10)));
                    return jm7;
                }
                context = hij.A00;
                spannableStringBuilder2 = A00(context, r10, this, Arrays.copyOf(objArr2, objArr2.length), i4);
                jm7 = new C53543GqE(spannableStringBuilder2, new C61081JwJ(AnonymousClass7TE.A16(context, 2131969582), (C62320sa) new C58186Inq(12, jpp, r10)));
                return jm7;
            }
        } else if (C51966G9m.A1W(userSession, C51973G9u.A0j(userSession, r10)) && AnonymousClass7TE.A1b(r10.A3a())) {
            int size2 = r10.A3a().size();
            if (size2 == 1 || !182.A06(0Tu.A05, userSession, 36323908516916825L)) {
                String A027 = A02(this, (User) 00k.A0J(r10.A3a()), true);
                if (!A03(r10)) {
                    i = 2131969654;
                } else {
                    i = 2131972684;
                    if (r10.A1v() == ProductType.CLIPS) {
                        i = 2131972683;
                    }
                }
                objArr = new Object[]{A027};
            } else {
                boolean A03 = A03(r10);
                if (size2 == A02) {
                    if (!A03) {
                        i2 = 2131969655;
                    } else {
                        i2 = 2131972686;
                        if (r10.A1v() == ProductType.CLIPS) {
                            i2 = 2131972685;
                        }
                    }
                    objArr = new Object[]{A02(this, (User) 00k.A0J(r10.A3a()), true), A02(this, (User) 00k.A0O(r10.A3a(), 1), true)};
                } else {
                    if (!A03) {
                        i3 = 2131969656;
                    } else {
                        i3 = 2131972688;
                        if (r10.A1v() == ProductType.CLIPS) {
                            i3 = 2131972687;
                        }
                    }
                    String A028 = A02(this, (User) 00k.A0J(r10.A3a()), true);
                    Object[] A1b2 = AnonymousClass7TF.A1b(DbT.A02(r10.A3a(), 1));
                    Context context2 = hij.A00;
                    String string2 = context2.getString(2131956255, Arrays.copyOf(A1b2, 1));
                    0qQ.A07(string2);
                    spannableStringBuilder = A00(context2, r10, this, Arrays.copyOf(new Object[]{A028, string2}, A02), i3);
                    AnonymousClass7AV.A03(spannableStringBuilder, new Q8I(A02, r10, jpp), string2);
                    jm7 = new C53542GqD(spannableStringBuilder);
                    return jm7;
                }
            }
            spannableStringBuilder = A00(hij.A00, r10, this, Arrays.copyOf(objArr, objArr.length), i2);
            jm7 = new C53542GqD(spannableStringBuilder);
            return jm7;
        }
        jm7 = C57225ITm.A00;
        return jm7;
    }

    public static final SpannableStringBuilder A01(1Xj r4, I6D i6d, String str, int i) {
        UserSession userSession = i6d.A00;
        C253003q3 r2 = new C253003q3(DbS.A0C(str), userSession);
        r2.A0L = true;
        r2.A01 = i;
        r2.A0Q = true;
        r2.A03(new C253013q4(userSession, r4, false));
        SpannableStringBuilder A002 = r2.A00();
        0qQ.A07(A002);
        return A002;
    }

    public static final String A02(I6D i6d, User user, boolean z) {
        0Tu r2;
        long j;
        if (user == null) {
            return "";
        }
        UserSession userSession = i6d.A00;
        0Tu r22 = 0Tu.A05;
        if (!z) {
            if (!182.A06(r22, userSession, 36323908517113436L)) {
                r2 = 0Tu.A06;
                j = 36323908517244510L;
            }
            return 002.A0D(user.getUsername(), '@');
        }
        if (!182.A06(r22, userSession, 36323908517178973L)) {
            r2 = 0Tu.A06;
            j = 36323908517310047L;
        }
        return 002.A0D(user.getUsername(), '@');
        if (!182.A06(r2, userSession, j)) {
            return user.getUsername();
        }
        return 002.A0D(user.getUsername(), '@');
    }

    public static final boolean A03(1Xj r1) {
        DSX Aqj;
        if (r1.A0C.Aqj() == null || (Aqj = r1.A0C.Aqj()) == null || Aqj.Bpd() == null) {
            return false;
        }
        return true;
    }

    public I6D(UserSession userSession) {
        this.A00 = userSession;
    }

    public static SpannableStringBuilder A00(Context context, 1Xj r3, I6D i6d, Object[] objArr, int i) {
        String string = context.getString(i, objArr);
        0qQ.A07(string);
        return A01(r3, i6d, string, context.getColor(2Yu.A0A(context)));
    }
}
