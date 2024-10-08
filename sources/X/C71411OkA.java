package X;

import android.text.Editable;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgEditText;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.direct.ui.polls.PollMessageOptionView;
import com.instagram.direct.visual.DirectVisualMessageViewerController;
import com.instagram.igds.components.search.IgdsInlineSearchBox;

/* renamed from: X.OkA  reason: case insensitive filesystem */
public final class C71411OkA implements View.OnFocusChangeListener {
    public final int A00;
    public final Object A01;

    public C71411OkA(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void onFocusChange(View view, boolean z) {
        String str;
        Editable text;
        switch (this.A00) {
            case 0:
                NJq nJq = (NJq) this.A01;
                C74586PxZ pxZ = nJq.A0C;
                if (pxZ != null && ((PRE) pxZ).A02.equals("stickers") && z && nJq.A0J) {
                    UserSession userSession = nJq.A05;
                    0Tu A0J = DbS.A0J(userSession, 0);
                    if (!182.A06(A0J, userSession, 36317732355577321L)) {
                        UserSession userSession2 = nJq.A05;
                        0qQ.A0B(userSession2, 0);
                        if (182.A06(A0J, userSession2, 36317732354135524L)) {
                            IgdsInlineSearchBox igdsInlineSearchBox = nJq.A0A;
                            igdsInlineSearchBox.getClass();
                            igdsInlineSearchBox.setHints(nJq.A09.A00(true));
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 1:
                if (z) {
                    DbS.A1U(this.A01);
                    return;
                }
                return;
            case 2:
                0qQ.A0C(view, "null cannot be cast to non-null type com.instagram.common.ui.base.IgEditText");
                TextView textView = (TextView) view;
                boolean z2 = true;
                PollMessageOptionView pollMessageOptionView = (PollMessageOptionView) this.A01;
                if (!z) {
                    C74457PvC pvC = pollMessageOptionView.A01;
                    if (pvC != null) {
                        if (textView.length() != 0) {
                            z2 = false;
                        }
                        pvC.DGE(pollMessageOptionView, z2);
                    }
                    PollMessageOptionView.A00(pollMessageOptionView, false);
                    return;
                }
                IgEditText igEditText = pollMessageOptionView.A00;
                if (igEditText == null) {
                    str = "editText";
                    break;
                } else {
                    if (igEditText.length() == 0) {
                        z2 = false;
                    }
                    PollMessageOptionView.A00(pollMessageOptionView, z2);
                    0nA.A0Q(textView);
                    return;
                }
            case 3:
                DirectVisualMessageViewerController directVisualMessageViewerController = (DirectVisualMessageViewerController) this.A01;
                boolean A0U = DirectVisualMessageViewerController.A0U(directVisualMessageViewerController);
                if (z) {
                    if (A0U) {
                        DirectVisualMessageViewerController.A0B(directVisualMessageViewerController);
                    } else {
                        C315596kB.A09(new View[]{directVisualMessageViewerController.backgroundDimmer}, true);
                    }
                    directVisualMessageViewerController.A0W("tapped");
                    return;
                }
                if (A0U) {
                    DirectVisualMessageViewerController.A0C(directVisualMessageViewerController);
                } else {
                    C315596kB.A08(new View[]{directVisualMessageViewerController.backgroundDimmer}, true);
                }
                directVisualMessageViewerController.A0X("resume");
                return;
            default:
                if (z) {
                    C68483NKa nKa = (C68483NKa) this.A01;
                    boolean z3 = false;
                    IgTextView igTextView = nKa.A03;
                    if (igTextView != null) {
                        igTextView.getHeight();
                    }
                    AnonymousClass7TG.A02(nKa.requireContext());
                    IgLinearLayout igLinearLayout = nKa.A02;
                    if (igLinearLayout != null) {
                        igLinearLayout.setPadding(0, 0, 0, 0);
                    }
                    ONF onf = nKa.A06;
                    if (onf == null) {
                        str = "recsFromFriendsLogger";
                        break;
                    } else {
                        String str2 = nKa.A0C;
                        if (str2 == null) {
                            str = "targetUserId";
                            break;
                        } else {
                            Long A10 = AnonymousClass7TE.A10(str2);
                            String A002 = C68483NKa.A00(nKa.A0K);
                            IgEditText igEditText2 = nKa.A01;
                            if (igEditText2 == null || (text = igEditText2.getText()) == null || text.length() == 0) {
                                z3 = true;
                            }
                            onf.A02(A10, "search", A002, !z3);
                            if (!nKa.A0H) {
                                C252553pI r1 = nKa.getRecyclerView().A0D;
                                0qQ.A0C(r1, C273654mx.A00(7));
                                nKa.A0B = Integer.valueOf(((LinearLayoutManager) r1).A1d());
                                return;
                            }
                            return;
                        }
                    }
                } else {
                    return;
                }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }
}
