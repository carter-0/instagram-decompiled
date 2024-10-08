package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.8Jx  reason: invalid class name and case insensitive filesystem */
public final class C353928Jx implements 1wn {
    public final /* synthetic */ C353918Jw A00;

    public C353928Jx(C353918Jw r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        AnonymousClass4DH r0;
        int A03 = AnonymousClass0fD.A03(2037603565);
        int A032 = AnonymousClass0fD.A03(485537034);
        Integer num = ((C61149Jy0) obj).A00;
        Integer num2 = AnonymousClass05K.A00;
        if (num == num2) {
            String A002 = AnonymousClass000.A00(4444);
            C353918Jw r1 = this.A00;
            UserSession userSession = r1.A03;
            C363008it.A05.A01(userSession, (Integer) null, A002, true, true);
            LJr.A01(userSession, (C358118aO) null).A05(true, A002);
            C353918Jw.A00(r1);
            r0 = r1.A01;
        } else {
            num2 = AnonymousClass05K.A01;
            if (num == num2) {
                C353918Jw r02 = this.A00;
                C353918Jw.A00(r02);
                r0 = r02.A01;
            }
            AnonymousClass0fD.A0A(-186920223, A032);
            AnonymousClass0fD.A0A(-1450168889, A03);
        }
        Context requireContext = r0.requireContext();
        int i = 2131952001;
        if (num2.intValue() != 0) {
            i = 2131952002;
        }
        C310336ap r12 = new C310336ap();
        r12.A0D = requireContext.getString(i);
        r12.A01 = 6000;
        1xC.A01.A00(new AnonymousClass3GP(r12.A00()));
        AnonymousClass0fD.A0A(-186920223, A032);
        AnonymousClass0fD.A0A(-1450168889, A03);
    }
}
