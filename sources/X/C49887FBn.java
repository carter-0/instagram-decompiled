package X;

import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.FBn  reason: case insensitive filesystem */
public final class C49887FBn {
    public static final AtomicInteger A03 = new AtomicInteger(1);
    public final int A00;
    public final 02m A01;
    public final UserSession A02;

    public final void A00() {
        this.A01.markerEnd(383649364, this.A00, 2);
    }

    public final void A01(Fragment fragment) {
        AnonymousClass07Z r0 = (AnonymousClass07Z) fragment.mViewLifecycleOwnerLiveData.A02();
        if (r0 == null) {
            this.A01.markerAnnotate(383649364, this.A00, "view_lifecycle", "null");
        } else {
            r0.getLifecycle().A09(new C50131FQo(this, 2));
        }
    }

    public final void A03(Integer num) {
        String str;
        02m r4 = this.A01;
        int i = this.A00;
        switch (num.intValue()) {
            case 0:
                str = "ACTIVITY_DESTROY";
                break;
            case 1:
                str = "MANAGER_IS_DISPLAYING";
                break;
            case 2:
                str = "BOTTOMSHEET_NULL";
                break;
            case 3:
                str = "NULL_ACTIVITY";
                break;
            default:
                str = AnonymousClass000.A00(1034);
                break;
        }
        r4.markerAnnotate(383649364, i, AnonymousClass000.A00(1339), str);
        r4.markerEnd(383649364, i, 3);
    }

    public C49887FBn(02m r1, UserSession userSession, int i) {
        this.A02 = userSession;
        this.A00 = i;
        this.A01 = r1;
    }

    public final void A02(AnonymousClass07Z r6, Integer num, String str, String str2) {
        String str3;
        AnonymousClass7TG.A1O(str, str2);
        02m r4 = this.A01;
        int i = this.A00;
        r4.markerStart(383649364, i);
        r4.markerAnnotate(383649364, i, "entrypoint", str);
        r4.markerAnnotate(383649364, i, "variant", str2);
        if (num != null) {
            if (1 - num.intValue() != 0) {
                str3 = "CXP_NOTICE";
            } else {
                str3 = "NATIVE";
            }
            r4.markerAnnotate(383649364, i, "source", str3);
        }
        if (r6 == null) {
            A03(AnonymousClass05K.A0N);
            return;
        }
        AnonymousClass7TE.A1Z(new MG4(this, (AnonymousClass4D7) null, 30), DbW.A0E(r6));
    }
}
