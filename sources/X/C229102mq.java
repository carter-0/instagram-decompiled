package X;

import androidx.fragment.app.FragmentActivity;

/* renamed from: X.2mq  reason: invalid class name and case insensitive filesystem */
public abstract class C229102mq {
    public static final 0hq A00(FragmentActivity fragmentActivity) {
        0hq AuV;
        0qQ.A0B(fragmentActivity, 0);
        if ((fragmentActivity instanceof AnonymousClass2ZY) && (AuV = ((AnonymousClass2ZY) fragmentActivity).AuV()) != null) {
            return AuV;
        }
        0hq supportFragmentManager = fragmentActivity.getSupportFragmentManager();
        0qQ.A07(supportFragmentManager);
        return supportFragmentManager;
    }
}
