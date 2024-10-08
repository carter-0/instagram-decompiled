package X;

import com.facebook.react.bridge.Callback;
import com.facebook.react.modules.permissions.PermissionsModule;

/* renamed from: X.Sp8  reason: case insensitive filesystem */
public final class C12209Sp8 implements Callback {
    public final /* synthetic */ C13904TjR A00;
    public final /* synthetic */ PermissionsModule A01;
    public final /* synthetic */ String A02;

    public final void invoke(Object... objArr) {
        C13904TjR tjR;
        String str;
        0qQ.A0B(objArr, 0);
        int[] iArr = objArr[0];
        0qQ.A0C(iArr, "null cannot be cast to non-null type kotlin.IntArray");
        int[] iArr2 = iArr;
        if (iArr2.length <= 0 || iArr2[0] != 0) {
            C13717Tfi tfi = objArr[1];
            0qQ.A0C(tfi, "null cannot be cast to non-null type com.facebook.react.modules.core.PermissionAwareActivity");
            boolean shouldShowRequestPermissionRationale = tfi.shouldShowRequestPermissionRationale(this.A02);
            tjR = this.A00;
            PermissionsModule permissionsModule = this.A01;
            if (shouldShowRequestPermissionRationale) {
                str = permissionsModule.DENIED;
            } else {
                str = permissionsModule.NEVER_ASK_AGAIN;
            }
        } else {
            tjR = this.A00;
            str = this.A01.GRANTED;
        }
        tjR.resolve(str);
    }

    public C12209Sp8(C13904TjR tjR, PermissionsModule permissionsModule, String str) {
        this.A00 = tjR;
        this.A01 = permissionsModule;
        this.A02 = str;
    }
}
