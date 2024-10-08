package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.contentnotes.data.metadata.ContentNoteMetadata;
import com.instagram.modal.ModalActivity;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import com.instagram.reels.ui.views.reelavatar.view.ReelAvatarWithBadgeView;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.Ocp  reason: case insensitive filesystem */
public final class C71110Ocp {
    public static final C71110Ocp A00 = new Object();

    public static final void A01(FragmentActivity fragmentActivity, GPK gpk, UserSession userSession, ContentNoteMetadata contentNoteMetadata, String str, String str2, boolean z) {
        C69506Nmo nmo;
        String str3;
        UserSession userSession2 = userSession;
        DbZ.A0t(0, userSession, str, str2);
        DbU.A0w(fragmentActivity, C51973G9u.A0A(userSession, C46548Dgp.A01(userSession, str2, "notes_action_sheet", str)), userSession, ModalActivity.class, "profile");
        if (contentNoteMetadata == null || (str3 = contentNoteMetadata.A09) == null) {
            C3018760k A01 = C3018660j.A01(userSession);
            if (z) {
                nmo = C69506Nmo.A0M;
            } else {
                nmo = C69506Nmo.A0d;
            }
            A01.A0B(nmo);
            return;
        }
        GPJ.A00.A04(gpk, userSession2, contentNoteMetadata.A04, contentNoteMetadata.A06, contentNoteMetadata.A0A, str3);
    }

    public static final void A02(FragmentActivity fragmentActivity, AnonymousClass4DH r5, C331127Pr r6) {
        C331157Pu A002 = C48943Emh.A00(DbT.A0i(fragmentActivity));
        if (A002 == null || A002.A03.getViewLifecycleOwner().getLifecycle().A07().compareTo(07U.A01) < 0) {
            if (r5 instanceof NKL) {
                r6.A0T = (C273494mf) r5;
            }
            DbU.A0y(fragmentActivity, r5, r6);
            return;
        }
        A002.A0G(r5, r6, true, false);
    }

