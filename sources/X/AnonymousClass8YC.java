package X;

/* renamed from: X.8YC  reason: invalid class name */
public abstract class AnonymousClass8YC {
    public static final C371088xY A00(AnonymousClass84B r1) {
        0qQ.A0B(r1, 0);
        int ordinal = r1.ordinal();
        if (ordinal == 1) {
            return C371088xY.MINI_GALLERY;
        }
        if (ordinal == 2) {
            return C371088xY.EFFECT_TRAY;
        }
        if (ordinal == 7) {
            return C371088xY.GALLERY_TOOLBAR;
        }
        if (ordinal != 11) {
            return null;
        }
        return C371088xY.CAMERA_TOOL;
    }

    public static final String A01(AnonymousClass84D r2) {
        0qQ.A0B(r2, 0);
        if (r2 instanceof AnonymousClass8YD) {
            AnonymousClass8YD r22 = (AnonymousClass8YD) r2;
            if (!r22.A08) {
                return r22.A02;
            }
            return null;
        } else if (r2 instanceof AnonymousClass84C) {
            return null;
        } else {
            throw new RuntimeException();
        }
    }
}
