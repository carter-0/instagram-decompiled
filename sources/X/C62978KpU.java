package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.KpU  reason: case insensitive filesystem */
public abstract class C62978KpU {
    /* JADX WARNING: type inference failed for: r10v0, types: [X.0r1, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r11v0, types: [X.0r1, java.lang.Object] */
    public static final 0eP A00(UserSession userSession) {
        0eP A1L;
        0Tu r2 = 0Tu.A06;
        boolean z = false;
        if (182.A06(r2, userSession, 36330432572179069L)) {
            String string = 1Au.A00(userSession).A01.getString("clips_audio_enhance_model_path", "");
            0qQ.A07(string);
            boolean A06 = 1RH.A00().A06(1US.A0H);
            if (!string.equals("") && A06) {
                z = true;
            }
            A1L = AnonymousClass7TE.A1L(Boolean.valueOf(z), string);
        } else {
            A1L = AnonymousClass7TE.A1L(false, "");
        }
        Boolean bool = (Boolean) A1L.A00;
        boolean booleanValue = bool.booleanValue();
        String str = (String) A1L.A01;
        0qQ.A0B(str, 1);
        int A00 = (int) 182.A00(r2, userSession, 37160465067212914L);
        ? obj = new Object();
        obj.A00 = 182.A06(r2, userSession, 36330432572179069L);
        ? obj2 = new Object();
        obj2.A00 = 182.A06(r2, userSession, 2342159049350975358L);
        boolean A062 = 182.A06(r2, userSession, 36316040137150332L);
        boolean A063 = 182.A06(r2, userSession, 2342159049350909821L);
        if (obj.A00 && !booleanValue) {
            obj.A00 = false;
            obj2.A00 = true;
        }
        return AnonymousClass7TE.A1L(bool, new C60816Jrl(str, obj, obj2, A00, A062, A063));
    }
}
