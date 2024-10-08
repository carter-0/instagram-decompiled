package X;

import android.content.Context;
import com.meta.foa.session.FoaUserSession;
import java.util.Set;

/* renamed from: X.Hrm  reason: case insensitive filesystem */
public final class C56039Hrm {
    public C17721Vcq A00;
    public final Context A01;
    public final Vk7 A02;
    public final FoaUserSession A03;
    public final AnonymousClass07g A04;
    public final Set A05 = AnonymousClass7TE.A1F();

    public C56039Hrm(Context context, AnonymousClass07g r3, Vk7 vk7, FoaUserSession foaUserSession) {
        0qQ.A0B(r3, 4);
        this.A01 = context;
        this.A02 = vk7;
        this.A03 = foaUserSession;
        this.A04 = r3;
    }

    public final C49726F3q A00() {
        C17721Vcq vcq = this.A00;
        if (vcq != null) {
            return vcq.A03;
        }
        throw new RuntimeException("Can't access the container owner outside the Screen's content callback");
    }

    public final AnonymousClass0eM A01(Object obj, C62320sa r5, 0sP r6) {
        C17721Vcq vcq = this.A00;
        if (vcq != null) {
            Set set = this.A05;
            if (!set.contains(obj)) {
                set.add(obj);
                return AnonymousClass0eN.A00(0eO.A02, C58699Iw8.A00(r6, obj, vcq, r5, 36));
            }
            StringBuilder A1A = AnonymousClass7TE.A1A();
            A1A.append("Can't use contextScoped on the same key more than once per content creation (key=");
            A1A.append(obj);
            throw new RuntimeException(AnonymousClass7TF.A0l("). If you need to use contextScoped to get multiple instances of the same class, use an explicit key to differentiate each call.", A1A));
        }
        throw new RuntimeException("Can't use contextScoped outside the Screen's content callback");
    }
}
