package X;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.modules.permissions.PermissionsModule;
import java.util.ArrayList;

/* renamed from: X.Sp9  reason: case insensitive filesystem */
public final class C12210Sp9 implements Callback {
    public final /* synthetic */ C13904TjR A00;
    public final /* synthetic */ WritableNativeMap A01;
    public final /* synthetic */ PermissionsModule A02;
    public final /* synthetic */ ArrayList A03;

    public final void invoke(Object... objArr) {
        WritableNativeMap writableNativeMap;
        String str;
        0qQ.A0B(objArr, 0);
        int[] iArr = objArr[0];
        0qQ.A0C(iArr, "null cannot be cast to non-null type kotlin.IntArray");
        int[] iArr2 = iArr;
        C13717Tfi tfi = objArr[1];
        0qQ.A0C(tfi, "null cannot be cast to non-null type com.facebook.react.modules.core.PermissionAwareActivity");
        C13717Tfi tfi2 = tfi;
        ArrayList arrayList = this.A03;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Object obj = arrayList.get(i);
            0qQ.A07(obj);
            String str2 = (String) obj;
            if (iArr2.length <= 0 || iArr2[i] != 0) {
                boolean shouldShowRequestPermissionRationale = tfi2.shouldShowRequestPermissionRationale(str2);
                writableNativeMap = this.A01;
                PermissionsModule permissionsModule = this.A02;
                if (shouldShowRequestPermissionRationale) {
                    str = permissionsModule.DENIED;
                } else {
                    str = permissionsModule.NEVER_ASK_AGAIN;
                }
            } else {
                writableNativeMap = this.A01;
                str = this.A02.GRANTED;
            }
            writableNativeMap.putString(str2, str);
        }
        this.A00.resolve(this.A01);
    }

    public C12210Sp9(C13904TjR tjR, WritableNativeMap writableNativeMap, PermissionsModule permissionsModule, ArrayList arrayList) {
        this.A03 = arrayList;
        this.A01 = writableNativeMap;
        this.A02 = permissionsModule;
        this.A00 = tjR;
    }
}
