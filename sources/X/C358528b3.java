package X;

import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.fragment.app.FragmentActivity;
import com.google.common.collect.ImmutableList;
import com.instagram.api.schemas.StoryGroupMentionTappableData;
import com.instagram.common.session.UserSession;
import com.instagram.ui.text.ConstrainedEditText;
import com.instagram.user.model.User;
import java.util.ArrayList;

/* renamed from: X.8b3  reason: invalid class name and case insensitive filesystem */
public final class C358528b3 implements C358538b4 {
    public final /* synthetic */ AnonymousClass4DH A00;
    public final /* synthetic */ C358368an A01;

    public C358528b3(AnonymousClass4DH r1, C358368an r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void DIL() {
        C358368an r4 = this.A01;
        ConstrainedEditText constrainedEditText = r4.A1j;
        String obj = constrainedEditText.getText().toString();
        UserSession userSession = r4.A1J;
        ArrayList A012 = AnonymousClass9UR.A01(userSession, obj);
        ImmutableList of = ImmutableList.of(AnonymousClass0t1.A01.A01(userSession));
        0qQ.A0B(of, 5);
        C387339m3 r1 = new C387339m3(new StoryGroupMentionTappableData(0, (String) null, "", (String) null, of));
        r1.A06.addAll(A012);
        r4.A0T = new C41063Anl(this, r1);
        r4.A0Y();
        constrainedEditText.clearFocus();
    }

    public final void DIN(C387339m3 r3) {
        C358368an r1 = this.A01;
        r1.A0T = new C41062Ank(this, r3);
        r1.A0Y();
        r1.A1j.clearFocus();
    }

    public final void DLf() {
        AnonymousClass4DH r5;
        C358368an r0 = this.A01;
        Context context = r0.A0q;
        UserSession userSession = r0.A1J;
        if (C267044ar.A01(context, userSession)) {
            boolean A06 = 182.A06(0Tu.A05, userSession, 36325270021550896L);
            C48145EZn eZn = C48145EZn.STORY_POST_CAPTURE_FLOW;
            C49947FGb.A06(eZn, userSession, true);
            r5 = this.A00;
            C48958Emw.A00(r5.requireActivity(), eZn, userSession, false, A06);
        } else {
            C48145EZn eZn2 = C48145EZn.STORY_POST_CAPTURE_FLOW;
            C49947FGb.A06(eZn2, userSession, false);
            C49947FGb.A03(eZn2, C48142EZk.SYSTEM_SHARE_SHEET, userSession, false);
            EWV ewv = EWV.A0J;
            r5 = this.A00;
            C46395DeI.A0S(r5, eZn2, r5, userSession, ewv, new Ai1());
        }
        InputMethodManager inputMethodManager = (InputMethodManager) context.getSystemService("input_method");
        View currentFocus = r5.requireActivity().getCurrentFocus();
        if (inputMethodManager != null && inputMethodManager.isActive() && currentFocus != null) {
            inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
        }
    }

    public final void DRH(User user, int i) {
        C358368an r7 = this.A01;
        AnonymousClass4DH r6 = this.A00;
        r7.A0c = true;
        User user2 = user;
        C41162ApM apM = new C41162ApM(r7, user, i);
        if (C358368an.A01(r7) instanceof C363138jC) {
            int size = C358368an.A04(r7, true, false).size();
            UserSession userSession = r7.A1J;
            FragmentActivity requireActivity = r7.A1I.requireActivity();
            int intValue = size + r7.A0S.intValue();
            if (intValue > 20) {
                JZM.A00(userSession).A0E(AnonymousClass000.A00(4733), intValue, 0, false);
                C49926FFc.A00(requireActivity);
                return;
            } else if (ORH.A01(userSession, user)) {
                0wc A012 = AnonymousClass0kN.A01((AnonymousClass0iw) null, userSession);
                C49926FFc.A02(requireActivity, r6, userSession, user, false);
                C17126VIw.A00(A012, userSession, user);
                return;
            }
        } else {
            Context context = r7.A0q;
            UserSession userSession2 = r7.A1J;
            if (!user.A2G()) {
                FGc.A03(context, userSession2, user, (C336187eD) null, "story");
                C49241Erk.A00(AnonymousClass0kN.A01((AnonymousClass0iw) null, userSession2), userSession2, user2, "story", "click", AnonymousClass000.A00(84));
                return;
            }
            Integer num = AnonymousClass05K.A0C;
            if (C45156CrJ.A00(user, num) != null) {
                F8S.A01(context, C45156CrJ.A00(user, num), userSession2, user, apM);
                return;
            }
        }
        apM.run();
    }
}
