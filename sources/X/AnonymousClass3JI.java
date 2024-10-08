package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.PopupWindow;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.creation.cameraconfiguration.CameraConfiguration;
import com.instagram.ui.swipenavigation.PositionConfig;
import java.util.ArrayList;

/* renamed from: X.3JI  reason: invalid class name */
public final class AnonymousClass3JI implements View.OnClickListener {
    public final /* synthetic */ 0wc A00;
    public final /* synthetic */ C229772oA A01;
    public final /* synthetic */ AnonymousClass354 A02;

    public AnonymousClass3JI(0wc r1, C229772oA r2, AnonymousClass354 r3) {
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void onClick(View view) {
        Float f;
        Float f2;
        Integer num;
        int i;
        Drawable drawable;
        int A05 = AnonymousClass0fD.A05(1598871055);
        View view2 = view;
        0qQ.A0B(view2, 0);
        AnonymousClass354 r6 = this.A02;
        C227802jw A002 = AnonymousClass354.A00(r6);
        if (A002 != null) {
            UserSession userSession = r6.A01;
            0Tu r9 = 0Tu.A05;
            String A04 = 182.A04(r9, userSession, 36876838312935543L);
            if (!182.A06(r9, userSession, 36313888359647511L) || (num = AnonymousClass05K.A01) != C229092mp.A00(A04)) {
                View view3 = A002.mView;
                if (view3 != null) {
                    0nA.A0N(view3);
                }
                2Zg A07 = A002.A07();
                C71162bE A08 = A002.A08();
                if (A08 != null) {
                    f = Float.valueOf(A08.A01);
                } else {
                    f = null;
                }
                if (A07 == null || A07.Apn() == null) {
                    f2 = null;
                } else {
                    f2 = Float.valueOf(0.0f);
                }
                if (0qQ.A0J(f, f2)) {
                    A002.A0S("LOGO_PRESS");
                } else if (A07 != null) {
                    if (A07.Apn() != null) {
                        A07.FLD(new PositionConfig((AnonymousClass57C) null, (CameraConfiguration) null, (AnonymousClass3QO) null, "instagram_title", (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0.0f, 0, true));
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                }
            } else {
                C228062kj r12 = r6.A03;
                C229772oA r0 = r12.A0u().A00;
                if (r0 != null) {
                    r0.A00 = true;
                }
                C229772oA r5 = this.A01;
                0wc r4 = this.A00;
                if (A002.A0A().A0H().A08 != null) {
                    C229772oA r02 = r12.A0u().A00;
                    if (r02 != null) {
                        r02.A00 = true;
                    }
                    if (!182.A06(r9, userSession, 36318999369292588L)) {
                        r12.A0H().A06();
                    }
                }
                if (r5.A01) {
                    C355148Ov r10 = (C355148Ov) r5.A08.getValue();
                    Context context = r5.A02;
                    ArrayList arrayList = r5.A06;
                    if (arrayList.isEmpty()) {
                        for (AnonymousClass2o1 r1 : r5.A07) {
                            Integer num2 = r1.A01;
                            if (!(num2 == AnonymousClass05K.A00 || num2 == num)) {
                                boolean z = false;
                                if (num2 == AnonymousClass05K.A0N) {
                                    z = true;
                                }
                                String string = context.getString(AnonymousClass3VU.A00(num2));
                                0qQ.A07(string);
                                C40545Ads ads = new C40545Ads(r5, num2);
                                switch (num2.intValue()) {
                                    case 2:
                                        i = R.drawable.instagram_users_pano_outline_24;
                                        break;
                                    case 3:
                                        i = R.drawable.instagram_star_pano_outline_24;
                                        break;
                                    case 4:
                                        i = R.drawable.instagram_sparkles_pano_outline_24;
                                        break;
                                    case 5:
                                        i = R.drawable.instagram_crown_pano_outline_24;
                                        break;
                                    case 6:
                                        i = R.drawable.instagram_clock_dotted_pano_outline_24;
                                        break;
                                    case 7:
                                        i = R.drawable.instagram_app_instagram_pano_outline_24;
                                        break;
                                    default:
                                        drawable = null;
                                        break;
                                }
                                drawable = context.getDrawable(i);
                                C367618rI r14 = new C367618rI((Drawable) null, drawable, (C15048ULb) null, ads, (Integer) null, string, 0, 0, 0, z, false, false, true, false, false, false);
                                arrayList.add(r14);
                                r1.A00 = r14;
                            }
                        }
                    }
                    r10.A02(arrayList);
                    r5.A01 = false;
                }
                AnonymousClass0eM r13 = r5.A08;
                ((PopupWindow) r13.getValue()).setOnDismissListener(r5);
                ((PopupWindow) r13.getValue()).showAsDropDown(view2);
                0Aj A003 = r4.A00(r4.A00, "instagram_feed_picker_tap");
                if (A003.isSampled()) {
                    A003.AAJ("module", AnonymousClass2kO.A00.getModuleName());
                    A003.Cgf();
                }
            }
        }
        AnonymousClass0fD.A0C(684571612, A05);
    }
}
