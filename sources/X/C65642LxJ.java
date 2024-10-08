package X;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.direct.fragment.recipientpicker.controller.DirectPrivateStoryRecipientController;

/* renamed from: X.LxJ  reason: case insensitive filesystem */
public final /* synthetic */ class C65642LxJ implements C66461MSp {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ M1D A01;

    public /* synthetic */ C65642LxJ(FragmentActivity fragmentActivity, M1D m1d) {
        this.A01 = m1d;
        this.A00 = fragmentActivity;
    }

    public final void afterSelection(boolean z) {
        M1D m1d = this.A01;
        FragmentActivity fragmentActivity = this.A00;
        if (z) {
            DirectPrivateStoryRecipientController directPrivateStoryRecipientController = (DirectPrivateStoryRecipientController) m1d.A01;
            DirectPrivateStoryRecipientController.A04(directPrivateStoryRecipientController);
            Integer num = AnonymousClass05K.A0N;
            AnonymousClass4DH r1 = directPrivateStoryRecipientController.A0w;
            int A002 = AnonymousClass3D4.A00(r1.requireContext());
            Context requireContext = r1.requireContext();
            CallerContext callerContext = C62052KYa.A02;
            LRS.A01(requireContext, num, A002);
            return;
        }
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putString(C66579MXk.A00(4), AnonymousClass000.A00(2958));
        JTU.A0e(fragmentActivity, A0a, ((DirectPrivateStoryRecipientController) m1d.A01).A0B);
    }
}
