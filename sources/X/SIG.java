package X;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.JsonReader;
import android.util.SparseArray;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.io.StringReader;
import java.util.List;
import java.util.Map;

public final class SIG {
    public final UserSession A00;

    public final Dialog A01(Context context, C11351SOk sOk) {
        DialogInterface.OnClickListener onClickListener;
        DialogInterface.OnClickListener onClickListener2;
        C358278ae r0;
        0qQ.A0B(context, 0);
        C358248ab r3 = new C358248ab(context);
        r3.A0r(sOk.A0F);
        r3.A05 = sOk.A0E;
        r3.A0q(sOk.A0B);
        r3.A0s(false);
        Drawable drawable = sOk.A0A;
        if (drawable != null) {
            r3.A0i(drawable);
        }
        int i = sOk.A06;
        if (i != 0) {
            r3.A09(i);
        }
        int i2 = sOk.A00;
        if (i2 != 0) {
            r3.A08(i2);
        }
        int i3 = sOk.A05;
        if (i3 != 0) {
            DialogInterface.OnClickListener onClickListener3 = sOk.A09;
            int i4 = sOk.A04;
            if (i4 == 0) {
                r0 = C358278ae.RED_BOLD;
            } else if (i4 == 1 || i4 != 2) {
                r0 = C358278ae.DEFAULT;
            } else {
                r0 = C358278ae.BLUE_BOLD;
            }
            r3.A0Q(onClickListener3, r0, i3);
        } else {
            String str = sOk.A0D;
            if (!(str == null || (onClickListener = sOk.A09) == null)) {
                r3.A0c(onClickListener, str);
            }
        }
        int i5 = sOk.A02;
        if (i5 != 0) {
            r3.A0O(sOk.A08, C358278ae.DEFAULT, i5);
        }
        int i6 = sOk.A01;
        if (i6 != 0) {
            r3.A0P(sOk.A07, C358278ae.DEFAULT, i6);
        } else {
            String str2 = sOk.A0C;
            if (!(str2 == null || (onClickListener2 = sOk.A07) == null)) {
                r3.A0b(onClickListener2, str2);
            }
        }
        return r3.A02();
    }

    public SIG(UserSession userSession) {
        this.A00 = userSession;
    }

    public static void A00(Context context, C11351SOk sOk, SIG sig) {
        AnonymousClass0fN.A00(sig.A01(context, sOk));
    }

    public final void A02(Context context, ViewGroup viewGroup, FragmentActivity fragmentActivity, C13925TlT tlT, Map map) {
        String optionalStringField;
        AnonymousClass7TG.A1T(context, viewGroup, fragmentActivity);
        C250663lr optionalTreeField = ((C250663lr) tlT).getOptionalTreeField(0, "bundle", C7660QSb.class, -947389002);
        if (optionalTreeField != null && (optionalStringField = optionalTreeField.getOptionalStringField(0, "bloks_bundle_tree")) != null) {
            C229382nI A01 = C229382nI.A01((SparseArray) null, fragmentActivity, new 0xG("BloksScreenConfigHelperFbImpl"), Pxe.A0a(AnonymousClass2E0.A00()));
            C361008fW r0 = new C361008fW(new JsonReader(new StringReader(optionalStringField)));
            r0.Crg();
            C361028fY A002 = C361028fY.A00(r0);
            0qQ.A07(A002);
            C3034368u A03 = C3034368u.A03((C361078fd) null, A002.A00.A00, (List) null);
            C273694n2 r1 = new C273694n2(context);
            AnonymousClass6NR A003 = AnonymousClass6NS.A00(context, A03, A01);
            A003.A01 = map;
            A003.A00().A07(r1);
            viewGroup.addView(r1);
        }
    }
}
