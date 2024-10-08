package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.modal.ModalActivity;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.model.reels.Reel;
import java.util.List;

public abstract class JZV {
    public static final C63830L8l A00(Context context, UserSession userSession, Reel reel, String str) {
        0qQ.A0B(userSession, 0);
        return A01(context, userSession, reel, AnonymousClass7TE.A1I(str));
    }

    public static final C63830L8l A01(Context context, UserSession userSession, Reel reel, List list) {
        C239693Hq r0 = reel.A0L;
        if (r0 != null) {
            String str = r0.A02;
            if (str == null || !00k.A0u(list, str) || reel.A0O(userSession).size() <= 1) {
                return null;
            }
            List<C255773uh> A0O = reel.A0O(userSession);
            0qQ.A07(A0O);
            for (C255773uh r2 : A0O) {
                if (r2.A0e == C250963mL.MEDIA && !list.contains(r2.A0j)) {
                    1Xj r02 = r2.A0b;
                    if (r02 != null) {
                        String id = r02.getId();
                        ExtendedImageUrl A1n = r02.A1n(context);
                        if (A1n != null) {
                            return new C63830L8l(JW0.A01(A1n.getWidth(), A1n.getHeight()), A1n, id, (String) null);
                        }
                        throw AnonymousClass7TE.A0z("Required value was null.");
                    }
                    throw AnonymousClass7TE.A0z("Required value was null.");
                }
            }
            return null;
        }
        throw AnonymousClass7TE.A0z("Required value was null.");
    }

