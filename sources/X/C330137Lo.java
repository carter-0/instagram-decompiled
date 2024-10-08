package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.7Lo  reason: invalid class name and case insensitive filesystem */
public final class C330137Lo implements 2YM {
    public final UserSession A00;

    public final /* synthetic */ 2YL create(C62230ry r2, AnonymousClass2YQ r3) {
        return 2YT.A00(this, r3, r2);
    }

    public final /* synthetic */ 2YL create(Class cls) {
        throw new UnsupportedOperationException(AnonymousClass000.A00(64));
    }

    public C330137Lo(UserSession userSession) {
        this.A00 = userSession;
    }

    public final 2YL create(Class cls, AnonymousClass2YQ r5) {
        0qQ.A0B(cls, 0);
        try {
            Object newInstance = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            0qQ.A07(newInstance);
            return (2YL) newInstance;
        } catch (NoSuchMethodException unused) {
            try {
                Object newInstance2 = cls.getDeclaredConstructor(new Class[]{UserSession.class}).newInstance(new Object[]{this.A00});
                0qQ.A07(newInstance2);
                return (2YL) newInstance2;
            } catch (NoSuchMethodException unused2) {
                StringBuilder sb = new StringBuilder();
                sb.append("Unable to create view model: ");
                sb.append(cls);
                sb.append(". Only view models with a default constructor or UserSession as the only parameter are supported. For all others, use a custom view model factory.");
                throw new RuntimeException(sb.toString());
            }
        }
    }
}
