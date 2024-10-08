package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.Product;
import java.util.List;

/* renamed from: X.EeL  reason: case insensitive filesystem */
public abstract class C48426EeL {
    /* JADX WARNING: type inference failed for: r15v0, types: [X.4DU, java.lang.Object] */
    public static final Object A00(AnonymousClass6Tm r17) {
        C48106EVy eVy;
        2dZ A00;
        AnonymousClass5Gv A002;
        AnonymousClass6Tm r2 = r17;
        C307786Rm r1 = (C307786Rm) Dba.A0V(r2, 0);
        Product A01 = C18132Vm8.A01(DbY.A0P(r2, 1));
        UserSession A0A = C308206Td.A0A(r1);
        DbS.A1Z(A0A);
        UserSession userSession = A0A;
        Fragment fragment = ((C229382nI) r1.A02).A02;
        ? obj = new Object();
        VZO A02 = C18680Vwd.A02(r1, userSession, C273654mx.A00(566));
        List list = r2.A00;
        if (list.size() > 3) {
            Object obj2 = list.get(3);
            Object obj3 = null;
            if (obj2 instanceof String) {
                obj3 = obj2;
            }
            eVy = (C48106EVy) C48106EVy.A01.get(obj3);
            if (eVy == null) {
                eVy = C48106EVy.UNKNOWN;
            }
        } else {
            eVy = C48106EVy.CART;
        }
        0xa A03 = 1Al.A01(userSession).A03(1An.A2X);
        if (fragment == null || A02 == null || (A00 = C16859V8o.A00(C308206Td.A03(r1), r1)) == null) {
            return null;
        }
        ViewGroup viewGroup = A00.A0P;
        String A003 = C273654mx.A00(2);
        0qQ.A0C(viewGroup, A003);
        View childAt = viewGroup.getChildAt(2);
        0qQ.A0C(childAt, A003);
        View childAt2 = ((ViewGroup) childAt).getChildAt(0);
        0qQ.A0C(childAt2, C273654mx.A00(1));
        ViewGroup viewGroup2 = (ViewGroup) childAt2;
        int ordinal = eVy.ordinal();
        int i = 3;
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    throw AnonymousClass7TE.A1K();
                }
            }
            View childAt3 = viewGroup2.getChildAt(i);
            0qQ.A0C(childAt3, C273654mx.A00(86));
            ImageView imageView = (ImageView) childAt3;
            0qQ.A07(r1.A00.getString(2131964515));
            String str = (String) r2.A03(2);
            Rect bounds = imageView.getDrawable().getBounds();
            0qQ.A07(bounds);
            Context context = imageView.getContext();
            0qQ.A0C(context, "null cannot be cast to non-null type android.app.Activity");
            0qQ.A07(context);
            AnonymousClass5Gt r12 = new AnonymousClass5Gt((Activity) context, new C47902ELw(context, str));
            r12.A04(imageView, 0, bounds.height() / 2, true);
            r12.A01();
            r12.A0F = true;
            r12.A07(C283255Gu.A07);
            r12.A04 = new C47892ELm(imageView, eVy, A02, userSession, obj, A01, str);
            r12.A0A = true;
            A002 = r12.A00();
            if (ordinal == 0 && ordinal == 1) {
                if (!A03.getBoolean("PRODUCT_NOTIFICATIONS_TOOLTIP", false)) {
                    A002.A07((UserSession) null);
                }
                DbX.A1V(A03, "PRODUCT_NOTIFICATIONS_TOOLTIP", true);
                return null;
            }
            A002.A07((UserSession) null);
            return null;
        }
        i = 2;
        View childAt32 = viewGroup2.getChildAt(i);
        0qQ.A0C(childAt32, C273654mx.A00(86));
        ImageView imageView2 = (ImageView) childAt32;
        0qQ.A07(r1.A00.getString(2131964515));
        String str2 = (String) r2.A03(2);
        Rect bounds2 = imageView2.getDrawable().getBounds();
        0qQ.A07(bounds2);
        Context context2 = imageView2.getContext();
        0qQ.A0C(context2, "null cannot be cast to non-null type android.app.Activity");
        0qQ.A07(context2);
        AnonymousClass5Gt r122 = new AnonymousClass5Gt((Activity) context2, new C47902ELw(context2, str2));
        r122.A04(imageView2, 0, bounds2.height() / 2, true);
        r122.A01();
        r122.A0F = true;
        r122.A07(C283255Gu.A07);
        r122.A04 = new C47892ELm(imageView2, eVy, A02, userSession, obj, A01, str2);
        r122.A0A = true;
        A002 = r122.A00();
        if (ordinal == 0) {
        }
        A002.A07((UserSession) null);
        return null;
    }
}
