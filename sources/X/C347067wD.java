package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.7wD  reason: invalid class name and case insensitive filesystem */
public abstract class C347067wD {
    public static final List A01(UserSession userSession, C358088aL r10) {
        ArrayList arrayList;
        ArrayList A1M;
        int i;
        C347087wF[] r0;
        switch (r10.ordinal()) {
            case 5:
            case 31:
                ArrayList arrayList2 = new ArrayList();
                C347087wF[] r02 = C347077wE.A00;
                ArrayList arrayList3 = new ArrayList();
                if (r10 == C358088aL.A0U) {
                    r0 = C347077wE.A00;
                } else {
                    r0 = C347077wE.A03;
                }
                018.A18(arrayList3, r0);
                Iterator it = arrayList3.iterator();
                while (it.hasNext()) {
                    C347087wF r3 = (C347087wF) it.next();
                    arrayList2.add(new C347117wI(r3, r3.A02, r3.A01));
                }
                return arrayList2;
            case 8:
                if (182.A06(0Tu.A05, userSession, 36320880565035945L)) {
                    A1M = C3495980z.A01(userSession);
                } else {
                    A1M = 0sr.A1M(new C3495880y[]{C3495880y.DURATION_15_SEC_IN_MS, C3495880y.DURATION_30_SEC_IN_MS, C3495880y.DURATION_60_SEC_IN_MS, C3495880y.DURATION_90_SEC_IN_MS});
                }
                arrayList = new ArrayList(0Yv.A1E(A1M, 10));
                Iterator it2 = A1M.iterator();
                while (it2.hasNext()) {
                    C3495880y r1 = (C3495880y) it2.next();
                    arrayList.add(new C347117wI(Integer.valueOf(r1.A01), r1.A02, r1.A00));
                }
                break;
            case 10:
                List<AnonymousClass886> A01 = C339947kR.A01();
                arrayList = new ArrayList(0Yv.A1E(A01, 10));
                for (AnonymousClass886 r12 : A01) {
                    Float valueOf = Float.valueOf(r12.A00);
                    Integer num = r12.A02;
                    if (num != null) {
                        i = num.intValue();
                    } else {
                        i = R.drawable.instagram_speed_1_outline_44;
                    }
                    arrayList.add(new C347117wI(valueOf, i, r12.A01));
                }
                break;
            case 32:
                return 0sr.A1P(new C347117wI[]{new C347117wI("SCALE_MODE_FIT", R.drawable.instagram_fill_outline_44, 0), new C347117wI("SCALE_MODE_FILL", R.drawable.instagram_fit_outline_44, 0)});
            case 33:
            case 34:
                ArrayList arrayList4 = new ArrayList();
                AnonymousClass804[] r4 = C339967kT.A01;
                arrayList4.add(new C347117wI(r4[0], R.drawable.instagram_layout_remix3_outline_44, 2131954637));
                arrayList4.add(new C347117wI(r4[1], R.drawable.instagram_layout_remix2_outline_44, 2131954638));
                arrayList4.add(new C347117wI(r4[2], R.drawable.instagram_layout_remix1_outline_44, 2131954636));
                arrayList4.add(new C347117wI(r4[3], R.drawable.instagram_green_screen_outline_44, 2131954635));
                return arrayList4;
            default:
                StringBuilder sb = new StringBuilder();
                sb.append("unknown camera tool: ");
                sb.append(r10);
                0kD.A00("SecondaryPickerOptionsHelper", sb.toString());
                return 0sn.A00;
        }
        return 00k.A0a(arrayList);
    }

    public static final Drawable A00(Context context, int i, int i2, boolean z) {
        Drawable bitmapDrawable;
        float f;
        float f2;
        if (!z) {
            bitmapDrawable = context.getDrawable(i);
        } else {
            Resources resources = context.getResources();
            Bitmap decodeResource = BitmapFactory.decodeResource(context.getResources(), i);
            0qQ.A07(decodeResource);
            bitmapDrawable = new BitmapDrawable(resources, C267014am.A00(context, decodeResource));
        }
        float f3 = (float) i2;
        if (bitmapDrawable != null) {
            f = (float) bitmapDrawable.getIntrinsicWidth();
        } else {
            f = 0.0f;
        }
        float f4 = (f3 - f) / 2.0f;
        if (bitmapDrawable != null) {
            f2 = (float) bitmapDrawable.getIntrinsicHeight();
        } else {
            f2 = 0.0f;
        }
        float f5 = (f3 - f2) / 2.0f;
        float f6 = 0.0f;
        if (0.0f < f4) {
            f6 = f4;
        }
        float f7 = 0.0f;
        if (0.0f < f5) {
            f7 = f5;
        }
        if (bitmapDrawable != null) {
            int i3 = (int) f6;
            int i4 = (int) f7;
            bitmapDrawable.setBounds(i3, i4, Math.min(bitmapDrawable.getIntrinsicWidth(), i2) + i3, Math.min(bitmapDrawable.getIntrinsicHeight(), i2) + i4);
        }
        return bitmapDrawable;
    }
}
