package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.util.LruCache;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.search.common.analytics.SearchContext;

/* renamed from: X.GLk  reason: case insensitive filesystem */
public final class C52269GLk extends Handler {
    public final UserSession A00;
    public final boolean A01;

    public final void handleMessage(Message message) {
        C52268GLj gLj;
        C67231sQ clipsMetadata;
        C247733gp A1T;
        String str;
        Boolean bool;
        Message message2 = message;
        0qQ.A0B(message2, 0);
        if (message2.what == 0) {
            Object obj = message2.obj;
            if ((obj instanceof C52268GLj) && (gLj = (C52268GLj) obj) != null) {
                if (!this.A01) {
                    Context context = gLj.A00;
                    Resources resources = context.getResources();
                    0qQ.A0A(resources);
                    int A002 = C52183GHz.A00(resources, AnonymousClass7TE.A0B(resources), resources.getDimensionPixelSize(R.dimen.add_to_story_dual_destination_share_sheet_avatar_icon_size));
                    for (C267324bN r3 : gLj.A02) {
                        1Xj r2 = r3.A02;
                        if (!(r2 == null || (A1T = r2.A1T()) == null || (str = A1T.A0d) == null)) {
                            UserSession userSession = gLj.A01;
                            boolean A03 = GED.A03(userSession, r2);
                            if (str.length() > 0 && !A03) {
                                C52183GHz gHz = C52183GHz.A00;
                                boolean CcK = r3.CcK();
                                boolean A0H = r3.A0H();
                                1Xj r1 = r3.A02;
                                if (r1 != null) {
                                    bool = Boolean.valueOf(r1.A5G());
                                } else {
                                    bool = null;
                                }
                                gHz.A03(context, userSession, A1T, (AnonymousClass3W1) null, 1sy.A07, (AnonymousClass34A) null, new SearchContext((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null), bool, (String) null, A002, CcK, A0H, false, false);
                            }
                        }
                    }
                }
                Context applicationContext = gLj.A00.getApplicationContext();
                for (C267324bN r5 : gLj.A02) {
                    1Xj r12 = r5.A02;
                    if (!(r12 == null || (clipsMetadata = r12.A0C.getClipsMetadata()) == null)) {
                        if (clipsMetadata.BUr() != null || clipsMetadata.BZB() != null) {
                            String A04 = AnonymousClass3ZJ.A04(clipsMetadata.BUr(), clipsMetadata.BZB());
                            String A032 = AnonymousClass3ZJ.A03(clipsMetadata.BUr(), clipsMetadata.BZB());
                            boolean A0A = AnonymousClass3ZJ.A0A(clipsMetadata);
                            boolean A0B = AnonymousClass3ZJ.A0B(clipsMetadata);
                            C67061rp AZY = clipsMetadata.AZY();
                            C376489Ie A003 = AnonymousClass3ZJ.A00(clipsMetadata.BZB());
                            1Xj r32 = r5.A02;
                            UserSession userSession2 = gLj.A01;
                            AnonymousClass4Ke r11 = new AnonymousClass4Ke(A003, AZY, A04, A032, R.dimen.abc_text_size_menu_header_material, false, A0A, A0B, true, true, true, AnonymousClass3ZJ.A0D(userSession2, r32), C263304Kd.A03(clipsMetadata), false);
                            Resources resources2 = applicationContext.getResources();
                            0qQ.A07(resources2);
                            SpannableStringBuilder A033 = AnonymousClass4Kf.A03(resources2, AnonymousClass4Kf.A01(applicationContext, r11), AnonymousClass4Kf.A00(applicationContext, r11), userSession2, r11, true);
                            int color = applicationContext.getColor(2Yu.A0H(applicationContext, R.attr.igds_color_icon_on_media));
                            Integer num = AnonymousClass05K.A00;
                            Typeface typeface = Typeface.SANS_SERIF;
                            0qQ.A08(typeface);
                            C66805Mcr mcr = new C66805Mcr(0oh.A03(applicationContext, typeface, num), (Spannable) A033, (int) R.dimen.abc_text_size_menu_header_material, color);
                            LruCache lruCache = ((C52227GJs) userSession2.A01(C52227GJs.class, C52226GJr.A00)).A00;
                            if (((C306386Ly) lruCache.get(AnonymousClass7TF.A0h(mcr))) == null) {
                                lruCache.put(AnonymousClass7TF.A0h(mcr), GIX.A01(applicationContext, mcr, GIX.A00(applicationContext, mcr)));
                            }
                        }
                    }
                }
                return;
            }
            return;
        }
        DbT.A1Q(0wj.A01, AnonymousClass000.A00(4144), 817900281);
    }

    public C52269GLk(Looper looper, UserSession userSession, boolean z) {
        super(looper);
        this.A01 = z;
        this.A00 = userSession;
    }
}
