package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import java.util.Arrays;

/* renamed from: X.34k  reason: invalid class name and case insensitive filesystem */
public final class C2366134k implements C2366234l {
    public final /* synthetic */ C2365834h A00;

    public C2366134k(C2365834h r1) {
        this.A00 = r1;
    }

    public final void D1l(View view) {
        if (view.getTag() instanceof C241103Nw) {
            C241103Nw r8 = (C241103Nw) view.getTag();
            C2365834h r1 = this.A00;
            UserSession userSession = r1.A0A;
            AnonymousClass3BT r0 = r8.A02;
            r0.getClass();
            if (!AnonymousClass3NF.A01(userSession, r0)) {
                C2366434n r6 = r1.A0B;
                AnonymousClass3N6 r7 = r8.A0G;
                String str = r7.A01;
                str.getClass();
                AnonymousClass3BT r02 = r8.A02;
                r02.getClass();
                AnonymousClass3BQ r12 = r02.A04;
                AnonymousClass3BT r03 = r8.A02;
                r03.getClass();
                boolean A002 = AnonymousClass3NF.A00(userSession, r03);
                int hashCode = Arrays.hashCode(new Object[]{str});
                02m r3 = r6.A00;
                r3.markerStart(17323904, hashCode);
                r3.markerAnnotate(17323904, hashCode, "reel_viewer_source", r12.A00);
                r3.markerAnnotate(17323904, hashCode, "is_top_tray", A002);
                if (!r8.A02.A06(userSession)) {
                    String str2 = r7.A01;
                    str2.getClass();
                    r6.A07(str2);
                }
                if (r8.A0C.A0G()) {
                    String str3 = r7.A01;
                    str3.getClass();
                    r6.A06(str3);
                }
            }
        }
    }

    public final void D1m(View view) {
        if (view.getTag() instanceof C241103Nw) {
            C241103Nw r3 = (C241103Nw) view.getTag();
            C2365834h r2 = this.A00;
            UserSession userSession = r2.A0A;
            AnonymousClass3BT r0 = r3.A02;
            r0.getClass();
            if (!AnonymousClass3NF.A01(userSession, r0)) {
                C2366434n r1 = r2.A0B;
                String str = r3.A0G.A01;
                str.getClass();
                r1.A00.markerEnd(17323904, Arrays.hashCode(new Object[]{str}), 4);
            }
        }
    }
}