    public static final Ki3 A02(AnonymousClass3BQ r3) {
        int A02 = DbU.A02(r3, 0);
        if (A02 == 11) {
            return Ki3.STORY_VIEWER_ARCHIVE;
        }
        if (A02 == 5) {
            return Ki3.STORY_VIEWER_PROFILE;
        }
        if (A02 != 0) {
            return Ki3.STORY_VIEWER_DEFAULT;
        }
        return Ki3.STORY_VIEWER_FEED;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x003c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.instagram.common.typedurl.ImageUrl A03(android.content.Context r8, com.instagram.common.session.UserSession r9, java.lang.String r10, boolean r11) {
        /*
            r0 = 3
            r6 = r9
            X.0qQ.A0B(r9, r0)
            r5 = 0
            if (r11 != 0) goto L_0x000d
            com.instagram.common.typedurl.SimpleImageUrl r0 = X.JTQ.A0G(r10)
            return r0
        L_0x000d:
            java.io.File r3 = X.AnonymousClass7TE.A0t(r10)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36323461840252068(0x810bff00002ca4, double:3.0344417583918106E-306)
            boolean r0 = X.182.A06(r2, r9, r0)
            if (r0 == 0) goto L_0x004e
            android.content.res.Resources r1 = r8.getResources()
            r0 = 2131165324(0x7f07008c, float:1.7944862E38)
            int r8 = r1.getDimensionPixelSize(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            if (r0 == 0) goto L_0x004e
            java.lang.String r7 = r3.getPath()
            r10 = 0
            r9 = r8
            android.graphics.Bitmap r1 = X.C39908AIz.A00(r6, r7, r8, r9, r10)
        L_0x003a:
            if (r1 == 0) goto L_0x008c
            java.lang.String r4 = X.2RR.A01()
            java.lang.String r2 = "direct_temp_cover_frame"
            java.lang.String r0 = ".jpg"
            java.lang.String r0 = X.AnonymousClass45F.A04(r2, r0)
            java.io.File r3 = new java.io.File
            r3.<init>(r4, r0)
            goto L_0x0059
        L_0x004e:
            java.lang.String r2 = r3.getPath()
            r0 = 0
            android.graphics.Bitmap r1 = X.C39908AIz.A01(r2, r0)
            goto L_0x003a
        L_0x0059:
            java.io.FileOutputStream r0 = X.JTO.A0t(r3)     // Catch:{ FileNotFoundException -> 0x0078, IOException -> 0x0089 }
            java.io.BufferedOutputStream r2 = new java.io.BufferedOutputStream     // Catch:{ FileNotFoundException -> 0x0078, IOException -> 0x0089 }
            r2.<init>(r0)     // Catch:{ FileNotFoundException -> 0x0078, IOException -> 0x0089 }
            android.graphics.Bitmap$CompressFormat r0 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ FileNotFoundException -> 0x0078, IOException -> 0x0089 }
            boolean r0 = X.JZK.A00(r0, r1, r2)     // Catch:{ FileNotFoundException -> 0x0078, IOException -> 0x0089 }
            if (r0 != 0) goto L_0x006b
            r3 = r5
        L_0x006b:
            r2.close()     // Catch:{ FileNotFoundException -> 0x0078, IOException -> 0x0089 }
            r1.recycle()
            if (r3 == 0) goto L_0x008c
            com.instagram.common.typedurl.SimpleImageUrl r0 = X.C253833rU.A01(r3)
            return r0
        L_0x0078:
            r3 = move-exception
            java.lang.String r2 = "MediaCaptureUtil"
            java.lang.String r0 = "could not find file"
            X.0wb.A06(r2, r0, r3)     // Catch:{ all -> 0x0084 }
            r1.recycle()
            goto L_0x008c
        L_0x0084:
            r0 = move-exception
            r1.recycle()
            throw r0
        L_0x0089:
            r1.recycle()
        L_0x008c:
            com.instagram.user.model.User r0 = X.AnonymousClass7TF.A0Q(r6)
            com.instagram.common.typedurl.ImageUrl r0 = r0.Bh3()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JZV.A03(android.content.Context, com.instagram.common.session.UserSession, java.lang.String, boolean):com.instagram.common.typedurl.ImageUrl");
    }

    public static final void A06(Activity activity, C16517UwM uwM, UserSession userSession, long j) {
        DbU.A0w(activity, DbY.A0C("reel_id", (Object) null, AnonymousClass7TE.A1L("archive_stories_tab", uwM), AnonymousClass7TE.A1L(AnonymousClass000.A00(3855), Long.valueOf(j))), userSession, ModalActivity.class, C273654mx.A00(39));
    }

    public static final void A08(FragmentActivity fragmentActivity, UserSession userSession, 1Xj r8, int i) {
        C249463jp r0;
        AnonymousClass3M8 Bx5;
        boolean A1b = C51973G9u.A1b(userSession, fragmentActivity, r8);
        if ((fragmentActivity instanceof C249463jp) && (r0 = (C249463jp) fragmentActivity) != null && (Bx5 = r0.Bx5()) != null) {
            C310336ap A0a = DbS.A0a();
            ImageUrl A1Q = r8.A1Q();
            if (A1Q != null) {
                A0a.A09 = A1Q;
                A0a.A03();
                DbT.A1D(fragmentActivity.getResources(), A0a, 2131953164);
                A0a.A0I = fragmentActivity.getResources().getString(2131953163);
                A0a.A0L = A1b;
                A0a.A0G = AnonymousClass7TF.A0d(fragmentActivity.getResources(), 2131976611);
                A0a.A06();
                A0a.A0R = A1b;
                A0a.A02 = i;
                A0a.A0A(new C65359Lrz(0, fragmentActivity, userSession));
                Bx5.A0A(A0a.A00());
                return;
            }
            throw AnonymousClass7TE.A0y();
        }
    }

    public static final void A09(FragmentActivity fragmentActivity, UserSession userSession, Reel reel) {
        C249463jp r0;
        AnonymousClass3M8 Bx5;
        0qQ.A0B(userSession, 0);
        if ((fragmentActivity instanceof C249463jp) && (r0 = (C249463jp) fragmentActivity) != null && (Bx5 = r0.Bx5()) != null) {
            C310336ap A0a = DbS.A0a();
            SimpleImageUrl A08 = reel.A08();
            if (A08 != null) {
                A0a.A09 = A08;
                A0a.A03();
                DbT.A1D(fragmentActivity.getResources(), A0a, 2131953164);
                A0a.A0I = fragmentActivity.getResources().getString(2131963404);
                A0a.A0L = true;
                A0a.A0G = AnonymousClass7TF.A0d(fragmentActivity.getResources(), 2131976611);
                A0a.A06();
                A0a.A0R = true;
                A0a.A0A(new C65359Lrz(1, fragmentActivity, userSession));
                Bx5.A0A(A0a.A00());
                return;
            }
            throw AnonymousClass7TE.A0y();
        }
    }

    public static final List A05(C63830L8l l8l) {
        Rect rect = l8l.A00;
        ImageUrl imageUrl = l8l.A02;
        RectF A08 = JW0.A08(rect, imageUrl.getWidth(), imageUrl.getHeight());
        return 0sr.A1P(JTU.A1b(A08, Float.valueOf(A08.left)));
    }

    public static final String A04(Context context, long j) {
        return 1G0.A0D(AnonymousClass7TF.A0A(context), C247743gq.MINUTES, AnonymousClass05K.A00, (double) j, (double) AnonymousClass7TG.A0I(), true, true, false, false, false);
    }

    public static final void A07(Activity activity, Ki3 ki3, UserSession userSession, boolean z) {
        boolean A1Z = AnonymousClass7TG.A1Z(activity, userSession);
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putBoolean(C273654mx.A00(119), A1Z);
        A0a.putBoolean(AnonymousClass000.A00(1530), A1Z);
        A0a.putBoolean("hide_privacy_footer", A1Z);
        A0a.putSerializable("highlight_management_source", ki3);
        A0a.putBoolean("suggested_highlights_enabled", z);
        DbS.A0b(activity, A0a, userSession, ModalActivity.class, C273654mx.A00(233)).A0A(activity, 501);
    }
}
