package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;

/* renamed from: X.Fnm  reason: case insensitive filesystem */
public final class C51056Fnm implements C51952G8v {
    public final FragmentActivity A00;

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this != obj) {
            Class<?> cls2 = getClass();
            if (obj != null) {
                cls = obj.getClass();
            } else {
                cls = null;
            }
            if (0qQ.A0K(cls2, cls)) {
                0qQ.A0C(obj, "null cannot be cast to non-null type com.instagram.userblock.ui.BlockMutationActivityHost");
                if (!0qQ.A0K(this.A00, ((C51056Fnm) obj).A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final 0hq B7v() {
        return DbT.A0F(this.A00);
    }

    public final boolean Cb4(boolean z) {
        return !this.A00.getSupportFragmentManager().A12();
    }

    public final Context getContext() {
        return this.A00;
    }

    public final AnonymousClass07V getLifecycle() {
        return this.A00.getLifecycle();
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public C51056Fnm(FragmentActivity fragmentActivity) {
        this.A00 = fragmentActivity;
    }
}
