package X;

import android.net.Uri;
import android.os.Bundle;

/* renamed from: X.SOz  reason: case insensitive filesystem */
public final class C11362SOz {
    public final int A00;
    public final int A01;
    public final Uri A02;
    public final String A03;
    public final String A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C11362SOz sOz = (C11362SOz) obj;
            if (this.A00 != sOz.A00 || !this.A04.equals(sOz.A04) || !this.A03.equals(sOz.A03) || this.A01 != sOz.A01 || !this.A02.equals(sOz.A02)) {
                return false;
            }
        }
        return true;
    }

    public static C11362SOz A00(Bundle bundle) {
        Class<Integer> cls = Integer.class;
        int A0M = AnonymousClass7TE.A0M(A01(bundle, cls, "protocol_version"));
        Class<String> cls2 = String.class;
        int A0M2 = AnonymousClass7TE.A0M(A01(bundle, cls, "version_code"));
        return new C11362SOz((Uri) A01(bundle, Uri.class, "file_uri"), (String) A01(bundle, cls2, "package_name"), (String) A01(bundle, cls2, "module_name"), A0M, A0M2);
    }

    public final int hashCode() {
        return Pxf.A0C(Integer.valueOf(this.A00), this.A04, this.A03, Integer.valueOf(this.A01), this.A02);
    }

    public C11362SOz(Uri uri, String str, String str2, int i, int i2) {
        this.A00 = i;
        this.A04 = str;
        this.A03 = str2;
        this.A01 = i2;
        this.A02 = uri;
    }

    public static Object A01(Bundle bundle, Class cls, String str) {
        if (bundle.containsKey(str)) {
            Object cast = cls.cast(bundle.get(str));
            if (cast != null) {
                return cast;
            }
            throw Pxg.A0f("value for required key %s is null", new Object[]{str});
        }
        throw Pxg.A0f("key %s is missing but required", new Object[]{str});
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("ModuleFileInfo={protocol=");
        A1A.append(this.A00);
        A1A.append(", packageName=");
        A1A.append(this.A04);
        A1A.append(", moduleName=");
        A1A.append(this.A03);
        A1A.append(", versionCode=");
        A1A.append(this.A01);
        A1A.append(", fileUri=");
        return C66584MXp.A0a(this.A02.toString(), A1A);
    }
}
