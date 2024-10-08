package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.facebook.zero.sdk.staticdeps.json.JsonProvider;
import java.util.ArrayList;

/* renamed from: X.WLx  reason: case insensitive filesystem */
public final class C19116WLx implements X6C {
    public final VQ7 A00;
    public final VQ8 A01;
    public final S1W A02;

    /* JADX WARNING: type inference failed for: r3v0, types: [X.WM2, java.lang.Object] */
    public final WM2 BI7() {
        C20891X2x[] x2xArr = {new C19095WLc(this.A02), new C19096WLd(this.A01)};
        ? obj = new Object();
        ArrayList arrayList = new ArrayList(2);
        obj.A00 = arrayList;
        int i = 0;
        do {
            arrayList.add(x2xArr[i]);
            i++;
        } while (i < 2);
        return obj;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.WL4, X.UVm] */
    /* JADX WARNING: type inference failed for: r1v0, types: [X.WL4, X.UVm] */
    /* JADX WARNING: type inference failed for: r3v1, types: [X.WM2, java.lang.Object] */
    public final WM2 Bp9() {
        C15209UVm[] uVmArr = {new C15205UVi(), new WL4(), new WL4(), new C15207UVk()};
        ? obj = new Object();
        ArrayList arrayList = new ArrayList(4);
        obj.A00 = arrayList;
        int i = 0;
        do {
            arrayList.add(uVmArr[i]);
            i++;
        } while (i < 4);
        return obj;
    }

    public final C18475VsR A00() {
        if (this.A01.A00.getString("zbd_state", (String) null) == null) {
            return new C18475VsR((C17188VLs) null, 0, false, false);
        }
        try {
            JsonProvider.get();
            throw new NullPointerException("parseStrict");
        } catch (Exception e) {
            AnonymousClass7TF.A19(0wj.A01.AEf("ZbdComponentProvider", 817900293), DialogModule.KEY_MESSAGE, "failed to parse initial state", e);
            return new C18475VsR((C17188VLs) null, 0, false, false);
        }
    }

    public C19116WLx(VQ7 vq7, VQ8 vq8, S1W s1w) {
        this.A02 = s1w;
        this.A01 = vq8;
        this.A00 = vq7;
    }
}
