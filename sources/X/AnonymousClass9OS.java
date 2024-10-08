package X;

import com.instagram.user.model.User;
import java.lang.ref.WeakReference;

/* renamed from: X.9OS  reason: invalid class name */
public final class AnonymousClass9OS implements 1wn {
    public final String A00;
    public final WeakReference A01;

    public AnonymousClass9OS(String str, WeakReference weakReference) {
        0qQ.A0B(str, 1);
        this.A00 = str;
        this.A01 = weakReference;
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        2Wa r1;
        int A03 = AnonymousClass0fD.A03(-2117355347);
        27U r6 = (27U) obj;
        int A0D = AnonymousClass7TG.A0D(r6, 1589496964);
        User user = r6.A00;
        if (0qQ.A0K(user.getId(), this.A00) && (r1 = (2Wa) this.A01.get()) != null) {
            r1.A01(Boolean.valueOf(user.CPV()));
        }
        AnonymousClass0fD.A0A(1660736035, A0D);
        AnonymousClass0fD.A0A(1340062475, A03);
    }
}
