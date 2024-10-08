package X;

import android.content.ComponentName;
import android.net.Uri;
import java.util.Arrays;

/* renamed from: X.64V  reason: invalid class name */
public final class AnonymousClass64V {
    public static final Uri A04 = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();
    public final ComponentName A00;
    public final String A01;
    public final String A02;
    public final boolean A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass64V) {
                AnonymousClass64V r5 = (AnonymousClass64V) obj;
                if (!SA1.A01(this.A01, r5.A01) || !SA1.A01(this.A02, r5.A02) || !SA1.A01(this.A00, r5.A00) || this.A03 != r5.A03) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A01, this.A02, this.A00, 4225, Boolean.valueOf(this.A03)});
    }

    public final String toString() {
        String str = this.A01;
        if (str != null) {
            return str;
        }
        ComponentName componentName = this.A00;
        AnonymousClass3Qk.A02(componentName);
        return componentName.flattenToString();
    }

    public AnonymousClass64V(ComponentName componentName) {
        this.A01 = null;
        this.A02 = null;
        AnonymousClass3Qk.A02(componentName);
        this.A00 = componentName;
        this.A03 = false;
    }

    public AnonymousClass64V(String str, boolean z) {
        AnonymousClass3Qk.A04(str);
        this.A01 = str;
        AnonymousClass3Qk.A04("com.google.android.gms");
        this.A02 = "com.google.android.gms";
        this.A00 = null;
        this.A03 = z;
    }
}