    public final C46498Dg1 A03(FragmentActivity fragmentActivity, AnonymousClass0iw r6, UserSession userSession, ImageUrl imageUrl, String str, boolean z) {
        0qQ.A0B(str, 3);
        View A08 = DbU.A08(LayoutInflater.from(fragmentActivity), R.layout.layout_bottom_sheet_header);
        A08.findViewById(R.id.note_action_button).setVisibility(8);
        Context context = A08.getContext();
        ReelAvatarWithBadgeView reelAvatarWithBadgeView = (ReelAvatarWithBadgeView) AnonymousClass7TF.A0F(A08, R.id.bottom_sheet_note_author_avatar);
        reelAvatarWithBadgeView.setVisibility(0);
        if (imageUrl != null) {
            reelAvatarWithBadgeView.A04(imageUrl, r6);
            TextView A0G = DbU.A0G(A08, R.id.bottom_sheet_note_header_title);
            DbT.A1H(A0G);
            A0G.setText(str);
            if (z) {
                DbY.A11(A0G, context);
                A0G.setTypeface(Typeface.SANS_SERIF);
            }
            C46498Dg1 dg1 = new C46498Dg1(fragmentActivity, userSession);
            dg1.A01 = A08;
            return dg1;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final void A04(Activity activity, AnonymousClass0iw r14, UserSession userSession, String str, boolean z) {
        String str2;
        Parcelable.Creator creator = PendingRecipient.CREATOR;
        UserSession userSession2 = userSession;
        User A0j = DbV.A0j(userSession, str);
        0qQ.A0A(A0j);
        List A0n = DbW.A0n(A0j);
        0qQ.A07(A0n);
        C291175gg r3 = new C291175gg(A0n);
        Activity activity2 = activity;
        AnonymousClass0iw r10 = r14;
        boolean z2 = z;
        if (182.A06(0Tu.A05, userSession, 36313763805661419L)) {
            AnonymousClass7VT.A00(userSession).A02(r3, A0n, new C58766IxD(13, userSession2, activity2, r10, z2), true);
            return;
        }
        if (z) {
            str2 = "direct_thread_content_note";
        } else {
            str2 = "inbox_notes_tray";
        }
        1pE A01 = 1pE.A01(activity, r14, userSession, str2);
        A01.A0B = r3;
        A01.A06();
    }

    public final void A05(Fragment fragment, AnonymousClass0iw r8, UserSession userSession, User user) {
        0qQ.A0B(userSession, 0);
        DbZ.A0t(1, user, fragment, r8);
        C254773t1 A002 = C69862NtQ.A00(userSession, user);
        if (182.A06(0Tu.A05, userSession, 36317586324985192L)) {
            List A0n = DbW.A0n(user);
            0qQ.A07(A0n);
            AnonymousClass7VT.A00(userSession).A02(new C291175gg(A0n), A0n, new C74188PqU(12, (Object) fragment, (Object) r8, (Object) userSession), true);
            return;
        }
        A00(fragment, r8, userSession, A002);
    }

    public final void A06(FragmentActivity fragmentActivity, GPK gpk, AnonymousClass0iw r10, UserSession userSession, ContentNoteMetadata contentNoteMetadata, String str, boolean z) {
        DbY.A1S(userSession, r10);
        A01(fragmentActivity, gpk, userSession, contentNoteMetadata, r10.getModuleName(), str, z);
    }

    /* JADX WARNING: type inference failed for: r3v3, types: [X.OjT] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A07(androidx.fragment.app.FragmentActivity r21, X.AnonymousClass0iw r22, com.instagram.common.session.UserSession r23, com.instagram.common.typedurl.ImageUrl r24, com.instagram.contentnotes.data.metadata.ContentNoteMetadata r25, X.AnonymousClass4AD r26, X.AnonymousClass6ZA r27, java.lang.String r28, java.lang.String r29, long r30, boolean r32, boolean r33, boolean r34) {
        /*
            r20 = this;
            r3 = r20
            r9 = r33
            r4 = r21
            r5 = r22
            r6 = r23
            r7 = r24
            r8 = r29
            X.Dg1 r2 = r3.A03(r4, r5, r6, r7, r8, r9)
            r8 = r26
            r10 = r30
            if (r34 == 0) goto L_0x0024
            r3 = 2131954058(0x7f13098a, float:1.9544605E38)
            r1 = 0
            X.Oia r0 = new X.Oia
            r0.<init>(r8, r10, r1)
            r2.A02(r0, r3)
        L_0x0024:
            r7 = r25
            r9 = r28
            if (r25 == 0) goto L_0x0076
            r0 = 2131954046(0x7f13097e, float:1.954458E38)
            X.OjT r3 = new X.OjT
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
        L_0x0032:
            r2.A02(r3, r0)
            r1 = 2131954071(0x7f130997, float:1.954463E38)
            X.OjD r0 = new X.OjD
            r12 = r0
            r13 = r4
            r14 = r5
            r15 = r6
            r16 = r7
            r17 = r10
            r12.<init>(r13, r14, r15, r16, r17)
            r2.A02(r0, r1)
            r1 = 2131954073(0x7f130999, float:1.9544635E38)
            r16 = 3
            X.ICS r0 = new X.ICS
            r10 = r0
            r11 = r4
            r12 = r5
            r13 = r6
            r14 = r7
            r15 = r9
            r10.<init>(r11, r12, r13, r14, r15, r16)
            r2.A04(r0, r1)
            r0 = r27
            if (r27 == 0) goto L_0x0061
            r2.A03 = r0
        L_0x0061:
            X.37D r0 = X.DbT.A0i(r4)
            if (r0 == 0) goto L_0x008b
            X.37F r0 = (X.AnonymousClass37F) r0
            boolean r0 = r0.A0g
            if (r0 == 0) goto L_0x008b
            X.FFy r0 = new X.FFy
            r0.<init>(r2)
            r0.A04(r4)
            return
        L_0x0076:
            r0 = 2131954064(0x7f130990, float:1.9544617E38)
            r18 = 0
            X.OjN r3 = new X.OjN
            r19 = r32
            r12 = r3
            r13 = r8
            r14 = r4
            r15 = r6
            r16 = r5
            r17 = r9
            r12.<init>(r13, r14, r15, r16, r17, r18, r19)
            goto L_0x0032
        L_0x008b:
            X.C51969G9p.A11(r4, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71110Ocp.A07(androidx.fragment.app.FragmentActivity, X.0iw, com.instagram.common.session.UserSession, com.instagram.common.typedurl.ImageUrl, com.instagram.contentnotes.data.metadata.ContentNoteMetadata, X.4AD, X.6ZA, java.lang.String, java.lang.String, long, boolean, boolean, boolean):void");
    }

    public static final void A00(Fragment fragment, AnonymousClass0iw r5, UserSession userSession, C254783t2 r7) {
        1pE A01 = 1pE.A01(fragment.requireActivity(), r5, userSession, C273654mx.A00(2870));
        if ((fragment instanceof C2356430q) && (fragment instanceof AnonymousClass0iw) && !182.A06(0Tu.A06, userSession, 36311569077633653L)) {
            0Tu r2 = 0Tu.A05;
            if (182.A06(r2, userSession, 36311569076126302L) || 182.A06(r2, userSession, 36311569077109357L)) {
                FragmentActivity requireActivity = fragment.requireActivity();
                A01.A14 = true;
                A01.A00 = fragment;
                A01.A02 = requireActivity;
                A01.A0A = (C2356430q) fragment;
                A01.A05 = (AnonymousClass0iw) fragment;
            }
        }
        A01.A0B = r7;
        A01.A0q = true;
        A01.A01 = fragment;
        A01.A11 = false;
        A01.A0v = true;
        A01.A06();
    }
}
