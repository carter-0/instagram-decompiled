package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.google.common.collect.ImmutableList;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.button.IgdsButton;
import com.instagram.igds.components.checkbox.IgdsCheckBox;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.KXb  reason: case insensitive filesystem */
public final class C62039KXb extends K6S {
    public static final String __redex_internal_original_name = "VerifiedUserCallingAudiencePickerFragment";
    public String A00 = AnonymousClass000.A00(2750);
    public final AnonymousClass0eM A01 = C227642jf.A02(this);

    public final boolean onBackPressed() {
        return false;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        Context requireContext = requireContext();
        AnonymousClass7TG.A0R(view, R.id.audience_picker_disclaimer_text).setText(2131976389);
        IgdsButton A0n = JTR.A0n(view, R.id.done_button);
        A0n.setText(2131960992);
        A0n.setEnabled(true);
        A0n.setVisibility(0);
        C64273LXz.A00(A0n, 42, this);
        A09().A00 = new C63870L9z(requireContext, AnonymousClass7TE.A16(requireContext, 2131976391), AnonymousClass7TE.A16(requireContext, 2131976390), R.drawable.participant_cell_outline, false);
        C65614Lwp A0A = A0A();
        0eE r0 = AnonymousClass0t1.A01;
        AnonymousClass0eM r2 = this.A01;
        A0A.A01(0mp.A06(AnonymousClass000.A00(3161), new Object[]{DbX.A0l(r0, r2).getId()}), "verified_user_calling_page");
        A05(this);
        Dba.A1I(DbX.A0P(this, r2), "call_settings_user_selection_page_impression");
    }

    public final void CtJ(C46448DfA dfA) {
        AnonymousClass0eM r5 = this.A01;
        UserSession A0l = AnonymousClass7TE.A0l(r5);
        LRl lRl = this.A03;
        ImmutableList A0K = DbU.A0K(lRl.A03);
        ArrayList A0r = AnonymousClass7TG.A0r(A0K);
        Iterator it = A0K.iterator();
        while (it.hasNext()) {
            C61036Jva.A02(A0r, it);
        }
        C64028LJp.A01(A0l, A0r);
        lRl.A04();
        LRl.A00(this, lRl);
        LRl.A01(this, lRl);
        Dba.A1I(DbX.A0P(this, r5), "call_settings_user_selection_page_bulk_remove");
    }

    public final String getModuleName() {
        return this.A00;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A01);
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.07Z, X.KXb, androidx.fragment.app.Fragment, java.lang.Object, X.K6S] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A05(X.C62039KXb r4) {
        /*
            X.K9H r3 = r4.A09()
            android.content.Context r2 = r4.requireContext()
            X.6rr r1 = X.C320156rr.LOADING
            r0 = 0
            r3.A04(r2, r0, r1)
            android.content.Context r3 = r4.requireContext()
            X.0gy r2 = X.AnonymousClass07i.A00(r4)
            X.0eM r0 = r4.A01
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.1OC r1 = X.C64028LJp.A00(r0)
            r0 = 33
            X.C61500KAf.A00(r1, r4, r0)
            X.1ES.A00(r3, r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62039KXb.A05(X.KXb):void");
    }

    public final void A0C(IgdsCheckBox igdsCheckBox, C61036Jva jva) {
        0wc r1;
        String str;
        AnonymousClass7TG.A1N(jva, igdsCheckBox);
        super.A0C(igdsCheckBox, jva);
        LRl.A01(this, this.A03);
        boolean isChecked = igdsCheckBox.isChecked();
        AnonymousClass0eM r3 = this.A01;
        UserSession A0l = AnonymousClass7TE.A0l(r3);
        List A1I = AnonymousClass7TE.A1I(jva.A02);
        if (isChecked) {
            0qQ.A0B(A0l, 0);
            ArrayList A0r = AnonymousClass7TG.A0r(A1I);
            Iterator it = A1I.iterator();
            while (it.hasNext()) {
                DbY.A1W(A0r, it);
            }
            C61080JwI jwI = new C61080JwI((List) A0r, 17);
            1NY A0a = AnonymousClass7TG.A0a(A0l);
            A0a.A0A("video_call/add_user_to_allowlist/");
            DbX.A1M(A0a, "users_to_add", jwI.toString());
            1ES.A03(A0a.A0M());
            r1 = DbX.A0P(this, r3);
            str = "call_settings_user_selection_page_add_people";
        } else {
            C64028LJp.A01(A0l, A1I);
            r1 = DbX.A0P(this, r3);
            str = "call_settings_user_selection_page_remove_people";
        }
        Dba.A1I(r1, str);
    }

    public final void configureActionBar(2da r4) {
        DbX.A1A(new C64273LXz(this, 41), K6S.A01(r4, JTT.A0B(this, r4).getString(2131976392)), r4);
    }

    public final void onCreate(Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(-2002982627);
        C62039KXb.super.onCreate(bundle);
        String A0o = DbX.A0o(this);
        if (A0o != null) {
            this.A00 = A0o;
        }
        AnonymousClass0fD.A09(-807319415, A02);
    }
}
