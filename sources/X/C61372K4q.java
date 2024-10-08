package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.creator.agent.suggestedreplies.constants.SuggestedRepliesLoggingConstants$SuggestedRepliesLoggingContext;
import com.instagram.igds.components.textcell.IgdsFooterCell;
import com.instagram.igds.components.textcell.IgdsListCell;

/* renamed from: X.K4q  reason: case insensitive filesystem */
public final class C61372K4q extends AnonymousClass4DH implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "SuggestedRepliesSettingsFragment";
    public L6U A00;
    public final AnonymousClass0eM A01 = C227642jf.A02(this);
    public final AnonymousClass0eM A02;
    public final String A03 = "suggested_replies_settings";

    public final void configureActionBar(2da r3) {
        0qQ.A0B(r3, 0);
        r3.Eom(2131974722);
        r3.EVS(true);
        AnonymousClass3JR A0K = DbS.A0K();
        A0K.A01 = R.drawable.instagram_arrow_left_pano_outline_24;
        r3.ErG(new AnonymousClass3Jb(A0K));
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C62652KkE kkE;
        String str;
        0qQ.A0B(view, 0);
        UserSession A0l = AnonymousClass7TE.A0l(this.A01);
        String string = requireArguments().getString("entrypoint");
        if (string == null) {
            string = "unknown";
        }
        L6U l6u = new L6U(A0l, (SuggestedRepliesLoggingConstants$SuggestedRepliesLoggingContext) requireArguments().getParcelable("logging_context"), string);
        this.A00 = l6u;
        0Aj A0e = AnonymousClass7TE.A0e(l6u.A00, "ig_creator_agents_suggested_replies_settings_view");
        if (A0e.isSampled()) {
            A0e.AAK(new 0bb(), "sr_context");
            SuggestedRepliesLoggingConstants$SuggestedRepliesLoggingContext suggestedRepliesLoggingConstants$SuggestedRepliesLoggingContext = l6u.A01;
            String str2 = null;
            if (suggestedRepliesLoggingConstants$SuggestedRepliesLoggingContext != null) {
                kkE = suggestedRepliesLoggingConstants$SuggestedRepliesLoggingContext.A00;
            } else {
                kkE = null;
            }
            A0e.A8M(kkE, "inbox_type");
            if (suggestedRepliesLoggingConstants$SuggestedRepliesLoggingContext != null) {
                str = suggestedRepliesLoggingConstants$SuggestedRepliesLoggingContext.A02;
            } else {
                str = null;
            }
            A0e.AAJ("sr_session_id", str);
            if (suggestedRepliesLoggingConstants$SuggestedRepliesLoggingContext != null) {
                str2 = suggestedRepliesLoggingConstants$SuggestedRepliesLoggingContext.A03;
            }
            A0e.AAJ("thread_session_id", str2);
            DbV.A1J(A0e, l6u.A02);
        }
        CharSequence text = getText(2131974719);
        0qQ.A07(text);
        ((IgdsFooterCell) view.findViewById(R.id.suggested_replies_settings_footer)).A00(text);
        IgdsListCell igdsListCell = (IgdsListCell) view.findViewById(R.id.suggested_replies_settings_toggle);
        igdsListCell.setTextCellType(C69349Njo.TYPE_SWITCH);
        07U r5 = 07U.A05;
        AnonymousClass07Z viewLifecycleOwner = getViewLifecycleOwner();
        AnonymousClass7TE.A1Z(new MHF(igdsListCell, viewLifecycleOwner, r5, this, (AnonymousClass4D7) null, 13), AnonymousClass07a.A00(viewLifecycleOwner));
        igdsListCell.A0E(new C65370LsB(6, view, this));
    }

    public final String getModuleName() {
        return this.A03;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A01);
    }

    public C61372K4q() {
        C58706IwF iwF = new C58706IwF(this, 48);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new C58706IwF(new C58706IwF(this, 45), 46));
        this.A02 = DbS.A0I(new C58706IwF(A002, 47), iwF, new C73664Phd(2, A002, (Object) null), DbS.A0z(C60225Jhi.class));
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1126650994);
        0qQ.A0B(layoutInflater, 0);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.suggested_replies_settings_layout, false);
        AnonymousClass0fD.A09(1557638646, A022);
        return A0D;
    }
}
