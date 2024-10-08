package X;

import android.content.Context;
import android.content.res.Resources;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.comments.mvvm.view.fragment.CommentViewUiEffectHandler$handleCommentUiEffects$1;
import com.instagram.common.session.UserSession;

/* renamed from: X.7an  reason: invalid class name and case insensitive filesystem */
public final class C334177an implements C13907Tl7 {
    public final AnonymousClass0eM A00 = AnonymousClass0eN.A01(C334187ao.A00);
    public final AnonymousClass0eM A01 = AnonymousClass0eN.A01(C334207aq.A00);

    public final /* synthetic */ void onCreate(AnonymousClass07Z r1) {
    }

    public final void onDestroy(AnonymousClass07Z r5) {
        0qQ.A0B(r5, 0);
        A3Z a3z = (A3Z) this.A00.getValue();
        Dc2 dc2 = a3z.A00;
        if (dc2 != null) {
            1xC.A01.A00(new AnonymousClass3GR(dc2));
        }
        a3z.A00 = null;
    }

    public final /* synthetic */ void onPause(AnonymousClass07Z r1) {
    }

    public final /* synthetic */ void onResume(AnonymousClass07Z r1) {
    }

    public final /* synthetic */ void onStart(AnonymousClass07Z r1) {
    }

    public final /* synthetic */ void onStop(AnonymousClass07Z r1) {
    }

    public static final void A00(Context context, C59482JLg jLg) {
        CharSequence A002;
        String quantityString;
        if (0qQ.A0K(jLg, AXZ.A00)) {
            A002 = context.getString(2131975888);
        } else if (0qQ.A0K(jLg, IN4.A00)) {
            C59689JTv.A07(context, 2131952113);
            return;
        } else if (jLg instanceof C53499GpV) {
            C59689JTv.A0B(context, ((C53499GpV) jLg).A00);
            return;
        } else {
            if (jLg instanceof IN5) {
                quantityString = context.getResources().getQuantityString(R.plurals.selection_max_reached, 1);
            } else {
                if (jLg instanceof AnonymousClass9I0) {
                    AnonymousClass9I0 r4 = (AnonymousClass9I0) jLg;
                    int i = r4.A00;
                    if (i == 0) {
                        quantityString = context.getResources().getQuantityString(R.plurals.bulk_block_confirmation_toast, r4.A01);
                    } else if (i == 1) {
                        Resources resources = context.getResources();
                        int i2 = r4.A01;
                        quantityString = resources.getQuantityString(R.plurals.bulk_restrict_confirmation_toast, i2, new Object[]{Integer.valueOf(i2)});
                    }
                }
                if (jLg instanceof C53498GpU) {
                    A002 = C66909Mes.A00(context, ((C53498GpU) jLg).A00);
                } else {
                    throw new RuntimeException();
                }
            }
            0qQ.A07(quantityString);
            C59689JTv.A09(context, quantityString);
            return;
        }
        C59689JTv.A00(context, A002, (String) null, 0);
    }

    public final void A01(FragmentActivity fragmentActivity, C59544JNq jNq, AnonymousClass4DH r25, C334677bg r26, C334657be r27, C334297b2 r28, C52971GgO ggO, UserSession userSession, AnonymousClass4DU r31, AnonymousClass32A r32, String str, C62320sa r34, C62320sa r35, 0sP r36, C262224Cq r37, boolean z) {
        C52971GgO ggO2 = ggO;
        0qQ.A0B(ggO2, 0);
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession2, 3);
        C262224Cq r2 = r37;
        0qQ.A0B(r2, 4);
        AnonymousClass32A r14 = r32;
        0qQ.A0B(r14, 6);
        String str2 = str;
        0qQ.A0B(str2, 7);
        C334677bg r7 = r26;
        0qQ.A0B(r7, 8);
        C334297b2 r10 = r28;
        0qQ.A0B(r10, 12);
        C334657be r9 = r27;
        0qQ.A0B(r9, 13);
        AnonymousClass4DH r6 = r25;
        C59544JNq jNq2 = jNq;
        FragmentActivity fragmentActivity2 = fragmentActivity;
        C62320sa r18 = r35;
        AnonymousClass11O.A03(r2, new C61860pz(new CommentViewUiEffectHandler$handleCommentUiEffects$1(fragmentActivity2, jNq2, r6, r7, this, r9, r10, ggO2, userSession2, r31, r14, str2, (AnonymousClass4D7) null, r34, r18, r36, true, z), ggO2.A0U));
    }
}
