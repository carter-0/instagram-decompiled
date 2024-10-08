package X;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

/* renamed from: X.ECa  reason: case insensitive filesystem */
public abstract class C47666ECa extends 1P0 {
    public final 1Xj A00;
    public final DialogInterface.OnDismissListener A01;
    public final Fragment A02;
    public final UserSession A03;
    public final ERQ A04;

    public C47666ECa(DialogInterface.OnDismissListener onDismissListener, Fragment fragment, UserSession userSession, 1Xj r7, String str) {
        this.A02 = fragment;
        this.A03 = userSession;
        this.A00 = r7;
        this.A01 = onDismissListener;
        ERQ erq = new ERQ();
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putBoolean(str, true);
        erq.setArguments(A0a);
        this.A04 = erq;
    }

    public final void onFail(C268654dm r4) {
        int i;
        int A0D = AnonymousClass7TG.A0D(r4, -2103558926);
        if (this.A04.isResumed()) {
            Context context = this.A02.getContext();
            if (context == null) {
                i = 1867139657;
                AnonymousClass0fD.A0A(i, A0D);
            }
            C48769Ejs.A00(context, r4, 2131961740);
        }
        i = -78447529;
        AnonymousClass0fD.A0A(i, A0D);
    }

    public final void onFinish() {
        int i;
        int A032 = AnonymousClass0fD.A03(-1609152670);
        ERQ erq = this.A04;
        if (!erq.isResumed()) {
            i = 2142083248;
        } else {
            erq.A08();
            DialogInterface.OnDismissListener onDismissListener = this.A01;
            if (onDismissListener != null) {
                onDismissListener.onDismiss((DialogInterface) null);
            }
            i = 1081747434;
        }
        AnonymousClass0fD.A0A(i, A032);
    }

    public final void onStart() {
        int A032 = AnonymousClass0fD.A03(-1764036774);
        Fragment fragment = this.A02;
        if (fragment.getParentFragmentManager().A0R("ProgressDialog") == null) {
            ERQ erq = this.A04;
            if (!erq.isAdded()) {
                erq.A0B(fragment.getParentFragmentManager(), "ProgressDialog");
            }
        }
        AnonymousClass0fD.A0A(-56737798, A032);
    }
}
