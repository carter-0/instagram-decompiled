package X;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.facebook.common.callercontext.CallerContextable;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;
import java.util.HashMap;

/* renamed from: X.FTy  reason: case insensitive filesystem */
public final class C50218FTy implements C51896G6m, CallerContextable {
    public static final String __redex_internal_original_name = "IGUXFlowLifecycleIGWALinkingProcessor";
    public final Fragment A00;
    public final C61073JwB A01;
    public final UserSession A02;
    public final String A03;

    public C50218FTy(Fragment fragment, C61073JwB jwB, UserSession userSession, String str) {
        0qQ.A0B(userSession, 1);
        this.A02 = userSession;
        this.A00 = fragment;
        this.A03 = str;
        this.A01 = jwB;
    }

    public final void DfQ(int i, int i2, Intent intent) {
    }

    public final void Crf() {
        String A002;
        Fragment fragment = this.A00;
        DbT.A1I(fragment);
        0eE r0 = AnonymousClass0t1.A01;
        UserSession userSession = this.A02;
        if (r0.A01(userSession).A1d()) {
            A002 = "com.instagram.wa_linking.ig_whatsapp_linking_detail.DetailScreen";
        } else {
            A002 = AnonymousClass000.A00(46);
        }
        HashMap A1E = AnonymousClass7TE.A1E();
        A1E.put("entrypoint", this.A03);
        C61073JwB jwB = this.A01;
        String str = jwB.A01;
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        A1E.put("back_stack_tag", str);
        IgBloksScreenConfig A0N = DbS.A0N(userSession);
        DbZ.A19(fragment, A0N, 2131976852);
        Bundle A003 = C49891FBs.A00(A0N, C46649DiU.A04(A002, A1E));
        AnonymousClass6W8 A0Y = DbV.A0Y(fragment.requireActivity(), A003, userSession, ModalActivity.class, "bloks");
        A0Y.A07 = true;
        String str3 = jwB.A01;
        if (str3 != null) {
            str2 = str3;
        }
        A0Y.A06 = str2;
        DbT.A1L(fragment, A0Y);
    }
}
