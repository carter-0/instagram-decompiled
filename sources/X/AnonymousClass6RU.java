package X;

import com.facebook.fbreactmodules.datepicker.DatePickerDialogModule;
import java.util.Map;

/* renamed from: X.6RU  reason: invalid class name */
public final class AnonymousClass6RU implements AnonymousClass6RV {
    public final AnonymousClass6RT A00;

    public final /* bridge */ /* synthetic */ C13752TgO BH5(C307896Rx r10, C276504tR r11, Object obj) {
        Object obj2;
        Map map = (Map) obj;
        C276494tQ r112 = (C276494tQ) r11;
        Map map2 = r112.A02;
        String str = (String) map2.get("key");
        if (str != null) {
            Object obj3 = map2.get(DatePickerDialogModule.ARG_MODE);
            if (map != null) {
                obj2 = map.get(str);
            } else {
                AnonymousClass6RT r1 = this.A00;
                synchronized (r1) {
                    obj2 = r1.A00.get(str);
                }
            }
            boolean equals = "p".equals(obj3);
            if (equals || obj2 == null) {
                obj2 = Q08.A00(r10, map2);
            }
            return new C7282Q2h(this.A00, obj2, str, r112.A00, (Map) map2.get("debug_metadata"), equals);
        }
        throw new IllegalStateException("Key not defined in data manifest");
    }

    public final C307856Rt Bx9(C307786Rm r5, C307446Qd r6) {
        C307856Rt r0;
        AnonymousClass6RT r3 = this.A00;
        synchronized (r3) {
            C307836Rr A002 = AnonymousClass6RT.A00(r6, r3);
            r0 = new C307856Rt(A002.A00, r3.A00);
        }
        return r0;
    }

    public AnonymousClass6RU(AnonymousClass6RT r1) {
        this.A00 = r1;
    }
}
