package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.contentnotes.data.immersive.params.ContentNotesImmersiveMimicryParams;
import java.lang.ref.WeakReference;

public final class I4E {
    public static final I4E A00 = new Object();

    public static final void A00(GPK gpk, UserSession userSession, ImageUrl imageUrl, 1Xj r31, Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, String str6, WeakReference weakReference) {
        FragmentActivity fragmentActivity;
        FragmentActivity fragmentActivity2;
        UserSession userSession2 = userSession;
        GPK gpk2 = gpk;
        ImageUrl imageUrl2 = imageUrl;
        Integer num3 = num;
        Integer num4 = num2;
        String str7 = str;
        String str8 = str2;
        String str9 = str3;
        String str10 = str4;
        String str11 = str5;
        String str12 = str6;
        WeakReference weakReference2 = weakReference;
        if (C247323g9.A00(userSession2).A06()) {
            C71071Oaq.A00.A02(userSession2, new N2M(gpk2, imageUrl2, (ContentNotesImmersiveMimicryParams) null, num3, num4, str7, str8, str9, str10, str11, str12, (String) null, false), weakReference2);
            return;
        }
        F1J f1j = E68.A08;
        Object obj = weakReference2.get();
        if ((obj instanceof FragmentActivity) && (fragmentActivity = (FragmentActivity) obj) != null) {
            Object obj2 = weakReference2.get();
            if ((obj2 instanceof FragmentActivity) && (fragmentActivity2 = (FragmentActivity) obj2) != null) {
                IQ0 iq0 = new IQ0(fragmentActivity2, new C58239Ioh(gpk2, userSession2, imageUrl2, num3, num4, str7, str8, str9, str10, str11, str12, weakReference2));
                String id = r31.getId();
                if (id != null) {
                    f1j.A00(fragmentActivity, GPK.UFI_RESHARE_SHEET, userSession2, iq0, id, str3, (String) null, true, true);
                }
            }
        }
    }

    public final void A01(UserSession userSession, ImageUrl imageUrl, 1Xj r25, Integer num, Integer num2, Integer num3, String str, String str2, String str3, String str4, String str5, String str6, WeakReference weakReference) {
        String id;
        UserSession userSession2 = userSession;
        WeakReference weakReference2 = weakReference;
        AnonymousClass7TG.A1O(userSession2, weakReference2);
        String str7 = str3;
        0qQ.A0B(str7, 5);
        ImageUrl imageUrl2 = imageUrl;
        1Xj r5 = r25;
        Integer num4 = num;
        Integer num5 = num2;
        Integer num6 = num3;
        String str8 = str;
        String str9 = str2;
        String str10 = str4;
        String str11 = str5;
        String str12 = str6;
        if (num4 == AnonymousClass05K.A01) {
            GPK gpk = GPK.UFI;
            if (r25 != null) {
                A00(gpk, userSession2, imageUrl2, r5, num5, num6, str8, str9, str7, str10, str11, str12, weakReference2);
            }
        } else if (num4 == AnonymousClass05K.A0C && r25 != null && (id = r5.getId()) != null) {
            0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(userSession2), "instagram_media_ufi_recycle_button_click_client");
            if (A0e.isSampled()) {
                C51965G9l.A1J(A0e, id);
                DbS.A1O(A0e, str7);
                C51965G9l.A1G(A0e, DbZ.A0c(num6));
                C51973G9u.A14(A0e, "carousel_media_id", str12);
                A0e.AAJ("inventory_source", str10);
                C51969G9p.A1D(A0e, str11);
            }
            C56160Hto hto = new C56160Hto(userSession2);
            Context context = (Context) weakReference2.get();
            if (context != null) {
                if (r5.A4U()) {
                    hto.A03(DbT.A05(context), new C56787ICk(userSession2, imageUrl2, r5, num5, num6, str8, str9, str7, str10, str11, str12, weakReference2), AnonymousClass7TE.A16(context, 2131968575), str7, R.drawable.instagram_icons_exceptions_content_notes_1_pano_outline_24, false);
                }
                if (C48782Ek5.A00(userSession2, r5)) {
                    Context A05 = DbT.A05(context);
                    String A16 = AnonymousClass7TE.A16(context, 2131952390);
                    hto.A03(A05, new FOD(userSession2, r5, weakReference2, num6, str7, 1), A16, str7, R.drawable.instagram_new_story_pano_outline_24, false);
                }
                if (hto.A05.size() > 0) {
                    C17897Vho vho = new C17897Vho(hto);
                    Context context2 = (Context) weakReference2.get();
                    if (context2 != null) {
                        vho.A00(context2);
                    }
                }
            }
        }
    }
}
