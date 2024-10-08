package X;

import android.text.TextUtils;

/* renamed from: X.FfB  reason: case insensitive filesystem */
public abstract class C50596FfB implements G8G {
    public final boolean equals(Object obj) {
        if (!(obj instanceof C50596FfB) || !TextUtils.equals(getUsername(), ((C50596FfB) obj).getUsername())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return getUsername().hashCode();
    }

    public final String toString() {
        return getUsername();
    }
}
