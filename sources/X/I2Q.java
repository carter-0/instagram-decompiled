package X;

import android.app.Activity;
import android.graphics.RectF;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.google.common.collect.ImmutableList;
import com.instagram.android.R;
import com.instagram.clips.intf.ClipsViewerConfig;
import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.reels.store.ReelStore;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public abstract class I2Q {
    public static final Object A00(C307896Rx r17, AnonymousClass6Tm r18) {
        Object obj;
        AnonymousClass6Tm r7 = r18;
        C276544tV A0P = DbY.A0P(r7, 0);
        Object A03 = r7.A03(1);
        0qQ.A0C(A03, C66579MXk.A00(0));
        C307786Rm r2 = (C307786Rm) A03;
        Object A032 = r7.A03(2);
        0qQ.A0C(A032, C66579MXk.A00(5));
        List list = (List) A032;
        int A04 = DbW.A04(r7.A03(3), "null cannot be cast to non-null type kotlin.Int");
        String str = (String) DbW.A0g(r7, 4);
        List list2 = r7.A00;
        C307896Rx r10 = r17;
        if (list2.size() >= 6 && (obj = list2.get(5)) != null) {
            AnonymousClass6SO.A00 = new C55602HkM(r10, ((C280064zw) obj).A00);
            C308206Td.A0K(r10, new IO6(0));
        }
        UserSession A0R = DbW.A0R(r10);
        View A05 = A0P.A05(r10.A03);
        int[] iArr = new int[2];
        if (A05 != null) {
            A05.getLocationOnScreen(iArr);
        }
        float f = (float) iArr[0];
        float f2 = (float) iArr[1];
        RectF rectF = new RectF(f, f2, f, f2);
        if (A04 == Integer.parseInt("49")) {
            ArrayList A1C = AnonymousClass7TE.A1C();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Object A01 = A01(A0R, AnonymousClass05K.A00, AnonymousClass7TE.A18(it));
                if (A01 != null) {
                    A1C.add(A01);
                }
            }
            Reel reel = (Reel) A01(A0R, AnonymousClass05K.A00, str);
            AnonymousClass32A r12 = new AnonymousClass32A(C308206Td.A07(r2), A0R, new AnonymousClass328(C308206Td.A00(r2)));
            C16165Upq upq = new C16165Upq((Activity) C308206Td.A03(r2), rectF, (C230222pE) new FkY(0));
            C19518Wb4 wb4 = new C19518Wb4(rectF, 0);
            0qQ.A0B(r2, 0);
            r12.A0C = (String) r2.A00(R.id.bloks_reel_tray_session_id);
            r12.A05 = upq;
            if (reel != null) {
                r12.A06(reel, AnonymousClass3BQ.ADS_HISTORY, wb4, A1C, A1C, 0);
            } else {
                throw AnonymousClass7TE.A0y();
            }
        } else if (A04 == Integer.parseInt("65")) {
            C308206Td.A07(r2);
            ArrayList A1C2 = AnonymousClass7TE.A1C();
            ArrayList A1C3 = AnonymousClass7TE.A1C();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                AnonymousClass3OA r0 = (AnonymousClass3OA) A01(A0R, AnonymousClass05K.A01, AnonymousClass7TE.A18(it2));
                if (r0 != null) {
                    A1C2.add(r0);
                    A1C3.add(C295375o3.A03(r0));
                }
            }
            AnonymousClass3OA r02 = (AnonymousClass3OA) A01(A0R, AnonymousClass05K.A01, str);
            if (r02 != null) {
                A02(C308206Td.A03(r2), A0R, r02, 1L2.A00(), A1C3, true);
                return null;
            }
            throw AnonymousClass7TE.A0y();
        } else if (A04 == Integer.parseInt("94")) {
            FragmentActivity A033 = C308206Td.A03(r2);
            ArrayList A1C4 = AnonymousClass7TE.A1C();
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                AnonymousClass3OA r03 = (AnonymousClass3OA) A01(A0R, AnonymousClass05K.A0C, AnonymousClass7TE.A18(it3));
                if (r03 != null) {
                    A1C4.add(C295375o3.A03(r03));
                }
            }
            AnonymousClass3OA r15 = (AnonymousClass3OA) A01(A0R, AnonymousClass05K.A0C, str);
            AnonymousClass1L1 A00 = 1L2.A00();
            0qQ.A0A(r15);
            A02(A033, A0R, r15, A00, A1C4, false);
            return null;
        }
        return null;
    }

    public static final Object A01(UserSession userSession, Integer num, String str) {
        1Xj A0T;
        try {
            16F A03 = AnonymousClass15o.A00.A03(str);
            0c5 r0 = 0c9.A04;
            0qQ.A0A(A03);
            0c9 A00 = 0c5.A00(A03, userSession);
            if (A00.A11() == null) {
                A00.A1J();
            }
            int intValue = num.intValue();
            if (intValue == 0) {
                AnonymousClass3HX parseFromJson = AnonymousClass3HR.parseFromJson(A00);
                if (parseFromJson != null) {
                    return ReelStore.A03(userSession).A0I(parseFromJson, false);
                }
                return null;
            } else if (intValue != 1) {
                C41938B7p parseFromJson2 = C41939B7q.parseFromJson(A00);
                0qQ.A07(parseFromJson2);
                return parseFromJson2.A01();
            } else {
                C45430CwA parseFromJson3 = C44823ClZ.parseFromJson(A00);
                0qQ.A07(parseFromJson3);
                if (parseFromJson3.A0A.isEmpty() || (A0T = DbZ.A0T(parseFromJson3.A0A, 0)) == null) {
                    throw AnonymousClass7TE.A0y();
                }
                C250933mI r1 = new C250933mI();
                r1.A0L = A0T;
                r1.A0g = parseFromJson3.A05;
                r1.A0q = Collections.unmodifiableList(parseFromJson3.A0B);
                r1.A0l = parseFromJson3.A07;
                r1.A0b = parseFromJson3.A03;
                r1.A00 = ImmutableList.copyOf((Collection) parseFromJson3.A09);
                r1.A0Z = parseFromJson3.A02;
                r1.A0m = Collections.unmodifiableList(parseFromJson3.A08);
                r1.A0h = parseFromJson3.A06;
                r1.A00();
                return new AnonymousClass3OA(r1);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static final void A02(FragmentActivity fragmentActivity, UserSession userSession, AnonymousClass3OA r6, AnonymousClass1L1 r7, List list, boolean z) {
        String str;
        1Xj r0;
        String str2 = r7.A00;
        C270634h3 A0i = C51965G9l.A0i(ClipsViewerSource.ADS_HISTORY, userSession);
        if (r6 == null || (r0 = r6.A0K) == null) {
            str = null;
        } else {
            str = r0.getId();
        }
        A0i.A1C = str;
        A0i.A1F = str2;
        A0i.A1S = z;
        A0i.A1N = false;
        A0i.A1c = false;
        ClipsViewerConfig A00 = A0i.A00();
        C229352nF A0Y = C51967G9n.A0Y(userSession);
        A0Y.A02(str2);
        A0Y.A08(str2, list, false, false);
        C243473Yx.A06(fragmentActivity, A00, userSession, 1005);
    }
}
