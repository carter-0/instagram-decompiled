package X;

import android.app.Activity;
import android.app.Application;
import android.content.DialogInterface;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.clips.drafts.model.ClipsDraftPreviewItemRepository;
import com.instagram.common.session.UserSession;
import java.util.concurrent.TimeUnit;

/* renamed from: X.I6o  reason: case insensitive filesystem */
public final class C56659I6o {
    public static final C56659I6o A00 = new Object();

    public static final void A01(Activity activity, DialogInterface.OnClickListener onClickListener, DialogInterface.OnDismissListener onDismissListener, Fragment fragment, 1P0 r34, 1P0 r35, 1P0 r36, UserSession userSession, 1Xj r38, C62320sa r39) {
        Activity activity2 = activity;
        0qQ.A0B(activity2, 2);
        UserSession userSession2 = userSession;
        0wc A02 = AnonymousClass0kN.A02(userSession2);
        2MU r6 = ClipsDraftPreviewItemRepository.A09;
        Application application = activity2.getApplication();
        0qQ.A07(application);
        ClipsDraftPreviewItemRepository A002 = r6.A00(application, userSession2);
        Fragment fragment2 = fragment;
        1Xj r1 = r38;
        C62320sa r30 = r39;
        Fragment fragment3 = fragment2;
        C50019FJe fJe = new C50019FJe(fragment3, A02, r36, userSession2, r1, r30, 8);
        1P0 r29 = r34;
        C50019FJe fJe2 = new C50019FJe(fragment2, A02, r29, userSession2, r1, r30, 9);
        DialogInterface.OnClickListener onClickListener2 = onClickListener;
        DialogInterface.OnDismissListener onDismissListener2 = onDismissListener;
        1P0 r23 = r35;
        if (!A03(userSession2, r1) || !A04(r1)) {
            if (A03(userSession2, r1)) {
                FragmentActivity activity3 = fragment2.getActivity();
                String A03 = I7G.A03(activity3, userSession2, r1, true);
                C358278ae r16 = C358278ae.RED_BOLD;
                A02(fJe, new C50024FJj(onClickListener2, A02, userSession2, r1, 19), fJe2, onDismissListener2, new SVL(2, A02, r1, userSession2), activity3, r16, r16, 2131957500, A03, 2131957498, 2131957499, 2131954722);
            } else if (A04(r1)) {
                String id = r1.getId();
                if (id != null) {
                    A002.A03(id, new C59206JAk(1, fragment3, userSession2, r1, r29, r30, onClickListener, onDismissListener, r23));
                    return;
                }
                throw AnonymousClass7TE.A0z("Required value was null.");
            } else {
                FragmentActivity activity4 = fragment2.getActivity();
                String A032 = I7G.A03(activity4, userSession2, r1, false);
                A02(new I8R(1, fragment, r34, userSession2, r1, r30, false), onClickListener2, (DialogInterface.OnClickListener) null, onDismissListener2, (DialogInterface.OnShowListener) null, activity4, C358278ae.RED, (C358278ae) null, (Integer) null, A032, 2131957555, 2131957531, 2131954722);
            }
        } else if (A04(r1)) {
            String id2 = r1.getId();
            if (id2 != null) {
                A002.A03(id2, new C59228JBg(fragment2, activity2, userSession2, r1, r23, fJe, onDismissListener2, fJe2, onClickListener2, A02, 1));
                return;
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
    }

    public static final void A02(DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2, DialogInterface.OnClickListener onClickListener3, DialogInterface.OnDismissListener onDismissListener, DialogInterface.OnShowListener onShowListener, FragmentActivity fragmentActivity, C358278ae r9, C358278ae r10, Integer num, String str, int i, int i2, int i3) {
        0qQ.A0B(onClickListener, 5);
        if (fragmentActivity != null && !fragmentActivity.isDestroyed() && !fragmentActivity.isFinishing()) {
            C358248ab A0X = DbS.A0X(fragmentActivity);
            C56714I8u i8u = C56714I8u.A00;
            I9H i9h = I9H.A00;
            A0X.A09(i);
            A0X.A0q(str);
            A0X.A0Q(onClickListener, r9, i2);
            if (onClickListener2 == null) {
                onClickListener2 = i8u;
            }
            A0X.A0H(onClickListener2, i3);
            if (onDismissListener == null) {
                onDismissListener = i9h;
            }
            A0X.A0f(onDismissListener);
            A0X.A0g(onShowListener);
            Dba.A1M(A0X);
            if (num != null) {
                int intValue = num.intValue();
                if (r10 == null) {
                    r10 = C358278ae.DEFAULT;
                }
                A0X.A0O(onClickListener3, r10, intValue);
            }
            DbT.A1V(A0X);
        }
    }

    public final DialogInterface.OnClickListener A05(Activity activity, DialogInterface.OnClickListener onClickListener, DialogInterface.OnDismissListener onDismissListener, Fragment fragment, ClipsDraftPreviewItemRepository clipsDraftPreviewItemRepository, 0wc r24, 1P0 r25, UserSession userSession, 1Xj r27, C62320sa r28, boolean z) {
        ClipsDraftPreviewItemRepository clipsDraftPreviewItemRepository2 = clipsDraftPreviewItemRepository;
        0qQ.A0B(clipsDraftPreviewItemRepository2, 3);
        1Xj r9 = r27;
        String id = r9.getId();
        if (id != null) {
            Fragment fragment2 = fragment;
            1P0 r7 = r25;
            UserSession userSession2 = userSession;
            if (z) {
                return new I8U(activity, onClickListener, onDismissListener, fragment2, clipsDraftPreviewItemRepository2, r24, r7, userSession2, r9, id, r28);
            }
            return new I8S(fragment2, ClipsDraftPreviewItemRepository.A09.A00(DbY.A05(fragment2), userSession2), r7, LSW.A03(userSession2, id), userSession2, r9, false);
        }
        throw AnonymousClass7TE.A0y();
    }

    public static final I9M A00(FragmentActivity fragmentActivity, UserSession userSession, 1Xj r5, boolean z) {
        if (182.A06(AnonymousClass7TF.A0H(userSession), userSession, 36325360216126373L)) {
            return new I9M(fragmentActivity, userSession, r5, z);
        }
        return null;
    }

    public static final boolean A03(UserSession userSession, 1Xj r5) {
        if ((2Lv.A00(userSession).A00(CallerContext.A00(C52035GCh.class), "ig_android_linking_cache_ig_to_fb_reels_crossposting") || AnonymousClass8PU.A04(userSession)) && AnonymousClass3YO.A02(r5, false) && 182.A06(0Tu.A05, userSession, 36315718014209525L)) {
            return true;
        }
        return false;
    }

    public static final boolean A04(1Xj r6) {
        if (System.currentTimeMillis() - TimeUnit.SECONDS.toMillis(r6.A1A()) < 86400000) {
            return true;
        }
        return false;
    }
}
