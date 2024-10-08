package X;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.instagram.android.R;

public final class NIF extends C240383Kr implements AnonymousClass4DR {
    public Q2C A00;
    public String A01;
    public String A02;
    public C62320sa A03 = C73767PjS.A00;
    public C62320sa A04;
    public C62320sa A05 = C73766PjR.A00;
    public final AnonymousClass0eM A06 = C227642jf.A02(this);

    public final boolean onBackPressed() {
        return true;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1157847563);
        NIF.super.onCreate(bundle);
        Context requireContext = requireContext();
        Q2C q2c = Q2C.A03;
        if (q2c == null) {
            q2c = new Q2C(requireContext);
            Q2C.A03 = q2c;
        }
        this.A00 = q2c;
        AnonymousClass0fD.A09(-982458500, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        String str2;
        String str3;
        int A022 = AnonymousClass0fD.A02(890291321);
        0qQ.A0B(layoutInflater, 0);
        NIF.super.onCreateView(layoutInflater, viewGroup, bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 == null || (str = bundle2.getString("key_thread_id")) == null) {
            str = "";
        }
        this.A02 = str;
        Bundle bundle3 = this.mArguments;
        if (bundle3 == null || (str2 = bundle3.getString("key_entry_point")) == null) {
            str2 = "unknown";
        }
        this.A01 = str2;
        View inflate = layoutInflater.inflate(R.layout.direct_locked_chat_privacy_screen, viewGroup);
        DbS.A0G(inflate, R.id.locked_chat_app_icon).setImageResource(R.drawable.f7instagram);
        C3021461u r3 = (C3021461u) AnonymousClass7TE.A0b(inflate, R.id.unlock_bottom_button);
        r3.setPrimaryAction(getString(2131963806), new C71397Ojw(this, 35));
        r3.setSecondaryAction(getString(2131954722), new C71397Ojw(this, 36));
        0lg A0X = DbT.A0X(this.A06);
        String str4 = this.A01;
        if (str4 == null) {
            str3 = "entryPoint";
        } else {
            String str5 = this.A02;
            if (str5 == null) {
                str3 = "threadId";
            } else {
                0qQ.A0B(A0X, 0);
                0Aj A0B = C66584MXp.A0B(A0X);
                if (A0B.isSampled()) {
                    C66584MXp.A0x(A0B, AnonymousClass000.A00(5251), str4, str5);
                }
                AnonymousClass0fD.A09(1619531749, A022);
                return inflate;
            }
        }
        0qQ.A0F(str3);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onStart() {
        int A022 = AnonymousClass0fD.A02(1957098766);
        NIF.super.onStart();
        Dialog dialog = this.A01;
        if (dialog != null) {
            Window window = dialog.getWindow();
            if (window != null) {
                window.setLayout(-1, -1);
            }
            A0D(false);
            dialog.setCanceledOnTouchOutside(false);
        }
        Q2C q2c = this.A00;
        if (q2c != null) {
            if (q2c.A01()) {
                Q2C q2c2 = this.A00;
                if (q2c2 != null) {
                    q2c2.A00(this, new P4H(this, 1), false);
                }
            }
            AnonymousClass0fD.A09(2080995809, A022);
            return;
        }
        0qQ.A0F("lockedChatAuthenticator");
        throw AnonymousClass00P.createAndThrow();
    }
}
