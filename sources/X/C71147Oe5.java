package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.NotePogVideoDict;
import com.instagram.common.session.UserSession;
import com.instagram.contentnotes.data.metadata.ContentNoteMetadata;
import com.instagram.direct.inbox.notes.models.NoteAudienceItem;
import com.instagram.direct.inbox.notes.models.NoteStyle;
import com.instagram.user.model.User;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Deprecated;

/* renamed from: X.Oe5  reason: case insensitive filesystem */
public final class C71147Oe5 {
    public static final C71147Oe5 A00 = new Object();

    public static final OIR A00(View view, Fragment fragment, NotePogVideoDict notePogVideoDict, C279864zZ r18, C68209N5y n5y, C74399PuF puF, Integer num, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        C74399PuF puF2 = puF;
        C279864zZ r5 = r18;
        String str3 = str;
        String str4 = str2;
        if (!(puF2 instanceof C72367P3g)) {
            NotePogVideoDict notePogVideoDict2 = notePogVideoDict;
            boolean z5 = z2;
            if (puF2 instanceof C72368P3h) {
                return C71047OaP.A03(notePogVideoDict2, r5, str3, str4, z5, z4);
            }
            boolean isAdded = fragment.isAdded();
            Integer Bjj = r5.A0D.Bjj();
            if (Bjj != null) {
                Bjj.intValue();
            }
            return C71047OaP.A01(view, notePogVideoDict2, r5, (ContentNoteMetadata) null, n5y, isAdded, z, z5, z3);
        } else if (str == null) {
            throw AnonymousClass7TE.A0z("Required value was null.");
        } else if (str2 != null) {
            return new OIR((View) null, (View) null, (NotePogVideoDict) null, r5, (ContentNoteMetadata) null, (C68209N5y) null, Integer.valueOf(C51967G9n.A04(num, 0)), str3, str4, (String) null, (String) null, 0sn.A00, false, false, false, false, false, false, true, false);
        } else {
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
    }

    public static final C74399PuF A01(FragmentActivity fragmentActivity, C279864zZ r4, AnonymousClass0iw r5, UserSession userSession, AnonymousClass4AD r7, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        C74399PuF p3f;
        FragmentActivity fragmentActivity2 = fragmentActivity;
        AnonymousClass0iw r2 = r5;
        UserSession userSession2 = userSession;
        if (z) {
            p3f = new C72367P3g(fragmentActivity2, r2, userSession2, 16, z2);
        } else {
            AnonymousClass4AD r52 = r7;
            if (z3) {
                p3f = new C72368P3h(fragmentActivity2, r2, userSession2, (O7W) null, r52);
            } else if (z4) {
                p3f = new C72365P3e(fragmentActivity2, r4, r2, userSession);
            } else if (z5) {
                p3f = new C72364P3d(fragmentActivity2, r4, userSession);
            } else {
                p3f = new C72366P3f(fragmentActivity2, r2, userSession2, (O7W) null, r52);
            }
        }
        return p3f;
    }

    public static final String A02(Context context, long j) {
        int i;
        Object[] objArr;
        Integer valueOf;
        String string;
        int A02 = C66583MXo.A02(j);
        int i2 = A02 / 60;
        if (i2 == 0 && A02 == 0) {
            string = context.getString(2131968635);
        } else {
            if (i2 == 0) {
                i = 2131968634;
                objArr = new Object[1];
                valueOf = Integer.valueOf(A02);
            } else {
                i = 2131968633;
                objArr = new Object[1];
                valueOf = Integer.valueOf(i2);
            }
            objArr[0] = valueOf;
            string = context.getString(i, objArr);
        }
        0qQ.A0A(string);
        return string;
    }

    public static final void A04(FragmentActivity fragmentActivity, AnonymousClass0iw r12, UserSession userSession, AnonymousClass4AD r14, String str, String str2, String str3) {
        String str4 = str2;
        String str5 = str3;
        DbW.A1O(str4, 4, str5);
        UserSession userSession2 = userSession;
        User A0j = DbV.A0j(userSession, str5);
        if (A0j != null) {
            String username = A0j.getUsername();
            C358248ab A0X = DbS.A0X(fragmentActivity);
            A0X.A05 = DbW.A0h(fragmentActivity, username, 2131956649);
            A0X.A08(2131968593);
            A0X.A0r(true);
            A0X.A0s(true);
            A0X.A0K(new C50006FIr(fragmentActivity, r12, userSession2, r14, A0j, str, str4), 2131956648);
            A0X.A0H(C71229Ofu.A00, 2131968595);
            DbT.A1V(A0X);
        }
    }

    public final C68209N5y A08(Context context, C279864zZ r15) {
        0qQ.A0B(r15, 0);
        String str = r15.A0J;
        long parseLong = Long.parseLong(r15.A0H);
        User user = r15.A0D;
        NoteAudienceItem noteAudienceItem = new NoteAudienceItem(AnonymousClass916.A00(Integer.valueOf(r15.A00)), (String) null, (List) null, 0);
        boolean z = r15.A0P;
        String A02 = A02(context, r15.A02);
        Object obj = NoteStyle.A01.get(Integer.valueOf(r15.A01));
        if (obj == null) {
            obj = NoteStyle.UNKNOWN;
        }
        return new C68209N5y(noteAudienceItem, user, str, A02, parseLong, z, AnonymousClass7TF.A1Y(r15.A0E, true), AnonymousClass7TF.A1W(obj, NoteStyle.UNSUPPORTED), false);
    }

    @Deprecated(message = "Not exhaustive! Use specific NoteConsumptionHandlers directly.")
    public final void A09(Fragment fragment, NotePogVideoDict notePogVideoDict, C279864zZ r27, AnonymousClass0iw r28, UserSession userSession, AnonymousClass4AD r30, Integer num, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        C279864zZ r5 = r27;
        UserSession userSession2 = userSession;
        AnonymousClass7TF.A1D(userSession2, 0, r5);
        Fragment fragment2 = fragment;
        if (fragment2.isAdded()) {
            boolean z8 = z2;
            AnonymousClass0iw r16 = r28;
            AnonymousClass4AD r18 = r30;
            boolean z9 = z;
            C279864zZ r15 = r5;
            UserSession userSession3 = userSession2;
            C74399PuF A01 = A01(fragment2.requireActivity(), r15, r16, userSession3, r18, z8, z9, DbV.A1Z(r5.A0D, userSession2.A06), z3, z7);
            Integer num2 = num;
            String str3 = str;
            String str4 = str2;
            A01.DUZ(A00((View) null, fragment2, notePogVideoDict, r5, (C68209N5y) null, A01, num2, str3, str4, z4, z5, false, z6));
        }
    }

    public static final void A03(FragmentActivity fragmentActivity, AnonymousClass0iw r14, UserSession userSession, long j, boolean z) {
        FragmentActivity fragmentActivity2 = fragmentActivity;
        long j2 = j;
        C69233Nhn nhn = new C69233Nhn(fragmentActivity2, userSession, j2, z);
        AnonymousClass0iw r3 = r14;
        C71093OcF A01 = ORV.A01(fragmentActivity2, r3, userSession, C14068TpH.NOTE, C16677UzD.NOTE, String.valueOf(j2));
        if (182.A06(0Tu.A05, userSession, 36321310062748939L)) {
            A01.A03 = nhn;
        }
        C71093OcF.A00((C331157Pu) null, A01);
        C3018660j.A01(userSession).A0B(C69506Nmo.A0W);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000a, code lost:
        if (X.AnonymousClass4AJ.A08(r4) == false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0014, code lost:
        if (X.AnonymousClass4AJ.A05(r4) == false) goto L_0x0016;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A05(com.instagram.common.session.UserSession r4, X.AnonymousClass4AB r5) {
        /*
            boolean r1 = r5.A0T
            r3 = 1
            if (r1 != 0) goto L_0x000c
            boolean r0 = X.AnonymousClass4AJ.A08(r4)
            r2 = 1
            if (r0 != 0) goto L_0x0016
        L_0x000c:
            r2 = 0
            if (r1 == 0) goto L_0x0016
            boolean r0 = X.AnonymousClass4AJ.A05(r4)
            r1 = 1
            if (r0 != 0) goto L_0x0017
        L_0x0016:
            r1 = 0
        L_0x0017:
            boolean r0 = r5.A0S
            if (r0 != 0) goto L_0x0028
            boolean r0 = r5.A0R
            if (r0 != 0) goto L_0x0028
            boolean r0 = r5.A0Q
            if (r0 != 0) goto L_0x0028
            if (r2 != 0) goto L_0x0027
            if (r1 == 0) goto L_0x0028
        L_0x0027:
            return r3
        L_0x0028:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71147Oe5.A05(com.instagram.common.session.UserSession, X.4AB):boolean");
    }

    public static final boolean A06(UserSession userSession, AnonymousClass4AB r4) {
        List list = r4.A0K;
        if (list == null) {
            return false;
        }
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (C51966G9m.A1W(userSession, DbT.A0k(it).getId())) {
                return true;
            }
        }
        return false;
    }

    public static final boolean A07(UserSession userSession, String str) {
        String str2;
        User A11;
        1Xj A0U = DbV.A0U(userSession, str);
        if (A0U == null || (A11 = C51966G9m.A11(A0U)) == null) {
            str2 = null;
        } else {
            str2 = A11.getId();
        }
        if (!C51966G9m.A1W(userSession, str2) || !182.A06(0Tu.A05, userSession, 36320652932883151L)) {
            return false;
        }
        return true;
    }
}
